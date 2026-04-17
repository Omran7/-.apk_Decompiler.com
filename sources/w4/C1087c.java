package w4;

import R2.b;
import com.bumptech.glide.c;
import com.google.android.gms.internal.measurement.a;
import com.mtma.criminal.city.R;
import com.mtma.criminal.city.app.MyApplication;
import com.mtma.criminal.city.utils.C0455z;
import com.mtma.criminal.city.utils.J;
import d5.k;
import i3.C0592h;
import j4.p0;

/* renamed from: w4.c  reason: case insensitive filesystem */
public final class C1087c implements J {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f12445a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ int f12446b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ int f12447c;
    public final /* synthetic */ int d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ int f12448e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ C1088d f12449f;

    public C1087c(C1088d dVar, int i2, int i5, int i6, int i7, int i8) {
        this.f12449f = dVar;
        this.f12445a = i2;
        this.f12446b = i5;
        this.f12447c = i6;
        this.d = i7;
        this.f12448e = i8;
    }

    public final void h(boolean z3, k kVar) {
        if (z3) {
            p0 p0Var = new p0(this, 25);
            a.v(a.c(C0592h.b().e(), "players"), "gymObject").H(new C0455z(this.f12445a, this.f12446b, this.f12447c, this.d, p0Var));
            return;
        }
        b.w(false);
        int powerCurrent = kVar.getPowerCurrent();
        int i2 = this.f12448e;
        C1088d dVar = this.f12449f;
        if (powerCurrent < i2) {
            c.p(dVar.f12468d0, 2001);
        } else {
            a.p(MyApplication.f7090a, R.string.unknown_error_try_again, dVar.f12468d0, (String) null);
        }
        C1088d.V(dVar);
    }
}
