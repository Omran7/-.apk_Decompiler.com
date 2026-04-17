package com.google.android.gms.internal.measurement;

import java.util.List;

final class zzll implements zzor {
    private final zzlk zza;

    private zzll(zzlk zzlk) {
        byte[] bArr = zzmk.zzb;
        this.zza = zzlk;
        zzlk.zza = this;
    }

    public static zzll zza(zzlk zzlk) {
        zzll zzll = zzlk.zza;
        if (zzll != null) {
            return zzll;
        }
        return new zzll(zzlk);
    }

    public final void zzA(int i2, List list, boolean z3) {
        int i5 = 0;
        if (list instanceof zzmw) {
            zzmw zzmw = (zzmw) list;
            if (z3) {
                zzlk zzlk = this.zza;
                zzlk.zzr(i2, 2);
                int i6 = 0;
                for (int i7 = 0; i7 < zzmw.size(); i7++) {
                    zzmw.zza(i7);
                    i6 += 8;
                }
                zzlk.zzt(i6);
                while (i5 < zzmw.size()) {
                    zzlk.zzi(zzmw.zza(i5));
                    i5++;
                }
                return;
            }
            while (i5 < zzmw.size()) {
                this.zza.zzh(i2, zzmw.zza(i5));
                i5++;
            }
        } else if (z3) {
            zzlk zzlk2 = this.zza;
            zzlk2.zzr(i2, 2);
            int i8 = 0;
            for (int i9 = 0; i9 < list.size(); i9++) {
                ((Long) list.get(i9)).getClass();
                i8 += 8;
            }
            zzlk2.zzt(i8);
            while (i5 < list.size()) {
                zzlk2.zzi(((Long) list.get(i5)).longValue());
                i5++;
            }
        } else {
            while (i5 < list.size()) {
                this.zza.zzh(i2, ((Long) list.get(i5)).longValue());
                i5++;
            }
        }
    }

    public final void zzB(int i2, int i5) {
        this.zza.zzs(i2, (i5 >> 31) ^ (i5 + i5));
    }

    public final void zzC(int i2, List list, boolean z3) {
        int i5 = 0;
        if (list instanceof zzme) {
            zzme zzme = (zzme) list;
            if (z3) {
                zzlk zzlk = this.zza;
                zzlk.zzr(i2, 2);
                int i6 = 0;
                for (int i7 = 0; i7 < zzme.size(); i7++) {
                    int zze = zzme.zze(i7);
                    i6 += zzlk.zzz((zze >> 31) ^ (zze + zze));
                }
                zzlk.zzt(i6);
                while (i5 < zzme.size()) {
                    int zze2 = zzme.zze(i5);
                    zzlk.zzt((zze2 >> 31) ^ (zze2 + zze2));
                    i5++;
                }
                return;
            }
            while (i5 < zzme.size()) {
                zzlk zzlk2 = this.zza;
                int zze3 = zzme.zze(i5);
                zzlk2.zzs(i2, (zze3 >> 31) ^ (zze3 + zze3));
                i5++;
            }
        } else if (z3) {
            zzlk zzlk3 = this.zza;
            zzlk3.zzr(i2, 2);
            int i8 = 0;
            for (int i9 = 0; i9 < list.size(); i9++) {
                int intValue = ((Integer) list.get(i9)).intValue();
                i8 += zzlk.zzz((intValue >> 31) ^ (intValue + intValue));
            }
            zzlk3.zzt(i8);
            while (i5 < list.size()) {
                int intValue2 = ((Integer) list.get(i5)).intValue();
                zzlk3.zzt((intValue2 >> 31) ^ (intValue2 + intValue2));
                i5++;
            }
        } else {
            while (i5 < list.size()) {
                zzlk zzlk4 = this.zza;
                int intValue3 = ((Integer) list.get(i5)).intValue();
                zzlk4.zzs(i2, (intValue3 >> 31) ^ (intValue3 + intValue3));
                i5++;
            }
        }
    }

    public final void zzD(int i2, long j6) {
        this.zza.zzu(i2, (j6 >> 63) ^ (j6 + j6));
    }

