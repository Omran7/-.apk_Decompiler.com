package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzaky;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzun  reason: invalid package */
public final class zzun extends zzaky<zzun, zza> implements zzame {
    /* access modifiers changed from: private */
    public static final zzun zzc;
    private static volatile zzamp<zzun> zzd;
    /* access modifiers changed from: private */
    public int zze;
    private int zzf;

    /* renamed from: com.google.android.gms.internal.firebase-auth-api.zzun$zza */
    public static final class zza extends zzaky.zza<zzun, zza> implements zzame {
        public final zza zza(int i2) {
            zzh();
            ((zzun) this.zza).zze = i2;
            return this;
        }

        private zza() {
            super(zzun.zzc);
        }
    }

    static {
        zzun zzun = new zzun();
        zzc = zzun;
        zzaky.zza(zzun.class, zzun);
    }

    private zzun() {
    }

    public static zza zzc() {
        return (zza) zzc.zzm();
    }

    public final int zza() {
        return this.zze;
    }

    public final int zzb() {
        return this.zzf;
    }

    public static zzun zza(zzajp zzajp, zzakk zzakk) {
        return (zzun) zzaky.zza(zzc, zzajp, zzakk);
    }

    public final Object zza(int i2, Object obj, Object obj2) {
        switch (zzum.zza[i2 - 1]) {
            case 1:
                return new zzun();
            case 2:
                return new zza();
            case 3:
                return zzaky.zza((zzamc) zzc, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\u000b", new Object[]{"zze", "zzf"});
            case 4:
                return zzc;
            case 5:
                zzamp<zzun> zzamp = zzd;
                if (zzamp == null) {
                    synchronized (zzun.class) {
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
