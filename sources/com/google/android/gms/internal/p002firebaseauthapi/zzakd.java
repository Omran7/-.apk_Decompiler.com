package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.common.api.f;
import h0.C0552a;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzakd  reason: invalid package */
final class zzakd extends zzakb {
    private final InputStream zzd;
    private final byte[] zze;
    private int zzf;
    private int zzg;
    private int zzh;
    private int zzi;
    private int zzj;
    private int zzk;

    private final int zzaa() {
        byte b6;
        byte b7;
        int i2 = this.zzh;
        int i5 = this.zzf;
        if (i5 != i2) {
            byte[] bArr = this.zze;
            int i6 = i2 + 1;
            byte b8 = bArr[i2];
            if (b8 >= 0) {
                this.zzh = i6;
                return b8;
            } else if (i5 - i6 >= 9) {
                int i7 = i2 + 2;
                byte b9 = (bArr[i6] << 7) ^ b8;
                if (b9 < 0) {
                    b6 = b9 ^ Byte.MIN_VALUE;
                } else {
                    int i8 = i2 + 3;
                    byte b10 = (bArr[i7] << 14) ^ b9;
                    if (b10 >= 0) {
                        b7 = b10 ^ 16256;
                    } else {
                        int i9 = i2 + 4;
                        byte b11 = b10 ^ (bArr[i8] << 21);
                        if (b11 < 0) {
                            b6 = -2080896 ^ b11;
                        } else {
                            i8 = i2 + 5;
                            byte b12 = bArr[i9];
                            byte b13 = (b11 ^ (b12 << 28)) ^ 266354560;
                            if (b12 < 0) {
                                i9 = i2 + 6;
                                if (bArr[i8] < 0) {
                                    i8 = i2 + 7;
                                    if (bArr[i9] < 0) {
                                        i9 = i2 + 8;
                                        if (bArr[i8] < 0) {
                                            i8 = i2 + 9;
                                            if (bArr[i9] < 0) {
                                                int i10 = i2 + 10;
                                                if (bArr[i8] >= 0) {
                                                    byte b14 = b13;
                                                    i7 = i10;
                                                    b6 = b14;
                                                }
                                            }
                                        }
                                    }
                                }
                                b6 = b13;
                            }
                            b7 = b13;
                        }
                        i7 = i9;
                    }
                    i7 = i8;
                }
                this.zzh = i7;
                return b6;
            }
        }
        return (int) zzm();
    }

    private final long zzab() {
        int i2 = this.zzh;
        if (this.zzf - i2 < 8) {
            zzg(8);
            i2 = this.zzh;
        }
        byte[] bArr = this.zze;
        this.zzh = i2 + 8;
        return ((((long) bArr[i2 + 7]) & 255) << 56) | (((long) bArr[i2]) & 255) | ((((long) bArr[i2 + 1]) & 255) << 8) | ((((long) bArr[i2 + 2]) & 255) << 16) | ((((long) bArr[i2 + 3]) & 255) << 24) | ((((long) bArr[i2 + 4]) & 255) << 32) | ((((long) bArr[i2 + 5]) & 255) << 40) | ((((long) bArr[i2 + 6]) & 255) << 48);
    }

