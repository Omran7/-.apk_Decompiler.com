package com.google.android.gms.internal.p002firebaseauthapi;

import h0.C0552a;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;
import o3.d;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzakg  reason: invalid package */
public abstract class zzakg extends zzajm {
    private static final Logger zza = Logger.getLogger(zzakg.class.getName());
    /* access modifiers changed from: private */
    public static final boolean zzb = zzanp.zzc();
    zzakj zze;

    /* renamed from: com.google.android.gms.internal.firebase-auth-api.zzakg$zza */
    public static abstract class zza extends zzakg {
        final byte[] zza;
        final int zzb;
        int zzc;
        int zzd;

        public zza(int i2) {
            super();
            if (i2 >= 0) {
                byte[] bArr = new byte[Math.max(i2, 20)];
                this.zza = bArr;
                this.zzb = bArr.length;
                return;
            }
            throw new IllegalArgumentException("bufferSize must be >= 0");
        }

        public final int zza() {
            throw new UnsupportedOperationException("spaceLeft() can only be called on CodedOutputStreams that are writing to a flat array or ByteBuffer.");
        }

        public final void zzb(int i2) {
            if (zzakg.zzb) {
                long j6 = (long) this.zzc;
                while ((i2 & -128) != 0) {
                    byte[] bArr = this.zza;
                    int i5 = this.zzc;
                    this.zzc = i5 + 1;
                    zzanp.zza(bArr, (long) i5, (byte) (i2 | 128));
                    i2 >>>= 7;
                }
                byte[] bArr2 = this.zza;
                int i6 = this.zzc;
                this.zzc = i6 + 1;
                zzanp.zza(bArr2, (long) i6, (byte) i2);
                this.zzd += (int) (((long) this.zzc) - j6);
                return;
            }
            while ((i2 & -128) != 0) {
                byte[] bArr3 = this.zza;
                int i7 = this.zzc;
                this.zzc = i7 + 1;
                bArr3[i7] = (byte) (i2 | 128);
                this.zzd++;
                i2 >>>= 7;
            }
            byte[] bArr4 = this.zza;
            int i8 = this.zzc;
            this.zzc = i8 + 1;
            bArr4[i8] = (byte) i2;
            this.zzd++;
        }

        public final void zza(byte b6) {
            int i2 = this.zzc;
            this.zza[i2] = b6;
            this.zzc = i2 + 1;
            this.zzd++;
        }

        public final void zza(int i2) {
            int i5 = this.zzc;
            byte[] bArr = this.zza;
            bArr[i5] = (byte) i2;
            bArr[i5 + 1] = (byte) (i2 >> 8);
            bArr[i5 + 2] = (byte) (i2 >> 16);
            bArr[i5 + 3] = i2 >> 24;
            this.zzc = i5 + 4;
            this.zzd += 4;
        }

        public final void zzb(long j6) {
            if (zzakg.zzb) {
                long j7 = (long) this.zzc;
                while ((j6 & -128) != 0) {
                    byte[] bArr = this.zza;
                    int i2 = this.zzc;
                    this.zzc = i2 + 1;
                    zzanp.zza(bArr, (long) i2, (byte) (((int) j6) | 128));
                    j6 >>>= 7;
                }
                byte[] bArr2 = this.zza;
                int i5 = this.zzc;
                this.zzc = i5 + 1;
                zzanp.zza(bArr2, (long) i5, (byte) ((int) j6));
                this.zzd += (int) (((long) this.zzc) - j7);
                return;
            }
            while ((j6 & -128) != 0) {
                byte[] bArr3 = this.zza;
                int i6 = this.zzc;
                this.zzc = i6 + 1;
                bArr3[i6] = (byte) (((int) j6) | 128);
                this.zzd++;
                j6 >>>= 7;
            }
            byte[] bArr4 = this.zza;
            int i7 = this.zzc;
            this.zzc = i7 + 1;
            bArr4[i7] = (byte) ((int) j6);
            this.zzd++;
        }

