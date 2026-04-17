package S3;

import I3.e;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.PowerManager;
import android.util.Log;
import java.io.IOException;

public final class H implements Runnable {

    /* renamed from: f  reason: collision with root package name */
    public static final Object f2628f = new Object();

    /* renamed from: p  reason: collision with root package name */
    public static Boolean f2629p;

    /* renamed from: q  reason: collision with root package name */
    public static Boolean f2630q;

    /* renamed from: a  reason: collision with root package name */
    public final Context f2631a;

    /* renamed from: b  reason: collision with root package name */
    public final e f2632b;

    /* renamed from: c  reason: collision with root package name */
    public final PowerManager.WakeLock f2633c;
    public final F d;

    /* renamed from: e  reason: collision with root package name */
    public final long f2634e;

    public H(F f6, Context context, e eVar, long j6) {
        this.d = f6;
        this.f2631a = context;
        this.f2634e = j6;
        this.f2632b = eVar;
        this.f2633c = ((PowerManager) context.getSystemService("power")).newWakeLock(1, "wake:com.google.firebase.messaging");
    }

    public static boolean a(Context context) {
        boolean z3;
        boolean booleanValue;
        synchronized (f2628f) {
            try {
                Boolean bool = f2630q;
                if (bool == null) {
                    z3 = b(context, "android.permission.ACCESS_NETWORK_STATE", bool);
                } else {
                    z3 = bool.booleanValue();
                }
                Boolean valueOf = Boolean.valueOf(z3);
                f2630q = valueOf;
                booleanValue = valueOf.booleanValue();
            } catch (Throwable th) {
                throw th;
            }
        }
        return booleanValue;
    }

    public static boolean b(Context context, String str, Boolean bool) {
        boolean z3;
        if (bool != null) {
            return bool.booleanValue();
        }
        if (context.checkCallingOrSelfPermission(str) == 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (!z3 && Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Missing Permission: " + str + ". This permission should normally be included by the manifest merger, but may needed to be manually added to your manifest");
        }
        return z3;
    }

    public static boolean c(Context context) {
        boolean z3;
        boolean booleanValue;
        synchronized (f2628f) {
            try {
                Boolean bool = f2629p;
                if (bool == null) {
                    z3 = b(context, "android.permission.WAKE_LOCK", bool);
                } else {
                    z3 = bool.booleanValue();
                }
                Boolean valueOf = Boolean.valueOf(z3);
                f2629p = valueOf;
                booleanValue = valueOf.booleanValue();
            } catch (Throwable th) {
                throw th;
            }
        }
        return booleanValue;
    }

    public final synchronized boolean d() {
        NetworkInfo networkInfo;
        boolean z3;
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) this.f2631a.getSystemService("connectivity");
            if (connectivityManager != null) {
                networkInfo = connectivityManager.getActiveNetworkInfo();
            } else {
                networkInfo = null;
            }
            if (networkInfo == null || !networkInfo.isConnected()) {
                z3 = false;
            } else {
                z3 = true;
            }
        } catch (Throwable th) {
            while (true) {
                throw th;
            }
        }
        return z3;
    }

    public final void run() {
        F f6 = this.d;
        Context context = this.f2631a;
        boolean c3 = c(context);
        PowerManager.WakeLock wakeLock = this.f2633c;
        if (c3) {
            wakeLock.acquire(C0145f.f2665a);
        }
        try {
            f6.d(true);
            if (!this.f2632b.e()) {
                f6.d(false);
                if (c(context)) {
                    try {
                        wakeLock.release();
                    } catch (RuntimeException unused) {
                        Log.i("FirebaseMessaging", "TopicsSyncTask's wakelock was already released due to timeout.");
                    }
                }
            } else if (!a(context) || d()) {
                if (f6.e()) {
                    f6.d(false);
                } else {
                    f6.f(this.f2634e);
                }
                if (!c(context)) {
                    return;
                }
                try {
                    wakeLock.release();
                } catch (RuntimeException unused2) {
                    Log.i("FirebaseMessaging", "TopicsSyncTask's wakelock was already released due to timeout.");
                }
            } else {
                new G(this, this).a();
                if (c(context)) {
                    try {
                        wakeLock.release();
                    } catch (RuntimeException unused3) {
                        Log.i("FirebaseMessaging", "TopicsSyncTask's wakelock was already released due to timeout.");
                    }
                }
            }
        } catch (IOException e6) {
            Log.e("FirebaseMessaging", "Failed to sync topics. Won't retry sync. " + e6.getMessage());
            f6.d(false);
            if (!c(context)) {
            }
        } catch (Throwable th) {
            if (c(context)) {
                try {
                    wakeLock.release();
                } catch (RuntimeException unused4) {
                    Log.i("FirebaseMessaging", "TopicsSyncTask's wakelock was already released due to timeout.");
                }
            }
            throw th;
        }
    }
}
