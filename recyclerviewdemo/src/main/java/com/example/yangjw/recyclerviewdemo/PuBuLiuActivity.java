package com.example.yangjw.recyclerviewdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import java.util.ArrayList;
import java.util.List;

public class PuBuLiuActivity extends AppCompatActivity {


    //数据源
    List<Integer> dataList = new ArrayList<>();
    private RecyclerView mRecyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pu_bu_liu);

        //数据源
        dataList.add(R.drawable.a1);
        dataList.add(R.drawable.a2);
        dataList.add(R.drawable.a3);
        dataList.add(R.drawable.a4);
        dataList.add(R.drawable.a1);
        dataList.add(R.drawable.a2);
        dataList.add(R.drawable.a3);
        dataList.add(R.drawable.a4);
        dataList.add(R.drawable.a1);
        dataList.add(R.drawable.a2);
        dataList.add(R.drawable.a3);
        dataList.add(R.drawable.a4);
        dataList.add(R.drawable.a1);
        dataList.add(R.drawable.a2);
        dataList.add(R.drawable.a3);
        dataList.add(R.drawable.a4);

        //1、初始化RecyclerView
        mRecyclerView = (RecyclerView) findViewById(R.id.pubuliu_recycler_view);
        //2、设置布局管理器
        //参数一：列数或者行数，参数二：方向
        mRecyclerView.setLayoutManager(new StaggeredGridLayoutManager(2,StaggeredGridLayoutManager.VERTICAL));
        //3、创建适配器，并且和数据源进行关联
        //4、设置适配器
        mRecyclerView.setAdapter(new MyAdapter());

    }

    /**
     * 1、创建一个recyclerView.adapter的子类
     * 2、创建一个ViewHodler继承RecyclerView.ViewHolder
     * 3、将recyclerView.adapter的子类的泛型设置为第2步中的ViewHolder
     * 4、重写Adpater的3个方法
     */
    class MyAdapter extends RecyclerView.Adapter<MyAdapter.ViewHolder> {


        @Override
        public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            //创建一个Item的布局
            View view = LayoutInflater.from(PuBuLiuActivity.this).inflate(R.layout.recycler_item, null);

            Log.d("demo","--->onCreateViewHolder" );
            return new ViewHolder(view);
        }

        @Override
        public void onBindViewHolder(ViewHolder holder, int position) {
            holder.imageView.setImageResource(dataList.get(position));
        }

        @Override
        public int getItemCount() {
            return dataList.size();
        }

        class ViewHolder extends RecyclerView.ViewHolder {

            public ImageView imageView;

            public ViewHolder(View itemView) {
                super(itemView);
                imageView = (ImageView) itemView.findViewById(R.id.item_imageview);
            }
        }
    }
}
