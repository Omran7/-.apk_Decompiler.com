package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzaky;
import com.google.android.gms.internal.p002firebaseauthapi.zzws;
import java.io.InputStream;
import java.util.List;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzxc  reason: invalid package */
public final class zzxc extends zzaky<zzxc, zzb> implements zzame {
    /* access modifiers changed from: private */
    public static final zzxc zzc;
    private static volatile zzamp<zzxc> zzd;
    /* access modifiers changed from: private */
    public int zze;
    private zzalc<zza> zzf = zzaky.zzp();

    /* renamed from: com.google.android.gms.internal.firebase-auth-api.zzxc$zza */
    public static final class zza extends zzaky<zza, C0000zza> implements zzame {
        /* access modifiers changed from: private */
        public static final zza zzc;
        private static volatile zzamp<zza> zzd;
        private int zze;
        private zzws zzf;
        /* access modifiers changed from: private */
        public int zzg;
        /* access modifiers changed from: private */
        public int zzh;
        /* access modifiers changed from: private */
        public int zzi;

        /* renamed from: com.google.android.gms.internal.firebase-auth-api.zzxc$zza$zza  reason: collision with other inner class name */
        public static final class C0000zza extends zzaky.zza<zza, C0000zza> implements zzame {
            public final C0000zza zza(zzws.zzb zzb) {
                zzh();
                zza.zza((zza) this.zza, (zzws) ((zzaky) zzb.zze()));
                return this;
            }

            private C0000zza() {
                super(zza.zzc);
            }

            public final C0000zza zza(zzws zzws) {
                zzh();
                zza.zza((zza) this.zza, zzws);
                return this;
            }

            public final C0000zza zza(int i2) {
                zzh();
                ((zza) this.zza).zzh = i2;
                return this;
            }

            public final C0000zza zza(zzxu zzxu) {
                zzh();
                ((zza) this.zza).zzi = zzxu.zza();
                return this;
            }

            public final C0000zza zza(zzwt zzwt) {
                zzh();
                ((zza) this.zza).zzg = zzwt.zza();
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

        public static C0000zza zzd() {
            return (C0000zza) zzc.zzm();
        }

        public final boolean e_() {
            if ((this.zze & 1) != 0) {
                return true;
            }
            return false;
        }

        public final int zza() {
            return this.zzh;
        }

        public final zzws zzb() {
            zzws zzws = this.zzf;
            if (zzws == null) {
                return zzws.zzd();
            }
            return zzws;
        }

        public final zzwt zzc() {
            zzwt zza = zzwt.zza(this.zzg);
            if (zza == null) {
                return zzwt.UNRECOGNIZED;
            }
            return zza;
        }

        public final zzxu zzf() {
            zzxu zza = zzxu.zza(this.zzi);
            if (zza == null) {
                return zzxu.UNRECOGNIZED;
            }
            return zza;
        }

        public final Object zza(int i2, Object obj, Object obj2) {
            switch (zzxb.zza[i2 - 1]) {
                case 1:
                    return new zza();
                case 2:
                    return new C0000zza();
                case 3:
                    return zzaky.zza((zzamc) zzc, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002\f\u0003\u000b\u0004\f", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi"});
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

        public static /* synthetic */ void zza(zza zza, zzws zzws) {
            zzws.getClass();
            zza.zzf = zzws;
            zza.zze |= 1;
        }
    }

    /* renamed from: com.google.android.gms.internal.firebase-auth-api.zzxc$zzb */
    public static final class zzb extends zzaky.zza<zzxc, zzb> implements zzame {
        public final zzb zza(zza zza) {
            zzh();
            zzxc.zza((zzxc) this.zza, zza);
            return this;
        }

        private zzb() {
            super(zzxc.zzc);
        }

        public final zzb zza(int i2) {
            zzh();
            ((zzxc) this.zza).zze = i2;
            return this;
        }
    }

    static {
        zzxc zzxc = new zzxc();
        zzc = zzxc;
        zzaky.zza(zzxc.class, zzxc);
    }

    private zzxc() {
    }

    public static zzb zzc() {
        return (zzb) zzc.zzm();
    }

    public final int zza() {
        return this.zzf.size();
    }

    public final int zzb() {
        return this.zze;
    }

    public final List<zza> zze() {
        return this.zzf;
    }

    public final zza zza(int i2) {
        return this.zzf.get(i2);
    }

    public static zzxc zza(InputStream inputStream, zzakk zzakk) {
        return (zzxc) zzaky.zza(zzc, inputStream, zzakk);
    }

    public static zzxc zza(byte[] bArr, zzakk zzakk) {
        return (zzxc) zzaky.zza(zzc, bArr, zzakk);
    }

    public final Object zza(int i2, Object obj, Object obj2) {
        switch (zzxb.zza[i2 - 1]) {
            case 1:
                return new zzxc();
            case 2:
                return new zzb();
            case 3:
                return zzaky.zza((zzamc) zzc, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u000b\u0002\u001b", new Object[]{"zze", "zzf", zza.class});
            case 4:
                return zzc;
            case 5:
                zzamp<zzxc> zzamp = zzd;
                if (zzamp == null) {
                    synchronized (zzxc.class) {
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

    public static /* synthetic */ void zza(zzxc zzxc, zza zza2) {
        zza2.getClass();
        zzalc<zza> zzalc = zzxc.zzf;
        if (!zzalc.zzc()) {
            zzxc.zzf = zzaky.zza(zzalc);
        }
        zzxc.zzf.add(zza2);
    }
}
