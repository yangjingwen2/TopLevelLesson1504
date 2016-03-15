package com.example.yangjw.butterknifedemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import butterknife.Bind;
import butterknife.BindString;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * ButterKnife使用
 * 1、配置compile 'com.jakewharton:butterknife:7.0.1'
 * 2、初始化ButterKnife.bind(this); 需要放在setContentView下方
 * 3、控件赋值@Bind(R.id.main_submit_btn)。参数为控件对应的ID
 */
public class MainActivity extends AppCompatActivity {

    //依赖注入的对象不能是私有
    @Bind(R.id.main_submit_btn)
    Button mSubmitBtn;

    //获取资源对象
    @BindString(R.string.main_submit_btn)
    String mSubmitText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //初始化操作，
        ButterKnife.bind(this);
        mSubmitBtn.setText(mSubmitText+"$18.22");
    }


    @OnClick({R.id.main_submit_btn ,R.id.main_cancel_btn})
    public void click(Button btn) {
        switch (btn.getId()) {
            case R.id.main_submit_btn:
                Toast.makeText(this,"Submit",Toast.LENGTH_LONG).show();
                break;
            case R.id.main_cancel_btn:
                Toast.makeText(this,"Cancel",Toast.LENGTH_LONG).show();
                break;
        }

    }
}
