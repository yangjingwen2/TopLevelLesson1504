package com.example.yangjw.recyclerviewdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.text.Layout;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import java.util.ArrayList;
import java.util.List;

public class HeaderRecyclerViewActivity extends AppCompatActivity {

    private RecyclerView mRecyclerView;
    //数据源
    private List<Integer> bitmapList = new ArrayList<>();
    private MyAdatper myAdatper;
    View headerView;

    public static final int POSITION_ITEM = 0;
    public static final int HEADER_VIEW_TYPE = 1;
    public static final int OTHER_VIEW_TYPE = 2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_header_recycler_view);
        mRecyclerView = (RecyclerView) findViewById(R.id.header_recycler);
        setupData();
        //设置布局管理器
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));
        //适配器
        myAdatper = new MyAdatper();
        mRecyclerView.setAdapter(myAdatper);

        headerView = LayoutInflater.from(HeaderRecyclerViewActivity.this).inflate(R.layout.header_view, null);
    }

    //设置数据源信息
    private void setupData() {
        bitmapList.add(R.drawable.a1);
        bitmapList.add(R.drawable.a2);
        bitmapList.add(R.drawable.a3);
        bitmapList.add(R.drawable.a4);
    }

    class MyAdatper extends RecyclerView.Adapter<MyAdatper.ViewHolder> {

        @Override
        public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            Log.d("demo","--" + viewType);
            if (viewType == HEADER_VIEW_TYPE) {
                return new ViewHolder(headerView);
            }
            View view = LayoutInflater.from(HeaderRecyclerViewActivity.this).inflate(R.layout.cardview, null);
            return new ViewHolder(view);
        }

        @Override
        public void onBindViewHolder(ViewHolder holder, int position) {
            if (position == POSITION_ITEM) {
                return;
            }
            holder.imageView.setImageResource(bitmapList.get(position));
        }

        @Override
        public int getItemCount() {
            return bitmapList.size() + 1;
        }

        @Override
        public int getItemViewType(int position) {
            //下标为0的Item的ViewType为1，其他item的都为ViewType0
            if (position == POSITION_ITEM) {
                return HEADER_VIEW_TYPE;
            }
            return OTHER_VIEW_TYPE;
        }

        class ViewHolder extends RecyclerView.ViewHolder {

            public ImageView imageView;
            public ViewHolder(View itemView) {
                super(itemView);
                if (headerView == itemView) {
                    return;
                }
                imageView = (ImageView) itemView.findViewById(R.id.item_imageview);
            }
        }
    }
}
