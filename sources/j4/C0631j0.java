package j4;

import K1.e;
import R2.b;
import Y4.D;
import Z4.d;
import android.content.Context;
import android.support.v4.media.session.a;
import androidx.fragment.app.C0286s;
import com.bumptech.glide.c;
import com.mtma.criminal.city.R;
import com.mtma.criminal.city.app.MyApplication;
import com.mtma.criminal.city.utils.Q;
import com.mtma.criminal.city.utils.p0;
import com.mtma.criminal.city.utils.v0;
import d5.o;
import f.C0518i;
import i3.C0592h;
import s4.C0972a;
import s4.C0973b;

/* renamed from: j4.j0  reason: case insensitive filesystem */
public final class C0631j0 implements p0 {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f9034a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ int f9035b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ D f9036c;
    public final /* synthetic */ C0626h d;

    public /* synthetic */ C0631j0(C0626h hVar, int i2, D d6, int i5) {
        this.f9034a = i5;
        this.d = hVar;
        this.f9035b = i2;
        this.f9036c = d6;
    }

    public void a(d dVar) {
        boolean z3 = dVar.isAllProcessSuccess;
        int i2 = this.f9035b;
        C0626h hVar = this.d;
        if (z3) {
            D d6 = this.f9036c;
            ((D) hVar.getItem(hVar.getPosition(d6))).h = dVar.materialCountInMarket;
            hVar.notifyDataSetChanged();
            b.w(false);
            b.M0(R.raw.add_new_item);
            String string = hVar.getContext().getString(R.string.toast_successfully);
            Context context = hVar.f9018b;
            v0.e(context, string);
            if (o.getLocationObject().getCurrentCity() != 0) {
                Q.b(92, o.getAccountObject().getId(), ((long) i2) * d6.f4297f);
            }
            if (d6.f4294b == 2) {
                for (C0286s sVar : ((C0518i) context).l().f5000c.v()) {
                    if (sVar instanceof C0973b) {
                        C0973b bVar = (C0973b) sVar;
                        int i5 = d6.f4293a;
                        int i6 = bVar.f11550e0;
                        if (i5 == a.F(i6)) {
                            com.google.android.gms.internal.measurement.a.c(C0592h.b().e(), "players").E(o.getAccountObject().getId()).E("stockObject").E("itemsInStock").E("grocery").E(e.x(a.F(i6), 0)).E(a.z()).d(new C0972a(bVar, 1));
                            return;
                        }
                        return;
                    }
                }
                return;
            }
            return;
        }
        b.w(false);
        if (dVar.hasProblemInCityOrPlace) {
            com.google.android.gms.internal.measurement.a.n(MyApplication.f7090a, R.string.can_not_buy_from_city_market, hVar.f9018b, (String) null);
            c.E0(hVar.f9018b);
        } else if (!dVar.isMarketCountChanged) {
            com.google.android.gms.internal.measurement.a.n(MyApplication.f7090a, R.string.selected_number_of_items_not_available, hVar.f9018b, (String) null);
        } else if (!dVar.isCashChanged) {
            c.x0(hVar.f9018b);
        } else if (a.z().equals("count") && o.getStockObject().getStockFreeSpace() < i2) {
            com.google.android.gms.internal.measurement.a.n(MyApplication.f7090a, R.string.no_enough_space_in_stock, hVar.f9018b, (String) null);
        } else if (!a.z().equals("countInBag") || o.getStockObject().getBagFreeSpace() >= i2) {
            com.google.android.gms.internal.measurement.a.n(MyApplication.f7090a, R.string.unknown_error_try_again, hVar.f9018b, (String) null);
        } else {
            com.google.android.gms.internal.measurement.a.n(MyApplication.f7090a, R.string.no_enough_space_in_bag, hVar.f9018b, (String) null);
        }
    }

    public void o(int i2) {
        switch (this.f9034a) {
            case 0:
                C0626h hVar = this.d;
                int i5 = this.f9035b;
                if (i2 < i5) {
                    c.s0(hVar.f9018b, MyApplication.f7090a.getApplicationContext().getString(R.string.no_free_space_in_stock), (String) null);
                    b.w(false);
                    return;
                }
                C0626h.a(hVar, this.f9036c, i5);
                return;
            default:
                C0626h hVar2 = this.d;
                int i6 = this.f9035b;
                if (i2 < i6) {
                    c.s0(hVar2.f9018b, MyApplication.f7090a.getApplicationContext().getString(R.string.no_enough_space_in_bag), (String) null);
                    b.w(false);
                    return;
                }
                C0626h.a(hVar2, this.f9036c, i6);
                return;
        }
    }

    public C0631j0(C0626h hVar, D d6, int i2) {
        this.f9034a = 2;
        this.d = hVar;
        this.f9036c = d6;
        this.f9035b = i2;
    }
}
