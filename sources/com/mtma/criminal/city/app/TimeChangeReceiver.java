package com.mtma.criminal.city.app;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.bumptech.glide.c;
import com.mtma.criminal.city.activities.StartActivity;

public class TimeChangeReceiver extends BroadcastReceiver {
    public final void onReceive(Context context, Intent intent) {
        String action = intent.getAction();
        if (action != null) {
            char c3 = 65535;
            switch (action.hashCode()) {
                case 502473491:
                    if (action.equals("android.intent.action.TIMEZONE_CHANGED")) {
                        c3 = 0;
                        break;
                    }
                    break;
                case 505380757:
                    if (action.equals("android.intent.action.TIME_SET")) {
                        c3 = 1;
                        break;
                    }
                    break;
                case 1041332296:
                    if (action.equals("android.intent.action.DATE_CHANGED")) {
                        c3 = 2;
                        break;
                    }
                    break;
            }
            switch (c3) {
                case 0:
                case 1:
                case 2:
                    c.B0();
                    c.f5750u = true;
                    Intent intent2 = new Intent(context, StartActivity.class);
                    intent2.addFlags(268468224);
                    context.startActivity(intent2);
                    return;
                default:
                    return;
            }
        }
    }
}
