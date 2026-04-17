package com.google.android.recaptcha.internal;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import n5.C0874f;
import n5.C0877i;

public final class zzgn implements zzgx {
    public static final zzgn zza = new zzgn();

    private zzgn() {
    }

    private static final boolean zzb(List list) {
        ArrayList arrayList = new ArrayList(C0877i.T0(list));
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList.add(Boolean.valueOf(((zzue) it2.next()).zzR()));
        }
        if (!arrayList.contains(Boolean.FALSE)) {
            return true;
        }
        return false;
    }

    public final void zza(int i2, zzgd zzgd, zzue... zzueArr) {
        if (zzb(C0874f.A1(zzueArr))) {
            for (zzue zzi : zzueArr) {
                zzgd.zzc().zzb(zzi.zzi());
            }
            return;
        }
        throw new zzce(4, 5, (Throwable) null);
    }
}
