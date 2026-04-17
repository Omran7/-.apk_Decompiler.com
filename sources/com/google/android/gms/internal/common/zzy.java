package com.google.android.gms.internal.common;

import java.io.IOException;
import java.util.Iterator;

final class zzy implements Iterable {
    final /* synthetic */ CharSequence zza;
    final /* synthetic */ zzaa zzb;

    public zzy(zzaa zzaa, CharSequence charSequence) {
        this.zza = charSequence;
        this.zzb = zzaa;
    }

    public final Iterator iterator() {
        return this.zzb.zzh(this.zza);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append('[');
        Iterator it2 = iterator();
        try {
            if (it2.hasNext()) {
                sb.append(zzt.zza(it2.next(), ", "));
                while (it2.hasNext()) {
                    sb.append(", ");
                    sb.append(zzt.zza(it2.next(), ", "));
                }
            }
            sb.append(']');
            return sb.toString();
        } catch (IOException e6) {
            throw new AssertionError(e6);
        }
    }
}
