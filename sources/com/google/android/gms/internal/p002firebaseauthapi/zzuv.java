package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzaky;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzuv  reason: invalid package */
public final class zzuv extends zzaky<zzuv, zza> implements zzame {
    /* access modifiers changed from: private */
    public static final zzuv zzc;
    private static volatile zzamp<zzuv> zzd;
    private int zze;
    private zzww zzf;

    /* renamed from: com.google.android.gms.internal.firebase-auth-api.zzuv$zza */
    public static final class zza extends zzaky.zza<zzuv, zza> implements zzame {
        public final zza zza(zzww zzww) {
            zzh();
            zzuv.zza((zzuv) this.zza, zzww);
            return this;
        }

        private zza() {
            super(zzuv.zzc);
        }
    }

    static {
        zzuv zzuv = new zzuv();
        zzc = zzuv;
        zzaky.zza(zzuv.class, zzuv);
    }

    private zzuv() {
    }

    public static zza zza() {
        return (zza) zzc.zzm();
    }

    public static zzuv zzc() {
        return zzc;
    }

    public final zzww zzd() {
        zzww zzww = this.zzf;
        if (zzww == null) {
            return zzww.zzc();
        }
        return zzww;
    }

    public final Object zza(int i2, Object obj, Object obj2) {
        switch (zzux.zza[i2 - 1]) {
            case 1:
                return new zzuv();
            case 2:
                return new zza();
            case 3:
                return zzaky.zza((zzamc) zzc, "\u0000\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0000\u0002ဉ\u0000", new Object[]{"zze", "zzf"});
            case 4:
                return zzc;
            case 5:
                zzamp<zzuv> zzamp = zzd;
                if (zzamp == null) {
                    synchronized (zzuv.class) {
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

    public static /* synthetic */ void zza(zzuv zzuv, zzww zzww) {
        zzww.getClass();
        zzuv.zzf = zzww;
        zzuv.zze |= 1;
    }
}
