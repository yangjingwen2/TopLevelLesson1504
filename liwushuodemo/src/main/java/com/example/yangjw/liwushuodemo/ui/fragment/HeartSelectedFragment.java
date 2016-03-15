package com.example.yangjw.liwushuodemo.ui.fragment;

import android.content.Context;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseExpandableListAdapter;
import android.widget.ExpandableListAdapter;
import android.widget.ExpandableListView;
import android.widget.ImageView;
import android.widget.TextView;

import com.bigkoo.convenientbanner.ConvenientBanner;
import com.bigkoo.convenientbanner.holder.CBViewHolderCreator;
import com.bigkoo.convenientbanner.holder.Holder;
import com.example.yangjw.liwushuodemo.BaseFragment;
import com.example.yangjw.liwushuodemo.R;
import com.example.yangjw.liwushuodemo.tool.DateFormatTool;
import com.example.yangjw.liwushuodemo.tool.LogTool;

import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;
import butterknife.OnItemClick;

/**
 *
 * @author yangjw
 * @date 2016.3.15
 * @desc:精选界面
 */
public class HeartSelectedFragment extends BaseFragment {


    @Bind(R.id.selected_expand_lv)
    ExpandableListView mExpandListView;

    private Context mContext;

    private List<Integer> mBannerDataList = new ArrayList<>();

    private HeaderViewHolder headerViewHolder;
    /**
     * Fragment和Activity通信的接口：采用的接口回掉
     */
    private OnFragmentInteractionListener mListener;
    private ExpandAdapter mExpandAdapter;

    /**
     * 无参构造器：必写
     */
    public HeartSelectedFragment() {
        // Required empty public constructor
    }


    /**
     * 工厂方法模式。用于创建当前Fragment对象
     * @return
     */
    public static HeartSelectedFragment newInstance() {
        HeartSelectedFragment fragment = new HeartSelectedFragment();
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        mContext = getActivity();

        LogTool.LOG_D(HeartSelectedFragment.class,"--onCreate");

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        LogTool.LOG_D(HeartSelectedFragment.class,"--onCreateView");
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_heart_selected, container, false);
        //初始化ButterKnife
        ButterKnife.bind(this, view);

