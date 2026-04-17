package y4;

import R2.b;
import Y4.D;
import android.os.Handler;
import com.bumptech.glide.c;
import com.mtma.criminal.city.R;
import com.mtma.criminal.city.utils.r0;
import com.mtma.criminal.city.utils.v0;
import java.util.ArrayList;
import k.C0724m;
import k5.r;

/* renamed from: y4.d  reason: case insensitive filesystem */
public final class C1117d implements r0 {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f12719a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ C1118e f12720b;

    public /* synthetic */ C1117d(C1118e eVar, int i2) {
        this.f12719a = i2;
        this.f12720b = eVar;
    }

    public final void j(long j6) {
        D d;
        switch (this.f12719a) {
            case 0:
                b.w(false);
                int E6 = c.E(j6);
                C1118e eVar = this.f12720b;
                if (E6 < eVar.f12736q0 || E6 > eVar.f12737r0) {
                    eVar.Z(j6);
                    eVar.Y(true);
                    return;
                }
                b.M0(R.raw.roll_lucky_wheel);
                eVar.Y(false);
                int W5 = C1118e.W(eVar);
                ArrayList arrayList = new ArrayList();
                arrayList.add(Integer.valueOf(W5));
                C1118e.X(eVar, arrayList, eVar.f12734o0);
                new Handler().postDelayed(new r(eVar, 50, W5), (long) 50);
                return;
            default:
                b.w(false);
                int E7 = c.E(j6);
                C1118e eVar2 = this.f12720b;
                if (E7 < eVar2.f12736q0 || E7 > eVar2.f12737r0) {
                    eVar2.Z(j6);
                    eVar2.Y(true);
                    return;
                }
                b.M0(R.raw.roll_lucky_wheel);
                eVar2.Y(false);
                ArrayList arrayList2 = new ArrayList();
                ArrayList arrayList3 = new ArrayList();
                for (int i2 = 0; i2 < 10; i2++) {
                    int W6 = C1118e.W(eVar2);
                    arrayList3.add(Integer.valueOf(W6));
                    int longValue = (int) ((Long) eVar2.f12738t0.get(W6)).longValue();
                    if (longValue == -10) {
                        d = new D(R.string.money, R.string.ten_million, R.drawable.money_buy_cash_4);
                    } else if (longValue == -50) {
                        d = new D(R.string.money, R.string.fifty_million, R.drawable.money_buy_cash_5);
                    } else if (longValue == -600) {
                        d = new D(R.string.gold, R.string.six_hundred_gold, R.drawable.money_buy_gold_4);
                    } else {
                        d = D.s(longValue, 0, 1);
                    }
                    d.f4293a = longValue;
                    arrayList2.add(d);
                }
                C1118e.X(eVar2, arrayList3, eVar2.f12735p0);
                v0.f(eVar2.f12723d0, arrayList2, new C0724m(this, 25));
                return;
        }
    }
}
