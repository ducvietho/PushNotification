package com.example.ducvietho.push.notification;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.support.v4.app.NotificationCompat;
import android.util.Log;

import com.example.ducvietho.push.MainActivity;
import com.example.ducvietho.push.R;
import com.google.firebase.messaging.FirebaseMessagingService;
import com.google.firebase.messaging.RemoteMessage;



/**
 * @ducvietho
 */
public class MyFirebaseMessagingService extends FirebaseMessagingService {

    private static final String TAG = "MyGcmListenerService";


    @Override
    public void onMessageReceived(RemoteMessage message) {

        String image = message.getNotification().getIcon();
        String title = message.getNotification().getTitle();
        String text = message.getNotification().getBody();
        String sound = message.getNotification().getSound();
        Intent intent = new Intent(this,MainActivity.class);
        PendingIntent pendingIntent  = PendingIntent.getActivity(this, 0, intent, PendingIntent.FLAG_ONE_SHOT);
        NotificationCompat.Builder notificationBuilder = null;
        notificationBuilder = new NotificationCompat.Builder(this)
                .setSmallIcon(R.mipmap.ic_launcher)
                .setContentTitle(title)
                .setContentText(text)
                .setAutoCancel(true).setContentIntent(pendingIntent)
                .setDefaults(Notification.DEFAULT_LIGHTS | Notification.DEFAULT_VIBRATE);
        if (notificationBuilder != null) {
            NotificationManager notificationManager = (NotificationManager) getSystemService(Context.NOTIFICATION_SERVICE);
            notificationManager.notify(0, notificationBuilder.build());
        } else {
            Log.d(TAG, "");
        }

    }


}