        public final void zza(long j6) {
            int i2 = this.zzc;
            byte[] bArr = this.zza;
            bArr[i2] = (byte) ((int) j6);
            bArr[i2 + 1] = (byte) ((int) (j6 >> 8));
            bArr[i2 + 2] = (byte) ((int) (j6 >> 16));
            bArr[i2 + 3] = (byte) ((int) (j6 >> 24));
            bArr[i2 + 4] = (byte) ((int) (j6 >> 32));
            bArr[i2 + 5] = (byte) ((int) (j6 >> 40));
            bArr[i2 + 6] = (byte) ((int) (j6 >> 48));
            bArr[i2 + 7] = (byte) ((int) (j6 >> 56));
            this.zzc = i2 + 8;
            this.zzd += 8;
        }

        public final void zza(int i2, int i5) {
            zzb((i2 << 3) | i5);
        }
    }

    /* renamed from: com.google.android.gms.internal.firebase-auth-api.zzakg$zzb */
    public static class zzb extends IOException {
        public zzb() {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.");
        }

        public zzb(Throwable th) {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.", th);
        }

        private zzb(String str, Throwable th) {
            super(d.i("CodedOutputStream was writing to a flat byte array and ran out of space.: ", str), th);
        }

        public zzb(int i2, int i5, int i6, Throwable th) {
            this((long) i2, (long) i5, i6, th);
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        private zzb(long j6, long j7, int i2, Throwable th) {
            this("Pos: " + j6 + ", limit: " + j7 + ", len: " + i2, th);
            Locale locale = Locale.US;
        }
    }

    /* renamed from: com.google.android.gms.internal.firebase-auth-api.zzakg$zzc */
    public static class zzc extends zzakg {
        private final byte[] zza;
        private final int zzb;
        private int zzc;

        public zzc(byte[] bArr, int i2, int i5) {
            super();
            if (bArr == null) {
                throw new NullPointerException("buffer");
            } else if (((bArr.length - i5) | i5) >= 0) {
                this.zza = bArr;
                this.zzc = 0;
                this.zzb = i5;
            } else {
                Locale locale = Locale.US;
                throw new IllegalArgumentException(C0552a.l("Array range is invalid. Buffer.length=", bArr.length, i5, ", offset=0, length="));
            }
        }

        public final int zza() {
            return this.zzb - this.zzc;
        }

        public final void zzb(byte b6) {
            int i2 = this.zzc;
            try {
                int i5 = i2 + 1;
                try {
                    this.zza[i2] = b6;
                    this.zzc = i5;
                } catch (IndexOutOfBoundsException e6) {
                    e = e6;
                    i2 = i5;
                    throw new zzb(i2, this.zzb, 1, (Throwable) e);
                }
            } catch (IndexOutOfBoundsException e7) {
                e = e7;
                throw new zzb(i2, this.zzb, 1, (Throwable) e);
            }
        }

        public final void zzc() {
        }

        public final void zzd(int i2, zzajp zzajp) {
            zzk(1, 3);
            zzl(2, i2);
            zzc(3, zzajp);
            zzk(1, 4);
        }

        public final void zzf(int i2, long j6) {
            zzk(i2, 1);
            zzh(j6);
        }

        public final void zzh(int i2, int i5) {
            zzk(i2, 5);
            zzk(i5);
        }

        public final void zzi(int i2, int i5) {
            zzk(i2, 0);
            zzl(i5);
        }

