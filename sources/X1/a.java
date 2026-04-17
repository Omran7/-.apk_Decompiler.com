package X1;

import A.h;
import G1.b;
import G1.f;
import G1.g;
import I1.c;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.PowerManager;
import android.os.WorkSource;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.internal.I;
import com.google.android.gms.internal.stats.zzb;
import com.google.android.gms.internal.stats.zzh;
import com.google.android.gms.internal.stats.zzi;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

public final class a {

    /* renamed from: n  reason: collision with root package name */
    public static final long f4175n = TimeUnit.DAYS.toMillis(366);

    /* renamed from: o  reason: collision with root package name */
    public static volatile ScheduledExecutorService f4176o = null;

    /* renamed from: p  reason: collision with root package name */
    public static final Object f4177p = new Object();

    /* renamed from: a  reason: collision with root package name */
    public final Object f4178a = new Object();

    /* renamed from: b  reason: collision with root package name */
    public final PowerManager.WakeLock f4179b;

    /* renamed from: c  reason: collision with root package name */
    public int f4180c = 0;
    public ScheduledFuture d;

    /* renamed from: e  reason: collision with root package name */
    public long f4181e;

    /* renamed from: f  reason: collision with root package name */
    public final HashSet f4182f = new HashSet();
    public boolean g = true;
    public zzb h;

    /* renamed from: i  reason: collision with root package name */
    public final b f4183i = b.f823a;

    /* renamed from: j  reason: collision with root package name */
    public final String f4184j;

    /* renamed from: k  reason: collision with root package name */
    public final HashMap f4185k = new HashMap();

    /* renamed from: l  reason: collision with root package name */
    public final AtomicInteger f4186l = new AtomicInteger(0);

    /* renamed from: m  reason: collision with root package name */
    public final ScheduledExecutorService f4187m;

