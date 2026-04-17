package com.google.android.gms.internal.measurement;

import h0.C0552a;
import java.io.Serializable;
import java.util.Iterator;
import java.util.Locale;

public abstract class zzld implements Iterable, Serializable {
    public static final zzld zzb = new zzlb(zzmk.zzb);
    private int zza = 0;

    static {
        int i2 = zzkr.zza;
    }

    public static int zzh(int i2, int i5, int i6) {
        int i7 = i5 - i2;
        if ((i2 | i5 | i7 | (i6 - i5)) >= 0) {
            return i7;
        }
        if (i2 < 0) {
            throw new IndexOutOfBoundsException(C0552a.k(i2, "Beginning index: ", " < 0"));
        } else if (i5 < i2) {
            throw new IndexOutOfBoundsException(C0552a.l("Beginning index larger than ending index: ", i2, i5, ", "));
        } else {
            throw new IndexOutOfBoundsException(C0552a.l("End index: ", i5, i6, " >= "));
        }
    }

    public static zzld zzj(byte[] bArr, int i2, int i5) {
        zzh(i2, i2 + i5, bArr.length);
        byte[] bArr2 = new byte[i5];
        System.arraycopy(bArr, i2, bArr2, 0, i5);
        return new zzlb(bArr2);
    }

    public abstract boolean equals(Object obj);

    public final int hashCode() {
        int i2 = this.zza;
        if (i2 == 0) {
            int zzd = zzd();
            i2 = zze(zzd, 0, zzd);
            if (i2 == 0) {
                i2 = 1;
            }
            this.zza = i2;
        }
        return i2;
    }

    public final /* synthetic */ Iterator iterator() {
        return new zzkw(this);
    }

    public final String toString() {
        String str;
        Locale locale = Locale.ROOT;
        String hexString = Integer.toHexString(System.identityHashCode(this));
        int zzd = zzd();
        if (zzd() <= 50) {
            str = zzoc.zza(this);
        } else {
            str = zzoc.zza(zzf(0, 47)).concat("...");
        }
        StringBuilder sb = new StringBuilder("<ByteString@");
        sb.append(hexString);
        sb.append(" size=");
        sb.append(zzd);
        sb.append(" contents=\"");
        return C0552a.r(sb, str, "\">");
    }

    public abstract byte zza(int i2);

    public abstract byte zzb(int i2);

    public abstract int zzd();

    public abstract int zze(int i2, int i5, int i6);

    public abstract zzld zzf(int i2, int i5);

    public abstract void zzg(zzkv zzkv);

    public final int zzi() {
        return this.zza;
    }
}
