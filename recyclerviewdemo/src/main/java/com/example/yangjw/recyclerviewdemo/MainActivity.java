package com.example.yangjw.recyclerviewdemo;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;


public class MainActivity extends AppCompatActivity {

    private RecyclerView mRecyclerView;
    private MyRecyclerAdapter myRecyclerAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //初始化
        mRecyclerView = (RecyclerView) findViewById(R.id.main_recycler_view);
        //指定一个布局管理器
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false));
        mRecyclerView.addItemDecoration(new HorizontalDividerItemDecoration.Builder(this).color(Color.RED).build());
        //关联适配器
        myRecyclerAdapter = new MyRecyclerAdapter();
        mRecyclerView.setAdapter(myRecyclerAdapter);

    }


    //Recycler的适配器
    class MyRecyclerAdapter extends RecyclerView.Adapter<MyRecyclerAdapter.ViewHolder> {
        /**
         * 创建ViewHolder对象,并且对Item的布局进行初始化
         * @param parent
         * @param viewType
         * @return
         */
        @Override
        public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

            //加载Item布局
            View view = LayoutInflater.from(MainActivity.this).inflate(R.layout.recycler_item, null);
            return new ViewHolder(view);
        }

        /**
         * 此方法是给Item布局中的控件赋值
         * 参数一：onCreateViewHolder方法返回的ViewHolder对象
         * 参数二：Item的索引。
         */
        @Override
        public void onBindViewHolder(ViewHolder holder, int position) {
            holder.imageView.setImageResource(R.drawable.ic_launcher);
        }

        /**
         * 返回Item的个数---也数据数据源的大小
         * @return
         */
        @Override
        public int getItemCount() {
            return 10;
        }

        /**
         * 创建第一个ViewHoldler类
         */
        class ViewHolder extends RecyclerView.ViewHolder {

            public ImageView imageView;
            public ViewHolder(View itemView) {
                super(itemView);
                imageView = (ImageView) itemView.findViewById(R.id.item_imageview);
            }
        }
    }
}
