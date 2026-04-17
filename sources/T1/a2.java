package T1;

import com.google.android.gms.internal.measurement.zzfj;
import com.google.android.gms.internal.measurement.zzfr;
import com.google.android.gms.internal.measurement.zzhh;
import com.google.android.gms.internal.measurement.zzhi;
import com.google.android.gms.internal.measurement.zzhj;
import com.google.android.gms.internal.measurement.zzhk;
import com.google.android.gms.internal.measurement.zzib;
import com.google.android.gms.internal.measurement.zzic;
import com.google.android.gms.internal.measurement.zzid;
import com.google.android.gms.internal.measurement.zzie;
import com.google.android.gms.internal.measurement.zzpq;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import n.b;
import n.e;
import n.j;

public final class a2 {

    /* renamed from: a  reason: collision with root package name */
    public final String f3228a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f3229b;

    /* renamed from: c  reason: collision with root package name */
    public final zzic f3230c;
    public final BitSet d;

    /* renamed from: e  reason: collision with root package name */
    public final BitSet f3231e;

    /* renamed from: f  reason: collision with root package name */
    public final e f3232f;
    public final e g;
    public final /* synthetic */ C0158c h;

    /* JADX WARNING: type inference failed for: r1v4, types: [n.e, n.j] */
    /* JADX WARNING: type inference failed for: r1v5, types: [n.e, n.j] */
    public a2(C0158c cVar, String str) {
        this.h = cVar;
        this.f3228a = str;
        this.f3229b = true;
        this.d = new BitSet();
        this.f3231e = new BitSet();
        this.f3232f = new j(0);
        this.g = new j(0);
    }

    public final zzhi a(int i2) {
        ArrayList arrayList;
        List list;
        zzhh zzb = zzhi.zzb();
        zzb.zza(i2);
        zzb.zzc(this.f3229b);
        zzic zzic = this.f3230c;
        if (zzic != null) {
            zzb.zzd(zzic);
        }
        zzib zze = zzic.zze();
        zze.zzb(C0162d0.Y(this.d));
        zze.zzd(C0162d0.Y(this.f3231e));
        e eVar = this.f3232f;
        if (eVar == null) {
            arrayList = null;
        } else {
            ArrayList arrayList2 = new ArrayList(eVar.f10226c);
            Iterator it2 = ((b) eVar.keySet()).iterator();
            while (it2.hasNext()) {
                Integer num = (Integer) it2.next();
                int intValue = num.intValue();
                Long l6 = (Long) eVar.get(num);
                if (l6 != null) {
                    zzhj zzc = zzhk.zzc();
                    zzc.zzb(intValue);
                    zzc.zza(l6.longValue());
                    arrayList2.add((zzhk) zzc.zzba());
                }
            }
            arrayList = arrayList2;
        }
        if (arrayList != null) {
            zze.zza(arrayList);
        }
        e eVar2 = this.g;
        if (eVar2 == null) {
            list = Collections.emptyList();
        } else {
            ArrayList arrayList3 = new ArrayList(eVar2.f10226c);
            Iterator it3 = ((b) eVar2.keySet()).iterator();
            while (it3.hasNext()) {
                Integer num2 = (Integer) it3.next();
                zzid zzd = zzie.zzd();
                zzd.zzb(num2.intValue());
                List list2 = (List) eVar2.get(num2);
                if (list2 != null) {
                    Collections.sort(list2);
                    zzd.zza(list2);
                }
                arrayList3.add((zzie) zzd.zzba());
            }
            list = arrayList3;
        }
        zze.zzc(list);
        zzb.zzb(zze);
        return (zzhi) zzb.zzba();
    }

    public final void b(C0155b bVar) {
        int i2;
        boolean z3;
        boolean z4;
        switch (bVar.g) {
            case 0:
                i2 = ((zzfj) bVar.f3238i).zzb();
                break;
            default:
                i2 = ((zzfr) bVar.f3238i).zza();
                break;
        }
        if (bVar.f3235c != null) {
            this.f3231e.set(i2, true);
        }
        Boolean bool = bVar.d;
        if (bool != null) {
            this.d.set(i2, bool.booleanValue());
        }
        if (bVar.f3236e != null) {
            Integer valueOf = Integer.valueOf(i2);
            e eVar = this.f3232f;
            Long l6 = (Long) eVar.get(valueOf);
            long longValue = bVar.f3236e.longValue() / 1000;
            if (l6 == null || longValue > l6.longValue()) {
                eVar.put(valueOf, Long.valueOf(longValue));
            }
        }
        if (bVar.f3237f != null) {
            e eVar2 = this.g;
            Integer valueOf2 = Integer.valueOf(i2);
            List list = (List) eVar2.get(valueOf2);
            if (list == null) {
                list = new ArrayList();
                eVar2.put(valueOf2, list);
            }
            switch (bVar.g) {
                case 0:
                    z3 = false;
                    break;
                default:
                    z3 = true;
                    break;
            }
            if (z3) {
                list.clear();
            }
            zzpq.zzb();
            C0212u0 u0Var = (C0212u0) this.h.f398a;
            C0170g gVar = u0Var.f3494p;
            G g5 = H.f2853E0;
            String str = this.f3228a;
            if (gVar.B(str, g5)) {
                switch (bVar.g) {
                    case 0:
                        z4 = ((zzfj) bVar.f3238i).zzo();
                        break;
                    default:
                        z4 = false;
                        break;
                }
                if (z4) {
                    list.clear();
                }
            }
            zzpq.zzb();
            if (u0Var.f3494p.B(str, g5)) {
                Long valueOf3 = Long.valueOf(bVar.f3237f.longValue() / 1000);
                if (!list.contains(valueOf3)) {
                    list.add(valueOf3);
                    return;
                }
                return;
            }
            list.add(Long.valueOf(bVar.f3237f.longValue() / 1000));
        }
    }

    /* JADX WARNING: type inference failed for: r1v1, types: [n.e, n.j] */
    public a2(C0158c cVar, String str, zzic zzic, BitSet bitSet, BitSet bitSet2, e eVar, e eVar2) {
        this.h = cVar;
        this.f3228a = str;
        this.d = bitSet;
        this.f3231e = bitSet2;
        this.f3232f = eVar;
        this.g = new j(0);
        Iterator it2 = ((b) eVar2.keySet()).iterator();
        while (it2.hasNext()) {
            Integer num = (Integer) it2.next();
            ArrayList arrayList = new ArrayList();
            arrayList.add((Long) eVar2.get(num));
            this.g.put(num, arrayList);
        }
        this.f3229b = false;
        this.f3230c = zzic;
    }
}
