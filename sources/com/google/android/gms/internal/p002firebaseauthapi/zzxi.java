package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzaky;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzxi  reason: invalid package */
public final class zzxi extends zzaky<zzxi, zza> implements zzame {
    /* access modifiers changed from: private */
    public static final zzxi zzc;
    private static volatile zzamp<zzxi> zzd;
    private int zze;
    private int zzf;
    private zzxl zzg;

    /* renamed from: com.google.android.gms.internal.firebase-auth-api.zzxi$zza */
    public static final class zza extends zzaky.zza<zzxi, zza> implements zzame {
        public final zza zza(zzxl zzxl) {
            zzh();
            zzxi.zza((zzxi) this.zza, zzxl);
            return this;
        }

        private zza() {
            super(zzxi.zzc);
        }
    }

    static {
        zzxi zzxi = new zzxi();
        zzc = zzxi;
        zzaky.zza(zzxi.class, zzxi);
    }

    private zzxi() {
    }

    public static zza zzb() {
        return (zza) zzc.zzm();
    }

    public static zzamp<zzxi> zze() {
        return (zzamp) zzc.zza(zzaky.zzf.zzg, (Object) null, (Object) null);
    }

    public final int zza() {
        return this.zzf;
    }

    public final zzxl zzd() {
        zzxl zzxl = this.zzg;
        if (zzxl == null) {
            return zzxl.zzc();
        }
        return zzxl;
    }

    public static zzxi zza(zzajp zzajp, zzakk zzakk) {
        return (zzxi) zzaky.zza(zzc, zzajp, zzakk);
    }

    public final Object zza(int i2, Object obj, Object obj2) {
        switch (zzxh.zza[i2 - 1]) {
            case 1:
                return new zzxi();
            case 2:
                return new zza();
            case 3:
                return zzaky.zza((zzamc) zzc, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000", new Object[]{"zze", "zzf", "zzg"});
            case 4:
                return zzc;
            case 5:
                zzamp<zzxi> zzamp = zzd;
                if (zzamp == null) {
                    synchronized (zzxi.class) {
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

    public static /* synthetic */ void zza(zzxi zzxi, zzxl zzxl) {
        zzxl.getClass();
        zzxi.zzg = zzxl;
        zzxi.zze |= 1;
    }
}
