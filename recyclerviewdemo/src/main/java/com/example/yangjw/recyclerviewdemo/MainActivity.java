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
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import jp.wasabeef.recyclerview.adapters.SlideInLeftAnimationAdapter;
import jp.wasabeef.recyclerview.animators.OvershootInRightAnimator;
import jp.wasabeef.recyclerview.animators.SlideInDownAnimator;
import jp.wasabeef.recyclerview.animators.SlideInLeftAnimator;


public class MainActivity extends AppCompatActivity {

    private RecyclerView mRecyclerView;
    private MyRecyclerAdapter myRecyclerAdapter;

    private List<Integer> dataList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //初始化
        mRecyclerView = (RecyclerView) findViewById(R.id.main_recycler_view);
        //指定一个布局管理器
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false));
        mRecyclerView.setItemAnimator(new SlideInDownAnimator());
        mRecyclerView.getItemAnimator().setAddDuration(1000);
        mRecyclerView.getItemAnimator().setRemoveDuration(1000);
        mRecyclerView.addItemDecoration(new HorizontalDividerItemDecoration.Builder(this).color(Color.RED).build());
        //关联适配器
        myRecyclerAdapter = new MyRecyclerAdapter();
        SlideInLeftAnimationAdapter slideInLeftAnimationAdapter = new SlideInLeftAnimationAdapter(myRecyclerAdapter);
        mRecyclerView.setAdapter(slideInLeftAnimationAdapter);

        //动画
        //1、当删除和增加Item时的动画
        //2、滚动的动画


        dataList.add(R.drawable.a1);
        dataList.add(R.drawable.a2);
        dataList.add(R.drawable.a3);
        dataList.add(R.drawable.a4);


    }

    public void click(View view) {
        switch (view.getId()) {
            case R.id.add:
                dataList.add(1,R.drawable.a2);
                myRecyclerAdapter.notifyItemInserted(1);
                break;
            case R.id.delete:
                dataList.remove(1);
                myRecyclerAdapter.notifyItemRemoved(1);
                break;
        }
    }


    //Recycler的适配器
    class MyRecyclerAdapter extends RecyclerView.Adapter<MyRecyclerAdapter.ViewHolder> {


        class MyListener implements View.OnClickListener {

//            private int position;
//
//            public void setPosition(int position) {
//                this.position = position;
//            }

            @Override
            public void onClick(View v) {
                Object tag = v.getTag();
                Toast.makeText(MainActivity.this,"---" + tag,Toast.LENGTH_LONG).show();
            }
        }

        MyListener myListener = new MyListener();

//        View.OnClickListener onClickListener = new View.OnClickListener() {
//
//            private int position;
//
//            public void setPosition(int position) {
//                this.position = position;
//            }
//
//            @Override
//            public void onClick(View v) {
//
//            }
//        };
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
            holder.imageView.setImageResource(dataList.get(position));
//            myListener.setPosition(position);
            holder.imageView.setTag(position);
            holder.imageView.setOnClickListener(myListener);
        }




        /**
         * 返回Item的个数---也数据数据源的大小
         * @return
         */
        @Override
        public int getItemCount() {
            return dataList.size();
        }

        /**
         * 创建第一个ViewHoldler类
         */
        class ViewHolder extends RecyclerView.ViewHolder {

            public ImageView imageView;
            public ViewHolder(View itemView) {
                super(itemView);
                imageView = (ImageView) itemView.findViewById(R.id.item_imageview);
//                imageView.setOnClickListener(new View.OnClickListener() {
//                    @Override
//                    public void onClick(View v) {
//                        Toast.makeText(MainActivity.this,"ddddd",Toast.LENGTH_LONG).show();
//                    }
//                });
            }
        }
    }
}