    public final void zzE(int i2, List list, boolean z3) {
        int i5 = 0;
        if (list instanceof zzmw) {
            zzmw zzmw = (zzmw) list;
            if (z3) {
                zzlk zzlk = this.zza;
                zzlk.zzr(i2, 2);
                int i6 = 0;
                for (int i7 = 0; i7 < zzmw.size(); i7++) {
                    long zza2 = zzmw.zza(i7);
                    i6 += zzlk.zzA((zza2 >> 63) ^ (zza2 + zza2));
                }
                zzlk.zzt(i6);
                while (i5 < zzmw.size()) {
                    long zza3 = zzmw.zza(i5);
                    zzlk.zzv((zza3 >> 63) ^ (zza3 + zza3));
                    i5++;
                }
                return;
            }
            while (i5 < zzmw.size()) {
                zzlk zzlk2 = this.zza;
                long zza4 = zzmw.zza(i5);
                zzlk2.zzu(i2, (zza4 >> 63) ^ (zza4 + zza4));
                i5++;
            }
        } else if (z3) {
            zzlk zzlk3 = this.zza;
            zzlk3.zzr(i2, 2);
            int i8 = 0;
            for (int i9 = 0; i9 < list.size(); i9++) {
                long longValue = ((Long) list.get(i9)).longValue();
                i8 += zzlk.zzA((longValue >> 63) ^ (longValue + longValue));
            }
            zzlk3.zzt(i8);
            while (i5 < list.size()) {
                long longValue2 = ((Long) list.get(i5)).longValue();
                zzlk3.zzv((longValue2 >> 63) ^ (longValue2 + longValue2));
                i5++;
            }
        } else {
            while (i5 < list.size()) {
                zzlk zzlk4 = this.zza;
                long longValue3 = ((Long) list.get(i5)).longValue();
                zzlk4.zzu(i2, (longValue3 >> 63) ^ (longValue3 + longValue3));
                i5++;
            }
        }
    }

    @Deprecated
    public final void zzF(int i2) {
        this.zza.zzr(i2, 3);
    }

    public final void zzG(int i2, String str) {
        this.zza.zzp(i2, str);
    }

    public final void zzH(int i2, List list) {
        int i5 = 0;
        if (list instanceof zzmt) {
            zzmt zzmt = (zzmt) list;
            while (i5 < list.size()) {
                Object zzc = zzmt.zzc();
                if (zzc instanceof String) {
                    this.zza.zzp(i2, (String) zzc);
                } else {
                    this.zza.zze(i2, (zzld) zzc);
                }
                i5++;
            }
            return;
        }
        while (i5 < list.size()) {
            this.zza.zzp(i2, (String) list.get(i5));
            i5++;
        }
    }

    public final void zzI(int i2, int i5) {
        this.zza.zzs(i2, i5);
    }

    public final void zzJ(int i2, List list, boolean z3) {
        int i5 = 0;
        if (list instanceof zzme) {
            zzme zzme = (zzme) list;
            if (z3) {
                zzlk zzlk = this.zza;
                zzlk.zzr(i2, 2);
                int i6 = 0;
                for (int i7 = 0; i7 < zzme.size(); i7++) {
                    i6 += zzlk.zzz(zzme.zze(i7));
                }
                zzlk.zzt(i6);
                while (i5 < zzme.size()) {
                    zzlk.zzt(zzme.zze(i5));
                    i5++;
                }
                return;
            }
            while (i5 < zzme.size()) {
                this.zza.zzs(i2, zzme.zze(i5));
                i5++;
            }
        } else if (z3) {
            zzlk zzlk2 = this.zza;
            zzlk2.zzr(i2, 2);
            int i8 = 0;
            for (int i9 = 0; i9 < list.size(); i9++) {
                i8 += zzlk.zzz(((Integer) list.get(i9)).intValue());
            }
            zzlk2.zzt(i8);
            while (i5 < list.size()) {
                zzlk2.zzt(((Integer) list.get(i5)).intValue());
                i5++;
            }
        } else {
            while (i5 < list.size()) {
                this.zza.zzs(i2, ((Integer) list.get(i5)).intValue());
                i5++;
            }
        }
    }

