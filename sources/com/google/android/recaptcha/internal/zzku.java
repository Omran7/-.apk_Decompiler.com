package com.google.android.recaptcha.internal;

final class zzku {
    public static final /* synthetic */ int zza = 0;
    private static volatile int zzb = 100;

    public static int zza(byte[] bArr, int i2, zzkt zzkt) {
        int zzi = zzi(bArr, i2, zzkt);
        int i5 = zzkt.zza;
        if (i5 < 0) {
            throw new zznn("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        } else if (i5 > bArr.length - zzi) {
            throw new zznn("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        } else if (i5 == 0) {
            zzkt.zzc = zzle.zzb;
            return zzi;
        } else {
            zzkt.zzc = zzle.zzk(bArr, zzi, i5);
            return zzi + i5;
        }
    }

    public static int zzb(byte[] bArr, int i2) {
        int i5 = (bArr[i2 + 1] & 255) << 8;
        return ((bArr[i2 + 3] & 255) << 24) | i5 | (bArr[i2] & 255) | ((bArr[i2 + 2] & 255) << 16);
    }

    public static int zzc(zzow zzow, byte[] bArr, int i2, int i5, int i6, zzkt zzkt) {
        Object zze = zzow.zze();
        int zzm = zzm(zze, zzow, bArr, i2, i5, i6, zzkt);
        zzow.zzf(zze);
        zzkt.zzc = zze;
        return zzm;
    }

    public static int zzd(zzow zzow, byte[] bArr, int i2, int i5, zzkt zzkt) {
        Object zze = zzow.zze();
        int zzn = zzn(zze, zzow, bArr, i2, i5, zzkt);
        zzow.zzf(zze);
        zzkt.zzc = zze;
        return zzn;
    }

    public static int zze(zzow zzow, int i2, byte[] bArr, int i5, int i6, zznk zznk, zzkt zzkt) {
        int zzd = zzd(zzow, bArr, i5, i6, zzkt);
        zznk.add(zzkt.zzc);
        while (zzd < i6) {
            int zzi = zzi(bArr, zzd, zzkt);
            if (i2 != zzkt.zza) {
                break;
            }
            zzd = zzd(zzow, bArr, zzi, i6, zzkt);
            zznk.add(zzkt.zzc);
        }
        return zzd;
    }

    public static int zzf(byte[] bArr, int i2, zznk zznk, zzkt zzkt) {
        zzne zzne = (zzne) zznk;
        int zzi = zzi(bArr, i2, zzkt);
        int i5 = zzkt.zza + zzi;
        while (zzi < i5) {
            zzi = zzi(bArr, zzi, zzkt);
            zzne.zzh(zzkt.zza);
        }
        if (zzi == i5) {
            return zzi;
        }
        throw new zznn("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    public static int zzg(byte[] bArr, int i2, zzkt zzkt) {
        int zzi = zzi(bArr, i2, zzkt);
        int i5 = zzkt.zza;
        if (i5 < 0) {
            throw new zznn("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        } else if (i5 == 0) {
            zzkt.zzc = "";
            return zzi;
        } else {
            zzkt.zzc = new String(bArr, zzi, i5, zznl.zza);
            return zzi + i5;
        }
    }

    public static int zzh(int i2, byte[] bArr, int i5, int i6, zzpm zzpm, zzkt zzkt) {
        if ((i2 >>> 3) != 0) {
            int i7 = i2 & 7;
            if (i7 == 0) {
                int zzl = zzl(bArr, i5, zzkt);
                zzpm.zzj(i2, Long.valueOf(zzkt.zzb));
                return zzl;
            } else if (i7 == 1) {
                zzpm.zzj(i2, Long.valueOf(zzp(bArr, i5)));
                return i5 + 8;
            } else if (i7 == 2) {
                int zzi = zzi(bArr, i5, zzkt);
                int i8 = zzkt.zza;
                if (i8 < 0) {
                    throw new zznn("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                } else if (i8 <= bArr.length - zzi) {
                    if (i8 == 0) {
                        zzpm.zzj(i2, zzle.zzb);
                    } else {
                        zzpm.zzj(i2, zzle.zzk(bArr, zzi, i8));
                    }
                    return zzi + i8;
                } else {
                    throw new zznn("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                }
            } else if (i7 == 3) {
                int i9 = (i2 & -8) | 4;
                zzpm zzf = zzpm.zzf();
                int i10 = zzkt.zze + 1;
                zzkt.zze = i10;
                zzq(i10);
                int i11 = 0;
                while (true) {
                    if (i5 >= i6) {
                        break;
                    }
                    int zzi2 = zzi(bArr, i5, zzkt);
                    i11 = zzkt.zza;
                    if (i11 == i9) {
                        i5 = zzi2;
                        break;
                    }
                    i5 = zzh(i11, bArr, zzi2, i6, zzf, zzkt);
                }
                zzkt.zze--;
                if (i5 > i6 || i11 != i9) {
                    throw new zznn("Failed to parse the message.");
                }
                zzpm.zzj(i2, zzf);
                return i5;
            } else if (i7 == 5) {
                zzpm.zzj(i2, Integer.valueOf(zzb(bArr, i5)));
                return i5 + 4;
            } else {
                throw new zznn("Protocol message contained an invalid tag (zero).");
            }
        } else {
            throw new zznn("Protocol message contained an invalid tag (zero).");
        }
    }

    public static int zzi(byte[] bArr, int i2, zzkt zzkt) {
        int i5 = i2 + 1;
        byte b6 = bArr[i2];
        if (b6 < 0) {
            return zzj(b6, bArr, i5, zzkt);
        }
        zzkt.zza = b6;
        return i5;
    }

    public static int zzj(int i2, byte[] bArr, int i5, zzkt zzkt) {
        byte b6 = bArr[i5];
        int i6 = i5 + 1;
        int i7 = i2 & 127;
        if (b6 >= 0) {
            zzkt.zza = i7 | (b6 << 7);
            return i6;
        }
        int i8 = i7 | ((b6 & Byte.MAX_VALUE) << 7);
        int i9 = i5 + 2;
        byte b7 = bArr[i6];
        if (b7 >= 0) {
            zzkt.zza = i8 | (b7 << 14);
            return i9;
        }
        int i10 = i8 | ((b7 & Byte.MAX_VALUE) << 14);
        int i11 = i5 + 3;
        byte b8 = bArr[i9];
        if (b8 >= 0) {
            zzkt.zza = i10 | (b8 << 21);
            return i11;
        }
        int i12 = i10 | ((b8 & Byte.MAX_VALUE) << 21);
        int i13 = i5 + 4;
        byte b9 = bArr[i11];
        if (b9 >= 0) {
            zzkt.zza = i12 | (b9 << 28);
            return i13;
        }
        int i14 = i12 | ((b9 & Byte.MAX_VALUE) << 28);
        while (true) {
            int i15 = i13 + 1;
            if (bArr[i13] < 0) {
                i13 = i15;
            } else {
                zzkt.zza = i14;
                return i15;
            }
        }
    }

    public static int zzk(int i2, byte[] bArr, int i5, int i6, zznk zznk, zzkt zzkt) {
        zzne zzne = (zzne) zznk;
        int zzi = zzi(bArr, i5, zzkt);
        zzne.zzh(zzkt.zza);
        while (zzi < i6) {
            int zzi2 = zzi(bArr, zzi, zzkt);
            if (i2 != zzkt.zza) {
                break;
            }
            zzi = zzi(bArr, zzi2, zzkt);
            zzne.zzh(zzkt.zza);
        }
        return zzi;
    }

    public static int zzl(byte[] bArr, int i2, zzkt zzkt) {
        long j6 = (long) bArr[i2];
        int i5 = i2 + 1;
        if (j6 >= 0) {
            zzkt.zzb = j6;
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
        zzkt.zzb = j7;
        return i6;
    }

    public static int zzm(Object obj, zzow zzow, byte[] bArr, int i2, int i5, int i6, zzkt zzkt) {
        int i7 = zzkt.zze + 1;
        zzkt.zze = i7;
        zzq(i7);
        int zzc = ((zzol) zzow).zzc(obj, bArr, i2, i5, i6, zzkt);
        zzkt.zze--;
        zzkt.zzc = obj;
        return zzc;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v2, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v0, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v5, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v6, resolved type: byte} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int zzn(java.lang.Object r6, com.google.android.recaptcha.internal.zzow r7, byte[] r8, int r9, int r10, com.google.android.recaptcha.internal.zzkt r11) {
        /*
            int r0 = r9 + 1
            byte r9 = r8[r9]
            if (r9 >= 0) goto L_0x000c
            int r0 = zzj(r9, r8, r0, r11)
            int r9 = r11.zza
        L_0x000c:
            r3 = r0
            if (r9 < 0) goto L_0x002d
            int r10 = r10 - r3
            if (r9 > r10) goto L_0x002d
            int r10 = r11.zze
            int r10 = r10 + 1
            r11.zze = r10
            zzq(r10)
            int r9 = r9 + r3
            r0 = r7
            r1 = r6
            r2 = r8
            r4 = r9
            r5 = r11
            r0.zzi(r1, r2, r3, r4, r5)
            int r7 = r11.zze
            int r7 = r7 + -1
            r11.zze = r7
            r11.zzc = r6
            return r9
        L_0x002d:
            com.google.android.recaptcha.internal.zznn r6 = new com.google.android.recaptcha.internal.zznn
            java.lang.String r7 = "While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length."
            r6.<init>((java.lang.String) r7)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzku.zzn(java.lang.Object, com.google.android.recaptcha.internal.zzow, byte[], int, int, com.google.android.recaptcha.internal.zzkt):int");
    }

    public static int zzo(int i2, byte[] bArr, int i5, int i6, zzkt zzkt) {
        if ((i2 >>> 3) != 0) {
            int i7 = i2 & 7;
            if (i7 == 0) {
                return zzl(bArr, i5, zzkt);
            }
            if (i7 == 1) {
                return i5 + 8;
            }
            if (i7 == 2) {
                return zzi(bArr, i5, zzkt) + zzkt.zza;
            }
            if (i7 == 3) {
                int i8 = (i2 & -8) | 4;
                int i9 = 0;
                while (i5 < i6) {
                    i5 = zzi(bArr, i5, zzkt);
                    i9 = zzkt.zza;
                    if (i9 == i8) {
                        break;
                    }
                    i5 = zzo(i9, bArr, i5, i6, zzkt);
                }
                if (i5 <= i6 && i9 == i8) {
                    return i5;
                }
                throw new zznn("Failed to parse the message.");
            } else if (i7 == 5) {
                return i5 + 4;
            } else {
                throw new zznn("Protocol message contained an invalid tag (zero).");
            }
        } else {
            throw new zznn("Protocol message contained an invalid tag (zero).");
        }
    }

    public static long zzp(byte[] bArr, int i2) {
        return (((long) bArr[i2]) & 255) | ((((long) bArr[i2 + 1]) & 255) << 8) | ((((long) bArr[i2 + 2]) & 255) << 16) | ((((long) bArr[i2 + 3]) & 255) << 24) | ((((long) bArr[i2 + 4]) & 255) << 32) | ((((long) bArr[i2 + 5]) & 255) << 40) | ((((long) bArr[i2 + 6]) & 255) << 48) | ((((long) bArr[i2 + 7]) & 255) << 56);
    }

    private static void zzq(int i2) {
        if (i2 >= zzb) {
            throw new zznn("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
    }
}
