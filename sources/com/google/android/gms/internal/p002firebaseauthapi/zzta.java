package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzaky;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzta  reason: invalid package */
public final class zzta extends zzaky<zzta, zza> implements zzame {
    /* access modifiers changed from: private */
    public static final zzta zzc;
    private static volatile zzamp<zzta> zzd;
    private int zze;
    private int zzf;
    private zztg zzg;
    private zzvs zzh;

    /* renamed from: com.google.android.gms.internal.firebase-auth-api.zzta$zza */
    public static final class zza extends zzaky.zza<zzta, zza> implements zzame {
        public final zza zza(zztg zztg) {
            zzh();
            zzta.zza((zzta) this.zza, zztg);
            return this;
        }

        private zza() {
            super(zzta.zzc);
        }

        public final zza zza(zzvs zzvs) {
            zzh();
            zzta.zza((zzta) this.zza, zzvs);
            return this;
        }
    }

    static {
        zzta zzta = new zzta();
        zzc = zzta;
        zzaky.zza(zzta.class, zzta);
    }

    private zzta() {
    }

    public static zza zzb() {
        return (zza) zzc.zzm();
    }

    public static zzamp<zzta> zzf() {
        return (zzamp) zzc.zza(zzaky.zzf.zzg, (Object) null, (Object) null);
    }

    public final int zza() {
        return this.zzf;
    }

    public final zztg zzd() {
        zztg zztg = this.zzg;
        if (zztg == null) {
            return zztg.zzd();
        }
        return zztg;
    }

    public final zzvs zze() {
        zzvs zzvs = this.zzh;
        if (zzvs == null) {
            return zzvs.zzd();
        }
        return zzvs;
    }

    public static zzta zza(zzajp zzajp, zzakk zzakk) {
        return (zzta) zzaky.zza(zzc, zzajp, zzakk);
    }

    public final Object zza(int i2, Object obj, Object obj2) {
        switch (zzsz.zza[i2 - 1]) {
            case 1:
                return new zzta();
            case 2:
                return new zza();
            case 3:
                return zzaky.zza((zzamc) zzc, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000\u0003ဉ\u0001", new Object[]{"zze", "zzf", "zzg", "zzh"});
            case 4:
                return zzc;
            case 5:
                zzamp<zzta> zzamp = zzd;
                if (zzamp == null) {
                    synchronized (zzta.class) {
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

    public static /* synthetic */ void zza(zzta zzta, zztg zztg) {
        zztg.getClass();
        zzta.zzg = zztg;
        zzta.zze |= 1;
    }

    public static /* synthetic */ void zza(zzta zzta, zzvs zzvs) {
        zzvs.getClass();
        zzta.zzh = zzvs;
        zzta.zze |= 2;
    }
}
