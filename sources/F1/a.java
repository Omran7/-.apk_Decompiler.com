package F1;

import I1.c;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.PackageManager;
import android.os.Build;
import android.util.Log;
import com.google.android.gms.common.internal.I;
import com.google.android.gms.common.internal.S;
import java.util.NoSuchElementException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;

public final class a {

    /* renamed from: b  reason: collision with root package name */
    public static final Object f726b = new Object();

    /* renamed from: c  reason: collision with root package name */
    public static volatile a f727c;

    /* renamed from: a  reason: collision with root package name */
    public final ConcurrentHashMap f728a = new ConcurrentHashMap();

    public static a b() {
        if (f727c == null) {
            synchronized (f726b) {
                try {
                    if (f727c == null) {
                        f727c = new a();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        a aVar = f727c;
        I.g(aVar);
        return aVar;
    }

    public final boolean a(Context context, Intent intent, ServiceConnection serviceConnection, int i2) {
        return d(context, context.getClass().getName(), intent, serviceConnection, i2, (Executor) null);
    }

    public final void c(Context context, ServiceConnection serviceConnection) {
        if (!(serviceConnection instanceof S)) {
            ConcurrentHashMap concurrentHashMap = this.f728a;
            if (concurrentHashMap.containsKey(serviceConnection)) {
                try {
                    try {
                        context.unbindService((ServiceConnection) concurrentHashMap.get(serviceConnection));
                    } catch (IllegalArgumentException | IllegalStateException | NoSuchElementException unused) {
                    }
                    return;
                } finally {
                    concurrentHashMap.remove(serviceConnection);
                }
            }
        }
        try {
            context.unbindService(serviceConnection);
        } catch (IllegalArgumentException | IllegalStateException | NoSuchElementException unused2) {
        }
    }

    public final boolean d(Context context, String str, Intent intent, ServiceConnection serviceConnection, int i2, Executor executor) {
        boolean z3;
        ComponentName component = intent.getComponent();
        if (component != null) {
            String packageName = component.getPackageName();
            "com.google.android.gms".equals(packageName);
            try {
                if ((c.a(context).h(0, packageName).flags & 2097152) != 0) {
                    Log.w("ConnectionTracker", "Attempted to bind to a service in a STOPPED package.");
                    return false;
                }
            } catch (PackageManager.NameNotFoundException unused) {
            }
        }
        if (!(serviceConnection instanceof S)) {
            ConcurrentHashMap concurrentHashMap = this.f728a;
            ServiceConnection serviceConnection2 = (ServiceConnection) concurrentHashMap.putIfAbsent(serviceConnection, serviceConnection);
            if (!(serviceConnection2 == null || serviceConnection == serviceConnection2)) {
                Log.w("ConnectionTracker", String.format("Duplicate binding with the same ServiceConnection: %s, %s, %s.", new Object[]{serviceConnection, str, intent.getAction()}));
            }
            if (executor == null) {
                executor = null;
            }
            try {
                if (Build.VERSION.SDK_INT < 29 || executor == null) {
                    z3 = context.bindService(intent, serviceConnection, i2);
                } else {
                    z3 = context.bindService(intent, i2, executor, serviceConnection);
                }
                if (z3) {
                    return z3;
                }
                return false;
            } finally {
                concurrentHashMap.remove(serviceConnection, serviceConnection);
            }
        } else {
            if (executor == null) {
                executor = null;
            }
            if (Build.VERSION.SDK_INT < 29 || executor == null) {
                return context.bindService(intent, serviceConnection, i2);
            }
            return context.bindService(intent, i2, executor, serviceConnection);
        }
    }
}
