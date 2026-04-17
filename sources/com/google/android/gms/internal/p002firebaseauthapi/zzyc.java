package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzaky;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzyc  reason: invalid package */
public final class zzyc extends zzaky<zzyc, zza> implements zzame {
    /* access modifiers changed from: private */
    public static final zzyc zzc;
    private static volatile zzamp<zzyc> zzd;
    /* access modifiers changed from: private */
    public int zze;

    /* renamed from: com.google.android.gms.internal.firebase-auth-api.zzyc$zza */
    public static final class zza extends zzaky.zza<zzyc, zza> implements zzame {
        public final zza zza(int i2) {
            zzh();
            ((zzyc) this.zza).zze = i2;
            return this;
        }

        private zza() {
            super(zzyc.zzc);
        }
    }

    static {
        zzyc zzyc = new zzyc();
        zzc = zzyc;
        zzaky.zza(zzyc.class, zzyc);
    }

    private zzyc() {
    }

    public static zza zzb() {
        return (zza) zzc.zzm();
    }

    public static zzyc zzd() {
        return zzc;
    }

    public final int zza() {
        return this.zze;
    }

    public final Object zza(int i2, Object obj, Object obj2) {
        switch (zzye.zza[i2 - 1]) {
            case 1:
                return new zzyc();
            case 2:
                return new zza();
            case 3:
                return zzaky.zza((zzamc) zzc, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u000b", new Object[]{"zze"});
            case 4:
                return zzc;
            case 5:
                zzamp<zzyc> zzamp = zzd;
                if (zzamp == null) {
                    synchronized (zzyc.class) {
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
