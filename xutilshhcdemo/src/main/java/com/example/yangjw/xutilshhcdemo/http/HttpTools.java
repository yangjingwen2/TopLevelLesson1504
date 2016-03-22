package com.example.yangjw.xutilshhcdemo.http;

import org.xutils.common.Callback;
import org.xutils.http.RequestParams;
import org.xutils.x;

/**
 * Created by yangjw on 2016/3/22.
 */
public class HttpTools {

    public static void get(String url,String sign, final IXCallBack callBack,final int requestCode) {
        RequestParams requestParams = new RequestParams(url);
        requestParams.addHeader("Authorization",sign);
        x.http().get(requestParams, new Callback.CommonCallback<String>() {
            @Override
            public void onSuccess(String result) {
                callBack.onSucess(result,requestCode);
            }

            @Override
            public void onError(Throwable ex, boolean isOnCallback) {

            }

            @Override
            public void onCancelled(CancelledException cex) {

            }

            @Override
            public void onFinished() {

            }
        });
    }
}
