package j4;

import R2.b;
import Y4.u;
import a5.C0265b;
import com.bumptech.glide.c;
import com.google.android.gms.internal.measurement.a;
import com.mtma.criminal.city.R;
import com.mtma.criminal.city.activities.MainActivity;
import com.mtma.criminal.city.app.MyApplication;
import com.mtma.criminal.city.utils.Q;
import com.mtma.criminal.city.utils.U;
import d5.o;

/* renamed from: j4.k0  reason: case insensitive filesystem */
public final /* synthetic */ class C0633k0 {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f9040a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ C0637m0 f9041b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ u f9042c;

    public /* synthetic */ C0633k0(C0637m0 m0Var, u uVar, int i2) {
        this.f9040a = i2;
        this.f9041b = m0Var;
        this.f9042c = uVar;
    }

    public final void a(C0265b bVar) {
        MyApplication myApplication;
        int i2;
        switch (this.f9040a) {
            case 0:
                C0637m0 m0Var = this.f9041b;
                m0Var.getClass();
                boolean z3 = bVar.isAllProcessSuccess;
                u uVar = this.f9042c;
                MainActivity mainActivity = m0Var.f9052a;
                if (z3) {
                    b.w(false);
                    b.M0(R.raw.add_new_item);
                    c.s0(mainActivity, MyApplication.f7090a.getApplicationContext().getString(R.string.pay_bailout_successfully, new Object[]{U.a(bVar.moneyUsed)}), (String) null);
                    Q.b(36, o.getAccountObject().getId(), (long) 1);
                    m0Var.remove(uVar);
                    m0Var.notifyDataSetChanged();
                    return;
                }
                b.w(false);
                if (!bVar.isMoneyChanged) {
                    c.x0(mainActivity);
                    return;
                } else if (bVar.currentPlace != 2) {
                    a.p(MyApplication.f7090a, R.string.player_not_in_prison_anymore, mainActivity, (String) null);
                    m0Var.remove(uVar);
                    m0Var.notifyDataSetChanged();
                    return;
                } else {
                    a.p(MyApplication.f7090a, R.string.unknown_error_try_again, mainActivity, (String) null);
                    return;
                }
            default:
                C0637m0 m0Var2 = this.f9041b;
                m0Var2.getClass();
                boolean z4 = bVar.isAllProcessSuccess;
                u uVar2 = this.f9042c;
                MainActivity mainActivity2 = m0Var2.f9052a;
                if (!z4) {
                    b.w(false);
                    if (!bVar.isMainStatesChanged) {
                        c.p(mainActivity2, 2001);
                        return;
                    } else if (bVar.currentPlace != 2) {
                        a.p(MyApplication.f7090a, R.string.player_not_in_prison_anymore, mainActivity2, (String) null);
                        m0Var2.remove(uVar2);
                        m0Var2.notifyDataSetChanged();
                        return;
                    } else {
                        myApplication = MyApplication.f7090a;
                        i2 = R.string.unknown_error_try_again;
                    }
                } else if (bVar.currentPlace == 0) {
                    b.w(false);
                    c.s0(mainActivity2, MyApplication.f7090a.getApplicationContext().getString(R.string.jailbreak_successfully), (String) null);
                    Q.b(35, o.getAccountObject().getId(), (long) 1);
                    m0Var2.remove(uVar2);
                    m0Var2.notifyDataSetChanged();
                    return;
                } else {
                    b.w(false);
                    myApplication = MyApplication.f7090a;
                    i2 = R.string.jailbreak_failed;
                }
                a.p(myApplication, i2, mainActivity2, (String) null);
                return;
        }
    }
}
