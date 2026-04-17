package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzaky;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzvv  reason: invalid package */
public final class zzvv extends zzaky<zzvv, zza> implements zzame {
    /* access modifiers changed from: private */
    public static final zzvv zzc;
    private static volatile zzamp<zzvv> zzd;
    private int zze;
    private zzvy zzf;
    /* access modifiers changed from: private */
    public int zzg;
    private int zzh;

    /* renamed from: com.google.android.gms.internal.firebase-auth-api.zzvv$zza */
    public static final class zza extends zzaky.zza<zzvv, zza> implements zzame {
        public final zza zza(int i2) {
            zzh();
            ((zzvv) this.zza).zzg = i2;
            return this;
        }

        private zza() {
            super(zzvv.zzc);
        }

        public final zza zza(zzvy zzvy) {
            zzh();
            zzvv.zza((zzvv) this.zza, zzvy);
            return this;
        }
    }

    static {
        zzvv zzvv = new zzvv();
        zzc = zzvv;
        zzaky.zza(zzvv.class, zzvv);
    }

    private zzvv() {
    }

    public static zza zzc() {
        return (zza) zzc.zzm();
    }

    public static zzvv zze() {
        return zzc;
    }

    public final int zza() {
        return this.zzg;
    }

    public final int zzb() {
        return this.zzh;
    }

    public final zzvy zzf() {
        zzvy zzvy = this.zzf;
        if (zzvy == null) {
            return zzvy.zze();
        }
        return zzvy;
    }

    public static zzvv zza(zzajp zzajp, zzakk zzakk) {
        return (zzvv) zzaky.zza(zzc, zzajp, zzakk);
    }

    public final Object zza(int i2, Object obj, Object obj2) {
        switch (zzvx.zza[i2 - 1]) {
            case 1:
                return new zzvv();
            case 2:
                return new zza();
            case 3:
                return zzaky.zza((zzamc) zzc, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002\u000b\u0003\u000b", new Object[]{"zze", "zzf", "zzg", "zzh"});
            case 4:
                return zzc;
            case 5:
                zzamp<zzvv> zzamp = zzd;
                if (zzamp == null) {
                    synchronized (zzvv.class) {
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

    public static /* synthetic */ void zza(zzvv zzvv, zzvy zzvy) {
        zzvy.getClass();
        zzvv.zzf = zzvy;
        zzvv.zze |= 1;
    }
}
