package com.example.yangjw.videodemo;

import android.content.Context;
import android.media.Image;
import android.media.MediaPlayer;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.SurfaceView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.google.gson.Gson;
import com.squareup.picasso.Picasso;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.ContentHandler;
import java.util.ArrayList;
import java.util.List;

/**
 * 在List列表中实现视频播放
 */
public class ListVideoActivity extends AppCompatActivity {

    private ListView mListView;

    //List数据源
    private List<VideoItem.RootDataEntity.DataEntity> dataEntityList = new ArrayList<>();
    private VideoAdapter videoAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_video);
        mListView = (ListView) findViewById(R.id.list_video_lv);

        //解析数据
        loadData() ;

        //关联适配器
        videoAdapter = new VideoAdapter(this);
        mListView.setAdapter(videoAdapter);
    }

    /**
     * 解析数据
     */
    private void loadData() {

        //解析Assets文件夹下的数据
        //根据文件名称获取对应的文件流
        try {
            InputStream inputStream = getAssets().open("video1.json");
            int len=0;
            byte[] buffer = new byte[1024];
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            while((len = inputStream.read(buffer)) != -1) {
                byteArrayOutputStream.write(buffer,0,len);
            }
            byte[] bytes = byteArrayOutputStream.toByteArray();
            String json = new String(bytes);

            inputStream.close();
            byteArrayOutputStream.close();

            //解析JSON
            Gson gson = new Gson();
            VideoItem videoItem = gson.fromJson(json, VideoItem.class);
            dataEntityList.addAll(videoItem.getData().getData());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    class VideoAdapter extends BaseAdapter {

        private Context mContext;
        private MediaPlayer mMediaPlayer;
        private int videoPlayingPosition = -1;

        public VideoAdapter(Context mContext) {
            this.mContext = mContext;
            mMediaPlayer = new MediaPlayer();
        }

        @Override
        public int getCount() {
            return dataEntityList == null ? 0 : dataEntityList.size();
        }

        @Override
        public Object getItem(int position) {
            return null;
        }

        @Override
        public long getItemId(int position) {
            return 0;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            //加载Item的布局
            View view = convertView;
            ViewHolder viewHolder = null;
            if (view == null) {
                view = LayoutInflater.from(mContext).inflate(R.layout.video_item_layout, null);
                viewHolder = new ViewHolder(view);
                view.setTag(viewHolder);
            } else {
                viewHolder = (ViewHolder) view.getTag();
            }




            //获得VideoItem对象
            VideoItem.RootDataEntity.DataEntity dataEntity = dataEntityList.get(position);
            if (dataEntity != null && dataEntity.getGroup() != null) {
                String content = dataEntity.getGroup().getContent();
                viewHolder.titleTxt.setText(content);
            } else {
                viewHolder.titleTxt.setText("");
            }


            //动态设置SurfaceView的高度和宽度

            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) viewHolder.surfaceView.getLayoutParams();
            if (dataEntity.getGroup() != null && dataEntity.getGroup().getValue360p_video() != null) {
                layoutParams.width = dataEntity.getGroup().getValue360p_video().getWidth();
                layoutParams.height = dataEntity.getGroup().getValue360p_video().getHeight();
                viewHolder.surfaceView.setLayoutParams(layoutParams);
                viewHolder.imageView.setLayoutParams(layoutParams);
                viewHolder.surfaceView.requestLayout();//请求重新执行onMeasure方法和onLayout方法、onDraw（请求重新绘制）
            }


            if (dataEntity.getGroup() != null && dataEntity.getGroup().getMedium_cover() != null
                    && dataEntity.getGroup().getMedium_cover().getUrl_list() != null
                    && !dataEntity.getGroup().getMedium_cover().getUrl_list().isEmpty()
                    && dataEntity.getGroup().getMedium_cover().getUrl_list().get(0) != null) {

                String url = dataEntity.getGroup().getMedium_cover().getUrl_list().get(0).getUrl();
                Picasso.with(mContext).load(url).into(viewHolder.imageView);

            } else {
                viewHolder.imageView.setImageResource(R.mipmap.ic_launcher);
            }


            Object tag = viewHolder.imageView.getTag();
            if (tag != null) {
                Integer integer = Integer.valueOf(tag.toString());
                //integer != position此判断表示被回收的Item再次被利用
                //videoPlayingPosition == integer表示此Item上的视频正在播放
                if (integer != position && videoPlayingPosition == integer){
                    mMediaPlayer.stop();
                    viewHolder.imageView.setVisibility(View.VISIBLE);
                    viewHolder.surfaceView.setVisibility(View.GONE);
                }
            }

            viewHolder.imageView.setTag(position);


            return view;
        }

        class ViewHolder implements View.OnClickListener,MediaPlayer.OnPreparedListener{
            public SurfaceView surfaceView;
            public ImageView imageView;
            public TextView titleTxt;
            public ViewHolder(View view) {
                surfaceView = (SurfaceView) view.findViewById(R.id.item_surfaceview);
                imageView = (ImageView) view.findViewById(R.id.item_video_image);
                titleTxt = (TextView) view.findViewById(R.id.item_show_title);
                imageView.setOnClickListener(this);
            }

            @Override
            public void onClick(View v) {
                //点击图片，播放视频
                surfaceView.setVisibility(View.VISIBLE);
                Integer position = Integer.valueOf(v.getTag().toString());
                videoPlayingPosition = position;
                VideoItem.RootDataEntity.DataEntity.GroupEntity.V360pVideoEntity.UrlListEntity urlListEntity
                        = dataEntityList.get(position).getGroup().getValue360p_video().getUrl_list().get(0);
                String url = urlListEntity.getUrl();

                Log.d("demo", "--->" + url);
                //重置，恢复初始状态
                mMediaPlayer.reset();
                Uri uri = Uri.parse(url);
                try {
                    mMediaPlayer.setDataSource(mContext, uri);
                    mMediaPlayer.setOnPreparedListener(this);
                    //图像显示到SurfaceView中
                    mMediaPlayer.setDisplay(surfaceView.getHolder());
                    mMediaPlayer.prepareAsync();//开始准备数据，异步

                } catch (IOException e) {
                    e.printStackTrace();
                }

                v.setVisibility(View.GONE);
            }

            @Override
            public void onPrepared(MediaPlayer mp) {

                mMediaPlayer.start();
            }
        }
    }
}
