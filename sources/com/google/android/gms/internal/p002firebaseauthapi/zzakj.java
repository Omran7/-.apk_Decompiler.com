package com.google.android.gms.internal.p002firebaseauthapi;

import java.util.List;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzakj  reason: invalid package */
final class zzakj implements zzaof {
    private final zzakg zza;

    private zzakj(zzakg zzakg) {
        zzakg zzakg2 = (zzakg) zzalb.zza(zzakg, "output");
        this.zza = zzakg2;
        zzakg2.zze = this;
    }

    public final int zza() {
        return 1;
    }

    public final void zzb(int i2, List<Double> list, boolean z3) {
        int i5 = 0;
        if (list instanceof zzaki) {
            zzaki zzaki = (zzaki) list;
            if (z3) {
                this.zza.zzk(i2, 2);
                int i6 = 0;
                for (int i7 = 0; i7 < zzaki.size(); i7++) {
                    i6 += zzakg.zza(zzaki.zzb(i7));
                }
                this.zza.zzn(i6);
                while (i5 < zzaki.size()) {
                    this.zza.zzb(zzaki.zzb(i5));
                    i5++;
                }
                return;
            }
            while (i5 < zzaki.size()) {
                this.zza.zzb(i2, zzaki.zzb(i5));
                i5++;
            }
        } else if (z3) {
            this.zza.zzk(i2, 2);
            int i8 = 0;
            for (int i9 = 0; i9 < list.size(); i9++) {
                i8 += zzakg.zza(list.get(i9).doubleValue());
            }
            this.zza.zzn(i8);
            while (i5 < list.size()) {
                this.zza.zzb(list.get(i5).doubleValue());
                i5++;
            }
        } else {
            while (i5 < list.size()) {
                this.zza.zzb(i2, list.get(i5).doubleValue());
                i5++;
            }
        }
    }

    public final void zzc(int i2, List<Integer> list, boolean z3) {
        int i5 = 0;
        if (list instanceof zzakz) {
            zzakz zzakz = (zzakz) list;
            if (z3) {
                this.zza.zzk(i2, 2);
                int i6 = 0;
                for (int i7 = 0; i7 < zzakz.size(); i7++) {
                    i6 += zzakg.zzc(zzakz.zzb(i7));
                }
                this.zza.zzn(i6);
                while (i5 < zzakz.size()) {
                    this.zza.zzl(zzakz.zzb(i5));
                    i5++;
                }
                return;
            }
            while (i5 < zzakz.size()) {
                this.zza.zzi(i2, zzakz.zzb(i5));
                i5++;
            }
        } else if (z3) {
            this.zza.zzk(i2, 2);
            int i8 = 0;
            for (int i9 = 0; i9 < list.size(); i9++) {
                i8 += zzakg.zzc(list.get(i9).intValue());
            }
            this.zza.zzn(i8);
            while (i5 < list.size()) {
                this.zza.zzl(list.get(i5).intValue());
                i5++;
            }
        } else {
            while (i5 < list.size()) {
                this.zza.zzi(i2, list.get(i5).intValue());
                i5++;
            }
        }
    }

    public final void zzd(int i2, List<Integer> list, boolean z3) {
        int i5 = 0;
        if (list instanceof zzakz) {
            zzakz zzakz = (zzakz) list;
            if (z3) {
                this.zza.zzk(i2, 2);
                int i6 = 0;
                for (int i7 = 0; i7 < zzakz.size(); i7++) {
                    i6 += zzakg.zzd(zzakz.zzb(i7));
                }
                this.zza.zzn(i6);
                while (i5 < zzakz.size()) {
                    this.zza.zzk(zzakz.zzb(i5));
                    i5++;
                }
                return;
            }
            while (i5 < zzakz.size()) {
                this.zza.zzh(i2, zzakz.zzb(i5));
                i5++;
            }
        } else if (z3) {
            this.zza.zzk(i2, 2);
            int i8 = 0;
            for (int i9 = 0; i9 < list.size(); i9++) {
                i8 += zzakg.zzd(list.get(i9).intValue());
            }
            this.zza.zzn(i8);
            while (i5 < list.size()) {
                this.zza.zzk(list.get(i5).intValue());
                i5++;
            }
        } else {
            while (i5 < list.size()) {
                this.zza.zzh(i2, list.get(i5).intValue());
                i5++;
            }
        }
    }

