package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzaky;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzut  reason: invalid package */
public final class zzut extends zzaky<zzut, zza> implements zzame {
    /* access modifiers changed from: private */
    public static final zzut zzc;
    private static volatile zzamp<zzut> zzd;

    /* renamed from: com.google.android.gms.internal.firebase-auth-api.zzut$zza */
    public static final class zza extends zzaky.zza<zzut, zza> implements zzame {
        private zza() {
            super(zzut.zzc);
        }
    }

    static {
        zzut zzut = new zzut();
        zzc = zzut;
        zzaky.zza(zzut.class, zzut);
    }

    private zzut() {
    }

    public static zzut zzb() {
        return zzc;
    }

    public static zzut zza(zzajp zzajp, zzakk zzakk) {
        return (zzut) zzaky.zza(zzc, zzajp, zzakk);
    }

    public final Object zza(int i2, Object obj, Object obj2) {
        switch (zzus.zza[i2 - 1]) {
            case 1:
                return new zzut();
            case 2:
                return new zza();
            case 3:
                return zzaky.zza((zzamc) zzc, "\u0000\u0000", (Object[]) null);
            case 4:
                return zzc;
            case 5:
                zzamp<zzut> zzamp = zzd;
                if (zzamp == null) {
                    synchronized (zzut.class) {
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