    private final long zzac() {
        long j6;
        long j7;
        long j8;
        int i2 = this.zzh;
        int i5 = this.zzf;
        if (i5 != i2) {
            byte[] bArr = this.zze;
            int i6 = i2 + 1;
            byte b6 = bArr[i2];
            if (b6 >= 0) {
                this.zzh = i6;
                return (long) b6;
            } else if (i5 - i6 >= 9) {
                int i7 = i2 + 2;
                byte b7 = (bArr[i6] << 7) ^ b6;
                if (b7 < 0) {
                    j6 = (long) (b7 ^ Byte.MIN_VALUE);
                } else {
                    int i8 = i2 + 3;
                    byte b8 = (bArr[i7] << 14) ^ b7;
                    if (b8 >= 0) {
                        j6 = (long) (b8 ^ 16256);
                        i7 = i8;
                    } else {
                        int i9 = i2 + 4;
                        byte b9 = b8 ^ (bArr[i8] << 21);
                        if (b9 < 0) {
                            i7 = i9;
                            j6 = (long) (-2080896 ^ b9);
                        } else {
                            long j9 = (long) b9;
                            int i10 = i2 + 5;
                            long j10 = j9 ^ (((long) bArr[i9]) << 28);
                            if (j10 >= 0) {
                                j8 = 266354560;
                            } else {
                                int i11 = i2 + 6;
                                long j11 = j10 ^ (((long) bArr[i10]) << 35);
                                if (j11 < 0) {
                                    j7 = -34093383808L;
                                } else {
                                    i10 = i2 + 7;
                                    j10 = j11 ^ (((long) bArr[i11]) << 42);
                                    if (j10 >= 0) {
                                        j8 = 4363953127296L;
                                    } else {
                                        i11 = i2 + 8;
                                        j11 = j10 ^ (((long) bArr[i10]) << 49);
                                        if (j11 < 0) {
                                            j7 = -558586000294016L;
                                        } else {
                                            i7 = i2 + 9;
                                            long j12 = (j11 ^ (((long) bArr[i11]) << 56)) ^ 71499008037633920L;
                                            if (j12 < 0) {
                                                int i12 = i2 + 10;
                                                if (((long) bArr[i7]) >= 0) {
                                                    i7 = i12;
                                                }
                                            }
                                            j6 = j12;
                                        }
                                    }
                                }
                                j6 = j11 ^ j7;
                                i7 = i11;
                            }
                            j6 = j10 ^ j8;
                        }
                    }
                }
                this.zzh = i7;
                return j6;
            }
        }
        return zzm();
    }

    private final void zzad() {
        int i2 = this.zzf + this.zzg;
        this.zzf = i2;
        int i5 = this.zzj + i2;
        int i6 = this.zzk;
        if (i5 > i6) {
            int i7 = i5 - i6;
            this.zzg = i7;
            this.zzf = i2 - i7;
            return;
        }
        this.zzg = 0;
    }

    private final byte zzy() {
        if (this.zzh == this.zzf) {
            zzg(1);
        }
        byte[] bArr = this.zze;
        int i2 = this.zzh;
        this.zzh = i2 + 1;
        return bArr[i2];
    }

    private final int zzz() {
        int i2 = this.zzh;
        if (this.zzf - i2 < 4) {
            zzg(4);
            i2 = this.zzh;
        }
        byte[] bArr = this.zze;
        this.zzh = i2 + 4;
        return ((bArr[i2 + 3] & 255) << 24) | (bArr[i2] & 255) | ((bArr[i2 + 1] & 255) << 8) | ((bArr[i2 + 2] & 255) << 16);
    }

    public final double zza() {
        return Double.longBitsToDouble(zzab());
    }

    public final float zzb() {
        return Float.intBitsToFloat(zzz());
    }

    public final int zzc() {
        return this.zzj + this.zzh;
    }

    public final int zzd() {
        return zzaa();
    }

    public final int zze() {
        return zzz();
    }

    public final int zzf() {
        return zzaa();
    }

    public final int zzg() {
        return zzz();
    }

    public final int zzh() {
        return zzakb.zze(zzaa());
    }

    public final int zzi() {
        if (zzt()) {
            this.zzi = 0;
            return 0;
        }
        int zzaa = zzaa();
        this.zzi = zzaa;
        if ((zzaa >>> 3) != 0) {
            return zzaa;
        }
        throw zzalf.zzc();
    }

    public final int zzj() {
        return zzaa();
    }

    public final long zzk() {
        return zzab();
    }

    public final long zzl() {
        return zzac();
    }

    public final long zzm() {
        long j6 = 0;
        for (int i2 = 0; i2 < 64; i2 += 7) {
            byte zzy = zzy();
            j6 |= ((long) (zzy & Byte.MAX_VALUE)) << i2;
            if ((zzy & 128) == 0) {
                return j6;
            }
        }
        throw zzalf.zze();
    }

