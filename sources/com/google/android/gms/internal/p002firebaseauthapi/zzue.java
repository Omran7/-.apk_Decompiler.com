package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzaky;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzue  reason: invalid package */
public final class zzue extends zzaky<zzue, zza> implements zzame {
    /* access modifiers changed from: private */
    public static final zzue zzc;
    private static volatile zzamp<zzue> zzd;
    private int zze;
    private zzajp zzf = zzajp.zza;

    /* renamed from: com.google.android.gms.internal.firebase-auth-api.zzue$zza */
    public static final class zza extends zzaky.zza<zzue, zza> implements zzame {
        public final zza zza(zzajp zzajp) {
            zzh();
            zzue.zza((zzue) this.zza, zzajp);
            return this;
        }

        private zza() {
            super(zzue.zzc);
        }
    }

    static {
        zzue zzue = new zzue();
        zzc = zzue;
        zzaky.zza(zzue.class, zzue);
    }

    private zzue() {
    }

    public static zza zzb() {
        return (zza) zzc.zzm();
    }

    public static zzamp<zzue> zze() {
        return (zzamp) zzc.zza(zzaky.zzf.zzg, (Object) null, (Object) null);
    }

    public final int zza() {
        return this.zze;
    }

    public final zzajp zzd() {
        return this.zzf;
    }

    public static zzue zza(zzajp zzajp, zzakk zzakk) {
        return (zzue) zzaky.zza(zzc, zzajp, zzakk);
    }

    public final Object zza(int i2, Object obj, Object obj2) {
        switch (zzud.zza[i2 - 1]) {
            case 1:
                return new zzue();
            case 2:
                return new zza();
            case 3:
                return zzaky.zza((zzamc) zzc, "\u0000\u0002\u0000\u0000\u0001\u0003\u0002\u0000\u0000\u0000\u0001\u000b\u0003\n", new Object[]{"zze", "zzf"});
            case 4:
                return zzc;
            case 5:
                zzamp<zzue> zzamp = zzd;
                if (zzamp == null) {
                    synchronized (zzue.class) {
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

    public static /* synthetic */ void zza(zzue zzue, zzajp zzajp) {
        zzajp.getClass();
        zzue.zzf = zzajp;
    }
}
