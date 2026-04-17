package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzaky;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zztp  reason: invalid package */
public final class zztp extends zzaky<zztp, zza> implements zzame {
    /* access modifiers changed from: private */
    public static final zztp zzc;
    private static volatile zzamp<zztp> zzd;
    private int zze;
    private int zzf;
    private zztv zzg;
    private zzajp zzh = zzajp.zza;

    /* renamed from: com.google.android.gms.internal.firebase-auth-api.zztp$zza */
    public static final class zza extends zzaky.zza<zztp, zza> implements zzame {
        public final zza zza(zzajp zzajp) {
            zzh();
            zztp.zza((zztp) this.zza, zzajp);
            return this;
        }

        private zza() {
            super(zztp.zzc);
        }

        public final zza zza(zztv zztv) {
            zzh();
            zztp.zza((zztp) this.zza, zztv);
            return this;
        }
    }

    static {
        zztp zztp = new zztp();
        zzc = zztp;
        zzaky.zza(zztp.class, zztp);
    }

    private zztp() {
    }

    public static zza zzb() {
        return (zza) zzc.zzm();
    }

    public static zzamp<zztp> zzf() {
        return (zzamp) zzc.zza(zzaky.zzf.zzg, (Object) null, (Object) null);
    }

    public final int zza() {
        return this.zzf;
    }

    public final zztv zzd() {
        zztv zztv = this.zzg;
        if (zztv == null) {
            return zztv.zzd();
        }
        return zztv;
    }

    public final zzajp zze() {
        return this.zzh;
    }

    public static zztp zza(zzajp zzajp, zzakk zzakk) {
        return (zztp) zzaky.zza(zzc, zzajp, zzakk);
    }

    public final Object zza(int i2, Object obj, Object obj2) {
        switch (zzto.zza[i2 - 1]) {
            case 1:
                return new zztp();
            case 2:
                return new zza();
            case 3:
                return zzaky.zza((zzamc) zzc, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000\u0003\n", new Object[]{"zze", "zzf", "zzg", "zzh"});
            case 4:
                return zzc;
            case 5:
                zzamp<zztp> zzamp = zzd;
                if (zzamp == null) {
                    synchronized (zztp.class) {
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

    public static /* synthetic */ void zza(zztp zztp, zzajp zzajp) {
        zzajp.getClass();
        zztp.zzh = zzajp;
    }

    public static /* synthetic */ void zza(zztp zztp, zztv zztv) {
        zztv.getClass();
        zztp.zzg = zztv;
        zztp.zze |= 1;
    }
}
