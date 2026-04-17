package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzaky;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzani  reason: invalid package */
public final class zzani extends zzaky<zzani, zza> implements zzame {
    /* access modifiers changed from: private */
    public static final zzani zzc;
    private static volatile zzamp<zzani> zzd;
    /* access modifiers changed from: private */
    public long zze;
    /* access modifiers changed from: private */
    public int zzf;

    /* renamed from: com.google.android.gms.internal.firebase-auth-api.zzani$zza */
    public static final class zza extends zzaky.zza<zzani, zza> implements zzame {
        public final zza zza(int i2) {
            if (!this.zza.zzu()) {
                zzi();
            }
            ((zzani) this.zza).zzf = i2;
            return this;
        }

        private zza() {
            super(zzani.zzc);
        }

        public final zza zza(long j6) {
            if (!this.zza.zzu()) {
                zzi();
            }
            ((zzani) this.zza).zze = j6;
            return this;
        }
    }

    static {
        zzani zzani = new zzani();
        zzc = zzani;
        zzaky.zza(zzani.class, zzani);
    }

    private zzani() {
    }

    public static zza zzc() {
        return (zza) zzc.zzm();
    }

    public final int zza() {
        return this.zzf;
    }

    public final long zzb() {
        return this.zze;
    }

    public final Object zza(int i2, Object obj, Object obj2) {
        switch (zzank.zza[i2 - 1]) {
            case 1:
                return new zzani();
            case 2:
                return new zza();
            case 3:
                return zzaky.zza((zzamc) zzc, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0002\u0002\u0004", new Object[]{"zze", "zzf"});
            case 4:
                return zzc;
            case 5:
                zzamp<zzani> zzamp = zzd;
                if (zzamp == null) {
                    synchronized (zzani.class) {
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
