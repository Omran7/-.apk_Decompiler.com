package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzaky;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zztg  reason: invalid package */
public final class zztg extends zzaky<zztg, zza> implements zzame {
    /* access modifiers changed from: private */
    public static final zztg zzc;
    private static volatile zzamp<zztg> zzd;
    private int zze;
    private int zzf;
    private zztm zzg;
    private zzajp zzh = zzajp.zza;

    /* renamed from: com.google.android.gms.internal.firebase-auth-api.zztg$zza */
    public static final class zza extends zzaky.zza<zztg, zza> implements zzame {
        public final zza zza(zzajp zzajp) {
            zzh();
            zztg.zza((zztg) this.zza, zzajp);
            return this;
        }

        private zza() {
            super(zztg.zzc);
        }

        public final zza zza(zztm zztm) {
            zzh();
            zztg.zza((zztg) this.zza, zztm);
            return this;
        }
    }

    static {
        zztg zztg = new zztg();
        zzc = zztg;
        zzaky.zza(zztg.class, zztg);
    }

    private zztg() {
    }

    public static zza zzb() {
        return (zza) zzc.zzm();
    }

    public static zztg zzd() {
        return zzc;
    }

    public final int zza() {
        return this.zzf;
    }

    public final zztm zze() {
        zztm zztm = this.zzg;
        if (zztm == null) {
            return zztm.zzd();
        }
        return zztm;
    }

    public final zzajp zzf() {
        return this.zzh;
    }

    public final Object zza(int i2, Object obj, Object obj2) {
        switch (zztf.zza[i2 - 1]) {
            case 1:
                return new zztg();
            case 2:
                return new zza();
            case 3:
                return zzaky.zza((zzamc) zzc, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000\u0003\n", new Object[]{"zze", "zzf", "zzg", "zzh"});
            case 4:
                return zzc;
            case 5:
                zzamp<zztg> zzamp = zzd;
                if (zzamp == null) {
                    synchronized (zztg.class) {
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

    public static /* synthetic */ void zza(zztg zztg, zzajp zzajp) {
        zzajp.getClass();
        zztg.zzh = zzajp;
    }

    public static /* synthetic */ void zza(zztg zztg, zztm zztm) {
        zztm.getClass();
        zztg.zzg = zztm;
        zztg.zze |= 1;
    }
}
