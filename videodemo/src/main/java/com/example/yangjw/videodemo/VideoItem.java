package com.example.yangjw.videodemo;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by yangjw on 2016/3/23.
 */
public class VideoItem {




    private RootDataEntity data;


    private String message;

    public RootDataEntity getData() {
        return data;
    }

    public void setData(RootDataEntity data) {
        this.data = data;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public static class RootDataEntity {
        private boolean has_more;
        private boolean has_new_message;
        private int max_time;
        private int min_time;
        private String tip;


        private List<DataEntity> data;

        public boolean isHas_more() {
            return has_more;
        }

        public void setHas_more(boolean has_more) {
            this.has_more = has_more;
        }

        public boolean isHas_new_message() {
            return has_new_message;
        }

        public void setHas_new_message(boolean has_new_message) {
            this.has_new_message = has_new_message;
        }

        public int getMax_time() {
            return max_time;
        }

        public void setMax_time(int max_time) {
            this.max_time = max_time;
        }

        public int getMin_time() {
            return min_time;
        }

        public void setMin_time(int min_time) {
            this.min_time = min_time;
        }

        public String getTip() {
            return tip;
        }

        public void setTip(String tip) {
            this.tip = tip;
        }

        public List<DataEntity> getData() {
            return data;
        }

        public void setData(List<DataEntity> data) {
            this.data = data;
        }

        public static class DataEntity {
            private int display_time;


            private GroupEntity group;
            private int online_time;
            private int type;
            private List<?> comments;

            public int getDisplay_time() {
                return display_time;
            }

            public void setDisplay_time(int display_time) {
                this.display_time = display_time;
            }

            public GroupEntity getGroup() {
                return group;
            }

            public void setGroup(GroupEntity group) {
                this.group = group;
            }

            public int getOnline_time() {
                return online_time;
            }

            public void setOnline_time(int online_time) {
                this.online_time = online_time;
            }

            public int getType() {
                return type;
            }

            public void setType(int type) {
                this.type = type;
            }

            public List<?> getComments() {
                return comments;
            }

            public void setComments(List<?> comments) {
                this.comments = comments;
            }

            public static class GroupEntity {
                /**
                 * height : 360
                 * uri : 360p/840aebabb21d4ed7a27dfd5f993f86e3
                 * url_list : [{"url":"http://i.snssdk.com/neihan/video/playback/?video_id=840aebabb21d4ed7a27dfd5f993f86e3&quality=360p&line=0&is_gif=0"},{"url":"http://i.snssdk.com/neihan/video/playback/?video_id=840aebabb21d4ed7a27dfd5f993f86e3&quality=360p&line=1&is_gif=0"}]
                 * width : 202
                 */

                @SerializedName("360p_video")
                private V360pVideoEntity value360p_video;
                /**
                 * height : 360
                 * uri : 480p/840aebabb21d4ed7a27dfd5f993f86e3
                 * url_list : [{"url":"http://i.snssdk.com/neihan/video/playback/?video_id=840aebabb21d4ed7a27dfd5f993f86e3&quality=480p&line=0&is_gif=0"},{"url":"http://i.snssdk.com/neihan/video/playback/?video_id=840aebabb21d4ed7a27dfd5f993f86e3&quality=480p&line=1&is_gif=0"}]
                 * width : 202
                 */

                @SerializedName("480p_video")
                private V480pVideoEntity value480p_video;
                /**
                 * height : 360
                 * uri : 720p/840aebabb21d4ed7a27dfd5f993f86e3
                 * url_list : [{"url":"http://i.snssdk.com/neihan/video/playback/?video_id=840aebabb21d4ed7a27dfd5f993f86e3&quality=720p&line=0&is_gif=0"},{"url":"http://i.snssdk.com/neihan/video/playback/?video_id=840aebabb21d4ed7a27dfd5f993f86e3&quality=720p&line=1&is_gif=0"}]
                 * width : 202
                 */

                @SerializedName("720p_video")
                private V720pVideoEntity value720p_video;
                private boolean allow_dislike;
                private int bury_count;
                private int category_id;
                private String category_name;
                private int category_type;
                private boolean category_visible;
                private int comment_count;
                private String content;
                private String cover_image_uri;
                private String cover_image_url;
                private int create_time;
                private int digg_count;
                private double duration;
                private int favorite_count;
                private String flash_url;
                private int go_detail_count;
                private long group_id;
                private int has_comments;
                private int has_hot_comments;
                private long id;
                private boolean is_anonymous;
                private int is_can_share;
                private int is_public_url;
                private int is_video;
                private String keywords;
                private int label;
                /**
                 * uri : large/a000f40e3,9b5230a5
                 * url_list : [{"url":"http://p1.pstatp.com/large/a000f40e3,9b5230a5"},{"url":"http://p4.pstatp.com/large/a000f40e3,9b5230a5"},{"url":"http://p4.pstatp.com/large/a000f40e3,9b5230a5"}]
                 */

                private LargeCoverEntity large_cover;
                private String m3u8_url;
                private int media_type;
                /**
                 * uri : medium/a000f40e3,9b5230a5
                 * url_list : [{"url":"http://p1.pstatp.com/w202/a000f40e3,9b5230a5"},{"url":"http://p4.pstatp.com/w202/a000f40e3,9b5230a5"},{"url":"http://p4.pstatp.com/w202/a000f40e3,9b5230a5"}]
                 */

                private MediumCoverEntity medium_cover;
                private String mp4_url;
                private int online_time;
                /**
                 * height : 360
                 * uri : origin/840aebabb21d4ed7a27dfd5f993f86e3
                 * url_list : [{"url":"http://i.snssdk.com/neihan/video/playback/?video_id=840aebabb21d4ed7a27dfd5f993f86e3&quality=origin&line=0&is_gif=0"},{"url":"http://i.snssdk.com/neihan/video/playback/?video_id=840aebabb21d4ed7a27dfd5f993f86e3&quality=origin&line=1&is_gif=0"}]
                 * width : 202
                 */

                private OriginVideoEntity origin_video;
                private int play_count;
                private String publish_time;
                private int repin_count;
                private int share_count;
                private int share_type;
                private String share_url;
                private int status;
                private String status_desc;
                private String text;
                private String title;
                private int type;
                private String uri;
                /**
                 * avatar_url : http://s0.pstatp.com/image/avatar.png
                 * is_following : false
                 * name : 柔弱坏女子
                 * user_id : 3351558401
                 * user_verified : false
                 */

                private UserEntity user;
                private int user_bury;
                private int user_digg;
                private int user_favorite;
                private int user_repin;
                private int video_height;
                private int video_width;
                /**
                 * id : 77
                 * title : 吧:奇葩新闻
                 * type : 2
                 */

                private List<DislikeReasonEntity> dislike_reason;

                public V360pVideoEntity getValue360p_video() {
                    return value360p_video;
                }

                public void setValue360p_video(V360pVideoEntity value360p_video) {
                    this.value360p_video = value360p_video;
                }

                public V480pVideoEntity getValue480p_video() {
                    return value480p_video;
                }

                public void setValue480p_video(V480pVideoEntity value480p_video) {
                    this.value480p_video = value480p_video;
                }

                public V720pVideoEntity getValue720p_video() {
                    return value720p_video;
                }

                public void setValue720p_video(V720pVideoEntity value720p_video) {
                    this.value720p_video = value720p_video;
                }

                public boolean isAllow_dislike() {
                    return allow_dislike;
                }

                public void setAllow_dislike(boolean allow_dislike) {
                    this.allow_dislike = allow_dislike;
                }

                public int getBury_count() {
                    return bury_count;
                }

                public void setBury_count(int bury_count) {
                    this.bury_count = bury_count;
                }

                public int getCategory_id() {
                    return category_id;
                }

                public void setCategory_id(int category_id) {
                    this.category_id = category_id;
                }

                public String getCategory_name() {
                    return category_name;
                }

                public void setCategory_name(String category_name) {
                    this.category_name = category_name;
                }

                public int getCategory_type() {
                    return category_type;
                }

                public void setCategory_type(int category_type) {
                    this.category_type = category_type;
                }

                public boolean isCategory_visible() {
                    return category_visible;
                }

                public void setCategory_visible(boolean category_visible) {
                    this.category_visible = category_visible;
                }

                public int getComment_count() {
                    return comment_count;
                }

                public void setComment_count(int comment_count) {
                    this.comment_count = comment_count;
                }

                public String getContent() {
                    return content;
                }

                public void setContent(String content) {
                    this.content = content;
                }

                public String getCover_image_uri() {
                    return cover_image_uri;
                }

                public void setCover_image_uri(String cover_image_uri) {
                    this.cover_image_uri = cover_image_uri;
                }

                public String getCover_image_url() {
                    return cover_image_url;
                }

                public void setCover_image_url(String cover_image_url) {
                    this.cover_image_url = cover_image_url;
                }

                public int getCreate_time() {
                    return create_time;
                }

                public void setCreate_time(int create_time) {
                    this.create_time = create_time;
                }

                public int getDigg_count() {
                    return digg_count;
                }

                public void setDigg_count(int digg_count) {
                    this.digg_count = digg_count;
                }

                public double getDuration() {
                    return duration;
                }

                public void setDuration(double duration) {
                    this.duration = duration;
                }

                public int getFavorite_count() {
                    return favorite_count;
                }

                public void setFavorite_count(int favorite_count) {
                    this.favorite_count = favorite_count;
                }

                public String getFlash_url() {
                    return flash_url;
                }

                public void setFlash_url(String flash_url) {
                    this.flash_url = flash_url;
                }

                public int getGo_detail_count() {
                    return go_detail_count;
                }

                public void setGo_detail_count(int go_detail_count) {
                    this.go_detail_count = go_detail_count;
                }

                public long getGroup_id() {
                    return group_id;
                }

                public void setGroup_id(long group_id) {
                    this.group_id = group_id;
                }

                public int getHas_comments() {
                    return has_comments;
                }

                public void setHas_comments(int has_comments) {
                    this.has_comments = has_comments;
                }

                public int getHas_hot_comments() {
                    return has_hot_comments;
                }

                public void setHas_hot_comments(int has_hot_comments) {
                    this.has_hot_comments = has_hot_comments;
                }

                public long getId() {
                    return id;
                }

                public void setId(long id) {
                    this.id = id;
                }

                public boolean isIs_anonymous() {
                    return is_anonymous;
                }

                public void setIs_anonymous(boolean is_anonymous) {
                    this.is_anonymous = is_anonymous;
                }

                public int getIs_can_share() {
                    return is_can_share;
                }

                public void setIs_can_share(int is_can_share) {
                    this.is_can_share = is_can_share;
                }

                public int getIs_public_url() {
                    return is_public_url;
                }

                public void setIs_public_url(int is_public_url) {
                    this.is_public_url = is_public_url;
                }

                public int getIs_video() {
                    return is_video;
                }

                public void setIs_video(int is_video) {
                    this.is_video = is_video;
                }

                public String getKeywords() {
                    return keywords;
                }

                public void setKeywords(String keywords) {
                    this.keywords = keywords;
                }

                public int getLabel() {
                    return label;
                }

                public void setLabel(int label) {
                    this.label = label;
                }

                public LargeCoverEntity getLarge_cover() {
                    return large_cover;
                }

                public void setLarge_cover(LargeCoverEntity large_cover) {
                    this.large_cover = large_cover;
                }

                public String getM3u8_url() {
                    return m3u8_url;
                }

                public void setM3u8_url(String m3u8_url) {
                    this.m3u8_url = m3u8_url;
                }

                public int getMedia_type() {
                    return media_type;
                }

                public void setMedia_type(int media_type) {
                    this.media_type = media_type;
                }

                public MediumCoverEntity getMedium_cover() {
                    return medium_cover;
                }

                public void setMedium_cover(MediumCoverEntity medium_cover) {
                    this.medium_cover = medium_cover;
                }

                public String getMp4_url() {
                    return mp4_url;
                }

                public void setMp4_url(String mp4_url) {
                    this.mp4_url = mp4_url;
                }

                public int getOnline_time() {
                    return online_time;
                }

                public void setOnline_time(int online_time) {
                    this.online_time = online_time;
                }

                public OriginVideoEntity getOrigin_video() {
                    return origin_video;
                }

                public void setOrigin_video(OriginVideoEntity origin_video) {
                    this.origin_video = origin_video;
                }

                public int getPlay_count() {
                    return play_count;
                }

                public void setPlay_count(int play_count) {
                    this.play_count = play_count;
                }

                public String getPublish_time() {
                    return publish_time;
                }

                public void setPublish_time(String publish_time) {
                    this.publish_time = publish_time;
                }

                public int getRepin_count() {
                    return repin_count;
                }

                public void setRepin_count(int repin_count) {
                    this.repin_count = repin_count;
                }

                public int getShare_count() {
                    return share_count;
                }

                public void setShare_count(int share_count) {
                    this.share_count = share_count;
                }

                public int getShare_type() {
                    return share_type;
                }

                public void setShare_type(int share_type) {
                    this.share_type = share_type;
                }

                public String getShare_url() {
                    return share_url;
                }

                public void setShare_url(String share_url) {
                    this.share_url = share_url;
                }

                public int getStatus() {
                    return status;
                }

                public void setStatus(int status) {
                    this.status = status;
                }

                public String getStatus_desc() {
                    return status_desc;
                }

                public void setStatus_desc(String status_desc) {
                    this.status_desc = status_desc;
                }

                public String getText() {
                    return text;
                }

                public void setText(String text) {
                    this.text = text;
                }

                public String getTitle() {
                    return title;
                }

                public void setTitle(String title) {
                    this.title = title;
                }

                public int getType() {
                    return type;
                }

                public void setType(int type) {
                    this.type = type;
                }

                public String getUri() {
                    return uri;
                }

                public void setUri(String uri) {
                    this.uri = uri;
                }

                public UserEntity getUser() {
                    return user;
                }

                public void setUser(UserEntity user) {
                    this.user = user;
                }

                public int getUser_bury() {
                    return user_bury;
                }

                public void setUser_bury(int user_bury) {
                    this.user_bury = user_bury;
                }

                public int getUser_digg() {
                    return user_digg;
                }

                public void setUser_digg(int user_digg) {
                    this.user_digg = user_digg;
                }

                public int getUser_favorite() {
                    return user_favorite;
                }

                public void setUser_favorite(int user_favorite) {
                    this.user_favorite = user_favorite;
                }

                public int getUser_repin() {
                    return user_repin;
                }

                public void setUser_repin(int user_repin) {
                    this.user_repin = user_repin;
                }

                public int getVideo_height() {
                    return video_height;
                }

                public void setVideo_height(int video_height) {
                    this.video_height = video_height;
                }

                public int getVideo_width() {
                    return video_width;
                }

                public void setVideo_width(int video_width) {
                    this.video_width = video_width;
                }

                public List<DislikeReasonEntity> getDislike_reason() {
                    return dislike_reason;
                }

                public void setDislike_reason(List<DislikeReasonEntity> dislike_reason) {
                    this.dislike_reason = dislike_reason;
                }

                public static class V360pVideoEntity {
                    private int height;
                    private String uri;
                    private int width;
                    /**
                     * url : http://i.snssdk.com/neihan/video/playback/?video_id=840aebabb21d4ed7a27dfd5f993f86e3&quality=360p&line=0&is_gif=0
                     */

                    private List<UrlListEntity> url_list;

                    public int getHeight() {
                        return height;
                    }

                    public void setHeight(int height) {
                        this.height = height;
                    }

                    public String getUri() {
                        return uri;
                    }

                    public void setUri(String uri) {
                        this.uri = uri;
                    }

                    public int getWidth() {
                        return width;
                    }

                    public void setWidth(int width) {
                        this.width = width;
                    }

                    public List<UrlListEntity> getUrl_list() {
                        return url_list;
                    }

                    public void setUrl_list(List<UrlListEntity> url_list) {
                        this.url_list = url_list;
                    }

                    public static class UrlListEntity {
                        private String url;

                        public String getUrl() {
                            return url;
                        }

                        public void setUrl(String url) {
                            this.url = url;
                        }
                    }
                }

                public static class V480pVideoEntity {
                    private int height;
                    private String uri;
                    private int width;
                    /**
                     * url : http://i.snssdk.com/neihan/video/playback/?video_id=840aebabb21d4ed7a27dfd5f993f86e3&quality=480p&line=0&is_gif=0
                     */

                    private List<UrlListEntity> url_list;

                    public int getHeight() {
                        return height;
                    }

                    public void setHeight(int height) {
                        this.height = height;
                    }

                    public String getUri() {
                        return uri;
                    }

                    public void setUri(String uri) {
                        this.uri = uri;
                    }

                    public int getWidth() {
                        return width;
                    }

                    public void setWidth(int width) {
                        this.width = width;
                    }

                    public List<UrlListEntity> getUrl_list() {
                        return url_list;
                    }

                    public void setUrl_list(List<UrlListEntity> url_list) {
                        this.url_list = url_list;
                    }

                    public static class UrlListEntity {
                        private String url;

                        public String getUrl() {
                            return url;
                        }

                        public void setUrl(String url) {
                            this.url = url;
                        }
                    }
                }

                public static class V720pVideoEntity {
                    private int height;
                    private String uri;
                    private int width;
                    /**
                     * url : http://i.snssdk.com/neihan/video/playback/?video_id=840aebabb21d4ed7a27dfd5f993f86e3&quality=720p&line=0&is_gif=0
                     */

                    private List<UrlListEntity> url_list;

                    public int getHeight() {
                        return height;
                    }

                    public void setHeight(int height) {
                        this.height = height;
                    }

                    public String getUri() {
                        return uri;
                    }

                    public void setUri(String uri) {
                        this.uri = uri;
                    }

                    public int getWidth() {
                        return width;
                    }

                    public void setWidth(int width) {
                        this.width = width;
                    }

                    public List<UrlListEntity> getUrl_list() {
                        return url_list;
                    }

                    public void setUrl_list(List<UrlListEntity> url_list) {
                        this.url_list = url_list;
                    }

                    public static class UrlListEntity {
                        private String url;

                        public String getUrl() {
                            return url;
                        }

                        public void setUrl(String url) {
                            this.url = url;
                        }
                    }
                }

                public static class LargeCoverEntity {
                    private String uri;
                    /**
                     * url : http://p1.pstatp.com/large/a000f40e3,9b5230a5
                     */

                    private List<UrlListEntity> url_list;

                    public String getUri() {
                        return uri;
                    }

                    public void setUri(String uri) {
                        this.uri = uri;
                    }

                    public List<UrlListEntity> getUrl_list() {
                        return url_list;
                    }

                    public void setUrl_list(List<UrlListEntity> url_list) {
                        this.url_list = url_list;
                    }

                    public static class UrlListEntity {
                        private String url;

                        public String getUrl() {
                            return url;
                        }

                        public void setUrl(String url) {
                            this.url = url;
                        }
                    }
                }

                public static class MediumCoverEntity {
                    private String uri;
                    /**
                     * url : http://p1.pstatp.com/w202/a000f40e3,9b5230a5
                     */

                    private List<UrlListEntity> url_list;

                    public String getUri() {
                        return uri;
                    }

                    public void setUri(String uri) {
                        this.uri = uri;
                    }

                    public List<UrlListEntity> getUrl_list() {
                        return url_list;
                    }

                    public void setUrl_list(List<UrlListEntity> url_list) {
                        this.url_list = url_list;
                    }

                    public static class UrlListEntity {
                        private String url;

                        public String getUrl() {
                            return url;
                        }

                        public void setUrl(String url) {
                            this.url = url;
                        }
                    }
                }

                public static class OriginVideoEntity {
                    private int height;
                    private String uri;
                    private int width;
                    /**
                     * url : http://i.snssdk.com/neihan/video/playback/?video_id=840aebabb21d4ed7a27dfd5f993f86e3&quality=origin&line=0&is_gif=0
                     */

                    private List<UrlListEntity> url_list;

                    public int getHeight() {
                        return height;
                    }

                    public void setHeight(int height) {
                        this.height = height;
                    }

                    public String getUri() {
                        return uri;
                    }

                    public void setUri(String uri) {
                        this.uri = uri;
                    }

                    public int getWidth() {
                        return width;
                    }

                    public void setWidth(int width) {
                        this.width = width;
                    }

                    public List<UrlListEntity> getUrl_list() {
                        return url_list;
                    }

                    public void setUrl_list(List<UrlListEntity> url_list) {
                        this.url_list = url_list;
                    }

                    public static class UrlListEntity {
                        private String url;

                        public String getUrl() {
                            return url;
                        }

                        public void setUrl(String url) {
                            this.url = url;
                        }
                    }
                }

                public static class UserEntity {
                    private String avatar_url;
                    private boolean is_following;
                    private String name;
                    private long user_id;
                    private boolean user_verified;

                    public String getAvatar_url() {
                        return avatar_url;
                    }

                    public void setAvatar_url(String avatar_url) {
                        this.avatar_url = avatar_url;
                    }

                    public boolean isIs_following() {
                        return is_following;
                    }

                    public void setIs_following(boolean is_following) {
                        this.is_following = is_following;
                    }

                    public String getName() {
                        return name;
                    }

                    public void setName(String name) {
                        this.name = name;
                    }

                    public long getUser_id() {
                        return user_id;
                    }

                    public void setUser_id(long user_id) {
                        this.user_id = user_id;
                    }

                    public boolean isUser_verified() {
                        return user_verified;
                    }

                    public void setUser_verified(boolean user_verified) {
                        this.user_verified = user_verified;
                    }
                }

                public static class DislikeReasonEntity {
                    private long id;
                    private String title;
                    private int type;

                    public long getId() {
                        return id;
                    }

                    public void setId(long id) {
                        this.id = id;
                    }

                    public String getTitle() {
                        return title;
                    }

                    public void setTitle(String title) {
                        this.title = title;
                    }

                    public int getType() {
                        return type;
                    }

                    public void setType(int type) {
                        this.type = type;
                    }
                }
            }
        }
    }
}
