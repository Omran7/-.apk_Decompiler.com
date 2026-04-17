package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzaky;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzsr  reason: invalid package */
public final class zzsr extends zzaky<zzsr, zza> implements zzame {
    /* access modifiers changed from: private */
    public static final zzsr zzc;
    private static volatile zzamp<zzsr> zzd;
    private int zze;
    private int zzf;
    private zzajp zzg = zzajp.zza;
    private zzsx zzh;

    /* renamed from: com.google.android.gms.internal.firebase-auth-api.zzsr$zza */
    public static final class zza extends zzaky.zza<zzsr, zza> implements zzame {
        public final zza zza(zzajp zzajp) {
            zzh();
            zzsr.zza((zzsr) this.zza, zzajp);
            return this;
        }

        private zza() {
            super(zzsr.zzc);
        }

        public final zza zza(zzsx zzsx) {
            zzh();
            zzsr.zza((zzsr) this.zza, zzsx);
            return this;
        }
    }

    static {
        zzsr zzsr = new zzsr();
        zzc = zzsr;
        zzaky.zza(zzsr.class, zzsr);
    }

    private zzsr() {
    }

    public static zza zzb() {
        return (zza) zzc.zzm();
    }

    public static zzamp<zzsr> zzf() {
        return (zzamp) zzc.zza(zzaky.zzf.zzg, (Object) null, (Object) null);
    }

    public final int zza() {
        return this.zzf;
    }

    public final zzsx zzd() {
        zzsx zzsx = this.zzh;
        if (zzsx == null) {
            return zzsx.zzd();
        }
        return zzsx;
    }

    public final zzajp zze() {
        return this.zzg;
    }

    public static zzsr zza(zzajp zzajp, zzakk zzakk) {
        return (zzsr) zzaky.zza(zzc, zzajp, zzakk);
    }

    public final Object zza(int i2, Object obj, Object obj2) {
        switch (zzsq.zza[i2 - 1]) {
            case 1:
                return new zzsr();
            case 2:
                return new zza();
            case 3:
                return zzaky.zza((zzamc) zzc, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\n\u0003ဉ\u0000", new Object[]{"zze", "zzf", "zzg", "zzh"});
            case 4:
                return zzc;
            case 5:
                zzamp<zzsr> zzamp = zzd;
                if (zzamp == null) {
                    synchronized (zzsr.class) {
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

    public static /* synthetic */ void zza(zzsr zzsr, zzajp zzajp) {
        zzajp.getClass();
        zzsr.zzg = zzajp;
    }

    public static /* synthetic */ void zza(zzsr zzsr, zzsx zzsx) {
        zzsx.getClass();
        zzsr.zzh = zzsx;
        zzsr.zze |= 1;
    }
}
