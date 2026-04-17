package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzaky;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzyi  reason: invalid package */
public final class zzyi extends zzaky<zzyi, zza> implements zzame {
    /* access modifiers changed from: private */
    public static final zzyi zzc;
    private static volatile zzamp<zzyi> zzd;
    private int zze;

    /* renamed from: com.google.android.gms.internal.firebase-auth-api.zzyi$zza */
    public static final class zza extends zzaky.zza<zzyi, zza> implements zzame {
        private zza() {
            super(zzyi.zzc);
        }
    }

    static {
        zzyi zzyi = new zzyi();
        zzc = zzyi;
        zzaky.zza(zzyi.class, zzyi);
    }

    private zzyi() {
    }

    public static zzyi zzc() {
        return zzc;
    }

    public final int zza() {
        return this.zze;
    }

    public static zzyi zza(zzajp zzajp, zzakk zzakk) {
        return (zzyi) zzaky.zza(zzc, zzajp, zzakk);
    }

    public final Object zza(int i2, Object obj, Object obj2) {
        switch (zzyk.zza[i2 - 1]) {
            case 1:
                return new zzyi();
            case 2:
                return new zza();
            case 3:
                return zzaky.zza((zzamc) zzc, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u000b", new Object[]{"zze"});
            case 4:
                return zzc;
            case 5:
                zzamp<zzyi> zzamp = zzd;
                if (zzamp == null) {
                    synchronized (zzyi.class) {
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
