package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzaky;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzvh  reason: invalid package */
public final class zzvh extends zzaky<zzvh, zza> implements zzame {
    /* access modifiers changed from: private */
    public static final zzvh zzc;
    private static volatile zzamp<zzvh> zzd;
    private int zze;
    /* access modifiers changed from: private */
    public int zzf;
    private zzvb zzg;
    private zzajp zzh;
    private zzajp zzi;

    /* renamed from: com.google.android.gms.internal.firebase-auth-api.zzvh$zza */
    public static final class zza extends zzaky.zza<zzvh, zza> implements zzame {
        public final zza zza(zzvb zzvb) {
            zzh();
            zzvh.zza((zzvh) this.zza, zzvb);
            return this;
        }

        public final zza zzb(zzajp zzajp) {
            zzh();
            zzvh.zzb((zzvh) this.zza, zzajp);
            return this;
        }

        private zza() {
            super(zzvh.zzc);
        }

        public final zza zza(int i2) {
            zzh();
            ((zzvh) this.zza).zzf = 0;
            return this;
        }

        public final zza zza(zzajp zzajp) {
            zzh();
            zzvh.zza((zzvh) this.zza, zzajp);
            return this;
        }
    }

    static {
        zzvh zzvh = new zzvh();
        zzc = zzvh;
        zzaky.zza(zzvh.class, zzvh);
    }

    private zzvh() {
        zzajp zzajp = zzajp.zza;
        this.zzh = zzajp;
        this.zzi = zzajp;
    }

    public static zza zzc() {
        return (zza) zzc.zzm();
    }

    public static zzvh zze() {
        return zzc;
    }

    public static zzamp<zzvh> zzh() {
        return (zzamp) zzc.zza(zzaky.zzf.zzg, (Object) null, (Object) null);
    }

    public final zzajp b_() {
        return this.zzi;
    }

    public final int zza() {
        return this.zzf;
    }

    public final zzvb zzb() {
        zzvb zzvb = this.zzg;
        return zzvb == null ? zzvb.zze() : zzvb;
    }

    public final zzajp zzf() {
        return this.zzh;
    }

    public static zzvh zza(zzajp zzajp, zzakk zzakk) {
        return (zzvh) zzaky.zza(zzc, zzajp, zzakk);
    }

    public static /* synthetic */ void zzb(zzvh zzvh, zzajp zzajp) {
        zzajp.getClass();
        zzvh.zzi = zzajp;
    }

    public final Object zza(int i2, Object obj, Object obj2) {
        switch (zzvj.zza[i2 - 1]) {
            case 1:
                return new zzvh();
            case 2:
                return new zza();
            case 3:
                return zzaky.zza((zzamc) zzc, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000\u0003\n\u0004\n", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi"});
            case 4:
                return zzc;
            case 5:
                zzamp<zzvh> zzamp = zzd;
                if (zzamp == null) {
                    synchronized (zzvh.class) {
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

    public static /* synthetic */ void zza(zzvh zzvh, zzvb zzvb) {
        zzvb.getClass();
        zzvh.zzg = zzvb;
        zzvh.zze |= 1;
    }

    public static /* synthetic */ void zza(zzvh zzvh, zzajp zzajp) {
        zzajp.getClass();
        zzvh.zzh = zzajp;
    }
}
