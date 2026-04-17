package T1;

import android.os.Bundle;
import android.os.DeadObjectException;
import android.text.TextUtils;
import com.android.billingclient.api.Purchase;
import com.google.android.gms.common.internal.I;
import com.google.android.gms.internal.play_billing.zzan;
import com.google.android.gms.internal.play_billing.zzco;
import com.google.android.gms.internal.play_billing.zze;
import com.mtma.criminal.city.utils.N;
import j4.C;
import j4.p0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.concurrent.Callable;
import m0.a0;
import n3.C0865f;
import n3.C0866g;
import n3.G;
import n3.q;
import n3.y;
import n3.z;
import o3.b;
import org.json.JSONException;
import org.json.JSONObject;
import p3.C0917a;
import q3.e;
import q3.l;
import q4.C0938b;
import s3.C0964b;
import s3.C0968f;
import s3.C0969g;
import s3.C0970h;
import u3.C1031a;
import v3.C1048c;
import v3.k;
import v3.m;
import v3.s;
import w0.C1054a;
import w0.C1056c;
import w0.C1073t;

/* renamed from: T1.y0  reason: case insensitive filesystem */
public final class C0224y0 implements Callable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f3541a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f3542b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Object f3543c;

    public /* synthetic */ C0224y0(Object obj, Object obj2, int i2) {
        this.f3541a = i2;
        this.f3543c = obj2;
        this.f3542b = obj;
    }

    public final Object call() {
        C c3;
        boolean z3;
        boolean z4;
        s sVar;
        boolean z5;
        s c6;
        C1048c cVar;
        a0 a0Var;
        zzan zzan;
        Bundle bundle;
        C1031a aVar;
        int i2;
        switch (this.f3541a) {
            case 0:
                D0 d02 = (D0) this.f3542b;
                d02.f2818a.j();
                C0191n nVar = d02.f2818a.f3062c;
                T1.L(nVar);
                return nVar.w((String) this.f3543c);
            case 1:
                D0 d03 = (D0) this.f3542b;
                d03.f2818a.j();
                return new C0176i(d03.f2818a.d0(((Z1) this.f3543c).f3201a));
            case 2:
                Z1 z12 = (Z1) this.f3543c;
                String str = z12.f3201a;
                I.g(str);
                T1 t12 = (T1) this.f3542b;
                J0 n02 = t12.n0(str);
                I0 i02 = I0.ANALYTICS_STORAGE;
                if (n02.k(i02) && J0.e(100, z12.f3189D).k(i02)) {
                    return t12.f0(z12).d();
                }
                t12.c().f3180w.a("Analytics storage consent denied. Returning null app instance id");
                return null;
            case 3:
                C0865f fVar = (C0865f) this.f3543c;
                C0969g e6 = fVar.e();
                C0866g gVar = e6.f11538a;
                y yVar = (y) this.f3542b;
                e eVar = yVar.f10347a;
                C0866g gVar2 = gVar;
                boolean z6 = false;
                s sVar2 = null;
                while (!eVar.isEmpty()) {
                    q qVar = (q) eVar.f11088a;
                    if (qVar != null) {
                        if (sVar2 == null) {
                            sVar2 = qVar.c(gVar2);
                        }
                        if (z6 || qVar.f()) {
                            z6 = true;
                        } else {
                            z6 = false;
                        }
                    }
                    if (gVar2.isEmpty()) {
                        cVar = C1048c.e("");
                    } else {
                        cVar = gVar2.z();
                    }
                    eVar = eVar.w(cVar);
                    gVar2 = gVar2.C();
                }
                q qVar2 = (q) yVar.f10347a.v(gVar);
                C0917a aVar2 = yVar.f10351f;
                if (qVar2 == null) {
                    qVar2 = new q(aVar2);
                    yVar.f10347a = yVar.f10347a.y(gVar, qVar2);
                } else {
                    if (z6 || qVar2.f()) {
                        z6 = true;
                    } else {
                        z6 = false;
                    }
                    if (sVar2 == null) {
                        sVar2 = qVar2.c(C0866g.d);
                    }
                }
                aVar2.e();
                C0968f fVar2 = e6.f11539b;
                if (sVar2 != null) {
                    c3 = new C(new m(sVar2, fVar2.g), true, false);
                } else {
                    c3 = new C(new m(k.f12295e, e6.f11539b.g), false, false);
                    if (!c3.f8849a) {
                        s sVar3 = k.f12295e;
                        for (Map.Entry entry : yVar.f10347a.A(gVar).f11089b) {
                            q qVar3 = (q) ((e) entry.getValue()).f11088a;
                            if (!(qVar3 == null || (c6 = qVar3.c(C0866g.d)) == null)) {
                                sVar3 = sVar3.r((C1048c) entry.getKey(), c6);
                            }
                        }
                        for (v3.q qVar4 : ((m) c3.f8851c).f12296a) {
                            if (!sVar3.d(qVar4.f12304a)) {
                                sVar3 = sVar3.r(qVar4.f12304a, qVar4.f12305b);
                            }
                        }
                        c3 = new C(new m(sVar3, fVar2.g), false, false);
                    }
                }
                if (qVar2.g(e6) != null) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (z3 || fVar2.h()) {
                    z4 = z3;
                } else {
                    HashMap hashMap = yVar.d;
                    l.b("View does not exist but we have a tag", !hashMap.containsKey(e6));
                    long j6 = yVar.h;
                    z4 = z3;
                    yVar.h = j6 + 1;
                    z zVar = new z(j6);
                    hashMap.put(e6, zVar);
                    yVar.f10349c.put(zVar, e6);
                }
                G g = yVar.f10348b;
                g.getClass();
                a0 a0Var2 = new a0(gVar, g, 7);
                C0969g e7 = fVar.e();
                HashMap hashMap2 = qVar2.f10319a;
                C0970h hVar = (C0970h) hashMap2.get(e7.f11539b);
                C0968f fVar3 = e7.f11539b;
                if (hVar == null) {
                    boolean z7 = c3.f8849a;
                    m mVar = (m) c3.f8851c;
                    if (z7) {
                        sVar = mVar.f12296a;
                    } else {
                        sVar = null;
                    }
                    s a6 = g.a(gVar, sVar, Collections.emptyList(), false);
                    m mVar2 = mVar;
                    if (a6 != null) {
                        z5 = true;
                    } else {
                        s sVar4 = mVar2.f12296a;
                        if (sVar4 == null) {
                            sVar4 = k.f12295e;
                        }
                        a6 = a0Var2.g(sVar4);
                        z5 = false;
                    }
                    hVar = new C0970h(e7, new a0(new C(new m(a6, fVar3.g), z5, false), c3, 14));
                }
                if (!fVar3.h()) {
                    HashSet hashSet = new HashSet();
                    for (v3.q qVar5 : ((m) ((C) hVar.f11542c.f9925b).f8851c).f12296a) {
                        hashSet.add(qVar5.f12304a);
                    }
                    qVar2.f10320b.e();
                }
                if (!hashMap2.containsKey(fVar3)) {
                    hashMap2.put(fVar3, hVar);
                }
                hashMap2.put(fVar3, hVar);
                hVar.d.add(fVar);
                C c7 = (C) hVar.f11542c.f9925b;
                ArrayList arrayList = new ArrayList();
                for (v3.q qVar6 : ((m) c7.f8851c).f12296a) {
                    arrayList.add(new C0964b(2, m.t(qVar6.f12305b), qVar6.f12304a, (C1048c) null, (m) null));
                }
                boolean z8 = c7.f8849a;
                m mVar3 = (m) c7.f8851c;
                if (z8) {
                    arrayList.add(new C0964b(5, mVar3, (C1048c) null, (C1048c) null, (m) null));
                }
                ArrayList a7 = hVar.a(arrayList, mVar3, fVar);
                if (!z4 && !z6) {
                    C0970h g5 = qVar2.g(e6);
                    z l6 = yVar.l(e6);
                    G g6 = new G(yVar, g5);
                    yVar.f10350e.c(y.j(e6), l6, g6, g6);
                    e A6 = yVar.f10347a.A(e6.f11538a);
                    if (l6 != null) {
                        l.b("If we're adding a query, it shouldn't be shadowed", !((q) A6.f11088a).f());
                    } else {
                        p0 p0Var = new p0(yVar, 12);
                        A6.getClass();
                        A6.t(C0866g.d, p0Var, (Object) null);
                    }
                }
                return a7;
            case 4:
                y yVar2 = (y) this.f3542b;
                C0917a aVar3 = yVar2.f10351f;
                C0866g gVar3 = (C0866g) this.f3543c;
                aVar3.b(C0969g.a(gVar3));
                return y.a(yVar2, new b(o3.e.f10441e, gVar3));
            case 5:
                y yVar3 = (y) this.f3542b;
                C0969g gVar4 = (C0969g) yVar3.f10349c.get((z) this.f3543c);
                if (gVar4 == null) {
                    return Collections.emptyList();
                }
                yVar3.f10351f.b(gVar4);
                return y.b(yVar3, gVar4, new b(new o3.e(2, gVar4.f11539b, true), C0866g.d));
            default:
                C1054a aVar4 = (C1054a) this.f3542b;
                aVar4.getClass();
                zze.zzk("BillingClient", "Querying owned items, item type: ".concat("inapp"));
                ArrayList arrayList2 = new ArrayList();
                boolean z9 = aVar4.f12343m;
                boolean z10 = aVar4.f12348r;
                aVar4.f12351u.getClass();
                aVar4.f12351u.getClass();
                Bundle zzd = zze.zzd(z9, z10, true, false, aVar4.f12336c, aVar4.f12355y.longValue());
                Exception exc = null;
                String str2 = null;
                while (true) {
                    try {
                        synchronized (aVar4.f12334a) {
                            zzan = aVar4.h;
                        }
                        if (zzan == null) {
                            a0Var = aVar4.p(C1073t.f12398i, 119, "Service has been reset to null", exc);
                        } else {
                            if (aVar4.f12343m) {
                                if (true != aVar4.f12348r) {
                                    i2 = 9;
                                } else {
                                    i2 = 19;
                                }
                                bundle = zzan.zzj(i2, aVar4.f12338f.getPackageName(), "inapp", str2, zzd);
                            } else {
                                bundle = zzan.zzi(3, aVar4.f12338f.getPackageName(), "inapp", str2);
                            }
                            C1056c cVar2 = C1073t.g;
                            if (bundle == null) {
                                zze.zzl("BillingClient", "getPurchase() got null owned items list");
                                aVar = new C1031a(cVar2, 54);
                            } else {
                                int zzb = zze.zzb(bundle, "BillingClient");
                                String zzh = zze.zzh(bundle, "BillingClient");
                                N a8 = C1056c.a();
                                a8.f7367a = zzb;
                                a8.f7368b = zzh;
                                C1056c a9 = a8.a();
                                if (zzb != 0) {
                                    zze.zzl("BillingClient", "getPurchase() failed. Response code: " + zzb);
                                    aVar = new C1031a(a9, 23);
                                } else if (!bundle.containsKey("INAPP_PURCHASE_ITEM_LIST") || !bundle.containsKey("INAPP_PURCHASE_DATA_LIST") || !bundle.containsKey("INAPP_DATA_SIGNATURE_LIST")) {
                                    zze.zzl("BillingClient", "Bundle returned from getPurchase() doesn't contain required fields.");
                                    aVar = new C1031a(cVar2, 55);
                                } else {
                                    ArrayList<String> stringArrayList = bundle.getStringArrayList("INAPP_PURCHASE_ITEM_LIST");
                                    ArrayList<String> stringArrayList2 = bundle.getStringArrayList("INAPP_PURCHASE_DATA_LIST");
                                    ArrayList<String> stringArrayList3 = bundle.getStringArrayList("INAPP_DATA_SIGNATURE_LIST");
                                    if (stringArrayList == null) {
                                        zze.zzl("BillingClient", "Bundle returned from getPurchase() contains null SKUs list.");
                                        aVar = new C1031a(cVar2, 56);
                                    } else if (stringArrayList2 == null) {
                                        zze.zzl("BillingClient", "Bundle returned from getPurchase() contains null purchases list.");
                                        aVar = new C1031a(cVar2, 57);
                                    } else if (stringArrayList3 == null) {
                                        zze.zzl("BillingClient", "Bundle returned from getPurchase() contains null signatures list.");
                                        aVar = new C1031a(cVar2, 58);
                                    } else {
                                        aVar = new C1031a(C1073t.h, 1);
                                    }
                                }
                            }
                            C1056c cVar3 = (C1056c) aVar.f11849b;
                            if (cVar3 != C1073t.h) {
                                a0Var = aVar4.p(cVar3, aVar.f11848a, "Purchase bundle invalid", exc);
                            } else {
                                ArrayList<String> stringArrayList4 = bundle.getStringArrayList("INAPP_PURCHASE_ITEM_LIST");
                                ArrayList<String> stringArrayList5 = bundle.getStringArrayList("INAPP_PURCHASE_DATA_LIST");
                                ArrayList<String> stringArrayList6 = bundle.getStringArrayList("INAPP_DATA_SIGNATURE_LIST");
                                int i5 = 0;
                                boolean z11 = false;
                                while (i5 < stringArrayList5.size()) {
                                    String str3 = stringArrayList5.get(i5);
                                    String str4 = stringArrayList6.get(i5);
                                    zze.zzk("BillingClient", "Sku is owned: ".concat(String.valueOf(stringArrayList4.get(i5))));
                                    try {
                                        Purchase purchase = new Purchase(str3, str4);
                                        JSONObject jSONObject = purchase.f5723c;
                                        if (TextUtils.isEmpty(jSONObject.optString("token", jSONObject.optString("purchaseToken")))) {
                                            zze.zzl("BillingClient", "BUG: empty/null token!");
                                            z11 = true;
                                        }
                                        arrayList2.add(purchase);
                                        i5++;
                                    } catch (JSONException e8) {
                                        a0Var = aVar4.p(C1073t.g, 51, "Got an exception trying to decode the purchase!", e8);
                                    }
                                }
                                if (z11) {
                                    aVar4.t(26, 9, C1073t.g);
                                }
                                str2 = bundle.getString("INAPP_CONTINUATION_TOKEN");
                                zze.zzk("BillingClient", "Continuation token: ".concat(String.valueOf(str2)));
                                if (TextUtils.isEmpty(str2)) {
                                    a0Var = new a0(C1073t.h, arrayList2, 20);
                                } else {
                                    exc = null;
                                }
                            }
                        }
                    } catch (DeadObjectException e9) {
                        a0Var = aVar4.p(C1073t.f12398i, 52, "Got exception trying to get purchases try to reconnect", e9);
                    } catch (Exception e10) {
                        a0Var = aVar4.p(C1073t.g, 52, "Got exception trying to get purchases try to reconnect", e10);
                    }
                }
                ArrayList arrayList3 = (ArrayList) a0Var.f9926c;
                if (arrayList3 != null) {
                    ((C0938b) this.f3543c).b((C1056c) a0Var.f9925b, arrayList3);
                    return null;
                }
                ((C0938b) this.f3543c).b((C1056c) a0Var.f9925b, zzco.zzl());
                return null;
        }
    }
}
