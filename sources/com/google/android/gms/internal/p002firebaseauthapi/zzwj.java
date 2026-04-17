package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzaky;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzwj  reason: invalid package */
public final class zzwj extends zzaky<zzwj, zza> implements zzame {
    /* access modifiers changed from: private */
    public static final zzwj zzc;
    private static volatile zzamp<zzwj> zzd;
    /* access modifiers changed from: private */
    public int zze;
    /* access modifiers changed from: private */
    public int zzf;
    /* access modifiers changed from: private */
    public int zzg;

    /* renamed from: com.google.android.gms.internal.firebase-auth-api.zzwj$zza */
    public static final class zza extends zzaky.zza<zzwj, zza> implements zzame {
        public final zza zza(zzwb zzwb) {
            zzh();
            ((zzwj) this.zza).zzg = zzwb.zza();
            return this;
        }

        private zza() {
            super(zzwj.zzc);
        }

        public final zza zza(zzwe zzwe) {
            zzh();
            ((zzwj) this.zza).zzf = zzwe.zza();
            return this;
        }

        public final zza zza(zzwd zzwd) {
            zzh();
            ((zzwj) this.zza).zze = zzwd.zza();
            return this;
        }
    }

    static {
        zzwj zzwj = new zzwj();
        zzc = zzwj;
        zzaky.zza(zzwj.class, zzwj);
    }

    private zzwj() {
    }

    public static zza zzd() {
        return (zza) zzc.zzm();
    }

    public static zzwj zzf() {
        return zzc;
    }

    public final zzwb zza() {
        zzwb zza2 = zzwb.zza(this.zzg);
        return zza2 == null ? zzwb.UNRECOGNIZED : zza2;
    }

    public final zzwe zzb() {
        zzwe zza2 = zzwe.zza(this.zzf);
        if (zza2 == null) {
            return zzwe.UNRECOGNIZED;
        }
        return zza2;
    }

    public final zzwd zzc() {
        zzwd zza2 = zzwd.zza(this.zze);
        if (zza2 == null) {
            return zzwd.UNRECOGNIZED;
        }
        return zza2;
    }

    public final Object zza(int i2, Object obj, Object obj2) {
        switch (zzwi.zza[i2 - 1]) {
            case 1:
                return new zzwj();
            case 2:
                return new zza();
            case 3:
                return zzaky.zza((zzamc) zzc, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\f\u0002\f\u0003\f", new Object[]{"zze", "zzf", "zzg"});
            case 4:
                return zzc;
            case 5:
                zzamp<zzwj> zzamp = zzd;
                if (zzamp == null) {
                    synchronized (zzwj.class) {
                        try {
                            zzamp = zzd;
                            if (zzamp == null) {
                                zzamp = new zzaky.zzc<>(zzc);
                                zzd = zzamp;
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
                return zzamp;
            case zzaky.zzf.zzf:
                return (byte) 1;
            default:
                throw null;
        }
    }
}
