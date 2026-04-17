package T1;

import A1.a;
import android.os.Bundle;
import com.google.android.gms.internal.measurement.zzcy;
import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;
import java.io.Serializable;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: T1.x0  reason: case insensitive filesystem */
public final /* synthetic */ class C0221x0 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f3533a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f3534b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Object f3535c;
    public final /* synthetic */ Object d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ Object f3536e;

    public C0221x0(A a6, String str, String str2, Bundle bundle) {
        this.f3533a = 8;
        this.f3535c = str;
        this.f3534b = str2;
        this.d = bundle;
        this.f3536e = a6;
    }

    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r27 = this;
            r1 = r27
            int r0 = r1.f3533a
            switch(r0) {
                case 0: goto L_0x0465;
                case 1: goto L_0x0309;
                case 2: goto L_0x02ac;
                case 3: goto L_0x027b;
                case 4: goto L_0x022b;
                case 5: goto L_0x01db;
                case 6: goto L_0x01ac;
                case 7: goto L_0x0153;
                case 8: goto L_0x0120;
                case 9: goto L_0x003e;
                default: goto L_0x0007;
            }
        L_0x0007:
            java.lang.Object r0 = r1.f3534b
            j.d r0 = (j.d) r0
            if (r0 == 0) goto L_0x0024
            java.lang.Object r2 = r1.f3536e
            com.mtma.criminal.city.fragments.gangBase.I r2 = (com.mtma.criminal.city.fragments.gangBase.I) r2
            java.lang.Object r3 = r2.f7143b
            j.e r3 = (j.e) r3
            r4 = 1
            r3.f8691I = r4
            j.k r0 = r0.f8682b
            r3 = 0
            r0.c(r3)
            java.lang.Object r0 = r2.f7143b
            j.e r0 = (j.e) r0
            r0.f8691I = r3
        L_0x0024:
            java.lang.Object r0 = r1.f3535c
            j.m r0 = (j.m) r0
            boolean r2 = r0.isEnabled()
            if (r2 == 0) goto L_0x003d
            boolean r2 = r0.hasSubMenu()
            if (r2 == 0) goto L_0x003d
            java.lang.Object r2 = r1.d
            j.k r2 = (j.k) r2
            r3 = 4
            r4 = 0
            r2.q(r0, r4, r3)
        L_0x003d:
            return
        L_0x003e:
            java.lang.Object r0 = r1.f3536e
            i3.f r0 = (i3.C0590f) r0
            java.lang.Object r2 = r0.f2694b
            n3.m r2 = (n3.m) r2
            java.lang.Object r3 = r1.f3535c
            q3.f r3 = (q3.f) r3
            java.lang.Object r3 = r3.f11091b
            r8 = r3
            q3.k r8 = (q3.k) r8
            c1.i r3 = r2.f10304i
            boolean r4 = r3.y()
            java.lang.Object r0 = r0.f2695c
            n3.g r0 = (n3.C0866g) r0
            java.lang.String r5 = "update: "
            r6 = 0
            r7 = 0
            if (r4 == 0) goto L_0x0070
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>(r5)
            r4.append(r0)
            java.lang.String r4 = r4.toString()
            java.lang.Object[] r9 = new java.lang.Object[r6]
            r3.d(r4, r7, r9)
        L_0x0070:
            c1.i r4 = r2.f10306k
            boolean r9 = r4.y()
            java.lang.Object r10 = r1.d
            r14 = r10
            java.util.Map r14 = (java.util.Map) r14
            if (r9 == 0) goto L_0x0096
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>(r5)
            r9.append(r0)
            java.lang.String r5 = " "
            r9.append(r5)
            r9.append(r14)
            java.lang.String r5 = r9.toString()
            java.lang.Object[] r9 = new java.lang.Object[r6]
            r4.d(r5, r7, r9)
        L_0x0096:
            java.lang.Object r4 = r1.f3534b
            r13 = r4
            n3.b r13 = (n3.C0861b) r13
            q3.e r5 = r13.f10258a
            boolean r4 = r5.isEmpty()
            if (r4 == 0) goto L_0x00b5
            boolean r4 = r3.y()
            if (r4 == 0) goto L_0x00b0
            java.lang.Object[] r4 = new java.lang.Object[r6]
            java.lang.String r5 = "update called with no changes. No-op"
            r3.d(r5, r7, r4)
        L_0x00b0:
            r2.h(r8, r7, r0)
            goto L_0x011f
        L_0x00b5:
            com.mtma.criminal.city.utils.l r3 = r2.f10300b
            java.util.HashMap r3 = R2.b.A(r3)
            n3.y r4 = r2.f10309n
            n3.b r16 = R2.b.H0(r13, r4, r0, r3)
            long r6 = r2.f10307l
            r3 = 1
            long r3 = r3 + r6
            r2.f10307l = r3
            n3.y r3 = r2.f10309n
            r3.getClass()
            n3.u r4 = new n3.u
            r11 = 1
            r9 = r4
            r10 = r3
            r12 = r0
            r17 = r14
            r14 = r6
            r9.<init>(r10, r11, r12, r13, r14, r16)
            p3.a r3 = r3.f10351f
            java.lang.Object r3 = r3.a(r4)
            java.util.List r3 = (java.util.List) r3
            r2.k(r3)
            l3.o r11 = r2.f10301c
            java.util.ArrayList r13 = r0.k()
            n3.h r16 = new n3.h
            r9 = 0
            r3 = r16
            r4 = r2
            r10 = r5
            r5 = r0
            r3.<init>(r4, r5, r6, r8, r9)
            java.lang.String r12 = "m"
            r15 = 0
            r14 = r17
            r11.e(r12, r13, r14, r15, r16)
            java.util.Iterator r3 = r10.iterator()
        L_0x0101:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x011f
            java.lang.Object r4 = r3.next()
            java.util.Map$Entry r4 = (java.util.Map.Entry) r4
            java.lang.Object r4 = r4.getKey()
            n3.g r4 = (n3.C0866g) r4
            n3.g r4 = r0.t(r4)
            n3.g r4 = r2.a(r4)
            r2.n(r4)
            goto L_0x0101
        L_0x011f:
            return
        L_0x0120:
            java.lang.Object r0 = r1.f3536e
            T1.A r0 = (T1.A) r0
            java.lang.Object r0 = r0.f2796b
            T1.T1 r0 = (T1.T1) r0
            T1.Y1 r2 = r0.e()
            G1.a r3 = r0.g()
            G1.b r3 = (G1.b) r3
            r3.getClass()
            long r6 = java.lang.System.currentTimeMillis()
            java.lang.Object r3 = r1.f3534b
            java.lang.String r3 = (java.lang.String) r3
            java.lang.Object r4 = r1.d
            android.os.Bundle r4 = (android.os.Bundle) r4
            java.lang.String r5 = "auto"
            r8 = 0
            T1.v r2 = r2.u(r3, r4, r5, r6, r8)
            com.google.android.gms.common.internal.I.g(r2)
            java.lang.Object r3 = r1.f3535c
            java.lang.String r3 = (java.lang.String) r3
            r0.r(r2, r3)
            return
        L_0x0153:
            java.lang.Object r0 = r1.d
            r2 = r0
            com.google.android.gms.internal.measurement.zzcy r2 = (com.google.android.gms.internal.measurement.zzcy) r2
            java.lang.Object r0 = r1.f3536e
            T1.w1 r0 = (T1.C0219w1) r0
            java.lang.Object r3 = r0.f398a
            T1.u0 r3 = (T1.C0212u0) r3
            r4 = 0
            T1.J r5 = r0.d     // Catch:{ RemoteException -> 0x017c }
            if (r5 != 0) goto L_0x017e
            T1.Z r0 = r3.f3496r     // Catch:{ RemoteException -> 0x017c }
            T1.C0212u0.k(r0)     // Catch:{ RemoteException -> 0x017c }
            T1.X r0 = r0.f3172f     // Catch:{ RemoteException -> 0x017c }
            java.lang.String r5 = "Discarding data. Failed to send event to service to bundle"
            r0.a(r5)     // Catch:{ RemoteException -> 0x017c }
            T1.Y1 r0 = r3.f3499u
            T1.C0212u0.i(r0)
            r0.N(r2, r4)
            goto L_0x01a2
        L_0x017a:
            r0 = move-exception
            goto L_0x01a3
        L_0x017c:
            r0 = move-exception
            goto L_0x018e
        L_0x017e:
            java.lang.Object r6 = r1.f3534b     // Catch:{ RemoteException -> 0x017c }
            T1.v r6 = (T1.C0214v) r6     // Catch:{ RemoteException -> 0x017c }
            java.lang.Object r7 = r1.f3535c     // Catch:{ RemoteException -> 0x017c }
            java.lang.String r7 = (java.lang.String) r7     // Catch:{ RemoteException -> 0x017c }
            byte[] r4 = r5.d(r6, r7)     // Catch:{ RemoteException -> 0x017c }
            r0.E()     // Catch:{ RemoteException -> 0x017c }
            goto L_0x019a
        L_0x018e:
            T1.Z r5 = r3.f3496r     // Catch:{ all -> 0x017a }
            T1.C0212u0.k(r5)     // Catch:{ all -> 0x017a }
            T1.X r5 = r5.f3172f     // Catch:{ all -> 0x017a }
            java.lang.String r6 = "Failed to send event to the service to bundle"
            r5.b(r0, r6)     // Catch:{ all -> 0x017a }
        L_0x019a:
            T1.Y1 r0 = r3.f3499u
            T1.C0212u0.i(r0)
            r0.N(r2, r4)
        L_0x01a2:
            return
        L_0x01a3:
            T1.Y1 r3 = r3.f3499u
            T1.C0212u0.i(r3)
            r3.N(r2, r4)
            throw r0
        L_0x01ac:
            java.lang.Object r0 = r1.f3536e
            com.google.android.gms.measurement.internal.AppMeasurementDynamiteService r0 = (com.google.android.gms.measurement.internal.AppMeasurementDynamiteService) r0
            T1.u0 r0 = r0.f6266a
            T1.w1 r0 = r0.r()
            r0.o()
            r0.p()
            r2 = 0
            T1.Z1 r6 = r0.C(r2)
            T1.v0 r8 = new T1.v0
            java.lang.Object r2 = r1.d
            r5 = r2
            java.lang.String r5 = (java.lang.String) r5
            java.lang.Object r2 = r1.f3534b
            r7 = r2
            com.google.android.gms.internal.measurement.zzcy r7 = (com.google.android.gms.internal.measurement.zzcy) r7
            java.lang.Object r2 = r1.f3535c
            r4 = r2
            java.lang.String r4 = (java.lang.String) r4
            r2 = r8
            r3 = r0
            r2.<init>((T1.C0219w1) r3, (java.lang.String) r4, (java.lang.String) r5, (T1.Z1) r6, (com.google.android.gms.internal.measurement.zzcy) r7)
            r0.F(r8)
            return
        L_0x01db:
            java.lang.Object r0 = r1.f3534b
            r2 = r0
            T1.w1 r2 = (T1.C0219w1) r2
            java.lang.Object r0 = r1.f3535c
            r3 = r0
            java.util.concurrent.atomic.AtomicReference r3 = (java.util.concurrent.atomic.AtomicReference) r3
            java.lang.Object r0 = r1.f3536e
            T1.Z1 r0 = (T1.Z1) r0
            java.lang.Object r4 = r1.d
            T1.M1 r4 = (T1.M1) r4
            monitor-enter(r3)
            T1.J r5 = r2.d     // Catch:{ RemoteException -> 0x0206 }
            if (r5 != 0) goto L_0x0208
            java.lang.Object r0 = r2.f398a     // Catch:{ RemoteException -> 0x0206 }
            T1.u0 r0 = (T1.C0212u0) r0     // Catch:{ RemoteException -> 0x0206 }
            T1.Z r0 = r0.f3496r     // Catch:{ RemoteException -> 0x0206 }
            T1.C0212u0.k(r0)     // Catch:{ RemoteException -> 0x0206 }
            T1.X r0 = r0.f3172f     // Catch:{ RemoteException -> 0x0206 }
            java.lang.String r4 = "[sgtm] Failed to get upload batches; not connected to service"
            r0.a(r4)     // Catch:{ RemoteException -> 0x0206 }
            monitor-exit(r3)     // Catch:{ all -> 0x0204 }
            goto L_0x0228
        L_0x0204:
            r0 = move-exception
            goto L_0x0229
        L_0x0206:
            r0 = move-exception
            goto L_0x0214
        L_0x0208:
            T1.q1 r6 = new T1.q1     // Catch:{ RemoteException -> 0x0206 }
            r6.<init>(r2, r3)     // Catch:{ RemoteException -> 0x0206 }
            r5.l(r0, r4, r6)     // Catch:{ RemoteException -> 0x0206 }
            r2.E()     // Catch:{ RemoteException -> 0x0206 }
            goto L_0x0227
        L_0x0214:
            java.lang.Object r2 = r2.f398a     // Catch:{ all -> 0x0204 }
            T1.u0 r2 = (T1.C0212u0) r2     // Catch:{ all -> 0x0204 }
            T1.Z r2 = r2.f3496r     // Catch:{ all -> 0x0204 }
            T1.C0212u0.k(r2)     // Catch:{ all -> 0x0204 }
            T1.X r2 = r2.f3172f     // Catch:{ all -> 0x0204 }
            java.lang.String r4 = "[sgtm] Failed to get upload batches; remote exception"
            r2.b(r0, r4)     // Catch:{ all -> 0x0204 }
            r3.notifyAll()     // Catch:{ all -> 0x0204 }
        L_0x0227:
            monitor-exit(r3)     // Catch:{ all -> 0x0204 }
        L_0x0228:
            return
        L_0x0229:
            monitor-exit(r3)     // Catch:{ all -> 0x0204 }
            throw r0
        L_0x022b:
            java.lang.Object r0 = r1.f3534b
            r2 = r0
            T1.w1 r2 = (T1.C0219w1) r2
            java.lang.Object r0 = r1.f3535c
            r3 = r0
            java.util.concurrent.atomic.AtomicReference r3 = (java.util.concurrent.atomic.AtomicReference) r3
            java.lang.Object r0 = r1.d
            T1.Z1 r0 = (T1.Z1) r0
            java.lang.Object r4 = r1.f3536e
            android.os.Bundle r4 = (android.os.Bundle) r4
            monitor-enter(r3)
            T1.J r5 = r2.d     // Catch:{ RemoteException -> 0x0256 }
            if (r5 != 0) goto L_0x0258
            java.lang.Object r0 = r2.f398a     // Catch:{ RemoteException -> 0x0256 }
            T1.u0 r0 = (T1.C0212u0) r0     // Catch:{ RemoteException -> 0x0256 }
            T1.Z r0 = r0.f3496r     // Catch:{ RemoteException -> 0x0256 }
            T1.C0212u0.k(r0)     // Catch:{ RemoteException -> 0x0256 }
            T1.X r0 = r0.f3172f     // Catch:{ RemoteException -> 0x0256 }
            java.lang.String r4 = "Failed to request trigger URIs; not connected to service"
            r0.a(r4)     // Catch:{ RemoteException -> 0x0256 }
            monitor-exit(r3)     // Catch:{ all -> 0x0254 }
            goto L_0x0278
        L_0x0254:
            r0 = move-exception
            goto L_0x0279
        L_0x0256:
            r0 = move-exception
            goto L_0x0264
        L_0x0258:
            T1.p1 r6 = new T1.p1     // Catch:{ RemoteException -> 0x0256 }
            r6.<init>(r3)     // Catch:{ RemoteException -> 0x0256 }
            r5.m(r0, r4, r6)     // Catch:{ RemoteException -> 0x0256 }
            r2.E()     // Catch:{ RemoteException -> 0x0256 }
            goto L_0x0277
        L_0x0264:
            java.lang.Object r2 = r2.f398a     // Catch:{ all -> 0x0254 }
            T1.u0 r2 = (T1.C0212u0) r2     // Catch:{ all -> 0x0254 }
            T1.Z r2 = r2.f3496r     // Catch:{ all -> 0x0254 }
            T1.C0212u0.k(r2)     // Catch:{ all -> 0x0254 }
            T1.X r2 = r2.f3172f     // Catch:{ all -> 0x0254 }
            java.lang.String r4 = "Failed to request trigger URIs; remote exception"
            r2.b(r0, r4)     // Catch:{ all -> 0x0254 }
            r3.notifyAll()     // Catch:{ all -> 0x0254 }
        L_0x0277:
            monitor-exit(r3)     // Catch:{ all -> 0x0254 }
        L_0x0278:
            return
        L_0x0279:
            monitor-exit(r3)     // Catch:{ all -> 0x0254 }
            throw r0
        L_0x027b:
            java.lang.Object r0 = r1.f3536e
            T1.b1 r0 = (T1.C0157b1) r0
            java.lang.Object r0 = r0.f398a
            T1.u0 r0 = (T1.C0212u0) r0
            T1.w1 r0 = r0.r()
            r0.o()
            r0.p()
            r2 = 0
            T1.Z1 r7 = r0.C(r2)
            T1.v0 r8 = new T1.v0
            java.lang.Object r2 = r1.f3534b
            r4 = r2
            java.util.concurrent.atomic.AtomicReference r4 = (java.util.concurrent.atomic.AtomicReference) r4
            java.lang.Object r2 = r1.f3535c
            r5 = r2
            java.lang.String r5 = (java.lang.String) r5
            java.lang.Object r2 = r1.d
            r6 = r2
            java.lang.String r6 = (java.lang.String) r6
            r2 = r8
            r3 = r0
            r2.<init>((T1.C0219w1) r3, (java.util.concurrent.atomic.AtomicReference) r4, (java.lang.String) r5, (java.lang.String) r6, (T1.Z1) r7)
            r0.F(r8)
            return
        L_0x02ac:
            java.lang.Object r0 = r1.f3536e
            com.google.android.gms.measurement.internal.AppMeasurementDynamiteService r0 = (com.google.android.gms.measurement.internal.AppMeasurementDynamiteService) r0
            T1.u0 r0 = r0.f6266a
            T1.w1 r0 = r0.r()
            r0.o()
            r0.p()
            java.lang.Object r2 = r0.f398a
            T1.u0 r2 = (T1.C0212u0) r2
            T1.Y1 r3 = r2.f3499u
            T1.C0212u0.i(r3)
            z1.f r4 = z1.f.f12811b
            java.lang.Object r3 = r3.f398a
            T1.u0 r3 = (T1.C0212u0) r3
            android.content.Context r3 = r3.f3489a
            r5 = 12451000(0xbdfcb8, float:1.7447567E-38)
            int r3 = r4.c(r3, r5)
            java.lang.Object r4 = r1.f3534b
            r6 = r4
            com.google.android.gms.internal.measurement.zzcy r6 = (com.google.android.gms.internal.measurement.zzcy) r6
            if (r3 == 0) goto L_0x02f3
            T1.Z r0 = r2.f3496r
            T1.C0212u0.k(r0)
            java.lang.String r3 = "Not bundling data. Service unavailable or out of date"
            T1.X r0 = r0.f3175r
            r0.a(r3)
            T1.Y1 r0 = r2.f3499u
            T1.C0212u0.i(r0)
            r2 = 0
            byte[] r2 = new byte[r2]
            r0.N(r6, r2)
            goto L_0x0308
        L_0x02f3:
            T1.x0 r8 = new T1.x0
            java.lang.Object r2 = r1.d
            r4 = r2
            T1.v r4 = (T1.C0214v) r4
            java.lang.Object r2 = r1.f3535c
            r5 = r2
            java.lang.String r5 = (java.lang.String) r5
            r7 = 7
            r2 = r8
            r3 = r0
            r2.<init>((java.lang.Object) r3, (java.lang.Object) r4, (java.lang.Object) r5, (java.lang.Object) r6, (int) r7)
            r0.F(r8)
        L_0x0308:
            return
        L_0x0309:
            java.lang.Object r0 = r1.f3534b
            T1.D0 r0 = (T1.D0) r0
            T1.T1 r2 = r0.f2818a
            T1.g r3 = r2.h0()
            T1.G r4 = T1.H.f2900c1
            r5 = 0
            boolean r3 = r3.B(r5, r4)
            T1.g r4 = r2.h0()
            T1.G r6 = T1.H.f2905e1
            boolean r4 = r4.B(r5, r6)
            java.lang.Object r6 = r1.d
            android.os.Bundle r6 = (android.os.Bundle) r6
            boolean r7 = r6.isEmpty()
            java.lang.Object r8 = r1.f3535c
            r14 = r8
            java.lang.String r14 = (java.lang.String) r14
            T1.T1 r15 = r0.f2818a
            if (r7 == 0) goto L_0x0364
            if (r3 == 0) goto L_0x0364
            T1.n r2 = r15.f3062c
            T1.T1.L(r2)
            r2.o()
            r2.p()
            android.database.sqlite.SQLiteDatabase r0 = r2.k0()     // Catch:{ SQLiteException -> 0x0351 }
            java.lang.String r3 = "delete from default_event_params where app_id=?"
            java.lang.String[] r4 = new java.lang.String[]{r14}     // Catch:{ SQLiteException -> 0x0351 }
            r0.execSQL(r3, r4)     // Catch:{ SQLiteException -> 0x0351 }
            goto L_0x0464
        L_0x0351:
            r0 = move-exception
            java.lang.Object r2 = r2.f398a
            T1.u0 r2 = (T1.C0212u0) r2
            T1.Z r2 = r2.f3496r
            T1.C0212u0.k(r2)
            java.lang.String r3 = "Error clearing default event params"
            T1.X r2 = r2.f3172f
            r2.b(r0, r3)
            goto L_0x0464
        L_0x0364:
            T1.n r0 = r2.f3062c
            T1.T1.L(r0)
            r0.o()
            r0.p()
            T1.r r2 = new T1.r
            r12 = 0
            r16 = 0
            java.lang.Object r3 = r0.f398a
            r8 = r3
            T1.u0 r8 = (T1.C0212u0) r8
            java.lang.String r9 = ""
            java.lang.String r11 = "dep"
            r7 = r2
            r10 = r14
            r3 = r14
            r18 = r15
            r14 = r16
            r16 = r6
            r7.<init>((T1.C0212u0) r8, (java.lang.String) r9, (java.lang.String) r10, (java.lang.String) r11, (long) r12, (long) r14, (android.os.Bundle) r16)
            T1.T1 r7 = r0.f2982b
            T1.d0 r7 = r7.f3065p
            T1.T1.L(r7)
            com.google.android.gms.internal.measurement.zzhm r2 = r7.T(r2)
            byte[] r2 = r2.zzcd()
            java.lang.Object r7 = r0.f398a
            T1.u0 r7 = (T1.C0212u0) r7
            T1.Z r7 = r7.f3496r
            T1.C0212u0.k(r7)
            int r8 = r2.length
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            java.lang.String r9 = "Saving default event parameters, appId, data size"
            T1.X r10 = r7.f3180w
            r10.c(r9, r3, r8)
            android.content.ContentValues r8 = new android.content.ContentValues
            r8.<init>()
            java.lang.String r9 = "app_id"
            r8.put(r9, r3)
            java.lang.String r9 = "parameters"
            r8.put(r9, r2)
            android.database.sqlite.SQLiteDatabase r0 = r0.k0()     // Catch:{ SQLiteException -> 0x03df }
            java.lang.String r2 = "default_event_params"
            r9 = 5
            long r8 = r0.insertWithOnConflict(r2, r5, r8, r9)     // Catch:{ SQLiteException -> 0x03df }
            r10 = -1
            int r0 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r0 != 0) goto L_0x03dc
            T1.C0212u0.k(r7)     // Catch:{ SQLiteException -> 0x03df }
            T1.X r0 = r7.f3172f     // Catch:{ SQLiteException -> 0x03df }
            java.lang.String r2 = "Failed to insert default event parameters (got -1). appId"
            T1.Y r8 = T1.Z.w(r3)     // Catch:{ SQLiteException -> 0x03df }
            r0.b(r8, r2)     // Catch:{ SQLiteException -> 0x03df }
        L_0x03dc:
            r2 = r18
            goto L_0x03ef
        L_0x03df:
            r0 = move-exception
            T1.C0212u0.k(r7)
            T1.Y r2 = T1.Z.w(r3)
            java.lang.String r8 = "Error storing default event parameters. appId"
            T1.X r7 = r7.f3172f
            r7.c(r8, r2, r0)
            goto L_0x03dc
        L_0x03ef:
            T1.n r0 = r2.f3062c
            T1.T1.L(r0)
            java.lang.Object r7 = r1.f3536e
            T1.Z1 r7 = (T1.Z1) r7
            long r7 = r7.f3199O
            java.lang.Object r9 = r0.f398a
            T1.u0 r9 = (T1.C0212u0) r9
            T1.g r10 = r9.f3494p
            T1.G r11 = T1.H.f2905e1
            boolean r10 = r10.B(r5, r11)
            if (r10 != 0) goto L_0x0418
            G1.b r10 = r9.f3501w
            r10.getClass()
            long r10 = java.lang.System.currentTimeMillis()
            r12 = 15000(0x3a98, double:7.411E-320)
            long r12 = r12 + r7
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 > 0) goto L_0x0464
        L_0x0418:
            java.lang.String r10 = "select count(*) from raw_events where app_id=? and timestamp >= ? and name not like '!_%' escape '!' limit 1;"
            java.lang.String r11 = java.lang.String.valueOf(r7)     // Catch:{ SQLiteException -> 0x0457 }
            java.lang.String[] r11 = new java.lang.String[]{r3, r11}     // Catch:{ SQLiteException -> 0x0457 }
            r12 = 0
            long r10 = r0.g0(r10, r11, r12)     // Catch:{ SQLiteException -> 0x0457 }
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 <= 0) goto L_0x042d
            goto L_0x0464
        L_0x042d:
            java.lang.String r10 = "select count(*) from raw_events where app_id=? and timestamp >= ? and name like '!_%' escape '!' limit 1;"
            java.lang.String r11 = java.lang.String.valueOf(r7)     // Catch:{ SQLiteException -> 0x0457 }
            java.lang.String[] r11 = new java.lang.String[]{r3, r11}     // Catch:{ SQLiteException -> 0x0457 }
            long r9 = r0.g0(r10, r11, r12)     // Catch:{ SQLiteException -> 0x0457 }
            int r0 = (r9 > r12 ? 1 : (r9 == r12 ? 0 : -1))
            if (r0 <= 0) goto L_0x0464
            if (r4 == 0) goto L_0x044e
            T1.n r0 = r2.f3062c
            T1.T1.L(r0)
            java.lang.Long r2 = java.lang.Long.valueOf(r7)
            r0.y(r3, r2, r5, r6)
            goto L_0x0464
        L_0x044e:
            T1.n r0 = r2.f3062c
            T1.T1.L(r0)
            r0.y(r3, r5, r5, r6)
            goto L_0x0464
        L_0x0457:
            r0 = move-exception
            T1.Z r2 = r9.f3496r
            T1.C0212u0.k(r2)
            java.lang.String r3 = "Error checking backfill conditions"
            T1.X r2 = r2.f3172f
            r2.b(r0, r3)
        L_0x0464:
            return
        L_0x0465:
            java.lang.Object r0 = r1.f3536e
            T1.N r0 = (T1.N) r0
            java.lang.Object r2 = r1.f3534b
            T1.D0 r2 = (T1.D0) r2
            T1.T1 r2 = r2.f2818a
            r2.j()
            T1.g r3 = r2.h0()
            T1.G r4 = T1.H.f2872P0
            r5 = 0
            boolean r3 = r3.B(r5, r4)
            java.lang.Object r4 = r1.f3535c
            java.lang.String r4 = (java.lang.String) r4
            if (r3 != 0) goto L_0x048e
            T1.N1 r3 = new T1.N1
            java.util.List r5 = java.util.Collections.emptyList()
            r3.<init>(r5)
            goto L_0x0615
        L_0x048e:
            T1.r0 r3 = r2.f()
            r3.o()
            r2.k()
            T1.n r3 = r2.f3062c
            T1.T1.L(r3)
            T1.G r6 = T1.H.f2846B
            java.lang.Object r6 = r6.a(r5)
            java.lang.Integer r6 = (java.lang.Integer) r6
            int r6 = r6.intValue()
            java.lang.Object r7 = r1.d
            T1.M1 r7 = (T1.M1) r7
            java.util.List r3 = r3.v(r4, r7, r6)
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            java.util.Iterator r3 = r3.iterator()
        L_0x04ba:
            boolean r7 = r3.hasNext()
            if (r7 == 0) goto L_0x060f
            java.lang.Object r7 = r3.next()
            T1.U1 r7 = (T1.U1) r7
            java.lang.String r8 = r7.f3081c
            boolean r8 = r2.c0(r4, r8)
            long r9 = r7.f3079a
            if (r8 != 0) goto L_0x04e2
            T1.Z r8 = r2.c()
            java.lang.Long r9 = java.lang.Long.valueOf(r9)
            java.lang.String r7 = r7.f3081c
            java.lang.String r10 = "[sgtm] batch skipped due to destination in backoff. appId, rowId, url"
            T1.X r8 = r8.f3180w
            r8.d(r10, r4, r9, r7)
            goto L_0x04ba
        L_0x04e2:
            int r8 = r7.h
            if (r8 > 0) goto L_0x04e9
            r16 = r6
            goto L_0x0534
        L_0x04e9:
            T1.G r11 = T1.H.f2955z
            java.lang.Object r11 = r11.a(r5)
            java.lang.Integer r11 = (java.lang.Integer) r11
            int r11 = r11.intValue()
            long r12 = r7.g
            if (r8 <= r11) goto L_0x04fc
            r5 = r6
            goto L_0x05fb
        L_0x04fc:
            T1.G r11 = T1.H.f2951x
            java.lang.Object r11 = r11.a(r5)
            java.lang.Long r11 = (java.lang.Long) r11
            long r14 = r11.longValue()
            int r8 = r8 + -1
            r16 = 1
            long r16 = r16 << r8
            long r14 = r14 * r16
            T1.G r8 = T1.H.f2953y
            java.lang.Object r8 = r8.a(r5)
            java.lang.Long r8 = (java.lang.Long) r8
            r16 = r6
            long r5 = r8.longValue()
            long r5 = java.lang.Math.min(r14, r5)
            G1.a r8 = r2.g()
            G1.b r8 = (G1.b) r8
            r8.getClass()
            long r14 = java.lang.System.currentTimeMillis()
            long r5 = r5 + r12
            int r5 = (r14 > r5 ? 1 : (r14 == r5 ? 0 : -1))
            if (r5 < 0) goto L_0x05f9
        L_0x0534:
            android.os.Bundle r5 = new android.os.Bundle
            r5.<init>()
            java.util.HashMap r6 = r7.d
            java.util.Set r6 = r6.entrySet()
            java.util.Iterator r6 = r6.iterator()
        L_0x0543:
            boolean r8 = r6.hasNext()
            if (r8 == 0) goto L_0x055f
            java.lang.Object r8 = r6.next()
            java.util.Map$Entry r8 = (java.util.Map.Entry) r8
            java.lang.Object r9 = r8.getKey()
            java.lang.String r9 = (java.lang.String) r9
            java.lang.Object r8 = r8.getValue()
            java.lang.String r8 = (java.lang.String) r8
            r5.putString(r9, r8)
            goto L_0x0543
        L_0x055f:
            T1.L1 r6 = new T1.L1
            com.google.android.gms.internal.measurement.zzhv r8 = r7.f3080b
            byte[] r20 = r8.zzcd()
            T1.i1 r8 = r7.f3082e
            java.lang.String r9 = r7.f3081c
            long r12 = r7.f3083f
            long r14 = r7.f3079a
            int r7 = r8.f3347a
            java.lang.String r26 = ""
            r17 = r6
            r18 = r14
            r21 = r9
            r22 = r5
            r23 = r7
            r24 = r12
            r17.<init>(r18, r20, r21, r22, r23, r24, r26)
            com.google.android.gms.internal.measurement.zzht r5 = com.google.android.gms.internal.measurement.zzhv.zzb()     // Catch:{ zzmm -> 0x05b5 }
            byte[] r7 = r6.f2984b     // Catch:{ zzmm -> 0x05b5 }
            com.google.android.gms.internal.measurement.zzng r5 = T1.C0162d0.U(r5, r7)     // Catch:{ zzmm -> 0x05b5 }
            com.google.android.gms.internal.measurement.zzht r5 = (com.google.android.gms.internal.measurement.zzht) r5     // Catch:{ zzmm -> 0x05b5 }
            r7 = 0
        L_0x058f:
            int r8 = r5.zza()     // Catch:{ zzmm -> 0x05b5 }
            if (r7 >= r8) goto L_0x05b8
            com.google.android.gms.internal.measurement.zzhx r8 = r5.zzh(r7)     // Catch:{ zzmm -> 0x05b5 }
            com.google.android.gms.internal.measurement.zzlz r8 = r8.zzch()     // Catch:{ zzmm -> 0x05b5 }
            com.google.android.gms.internal.measurement.zzhw r8 = (com.google.android.gms.internal.measurement.zzhw) r8     // Catch:{ zzmm -> 0x05b5 }
            G1.a r9 = r2.g()     // Catch:{ zzmm -> 0x05b5 }
            G1.b r9 = (G1.b) r9     // Catch:{ zzmm -> 0x05b5 }
            r9.getClass()     // Catch:{ zzmm -> 0x05b5 }
            long r9 = java.lang.System.currentTimeMillis()     // Catch:{ zzmm -> 0x05b5 }
            r8.zzaA(r9)     // Catch:{ zzmm -> 0x05b5 }
            r5.zze(r7, r8)     // Catch:{ zzmm -> 0x05b5 }
            int r7 = r7 + 1
            goto L_0x058f
        L_0x05b5:
            r5 = r16
            goto L_0x05ed
        L_0x05b8:
            com.google.android.gms.internal.measurement.zzmd r7 = r5.zzba()     // Catch:{ zzmm -> 0x05b5 }
            com.google.android.gms.internal.measurement.zzhv r7 = (com.google.android.gms.internal.measurement.zzhv) r7     // Catch:{ zzmm -> 0x05b5 }
            byte[] r7 = r7.zzcd()     // Catch:{ zzmm -> 0x05b5 }
            r6.f2984b = r7     // Catch:{ zzmm -> 0x05b5 }
            T1.Z r7 = r2.c()     // Catch:{ zzmm -> 0x05b5 }
            java.lang.String r7 = r7.z()     // Catch:{ zzmm -> 0x05b5 }
            r8 = 2
            boolean r7 = android.util.Log.isLoggable(r7, r8)     // Catch:{ zzmm -> 0x05b5 }
            if (r7 == 0) goto L_0x05e4
            T1.d0 r7 = r2.f3065p     // Catch:{ zzmm -> 0x05b5 }
            T1.T1.L(r7)     // Catch:{ zzmm -> 0x05b5 }
            com.google.android.gms.internal.measurement.zzmd r5 = r5.zzba()     // Catch:{ zzmm -> 0x05b5 }
            com.google.android.gms.internal.measurement.zzhv r5 = (com.google.android.gms.internal.measurement.zzhv) r5     // Catch:{ zzmm -> 0x05b5 }
            java.lang.String r5 = r7.V(r5)     // Catch:{ zzmm -> 0x05b5 }
            r6.f2988p = r5     // Catch:{ zzmm -> 0x05b5 }
        L_0x05e4:
            r5 = r16
            r5.add(r6)
        L_0x05e9:
            r6 = r5
            r5 = 0
            goto L_0x04ba
        L_0x05ed:
            T1.Z r6 = r2.c()
            java.lang.String r7 = "Failed to parse queued batch. appId"
            T1.X r6 = r6.f3175r
            r6.b(r4, r7)
            goto L_0x05e9
        L_0x05f9:
            r5 = r16
        L_0x05fb:
            T1.Z r6 = r2.c()
            java.lang.Long r7 = java.lang.Long.valueOf(r9)
            java.lang.Long r8 = java.lang.Long.valueOf(r12)
            java.lang.String r9 = "[sgtm] batch skipped waiting for next retry. appId, rowId, lastUploadMillis"
            T1.X r6 = r6.f3180w
            r6.d(r9, r4, r7, r8)
            goto L_0x05e9
        L_0x060f:
            r5 = r6
            T1.N1 r3 = new T1.N1
            r3.<init>(r5)
        L_0x0615:
            r0.x(r3)     // Catch:{ RemoteException -> 0x062e }
            T1.Z r0 = r2.c()     // Catch:{ RemoteException -> 0x062e }
            T1.X r0 = r0.f3180w     // Catch:{ RemoteException -> 0x062e }
            java.lang.String r5 = "[sgtm] Sending queued upload batches to client. appId, count"
            java.util.List r3 = r3.f2997a     // Catch:{ RemoteException -> 0x062e }
            int r3 = r3.size()     // Catch:{ RemoteException -> 0x062e }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ RemoteException -> 0x062e }
            r0.c(r5, r4, r3)     // Catch:{ RemoteException -> 0x062e }
            goto L_0x063a
        L_0x062e:
            r0 = move-exception
            T1.Z r2 = r2.c()
            java.lang.String r3 = "[sgtm] Failed to return upload batches for app"
            T1.X r2 = r2.f3172f
            r2.c(r3, r4, r0)
        L_0x063a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: T1.C0221x0.run():void");
    }

    public /* synthetic */ C0221x0(D0 d02, Bundle bundle, String str, Z1 z12) {
        this.f3533a = 1;
        this.f3534b = d02;
        this.d = bundle;
        this.f3535c = str;
        this.f3536e = z12;
    }

    public /* synthetic */ C0221x0(C0219w1 w1Var, AtomicReference atomicReference, Z1 z12, M1 m12) {
        this.f3533a = 5;
        this.f3534b = w1Var;
        this.f3535c = atomicReference;
        this.f3536e = z12;
        this.d = m12;
    }

    public C0221x0(AppMeasurementDynamiteService appMeasurementDynamiteService, zzcy zzcy, C0214v vVar, String str) {
        this.f3533a = 2;
        this.f3534b = zzcy;
        this.d = vVar;
        this.f3535c = str;
        this.f3536e = appMeasurementDynamiteService;
    }

    public /* synthetic */ C0221x0(Object obj, Serializable serializable, a aVar, Object obj2, int i2) {
        this.f3533a = i2;
        this.f3534b = obj;
        this.f3535c = serializable;
        this.d = aVar;
        this.f3536e = obj2;
    }

    public /* synthetic */ C0221x0(Object obj, Object obj2, Object obj3, Object obj4, int i2) {
        this.f3533a = i2;
        this.f3534b = obj2;
        this.f3535c = obj3;
        this.d = obj4;
        this.f3536e = obj;
    }
}
