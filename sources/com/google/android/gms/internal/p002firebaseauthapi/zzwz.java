package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzaky;

@Deprecated
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzwz  reason: invalid package */
public final class zzwz extends zzaky<zzwz, zza> implements zzame {
    /* access modifiers changed from: private */
    public static final zzwz zzc;
    private static volatile zzamp<zzwz> zzd;
    private String zze = "";
    private String zzf = "";
    private int zzg;
    private boolean zzh;
    private String zzi = "";

    /* renamed from: com.google.android.gms.internal.firebase-auth-api.zzwz$zza */
    public static final class zza extends zzaky.zza<zzwz, zza> implements zzame {
        private zza() {
            super(zzwz.zzc);
        }
    }

    static {
        zzwz zzwz = new zzwz();
        zzc = zzwz;
        zzaky.zza(zzwz.class, zzwz);
    }

    private zzwz() {
    }

    public final Object zza(int i2, Object obj, Object obj2) {
        switch (zzwy.zza[i2 - 1]) {
            case 1:
                return new zzwz();
            case 2:
                return new zza();
            case 3:
                return zzaky.zza((zzamc) zzc, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003\u000b\u0004\u0007\u0005Ȉ", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi"});
            case 4:
                return zzc;
            case 5:
                zzamp<zzwz> zzamp = zzd;
                if (zzamp == null) {
                    synchronized (zzwz.class) {
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
