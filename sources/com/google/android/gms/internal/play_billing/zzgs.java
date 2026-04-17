package com.google.android.gms.internal.play_billing;

import java.util.List;

final class zzgs implements zzjw {
    private final zzgr zza;

    private zzgs(zzgr zzgr) {
        byte[] bArr = zzhp.zzb;
        this.zza = zzgr;
        zzgr.zza = this;
    }

    public static zzgs zza(zzgr zzgr) {
        zzgs zzgs = zzgr.zza;
        if (zzgs != null) {
            return zzgs;
        }
        return new zzgs(zzgr);
    }

    public final void zzA(int i2, List list, boolean z3) {
        int i5 = 0;
        if (list instanceof zzib) {
            zzib zzib = (zzib) list;
            if (z3) {
                this.zza.zzr(i2, 2);
                int i6 = 0;
                for (int i7 = 0; i7 < zzib.size(); i7++) {
                    zzib.zze(i7);
                    i6 += 8;
                }
                this.zza.zzt(i6);
                while (i5 < zzib.size()) {
                    this.zza.zzi(zzib.zze(i5));
                    i5++;
                }
                return;
            }
            while (i5 < zzib.size()) {
                this.zza.zzh(i2, zzib.zze(i5));
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
        if (list instanceof zzhl) {
            zzhl zzhl = (zzhl) list;
            if (z3) {
                this.zza.zzr(i2, 2);
                int i6 = 0;
                for (int i7 = 0; i7 < zzhl.size(); i7++) {
                    int zze = zzhl.zze(i7);
                    i6 += zzgr.zzz((zze >> 31) ^ (zze + zze));
                }
                this.zza.zzt(i6);
                while (i5 < zzhl.size()) {
                    zzgr zzgr = this.zza;
                    int zze2 = zzhl.zze(i5);
                    zzgr.zzt((zze2 >> 31) ^ (zze2 + zze2));
                    i5++;
                }
                return;
            }
            while (i5 < zzhl.size()) {
                zzgr zzgr2 = this.zza;
                int zze3 = zzhl.zze(i5);
                zzgr2.zzs(i2, (zze3 >> 31) ^ (zze3 + zze3));
                i5++;
            }
        } else if (z3) {
            this.zza.zzr(i2, 2);
            int i8 = 0;
            for (int i9 = 0; i9 < list.size(); i9++) {
                int intValue = ((Integer) list.get(i9)).intValue();
                i8 += zzgr.zzz((intValue >> 31) ^ (intValue + intValue));
            }
            this.zza.zzt(i8);
            while (i5 < list.size()) {
                zzgr zzgr3 = this.zza;
                int intValue2 = ((Integer) list.get(i5)).intValue();
                zzgr3.zzt((intValue2 >> 31) ^ (intValue2 + intValue2));
                i5++;
            }
        } else {
            while (i5 < list.size()) {
                zzgr zzgr4 = this.zza;
                int intValue3 = ((Integer) list.get(i5)).intValue();
                zzgr4.zzs(i2, (intValue3 >> 31) ^ (intValue3 + intValue3));
                i5++;
            }
        }
    }

    public final void zzD(int i2, long j6) {
        this.zza.zzu(i2, (j6 >> 63) ^ (j6 + j6));
    }

    public final void zzE(int i2, List list, boolean z3) {
        int i5 = 0;
        if (list instanceof zzib) {
            zzib zzib = (zzib) list;
            if (z3) {
                this.zza.zzr(i2, 2);
                int i6 = 0;
                for (int i7 = 0; i7 < zzib.size(); i7++) {
                    long zze = zzib.zze(i7);
                    i6 += zzgr.zzA((zze >> 63) ^ (zze + zze));
                }
                this.zza.zzt(i6);
                while (i5 < zzib.size()) {
                    zzgr zzgr = this.zza;
                    long zze2 = zzib.zze(i5);
                    zzgr.zzv((zze2 >> 63) ^ (zze2 + zze2));
                    i5++;
                }
                return;
            }
            while (i5 < zzib.size()) {
                zzgr zzgr2 = this.zza;
                long zze3 = zzib.zze(i5);
                zzgr2.zzu(i2, (zze3 >> 63) ^ (zze3 + zze3));
                i5++;
            }
        } else if (z3) {
            this.zza.zzr(i2, 2);
            int i8 = 0;
            for (int i9 = 0; i9 < list.size(); i9++) {
                long longValue = ((Long) list.get(i9)).longValue();
                i8 += zzgr.zzA((longValue >> 63) ^ (longValue + longValue));
            }
            this.zza.zzt(i8);
            while (i5 < list.size()) {
                zzgr zzgr3 = this.zza;
                long longValue2 = ((Long) list.get(i5)).longValue();
                zzgr3.zzv((longValue2 >> 63) ^ (longValue2 + longValue2));
                i5++;
            }
        } else {
            while (i5 < list.size()) {
                zzgr zzgr4 = this.zza;
                long longValue3 = ((Long) list.get(i5)).longValue();
                zzgr4.zzu(i2, (longValue3 >> 63) ^ (longValue3 + longValue3));
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
        if (list instanceof zzhy) {
            zzhy zzhy = (zzhy) list;
            while (i5 < list.size()) {
                Object zzc = zzhy.zzc();
                if (zzc instanceof String) {
                    this.zza.zzp(i2, (String) zzc);
                } else {
                    this.zza.zze(i2, (zzgk) zzc);
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
        if (list instanceof zzhl) {
            zzhl zzhl = (zzhl) list;
            if (z3) {
                this.zza.zzr(i2, 2);
                int i6 = 0;
                for (int i7 = 0; i7 < zzhl.size(); i7++) {
                    i6 += zzgr.zzz(zzhl.zze(i7));
                }
                this.zza.zzt(i6);
                while (i5 < zzhl.size()) {
                    this.zza.zzt(zzhl.zze(i5));
                    i5++;
                }
                return;
            }
            while (i5 < zzhl.size()) {
                this.zza.zzs(i2, zzhl.zze(i5));
                i5++;
            }
        } else if (z3) {
            this.zza.zzr(i2, 2);
            int i8 = 0;
            for (int i9 = 0; i9 < list.size(); i9++) {
                i8 += zzgr.zzz(((Integer) list.get(i9)).intValue());
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
        if (list instanceof zzib) {
            zzib zzib = (zzib) list;
            if (z3) {
                this.zza.zzr(i2, 2);
                int i6 = 0;
                for (int i7 = 0; i7 < zzib.size(); i7++) {
                    i6 += zzgr.zzA(zzib.zze(i7));
                }
                this.zza.zzt(i6);
                while (i5 < zzib.size()) {
                    this.zza.zzv(zzib.zze(i5));
                    i5++;
                }
                return;
            }
            while (i5 < zzib.size()) {
                this.zza.zzu(i2, zzib.zze(i5));
                i5++;
            }
        } else if (z3) {
            this.zza.zzr(i2, 2);
            int i8 = 0;
            for (int i9 = 0; i9 < list.size(); i9++) {
                i8 += zzgr.zzA(((Long) list.get(i9)).longValue());
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
        if (list instanceof zzgb) {
            zzgb zzgb = (zzgb) list;
            if (z3) {
                this.zza.zzr(i2, 2);
                int i6 = 0;
                for (int i7 = 0; i7 < zzgb.size(); i7++) {
                    zzgb.zzf(i7);
                    i6++;
                }
                this.zza.zzt(i6);
                while (i5 < zzgb.size()) {
                    this.zza.zzb(zzgb.zzf(i5) ? (byte) 1 : 0);
                    i5++;
                }
                return;
            }
            while (i5 < zzgb.size()) {
                this.zza.zzd(i2, zzgb.zzf(i5));
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

    public final void zzd(int i2, zzgk zzgk) {
        this.zza.zze(i2, zzgk);
    }

    public final void zze(int i2, List list) {
        for (int i5 = 0; i5 < list.size(); i5++) {
            this.zza.zze(i2, (zzgk) list.get(i5));
        }
    }

    public final void zzf(int i2, double d) {
        this.zza.zzh(i2, Double.doubleToRawLongBits(d));
    }

    public final void zzg(int i2, List list, boolean z3) {
        int i5 = 0;
        if (list instanceof zzgt) {
            zzgt zzgt = (zzgt) list;
            if (z3) {
                this.zza.zzr(i2, 2);
                int i6 = 0;
                for (int i7 = 0; i7 < zzgt.size(); i7++) {
                    zzgt.zze(i7);
                    i6 += 8;
                }
                this.zza.zzt(i6);
                while (i5 < zzgt.size()) {
                    this.zza.zzi(Double.doubleToRawLongBits(zzgt.zze(i5)));
                    i5++;
                }
                return;
            }
            while (i5 < zzgt.size()) {
                this.zza.zzh(i2, Double.doubleToRawLongBits(zzgt.zze(i5)));
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
        if (list instanceof zzhl) {
            zzhl zzhl = (zzhl) list;
            if (z3) {
                this.zza.zzr(i2, 2);
                int i6 = 0;
                for (int i7 = 0; i7 < zzhl.size(); i7++) {
                    i6 += zzgr.zzA((long) zzhl.zze(i7));
                }
                this.zza.zzt(i6);
                while (i5 < zzhl.size()) {
                    this.zza.zzk(zzhl.zze(i5));
                    i5++;
                }
                return;
            }
            while (i5 < zzhl.size()) {
                this.zza.zzj(i2, zzhl.zze(i5));
                i5++;
            }
        } else if (z3) {
            this.zza.zzr(i2, 2);
            int i8 = 0;
            for (int i9 = 0; i9 < list.size(); i9++) {
                i8 += zzgr.zzA((long) ((Integer) list.get(i9)).intValue());
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
        if (list instanceof zzhl) {
            zzhl zzhl = (zzhl) list;
            if (z3) {
                this.zza.zzr(i2, 2);
                int i6 = 0;
                for (int i7 = 0; i7 < zzhl.size(); i7++) {
                    zzhl.zze(i7);
                    i6 += 4;
                }
                this.zza.zzt(i6);
                while (i5 < zzhl.size()) {
                    this.zza.zzg(zzhl.zze(i5));
                    i5++;
                }
                return;
            }
            while (i5 < zzhl.size()) {
                this.zza.zzf(i2, zzhl.zze(i5));
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
        if (list instanceof zzib) {
            zzib zzib = (zzib) list;
            if (z3) {
                this.zza.zzr(i2, 2);
                int i6 = 0;
                for (int i7 = 0; i7 < zzib.size(); i7++) {
                    zzib.zze(i7);
                    i6 += 8;
                }
                this.zza.zzt(i6);
                while (i5 < zzib.size()) {
                    this.zza.zzi(zzib.zze(i5));
                    i5++;
                }
                return;
            }
            while (i5 < zzib.size()) {
                this.zza.zzh(i2, zzib.zze(i5));
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
        if (list instanceof zzhd) {
            zzhd zzhd = (zzhd) list;
            if (z3) {
                this.zza.zzr(i2, 2);
                int i6 = 0;
                for (int i7 = 0; i7 < zzhd.size(); i7++) {
                    zzhd.zze(i7);
                    i6 += 4;
                }
                this.zza.zzt(i6);
                while (i5 < zzhd.size()) {
                    this.zza.zzg(Float.floatToRawIntBits(zzhd.zze(i5)));
                    i5++;
                }
                return;
            }
            while (i5 < zzhd.size()) {
                this.zza.zzf(i2, Float.floatToRawIntBits(zzhd.zze(i5)));
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

    public final void zzq(int i2, Object obj, zzix zzix) {
        zzgr zzgr = this.zza;
        zzgr.zzr(i2, 3);
        zzix.zzi((zzim) obj, zzgr.zza);
        zzgr.zzr(i2, 4);
    }

    public final void zzr(int i2, int i5) {
        this.zza.zzj(i2, i5);
    }

    public final void zzs(int i2, List list, boolean z3) {
        int i5 = 0;
        if (list instanceof zzhl) {
            zzhl zzhl = (zzhl) list;
            if (z3) {
                this.zza.zzr(i2, 2);
                int i6 = 0;
                for (int i7 = 0; i7 < zzhl.size(); i7++) {
                    i6 += zzgr.zzA((long) zzhl.zze(i7));
                }
                this.zza.zzt(i6);
                while (i5 < zzhl.size()) {
                    this.zza.zzk(zzhl.zze(i5));
                    i5++;
                }
                return;
            }
            while (i5 < zzhl.size()) {
                this.zza.zzj(i2, zzhl.zze(i5));
                i5++;
            }
        } else if (z3) {
            this.zza.zzr(i2, 2);
            int i8 = 0;
            for (int i9 = 0; i9 < list.size(); i9++) {
                i8 += zzgr.zzA((long) ((Integer) list.get(i9)).intValue());
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
        if (list instanceof zzib) {
            zzib zzib = (zzib) list;
            if (z3) {
                this.zza.zzr(i2, 2);
                int i6 = 0;
                for (int i7 = 0; i7 < zzib.size(); i7++) {
                    i6 += zzgr.zzA(zzib.zze(i7));
                }
                this.zza.zzt(i6);
                while (i5 < zzib.size()) {
                    this.zza.zzv(zzib.zze(i5));
                    i5++;
                }
                return;
            }
            while (i5 < zzib.size()) {
                this.zza.zzu(i2, zzib.zze(i5));
                i5++;
            }
        } else if (z3) {
            this.zza.zzr(i2, 2);
            int i8 = 0;
            for (int i9 = 0; i9 < list.size(); i9++) {
                i8 += zzgr.zzA(((Long) list.get(i9)).longValue());
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

    public final void zzv(int i2, Object obj, zzix zzix) {
        this.zza.zzm(i2, (zzim) obj, zzix);
    }

    public final void zzw(int i2, Object obj) {
        if (obj instanceof zzgk) {
            this.zza.zzo(i2, (zzgk) obj);
        } else {
            this.zza.zzn(i2, (zzim) obj);
        }
    }

    public final void zzx(int i2, int i5) {
        this.zza.zzf(i2, i5);
    }

    public final void zzy(int i2, List list, boolean z3) {
        int i5 = 0;
        if (list instanceof zzhl) {
            zzhl zzhl = (zzhl) list;
            if (z3) {
                this.zza.zzr(i2, 2);
                int i6 = 0;
                for (int i7 = 0; i7 < zzhl.size(); i7++) {
                    zzhl.zze(i7);
                    i6 += 4;
                }
                this.zza.zzt(i6);
                while (i5 < zzhl.size()) {
                    this.zza.zzg(zzhl.zze(i5));
                    i5++;
                }
                return;
            }
            while (i5 < zzhl.size()) {
                this.zza.zzf(i2, zzhl.zze(i5));
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
