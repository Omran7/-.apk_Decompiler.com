package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzaky;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzsx  reason: invalid package */
public final class zzsx extends zzaky<zzsx, zza> implements zzame {
    /* access modifiers changed from: private */
    public static final zzsx zzc;
    private static volatile zzamp<zzsx> zzd;
    /* access modifiers changed from: private */
    public int zze;

    /* renamed from: com.google.android.gms.internal.firebase-auth-api.zzsx$zza */
    public static final class zza extends zzaky.zza<zzsx, zza> implements zzame {
        public final zza zza(int i2) {
            zzh();
            ((zzsx) this.zza).zze = i2;
            return this;
        }

        private zza() {
            super(zzsx.zzc);
        }
    }

    static {
        zzsx zzsx = new zzsx();
        zzc = zzsx;
        zzaky.zza(zzsx.class, zzsx);
    }

    private zzsx() {
    }

    public static zza zzb() {
        return (zza) zzc.zzm();
    }

    public static zzsx zzd() {
        return zzc;
    }

    public final int zza() {
        return this.zze;
    }

    public final Object zza(int i2, Object obj, Object obj2) {
        switch (zzsw.zza[i2 - 1]) {
            case 1:
                return new zzsx();
            case 2:
                return new zza();
            case 3:
                return zzaky.zza((zzamc) zzc, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u000b", new Object[]{"zze"});
            case 4:
                return zzc;
            case 5:
                zzamp<zzsx> zzamp = zzd;
                if (zzamp == null) {
                    synchronized (zzsx.class) {
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
