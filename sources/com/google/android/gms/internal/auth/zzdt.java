package com.google.android.gms.internal.auth;

final class zzdt {
    public static int zza(byte[] bArr, int i2, zzds zzds) {
        int zzj = zzj(bArr, i2, zzds);
        int i5 = zzds.zza;
        if (i5 < 0) {
            throw zzfa.zzc();
        } else if (i5 > bArr.length - zzj) {
            throw zzfa.zzf();
        } else if (i5 == 0) {
            zzds.zzc = zzee.zzb;
            return zzj;
        } else {
            zzds.zzc = zzee.zzk(bArr, zzj, i5);
            return zzj + i5;
        }
    }

    public static int zzb(byte[] bArr, int i2) {
        return ((bArr[i2 + 3] & 255) << 24) | (bArr[i2] & 255) | ((bArr[i2 + 1] & 255) << 8) | ((bArr[i2 + 2] & 255) << 16);
    }

    public static int zzc(zzgh zzgh, byte[] bArr, int i2, int i5, int i6, zzds zzds) {
        zzfz zzfz = (zzfz) zzgh;
        Object zzd = zzfz.zzd();
        int zzb = zzfz.zzb(zzd, bArr, i2, i5, i6, zzds);
        zzfz.zze(zzd);
        zzds.zzc = zzd;
        return zzb;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v2, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v0, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v5, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v6, resolved type: byte} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int zzd(com.google.android.gms.internal.auth.zzgh r6, byte[] r7, int r8, int r9, com.google.android.gms.internal.auth.zzds r10) {
        /*
            int r0 = r8 + 1
            byte r8 = r7[r8]
            if (r8 >= 0) goto L_0x000c
            int r0 = zzk(r8, r7, r0, r10)
            int r8 = r10.zza
        L_0x000c:
            r3 = r0
            if (r8 < 0) goto L_0x0025
            int r9 = r9 - r3
            if (r8 > r9) goto L_0x0025
            java.lang.Object r9 = r6.zzd()
            int r8 = r8 + r3
            r0 = r6
            r1 = r9
            r2 = r7
            r4 = r8
            r5 = r10
            r0.zzg(r1, r2, r3, r4, r5)
            r6.zze(r9)
            r10.zzc = r9
            return r8
        L_0x0025:
            com.google.android.gms.internal.auth.zzfa r6 = com.google.android.gms.internal.auth.zzfa.zzf()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.auth.zzdt.zzd(com.google.android.gms.internal.auth.zzgh, byte[], int, int, com.google.android.gms.internal.auth.zzds):int");
    }

    public static int zze(zzgh zzgh, int i2, byte[] bArr, int i5, int i6, zzey zzey, zzds zzds) {
        int zzd = zzd(zzgh, bArr, i5, i6, zzds);
        zzey.add(zzds.zzc);
        while (zzd < i6) {
            int zzj = zzj(bArr, zzd, zzds);
            if (i2 != zzds.zza) {
                break;
            }
            zzd = zzd(zzgh, bArr, zzj, i6, zzds);
            zzey.add(zzds.zzc);
        }
        return zzd;
    }

    public static int zzf(byte[] bArr, int i2, zzey zzey, zzds zzds) {
        zzev zzev = (zzev) zzey;
        int zzj = zzj(bArr, i2, zzds);
        int i5 = zzds.zza + zzj;
        while (zzj < i5) {
            zzj = zzj(bArr, zzj, zzds);
            zzev.zze(zzds.zza);
        }
        if (zzj == i5) {
            return zzj;
        }
        throw zzfa.zzf();
    }

    public static int zzg(byte[] bArr, int i2, zzds zzds) {
        int zzj = zzj(bArr, i2, zzds);
        int i5 = zzds.zza;
        if (i5 < 0) {
            throw zzfa.zzc();
        } else if (i5 == 0) {
            zzds.zzc = "";
            return zzj;
        } else {
            zzds.zzc = new String(bArr, zzj, i5, zzez.zzb);
            return zzj + i5;
        }
    }

    public static int zzh(byte[] bArr, int i2, zzds zzds) {
        int zzj = zzj(bArr, i2, zzds);
        int i5 = zzds.zza;
        if (i5 < 0) {
            throw zzfa.zzc();
        } else if (i5 == 0) {
            zzds.zzc = "";
            return zzj;
        } else {
            zzds.zzc = zzhm.zzb(bArr, zzj, i5);
            return zzj + i5;
        }
    }

    public static int zzi(int i2, byte[] bArr, int i5, int i6, zzgz zzgz, zzds zzds) {
        if ((i2 >>> 3) != 0) {
            int i7 = i2 & 7;
            if (i7 == 0) {
                int zzm = zzm(bArr, i5, zzds);
                zzgz.zzf(i2, Long.valueOf(zzds.zzb));
                return zzm;
            } else if (i7 == 1) {
                zzgz.zzf(i2, Long.valueOf(zzn(bArr, i5)));
                return i5 + 8;
            } else if (i7 == 2) {
                int zzj = zzj(bArr, i5, zzds);
                int i8 = zzds.zza;
                if (i8 < 0) {
                    throw zzfa.zzc();
                } else if (i8 <= bArr.length - zzj) {
                    if (i8 == 0) {
                        zzgz.zzf(i2, zzee.zzb);
                    } else {
                        zzgz.zzf(i2, zzee.zzk(bArr, zzj, i8));
                    }
                    return zzj + i8;
                } else {
                    throw zzfa.zzf();
                }
            } else if (i7 == 3) {
                int i9 = (i2 & -8) | 4;
                zzgz zzc = zzgz.zzc();
                int i10 = 0;
                while (true) {
                    if (i5 >= i6) {
                        break;
                    }
                    int zzj2 = zzj(bArr, i5, zzds);
                    int i11 = zzds.zza;
                    if (i11 == i9) {
                        i10 = i11;
                        i5 = zzj2;
                        break;
                    }
                    i10 = i11;
                    i5 = zzi(i11, bArr, zzj2, i6, zzc, zzds);
                }
                if (i5 > i6 || i10 != i9) {
                    throw zzfa.zzd();
                }
                zzgz.zzf(i2, zzc);
                return i5;
            } else if (i7 == 5) {
                zzgz.zzf(i2, Integer.valueOf(zzb(bArr, i5)));
                return i5 + 4;
            } else {
                throw zzfa.zza();
            }
        } else {
            throw zzfa.zza();
        }
    }

    public static int zzj(byte[] bArr, int i2, zzds zzds) {
        int i5 = i2 + 1;
        byte b6 = bArr[i2];
        if (b6 < 0) {
            return zzk(b6, bArr, i5, zzds);
        }
        zzds.zza = b6;
        return i5;
    }

    public static int zzk(int i2, byte[] bArr, int i5, zzds zzds) {
        int i6 = i2 & 127;
        int i7 = i5 + 1;
        byte b6 = bArr[i5];
        if (b6 >= 0) {
            zzds.zza = i6 | (b6 << 7);
            return i7;
        }
        int i8 = i6 | ((b6 & Byte.MAX_VALUE) << 7);
        int i9 = i5 + 2;
        byte b7 = bArr[i7];
        if (b7 >= 0) {
            zzds.zza = i8 | (b7 << 14);
            return i9;
        }
        int i10 = i8 | ((b7 & Byte.MAX_VALUE) << 14);
        int i11 = i5 + 3;
        byte b8 = bArr[i9];
        if (b8 >= 0) {
            zzds.zza = i10 | (b8 << 21);
            return i11;
        }
        int i12 = i10 | ((b8 & Byte.MAX_VALUE) << 21);
        int i13 = i5 + 4;
        byte b9 = bArr[i11];
        if (b9 >= 0) {
            zzds.zza = i12 | (b9 << 28);
            return i13;
        }
        int i14 = i12 | ((b9 & Byte.MAX_VALUE) << 28);
        while (true) {
            int i15 = i13 + 1;
            if (bArr[i13] < 0) {
                i13 = i15;
            } else {
                zzds.zza = i14;
                return i15;
            }
        }
    }

    public static int zzl(int i2, byte[] bArr, int i5, int i6, zzey zzey, zzds zzds) {
        zzev zzev = (zzev) zzey;
        int zzj = zzj(bArr, i5, zzds);
        zzev.zze(zzds.zza);
        while (zzj < i6) {
            int zzj2 = zzj(bArr, zzj, zzds);
            if (i2 != zzds.zza) {
                break;
            }
            zzj = zzj(bArr, zzj2, zzds);
            zzev.zze(zzds.zza);
        }
        return zzj;
    }

    public static int zzm(byte[] bArr, int i2, zzds zzds) {
        int i5 = i2 + 1;
        long j6 = (long) bArr[i2];
        if (j6 >= 0) {
            zzds.zzb = j6;
            return i5;
        }
        int i6 = i2 + 2;
        byte b6 = bArr[i5];
        long j7 = (j6 & 127) | (((long) (b6 & Byte.MAX_VALUE)) << 7);
        int i7 = 7;
        while (b6 < 0) {
            int i8 = i6 + 1;
            byte b7 = bArr[i6];
            i7 += 7;
            j7 |= ((long) (b7 & Byte.MAX_VALUE)) << i7;
            int i9 = i8;
            b6 = b7;
            i6 = i9;
        }
        zzds.zzb = j7;
        return i6;
    }

    public static long zzn(byte[] bArr, int i2) {
        return ((((long) bArr[i2 + 7]) & 255) << 56) | (((long) bArr[i2]) & 255) | ((((long) bArr[i2 + 1]) & 255) << 8) | ((((long) bArr[i2 + 2]) & 255) << 16) | ((((long) bArr[i2 + 3]) & 255) << 24) | ((((long) bArr[i2 + 4]) & 255) << 32) | ((((long) bArr[i2 + 5]) & 255) << 40) | ((((long) bArr[i2 + 6]) & 255) << 48);
    }
}
