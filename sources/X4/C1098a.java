package x4;

import R2.b;
import com.bumptech.glide.c;
import com.bumptech.glide.d;
import com.google.android.gms.internal.measurement.a;
import com.mtma.criminal.city.R;
import com.mtma.criminal.city.activities.MainActivity;
import com.mtma.criminal.city.app.MyApplication;
import com.mtma.criminal.city.utils.J;
import com.mtma.criminal.city.utils.T;
import com.mtma.criminal.city.utils.v0;
import d5.k;

/* renamed from: x4.a  reason: case insensitive filesystem */
public final /* synthetic */ class C1098a implements T, J {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ C1101d f12557a;

    public /* synthetic */ C1098a(C1101d dVar) {
        this.f12557a = dVar;
    }

    public void c(boolean z3) {
        C1101d dVar = this.f12557a;
        dVar.getClass();
        if (z3) {
            d.U0(3, new C1098a(dVar));
            return;
        }
        b.w(false);
        c.x0(dVar.f12563d0);
    }

    public void h(boolean z3, k kVar) {
        MyApplication myApplication;
        int i2;
        MainActivity mainActivity = this.f12557a.f12563d0;
        if (z3) {
            b.w(false);
            b.M0(R.raw.money_pay);
            v0.e(mainActivity, MyApplication.f7090a.getApplicationContext().getString(R.string.full_health));
            return;
        }
        b.w(false);
        if (kVar.getHealthCurrent() >= d.p0(kVar)) {
            myApplication = MyApplication.f7090a;
            i2 = R.string.current_health_is_full;
        } else {
            myApplication = MyApplication.f7090a;
            i2 = R.string.unknown_error_try_again;
        }
        a.p(myApplication, i2, mainActivity, (String) null);
    }
}
