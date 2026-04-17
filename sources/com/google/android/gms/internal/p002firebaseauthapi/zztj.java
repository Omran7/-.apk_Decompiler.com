package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzaky;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zztj  reason: invalid package */
public final class zztj extends zzaky<zztj, zza> implements zzame {
    /* access modifiers changed from: private */
    public static final zztj zzc;
    private static volatile zzamp<zztj> zzd;
    private int zze;
    private zztm zzf;
    /* access modifiers changed from: private */
    public int zzg;

    /* renamed from: com.google.android.gms.internal.firebase-auth-api.zztj$zza */
    public static final class zza extends zzaky.zza<zztj, zza> implements zzame {
        public final zza zza(int i2) {
            zzh();
            ((zztj) this.zza).zzg = i2;
            return this;
        }

        private zza() {
            super(zztj.zzc);
        }

        public final zza zza(zztm zztm) {
            zzh();
            zztj.zza((zztj) this.zza, zztm);
            return this;
        }
    }

    static {
        zztj zztj = new zztj();
        zzc = zztj;
        zzaky.zza(zztj.class, zztj);
    }

    private zztj() {
    }

    public static zza zzb() {
        return (zza) zzc.zzm();
    }

    public static zztj zzd() {
        return zzc;
    }

    public final int zza() {
        return this.zzg;
    }

    public final zztm zze() {
        zztm zztm = this.zzf;
        if (zztm == null) {
            return zztm.zzd();
        }
        return zztm;
    }

    public final Object zza(int i2, Object obj, Object obj2) {
        switch (zzti.zza[i2 - 1]) {
            case 1:
                return new zztj();
            case 2:
                return new zza();
            case 3:
                return zzaky.zza((zzamc) zzc, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002\u000b", new Object[]{"zze", "zzf", "zzg"});
            case 4:
                return zzc;
            case 5:
                zzamp<zztj> zzamp = zzd;
                if (zzamp == null) {
                    synchronized (zztj.class) {
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

    public static /* synthetic */ void zza(zztj zztj, zztm zztm) {
        zztm.getClass();
        zztj.zzf = zztm;
        zztj.zze |= 1;
    }
}
