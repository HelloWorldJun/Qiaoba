package com.xiaoxiao.qiaobademo.app;

import android.app.Application;

import com.xiaoxiao.qiaoba.interpreter.Qiaoba;

/**
 * Created by wangfei on 2016/12/21.
 */

public class MyApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        Qiaoba.init(getApplicationContext());
    }
}
