package T1;

import B2.a;
import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import com.google.android.gms.internal.measurement.zzbq;
import com.google.android.gms.internal.measurement.zzbr;

/* renamed from: T1.i0  reason: case insensitive filesystem */
public final class C0177i0 implements ServiceConnection {

    /* renamed from: a  reason: collision with root package name */
    public final String f3339a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ C0180j0 f3340b;

    public C0177i0(C0180j0 j0Var, String str) {
        this.f3340b = j0Var;
        this.f3339a = str;
    }

    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        C0180j0 j0Var = this.f3340b;
        if (iBinder != null) {
            try {
                zzbr zzb = zzbq.zzb(iBinder);
                if (zzb == null) {
                    Z z3 = j0Var.f3354b.f3496r;
                    C0212u0.k(z3);
                    z3.f3175r.a("Install Referrer Service implementation was not found");
                    return;
                }
                C0212u0 u0Var = j0Var.f3354b;
                Z z4 = u0Var.f3496r;
                C0212u0.k(z4);
                z4.f3180w.a("Install Referrer Service connected");
                C0203r0 r0Var = u0Var.f3497s;
                C0212u0.k(r0Var);
                r0Var.y(new a(this, zzb, this));
            } catch (RuntimeException e6) {
                Z z5 = j0Var.f3354b.f3496r;
                C0212u0.k(z5);
                z5.f3175r.b(e6, "Exception occurred while calling Install Referrer API");
            }
        } else {
            Z z6 = j0Var.f3354b.f3496r;
            C0212u0.k(z6);
            z6.f3175r.a("Install Referrer connection returned with null binder");
        }
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        Z z3 = this.f3340b.f3354b.f3496r;
        C0212u0.k(z3);
        z3.f3180w.a("Install Referrer Service disconnected");
    }
}
