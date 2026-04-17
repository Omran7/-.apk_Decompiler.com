package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzaky;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzxo  reason: invalid package */
public final class zzxo extends zzaky<zzxo, zza> implements zzame {
    /* access modifiers changed from: private */
    public static final zzxo zzc;
    private static volatile zzamp<zzxo> zzd;
    private int zze;
    private int zzf;
    private zzxr zzg;

    /* renamed from: com.google.android.gms.internal.firebase-auth-api.zzxo$zza */
    public static final class zza extends zzaky.zza<zzxo, zza> implements zzame {
        public final zza zza(zzxr zzxr) {
            zzh();
            zzxo.zza((zzxo) this.zza, zzxr);
            return this;
        }

        private zza() {
            super(zzxo.zzc);
        }
    }

    static {
        zzxo zzxo = new zzxo();
        zzc = zzxo;
        zzaky.zza(zzxo.class, zzxo);
    }

    private zzxo() {
    }

    public static zza zzb() {
        return (zza) zzc.zzm();
    }

    public static zzamp<zzxo> zze() {
        return (zzamp) zzc.zza(zzaky.zzf.zzg, (Object) null, (Object) null);
    }

    public final int zza() {
        return this.zzf;
    }

    public final zzxr zzd() {
        zzxr zzxr = this.zzg;
        if (zzxr == null) {
            return zzxr.zzd();
        }
        return zzxr;
    }

    public static zzxo zza(zzajp zzajp, zzakk zzakk) {
        return (zzxo) zzaky.zza(zzc, zzajp, zzakk);
    }

    public final Object zza(int i2, Object obj, Object obj2) {
        switch (zzxn.zza[i2 - 1]) {
            case 1:
                return new zzxo();
            case 2:
                return new zza();
            case 3:
                return zzaky.zza((zzamc) zzc, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000", new Object[]{"zze", "zzf", "zzg"});
            case 4:
                return zzc;
            case 5:
                zzamp<zzxo> zzamp = zzd;
                if (zzamp == null) {
                    synchronized (zzxo.class) {
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

    public static /* synthetic */ void zza(zzxo zzxo, zzxr zzxr) {
        zzxr.getClass();
        zzxo.zzg = zzxr;
        zzxo.zze |= 1;
    }
}