    public a(Context context) {
        boolean z3;
        boolean z4;
        String str;
        String packageName = context.getPackageName();
        I.e("wake:com.google.firebase.iid.WakeLockHolder", "WakeLock: wakeLockName must not be empty");
        context.getApplicationContext();
        WorkSource workSource = null;
        this.h = null;
        if (!"com.google.android.gms".equals(context.getPackageName())) {
            if ("wake:com.google.firebase.iid.WakeLockHolder".length() != 0) {
                str = "*gcore*:".concat("wake:com.google.firebase.iid.WakeLockHolder");
            } else {
                str = new String("*gcore*:");
            }
            this.f4184j = str;
        } else {
            this.f4184j = "wake:com.google.firebase.iid.WakeLockHolder";
        }
        PowerManager powerManager = (PowerManager) context.getSystemService("power");
        if (powerManager != null) {
            this.f4179b = powerManager.newWakeLock(1, "wake:com.google.firebase.iid.WakeLockHolder");
            Method method = g.f832a;
            synchronized (g.class) {
                Boolean bool = g.f834c;
                if (bool != null) {
                    z3 = bool.booleanValue();
                } else {
                    if (h.checkSelfPermission(context, "android.permission.UPDATE_DEVICE_STATS") == 0) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    g.f834c = Boolean.valueOf(z3);
                }
            }
            if (z3) {
                int i2 = f.f831a;
                if (packageName == null || packageName.trim().isEmpty()) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                packageName = z4 ? context.getPackageName() : packageName;
                if (!(context.getPackageManager() == null || packageName == null)) {
                    try {
                        ApplicationInfo h6 = c.a(context).h(0, packageName);
                        if (h6 == null) {
                            Log.e("WorkSourceUtil", "Could not get applicationInfo from package: ".concat(packageName));
                        } else {
                            int i5 = h6.uid;
                            workSource = new WorkSource();
                            Method method2 = g.f833b;
                            if (method2 != null) {
                                try {
                                    method2.invoke(workSource, new Object[]{Integer.valueOf(i5), packageName});
                                } catch (Exception e6) {
                                    Log.wtf("WorkSourceUtil", "Unable to assign blame through WorkSource", e6);
                                }
                            } else {
                                Method method3 = g.f832a;
                                if (method3 != null) {
                                    try {
                                        method3.invoke(workSource, new Object[]{Integer.valueOf(i5)});
                                    } catch (Exception e7) {
                                        Log.wtf("WorkSourceUtil", "Unable to assign blame through WorkSource", e7);
                                    }
                                }
                            }
                        }
                    } catch (PackageManager.NameNotFoundException unused) {
                        Log.e("WorkSourceUtil", "Could not find package: ".concat(packageName));
                    }
                }
                if (workSource != null) {
                    try {
                        this.f4179b.setWorkSource(workSource);
                    } catch (ArrayIndexOutOfBoundsException | IllegalArgumentException e8) {
                        Log.wtf("WakeLock", e8.toString());
                    }
                }
            }
            ScheduledExecutorService scheduledExecutorService = f4176o;
            if (scheduledExecutorService == null) {
                synchronized (f4177p) {
                    try {
                        scheduledExecutorService = f4176o;
                        if (scheduledExecutorService == null) {
                            zzh.zza();
                            scheduledExecutorService = Executors.unconfigurableScheduledExecutorService(Executors.newScheduledThreadPool(1));
                            f4176o = scheduledExecutorService;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            this.f4187m = scheduledExecutorService;
            return;
        }
        StringBuilder sb = new StringBuilder(29);
        sb.append("expected a non-null reference", 0, 29);
        throw new zzi(sb.toString());
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v8, resolved type: X1.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v15, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v19, resolved type: X1.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v20, resolved type: X1.b} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(long r11) {
        /*
            r10 = this;
            java.util.concurrent.atomic.AtomicInteger r0 = r10.f4186l
            r0.incrementAndGet()
            long r0 = f4175n
            r2 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            long r0 = java.lang.Math.min(r2, r0)
            r4 = 1
            long r0 = java.lang.Math.max(r0, r4)
            r4 = 0
            int r4 = (r11 > r4 ? 1 : (r11 == r4 ? 0 : -1))
            if (r4 <= 0) goto L_0x0020
            long r0 = java.lang.Math.min(r11, r0)
        L_0x0020:
            java.lang.Object r11 = r10.f4178a
            monitor-enter(r11)
            boolean r12 = r10.b()     // Catch:{ all -> 0x003f }
            r4 = 0
            r5 = 0
            if (r12 != 0) goto L_0x0041
            com.google.android.gms.internal.stats.zzb r12 = com.google.android.gms.internal.stats.zzb.zza(r5, r4)     // Catch:{ all -> 0x003f }
            r10.h = r12     // Catch:{ all -> 0x003f }
            android.os.PowerManager$WakeLock r12 = r10.f4179b     // Catch:{ all -> 0x003f }
            r12.acquire()     // Catch:{ all -> 0x003f }
            G1.b r12 = r10.f4183i     // Catch:{ all -> 0x003f }
            r12.getClass()     // Catch:{ all -> 0x003f }
            android.os.SystemClock.elapsedRealtime()     // Catch:{ all -> 0x003f }
            goto L_0x0041
        L_0x003f:
            r12 = move-exception
            goto L_0x009b
        L_0x0041:
            int r12 = r10.f4180c     // Catch:{ all -> 0x003f }
            int r12 = r12 + 1
            r10.f4180c = r12     // Catch:{ all -> 0x003f }
            boolean r12 = r10.g     // Catch:{ all -> 0x003f }
            if (r12 == 0) goto L_0x004e
            android.text.TextUtils.isEmpty(r4)     // Catch:{ all -> 0x003f }
        L_0x004e:
            java.util.HashMap r12 = r10.f4185k     // Catch:{ all -> 0x003f }
            java.lang.Object r12 = r12.get(r4)     // Catch:{ all -> 0x003f }
            X1.b r12 = (X1.b) r12     // Catch:{ all -> 0x003f }
            if (r12 != 0) goto L_0x0062
            X1.b r12 = new X1.b     // Catch:{ all -> 0x003f }
            r12.<init>()     // Catch:{ all -> 0x003f }
            java.util.HashMap r6 = r10.f4185k     // Catch:{ all -> 0x003f }
            r6.put(r4, r12)     // Catch:{ all -> 0x003f }
        L_0x0062:
            int r4 = r12.f4188a     // Catch:{ all -> 0x003f }
            int r4 = r4 + 1
            r12.f4188a = r4     // Catch:{ all -> 0x003f }
            G1.b r12 = r10.f4183i     // Catch:{ all -> 0x003f }
            r12.getClass()     // Catch:{ all -> 0x003f }
            long r6 = android.os.SystemClock.elapsedRealtime()     // Catch:{ all -> 0x003f }
            long r8 = r2 - r6
            int r12 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            if (r12 <= 0) goto L_0x0079
            long r2 = r6 + r0
        L_0x0079:
            long r6 = r10.f4181e     // Catch:{ all -> 0x003f }
            int r12 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r12 <= 0) goto L_0x0099
            r10.f4181e = r2     // Catch:{ all -> 0x003f }
            java.util.concurrent.ScheduledFuture r12 = r10.d     // Catch:{ all -> 0x003f }
            if (r12 == 0) goto L_0x0088
            r12.cancel(r5)     // Catch:{ all -> 0x003f }
        L_0x0088:
            java.util.concurrent.ScheduledExecutorService r12 = r10.f4187m     // Catch:{ all -> 0x003f }
            B0.c r2 = new B0.c     // Catch:{ all -> 0x003f }
            r3 = 15
            r2.<init>((java.lang.Object) r10, (int) r3)     // Catch:{ all -> 0x003f }
            java.util.concurrent.TimeUnit r3 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch:{ all -> 0x003f }
            java.util.concurrent.ScheduledFuture r12 = r12.schedule(r2, r0, r3)     // Catch:{ all -> 0x003f }
            r10.d = r12     // Catch:{ all -> 0x003f }
        L_0x0099:
            monitor-exit(r11)     // Catch:{ all -> 0x003f }
            return
        L_0x009b:
            monitor-exit(r11)     // Catch:{ all -> 0x003f }
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: X1.a.a(long):void");
    }

    public final boolean b() {
        boolean z3;
        synchronized (this.f4178a) {
            if (this.f4180c > 0) {
                z3 = true;
            } else {
                z3 = false;
            }
        }
        return z3;
    }

    public final void c() {
        if (this.f4186l.decrementAndGet() < 0) {
            Log.e("WakeLock", String.valueOf(this.f4184j).concat(" release without a matched acquire!"));
        }
        synchronized (this.f4178a) {
            try {
                if (this.g) {
                    TextUtils.isEmpty((CharSequence) null);
                }
                if (this.f4185k.containsKey((Object) null)) {
                    b bVar = (b) this.f4185k.get((Object) null);
                    if (bVar != null) {
                        int i2 = bVar.f4188a - 1;
                        bVar.f4188a = i2;
                        if (i2 == 0) {
                            this.f4185k.remove((Object) null);
                        }
                    }
                } else {
                    Log.w("WakeLock", String.valueOf(this.f4184j).concat(" counter does not exist"));
                }
                e();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void d() {
        HashSet hashSet = this.f4182f;
        if (!hashSet.isEmpty()) {
            ArrayList arrayList = new ArrayList(hashSet);
            hashSet.clear();
            if (arrayList.size() > 0) {
                arrayList.get(0).getClass();
                throw new ClassCastException();
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00a4, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void e() {
        /*
            r6 = this;
            java.lang.Object r0 = r6.f4178a
            monitor-enter(r0)
            boolean r1 = r6.b()     // Catch:{ all -> 0x000b }
            if (r1 != 0) goto L_0x000e
            monitor-exit(r0)     // Catch:{ all -> 0x000b }
            return
        L_0x000b:
            r1 = move-exception
            goto L_0x00a5
        L_0x000e:
            boolean r1 = r6.g     // Catch:{ all -> 0x000b }
            r2 = 0
            if (r1 == 0) goto L_0x001e
            int r1 = r6.f4180c     // Catch:{ all -> 0x000b }
            int r1 = r1 + -1
            r6.f4180c = r1     // Catch:{ all -> 0x000b }
            if (r1 > 0) goto L_0x001c
            goto L_0x0020
        L_0x001c:
            monitor-exit(r0)     // Catch:{ all -> 0x000b }
            return
        L_0x001e:
            r6.f4180c = r2     // Catch:{ all -> 0x000b }
        L_0x0020:
            r6.d()     // Catch:{ all -> 0x000b }
            java.util.HashMap r1 = r6.f4185k     // Catch:{ all -> 0x000b }
            java.util.Collection r1 = r1.values()     // Catch:{ all -> 0x000b }
            java.util.Iterator r1 = r1.iterator()     // Catch:{ all -> 0x000b }
        L_0x002d:
            boolean r3 = r1.hasNext()     // Catch:{ all -> 0x000b }
            if (r3 == 0) goto L_0x003c
            java.lang.Object r3 = r1.next()     // Catch:{ all -> 0x000b }
            X1.b r3 = (X1.b) r3     // Catch:{ all -> 0x000b }
            r3.f4188a = r2     // Catch:{ all -> 0x000b }
            goto L_0x002d
        L_0x003c:
            java.util.HashMap r1 = r6.f4185k     // Catch:{ all -> 0x000b }
            r1.clear()     // Catch:{ all -> 0x000b }
            java.util.concurrent.ScheduledFuture r1 = r6.d     // Catch:{ all -> 0x000b }
            r3 = 0
            if (r1 == 0) goto L_0x004f
            r1.cancel(r2)     // Catch:{ all -> 0x000b }
            r6.d = r3     // Catch:{ all -> 0x000b }
            r1 = 0
            r6.f4181e = r1     // Catch:{ all -> 0x000b }
        L_0x004f:
            android.os.PowerManager$WakeLock r1 = r6.f4179b     // Catch:{ all -> 0x000b }
            boolean r1 = r1.isHeld()     // Catch:{ all -> 0x000b }
            if (r1 == 0) goto L_0x0092
            android.os.PowerManager$WakeLock r1 = r6.f4179b     // Catch:{ RuntimeException -> 0x0065 }
            r1.release()     // Catch:{ RuntimeException -> 0x0065 }
            com.google.android.gms.internal.stats.zzb r1 = r6.h     // Catch:{ all -> 0x000b }
            if (r1 == 0) goto L_0x00a3
            r6.h = r3     // Catch:{ all -> 0x000b }
            goto L_0x00a3
        L_0x0063:
            r1 = move-exception
            goto L_0x008b
        L_0x0065:
            r1 = move-exception
            java.lang.Class r2 = r1.getClass()     // Catch:{ all -> 0x0063 }
            java.lang.Class<java.lang.RuntimeException> r4 = java.lang.RuntimeException.class
            boolean r2 = r2.equals(r4)     // Catch:{ all -> 0x0063 }
            if (r2 == 0) goto L_0x008a
            java.lang.String r2 = "WakeLock"
            java.lang.String r4 = r6.f4184j     // Catch:{ all -> 0x0063 }
            java.lang.String r4 = java.lang.String.valueOf(r4)     // Catch:{ all -> 0x0063 }
            java.lang.String r5 = " failed to release!"
            java.lang.String r4 = r4.concat(r5)     // Catch:{ all -> 0x0063 }
            android.util.Log.e(r2, r4, r1)     // Catch:{ all -> 0x0063 }
            com.google.android.gms.internal.stats.zzb r1 = r6.h     // Catch:{ all -> 0x000b }
            if (r1 == 0) goto L_0x00a3
            r6.h = r3     // Catch:{ all -> 0x000b }
            goto L_0x00a3
        L_0x008a:
            throw r1     // Catch:{ all -> 0x0063 }
        L_0x008b:
            com.google.android.gms.internal.stats.zzb r2 = r6.h     // Catch:{ all -> 0x000b }
            if (r2 == 0) goto L_0x0091
            r6.h = r3     // Catch:{ all -> 0x000b }
        L_0x0091:
            throw r1     // Catch:{ all -> 0x000b }
        L_0x0092:
            java.lang.String r1 = "WakeLock"
            java.lang.String r2 = r6.f4184j     // Catch:{ all -> 0x000b }
            java.lang.String r2 = java.lang.String.valueOf(r2)     // Catch:{ all -> 0x000b }
            java.lang.String r3 = " should be held!"
            java.lang.String r2 = r2.concat(r3)     // Catch:{ all -> 0x000b }
            android.util.Log.e(r1, r2)     // Catch:{ all -> 0x000b }
        L_0x00a3:
            monitor-exit(r0)     // Catch:{ all -> 0x000b }
            return
        L_0x00a5:
            monitor-exit(r0)     // Catch:{ all -> 0x000b }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X1.a.e():void");
    }
}
