package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzaky;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzww  reason: invalid package */
public final class zzww extends zzaky<zzww, zza> implements zzame {
    /* access modifiers changed from: private */
    public static final zzww zzc;
    private static volatile zzamp<zzww> zzd;
    private String zze = "";
    private zzajp zzf = zzajp.zza;
    /* access modifiers changed from: private */
    public int zzg;

    /* renamed from: com.google.android.gms.internal.firebase-auth-api.zzww$zza */
    public static final class zza extends zzaky.zza<zzww, zza> implements zzame {
        public final zza zza(zzxu zzxu) {
            zzh();
            ((zzww) this.zza).zzg = zzxu.zza();
            return this;
        }

        private zza() {
            super(zzww.zzc);
        }

        public final zza zza(String str) {
            zzh();
            zzww.zza((zzww) this.zza, str);
            return this;
        }

        public final zza zza(zzajp zzajp) {
            zzh();
            zzww.zza((zzww) this.zza, zzajp);
            return this;
        }
    }

    static {
        zzww zzww = new zzww();
        zzc = zzww;
        zzaky.zza(zzww.class, zzww);
    }

    private zzww() {
    }

    public static zza zza() {
        return (zza) zzc.zzm();
    }

    public static zzww zzc() {
        return zzc;
    }

    public final zzxu zzd() {
        zzxu zza2 = zzxu.zza(this.zzg);
        if (zza2 == null) {
            return zzxu.UNRECOGNIZED;
        }
        return zza2;
    }

    public final zzajp zze() {
        return this.zzf;
    }

    public final String zzf() {
        return this.zze;
    }

    public static zza zza(zzww zzww) {
        return (zza) zzc.zzm().zza(zzww);
    }

    public static zzww zza(byte[] bArr, zzakk zzakk) {
        return (zzww) zzaky.zza(zzc, bArr, zzakk);
    }

    public final Object zza(int i2, Object obj, Object obj2) {
        switch (zzwv.zza[i2 - 1]) {
            case 1:
                return new zzww();
            case 2:
                return new zza();
            case 3:
                return zzaky.zza((zzamc) zzc, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\n\u0003\f", new Object[]{"zze", "zzf", "zzg"});
            case 4:
                return zzc;
            case 5:
                zzamp<zzww> zzamp = zzd;
                if (zzamp == null) {
                    synchronized (zzww.class) {
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

    public static /* synthetic */ void zza(zzww zzww, String str) {
        str.getClass();
        zzww.zze = str;
    }

    public static /* synthetic */ void zza(zzww zzww, zzajp zzajp) {
        zzajp.getClass();
        zzww.zzf = zzajp;
    }
}
