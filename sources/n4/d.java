package n4;

import com.google.android.gms.internal.measurement.a;
import com.mtma.criminal.city.utils.r0;
import i3.C0592h;
import k.C0724m;

public final /* synthetic */ class d implements r0 {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f10371a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ f f10372b;

    public /* synthetic */ d(f fVar, int i2) {
        this.f10371a = i2;
        this.f10372b = fVar;
    }

    public final void j(long j6) {
        switch (this.f10371a) {
            case 0:
                f fVar = this.f10372b;
                fVar.getClass();
                a.v(a.c(C0592h.b().e(), "players"), "locationObject").d(new C0724m(fVar, 8));
                return;
            default:
                this.f10372b.W();
                return;
        }
    }
}
