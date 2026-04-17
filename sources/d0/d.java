package D0;

import I3.h;
import T1.C0174h0;
import T1.C0212u0;
import T1.H;
import T1.T1;
import android.content.SharedPreferences;
import android.util.Log;
import com.google.android.gms.common.internal.I;
import com.google.android.gms.internal.measurement.zzhm;
import j4.p0;
import java.io.File;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import x0.c;
import z0.C1130f;

public final class d implements a {

    /* renamed from: a  reason: collision with root package name */
    public long f489a;

    /* renamed from: b  reason: collision with root package name */
    public Object f490b;

    /* renamed from: c  reason: collision with root package name */
    public Serializable f491c;
    public Object d;

    /* renamed from: e  reason: collision with root package name */
    public Object f492e;

    public /* synthetic */ d(T1 t12) {
        this.f492e = t12;
    }

    public File a(C1130f fVar) {
        String p6 = ((h) this.f490b).p(fVar);
        if (Log.isLoggable("DiskLruCacheWrapper", 2)) {
            Log.v("DiskLruCacheWrapper", "Get: Obtained: " + p6 + " for for Key: " + fVar);
        }
        try {
            p0 m6 = b().m(p6);
            if (m6 != null) {
                return ((File[]) m6.f9075b)[0];
            }
            return null;
        } catch (IOException e6) {
            if (!Log.isLoggable("DiskLruCacheWrapper", 5)) {
                return null;
            }
            Log.w("DiskLruCacheWrapper", "Unable to get from disk cache", e6);
            return null;
        }
    }

    public synchronized c b() {
        try {
            if (((c) this.f492e) == null) {
                this.f492e = c.o((File) this.f491c, this.f489a);
            }
        } catch (Throwable th) {
            while (true) {
                throw th;
            }
        }
        return (c) this.f492e;
    }

    public boolean c(zzhm zzhm, long j6) {
        I.g(zzhm);
        if (((ArrayList) this.d) == null) {
            this.d = new ArrayList();
        }
        if (((ArrayList) this.f491c) == null) {
            this.f491c = new ArrayList();
        }
        if (!((ArrayList) this.d).isEmpty() && ((((zzhm) ((ArrayList) this.d).get(0)).zzd() / 1000) / 60) / 60 != ((zzhm.zzd() / 1000) / 60) / 60) {
            return false;
        }
        long zzcf = this.f489a + ((long) zzhm.zzcf());
        T1 t12 = (T1) this.f492e;
        if (!t12.h0().B((String) null, H.f2938q1)) {
            t12.h0();
            if (zzcf >= ((long) Math.max(0, ((Integer) H.f2915j.a((Object) null)).intValue()))) {
                return false;
            }
        } else if (!((ArrayList) this.d).isEmpty()) {
            t12.h0();
            if (zzcf >= ((long) Math.max(0, ((Integer) H.f2915j.a((Object) null)).intValue()))) {
                return false;
            }
        }
        this.f489a = zzcf;
        ((ArrayList) this.d).add(zzhm);
        ((ArrayList) this.f491c).add(Long.valueOf(j6));
        int size = ((ArrayList) this.d).size();
        t12.h0();
        if (size >= Math.max(1, ((Integer) H.f2918k.a((Object) null)).intValue())) {
            return false;
        }
        return true;
    }

