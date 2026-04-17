package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.common.api.f;
import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzaka  reason: invalid package */
final class zzaka extends zzakb {
    private final byte[] zzd;
    private int zze;
    private int zzf;
    private int zzg;
    private int zzh;
    private int zzi;
    private int zzj;

    private final int zzaa() {
        byte b6;
        byte b7;
        int i2 = this.zzg;
        int i5 = this.zze;
        if (i5 != i2) {
            byte[] bArr = this.zzd;
            int i6 = i2 + 1;
            byte b8 = bArr[i2];
            if (b8 >= 0) {
                this.zzg = i6;
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
                this.zzg = i7;
                return b6;
            }
        }
        return (int) zzm();
    }

    private final long zzab() {
        int i2 = this.zzg;
        if (this.zze - i2 >= 8) {
            byte[] bArr = this.zzd;
            this.zzg = i2 + 8;
            return ((((long) bArr[i2 + 7]) & 255) << 56) | (((long) bArr[i2]) & 255) | ((((long) bArr[i2 + 1]) & 255) << 8) | ((((long) bArr[i2 + 2]) & 255) << 16) | ((((long) bArr[i2 + 3]) & 255) << 24) | ((((long) bArr[i2 + 4]) & 255) << 32) | ((((long) bArr[i2 + 5]) & 255) << 40) | ((((long) bArr[i2 + 6]) & 255) << 48);
        }
        throw zzalf.zzj();
    }

    private final long zzac() {
        long j6;
        long j7;
        long j8;
        int i2 = this.zzg;
        int i5 = this.zze;
        if (i5 != i2) {
            byte[] bArr = this.zzd;
            int i6 = i2 + 1;
            byte b6 = bArr[i2];
            if (b6 >= 0) {
                this.zzg = i6;
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
                this.zzg = i7;
                return j6;
            }
        }
        return zzm();
    }

    private final void zzad() {
        int i2 = this.zze + this.zzf;
        this.zze = i2;
        int i5 = i2 - this.zzh;
        int i6 = this.zzj;
        if (i5 > i6) {
            int i7 = i5 - i6;
            this.zzf = i7;
            this.zze = i2 - i7;
            return;
        }
        this.zzf = 0;
    }

    private final byte zzy() {
        int i2 = this.zzg;
        if (i2 != this.zze) {
            byte[] bArr = this.zzd;
            this.zzg = i2 + 1;
            return bArr[i2];
        }
        throw zzalf.zzj();
    }

    private final int zzz() {
        int i2 = this.zzg;
        if (this.zze - i2 >= 4) {
            byte[] bArr = this.zzd;
            this.zzg = i2 + 4;
            return ((bArr[i2 + 3] & 255) << 24) | (bArr[i2] & 255) | ((bArr[i2 + 1] & 255) << 8) | ((bArr[i2 + 2] & 255) << 16);
        }
        throw zzalf.zzj();
    }

    public final double zza() {
        return Double.longBitsToDouble(zzab());
    }

    public final float zzb() {
        return Float.intBitsToFloat(zzz());
    }

    public final int zzc() {
        return this.zzg - this.zzh;
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
        byte[] bArr;
        int zzaa = zzaa();
        if (zzaa > 0) {
            int i2 = this.zze;
            int i5 = this.zzg;
            if (zzaa <= i2 - i5) {
                zzajp zza = zzajp.zza(this.zzd, i5, zzaa);
                this.zzg += zzaa;
                return zza;
            }
        }
        if (zzaa == 0) {
            return zzajp.zza;
        }
        if (zzaa > 0) {
            int i6 = this.zze;
            int i7 = this.zzg;
            if (zzaa <= i6 - i7) {
                int i8 = zzaa + i7;
                this.zzg = i8;
                bArr = Arrays.copyOfRange(this.zzd, i7, i8);
                return zzajp.zzb(bArr);
            }
        }
        if (zzaa > 0) {
            throw zzalf.zzj();
        } else if (zzaa == 0) {
            bArr = zzalb.zzb;
            return zzajp.zzb(bArr);
        } else {
            throw zzalf.zzf();
        }
    }

    public final String zzr() {
        int zzaa = zzaa();
        if (zzaa > 0) {
            int i2 = this.zze;
            int i5 = this.zzg;
            if (zzaa <= i2 - i5) {
                String str = new String(this.zzd, i5, zzaa, zzalb.zza);
                this.zzg += zzaa;
                return str;
            }
        }
        if (zzaa == 0) {
            return "";
        }
        if (zzaa < 0) {
            throw zzalf.zzf();
        }
        throw zzalf.zzj();
    }

    public final String zzs() {
        int zzaa = zzaa();
        if (zzaa > 0) {
            int i2 = this.zze;
            int i5 = this.zzg;
            if (zzaa <= i2 - i5) {
                String zzb = zzant.zzb(this.zzd, i5, zzaa);
                this.zzg += zzaa;
                return zzb;
            }
        }
        if (zzaa == 0) {
            return "";
        }
        if (zzaa <= 0) {
            throw zzalf.zzf();
        }
        throw zzalf.zzj();
    }

    public final boolean zzt() {
        if (this.zzg == this.zze) {
            return true;
        }
        return false;
    }

    public final boolean zzu() {
        if (zzac() != 0) {
            return true;
        }
        return false;
    }

    private zzaka(byte[] bArr, int i2, int i5, boolean z3) {
        super();
        this.zzj = f.API_PRIORITY_OTHER;
        this.zzd = bArr;
        this.zze = i5 + i2;
        this.zzg = i2;
        this.zzh = i2;
    }

    private final void zzf(int i2) {
        if (i2 >= 0) {
            int i5 = this.zze;
            int i6 = this.zzg;
            if (i2 <= i5 - i6) {
                this.zzg = i6 + i2;
                return;
            }
        }
        if (i2 < 0) {
            throw zzalf.zzf();
        }
        throw zzalf.zzj();
    }

    public final int zza(int i2) {
        if (i2 >= 0) {
            int zzc = i2 + zzc();
            if (zzc >= 0) {
                int i5 = this.zzj;
                if (zzc <= i5) {
                    this.zzj = zzc;
                    zzad();
                    return i5;
                }
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
        this.zzj = i2;
        zzad();
    }

    public final boolean zzd(int i2) {
        int i5 = i2 & 7;
        int i6 = 0;
        if (i5 == 0) {
            if (this.zze - this.zzg >= 10) {
                while (i6 < 10) {
                    byte[] bArr = this.zzd;
                    int i7 = this.zzg;
                    this.zzg = i7 + 1;
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
            zzf(8);
            return true;
        } else if (i5 == 2) {
            zzf(zzaa());
            return true;
        } else if (i5 == 3) {
            zzx();
            zzb(((i2 >>> 3) << 3) | 4);
            return true;
        } else if (i5 == 4) {
            zzw();
            return false;
        } else if (i5 == 5) {
            zzf(4);
            return true;
        } else {
            throw zzalf.zza();
        }
    }
}
