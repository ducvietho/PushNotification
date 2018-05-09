package com.example.ducvietho.push;

import io.reactivex.Observable;
import retrofit2.http.Body;
import retrofit2.http.Header;
import retrofit2.http.Headers;
import retrofit2.http.POST;

/**
 * Created by ducvietho on 09/05/2018.
 */

public interface PushApi {
    @POST("fcm/send")
    Observable<Void> pushNotification(@Header("Authorization") String auth, @Header("Content-Type") String type,
                                      @Body BodyRequest bodyRequest);

}
