package com.fanbo.zqbb.tools;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.os.Looper;

import com.blankj.utilcode.util.ActivityUtils;
import com.blankj.utilcode.util.Utils;
import com.fanbo.zqbb.application.ZQBBApplication;
import com.wanjian.cockroach.Cockroach;
import com.wanjian.cockroach.ExceptionHandler;


import androidx.lifecycle.ViewModelProvider;

/**
 * Created by Eason Time 2020/5/14
 * <p>
 * Describe:
 */
public class AppInitManager {

    private static AppInitManager mInstance;

    private boolean mIsInitialized;
    private ViewModelProvider.Factory mFactory;
    public static AppInitManager getInstance() {
        if (mInstance == null) {
            mInstance = new AppInitManager();
        }
        return mInstance;
    }

    public static void destroy() {
        if (null != mInstance) {
            mInstance = null;
        }
    }

    public void initializeApp(ZQBBApplication application){
        if (mIsInitialized) return;
        //1.标志位
        mIsInitialized = true;

        new Thread(){
            @Override
            public void run() {
                super.run();
                //这个是崩溃拦截
                CockroachInstall(application.getApplicationContext());
                //通用工具初始化
                Utils.init(application);
            }
        }.start();
    }

    private void CockroachInstall(Context context) {
        final Thread.UncaughtExceptionHandler sysExcepHandler = Thread.getDefaultUncaughtExceptionHandler();
        Cockroach.install(context, new ExceptionHandler() {
            @Override
            protected void onUncaughtExceptionHappened(Thread thread, Throwable throwable) {
                ZQBBLogUtils.e("--->onUncaughtExceptionHappened:-------"+throwable.getMessage());
            }

            @Override
            protected void onBandageExceptionHappened(Throwable throwable) {

            }

            @Override
            protected void onEnterSafeMode() {

            }

            @Override
            protected void onMayBeBlackScreen(Throwable e) {
                //黑屏时建议直接杀死app
                Thread thread = Looper.getMainLooper().getThread();
                sysExcepHandler.uncaughtException(thread, new RuntimeException(e.getMessage()));
            }
        });
    }

    //这个是用于fragment直接互相通讯
//    public ViewModelProvider getAppViewModelProvider(Activity activity) {
//        return new ViewModelProvider((ZQBBApplication) activity.getApplicationContext(),
//                ((ZQBBApplication) activity.getApplicationContext()).getAppFactory(activity));
//    }
//
//    private ViewModelProvider.Factory getAppFactory(Activity activity) {
//        Application application = checkApplication(activity);
//        if (mFactory == null) {
//            mFactory = ViewModelProvider.AndroidViewModelFactory.getInstance(application);
//        }
//        return mFactory;
//    }
//
//    private Application checkApplication(Activity activity) {
//        Application application = activity.getApplication();
//        if (application == null) {
//            throw new IllegalStateException("Your activity/fragment is not yet attached to "
//                    + "Application. You can't request ViewModel before onCreate call.");
//        }
//        return application;
//    }
}
