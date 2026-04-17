package j4;

import K4.k;
import K4.o;
import R2.b;
import Y4.l;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.C0269a;
import androidx.fragment.app.C0286s;
import androidx.fragment.app.I;
import com.google.android.gms.internal.measurement.a;
import com.mtma.criminal.city.R;
import com.mtma.criminal.city.app.MyApplication;
import e5.C0509f;
import f.C0518i;
import o3.d;

public final class W extends C0509f {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f8954a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ l f8955b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Z f8956c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ W(Z z3, ViewGroup viewGroup, l lVar, int i2) {
        super(viewGroup);
        this.f8954a = i2;
        this.f8956c = z3;
        this.f8955b = lVar;
    }

    public final void onClick(View view) {
        C0286s sVar;
        switch (this.f8954a) {
            case 0:
                super.onClick(view);
                l lVar = this.f8955b;
                boolean t6 = a.t(lVar.f4385a);
                Z z3 = this.f8956c;
                if (t6) {
                    sVar = new o(z3.f8965b);
                } else {
                    sVar = new k(z3.f8965b, lVar.f4385a);
                }
                I l6 = ((C0518i) view.getContext()).l();
                C0269a b6 = d.b(l6, l6);
                b6.f(R.id.activity_main_body_frame_layout, sVar, (String) null, 1);
                a.j(b6, false);
                return;
            case 1:
                super.onClick(view);
                Z z4 = this.f8956c;
                int i2 = z4.f8966c;
                l lVar2 = this.f8955b;
                Context context = z4.f8965b;
                if (i2 == 0) {
                    if (com.bumptech.glide.d.J0(lVar2.h)) {
                        if (z4.d == 0) {
                            a.e(true).E(b.Z()).E("gangs").E("gangsData").E(d5.o.getGangObject().getId()).E("level").d(new V(z4, lVar2));
                            return;
                        } else {
                            Z.e(z4, lVar2);
                            return;
                        }
                    } else if (d5.o.getAccountObject().getId().equals(lVar2.f4385a)) {
                        a.n(MyApplication.f7090a, R.string.dialog_gang_position_can_not_change_your_position, context, (String) null);
                        return;
                    } else {
                        a.n(MyApplication.f7090a, R.string.dialog_gang_position_not_allowed_to_take_action, context, (String) null);
                        return;
                    }
                } else if (i2 != 1) {
                    return;
                } else {
                    if (lVar2.h == 0 || d5.o.getAccountObject().getId().equals(lVar2.f4385a)) {
                        a.n(MyApplication.f7090a, R.string.dialog_gang_you_are_boss_already, context, (String) null);
                        return;
                    } else {
                        Z.f(z4, lVar2, 2);
                        return;
                    }
                }
            default:
                super.onClick(view);
                l lVar3 = this.f8955b;
                boolean J02 = com.bumptech.glide.d.J0(lVar3.h);
                Z z5 = this.f8956c;
                if (J02) {
                    Z.f(z5, lVar3, 1);
                    return;
                }
                a.n(MyApplication.f7090a, R.string.dialog_gang_position_not_allowed_to_take_action, z5.f8965b, (String) null);
                return;
        }
    }
}
