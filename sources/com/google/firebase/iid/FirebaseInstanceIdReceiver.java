package com.google.firebase.iid;

import H1.a;
import T1.Z0;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import com.bumptech.glide.c;
import com.google.android.gms.internal.cloudmessaging.zze;
import java.lang.ref.SoftReference;
import java.util.Objects;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public final class FirebaseInstanceIdReceiver extends BroadcastReceiver {

    /* renamed from: a  reason: collision with root package name */
    public static SoftReference f6898a;

    /* renamed from: b  reason: collision with root package name */
    public static SoftReference f6899b;

    public static int a(Intent intent) {
        PendingIntent pendingIntent = (PendingIntent) intent.getParcelableExtra("pending_intent");
        if (pendingIntent != null) {
            try {
                pendingIntent.send();
            } catch (PendingIntent.CanceledException unused) {
                Log.e("CloudMessagingReceiver", "Notification pending intent canceled");
            }
        }
        Bundle extras = intent.getExtras();
        if (extras != null) {
            extras.remove("pending_intent");
        } else {
            extras = new Bundle();
        }
        if (Objects.equals(intent.getAction(), "com.google.firebase.messaging.NOTIFICATION_DISMISS")) {
            Intent putExtras = new Intent("com.google.firebase.messaging.NOTIFICATION_DISMISS").putExtras(extras);
            if (!c.p0(putExtras)) {
                return -1;
            }
            c.d0(putExtras.getExtras(), "_nd");
            return -1;
        }
        Log.e("CloudMessagingReceiver", "Unknown notification action");
        return 500;
    }

    public final void onReceive(Context context, Intent intent) {
        ExecutorService executorService;
        ExecutorService executorService2;
        if (intent != null) {
            boolean isOrderedBroadcast = isOrderedBroadcast();
            BroadcastReceiver.PendingResult goAsync = goAsync();
            synchronized (FirebaseInstanceIdReceiver.class) {
                try {
                    SoftReference softReference = f6898a;
                    if (softReference != null) {
                        executorService = (ExecutorService) softReference.get();
                    } else {
                        executorService = null;
                    }
                    if (executorService == null) {
                        zze.zza();
                        executorService = Executors.unconfigurableExecutorService(Executors.newCachedThreadPool(new a("firebase-iid-executor")));
                        f6898a = new SoftReference(executorService);
                    }
                    executorService2 = executorService;
                } catch (Throwable th) {
                    while (true) {
                        throw th;
                    }
                }
            }
            executorService2.execute(new Z0(this, intent, context, isOrderedBroadcast, goAsync));
        }
    }
}
