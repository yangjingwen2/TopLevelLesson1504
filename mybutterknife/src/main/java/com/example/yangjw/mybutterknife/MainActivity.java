package com.example.yangjw.mybutterknife;

import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.example.yangjw.mybutterknife.annotation.Event;
import com.example.yangjw.mybutterknife.annotation.ViewInject;
import com.example.yangjw.mybutterknife.annotation.X;

/**
 * 自定义的依赖注入的框架
 * 功能：
 * 包含注入View。和设置onClick监听方法
 */
public class MainActivity extends AppCompatActivity {

    @ViewInject(R.id.main_show_tv)
    public TextView mShowText;
    @ViewInject(R.id.main_click_btn)
    public Button mClickBtn;
    @ViewInject(R.id.root_layout)
    public RelativeLayout mLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        X.view.bind(this);

        mShowText.setText("这是通过注解进行依赖注入");

        mClickBtn.setText("这是按钮");
    }


    @Event(R.id.main_click_btn)
    public void click() {
        Snackbar.make(mLayout,"显示的内容",Snackbar.LENGTH_LONG).show();
    }

    @Event(R.id.main_click_btn2)
    public void submit() {
        Snackbar.make(mLayout,"显示的内容2222",Snackbar.LENGTH_LONG).show();
    }
}
