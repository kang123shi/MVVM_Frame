package com.fanbo.zqbb.view;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import androidx.lifecycle.OnLifecycleEvent;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Toast;

import com.blankj.utilcode.util.ActivityUtils;
import com.blankj.utilcode.util.ToastUtils;
import com.fanbo.zqbb.BR;
import com.fanbo.zqbb.R;
import com.fanbo.zqbb.baseclass.BaseActivity;
import com.fanbo.zqbb.baseclass.DataBindingConfig;
import com.fanbo.zqbb.bean.LoginBean;
import com.fanbo.zqbb.tools.ZQBBLogUtils;
import com.fanbo.zqbb.viewmodel.DemoViewModel;

import java.util.List;

public class DemoActivity extends BaseActivity  {

    DemoViewModel mDemoViewModel;
    @Override
    protected void initViewModel() {
        mDemoViewModel = getActivityViewModel(DemoViewModel.class);
    }

    @Override
    protected DataBindingConfig getDataBindingConfig() {
        return new DataBindingConfig(R.layout.activity_demo,mDemoViewModel)
                   .addBindingParam(BR.clickdemo,new ClickDemo());
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mDemoViewModel.userID.set("测试");
    }

    public class ClickDemo{
         public void test(){
             String phone = "13148897593";
             String pass="123456";

             List<Activity> activities =ActivityUtils.getActivityList();

             for (int i = 0; i <activities.size(); i++) {
                 ZQBBLogUtils.v(activities.get(i).getLocalClassName());
             }
             mDemoViewModel.getPhoneLogin(phone,pass).observe(DemoActivity.this, new Observer<LoginBean>() {
                 @Override
                 public void onChanged(LoginBean loginBean) {
                     if (loginBean!=null){
                         if (loginBean.getResult().getResultCode().equals("8888")){
                             mDemoViewModel.userID.set("8888");
                         }
                     }
                 }
             });
         }
    }


}