    public final void zze(int i2, List<Long> list, boolean z3) {
        int i5 = 0;
        if (list instanceof zzalr) {
            zzalr zzalr = (zzalr) list;
            if (z3) {
                this.zza.zzk(i2, 2);
                int i6 = 0;
                for (int i7 = 0; i7 < zzalr.size(); i7++) {
                    i6 += zzakg.zzc(zzalr.zzb(i7));
                }
                this.zza.zzn(i6);
                while (i5 < zzalr.size()) {
                    this.zza.zzh(zzalr.zzb(i5));
                    i5++;
                }
                return;
            }
            while (i5 < zzalr.size()) {
                this.zza.zzf(i2, zzalr.zzb(i5));
                i5++;
            }
        } else if (z3) {
            this.zza.zzk(i2, 2);
            int i8 = 0;
            for (int i9 = 0; i9 < list.size(); i9++) {
                i8 += zzakg.zzc(list.get(i9).longValue());
            }
            this.zza.zzn(i8);
            while (i5 < list.size()) {
                this.zza.zzh(list.get(i5).longValue());
                i5++;
            }
        } else {
            while (i5 < list.size()) {
                this.zza.zzf(i2, list.get(i5).longValue());
                i5++;
            }
        }
    }

    public final void zzf(int i2, List<Float> list, boolean z3) {
        int i5 = 0;
        if (list instanceof zzakx) {
            zzakx zzakx = (zzakx) list;
            if (z3) {
                this.zza.zzk(i2, 2);
                int i6 = 0;
                for (int i7 = 0; i7 < zzakx.size(); i7++) {
                    i6 += zzakg.zza(zzakx.zzb(i7));
                }
                this.zza.zzn(i6);
                while (i5 < zzakx.size()) {
                    this.zza.zzb(zzakx.zzb(i5));
                    i5++;
                }
                return;
            }
            while (i5 < zzakx.size()) {
                this.zza.zzb(i2, zzakx.zzb(i5));
                i5++;
            }
        } else if (z3) {
            this.zza.zzk(i2, 2);
            int i8 = 0;
            for (int i9 = 0; i9 < list.size(); i9++) {
                i8 += zzakg.zza(list.get(i9).floatValue());
            }
            this.zza.zzn(i8);
            while (i5 < list.size()) {
                this.zza.zzb(list.get(i5).floatValue());
                i5++;
            }
        } else {
            while (i5 < list.size()) {
                this.zza.zzb(i2, list.get(i5).floatValue());
                i5++;
            }
        }
    }

    public final void zzg(int i2, List<Integer> list, boolean z3) {
        int i5 = 0;
        if (list instanceof zzakz) {
            zzakz zzakz = (zzakz) list;
            if (z3) {
                this.zza.zzk(i2, 2);
                int i6 = 0;
                for (int i7 = 0; i7 < zzakz.size(); i7++) {
                    i6 += zzakg.zze(zzakz.zzb(i7));
                }
                this.zza.zzn(i6);
                while (i5 < zzakz.size()) {
                    this.zza.zzl(zzakz.zzb(i5));
                    i5++;
                }
                return;
            }
            while (i5 < zzakz.size()) {
                this.zza.zzi(i2, zzakz.zzb(i5));
                i5++;
            }
        } else if (z3) {
            this.zza.zzk(i2, 2);
            int i8 = 0;
            for (int i9 = 0; i9 < list.size(); i9++) {
                i8 += zzakg.zze(list.get(i9).intValue());
            }
            this.zza.zzn(i8);
            while (i5 < list.size()) {
                this.zza.zzl(list.get(i5).intValue());
                i5++;
            }
        } else {
            while (i5 < list.size()) {
                this.zza.zzi(i2, list.get(i5).intValue());
                i5++;
            }
        }
    }

    public final void zzh(int i2, List<Long> list, boolean z3) {
        int i5 = 0;
        if (list instanceof zzalr) {
            zzalr zzalr = (zzalr) list;
            if (z3) {
                this.zza.zzk(i2, 2);
                int i6 = 0;
                for (int i7 = 0; i7 < zzalr.size(); i7++) {
                    i6 += zzakg.zzd(zzalr.zzb(i7));
                }
                this.zza.zzn(i6);
                while (i5 < zzalr.size()) {
                    this.zza.zzj(zzalr.zzb(i5));
                    i5++;
                }
                return;
            }
            while (i5 < zzalr.size()) {
                this.zza.zzh(i2, zzalr.zzb(i5));
                i5++;
            }
        } else if (z3) {
            this.zza.zzk(i2, 2);
            int i8 = 0;
            for (int i9 = 0; i9 < list.size(); i9++) {
                i8 += zzakg.zzd(list.get(i9).longValue());
            }
            this.zza.zzn(i8);
            while (i5 < list.size()) {
                this.zza.zzj(list.get(i5).longValue());
                i5++;
            }
        } else {
            while (i5 < list.size()) {
                this.zza.zzh(i2, list.get(i5).longValue());
                i5++;
            }
        }
    }