    public final long zzn() {
        return zzab();
    }

    public final long zzo() {
        return zzakb.zza(zzac());
    }

    public final long zzp() {
        return zzac();
    }

    public final zzajp zzq() {
        int zzaa = zzaa();
        int i2 = this.zzf;
        int i5 = this.zzh;
        if (zzaa <= i2 - i5 && zzaa > 0) {
            zzajp zza = zzajp.zza(this.zze, i5, zzaa);
            this.zzh += zzaa;
            return zza;
        } else if (zzaa == 0) {
            return zzajp.zza;
        } else {
            if (zzaa >= 0) {
                byte[] zzj2 = zzj(zzaa);
                if (zzj2 != null) {
                    return zzajp.zza(zzj2);
                }
                int i6 = this.zzh;
                int i7 = this.zzf;
                int i8 = i7 - i6;
                this.zzj += i7;
                this.zzh = 0;
                this.zzf = 0;
                List<byte[]> zzf2 = zzf(zzaa - i8);
                byte[] bArr = new byte[zzaa];
                System.arraycopy(this.zze, i6, bArr, 0, i8);
                for (byte[] next : zzf2) {
                    System.arraycopy(next, 0, bArr, i8, next.length);
                    i8 += next.length;
                }
                return zzajp.zzb(bArr);
            }
            throw zzalf.zzf();
        }
    }

    public final String zzr() {
        int zzaa = zzaa();
        if (zzaa > 0) {
            int i2 = this.zzf;
            int i5 = this.zzh;
            if (zzaa <= i2 - i5) {
                String str = new String(this.zze, i5, zzaa, zzalb.zza);
                this.zzh += zzaa;
                return str;
            }
        }
        if (zzaa == 0) {
            return "";
        }
        if (zzaa < 0) {
            throw zzalf.zzf();
        } else if (zzaa > this.zzf) {
            return new String(zza(zzaa, false), zzalb.zza);
        } else {
            zzg(zzaa);
            String str2 = new String(this.zze, this.zzh, zzaa, zzalb.zza);
            this.zzh += zzaa;
            return str2;
        }
    }

    public final String zzs() {
        byte[] bArr;
        int zzaa = zzaa();
        int i2 = this.zzh;
        int i5 = this.zzf;
        if (zzaa <= i5 - i2 && zzaa > 0) {
            bArr = this.zze;
            this.zzh = i2 + zzaa;
        } else if (zzaa == 0) {
            return "";
        } else {
            if (zzaa >= 0) {
                i2 = 0;
                if (zzaa <= i5) {
                    zzg(zzaa);
                    bArr = this.zze;
                    this.zzh = zzaa;
                } else {
                    bArr = zza(zzaa, false);
                }
            } else {
                throw zzalf.zzf();
            }
        }
        return zzant.zzb(bArr, i2, zzaa);
    }

    public final boolean zzt() {
        if (this.zzh != this.zzf || zzi(1)) {
            return false;
        }
        return true;
    }

    public final boolean zzu() {
        if (zzac() != 0) {
            return true;
        }
        return false;
    }

    private zzakd(InputStream inputStream, int i2) {
        super();
        this.zzk = f.API_PRIORITY_OTHER;
        zzalb.zza(inputStream, "input");
        this.zzd = inputStream;
        this.zze = new byte[4096];
        this.zzf = 0;
        this.zzh = 0;
        this.zzj = 0;
    }

    private static int zza(InputStream inputStream) {
        try {
            return inputStream.available();
        } catch (zzalf e6) {
            e6.zzk();
            throw e6;
        }
    }

