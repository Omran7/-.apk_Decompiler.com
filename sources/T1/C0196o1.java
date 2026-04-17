package T1;

import com.google.android.gms.internal.measurement.zzcy;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: T1.o1  reason: case insensitive filesystem */
public final class C0196o1 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f3418a = 0;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ String f3419b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ String f3420c;
    public final /* synthetic */ Z1 d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ boolean f3421e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ C0219w1 f3422f;

    /* renamed from: p  reason: collision with root package name */
    public final /* synthetic */ Object f3423p;

    public C0196o1(C0219w1 w1Var, String str, String str2, Z1 z12, boolean z3, zzcy zzcy) {
        this.f3419b = str;
        this.f3420c = str2;
        this.d = z12;
        this.f3421e = z3;
        this.f3423p = zzcy;
        this.f3422f = w1Var;
    }

    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r10 = this;
            int r0 = r10.f3418a
            switch(r0) {
                case 0: goto L_0x0095;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r0 = r10.f3423p
            java.util.concurrent.atomic.AtomicReference r0 = (java.util.concurrent.atomic.AtomicReference) r0
            monitor-enter(r0)
            r1 = 0
            T1.w1 r2 = r10.f3422f     // Catch:{ RemoteException -> 0x0035 }
            T1.J r3 = r2.d     // Catch:{ RemoteException -> 0x0035 }
            if (r3 != 0) goto L_0x0037
            java.lang.Object r2 = r2.f398a     // Catch:{ RemoteException -> 0x0035 }
            T1.u0 r2 = (T1.C0212u0) r2     // Catch:{ RemoteException -> 0x0035 }
            T1.Z r2 = r2.f3496r     // Catch:{ RemoteException -> 0x0035 }
            T1.C0212u0.k(r2)     // Catch:{ RemoteException -> 0x0035 }
            T1.X r2 = r2.f3172f     // Catch:{ RemoteException -> 0x0035 }
            java.lang.String r3 = "(legacy) Failed to get user properties; not connected to service"
            java.lang.String r4 = r10.f3419b     // Catch:{ RemoteException -> 0x0035 }
            java.lang.String r5 = r10.f3420c     // Catch:{ RemoteException -> 0x0035 }
            r2.d(r3, r1, r4, r5)     // Catch:{ RemoteException -> 0x0035 }
            java.util.List r2 = java.util.Collections.emptyList()     // Catch:{ RemoteException -> 0x0035 }
            r0.set(r2)     // Catch:{ RemoteException -> 0x0035 }
            r0.notify()     // Catch:{ all -> 0x0031 }
            monitor-exit(r0)     // Catch:{ all -> 0x0031 }
            goto L_0x008a
        L_0x0031:
            r1 = move-exception
            goto L_0x0093
        L_0x0033:
            r1 = move-exception
            goto L_0x008b
        L_0x0035:
            r2 = move-exception
            goto L_0x0065
        L_0x0037:
            boolean r4 = android.text.TextUtils.isEmpty(r1)     // Catch:{ RemoteException -> 0x0035 }
            if (r4 == 0) goto L_0x004d
            T1.Z1 r4 = r10.d     // Catch:{ RemoteException -> 0x0035 }
            java.lang.String r5 = r10.f3419b     // Catch:{ RemoteException -> 0x0035 }
            java.lang.String r6 = r10.f3420c     // Catch:{ RemoteException -> 0x0035 }
            boolean r7 = r10.f3421e     // Catch:{ RemoteException -> 0x0035 }
            java.util.List r3 = r3.f(r5, r6, r7, r4)     // Catch:{ RemoteException -> 0x0035 }
            r0.set(r3)     // Catch:{ RemoteException -> 0x0035 }
            goto L_0x005a
        L_0x004d:
            java.lang.String r4 = r10.f3419b     // Catch:{ RemoteException -> 0x0035 }
            java.lang.String r5 = r10.f3420c     // Catch:{ RemoteException -> 0x0035 }
            boolean r6 = r10.f3421e     // Catch:{ RemoteException -> 0x0035 }
            java.util.List r3 = r3.A(r1, r4, r5, r6)     // Catch:{ RemoteException -> 0x0035 }
            r0.set(r3)     // Catch:{ RemoteException -> 0x0035 }
        L_0x005a:
            r2.E()     // Catch:{ RemoteException -> 0x0035 }
            java.lang.Object r1 = r10.f3423p     // Catch:{ all -> 0x0031 }
            java.util.concurrent.atomic.AtomicReference r1 = (java.util.concurrent.atomic.AtomicReference) r1     // Catch:{ all -> 0x0031 }
        L_0x0061:
            r1.notify()     // Catch:{ all -> 0x0031 }
            goto L_0x0089
        L_0x0065:
            T1.w1 r3 = r10.f3422f     // Catch:{ all -> 0x0033 }
            java.lang.Object r3 = r3.f398a     // Catch:{ all -> 0x0033 }
            T1.u0 r3 = (T1.C0212u0) r3     // Catch:{ all -> 0x0033 }
            T1.Z r3 = r3.f3496r     // Catch:{ all -> 0x0033 }
            T1.C0212u0.k(r3)     // Catch:{ all -> 0x0033 }
            T1.X r3 = r3.f3172f     // Catch:{ all -> 0x0033 }
            java.lang.String r4 = "(legacy) Failed to get user properties; remote exception"
            java.lang.String r5 = r10.f3419b     // Catch:{ all -> 0x0033 }
            r3.d(r4, r1, r5, r2)     // Catch:{ all -> 0x0033 }
            java.lang.Object r1 = r10.f3423p     // Catch:{ all -> 0x0033 }
            java.util.concurrent.atomic.AtomicReference r1 = (java.util.concurrent.atomic.AtomicReference) r1     // Catch:{ all -> 0x0033 }
            java.util.List r2 = java.util.Collections.emptyList()     // Catch:{ all -> 0x0033 }
            r1.set(r2)     // Catch:{ all -> 0x0033 }
            java.lang.Object r1 = r10.f3423p     // Catch:{ all -> 0x0031 }
            java.util.concurrent.atomic.AtomicReference r1 = (java.util.concurrent.atomic.AtomicReference) r1     // Catch:{ all -> 0x0031 }
            goto L_0x0061
        L_0x0089:
            monitor-exit(r0)     // Catch:{ all -> 0x0031 }
        L_0x008a:
            return
        L_0x008b:
            java.lang.Object r2 = r10.f3423p     // Catch:{ all -> 0x0031 }
            java.util.concurrent.atomic.AtomicReference r2 = (java.util.concurrent.atomic.AtomicReference) r2     // Catch:{ all -> 0x0031 }
            r2.notify()     // Catch:{ all -> 0x0031 }
            throw r1     // Catch:{ all -> 0x0031 }
        L_0x0093:
            monitor-exit(r0)     // Catch:{ all -> 0x0031 }
            throw r1
        L_0x0095:
            java.lang.String r0 = r10.f3419b
            java.lang.Object r1 = r10.f3423p
            com.google.android.gms.internal.measurement.zzcy r1 = (com.google.android.gms.internal.measurement.zzcy) r1
            T1.w1 r2 = r10.f3422f
            java.lang.Object r3 = r2.f398a
            T1.u0 r3 = (T1.C0212u0) r3
            android.os.Bundle r4 = new android.os.Bundle
            r4.<init>()
            T1.J r5 = r2.d     // Catch:{ RemoteException -> 0x00c5 }
            java.lang.String r6 = r10.f3420c
            if (r5 != 0) goto L_0x00c7
            T1.Z r2 = r3.f3496r     // Catch:{ RemoteException -> 0x00c5 }
            T1.C0212u0.k(r2)     // Catch:{ RemoteException -> 0x00c5 }
            T1.X r2 = r2.f3172f     // Catch:{ RemoteException -> 0x00c5 }
            java.lang.String r5 = "Failed to get user properties; not connected to service"
            r2.c(r5, r0, r6)     // Catch:{ RemoteException -> 0x00c5 }
            T1.Y1 r0 = r3.f3499u
        L_0x00ba:
            T1.C0212u0.i(r0)
            r0.M(r1, r4)
            goto L_0x0129
        L_0x00c2:
            r0 = move-exception
            goto L_0x012a
        L_0x00c5:
            r2 = move-exception
            goto L_0x011a
        L_0x00c7:
            T1.Z1 r7 = r10.d     // Catch:{ RemoteException -> 0x00c5 }
            boolean r8 = r10.f3421e     // Catch:{ RemoteException -> 0x00c5 }
            java.util.List r5 = r5.f(r0, r6, r8, r7)     // Catch:{ RemoteException -> 0x00c5 }
            android.os.Bundle r6 = new android.os.Bundle     // Catch:{ RemoteException -> 0x00c5 }
            r6.<init>()     // Catch:{ RemoteException -> 0x00c5 }
            if (r5 != 0) goto L_0x00d7
            goto L_0x0109
        L_0x00d7:
            java.util.Iterator r5 = r5.iterator()     // Catch:{ RemoteException -> 0x00c5 }
        L_0x00db:
            boolean r7 = r5.hasNext()     // Catch:{ RemoteException -> 0x00c5 }
            if (r7 == 0) goto L_0x0109
            java.lang.Object r7 = r5.next()     // Catch:{ RemoteException -> 0x00c5 }
            T1.W1 r7 = (T1.W1) r7     // Catch:{ RemoteException -> 0x00c5 }
            java.lang.String r8 = r7.f3142e     // Catch:{ RemoteException -> 0x00c5 }
            java.lang.String r9 = r7.f3140b
            if (r8 == 0) goto L_0x00f1
            r6.putString(r9, r8)     // Catch:{ RemoteException -> 0x00c5 }
            goto L_0x00db
        L_0x00f1:
            java.lang.Long r8 = r7.d     // Catch:{ RemoteException -> 0x00c5 }
            if (r8 == 0) goto L_0x00fd
            long r7 = r8.longValue()     // Catch:{ RemoteException -> 0x00c5 }
            r6.putLong(r9, r7)     // Catch:{ RemoteException -> 0x00c5 }
            goto L_0x00db
        L_0x00fd:
            java.lang.Double r7 = r7.f3144p     // Catch:{ RemoteException -> 0x00c5 }
            if (r7 == 0) goto L_0x00db
            double r7 = r7.doubleValue()     // Catch:{ RemoteException -> 0x00c5 }
            r6.putDouble(r9, r7)     // Catch:{ RemoteException -> 0x00c5 }
            goto L_0x00db
        L_0x0109:
            r2.E()     // Catch:{ RemoteException -> 0x0118, all -> 0x0115 }
            T1.Y1 r0 = r3.f3499u
            T1.C0212u0.i(r0)
            r0.M(r1, r6)
            goto L_0x0129
        L_0x0115:
            r0 = move-exception
            r4 = r6
            goto L_0x012a
        L_0x0118:
            r2 = move-exception
            r4 = r6
        L_0x011a:
            T1.Z r5 = r3.f3496r     // Catch:{ all -> 0x00c2 }
            T1.C0212u0.k(r5)     // Catch:{ all -> 0x00c2 }
            T1.X r5 = r5.f3172f     // Catch:{ all -> 0x00c2 }
            java.lang.String r6 = "Failed to get user properties; remote exception"
            r5.c(r6, r0, r2)     // Catch:{ all -> 0x00c2 }
            T1.Y1 r0 = r3.f3499u
            goto L_0x00ba
        L_0x0129:
            return
        L_0x012a:
            T1.Y1 r2 = r3.f3499u
            T1.C0212u0.i(r2)
            r2.M(r1, r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: T1.C0196o1.run():void");
    }

    public C0196o1(C0219w1 w1Var, AtomicReference atomicReference, String str, String str2, Z1 z12, boolean z3) {
        this.f3423p = atomicReference;
        this.f3419b = str;
        this.f3420c = str2;
        this.d = z12;
        this.f3421e = z3;
        this.f3422f = w1Var;
    }
}