        public final void zzj(long j6) {
            int i2;
            int i5 = this.zzc;
            if (!zzakg.zzb || zza() < 10) {
                while ((j6 & -128) != 0) {
                    int i6 = i5 + 1;
                    try {
                        this.zza[i5] = (byte) (((int) j6) | 128);
                        j6 >>>= 7;
                        i5 = i6;
                    } catch (IndexOutOfBoundsException e6) {
                        e = e6;
                        i5 = i6;
                        throw new zzb(i5, this.zzb, 1, (Throwable) e);
                    }
                }
                try {
                    i2 = i5 + 1;
                } catch (IndexOutOfBoundsException e7) {
                    e = e7;
                    throw new zzb(i5, this.zzb, 1, (Throwable) e);
                }
                try {
                    this.zza[i5] = (byte) ((int) j6);
                } catch (IndexOutOfBoundsException e8) {
                    e = e8;
                    i5 = i2;
                    throw new zzb(i5, this.zzb, 1, (Throwable) e);
                }
            } else {
                while ((j6 & -128) != 0) {
                    zzanp.zza(this.zza, (long) i5, (byte) (((int) j6) | 128));
                    j6 >>>= 7;
                    i5++;
                }
                i2 = i5 + 1;
                zzanp.zza(this.zza, (long) i5, (byte) ((int) j6));
            }
            this.zzc = i2;
        }

        public final void zzk(int i2) {
            int i5 = this.zzc;
            try {
                byte[] bArr = this.zza;
                bArr[i5] = (byte) i2;
                bArr[i5 + 1] = (byte) (i2 >> 8);
                bArr[i5 + 2] = (byte) (i2 >> 16);
                bArr[i5 + 3] = i2 >> 24;
                this.zzc = i5 + 4;
            } catch (IndexOutOfBoundsException e6) {
                throw new zzb(i5, this.zzb, 4, (Throwable) e6);
            }
        }

        public final void zzl(int i2) {
            if (i2 >= 0) {
                zzn(i2);
            } else {
                zzj((long) i2);
            }
        }

        public final void zzn(int i2) {
            int i5;
            int i6 = this.zzc;
            while ((i2 & -128) != 0) {
                i5 = i6 + 1;
                this.zza[i6] = (byte) (i2 | 128);
                i2 >>>= 7;
                i6 = i5;
            }
            try {
                i5 = i6 + 1;
                try {
                    this.zza[i6] = (byte) i2;
                    this.zzc = i5;
                } catch (IndexOutOfBoundsException e6) {
                    e = e6;
                    i6 = i5;
                    throw new zzb(i6, this.zzb, 1, (Throwable) e);
                }
            } catch (IndexOutOfBoundsException e7) {
                e = e7;
                throw new zzb(i6, this.zzb, 1, (Throwable) e);
            }
        }

        private final void zzc(byte[] bArr, int i2, int i5) {
            try {
                System.arraycopy(bArr, i2, this.zza, this.zzc, i5);
                this.zzc += i5;
            } catch (IndexOutOfBoundsException e6) {
                throw new zzb(this.zzc, this.zzb, i5, (Throwable) e6);
            }
        }

        public final void zza(byte[] bArr, int i2, int i5) {
            zzc(bArr, i2, i5);
        }

        public final void zzh(long j6) {
            int i2 = this.zzc;
            try {
                byte[] bArr = this.zza;
                bArr[i2] = (byte) ((int) j6);
                bArr[i2 + 1] = (byte) ((int) (j6 >> 8));
                bArr[i2 + 2] = (byte) ((int) (j6 >> 16));
                bArr[i2 + 3] = (byte) ((int) (j6 >> 24));
                bArr[i2 + 4] = (byte) ((int) (j6 >> 32));
                bArr[i2 + 5] = (byte) ((int) (j6 >> 40));
                bArr[i2 + 6] = (byte) ((int) (j6 >> 48));
                bArr[i2 + 7] = (byte) ((int) (j6 >> 56));
                this.zzc = i2 + 8;
            } catch (IndexOutOfBoundsException e6) {
                throw new zzb(i2, this.zzb, 8, (Throwable) e6);
            }
        }

        public final void zzl(int i2, int i5) {
            zzk(i2, 0);
            zzn(i5);
        }

        public final void zzb(int i2, boolean z3) {
            zzk(i2, 0);
            zzb(z3 ? (byte) 1 : 0);
        }

        public final void zzc(int i2, zzajp zzajp) {
            zzk(i2, 2);
            zzb(zzajp);
        }

        public final void zzb(byte[] bArr, int i2, int i5) {
            zzn(i5);
            zzc(bArr, 0, i5);
        }

