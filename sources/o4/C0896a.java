package o4;

import K1.e;
import R2.b;
import com.google.android.gms.internal.measurement.a;
import com.mtma.criminal.city.R;
import com.mtma.criminal.city.app.MyApplication;
import com.mtma.criminal.city.utils.S;
import com.mtma.criminal.city.utils.U;
import d5.m;
import d5.o;
import i3.C0587c;
import i3.C0588d;
import i3.q;

/* renamed from: o4.a  reason: case insensitive filesystem */
public final class C0896a implements S, q {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ e f10445a;

    public /* synthetic */ C0896a(e eVar) {
        this.f10445a = eVar;
    }

    public void g(boolean z3, m mVar) {
        e eVar = this.f10445a;
        if (z3) {
            eVar.f10459j0.setText(U.a(mVar.getCash()));
            eVar.f10460k0.setText(U.a(mVar.getBankCash()));
            eVar.s0.setProgress(0);
            eVar.f10463n0.setText(R.string.zero);
            eVar.f10466q0.setText("");
            eVar.f10466q0.clearFocus();
            b.w(false);
            b.M0(R.raw.money_pay);
            return;
        }
        b.w(false);
        a.p(MyApplication.f7090a, R.string.not_has_enough_cash_to_transaction, eVar.f10453d0, (String) null);
    }

    public void u(C0587c cVar) {
        m mVar = (m) cVar.f(m.class);
        if (mVar != null) {
            o.setMoneyObject(mVar);
            long cash = mVar.getCash();
            long bankCash = mVar.getBankCash();
            int gold = mVar.getGold();
            int check = mVar.getCheck();
            e eVar = this.f10445a;
            eVar.f10459j0.setText(U.a(cash));
            eVar.f10460k0.setText(U.a(bankCash));
            eVar.f10461l0.setText(U.a((long) gold));
            eVar.f10462m0.setText(U.a((long) check));
            double S5 = 0.05d - (e.S(19) * 0.05d);
            if (S5 < 0.0d) {
                S5 = 0.0d;
            }
            eVar.f10465p0.setText(eVar.s(R.string.text_with_percent_sign, e.p(S5 * 100.0d)));
            eVar.s0.setProgress(100);
            eVar.f10466q0.setText(String.valueOf(o.getMoneyObject().getCash()));
            b.w(false);
        }
    }

    public void B(C0588d dVar) {
    }
}