    private final List<byte[]> zzf(int i2) {
        ArrayList arrayList = new ArrayList();
        while (i2 > 0) {
            int min = Math.min(i2, 4096);
            byte[] bArr = new byte[min];
            int i5 = 0;
            while (i5 < min) {
                int read = this.zzd.read(bArr, i5, min - i5);
                if (read != -1) {
                    this.zzj += read;
                    i5 += read;
                } else {
                    throw zzalf.zzj();
                }
            }
            i2 -= min;
            arrayList.add(bArr);
        }
        return arrayList;
    }

    private final void zzg(int i2) {
        if (zzi(i2)) {
            return;
        }
        if (i2 > (this.zzb - this.zzj) - this.zzh) {
            throw zzalf.zzi();
        }
        throw zzalf.zzj();
    }

    private final void zzh(int i2) {
        int i5 = this.zzf;
        int i6 = this.zzh;
        if (i2 <= i5 - i6 && i2 >= 0) {
            this.zzh = i6 + i2;
        } else if (i2 >= 0) {
            int i7 = this.zzj;
            int i8 = i7 + i6 + i2;
            int i9 = this.zzk;
            if (i8 <= i9) {
                this.zzj = i7 + i6;
                int i10 = i5 - i6;
                this.zzf = 0;
                this.zzh = 0;
                while (i10 < i2) {
                    try {
                        long j6 = (long) (i2 - i10);
                        long zza = zza(this.zzd, j6);
                        int i11 = (zza > 0 ? 1 : (zza == 0 ? 0 : -1));
                        if (i11 >= 0 && zza <= j6) {
                            if (i11 == 0) {
                                break;
                            }
                            i10 += (int) zza;
                        } else {
                            throw new IllegalStateException(String.valueOf(this.zzd.getClass()) + "#skip returned invalid result: " + zza + "\nThe InputStream implementation is buggy.");
                        }
                    } catch (Throwable th) {
                        this.zzj += i10;
                        zzad();
                        throw th;
                    }
                }
                this.zzj += i10;
                zzad();
                if (i10 < i2) {
                    int i12 = this.zzf;
                    int i13 = i12 - this.zzh;
                    this.zzh = i12;
                    zzg(1);
                    while (true) {
                        int i14 = i2 - i13;
                        int i15 = this.zzf;
                        if (i14 > i15) {
                            i13 += i15;
                            this.zzh = i15;
                            zzg(1);
                        } else {
                            this.zzh = i14;
                            return;
                        }
                    }
                }
            } else {
                zzh((i9 - i7) - i6);
                throw zzalf.zzj();
            }
        } else {
            throw zzalf.zzf();
        }
    }

    private final byte[] zzj(int i2) {
        if (i2 == 0) {
            return zzalb.zzb;
        }
        if (i2 >= 0) {
            int i5 = this.zzj;
            int i6 = this.zzh;
            int i7 = i5 + i6 + i2;
            if (i7 - this.zzb <= 0) {
                int i8 = this.zzk;
                if (i7 <= i8) {
                    int i9 = this.zzf - i6;
                    int i10 = i2 - i9;
                    if (i10 >= 4096 && i10 > zza(this.zzd)) {
                        return null;
                    }
                    byte[] bArr = new byte[i2];
                    System.arraycopy(this.zze, this.zzh, bArr, 0, i9);
                    this.zzj += this.zzf;
                    this.zzh = 0;
                    this.zzf = 0;
                    while (i9 < i2) {
                        int zza = zza(this.zzd, bArr, i9, i2 - i9);
                        if (zza != -1) {
                            this.zzj += zza;
                            i9 += zza;
                        } else {
                            throw zzalf.zzj();
                        }
                    }
                    return bArr;
                }
                zzh((i8 - i5) - i6);
                throw zzalf.zzj();
            }
            throw zzalf.zzi();
        }
        throw zzalf.zzf();
    }

    public final void zzb(int i2) {
        if (this.zzi != i2) {
            throw zzalf.zzb();
        }
    }

    public final void zzc(int i2) {
        this.zzk = i2;
        zzad();
    }

