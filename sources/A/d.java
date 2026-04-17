package A;

import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Handler;

public abstract class d {
    public static Intent a(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter, String str, Handler handler, int i2) {
        if ((i2 & 4) != 0 && str == null) {
            return context.registerReceiver(broadcastReceiver, intentFilter, h.obtainAndCheckReceiverPermission(context), handler);
        }
        return context.registerReceiver(broadcastReceiver, intentFilter, str, handler, i2 & 1);
    }

    public static ComponentName b(Context context, Intent intent) {
        return context.startForegroundService(intent);
    }
}
