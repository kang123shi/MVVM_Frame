package com.fanbo.zqbb.tools;

import android.util.Log;

import com.blankj.utilcode.util.StringUtils;

import com.fanbo.zqbb.application.AppConstant;

/**
 * Created by Eason Time 2020/5/6
 * <p>
 * Describe:
 */
public class ZQBBLogUtils {

    public static boolean isRelesase = false;

    //错误数据
    public static void e(String msg){
        if (isRelesase){
            return;
        }
        if (StringUtils.isEmpty(msg)){
            return;
        }
        Log.e(AppConstant.LOG_KEY,msg);
    }
    //重要数据
    public static void i(String msg){
        if (isRelesase){
            return;
        }
        if (StringUtils.isEmpty(msg)){
            return;
        }
        Log.i(AppConstant.LOG_KEY,msg);
    }
    //无意义日志信息
    public static void v(String msg){
        if (isRelesase){
            return;
        }
        if (StringUtils.isEmpty(msg)){
            return;
        }
        Log.v(AppConstant.LOG_KEY,msg);
    }
    //调试信息
    public static void d(String msg){
        if (isRelesase){
            return;
        }
        if (StringUtils.isEmpty(msg)){
            return;
        }
        Log.d(AppConstant.LOG_KEY,msg);
    }

    public static void w(String msg){
        if (isRelesase){
            return;
        }
        if (StringUtils.isEmpty(msg)){
            return;
        }
        Log.w(AppConstant.LOG_KEY,msg);
    }
}
