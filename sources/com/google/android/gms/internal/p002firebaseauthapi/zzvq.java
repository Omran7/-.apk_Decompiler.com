package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzaky;
import java.io.InputStream;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzvq  reason: invalid package */
public final class zzvq extends zzaky<zzvq, zza> implements zzame {
    /* access modifiers changed from: private */
    public static final zzvq zzc;
    private static volatile zzamp<zzvq> zzd;
    private int zze;
    private zzajp zzf = zzajp.zza;
    private zzxf zzg;

    /* renamed from: com.google.android.gms.internal.firebase-auth-api.zzvq$zza */
    public static final class zza extends zzaky.zza<zzvq, zza> implements zzame {
        public final zza zza() {
            zzh();
            zzvq.zza((zzvq) this.zza);
            return this;
        }

        private zza() {
            super(zzvq.zzc);
        }

        public final zza zza(zzajp zzajp) {
            zzh();
            zzvq.zza((zzvq) this.zza, zzajp);
            return this;
        }

        public final zza zza(zzxf zzxf) {
            zzh();
            zzvq.zza((zzvq) this.zza, zzxf);
            return this;
        }
    }

    static {
        zzvq zzvq = new zzvq();
        zzc = zzvq;
        zzaky.zza(zzvq.class, zzvq);
    }

    private zzvq() {
    }

    public static zza zza() {
        return (zza) zzc.zzm();
    }

    public final zzajp zzc() {
        return this.zzf;
    }

    public static zzvq zza(InputStream inputStream, zzakk zzakk) {
        return (zzvq) zzaky.zza(zzc, inputStream, zzakk);
    }

    public final Object zza(int i2, Object obj, Object obj2) {
        switch (zzvp.zza[i2 - 1]) {
            case 1:
                return new zzvq();
            case 2:
                return new zza();
            case 3:
                return zzaky.zza((zzamc) zzc, "\u0000\u0002\u0000\u0001\u0002\u0003\u0002\u0000\u0000\u0000\u0002\n\u0003ဉ\u0000", new Object[]{"zze", "zzf", "zzg"});
            case 4:
                return zzc;
            case 5:
                zzamp<zzvq> zzamp = zzd;
                if (zzamp == null) {
                    synchronized (zzvq.class) {
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

    public static /* synthetic */ void zza(zzvq zzvq) {
        zzvq.zzg = null;
        zzvq.zze &= -2;
    }

    public static /* synthetic */ void zza(zzvq zzvq, zzajp zzajp) {
        zzajp.getClass();
        zzvq.zzf = zzajp;
    }

    public static /* synthetic */ void zza(zzvq zzvq, zzxf zzxf) {
        zzxf.getClass();
        zzvq.zzg = zzxf;
        zzvq.zze |= 1;
    }
}
