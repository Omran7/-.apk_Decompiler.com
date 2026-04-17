package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzaky;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzuy  reason: invalid package */
public final class zzuy extends zzaky<zzuy, zza> implements zzame {
    /* access modifiers changed from: private */
    public static final zzuy zzc;
    private static volatile zzamp<zzuy> zzd;
    private int zze;
    private zzvb zzf;

    /* renamed from: com.google.android.gms.internal.firebase-auth-api.zzuy$zza */
    public static final class zza extends zzaky.zza<zzuy, zza> implements zzame {
        public final zza zza(zzvb zzvb) {
            zzh();
            zzuy.zza((zzuy) this.zza, zzvb);
            return this;
        }

        private zza() {
            super(zzuy.zzc);
        }
    }

    static {
        zzuy zzuy = new zzuy();
        zzc = zzuy;
        zzaky.zza(zzuy.class, zzuy);
    }

    private zzuy() {
    }

    public static zza zza() {
        return (zza) zzc.zzm();
    }

    public final zzvb zzc() {
        zzvb zzvb = this.zzf;
        if (zzvb == null) {
            return zzvb.zze();
        }
        return zzvb;
    }

    public static zzuy zza(zzajp zzajp, zzakk zzakk) {
        return (zzuy) zzaky.zza(zzc, zzajp, zzakk);
    }

    public final Object zza(int i2, Object obj, Object obj2) {
        switch (zzva.zza[i2 - 1]) {
            case 1:
                return new zzuy();
            case 2:
                return new zza();
            case 3:
                return zzaky.zza((zzamc) zzc, "\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"zze", "zzf"});
            case 4:
                return zzc;
            case 5:
                zzamp<zzuy> zzamp = zzd;
                if (zzamp == null) {
                    synchronized (zzuy.class) {
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

    public static /* synthetic */ void zza(zzuy zzuy, zzvb zzvb) {
        zzvb.getClass();
        zzuy.zzf = zzvb;
        zzuy.zze |= 1;
    }
}
