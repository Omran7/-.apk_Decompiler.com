package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzaky;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzvy  reason: invalid package */
public final class zzvy extends zzaky<zzvy, zza> implements zzame {
    /* access modifiers changed from: private */
    public static final zzvy zzc;
    private static volatile zzamp<zzvy> zzd;
    /* access modifiers changed from: private */
    public int zze;
    /* access modifiers changed from: private */
    public int zzf;

    /* renamed from: com.google.android.gms.internal.firebase-auth-api.zzvy$zza */
    public static final class zza extends zzaky.zza<zzvy, zza> implements zzame {
        public final zza zza(zzvt zzvt) {
            zzh();
            ((zzvy) this.zza).zze = zzvt.zza();
            return this;
        }

        private zza() {
            super(zzvy.zzc);
        }

        public final zza zza(int i2) {
            zzh();
            ((zzvy) this.zza).zzf = i2;
            return this;
        }
    }

    static {
        zzvy zzvy = new zzvy();
        zzc = zzvy;
        zzaky.zza(zzvy.class, zzvy);
    }

    private zzvy() {
    }

    public static zza zzc() {
        return (zza) zzc.zzm();
    }

    public static zzvy zze() {
        return zzc;
    }

    public final int zza() {
        return this.zzf;
    }

    public final zzvt zzb() {
        zzvt zza2 = zzvt.zza(this.zze);
        if (zza2 == null) {
            return zzvt.UNRECOGNIZED;
        }
        return zza2;
    }

    public final Object zza(int i2, Object obj, Object obj2) {
        switch (zzwa.zza[i2 - 1]) {
            case 1:
                return new zzvy();
            case 2:
                return new zza();
            case 3:
                return zzaky.zza((zzamc) zzc, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002\u000b", new Object[]{"zze", "zzf"});
            case 4:
                return zzc;
            case 5:
                zzamp<zzvy> zzamp = zzd;
                if (zzamp == null) {
                    synchronized (zzvy.class) {
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
