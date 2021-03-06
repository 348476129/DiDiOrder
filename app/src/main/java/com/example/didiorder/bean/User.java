package com.example.didiorder.bean;

import cn.bmob.v3.BmobUser;

/**
 * Created by qqq34 on 2016/1/11.
 */
public class User extends BmobUser {  //定义一个实体类 用来储存登录数据
    private String job;  // 1代表厨师 2代表服务员
    private String name;
    private String user_image_url;
    public String getUser_image_url() {
        return user_image_url;
    }

    public void setUser_image_url(String user_image_url) {
        this.user_image_url = user_image_url;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }
}