    public final void zzK(int i2, long j6) {
        this.zza.zzu(i2, j6);
    }

    public final void zzL(int i2, List list, boolean z3) {
        int i5 = 0;
        if (list instanceof zzmw) {
            zzmw zzmw = (zzmw) list;
            if (z3) {
                zzlk zzlk = this.zza;
                zzlk.zzr(i2, 2);
                int i6 = 0;
                for (int i7 = 0; i7 < zzmw.size(); i7++) {
                    i6 += zzlk.zzA(zzmw.zza(i7));
                }
                zzlk.zzt(i6);
                while (i5 < zzmw.size()) {
                    zzlk.zzv(zzmw.zza(i5));
                    i5++;
                }
                return;
            }
            while (i5 < zzmw.size()) {
                this.zza.zzu(i2, zzmw.zza(i5));
                i5++;
            }
        } else if (z3) {
            zzlk zzlk2 = this.zza;
            zzlk2.zzr(i2, 2);
            int i8 = 0;
            for (int i9 = 0; i9 < list.size(); i9++) {
                i8 += zzlk.zzA(((Long) list.get(i9)).longValue());
            }
            zzlk2.zzt(i8);
            while (i5 < list.size()) {
                zzlk2.zzv(((Long) list.get(i5)).longValue());
                i5++;
            }
        } else {
            while (i5 < list.size()) {
                this.zza.zzu(i2, ((Long) list.get(i5)).longValue());
                i5++;
            }
        }
    }

    public final void zzb(int i2, boolean z3) {
        this.zza.zzd(i2, z3);
    }

    public final void zzc(int i2, List list, boolean z3) {
        int i5 = 0;
        if (list instanceof zzku) {
            zzku zzku = (zzku) list;
            if (z3) {
                zzlk zzlk = this.zza;
                zzlk.zzr(i2, 2);
                int i6 = 0;
                for (int i7 = 0; i7 < zzku.size(); i7++) {
                    zzku.zzf(i7);
                    i6++;
                }
                zzlk.zzt(i6);
                while (i5 < zzku.size()) {
                    zzlk.zzb(zzku.zzf(i5) ? (byte) 1 : 0);
                    i5++;
                }
                return;
            }
            while (i5 < zzku.size()) {
                this.zza.zzd(i2, zzku.zzf(i5));
                i5++;
            }
        } else if (z3) {
            zzlk zzlk2 = this.zza;
            zzlk2.zzr(i2, 2);
            int i8 = 0;
            for (int i9 = 0; i9 < list.size(); i9++) {
                ((Boolean) list.get(i9)).getClass();
                i8++;
            }
            zzlk2.zzt(i8);
            while (i5 < list.size()) {
                zzlk2.zzb(((Boolean) list.get(i5)).booleanValue() ? (byte) 1 : 0);
                i5++;
            }
        } else {
            while (i5 < list.size()) {
                this.zza.zzd(i2, ((Boolean) list.get(i5)).booleanValue());
                i5++;
            }
        }
    }

    public final void zzd(int i2, zzld zzld) {
        this.zza.zze(i2, zzld);
    }

    public final void zze(int i2, List list) {
        for (int i5 = 0; i5 < list.size(); i5++) {
            this.zza.zze(i2, (zzld) list.get(i5));
        }
    }

    public final void zzf(int i2, double d) {
        this.zza.zzh(i2, Double.doubleToRawLongBits(d));
    }

