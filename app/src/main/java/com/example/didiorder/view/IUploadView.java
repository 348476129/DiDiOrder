package com.example.didiorder.view;

import android.content.Intent;
import android.net.Uri;

import com.example.didiorder.bean.Dishes;
import com.example.didiorder.bean.User;

/**
 * Created by qqq34 on 2016/1/19.
 */
public interface IUploadView {
    void startCutActivity(Intent intent);
    void setImageUri(Uri uri);
    void showLoading();
    void hideLoading();
    void setViewEnable(boolean isHide);
    void toMainActivity(Dishes dishes);
    void showFailedError(String s);
}