        setupHeaderView();
        setupExpandListView();
        return view;
    }

    @Override
    public void onDestroyView() {
        LogTool.LOG_D(HeartSelectedFragment.class,"--onDestroyView");
        super.onDestroyView();
    }

    @Override
    public void onResume() {
        super.onResume();
        if (headerViewHolder != null) {
            headerViewHolder.mConvenientBannner.startTurning(3000);
        }

    }

    @Override
    public void onPause() {
        super.onPause();
        if (headerViewHolder != null) {
            headerViewHolder.mConvenientBannner.stopTurning();
        }
    }

    /**
     * 添加头部布局
     */
    private void setupHeaderView() {


        if (mBannerDataList.isEmpty()) {
            mBannerDataList.add(R.drawable.child_item);
            mBannerDataList.add(R.drawable.abc2);
        }

        View headerView = LayoutInflater.from(mContext).inflate(R.layout.expand_listview_header, null);
        headerViewHolder = new HeaderViewHolder(headerView);

        //参数一：CBViewHolderCreator创建者对象
        //参数二：数据源
        headerViewHolder.mConvenientBannner.setPages(new CBViewHolderCreator() {
            @Override
            public Object createHolder() {
                return new BannerViewHolder();
            }
        },mBannerDataList)
        .setPageIndicator(new int[]{R.drawable.ic_page_indicator,R.drawable.ic_page_indicator_focused})
        .setPageIndicatorAlign(ConvenientBanner.PageIndicatorAlign.CENTER_HORIZONTAL);

        mExpandListView.addHeaderView(headerView);


    }

    class BannerViewHolder implements Holder<Integer> {

        private ImageView mBannerImageView;

        @Override
        public View createView(Context context) {
            mBannerImageView = new ImageView(mContext);
            mBannerImageView.setScaleType(ImageView.ScaleType.FIT_XY);
            return mBannerImageView;
        }

        @Override
        public void UpdateUI(Context context, int position, Integer data) {

            mBannerImageView.setImageResource(data);
        }
    }

    class HeaderViewHolder {
        @Bind(R.id.expand_listview_header_convenientBanner)
        ConvenientBanner mConvenientBannner;
        public HeaderViewHolder(View view) {
            ButterKnife.bind(this,view);
        }
    }


    /**
     * ExpandableListView设置
     */
    private void setupExpandListView() {

        mExpandAdapter = new ExpandAdapter();

        //关联适配i
        mExpandListView.setAdapter(mExpandAdapter);

        for (int i=0; i<6; i++) {
            mExpandListView.expandGroup(i);
        }

        mExpandListView.setOnGroupClickListener(new ExpandableListView.OnGroupClickListener() {
            @Override
            public boolean onGroupClick(ExpandableListView parent, View v, int groupPosition, long id) {
                return true;
            }
        });
    }


    /**
     * 创建ExpandableListView的适配器
     */

    class ExpandAdapter extends BaseExpandableListAdapter {

        /**
         * 分组的数量
         * @return
         */
        @Override
        public int getGroupCount() {
            return 6;
        }


        /**
         * 某一个组的Child的数量
         * @param groupPosition  组的索引
         * @return
         */
        @Override
        public int getChildrenCount(int groupPosition) {
            return 3;
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
            return groupPosition;
        }

        @Override
        public long getChildId(int groupPosition, int childPosition) {
            return childPosition;
        }

        @Override
        public boolean hasStableIds() {
            return false;
        }

        /**
         * 创建Group的布局样式
         * @param groupPosition
         * @param isExpanded
         * @param convertView
         * @param parent
         * @return
         */
        @Override
        public View getGroupView(int groupPosition, boolean isExpanded, View convertView, ViewGroup parent) {
            View groupView = convertView;
            GroupViewHolder groupViewHolder = null;
            if (groupView != null) {
                groupViewHolder = (GroupViewHolder) groupView.getTag();
            } else {
                groupView = LayoutInflater.from(mContext).inflate(R.layout.heart_selected_listview_group_item, null);
                groupViewHolder = new GroupViewHolder(groupView);
                groupView.setTag(groupViewHolder);
            }

            groupViewHolder.mDateText.setText(DateFormatTool.formatDate(new Date().getTime()));

            return groupView;
        }

        class GroupViewHolder {

            @Bind(R.id.heart_selected_group_date_tv)
            TextView mDateText;

            public GroupViewHolder(View view) {
                ButterKnife.bind(this,view);
            }
        }

        /**
         * 创建child的布局样式
         * @param groupPosition
         * @param childPosition
         * @param isLastChild
         * @param convertView
         * @param parent
         * @return
         */
        @Override
        public View getChildView(int groupPosition, int childPosition, boolean isLastChild, View convertView, ViewGroup parent) {
//            TextView childTextView = (TextView) convertView;
//            if (childTextView == null) {
//                childTextView = new TextView(getActivity());
//            }
//            childTextView.setText("组" + groupPosition + "孩子" + childPosition);

            View childView = convertView;
            ChildViewHolder childViewHolder = null;
            if (childView != null) {
                childViewHolder = (ChildViewHolder) childView.getTag();
            } else {
                childView = LayoutInflater.from(mContext).inflate(R.layout.heart_selected_listview_child_item,null);
                childViewHolder = new ChildViewHolder(childView);
                childView.setTag(childViewHolder);
            }
            return childView;
        }

        class ChildViewHolder {
            @Bind(R.id.selected_child_imageview)
            ImageView imageView;
            @Bind(R.id.selected_child_title_tv)
            TextView titleText;
            public ChildViewHolder(View view) {
                ButterKnife.bind(this,view);
            }
        }

        @Override
        public boolean isChildSelectable(int groupPosition, int childPosition) {
            return false;
        }
    }



    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof OnFragmentInteractionListener) {
            mListener = (OnFragmentInteractionListener) context;
        } else {
            throw new RuntimeException(context.toString()
                    + " must implement OnFragmentInteractionListener");
        }
    }

    @Override
    public void onDetach() {
        super.onDetach();
        mListener = null;
    }


}
