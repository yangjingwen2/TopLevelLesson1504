package com.example.yangjw.materialdesigndemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;

public class InflaterActivity extends AppCompatActivity {

    private FrameLayout mLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inflater);

        mLayout = (FrameLayout) findViewById(R.id.infalter_frame_layout);

        /**
         * 参数二：就是给View指定一个父布局
         * 参数三：是否将View添加到父布局中。false表示不添加，true反之。
         */
        LayoutInflater.from(this).inflate(R.layout.item_layout,mLayout,true);
    }
}
