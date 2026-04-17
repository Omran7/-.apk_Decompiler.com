package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzaky;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzws  reason: invalid package */
public final class zzws extends zzaky<zzws, zzb> implements zzame {
    /* access modifiers changed from: private */
    public static final zzws zzc;
    private static volatile zzamp<zzws> zzd;
    private String zze = "";
    private zzajp zzf = zzajp.zza;
    /* access modifiers changed from: private */
    public int zzg;

    /* renamed from: com.google.android.gms.internal.firebase-auth-api.zzws$zzb */
    public static final class zzb extends zzaky.zza<zzws, zzb> implements zzame {
        public final zzb zza(zza zza) {
            zzh();
            ((zzws) this.zza).zzg = zza.zza();
            return this;
        }

        private zzb() {
            super(zzws.zzc);
        }

        public final zzb zza(String str) {
            zzh();
            zzws.zza((zzws) this.zza, str);
            return this;
        }

        public final zzb zza(zzajp zzajp) {
            zzh();
            zzws.zza((zzws) this.zza, zzajp);
            return this;
        }
    }

    static {
        zzws zzws = new zzws();
        zzc = zzws;
        zzaky.zza(zzws.class, zzws);
    }

    private zzws() {
    }

    public static zzb zza() {
        return (zzb) zzc.zzm();
    }

    public static zzws zzd() {
        return zzc;
    }

    public final zza zzb() {
        zza zza2 = zza.zza(this.zzg);
        if (zza2 == null) {
            return zza.UNRECOGNIZED;
        }
        return zza2;
    }

    public final zzajp zze() {
        return this.zzf;
    }

    public final String zzf() {
        return this.zze;
    }

    public final Object zza(int i2, Object obj, Object obj2) {
        switch (zzwr.zza[i2 - 1]) {
            case 1:
                return new zzws();
            case 2:
                return new zzb();
            case 3:
                return zzaky.zza((zzamc) zzc, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\n\u0003\f", new Object[]{"zze", "zzf", "zzg"});
            case 4:
                return zzc;
            case 5:
                zzamp<zzws> zzamp = zzd;
                if (zzamp == null) {
                    synchronized (zzws.class) {
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

    /* renamed from: com.google.android.gms.internal.firebase-auth-api.zzws$zza */
    public enum zza implements zzala {
        UNKNOWN_KEYMATERIAL(0),
        SYMMETRIC(1),
        ASYMMETRIC_PRIVATE(2),
        ASYMMETRIC_PUBLIC(3),
        REMOTE(4),
        UNRECOGNIZED(-1);
        
        private final int zzh;

        private zza(int i2) {
            this.zzh = i2;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("<");
            sb.append(zza.class.getName());
            sb.append('@');
            sb.append(Integer.toHexString(System.identityHashCode(this)));
            if (this != UNRECOGNIZED) {
                sb.append(" number=");
                sb.append(zza());
            }
            sb.append(" name=");
            sb.append(name());
            sb.append('>');
            return sb.toString();
        }

        public final int zza() {
            if (this != UNRECOGNIZED) {
                return this.zzh;
            }
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }

        public static zza zza(int i2) {
            if (i2 == 0) {
                return UNKNOWN_KEYMATERIAL;
            }
            if (i2 == 1) {
                return SYMMETRIC;
            }
            if (i2 == 2) {
                return ASYMMETRIC_PRIVATE;
            }
            if (i2 == 3) {
                return ASYMMETRIC_PUBLIC;
            }
            if (i2 != 4) {
                return null;
            }
            return REMOTE;
        }
    }

    public static /* synthetic */ void zza(zzws zzws, String str) {
        str.getClass();
        zzws.zze = str;
    }

    public static /* synthetic */ void zza(zzws zzws, zzajp zzajp) {
        zzajp.getClass();
        zzws.zzf = zzajp;
    }
}
