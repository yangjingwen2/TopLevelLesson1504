package com.example.yangjw.pulltorefreshdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseExpandableListAdapter;
import android.widget.ExpandableListView;
import android.widget.ImageView;
import android.widget.TextView;

import com.handmark.pulltorefresh.library.PullToRefreshBase;
import com.handmark.pulltorefresh.library.PullToRefreshExpandableListView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    private PullToRefreshExpandableListView refreshableView;
    private MyExpandAdapter myExpandAdapter;
    private ExpandableListView mExpandListView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        refreshableView = (PullToRefreshExpandableListView) findViewById(R.id.expand_listview);
        //设置刷新模式
        refreshableView.setMode(PullToRefreshBase.Mode.BOTH);
        //关联
        myExpandAdapter = new MyExpandAdapter();
//        mExpandListView.setAdapter(myExpandAdapter);

//        获得原始的ExpandableListView对象
        mExpandListView = refreshableView.getRefreshableView();
        mExpandListView.setAdapter(myExpandAdapter);

        //设置刷新的监听事件
        refreshableView.setOnRefreshListener(new PullToRefreshBase.OnRefreshListener2<ExpandableListView>() {
            //下拉刷新
            @Override
            public void onPullDownToRefresh(PullToRefreshBase<ExpandableListView> refreshView) {
                //当请求数据完成之后，执行onRefreshComplete方法，结束刷新动画
                refreshableView.onRefreshComplete();
            }

            //加载更多
            @Override
            public void onPullUpToRefresh(PullToRefreshBase<ExpandableListView> refreshView) {

            }
        });
    }

    class MyExpandAdapter extends BaseExpandableListAdapter {

        @Override
        public int getGroupCount() {
            return 10;
        }

        @Override
        public int getChildrenCount(int groupPosition) {
            return 2;
        }

        @Override
        public Object getGroup(int groupPosition) {
            return null;
        }

        @Override
        public Object getChild(int groupPosition, int childPosition) {
            return null;
        }

        @Override
        public long getGroupId(int groupPosition) {
            return 0;
        }

        @Override
        public long getChildId(int groupPosition, int childPosition) {
            return 0;
        }

        @Override
        public boolean hasStableIds() {
            return false;
        }

        @Override
        public View getGroupView(int groupPosition, boolean isExpanded, View convertView, ViewGroup parent) {
            TextView textView = (TextView) convertView;
            if (textView == null) {
                textView = new TextView(MainActivity.this);
            }
            textView.setText("GROUP" + groupPosition);
            return textView;
        }

        @Override
        public View getChildView(int groupPosition, int childPosition, boolean isLastChild, View convertView, ViewGroup parent) {
            ImageView imageView = (ImageView) convertView;
            if (imageView == null) {
                imageView = new ImageView(MainActivity.this);
            }
            imageView.setImageResource(R.drawable.a2);
            return imageView;
        }

        @Override
        public boolean isChildSelectable(int groupPosition, int childPosition) {
            return false;
        }
    }
}