        public final void zzc(int i2, zzamc zzamc, zzamv zzamv) {
            zzk(i2, 2);
            zzn(((zzajf) zzamc).zza(zzamv));
            zzamv.zza(zzamc, (zzaof) this.zze);
        }

        public final void zzk(int i2, int i5) {
            zzn((i2 << 3) | i5);
        }

        public final void zzb(zzajp zzajp) {
            zzn(zzajp.zzb());
            zzajp.zza((zzajm) this);
        }

        public final void zzc(zzamc zzamc) {
            zzn(zzamc.zzl());
            zzamc.zza(this);
        }

        public final void zzb(zzamc zzamc, zzamv zzamv) {
            zzn(((zzajf) zzamc).zza(zzamv));
            zzamv.zza(zzamc, (zzaof) this.zze);
        }

        public final void zzb(int i2, zzamc zzamc) {
            zzk(1, 3);
            zzl(2, i2);
            zzk(3, 2);
            zzc(zzamc);
            zzk(1, 4);
        }

        public final void zzh(int i2, long j6) {
            zzk(i2, 0);
            zzj(j6);
        }

        public final void zzb(int i2, String str) {
            zzk(i2, 2);
            zzb(str);
        }

        public final void zzb(String str) {
            int i2 = this.zzc;
            try {
                int zzj = zzakg.zzj(str.length() * 3);
                int zzj2 = zzakg.zzj(str.length());
                if (zzj2 == zzj) {
                    int i5 = i2 + zzj2;
                    this.zzc = i5;
                    int zza2 = zzant.zza(str, this.zza, i5, zza());
                    this.zzc = i2;
                    zzn((zza2 - i2) - zzj2);
                    this.zzc = zza2;
                    return;
                }
                zzn(zzant.zza(str));
                this.zzc = zzant.zza(str, this.zza, this.zzc, zza());
            } catch (zzanx e6) {
                this.zzc = i2;
                zza(str, e6);
            } catch (IndexOutOfBoundsException e7) {
                throw new zzb(e7);
            }
        }
    }

    public static int zza(double d) {
        return 8;
    }

    public static int zzb(int i2, int i5) {
        return zzg((long) i5) + zzj(i2 << 3);
    }

    public static int zzc(long j6) {
        return 8;
    }

    public static int zzd(int i2) {
        return 4;
    }

    public static int zze(long j6) {
        return 8;
    }

    public static int zzf(int i2) {
        if (i2 > 4096) {
            return 4096;
        }
        return i2;
    }

    public static int zzg(int i2) {
        return 4;
    }

    public static int zzh(int i2) {
        return zzj(zza(i2));
    }

    public static int zzi(int i2) {
        return zzj(i2 << 3);
    }

    public static int zzj(int i2) {
        return (352 - (Integer.numberOfLeadingZeros(i2) * 9)) >>> 6;
    }

    public abstract int zza();

    public abstract void zzb(byte b6);

    public abstract void zzb(int i2, zzamc zzamc);

    public abstract void zzb(int i2, String str);

    public abstract void zzb(int i2, boolean z3);

    public abstract void zzb(zzajp zzajp);

    public abstract void zzb(zzamc zzamc, zzamv zzamv);

    public abstract void zzb(String str);

    public abstract void zzb(byte[] bArr, int i2, int i5);

    public abstract void zzc();

    public abstract void zzc(int i2, zzajp zzajp);

    public abstract void zzc(int i2, zzamc zzamc, zzamv zzamv);

    public abstract void zzc(zzamc zzamc);

    public abstract void zzd(int i2, zzajp zzajp);

    public abstract void zzf(int i2, long j6);

    public abstract void zzh(int i2, int i5);

    public abstract void zzh(int i2, long j6);

    public abstract void zzh(long j6);

    public abstract void zzi(int i2, int i5);

    public abstract void zzj(long j6);

    public abstract void zzk(int i2);

    public abstract void zzk(int i2, int i5);

    public abstract void zzl(int i2);

    public abstract void zzl(int i2, int i5);

