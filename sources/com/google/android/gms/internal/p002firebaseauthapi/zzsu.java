package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzaky;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzsu  reason: invalid package */
public final class zzsu extends zzaky<zzsu, zza> implements zzame {
    /* access modifiers changed from: private */
    public static final zzsu zzc;
    private static volatile zzamp<zzsu> zzd;
    private int zze;
    /* access modifiers changed from: private */
    public int zzf;
    private zzsx zzg;

    /* renamed from: com.google.android.gms.internal.firebase-auth-api.zzsu$zza */
    public static final class zza extends zzaky.zza<zzsu, zza> implements zzame {
        public final zza zza(int i2) {
            zzh();
            ((zzsu) this.zza).zzf = i2;
            return this;
        }

        private zza() {
            super(zzsu.zzc);
        }

        public final zza zza(zzsx zzsx) {
            zzh();
            zzsu.zza((zzsu) this.zza, zzsx);
            return this;
        }
    }

    static {
        zzsu zzsu = new zzsu();
        zzc = zzsu;
        zzaky.zza(zzsu.class, zzsu);
    }

    private zzsu() {
    }

    public static zza zzb() {
        return (zza) zzc.zzm();
    }

    public final int zza() {
        return this.zzf;
    }

    public final zzsx zzd() {
        zzsx zzsx = this.zzg;
        if (zzsx == null) {
            return zzsx.zzd();
        }
        return zzsx;
    }

    public static zzsu zza(zzajp zzajp, zzakk zzakk) {
        return (zzsu) zzaky.zza(zzc, zzajp, zzakk);
    }

    public final Object zza(int i2, Object obj, Object obj2) {
        switch (zzst.zza[i2 - 1]) {
            case 1:
                return new zzsu();
            case 2:
                return new zza();
            case 3:
                return zzaky.zza((zzamc) zzc, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000", new Object[]{"zze", "zzf", "zzg"});
            case 4:
                return zzc;
            case 5:
                zzamp<zzsu> zzamp = zzd;
                if (zzamp == null) {
                    synchronized (zzsu.class) {
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

    public static /* synthetic */ void zza(zzsu zzsu, zzsx zzsx) {
        zzsx.getClass();
        zzsu.zzg = zzsx;
        zzsu.zze |= 1;
    }
}
