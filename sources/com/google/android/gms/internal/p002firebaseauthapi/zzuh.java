package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzaky;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzuh  reason: invalid package */
public final class zzuh extends zzaky<zzuh, zza> implements zzame {
    /* access modifiers changed from: private */
    public static final zzuh zzc;
    private static volatile zzamp<zzuh> zzd;
    /* access modifiers changed from: private */
    public int zze;
    private int zzf;

    /* renamed from: com.google.android.gms.internal.firebase-auth-api.zzuh$zza */
    public static final class zza extends zzaky.zza<zzuh, zza> implements zzame {
        public final zza zza(int i2) {
            zzh();
            ((zzuh) this.zza).zze = i2;
            return this;
        }

        private zza() {
            super(zzuh.zzc);
        }
    }

    static {
        zzuh zzuh = new zzuh();
        zzc = zzuh;
        zzaky.zza(zzuh.class, zzuh);
    }

    private zzuh() {
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

    public static zzuh zza(zzajp zzajp, zzakk zzakk) {
        return (zzuh) zzaky.zza(zzc, zzajp, zzakk);
    }

    public final Object zza(int i2, Object obj, Object obj2) {
        switch (zzug.zza[i2 - 1]) {
            case 1:
                return new zzuh();
            case 2:
                return new zza();
            case 3:
                return zzaky.zza((zzamc) zzc, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\u000b", new Object[]{"zzf", "zze"});
            case 4:
                return zzc;
            case 5:
                zzamp<zzuh> zzamp = zzd;
                if (zzamp == null) {
                    synchronized (zzuh.class) {
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
