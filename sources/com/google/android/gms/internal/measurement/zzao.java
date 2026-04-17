package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class zzao extends zzai implements zzal {
    protected final List zza;
    protected final List zzb;
    protected zzg zzc;

    private zzao(zzao zzao) {
        super(zzao.zzd);
        ArrayList arrayList = new ArrayList(zzao.zza.size());
        this.zza = arrayList;
        arrayList.addAll(zzao.zza);
        ArrayList arrayList2 = new ArrayList(zzao.zzb.size());
        this.zzb = arrayList2;
        arrayList2.addAll(zzao.zzb);
        this.zzc = zzao.zzc;
    }

    public final zzap zza(zzg zzg, List list) {
        zzg zza2 = this.zzc.zza();
        int i2 = 0;
        while (true) {
            List list2 = this.zza;
            if (i2 >= list2.size()) {
                break;
            }
            if (i2 < list.size()) {
                zza2.zze((String) list2.get(i2), zzg.zzb((zzap) list.get(i2)));
            } else {
                zza2.zze((String) list2.get(i2), zzap.zzf);
            }
            i2++;
        }
        for (zzap zzap : this.zzb) {
            zzap zzb2 = zza2.zzb(zzap);
            if (zzb2 instanceof zzaq) {
                zzb2 = zza2.zzb(zzap);
            }
            if (zzb2 instanceof zzag) {
                return ((zzag) zzb2).zzb();
            }
        }
        return zzap.zzf;
    }

    public final zzap zzd() {
        return new zzao(this);
    }

    public zzao(String str, List list, List list2, zzg zzg) {
        super(str);
        this.zza = new ArrayList();
        this.zzc = zzg;
        if (!list.isEmpty()) {
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                this.zza.add(((zzap) it2.next()).zzi());
            }
        }
        this.zzb = new ArrayList(list2);
    }
}
