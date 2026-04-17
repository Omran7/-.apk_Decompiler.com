package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzaky;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzvk  reason: invalid package */
public final class zzvk extends zzaky<zzvk, zza> implements zzame {
    /* access modifiers changed from: private */
    public static final zzvk zzc;
    private static volatile zzamp<zzvk> zzd;
    /* access modifiers changed from: private */
    public int zze;
    /* access modifiers changed from: private */
    public int zzf;
    private zzajp zzg = zzajp.zza;

    /* renamed from: com.google.android.gms.internal.firebase-auth-api.zzvk$zza */
    public static final class zza extends zzaky.zza<zzvk, zza> implements zzame {
        public final zza zza(zzvn zzvn) {
            zzh();
            ((zzvk) this.zza).zze = zzvn.zza();
            return this;
        }

        private zza() {
            super(zzvk.zzc);
        }

        public final zza zza(zzvt zzvt) {
            zzh();
            ((zzvk) this.zza).zzf = zzvt.zza();
            return this;
        }

        public final zza zza(zzajp zzajp) {
            zzh();
            zzvk.zza((zzvk) this.zza, zzajp);
            return this;
        }
    }

    static {
        zzvk zzvk = new zzvk();
        zzc = zzvk;
        zzaky.zza(zzvk.class, zzvk);
    }

    private zzvk() {
    }

    public static zza zza() {
        return (zza) zzc.zzm();
    }

    public static zzvk zzc() {
        return zzc;
    }

    public final zzvn zzd() {
        zzvn zza2 = zzvn.zza(this.zze);
        if (zza2 == null) {
            return zzvn.UNRECOGNIZED;
        }
        return zza2;
    }

    public final zzvt zze() {
        zzvt zza2 = zzvt.zza(this.zzf);
        if (zza2 == null) {
            return zzvt.UNRECOGNIZED;
        }
        return zza2;
    }

    public final zzajp zzf() {
        return this.zzg;
    }

    public final Object zza(int i2, Object obj, Object obj2) {
        switch (zzvm.zza[i2 - 1]) {
            case 1:
                return new zzvk();
            case 2:
                return new zza();
            case 3:
                return zzaky.zza((zzamc) zzc, "\u0000\u0003\u0000\u0000\u0001\u000b\u0003\u0000\u0000\u0000\u0001\f\u0002\f\u000b\n", new Object[]{"zze", "zzf", "zzg"});
            case 4:
                return zzc;
            case 5:
                zzamp<zzvk> zzamp = zzd;
                if (zzamp == null) {
                    synchronized (zzvk.class) {
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

    public static /* synthetic */ void zza(zzvk zzvk, zzajp zzajp) {
        zzajp.getClass();
        zzvk.zzg = zzajp;
    }
}
