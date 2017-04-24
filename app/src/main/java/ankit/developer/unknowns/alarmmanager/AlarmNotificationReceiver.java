package ankit.developer.unknowns.alarmmanager;

import android.app.Notification;
import android.app.NotificationManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.support.v4.app.NotificationCompat;

/**
 * Created by ankitsharma on 4/24/2017.
 */

public class AlarmNotificationReceiver extends BroadcastReceiver {
    public void onReceive(Context context, Intent intent) {

        NotificationCompat.Builder builder = new NotificationCompat.Builder(context);



        builder.setAutoCancel(true)

                .setDefaults(Notification.DEFAULT_ALL)

                .setWhen(System.currentTimeMillis())

                .setSmallIcon(R.mipmap.ic_launcher)

                .setContentTitle("Alarm actived!")

                .setContentText("THIS IS MY ALARM")

                .setDefaults(Notification.DEFAULT_LIGHTS | Notification.DEFAULT_SOUND)

                .setContentInfo("Info");



        NotificationManager notificationManager = (NotificationManager)context.getSystemService(Context.NOTIFICATION_SERVICE);

        notificationManager.notify(1,builder.build());

    }
}
