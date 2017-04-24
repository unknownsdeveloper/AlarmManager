package ankit.developer.unknowns.alarmmanager;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

/**
 * Created by ankitsharma on 4/24/2017.
 */

public class AlarmToastReceiver  extends BroadcastReceiver {
    public void onReceive(Context context, Intent intent) {

        Toast.makeText(context,"THIS IS MY ALARM",Toast.LENGTH_LONG).show();

    }
}
