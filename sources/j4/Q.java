package j4;

import R2.b;
import Y4.k;
import Z4.e;
import com.bumptech.glide.c;
import com.google.android.gms.internal.measurement.a;
import com.mtma.criminal.city.R;
import com.mtma.criminal.city.app.MyApplication;
import com.mtma.criminal.city.utils.j0;
import com.mtma.criminal.city.utils.p0;
import d5.o;

public final class Q implements p0, j0 {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ k f8940a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ int f8941b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ C0626h f8942c;

    public Q(C0626h hVar, int i2, k kVar) {
        this.f8942c = hVar;
        this.f8941b = i2;
        this.f8940a = kVar;
    }

    public void a(e eVar) {
        boolean z3 = eVar.isAllProcessSuccess;
        C0626h hVar = this.f8942c;
        if (z3) {
            b.w(false);
            b.M0(R.raw.money_get);
            a.k(MyApplication.f7090a, R.string.toast_successfully, hVar.f9018b);
            k kVar = this.f8940a;
            c.k0(kVar.f4376b, new b5.k(14, kVar.f4381j, o.getAccountObject().getId(), o.getMainStatesObject().getNickName(), eVar.costAfterDeductionTaxes, this.f8941b));
            String id = o.getAccountObject().getId();
            int i2 = kVar.f4381j;
            String str = kVar.f4376b;
            String str2 = kVar.f4377c;
            long j6 = kVar.f4384m;
            int i5 = this.f8941b;
            c.k0(id, new b5.k(24, i2, str, str2, ((long) i5) * j6, i5));
            if (eVar.stallCountAfterChange < 1) {
                hVar.remove(kVar);
            } else {
                ((k) hVar.getItem(hVar.getPosition(kVar))).f4383l = eVar.stallCountAfterChange;
            }
            hVar.notifyDataSetChanged();
            com.mtma.criminal.city.utils.Q.b(94, o.getAccountObject().getId(), (long) 1);
            return;
        }
        b.w(false);
        if (!eVar.isStallCountForSellerChanged) {
            a.n(MyApplication.f7090a, R.string.stall_items_sold_or_not_exist_any_more, hVar.f9018b, (String) null);
        } else if (!eVar.isCashChangedForBuyerChanged) {
            c.x0(hVar.f9018b);
        } else {
            a.n(MyApplication.f7090a, R.string.unknown_error_try_again, hVar.f9018b, (String) null);
        }
    }

    public void o(int i2) {
        C0626h hVar = this.f8942c;
        int i5 = this.f8941b;
        if (i2 < i5) {
            c.s0(hVar.f9018b, MyApplication.f7090a.getApplicationContext().getString(R.string.no_free_space_in_stock), (String) null);
            b.w(false);
            return;
        }
        hVar.getClass();
        k kVar = this.f8940a;
        b.f(kVar.f4376b, kVar.h, kVar.f4381j, i5, new Q(hVar, kVar, i5));
    }

    public Q(C0626h hVar, k kVar, int i2) {
        this.f8942c = hVar;
        this.f8940a = kVar;
        this.f8941b = i2;
    }
}
