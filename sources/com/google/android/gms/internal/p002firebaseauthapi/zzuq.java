package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzaky;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzuq  reason: invalid package */
public final class zzuq extends zzaky<zzuq, zza> implements zzame {
    /* access modifiers changed from: private */
    public static final zzuq zzc;
    private static volatile zzamp<zzuq> zzd;
    private int zze;
    private zzajp zzf = zzajp.zza;

    /* renamed from: com.google.android.gms.internal.firebase-auth-api.zzuq$zza */
    public static final class zza extends zzaky.zza<zzuq, zza> implements zzame {
        public final zza zza(zzajp zzajp) {
            zzh();
            zzuq.zza((zzuq) this.zza, zzajp);
            return this;
        }

        private zza() {
            super(zzuq.zzc);
        }
    }

    static {
        zzuq zzuq = new zzuq();
        zzc = zzuq;
        zzaky.zza(zzuq.class, zzuq);
    }

    private zzuq() {
    }

    public static zza zzb() {
        return (zza) zzc.zzm();
    }

    public static zzamp<zzuq> zze() {
        return (zzamp) zzc.zza(zzaky.zzf.zzg, (Object) null, (Object) null);
    }

    public final int zza() {
        return this.zze;
    }

    public final zzajp zzd() {
        return this.zzf;
    }

    public static zzuq zza(zzajp zzajp, zzakk zzakk) {
        return (zzuq) zzaky.zza(zzc, zzajp, zzakk);
    }

    public final Object zza(int i2, Object obj, Object obj2) {
        switch (zzup.zza[i2 - 1]) {
            case 1:
                return new zzuq();
            case 2:
                return new zza();
            case 3:
                return zzaky.zza((zzamc) zzc, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\n", new Object[]{"zze", "zzf"});
            case 4:
                return zzc;
            case 5:
                zzamp<zzuq> zzamp = zzd;
                if (zzamp == null) {
                    synchronized (zzuq.class) {
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

    public static /* synthetic */ void zza(zzuq zzuq, zzajp zzajp) {
        zzajp.getClass();
        zzuq.zzf = zzajp;
    }
}
