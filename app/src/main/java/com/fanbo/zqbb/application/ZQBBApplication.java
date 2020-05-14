package com.fanbo.zqbb.application;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Looper;

import com.blankj.utilcode.util.Utils;
import com.fanbo.zqbb.network.DataRepository;
import com.fanbo.zqbb.tools.AppInitManager;
import com.fanbo.zqbb.tools.ZQBBLogUtils;
import com.wanjian.cockroach.Cockroach;
import com.wanjian.cockroach.ExceptionHandler;

import androidx.annotation.NonNull;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.multidex.MultiDex;

/**
 * Created by Eason Time 2020/5/12
 * <p>
 * Describe:
 */
public class ZQBBApplication extends Application implements ViewModelStoreOwner {

    private ViewModelStore mAppViewModelStore;

    @Override
    public void onCreate() {
        super.onCreate();
        mAppViewModelStore = new ViewModelStore();
        AppInitManager.getInstance().initializeApp(this);
    }

    @NonNull
    @Override
    public ViewModelStore getViewModelStore() {
        return mAppViewModelStore;
    }

    @Override
    protected void attachBaseContext(Context base) {
        super.attachBaseContext(base);
        MultiDex.install(base);
    }
}
