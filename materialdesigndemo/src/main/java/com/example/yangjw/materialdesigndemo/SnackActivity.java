package com.example.yangjw.materialdesigndemo;

import android.support.design.widget.CoordinatorLayout;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class SnackActivity extends AppCompatActivity {

    private View mBtn;
    private View mSnackRootView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_snack);

        mSnackRootView = findViewById(R.id.snack_root_view);

        mBtn = findViewById(R.id.snack_btn);
        mBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Snackbar.make(mSnackRootView,"这是Snack控件",Snackbar.LENGTH_INDEFINITE).show();
                /**
                 * 参数一：是用来添加Snackbar控件，一般使用CoordinatorLayout作为第一个参数。否则其滑动消失的功能会失效。
                 */
                Snackbar.make(mSnackRootView,"显示的内容",Snackbar.LENGTH_INDEFINITE)
                        .setDuration(5000)
                        .setAction("点击", new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {

                                Log.d("demo","--->");
                            }
                }).show();
            }
        });
    }
}
