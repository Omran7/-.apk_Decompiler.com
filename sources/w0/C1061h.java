package w0;

import A2.f;
import I5.u;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.text.TextUtils;
import com.google.android.gms.internal.measurement.a;
import com.google.android.gms.internal.play_billing.zzan;
import com.google.android.gms.internal.play_billing.zzbe;
import com.google.android.gms.internal.play_billing.zzco;
import com.google.android.gms.internal.play_billing.zze;
import j4.p0;
import java.util.ArrayList;
import java.util.concurrent.Callable;
import m0.a0;
import org.json.JSONException;
import q4.C0937a;

/* renamed from: w0.h  reason: case insensitive filesystem */
public final /* synthetic */ class C1061h implements Callable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f12371a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ C1054a f12372b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Object f12373c;
    public final /* synthetic */ Object d;

    public /* synthetic */ C1061h(C1054a aVar, Object obj, Object obj2, int i2) {
        this.f12371a = i2;
        this.f12372b = aVar;
        this.f12373c = obj;
        this.d = obj2;
    }

    public final Object call() {
        zzan zzan;
        int i2;
        String str;
        f fVar;
        int i5;
        zzan zzan2;
        int i6;
        zzan zzan3;
        switch (this.f12371a) {
            case 0:
                C1054a aVar = this.f12372b;
                a0 a0Var = (a0) this.d;
                String str2 = ((u) this.f12373c).f1280b;
                try {
                    zze.zzk("BillingClient", "Consuming purchase with token: ".concat(str2));
                    synchronized (aVar.f12334a) {
                        zzan = aVar.h;
                    }
                    if (zzan == null) {
                        aVar.q(a0Var, C1073t.f12398i, 119, "Service has been reset to null.", (Exception) null);
                        return null;
                    }
                    if (aVar.f12343m) {
                        String packageName = aVar.f12338f.getPackageName();
                        boolean z3 = aVar.f12343m;
                        String str3 = aVar.f12336c;
                        long longValue = aVar.f12355y.longValue();
                        Bundle bundle = new Bundle();
                        if (z3) {
                            zze.zzc(bundle, str3, longValue);
                        }
                        Bundle zze = zzan.zze(9, packageName, str2, bundle);
                        i2 = zze.getInt("RESPONSE_CODE");
                        str = zze.zzh(zze, "BillingClient");
                    } else {
                        i2 = zzan.zza(3, aVar.f12338f.getPackageName(), str2);
                        str = "";
                    }
                    C1056c a6 = C1073t.a(i2, str);
                    if (i2 == 0) {
                        zze.zzk("BillingClient", "Successfully consumed purchase.");
                        a0Var.p(a6);
                        return null;
                    }
                    aVar.q(a0Var, a6, 23, "Error consuming purchase with token. Response code: " + i2, (Exception) null);
                    return null;
                } catch (DeadObjectException e6) {
                    aVar.q(a0Var, C1073t.f12398i, 29, "Error consuming purchase!", e6);
                    return null;
                } catch (Exception e7) {
                    aVar.q(a0Var, C1073t.g, 29, "Error consuming purchase!", e7);
                    return null;
                }
            case 1:
                C1054a aVar2 = this.f12372b;
                p0 p0Var = (p0) this.f12373c;
                ArrayList arrayList = new ArrayList();
                String str4 = ((C1060g) ((zzco) p0Var.f9075b).get(0)).f12370b;
                zzco zzco = (zzco) p0Var.f9075b;
                int size = zzco.size();
                int i7 = 0;
                while (true) {
                    if (i7 < size) {
                        int i8 = i7 + 20;
                        if (i8 > size) {
                            i5 = size;
                        } else {
                            i5 = i8;
                        }
                        ArrayList arrayList2 = new ArrayList(zzco.subList(i7, i5));
                        ArrayList arrayList3 = new ArrayList();
                        int size2 = arrayList2.size();
                        for (int i9 = 0; i9 < size2; i9++) {
                            arrayList3.add(((C1060g) arrayList2.get(i9)).f12369a);
                        }
                        Bundle bundle2 = new Bundle();
                        bundle2.putStringArrayList("ITEM_ID_LIST", arrayList3);
                        bundle2.putString("playBillingLibraryVersion", aVar2.f12336c);
                        try {
                            synchronized (aVar2.f12334a) {
                                zzan2 = aVar2.h;
                            }
                            if (zzan2 == null) {
                                fVar = aVar2.o(C1073t.f12398i, 119, "Service has been reset to null.", (Exception) null);
                            } else {
                                if (true != aVar2.f12349s) {
                                    i6 = 17;
                                } else {
                                    i6 = 20;
                                }
                                int i10 = i6;
                                String packageName2 = aVar2.f12338f.getPackageName();
                                if (aVar2.f12348r) {
                                    aVar2.f12351u.getClass();
                                }
                                String str5 = aVar2.f12336c;
                                aVar2.h();
                                aVar2.h();
                                aVar2.h();
                                aVar2.h();
                                int i11 = i8;
                                long longValue2 = aVar2.f12355y.longValue();
                                Bundle bundle3 = new Bundle();
                                zze.zzc(bundle3, str5, longValue2);
                                bundle3.putBoolean("enablePendingPurchases", true);
                                bundle3.putString("SKU_DETAILS_RESPONSE_FORMAT", "PRODUCT_DETAILS");
                                ArrayList arrayList4 = new ArrayList();
                                ArrayList arrayList5 = new ArrayList();
                                int size3 = arrayList2.size();
                                int i12 = 0;
                                boolean z4 = false;
                                boolean z5 = false;
                                while (i12 < size3) {
                                    ArrayList arrayList6 = arrayList2;
                                    arrayList4.add((Object) null);
                                    z4 |= !TextUtils.isEmpty((CharSequence) null);
                                    if (((C1060g) arrayList2.get(i12)).f12370b.equals("first_party")) {
                                        zzbe.zzc((Object) null, "Serialized DocId is required for constructing ExtraParams to query ProductDetails for all first party products.");
                                        arrayList5.add((Object) null);
                                        z5 = true;
                                    }
                                    i12++;
                                    arrayList2 = arrayList6;
                                }
                                if (z4) {
                                    bundle3.putStringArrayList("SKU_OFFER_ID_TOKEN_LIST", arrayList4);
                                }
                                if (!arrayList5.isEmpty()) {
                                    bundle3.putStringArrayList("SKU_SERIALIZED_DOCID_LIST", arrayList5);
                                }
                                if (z5 && !TextUtils.isEmpty((CharSequence) null)) {
                                    bundle3.putString("accountName", (String) null);
                                }
                                Bundle zzl = zzan2.zzl(i10, packageName2, str4, bundle2, bundle3);
                                if (zzl == null) {
                                    fVar = aVar2.o(C1073t.f12404o, 44, "queryProductDetailsAsync got empty product details response.", (Exception) null);
                                } else if (!zzl.containsKey("DETAILS_LIST")) {
                                    int zzb = zze.zzb(zzl, "BillingClient");
                                    String zzh = zze.zzh(zzl, "BillingClient");
                                    if (zzb != 0) {
                                        fVar = aVar2.o(C1073t.a(zzb, zzh), 23, a.f(zzb, "getSkuDetails() failed for queryProductDetailsAsync. Response code: "), (Exception) null);
                                    } else {
                                        fVar = aVar2.o(C1073t.a(6, zzh), 45, "getSkuDetails() returned a bundle with neither an error nor a product detail list for queryProductDetailsAsync.", (Exception) null);
                                    }
                                } else {
                                    ArrayList<String> stringArrayList = zzl.getStringArrayList("DETAILS_LIST");
                                    if (stringArrayList != null) {
                                        int i13 = 0;
                                        while (i13 < stringArrayList.size()) {
                                            try {
                                                C1059f fVar2 = new C1059f(stringArrayList.get(i13));
                                                zze.zzk("BillingClient", "Got product details: ".concat(fVar2.toString()));
                                                arrayList.add(fVar2);
                                                i13++;
                                            } catch (JSONException e8) {
                                                fVar = aVar2.o(C1073t.a(6, "Error trying to decode SkuDetails."), 47, "Got a JSON exception trying to decode ProductDetails. \n Exception: ", e8);
                                            }
                                        }
                                        i7 = i11;
                                    } else {
                                        fVar = aVar2.o(C1073t.f12404o, 46, "queryProductDetailsAsync got null response list", (Exception) null);
                                    }
                                }
                            }
                        } catch (DeadObjectException e9) {
                            fVar = aVar2.o(C1073t.f12398i, 43, "queryProductDetailsAsync got a remote exception (try to reconnect).", e9);
                        } catch (Exception e10) {
                            fVar = aVar2.o(C1073t.g, 43, "queryProductDetailsAsync got a remote exception (try to reconnect).", e10);
                        }
                    } else {
                        fVar = new f(0, "", arrayList);
                    }
                }
                ((C0937a) this.d).a(C1073t.a(fVar.f29b, (String) fVar.d), (ArrayList) fVar.f30c);
                return null;
            default:
                C1054a aVar3 = this.f12372b;
                String str6 = (String) this.f12373c;
                String str7 = (String) this.d;
                try {
                    synchronized (aVar3.f12334a) {
                        zzan3 = aVar3.h;
                    }
                    if (zzan3 == null) {
                        return zze.zzn(C1073t.f12398i, 119);
                    }
                    return zzan3.zzf(3, aVar3.f12338f.getPackageName(), str6, str7, (String) null);
                } catch (DeadObjectException e11) {
                    return zze.zzo(C1073t.f12398i, 5, C1071r.a(e11));
                } catch (Exception e12) {
                    return zze.zzo(C1073t.g, 5, C1071r.a(e12));
                }
        }
    }
}
