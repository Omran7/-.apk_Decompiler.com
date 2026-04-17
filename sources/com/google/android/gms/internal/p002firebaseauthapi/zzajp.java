package com.google.android.gms.internal.p002firebaseauthapi;

import h0.C0552a;
import java.io.Serializable;
import java.util.Iterator;
import java.util.Locale;
import o3.d;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzajp  reason: invalid package */
public abstract class zzajp implements Serializable, Iterable<Byte> {
    public static final zzajp zza = new zzajw(zzalb.zzb);
    private static final zzajs zzb = new zzajz();
    private int zzc = 0;

    static {
        new zzajr();
    }

    public static /* synthetic */ int zza(byte b6) {
        return b6 & 255;
    }

    public static zzajp zzb(byte[] bArr) {
        return new zzajw(bArr);
    }

    public static zzaju zzc(int i2) {
        return new zzaju(i2);
    }

    public abstract boolean equals(Object obj);

    public final int hashCode() {
        int i2 = this.zzc;
        if (i2 == 0) {
            int zzb2 = zzb();
            i2 = zzb(zzb2, 0, zzb2);
            if (i2 == 0) {
                i2 = 1;
            }
            this.zzc = i2;
        }
        return i2;
    }

    public /* synthetic */ Iterator iterator() {
        return new zzajo(this);
    }

    public final String toString() {
        String str;
        Locale locale = Locale.ROOT;
        String hexString = Integer.toHexString(System.identityHashCode(this));
        int zzb2 = zzb();
        if (zzb() <= 50) {
            str = zzanh.zza(this);
        } else {
            str = d.f(zzanh.zza(zza(0, 47)), "...");
        }
        StringBuilder sb = new StringBuilder("<ByteString@");
        sb.append(hexString);
        sb.append(" size=");
        sb.append(zzb2);
        sb.append(" contents=\"");
        return C0552a.r(sb, str, "\">");
    }

    public abstract byte zza(int i2);

    public abstract zzajp zza(int i2, int i5);

    public abstract void zza(zzajm zzajm);

    public abstract void zza(byte[] bArr, int i2, int i5, int i6);

    public abstract byte zzb(int i2);

    public abstract int zzb();

    public abstract int zzb(int i2, int i5, int i6);

    public abstract zzakb zzc();

    public final byte[] zzd() {
        int zzb2 = zzb();
        if (zzb2 == 0) {
            return zzalb.zzb;
        }
        byte[] bArr = new byte[zzb2];
        zza(bArr, 0, 0, zzb2);
        return bArr;
    }

    public static int zza(int i2, int i5, int i6) {
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

    public final int zza() {
        return this.zzc;
    }

    public static zzajp zza(byte[] bArr) {
        return zza(bArr, 0, bArr.length);
    }

    public static zzajp zza(byte[] bArr, int i2, int i5) {
        zza(i2, i2 + i5, bArr.length);
        return new zzajw(zzb.zza(bArr, i2, i5));
    }

    public static zzajp zza(String str) {
        return new zzajw(str.getBytes(zzalb.zza));
    }
}
