package com.example.yangjw.xutilshhcdemo;

import android.support.design.widget.CoordinatorLayout;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Toast;

import com.example.yangjw.xutilshhcdemo.http.HttpConfig;
import com.example.yangjw.xutilshhcdemo.http.HttpTools;
import com.example.yangjw.xutilshhcdemo.http.IXCallBack;
import com.example.yangjw.xutilshhcdemo.info.ProductInfo;
import com.example.yangjw.xutilshhcdemo.tool.GsonTool;
import com.example.yangjw.xutilshhcdemo.tool.LogTool;

import org.xutils.image.ImageOptions;
import org.xutils.view.annotation.ContentView;
import org.xutils.view.annotation.ViewInject;
import org.xutils.x;

import java.util.ArrayList;
import java.util.List;

/**
 * 首页
 */
@ContentView(R.layout.activity_main)
public class MainActivity extends BaseActivity implements IXCallBack{

    public static final int TAG_LIST_ONE = 0x01;
    public static final int TAG_LIST_TWO = 0x02;
    public static final int TAG_LIST_THREE = 0x03;
    public static final int TAG_LIST_TITLE = 0x04;

    private List<ProductInfo.DataEntity> dataEntityList = new ArrayList<>();

    @ViewInject(R.id.rootview)
    private CoordinatorLayout rootView;
    @ViewInject(R.id.main_toolbar)
    private Toolbar mTooBar;
    @ViewInject(R.id.main_product_list_rv)
    private RecyclerView mRecyclerView;
    private HomeListAdapter mHomeListAdapter;
    private int list1Size;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        x.view().inject(this);
        setSupportActionBar(mTooBar);
        getData();

        setupRecyclerView();

    }

    private void setupRecyclerView() {
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));
        mHomeListAdapter = new HomeListAdapter();
        mRecyclerView.setAdapter(mHomeListAdapter);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.homepage_toolbar_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        Toast.makeText(this, item.getTitle(), Toast.LENGTH_SHORT).show();
        return true;
    }

    /**
     * 请求数据
     */
    public void getData() {
        HttpTools.get(HttpConfig.HOME_PAGE_LIST1,"OAuth apiSign=b0ff3cde3fcb39aa53a19cbda34eb28f554571f2",this,TAG_LIST_ONE);
        HttpTools.get(HttpConfig.HOME_PAGE_LIST2,"OAuth apiSign=f3e135ae8e6845c2db2999e30a4031140e845d79",this,TAG_LIST_TWO);
        HttpTools.get(HttpConfig.HOME_PAGE_LIST3,"OAuth apiSign=389d1ada75993d009af94d0a0f4a39c2888d9c82",this,TAG_LIST_THREE);
        HttpTools.get(HttpConfig.HOME_PAGE_LIST_TITLE,"OAuth apiSign=b627f2c46b833199eebdd9e262e808b3fb70f543",this,TAG_LIST_TITLE);
    }


    ProductInfo productInfo1 = null;
    ProductInfo productInfo2 = null;
    ProductInfo productInfo3 = null;
    ProductInfo productInfo4 = null;

    @Override
    public void onSucess(String result,int code) {
        LogTool.LOG(MainActivity.class, result);

        switch(code) {
            case TAG_LIST_ONE:
                 productInfo1 = GsonTool.json2Object(result, ProductInfo.class);
//                Snackbar.make(rootView,productInfo.getData().size()+"个",Snackbar.LENGTH_INDEFINITE).show();
                break;
            case TAG_LIST_TWO:
                productInfo2 = GsonTool.json2Object(result, ProductInfo.class);
                break;
            case TAG_LIST_THREE:
                productInfo3 = GsonTool.json2Object(result, ProductInfo.class);
                break;
            case TAG_LIST_TITLE:
                productInfo4 = GsonTool.json2Object(result, ProductInfo.class);
                break;
        }
        if (productInfo1 != null && productInfo2 != null && productInfo3 != null
                && productInfo4 != null) {

            dataEntityList.addAll(productInfo1.getData());
            dataEntityList.addAll(productInfo2.getData());
            dataEntityList.addAll(productInfo3.getData());


            list1Size = productInfo1.getData().size();
            dataEntityList.add(list1Size, productInfo4.getData().get(0));

            int list2Size = productInfo2.getData().size();
            dataEntityList.add(list1Size+1+4,productInfo4.getData().get(1));

            mHomeListAdapter.notifyDataSetChanged();
        }

    }

    @Override
    public void onFail() {

    }


    class HomeListAdapter extends RecyclerView.Adapter<HomeListAdapter.ViewHodler> {

        private ImageOptions imageOptions;

        public HomeListAdapter() {

            imageOptions = new ImageOptions.Builder()
                    .setRadius(15)
                    .setImageScaleType(ImageView.ScaleType.FIT_CENTER)
                    .setFadeIn(true)
                    .setLoadingDrawable(null)  //设置加载中的占位图
                    .build();
        }

        @Override
        public ViewHodler onCreateViewHolder(ViewGroup parent, int viewType) {
            View view = LayoutInflater.from(MainActivity.this).inflate(R.layout.hone_page_list_item, parent, false);
            return new ViewHodler(view);
        }

        @Override
        public void onBindViewHolder(ViewHodler holder, int position) {
//            holder.imageView
            String fullPath = dataEntityList.get(position).getImgFullPath();
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) holder.imageView.getLayoutParams();
            if (list1Size > position) {
                x.image().bind(holder.imageView, fullPath);
                layoutParams.setMargins(0, 0, 0, 0);
            } else {
                x.image().bind(holder.imageView, fullPath,imageOptions);
                layoutParams.setMargins(20,20,20,0);
            }
            holder.imageView.setLayoutParams(layoutParams);

        }

        @Override
        public int getItemCount() {
            return dataEntityList == null ? 0:dataEntityList.size();
        }

        class ViewHodler extends RecyclerView.ViewHolder {

            @ViewInject(R.id.home_page_item_iv)
            public ImageView imageView;
            public ViewHodler(View itemView) {
                super(itemView);
                x.view().inject(this,itemView);
            }
        }
    }
}
