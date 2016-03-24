package com.example.yangjw.xutildbutilsdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.yangjw.xutildbutilsdemo.bean.User;

import org.xutils.view.annotation.Event;
import org.xutils.view.annotation.ViewInject;
import org.xutils.x;

public class MainActivity extends AppCompatActivity {

    @ViewInject(R.id.db_show_txt)
    private TextView mShowTxt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        x.view().inject(this);
    }

    @Event(R.id.db_insert)
    private void add(View view) {

        DbTools.add("张三",23,"黄色");
    }

    @Event(R.id.db_select_one)
    private void selector(View view) {
        User user = DbTools.seletor();
        mShowTxt.setText(user.getName()+"/" + user.getAge() +"/"+ user.getColor());
    }
}
