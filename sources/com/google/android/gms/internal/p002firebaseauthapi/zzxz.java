package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzaky;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzxz  reason: invalid package */
public final class zzxz extends zzaky<zzxz, zza> implements zzame {
    /* access modifiers changed from: private */
    public static final zzxz zzc;
    private static volatile zzamp<zzxz> zzd;
    private int zze;
    private int zzf;
    private zzyc zzg;

    /* renamed from: com.google.android.gms.internal.firebase-auth-api.zzxz$zza */
    public static final class zza extends zzaky.zza<zzxz, zza> implements zzame {
        public final zza zza(zzyc zzyc) {
            zzh();
            zzxz.zza((zzxz) this.zza, zzyc);
            return this;
        }

        private zza() {
            super(zzxz.zzc);
        }
    }

    static {
        zzxz zzxz = new zzxz();
        zzc = zzxz;
        zzaky.zza(zzxz.class, zzxz);
    }

    private zzxz() {
    }

    public static zza zzb() {
        return (zza) zzc.zzm();
    }

    public final int zza() {
        return this.zzf;
    }

    public final zzyc zzd() {
        zzyc zzyc = this.zzg;
        if (zzyc == null) {
            return zzyc.zzd();
        }
        return zzyc;
    }

    public static zzxz zza(zzajp zzajp, zzakk zzakk) {
        return (zzxz) zzaky.zza(zzc, zzajp, zzakk);
    }

    public final Object zza(int i2, Object obj, Object obj2) {
        switch (zzyb.zza[i2 - 1]) {
            case 1:
                return new zzxz();
            case 2:
                return new zza();
            case 3:
                return zzaky.zza((zzamc) zzc, "\u0000\u0002\u0000\u0001\u0001\u0003\u0002\u0000\u0000\u0000\u0001\u000b\u0003ဉ\u0000", new Object[]{"zze", "zzf", "zzg"});
            case 4:
                return zzc;
            case 5:
                zzamp<zzxz> zzamp = zzd;
                if (zzamp == null) {
                    synchronized (zzxz.class) {
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

    public static /* synthetic */ void zza(zzxz zzxz, zzyc zzyc) {
        zzyc.getClass();
        zzxz.zzg = zzyc;
        zzxz.zze |= 1;
    }
}
