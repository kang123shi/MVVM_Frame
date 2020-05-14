package com.fanbo.zqbb.network;

import android.util.Log;

import com.alibaba.fastjson.JSONObject;
import com.fanbo.zqbb.bean.LoginBean;
import com.fanbo.zqbb.tools.ZQBBLogUtils;

import java.util.List;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Created by Eason Time 2020/5/13
 * <p>
 * Describe:
 */
public class DataRepository {
    private static DataRepository instance;
    private static ApiService apiService;

    public static DataRepository getInstance(){
        if (instance==null){
            instance = new DataRepository();
        }
        if (apiService ==null){
            apiService = NetWork.getRetrofit().create(ApiService.class);
        }
        return instance;
    }

     //模拟数据，仅供参考
      public LiveData<LoginBean> getPhoneLoginData(String phone,String pass){
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("password","6E34D68185BE0CDDDF8EBDF45B21D960");
        jsonObject.put("modelCode","866260034738461");
        jsonObject.put("mobileNum",phone);
        jsonObject.put("registerOrg",1);

          final MutableLiveData<LoginBean> phoneData = new MutableLiveData<>();
          apiService.phoneLogin(jsonObject).enqueue(new Callback<LoginBean>() {
              @Override
              public void onResponse(Call<LoginBean> call, Response<LoginBean> response) {
                  phoneData.setValue(response.body());
              }

              @Override
              public void onFailure(Call<LoginBean> call, Throwable t) {
                  ZQBBLogUtils.e(t.getMessage());
              }
          });
          return phoneData;
      }
}
