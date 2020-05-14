package com.fanbo.zqbb.network;

import com.alibaba.fastjson.JSONObject;
import com.fanbo.zqbb.bean.LoginBean;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Headers;
import retrofit2.http.POST;

/**
 * Created by Eason Time 2020/5/13
 * <p>
 * Describe:
 */
public interface ApiService {

    @Headers({"Content-Type: application/json","Accept: application/json"})
    @POST(API.PHONE_Login)
    Call<LoginBean> phoneLogin(@Body JSONObject parmas);
}
