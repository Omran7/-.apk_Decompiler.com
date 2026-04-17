package com.google.android.gms.internal.p002firebaseauthapi;

import h0.C0552a;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzajw  reason: invalid package */
class zzajw extends zzajx {
    protected final byte[] zzb;

    public zzajw(byte[] bArr) {
        super();
        bArr.getClass();
        this.zzb = bArr;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzajp) || zzb() != ((zzajp) obj).zzb()) {
            return false;
        }
        if (zzb() == 0) {
            return true;
        }
        if (!(obj instanceof zzajw)) {
            return obj.equals(this);
        }
        zzajw zzajw = (zzajw) obj;
        int zza = zza();
        int zza2 = zzajw.zza();
        if (zza == 0 || zza2 == 0 || zza == zza2) {
            return zza(zzajw, 0, zzb());
        }
        return false;
    }

    public byte zza(int i2) {
        return this.zzb[i2];
    }

    public byte zzb(int i2) {
        return this.zzb[i2];
    }

    public final zzakb zzc() {
        return zzakb.zza(this.zzb, zze(), zzb(), true);
    }

    public int zze() {
        return 0;
    }

    public final zzajp zza(int i2, int i5) {
        int zza = zzajp.zza(0, i5, zzb());
        if (zza == 0) {
            return zzajp.zza;
        }
        return new zzajt(this.zzb, zze(), zza);
    }

    public final int zzb(int i2, int i5, int i6) {
        return zzalb.zza(i2, this.zzb, zze(), i6);
    }

    public int zzb() {
        return this.zzb.length;
    }

    public void zza(byte[] bArr, int i2, int i5, int i6) {
        System.arraycopy(this.zzb, 0, bArr, 0, i6);
    }

    public final void zza(zzajm zzajm) {
        zzajm.zza(this.zzb, zze(), zzb());
    }

    public final boolean zza(zzajp zzajp, int i2, int i5) {
        if (i5 > zzajp.zzb()) {
            int zzb2 = zzb();
            throw new IllegalArgumentException("Length too large: " + i5 + zzb2);
        } else if (i5 > zzajp.zzb()) {
            throw new IllegalArgumentException(C0552a.l("Ran off end of other: 0, ", i5, zzajp.zzb(), ", "));
        } else if (!(zzajp instanceof zzajw)) {
            return zzajp.zza(0, i5).equals(zza(0, i5));
        } else {
            zzajw zzajw = (zzajw) zzajp;
            byte[] bArr = this.zzb;
            byte[] bArr2 = zzajw.zzb;
            int zze = zze() + i5;
            int zze2 = zze();
            int zze3 = zzajw.zze();
            while (zze2 < zze) {
                if (bArr[zze2] != bArr2[zze3]) {
                    return false;
                }
                zze2++;
                zze3++;
            }
            return true;
        }
    }
}
