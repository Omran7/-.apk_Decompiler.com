package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzaky;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzts  reason: invalid package */
public final class zzts extends zzaky<zzts, zza> implements zzame {
    /* access modifiers changed from: private */
    public static final zzts zzc;
    private static volatile zzamp<zzts> zzd;
    private int zze;
    private zztv zzf;
    /* access modifiers changed from: private */
    public int zzg;

    /* renamed from: com.google.android.gms.internal.firebase-auth-api.zzts$zza */
    public static final class zza extends zzaky.zza<zzts, zza> implements zzame {
        public final zza zza(int i2) {
            zzh();
            ((zzts) this.zza).zzg = i2;
            return this;
        }

        private zza() {
            super(zzts.zzc);
        }

        public final zza zza(zztv zztv) {
            zzh();
            zzts.zza((zzts) this.zza, zztv);
            return this;
        }
    }

    static {
        zzts zzts = new zzts();
        zzc = zzts;
        zzaky.zza(zzts.class, zzts);
    }

    private zzts() {
    }

    public static zza zzb() {
        return (zza) zzc.zzm();
    }

    public final int zza() {
        return this.zzg;
    }

    public final zztv zzd() {
        zztv zztv = this.zzf;
        if (zztv == null) {
            return zztv.zzd();
        }
        return zztv;
    }

    public static zzts zza(zzajp zzajp, zzakk zzakk) {
        return (zzts) zzaky.zza(zzc, zzajp, zzakk);
    }

    public final Object zza(int i2, Object obj, Object obj2) {
        switch (zztr.zza[i2 - 1]) {
            case 1:
                return new zzts();
            case 2:
                return new zza();
            case 3:
                return zzaky.zza((zzamc) zzc, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002\u000b", new Object[]{"zze", "zzf", "zzg"});
            case 4:
                return zzc;
            case 5:
                zzamp<zzts> zzamp = zzd;
                if (zzamp == null) {
                    synchronized (zzts.class) {
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

    public static /* synthetic */ void zza(zzts zzts, zztv zztv) {
        zztv.getClass();
        zzts.zzf = zztv;
        zzts.zze |= 1;
    }
}
