package com.google.android.recaptcha.internal;

import com.google.android.gms.common.api.f;
import h0.C0552a;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

final class zzlg extends zzli {
    private final InputStream zze;
    private final byte[] zzf;
    private int zzg;
    private int zzh;
    private int zzi;
    private int zzj;
    private int zzk;
    private int zzl = f.API_PRIORITY_OTHER;

    public /* synthetic */ zzlg(InputStream inputStream, int i2, zzlh zzlh) {
        super((zzlh) null);
        byte[] bArr = zznl.zzb;
        this.zze = inputStream;
        this.zzf = new byte[4096];
        this.zzg = 0;
        this.zzi = 0;
        this.zzk = 0;
    }

    private final List zzJ(int i2) {
        ArrayList arrayList = new ArrayList();
        while (i2 > 0) {
            int min = Math.min(i2, 4096);
            byte[] bArr = new byte[min];
            int i5 = 0;
            while (i5 < min) {
                int read = this.zze.read(bArr, i5, min - i5);
                if (read != -1) {
                    this.zzk += read;
                    i5 += read;
                } else {
                    throw new zznn("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                }
            }
            i2 -= min;
            arrayList.add(bArr);
        }
        return arrayList;
    }

    private final void zzK() {
        int i2 = this.zzg + this.zzh;
        this.zzg = i2;
        int i5 = this.zzk + i2;
        int i6 = this.zzl;
        if (i5 > i6) {
            int i7 = i5 - i6;
            this.zzh = i7;
            this.zzg = i2 - i7;
            return;
        }
        this.zzh = 0;
    }

    private final void zzL(int i2) {
        if (zzM(i2)) {
            return;
        }
        if (i2 > (f.API_PRIORITY_OTHER - this.zzk) - this.zzi) {
            throw new zznn("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
        }
        throw new zznn("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    private final boolean zzM(int i2) {
        int i5 = this.zzi;
        int i6 = i5 + i2;
        int i7 = this.zzg;
        if (i6 > i7) {
            int i8 = this.zzk;
            if (i2 > (f.API_PRIORITY_OTHER - i8) - i5 || i8 + i5 + i2 > this.zzl) {
                return false;
            }
            if (i5 > 0) {
                if (i7 > i5) {
                    byte[] bArr = this.zzf;
                    System.arraycopy(bArr, i5, bArr, 0, i7 - i5);
                }
                i8 = this.zzk + i5;
                this.zzk = i8;
                i7 = this.zzg - i5;
                this.zzg = i7;
                this.zzi = 0;
            }
            try {
                int read = this.zze.read(this.zzf, i7, Math.min(4096 - i7, (f.API_PRIORITY_OTHER - i8) - i7));
                if (read == 0 || read < -1 || read > 4096) {
                    throw new IllegalStateException(String.valueOf(this.zze.getClass()) + "#read(byte[]) returned invalid result: " + read + "\nThe InputStream implementation is buggy.");
                } else if (read <= 0) {
                    return false;
                } else {
                    this.zzg += read;
                    zzK();
                    if (this.zzg >= i2) {
                        return true;
                    }
                    return zzM(i2);
                }
            } catch (zznn e6) {
                e6.zza();
                throw e6;
            }
        } else {
            throw new IllegalStateException(C0552a.k(i2, "refillBuffer() called when ", " bytes were already available in buffer"));
        }
    }

    private final byte[] zzN(int i2, boolean z3) {
        byte[] zzO = zzO(i2);
        if (zzO != null) {
            return zzO;
        }
        int i5 = this.zzi;
        int i6 = this.zzg;
        int i7 = i6 - i5;
        this.zzk += i6;
        this.zzi = 0;
        this.zzg = 0;
        List<byte[]> zzJ = zzJ(i2 - i7);
        byte[] bArr = new byte[i2];
        System.arraycopy(this.zzf, i5, bArr, 0, i7);
        for (byte[] bArr2 : zzJ) {
            int length = bArr2.length;
            System.arraycopy(bArr2, 0, bArr, i7, length);
            i7 += length;
        }
        return bArr;
    }

    private final byte[] zzO(int i2) {
        if (i2 == 0) {
            return zznl.zzb;
        }
        int i5 = this.zzk;
        int i6 = this.zzi;
        int i7 = i5 + i6 + i2;
        if (-2147483647 + i7 <= 0) {
            int i8 = this.zzl;
            if (i7 <= i8) {
                int i9 = this.zzg - i6;
                int i10 = i2 - i9;
                if (i10 >= 4096) {
                    try {
                        if (i10 > this.zze.available()) {
                            return null;
                        }
                    } catch (zznn e6) {
                        e6.zza();
                        throw e6;
                    }
                }
                byte[] bArr = new byte[i2];
                System.arraycopy(this.zzf, this.zzi, bArr, 0, i9);
                this.zzk += this.zzg;
                this.zzi = 0;
                this.zzg = 0;
                while (i9 < i2) {
                    try {
                        int read = this.zze.read(bArr, i9, i2 - i9);
                        if (read != -1) {
                            this.zzk += read;
                            i9 += read;
                        } else {
                            throw new zznn("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                        }
                    } catch (zznn e7) {
                        e7.zza();
                        throw e7;
                    }
                }
                return bArr;
            }
            zzB((i8 - i5) - i6);
            throw new zznn("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        throw new zznn("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
    }

    public final void zzA(int i2) {
        this.zzl = i2;
        zzK();
    }

    public final void zzB(int i2) {
        int i5 = this.zzg;
        int i6 = this.zzi;
        int i7 = i5 - i6;
        if (i2 <= i7 && i2 >= 0) {
            this.zzi = i6 + i2;
        } else if (i2 >= 0) {
            int i8 = this.zzk;
            int i9 = i8 + i6;
            int i10 = this.zzl;
            if (i9 + i2 <= i10) {
                this.zzk = i9;
                this.zzg = 0;
                this.zzi = 0;
                while (i7 < i2) {
                    try {
                        long j6 = (long) (i2 - i7);
                        long skip = this.zze.skip(j6);
                        int i11 = (skip > 0 ? 1 : (skip == 0 ? 0 : -1));
                        if (i11 < 0 || skip > j6) {
                            throw new IllegalStateException(String.valueOf(this.zze.getClass()) + "#skip returned invalid result: " + skip + "\nThe InputStream implementation is buggy.");
                        } else if (i11 == 0) {
                            break;
                        } else {
                            i7 += (int) skip;
                        }
                    } catch (zznn e6) {
                        e6.zza();
                        throw e6;
                    } catch (Throwable th) {
                        this.zzk += i7;
                        zzK();
                        throw th;
                    }
                }
                this.zzk += i7;
                zzK();
                if (i7 < i2) {
                    int i12 = this.zzg;
                    int i13 = i12 - this.zzi;
                    this.zzi = i12;
                    zzL(1);
                    while (true) {
                        int i14 = i2 - i13;
                        int i15 = this.zzg;
                        if (i14 > i15) {
                            i13 += i15;
                            this.zzi = i15;
                            zzL(1);
                        } else {
                            this.zzi = i14;
                            return;
                        }
                    }
                }
            } else {
                zzB((i10 - i8) - i6);
                throw new zznn("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            }
        } else {
            throw new zznn("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
    }

    public final boolean zzC() {
        if (this.zzi != this.zzg || zzM(1)) {
            return false;
        }
        return true;
    }

    public final boolean zzD() {
        if (zzr() != 0) {
            return true;
        }
        return false;
    }

    public final boolean zzE(int i2) {
        int i5 = i2 & 7;
        int i6 = 0;
        if (i5 == 0) {
            if (this.zzg - this.zzi >= 10) {
                while (i6 < 10) {
                    byte[] bArr = this.zzf;
                    int i7 = this.zzi;
                    this.zzi = i7 + 1;
                    if (bArr[i7] < 0) {
                        i6++;
                    }
                }
                throw new zznn("CodedInputStream encountered a malformed varint.");
            }
            while (i6 < 10) {
                if (zza() < 0) {
                    i6++;
                }
            }
            throw new zznn("CodedInputStream encountered a malformed varint.");
            return true;
        } else if (i5 == 1) {
            zzB(8);
            return true;
        } else if (i5 == 2) {
            zzB(zzj());
            return true;
        } else if (i5 == 3) {
            zzI();
            zzz(((i2 >>> 3) << 3) | 4);
            return true;
        } else if (i5 == 4) {
            return false;
        } else {
            if (i5 == 5) {
                zzB(4);
                return true;
            }
            throw new zznm("Protocol message tag had invalid wire type.");
        }
    }

    public final byte zza() {
        if (this.zzi == this.zzg) {
            zzL(1);
        }
        byte[] bArr = this.zzf;
        int i2 = this.zzi;
        this.zzi = i2 + 1;
        return bArr[i2];
    }

    public final double zzb() {
        return Double.longBitsToDouble(zzq());
    }

    public final float zzc() {
        return Float.intBitsToFloat(zzi());
    }

    public final int zzd() {
        return this.zzk + this.zzi;
    }

    public final int zze(int i2) {
        if (i2 >= 0) {
            int i5 = this.zzk + this.zzi + i2;
            if (i5 >= 0) {
                int i6 = this.zzl;
                if (i5 <= i6) {
                    this.zzl = i5;
                    zzK();
                    return i6;
                }
                throw new zznn("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            }
            throw new zznn("Failed to parse the message.");
        }
        throw new zznn("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    public final int zzf() {
        return zzj();
    }

    public final int zzg() {
        return zzi();
    }

    public final int zzh() {
        return zzj();
    }

    public final int zzi() {
        int i2 = this.zzi;
        if (this.zzg - i2 < 4) {
            zzL(4);
            i2 = this.zzi;
        }
        byte[] bArr = this.zzf;
        this.zzi = i2 + 4;
        int i5 = (bArr[i2 + 1] & 255) << 8;
        return ((bArr[i2 + 3] & 255) << 24) | i5 | (bArr[i2] & 255) | ((bArr[i2 + 2] & 255) << 16);
    }

    public final int zzj() {
        byte b6;
        byte b7;
        int i2 = this.zzi;
        int i5 = this.zzg;
        if (i5 != i2) {
            byte[] bArr = this.zzf;
            int i6 = i2 + 1;
            byte b8 = bArr[i2];
            if (b8 >= 0) {
                this.zzi = i6;
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
                this.zzi = i7;
                return b6;
            }
        }
        return (int) zzs();
    }

    public final int zzk() {
        return zzi();
    }

    public final int zzl() {
        return zzli.zzF(zzj());
    }

    public final int zzm() {
        if (zzC()) {
            this.zzj = 0;
            return 0;
        }
        int zzj2 = zzj();
        this.zzj = zzj2;
        if ((zzj2 >>> 3) != 0) {
            return zzj2;
        }
        throw new zznn("Protocol message contained an invalid tag (zero).");
    }

    public final int zzn() {
        return zzj();
    }

    public final long zzo() {
        return zzq();
    }

    public final long zzp() {
        return zzr();
    }

    public final long zzq() {
        int i2 = this.zzi;
        if (this.zzg - i2 < 8) {
            zzL(8);
            i2 = this.zzi;
        }
        byte[] bArr = this.zzf;
        this.zzi = i2 + 8;
        long j6 = (long) bArr[i2 + 2];
        long j7 = (long) bArr[i2 + 3];
        long j8 = (long) bArr[i2 + 4];
        long j9 = (long) bArr[i2 + 5];
        long j10 = (long) bArr[i2 + 6];
        long j11 = (((long) bArr[i2]) & 255) | ((((long) bArr[i2 + 1]) & 255) << 8) | ((j6 & 255) << 16) | ((j7 & 255) << 24);
        return ((((long) bArr[i2 + 7]) & 255) << 56) | j11 | ((j8 & 255) << 32) | ((j9 & 255) << 40) | ((j10 & 255) << 48);
    }

    public final long zzr() {
        long j6;
        long j7;
        long j8;
        int i2 = this.zzi;
        int i5 = this.zzg;
        if (i5 != i2) {
            byte[] bArr = this.zzf;
            int i6 = i2 + 1;
            byte b6 = bArr[i2];
            if (b6 >= 0) {
                this.zzi = i6;
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
                    } else {
                        int i9 = i2 + 4;
                        byte b9 = b8 ^ (bArr[i8] << 21);
                        if (b9 < 0) {
                            i7 = i9;
                            j6 = (long) (-2080896 ^ b9);
                        } else {
                            i8 = i2 + 5;
                            long j9 = (((long) bArr[i9]) << 28) ^ ((long) b9);
                            if (j9 >= 0) {
                                j6 = j9 ^ 266354560;
                            } else {
                                i7 = i2 + 6;
                                long j10 = (((long) bArr[i8]) << 35) ^ j9;
                                if (j10 < 0) {
                                    j8 = -34093383808L;
                                } else {
                                    int i10 = i2 + 7;
                                    long j11 = j10 ^ (((long) bArr[i7]) << 42);
                                    if (j11 >= 0) {
                                        j7 = j11 ^ 4363953127296L;
                                    } else {
                                        i7 = i2 + 8;
                                        j10 = j11 ^ (((long) bArr[i10]) << 49);
                                        if (j10 < 0) {
                                            j8 = -558586000294016L;
                                        } else {
                                            i10 = i2 + 9;
                                            long j12 = (j10 ^ (((long) bArr[i7]) << 56)) ^ 71499008037633920L;
                                            if (j12 < 0) {
                                                i7 = i2 + 10;
                                                if (((long) bArr[i10]) >= 0) {
                                                    j6 = j12;
                                                }
                                            } else {
                                                j7 = j12;
                                            }
                                        }
                                    }
                                    i7 = i10;
                                }
                                j6 = j10 ^ j8;
                            }
                        }
                    }
                    i7 = i8;
                }
                this.zzi = i7;
                return j6;
            }
        }
        return zzs();
    }

    public final long zzs() {
        long j6 = 0;
        for (int i2 = 0; i2 < 64; i2 += 7) {
            byte zza = zza();
            j6 |= ((long) (zza & Byte.MAX_VALUE)) << i2;
            if ((zza & 128) == 0) {
                return j6;
            }
        }
        throw new zznn("CodedInputStream encountered a malformed varint.");
    }

    public final long zzt() {
        return zzq();
    }

    public final long zzu() {
        return zzli.zzG(zzr());
    }

    public final long zzv() {
        return zzr();
    }

    public final zzle zzw() {
        int zzj2 = zzj();
        int i2 = this.zzg;
        int i5 = this.zzi;
        if (zzj2 <= i2 - i5 && zzj2 > 0) {
            zzle zzk2 = zzle.zzk(this.zzf, i5, zzj2);
            this.zzi += zzj2;
            return zzk2;
        } else if (zzj2 == 0) {
            return zzle.zzb;
        } else {
            if (zzj2 >= 0) {
                byte[] zzO = zzO(zzj2);
                if (zzO != null) {
                    return zzle.zzk(zzO, 0, zzO.length);
                }
                int i6 = this.zzi;
                int i7 = this.zzg;
                int i8 = i7 - i6;
                this.zzk += i7;
                this.zzi = 0;
                this.zzg = 0;
                List<byte[]> zzJ = zzJ(zzj2 - i8);
                byte[] bArr = new byte[zzj2];
                System.arraycopy(this.zzf, i6, bArr, 0, i8);
                for (byte[] bArr2 : zzJ) {
                    int length = bArr2.length;
                    System.arraycopy(bArr2, 0, bArr, i8, length);
                    i8 += length;
                }
                return new zzlc(bArr);
            }
            throw new zznn("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
    }

    public final String zzx() {
        int zzj2 = zzj();
        if (zzj2 > 0) {
            int i2 = this.zzg;
            int i5 = this.zzi;
            if (zzj2 <= i2 - i5) {
                String str = new String(this.zzf, i5, zzj2, zznl.zza);
                this.zzi += zzj2;
                return str;
            }
        }
        if (zzj2 == 0) {
            return "";
        }
        if (zzj2 < 0) {
            throw new zznn("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        } else if (zzj2 > this.zzg) {
            return new String(zzN(zzj2, false), zznl.zza);
        } else {
            zzL(zzj2);
            String str2 = new String(this.zzf, this.zzi, zzj2, zznl.zza);
            this.zzi += zzj2;
            return str2;
        }
    }

    public final String zzy() {
        byte[] bArr;
        int zzj2 = zzj();
        int i2 = this.zzi;
        int i5 = this.zzg;
        if (zzj2 <= i5 - i2 && zzj2 > 0) {
            bArr = this.zzf;
            this.zzi = i2 + zzj2;
        } else if (zzj2 == 0) {
            return "";
        } else {
            if (zzj2 >= 0) {
                i2 = 0;
                if (zzj2 <= i5) {
                    zzL(zzj2);
                    bArr = this.zzf;
                    this.zzi = zzj2;
                } else {
                    bArr = zzN(zzj2, false);
                }
            } else {
                throw new zznn("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
            }
        }
        return zzpv.zzd(bArr, i2, zzj2);
    }

    public final void zzz(int i2) {
        if (this.zzj != i2) {
            throw new zznn("Protocol message end-group tag did not match expected tag.");
        }
    }
}
