package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzaky;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzxf  reason: invalid package */
public final class zzxf extends zzaky<zzxf, zzb> implements zzame {
    /* access modifiers changed from: private */
    public static final zzxf zzc;
    private static volatile zzamp<zzxf> zzd;
    /* access modifiers changed from: private */
    public int zze;
    private zzalc<zza> zzf = zzaky.zzp();

    /* renamed from: com.google.android.gms.internal.firebase-auth-api.zzxf$zza */
    public static final class zza extends zzaky<zza, C0001zza> implements zzame {
        /* access modifiers changed from: private */
        public static final zza zzc;
        private static volatile zzamp<zza> zzd;
        private String zze = "";
        /* access modifiers changed from: private */
        public int zzf;
        /* access modifiers changed from: private */
        public int zzg;
        /* access modifiers changed from: private */
        public int zzh;

        /* renamed from: com.google.android.gms.internal.firebase-auth-api.zzxf$zza$zza  reason: collision with other inner class name */
        public static final class C0001zza extends zzaky.zza<zza, C0001zza> implements zzame {
            public final C0001zza zza(int i2) {
                zzh();
                ((zza) this.zza).zzg = i2;
                return this;
            }

            private C0001zza() {
                super(zza.zzc);
            }

            public final C0001zza zza(zzxu zzxu) {
                zzh();
                ((zza) this.zza).zzh = zzxu.zza();
                return this;
            }

            public final C0001zza zza(zzwt zzwt) {
                zzh();
                ((zza) this.zza).zzf = zzwt.zza();
                return this;
            }

            public final C0001zza zza(String str) {
                zzh();
                zza.zza((zza) this.zza, str);
                return this;
            }
        }

        static {
            zza zza = new zza();
            zzc = zza;
            zzaky.zza(zza.class, zza);
        }

        private zza() {
        }

        public static C0001zza zza() {
            return (C0001zza) zzc.zzm();
        }

        public final Object zza(int i2, Object obj, Object obj2) {
            switch (zzxe.zza[i2 - 1]) {
                case 1:
                    return new zza();
                case 2:
                    return new C0001zza();
                case 3:
                    return zzaky.zza((zzamc) zzc, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȉ\u0002\f\u0003\u000b\u0004\f", new Object[]{"zze", "zzf", "zzg", "zzh"});
                case 4:
                    return zzc;
                case 5:
                    zzamp<zza> zzamp = zzd;
                    if (zzamp == null) {
                        synchronized (zza.class) {
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

        public static /* synthetic */ void zza(zza zza, String str) {
            str.getClass();
            zza.zze = str;
        }
    }

    /* renamed from: com.google.android.gms.internal.firebase-auth-api.zzxf$zzb */
    public static final class zzb extends zzaky.zza<zzxf, zzb> implements zzame {
        public final zzb zza(zza zza) {
            zzh();
            zzxf.zza((zzxf) this.zza, zza);
            return this;
        }

        private zzb() {
            super(zzxf.zzc);
        }

        public final zzb zza(int i2) {
            zzh();
            ((zzxf) this.zza).zze = i2;
            return this;
        }
    }

    static {
        zzxf zzxf = new zzxf();
        zzc = zzxf;
        zzaky.zza(zzxf.class, zzxf);
    }

    private zzxf() {
    }

    public static zzb zza() {
        return (zzb) zzc.zzm();
    }

    public final Object zza(int i2, Object obj, Object obj2) {
        switch (zzxe.zza[i2 - 1]) {
            case 1:
                return new zzxf();
            case 2:
                return new zzb();
            case 3:
                return zzaky.zza((zzamc) zzc, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u000b\u0002\u001b", new Object[]{"zze", "zzf", zza.class});
            case 4:
                return zzc;
            case 5:
                zzamp<zzxf> zzamp = zzd;
                if (zzamp == null) {
                    synchronized (zzxf.class) {
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

    public static /* synthetic */ void zza(zzxf zzxf, zza zza2) {
        zza2.getClass();
        zzalc<zza> zzalc = zzxf.zzf;
        if (!zzalc.zzc()) {
            zzxf.zzf = zzaky.zza(zzalc);
        }
        zzxf.zzf.add(zza2);
    }
}
