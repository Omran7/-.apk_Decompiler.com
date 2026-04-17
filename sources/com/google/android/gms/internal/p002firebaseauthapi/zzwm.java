package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzaky;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzwm  reason: invalid package */
public final class zzwm extends zzaky<zzwm, zza> implements zzame {
    /* access modifiers changed from: private */
    public static final zzwm zzc;
    private static volatile zzamp<zzwm> zzd;
    private int zze;
    /* access modifiers changed from: private */
    public int zzf;
    private zzwp zzg;
    private zzajp zzh = zzajp.zza;

    /* renamed from: com.google.android.gms.internal.firebase-auth-api.zzwm$zza */
    public static final class zza extends zzaky.zza<zzwm, zza> implements zzame {
        public final zza zza(zzajp zzajp) {
            zzh();
            zzwm.zza((zzwm) this.zza, zzajp);
            return this;
        }

        private zza() {
            super(zzwm.zzc);
        }

        public final zza zza(zzwp zzwp) {
            zzh();
            zzwm.zza((zzwm) this.zza, zzwp);
            return this;
        }

        public final zza zza(int i2) {
            zzh();
            ((zzwm) this.zza).zzf = 0;
            return this;
        }
    }

    static {
        zzwm zzwm = new zzwm();
        zzc = zzwm;
        zzaky.zza(zzwm.class, zzwm);
    }

    private zzwm() {
    }

    public static zza zzb() {
        return (zza) zzc.zzm();
    }

    public static zzamp<zzwm> zzf() {
        return (zzamp) zzc.zza(zzaky.zzf.zzg, (Object) null, (Object) null);
    }

    public final int zza() {
        return this.zzf;
    }

    public final zzwp zzd() {
        zzwp zzwp = this.zzg;
        if (zzwp == null) {
            return zzwp.zze();
        }
        return zzwp;
    }

    public final zzajp zze() {
        return this.zzh;
    }

    public static zzwm zza(zzajp zzajp, zzakk zzakk) {
        return (zzwm) zzaky.zza(zzc, zzajp, zzakk);
    }

    public final Object zza(int i2, Object obj, Object obj2) {
        switch (zzwl.zza[i2 - 1]) {
            case 1:
                return new zzwm();
            case 2:
                return new zza();
            case 3:
                return zzaky.zza((zzamc) zzc, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000\u0003\n", new Object[]{"zze", "zzf", "zzg", "zzh"});
            case 4:
                return zzc;
            case 5:
                zzamp<zzwm> zzamp = zzd;
                if (zzamp == null) {
                    synchronized (zzwm.class) {
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

    public static /* synthetic */ void zza(zzwm zzwm, zzajp zzajp) {
        zzajp.getClass();
        zzwm.zzh = zzajp;
    }

    public static /* synthetic */ void zza(zzwm zzwm, zzwp zzwp) {
        zzwp.getClass();
        zzwm.zzg = zzwp;
        zzwm.zze |= 1;
    }
}
