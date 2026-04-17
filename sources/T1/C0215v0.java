package T1;

import android.os.Bundle;
import com.google.android.gms.internal.measurement.zzcy;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: T1.v0  reason: case insensitive filesystem */
public final /* synthetic */ class C0215v0 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f3511a = 0;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ String f3512b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Z1 f3513c;
    public final /* synthetic */ Object d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ Object f3514e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ Object f3515f;

    public /* synthetic */ C0215v0(D0 d02, Z1 z12, Bundle bundle, L l6, String str) {
        this.d = d02;
        this.f3513c = z12;
        this.f3514e = bundle;
        this.f3515f = l6;
        this.f3512b = str;
    }

    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r8 = this;
            int r0 = r8.f3511a
            switch(r0) {
                case 0: goto L_0x00f6;
                case 1: goto L_0x0060;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r0 = r8.f3514e
            com.google.android.gms.internal.measurement.zzcy r0 = (com.google.android.gms.internal.measurement.zzcy) r0
            java.lang.Object r1 = r8.d
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r2 = r8.f3512b
            java.lang.Object r3 = r8.f3515f
            T1.w1 r3 = (T1.C0219w1) r3
            java.lang.Object r4 = r3.f398a
            T1.u0 r4 = (T1.C0212u0) r4
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            T1.J r6 = r3.d     // Catch:{ RemoteException -> 0x0037 }
            if (r6 != 0) goto L_0x0039
            T1.Z r3 = r4.f3496r     // Catch:{ RemoteException -> 0x0037 }
            T1.C0212u0.k(r3)     // Catch:{ RemoteException -> 0x0037 }
            T1.X r3 = r3.f3172f     // Catch:{ RemoteException -> 0x0037 }
            java.lang.String r6 = "Failed to get conditional properties; not connected to service"
            r3.c(r6, r2, r1)     // Catch:{ RemoteException -> 0x0037 }
            T1.Y1 r1 = r4.f3499u
        L_0x002e:
            T1.C0212u0.i(r1)
            r1.L(r0, r5)
            goto L_0x0056
        L_0x0035:
            r1 = move-exception
            goto L_0x0057
        L_0x0037:
            r3 = move-exception
            goto L_0x0047
        L_0x0039:
            T1.Z1 r7 = r8.f3513c     // Catch:{ RemoteException -> 0x0037 }
            java.util.List r6 = r6.v(r2, r1, r7)     // Catch:{ RemoteException -> 0x0037 }
            java.util.ArrayList r5 = T1.Y1.B(r6)     // Catch:{ RemoteException -> 0x0037 }
            r3.E()     // Catch:{ RemoteException -> 0x0037 }
            goto L_0x0053
        L_0x0047:
            T1.Z r6 = r4.f3496r     // Catch:{ all -> 0x0035 }
            T1.C0212u0.k(r6)     // Catch:{ all -> 0x0035 }
            T1.X r6 = r6.f3172f     // Catch:{ all -> 0x0035 }
            java.lang.String r7 = "Failed to get conditional properties; remote exception"
            r6.d(r7, r2, r1, r3)     // Catch:{ all -> 0x0035 }
        L_0x0053:
            T1.Y1 r1 = r4.f3499u
            goto L_0x002e
        L_0x0056:
            return
        L_0x0057:
            T1.Y1 r2 = r4.f3499u
            T1.C0212u0.i(r2)
            r2.L(r0, r5)
            throw r1
        L_0x0060:
            java.lang.Object r0 = r8.d
            java.util.concurrent.atomic.AtomicReference r0 = (java.util.concurrent.atomic.AtomicReference) r0
            monitor-enter(r0)
            r1 = 0
            java.lang.Object r2 = r8.f3515f     // Catch:{ RemoteException -> 0x0094 }
            T1.w1 r2 = (T1.C0219w1) r2     // Catch:{ RemoteException -> 0x0094 }
            T1.J r3 = r2.d     // Catch:{ RemoteException -> 0x0094 }
            if (r3 != 0) goto L_0x0096
            java.lang.Object r2 = r2.f398a     // Catch:{ RemoteException -> 0x0094 }
            T1.u0 r2 = (T1.C0212u0) r2     // Catch:{ RemoteException -> 0x0094 }
            T1.Z r2 = r2.f3496r     // Catch:{ RemoteException -> 0x0094 }
            T1.C0212u0.k(r2)     // Catch:{ RemoteException -> 0x0094 }
            T1.X r2 = r2.f3172f     // Catch:{ RemoteException -> 0x0094 }
            java.lang.String r3 = "(legacy) Failed to get conditional properties; not connected to service"
            java.lang.String r4 = r8.f3512b     // Catch:{ RemoteException -> 0x0094 }
            java.lang.Object r5 = r8.f3514e     // Catch:{ RemoteException -> 0x0094 }
            java.lang.String r5 = (java.lang.String) r5     // Catch:{ RemoteException -> 0x0094 }
            r2.d(r3, r1, r4, r5)     // Catch:{ RemoteException -> 0x0094 }
            java.util.List r2 = java.util.Collections.emptyList()     // Catch:{ RemoteException -> 0x0094 }
            r0.set(r2)     // Catch:{ RemoteException -> 0x0094 }
            r0.notify()     // Catch:{ all -> 0x0090 }
            monitor-exit(r0)     // Catch:{ all -> 0x0090 }
            goto L_0x00eb
        L_0x0090:
            r1 = move-exception
            goto L_0x00f4
        L_0x0092:
            r1 = move-exception
            goto L_0x00ec
        L_0x0094:
            r2 = move-exception
            goto L_0x00c4
        L_0x0096:
            boolean r4 = android.text.TextUtils.isEmpty(r1)     // Catch:{ RemoteException -> 0x0094 }
            if (r4 == 0) goto L_0x00ac
            T1.Z1 r4 = r8.f3513c     // Catch:{ RemoteException -> 0x0094 }
            java.lang.String r5 = r8.f3512b     // Catch:{ RemoteException -> 0x0094 }
            java.lang.Object r6 = r8.f3514e     // Catch:{ RemoteException -> 0x0094 }
            java.lang.String r6 = (java.lang.String) r6     // Catch:{ RemoteException -> 0x0094 }
            java.util.List r3 = r3.v(r5, r6, r4)     // Catch:{ RemoteException -> 0x0094 }
            r0.set(r3)     // Catch:{ RemoteException -> 0x0094 }
            goto L_0x00b9
        L_0x00ac:
            java.lang.String r4 = r8.f3512b     // Catch:{ RemoteException -> 0x0094 }
            java.lang.Object r5 = r8.f3514e     // Catch:{ RemoteException -> 0x0094 }
            java.lang.String r5 = (java.lang.String) r5     // Catch:{ RemoteException -> 0x0094 }
            java.util.List r3 = r3.r(r1, r4, r5)     // Catch:{ RemoteException -> 0x0094 }
            r0.set(r3)     // Catch:{ RemoteException -> 0x0094 }
        L_0x00b9:
            r2.E()     // Catch:{ RemoteException -> 0x0094 }
            java.lang.Object r1 = r8.d     // Catch:{ all -> 0x0090 }
            java.util.concurrent.atomic.AtomicReference r1 = (java.util.concurrent.atomic.AtomicReference) r1     // Catch:{ all -> 0x0090 }
        L_0x00c0:
            r1.notify()     // Catch:{ all -> 0x0090 }
            goto L_0x00ea
        L_0x00c4:
            java.lang.Object r3 = r8.f3515f     // Catch:{ all -> 0x0092 }
            T1.w1 r3 = (T1.C0219w1) r3     // Catch:{ all -> 0x0092 }
            java.lang.Object r3 = r3.f398a     // Catch:{ all -> 0x0092 }
            T1.u0 r3 = (T1.C0212u0) r3     // Catch:{ all -> 0x0092 }
            T1.Z r3 = r3.f3496r     // Catch:{ all -> 0x0092 }
            T1.C0212u0.k(r3)     // Catch:{ all -> 0x0092 }
            T1.X r3 = r3.f3172f     // Catch:{ all -> 0x0092 }
            java.lang.String r4 = "(legacy) Failed to get conditional properties; remote exception"
            java.lang.String r5 = r8.f3512b     // Catch:{ all -> 0x0092 }
            r3.d(r4, r1, r5, r2)     // Catch:{ all -> 0x0092 }
            java.lang.Object r1 = r8.d     // Catch:{ all -> 0x0092 }
            java.util.concurrent.atomic.AtomicReference r1 = (java.util.concurrent.atomic.AtomicReference) r1     // Catch:{ all -> 0x0092 }
            java.util.List r2 = java.util.Collections.emptyList()     // Catch:{ all -> 0x0092 }
            r1.set(r2)     // Catch:{ all -> 0x0092 }
            java.lang.Object r1 = r8.d     // Catch:{ all -> 0x0090 }
            java.util.concurrent.atomic.AtomicReference r1 = (java.util.concurrent.atomic.AtomicReference) r1     // Catch:{ all -> 0x0090 }
            goto L_0x00c0
        L_0x00ea:
            monitor-exit(r0)     // Catch:{ all -> 0x0090 }
        L_0x00eb:
            return
        L_0x00ec:
            java.lang.Object r2 = r8.d     // Catch:{ all -> 0x0090 }
            java.util.concurrent.atomic.AtomicReference r2 = (java.util.concurrent.atomic.AtomicReference) r2     // Catch:{ all -> 0x0090 }
            r2.notify()     // Catch:{ all -> 0x0090 }
            throw r1     // Catch:{ all -> 0x0090 }
        L_0x00f4:
            monitor-exit(r0)     // Catch:{ all -> 0x0090 }
            throw r1
        L_0x00f6:
            java.lang.Object r0 = r8.f3515f
            T1.L r0 = (T1.L) r0
            java.lang.Object r1 = r8.d
            T1.D0 r1 = (T1.D0) r1
            T1.T1 r2 = r1.f2818a
            r2.j()
            T1.Z1 r3 = r8.f3513c
            java.lang.Object r4 = r8.f3514e
            android.os.Bundle r4 = (android.os.Bundle) r4
            java.util.List r2 = r2.i(r3, r4)
            r0.zze(r2)     // Catch:{ RemoteException -> 0x0111 }
            goto L_0x0121
        L_0x0111:
            r0 = move-exception
            T1.T1 r1 = r1.f2818a
            T1.Z r1 = r1.c()
            T1.X r1 = r1.f3172f
            java.lang.String r2 = r8.f3512b
            java.lang.String r3 = "Failed to return trigger URIs for app"
            r1.c(r3, r2, r0)
        L_0x0121:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: T1.C0215v0.run():void");
    }

    public C0215v0(C0219w1 w1Var, String str, String str2, Z1 z12, zzcy zzcy) {
        this.f3512b = str;
        this.d = str2;
        this.f3513c = z12;
        this.f3514e = zzcy;
        this.f3515f = w1Var;
    }

    public C0215v0(C0219w1 w1Var, AtomicReference atomicReference, String str, String str2, Z1 z12) {
        this.d = atomicReference;
        this.f3512b = str;
        this.f3514e = str2;
        this.f3513c = z12;
        this.f3515f = w1Var;
    }
}