    public void d() {
        C0174h0 h0Var = (C0174h0) this.f492e;
        h0Var.o();
        ((C0212u0) h0Var.f398a).f3501w.getClass();
        long currentTimeMillis = System.currentTimeMillis();
        SharedPreferences.Editor edit = h0Var.t().edit();
        edit.remove((String) this.f491c);
        edit.remove((String) this.d);
        edit.putLong((String) this.f490b, currentTimeMillis);
        edit.apply();
    }

    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:50:0x00b5 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void i(z0.C1130f r8, B0.C0009h r9) {
        /*
            r7 = this;
            java.lang.String r0 = "Had two simultaneous puts for: "
            java.lang.String r1 = "Put: Obtained: "
            java.lang.Object r2 = r7.f490b
            I3.h r2 = (I3.h) r2
            java.lang.String r2 = r2.p(r8)
            java.lang.Object r3 = r7.d
            I3.h r3 = (I3.h) r3
            monitor-enter(r3)
            java.lang.Object r4 = r3.f1179b     // Catch:{ all -> 0x00e2 }
            java.util.HashMap r4 = (java.util.HashMap) r4     // Catch:{ all -> 0x00e2 }
            java.lang.Object r4 = r4.get(r2)     // Catch:{ all -> 0x00e2 }
            D0.b r4 = (D0.b) r4     // Catch:{ all -> 0x00e2 }
            if (r4 != 0) goto L_0x003f
            java.lang.Object r4 = r3.f1180c     // Catch:{ all -> 0x00e2 }
            D0.c r4 = (D0.c) r4     // Catch:{ all -> 0x00e2 }
            java.util.ArrayDeque r5 = r4.f488a     // Catch:{ all -> 0x00e2 }
            monitor-enter(r5)     // Catch:{ all -> 0x00e2 }
            java.util.ArrayDeque r4 = r4.f488a     // Catch:{ all -> 0x003c }
            java.lang.Object r4 = r4.poll()     // Catch:{ all -> 0x003c }
            D0.b r4 = (D0.b) r4     // Catch:{ all -> 0x003c }
            monitor-exit(r5)     // Catch:{ all -> 0x003c }
            if (r4 != 0) goto L_0x0034
            D0.b r4 = new D0.b     // Catch:{ all -> 0x00e2 }
            r4.<init>()     // Catch:{ all -> 0x00e2 }
        L_0x0034:
            java.lang.Object r5 = r3.f1179b     // Catch:{ all -> 0x00e2 }
            java.util.HashMap r5 = (java.util.HashMap) r5     // Catch:{ all -> 0x00e2 }
            r5.put(r2, r4)     // Catch:{ all -> 0x00e2 }
            goto L_0x003f
        L_0x003c:
            r8 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x003c }
            throw r8     // Catch:{ all -> 0x00e2 }
        L_0x003f:
            int r5 = r4.f487b     // Catch:{ all -> 0x00e2 }
            r6 = 1
            int r5 = r5 + r6
            r4.f487b = r5     // Catch:{ all -> 0x00e2 }
            monitor-exit(r3)     // Catch:{ all -> 0x00e2 }
            java.util.concurrent.locks.ReentrantLock r3 = r4.f486a
            r3.lock()
            java.lang.String r3 = "DiskLruCacheWrapper"
            r4 = 2
            boolean r3 = android.util.Log.isLoggable(r3, r4)     // Catch:{ all -> 0x006e }
            if (r3 == 0) goto L_0x0070
            java.lang.String r3 = "DiskLruCacheWrapper"
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x006e }
            r4.<init>(r1)     // Catch:{ all -> 0x006e }
            r4.append(r2)     // Catch:{ all -> 0x006e }
            java.lang.String r1 = " for for Key: "
            r4.append(r1)     // Catch:{ all -> 0x006e }
            r4.append(r8)     // Catch:{ all -> 0x006e }
            java.lang.String r8 = r4.toString()     // Catch:{ all -> 0x006e }
            android.util.Log.v(r3, r8)     // Catch:{ all -> 0x006e }
            goto L_0x0070
        L_0x006e:
            r8 = move-exception
            goto L_0x00da
        L_0x0070:
            x0.c r8 = r7.b()     // Catch:{ IOException -> 0x00b6 }
            j4.p0 r1 = r8.m(r2)     // Catch:{ IOException -> 0x00b6 }
            if (r1 == 0) goto L_0x0082
            java.lang.Object r8 = r7.d
            I3.h r8 = (I3.h) r8
            r8.I(r2)
            return
        L_0x0082:
            S3.r r8 = r8.k(r2)     // Catch:{ IOException -> 0x00b6 }
            if (r8 == 0) goto L_0x00b8
            java.io.File r0 = r8.k()     // Catch:{ all -> 0x00ad }
            java.lang.Object r1 = r9.f229c     // Catch:{ all -> 0x00ad }
            java.lang.Object r3 = r9.d     // Catch:{ all -> 0x00ad }
            z0.i r3 = (z0.i) r3     // Catch:{ all -> 0x00ad }
            java.lang.Object r9 = r9.f228b     // Catch:{ all -> 0x00ad }
            z0.b r9 = (z0.C1126b) r9     // Catch:{ all -> 0x00ad }
            boolean r9 = r9.s(r1, r0, r3)     // Catch:{ all -> 0x00ad }
            if (r9 == 0) goto L_0x00a5
            java.lang.Object r9 = r8.d     // Catch:{ all -> 0x00ad }
            x0.c r9 = (x0.c) r9     // Catch:{ all -> 0x00ad }
            x0.c.c(r9, r8, r6)     // Catch:{ all -> 0x00ad }
            r8.f2693a = r6     // Catch:{ all -> 0x00ad }
        L_0x00a5:
            boolean r9 = r8.f2693a     // Catch:{ IOException -> 0x00b6 }
            if (r9 != 0) goto L_0x00d2
            r8.a()     // Catch:{ IOException -> 0x00d2 }
            goto L_0x00d2
        L_0x00ad:
            r9 = move-exception
            boolean r0 = r8.f2693a     // Catch:{ IOException -> 0x00b6 }
            if (r0 != 0) goto L_0x00b5
            r8.a()     // Catch:{ IOException -> 0x00b5 }
        L_0x00b5:
            throw r9     // Catch:{ IOException -> 0x00b6 }
        L_0x00b6:
            r8 = move-exception
            goto L_0x00c2
        L_0x00b8:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException     // Catch:{ IOException -> 0x00b6 }
            java.lang.String r9 = r0.concat(r2)     // Catch:{ IOException -> 0x00b6 }
            r8.<init>(r9)     // Catch:{ IOException -> 0x00b6 }
            throw r8     // Catch:{ IOException -> 0x00b6 }
        L_0x00c2:
            java.lang.String r9 = "DiskLruCacheWrapper"
            r0 = 5
            boolean r9 = android.util.Log.isLoggable(r9, r0)     // Catch:{ all -> 0x006e }
            if (r9 == 0) goto L_0x00d2
            java.lang.String r9 = "DiskLruCacheWrapper"
            java.lang.String r0 = "Unable to put to disk cache"
            android.util.Log.w(r9, r0, r8)     // Catch:{ all -> 0x006e }
        L_0x00d2:
            java.lang.Object r8 = r7.d
            I3.h r8 = (I3.h) r8
            r8.I(r2)
            return
        L_0x00da:
            java.lang.Object r9 = r7.d
            I3.h r9 = (I3.h) r9
            r9.I(r2)
            throw r8
        L_0x00e2:
            r8 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x00e2 }
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: D0.d.i(z0.f, B0.h):void");
    }
}
