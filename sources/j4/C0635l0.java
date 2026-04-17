package j4;

import K1.e;
import K4.k;
import Y4.u;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.C0269a;
import androidx.fragment.app.C0286s;
import androidx.fragment.app.I;
import com.bumptech.glide.c;
import com.google.android.gms.internal.measurement.a;
import com.mtma.criminal.city.R;
import com.mtma.criminal.city.activities.MainActivity;
import com.mtma.criminal.city.app.MyApplication;
import d5.o;
import e5.C0509f;
import f.C0518i;
import o3.d;

/* renamed from: j4.l0  reason: case insensitive filesystem */
public final class C0635l0 extends C0509f {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f9046a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ u f9047b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ C0637m0 f9048c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0635l0(C0637m0 m0Var, ViewGroup viewGroup, u uVar, int i2) {
        super(viewGroup);
        this.f9046a = i2;
        this.f9048c = m0Var;
        this.f9047b = uVar;
    }

    public final void onClick(View view) {
        C0286s sVar;
        switch (this.f9046a) {
            case 0:
                super.onClick(view);
                int powerCurrent = o.getMainStatesObject().getPowerCurrent();
                C0637m0 m0Var = this.f9048c;
                if (powerCurrent < 10) {
                    c.p(m0Var.f9052a, 2001);
                    return;
                }
                u uVar = this.f9047b;
                if (c.W(Long.valueOf(uVar.f4439i)) <= c.f5744o) {
                    a.p(MyApplication.f7090a, R.string.player_out_of_prison, m0Var.f9052a, (String) null);
                    m0Var.remove(uVar);
                    return;
                }
                C0637m0.a(m0Var, uVar, 0);
                return;
            case 1:
                super.onClick(view);
                long cash = o.getMoneyObject().getCash();
                u uVar2 = this.f9047b;
                long j6 = uVar2.f4439i;
                C0637m0 m0Var2 = this.f9048c;
                int i2 = (cash > e.r(j6, m0Var2.f9053b) ? 1 : (cash == e.r(j6, m0Var2.f9053b) ? 0 : -1));
                MainActivity mainActivity = m0Var2.f9052a;
                if (i2 < 0) {
                    c.x0(mainActivity);
                    return;
                } else if (c.W(Long.valueOf(uVar2.f4439i)) <= c.f5744o) {
                    a.p(MyApplication.f7090a, R.string.player_out_of_prison, mainActivity, (String) null);
                    m0Var2.remove(uVar2);
                    return;
                } else {
                    C0637m0.a(m0Var2, uVar2, 1);
                    return;
                }
            default:
                super.onClick(view);
                u uVar3 = this.f9047b;
                boolean t6 = a.t(uVar3.f4434a);
                C0637m0 m0Var3 = this.f9048c;
                if (t6) {
                    sVar = new K4.o(m0Var3.f9052a);
                } else {
                    sVar = new k(m0Var3.f9052a, uVar3.f4434a);
                }
                I l6 = ((C0518i) view.getContext()).l();
                C0269a b6 = d.b(l6, l6);
                b6.f(R.id.activity_main_body_frame_layout, sVar, (String) null, 1);
                a.j(b6, false);
                return;
        }
    }
}
