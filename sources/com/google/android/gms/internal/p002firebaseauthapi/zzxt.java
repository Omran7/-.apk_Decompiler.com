package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzaky;

@Deprecated
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzxt  reason: invalid package */
public final class zzxt extends zzaky<zzxt, zza> implements zzame {
    /* access modifiers changed from: private */
    public static final zzxt zzc;
    private static volatile zzamp<zzxt> zzd;
    private String zze = "";
    private zzalc<zzwz> zzf = zzaky.zzp();

    /* renamed from: com.google.android.gms.internal.firebase-auth-api.zzxt$zza */
    public static final class zza extends zzaky.zza<zzxt, zza> implements zzame {
        private zza() {
            super(zzxt.zzc);
        }
    }

    static {
        zzxt zzxt = new zzxt();
        zzc = zzxt;
        zzaky.zza(zzxt.class, zzxt);
    }

    private zzxt() {
    }

    public static zzxt zzb() {
        return zzc;
    }

    public final Object zza(int i2, Object obj, Object obj2) {
        switch (zzxv.zza[i2 - 1]) {
            case 1:
                return new zzxt();
            case 2:
                return new zza();
            case 3:
                return zzaky.zza((zzamc) zzc, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001Ȉ\u0002\u001b", new Object[]{"zze", "zzf", zzwz.class});
            case 4:
                return zzc;
            case 5:
                zzamp<zzxt> zzamp = zzd;
                if (zzamp == null) {
                    synchronized (zzxt.class) {
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
