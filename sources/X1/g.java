package x1;

import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.b;
import com.google.android.gms.common.api.internal.C0350d;
import com.google.android.gms.common.api.o;
import com.google.android.gms.common.api.s;
import com.google.android.gms.internal.p001authapi.zbc;
import q1.C0932b;

public final class g extends C0350d {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f12549a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public g(o oVar, int i2) {
        super(C0932b.f11079b, oVar);
        this.f12549a = i2;
    }

    public final /* bridge */ /* synthetic */ s createFailedResult(Status status) {
        int i2 = this.f12549a;
        return status;
    }

    public final void doExecute(b bVar) {
        switch (this.f12549a) {
            case 0:
                e eVar = (e) bVar;
                k kVar = (k) eVar.getService();
                f fVar = new f(this, 0);
                Parcel zba = kVar.zba();
                zbc.zbd(zba, fVar);
                zbc.zbc(zba, eVar.f12546a);
                kVar.zbb(102, zba);
                return;
            default:
                e eVar2 = (e) bVar;
                k kVar2 = (k) eVar2.getService();
                f fVar2 = new f(this, 1);
                Parcel zba2 = kVar2.zba();
                zbc.zbd(zba2, fVar2);
                zbc.zbc(zba2, eVar2.f12546a);
                kVar2.zbb(103, zba2);
                return;
        }
    }
}
