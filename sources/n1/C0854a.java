package n1;

import B0.H;
import F1.a;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.SystemClock;
import com.google.android.gms.common.internal.I;
import com.google.android.gms.internal.ads_identifier.zze;
import com.google.android.gms.internal.ads_identifier.zzf;
import java.io.IOException;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;
import z1.C1131a;
import z1.f;
import z1.g;

/* renamed from: n1.a  reason: case insensitive filesystem */
public final class C0854a {

    /* renamed from: a  reason: collision with root package name */
    public C1131a f10230a;

    /* renamed from: b  reason: collision with root package name */
    public zzf f10231b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f10232c;
    public final Object d = new Object();

    /* renamed from: e  reason: collision with root package name */
    public c f10233e;

    /* renamed from: f  reason: collision with root package name */
    public final Context f10234f;
    public final long g;

    public C0854a(Context context) {
        I.g(context);
        Context applicationContext = context.getApplicationContext();
        this.f10234f = applicationContext != null ? applicationContext : context;
        this.f10232c = false;
        this.g = -1;
    }

    public static H a(Context context) {
        C0854a aVar = new C0854a(context);
        try {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            aVar.c();
            H e6 = aVar.e();
            d(e6, SystemClock.elapsedRealtime() - elapsedRealtime, (Throwable) null);
            aVar.b();
            return e6;
        } catch (Throwable th) {
            aVar.b();
            throw th;
        }
    }