    public final void zzm(int i2) {
        zzn(zza(i2));
    }

    public abstract void zzn(int i2);

    /* renamed from: com.google.android.gms.internal.firebase-auth-api.zzakg$zzd */
    public static final class zzd extends zza {
        private final OutputStream zzf;

        public zzd(OutputStream outputStream, int i2) {
            super(i2);
            if (outputStream != null) {
                this.zzf = outputStream;
                return;
            }
            throw new NullPointerException("out");
        }

        private final void zze() {
            this.zzf.write(this.zza, 0, this.zzc);
            this.zzc = 0;
        }

        private final void zzo(int i2) {
            if (this.zzb - this.zzc < i2) {
                zze();
            }
        }

        public final void zza(byte[] bArr, int i2, int i5) {
            zzc(bArr, i2, i5);
        }

        public final void zzb(byte b6) {
            if (this.zzc == this.zzb) {
                zze();
            }
            zza(b6);
        }

        public final void zzc() {
            if (this.zzc > 0) {
                zze();
            }
        }

        public final void zzd(int i2, zzajp zzajp) {
            zzk(1, 3);
            zzl(2, i2);
            zzc(3, zzajp);
            zzk(1, 4);
        }

        public final void zzf(int i2, long j6) {
            zzo(18);
            zza(i2, 1);
            zza(j6);
        }

        public final void zzh(int i2, int i5) {
            zzo(14);
            zza(i2, 5);
            zza(i5);
        }

        public final void zzi(int i2, int i5) {
            zzo(20);
            zza(i2, 0);
            if (i5 >= 0) {
                zzb(i5);
            } else {
                zzb((long) i5);
            }
        }

        public final void zzj(long j6) {
            zzo(10);
            zzb(j6);
        }

        public final void zzk(int i2) {
            zzo(4);
            zza(i2);
        }

        public final void zzl(int i2) {
            if (i2 >= 0) {
                zzn(i2);
            } else {
                zzj((long) i2);
            }
        }

        public final void zzn(int i2) {
            zzo(5);
            zzb(i2);
        }

        private final void zzc(byte[] bArr, int i2, int i5) {
            int i6 = this.zzb;
            int i7 = this.zzc;
            if (i6 - i7 >= i5) {
                System.arraycopy(bArr, i2, this.zza, i7, i5);
                this.zzc += i5;
            } else {
                int i8 = i6 - i7;
                System.arraycopy(bArr, i2, this.zza, i7, i8);
                int i9 = i2 + i8;
                i5 -= i8;
                this.zzc = this.zzb;
                this.zzd += i8;
                zze();
                if (i5 <= this.zzb) {
                    System.arraycopy(bArr, i9, this.zza, 0, i5);
                    this.zzc = i5;
                } else {
                    this.zzf.write(bArr, i9, i5);
                }
            }
            this.zzd += i5;
        }

        public final void zzk(int i2, int i5) {
            zzn((i2 << 3) | i5);
        }

        public final void zzl(int i2, int i5) {
            zzo(20);
            zza(i2, 0);
            zzb(i5);
        }

        public final void zzb(int i2, boolean z3) {
            zzo(11);
            zza(i2, 0);
            zza(z3 ? (byte) 1 : 0);
        }

        public final void zzh(long j6) {
            zzo(8);
            zza(j6);
        }

        public final void zzh(int i2, long j6) {
            zzo(20);
            zza(i2, 0);
            zzb(j6);
        }

        public final void zzb(byte[] bArr, int i2, int i5) {
            zzn(i5);
            zzc(bArr, 0, i5);
        }

        public final void zzb(zzajp zzajp) {
            zzn(zzajp.zzb());
            zzajp.zza((zzajm) this);
        }

        public final void zzb(zzamc zzamc, zzamv zzamv) {
            zzn(((zzajf) zzamc).zza(zzamv));
            zzamv.zza(zzamc, (zzaof) this.zze);
        }

        public final void zzb(int i2, zzamc zzamc) {
            zzk(1, 3);
            zzl(2, i2);
            zzk(3, 2);
            zzc(zzamc);
            zzk(1, 4);
        }

