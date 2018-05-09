package com.example.ducvietho.push;



/**
 * Created by ducvietho on 11/21/2017.
 */

public class PushServiceClient {
    private static PushApi mPushApi;

    public static PushApi getInstance() {
        if (mPushApi == null) {
            mPushApi = ServiceClient.createService(Constants.URL_ENCODE, PushApi.class);
        }
        return mPushApi;
    }
}