    public final void zzg(int i2, List list, boolean z3) {
        int i5 = 0;
        if (list instanceof zzlm) {
            zzlm zzlm = (zzlm) list;
            if (z3) {
                zzlk zzlk = this.zza;
                zzlk.zzr(i2, 2);
                int i6 = 0;
                for (int i7 = 0; i7 < zzlm.size(); i7++) {
                    zzlm.zze(i7);
                    i6 += 8;
                }
                zzlk.zzt(i6);
                while (i5 < zzlm.size()) {
                    zzlk.zzi(Double.doubleToRawLongBits(zzlm.zze(i5)));
                    i5++;
                }
                return;
            }
            while (i5 < zzlm.size()) {
                this.zza.zzh(i2, Double.doubleToRawLongBits(zzlm.zze(i5)));
                i5++;
            }
        } else if (z3) {
            zzlk zzlk2 = this.zza;
            zzlk2.zzr(i2, 2);
            int i8 = 0;
            for (int i9 = 0; i9 < list.size(); i9++) {
                ((Double) list.get(i9)).getClass();
                i8 += 8;
            }
            zzlk2.zzt(i8);
            while (i5 < list.size()) {
                zzlk2.zzi(Double.doubleToRawLongBits(((Double) list.get(i5)).doubleValue()));
                i5++;
            }
        } else {
            while (i5 < list.size()) {
                this.zza.zzh(i2, Double.doubleToRawLongBits(((Double) list.get(i5)).doubleValue()));
                i5++;
            }
        }
    }

    @Deprecated
    public final void zzh(int i2) {
        this.zza.zzr(i2, 4);
    }

    public final void zzi(int i2, int i5) {
        this.zza.zzj(i2, i5);
    }

    public final void zzj(int i2, List list, boolean z3) {
        int i5 = 0;
        if (list instanceof zzme) {
            zzme zzme = (zzme) list;
            if (z3) {
                zzlk zzlk = this.zza;
                zzlk.zzr(i2, 2);
                int i6 = 0;
                for (int i7 = 0; i7 < zzme.size(); i7++) {
                    i6 += zzlk.zzA((long) zzme.zze(i7));
                }
                zzlk.zzt(i6);
                while (i5 < zzme.size()) {
                    zzlk.zzk(zzme.zze(i5));
                    i5++;
                }
                return;
            }
            while (i5 < zzme.size()) {
                this.zza.zzj(i2, zzme.zze(i5));
                i5++;
            }
        } else if (z3) {
            zzlk zzlk2 = this.zza;
            zzlk2.zzr(i2, 2);
            int i8 = 0;
            for (int i9 = 0; i9 < list.size(); i9++) {
                i8 += zzlk.zzA((long) ((Integer) list.get(i9)).intValue());
            }
            zzlk2.zzt(i8);
            while (i5 < list.size()) {
                zzlk2.zzk(((Integer) list.get(i5)).intValue());
                i5++;
            }
        } else {
            while (i5 < list.size()) {
                this.zza.zzj(i2, ((Integer) list.get(i5)).intValue());
                i5++;
            }
        }
    }

    public final void zzk(int i2, int i5) {
        this.zza.zzf(i2, i5);
    }

    public final void zzl(int i2, List list, boolean z3) {
        int i5 = 0;
        if (list instanceof zzme) {
            zzme zzme = (zzme) list;
            if (z3) {
                zzlk zzlk = this.zza;
                zzlk.zzr(i2, 2);
                int i6 = 0;
                for (int i7 = 0; i7 < zzme.size(); i7++) {
                    zzme.zze(i7);
                    i6 += 4;
                }
                zzlk.zzt(i6);
                while (i5 < zzme.size()) {
                    zzlk.zzg(zzme.zze(i5));
                    i5++;
                }
                return;
            }
            while (i5 < zzme.size()) {
                this.zza.zzf(i2, zzme.zze(i5));
                i5++;
            }
        } else if (z3) {
            zzlk zzlk2 = this.zza;
            zzlk2.zzr(i2, 2);
            int i8 = 0;
            for (int i9 = 0; i9 < list.size(); i9++) {
                ((Integer) list.get(i9)).getClass();
                i8 += 4;
            }
            zzlk2.zzt(i8);
            while (i5 < list.size()) {
                zzlk2.zzg(((Integer) list.get(i5)).intValue());
                i5++;
            }
        } else {
            while (i5 < list.size()) {
                this.zza.zzf(i2, ((Integer) list.get(i5)).intValue());
                i5++;
            }
        }
    }

    public final void zzm(int i2, long j6) {
        this.zza.zzh(i2, j6);
    }