    public static void d(H h, long j6, Throwable th) {
        if (Math.random() <= 0.0d) {
            HashMap hashMap = new HashMap();
            String str = "1";
            hashMap.put("app_context", str);
            if (h != null) {
                if (true != h.f200b) {
                    str = "0";
                }
                hashMap.put("limit_ad_tracking", str);
                String str2 = (String) h.f201c;
                if (str2 != null) {
                    hashMap.put("ad_id_size", Integer.toString(str2.length()));
                }
            }
            if (th != null) {
                hashMap.put("error", th.getClass().getName());
            }
            hashMap.put("tag", "AdvertisingIdClient");
            hashMap.put("time_spent", Long.toString(j6));
            new C0855b(hashMap).start();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0034, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void b() {
        /*
            r3 = this;
            java.lang.String r0 = "Calling this from your main thread can lead to deadlock"
            com.google.android.gms.common.internal.I.f(r0)
            monitor-enter(r3)
            android.content.Context r0 = r3.f10234f     // Catch:{ all -> 0x0031 }
            if (r0 == 0) goto L_0x0033
            z1.a r0 = r3.f10230a     // Catch:{ all -> 0x0031 }
            if (r0 != 0) goto L_0x000f
            goto L_0x0033
        L_0x000f:
            boolean r0 = r3.f10232c     // Catch:{ all -> 0x001f }
            if (r0 == 0) goto L_0x0027
            F1.a r0 = F1.a.b()     // Catch:{ all -> 0x001f }
            android.content.Context r1 = r3.f10234f     // Catch:{ all -> 0x001f }
            z1.a r2 = r3.f10230a     // Catch:{ all -> 0x001f }
            r0.c(r1, r2)     // Catch:{ all -> 0x001f }
            goto L_0x0027
        L_0x001f:
            r0 = move-exception
            java.lang.String r1 = "AdvertisingIdClient"
            java.lang.String r2 = "AdvertisingIdClient unbindService failed."
            android.util.Log.i(r1, r2, r0)     // Catch:{ all -> 0x0031 }
        L_0x0027:
            r0 = 0
            r3.f10232c = r0     // Catch:{ all -> 0x0031 }
            r0 = 0
            r3.f10231b = r0     // Catch:{ all -> 0x0031 }
            r3.f10230a = r0     // Catch:{ all -> 0x0031 }
            monitor-exit(r3)     // Catch:{ all -> 0x0031 }
            return
        L_0x0031:
            r0 = move-exception
            goto L_0x0035
        L_0x0033:
            monitor-exit(r3)     // Catch:{ all -> 0x0031 }
            return
        L_0x0035:
            monitor-exit(r3)     // Catch:{ all -> 0x0031 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: n1.C0854a.b():void");
    }

    public final void c() {
        I.f("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            try {
                if (this.f10232c) {
                    b();
                }
                Context context = this.f10234f;
                context.getPackageManager().getPackageInfo("com.android.vending", 0);
                int c3 = f.f12811b.c(context, 12451000);
                if (c3 != 0) {
                    if (c3 != 2) {
                        throw new IOException("Google Play services not available");
                    }
                }
                C1131a aVar = new C1131a();
                Intent intent = new Intent("com.google.android.gms.ads.identifier.service.START");
                intent.setPackage("com.google.android.gms");
                if (a.b().a(context, intent, aVar, 1)) {
                    this.f10230a = aVar;
                    this.f10231b = zze.zza(aVar.a(TimeUnit.MILLISECONDS));
                    this.f10232c = true;
                } else {
                    throw new IOException("Connection failure");
                }
            } catch (PackageManager.NameNotFoundException unused) {
                throw new g(9);
            } catch (InterruptedException unused2) {
                throw new IOException("Interrupted exception");
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(7:40|41|(3:43|44|45)|47|48|(1:50)|51) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:47:0x0070 */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x0078  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final B0.H e() {
        /*
            r6 = this;
            java.lang.String r0 = "Calling this from your main thread can lead to deadlock"
            com.google.android.gms.common.internal.I.f(r0)
            monitor-enter(r6)
            boolean r0 = r6.f10232c     // Catch:{ all -> 0x0026 }
            if (r0 != 0) goto L_0x003d
            java.lang.Object r0 = r6.d     // Catch:{ all -> 0x0026 }
            monitor-enter(r0)     // Catch:{ all -> 0x0026 }
            n1.c r1 = r6.f10233e     // Catch:{ all -> 0x0031 }
            if (r1 == 0) goto L_0x0033
            boolean r1 = r1.d     // Catch:{ all -> 0x0031 }
            if (r1 == 0) goto L_0x0033
            monitor-exit(r0)     // Catch:{ all -> 0x0031 }
            r6.c()     // Catch:{ Exception -> 0x0028 }
            boolean r0 = r6.f10232c     // Catch:{ all -> 0x0026 }
            if (r0 == 0) goto L_0x001e
            goto L_0x003d
        L_0x001e:
            java.io.IOException r0 = new java.io.IOException     // Catch:{ all -> 0x0026 }
            java.lang.String r1 = "AdvertisingIdClient cannot reconnect."
            r0.<init>(r1)     // Catch:{ all -> 0x0026 }
            throw r0     // Catch:{ all -> 0x0026 }
        L_0x0026:
            r0 = move-exception
            goto L_0x0093
        L_0x0028:
            r0 = move-exception
            java.io.IOException r1 = new java.io.IOException     // Catch:{ all -> 0x0026 }
            java.lang.String r2 = "AdvertisingIdClient cannot reconnect."
            r1.<init>(r2, r0)     // Catch:{ all -> 0x0026 }
            throw r1     // Catch:{ all -> 0x0026 }
        L_0x0031:
            r1 = move-exception
            goto L_0x003b
        L_0x0033:
            java.io.IOException r1 = new java.io.IOException     // Catch:{ all -> 0x0031 }
            java.lang.String r2 = "AdvertisingIdClient is not connected."
            r1.<init>(r2)     // Catch:{ all -> 0x0031 }
            throw r1     // Catch:{ all -> 0x0031 }
        L_0x003b:
            monitor-exit(r0)     // Catch:{ all -> 0x0031 }
            throw r1     // Catch:{ all -> 0x0026 }
        L_0x003d:
            z1.a r0 = r6.f10230a     // Catch:{ all -> 0x0026 }
            com.google.android.gms.common.internal.I.g(r0)     // Catch:{ all -> 0x0026 }
            com.google.android.gms.internal.ads_identifier.zzf r0 = r6.f10231b     // Catch:{ all -> 0x0026 }
            com.google.android.gms.common.internal.I.g(r0)     // Catch:{ all -> 0x0026 }
            B0.H r0 = new B0.H     // Catch:{ RemoteException -> 0x0083 }
            com.google.android.gms.internal.ads_identifier.zzf r1 = r6.f10231b     // Catch:{ RemoteException -> 0x0083 }
            java.lang.String r1 = r1.zzc()     // Catch:{ RemoteException -> 0x0083 }
            com.google.android.gms.internal.ads_identifier.zzf r2 = r6.f10231b     // Catch:{ RemoteException -> 0x0083 }
            r3 = 1
            boolean r2 = r2.zze(r3)     // Catch:{ RemoteException -> 0x0083 }
            r3 = 8
            r0.<init>(r1, r2, r3)     // Catch:{ RemoteException -> 0x0083 }
            monitor-exit(r6)     // Catch:{ all -> 0x0026 }
            java.lang.Object r1 = r6.d
            monitor-enter(r1)
            n1.c r2 = r6.f10233e     // Catch:{ all -> 0x006e }
            if (r2 == 0) goto L_0x0070
            java.util.concurrent.CountDownLatch r2 = r2.f10238c     // Catch:{ all -> 0x006e }
            r2.countDown()     // Catch:{ all -> 0x006e }
            n1.c r2 = r6.f10233e     // Catch:{ InterruptedException -> 0x0070 }
            r2.join()     // Catch:{ InterruptedException -> 0x0070 }
            goto L_0x0070
        L_0x006e:
            r0 = move-exception
            goto L_0x0081
        L_0x0070:
            long r2 = r6.g     // Catch:{ all -> 0x006e }
            r4 = 0
            int r4 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r4 <= 0) goto L_0x007f
            n1.c r4 = new n1.c     // Catch:{ all -> 0x006e }
            r4.<init>(r6, r2)     // Catch:{ all -> 0x006e }
            r6.f10233e = r4     // Catch:{ all -> 0x006e }
        L_0x007f:
            monitor-exit(r1)     // Catch:{ all -> 0x006e }
            return r0
        L_0x0081:
            monitor-exit(r1)     // Catch:{ all -> 0x006e }
            throw r0
        L_0x0083:
            r0 = move-exception
            java.lang.String r1 = "AdvertisingIdClient"
            java.lang.String r2 = "GMS remote exception "
            android.util.Log.i(r1, r2, r0)     // Catch:{ all -> 0x0026 }
            java.io.IOException r0 = new java.io.IOException     // Catch:{ all -> 0x0026 }
            java.lang.String r1 = "Remote exception"
            r0.<init>(r1)     // Catch:{ all -> 0x0026 }
            throw r0     // Catch:{ all -> 0x0026 }
        L_0x0093:
            monitor-exit(r6)     // Catch:{ all -> 0x0026 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: n1.C0854a.e():B0.H");
    }

    public final void finalize() {
        b();
        super.finalize();
    }
}