        public final void zzc(int i2, zzajp zzajp) {
            zzk(i2, 2);
            zzb(zzajp);
        }

        public final void zzc(int i2, zzamc zzamc, zzamv zzamv) {
            zzk(i2, 2);
            zzb(zzamc, zzamv);
        }

        public final void zzb(int i2, String str) {
            zzk(i2, 2);
            zzb(str);
        }

        public final void zzc(zzamc zzamc) {
            zzn(zzamc.zzl());
            zzamc.zza(this);
        }

        public final void zzb(String str) {
            int i2;
            int i5;
            try {
                int length = str.length() * 3;
                int zzj = zzakg.zzj(length);
                int i6 = zzj + length;
                int i7 = this.zzb;
                if (i6 > i7) {
                    byte[] bArr = new byte[length];
                    int zza = zzant.zza(str, bArr, 0, length);
                    zzn(zza);
                    zza(bArr, 0, zza);
                    return;
                }
                if (i6 > i7 - this.zzc) {
                    zze();
                }
                int zzj2 = zzakg.zzj(str.length());
                i2 = this.zzc;
                if (zzj2 == zzj) {
                    int i8 = i2 + zzj2;
                    this.zzc = i8;
                    int zza2 = zzant.zza(str, this.zza, i8, this.zzb - i8);
                    this.zzc = i2;
                    i5 = (zza2 - i2) - zzj2;
                    zzb(i5);
                    this.zzc = zza2;
                } else {
                    i5 = zzant.zza(str);
                    zzb(i5);
                    this.zzc = zzant.zza(str, this.zza, this.zzc, i5);
                }
                this.zzd += i5;
            } catch (zzanx e6) {
                this.zzd -= this.zzc - i2;
                this.zzc = i2;
                throw e6;
            } catch (ArrayIndexOutOfBoundsException e7) {
                throw new zzb(e7);
            } catch (zzanx e8) {
                zza(str, e8);
            }
        }
    }

    private zzakg() {
    }

    public static int zza(float f6) {
        return 4;
    }

    public static int zzc(int i2) {
        return zzg((long) i2);
    }

    public static int zze(int i2) {
        return zzg((long) i2);
    }

    public static int zzf(int i2, int i5) {
        return zzj(zza(i5)) + zzj(i2 << 3);
    }

    public static int zzg(int i2, int i5) {
        return zzj(i5) + zzj(i2 << 3);
    }

    public final void zzi(long j6) {
        zzj(zza(j6));
    }

    public final void zzj(int i2, int i5) {
        zzl(i2, zza(i5));
    }

    private static int zza(int i2) {
        return (i2 >> 31) ^ (i2 << 1);
    }

    public static int zzb(int i2, long j6) {
        return zzg(j6) + zzj(i2 << 3);
    }

    public static int zzc(int i2, int i5) {
        return zzj(i2 << 3) + 4;
    }

    public static int zzd(int i2, int i5) {
        return zzg((long) i5) + zzj(i2 << 3);
    }

    public static int zze(int i2, int i5) {
        return zzj(i2 << 3) + 4;
    }

    public static int zza(boolean z3) {
        return 1;
    }

    public static int zzc(int i2, long j6) {
        return zzj(i2 << 3) + 8;
    }

    public static int zze(int i2, long j6) {
        return zzg(j6) + zzj(i2 << 3);
    }

    public static int zzf(long j6) {
        return zzg(zza(j6));
    }

    public static int zzg(long j6) {
        return (640 - (Long.numberOfLeadingZeros(j6) * 9)) >>> 6;
    }

    private static long zza(long j6) {
        return (j6 >> 63) ^ (j6 << 1);
    }

    public static int zzb(int i2, zzalk zzalk) {
        int zzj = zzj(i2 << 3);
        int zza2 = zzalk.zza();
        return zzj(zza2) + zza2 + zzj;
    }

    public static int zzd(long j6) {
        return zzg(j6);
    }

    public final void zzg(int i2, long j6) {
        zzh(i2, zza(j6));
    }

