package j4;

import R2.b;
import Y4.D;
import Z4.e;
import b5.k;
import com.bumptech.glide.c;
import com.google.android.gms.internal.measurement.a;
import com.mtma.criminal.city.R;
import com.mtma.criminal.city.app.MyApplication;
import com.mtma.criminal.city.utils.j0;
import com.mtma.criminal.city.utils.p0;
import d5.o;
import java.util.ArrayList;

/* renamed from: j4.d0  reason: case insensitive filesystem */
public final class C0619d0 implements p0, j0 {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ D f8992a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ int f8993b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ C0621e0 f8994c;

    public C0619d0(C0621e0 e0Var, int i2, D d) {
        this.f8994c = e0Var;
        this.f8993b = i2;
        this.f8992a = d;
    }

    public void a(e eVar) {
        boolean z3 = eVar.isAllProcessSuccess;
        C0621e0 e0Var = this.f8994c;
        if (z3) {
            b.w(false);
            b.M0(R.raw.money_get);
            a.k(MyApplication.f7090a, R.string.toast_successfully, e0Var.f8999a);
            String str = e0Var.f9001c;
            D d = this.f8992a;
            c.k0(str, new k(14, d.f4293a, o.getAccountObject().getId(), o.getMainStatesObject().getNickName(), eVar.costAfterDeductionTaxes, this.f8993b));
            String id = o.getAccountObject().getId();
            int i2 = d.f4293a;
            String str2 = e0Var.f9001c;
            String str3 = e0Var.d;
            long j6 = d.f4297f;
            int i5 = this.f8993b;
            c.k0(id, new k(24, i2, str2, str3, ((long) i5) * j6, i5));
            if (eVar.stallCountAfterChange < 1) {
                e0Var.f9003f.remove(e0Var.getPosition(d));
                e0Var.remove(d);
            } else {
                ((D) e0Var.getItem(e0Var.getPosition(d))).h = eVar.stallCountAfterChange;
            }
            e0Var.notifyDataSetChanged();
            return;
        }
        b.w(false);
        if (!eVar.isStallCountForSellerChanged) {
            a.n(MyApplication.f7090a, R.string.stall_items_sold_or_not_exist_any_more, e0Var.f8999a, (String) null);
        } else if (!eVar.isCashChangedForBuyerChanged) {
            c.x0(e0Var.f8999a);
        } else {
            a.n(MyApplication.f7090a, R.string.unknown_error_try_again, e0Var.f8999a, (String) null);
        }
    }

    public void o(int i2) {
        C0621e0 e0Var = this.f8994c;
        int i5 = this.f8993b;
        if (i2 < i5) {
            c.s0(e0Var.f8999a, MyApplication.f7090a.getApplicationContext().getString(R.string.no_free_space_in_stock), (String) null);
            b.w(false);
            return;
        }
        ArrayList arrayList = e0Var.f9003f;
        D d = this.f8992a;
        b.f(e0Var.f9001c, ((Integer) arrayList.get(e0Var.getPosition(d))).intValue(), d.f4293a, i5, new C0619d0(e0Var, d, i5));
    }

    public C0619d0(C0621e0 e0Var, D d, int i2) {
        this.f8994c = e0Var;
        this.f8992a = d;
        this.f8993b = i2;
    }
}
