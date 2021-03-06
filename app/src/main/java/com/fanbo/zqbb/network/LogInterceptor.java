package com.fanbo.zqbb.network;
import com.fanbo.zqbb.tools.ZQBBLogUtils;
import java.io.IOException;

import okhttp3.Interceptor;
import okhttp3.MediaType;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.ResponseBody;
import okio.Buffer;

/**
 * Created by Eason Time 2020/5/4
 * <p>
 * Describe:
 */
public class LogInterceptor implements Interceptor {
    @Override
    public Response intercept(Chain chain) throws IOException {
        Request request = chain.request();
        ZQBBLogUtils.i(String.format("%1$s->%2$s",request.method(),request.url()));
        if(request.headers()!=null){
            ZQBBLogUtils.i(request.headers().toString());
        }
        if(request.body()!=null){
            ZQBBLogUtils.i("RequestBody:---" + bodyToString(request.body()));
        }
        Response response = chain.proceed(chain.request());
        MediaType mediaType = response.body().contentType();
        String responseBody = response.body().string();
        ZQBBLogUtils.i("ResponseBody:---" + responseBody);

        return response.newBuilder()
                .body(ResponseBody.create(mediaType, responseBody))
                .build();
    }

    private String bodyToString(final RequestBody request) {
        if(request!=null){
            try {
                final RequestBody copy = request;
                final Buffer buffer = new Buffer();
                copy.writeTo(buffer);
                return buffer.readUtf8();
            } catch (final IOException e) {
                ZQBBLogUtils.e(e.toString());
            }
        }
        return null;
    }
}
