package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzaky;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zztv  reason: invalid package */
public final class zztv extends zzaky<zztv, zza> implements zzame {
    /* access modifiers changed from: private */
    public static final zztv zzc;
    private static volatile zzamp<zztv> zzd;
    /* access modifiers changed from: private */
    public int zze;

    /* renamed from: com.google.android.gms.internal.firebase-auth-api.zztv$zza */
    public static final class zza extends zzaky.zza<zztv, zza> implements zzame {
        public final zza zza(int i2) {
            zzh();
            ((zztv) this.zza).zze = i2;
            return this;
        }

        private zza() {
            super(zztv.zzc);
        }
    }

    static {
        zztv zztv = new zztv();
        zzc = zztv;
        zzaky.zza(zztv.class, zztv);
    }

    private zztv() {
    }

    public static zza zzb() {
        return (zza) zzc.zzm();
    }

    public static zztv zzd() {
        return zzc;
    }

    public final int zza() {
        return this.zze;
    }

    public final Object zza(int i2, Object obj, Object obj2) {
        switch (zztu.zza[i2 - 1]) {
            case 1:
                return new zztv();
            case 2:
                return new zza();
            case 3:
                return zzaky.zza((zzamc) zzc, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u000b", new Object[]{"zze"});
            case 4:
                return zzc;
            case 5:
                zzamp<zztv> zzamp = zzd;
                if (zzamp == null) {
                    synchronized (zztv.class) {
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
}
