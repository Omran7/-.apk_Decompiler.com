package com.google.android.gms.internal.fido;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

public final class zzdi extends zzdr {
    private final zzaz zza;
    private final int zzb;

    public zzdi(zzaz zzaz) {
        zzaz.getClass();
        this.zza = zzaz;
        int i2 = 0;
        int i5 = 0;
        while (true) {
            zzaz zzaz2 = this.zza;
            if (i2 >= zzaz2.size()) {
                break;
            }
            int zzb2 = ((zzdr) zzaz2.get(i2)).zzb();
            if (i5 < zzb2) {
                i5 = zzb2;
            }
            i2++;
        }
        int i6 = i5 + 1;
        this.zzb = i6;
        if (i6 > 4) {
            throw new zzdh("Exceeded cutoff limit for max depth of cbor value");
        }
    }

    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        zzdr zzdr = (zzdr) obj;
        if (zzdr.zzd(Byte.MIN_VALUE) != zzdr.zza()) {
            return zzdr.zzd(Byte.MIN_VALUE) - zzdr.zza();
        }
        zzdi zzdi = (zzdi) zzdr;
        zzaz zzaz = this.zza;
        int size = zzaz.size();
        zzaz zzaz2 = zzdi.zza;
        if (size != zzaz2.size()) {
            return zzaz.size() - zzaz2.size();
        }
        int i2 = 0;
        while (true) {
            zzaz zzaz3 = this.zza;
            if (i2 >= zzaz3.size()) {
                return 0;
            }
            int compareTo = ((zzdr) zzaz3.get(i2)).compareTo((zzdr) zzdi.zza.get(i2));
            if (compareTo != 0) {
                return compareTo;
            }
            i2++;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzdi.class == obj.getClass()) {
            return this.zza.equals(((zzdi) obj).zza);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(zzdr.zzd(Byte.MIN_VALUE)), this.zza});
    }

    public final String toString() {
        if (this.zza.isEmpty()) {
            return "[]";
        }
        ArrayList arrayList = new ArrayList();
        zzaz zzaz = this.zza;
        int size = zzaz.size();
        for (int i2 = 0; i2 < size; i2++) {
            arrayList.add(((zzdr) zzaz.get(i2)).toString().replace("\n", "\n  "));
        }
        zzag zza2 = zzag.zza(",\n  ");
        StringBuilder sb = new StringBuilder("[\n  ");
        try {
            zza2.zzb(sb, arrayList.iterator());
            sb.append("\n]");
            return sb.toString();
        } catch (IOException e6) {
            throw new AssertionError(e6);
        }
    }

    public final int zza() {
        return zzdr.zzd(Byte.MIN_VALUE);
    }

    public final int zzb() {
        return this.zzb;
    }
}
