package T1;

import android.os.Parcel;
import com.google.android.gms.internal.measurement.zzbn;
import com.google.android.gms.internal.measurement.zzbo;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: T1.p1  reason: case insensitive filesystem */
public final class C0199p1 extends zzbn implements L {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ AtomicReference f3432a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C0199p1(AtomicReference atomicReference) {
        super("com.google.android.gms.measurement.internal.ITriggerUrisCallback");
        this.f3432a = atomicReference;
    }

    public final boolean zza(int i2, Parcel parcel, Parcel parcel2, int i5) {
        if (i2 != 2) {
            return false;
        }
        ArrayList<I1> createTypedArrayList = parcel.createTypedArrayList(I1.CREATOR);
        zzbo.zzc(parcel);
        zze(createTypedArrayList);
        return true;
    }

    public final void zze(List list) {
        AtomicReference atomicReference = this.f3432a;
        synchronized (atomicReference) {
            atomicReference.set(list);
            atomicReference.notifyAll();
        }
    }
}
