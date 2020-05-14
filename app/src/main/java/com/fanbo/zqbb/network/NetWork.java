package com.fanbo.zqbb.network;

import java.util.concurrent.TimeUnit;

import okhttp3.OkHttpClient;
import retrofit2.Converter;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by Eason Time 2020/5/6
 * <p>
 * Describe:
 */
public class NetWork {

    private static final Converter.Factory gsonConverterFactory = GsonConverterFactory.create();

    private static final String baseUrl = API.QMTK_API;

    private static Retrofit retrofit;
    //请求超时为15秒
    private static final int TIME_OUT =15;

    public static Retrofit getRetrofit() {

        OkHttpClient client = new OkHttpClient.Builder()
                .connectTimeout(TIME_OUT,TimeUnit.SECONDS)
                .writeTimeout(TIME_OUT, TimeUnit.SECONDS)
                .readTimeout(TIME_OUT, TimeUnit.SECONDS)
                .addInterceptor(new LogInterceptor())
                .build();

        if (retrofit ==null){
            retrofit = new Retrofit.Builder()
                    .client(client)
                    .baseUrl(baseUrl)
                    .addConverterFactory(gsonConverterFactory)
                    .build();
        }
        return retrofit;
    }

}
