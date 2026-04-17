package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzaky;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzajl  reason: invalid package */
final class zzajl {
    private static volatile int zza = 100;

    public static double zza(byte[] bArr, int i2) {
        return Double.longBitsToDouble(zzd(bArr, i2));
    }

    public static float zzb(byte[] bArr, int i2) {
        return Float.intBitsToFloat(zzc(bArr, i2));
    }

    public static int zzc(byte[] bArr, int i2) {
        return ((bArr[i2 + 3] & 255) << 24) | (bArr[i2] & 255) | ((bArr[i2 + 1] & 255) << 8) | ((bArr[i2 + 2] & 255) << 16);
    }

    public static int zzd(byte[] bArr, int i2, zzajk zzajk) {
        int i5 = i2 + 1;
        long j6 = (long) bArr[i2];
        if (j6 >= 0) {
            zzajk.zzb = j6;
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
        zzajk.zzb = j7;
        return i6;
    }

    public static int zza(byte[] bArr, int i2, zzajk zzajk) {
        int zzc = zzc(bArr, i2, zzajk);
        int i5 = zzajk.zza;
        if (i5 < 0) {
            throw zzalf.zzf();
        } else if (i5 > bArr.length - zzc) {
            throw zzalf.zzj();
        } else if (i5 == 0) {
            zzajk.zzc = zzajp.zza;
            return zzc;
        } else {
            zzajk.zzc = zzajp.zza(bArr, zzc, i5);
            return zzc + i5;
        }
    }

    public static int zzb(zzamv<?> zzamv, int i2, byte[] bArr, int i5, int i6, zzalc<?> zzalc, zzajk zzajk) {
        int zza2 = zza(zzamv, bArr, i5, i6, zzajk);
        zzalc.add(zzajk.zzc);
        while (zza2 < i6) {
            int zzc = zzc(bArr, zza2, zzajk);
            if (i2 != zzajk.zza) {
                break;
            }
            zza2 = zza(zzamv, bArr, zzc, i6, zzajk);
            zzalc.add(zzajk.zzc);
        }
        return zza2;
    }

    public static int zzc(byte[] bArr, int i2, zzajk zzajk) {
        int i5 = i2 + 1;
        byte b6 = bArr[i2];
        if (b6 < 0) {
            return zza((int) b6, bArr, i5, zzajk);
        }
        zzajk.zza = b6;
        return i5;
    }

    public static long zzd(byte[] bArr, int i2) {
        return ((((long) bArr[i2 + 7]) & 255) << 56) | (((long) bArr[i2]) & 255) | ((((long) bArr[i2 + 1]) & 255) << 8) | ((((long) bArr[i2 + 2]) & 255) << 16) | ((((long) bArr[i2 + 3]) & 255) << 24) | ((((long) bArr[i2 + 4]) & 255) << 32) | ((((long) bArr[i2 + 5]) & 255) << 40) | ((((long) bArr[i2 + 6]) & 255) << 48);
    }

    public static int zzb(byte[] bArr, int i2, zzajk zzajk) {
        int zzc = zzc(bArr, i2, zzajk);
        int i5 = zzajk.zza;
        if (i5 < 0) {
            throw zzalf.zzf();
        } else if (i5 == 0) {
            zzajk.zzc = "";
            return zzc;
        } else {
            zzajk.zzc = zzant.zzb(bArr, zzc, i5);
            return zzc + i5;
        }
    }

    public static int zza(int i2, byte[] bArr, int i5, int i6, Object obj, zzamc zzamc, zzano<zzann, zzann> zzano, zzajk zzajk) {
        if (zzajk.zzd.zza(zzamc, i2 >>> 3) == null) {
            return zza(i2, bArr, i5, i6, zzamg.zzc(obj), zzajk);
        }
        zzaky.zzb zzb = (zzaky.zzb) obj;
        zzb.zza();
        zzakr<zzaky.zze> zzakr = zzb.zzc;
        throw new NoSuchMethodError();
    }

    private static <T> int zza(zzamv<T> zzamv, byte[] bArr, int i2, int i5, int i6, zzajk zzajk) {
        T zza2 = zzamv.zza();
        int zza3 = zza((Object) zza2, zzamv, bArr, i2, i5, i6, zzajk);
        zzamv.zzd(zza2);
        zzajk.zzc = zza2;
        return zza3;
    }

    public static int zza(zzamv<?> zzamv, int i2, byte[] bArr, int i5, int i6, zzalc<Object> zzalc, zzajk zzajk) {
        int i7 = (i2 & -8) | 4;
        int zza2 = zza(zzamv, bArr, i5, i6, i7, zzajk);
        zzalc.add(zzajk.zzc);
        while (zza2 < i6) {
            int zzc = zzc(bArr, zza2, zzajk);
            if (i2 != zzajk.zza) {
                break;
            }
            zza2 = zza(zzamv, bArr, zzc, i6, i7, zzajk);
            zzalc.add(zzajk.zzc);
        }
        return zza2;
    }

    public static <T> int zza(zzamv<T> zzamv, byte[] bArr, int i2, int i5, zzajk zzajk) {
        T zza2 = zzamv.zza();
        int zza3 = zza((Object) zza2, zzamv, bArr, i2, i5, zzajk);
        zzamv.zzd(zza2);
        zzajk.zzc = zza2;
        return zza3;
    }

    public static int zza(byte[] bArr, int i2, zzalc<?> zzalc, zzajk zzajk) {
        zzakz zzakz = (zzakz) zzalc;
        int zzc = zzc(bArr, i2, zzajk);
        int i5 = zzajk.zza + zzc;
        while (zzc < i5) {
            zzc = zzc(bArr, zzc, zzajk);
            zzakz.zzc(zzajk.zza);
        }
        if (zzc == i5) {
            return zzc;
        }
        throw zzalf.zzj();
    }

    public static int zza(int i2, byte[] bArr, int i5, int i6, zzann zzann, zzajk zzajk) {
        if ((i2 >>> 3) != 0) {
            int i7 = i2 & 7;
            if (i7 == 0) {
                int zzd = zzd(bArr, i5, zzajk);
                zzann.zza(i2, (Object) Long.valueOf(zzajk.zzb));
                return zzd;
            } else if (i7 == 1) {
                zzann.zza(i2, (Object) Long.valueOf(zzd(bArr, i5)));
                return i5 + 8;
            } else if (i7 == 2) {
                int zzc = zzc(bArr, i5, zzajk);
                int i8 = zzajk.zza;
                if (i8 < 0) {
                    throw zzalf.zzf();
                } else if (i8 <= bArr.length - zzc) {
                    if (i8 == 0) {
                        zzann.zza(i2, (Object) zzajp.zza);
                    } else {
                        zzann.zza(i2, (Object) zzajp.zza(bArr, zzc, i8));
                    }
                    return zzc + i8;
                } else {
                    throw zzalf.zzj();
                }
            } else if (i7 == 3) {
                zzann zzd2 = zzann.zzd();
                int i9 = (i2 & -8) | 4;
                int i10 = zzajk.zze + 1;
                zzajk.zze = i10;
                zza(i10);
                int i11 = 0;
                while (true) {
                    if (i5 >= i6) {
                        break;
                    }
                    int zzc2 = zzc(bArr, i5, zzajk);
                    int i12 = zzajk.zza;
                    i11 = i12;
                    if (i12 == i9) {
                        i5 = zzc2;
                        break;
                    }
                    int zza2 = zza(i11, bArr, zzc2, i6, zzd2, zzajk);
                    i11 = i12;
                    i5 = zza2;
                }
                zzajk.zze--;
                if (i5 > i6 || i11 != i9) {
                    throw zzalf.zzg();
                }
                zzann.zza(i2, (Object) zzd2);
                return i5;
            } else if (i7 == 5) {
                zzann.zza(i2, (Object) Integer.valueOf(zzc(bArr, i5)));
                return i5 + 4;
            } else {
                throw zzalf.zzc();
            }
        } else {
            throw zzalf.zzc();
        }
    }

    public static int zza(int i2, byte[] bArr, int i5, zzajk zzajk) {
        int i6 = i2 & 127;
        int i7 = i5 + 1;
        byte b6 = bArr[i5];
        if (b6 >= 0) {
            zzajk.zza = i6 | (b6 << 7);
            return i7;
        }
        int i8 = i6 | ((b6 & Byte.MAX_VALUE) << 7);
        int i9 = i5 + 2;
        byte b7 = bArr[i7];
        if (b7 >= 0) {
            zzajk.zza = i8 | (b7 << 14);
            return i9;
        }
        int i10 = i8 | ((b7 & Byte.MAX_VALUE) << 14);
        int i11 = i5 + 3;
        byte b8 = bArr[i9];
        if (b8 >= 0) {
            zzajk.zza = i10 | (b8 << 21);
            return i11;
        }
        int i12 = i10 | ((b8 & Byte.MAX_VALUE) << 21);
        int i13 = i5 + 4;
        byte b9 = bArr[i11];
        if (b9 >= 0) {
            zzajk.zza = i12 | (b9 << 28);
            return i13;
        }
        int i14 = i12 | ((b9 & Byte.MAX_VALUE) << 28);
        while (true) {
            int i15 = i13 + 1;
            if (bArr[i13] >= 0) {
                zzajk.zza = i14;
                return i15;
            }
            i13 = i15;
        }
    }

    public static int zza(int i2, byte[] bArr, int i5, int i6, zzalc<?> zzalc, zzajk zzajk) {
        zzakz zzakz = (zzakz) zzalc;
        int zzc = zzc(bArr, i5, zzajk);
        zzakz.zzc(zzajk.zza);
        while (zzc < i6) {
            int zzc2 = zzc(bArr, zzc, zzajk);
            if (i2 != zzajk.zza) {
                break;
            }
            zzc = zzc(bArr, zzc2, zzajk);
            zzakz.zzc(zzajk.zza);
        }
        return zzc;
    }

    public static <T> int zza(Object obj, zzamv<T> zzamv, byte[] bArr, int i2, int i5, int i6, zzajk zzajk) {
        int i7 = zzajk.zze + 1;
        zzajk.zze = i7;
        zza(i7);
        int zza2 = ((zzamg) zzamv).zza(obj, bArr, i2, i5, i6, zzajk);
        zzajk.zze--;
        zzajk.zzc = obj;
        return zza2;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v2, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v0, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v5, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v6, resolved type: byte} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static <T> int zza(java.lang.Object r6, com.google.android.gms.internal.p002firebaseauthapi.zzamv<T> r7, byte[] r8, int r9, int r10, com.google.android.gms.internal.p002firebaseauthapi.zzajk r11) {
        /*
            int r0 = r9 + 1
            byte r9 = r8[r9]
            if (r9 >= 0) goto L_0x000c
            int r0 = zza((int) r9, (byte[]) r8, (int) r0, (com.google.android.gms.internal.p002firebaseauthapi.zzajk) r11)
            int r9 = r11.zza
        L_0x000c:
            r3 = r0
            if (r9 < 0) goto L_0x002d
            int r10 = r10 - r3
            if (r9 > r10) goto L_0x002d
            int r10 = r11.zze
            int r10 = r10 + 1
            r11.zze = r10
            zza(r10)
            int r9 = r9 + r3
            r0 = r7
            r1 = r6
            r2 = r8
            r4 = r9
            r5 = r11
            r0.zza(r1, r2, r3, r4, r5)
            int r7 = r11.zze
            int r7 = r7 + -1
            r11.zze = r7
            r11.zzc = r6
            return r9
        L_0x002d:
            com.google.android.gms.internal.firebase-auth-api.zzalf r6 = com.google.android.gms.internal.p002firebaseauthapi.zzalf.zzj()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.p002firebaseauthapi.zzajl.zza(java.lang.Object, com.google.android.gms.internal.firebase-auth-api.zzamv, byte[], int, int, com.google.android.gms.internal.firebase-auth-api.zzajk):int");
    }

    public static int zza(int i2, byte[] bArr, int i5, int i6, zzajk zzajk) {
        if ((i2 >>> 3) != 0) {
            int i7 = i2 & 7;
            if (i7 == 0) {
                return zzd(bArr, i5, zzajk);
            }
            if (i7 == 1) {
                return i5 + 8;
            }
            if (i7 == 2) {
                return zzc(bArr, i5, zzajk) + zzajk.zza;
            }
            if (i7 == 3) {
                int i8 = (i2 & -8) | 4;
                int i9 = 0;
                while (i5 < i6) {
                    i5 = zzc(bArr, i5, zzajk);
                    i9 = zzajk.zza;
                    if (i9 == i8) {
                        break;
                    }
                    i5 = zza(i9, bArr, i5, i6, zzajk);
                }
                if (i5 <= i6 && i9 == i8) {
                    return i5;
                }
                throw zzalf.zzg();
            } else if (i7 == 5) {
                return i5 + 4;
            } else {
                throw zzalf.zzc();
            }
        } else {
            throw zzalf.zzc();
        }
    }

    private static void zza(int i2) {
        if (i2 >= zza) {
            throw zzalf.zzh();
        }
    }
}
