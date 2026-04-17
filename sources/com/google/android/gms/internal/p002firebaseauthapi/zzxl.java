package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzaky;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzxl  reason: invalid package */
public final class zzxl extends zzaky<zzxl, zza> implements zzame {
    /* access modifiers changed from: private */
    public static final zzxl zzc;
    private static volatile zzamp<zzxl> zzd;
    private String zze = "";

    /* renamed from: com.google.android.gms.internal.firebase-auth-api.zzxl$zza */
    public static final class zza extends zzaky.zza<zzxl, zza> implements zzame {
        public final zza zza(String str) {
            zzh();
            zzxl.zza((zzxl) this.zza, str);
            return this;
        }

        private zza() {
            super(zzxl.zzc);
        }
    }

    static {
        zzxl zzxl = new zzxl();
        zzc = zzxl;
        zzaky.zza(zzxl.class, zzxl);
    }

    private zzxl() {
    }

    public static zza zza() {
        return (zza) zzc.zzm();
    }

    public static zzxl zzc() {
        return zzc;
    }

    public final String zzd() {
        return this.zze;
    }

    public static zzxl zza(zzajp zzajp, zzakk zzakk) {
        return (zzxl) zzaky.zza(zzc, zzajp, zzakk);
    }

    public final Object zza(int i2, Object obj, Object obj2) {
        switch (zzxk.zza[i2 - 1]) {
            case 1:
                return new zzxl();
            case 2:
                return new zza();
            case 3:
                return zzaky.zza((zzamc) zzc, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"zze"});
            case 4:
                return zzc;
            case 5:
                zzamp<zzxl> zzamp = zzd;
                if (zzamp == null) {
                    synchronized (zzxl.class) {
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

    public static /* synthetic */ void zza(zzxl zzxl, String str) {
        str.getClass();
        zzxl.zze = str;
    }
}
