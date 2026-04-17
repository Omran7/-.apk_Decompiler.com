package com.google.android.recaptcha.internal;

import com.google.android.gms.common.api.f;
import java.util.Arrays;

final class zzlf extends zzli {
    private final byte[] zze;
    private int zzf;
    private int zzg;
    private int zzh;
    private int zzi;
    private int zzj = f.API_PRIORITY_OTHER;

    public /* synthetic */ zzlf(byte[] bArr, int i2, int i5, boolean z3, zzlh zzlh) {
        super((zzlh) null);
        this.zze = bArr;
        this.zzf = 0;
        this.zzh = 0;
    }

    private final void zzJ() {
        int i2 = this.zzf + this.zzg;
        this.zzf = i2;
        int i5 = this.zzj;
        if (i2 > i5) {
            int i6 = i2 - i5;
            this.zzg = i6;
            this.zzf = i2 - i6;
            return;
        }
        this.zzg = 0;
    }

    public final void zzA(int i2) {
        this.zzj = i2;
        zzJ();
    }

    public final void zzB(int i2) {
        if (i2 >= 0) {
            int i5 = this.zzf;
            int i6 = this.zzh;
            if (i2 <= i5 - i6) {
                this.zzh = i6 + i2;
                return;
            }
        }
        if (i2 < 0) {
            throw new zznn("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        throw new zznn("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    public final boolean zzC() {
        return this.zzh == this.zzf;
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
            if (this.zzf - this.zzh >= 10) {
                while (i6 < 10) {
                    byte[] bArr = this.zze;
                    int i7 = this.zzh;
                    this.zzh = i7 + 1;
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
        int i2 = this.zzh;
        if (i2 != this.zzf) {
            byte[] bArr = this.zze;
            this.zzh = i2 + 1;
            return bArr[i2];
        }
        throw new zznn("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    public final double zzb() {
        return Double.longBitsToDouble(zzq());
    }

    public final float zzc() {
        return Float.intBitsToFloat(zzi());
    }

    public final int zzd() {
        return this.zzh;
    }

    public final int zze(int i2) {
        if (i2 >= 0) {
            int i5 = i2 + this.zzh;
            if (i5 >= 0) {
                int i6 = this.zzj;
                if (i5 <= i6) {
                    this.zzj = i5;
                    zzJ();
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
        int i2 = this.zzh;
        if (this.zzf - i2 >= 4) {
            byte[] bArr = this.zze;
            this.zzh = i2 + 4;
            int i5 = (bArr[i2 + 1] & 255) << 8;
            return ((bArr[i2 + 3] & 255) << 24) | i5 | (bArr[i2] & 255) | ((bArr[i2 + 2] & 255) << 16);
        }
        throw new zznn("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    public final int zzj() {
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
            this.zzi = 0;
            return 0;
        }
        int zzj2 = zzj();
        this.zzi = zzj2;
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
        int i2 = this.zzh;
        if (this.zzf - i2 >= 8) {
            byte[] bArr = this.zze;
            this.zzh = i2 + 8;
            long j6 = (long) bArr[i2 + 2];
            long j7 = (long) bArr[i2 + 3];
            long j8 = (long) bArr[i2 + 4];
            long j9 = (long) bArr[i2 + 5];
            long j10 = (long) bArr[i2 + 6];
            long j11 = (((long) bArr[i2]) & 255) | ((((long) bArr[i2 + 1]) & 255) << 8) | ((j6 & 255) << 16) | ((j7 & 255) << 24);
            return ((((long) bArr[i2 + 7]) & 255) << 56) | j11 | ((j8 & 255) << 32) | ((j9 & 255) << 40) | ((j10 & 255) << 48);
        }
        throw new zznn("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    public final long zzr() {
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
                this.zzh = i7;
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
        if (zzj2 > 0) {
            int i2 = this.zzf;
            int i5 = this.zzh;
            if (zzj2 <= i2 - i5) {
                zzle zzk = zzle.zzk(this.zze, i5, zzj2);
                this.zzh += zzj2;
                return zzk;
            }
        }
        if (zzj2 == 0) {
            return zzle.zzb;
        }
        if (zzj2 > 0) {
            int i6 = this.zzf;
            int i7 = this.zzh;
            if (zzj2 <= i6 - i7) {
                int i8 = zzj2 + i7;
                this.zzh = i8;
                return new zzlc(Arrays.copyOfRange(this.zze, i7, i8));
            }
        }
        if (zzj2 <= 0) {
            throw new zznn("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        throw new zznn("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    public final String zzx() {
        int zzj2 = zzj();
        if (zzj2 > 0) {
            int i2 = this.zzf;
            int i5 = this.zzh;
            if (zzj2 <= i2 - i5) {
                String str = new String(this.zze, i5, zzj2, zznl.zza);
                this.zzh += zzj2;
                return str;
            }
        }
        if (zzj2 == 0) {
            return "";
        }
        if (zzj2 < 0) {
            throw new zznn("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        throw new zznn("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    public final String zzy() {
        int zzj2 = zzj();
        if (zzj2 > 0) {
            int i2 = this.zzf;
            int i5 = this.zzh;
            if (zzj2 <= i2 - i5) {
                String zzd = zzpv.zzd(this.zze, i5, zzj2);
                this.zzh += zzj2;
                return zzd;
            }
        }
        if (zzj2 == 0) {
            return "";
        }
        if (zzj2 <= 0) {
            throw new zznn("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        throw new zznn("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    public final void zzz(int i2) {
        if (this.zzi != i2) {
            throw new zznn("Protocol message end-group tag did not match expected tag.");
        }
    }
}
