package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzaky;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzyf  reason: invalid package */
public final class zzyf extends zzaky<zzyf, zza> implements zzame {
    /* access modifiers changed from: private */
    public static final zzyf zzc;
    private static volatile zzamp<zzyf> zzd;
    private int zze;
    private zzajp zzf = zzajp.zza;

    /* renamed from: com.google.android.gms.internal.firebase-auth-api.zzyf$zza */
    public static final class zza extends zzaky.zza<zzyf, zza> implements zzame {
        public final zza zza(zzajp zzajp) {
            zzh();
            zzyf.zza((zzyf) this.zza, zzajp);
            return this;
        }

        private zza() {
            super(zzyf.zzc);
        }
    }

    static {
        zzyf zzyf = new zzyf();
        zzc = zzyf;
        zzaky.zza(zzyf.class, zzyf);
    }

    private zzyf() {
    }

    public static zza zzb() {
        return (zza) zzc.zzm();
    }

    public static zzamp<zzyf> zze() {
        return (zzamp) zzc.zza(zzaky.zzf.zzg, (Object) null, (Object) null);
    }

    public final int zza() {
        return this.zze;
    }

    public final zzajp zzd() {
        return this.zzf;
    }

    public static zzyf zza(zzajp zzajp, zzakk zzakk) {
        return (zzyf) zzaky.zza(zzc, zzajp, zzakk);
    }

    public final Object zza(int i2, Object obj, Object obj2) {
        switch (zzyh.zza[i2 - 1]) {
            case 1:
                return new zzyf();
            case 2:
                return new zza();
            case 3:
                return zzaky.zza((zzamc) zzc, "\u0000\u0002\u0000\u0000\u0001\u0003\u0002\u0000\u0000\u0000\u0001\u000b\u0003\n", new Object[]{"zze", "zzf"});
            case 4:
                return zzc;
            case 5:
                zzamp<zzyf> zzamp = zzd;
                if (zzamp == null) {
                    synchronized (zzyf.class) {
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

    public static /* synthetic */ void zza(zzyf zzyf, zzajp zzajp) {
        zzajp.getClass();
        zzyf.zzf = zzajp;
    }
}
