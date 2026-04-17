package U1;

import K1.d;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.SystemClock;
import android.util.Log;
import com.google.android.gms.common.internal.I;
import com.google.android.gms.internal.common.zzi;
import com.google.android.gms.internal.common.zzj;
import com.google.android.gms.internal.common.zzl;
import java.lang.reflect.Method;
import java.util.concurrent.atomic.AtomicBoolean;
import z1.f;
import z1.g;
import z1.h;
import z1.i;

public abstract class a {

    /* renamed from: a  reason: collision with root package name */
    public static final f f3700a = f.f12811b;

    /* renamed from: b  reason: collision with root package name */
    public static final Object f3701b = new Object();

    /* renamed from: c  reason: collision with root package name */
    public static Method f3702c = null;
    public static boolean d = false;

    public static void a(Context context) {
        Context context2;
        Context context3;
        I.h(context, "Context must not be null");
        f3700a.getClass();
        AtomicBoolean atomicBoolean = i.f12814a;
        f fVar = f.f12811b;
        int c3 = fVar.c(context, 11925000);
        if (c3 != 0) {
            Intent a6 = fVar.a(c3, context, "e");
            Log.e("GooglePlayServicesUtil", "GooglePlayServices not available due to error " + c3);
            if (a6 == null) {
                throw new g(c3);
            }
            throw new h(c3);
        }
        long uptimeMillis = SystemClock.uptimeMillis();
        synchronized (f3701b) {
            Context context4 = null;
            if (!d) {
                try {
                    context3 = d.c(context, d.f1449c, "com.google.android.gms.providerinstaller.dynamite").f1457a;
                } catch (K1.a e6) {
                    Log.w("ProviderInstaller", "Failed to load providerinstaller module: ".concat(String.valueOf(e6.getMessage())));
                    context3 = null;
                }
                if (context3 != null) {
                    b(context3, "com.google.android.gms.providerinstaller.ProviderInstallerImpl");
                    return;
                }
            }
            boolean z3 = d;
            try {
                context2 = context.createPackageContext("com.google.android.gms", 3);
            } catch (PackageManager.NameNotFoundException unused) {
                context2 = null;
            }
            if (context2 != null) {
                d = true;
                if (!z3) {
                    try {
                        zzl.zzb("com.google.android.gms.common.security.ProviderInstallerImpl", "reportRequestStats2", context2.getClassLoader(), zzj.zzb(Context.class, context), zzi.zza(uptimeMillis), zzi.zza(SystemClock.uptimeMillis()));
                    } catch (Exception e7) {
                        Log.w("ProviderInstaller", "Failed to report request stats: ".concat(e7.toString()));
                    }
                }
                context4 = context2;
            }
            if (context4 != null) {
                b(context4, "com.google.android.gms.common.security.ProviderInstallerImpl");
            } else {
                Log.e("ProviderInstaller", "Failed to get remote context");
                throw new g(8);
            }
        }
    }

    public static void b(Context context, String str) {
        String str2;
        try {
            if (f3702c == null) {
                f3702c = context.getClassLoader().loadClass(str).getMethod("insertProvider", new Class[]{Context.class});
            }
            f3702c.invoke((Object) null, new Object[]{context});
        } catch (Exception e6) {
            Throwable cause = e6.getCause();
            if (Log.isLoggable("ProviderInstaller", 6)) {
                if (cause == null) {
                    str2 = e6.toString();
                } else {
                    str2 = cause.toString();
                }
                Log.e("ProviderInstaller", "Failed to install provider: ".concat(String.valueOf(str2)));
            }
            throw new g(8);
        }
    }
}
