package T1;

import B0.C0004c;
import B2.a;
import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.DeadObjectException;
import com.google.android.gms.common.internal.C0373b;
import com.google.android.gms.common.internal.C0374c;
import com.google.android.gms.common.internal.I;
import z1.C1132b;

/* renamed from: T1.v1  reason: case insensitive filesystem */
public final class C0216v1 implements ServiceConnection, C0373b, C0374c {

    /* renamed from: a  reason: collision with root package name */
    public volatile boolean f3516a;

    /* renamed from: b  reason: collision with root package name */
    public volatile T f3517b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ C0219w1 f3518c;

    public C0216v1(C0219w1 w1Var) {
        this.f3518c = w1Var;
    }

    public final void a(int i2) {
        C0212u0 u0Var = (C0212u0) this.f3518c.f398a;
        C0203r0 r0Var = u0Var.f3497s;
        C0212u0.k(r0Var);
        r0Var.w();
        Z z3 = u0Var.f3496r;
        C0212u0.k(z3);
        z3.f3179v.a("Service connection suspended");
        C0203r0 r0Var2 = u0Var.f3497s;
        C0212u0.k(r0Var2);
        r0Var2.y(new C0004c((Object) this, 6));
    }

    public final void b(C1132b bVar) {
        C0219w1 w1Var = this.f3518c;
        C0203r0 r0Var = ((C0212u0) w1Var.f398a).f3497s;
        C0212u0.k(r0Var);
        r0Var.w();
        Z z3 = ((C0212u0) w1Var.f398a).f3496r;
        if (z3 == null || !z3.f2825b) {
            z3 = null;
        }
        if (z3 != null) {
            z3.f3175r.b(bVar, "Service connection failed");
        }
        synchronized (this) {
            this.f3516a = false;
            this.f3517b = null;
        }
        C0203r0 r0Var2 = ((C0212u0) this.f3518c.f398a).f3497s;
        C0212u0.k(r0Var2);
        r0Var2.y(new a(this, bVar, 19, false));
    }