    public final void zzi(int i2, List<Integer> list, boolean z3) {
        int i5 = 0;
        if (list instanceof zzakz) {
            zzakz zzakz = (zzakz) list;
            if (z3) {
                this.zza.zzk(i2, 2);
                int i6 = 0;
                for (int i7 = 0; i7 < zzakz.size(); i7++) {
                    i6 += zzakg.zzg(zzakz.zzb(i7));
                }
                this.zza.zzn(i6);
                while (i5 < zzakz.size()) {
                    this.zza.zzk(zzakz.zzb(i5));
                    i5++;
                }
                return;
            }
            while (i5 < zzakz.size()) {
                this.zza.zzh(i2, zzakz.zzb(i5));
                i5++;
            }
        } else if (z3) {
            this.zza.zzk(i2, 2);
            int i8 = 0;
            for (int i9 = 0; i9 < list.size(); i9++) {
                i8 += zzakg.zzg(list.get(i9).intValue());
            }
            this.zza.zzn(i8);
            while (i5 < list.size()) {
                this.zza.zzk(list.get(i5).intValue());
                i5++;
            }
        } else {
            while (i5 < list.size()) {
                this.zza.zzh(i2, list.get(i5).intValue());
                i5++;
            }
        }
    }

    public final void zzj(int i2, List<Long> list, boolean z3) {
        int i5 = 0;
        if (list instanceof zzalr) {
            zzalr zzalr = (zzalr) list;
            if (z3) {
                this.zza.zzk(i2, 2);
                int i6 = 0;
                for (int i7 = 0; i7 < zzalr.size(); i7++) {
                    i6 += zzakg.zze(zzalr.zzb(i7));
                }
                this.zza.zzn(i6);
                while (i5 < zzalr.size()) {
                    this.zza.zzh(zzalr.zzb(i5));
                    i5++;
                }
                return;
            }
            while (i5 < zzalr.size()) {
                this.zza.zzf(i2, zzalr.zzb(i5));
                i5++;
            }
        } else if (z3) {
            this.zza.zzk(i2, 2);
            int i8 = 0;
            for (int i9 = 0; i9 < list.size(); i9++) {
                i8 += zzakg.zze(list.get(i9).longValue());
            }
            this.zza.zzn(i8);
            while (i5 < list.size()) {
                this.zza.zzh(list.get(i5).longValue());
                i5++;
            }
        } else {
            while (i5 < list.size()) {
                this.zza.zzf(i2, list.get(i5).longValue());
                i5++;
            }
        }
    }

    public final void zzk(int i2, List<Integer> list, boolean z3) {
        int i5 = 0;
        if (list instanceof zzakz) {
            zzakz zzakz = (zzakz) list;
            if (z3) {
                this.zza.zzk(i2, 2);
                int i6 = 0;
                for (int i7 = 0; i7 < zzakz.size(); i7++) {
                    i6 += zzakg.zzh(zzakz.zzb(i7));
                }
                this.zza.zzn(i6);
                while (i5 < zzakz.size()) {
                    this.zza.zzm(zzakz.zzb(i5));
                    i5++;
                }
                return;
            }
            while (i5 < zzakz.size()) {
                this.zza.zzj(i2, zzakz.zzb(i5));
                i5++;
            }
        } else if (z3) {
            this.zza.zzk(i2, 2);
            int i8 = 0;
            for (int i9 = 0; i9 < list.size(); i9++) {
                i8 += zzakg.zzh(list.get(i9).intValue());
            }
            this.zza.zzn(i8);
            while (i5 < list.size()) {
                this.zza.zzm(list.get(i5).intValue());
                i5++;
            }
        } else {
            while (i5 < list.size()) {
                this.zza.zzj(i2, list.get(i5).intValue());
                i5++;
            }
        }
    }