    public final boolean zzd(int i2) {
        int i5 = i2 & 7;
        int i6 = 0;
        if (i5 == 0) {
            if (this.zzf - this.zzh >= 10) {
                while (i6 < 10) {
                    byte[] bArr = this.zze;
                    int i7 = this.zzh;
                    this.zzh = i7 + 1;
                    if (bArr[i7] < 0) {
                        i6++;
                    }
                }
                throw zzalf.zze();
            }
            while (i6 < 10) {
                if (zzy() < 0) {
                    i6++;
                }
            }
            throw zzalf.zze();
            return true;
        } else if (i5 == 1) {
            zzh(8);
            return true;
        } else if (i5 == 2) {
            zzh(zzaa());
            return true;
        } else if (i5 == 3) {
            zzx();
            zzb(((i2 >>> 3) << 3) | 4);
            return true;
        } else if (i5 == 4) {
            zzw();
            return false;
        } else if (i5 == 5) {
            zzh(4);
            return true;
        } else {
            throw zzalf.zza();
        }
    }

    private final boolean zzi(int i2) {
        do {
            int i5 = this.zzh;
            int i6 = i5 + i2;
            int i7 = this.zzf;
            if (i6 > i7) {
                int i8 = this.zzb;
                int i9 = this.zzj;
                if (i2 > (i8 - i9) - i5 || i9 + i5 + i2 > this.zzk) {
                    return false;
                }
                if (i5 > 0) {
                    if (i7 > i5) {
                        byte[] bArr = this.zze;
                        System.arraycopy(bArr, i5, bArr, 0, i7 - i5);
                    }
                    this.zzj += i5;
                    this.zzf -= i5;
                    this.zzh = 0;
                }
                InputStream inputStream = this.zzd;
                byte[] bArr2 = this.zze;
                int i10 = this.zzf;
                int zza = zza(inputStream, bArr2, i10, Math.min(bArr2.length - i10, (this.zzb - this.zzj) - i10));
                if (zza == 0 || zza < -1 || zza > this.zze.length) {
                    throw new IllegalStateException(String.valueOf(this.zzd.getClass()) + "#read(byte[]) returned invalid result: " + zza + "\nThe InputStream implementation is buggy.");
                } else if (zza <= 0) {
                    return false;
                } else {
                    this.zzf += zza;
                    zzad();
                }
            } else {
                throw new IllegalStateException(C0552a.k(i2, "refillBuffer() called when ", " bytes were already available in buffer"));
            }
        } while (this.zzf < i2);
        return true;
    }

    public final int zza(int i2) {
        if (i2 >= 0) {
            int i5 = this.zzj + this.zzh + i2;
            if (i5 >= 0) {
                int i6 = this.zzk;
                if (i5 <= i6) {
                    this.zzk = i5;
                    zzad();
                    return i6;
                }
                throw zzalf.zzj();
            }
            throw zzalf.zzi();
        }
        throw zzalf.zzf();
    }

    private static int zza(InputStream inputStream, byte[] bArr, int i2, int i5) {
        try {
            return inputStream.read(bArr, i2, i5);
        } catch (zzalf e6) {
            e6.zzk();
            throw e6;
        }
    }

    private static long zza(InputStream inputStream, long j6) {
        try {
            return inputStream.skip(j6);
        } catch (zzalf e6) {
            e6.zzk();
            throw e6;
        }
    }

    private final byte[] zza(int i2, boolean z3) {
        byte[] zzj2 = zzj(i2);
        if (zzj2 != null) {
            return zzj2;
        }
        int i5 = this.zzh;
        int i6 = this.zzf;
        int i7 = i6 - i5;
        this.zzj += i6;
        this.zzh = 0;
        this.zzf = 0;
        List<byte[]> zzf2 = zzf(i2 - i7);
        byte[] bArr = new byte[i2];
        System.arraycopy(this.zze, i5, bArr, 0, i7);
        for (byte[] next : zzf2) {
            System.arraycopy(next, 0, bArr, i7, next.length);
            i7 += next.length;
        }
        return bArr;
    }
}
