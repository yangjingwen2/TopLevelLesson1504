package com.example.yangjw.liwushuodemo.http;

import android.app.Activity;
import android.os.Handler;

import com.example.yangjw.liwushuodemo.bean.ProductInfo;
import com.example.yangjw.liwushuodemo.tool.GsonTool;
import com.example.yangjw.liwushuodemo.tool.LogTool;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

/**
 *OkHttp的工具类
 * 1、导包
 * 2、初始化OkHttpClient
 *         注意：官方建议OkHttpClient在应用中使用单例。一个应用只包含一个OkHttpClient对象
 * 3、GET、POST
 * Created by yangjw on 2016/3/16.
 */
public class OkHttpTool {

    private static OkHttpClient okHttpClient ;


    private List<Call> callList = new ArrayList<>();
    private static Map<Activity,OkHttpTool> map = new HashMap<>();

    static {
        if (okHttpClient == null) {
            LogTool.LOG_D(OkHttpTool.class,"------1-----");
            okHttpClient = new OkHttpClient();
        }
    }


    private Handler mHandler = new Handler();

    public static OkHttpTool newInstance(Activity activity) {
        OkHttpTool okHttpTool = map.get(activity);
        if (okHttpTool == null) {
            okHttpTool = new OkHttpTool();
            map.put(activity,okHttpTool);
        }
        return okHttpTool;
    }


    /**
     * OkHttp的GET请求
     * @param url
     * @param clazz
     * @param callBack
     * @param <T>
     */
    public <T> void okGet(String url,final Class<T> clazz,final IOkCallBack callBack,int requestCode) {
        //创建一个请求
        //.header("Content-Type","text/html;charset:utf-8") Http协议的请求头信息
        Request request = new Request.Builder().url(url).tag(requestCode).build();
        //执行请求
        Call call = okHttpClient.newCall(request);
        callList.add(call);
        call.enqueue(new Callback() {
                    //请求失败
                    @Override
                    public void onFailure(Call call, IOException e) {
                        //执行在工作线程中，不能直接对UI进行更新
                    }

                    //请求成功
                    @Override
                    public void onResponse(Call call, Response response) throws IOException {
                        //执行在工作线程中，不能直接对UI进行更新
                        String result = response.body().string();
//                Object  tag = response.request().tag();
//                LogTool.LOG_D(OkHttpTool.class,"-->" + tag);
                        final T productInfo1 = GsonTool.parseJson2Object(result, clazz);

                        mHandler.post(new Runnable() {
                            @Override
                            public void run() {
                                callBack.onSucess(productInfo1);
                            }
                        });


                    }
                });
    }


    /**
     * OkHttp 的Post请求
     * @param url 请求的URL
     * @param param 传入的参数
     * @param clazz 返回的Object对象的class类型
     * @param callBack 回调接口
     * @param <T>
     */
    public <T> void okPost(String url, Map<String,String> param,final Class<T> clazz,final IOkCallBack callBack) {

        //application/json是Http协议中的ContentType，charset=utf-8是Http协议中的编码格式
        //制定参数的编码方式和参数的格式
        MediaType mediaType = MediaType.parse("application/json; charset=utf-8");
        //设置POST的请求入参
        String formatParam = formatParam(param);
        RequestBody requestBody = RequestBody.create(mediaType, formatParam);
        //创建请求
        Request request = new Request.Builder().url(url).post(requestBody).build();
        okHttpClient.newCall(request).enqueue(new Callback() {
            @Override
            public void onFailure(Call call, IOException e) {

            }

            @Override
            public void onResponse(Call call, Response response) throws IOException {

                final T object = GsonTool.parseJson2Object(response.body().string(), clazz);
                mHandler.post(new Runnable() {
                    @Override
                    public void run() {
                        callBack.onSucess(object);
                    }
                });
            }
        });

    }

    private static String formatParam(Map<String,String> param) {
                JSONObject jsonObject = new JSONObject();
            try {
                Set<String> keySet = param.keySet();
                for (String key:keySet) {
                        jsonObject.put(key,param.get(key));
                }
            } catch (JSONException e) {
                e.printStackTrace();
            }

        return jsonObject.toString();
    }


    /**
     * 取消链接
     */
    public void cancel(Activity activity) {
        //TODO
        if (callList != null && !callList.isEmpty()) {
            for (int i=callList.size()-1; i>=0; i--) {
                callList.get(i).cancel();
                callList.remove(i);
            }
        }

        if (map != null && map.get(activity) != null) {
             map.remove(activity);
        }
    }

}
