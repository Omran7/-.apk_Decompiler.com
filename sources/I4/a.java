package I4;

import R2.b;
import a5.C0265b;
import android.content.Context;
import com.bumptech.glide.c;
import com.mtma.criminal.city.R;
import com.mtma.criminal.city.app.MyApplication;
import com.mtma.criminal.city.utils.Q;
import com.mtma.criminal.city.utils.r0;
import com.mtma.criminal.city.utils.v0;
import d5.o;
import i3.C0592h;

public final /* synthetic */ class a implements r0 {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f1191a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ f f1192b;

    public /* synthetic */ a(f fVar, int i2) {
        this.f1191a = i2;
        this.f1192b = fVar;
    }

    public void a(C0265b bVar) {
        MyApplication myApplication;
        int i2;
        f fVar = this.f1192b;
        fVar.getClass();
        boolean z3 = bVar.isAllProcessSuccess;
        Context context = fVar.f1200d0;
        if (!z3) {
            b.w(false);
            if (!bVar.isMainStatesChanged) {
                c.p(context, 2002);
                return;
            } else if (bVar.currentPlace != 2) {
                myApplication = MyApplication.f7090a;
                i2 = R.string.already_out_of_prison;
            } else {
                myApplication = MyApplication.f7090a;
                i2 = R.string.unknown_error_try_again;
            }
        } else if (bVar.currentPlace == 0) {
            b.w(false);
            b.M0(R.raw.add_new_item);
            v0.e(context, MyApplication.f7090a.getApplicationContext().getString(R.string.escape_successfully));
            Q.b(34, o.getAccountObject().getId(), (long) 1);
            return;
        } else {
            b.w(false);
            myApplication = MyApplication.f7090a;
            i2 = R.string.escape_failed;
        }
        com.google.android.gms.internal.measurement.a.n(myApplication, i2, context, (String) null);
    }

    public void j(long j6) {
        switch (this.f1191a) {
            case 0:
                f fVar = this.f1192b;
                fVar.getClass();
                com.google.android.gms.internal.measurement.a.v(com.google.android.gms.internal.measurement.a.c(C0592h.b().e(), "players"), "locationObject").d(new U3.c((Object) fVar, 12));
                return;
            default:
                this.f1192b.W();
                return;
        }
    }
}
