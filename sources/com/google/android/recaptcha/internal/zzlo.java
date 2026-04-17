package com.google.android.recaptcha.internal;

import java.util.List;

final class zzlo implements zzpy {
    private final zzln zza;

    private zzlo(zzln zzln) {
        byte[] bArr = zznl.zzb;
        this.zza = zzln;
        zzln.zza = this;
    }

    public static zzlo zza(zzln zzln) {
        zzlo zzlo = zzln.zza;
        if (zzlo != null) {
            return zzlo;
        }
        return new zzlo(zzln);
    }

    public final void zzA(int i2, List list, boolean z3) {
        int i5 = 0;
        if (list instanceof zznx) {
            zznx zznx = (zznx) list;
            if (z3) {
                this.zza.zzr(i2, 2);
                int i6 = 0;
                for (int i7 = 0; i7 < zznx.size(); i7++) {
                    zznx.zze(i7);
                    i6 += 8;
                }
                this.zza.zzt(i6);
                while (i5 < zznx.size()) {
                    this.zza.zzi(zznx.zze(i5));
                    i5++;
                }
                return;
            }
            while (i5 < zznx.size()) {
                this.zza.zzh(i2, zznx.zze(i5));
                i5++;
            }
        } else if (z3) {
            this.zza.zzr(i2, 2);
            int i8 = 0;
            for (int i9 = 0; i9 < list.size(); i9++) {
                ((Long) list.get(i9)).getClass();
                i8 += 8;
            }
            this.zza.zzt(i8);
            while (i5 < list.size()) {
                this.zza.zzi(((Long) list.get(i5)).longValue());
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
        if (list instanceof zzne) {
            zzne zzne = (zzne) list;
            if (z3) {
                this.zza.zzr(i2, 2);
                int i6 = 0;
                for (int i7 = 0; i7 < zzne.size(); i7++) {
                    int zze = zzne.zze(i7);
                    i6 += zzln.zzA((zze >> 31) ^ (zze + zze));
                }
                this.zza.zzt(i6);
                while (i5 < zzne.size()) {
                    zzln zzln = this.zza;
                    int zze2 = zzne.zze(i5);
                    zzln.zzt((zze2 >> 31) ^ (zze2 + zze2));
                    i5++;
                }
                return;
            }
            while (i5 < zzne.size()) {
                zzln zzln2 = this.zza;
                int zze3 = zzne.zze(i5);
                zzln2.zzs(i2, (zze3 >> 31) ^ (zze3 + zze3));
                i5++;
            }
        } else if (z3) {
            this.zza.zzr(i2, 2);
            int i8 = 0;
            for (int i9 = 0; i9 < list.size(); i9++) {
                int intValue = ((Integer) list.get(i9)).intValue();
                i8 += zzln.zzA((intValue >> 31) ^ (intValue + intValue));
            }
            this.zza.zzt(i8);
            while (i5 < list.size()) {
                zzln zzln3 = this.zza;
                int intValue2 = ((Integer) list.get(i5)).intValue();
                zzln3.zzt((intValue2 >> 31) ^ (intValue2 + intValue2));
                i5++;
            }
        } else {
            while (i5 < list.size()) {
                zzln zzln4 = this.zza;
                int intValue3 = ((Integer) list.get(i5)).intValue();
                zzln4.zzs(i2, (intValue3 >> 31) ^ (intValue3 + intValue3));
                i5++;
            }
        }
    }

    public final void zzD(int i2, long j6) {
        this.zza.zzu(i2, (j6 >> 63) ^ (j6 + j6));
    }

    public final void zzE(int i2, List list, boolean z3) {
        int i5 = 0;
        if (list instanceof zznx) {
            zznx zznx = (zznx) list;
            if (z3) {
                this.zza.zzr(i2, 2);
                int i6 = 0;
                for (int i7 = 0; i7 < zznx.size(); i7++) {
                    long zze = zznx.zze(i7);
                    i6 += zzln.zzB((zze >> 63) ^ (zze + zze));
                }
                this.zza.zzt(i6);
                while (i5 < zznx.size()) {
                    zzln zzln = this.zza;
                    long zze2 = zznx.zze(i5);
                    zzln.zzv((zze2 >> 63) ^ (zze2 + zze2));
                    i5++;
                }
                return;
            }
            while (i5 < zznx.size()) {
                zzln zzln2 = this.zza;
                long zze3 = zznx.zze(i5);
                zzln2.zzu(i2, (zze3 >> 63) ^ (zze3 + zze3));
                i5++;
            }
        } else if (z3) {
            this.zza.zzr(i2, 2);
            int i8 = 0;
            for (int i9 = 0; i9 < list.size(); i9++) {
                long longValue = ((Long) list.get(i9)).longValue();
                i8 += zzln.zzB((longValue >> 63) ^ (longValue + longValue));
            }
            this.zza.zzt(i8);
            while (i5 < list.size()) {
                zzln zzln3 = this.zza;
                long longValue2 = ((Long) list.get(i5)).longValue();
                zzln3.zzv((longValue2 >> 63) ^ (longValue2 + longValue2));
                i5++;
            }
        } else {
            while (i5 < list.size()) {
                zzln zzln4 = this.zza;
                long longValue3 = ((Long) list.get(i5)).longValue();
                zzln4.zzu(i2, (longValue3 >> 63) ^ (longValue3 + longValue3));
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
        if (list instanceof zznu) {
            zznu zznu = (zznu) list;
            while (i5 < list.size()) {
                Object zzc = zznu.zzc();
                if (zzc instanceof String) {
                    this.zza.zzp(i2, (String) zzc);
                } else {
                    this.zza.zze(i2, (zzle) zzc);
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
        if (list instanceof zzne) {
            zzne zzne = (zzne) list;
            if (z3) {
                this.zza.zzr(i2, 2);
                int i6 = 0;
                for (int i7 = 0; i7 < zzne.size(); i7++) {
                    i6 += zzln.zzA(zzne.zze(i7));
                }
                this.zza.zzt(i6);
                while (i5 < zzne.size()) {
                    this.zza.zzt(zzne.zze(i5));
                    i5++;
                }
                return;
            }
            while (i5 < zzne.size()) {
                this.zza.zzs(i2, zzne.zze(i5));
                i5++;
            }
        } else if (z3) {
            this.zza.zzr(i2, 2);
            int i8 = 0;
            for (int i9 = 0; i9 < list.size(); i9++) {
                i8 += zzln.zzA(((Integer) list.get(i9)).intValue());
            }
            this.zza.zzt(i8);
            while (i5 < list.size()) {
                this.zza.zzt(((Integer) list.get(i5)).intValue());
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
        if (list instanceof zznx) {
            zznx zznx = (zznx) list;
            if (z3) {
                this.zza.zzr(i2, 2);
                int i6 = 0;
                for (int i7 = 0; i7 < zznx.size(); i7++) {
                    i6 += zzln.zzB(zznx.zze(i7));
                }
                this.zza.zzt(i6);
                while (i5 < zznx.size()) {
                    this.zza.zzv(zznx.zze(i5));
                    i5++;
                }
                return;
            }
            while (i5 < zznx.size()) {
                this.zza.zzu(i2, zznx.zze(i5));
                i5++;
            }
        } else if (z3) {
            this.zza.zzr(i2, 2);
            int i8 = 0;
            for (int i9 = 0; i9 < list.size(); i9++) {
                i8 += zzln.zzB(((Long) list.get(i9)).longValue());
            }
            this.zza.zzt(i8);
            while (i5 < list.size()) {
                this.zza.zzv(((Long) list.get(i5)).longValue());
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
        if (list instanceof zzkv) {
            zzkv zzkv = (zzkv) list;
            if (z3) {
                this.zza.zzr(i2, 2);
                int i6 = 0;
                for (int i7 = 0; i7 < zzkv.size(); i7++) {
                    zzkv.zzf(i7);
                    i6++;
                }
                this.zza.zzt(i6);
                while (i5 < zzkv.size()) {
                    this.zza.zzb(zzkv.zzf(i5) ? (byte) 1 : 0);
                    i5++;
                }
                return;
            }
            while (i5 < zzkv.size()) {
                this.zza.zzd(i2, zzkv.zzf(i5));
                i5++;
            }
        } else if (z3) {
            this.zza.zzr(i2, 2);
            int i8 = 0;
            for (int i9 = 0; i9 < list.size(); i9++) {
                ((Boolean) list.get(i9)).getClass();
                i8++;
            }
            this.zza.zzt(i8);
            while (i5 < list.size()) {
                this.zza.zzb(((Boolean) list.get(i5)).booleanValue() ? (byte) 1 : 0);
                i5++;
            }
        } else {
            while (i5 < list.size()) {
                this.zza.zzd(i2, ((Boolean) list.get(i5)).booleanValue());
                i5++;
            }
        }
    }

    public final void zzd(int i2, zzle zzle) {
        this.zza.zze(i2, zzle);
    }

    public final void zze(int i2, List list) {
        for (int i5 = 0; i5 < list.size(); i5++) {
            this.zza.zze(i2, (zzle) list.get(i5));
        }
    }

    public final void zzf(int i2, double d) {
        this.zza.zzh(i2, Double.doubleToRawLongBits(d));
    }

    public final void zzg(int i2, List list, boolean z3) {
        int i5 = 0;
        if (list instanceof zzmi) {
            zzmi zzmi = (zzmi) list;
            if (z3) {
                this.zza.zzr(i2, 2);
                int i6 = 0;
                for (int i7 = 0; i7 < zzmi.size(); i7++) {
                    zzmi.zze(i7);
                    i6 += 8;
                }
                this.zza.zzt(i6);
                while (i5 < zzmi.size()) {
                    this.zza.zzi(Double.doubleToRawLongBits(zzmi.zze(i5)));
                    i5++;
                }
                return;
            }
            while (i5 < zzmi.size()) {
                this.zza.zzh(i2, Double.doubleToRawLongBits(zzmi.zze(i5)));
                i5++;
            }
        } else if (z3) {
            this.zza.zzr(i2, 2);
            int i8 = 0;
            for (int i9 = 0; i9 < list.size(); i9++) {
                ((Double) list.get(i9)).getClass();
                i8 += 8;
            }
            this.zza.zzt(i8);
            while (i5 < list.size()) {
                this.zza.zzi(Double.doubleToRawLongBits(((Double) list.get(i5)).doubleValue()));
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
        if (list instanceof zzne) {
            zzne zzne = (zzne) list;
            if (z3) {
                this.zza.zzr(i2, 2);
                int i6 = 0;
                for (int i7 = 0; i7 < zzne.size(); i7++) {
                    i6 += zzln.zzB((long) zzne.zze(i7));
                }
                this.zza.zzt(i6);
                while (i5 < zzne.size()) {
                    this.zza.zzk(zzne.zze(i5));
                    i5++;
                }
                return;
            }
            while (i5 < zzne.size()) {
                this.zza.zzj(i2, zzne.zze(i5));
                i5++;
            }
        } else if (z3) {
            this.zza.zzr(i2, 2);
            int i8 = 0;
            for (int i9 = 0; i9 < list.size(); i9++) {
                i8 += zzln.zzB((long) ((Integer) list.get(i9)).intValue());
            }
            this.zza.zzt(i8);
            while (i5 < list.size()) {
                this.zza.zzk(((Integer) list.get(i5)).intValue());
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
        if (list instanceof zzne) {
            zzne zzne = (zzne) list;
            if (z3) {
                this.zza.zzr(i2, 2);
                int i6 = 0;
                for (int i7 = 0; i7 < zzne.size(); i7++) {
                    zzne.zze(i7);
                    i6 += 4;
                }
                this.zza.zzt(i6);
                while (i5 < zzne.size()) {
                    this.zza.zzg(zzne.zze(i5));
                    i5++;
                }
                return;
            }
            while (i5 < zzne.size()) {
                this.zza.zzf(i2, zzne.zze(i5));
                i5++;
            }
        } else if (z3) {
            this.zza.zzr(i2, 2);
            int i8 = 0;
            for (int i9 = 0; i9 < list.size(); i9++) {
                ((Integer) list.get(i9)).getClass();
                i8 += 4;
            }
            this.zza.zzt(i8);
            while (i5 < list.size()) {
                this.zza.zzg(((Integer) list.get(i5)).intValue());
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
        if (list instanceof zznx) {
            zznx zznx = (zznx) list;
            if (z3) {
                this.zza.zzr(i2, 2);
                int i6 = 0;
                for (int i7 = 0; i7 < zznx.size(); i7++) {
                    zznx.zze(i7);
                    i6 += 8;
                }
                this.zza.zzt(i6);
                while (i5 < zznx.size()) {
                    this.zza.zzi(zznx.zze(i5));
                    i5++;
                }
                return;
            }
            while (i5 < zznx.size()) {
                this.zza.zzh(i2, zznx.zze(i5));
                i5++;
            }
        } else if (z3) {
            this.zza.zzr(i2, 2);
            int i8 = 0;
            for (int i9 = 0; i9 < list.size(); i9++) {
                ((Long) list.get(i9)).getClass();
                i8 += 8;
            }
            this.zza.zzt(i8);
            while (i5 < list.size()) {
                this.zza.zzi(((Long) list.get(i5)).longValue());
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
        if (list instanceof zzmv) {
            zzmv zzmv = (zzmv) list;
            if (z3) {
                this.zza.zzr(i2, 2);
                int i6 = 0;
                for (int i7 = 0; i7 < zzmv.size(); i7++) {
                    zzmv.zze(i7);
                    i6 += 4;
                }
                this.zza.zzt(i6);
                while (i5 < zzmv.size()) {
                    this.zza.zzg(Float.floatToRawIntBits(zzmv.zze(i5)));
                    i5++;
                }
                return;
            }
            while (i5 < zzmv.size()) {
                this.zza.zzf(i2, Float.floatToRawIntBits(zzmv.zze(i5)));
                i5++;
            }
        } else if (z3) {
            this.zza.zzr(i2, 2);
            int i8 = 0;
            for (int i9 = 0; i9 < list.size(); i9++) {
                ((Float) list.get(i9)).getClass();
                i8 += 4;
            }
            this.zza.zzt(i8);
            while (i5 < list.size()) {
                this.zza.zzg(Float.floatToRawIntBits(((Float) list.get(i5)).floatValue()));
                i5++;
            }
        } else {
            while (i5 < list.size()) {
                this.zza.zzf(i2, Float.floatToRawIntBits(((Float) list.get(i5)).floatValue()));
                i5++;
            }
        }
    }

    public final void zzq(int i2, Object obj, zzow zzow) {
        zzln zzln = this.zza;
        zzln.zzr(i2, 3);
        zzow.zzj((zzoi) obj, zzln.zza);
        zzln.zzr(i2, 4);
    }

    public final void zzr(int i2, int i5) {
        this.zza.zzj(i2, i5);
    }

    public final void zzs(int i2, List list, boolean z3) {
        int i5 = 0;
        if (list instanceof zzne) {
            zzne zzne = (zzne) list;
            if (z3) {
                this.zza.zzr(i2, 2);
                int i6 = 0;
                for (int i7 = 0; i7 < zzne.size(); i7++) {
                    i6 += zzln.zzB((long) zzne.zze(i7));
                }
                this.zza.zzt(i6);
                while (i5 < zzne.size()) {
                    this.zza.zzk(zzne.zze(i5));
                    i5++;
                }
                return;
            }
            while (i5 < zzne.size()) {
                this.zza.zzj(i2, zzne.zze(i5));
                i5++;
            }
        } else if (z3) {
            this.zza.zzr(i2, 2);
            int i8 = 0;
            for (int i9 = 0; i9 < list.size(); i9++) {
                i8 += zzln.zzB((long) ((Integer) list.get(i9)).intValue());
            }
            this.zza.zzt(i8);
            while (i5 < list.size()) {
                this.zza.zzk(((Integer) list.get(i5)).intValue());
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
        if (list instanceof zznx) {
            zznx zznx = (zznx) list;
            if (z3) {
                this.zza.zzr(i2, 2);
                int i6 = 0;
                for (int i7 = 0; i7 < zznx.size(); i7++) {
                    i6 += zzln.zzB(zznx.zze(i7));
                }
                this.zza.zzt(i6);
                while (i5 < zznx.size()) {
                    this.zza.zzv(zznx.zze(i5));
                    i5++;
                }
                return;
            }
            while (i5 < zznx.size()) {
                this.zza.zzu(i2, zznx.zze(i5));
                i5++;
            }
        } else if (z3) {
            this.zza.zzr(i2, 2);
            int i8 = 0;
            for (int i9 = 0; i9 < list.size(); i9++) {
                i8 += zzln.zzB(((Long) list.get(i9)).longValue());
            }
            this.zza.zzt(i8);
            while (i5 < list.size()) {
                this.zza.zzv(((Long) list.get(i5)).longValue());
                i5++;
            }
        } else {
            while (i5 < list.size()) {
                this.zza.zzu(i2, ((Long) list.get(i5)).longValue());
                i5++;
            }
        }
    }

    public final void zzv(int i2, Object obj, zzow zzow) {
        this.zza.zzm(i2, (zzoi) obj, zzow);
    }

    public final void zzw(int i2, Object obj) {
        if (obj instanceof zzle) {
            this.zza.zzo(i2, (zzle) obj);
        } else {
            this.zza.zzn(i2, (zzoi) obj);
        }
    }

    public final void zzx(int i2, int i5) {
        this.zza.zzf(i2, i5);
    }

    public final void zzy(int i2, List list, boolean z3) {
        int i5 = 0;
        if (list instanceof zzne) {
            zzne zzne = (zzne) list;
            if (z3) {
                this.zza.zzr(i2, 2);
                int i6 = 0;
                for (int i7 = 0; i7 < zzne.size(); i7++) {
                    zzne.zze(i7);
                    i6 += 4;
                }
                this.zza.zzt(i6);
                while (i5 < zzne.size()) {
                    this.zza.zzg(zzne.zze(i5));
                    i5++;
                }
                return;
            }
            while (i5 < zzne.size()) {
                this.zza.zzf(i2, zzne.zze(i5));
                i5++;
            }
        } else if (z3) {
            this.zza.zzr(i2, 2);
            int i8 = 0;
            for (int i9 = 0; i9 < list.size(); i9++) {
                ((Integer) list.get(i9)).getClass();
                i8 += 4;
            }
            this.zza.zzt(i8);
            while (i5 < list.size()) {
                this.zza.zzg(((Integer) list.get(i5)).intValue());
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
