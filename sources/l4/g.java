package l4;

import R2.b;
import androidx.fragment.app.C0286s;
import com.google.android.gms.internal.measurement.a;
import com.mtma.criminal.city.utils.J;
import com.mtma.criminal.city.utils.Q;
import com.mtma.criminal.city.utils.U;
import d5.k;
import d5.o;
import i3.C0585a;
import i3.C0587c;

public final class g implements J, C0585a {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f9773a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ i f9774b;

    public /* synthetic */ g(i iVar, int i2) {
        this.f9773a = i2;
        this.f9774b = iVar;
    }

    public void h(boolean z3, k kVar) {
        switch (this.f9773a) {
            case 0:
                i iVar = this.f9774b;
                iVar.a0();
                iVar.X();
                i.W(iVar);
                iVar.Y();
                iVar.Z();
                return;
            case 1:
                this.f9774b.X();
                return;
            default:
                this.f9774b.Y();
                return;
        }
    }

    public void k(C0587c cVar) {
        String F = cVar.f8279b.F();
        try {
            boolean equals = F.equals("cash");
            i iVar = this.f9774b;
            if (equals) {
                long longValue = ((Long) cVar.f(Long.class)).longValue();
                o.getMoneyObject().setCash(longValue);
                iVar.f9813k0.setText(U.a(longValue));
                Q.b(2, o.getAccountObject().getId(), longValue);
            } else if (F.equals("gold")) {
                int intValue = ((Integer) cVar.f(Integer.class)).intValue();
                o.getMoneyObject().setGold(intValue);
                iVar.f9812j0.setText(String.valueOf(intValue));
                Q.b(1, o.getAccountObject().getId(), (long) intValue);
            }
        } catch (Exception e6) {
            a.r("Exception from try-catch inside ", "i", " class in addListenerToMoneyValues method.", "i", e6);
        }
    }

    public void q(C0587c cVar) {
        String F = cVar.f8279b.F();
        try {
            boolean equals = F.equals("cash");
            Class<Long> cls = Long.class;
            i iVar = this.f9774b;
            if (equals) {
                long longValue = ((Long) cVar.f(cls)).longValue();
                o.getMoneyObject().setCash(longValue);
                iVar.f9813k0.setText(U.a(longValue));
                Q.b(2, o.getAccountObject().getId(), longValue);
                return;
            }
            Class<Integer> cls2 = Integer.class;
            if (F.equals("gold")) {
                int intValue = ((Integer) cVar.f(cls2)).intValue();
                o.getMoneyObject().setGold(intValue);
                iVar.f9812j0.setText(String.valueOf(intValue));
                Q.b(1, o.getAccountObject().getId(), (long) intValue);
            } else if (F.equals("check")) {
                o.getMoneyObject().setCheck(((Integer) cVar.f(cls2)).intValue());
                for (C0286s sVar : iVar.p().f5000c.v()) {
                    if (sVar instanceof Q4.a) {
                        Q4.a aVar = (Q4.a) sVar;
                        if (aVar.f2435e0 == 7) {
                            aVar.f2440j0.setText(U.a((long) o.getMoneyObject().getCheck()));
                            b.c(aVar.f2442l0, 3);
                            return;
                        }
                        return;
                    }
                }
            } else if (F.equals("bankCash")) {
                o.getMoneyObject().setBankCash(((Long) cVar.f(cls)).longValue());
            }
        } catch (Exception e6) {
            a.r("Exception from try-catch inside ", "i", " class in addListenerToMoneyValues method.", "i", e6);
        }
    }

    public void i(C0587c cVar) {
    }
}
