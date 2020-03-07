package com.reactlibrary.datamatrix.barcode;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

public interface RestInterfaces {

    @FormUrlEncoded
    @POST("eczanet/qrcodeController")
    Call<BarcodeResponse> sendBarcodeList(@Field("qrcodes") String qrcodes);


}
