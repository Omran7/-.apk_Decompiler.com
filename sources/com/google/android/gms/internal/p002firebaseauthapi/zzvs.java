package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzaky;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzvs  reason: invalid package */
public final class zzvs extends zzaky<zzvs, zza> implements zzame {
    /* access modifiers changed from: private */
    public static final zzvs zzc;
    private static volatile zzamp<zzvs> zzd;
    private int zze;
    private int zzf;
    private zzvy zzg;
    private zzajp zzh = zzajp.zza;

    /* renamed from: com.google.android.gms.internal.firebase-auth-api.zzvs$zza */
    public static final class zza extends zzaky.zza<zzvs, zza> implements zzame {
        public final zza zza(zzajp zzajp) {
            zzh();
            zzvs.zza((zzvs) this.zza, zzajp);
            return this;
        }

        private zza() {
            super(zzvs.zzc);
        }

        public final zza zza(zzvy zzvy) {
            zzh();
            zzvs.zza((zzvs) this.zza, zzvy);
            return this;
        }
    }

    static {
        zzvs zzvs = new zzvs();
        zzc = zzvs;
        zzaky.zza(zzvs.class, zzvs);
    }

    private zzvs() {
    }

    public static zzamp<zzvs> c_() {
        return (zzamp) zzc.zza(zzaky.zzf.zzg, (Object) null, (Object) null);
    }

    public static zza zzb() {
        return (zza) zzc.zzm();
    }

    public static zzvs zzd() {
        return zzc;
    }

    public final int zza() {
        return this.zzf;
    }

    public final zzvy zze() {
        zzvy zzvy = this.zzg;
        if (zzvy == null) {
            return zzvy.zze();
        }
        return zzvy;
    }

    public final zzajp zzf() {
        return this.zzh;
    }

    public static zzvs zza(zzajp zzajp, zzakk zzakk) {
        return (zzvs) zzaky.zza(zzc, zzajp, zzakk);
    }

    public final Object zza(int i2, Object obj, Object obj2) {
        switch (zzvu.zza[i2 - 1]) {
            case 1:
                return new zzvs();
            case 2:
                return new zza();
            case 3:
                return zzaky.zza((zzamc) zzc, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000\u0003\n", new Object[]{"zze", "zzf", "zzg", "zzh"});
            case 4:
                return zzc;
            case 5:
                zzamp<zzvs> zzamp = zzd;
                if (zzamp == null) {
                    synchronized (zzvs.class) {
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

    public static /* synthetic */ void zza(zzvs zzvs, zzajp zzajp) {
        zzajp.getClass();
        zzvs.zzh = zzajp;
    }

    public static /* synthetic */ void zza(zzvs zzvs, zzvy zzvy) {
        zzvy.getClass();
        zzvs.zzg = zzvy;
        zzvs.zze |= 1;
    }
}
