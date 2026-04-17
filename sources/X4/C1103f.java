package x4;

import com.google.android.gms.internal.measurement.a;
import com.mtma.criminal.city.utils.r0;
import i3.C0592h;
import j4.p0;

/* renamed from: x4.f  reason: case insensitive filesystem */
public final /* synthetic */ class C1103f implements r0 {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f12589a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ C1105h f12590b;

    public /* synthetic */ C1103f(C1105h hVar, int i2) {
        this.f12589a = i2;
        this.f12590b = hVar;
    }

    public final void j(long j6) {
        switch (this.f12589a) {
            case 0:
                C1105h hVar = this.f12590b;
                hVar.getClass();
                a.v(a.c(C0592h.b().e(), "players"), "locationObject").d(new p0(hVar, 29));
                return;
            default:
                this.f12590b.W();
                return;
        }
    }
}
