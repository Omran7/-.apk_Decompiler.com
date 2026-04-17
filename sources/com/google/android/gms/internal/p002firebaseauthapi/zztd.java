package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzaky;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zztd  reason: invalid package */
public final class zztd extends zzaky<zztd, zza> implements zzame {
    /* access modifiers changed from: private */
    public static final zztd zzc;
    private static volatile zzamp<zztd> zzd;
    private int zze;
    private zztj zzf;
    private zzvv zzg;

    /* renamed from: com.google.android.gms.internal.firebase-auth-api.zztd$zza */
    public static final class zza extends zzaky.zza<zztd, zza> implements zzame {
        public final zza zza(zztj zztj) {
            zzh();
            zztd.zza((zztd) this.zza, zztj);
            return this;
        }

        private zza() {
            super(zztd.zzc);
        }

        public final zza zza(zzvv zzvv) {
            zzh();
            zztd.zza((zztd) this.zza, zzvv);
            return this;
        }
    }

    static {
        zztd zztd = new zztd();
        zzc = zztd;
        zzaky.zza(zztd.class, zztd);
    }

    private zztd() {
    }

    public static zza zza() {
        return (zza) zzc.zzm();
    }

    public final zztj zzc() {
        zztj zztj = this.zzf;
        if (zztj == null) {
            return zztj.zzd();
        }
        return zztj;
    }

    public final zzvv zzd() {
        zzvv zzvv = this.zzg;
        if (zzvv == null) {
            return zzvv.zze();
        }
        return zzvv;
    }

    public static zztd zza(zzajp zzajp, zzakk zzakk) {
        return (zztd) zzaky.zza(zzc, zzajp, zzakk);
    }

    public final Object zza(int i2, Object obj, Object obj2) {
        switch (zztc.zza[i2 - 1]) {
            case 1:
                return new zztd();
            case 2:
                return new zza();
            case 3:
                return zzaky.zza((zzamc) zzc, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"zze", "zzf", "zzg"});
            case 4:
                return zzc;
            case 5:
                zzamp<zztd> zzamp = zzd;
                if (zzamp == null) {
                    synchronized (zztd.class) {
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

    public static /* synthetic */ void zza(zztd zztd, zztj zztj) {
        zztj.getClass();
        zztd.zzf = zztj;
        zztd.zze |= 1;
    }

    public static /* synthetic */ void zza(zztd zztd, zzvv zzvv) {
        zzvv.getClass();
        zztd.zzg = zzvv;
        zztd.zze |= 2;
    }
}
