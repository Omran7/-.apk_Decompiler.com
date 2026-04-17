package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzaky;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzvb  reason: invalid package */
public final class zzvb extends zzaky<zzvb, zza> implements zzame {
    /* access modifiers changed from: private */
    public static final zzvb zzc;
    private static volatile zzamp<zzvb> zzd;
    private int zze;
    private zzvk zzf;
    private zzuv zzg;
    /* access modifiers changed from: private */
    public int zzh;

    /* renamed from: com.google.android.gms.internal.firebase-auth-api.zzvb$zza */
    public static final class zza extends zzaky.zza<zzvb, zza> implements zzame {
        public final zza zza(zzuv zzuv) {
            zzh();
            zzvb.zza((zzvb) this.zza, zzuv);
            return this;
        }

        private zza() {
            super(zzvb.zzc);
        }

        public final zza zza(zzuw zzuw) {
            zzh();
            ((zzvb) this.zza).zzh = zzuw.zza();
            return this;
        }

        public final zza zza(zzvk zzvk) {
            zzh();
            zzvb.zza((zzvb) this.zza, zzvk);
            return this;
        }
    }

    static {
        zzvb zzvb = new zzvb();
        zzc = zzvb;
        zzaky.zza(zzvb.class, zzvb);
    }

    private zzvb() {
    }

    public static zza zzc() {
        return (zza) zzc.zzm();
    }

    public static zzvb zze() {
        return zzc;
    }

    public final zzuw zza() {
        zzuw zza2 = zzuw.zza(this.zzh);
        return zza2 == null ? zzuw.UNRECOGNIZED : zza2;
    }

    public final zzuv zzb() {
        zzuv zzuv = this.zzg;
        if (zzuv == null) {
            return zzuv.zzc();
        }
        return zzuv;
    }

    public final zzvk zzf() {
        zzvk zzvk = this.zzf;
        if (zzvk == null) {
            return zzvk.zzc();
        }
        return zzvk;
    }

    public final Object zza(int i2, Object obj, Object obj2) {
        switch (zzvd.zza[i2 - 1]) {
            case 1:
                return new zzvb();
            case 2:
                return new zza();
            case 3:
                return zzaky.zza((zzamc) zzc, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003\f", new Object[]{"zze", "zzf", "zzg", "zzh"});
            case 4:
                return zzc;
            case 5:
                zzamp<zzvb> zzamp = zzd;
                if (zzamp == null) {
                    synchronized (zzvb.class) {
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

    public static /* synthetic */ void zza(zzvb zzvb, zzuv zzuv) {
        zzuv.getClass();
        zzvb.zzg = zzuv;
        zzvb.zze |= 2;
    }

    public static /* synthetic */ void zza(zzvb zzvb, zzvk zzvk) {
        zzvk.getClass();
        zzvb.zzf = zzvk;
        zzvb.zze |= 1;
    }
}
