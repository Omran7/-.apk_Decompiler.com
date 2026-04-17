package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzaky;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzwp  reason: invalid package */
public final class zzwp extends zzaky<zzwp, zza> implements zzame {
    /* access modifiers changed from: private */
    public static final zzwp zzc;
    private static volatile zzamp<zzwp> zzd;
    private int zze;
    /* access modifiers changed from: private */
    public int zzf;
    private zzwj zzg;
    private zzajp zzh = zzajp.zza;

    /* renamed from: com.google.android.gms.internal.firebase-auth-api.zzwp$zza */
    public static final class zza extends zzaky.zza<zzwp, zza> implements zzame {
        public final zza zza(zzwj zzwj) {
            zzh();
            zzwp.zza((zzwp) this.zza, zzwj);
            return this;
        }

        private zza() {
            super(zzwp.zzc);
        }

        public final zza zza(zzajp zzajp) {
            zzh();
            zzwp.zza((zzwp) this.zza, zzajp);
            return this;
        }

        public final zza zza(int i2) {
            zzh();
            ((zzwp) this.zza).zzf = 0;
            return this;
        }
    }

    static {
        zzwp zzwp = new zzwp();
        zzc = zzwp;
        zzaky.zza(zzwp.class, zzwp);
    }

    private zzwp() {
    }

    public static zzamp<zzwp> d_() {
        return (zzamp) zzc.zza(zzaky.zzf.zzg, (Object) null, (Object) null);
    }

    public static zza zzc() {
        return (zza) zzc.zzm();
    }

    public static zzwp zze() {
        return zzc;
    }

    public final int zza() {
        return this.zzf;
    }

    public final zzwj zzb() {
        zzwj zzwj = this.zzg;
        if (zzwj == null) {
            return zzwj.zzf();
        }
        return zzwj;
    }

    public final zzajp zzf() {
        return this.zzh;
    }

    public static zzwp zza(zzajp zzajp, zzakk zzakk) {
        return (zzwp) zzaky.zza(zzc, zzajp, zzakk);
    }

    public final Object zza(int i2, Object obj, Object obj2) {
        switch (zzwo.zza[i2 - 1]) {
            case 1:
                return new zzwp();
            case 2:
                return new zza();
            case 3:
                return zzaky.zza((zzamc) zzc, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000\u0003\n", new Object[]{"zze", "zzf", "zzg", "zzh"});
            case 4:
                return zzc;
            case 5:
                zzamp<zzwp> zzamp = zzd;
                if (zzamp == null) {
                    synchronized (zzwp.class) {
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

    public static /* synthetic */ void zza(zzwp zzwp, zzwj zzwj) {
        zzwj.getClass();
        zzwp.zzg = zzwj;
        zzwp.zze |= 1;
    }

    public static /* synthetic */ void zza(zzwp zzwp, zzajp zzajp) {
        zzajp.getClass();
        zzwp.zzh = zzajp;
    }
}
