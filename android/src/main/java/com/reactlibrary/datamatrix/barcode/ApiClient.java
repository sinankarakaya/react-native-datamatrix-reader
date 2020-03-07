package com.reactlibrary.datamatrix.barcode;

import com.reactlibrary.datamatrix.CameraActivity;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class ApiClient {

    private static Retrofit retrofit=null;

    public static Retrofit getClient(){
        if(retrofit== null){retrofit = new Retrofit.Builder()
                .baseUrl(CameraActivity.server)
                .addConverterFactory(GsonConverterFactory.create())
                .client(new OkHttpClient())
                .build();
            return retrofit;    }
        return retrofit;
    }
}
