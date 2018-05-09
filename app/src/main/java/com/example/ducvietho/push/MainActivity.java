package com.example.ducvietho.push;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import com.google.firebase.iid.FirebaseInstanceId;

import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.observers.DisposableObserver;
import io.reactivex.schedulers.Schedulers;

import static com.example.ducvietho.push.R.layout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(layout.activity_main);
       // FirebaseApp.initializeApp(MainActivity.this);
        Log.i("Token ", "token"+ FirebaseInstanceId.getInstance().getToken());
        pushNotification();
    }
    public void pushNotification(){
        CompositeDisposable compositeDisposable = new CompositeDisposable();
        PushApi api = PushServiceClient.getInstance();
        String key = "key="+Constants.SERVER_KEY;
        Notifi notifi = new Notifi("Hello","Push Notification");
        compositeDisposable.add(api.pushNotification(key,"application/json",new BodyRequest(Constants.TOKEN_FIREBASE,
                notifi)).subscribeOn(Schedulers.newThread()).observeOn(AndroidSchedulers.mainThread()).subscribeWith
                (new DisposableObserver<Void>() {
                    @Override
                    public void onNext(Void value) {

                    }

                    @Override
                    public void onError(Throwable e) {

                    }

                    @Override
                    public void onComplete() {

                    }
                }));
    }
}
