package com.google.android.recaptcha.internal;

import java.util.Iterator;
import java.util.List;

final class zzjp extends zzjk {
    final /* synthetic */ Iterable zza;
    final /* synthetic */ int zzb;

    public zzjp(Iterable iterable, int i2) {
        this.zza = iterable;
        this.zzb = i2;
    }

    public final Iterator iterator() {
        boolean z3;
        Iterable iterable = this.zza;
        if (iterable instanceof List) {
            List list = (List) iterable;
            return list.subList(Math.min(list.size(), this.zzb), list.size()).iterator();
        }
        int i2 = this.zzb;
        Iterator it2 = iterable.iterator();
        it2.getClass();
        if (i2 >= 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        zzjf.zzb(z3, "numberToAdvance must be nonnegative");
        for (int i5 = 0; i5 < i2 && it2.hasNext(); i5++) {
            it2.next();
        }
        return new zzjo(this, it2);
    }
}
