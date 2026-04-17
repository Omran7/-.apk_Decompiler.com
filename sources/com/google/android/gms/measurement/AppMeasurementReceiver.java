package com.google.android.gms.measurement;

import T1.A;
import T1.C0212u0;
import T1.Z;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.PowerManager;
import android.util.SparseArray;
import b0.C0311a;
import com.google.android.gms.internal.measurement.zzdh;

public final class AppMeasurementReceiver extends C0311a {

    /* renamed from: c  reason: collision with root package name */
    public A f6264c;

    public final void onReceive(Context context, Intent intent) {
        if (this.f6264c == null) {
            this.f6264c = new A((Object) this, 1);
        }
        A a6 = this.f6264c;
        a6.getClass();
        Z z3 = C0212u0.q(context, (zzdh) null, (Long) null).f3496r;
        C0212u0.k(z3);
        if (intent == null) {
            z3.f3175r.a("Receiver called with null intent");
            return;
        }
        String action = intent.getAction();
        z3.f3180w.b(action, "Local receiver got");
        if ("com.google.android.gms.measurement.UPLOAD".equals(action)) {
            Intent className = new Intent().setClassName(context, "com.google.android.gms.measurement.AppMeasurementService");
            className.setAction("com.google.android.gms.measurement.UPLOAD");
            z3.f3180w.a("Starting wakeful intent.");
            ((AppMeasurementReceiver) a6.f2796b).getClass();
            SparseArray sparseArray = C0311a.f5448a;
            synchronized (sparseArray) {
                try {
                    int i2 = C0311a.f5449b;
                    int i5 = i2 + 1;
                    C0311a.f5449b = i5;
                    if (i5 <= 0) {
                        C0311a.f5449b = 1;
                    }
                    className.putExtra("androidx.contentpager.content.wakelockid", i2);
                    ComponentName startService = context.startService(className);
                    if (startService != null) {
                        PowerManager.WakeLock newWakeLock = ((PowerManager) context.getSystemService("power")).newWakeLock(1, "androidx.core:wake:" + startService.flattenToShortString());
                        newWakeLock.setReferenceCounted(false);
                        newWakeLock.acquire(60000);
                        sparseArray.put(i2, newWakeLock);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        } else if ("com.android.vending.INSTALL_REFERRER".equals(action)) {
            z3.f3175r.a("Install Referrer Broadcasts are deprecated");
        }
    }
}
