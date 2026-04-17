package z;

import android.os.Handler;
import android.os.Looper;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* renamed from: z.d  reason: case insensitive filesystem */
public abstract class C1124d {

    /* renamed from: a  reason: collision with root package name */
    public static final Class f12752a;

    /* renamed from: b  reason: collision with root package name */
    public static final Field f12753b;

    /* renamed from: c  reason: collision with root package name */
    public static final Field f12754c;
    public static final Method d;

    /* renamed from: e  reason: collision with root package name */
    public static final Method f12755e;

    /* renamed from: f  reason: collision with root package name */
    public static final Method f12756f;
    public static final Handler g = new Handler(Looper.getMainLooper());

    /* JADX WARNING: Removed duplicated region for block: B:25:0x0054 A[SYNTHETIC, Splitter:B:25:0x0054] */
    static {
        /*
            java.lang.Class<android.app.Activity> r0 = android.app.Activity.class
            android.os.Handler r1 = new android.os.Handler
            android.os.Looper r2 = android.os.Looper.getMainLooper()
            r1.<init>(r2)
            g = r1
            r1 = 0
            java.lang.String r2 = "android.app.ActivityThread"
            java.lang.Class r2 = java.lang.Class.forName(r2)     // Catch:{ all -> 0x0015 }
            goto L_0x0016
        L_0x0015:
            r2 = r1
        L_0x0016:
            f12752a = r2
            r2 = 1
            java.lang.String r3 = "mMainThread"
            java.lang.reflect.Field r3 = r0.getDeclaredField(r3)     // Catch:{ all -> 0x0023 }
            r3.setAccessible(r2)     // Catch:{ all -> 0x0023 }
            goto L_0x0024
        L_0x0023:
            r3 = r1
        L_0x0024:
            f12753b = r3
            java.lang.String r3 = "mToken"
            java.lang.reflect.Field r0 = r0.getDeclaredField(r3)     // Catch:{ all -> 0x0030 }
            r0.setAccessible(r2)     // Catch:{ all -> 0x0030 }
            goto L_0x0031
        L_0x0030:
            r0 = r1
        L_0x0031:
            f12754c = r0
            java.lang.Class r0 = f12752a
            java.lang.Class<android.os.IBinder> r3 = android.os.IBinder.class
            java.lang.String r4 = "performStopActivity"
            if (r0 != 0) goto L_0x003d
        L_0x003b:
            r0 = r1
            goto L_0x004c
        L_0x003d:
            java.lang.Class r5 = java.lang.Boolean.TYPE     // Catch:{ all -> 0x003b }
            java.lang.Class<java.lang.String> r6 = java.lang.String.class
            java.lang.Class[] r5 = new java.lang.Class[]{r3, r5, r6}     // Catch:{ all -> 0x003b }
            java.lang.reflect.Method r0 = r0.getDeclaredMethod(r4, r5)     // Catch:{ all -> 0x003b }
            r0.setAccessible(r2)     // Catch:{ all -> 0x003b }
        L_0x004c:
            d = r0
            java.lang.Class r0 = f12752a
            if (r0 != 0) goto L_0x0054
        L_0x0052:
            r0 = r1
            goto L_0x0061
        L_0x0054:
            java.lang.Class r5 = java.lang.Boolean.TYPE     // Catch:{ all -> 0x0052 }
            java.lang.Class[] r3 = new java.lang.Class[]{r3, r5}     // Catch:{ all -> 0x0052 }
            java.lang.reflect.Method r0 = r0.getDeclaredMethod(r4, r3)     // Catch:{ all -> 0x0052 }
            r0.setAccessible(r2)     // Catch:{ all -> 0x0052 }
        L_0x0061:
            f12755e = r0
            java.lang.Class r0 = f12752a
            int r3 = android.os.Build.VERSION.SDK_INT
            r4 = 26
            if (r3 == r4) goto L_0x006f
            r4 = 27
            if (r3 != r4) goto L_0x0090
        L_0x006f:
            if (r0 != 0) goto L_0x0072
            goto L_0x0090
        L_0x0072:
            java.lang.String r3 = "requestRelaunchActivity"
            java.lang.Class<android.os.IBinder> r4 = android.os.IBinder.class
            java.lang.Class<java.util.List> r5 = java.util.List.class
            java.lang.Class<java.util.List> r6 = java.util.List.class
            java.lang.Class r7 = java.lang.Integer.TYPE     // Catch:{ all -> 0x0090 }
            java.lang.Class r12 = java.lang.Boolean.TYPE     // Catch:{ all -> 0x0090 }
            java.lang.Class<android.content.res.Configuration> r9 = android.content.res.Configuration.class
            java.lang.Class<android.content.res.Configuration> r10 = android.content.res.Configuration.class
            r8 = r12
            r11 = r12
            java.lang.Class[] r4 = new java.lang.Class[]{r4, r5, r6, r7, r8, r9, r10, r11, r12}     // Catch:{ all -> 0x0090 }
            java.lang.reflect.Method r0 = r0.getDeclaredMethod(r3, r4)     // Catch:{ all -> 0x0090 }
            r0.setAccessible(r2)     // Catch:{ all -> 0x0090 }
            r1 = r0
        L_0x0090:
            f12756f = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: z.C1124d.<clinit>():void");
    }
}