    public final void zzn(int i2, List list, boolean z3) {
        int i5 = 0;
        if (list instanceof zzmw) {
            zzmw zzmw = (zzmw) list;
            if (z3) {
                zzlk zzlk = this.zza;
                zzlk.zzr(i2, 2);
                int i6 = 0;
                for (int i7 = 0; i7 < zzmw.size(); i7++) {
                    zzmw.zza(i7);
                    i6 += 8;
                }
                zzlk.zzt(i6);
                while (i5 < zzmw.size()) {
                    zzlk.zzi(zzmw.zza(i5));
                    i5++;
                }
                return;
            }
            while (i5 < zzmw.size()) {
                this.zza.zzh(i2, zzmw.zza(i5));
                i5++;
            }
        } else if (z3) {
            zzlk zzlk2 = this.zza;
            zzlk2.zzr(i2, 2);
            int i8 = 0;
            for (int i9 = 0; i9 < list.size(); i9++) {
                ((Long) list.get(i9)).getClass();
                i8 += 8;
            }
            zzlk2.zzt(i8);
            while (i5 < list.size()) {
                zzlk2.zzi(((Long) list.get(i5)).longValue());
                i5++;
            }
        } else {
            while (i5 < list.size()) {
                this.zza.zzh(i2, ((Long) list.get(i5)).longValue());
                i5++;
            }
        }
    }

    public final void zzo(int i2, float f6) {
        this.zza.zzf(i2, Float.floatToRawIntBits(f6));
    }

    public final void zzp(int i2, List list, boolean z3) {
        int i5 = 0;
        if (list instanceof zzlw) {
            zzlw zzlw = (zzlw) list;
            if (z3) {
                zzlk zzlk = this.zza;
                zzlk.zzr(i2, 2);
                int i6 = 0;
                for (int i7 = 0; i7 < zzlw.size(); i7++) {
                    zzlw.zze(i7);
                    i6 += 4;
                }
                zzlk.zzt(i6);
                while (i5 < zzlw.size()) {
                    zzlk.zzg(Float.floatToRawIntBits(zzlw.zze(i5)));
                    i5++;
                }
                return;
            }
            while (i5 < zzlw.size()) {
                this.zza.zzf(i2, Float.floatToRawIntBits(zzlw.zze(i5)));
                i5++;
            }
        } else if (z3) {
            zzlk zzlk2 = this.zza;
            zzlk2.zzr(i2, 2);
            int i8 = 0;
            for (int i9 = 0; i9 < list.size(); i9++) {
                ((Float) list.get(i9)).getClass();
                i8 += 4;
            }
            zzlk2.zzt(i8);
            while (i5 < list.size()) {
                zzlk2.zzg(Float.floatToRawIntBits(((Float) list.get(i5)).floatValue()));
                i5++;
            }
        } else {
            while (i5 < list.size()) {
                this.zza.zzf(i2, Float.floatToRawIntBits(((Float) list.get(i5)).floatValue()));
                i5++;
            }
        }
    }

    public final void zzq(int i2, Object obj, zzns zzns) {
        zzlk zzlk = this.zza;
        zzlk.zzr(i2, 3);
        zzns.zzi((zznh) obj, zzlk.zza);
        zzlk.zzr(i2, 4);
    }

    public final void zzr(int i2, int i5) {
        this.zza.zzj(i2, i5);
    }

