package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzaky;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzuk  reason: invalid package */
public final class zzuk extends zzaky<zzuk, zza> implements zzame {
    /* access modifiers changed from: private */
    public static final zzuk zzc;
    private static volatile zzamp<zzuk> zzd;
    private int zze;
    private zzajp zzf = zzajp.zza;

    /* renamed from: com.google.android.gms.internal.firebase-auth-api.zzuk$zza */
    public static final class zza extends zzaky.zza<zzuk, zza> implements zzame {
        public final zza zza(zzajp zzajp) {
            zzh();
            zzuk.zza((zzuk) this.zza, zzajp);
            return this;
        }

        private zza() {
            super(zzuk.zzc);
        }
    }

    static {
        zzuk zzuk = new zzuk();
        zzc = zzuk;
        zzaky.zza(zzuk.class, zzuk);
    }

    private zzuk() {
    }

    public static zza zzb() {
        return (zza) zzc.zzm();
    }

    public static zzamp<zzuk> zze() {
        return (zzamp) zzc.zza(zzaky.zzf.zzg, (Object) null, (Object) null);
    }

    public final int zza() {
        return this.zze;
    }

    public final zzajp zzd() {
        return this.zzf;
    }

    public static zzuk zza(zzajp zzajp, zzakk zzakk) {
        return (zzuk) zzaky.zza(zzc, zzajp, zzakk);
    }

    public final Object zza(int i2, Object obj, Object obj2) {
        switch (zzuj.zza[i2 - 1]) {
            case 1:
                return new zzuk();
            case 2:
                return new zza();
            case 3:
                return zzaky.zza((zzamc) zzc, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\n", new Object[]{"zze", "zzf"});
            case 4:
                return zzc;
            case 5:
                zzamp<zzuk> zzamp = zzd;
                if (zzamp == null) {
                    synchronized (zzuk.class) {
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

    public static /* synthetic */ void zza(zzuk zzuk, zzajp zzajp) {
        zzajp.getClass();
        zzuk.zzf = zzajp;
    }
}
