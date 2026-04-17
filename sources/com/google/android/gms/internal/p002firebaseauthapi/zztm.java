package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzaky;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zztm  reason: invalid package */
public final class zztm extends zzaky<zztm, zza> implements zzame {
    /* access modifiers changed from: private */
    public static final zztm zzc;
    private static volatile zzamp<zztm> zzd;
    /* access modifiers changed from: private */
    public int zze;

    /* renamed from: com.google.android.gms.internal.firebase-auth-api.zztm$zza */
    public static final class zza extends zzaky.zza<zztm, zza> implements zzame {
        public final zza zza(int i2) {
            zzh();
            ((zztm) this.zza).zze = i2;
            return this;
        }

        private zza() {
            super(zztm.zzc);
        }
    }

    static {
        zztm zztm = new zztm();
        zzc = zztm;
        zzaky.zza(zztm.class, zztm);
    }

    private zztm() {
    }

    public static zza zzb() {
        return (zza) zzc.zzm();
    }

    public static zztm zzd() {
        return zzc;
    }

    public final int zza() {
        return this.zze;
    }

    public final Object zza(int i2, Object obj, Object obj2) {
        switch (zztl.zza[i2 - 1]) {
            case 1:
                return new zztm();
            case 2:
                return new zza();
            case 3:
                return zzaky.zza((zzamc) zzc, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u000b", new Object[]{"zze"});
            case 4:
                return zzc;
            case 5:
                zzamp<zztm> zzamp = zzd;
                if (zzamp == null) {
                    synchronized (zztm.class) {
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
