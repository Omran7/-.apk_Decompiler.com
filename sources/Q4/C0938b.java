package q4;

import R2.b;
import T1.C0224y0;
import Y4.t;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.android.billingclient.api.Purchase;
import com.google.android.gms.internal.measurement.a;
import com.google.android.gms.internal.play_billing.zzco;
import com.google.android.gms.internal.play_billing.zze;
import com.mtma.criminal.city.R;
import com.mtma.criminal.city.app.MyApplication;
import j3.g;
import j4.p0;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import k.C0724m;
import k.C0737s0;
import w0.C1054a;
import w0.C1056c;
import w0.C1060g;
import w0.C1073t;

/* renamed from: q4.b  reason: case insensitive filesystem */
public final class C0938b {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ e f11104a;

    public /* synthetic */ C0938b(e eVar) {
        this.f11104a = eVar;
    }

    /* JADX WARNING: type inference failed for: r6v5, types: [java.lang.Object, com.google.android.gms.common.internal.n] */
    public void a(C1056c cVar) {
        if (cVar.f12358a == 0) {
            e eVar = this.f11104a;
            eVar.getClass();
            b.w(true);
            int i2 = eVar.f11110e0;
            if (i2 == 0) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(new t(50, R.drawable.money_buy_gold_1, "gold_0.99_usd"));
                arrayList.add(new t(300, R.drawable.money_buy_gold_2, "gold_4.99_usd"));
                arrayList.add(new t(700, R.drawable.money_buy_gold_3, "gold_9.99_usd"));
                arrayList.add(new t(2000, R.drawable.money_buy_gold_4, "gold_24.99_usd"));
                arrayList.add(new t(4500, R.drawable.money_buy_gold_5, "gold_49.99_usd"));
                arrayList.add(new t(10000, R.drawable.money_buy_gold_6, "gold_99.99_usd"));
                eVar.f11118m0 = arrayList;
            } else if (i2 == 1) {
                ArrayList arrayList2 = new ArrayList();
                arrayList2.add(new t((int) R.drawable.money_buy_cash_2, "1.25M", "cash_0.99_usd", 1250000));
                arrayList2.add(new t((int) R.drawable.money_buy_cash_3, "7.5M", "cash_4.99_usd", 7500000));
                arrayList2.add(new t((int) R.drawable.money_buy_cash_4, "20M", "cash_9.99_usd", 20000000));
                arrayList2.add(new t((int) R.drawable.money_buy_cash_5, "65M", "cash_24.99_usd", 65000000));
                arrayList2.add(new t((int) R.drawable.money_buy_cash_6, "175M", "cash_49.99_usd", 175000000));
                arrayList2.add(new t((int) R.drawable.money_buy_cash_7, "375M", "cash_99.99_usd", 375000000));
                eVar.f11118m0 = arrayList2;
            }
            ArrayList arrayList3 = new ArrayList();
            int i5 = 0;
            while (i5 < eVar.f11118m0.size()) {
                ? obj = new Object();
                String str = ((t) eVar.f11118m0.get(i5)).f4432e;
                obj.f6201a = str;
                obj.f6202b = "inapp";
                if (str != null) {
                    arrayList3.add(new C1060g(obj));
                    i5++;
                } else {
                    throw new IllegalArgumentException("Product id must be provided.");
                }
            }
            C1054a aVar = eVar.f11119n0;
            C0724m mVar = new C0724m(17);
            if (!arrayList3.isEmpty()) {
                HashSet hashSet = new HashSet();
                Iterator it2 = arrayList3.iterator();
                while (it2.hasNext()) {
                    C1060g gVar = (C1060g) it2.next();
                    if (!"play_pass_subs".equals(gVar.f12370b)) {
                        hashSet.add(gVar.f12370b);
                    }
                }
                if (hashSet.size() <= 1) {
                    zzco zzk = zzco.zzk(arrayList3);
                    mVar.f9345b = zzk;
                    if (zzk != null) {
                        aVar.d(new p0(mVar), new C0937a(eVar));
                        C1054a aVar2 = eVar.f11119n0;
                        C0938b bVar = new C0938b(eVar);
                        aVar2.getClass();
                        if (!aVar2.b()) {
                            C1056c cVar2 = C1073t.f12398i;
                            aVar2.t(2, 9, cVar2);
                            bVar.b(cVar2, zzco.zzl());
                        } else if (TextUtils.isEmpty("inapp")) {
                            zze.zzl("BillingClient", "Please provide a valid product type.");
                            C1056c cVar3 = C1073t.f12396e;
                            aVar2.t(50, 9, cVar3);
                            bVar.b(cVar3, zzco.zzl());
                        } else if (C1054a.f(new C0224y0(aVar2, bVar, 6), 30000, new g(aVar2, bVar, 10), aVar2.r(), aVar2.j()) == null) {
                            C1056c g = aVar2.g();
                            aVar2.t(25, 9, g);
                            bVar.b(g, zzco.zzl());
                        }
                    } else {
                        throw new IllegalArgumentException("Product list must be set to a non empty list.");
                    }
                } else {
                    throw new IllegalArgumentException("All products should be of the same product type.");
                }
            } else {
                throw new IllegalArgumentException("Product list cannot be empty.");
            }
        }
    }

    public void b(C1056c cVar, List list) {
        int i2 = cVar.f12358a;
        e eVar = this.f11104a;
        if (i2 == 0 && list != null) {
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                Purchase purchase = (Purchase) it2.next();
                if (purchase.f5723c.optInt("purchaseState", 1) != 4) {
                    new Handler(Looper.getMainLooper()).post(new C0737s0(this, 11));
                }
                e.V(eVar, purchase);
            }
        } else if (i2 != 1) {
            b.w(false);
            a.n(MyApplication.f7090a, R.string.purchase_uncompleted, eVar.f11109d0, (String) null);
        }
    }
}