    public final void zzl(int i2, List<Long> list, boolean z3) {
        int i5 = 0;
        if (list instanceof zzalr) {
            zzalr zzalr = (zzalr) list;
            if (z3) {
                this.zza.zzk(i2, 2);
                int i6 = 0;
                for (int i7 = 0; i7 < zzalr.size(); i7++) {
                    i6 += zzakg.zzf(zzalr.zzb(i7));
                }
                this.zza.zzn(i6);
                while (i5 < zzalr.size()) {
                    this.zza.zzi(zzalr.zzb(i5));
                    i5++;
                }
                return;
            }
            while (i5 < zzalr.size()) {
                this.zza.zzg(i2, zzalr.zzb(i5));
                i5++;
            }
        } else if (z3) {
            this.zza.zzk(i2, 2);
            int i8 = 0;
            for (int i9 = 0; i9 < list.size(); i9++) {
                i8 += zzakg.zzf(list.get(i9).longValue());
            }
            this.zza.zzn(i8);
            while (i5 < list.size()) {
                this.zza.zzi(list.get(i5).longValue());
                i5++;
            }
        } else {
            while (i5 < list.size()) {
                this.zza.zzg(i2, list.get(i5).longValue());
                i5++;
            }
        }
    }

    public final void zzm(int i2, List<Integer> list, boolean z3) {
        int i5 = 0;
        if (list instanceof zzakz) {
            zzakz zzakz = (zzakz) list;
            if (z3) {
                this.zza.zzk(i2, 2);
                int i6 = 0;
                for (int i7 = 0; i7 < zzakz.size(); i7++) {
                    i6 += zzakg.zzj(zzakz.zzb(i7));
                }
                this.zza.zzn(i6);
                while (i5 < zzakz.size()) {
                    this.zza.zzn(zzakz.zzb(i5));
                    i5++;
                }
                return;
            }
            while (i5 < zzakz.size()) {
                this.zza.zzl(i2, zzakz.zzb(i5));
                i5++;
            }
        } else if (z3) {
            this.zza.zzk(i2, 2);
            int i8 = 0;
            for (int i9 = 0; i9 < list.size(); i9++) {
                i8 += zzakg.zzj(list.get(i9).intValue());
            }
            this.zza.zzn(i8);
            while (i5 < list.size()) {
                this.zza.zzn(list.get(i5).intValue());
                i5++;
            }
        } else {
            while (i5 < list.size()) {
                this.zza.zzl(i2, list.get(i5).intValue());
                i5++;
            }
        }
    }

    public final void zzn(int i2, List<Long> list, boolean z3) {
        int i5 = 0;
        if (list instanceof zzalr) {
            zzalr zzalr = (zzalr) list;
            if (z3) {
                this.zza.zzk(i2, 2);
                int i6 = 0;
                for (int i7 = 0; i7 < zzalr.size(); i7++) {
                    i6 += zzakg.zzg(zzalr.zzb(i7));
                }
                this.zza.zzn(i6);
                while (i5 < zzalr.size()) {
                    this.zza.zzj(zzalr.zzb(i5));
                    i5++;
                }
                return;
            }
            while (i5 < zzalr.size()) {
                this.zza.zzh(i2, zzalr.zzb(i5));
                i5++;
            }
        } else if (z3) {
            this.zza.zzk(i2, 2);
            int i8 = 0;
            for (int i9 = 0; i9 < list.size(); i9++) {
                i8 += zzakg.zzg(list.get(i9).longValue());
            }
            this.zza.zzn(i8);
            while (i5 < list.size()) {
                this.zza.zzj(list.get(i5).longValue());
                i5++;
            }
        } else {
            while (i5 < list.size()) {
                this.zza.zzh(i2, list.get(i5).longValue());
                i5++;
            }
        }
    }

    public static zzakj zza(zzakg zzakg) {
        zzakj zzakj = zzakg.zze;
        if (zzakj != null) {
            return zzakj;
        }
        return new zzakj(zzakg);
    }

    public final void zza(int i2, boolean z3) {
        this.zza.zzb(i2, z3);
    }

    public final void zza(int i2, List<Boolean> list, boolean z3) {
        int i5 = 0;
        if (list instanceof zzajn) {
            zzajn zzajn = (zzajn) list;
            if (z3) {
                this.zza.zzk(i2, 2);
                int i6 = 0;
                for (int i7 = 0; i7 < zzajn.size(); i7++) {
                    i6 += zzakg.zza(zzajn.zzb(i7));
                }
                this.zza.zzn(i6);
                while (i5 < zzajn.size()) {
                    this.zza.zzb(zzajn.zzb(i5));
                    i5++;
                }
                return;
            }
            while (i5 < zzajn.size()) {
                this.zza.zzb(i2, zzajn.zzb(i5));
                i5++;
            }
        } else if (z3) {
            this.zza.zzk(i2, 2);
            int i8 = 0;
            for (int i9 = 0; i9 < list.size(); i9++) {
                i8 += zzakg.zza(list.get(i9).booleanValue());
            }
            this.zza.zzn(i8);
            while (i5 < list.size()) {
                this.zza.zzb(list.get(i5).booleanValue());
                i5++;
            }
        } else {
            while (i5 < list.size()) {
                this.zza.zzb(i2, list.get(i5).booleanValue());
                i5++;
            }
        }
    }