    public static int zza(int i2, boolean z3) {
        return zzj(i2 << 3) + 1;
    }

    public static int zzd(int i2, long j6) {
        return zzg(zza(j6)) + zzj(i2 << 3);
    }

    public static int zza(byte[] bArr) {
        int length = bArr.length;
        return zzj(length) + length;
    }

    public static int zzb(int i2, zzamc zzamc, zzamv zzamv) {
        return zza(zzamc, zzamv) + zzj(i2 << 3);
    }

    public static int zza(int i2, zzajp zzajp) {
        int zzj = zzj(i2 << 3);
        int zzb2 = zzajp.zzb();
        return zzj(zzb2) + zzb2 + zzj;
    }

    public static int zzb(zzamc zzamc) {
        int zzl = zzamc.zzl();
        return zzj(zzl) + zzl;
    }

    public static int zza(zzajp zzajp) {
        int zzb2 = zzajp.zzb();
        return zzj(zzb2) + zzb2;
    }

    public static int zzb(int i2, zzajp zzajp) {
        int zzg = zzg(2, i2);
        return zza(3, zzajp) + zzg + (zzj(8) << 1);
    }

    public static int zza(int i2, double d) {
        return zzj(i2 << 3) + 8;
    }

    public static int zza(int i2, long j6) {
        return zzj(i2 << 3) + 8;
    }

    public static zzakg zzb(byte[] bArr) {
        return new zzc(bArr, 0, bArr.length);
    }

    public static int zza(int i2, float f6) {
        return zzj(i2 << 3) + 4;
    }

    @Deprecated
    public static int zza(int i2, zzamc zzamc, zzamv zzamv) {
        return ((zzajf) zzamc).zza(zzamv) + (zzj(i2 << 3) << 1);
    }

    public final void zzb() {
        if (zza() != 0) {
            throw new IllegalStateException("Did not write as much data as expected.");
        }
    }

    @Deprecated
    public static int zza(zzamc zzamc) {
        return zzamc.zzl();
    }

    public final void zzb(boolean z3) {
        zzb(z3 ? (byte) 1 : 0);
    }

    public static int zza(int i2, zzalk zzalk) {
        int zzg = zzg(2, i2);
        return zzb(3, zzalk) + zzg + (zzj(8) << 1);
    }

    public final void zzb(int i2, double d) {
        zzf(i2, Double.doubleToRawLongBits(d));
    }

    public final void zzb(double d) {
        zzh(Double.doubleToRawLongBits(d));
    }

    public final void zzb(int i2, float f6) {
        zzh(i2, Float.floatToRawIntBits(f6));
    }

    public static int zza(zzalk zzalk) {
        int zza2 = zzalk.zza();
        return zzj(zza2) + zza2;
    }

    public final void zzb(float f6) {
        zzk(Float.floatToRawIntBits(f6));
    }

    public static int zza(int i2, zzamc zzamc) {
        return zzb(zzamc) + zzj(24) + zzg(2, i2) + (zzj(8) << 1);
    }

    public static int zza(zzamc zzamc, zzamv zzamv) {
        int zza2 = ((zzajf) zzamc).zza(zzamv);
        return zzj(zza2) + zza2;
    }

    public static int zza(int i2, String str) {
        return zza(str) + zzj(i2 << 3);
    }

    public static int zza(String str) {
        int i2;
        try {
            i2 = zzant.zza(str);
        } catch (zzanx unused) {
            i2 = str.getBytes(zzalb.zza).length;
        }
        return zzj(i2) + i2;
    }

    public static zzakg zza(OutputStream outputStream, int i2) {
        return new zzd(outputStream, i2);
    }

    public final void zza(String str, zzanx zzanx) {
        zza.logp(Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", zzanx);
        byte[] bytes = str.getBytes(zzalb.zza);
        try {
            zzn(bytes.length);
            zza(bytes, 0, bytes.length);
        } catch (IndexOutOfBoundsException e6) {
            throw new zzb(e6);
        }
    }
}
