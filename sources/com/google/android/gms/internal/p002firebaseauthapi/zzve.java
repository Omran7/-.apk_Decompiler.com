package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzaky;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzve  reason: invalid package */
public final class zzve extends zzaky<zzve, zza> implements zzame {
    /* access modifiers changed from: private */
    public static final zzve zzc;
    private static volatile zzamp<zzve> zzd;
    private int zze;
    /* access modifiers changed from: private */
    public int zzf;
    private zzvh zzg;
    private zzajp zzh = zzajp.zza;

    /* renamed from: com.google.android.gms.internal.firebase-auth-api.zzve$zza */
    public static final class zza extends zzaky.zza<zzve, zza> implements zzame {
        public final zza zza(zzajp zzajp) {
            zzh();
            zzve.zza((zzve) this.zza, zzajp);
            return this;
        }

        private zza() {
            super(zzve.zzc);
        }

        public final zza zza(zzvh zzvh) {
            zzh();
            zzve.zza((zzve) this.zza, zzvh);
            return this;
        }

        public final zza zza(int i2) {
            zzh();
            ((zzve) this.zza).zzf = 0;
            return this;
        }
    }

    static {
        zzve zzve = new zzve();
        zzc = zzve;
        zzaky.zza(zzve.class, zzve);
    }

    private zzve() {
    }

    public static zza zzb() {
        return (zza) zzc.zzm();
    }

    public static zzamp<zzve> zzf() {
        return (zzamp) zzc.zza(zzaky.zzf.zzg, (Object) null, (Object) null);
    }

    public final int zza() {
        return this.zzf;
    }

    public final zzvh zzd() {
        zzvh zzvh = this.zzg;
        if (zzvh == null) {
            return zzvh.zze();
        }
        return zzvh;
    }

    public final zzajp zze() {
        return this.zzh;
    }

    public static zzve zza(zzajp zzajp, zzakk zzakk) {
        return (zzve) zzaky.zza(zzc, zzajp, zzakk);
    }

    public final Object zza(int i2, Object obj, Object obj2) {
        switch (zzvg.zza[i2 - 1]) {
            case 1:
                return new zzve();
            case 2:
                return new zza();
            case 3:
                return zzaky.zza((zzamc) zzc, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000\u0003\n", new Object[]{"zze", "zzf", "zzg", "zzh"});
            case 4:
                return zzc;
            case 5:
                zzamp<zzve> zzamp = zzd;
                if (zzamp == null) {
                    synchronized (zzve.class) {
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

    public static /* synthetic */ void zza(zzve zzve, zzajp zzajp) {
        zzajp.getClass();
        zzve.zzh = zzajp;
    }

    public static /* synthetic */ void zza(zzve zzve, zzvh zzvh) {
        zzvh.getClass();
        zzve.zzg = zzvh;
        zzve.zze |= 1;
    }
}
