package com.example.yangjw.materialdesigndemo;

import android.support.design.widget.CoordinatorLayout;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class FloatingActionButtonActivity extends AppCompatActivity {

    private FloatingActionButton mFloatingBtn;
    private CoordinatorLayout coordinatorLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_floating_action_button);
        coordinatorLayout = (CoordinatorLayout) findViewById(R.id.floating_root_layout);
        mFloatingBtn = (FloatingActionButton) findViewById(R.id.floating_action_button);
        mFloatingBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //点击后的效果
                Snackbar.make(coordinatorLayout,"这里显示内容",Snackbar.LENGTH_INDEFINITE)
                        .setAction("点击", new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {

                            }
                        }).show();
            }
        });
    }
}
