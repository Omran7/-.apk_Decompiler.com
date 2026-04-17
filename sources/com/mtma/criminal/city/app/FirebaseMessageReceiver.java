package com.mtma.criminal.city.app;

import S3.x;
import Y0.a;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.os.Build;
import android.preference.PreferenceManager;
import com.bumptech.glide.d;
import com.google.firebase.messaging.FirebaseMessagingService;
import com.mtma.criminal.city.activities.MainActivity;
import com.mtma.criminal.city.activities.StartActivity;
import n.e;
import n.j;
import z.q;

public class FirebaseMessageReceiver extends FirebaseMessagingService {
    public final void c(x xVar) {
        Intent intent;
        String str;
        String str2;
        if (PreferenceManager.getDefaultSharedPreferences(MyApplication.f7090a.getApplicationContext()).getBoolean("notifications_alert", true) && !d.f5753b && !((j) xVar.v()).isEmpty()) {
            int parseInt = Integer.parseInt((String) ((e) xVar.v()).get("notificationId"));
            String str3 = (String) ((e) xVar.v()).get("title");
            String str4 = (String) ((e) xVar.v()).get("message");
            if (d.f5754c) {
                intent = new Intent(this, MainActivity.class);
                intent.addFlags(67239936);
            } else {
                intent = new Intent(this, StartActivity.class);
                intent.addFlags(335544320);
            }
            PendingIntent activity = PendingIntent.getActivity(this, 0, intent, 1140850688);
            String str5 = "flight_notification_channel";
            if (Build.VERSION.SDK_INT >= 26) {
                a.j();
                if (parseInt == 101) {
                    str = str5;
                } else if (parseInt != 102) {
                    str = "";
                } else {
                    str = "hospital_notification_channel";
                }
                if (parseInt == 101) {
                    str2 = "Flight Notifications";
                } else if (parseInt != 102) {
                    str2 = "";
                } else {
                    str2 = "Hospital Notifications";
                }
                NotificationChannel d = a.d(str, str2);
                NotificationManager notificationManager = (NotificationManager) getSystemService(NotificationManager.class);
                if (notificationManager != null) {
                    notificationManager.createNotificationChannel(d);
                }
            }
            if (parseInt != 101) {
                if (parseInt != 102) {
                    str5 = "";
                } else {
                    str5 = "hospital_notification_channel";
                }
            }
            q qVar = new q(this, str5);
            qVar.f12783s.icon = 2131166576;
            qVar.f12771e = q.b(str3);
            qVar.f12772f = q.b(str4);
            qVar.c(true);
            qVar.g = activity;
            qVar.f12774j = 1;
            NotificationManager notificationManager2 = (NotificationManager) getSystemService("notification");
            if (notificationManager2 != null) {
                notificationManager2.notify(parseInt, qVar.a());
            }
        }
    }

    public final void d() {
        d.X0("notification_token_need_update", true);
        K1.e.p0();
    }
}
