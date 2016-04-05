package com.example.yangjw.webview2demo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.webkit.WebSettings;

import com.github.lzyzsd.jsbridge.BridgeHandler;
import com.github.lzyzsd.jsbridge.BridgeWebView;
import com.github.lzyzsd.jsbridge.CallBackFunction;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "WebPP";
    private BridgeWebView mWebView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mWebView = (BridgeWebView) findViewById(R.id.webview);
        WebSettings mWebViewSettings = mWebView.getSettings();
        mWebViewSettings.setJavaScriptEnabled(true);
        mWebView.loadUrl("http://10.6.156.64:8080/test/index.html");

        //submit方法名称必须和JS中的方法名称相同
        mWebView.registerHandler("submit", new BridgeHandler() {
            //参数一：是JS传递过来的数据
            //参数二：用于给JS返回结果的对象
            @Override
            public void handler(String data, CallBackFunction function) {
                Log.i(TAG, "handler = submitFromWeb, data from web = " + data);
                //返回数据结果
                function.onCallBack("lisi");
            }
        });

    }
}
