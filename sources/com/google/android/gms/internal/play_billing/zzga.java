package com.google.android.gms.internal.play_billing;

final class zzga {
    public static final /* synthetic */ int zza = 0;
    private static volatile int zzb = 100;

    public static int zza(byte[] bArr, int i2, zzfz zzfz) {
        int zzh = zzh(bArr, i2, zzfz);
        int i5 = zzfz.zza;
        if (i5 < 0) {
            throw new zzhr("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        } else if (i5 > bArr.length - zzh) {
            throw new zzhr("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        } else if (i5 == 0) {
            zzfz.zzc = zzgk.zzb;
            return zzh;
        } else {
            zzfz.zzc = zzgk.zzj(bArr, zzh, i5);
            return zzh + i5;
        }
    }

    public static int zzb(byte[] bArr, int i2) {
        int i5 = (bArr[i2 + 1] & 255) << 8;
        return ((bArr[i2 + 3] & 255) << 24) | i5 | (bArr[i2] & 255) | ((bArr[i2 + 2] & 255) << 16);
    }

    public static int zzc(zzix zzix, byte[] bArr, int i2, int i5, int i6, zzfz zzfz) {
        Object zze = zzix.zze();
        int zzl = zzl(zze, zzix, bArr, i2, i5, i6, zzfz);
        zzix.zzf(zze);
        zzfz.zzc = zze;
        return zzl;
    }

    public static int zzd(zzix zzix, byte[] bArr, int i2, int i5, zzfz zzfz) {
        Object zze = zzix.zze();
        int zzm = zzm(zze, zzix, bArr, i2, i5, zzfz);
        zzix.zzf(zze);
        zzfz.zzc = zze;
        return zzm;
    }

    public static int zze(zzix zzix, int i2, byte[] bArr, int i5, int i6, zzho zzho, zzfz zzfz) {
        int zzd = zzd(zzix, bArr, i5, i6, zzfz);
        zzho.add(zzfz.zzc);
        while (zzd < i6) {
            int zzh = zzh(bArr, zzd, zzfz);
            if (i2 != zzfz.zza) {
                break;
            }
            zzd = zzd(zzix, bArr, zzh, i6, zzfz);
            zzho.add(zzfz.zzc);
        }
        return zzd;
    }

    public static int zzf(byte[] bArr, int i2, zzho zzho, zzfz zzfz) {
        zzhl zzhl = (zzhl) zzho;
        int zzh = zzh(bArr, i2, zzfz);
        int i5 = zzfz.zza + zzh;
        while (zzh < i5) {
            zzh = zzh(bArr, zzh, zzfz);
            zzhl.zzg(zzfz.zza);
        }
        if (zzh == i5) {
            return zzh;
        }
        throw new zzhr("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    public static int zzg(int i2, byte[] bArr, int i5, int i6, zzjk zzjk, zzfz zzfz) {
        if ((i2 >>> 3) != 0) {
            int i7 = i2 & 7;
            if (i7 == 0) {
                int zzk = zzk(bArr, i5, zzfz);
                zzjk.zzj(i2, Long.valueOf(zzfz.zzb));
                return zzk;
            } else if (i7 == 1) {
                zzjk.zzj(i2, Long.valueOf(zzn(bArr, i5)));
                return i5 + 8;
            } else if (i7 == 2) {
                int zzh = zzh(bArr, i5, zzfz);
                int i8 = zzfz.zza;
                if (i8 < 0) {
                    throw new zzhr("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                } else if (i8 <= bArr.length - zzh) {
                    if (i8 == 0) {
                        zzjk.zzj(i2, zzgk.zzb);
                    } else {
                        zzjk.zzj(i2, zzgk.zzj(bArr, zzh, i8));
                    }
                    return zzh + i8;
                } else {
                    throw new zzhr("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                }
            } else if (i7 == 3) {
                int i9 = (i2 & -8) | 4;
                zzjk zzf = zzjk.zzf();
                int i10 = zzfz.zze + 1;
                zzfz.zze = i10;
                zzo(i10);
                int i11 = 0;
                while (true) {
                    if (i5 >= i6) {
                        break;
                    }
                    int zzh2 = zzh(bArr, i5, zzfz);
                    i11 = zzfz.zza;
                    if (i11 == i9) {
                        i5 = zzh2;
                        break;
                    }
                    i5 = zzg(i11, bArr, zzh2, i6, zzf, zzfz);
                }
                zzfz.zze--;
                if (i5 > i6 || i11 != i9) {
                    throw new zzhr("Failed to parse the message.");
                }
                zzjk.zzj(i2, zzf);
                return i5;
            } else if (i7 == 5) {
                zzjk.zzj(i2, Integer.valueOf(zzb(bArr, i5)));
                return i5 + 4;
            } else {
                throw new zzhr("Protocol message contained an invalid tag (zero).");
            }
        } else {
            throw new zzhr("Protocol message contained an invalid tag (zero).");
        }
    }

    public static int zzh(byte[] bArr, int i2, zzfz zzfz) {
        int i5 = i2 + 1;
        byte b6 = bArr[i2];
        if (b6 < 0) {
            return zzi(b6, bArr, i5, zzfz);
        }
        zzfz.zza = b6;
        return i5;
    }

    public static int zzi(int i2, byte[] bArr, int i5, zzfz zzfz) {
        byte b6 = bArr[i5];
        int i6 = i5 + 1;
        int i7 = i2 & 127;
        if (b6 >= 0) {
            zzfz.zza = i7 | (b6 << 7);
            return i6;
        }
        int i8 = i7 | ((b6 & Byte.MAX_VALUE) << 7);
        int i9 = i5 + 2;
        byte b7 = bArr[i6];
        if (b7 >= 0) {
            zzfz.zza = i8 | (b7 << 14);
            return i9;
        }
        int i10 = i8 | ((b7 & Byte.MAX_VALUE) << 14);
        int i11 = i5 + 3;
        byte b8 = bArr[i9];
        if (b8 >= 0) {
            zzfz.zza = i10 | (b8 << 21);
            return i11;
        }
        int i12 = i10 | ((b8 & Byte.MAX_VALUE) << 21);
        int i13 = i5 + 4;
        byte b9 = bArr[i11];
        if (b9 >= 0) {
            zzfz.zza = i12 | (b9 << 28);
            return i13;
        }
        int i14 = i12 | ((b9 & Byte.MAX_VALUE) << 28);
        while (true) {
            int i15 = i13 + 1;
            if (bArr[i13] < 0) {
                i13 = i15;
            } else {
                zzfz.zza = i14;
                return i15;
            }
        }
    }

    public static int zzj(int i2, byte[] bArr, int i5, int i6, zzho zzho, zzfz zzfz) {
        zzhl zzhl = (zzhl) zzho;
        int zzh = zzh(bArr, i5, zzfz);
        zzhl.zzg(zzfz.zza);
        while (zzh < i6) {
            int zzh2 = zzh(bArr, zzh, zzfz);
            if (i2 != zzfz.zza) {
                break;
            }
            zzh = zzh(bArr, zzh2, zzfz);
            zzhl.zzg(zzfz.zza);
        }
        return zzh;
    }

    public static int zzk(byte[] bArr, int i2, zzfz zzfz) {
        long j6 = (long) bArr[i2];
        int i5 = i2 + 1;
        if (j6 >= 0) {
            zzfz.zzb = j6;
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
        zzfz.zzb = j7;
        return i6;
    }

    public static int zzl(Object obj, zzix zzix, byte[] bArr, int i2, int i5, int i6, zzfz zzfz) {
        int i7 = zzfz.zze + 1;
        zzfz.zze = i7;
        zzo(i7);
        int zzc = ((zzip) zzix).zzc(obj, bArr, i2, i5, i6, zzfz);
        zzfz.zze--;
        zzfz.zzc = obj;
        return zzc;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v2, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v0, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v5, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v6, resolved type: byte} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int zzm(java.lang.Object r6, com.google.android.gms.internal.play_billing.zzix r7, byte[] r8, int r9, int r10, com.google.android.gms.internal.play_billing.zzfz r11) {
        /*
            int r0 = r9 + 1
            byte r9 = r8[r9]
            if (r9 >= 0) goto L_0x000c
            int r0 = zzi(r9, r8, r0, r11)
            int r9 = r11.zza
        L_0x000c:
            r3 = r0
            if (r9 < 0) goto L_0x002d
            int r10 = r10 - r3
            if (r9 > r10) goto L_0x002d
            int r10 = r11.zze
            int r10 = r10 + 1
            r11.zze = r10
            zzo(r10)
            int r9 = r9 + r3
            r0 = r7
            r1 = r6
            r2 = r8
            r4 = r9
            r5 = r11
            r0.zzh(r1, r2, r3, r4, r5)
            int r7 = r11.zze
            int r7 = r7 + -1
            r11.zze = r7
            r11.zzc = r6
            return r9
        L_0x002d:
            com.google.android.gms.internal.play_billing.zzhr r6 = new com.google.android.gms.internal.play_billing.zzhr
            java.lang.String r7 = "While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length."
            r6.<init>((java.lang.String) r7)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.play_billing.zzga.zzm(java.lang.Object, com.google.android.gms.internal.play_billing.zzix, byte[], int, int, com.google.android.gms.internal.play_billing.zzfz):int");
    }

    public static long zzn(byte[] bArr, int i2) {
        return (((long) bArr[i2]) & 255) | ((((long) bArr[i2 + 1]) & 255) << 8) | ((((long) bArr[i2 + 2]) & 255) << 16) | ((((long) bArr[i2 + 3]) & 255) << 24) | ((((long) bArr[i2 + 4]) & 255) << 32) | ((((long) bArr[i2 + 5]) & 255) << 40) | ((((long) bArr[i2 + 6]) & 255) << 48) | ((((long) bArr[i2 + 7]) & 255) << 56);
    }

    private static void zzo(int i2) {
        if (i2 >= zzb) {
            throw new zzhr("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
    }
}
