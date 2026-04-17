package com.google.android.recaptcha.internal;

import com.google.android.gms.internal.measurement.a;
import java.math.RoundingMode;
import java.util.Objects;

class zzkg extends zzkh {
    final zzkd zza;
    final Character zzb;

    public zzkg(zzkd zzkd, Character ch) {
        this.zza = zzkd;
        if (ch == null || !zzkd.zzd('=')) {
            this.zzb = ch;
            return;
        }
        throw new IllegalArgumentException(zzji.zza("Padding character %s was already in alphabet", ch));
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zzkg) {
            zzkg zzkg = (zzkg) obj;
            if (!this.zza.equals(zzkg.zza) || !Objects.equals(this.zzb, zzkg.zzb)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        Character ch = this.zzb;
        return Objects.hashCode(ch) ^ this.zza.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BaseEncoding.");
        sb.append(this.zza);
        if (8 % this.zza.zzb != 0) {
            if (this.zzb == null) {
                sb.append(".omitPadding()");
            } else {
                sb.append(".withPadChar('");
                sb.append(this.zzb);
                sb.append("')");
            }
        }
        return sb.toString();
    }

    public int zza(byte[] bArr, CharSequence charSequence) {
        zzkd zzkd;
        CharSequence zze = zze(charSequence);
        if (this.zza.zzc(zze.length())) {
            int i2 = 0;
            int i5 = 0;
            while (i2 < zze.length()) {
                long j6 = 0;
                int i6 = 0;
                int i7 = 0;
                while (true) {
                    zzkd = this.zza;
                    if (i6 >= zzkd.zzc) {
                        break;
                    }
                    j6 <<= zzkd.zzb;
                    if (i2 + i6 < zze.length()) {
                        j6 |= (long) this.zza.zzb(zze.charAt(i7 + i2));
                        i7++;
                    }
                    i6++;
                }
                int i8 = zzkd.zzd;
                int i9 = i7 * zzkd.zzb;
                int i10 = (i8 - 1) * 8;
                while (i10 >= (i8 * 8) - i9) {
                    bArr[i5] = (byte) ((int) ((j6 >>> i10) & 255));
                    i10 -= 8;
                    i5++;
                }
                i2 += this.zza.zzc;
            }
            return i5;
        }
        throw new zzkf(a.f(zze.length(), "Invalid input length "));
    }

    public void zzb(Appendable appendable, byte[] bArr, int i2, int i5) {
        int i6 = 0;
        zzjf.zzd(0, i5, bArr.length);
        while (i6 < i5) {
            zzf(appendable, bArr, i6, Math.min(this.zza.zzd, i5 - i6));
            i6 += this.zza.zzd;
        }
    }

    public final int zzc(int i2) {
        return (int) (((((long) this.zza.zzb) * ((long) i2)) + 7) / 8);
    }

    public final int zzd(int i2) {
        zzkd zzkd = this.zza;
        return zzkd.zzc * zzkj.zza(i2, zzkd.zzd, RoundingMode.CEILING);
    }

    public final CharSequence zze(CharSequence charSequence) {
        charSequence.getClass();
        if (this.zzb == null) {
            return charSequence;
        }
        int length = charSequence.length();
        do {
            length--;
            if (length < 0 || charSequence.charAt(length) != '=') {
            }
            length--;
            break;
        } while (charSequence.charAt(length) != '=');
        return charSequence.subSequence(0, length + 1);
    }

    public final void zzf(Appendable appendable, byte[] bArr, int i2, int i5) {
        boolean z3;
        zzjf.zzd(i2, i2 + i5, bArr.length);
        int i6 = 0;
        if (i5 <= this.zza.zzd) {
            z3 = true;
        } else {
            z3 = false;
        }
        zzjf.zza(z3);
        long j6 = 0;
        for (int i7 = 0; i7 < i5; i7++) {
            j6 = (j6 | ((long) (bArr[i2 + i7] & 255))) << 8;
        }
        int i8 = (i5 + 1) * 8;
        zzkd zzkd = this.zza;
        while (i6 < i5 * 8) {
            long j7 = j6 >>> ((i8 - zzkd.zzb) - i6);
            zzkd zzkd2 = this.zza;
            appendable.append(zzkd2.zza(((int) j7) & zzkd2.zza));
            i6 += this.zza.zzb;
        }
        if (this.zzb != null) {
            while (i6 < this.zza.zzd * 8) {
                this.zzb.getClass();
                appendable.append('=');
                i6 += this.zza.zzb;
            }
        }
    }

    public zzkg(String str, String str2, Character ch) {
        this(new zzkd(str, str2.toCharArray()), ch);
    }
}