    public final void d(Bundle bundle) {
        C0203r0 r0Var = ((C0212u0) this.f3518c.f398a).f3497s;
        C0212u0.k(r0Var);
        r0Var.w();
        synchronized (this) {
            try {
                I.g(this.f3517b);
                C0203r0 r0Var2 = ((C0212u0) this.f3518c.f398a).f3497s;
                C0212u0.k(r0Var2);
                r0Var2.y(new C0213u1(this, (J) this.f3517b.getService(), 1));
            } catch (DeadObjectException | IllegalStateException unused) {
                this.f3517b = null;
                this.f3516a = false;
            }
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(2:20|21) */
    /* JADX WARNING: Code restructure failed: missing block: B:21:?, code lost:
        r5 = ((T1.C0212u0) r3.f3518c.f398a).f3496r;
        T1.C0212u0.k(r5);
        r5.f3172f.a("Service connect failed to get IMeasurementService");
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:20:0x0072 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onServiceConnected(android.content.ComponentName r4, android.os.IBinder r5) {
        /*
            r3 = this;
            T1.w1 r4 = r3.f3518c
            java.lang.Object r4 = r4.f398a
            T1.u0 r4 = (T1.C0212u0) r4
            T1.r0 r4 = r4.f3497s
            T1.C0212u0.k(r4)
            r4.w()
            monitor-enter(r3)
            r4 = 0
            if (r5 != 0) goto L_0x002b
            r3.f3516a = r4     // Catch:{ all -> 0x0028 }
            T1.w1 r4 = r3.f3518c     // Catch:{ all -> 0x0028 }
            java.lang.Object r4 = r4.f398a     // Catch:{ all -> 0x0028 }
            T1.u0 r4 = (T1.C0212u0) r4     // Catch:{ all -> 0x0028 }
            T1.Z r4 = r4.f3496r     // Catch:{ all -> 0x0028 }
            T1.C0212u0.k(r4)     // Catch:{ all -> 0x0028 }
            T1.X r4 = r4.f3172f     // Catch:{ all -> 0x0028 }
            java.lang.String r5 = "Service connected with null binder"
            r4.a(r5)     // Catch:{ all -> 0x0028 }
            monitor-exit(r3)     // Catch:{ all -> 0x0028 }
            return
        L_0x0028:
            r4 = move-exception
            goto L_0x00b0
        L_0x002b:
            r0 = 0
            java.lang.String r1 = r5.getInterfaceDescriptor()     // Catch:{ RemoteException -> 0x0072 }
            java.lang.String r2 = "com.google.android.gms.measurement.internal.IMeasurementService"
            boolean r2 = r2.equals(r1)     // Catch:{ RemoteException -> 0x0072 }
            if (r2 == 0) goto L_0x005f
            java.lang.String r1 = "com.google.android.gms.measurement.internal.IMeasurementService"
            android.os.IInterface r1 = r5.queryLocalInterface(r1)     // Catch:{ RemoteException -> 0x0072 }
            boolean r2 = r1 instanceof T1.J     // Catch:{ RemoteException -> 0x0072 }
            if (r2 == 0) goto L_0x0046
            T1.J r1 = (T1.J) r1     // Catch:{ RemoteException -> 0x0072 }
        L_0x0044:
            r0 = r1
            goto L_0x004c
        L_0x0046:
            T1.I r1 = new T1.I     // Catch:{ RemoteException -> 0x0072 }
            r1.<init>(r5)     // Catch:{ RemoteException -> 0x0072 }
            goto L_0x0044
        L_0x004c:
            T1.w1 r5 = r3.f3518c     // Catch:{ RemoteException -> 0x0072 }
            java.lang.Object r5 = r5.f398a     // Catch:{ RemoteException -> 0x0072 }
            T1.u0 r5 = (T1.C0212u0) r5     // Catch:{ RemoteException -> 0x0072 }
            T1.Z r5 = r5.f3496r     // Catch:{ RemoteException -> 0x0072 }
            T1.C0212u0.k(r5)     // Catch:{ RemoteException -> 0x0072 }
            T1.X r5 = r5.f3180w     // Catch:{ RemoteException -> 0x0072 }
            java.lang.String r1 = "Bound to IMeasurementService interface"
            r5.a(r1)     // Catch:{ RemoteException -> 0x0072 }
            goto L_0x0084
        L_0x005f:
            T1.w1 r5 = r3.f3518c     // Catch:{ RemoteException -> 0x0072 }
            java.lang.Object r5 = r5.f398a     // Catch:{ RemoteException -> 0x0072 }
            T1.u0 r5 = (T1.C0212u0) r5     // Catch:{ RemoteException -> 0x0072 }
            T1.Z r5 = r5.f3496r     // Catch:{ RemoteException -> 0x0072 }
            T1.C0212u0.k(r5)     // Catch:{ RemoteException -> 0x0072 }
            T1.X r5 = r5.f3172f     // Catch:{ RemoteException -> 0x0072 }
            java.lang.String r2 = "Got binder with a wrong descriptor"
            r5.b(r1, r2)     // Catch:{ RemoteException -> 0x0072 }
            goto L_0x0084
        L_0x0072:
            T1.w1 r5 = r3.f3518c     // Catch:{ all -> 0x0028 }
            java.lang.Object r5 = r5.f398a     // Catch:{ all -> 0x0028 }
            T1.u0 r5 = (T1.C0212u0) r5     // Catch:{ all -> 0x0028 }
            T1.Z r5 = r5.f3496r     // Catch:{ all -> 0x0028 }
            T1.C0212u0.k(r5)     // Catch:{ all -> 0x0028 }
            T1.X r5 = r5.f3172f     // Catch:{ all -> 0x0028 }
            java.lang.String r1 = "Service connect failed to get IMeasurementService"
            r5.a(r1)     // Catch:{ all -> 0x0028 }
        L_0x0084:
            if (r0 != 0) goto L_0x009a
            r3.f3516a = r4     // Catch:{ all -> 0x0028 }
            F1.a r4 = F1.a.b()     // Catch:{ IllegalArgumentException -> 0x00ae }
            T1.w1 r5 = r3.f3518c     // Catch:{ IllegalArgumentException -> 0x00ae }
            java.lang.Object r0 = r5.f398a     // Catch:{ IllegalArgumentException -> 0x00ae }
            T1.u0 r0 = (T1.C0212u0) r0     // Catch:{ IllegalArgumentException -> 0x00ae }
            android.content.Context r0 = r0.f3489a     // Catch:{ IllegalArgumentException -> 0x00ae }
            T1.v1 r5 = r5.f3525c     // Catch:{ IllegalArgumentException -> 0x00ae }
            r4.c(r0, r5)     // Catch:{ IllegalArgumentException -> 0x00ae }
            goto L_0x00ae
        L_0x009a:
            T1.w1 r4 = r3.f3518c     // Catch:{ all -> 0x0028 }
            java.lang.Object r4 = r4.f398a     // Catch:{ all -> 0x0028 }
            T1.u0 r4 = (T1.C0212u0) r4     // Catch:{ all -> 0x0028 }
            T1.r0 r4 = r4.f3497s     // Catch:{ all -> 0x0028 }
            T1.C0212u0.k(r4)     // Catch:{ all -> 0x0028 }
            T1.u1 r5 = new T1.u1     // Catch:{ all -> 0x0028 }
            r1 = 0
            r5.<init>(r3, r0, r1)     // Catch:{ all -> 0x0028 }
            r4.y(r5)     // Catch:{ all -> 0x0028 }
        L_0x00ae:
            monitor-exit(r3)     // Catch:{ all -> 0x0028 }
            return
        L_0x00b0:
            monitor-exit(r3)     // Catch:{ all -> 0x0028 }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: T1.C0216v1.onServiceConnected(android.content.ComponentName, android.os.IBinder):void");
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        C0212u0 u0Var = (C0212u0) this.f3518c.f398a;
        C0203r0 r0Var = u0Var.f3497s;
        C0212u0.k(r0Var);
        r0Var.w();
        Z z3 = u0Var.f3496r;
        C0212u0.k(z3);
        z3.f3179v.a("Service disconnected");
        C0203r0 r0Var2 = u0Var.f3497s;
        C0212u0.k(r0Var2);
        r0Var2.y(new a(this, componentName, 18, false));
    }
}
