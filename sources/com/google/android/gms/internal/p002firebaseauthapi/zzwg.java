package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzaky;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzwg  reason: invalid package */
public final class zzwg extends zzaky<zzwg, zza> implements zzame {
    /* access modifiers changed from: private */
    public static final zzwg zzc;
    private static volatile zzamp<zzwg> zzd;
    private int zze;
    private zzwj zzf;

    /* renamed from: com.google.android.gms.internal.firebase-auth-api.zzwg$zza */
    public static final class zza extends zzaky.zza<zzwg, zza> implements zzame {
        public final zza zza(zzwj zzwj) {
            zzh();
            zzwg.zza((zzwg) this.zza, zzwj);
            return this;
        }

        private zza() {
            super(zzwg.zzc);
        }
    }

    static {
        zzwg zzwg = new zzwg();
        zzc = zzwg;
        zzaky.zza(zzwg.class, zzwg);
    }

    private zzwg() {
    }

    public static zza zza() {
        return (zza) zzc.zzm();
    }

    public final zzwj zzc() {
        zzwj zzwj = this.zzf;
        if (zzwj == null) {
            return zzwj.zzf();
        }
        return zzwj;
    }

    public static zzwg zza(zzajp zzajp, zzakk zzakk) {
        return (zzwg) zzaky.zza(zzc, zzajp, zzakk);
    }

    public final Object zza(int i2, Object obj, Object obj2) {
        switch (zzwf.zza[i2 - 1]) {
            case 1:
                return new zzwg();
            case 2:
                return new zza();
            case 3:
                return zzaky.zza((zzamc) zzc, "\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"zze", "zzf"});
            case 4:
                return zzc;
            case 5:
                zzamp<zzwg> zzamp = zzd;
                if (zzamp == null) {
                    synchronized (zzwg.class) {
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

    public static /* synthetic */ void zza(zzwg zzwg, zzwj zzwj) {
        zzwj.getClass();
        zzwg.zzf = zzwj;
        zzwg.zze |= 1;
    }
}
