package com.example.yangjw.liwushuodemo.http;

import android.os.Handler;

import com.example.yangjw.liwushuodemo.bean.ItemInfo;
import com.example.yangjw.liwushuodemo.bean.ProductInfo;
import com.example.yangjw.liwushuodemo.tool.GsonTool;
import com.example.yangjw.liwushuodemo.tool.LogTool;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;
import java.lang.reflect.Type;
import java.util.List;

import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.OkHttpClient;
import okhttp3.Request;
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


    static {
        if (okHttpClient == null) {
            okHttpClient = new OkHttpClient();
        }
    }


    private static Handler mHandler = new Handler();


    public static void okGet(String url,final IOkCallBack callBack) {
        //创建一个请求
        Request request = new Request.Builder().url(url).build();
        //执行请求
        okHttpClient.newCall(request).enqueue(new Callback() {
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

                final ProductInfo productInfo1 = GsonTool.parseJson2Object(result, ProductInfo.class);


                mHandler.post(new Runnable() {
                    @Override
                    public void run() {
                        callBack.onSucess(productInfo1);
                    }
                });


            }
        });


    }

}
