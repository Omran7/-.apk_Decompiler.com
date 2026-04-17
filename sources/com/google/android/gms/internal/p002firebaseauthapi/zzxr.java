package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzaky;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzxr  reason: invalid package */
public final class zzxr extends zzaky<zzxr, zza> implements zzame {
    /* access modifiers changed from: private */
    public static final zzxr zzc;
    private static volatile zzamp<zzxr> zzd;
    private int zze;
    private String zzf = "";
    private zzww zzg;

    /* renamed from: com.google.android.gms.internal.firebase-auth-api.zzxr$zza */
    public static final class zza extends zzaky.zza<zzxr, zza> implements zzame {
        public final zza zza(zzww zzww) {
            zzh();
            zzxr.zza((zzxr) this.zza, zzww);
            return this;
        }

        private zza() {
            super(zzxr.zzc);
        }

        public final zza zza(String str) {
            zzh();
            zzxr.zza((zzxr) this.zza, str);
            return this;
        }
    }

    static {
        zzxr zzxr = new zzxr();
        zzc = zzxr;
        zzaky.zza(zzxr.class, zzxr);
    }

    private zzxr() {
    }

    public static zza zzb() {
        return (zza) zzc.zzm();
    }

    public static zzxr zzd() {
        return zzc;
    }

    public final zzww zza() {
        zzww zzww = this.zzg;
        return zzww == null ? zzww.zzc() : zzww;
    }

    public final String zze() {
        return this.zzf;
    }

    public static zzxr zza(zzajp zzajp, zzakk zzakk) {
        return (zzxr) zzaky.zza(zzc, zzajp, zzakk);
    }

    public final Object zza(int i2, Object obj, Object obj2) {
        switch (zzxq.zza[i2 - 1]) {
            case 1:
                return new zzxr();
            case 2:
                return new zza();
            case 3:
                return zzaky.zza((zzamc) zzc, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002ဉ\u0000", new Object[]{"zze", "zzf", "zzg"});
            case 4:
                return zzc;
            case 5:
                zzamp<zzxr> zzamp = zzd;
                if (zzamp == null) {
                    synchronized (zzxr.class) {
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

    public static /* synthetic */ void zza(zzxr zzxr, zzww zzww) {
        zzww.getClass();
        zzxr.zzg = zzww;
        zzxr.zze |= 1;
    }

    public static /* synthetic */ void zza(zzxr zzxr, String str) {
        str.getClass();
        zzxr.zzf = str;
    }
}
