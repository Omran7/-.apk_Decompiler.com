package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzaky;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzub  reason: invalid package */
public final class zzub extends zzaky<zzub, zza> implements zzame {
    /* access modifiers changed from: private */
    public static final zzub zzc;
    private static volatile zzamp<zzub> zzd;
    /* access modifiers changed from: private */
    public int zze;
    private int zzf;

    /* renamed from: com.google.android.gms.internal.firebase-auth-api.zzub$zza */
    public static final class zza extends zzaky.zza<zzub, zza> implements zzame {
        public final zza zza(int i2) {
            zzh();
            ((zzub) this.zza).zze = i2;
            return this;
        }

        private zza() {
            super(zzub.zzc);
        }
    }

    static {
        zzub zzub = new zzub();
        zzc = zzub;
        zzaky.zza(zzub.class, zzub);
    }

    private zzub() {
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

    public static zzub zza(zzajp zzajp, zzakk zzakk) {
        return (zzub) zzaky.zza(zzc, zzajp, zzakk);
    }

    public final Object zza(int i2, Object obj, Object obj2) {
        switch (zzua.zza[i2 - 1]) {
            case 1:
                return new zzub();
            case 2:
                return new zza();
            case 3:
                return zzaky.zza((zzamc) zzc, "\u0000\u0002\u0000\u0000\u0002\u0003\u0002\u0000\u0000\u0000\u0002\u000b\u0003\u000b", new Object[]{"zze", "zzf"});
            case 4:
                return zzc;
            case 5:
                zzamp<zzub> zzamp = zzd;
                if (zzamp == null) {
                    synchronized (zzub.class) {
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
