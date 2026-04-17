package z1;

import I1.c;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.util.Log;
import java.util.concurrent.atomic.AtomicBoolean;

public abstract class i {

    /* renamed from: a  reason: collision with root package name */
    public static final AtomicBoolean f12814a = new AtomicBoolean();

    /* renamed from: b  reason: collision with root package name */
    public static boolean f12815b = false;

    /* renamed from: c  reason: collision with root package name */
    public static boolean f12816c = false;
    public static final AtomicBoolean d = new AtomicBoolean();

    /* renamed from: e  reason: collision with root package name */
    public static final /* synthetic */ int f12817e = 0;

    public static boolean a(Context context) {
        if (!f12816c) {
            try {
                PackageInfo i2 = c.a(context).i(64, "com.google.android.gms");
                j.b(context);
                if (i2 == null || j.e(i2, false) || !j.e(i2, true)) {
                    f12815b = false;
                } else {
                    f12815b = true;
                }
                f12816c = true;
            } catch (PackageManager.NameNotFoundException e6) {
                Log.w("GooglePlayServicesUtil", "Cannot find Google Play services package name.", e6);
                f12816c = true;
            } catch (Throwable th) {
                f12816c = true;
                throw th;
            }
        }
        if (f12815b || !"user".equals(Build.TYPE)) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean b(android.content.Context r4) {
        /*
            r0 = 0
            android.content.pm.PackageManager r1 = r4.getPackageManager()     // Catch:{ Exception -> 0x0038 }
            android.content.pm.PackageInstaller r1 = r1.getPackageInstaller()     // Catch:{ Exception -> 0x0038 }
            java.util.List r1 = r1.getAllSessions()     // Catch:{ Exception -> 0x0038 }
            java.util.Iterator r1 = r1.iterator()
        L_0x0011:
            boolean r2 = r1.hasNext()
            java.lang.String r3 = "com.google.android.gms"
            if (r2 == 0) goto L_0x002b
            java.lang.Object r2 = r1.next()
            android.content.pm.PackageInstaller$SessionInfo r2 = (android.content.pm.PackageInstaller.SessionInfo) r2
            java.lang.String r2 = r2.getAppPackageName()
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L_0x0011
            r4 = 1
            return r4
        L_0x002b:
            android.content.pm.PackageManager r4 = r4.getPackageManager()
            r1 = 8192(0x2000, float:1.14794E-41)
            android.content.pm.ApplicationInfo r4 = r4.getApplicationInfo(r3, r1)     // Catch:{  }
            boolean r4 = r4.enabled     // Catch:{  }
            return r4
        L_0x0038:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: z1.i.b(android.content.Context):boolean");
    }
}
