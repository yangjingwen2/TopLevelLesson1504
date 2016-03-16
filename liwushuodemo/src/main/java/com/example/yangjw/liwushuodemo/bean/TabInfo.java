package com.example.yangjw.liwushuodemo.bean;

import java.util.List;

/**
 * Created by yangjw on 2016/3/16.
 */
public class TabInfo {


    /**
     * code : 200
     * data : {"candidates":[{"editable":true,"id":129,"name":"海淘"},{"editable":true,"id":120,"name":"涨姿势"},{"editable":true,"id":125,"name":"创意生活"},{"editable":true,"id":31,"name":"纪念日"},{"editable":true,"id":118,"name":"美食"},{"editable":true,"id":30,"name":"生日"},{"editable":true,"id":121,"name":"数码"},{"editable":true,"id":123,"name":"爱运动"},{"editable":true,"id":28,"name":"科技范"},{"editable":true,"id":112,"name":"家居"},{"editable":true,"id":127,"name":"设计感"},{"editable":true,"id":111,"name":"礼物"},{"editable":true,"id":26,"name":"送基友"},{"editable":true,"id":6,"name":"送爸妈"},{"editable":true,"id":122,"name":"爱动漫"},{"editable":true,"id":10,"name":"送女票"}],"channels":[{"editable":false,"id":101,"name":"精选"},{"editable":true,"id":129,"name":"海淘"},{"editable":true,"id":120,"name":"涨姿势"},{"editable":true,"id":125,"name":"创意生活"},{"editable":true,"id":31,"name":"纪念日"},{"editable":true,"id":118,"name":"美食"},{"editable":true,"id":30,"name":"生日"},{"editable":true,"id":121,"name":"数码"},{"editable":true,"id":123,"name":"爱运动"},{"editable":true,"id":28,"name":"科技范"},{"editable":true,"id":112,"name":"家居"},{"editable":true,"id":127,"name":"设计感"},{"editable":true,"id":111,"name":"礼物"},{"editable":true,"id":26,"name":"送基友"},{"editable":true,"id":6,"name":"送爸妈"},{"editable":true,"id":122,"name":"爱动漫"},{"editable":true,"id":10,"name":"送女票"}]}
     * message : OK
     */

    private int code;
    private DataEntity data;
    private String message;

    public void setCode(int code) {
        this.code = code;
    }

    public void setData(DataEntity data) {
        this.data = data;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public int getCode() {
        return code;
    }

    public DataEntity getData() {
        return data;
    }

    public String getMessage() {
        return message;
    }

    public static class DataEntity {
        /**
         * editable : true
         * id : 129
         * name : 海淘
         */

        private List<CandidatesEntity> candidates;
        /**
         * editable : false
         * id : 101
         * name : 精选
         */

        private List<ChannelsEntity> channels;

        public void setCandidates(List<CandidatesEntity> candidates) {
            this.candidates = candidates;
        }

        public void setChannels(List<ChannelsEntity> channels) {
            this.channels = channels;
        }

        public List<CandidatesEntity> getCandidates() {
            return candidates;
        }

        public List<ChannelsEntity> getChannels() {
            return channels;
        }

        public static class CandidatesEntity {
            private boolean editable;
            private int id;
            private String name;

            public void setEditable(boolean editable) {
                this.editable = editable;
            }

            public void setId(int id) {
                this.id = id;
            }

            public void setName(String name) {
                this.name = name;
            }

            public boolean isEditable() {
                return editable;
            }

            public int getId() {
                return id;
            }

            public String getName() {
                return name;
            }
        }

        public static class ChannelsEntity {
            private boolean editable;
            private int id;
            private String name;

            public void setEditable(boolean editable) {
                this.editable = editable;
            }

            public void setId(int id) {
                this.id = id;
            }

            public void setName(String name) {
                this.name = name;
            }

            public boolean isEditable() {
                return editable;
            }

            public int getId() {
                return id;
            }

            public String getName() {
                return name;
            }
        }
    }
}
