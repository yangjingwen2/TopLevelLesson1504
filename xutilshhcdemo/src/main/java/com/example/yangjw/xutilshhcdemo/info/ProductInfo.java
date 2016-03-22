package com.example.yangjw.xutilshhcdemo.info;

import java.util.List;

/**
 * Created by yangjw on 2016/3/22.
 */
public class ProductInfo {


    /**
     * code : 200
     * data : [{"activate_time":"2016-03-22 07:00:00","adlink":"","areaid":"105103,104105,104104,104106,103105,103101,103102,103107,103103,103104,106101,105100,105102,106103,106102,106104,105104,106105,105101,101101,101102,101103,101105,102102,102103,102101,101104,104103,104102,104101,103106","ass_bannerid":"0","bannerId":"36143","bannerid":"36143","comments":"","expire_time":"2016-03-23 07:00:00","filename":"http://b.appsimg.com/2016/03/21/8523/145857328662.jpg","gomethod":"7","group":"","imgFullPath":"http://b.appsimg.com/2016/03/21/8523/145857328662.jpg","is_preload":"0","isbutton":"0","pictitle":"zoneid=882","resolution":"720*1280","service_provider":"","sex":"0","sfilename":"http://b.appsimg.com/2016/03/21/8523/145857328662_750x400_50.jpg","showtime":"4000","showtype":"1","tag":"HHC-A,HHC-C","target":"0","url":"1784150311","version":"1.5.0,1.7.0,1.6.0,1.6.1,1.5.1,1.5.0","warehouse":"VIP_BJ,VIP_CD,VIP_SH,VIP_NH,VIP_HZ","weight":"7","zone_id":"579"}]
     * msg : OK
     */
    private int code;
    private String msg;
    /**
     * activate_time : 2016-03-22 07:00:00
     * adlink :
     * areaid : 105103,104105,104104,104106,103105,103101,103102,103107,103103,103104,106101,105100,105102,106103,106102,106104,105104,106105,105101,101101,101102,101103,101105,102102,102103,102101,101104,104103,104102,104101,103106
     * ass_bannerid : 0
     * bannerId : 36143
     * bannerid : 36143
     * comments :
     * expire_time : 2016-03-23 07:00:00
     * filename : http://b.appsimg.com/2016/03/21/8523/145857328662.jpg
     * gomethod : 7
     * group :
     * imgFullPath : http://b.appsimg.com/2016/03/21/8523/145857328662.jpg
     * is_preload : 0
     * isbutton : 0
     * pictitle : zoneid=882
     * resolution : 720*1280
     * service_provider :
     * sex : 0
     * sfilename : http://b.appsimg.com/2016/03/21/8523/145857328662_750x400_50.jpg
     * showtime : 4000
     * showtype : 1
     * tag : HHC-A,HHC-C
     * target : 0
     * url : 1784150311
     * version : 1.5.0,1.7.0,1.6.0,1.6.1,1.5.1,1.5.0
     * warehouse : VIP_BJ,VIP_CD,VIP_SH,VIP_NH,VIP_HZ
     * weight : 7
     * zone_id : 579
     */

    private List<DataEntity> data;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public List<DataEntity> getData() {
        return data;
    }

    public void setData(List<DataEntity> data) {
        this.data = data;
    }

    public static class DataEntity {

        private String activate_time;
        private String adlink;
        private String areaid;
        private String ass_bannerid;
        private String bannerId;
        private String bannerid;
        private String comments;
        private String expire_time;
        private String filename;
        private String gomethod;
        private String group;
        private String imgFullPath;
        private String is_preload;
        private String isbutton;
        private String pictitle;
        private String resolution;
        private String service_provider;
        private String sex;
        private String sfilename;
        private String showtime;
        private String showtype;
        private String tag;
        private String target;
        private String url;
        private String version;
        private String warehouse;
        private String weight;
        private String zone_id;

        public String getActivate_time() {
            return activate_time;
        }

        public void setActivate_time(String activate_time) {
            this.activate_time = activate_time;
        }

        public String getAdlink() {
            return adlink;
        }

        public void setAdlink(String adlink) {
            this.adlink = adlink;
        }

        public String getAreaid() {
            return areaid;
        }

        public void setAreaid(String areaid) {
            this.areaid = areaid;
        }

        public String getAss_bannerid() {
            return ass_bannerid;
        }

        public void setAss_bannerid(String ass_bannerid) {
            this.ass_bannerid = ass_bannerid;
        }

        public String getBannerId() {
            return bannerId;
        }

        public void setBannerId(String bannerId) {
            this.bannerId = bannerId;
        }

        public String getBannerid() {
            return bannerid;
        }

        public void setBannerid(String bannerid) {
            this.bannerid = bannerid;
        }

        public String getComments() {
            return comments;
        }

        public void setComments(String comments) {
            this.comments = comments;
        }

        public String getExpire_time() {
            return expire_time;
        }

        public void setExpire_time(String expire_time) {
            this.expire_time = expire_time;
        }

        public String getFilename() {
            return filename;
        }

        public void setFilename(String filename) {
            this.filename = filename;
        }

        public String getGomethod() {
            return gomethod;
        }

        public void setGomethod(String gomethod) {
            this.gomethod = gomethod;
        }

        public String getGroup() {
            return group;
        }

        public void setGroup(String group) {
            this.group = group;
        }

        public String getImgFullPath() {
            return imgFullPath;
        }

        public void setImgFullPath(String imgFullPath) {
            this.imgFullPath = imgFullPath;
        }

        public String getIs_preload() {
            return is_preload;
        }

        public void setIs_preload(String is_preload) {
            this.is_preload = is_preload;
        }

        public String getIsbutton() {
            return isbutton;
        }

        public void setIsbutton(String isbutton) {
            this.isbutton = isbutton;
        }

        public String getPictitle() {
            return pictitle;
        }

        public void setPictitle(String pictitle) {
            this.pictitle = pictitle;
        }

        public String getResolution() {
            return resolution;
        }

        public void setResolution(String resolution) {
            this.resolution = resolution;
        }

        public String getService_provider() {
            return service_provider;
        }

        public void setService_provider(String service_provider) {
            this.service_provider = service_provider;
        }

        public String getSex() {
            return sex;
        }

        public void setSex(String sex) {
            this.sex = sex;
        }

        public String getSfilename() {
            return sfilename;
        }

        public void setSfilename(String sfilename) {
            this.sfilename = sfilename;
        }

        public String getShowtime() {
            return showtime;
        }

        public void setShowtime(String showtime) {
            this.showtime = showtime;
        }

        public String getShowtype() {
            return showtype;
        }

        public void setShowtype(String showtype) {
            this.showtype = showtype;
        }

        public String getTag() {
            return tag;
        }

        public void setTag(String tag) {
            this.tag = tag;
        }

        public String getTarget() {
            return target;
        }

        public void setTarget(String target) {
            this.target = target;
        }

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }

        public String getVersion() {
            return version;
        }

        public void setVersion(String version) {
            this.version = version;
        }

        public String getWarehouse() {
            return warehouse;
        }

        public void setWarehouse(String warehouse) {
            this.warehouse = warehouse;
        }

        public String getWeight() {
            return weight;
        }

        public void setWeight(String weight) {
            this.weight = weight;
        }

        public String getZone_id() {
            return zone_id;
        }

        public void setZone_id(String zone_id) {
            this.zone_id = zone_id;
        }
    }
}