    public final void zzb(int i2, int i5) {
        this.zza.zzh(i2, i5);
    }

    public final void zzd(int i2, int i5) {
        this.zza.zzh(i2, i5);
    }

    public final void zze(int i2, int i5) {
        this.zza.zzj(i2, i5);
    }

    public final void zzf(int i2, int i5) {
        this.zza.zzl(i2, i5);
    }

    public final void zzb(int i2, long j6) {
        this.zza.zzh(i2, j6);
    }

    public final void zze(int i2, long j6) {
        this.zza.zzh(i2, j6);
    }

    public final void zzd(int i2, long j6) {
        this.zza.zzg(i2, j6);
    }

    public final void zzb(int i2, Object obj, zzamv zzamv) {
        this.zza.zzc(i2, (zzamc) obj, zzamv);
    }

    public final void zza(int i2, zzajp zzajp) {
        this.zza.zzc(i2, zzajp);
    }

    public final void zzb(int i2, List<?> list, zzamv zzamv) {
        for (int i5 = 0; i5 < list.size(); i5++) {
            zzb(i2, (Object) list.get(i5), zzamv);
        }
    }

    public final void zzc(int i2, int i5) {
        this.zza.zzi(i2, i5);
    }

    public final void zza(int i2, List<zzajp> list) {
        for (int i5 = 0; i5 < list.size(); i5++) {
            this.zza.zzc(i2, list.get(i5));
        }
    }

    public final void zzc(int i2, long j6) {
        this.zza.zzf(i2, j6);
    }

    @Deprecated
    public final void zzb(int i2) {
        this.zza.zzk(i2, 3);
    }

    public final void zza(int i2, double d) {
        this.zza.zzb(i2, d);
    }

    public final void zzb(int i2, List<String> list) {
        int i5 = 0;
        if (list instanceof zzaln) {
            zzaln zzaln = (zzaln) list;
            while (i5 < list.size()) {
                Object zza2 = zzaln.zza(i5);
                if (zza2 instanceof String) {
                    this.zza.zzb(i2, (String) zza2);
                } else {
                    this.zza.zzc(i2, (zzajp) zza2);
                }
                i5++;
            }
            return;
        }
        while (i5 < list.size()) {
            this.zza.zzb(i2, list.get(i5));
            i5++;
        }
    }

    @Deprecated
    public final void zza(int i2) {
        this.zza.zzk(i2, 4);
    }

    public final void zza(int i2, int i5) {
        this.zza.zzi(i2, i5);
    }

    public final void zza(int i2, long j6) {
        this.zza.zzf(i2, j6);
    }

    public final void zza(int i2, float f6) {
        this.zza.zzb(i2, f6);
    }

    public final void zza(int i2, Object obj, zzamv zzamv) {
        zzakg zzakg = this.zza;
        zzakg.zzk(i2, 3);
        zzamv.zza((zzamc) obj, (zzaof) zzakg.zze);
        zzakg.zzk(i2, 4);
    }

    public final void zza(int i2, List<?> list, zzamv zzamv) {
        for (int i5 = 0; i5 < list.size(); i5++) {
            zza(i2, (Object) list.get(i5), zzamv);
        }
    }

    public final <K, V> void zza(int i2, zzalx<K, V> zzalx, Map<K, V> map) {
        for (Map.Entry next : map.entrySet()) {
            this.zza.zzk(i2, 2);
            this.zza.zzn(zzalu.zza(zzalx, next.getKey(), next.getValue()));
            zzalu.zza(this.zza, zzalx, next.getKey(), next.getValue());
        }
    }

    public final void zza(int i2, Object obj) {
        if (obj instanceof zzajp) {
            this.zza.zzd(i2, (zzajp) obj);
        } else {
            this.zza.zzb(i2, (zzamc) obj);
        }
    }

    public final void zza(int i2, String str) {
        this.zza.zzb(i2, str);
    }
}
