package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzaky;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzxw  reason: invalid package */
public final class zzxw extends zzaky<zzxw, zza> implements zzame {
    /* access modifiers changed from: private */
    public static final zzxw zzc;
    private static volatile zzamp<zzxw> zzd;
    private int zze;
    private int zzf;
    private zzyc zzg;
    private zzajp zzh = zzajp.zza;

    /* renamed from: com.google.android.gms.internal.firebase-auth-api.zzxw$zza */
    public static final class zza extends zzaky.zza<zzxw, zza> implements zzame {
        public final zza zza(zzajp zzajp) {
            zzh();
            zzxw.zza((zzxw) this.zza, zzajp);
            return this;
        }

        private zza() {
            super(zzxw.zzc);
        }

        public final zza zza(zzyc zzyc) {
            zzh();
            zzxw.zza((zzxw) this.zza, zzyc);
            return this;
        }
    }

    static {
        zzxw zzxw = new zzxw();
        zzc = zzxw;
        zzaky.zza(zzxw.class, zzxw);
    }

    private zzxw() {
    }

    public static zza zzb() {
        return (zza) zzc.zzm();
    }

    public final int zza() {
        return this.zzf;
    }

    public final zzyc zzd() {
        zzyc zzyc = this.zzg;
        if (zzyc == null) {
            return zzyc.zzd();
        }
        return zzyc;
    }

    public final zzajp zze() {
        return this.zzh;
    }

    public static zzxw zza(zzajp zzajp, zzakk zzakk) {
        return (zzxw) zzaky.zza(zzc, zzajp, zzakk);
    }

    public final Object zza(int i2, Object obj, Object obj2) {
        switch (zzxy.zza[i2 - 1]) {
            case 1:
                return new zzxw();
            case 2:
                return new zza();
            case 3:
                return zzaky.zza((zzamc) zzc, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000\u0003\n", new Object[]{"zze", "zzf", "zzg", "zzh"});
            case 4:
                return zzc;
            case 5:
                zzamp<zzxw> zzamp = zzd;
                if (zzamp == null) {
                    synchronized (zzxw.class) {
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

    public static /* synthetic */ void zza(zzxw zzxw, zzajp zzajp) {
        zzajp.getClass();
        zzxw.zzh = zzajp;
    }

    public static /* synthetic */ void zza(zzxw zzxw, zzyc zzyc) {
        zzyc.getClass();
        zzxw.zzg = zzyc;
        zzxw.zze |= 1;
    }
}
