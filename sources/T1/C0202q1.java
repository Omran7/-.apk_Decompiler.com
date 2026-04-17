package T1;

import android.os.Parcel;
import com.google.android.gms.internal.measurement.zzbn;
import com.google.android.gms.internal.measurement.zzbo;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: T1.q1  reason: case insensitive filesystem */
public final class C0202q1 extends zzbn implements N {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ AtomicReference f3437a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ C0219w1 f3438b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C0202q1(C0219w1 w1Var, AtomicReference atomicReference) {
        super("com.google.android.gms.measurement.internal.IUploadBatchesCallback");
        this.f3437a = atomicReference;
        this.f3438b = w1Var;
    }

    public final void x(N1 n12) {
        AtomicReference atomicReference = this.f3437a;
        synchronized (atomicReference) {
            Z z3 = ((C0212u0) this.f3438b.f398a).f3496r;
            C0212u0.k(z3);
            z3.f3180w.b(Integer.valueOf(n12.f2997a.size()), "[sgtm] Got upload batches from service. count");
            atomicReference.set(n12);
            atomicReference.notifyAll();
        }
    }

    public final boolean zza(int i2, Parcel parcel, Parcel parcel2, int i5) {
        if (i2 != 2) {
            return false;
        }
        zzbo.zzc(parcel);
        x((N1) zzbo.zza(parcel, N1.CREATOR));
        return true;
    }
}
