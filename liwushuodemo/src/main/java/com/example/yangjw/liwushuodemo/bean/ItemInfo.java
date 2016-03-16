package com.example.yangjw.liwushuodemo.bean;

import java.util.List;

/**
 * Created by yangjw on 2016/3/16.
 */
public class ItemInfo {


    /**
     * ad_monitors : []
     * content_type : 2
     * content_url : http://www.liwushuo.com/posts/1038767/content
     * cover_image_url : http://img01.liwushuo.com/image/160315/b6uelv2sc.jpg-w720
     * cover_webp_url : http://img01.liwushuo.com/image/160315/b6uelv2sc.jpg?imageView2/0/w/720/q/85/format/webp
     * created_at : 1458086400
     * editor_id : 1058
     * feature_list : [9,6]
     * id : 1038767
     * labels : []
     * liked : false
     * likes_count : 3907
     * published_at : 1458086400
     * share_msg : 小伙伴们盼望着盼望着的春天终于到啦！万物复苏，阳光普照，穿着花裙子行走在绿茵笼罩的路上，心情别提有多好了！但素，小伙伴们可不要忘记了，春天也是流感及各种传染病的高发时刻，万物的复苏当然也包括细菌咯~小伙伴们也一定不能忽视这个重要的问题哦！想要“安全”地度过春天，那第一步呢，就是要把家里的卫生搞好，让细菌没有藏身之地！
     * short_title : 打扫神器
     * status : 0
     * template :
     * title : 家庭卫生要搞好，打扫神器来报道
     * type : post
     * updated_at : 1458034279
     * url : http://www.liwushuo.com/posts/1038767
     */

    private int content_type;
    private String content_url;
    private String cover_image_url;
    private String cover_webp_url;
    private int created_at;
    private int editor_id;
    private int id;
    private boolean liked;
    private int likes_count;
    private int published_at;
    private String share_msg;
    private String short_title;
    private int status;
    private String template;
    private String title;
    private String type;
    private int updated_at;
    private String url;
    private List<?> ad_monitors;
    private List<Integer> feature_list;
    private List<?> labels;

    public void setContent_type(int content_type) {
        this.content_type = content_type;
    }

    public void setContent_url(String content_url) {
        this.content_url = content_url;
    }

    public void setCover_image_url(String cover_image_url) {
        this.cover_image_url = cover_image_url;
    }

    public void setCover_webp_url(String cover_webp_url) {
        this.cover_webp_url = cover_webp_url;
    }

    public void setCreated_at(int created_at) {
        this.created_at = created_at;
    }

    public void setEditor_id(int editor_id) {
        this.editor_id = editor_id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setLiked(boolean liked) {
        this.liked = liked;
    }

    public void setLikes_count(int likes_count) {
        this.likes_count = likes_count;
    }

    public void setPublished_at(int published_at) {
        this.published_at = published_at;
    }

    public void setShare_msg(String share_msg) {
        this.share_msg = share_msg;
    }

    public void setShort_title(String short_title) {
        this.short_title = short_title;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public void setTemplate(String template) {
        this.template = template;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setUpdated_at(int updated_at) {
        this.updated_at = updated_at;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public void setAd_monitors(List<?> ad_monitors) {
        this.ad_monitors = ad_monitors;
    }

    public void setFeature_list(List<Integer> feature_list) {
        this.feature_list = feature_list;
    }

    public void setLabels(List<?> labels) {
        this.labels = labels;
    }

    public int getContent_type() {
        return content_type;
    }

    public String getContent_url() {
        return content_url;
    }

    public String getCover_image_url() {
        return cover_image_url;
    }

    public String getCover_webp_url() {
        return cover_webp_url;
    }

    public int getCreated_at() {
        return created_at;
    }

    public int getEditor_id() {
        return editor_id;
    }

    public int getId() {
        return id;
    }

    public boolean isLiked() {
        return liked;
    }

    public int getLikes_count() {
        return likes_count;
    }

    public int getPublished_at() {
        return published_at;
    }

    public String getShare_msg() {
        return share_msg;
    }

    public String getShort_title() {
        return short_title;
    }

    public int getStatus() {
        return status;
    }

    public String getTemplate() {
        return template;
    }

    public String getTitle() {
        return title;
    }

    public String getType() {
        return type;
    }

    public int getUpdated_at() {
        return updated_at;
    }

    public String getUrl() {
        return url;
    }

    public List<?> getAd_monitors() {
        return ad_monitors;
    }

    public List<Integer> getFeature_list() {
        return feature_list;
    }

    public List<?> getLabels() {
        return labels;
    }
}
