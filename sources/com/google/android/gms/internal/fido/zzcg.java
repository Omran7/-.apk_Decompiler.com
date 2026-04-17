package com.google.android.gms.internal.fido;

import java.math.RoundingMode;

class zzcg extends zzch {
    private volatile zzch zza;
    final zzcd zzb;
    final Character zzc;

    public zzcg(zzcd zzcd, Character ch) {
        this.zzb = zzcd;
        if (ch == null || !zzcd.zzc('=')) {
            this.zzc = ch;
            return;
        }
        throw new IllegalArgumentException(zzaq.zza("Padding character %s was already in alphabet", ch));
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zzcg) {
            zzcg zzcg = (zzcg) obj;
            if (this.zzb.equals(zzcg.zzb)) {
                Character ch = this.zzc;
                Character ch2 = zzcg.zzc;
                if (ch == ch2) {
                    return true;
                }
                if (ch == null || !ch.equals(ch2)) {
                    return false;
                }
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i2;
        int hashCode = this.zzb.hashCode();
        Character ch = this.zzc;
        if (ch == null) {
            i2 = 0;
        } else {
            i2 = ch.hashCode();
        }
        return hashCode ^ i2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BaseEncoding.");
        sb.append(this.zzb);
        if (8 % this.zzb.zzb != 0) {
            if (this.zzc == null) {
                sb.append(".omitPadding()");
            } else {
                sb.append(".withPadChar('");
                sb.append(this.zzc);
                sb.append("')");
            }
        }
        return sb.toString();
    }

    public zzch zza(zzcd zzcd, Character ch) {
        return new zzcg(zzcd, ch);
    }

    public void zzb(Appendable appendable, byte[] bArr, int i2, int i5) {
        int i6 = 0;
        zzap.zze(0, i5, bArr.length);
        while (i6 < i5) {
            zze(appendable, bArr, i6, Math.min(this.zzb.zzd, i5 - i6));
            i6 += this.zzb.zzd;
        }
    }

    public final int zzc(int i2) {
        zzcd zzcd = this.zzb;
        return zzcj.zza(i2, zzcd.zzd, RoundingMode.CEILING) * zzcd.zzc;
    }

    public final zzch zzd() {
        zzch zzch = this.zza;
        if (zzch == null) {
            zzcd zzb2 = this.zzb.zzb();
            if (zzb2 == this.zzb) {
                zzch = this;
            } else {
                zzch = zza(zzb2, this.zzc);
            }
            this.zza = zzch;
        }
        return zzch;
    }

    public final void zze(Appendable appendable, byte[] bArr, int i2, int i5) {
        boolean z3;
        zzap.zze(i2, i2 + i5, bArr.length);
        int i6 = 0;
        if (i5 <= this.zzb.zzd) {
            z3 = true;
        } else {
            z3 = false;
        }
        zzap.zzc(z3);
        long j6 = 0;
        for (int i7 = 0; i7 < i5; i7++) {
            j6 = (j6 | ((long) (bArr[i2 + i7] & 255))) << 8;
        }
        int i8 = ((i5 + 1) * 8) - this.zzb.zzb;
        while (i6 < i5 * 8) {
            zzcd zzcd = this.zzb;
            appendable.append(zzcd.zza(zzcd.zza & ((int) (j6 >>> (i8 - i6)))));
            i6 += this.zzb.zzb;
        }
        if (this.zzc != null) {
            while (i6 < this.zzb.zzd * 8) {
                this.zzc.getClass();
                appendable.append('=');
                i6 += this.zzb.zzb;
            }
        }
    }

    public zzcg(String str, String str2, Character ch) {
        this(new zzcd(str, str2.toCharArray()), ch);
    }
}