    public final void zzs(int i2, List list, boolean z3) {
        int i5 = 0;
        if (list instanceof zzme) {
            zzme zzme = (zzme) list;
            if (z3) {
                zzlk zzlk = this.zza;
                zzlk.zzr(i2, 2);
                int i6 = 0;
                for (int i7 = 0; i7 < zzme.size(); i7++) {
                    i6 += zzlk.zzA((long) zzme.zze(i7));
                }
                zzlk.zzt(i6);
                while (i5 < zzme.size()) {
                    zzlk.zzk(zzme.zze(i5));
                    i5++;
                }
                return;
            }
            while (i5 < zzme.size()) {
                this.zza.zzj(i2, zzme.zze(i5));
                i5++;
            }
        } else if (z3) {
            zzlk zzlk2 = this.zza;
            zzlk2.zzr(i2, 2);
            int i8 = 0;
            for (int i9 = 0; i9 < list.size(); i9++) {
                i8 += zzlk.zzA((long) ((Integer) list.get(i9)).intValue());
            }
            zzlk2.zzt(i8);
            while (i5 < list.size()) {
                zzlk2.zzk(((Integer) list.get(i5)).intValue());
                i5++;
            }
        } else {
            while (i5 < list.size()) {
                this.zza.zzj(i2, ((Integer) list.get(i5)).intValue());
                i5++;
            }
        }
    }

    public final void zzt(int i2, long j6) {
        this.zza.zzu(i2, j6);
    }

    public final void zzu(int i2, List list, boolean z3) {
        int i5 = 0;
        if (list instanceof zzmw) {
            zzmw zzmw = (zzmw) list;
            if (z3) {
                zzlk zzlk = this.zza;
                zzlk.zzr(i2, 2);
                int i6 = 0;
                for (int i7 = 0; i7 < zzmw.size(); i7++) {
                    i6 += zzlk.zzA(zzmw.zza(i7));
                }
                zzlk.zzt(i6);
                while (i5 < zzmw.size()) {
                    zzlk.zzv(zzmw.zza(i5));
                    i5++;
                }
                return;
            }
            while (i5 < zzmw.size()) {
                this.zza.zzu(i2, zzmw.zza(i5));
                i5++;
            }
        } else if (z3) {
            zzlk zzlk2 = this.zza;
            zzlk2.zzr(i2, 2);
            int i8 = 0;
            for (int i9 = 0; i9 < list.size(); i9++) {
                i8 += zzlk.zzA(((Long) list.get(i9)).longValue());
            }
            zzlk2.zzt(i8);
            while (i5 < list.size()) {
                zzlk2.zzv(((Long) list.get(i5)).longValue());
                i5++;
            }
        } else {
            while (i5 < list.size()) {
                this.zza.zzu(i2, ((Long) list.get(i5)).longValue());
                i5++;
            }
        }
    }

    public final void zzv(int i2, Object obj, zzns zzns) {
        this.zza.zzm(i2, (zznh) obj, zzns);
    }

    public final void zzw(int i2, Object obj) {
        if (obj instanceof zzld) {
            this.zza.zzo(i2, (zzld) obj);
        } else {
            this.zza.zzn(i2, (zznh) obj);
        }
    }

    public final void zzx(int i2, int i5) {
        this.zza.zzf(i2, i5);
    }

    public final void zzy(int i2, List list, boolean z3) {
        int i5 = 0;
        if (list instanceof zzme) {
            zzme zzme = (zzme) list;
            if (z3) {
                zzlk zzlk = this.zza;
                zzlk.zzr(i2, 2);
                int i6 = 0;
                for (int i7 = 0; i7 < zzme.size(); i7++) {
                    zzme.zze(i7);
                    i6 += 4;
                }
                zzlk.zzt(i6);
                while (i5 < zzme.size()) {
                    zzlk.zzg(zzme.zze(i5));
                    i5++;
                }
                return;
            }
            while (i5 < zzme.size()) {
                this.zza.zzf(i2, zzme.zze(i5));
                i5++;
            }
        } else if (z3) {
            zzlk zzlk2 = this.zza;
            zzlk2.zzr(i2, 2);
            int i8 = 0;
            for (int i9 = 0; i9 < list.size(); i9++) {
                ((Integer) list.get(i9)).getClass();
                i8 += 4;
            }
            zzlk2.zzt(i8);
            while (i5 < list.size()) {
                zzlk2.zzg(((Integer) list.get(i5)).intValue());
                i5++;
            }
        } else {
            while (i5 < list.size()) {
                this.zza.zzf(i2, ((Integer) list.get(i5)).intValue());
                i5++;
            }
        }
    }

    public final void zzz(int i2, long j6) {
        this.zza.zzh(i2, j6);
    }
}
