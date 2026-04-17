package com.google.android.gms.internal.fido;

import h0.C0552a;
import java.io.InputStream;
import java.io.Serializable;
import java.nio.ByteBuffer;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Locale;

public abstract class zzcz implements Iterable, Serializable {
    private static final Comparator zza = new zzcr();
    public static final zzcz zzb = new zzcw(zzde.zzd);
    private static final zzcy zzd = new zzcy((zzcx) null);
    private int zzc = 0;

    static {
        int i2 = zzcp.zza;
    }

    public static int zzj(int i2, int i5, int i6) {
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

    public static zzcz zzl(byte[] bArr, int i2, int i5) {
        zzj(0, i5, bArr.length);
        byte[] bArr2 = new byte[i5];
        System.arraycopy(bArr, 0, bArr2, 0, i5);
        return new zzcw(bArr2);
    }

    public abstract boolean equals(Object obj);

    public final int hashCode() {
        int i2 = this.zzc;
        if (i2 == 0) {
            int zzd2 = zzd();
            i2 = zzf(zzd2, 0, zzd2);
            if (i2 == 0) {
                i2 = 1;
            }
            this.zzc = i2;
        }
        return i2;
    }

    public final /* synthetic */ Iterator iterator() {
        return new zzcq(this);
    }

    public final String toString() {
        String str;
        Locale locale = Locale.ROOT;
        String hexString = Integer.toHexString(System.identityHashCode(this));
        int zzd2 = zzd();
        if (zzd() <= 50) {
            str = zzdg.zza(this);
        } else {
            str = zzdg.zza(zzg(0, 47)).concat("...");
        }
        StringBuilder sb = new StringBuilder("<ByteString@");
        sb.append(hexString);
        sb.append(" size=");
        sb.append(zzd2);
        sb.append(" contents=\"");
        return C0552a.r(sb, str, "\">");
    }

    public abstract byte zza(int i2);

    public abstract byte zzb(int i2);

    public abstract int zzd();

    public abstract void zze(byte[] bArr, int i2, int i5, int i6);

    public abstract int zzf(int i2, int i5, int i6);

    public abstract zzcz zzg(int i2, int i5);

    public abstract InputStream zzh();

    public abstract ByteBuffer zzi();

    public final int zzk() {
        return this.zzc;
    }

    public final byte[] zzm() {
        int zzd2 = zzd();
        if (zzd2 == 0) {
            return zzde.zzd;
        }
        byte[] bArr = new byte[zzd2];
        zze(bArr, 0, 0, zzd2);
        return bArr;
    }
}
