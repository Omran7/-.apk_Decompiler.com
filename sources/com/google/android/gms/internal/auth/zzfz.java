package com.google.android.gms.internal.auth;

import com.google.android.gms.dynamite.descriptors.com.google.firebase.auth.ModuleDescriptor;
import com.google.android.gms.internal.p002firebaseauthapi.zzaky;
import h0.C0552a;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.List;
import sun.misc.Unsafe;

final class zzfz<T> implements zzgh<T> {
    private static final int[] zza = new int[0];
    private static final Unsafe zzb = zzhi.zzg();
    private final int[] zzc;
    private final Object[] zzd;
    private final int zze;
    private final int zzf;
    private final zzfw zzg;
    private final boolean zzh;
    private final int[] zzi;
    private final int zzj;
    private final int zzk;
    private final zzfk zzl;
    private final zzgy zzm;
    private final zzel zzn;
    private final zzgb zzo;
    private final zzfr zzp;

    private zzfz(int[] iArr, Object[] objArr, int i2, int i5, zzfw zzfw, boolean z3, boolean z4, int[] iArr2, int i6, int i7, zzgb zzgb, zzfk zzfk, zzgy zzgy, zzel zzel, zzfr zzfr, byte[] bArr) {
        this.zzc = iArr;
        this.zzd = objArr;
        this.zze = i2;
        this.zzf = i5;
        this.zzh = z3;
        this.zzi = iArr2;
        this.zzj = i6;
        this.zzk = i7;
        this.zzo = zzgb;
        this.zzl = zzfk;
        this.zzm = zzgy;
        this.zzn = zzel;
        this.zzg = zzfw;
        this.zzp = zzfr;
    }

    private static Field zzA(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException unused) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            String name = cls.getName();
            String arrays = Arrays.toString(declaredFields);
            StringBuilder u6 = C0552a.u("Field ", str, " for ", name, " not found. Known fields are ");
            u6.append(arrays);
            throw new RuntimeException(u6.toString());
        }
    }

    private final void zzB(Object obj, Object obj2, int i2) {
        long zzv = (long) (zzv(i2) & 1048575);
        if (zzG(obj2, i2)) {
            Object zzf2 = zzhi.zzf(obj, zzv);
            Object zzf3 = zzhi.zzf(obj2, zzv);
            if (zzf2 != null && zzf3 != null) {
                zzhi.zzp(obj, zzv, zzez.zzg(zzf2, zzf3));
                zzD(obj, i2);
            } else if (zzf3 != null) {
                zzhi.zzp(obj, zzv, zzf3);
                zzD(obj, i2);
            }
        }
    }

    private final void zzC(Object obj, Object obj2, int i2) {
        Object obj3;
        int zzv = zzv(i2);
        int i5 = this.zzc[i2];
        long j6 = (long) (zzv & 1048575);
        if (zzJ(obj2, i5, i2)) {
            if (zzJ(obj, i5, i2)) {
                obj3 = zzhi.zzf(obj, j6);
            } else {
                obj3 = null;
            }
            Object zzf2 = zzhi.zzf(obj2, j6);
            if (obj3 != null && zzf2 != null) {
                zzhi.zzp(obj, j6, zzez.zzg(obj3, zzf2));
                zzE(obj, i5, i2);
            } else if (zzf2 != null) {
                zzhi.zzp(obj, j6, zzf2);
                zzE(obj, i5, i2);
            }
        }
    }

    private final void zzD(Object obj, int i2) {
        int zzs = zzs(i2);
        long j6 = (long) (1048575 & zzs);
        if (j6 != 1048575) {
            zzhi.zzn(obj, j6, (1 << (zzs >>> 20)) | zzhi.zzc(obj, j6));
        }
    }

    private final void zzE(Object obj, int i2, int i5) {
        zzhi.zzn(obj, (long) (zzs(i5) & 1048575), i2);
    }

    private final boolean zzF(Object obj, Object obj2, int i2) {
        if (zzG(obj, i2) == zzG(obj2, i2)) {
            return true;
        }
        return false;
    }

    private final boolean zzG(Object obj, int i2) {
        int zzs = zzs(i2);
        long j6 = (long) (zzs & 1048575);
        if (j6 == 1048575) {
            int zzv = zzv(i2);
            long j7 = (long) (zzv & 1048575);
            switch (zzu(zzv)) {
                case 0:
                    if (Double.doubleToRawLongBits(zzhi.zza(obj, j7)) != 0) {
                        return true;
                    }
                    return false;
                case 1:
                    if (Float.floatToRawIntBits(zzhi.zzb(obj, j7)) != 0) {
                        return true;
                    }
                    return false;
                case 2:
                    if (zzhi.zzd(obj, j7) != 0) {
                        return true;
                    }
                    return false;
                case 3:
                    if (zzhi.zzd(obj, j7) != 0) {
                        return true;
                    }
                    return false;
                case 4:
                    if (zzhi.zzc(obj, j7) != 0) {
                        return true;
                    }
                    return false;
                case 5:
                    if (zzhi.zzd(obj, j7) != 0) {
                        return true;
                    }
                    return false;
                case zzaky.zzf.zzf /*6*/:
                    if (zzhi.zzc(obj, j7) != 0) {
                        return true;
                    }
                    return false;
                case zzaky.zzf.zzg /*7*/:
                    return zzhi.zzt(obj, j7);
                case 8:
                    Object zzf2 = zzhi.zzf(obj, j7);
                    if (zzf2 instanceof String) {
                        if (!((String) zzf2).isEmpty()) {
                            return true;
                        }
                        return false;
                    } else if (!(zzf2 instanceof zzee)) {
                        throw new IllegalArgumentException();
                    } else if (!zzee.zzb.equals(zzf2)) {
                        return true;
                    } else {
                        return false;
                    }
                case 9:
                    if (zzhi.zzf(obj, j7) != null) {
                        return true;
                    }
                    return false;
                case 10:
                    if (!zzee.zzb.equals(zzhi.zzf(obj, j7))) {
                        return true;
                    }
                    return false;
                case ModuleDescriptor.MODULE_VERSION:
                    if (zzhi.zzc(obj, j7) != 0) {
                        return true;
                    }
                    return false;
                case 12:
                    if (zzhi.zzc(obj, j7) != 0) {
                        return true;
                    }
                    return false;
                case 13:
                    if (zzhi.zzc(obj, j7) != 0) {
                        return true;
                    }
                    return false;
                case 14:
                    if (zzhi.zzd(obj, j7) != 0) {
                        return true;
                    }
                    return false;
                case 15:
                    if (zzhi.zzc(obj, j7) != 0) {
                        return true;
                    }
                    return false;
                case 16:
                    if (zzhi.zzd(obj, j7) != 0) {
                        return true;
                    }
                    return false;
                case 17:
                    if (zzhi.zzf(obj, j7) != null) {
                        return true;
                    }
                    return false;
                default:
                    throw new IllegalArgumentException();
            }
        } else if ((zzhi.zzc(obj, j6) & (1 << (zzs >>> 20))) != 0) {
            return true;
        } else {
            return false;
        }
    }

    private final boolean zzH(Object obj, int i2, int i5, int i6, int i7) {
        if (i5 == 1048575) {
            return zzG(obj, i2);
        }
        if ((i6 & i7) != 0) {
            return true;
        }
        return false;
    }

    private static boolean zzI(Object obj, int i2, zzgh zzgh) {
        return zzgh.zzi(zzhi.zzf(obj, (long) (i2 & 1048575)));
    }

    private final boolean zzJ(Object obj, int i2, int i5) {
        if (zzhi.zzc(obj, (long) (zzs(i5) & 1048575)) == i2) {
            return true;
        }
        return false;
    }

    public static zzgz zzc(Object obj) {
        zzeu zzeu = (zzeu) obj;
        zzgz zzgz = zzeu.zzc;
        if (zzgz != zzgz.zza()) {
            return zzgz;
        }
        zzgz zzc2 = zzgz.zzc();
        zzeu.zzc = zzc2;
        return zzc2;
    }

    public static zzfz zzj(Class cls, zzft zzft, zzgb zzgb, zzfk zzfk, zzgy zzgy, zzel zzel, zzfr zzfr) {
        if (zzft instanceof zzgg) {
            return zzk((zzgg) zzft, zzgb, zzfk, zzgy, zzel, zzfr);
        }
        zzgv zzgv = (zzgv) zzft;
        throw null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:120:0x025f  */
    /* JADX WARNING: Removed duplicated region for block: B:122:0x0265  */
    /* JADX WARNING: Removed duplicated region for block: B:125:0x027b  */
    /* JADX WARNING: Removed duplicated region for block: B:127:0x027f  */
    /* JADX WARNING: Removed duplicated region for block: B:162:0x0336  */
    /* JADX WARNING: Removed duplicated region for block: B:176:0x0381  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.google.android.gms.internal.auth.zzfz zzk(com.google.android.gms.internal.auth.zzgg r34, com.google.android.gms.internal.auth.zzgb r35, com.google.android.gms.internal.auth.zzfk r36, com.google.android.gms.internal.auth.zzgy r37, com.google.android.gms.internal.auth.zzel r38, com.google.android.gms.internal.auth.zzfr r39) {
        /*
            int r0 = r34.zzc()
            r1 = 2
            r2 = 0
            if (r0 != r1) goto L_0x000a
            r10 = 1
            goto L_0x000b
        L_0x000a:
            r10 = r2
        L_0x000b:
            java.lang.String r0 = r34.zzd()
            int r1 = r0.length()
            char r4 = r0.charAt(r2)
            r5 = 55296(0xd800, float:7.7486E-41)
            if (r4 < r5) goto L_0x0027
            r4 = 1
        L_0x001d:
            int r6 = r4 + 1
            char r4 = r0.charAt(r4)
            if (r4 < r5) goto L_0x0028
            r4 = r6
            goto L_0x001d
        L_0x0027:
            r6 = 1
        L_0x0028:
            int r4 = r6 + 1
            char r6 = r0.charAt(r6)
            if (r6 < r5) goto L_0x0047
            r6 = r6 & 8191(0x1fff, float:1.1478E-41)
            r8 = 13
        L_0x0034:
            int r9 = r4 + 1
            char r4 = r0.charAt(r4)
            if (r4 < r5) goto L_0x0044
            r4 = r4 & 8191(0x1fff, float:1.1478E-41)
            int r4 = r4 << r8
            r6 = r6 | r4
            int r8 = r8 + 13
            r4 = r9
            goto L_0x0034
        L_0x0044:
            int r4 = r4 << r8
            r6 = r6 | r4
            r4 = r9
        L_0x0047:
            if (r6 != 0) goto L_0x0057
            int[] r6 = zza
            r8 = r2
            r9 = r8
            r11 = r9
            r12 = r11
            r14 = r12
            r16 = r14
            r13 = r6
            r6 = r16
            goto L_0x0166
        L_0x0057:
            int r6 = r4 + 1
            char r4 = r0.charAt(r4)
            if (r4 < r5) goto L_0x0076
            r4 = r4 & 8191(0x1fff, float:1.1478E-41)
            r8 = 13
        L_0x0063:
            int r9 = r6 + 1
            char r6 = r0.charAt(r6)
            if (r6 < r5) goto L_0x0073
            r6 = r6 & 8191(0x1fff, float:1.1478E-41)
            int r6 = r6 << r8
            r4 = r4 | r6
            int r8 = r8 + 13
            r6 = r9
            goto L_0x0063
        L_0x0073:
            int r6 = r6 << r8
            r4 = r4 | r6
            r6 = r9
        L_0x0076:
            int r8 = r6 + 1
            char r6 = r0.charAt(r6)
            if (r6 < r5) goto L_0x0095
            r6 = r6 & 8191(0x1fff, float:1.1478E-41)
            r9 = 13
        L_0x0082:
            int r11 = r8 + 1
            char r8 = r0.charAt(r8)
            if (r8 < r5) goto L_0x0092
            r8 = r8 & 8191(0x1fff, float:1.1478E-41)
            int r8 = r8 << r9
            r6 = r6 | r8
            int r9 = r9 + 13
            r8 = r11
            goto L_0x0082
        L_0x0092:
            int r8 = r8 << r9
            r6 = r6 | r8
            r8 = r11
        L_0x0095:
            int r9 = r8 + 1
            char r8 = r0.charAt(r8)
            if (r8 < r5) goto L_0x00b4
            r8 = r8 & 8191(0x1fff, float:1.1478E-41)
            r11 = 13
        L_0x00a1:
            int r12 = r9 + 1
            char r9 = r0.charAt(r9)
            if (r9 < r5) goto L_0x00b1
            r9 = r9 & 8191(0x1fff, float:1.1478E-41)
            int r9 = r9 << r11
            r8 = r8 | r9
            int r11 = r11 + 13
            r9 = r12
            goto L_0x00a1
        L_0x00b1:
            int r9 = r9 << r11
            r8 = r8 | r9
            r9 = r12
        L_0x00b4:
            int r11 = r9 + 1
            char r9 = r0.charAt(r9)
            if (r9 < r5) goto L_0x00d3
            r9 = r9 & 8191(0x1fff, float:1.1478E-41)
            r12 = 13
        L_0x00c0:
            int r13 = r11 + 1
            char r11 = r0.charAt(r11)
            if (r11 < r5) goto L_0x00d0
            r11 = r11 & 8191(0x1fff, float:1.1478E-41)
            int r11 = r11 << r12
            r9 = r9 | r11
            int r12 = r12 + 13
            r11 = r13
            goto L_0x00c0
        L_0x00d0:
            int r11 = r11 << r12
            r9 = r9 | r11
            r11 = r13
        L_0x00d3:
            int r12 = r11 + 1
            char r11 = r0.charAt(r11)
            if (r11 < r5) goto L_0x00f2
            r11 = r11 & 8191(0x1fff, float:1.1478E-41)
            r13 = 13
        L_0x00df:
            int r14 = r12 + 1
            char r12 = r0.charAt(r12)
            if (r12 < r5) goto L_0x00ef
            r12 = r12 & 8191(0x1fff, float:1.1478E-41)
            int r12 = r12 << r13
            r11 = r11 | r12
            int r13 = r13 + 13
            r12 = r14
            goto L_0x00df
        L_0x00ef:
            int r12 = r12 << r13
            r11 = r11 | r12
            r12 = r14
        L_0x00f2:
            int r13 = r12 + 1
            char r12 = r0.charAt(r12)
            if (r12 < r5) goto L_0x0111
            r12 = r12 & 8191(0x1fff, float:1.1478E-41)
            r14 = 13
        L_0x00fe:
            int r15 = r13 + 1
            char r13 = r0.charAt(r13)
            if (r13 < r5) goto L_0x010e
            r13 = r13 & 8191(0x1fff, float:1.1478E-41)
            int r13 = r13 << r14
            r12 = r12 | r13
            int r14 = r14 + 13
            r13 = r15
            goto L_0x00fe
        L_0x010e:
            int r13 = r13 << r14
            r12 = r12 | r13
            r13 = r15
        L_0x0111:
            int r14 = r13 + 1
            char r13 = r0.charAt(r13)
            if (r13 < r5) goto L_0x0132
            r13 = r13 & 8191(0x1fff, float:1.1478E-41)
            r15 = 13
        L_0x011d:
            int r16 = r14 + 1
            char r14 = r0.charAt(r14)
            if (r14 < r5) goto L_0x012e
            r14 = r14 & 8191(0x1fff, float:1.1478E-41)
            int r14 = r14 << r15
            r13 = r13 | r14
            int r15 = r15 + 13
            r14 = r16
            goto L_0x011d
        L_0x012e:
            int r14 = r14 << r15
            r13 = r13 | r14
            r14 = r16
        L_0x0132:
            int r15 = r14 + 1
            char r14 = r0.charAt(r14)
            if (r14 < r5) goto L_0x0155
            r14 = r14 & 8191(0x1fff, float:1.1478E-41)
            r16 = 13
        L_0x013e:
            int r17 = r15 + 1
            char r15 = r0.charAt(r15)
            if (r15 < r5) goto L_0x0150
            r15 = r15 & 8191(0x1fff, float:1.1478E-41)
            int r15 = r15 << r16
            r14 = r14 | r15
            int r16 = r16 + 13
            r15 = r17
            goto L_0x013e
        L_0x0150:
            int r15 = r15 << r16
            r14 = r14 | r15
            r15 = r17
        L_0x0155:
            int r16 = r14 + r12
            int r13 = r16 + r13
            int[] r13 = new int[r13]
            int r16 = r4 + r4
            int r16 = r16 + r6
            r6 = r4
            r4 = r15
            r33 = r12
            r12 = r9
            r9 = r33
        L_0x0166:
            sun.misc.Unsafe r15 = zzb
            java.lang.Object[] r17 = r34.zze()
            com.google.android.gms.internal.auth.zzfw r18 = r34.zza()
            java.lang.Class r2 = r18.getClass()
            int r7 = r11 * 3
            int[] r7 = new int[r7]
            int r11 = r11 + r11
            java.lang.Object[] r11 = new java.lang.Object[r11]
            int r21 = r14 + r9
            r22 = r14
            r23 = r21
            r9 = 0
            r20 = 0
        L_0x0184:
            if (r4 >= r1) goto L_0x03cd
            int r24 = r4 + 1
            char r4 = r0.charAt(r4)
            if (r4 < r5) goto L_0x01ac
            r4 = r4 & 8191(0x1fff, float:1.1478E-41)
            r3 = r24
            r24 = 13
        L_0x0194:
            int r26 = r3 + 1
            char r3 = r0.charAt(r3)
            if (r3 < r5) goto L_0x01a6
            r3 = r3 & 8191(0x1fff, float:1.1478E-41)
            int r3 = r3 << r24
            r4 = r4 | r3
            int r24 = r24 + 13
            r3 = r26
            goto L_0x0194
        L_0x01a6:
            int r3 = r3 << r24
            r4 = r4 | r3
            r3 = r26
            goto L_0x01ae
        L_0x01ac:
            r3 = r24
        L_0x01ae:
            int r24 = r3 + 1
            char r3 = r0.charAt(r3)
            if (r3 < r5) goto L_0x01db
            r3 = r3 & 8191(0x1fff, float:1.1478E-41)
            r5 = r24
            r24 = 13
        L_0x01bc:
            int r27 = r5 + 1
            char r5 = r0.charAt(r5)
            r28 = r1
            r1 = 55296(0xd800, float:7.7486E-41)
            if (r5 < r1) goto L_0x01d5
            r1 = r5 & 8191(0x1fff, float:1.1478E-41)
            int r1 = r1 << r24
            r3 = r3 | r1
            int r24 = r24 + 13
            r5 = r27
            r1 = r28
            goto L_0x01bc
        L_0x01d5:
            int r1 = r5 << r24
            r3 = r3 | r1
            r1 = r27
            goto L_0x01df
        L_0x01db:
            r28 = r1
            r1 = r24
        L_0x01df:
            r5 = r3 & 255(0xff, float:3.57E-43)
            r24 = r14
            r14 = r3 & 1024(0x400, float:1.435E-42)
            if (r14 == 0) goto L_0x01ed
            int r14 = r20 + 1
            r13[r20] = r9
            r20 = r14
        L_0x01ed:
            r14 = 51
            if (r5 < r14) goto L_0x029b
            int r14 = r1 + 1
            char r1 = r0.charAt(r1)
            r27 = r14
            r14 = 55296(0xd800, float:7.7486E-41)
            if (r1 < r14) goto L_0x0223
            r1 = r1 & 8191(0x1fff, float:1.1478E-41)
            r14 = r27
            r27 = 13
        L_0x0204:
            int r31 = r14 + 1
            char r14 = r0.charAt(r14)
            r32 = r12
            r12 = 55296(0xd800, float:7.7486E-41)
            if (r14 < r12) goto L_0x021d
            r12 = r14 & 8191(0x1fff, float:1.1478E-41)
            int r12 = r12 << r27
            r1 = r1 | r12
            int r27 = r27 + 13
            r14 = r31
            r12 = r32
            goto L_0x0204
        L_0x021d:
            int r12 = r14 << r27
            r1 = r1 | r12
            r14 = r31
            goto L_0x0227
        L_0x0223:
            r32 = r12
            r14 = r27
        L_0x0227:
            int r12 = r5 + -51
            r27 = r14
            r14 = 9
            if (r12 == r14) goto L_0x024a
            r14 = 17
            if (r12 != r14) goto L_0x0234
            goto L_0x024a
        L_0x0234:
            r14 = 12
            if (r12 != r14) goto L_0x0258
            if (r10 != 0) goto L_0x0258
            int r12 = r9 / 3
            int r14 = r16 + 1
            int r12 = r12 + r12
            r25 = 1
            int r12 = r12 + 1
            r16 = r17[r16]
            r11[r12] = r16
        L_0x0247:
            r16 = r14
            goto L_0x0258
        L_0x024a:
            int r12 = r9 / 3
            int r14 = r16 + 1
            int r12 = r12 + r12
            r25 = 1
            int r12 = r12 + 1
            r16 = r17[r16]
            r11[r12] = r16
            goto L_0x0247
        L_0x0258:
            int r1 = r1 + r1
            r12 = r17[r1]
            boolean r14 = r12 instanceof java.lang.reflect.Field
            if (r14 == 0) goto L_0x0265
            java.lang.reflect.Field r12 = (java.lang.reflect.Field) r12
        L_0x0261:
            r31 = r7
            r14 = r8
            goto L_0x026e
        L_0x0265:
            java.lang.String r12 = (java.lang.String) r12
            java.lang.reflect.Field r12 = zzA(r2, r12)
            r17[r1] = r12
            goto L_0x0261
        L_0x026e:
            long r7 = r15.objectFieldOffset(r12)
            int r7 = (int) r7
            int r1 = r1 + 1
            r8 = r17[r1]
            boolean r12 = r8 instanceof java.lang.reflect.Field
            if (r12 == 0) goto L_0x027f
            java.lang.reflect.Field r8 = (java.lang.reflect.Field) r8
        L_0x027d:
            r1 = r7
            goto L_0x0288
        L_0x027f:
            java.lang.String r8 = (java.lang.String) r8
            java.lang.reflect.Field r8 = zzA(r2, r8)
            r17[r1] = r8
            goto L_0x027d
        L_0x0288:
            long r7 = r15.objectFieldOffset(r8)
            int r7 = (int) r7
            r29 = r11
            r30 = r16
            r26 = r27
            r25 = 1
            r16 = r7
            r7 = r1
            r1 = 0
            goto L_0x0394
        L_0x029b:
            r31 = r7
            r14 = r8
            r32 = r12
            int r7 = r16 + 1
            r8 = r17[r16]
            java.lang.String r8 = (java.lang.String) r8
            java.lang.reflect.Field r8 = zzA(r2, r8)
            r12 = 9
            if (r5 == r12) goto L_0x02b2
            r12 = 17
            if (r5 != r12) goto L_0x02b5
        L_0x02b2:
            r25 = 1
            goto L_0x0316
        L_0x02b5:
            r12 = 27
            if (r5 == r12) goto L_0x02bd
            r12 = 49
            if (r5 != r12) goto L_0x02c0
        L_0x02bd:
            r25 = 1
            goto L_0x030a
        L_0x02c0:
            r12 = 12
            if (r5 == r12) goto L_0x02f8
            r12 = 30
            if (r5 == r12) goto L_0x02f8
            r12 = 44
            if (r5 != r12) goto L_0x02cd
            goto L_0x02f8
        L_0x02cd:
            r12 = 50
            if (r5 != r12) goto L_0x02ed
            int r12 = r22 + 1
            r13[r22] = r9
            int r22 = r9 / 3
            int r22 = r22 + r22
            int r29 = r16 + 2
            r7 = r17[r7]
            r11[r22] = r7
            r7 = r3 & 2048(0x800, float:2.87E-42)
            if (r7 == 0) goto L_0x02f1
            int r7 = r16 + 3
            int r22 = r22 + 1
            r16 = r17[r29]
            r11[r22] = r16
            r22 = r12
        L_0x02ed:
            r25 = 1
        L_0x02ef:
            r12 = r7
            goto L_0x0322
        L_0x02f1:
            r22 = r12
            r12 = r29
            r25 = 1
            goto L_0x0322
        L_0x02f8:
            if (r10 != 0) goto L_0x02ed
            int r12 = r9 / 3
            int r16 = r16 + 2
            int r12 = r12 + r12
            r25 = 1
            int r12 = r12 + 1
            r7 = r17[r7]
            r11[r12] = r7
        L_0x0307:
            r12 = r16
            goto L_0x0322
        L_0x030a:
            int r12 = r9 / 3
            int r16 = r16 + 2
            int r12 = r12 + r12
            int r12 = r12 + 1
            r7 = r17[r7]
            r11[r12] = r7
            goto L_0x0307
        L_0x0316:
            int r12 = r9 / 3
            int r12 = r12 + r12
            int r12 = r12 + 1
            java.lang.Class r16 = r8.getType()
            r11[r12] = r16
            goto L_0x02ef
        L_0x0322:
            long r7 = r15.objectFieldOffset(r8)
            int r7 = (int) r7
            r8 = r3 & 4096(0x1000, float:5.74E-42)
            r16 = 1048575(0xfffff, float:1.469367E-39)
            r29 = r11
            r11 = 4096(0x1000, float:5.74E-42)
            if (r8 != r11) goto L_0x0381
            r8 = 17
            if (r5 > r8) goto L_0x0381
            int r8 = r1 + 1
            char r1 = r0.charAt(r1)
            r11 = 55296(0xd800, float:7.7486E-41)
            if (r1 < r11) goto L_0x035b
            r1 = r1 & 8191(0x1fff, float:1.1478E-41)
            r16 = 13
        L_0x0345:
            int r26 = r8 + 1
            char r8 = r0.charAt(r8)
            if (r8 < r11) goto L_0x0357
            r8 = r8 & 8191(0x1fff, float:1.1478E-41)
            int r8 = r8 << r16
            r1 = r1 | r8
            int r16 = r16 + 13
            r8 = r26
            goto L_0x0345
        L_0x0357:
            int r8 = r8 << r16
            r1 = r1 | r8
            goto L_0x035d
        L_0x035b:
            r26 = r8
        L_0x035d:
            int r8 = r6 + r6
            int r16 = r1 / 32
            int r16 = r16 + r8
            r8 = r17[r16]
            boolean r11 = r8 instanceof java.lang.reflect.Field
            if (r11 == 0) goto L_0x036e
            java.lang.reflect.Field r8 = (java.lang.reflect.Field) r8
        L_0x036b:
            r30 = r12
            goto L_0x0377
        L_0x036e:
            java.lang.String r8 = (java.lang.String) r8
            java.lang.reflect.Field r8 = zzA(r2, r8)
            r17[r16] = r8
            goto L_0x036b
        L_0x0377:
            long r11 = r15.objectFieldOffset(r8)
            int r8 = (int) r11
            int r1 = r1 % 32
            r16 = r8
            goto L_0x0386
        L_0x0381:
            r30 = r12
            r26 = r1
            r1 = 0
        L_0x0386:
            r8 = 18
            if (r5 < r8) goto L_0x0394
            r8 = 49
            if (r5 > r8) goto L_0x0394
            int r8 = r23 + 1
            r13[r23] = r7
            r23 = r8
        L_0x0394:
            int r8 = r9 + 1
            r31[r9] = r4
            int r4 = r9 + 2
            r11 = r3 & 512(0x200, float:7.175E-43)
            if (r11 == 0) goto L_0x03a1
            r11 = 536870912(0x20000000, float:1.0842022E-19)
            goto L_0x03a2
        L_0x03a1:
            r11 = 0
        L_0x03a2:
            r3 = r3 & 256(0x100, float:3.59E-43)
            if (r3 == 0) goto L_0x03a9
            r3 = 268435456(0x10000000, float:2.5243549E-29)
            goto L_0x03aa
        L_0x03a9:
            r3 = 0
        L_0x03aa:
            r3 = r3 | r11
            int r5 = r5 << 20
            r3 = r3 | r5
            r3 = r3 | r7
            r31[r8] = r3
            int r9 = r9 + 3
            int r1 = r1 << 20
            r1 = r1 | r16
            r31[r4] = r1
            r8 = r14
            r14 = r24
            r4 = r26
            r1 = r28
            r11 = r29
            r16 = r30
            r7 = r31
            r12 = r32
            r5 = 55296(0xd800, float:7.7486E-41)
            goto L_0x0184
        L_0x03cd:
            r31 = r7
            r29 = r11
            r32 = r12
            r24 = r14
            r14 = r8
            com.google.android.gms.internal.auth.zzfz r0 = new com.google.android.gms.internal.auth.zzfz
            r4 = r0
            com.google.android.gms.internal.auth.zzfw r9 = r34.zza()
            r11 = 0
            r1 = r29
            r20 = 0
            r5 = r31
            r6 = r1
            r7 = r14
            r8 = r32
            r12 = r13
            r13 = r24
            r14 = r21
            r15 = r35
            r16 = r36
            r17 = r37
            r18 = r38
            r19 = r39
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.auth.zzfz.zzk(com.google.android.gms.internal.auth.zzgg, com.google.android.gms.internal.auth.zzgb, com.google.android.gms.internal.auth.zzfk, com.google.android.gms.internal.auth.zzgy, com.google.android.gms.internal.auth.zzel, com.google.android.gms.internal.auth.zzfr):com.google.android.gms.internal.auth.zzfz");
    }

    private static int zzl(Object obj, long j6) {
        return ((Integer) zzhi.zzf(obj, j6)).intValue();
    }

    private final int zzm(Object obj, byte[] bArr, int i2, int i5, int i6, long j6, zzds zzds) {
        Unsafe unsafe = zzb;
        Object zzz = zzz(i6);
        Object object = unsafe.getObject(obj, j6);
        if (!((zzfq) object).zze()) {
            zzfq zzb2 = zzfq.zza().zzb();
            zzfr.zza(zzb2, object);
            unsafe.putObject(obj, j6, zzb2);
        }
        zzfp zzfp = (zzfp) zzz;
        throw null;
    }

    private final int zzn(Object obj, byte[] bArr, int i2, int i5, int i6, int i7, int i8, int i9, int i10, long j6, int i11, zzds zzds) {
        Object obj2 = obj;
        byte[] bArr2 = bArr;
        int i12 = i2;
        int i13 = i6;
        int i14 = i7;
        int i15 = i8;
        long j7 = j6;
        int i16 = i11;
        zzds zzds2 = zzds;
        Unsafe unsafe = zzb;
        long j8 = (long) (this.zzc[i16 + 2] & 1048575);
        switch (i10) {
            case 51:
                if (i15 == 1) {
                    unsafe.putObject(obj2, j7, Double.valueOf(Double.longBitsToDouble(zzdt.zzn(bArr, i2))));
                    unsafe.putInt(obj2, j8, i14);
                    return i12 + 8;
                }
                break;
            case 52:
                if (i15 == 5) {
                    unsafe.putObject(obj2, j7, Float.valueOf(Float.intBitsToFloat(zzdt.zzb(bArr, i2))));
                    unsafe.putInt(obj2, j8, i14);
                    return i12 + 4;
                }
                break;
            case 53:
            case 54:
                if (i15 == 0) {
                    int zzm2 = zzdt.zzm(bArr2, i12, zzds2);
                    unsafe.putObject(obj2, j7, Long.valueOf(zzds2.zzb));
                    unsafe.putInt(obj2, j8, i14);
                    return zzm2;
                }
                break;
            case 55:
            case 62:
                if (i15 == 0) {
                    int zzj2 = zzdt.zzj(bArr2, i12, zzds2);
                    unsafe.putObject(obj2, j7, Integer.valueOf(zzds2.zza));
                    unsafe.putInt(obj2, j8, i14);
                    return zzj2;
                }
                break;
            case 56:
            case 65:
                if (i15 == 1) {
                    unsafe.putObject(obj2, j7, Long.valueOf(zzdt.zzn(bArr, i2)));
                    unsafe.putInt(obj2, j8, i14);
                    return i12 + 8;
                }
                break;
            case 57:
            case 64:
                if (i15 == 5) {
                    unsafe.putObject(obj2, j7, Integer.valueOf(zzdt.zzb(bArr, i2)));
                    unsafe.putInt(obj2, j8, i14);
                    return i12 + 4;
                }
                break;
            case 58:
                if (i15 == 0) {
                    int zzm3 = zzdt.zzm(bArr2, i12, zzds2);
                    unsafe.putObject(obj2, j7, Boolean.valueOf(zzds2.zzb != 0));
                    unsafe.putInt(obj2, j8, i14);
                    return zzm3;
                }
                break;
            case 59:
                if (i15 == 2) {
                    int zzj3 = zzdt.zzj(bArr2, i12, zzds2);
                    int i17 = zzds2.zza;
                    if (i17 == 0) {
                        unsafe.putObject(obj2, j7, "");
                    } else if ((i9 & 536870912) == 0 || zzhm.zzd(bArr2, zzj3, zzj3 + i17)) {
                        unsafe.putObject(obj2, j7, new String(bArr2, zzj3, i17, zzez.zzb));
                        zzj3 += i17;
                    } else {
                        throw zzfa.zzb();
                    }
                    unsafe.putInt(obj2, j8, i14);
                    return zzj3;
                }
                break;
            case 60:
                if (i15 == 2) {
                    int zzd2 = zzdt.zzd(zzy(i16), bArr2, i12, i5, zzds2);
                    Object object = unsafe.getInt(obj2, j8) == i14 ? unsafe.getObject(obj2, j7) : null;
                    if (object == null) {
                        unsafe.putObject(obj2, j7, zzds2.zzc);
                    } else {
                        unsafe.putObject(obj2, j7, zzez.zzg(object, zzds2.zzc));
                    }
                    unsafe.putInt(obj2, j8, i14);
                    return zzd2;
                }
                break;
            case 61:
                if (i15 == 2) {
                    int zza2 = zzdt.zza(bArr2, i12, zzds2);
                    unsafe.putObject(obj2, j7, zzds2.zzc);
                    unsafe.putInt(obj2, j8, i14);
                    return zza2;
                }
                break;
            case 63:
                if (i15 == 0) {
                    int zzj4 = zzdt.zzj(bArr2, i12, zzds2);
                    int i18 = zzds2.zza;
                    zzex zzx = zzx(i16);
                    if (zzx == null || zzx.zza()) {
                        unsafe.putObject(obj2, j7, Integer.valueOf(i18));
                        unsafe.putInt(obj2, j8, i14);
                    } else {
                        zzc(obj).zzf(i13, Long.valueOf((long) i18));
                    }
                    return zzj4;
                }
                break;
            case 66:
                if (i15 == 0) {
                    int zzj5 = zzdt.zzj(bArr2, i12, zzds2);
                    unsafe.putObject(obj2, j7, Integer.valueOf(zzei.zzb(zzds2.zza)));
                    unsafe.putInt(obj2, j8, i14);
                    return zzj5;
                }
                break;
            case 67:
                if (i15 == 0) {
                    int zzm4 = zzdt.zzm(bArr2, i12, zzds2);
                    unsafe.putObject(obj2, j7, Long.valueOf(zzei.zzc(zzds2.zzb)));
                    unsafe.putInt(obj2, j8, i14);
                    return zzm4;
                }
                break;
            case 68:
                if (i15 == 3) {
                    int zzc2 = zzdt.zzc(zzy(i16), bArr, i2, i5, (i13 & -8) | 4, zzds);
                    Object object2 = unsafe.getInt(obj2, j8) == i14 ? unsafe.getObject(obj2, j7) : null;
                    if (object2 == null) {
                        unsafe.putObject(obj2, j7, zzds2.zzc);
                    } else {
                        unsafe.putObject(obj2, j7, zzez.zzg(object2, zzds2.zzc));
                    }
                    unsafe.putInt(obj2, j8, i14);
                    return zzc2;
                }
                break;
        }
        return i12;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v0, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v7, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v1, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v2, resolved type: byte} */
    /* JADX WARNING: Code restructure failed: missing block: B:100:0x02c0, code lost:
        r2 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:107:0x02f4, code lost:
        if (r0 != r14) goto L_0x02a6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:110:0x0313, code lost:
        if (r0 != r14) goto L_0x02a6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00ad, code lost:
        r6 = r6 | r22;
        r0 = r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00bf, code lost:
        r8 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00da, code lost:
        r6 = r6 | r22;
        r0 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x0154, code lost:
        r6 = r6 | r22;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x01a6, code lost:
        r0 = r8 + 8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x0212, code lost:
        r2 = r8;
        r28 = r9;
        r24 = r10;
        r18 = -1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x02a4, code lost:
        if (r0 != r32) goto L_0x02a6;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final int zzo(java.lang.Object r30, byte[] r31, int r32, int r33, com.google.android.gms.internal.auth.zzds r34) {
        /*
            r29 = this;
            r15 = r29
            r14 = r30
            r12 = r31
            r13 = r33
            r11 = r34
            sun.misc.Unsafe r9 = zzb
            r10 = 1048575(0xfffff, float:1.469367E-39)
            r16 = 0
            r8 = -1
            r0 = r32
            r1 = r8
            r7 = r10
            r2 = r16
            r6 = r2
        L_0x0019:
            if (r0 >= r13) goto L_0x033d
            int r3 = r0 + 1
            byte r0 = r12[r0]
            if (r0 >= 0) goto L_0x002b
            int r0 = com.google.android.gms.internal.auth.zzdt.zzk(r0, r12, r3, r11)
            int r3 = r11.zza
            r4 = r0
            r17 = r3
            goto L_0x002e
        L_0x002b:
            r17 = r0
            r4 = r3
        L_0x002e:
            int r5 = r17 >>> 3
            r3 = r17 & 7
            if (r5 <= r1) goto L_0x003c
            int r2 = r2 / 3
            int r0 = r15.zzr(r5, r2)
        L_0x003a:
            r2 = r0
            goto L_0x0041
        L_0x003c:
            int r0 = r15.zzq(r5)
            goto L_0x003a
        L_0x0041:
            if (r2 != r8) goto L_0x004e
            r2 = r4
            r21 = r5
            r18 = r8
            r28 = r9
            r24 = r16
            goto L_0x0316
        L_0x004e:
            int[] r0 = r15.zzc
            int r1 = r2 + 1
            r1 = r0[r1]
            int r8 = zzu(r1)
            r32 = r5
            r5 = r1 & r10
            long r10 = (long) r5
            r5 = 17
            r20 = r10
            if (r8 > r5) goto L_0x021b
            int r5 = r2 + 2
            r0 = r0[r5]
            int r5 = r0 >>> 20
            r11 = 1
            int r22 = r11 << r5
            r5 = 1048575(0xfffff, float:1.469367E-39)
            r0 = r0 & r5
            if (r0 == r7) goto L_0x0080
            if (r7 == r5) goto L_0x0078
            long r10 = (long) r7
            r9.putInt(r14, r10, r6)
        L_0x0078:
            if (r0 == r5) goto L_0x007f
            long r6 = (long) r0
            int r6 = r9.getInt(r14, r6)
        L_0x007f:
            r7 = r0
        L_0x0080:
            r0 = 5
            switch(r8) {
                case 0: goto L_0x01f9;
                case 1: goto L_0x01de;
                case 2: goto L_0x01bf;
                case 3: goto L_0x01bf;
                case 4: goto L_0x01a9;
                case 5: goto L_0x018c;
                case 6: goto L_0x0177;
                case 7: goto L_0x0158;
                case 8: goto L_0x0133;
                case 9: goto L_0x0109;
                case 10: goto L_0x00f3;
                case 11: goto L_0x01a9;
                case 12: goto L_0x00de;
                case 13: goto L_0x0177;
                case 14: goto L_0x018c;
                case 15: goto L_0x00c2;
                case 16: goto L_0x008e;
                default: goto L_0x0084;
            }
        L_0x0084:
            r21 = r32
            r11 = r34
            r10 = r2
            r8 = r4
            r24 = r5
            goto L_0x0212
        L_0x008e:
            if (r3 != 0) goto L_0x00b8
            r11 = r34
            r0 = r20
            int r8 = com.google.android.gms.internal.auth.zzdt.zzm(r12, r4, r11)
            long r3 = r11.zzb
            long r19 = com.google.android.gms.internal.auth.zzei.zzc(r3)
            r3 = r0
            r0 = r9
            r1 = r30
            r10 = r2
            r2 = r3
            r21 = r32
            r24 = r5
            r4 = r19
            r0.putLong(r1, r2, r4)
        L_0x00ad:
            r6 = r6 | r22
            r0 = r8
        L_0x00b0:
            r2 = r10
            r1 = r21
            r10 = r24
            r8 = -1
            goto L_0x0019
        L_0x00b8:
            r21 = r32
            r11 = r34
            r10 = r2
            r24 = r5
        L_0x00bf:
            r8 = r4
            goto L_0x0212
        L_0x00c2:
            r11 = r34
            r10 = r2
            r24 = r5
            r0 = r20
            r21 = r32
            if (r3 != 0) goto L_0x00bf
            int r2 = com.google.android.gms.internal.auth.zzdt.zzj(r12, r4, r11)
            int r3 = r11.zza
            int r3 = com.google.android.gms.internal.auth.zzei.zzb(r3)
            r9.putInt(r14, r0, r3)
        L_0x00da:
            r6 = r6 | r22
            r0 = r2
            goto L_0x00b0
        L_0x00de:
            r11 = r34
            r10 = r2
            r24 = r5
            r0 = r20
            r21 = r32
            if (r3 != 0) goto L_0x00bf
            int r2 = com.google.android.gms.internal.auth.zzdt.zzj(r12, r4, r11)
            int r3 = r11.zza
            r9.putInt(r14, r0, r3)
            goto L_0x00da
        L_0x00f3:
            r11 = r34
            r10 = r2
            r24 = r5
            r0 = r20
            r2 = 2
            r21 = r32
            if (r3 != r2) goto L_0x00bf
            int r2 = com.google.android.gms.internal.auth.zzdt.zza(r12, r4, r11)
            java.lang.Object r3 = r11.zzc
            r9.putObject(r14, r0, r3)
            goto L_0x00da
        L_0x0109:
            r11 = r34
            r10 = r2
            r24 = r5
            r0 = r20
            r2 = 2
            r21 = r32
            if (r3 != r2) goto L_0x00bf
            com.google.android.gms.internal.auth.zzgh r2 = r15.zzy(r10)
            int r2 = com.google.android.gms.internal.auth.zzdt.zzd(r2, r12, r4, r13, r11)
            java.lang.Object r3 = r9.getObject(r14, r0)
            if (r3 != 0) goto L_0x0129
            java.lang.Object r3 = r11.zzc
            r9.putObject(r14, r0, r3)
            goto L_0x00da
        L_0x0129:
            java.lang.Object r4 = r11.zzc
            java.lang.Object r3 = com.google.android.gms.internal.auth.zzez.zzg(r3, r4)
            r9.putObject(r14, r0, r3)
            goto L_0x00da
        L_0x0133:
            r11 = r34
            r10 = r2
            r24 = r5
            r25 = r20
            r0 = 2
            r21 = r32
            if (r3 != r0) goto L_0x00bf
            r0 = 536870912(0x20000000, float:1.0842022E-19)
            r0 = r0 & r1
            if (r0 != 0) goto L_0x0149
            int r0 = com.google.android.gms.internal.auth.zzdt.zzg(r12, r4, r11)
            goto L_0x014d
        L_0x0149:
            int r0 = com.google.android.gms.internal.auth.zzdt.zzh(r12, r4, r11)
        L_0x014d:
            java.lang.Object r1 = r11.zzc
            r2 = r25
            r9.putObject(r14, r2, r1)
        L_0x0154:
            r6 = r6 | r22
            goto L_0x00b0
        L_0x0158:
            r11 = r34
            r10 = r2
            r24 = r5
            r1 = r20
            r21 = r32
            if (r3 != 0) goto L_0x00bf
            int r0 = com.google.android.gms.internal.auth.zzdt.zzm(r12, r4, r11)
            long r3 = r11.zzb
            r19 = 0
            int r3 = (r3 > r19 ? 1 : (r3 == r19 ? 0 : -1))
            if (r3 == 0) goto L_0x0171
            r3 = 1
            goto L_0x0173
        L_0x0171:
            r3 = r16
        L_0x0173:
            com.google.android.gms.internal.auth.zzhi.zzk(r14, r1, r3)
            goto L_0x0154
        L_0x0177:
            r11 = r34
            r10 = r2
            r24 = r5
            r1 = r20
            r21 = r32
            if (r3 != r0) goto L_0x00bf
            int r0 = com.google.android.gms.internal.auth.zzdt.zzb(r12, r4)
            r9.putInt(r14, r1, r0)
            int r0 = r4 + 4
            goto L_0x0154
        L_0x018c:
            r11 = r34
            r10 = r2
            r24 = r5
            r1 = r20
            r0 = 1
            r21 = r32
            if (r3 != r0) goto L_0x00bf
            long r19 = com.google.android.gms.internal.auth.zzdt.zzn(r12, r4)
            r0 = r9
            r2 = r1
            r1 = r30
            r8 = r4
            r4 = r19
            r0.putLong(r1, r2, r4)
        L_0x01a6:
            int r0 = r8 + 8
            goto L_0x0154
        L_0x01a9:
            r11 = r34
            r10 = r2
            r8 = r4
            r24 = r5
            r4 = r20
            r21 = r32
            if (r3 != 0) goto L_0x0212
            int r0 = com.google.android.gms.internal.auth.zzdt.zzj(r12, r8, r11)
            int r1 = r11.zza
            r9.putInt(r14, r4, r1)
            goto L_0x0154
        L_0x01bf:
            r11 = r34
            r10 = r2
            r8 = r4
            r24 = r5
            r4 = r20
            r21 = r32
            if (r3 != 0) goto L_0x0212
            int r8 = com.google.android.gms.internal.auth.zzdt.zzm(r12, r8, r11)
            long r2 = r11.zzb
            r0 = r9
            r1 = r30
            r19 = r2
            r2 = r4
            r4 = r19
            r0.putLong(r1, r2, r4)
            goto L_0x00ad
        L_0x01de:
            r11 = r34
            r10 = r2
            r8 = r4
            r24 = r5
            r4 = r20
            r21 = r32
            if (r3 != r0) goto L_0x0212
            int r0 = com.google.android.gms.internal.auth.zzdt.zzb(r12, r8)
            float r0 = java.lang.Float.intBitsToFloat(r0)
            com.google.android.gms.internal.auth.zzhi.zzm(r14, r4, r0)
            int r0 = r8 + 4
            goto L_0x0154
        L_0x01f9:
            r11 = r34
            r10 = r2
            r8 = r4
            r24 = r5
            r4 = r20
            r0 = 1
            r21 = r32
            if (r3 != r0) goto L_0x0212
            long r0 = com.google.android.gms.internal.auth.zzdt.zzn(r12, r8)
            double r0 = java.lang.Double.longBitsToDouble(r0)
            com.google.android.gms.internal.auth.zzhi.zzl(r14, r4, r0)
            goto L_0x01a6
        L_0x0212:
            r2 = r8
            r28 = r9
            r24 = r10
            r18 = -1
            goto L_0x0316
        L_0x021b:
            r11 = r34
            r10 = r2
            r2 = r4
            r4 = r20
            r24 = 1048575(0xfffff, float:1.469367E-39)
            r21 = r32
            r0 = 27
            if (r8 != r0) goto L_0x026c
            r0 = 2
            if (r3 != r0) goto L_0x0260
            java.lang.Object r0 = r9.getObject(r14, r4)
            com.google.android.gms.internal.auth.zzey r0 = (com.google.android.gms.internal.auth.zzey) r0
            boolean r1 = r0.zzc()
            if (r1 != 0) goto L_0x024a
            int r1 = r0.size()
            if (r1 != 0) goto L_0x0242
            r1 = 10
            goto L_0x0243
        L_0x0242:
            int r1 = r1 + r1
        L_0x0243:
            com.google.android.gms.internal.auth.zzey r0 = r0.zzd(r1)
            r9.putObject(r14, r4, r0)
        L_0x024a:
            r5 = r0
            com.google.android.gms.internal.auth.zzgh r0 = r15.zzy(r10)
            r1 = r17
            r3 = r2
            r2 = r31
            r4 = r33
            r8 = r6
            r6 = r34
            int r0 = com.google.android.gms.internal.auth.zzdt.zze(r0, r1, r2, r3, r4, r5, r6)
            r6 = r8
            goto L_0x00b0
        L_0x0260:
            r14 = r2
            r23 = r6
            r15 = r7
            r28 = r9
            r24 = r10
            r18 = -1
            goto L_0x02f7
        L_0x026c:
            r0 = 49
            if (r8 > r0) goto L_0x02c6
            long r0 = (long) r1
            r19 = r0
            r0 = r29
            r1 = r30
            r32 = r2
            r2 = r31
            r22 = r3
            r3 = r32
            r25 = r4
            r4 = r33
            r5 = r17
            r15 = r6
            r6 = r21
            r23 = r15
            r15 = r7
            r7 = r22
            r27 = r8
            r18 = -1
            r8 = r10
            r28 = r9
            r24 = r10
            r9 = r19
            r11 = r27
            r12 = r25
            r14 = r34
            int r0 = r0.zzp(r1, r2, r3, r4, r5, r6, r7, r8, r9, r11, r12, r14)
            r14 = r32
            if (r0 == r14) goto L_0x02c0
        L_0x02a6:
            r14 = r30
            r12 = r31
            r13 = r33
            r11 = r34
            r7 = r15
            r8 = r18
            r1 = r21
            r6 = r23
            r2 = r24
            r9 = r28
            r10 = 1048575(0xfffff, float:1.469367E-39)
            r15 = r29
            goto L_0x0019
        L_0x02c0:
            r2 = r0
        L_0x02c1:
            r7 = r15
            r6 = r23
            goto L_0x0316
        L_0x02c6:
            r14 = r2
            r22 = r3
            r25 = r4
            r23 = r6
            r15 = r7
            r27 = r8
            r28 = r9
            r24 = r10
            r18 = -1
            r0 = 50
            r9 = r27
            if (r9 != r0) goto L_0x02f9
            r7 = r22
            r0 = 2
            if (r7 != r0) goto L_0x02f7
            r0 = r29
            r1 = r30
            r2 = r31
            r3 = r14
            r4 = r33
            r5 = r24
            r6 = r25
            r8 = r34
            int r0 = r0.zzm(r1, r2, r3, r4, r5, r6, r8)
            if (r0 == r14) goto L_0x02c0
            goto L_0x02a6
        L_0x02f7:
            r2 = r14
            goto L_0x02c1
        L_0x02f9:
            r7 = r22
            r0 = r29
            r8 = r1
            r1 = r30
            r2 = r31
            r3 = r14
            r4 = r33
            r5 = r17
            r6 = r21
            r10 = r25
            r12 = r24
            r13 = r34
            int r0 = r0.zzn(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r12, r13)
            if (r0 == r14) goto L_0x02c0
            goto L_0x02a6
        L_0x0316:
            com.google.android.gms.internal.auth.zzgz r4 = zzc(r30)
            r0 = r17
            r1 = r31
            r3 = r33
            r5 = r34
            int r0 = com.google.android.gms.internal.auth.zzdt.zzi(r0, r1, r2, r3, r4, r5)
            r15 = r29
            r14 = r30
            r12 = r31
            r13 = r33
            r11 = r34
            r8 = r18
            r1 = r21
            r2 = r24
            r9 = r28
            r10 = 1048575(0xfffff, float:1.469367E-39)
            goto L_0x0019
        L_0x033d:
            r23 = r6
            r15 = r7
            r28 = r9
            r1 = r10
            if (r15 == r1) goto L_0x034f
            long r1 = (long) r15
            r3 = r30
            r6 = r23
            r4 = r28
            r4.putInt(r3, r1, r6)
        L_0x034f:
            r1 = r33
            if (r0 != r1) goto L_0x0354
            return r0
        L_0x0354:
            com.google.android.gms.internal.auth.zzfa r0 = com.google.android.gms.internal.auth.zzfa.zzd()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.auth.zzfz.zzo(java.lang.Object, byte[], int, int, com.google.android.gms.internal.auth.zzds):int");
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    /* JADX WARNING: Removed duplicated region for block: B:258:0x044e A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x01f0  */
    private final int zzp(java.lang.Object r16, byte[] r17, int r18, int r19, int r20, int r21, int r22, int r23, long r24, int r26, long r27, com.google.android.gms.internal.auth.zzds r29) {
        /*
            r15 = this;
            r0 = r15
            r1 = r16
            r3 = r17
            r4 = r18
            r5 = r19
            r2 = r20
            r6 = r22
            r8 = r23
            r9 = r27
            r7 = r29
            sun.misc.Unsafe r11 = zzb
            java.lang.Object r12 = r11.getObject(r1, r9)
            com.google.android.gms.internal.auth.zzey r12 = (com.google.android.gms.internal.auth.zzey) r12
            boolean r13 = r12.zzc()
            if (r13 != 0) goto L_0x0032
            int r13 = r12.size()
            if (r13 != 0) goto L_0x002a
            r13 = 10
            goto L_0x002b
        L_0x002a:
            int r13 = r13 + r13
        L_0x002b:
            com.google.android.gms.internal.auth.zzey r12 = r12.zzd(r13)
            r11.putObject(r1, r9, r12)
        L_0x0032:
            r9 = 5
            r10 = 0
            r13 = 1
            r14 = 2
            switch(r26) {
                case 18: goto L_0x0401;
                case 19: goto L_0x03b4;
                case 20: goto L_0x0371;
                case 21: goto L_0x0371;
                case 22: goto L_0x0356;
                case 23: goto L_0x0315;
                case 24: goto L_0x02d4;
                case 25: goto L_0x027b;
                case 26: goto L_0x01c8;
                case 27: goto L_0x01ad;
                case 28: goto L_0x0153;
                case 29: goto L_0x0356;
                case 30: goto L_0x011a;
                case 31: goto L_0x02d4;
                case 32: goto L_0x0315;
                case 33: goto L_0x00cb;
                case 34: goto L_0x007c;
                case 35: goto L_0x0401;
                case 36: goto L_0x03b4;
                case 37: goto L_0x0371;
                case 38: goto L_0x0371;
                case 39: goto L_0x0356;
                case 40: goto L_0x0315;
                case 41: goto L_0x02d4;
                case 42: goto L_0x027b;
                case 43: goto L_0x0356;
                case 44: goto L_0x011a;
                case 45: goto L_0x02d4;
                case 46: goto L_0x0315;
                case 47: goto L_0x00cb;
                case 48: goto L_0x007c;
                default: goto L_0x003a;
            }
        L_0x003a:
            r1 = 3
            if (r6 != r1) goto L_0x044d
            com.google.android.gms.internal.auth.zzgh r1 = r15.zzy(r8)
            r6 = r2 & -8
            r6 = r6 | 4
            r21 = r1
            r22 = r17
            r23 = r18
            r24 = r19
            r25 = r6
            r26 = r29
            int r4 = com.google.android.gms.internal.auth.zzdt.zzc(r21, r22, r23, r24, r25, r26)
            java.lang.Object r8 = r7.zzc
            r12.add(r8)
        L_0x005a:
            if (r4 >= r5) goto L_0x007b
            int r8 = com.google.android.gms.internal.auth.zzdt.zzj(r3, r4, r7)
            int r9 = r7.zza
            if (r2 == r9) goto L_0x0065
            goto L_0x007b
        L_0x0065:
            r21 = r1
            r22 = r17
            r23 = r8
            r24 = r19
            r25 = r6
            r26 = r29
            int r4 = com.google.android.gms.internal.auth.zzdt.zzc(r21, r22, r23, r24, r25, r26)
            java.lang.Object r8 = r7.zzc
            r12.add(r8)
            goto L_0x005a
        L_0x007b:
            return r4
        L_0x007c:
            if (r6 != r14) goto L_0x00a0
            com.google.android.gms.internal.auth.zzfl r12 = (com.google.android.gms.internal.auth.zzfl) r12
            int r1 = com.google.android.gms.internal.auth.zzdt.zzj(r3, r4, r7)
            int r2 = r7.zza
            int r2 = r2 + r1
        L_0x0087:
            if (r1 >= r2) goto L_0x0097
            int r1 = com.google.android.gms.internal.auth.zzdt.zzm(r3, r1, r7)
            long r4 = r7.zzb
            long r4 = com.google.android.gms.internal.auth.zzei.zzc(r4)
            r12.zze(r4)
            goto L_0x0087
        L_0x0097:
            if (r1 != r2) goto L_0x009b
            goto L_0x044e
        L_0x009b:
            com.google.android.gms.internal.auth.zzfa r1 = com.google.android.gms.internal.auth.zzfa.zzf()
            throw r1
        L_0x00a0:
            if (r6 != 0) goto L_0x044d
            com.google.android.gms.internal.auth.zzfl r12 = (com.google.android.gms.internal.auth.zzfl) r12
            int r1 = com.google.android.gms.internal.auth.zzdt.zzm(r3, r4, r7)
            long r8 = r7.zzb
            long r8 = com.google.android.gms.internal.auth.zzei.zzc(r8)
            r12.zze(r8)
        L_0x00b1:
            if (r1 >= r5) goto L_0x00ca
            int r4 = com.google.android.gms.internal.auth.zzdt.zzj(r3, r1, r7)
            int r6 = r7.zza
            if (r2 == r6) goto L_0x00bc
            goto L_0x00ca
        L_0x00bc:
            int r1 = com.google.android.gms.internal.auth.zzdt.zzm(r3, r4, r7)
            long r8 = r7.zzb
            long r8 = com.google.android.gms.internal.auth.zzei.zzc(r8)
            r12.zze(r8)
            goto L_0x00b1
        L_0x00ca:
            return r1
        L_0x00cb:
            if (r6 != r14) goto L_0x00ef
            com.google.android.gms.internal.auth.zzev r12 = (com.google.android.gms.internal.auth.zzev) r12
            int r1 = com.google.android.gms.internal.auth.zzdt.zzj(r3, r4, r7)
            int r2 = r7.zza
            int r2 = r2 + r1
        L_0x00d6:
            if (r1 >= r2) goto L_0x00e6
            int r1 = com.google.android.gms.internal.auth.zzdt.zzj(r3, r1, r7)
            int r4 = r7.zza
            int r4 = com.google.android.gms.internal.auth.zzei.zzb(r4)
            r12.zze(r4)
            goto L_0x00d6
        L_0x00e6:
            if (r1 != r2) goto L_0x00ea
            goto L_0x044e
        L_0x00ea:
            com.google.android.gms.internal.auth.zzfa r1 = com.google.android.gms.internal.auth.zzfa.zzf()
            throw r1
        L_0x00ef:
            if (r6 != 0) goto L_0x044d
            com.google.android.gms.internal.auth.zzev r12 = (com.google.android.gms.internal.auth.zzev) r12
            int r1 = com.google.android.gms.internal.auth.zzdt.zzj(r3, r4, r7)
            int r4 = r7.zza
            int r4 = com.google.android.gms.internal.auth.zzei.zzb(r4)
            r12.zze(r4)
        L_0x0100:
            if (r1 >= r5) goto L_0x0119
            int r4 = com.google.android.gms.internal.auth.zzdt.zzj(r3, r1, r7)
            int r6 = r7.zza
            if (r2 == r6) goto L_0x010b
            goto L_0x0119
        L_0x010b:
            int r1 = com.google.android.gms.internal.auth.zzdt.zzj(r3, r4, r7)
            int r4 = r7.zza
            int r4 = com.google.android.gms.internal.auth.zzei.zzb(r4)
            r12.zze(r4)
            goto L_0x0100
        L_0x0119:
            return r1
        L_0x011a:
            if (r6 != r14) goto L_0x0121
            int r2 = com.google.android.gms.internal.auth.zzdt.zzf(r3, r4, r12, r7)
            goto L_0x0132
        L_0x0121:
            if (r6 != 0) goto L_0x044d
            r2 = r20
            r3 = r17
            r4 = r18
            r5 = r19
            r6 = r12
            r7 = r29
            int r2 = com.google.android.gms.internal.auth.zzdt.zzl(r2, r3, r4, r5, r6, r7)
        L_0x0132:
            com.google.android.gms.internal.auth.zzeu r1 = (com.google.android.gms.internal.auth.zzeu) r1
            com.google.android.gms.internal.auth.zzgz r3 = r1.zzc
            com.google.android.gms.internal.auth.zzgz r4 = com.google.android.gms.internal.auth.zzgz.zza()
            if (r3 != r4) goto L_0x013d
            r3 = 0
        L_0x013d:
            com.google.android.gms.internal.auth.zzex r4 = r15.zzx(r8)
            com.google.android.gms.internal.auth.zzgy r5 = r0.zzm
            r6 = r21
            java.lang.Object r3 = com.google.android.gms.internal.auth.zzgj.zzd(r6, r12, r4, r3, r5)
            if (r3 != 0) goto L_0x014e
        L_0x014b:
            r1 = r2
            goto L_0x044e
        L_0x014e:
            com.google.android.gms.internal.auth.zzgz r3 = (com.google.android.gms.internal.auth.zzgz) r3
            r1.zzc = r3
            return r2
        L_0x0153:
            if (r6 != r14) goto L_0x044d
            int r1 = com.google.android.gms.internal.auth.zzdt.zzj(r3, r4, r7)
            int r4 = r7.zza
            if (r4 < 0) goto L_0x01a8
            int r6 = r3.length
            int r6 = r6 - r1
            if (r4 > r6) goto L_0x01a3
            if (r4 != 0) goto L_0x0169
            com.google.android.gms.internal.auth.zzee r4 = com.google.android.gms.internal.auth.zzee.zzb
            r12.add(r4)
            goto L_0x0171
        L_0x0169:
            com.google.android.gms.internal.auth.zzee r6 = com.google.android.gms.internal.auth.zzee.zzk(r3, r1, r4)
            r12.add(r6)
        L_0x0170:
            int r1 = r1 + r4
        L_0x0171:
            if (r1 >= r5) goto L_0x01a2
            int r4 = com.google.android.gms.internal.auth.zzdt.zzj(r3, r1, r7)
            int r6 = r7.zza
            if (r2 == r6) goto L_0x017c
            goto L_0x01a2
        L_0x017c:
            int r1 = com.google.android.gms.internal.auth.zzdt.zzj(r3, r4, r7)
            int r4 = r7.zza
            if (r4 < 0) goto L_0x019d
            int r6 = r3.length
            int r6 = r6 - r1
            if (r4 > r6) goto L_0x0198
            if (r4 != 0) goto L_0x0190
            com.google.android.gms.internal.auth.zzee r4 = com.google.android.gms.internal.auth.zzee.zzb
            r12.add(r4)
            goto L_0x0171
        L_0x0190:
            com.google.android.gms.internal.auth.zzee r6 = com.google.android.gms.internal.auth.zzee.zzk(r3, r1, r4)
            r12.add(r6)
            goto L_0x0170
        L_0x0198:
            com.google.android.gms.internal.auth.zzfa r1 = com.google.android.gms.internal.auth.zzfa.zzf()
            throw r1
        L_0x019d:
            com.google.android.gms.internal.auth.zzfa r1 = com.google.android.gms.internal.auth.zzfa.zzc()
            throw r1
        L_0x01a2:
            return r1
        L_0x01a3:
            com.google.android.gms.internal.auth.zzfa r1 = com.google.android.gms.internal.auth.zzfa.zzf()
            throw r1
        L_0x01a8:
            com.google.android.gms.internal.auth.zzfa r1 = com.google.android.gms.internal.auth.zzfa.zzc()
            throw r1
        L_0x01ad:
            if (r6 == r14) goto L_0x01b1
            goto L_0x044d
        L_0x01b1:
            com.google.android.gms.internal.auth.zzgh r1 = r15.zzy(r8)
            r21 = r1
            r22 = r20
            r23 = r17
            r24 = r18
            r25 = r19
            r26 = r12
            r27 = r29
            int r1 = com.google.android.gms.internal.auth.zzdt.zze(r21, r22, r23, r24, r25, r26, r27)
            return r1
        L_0x01c8:
            if (r6 != r14) goto L_0x044d
            r8 = 536870912(0x20000000, double:2.652494739E-315)
            long r8 = r24 & r8
            int r1 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            java.lang.String r6 = ""
            if (r1 != 0) goto L_0x021b
            int r1 = com.google.android.gms.internal.auth.zzdt.zzj(r3, r4, r7)
            int r4 = r7.zza
            if (r4 < 0) goto L_0x0216
            if (r4 != 0) goto L_0x01e3
            r12.add(r6)
            goto L_0x01ee
        L_0x01e3:
            java.lang.String r8 = new java.lang.String
            java.nio.charset.Charset r9 = com.google.android.gms.internal.auth.zzez.zzb
            r8.<init>(r3, r1, r4, r9)
            r12.add(r8)
        L_0x01ed:
            int r1 = r1 + r4
        L_0x01ee:
            if (r1 >= r5) goto L_0x044e
            int r4 = com.google.android.gms.internal.auth.zzdt.zzj(r3, r1, r7)
            int r8 = r7.zza
            if (r2 != r8) goto L_0x044e
            int r1 = com.google.android.gms.internal.auth.zzdt.zzj(r3, r4, r7)
            int r4 = r7.zza
            if (r4 < 0) goto L_0x0211
            if (r4 != 0) goto L_0x0206
            r12.add(r6)
            goto L_0x01ee
        L_0x0206:
            java.lang.String r8 = new java.lang.String
            java.nio.charset.Charset r9 = com.google.android.gms.internal.auth.zzez.zzb
            r8.<init>(r3, r1, r4, r9)
            r12.add(r8)
            goto L_0x01ed
        L_0x0211:
            com.google.android.gms.internal.auth.zzfa r1 = com.google.android.gms.internal.auth.zzfa.zzc()
            throw r1
        L_0x0216:
            com.google.android.gms.internal.auth.zzfa r1 = com.google.android.gms.internal.auth.zzfa.zzc()
            throw r1
        L_0x021b:
            int r1 = com.google.android.gms.internal.auth.zzdt.zzj(r3, r4, r7)
            int r4 = r7.zza
            if (r4 < 0) goto L_0x0276
            if (r4 != 0) goto L_0x0229
            r12.add(r6)
            goto L_0x023c
        L_0x0229:
            int r8 = r1 + r4
            boolean r9 = com.google.android.gms.internal.auth.zzhm.zzd(r3, r1, r8)
            if (r9 == 0) goto L_0x0271
            java.lang.String r9 = new java.lang.String
            java.nio.charset.Charset r10 = com.google.android.gms.internal.auth.zzez.zzb
            r9.<init>(r3, r1, r4, r10)
            r12.add(r9)
        L_0x023b:
            r1 = r8
        L_0x023c:
            if (r1 >= r5) goto L_0x044e
            int r4 = com.google.android.gms.internal.auth.zzdt.zzj(r3, r1, r7)
            int r8 = r7.zza
            if (r2 != r8) goto L_0x044e
            int r1 = com.google.android.gms.internal.auth.zzdt.zzj(r3, r4, r7)
            int r4 = r7.zza
            if (r4 < 0) goto L_0x026c
            if (r4 != 0) goto L_0x0254
            r12.add(r6)
            goto L_0x023c
        L_0x0254:
            int r8 = r1 + r4
            boolean r9 = com.google.android.gms.internal.auth.zzhm.zzd(r3, r1, r8)
            if (r9 == 0) goto L_0x0267
            java.lang.String r9 = new java.lang.String
            java.nio.charset.Charset r10 = com.google.android.gms.internal.auth.zzez.zzb
            r9.<init>(r3, r1, r4, r10)
            r12.add(r9)
            goto L_0x023b
        L_0x0267:
            com.google.android.gms.internal.auth.zzfa r1 = com.google.android.gms.internal.auth.zzfa.zzb()
            throw r1
        L_0x026c:
            com.google.android.gms.internal.auth.zzfa r1 = com.google.android.gms.internal.auth.zzfa.zzc()
            throw r1
        L_0x0271:
            com.google.android.gms.internal.auth.zzfa r1 = com.google.android.gms.internal.auth.zzfa.zzb()
            throw r1
        L_0x0276:
            com.google.android.gms.internal.auth.zzfa r1 = com.google.android.gms.internal.auth.zzfa.zzc()
            throw r1
        L_0x027b:
            r1 = 0
            if (r6 != r14) goto L_0x02a3
            com.google.android.gms.internal.auth.zzdu r12 = (com.google.android.gms.internal.auth.zzdu) r12
            int r2 = com.google.android.gms.internal.auth.zzdt.zzj(r3, r4, r7)
            int r4 = r7.zza
            int r4 = r4 + r2
        L_0x0287:
            if (r2 >= r4) goto L_0x029a
            int r2 = com.google.android.gms.internal.auth.zzdt.zzm(r3, r2, r7)
            long r5 = r7.zzb
            int r5 = (r5 > r10 ? 1 : (r5 == r10 ? 0 : -1))
            if (r5 == 0) goto L_0x0295
            r5 = r13
            goto L_0x0296
        L_0x0295:
            r5 = r1
        L_0x0296:
            r12.zze(r5)
            goto L_0x0287
        L_0x029a:
            if (r2 != r4) goto L_0x029e
            goto L_0x014b
        L_0x029e:
            com.google.android.gms.internal.auth.zzfa r1 = com.google.android.gms.internal.auth.zzfa.zzf()
            throw r1
        L_0x02a3:
            if (r6 != 0) goto L_0x044d
            com.google.android.gms.internal.auth.zzdu r12 = (com.google.android.gms.internal.auth.zzdu) r12
            int r4 = com.google.android.gms.internal.auth.zzdt.zzm(r3, r4, r7)
            long r8 = r7.zzb
            int r6 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r6 == 0) goto L_0x02b3
            r6 = r13
            goto L_0x02b4
        L_0x02b3:
            r6 = r1
        L_0x02b4:
            r12.zze(r6)
        L_0x02b7:
            if (r4 >= r5) goto L_0x02d3
            int r6 = com.google.android.gms.internal.auth.zzdt.zzj(r3, r4, r7)
            int r8 = r7.zza
            if (r2 == r8) goto L_0x02c2
            goto L_0x02d3
        L_0x02c2:
            int r4 = com.google.android.gms.internal.auth.zzdt.zzm(r3, r6, r7)
            long r8 = r7.zzb
            int r6 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r6 == 0) goto L_0x02ce
            r6 = r13
            goto L_0x02cf
        L_0x02ce:
            r6 = r1
        L_0x02cf:
            r12.zze(r6)
            goto L_0x02b7
        L_0x02d3:
            return r4
        L_0x02d4:
            if (r6 != r14) goto L_0x02f4
            com.google.android.gms.internal.auth.zzev r12 = (com.google.android.gms.internal.auth.zzev) r12
            int r1 = com.google.android.gms.internal.auth.zzdt.zzj(r3, r4, r7)
            int r2 = r7.zza
            int r2 = r2 + r1
        L_0x02df:
            if (r1 >= r2) goto L_0x02eb
            int r4 = com.google.android.gms.internal.auth.zzdt.zzb(r3, r1)
            r12.zze(r4)
            int r1 = r1 + 4
            goto L_0x02df
        L_0x02eb:
            if (r1 != r2) goto L_0x02ef
            goto L_0x044e
        L_0x02ef:
            com.google.android.gms.internal.auth.zzfa r1 = com.google.android.gms.internal.auth.zzfa.zzf()
            throw r1
        L_0x02f4:
            if (r6 != r9) goto L_0x044d
            com.google.android.gms.internal.auth.zzev r12 = (com.google.android.gms.internal.auth.zzev) r12
            int r1 = com.google.android.gms.internal.auth.zzdt.zzb(r17, r18)
            r12.zze(r1)
        L_0x02ff:
            int r1 = r4 + 4
            if (r1 >= r5) goto L_0x0314
            int r4 = com.google.android.gms.internal.auth.zzdt.zzj(r3, r1, r7)
            int r6 = r7.zza
            if (r2 == r6) goto L_0x030c
            goto L_0x0314
        L_0x030c:
            int r1 = com.google.android.gms.internal.auth.zzdt.zzb(r3, r4)
            r12.zze(r1)
            goto L_0x02ff
        L_0x0314:
            return r1
        L_0x0315:
            if (r6 != r14) goto L_0x0335
            com.google.android.gms.internal.auth.zzfl r12 = (com.google.android.gms.internal.auth.zzfl) r12
            int r1 = com.google.android.gms.internal.auth.zzdt.zzj(r3, r4, r7)
            int r2 = r7.zza
            int r2 = r2 + r1
        L_0x0320:
            if (r1 >= r2) goto L_0x032c
            long r4 = com.google.android.gms.internal.auth.zzdt.zzn(r3, r1)
            r12.zze(r4)
            int r1 = r1 + 8
            goto L_0x0320
        L_0x032c:
            if (r1 != r2) goto L_0x0330
            goto L_0x044e
        L_0x0330:
            com.google.android.gms.internal.auth.zzfa r1 = com.google.android.gms.internal.auth.zzfa.zzf()
            throw r1
        L_0x0335:
            if (r6 != r13) goto L_0x044d
            com.google.android.gms.internal.auth.zzfl r12 = (com.google.android.gms.internal.auth.zzfl) r12
            long r8 = com.google.android.gms.internal.auth.zzdt.zzn(r17, r18)
            r12.zze(r8)
        L_0x0340:
            int r1 = r4 + 8
            if (r1 >= r5) goto L_0x0355
            int r4 = com.google.android.gms.internal.auth.zzdt.zzj(r3, r1, r7)
            int r6 = r7.zza
            if (r2 == r6) goto L_0x034d
            goto L_0x0355
        L_0x034d:
            long r8 = com.google.android.gms.internal.auth.zzdt.zzn(r3, r4)
            r12.zze(r8)
            goto L_0x0340
        L_0x0355:
            return r1
        L_0x0356:
            if (r6 != r14) goto L_0x035e
            int r1 = com.google.android.gms.internal.auth.zzdt.zzf(r3, r4, r12, r7)
            goto L_0x044e
        L_0x035e:
            if (r6 == 0) goto L_0x0362
            goto L_0x044d
        L_0x0362:
            r21 = r17
            r22 = r18
            r23 = r19
            r24 = r12
            r25 = r29
            int r1 = com.google.android.gms.internal.auth.zzdt.zzl(r20, r21, r22, r23, r24, r25)
            return r1
        L_0x0371:
            if (r6 != r14) goto L_0x0391
            com.google.android.gms.internal.auth.zzfl r12 = (com.google.android.gms.internal.auth.zzfl) r12
            int r1 = com.google.android.gms.internal.auth.zzdt.zzj(r3, r4, r7)
            int r2 = r7.zza
            int r2 = r2 + r1
        L_0x037c:
            if (r1 >= r2) goto L_0x0388
            int r1 = com.google.android.gms.internal.auth.zzdt.zzm(r3, r1, r7)
            long r4 = r7.zzb
            r12.zze(r4)
            goto L_0x037c
        L_0x0388:
            if (r1 != r2) goto L_0x038c
            goto L_0x044e
        L_0x038c:
            com.google.android.gms.internal.auth.zzfa r1 = com.google.android.gms.internal.auth.zzfa.zzf()
            throw r1
        L_0x0391:
            if (r6 != 0) goto L_0x044d
            com.google.android.gms.internal.auth.zzfl r12 = (com.google.android.gms.internal.auth.zzfl) r12
            int r1 = com.google.android.gms.internal.auth.zzdt.zzm(r3, r4, r7)
            long r8 = r7.zzb
            r12.zze(r8)
        L_0x039e:
            if (r1 >= r5) goto L_0x03b3
            int r4 = com.google.android.gms.internal.auth.zzdt.zzj(r3, r1, r7)
            int r6 = r7.zza
            if (r2 == r6) goto L_0x03a9
            goto L_0x03b3
        L_0x03a9:
            int r1 = com.google.android.gms.internal.auth.zzdt.zzm(r3, r4, r7)
            long r8 = r7.zzb
            r12.zze(r8)
            goto L_0x039e
        L_0x03b3:
            return r1
        L_0x03b4:
            if (r6 != r14) goto L_0x03d8
            com.google.android.gms.internal.auth.zzeq r12 = (com.google.android.gms.internal.auth.zzeq) r12
            int r1 = com.google.android.gms.internal.auth.zzdt.zzj(r3, r4, r7)
            int r2 = r7.zza
            int r2 = r2 + r1
        L_0x03bf:
            if (r1 >= r2) goto L_0x03cf
            int r4 = com.google.android.gms.internal.auth.zzdt.zzb(r3, r1)
            float r4 = java.lang.Float.intBitsToFloat(r4)
            r12.zze(r4)
            int r1 = r1 + 4
            goto L_0x03bf
        L_0x03cf:
            if (r1 != r2) goto L_0x03d3
            goto L_0x044e
        L_0x03d3:
            com.google.android.gms.internal.auth.zzfa r1 = com.google.android.gms.internal.auth.zzfa.zzf()
            throw r1
        L_0x03d8:
            if (r6 != r9) goto L_0x044d
            com.google.android.gms.internal.auth.zzeq r12 = (com.google.android.gms.internal.auth.zzeq) r12
            int r1 = com.google.android.gms.internal.auth.zzdt.zzb(r17, r18)
            float r1 = java.lang.Float.intBitsToFloat(r1)
            r12.zze(r1)
        L_0x03e7:
            int r1 = r4 + 4
            if (r1 >= r5) goto L_0x0400
            int r4 = com.google.android.gms.internal.auth.zzdt.zzj(r3, r1, r7)
            int r6 = r7.zza
            if (r2 == r6) goto L_0x03f4
            goto L_0x0400
        L_0x03f4:
            int r1 = com.google.android.gms.internal.auth.zzdt.zzb(r3, r4)
            float r1 = java.lang.Float.intBitsToFloat(r1)
            r12.zze(r1)
            goto L_0x03e7
        L_0x0400:
            return r1
        L_0x0401:
            if (r6 != r14) goto L_0x0424
            com.google.android.gms.internal.auth.zzej r12 = (com.google.android.gms.internal.auth.zzej) r12
            int r1 = com.google.android.gms.internal.auth.zzdt.zzj(r3, r4, r7)
            int r2 = r7.zza
            int r2 = r2 + r1
        L_0x040c:
            if (r1 >= r2) goto L_0x041c
            long r4 = com.google.android.gms.internal.auth.zzdt.zzn(r3, r1)
            double r4 = java.lang.Double.longBitsToDouble(r4)
            r12.zze(r4)
            int r1 = r1 + 8
            goto L_0x040c
        L_0x041c:
            if (r1 != r2) goto L_0x041f
            goto L_0x044e
        L_0x041f:
            com.google.android.gms.internal.auth.zzfa r1 = com.google.android.gms.internal.auth.zzfa.zzf()
            throw r1
        L_0x0424:
            if (r6 != r13) goto L_0x044d
            com.google.android.gms.internal.auth.zzej r12 = (com.google.android.gms.internal.auth.zzej) r12
            long r8 = com.google.android.gms.internal.auth.zzdt.zzn(r17, r18)
            double r8 = java.lang.Double.longBitsToDouble(r8)
            r12.zze(r8)
        L_0x0433:
            int r1 = r4 + 8
            if (r1 >= r5) goto L_0x044c
            int r4 = com.google.android.gms.internal.auth.zzdt.zzj(r3, r1, r7)
            int r6 = r7.zza
            if (r2 == r6) goto L_0x0440
            goto L_0x044c
        L_0x0440:
            long r8 = com.google.android.gms.internal.auth.zzdt.zzn(r3, r4)
            double r8 = java.lang.Double.longBitsToDouble(r8)
            r12.zze(r8)
            goto L_0x0433
        L_0x044c:
            return r1
        L_0x044d:
            r1 = r4
        L_0x044e:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.auth.zzfz.zzp(java.lang.Object, byte[], int, int, int, int, int, int, long, int, long, com.google.android.gms.internal.auth.zzds):int");
    }

    private final int zzq(int i2) {
        if (i2 < this.zze || i2 > this.zzf) {
            return -1;
        }
        return zzt(i2, 0);
    }

    private final int zzr(int i2, int i5) {
        if (i2 < this.zze || i2 > this.zzf) {
            return -1;
        }
        return zzt(i2, i5);
    }

    private final int zzs(int i2) {
        return this.zzc[i2 + 2];
    }

    private final int zzt(int i2, int i5) {
        int length = (this.zzc.length / 3) - 1;
        while (i5 <= length) {
            int i6 = (length + i5) >>> 1;
            int i7 = i6 * 3;
            int i8 = this.zzc[i7];
            if (i2 == i8) {
                return i7;
            }
            if (i2 < i8) {
                length = i6 - 1;
            } else {
                i5 = i6 + 1;
            }
        }
        return -1;
    }

    private static int zzu(int i2) {
        return (i2 >>> 20) & 255;
    }

    private final int zzv(int i2) {
        return this.zzc[i2 + 1];
    }

    private static long zzw(Object obj, long j6) {
        return ((Long) zzhi.zzf(obj, j6)).longValue();
    }

    private final zzex zzx(int i2) {
        int i5 = i2 / 3;
        return (zzex) this.zzd[i5 + i5 + 1];
    }

    private final zzgh zzy(int i2) {
        int i5 = i2 / 3;
        int i6 = i5 + i5;
        zzgh zzgh = (zzgh) this.zzd[i6];
        if (zzgh != null) {
            return zzgh;
        }
        zzgh zzb2 = zzge.zza().zzb((Class) this.zzd[i6 + 1]);
        this.zzd[i6] = zzb2;
        return zzb2;
    }

    private final Object zzz(int i2) {
        int i5 = i2 / 3;
        return this.zzd[i5 + i5];
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0050, code lost:
        r2 = r2 + r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x0181, code lost:
        r2 = (r2 * 53) + r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x002f, code lost:
        r2 = r3 + r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x023f, code lost:
        r1 = r1 + 3;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int zza(java.lang.Object r9) {
        /*
            r8 = this;
            int[] r0 = r8.zzc
            int r0 = r0.length
            r1 = 0
            r2 = r1
        L_0x0005:
            if (r1 >= r0) goto L_0x0243
            int r3 = r8.zzv(r1)
            int[] r4 = r8.zzc
            r4 = r4[r1]
            r5 = 1048575(0xfffff, float:1.469367E-39)
            r5 = r5 & r3
            long r5 = (long) r5
            int r3 = zzu(r3)
            r7 = 37
            switch(r3) {
                case 0: goto L_0x022f;
                case 1: goto L_0x0223;
                case 2: goto L_0x0217;
                case 3: goto L_0x020b;
                case 4: goto L_0x0203;
                case 5: goto L_0x01f7;
                case 6: goto L_0x01ef;
                case 7: goto L_0x01e3;
                case 8: goto L_0x01d5;
                case 9: goto L_0x01ca;
                case 10: goto L_0x01be;
                case 11: goto L_0x01b6;
                case 12: goto L_0x01ae;
                case 13: goto L_0x01a6;
                case 14: goto L_0x019a;
                case 15: goto L_0x0192;
                case 16: goto L_0x0186;
                case 17: goto L_0x0177;
                case 18: goto L_0x016b;
                case 19: goto L_0x016b;
                case 20: goto L_0x016b;
                case 21: goto L_0x016b;
                case 22: goto L_0x016b;
                case 23: goto L_0x016b;
                case 24: goto L_0x016b;
                case 25: goto L_0x016b;
                case 26: goto L_0x016b;
                case 27: goto L_0x016b;
                case 28: goto L_0x016b;
                case 29: goto L_0x016b;
                case 30: goto L_0x016b;
                case 31: goto L_0x016b;
                case 32: goto L_0x016b;
                case 33: goto L_0x016b;
                case 34: goto L_0x016b;
                case 35: goto L_0x016b;
                case 36: goto L_0x016b;
                case 37: goto L_0x016b;
                case 38: goto L_0x016b;
                case 39: goto L_0x016b;
                case 40: goto L_0x016b;
                case 41: goto L_0x016b;
                case 42: goto L_0x016b;
                case 43: goto L_0x016b;
                case 44: goto L_0x016b;
                case 45: goto L_0x016b;
                case 46: goto L_0x016b;
                case 47: goto L_0x016b;
                case 48: goto L_0x016b;
                case 49: goto L_0x016b;
                case 50: goto L_0x015f;
                case 51: goto L_0x0143;
                case 52: goto L_0x012b;
                case 53: goto L_0x0119;
                case 54: goto L_0x0107;
                case 55: goto L_0x00f9;
                case 56: goto L_0x00e7;
                case 57: goto L_0x00d9;
                case 58: goto L_0x00c1;
                case 59: goto L_0x00ad;
                case 60: goto L_0x009c;
                case 61: goto L_0x008b;
                case 62: goto L_0x007e;
                case 63: goto L_0x0071;
                case 64: goto L_0x0064;
                case 65: goto L_0x0053;
                case 66: goto L_0x0044;
                case 67: goto L_0x0033;
                case 68: goto L_0x001f;
                default: goto L_0x001d;
            }
        L_0x001d:
            goto L_0x023f
        L_0x001f:
            boolean r3 = r8.zzJ(r9, r4, r1)
            if (r3 == 0) goto L_0x023f
            int r2 = r2 * 53
            java.lang.Object r3 = com.google.android.gms.internal.auth.zzhi.zzf(r9, r5)
            int r3 = r3.hashCode()
        L_0x002f:
            int r3 = r3 + r2
            r2 = r3
            goto L_0x023f
        L_0x0033:
            boolean r3 = r8.zzJ(r9, r4, r1)
            if (r3 == 0) goto L_0x023f
            int r2 = r2 * 53
            long r3 = zzw(r9, r5)
            int r3 = com.google.android.gms.internal.auth.zzez.zzc(r3)
            goto L_0x002f
        L_0x0044:
            boolean r3 = r8.zzJ(r9, r4, r1)
            if (r3 == 0) goto L_0x023f
            int r2 = r2 * 53
            int r3 = zzl(r9, r5)
        L_0x0050:
            int r2 = r2 + r3
            goto L_0x023f
        L_0x0053:
            boolean r3 = r8.zzJ(r9, r4, r1)
            if (r3 == 0) goto L_0x023f
            int r2 = r2 * 53
            long r3 = zzw(r9, r5)
            int r3 = com.google.android.gms.internal.auth.zzez.zzc(r3)
            goto L_0x002f
        L_0x0064:
            boolean r3 = r8.zzJ(r9, r4, r1)
            if (r3 == 0) goto L_0x023f
            int r2 = r2 * 53
            int r3 = zzl(r9, r5)
            goto L_0x0050
        L_0x0071:
            boolean r3 = r8.zzJ(r9, r4, r1)
            if (r3 == 0) goto L_0x023f
            int r2 = r2 * 53
            int r3 = zzl(r9, r5)
            goto L_0x0050
        L_0x007e:
            boolean r3 = r8.zzJ(r9, r4, r1)
            if (r3 == 0) goto L_0x023f
            int r2 = r2 * 53
            int r3 = zzl(r9, r5)
            goto L_0x0050
        L_0x008b:
            boolean r3 = r8.zzJ(r9, r4, r1)
            if (r3 == 0) goto L_0x023f
            int r2 = r2 * 53
            java.lang.Object r3 = com.google.android.gms.internal.auth.zzhi.zzf(r9, r5)
            int r3 = r3.hashCode()
            goto L_0x002f
        L_0x009c:
            boolean r3 = r8.zzJ(r9, r4, r1)
            if (r3 == 0) goto L_0x023f
            int r2 = r2 * 53
            java.lang.Object r3 = com.google.android.gms.internal.auth.zzhi.zzf(r9, r5)
            int r3 = r3.hashCode()
            goto L_0x002f
        L_0x00ad:
            boolean r3 = r8.zzJ(r9, r4, r1)
            if (r3 == 0) goto L_0x023f
            int r2 = r2 * 53
            java.lang.Object r3 = com.google.android.gms.internal.auth.zzhi.zzf(r9, r5)
            java.lang.String r3 = (java.lang.String) r3
            int r3 = r3.hashCode()
            goto L_0x002f
        L_0x00c1:
            boolean r3 = r8.zzJ(r9, r4, r1)
            if (r3 == 0) goto L_0x023f
            int r2 = r2 * 53
            java.lang.Object r3 = com.google.android.gms.internal.auth.zzhi.zzf(r9, r5)
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            int r3 = com.google.android.gms.internal.auth.zzez.zza(r3)
            goto L_0x002f
        L_0x00d9:
            boolean r3 = r8.zzJ(r9, r4, r1)
            if (r3 == 0) goto L_0x023f
            int r2 = r2 * 53
            int r3 = zzl(r9, r5)
            goto L_0x0050
        L_0x00e7:
            boolean r3 = r8.zzJ(r9, r4, r1)
            if (r3 == 0) goto L_0x023f
            int r2 = r2 * 53
            long r3 = zzw(r9, r5)
            int r3 = com.google.android.gms.internal.auth.zzez.zzc(r3)
            goto L_0x002f
        L_0x00f9:
            boolean r3 = r8.zzJ(r9, r4, r1)
            if (r3 == 0) goto L_0x023f
            int r2 = r2 * 53
            int r3 = zzl(r9, r5)
            goto L_0x0050
        L_0x0107:
            boolean r3 = r8.zzJ(r9, r4, r1)
            if (r3 == 0) goto L_0x023f
            int r2 = r2 * 53
            long r3 = zzw(r9, r5)
            int r3 = com.google.android.gms.internal.auth.zzez.zzc(r3)
            goto L_0x002f
        L_0x0119:
            boolean r3 = r8.zzJ(r9, r4, r1)
            if (r3 == 0) goto L_0x023f
            int r2 = r2 * 53
            long r3 = zzw(r9, r5)
            int r3 = com.google.android.gms.internal.auth.zzez.zzc(r3)
            goto L_0x002f
        L_0x012b:
            boolean r3 = r8.zzJ(r9, r4, r1)
            if (r3 == 0) goto L_0x023f
            int r2 = r2 * 53
            java.lang.Object r3 = com.google.android.gms.internal.auth.zzhi.zzf(r9, r5)
            java.lang.Float r3 = (java.lang.Float) r3
            float r3 = r3.floatValue()
            int r3 = java.lang.Float.floatToIntBits(r3)
            goto L_0x002f
        L_0x0143:
            boolean r3 = r8.zzJ(r9, r4, r1)
            if (r3 == 0) goto L_0x023f
            int r2 = r2 * 53
            java.lang.Object r3 = com.google.android.gms.internal.auth.zzhi.zzf(r9, r5)
            java.lang.Double r3 = (java.lang.Double) r3
            double r3 = r3.doubleValue()
            long r3 = java.lang.Double.doubleToLongBits(r3)
            int r3 = com.google.android.gms.internal.auth.zzez.zzc(r3)
            goto L_0x002f
        L_0x015f:
            int r2 = r2 * 53
            java.lang.Object r3 = com.google.android.gms.internal.auth.zzhi.zzf(r9, r5)
            int r3 = r3.hashCode()
            goto L_0x002f
        L_0x016b:
            int r2 = r2 * 53
            java.lang.Object r3 = com.google.android.gms.internal.auth.zzhi.zzf(r9, r5)
            int r3 = r3.hashCode()
            goto L_0x002f
        L_0x0177:
            java.lang.Object r3 = com.google.android.gms.internal.auth.zzhi.zzf(r9, r5)
            if (r3 == 0) goto L_0x0181
            int r7 = r3.hashCode()
        L_0x0181:
            int r2 = r2 * 53
            int r2 = r2 + r7
            goto L_0x023f
        L_0x0186:
            int r2 = r2 * 53
            long r3 = com.google.android.gms.internal.auth.zzhi.zzd(r9, r5)
            int r3 = com.google.android.gms.internal.auth.zzez.zzc(r3)
            goto L_0x002f
        L_0x0192:
            int r2 = r2 * 53
            int r3 = com.google.android.gms.internal.auth.zzhi.zzc(r9, r5)
            goto L_0x0050
        L_0x019a:
            int r2 = r2 * 53
            long r3 = com.google.android.gms.internal.auth.zzhi.zzd(r9, r5)
            int r3 = com.google.android.gms.internal.auth.zzez.zzc(r3)
            goto L_0x002f
        L_0x01a6:
            int r2 = r2 * 53
            int r3 = com.google.android.gms.internal.auth.zzhi.zzc(r9, r5)
            goto L_0x0050
        L_0x01ae:
            int r2 = r2 * 53
            int r3 = com.google.android.gms.internal.auth.zzhi.zzc(r9, r5)
            goto L_0x0050
        L_0x01b6:
            int r2 = r2 * 53
            int r3 = com.google.android.gms.internal.auth.zzhi.zzc(r9, r5)
            goto L_0x0050
        L_0x01be:
            int r2 = r2 * 53
            java.lang.Object r3 = com.google.android.gms.internal.auth.zzhi.zzf(r9, r5)
            int r3 = r3.hashCode()
            goto L_0x002f
        L_0x01ca:
            java.lang.Object r3 = com.google.android.gms.internal.auth.zzhi.zzf(r9, r5)
            if (r3 == 0) goto L_0x0181
            int r7 = r3.hashCode()
            goto L_0x0181
        L_0x01d5:
            int r2 = r2 * 53
            java.lang.Object r3 = com.google.android.gms.internal.auth.zzhi.zzf(r9, r5)
            java.lang.String r3 = (java.lang.String) r3
            int r3 = r3.hashCode()
            goto L_0x002f
        L_0x01e3:
            int r2 = r2 * 53
            boolean r3 = com.google.android.gms.internal.auth.zzhi.zzt(r9, r5)
            int r3 = com.google.android.gms.internal.auth.zzez.zza(r3)
            goto L_0x002f
        L_0x01ef:
            int r2 = r2 * 53
            int r3 = com.google.android.gms.internal.auth.zzhi.zzc(r9, r5)
            goto L_0x0050
        L_0x01f7:
            int r2 = r2 * 53
            long r3 = com.google.android.gms.internal.auth.zzhi.zzd(r9, r5)
            int r3 = com.google.android.gms.internal.auth.zzez.zzc(r3)
            goto L_0x002f
        L_0x0203:
            int r2 = r2 * 53
            int r3 = com.google.android.gms.internal.auth.zzhi.zzc(r9, r5)
            goto L_0x0050
        L_0x020b:
            int r2 = r2 * 53
            long r3 = com.google.android.gms.internal.auth.zzhi.zzd(r9, r5)
            int r3 = com.google.android.gms.internal.auth.zzez.zzc(r3)
            goto L_0x002f
        L_0x0217:
            int r2 = r2 * 53
            long r3 = com.google.android.gms.internal.auth.zzhi.zzd(r9, r5)
            int r3 = com.google.android.gms.internal.auth.zzez.zzc(r3)
            goto L_0x002f
        L_0x0223:
            int r2 = r2 * 53
            float r3 = com.google.android.gms.internal.auth.zzhi.zzb(r9, r5)
            int r3 = java.lang.Float.floatToIntBits(r3)
            goto L_0x002f
        L_0x022f:
            int r2 = r2 * 53
            double r3 = com.google.android.gms.internal.auth.zzhi.zza(r9, r5)
            long r3 = java.lang.Double.doubleToLongBits(r3)
            int r3 = com.google.android.gms.internal.auth.zzez.zzc(r3)
            goto L_0x002f
        L_0x023f:
            int r1 = r1 + 3
            goto L_0x0005
        L_0x0243:
            int r2 = r2 * 53
            com.google.android.gms.internal.auth.zzgy r0 = r8.zzm
            java.lang.Object r9 = r0.zza(r9)
            int r9 = r9.hashCode()
            int r9 = r9 + r2
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.auth.zzfz.zza(java.lang.Object):int");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v0, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v1, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v0, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v1, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v3, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v2, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v5, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v9, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v3, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v11, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v3, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v7, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v8, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v4, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v9, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r20v0, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v5, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v11, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v7, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v6, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v14, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v15, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v7, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r20v1, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v10, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v13, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v8, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v22, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r20v2, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v11, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v13, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r20v3, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v15, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v29, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r20v4, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v16, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r20v5, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v17, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r20v6, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v19, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v20, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v21, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r20v8, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v23, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v22, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v35, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v25, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v26, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v25, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v44, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v28, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v29, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v28, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v30, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r20v9, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v31, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v30, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v32, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v31, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v33, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v34, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v33, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v53, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v20, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r20v10, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v35, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v35, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r20v12, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v15, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v39, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v58, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v16, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v27, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v23, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v24, resolved type: byte} */
    /* JADX WARNING: Code restructure failed: missing block: B:100:0x031e, code lost:
        r7 = r36;
        r22 = r6;
        r28 = r10;
        r2 = r11;
        r18 = r13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:118:0x03b8, code lost:
        if (r0 != r15) goto L_0x03ba;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:121:0x03d4, code lost:
        r7 = r36;
        r2 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:127:0x03fa, code lost:
        if (r0 != r15) goto L_0x03ba;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:130:0x041d, code lost:
        if (r0 != r15) goto L_0x03ba;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00eb, code lost:
        r13 = r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0119, code lost:
        r1 = r13;
        r2 = r17;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0146, code lost:
        r5 = r6 | r22;
        r11 = r36;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x014a, code lost:
        r3 = r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x014c, code lost:
        r20 = r13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x0218, code lost:
        r2 = r6 | r22;
        r11 = r36;
        r3 = r0;
        r0 = r1;
        r1 = r13;
        r6 = r23;
        r13 = r5;
        r5 = r2;
        r2 = r17;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x0227, code lost:
        r20 = r13;
        r13 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x029a, code lost:
        r0 = r11 + 8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x029c, code lost:
        r5 = r6 | r22;
        r11 = r36;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x02a0, code lost:
        r3 = r13;
        r2 = r17;
        r1 = r20;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int zzb(java.lang.Object r32, byte[] r33, int r34, int r35, int r36, com.google.android.gms.internal.auth.zzds r37) {
        /*
            r31 = this;
            r15 = r31
            r14 = r32
            r12 = r33
            r13 = r35
            r11 = r36
            r9 = r37
            sun.misc.Unsafe r10 = zzb
            r16 = 0
            r0 = r34
            r1 = r16
            r3 = r1
            r5 = r3
            r2 = -1
            r6 = 1048575(0xfffff, float:1.469367E-39)
        L_0x001a:
            if (r0 >= r13) goto L_0x044e
            int r1 = r0 + 1
            byte r0 = r12[r0]
            if (r0 >= 0) goto L_0x002b
            int r0 = com.google.android.gms.internal.auth.zzdt.zzk(r0, r12, r1, r9)
            int r1 = r9.zza
            r4 = r1
            r1 = r0
            goto L_0x002c
        L_0x002b:
            r4 = r0
        L_0x002c:
            int r0 = r4 >>> 3
            r8 = r4 & 7
            r7 = 3
            if (r0 <= r2) goto L_0x003b
            int r3 = r3 / r7
            int r2 = r15.zzr(r0, r3)
        L_0x0038:
            r3 = r2
            r2 = -1
            goto L_0x0040
        L_0x003b:
            int r2 = r15.zzq(r0)
            goto L_0x0038
        L_0x0040:
            if (r3 != r2) goto L_0x0051
            r17 = r0
            r19 = r2
            r8 = r4
            r22 = r5
            r28 = r10
            r7 = r11
            r18 = r16
            r2 = r1
            goto L_0x0420
        L_0x0051:
            int[] r2 = r15.zzc
            int r19 = r3 + 1
            r7 = r2[r19]
            int r11 = zzu(r7)
            r19 = r1
            r17 = 1048575(0xfffff, float:1.469367E-39)
            r1 = r7 & r17
            long r12 = (long) r1
            r1 = 17
            r20 = r4
            if (r11 > r1) goto L_0x032d
            int r1 = r3 + 2
            r1 = r2[r1]
            int r2 = r1 >>> 20
            r4 = 1
            int r22 = r4 << r2
            r2 = 1048575(0xfffff, float:1.469367E-39)
            r1 = r1 & r2
            if (r1 == r6) goto L_0x0089
            r17 = r3
            if (r6 == r2) goto L_0x0080
            long r2 = (long) r6
            r10.putInt(r14, r2, r5)
        L_0x0080:
            long r2 = (long) r1
            int r2 = r10.getInt(r14, r2)
            r23 = r1
            r6 = r2
            goto L_0x008e
        L_0x0089:
            r17 = r3
            r23 = r6
            r6 = r5
        L_0x008e:
            r1 = 5
            switch(r11) {
                case 0: goto L_0x0301;
                case 1: goto L_0x02e3;
                case 2: goto L_0x02c1;
                case 3: goto L_0x02c1;
                case 4: goto L_0x02a7;
                case 5: goto L_0x0275;
                case 6: goto L_0x0255;
                case 7: goto L_0x022c;
                case 8: goto L_0x01ee;
                case 9: goto L_0x01a5;
                case 10: goto L_0x0188;
                case 11: goto L_0x02a7;
                case 12: goto L_0x014f;
                case 13: goto L_0x0255;
                case 14: goto L_0x0275;
                case 15: goto L_0x0127;
                case 16: goto L_0x00ee;
                default: goto L_0x0092;
            }
        L_0x0092:
            r2 = 3
            if (r8 != r2) goto L_0x00de
            r3 = r17
            com.google.android.gms.internal.auth.zzgh r1 = r15.zzy(r3)
            int r2 = r0 << 3
            r4 = r2 | 4
            r17 = r0
            r0 = r1
            r11 = r19
            r1 = r33
            r18 = 1048575(0xfffff, float:1.469367E-39)
            r19 = -1
            r2 = r11
            r7 = r3
            r3 = r35
            r8 = r20
            r5 = r37
            int r0 = com.google.android.gms.internal.auth.zzdt.zzc(r0, r1, r2, r3, r4, r5)
            r1 = r6 & r22
            if (r1 != 0) goto L_0x00c1
            java.lang.Object r1 = r9.zzc
            r10.putObject(r14, r12, r1)
            goto L_0x00ce
        L_0x00c1:
            java.lang.Object r1 = r10.getObject(r14, r12)
            java.lang.Object r2 = r9.zzc
            java.lang.Object r1 = com.google.android.gms.internal.auth.zzez.zzg(r1, r2)
            r10.putObject(r14, r12, r1)
        L_0x00ce:
            r5 = r6 | r22
            r12 = r33
            r13 = r35
            r11 = r36
            r3 = r7
            r1 = r8
            r2 = r17
            r6 = r23
            goto L_0x001a
        L_0x00de:
            r7 = r17
            r11 = r19
            r18 = 1048575(0xfffff, float:1.469367E-39)
            r19 = -1
            r17 = r0
            r12 = r33
        L_0x00eb:
            r13 = r7
            goto L_0x031e
        L_0x00ee:
            r7 = r17
            r11 = r19
            r4 = r20
            r18 = 1048575(0xfffff, float:1.469367E-39)
            r19 = -1
            r17 = r0
            if (r8 != 0) goto L_0x0122
            r2 = r12
            r12 = r33
            int r8 = com.google.android.gms.internal.auth.zzdt.zzm(r12, r11, r9)
            long r0 = r9.zzb
            long r20 = com.google.android.gms.internal.auth.zzei.zzc(r0)
            r0 = r10
            r1 = r32
            r13 = r4
            r4 = r20
            r0.putLong(r1, r2, r4)
            r5 = r6 | r22
            r11 = r36
            r3 = r7
            r0 = r8
        L_0x0119:
            r1 = r13
            r2 = r17
        L_0x011c:
            r6 = r23
            r13 = r35
            goto L_0x001a
        L_0x0122:
            r12 = r33
            r20 = r4
            goto L_0x00eb
        L_0x0127:
            r2 = r12
            r7 = r17
            r11 = r19
            r13 = r20
            r18 = 1048575(0xfffff, float:1.469367E-39)
            r19 = -1
            r12 = r33
            r17 = r0
            if (r8 != 0) goto L_0x014c
            int r0 = com.google.android.gms.internal.auth.zzdt.zzj(r12, r11, r9)
            int r1 = r9.zza
            int r1 = com.google.android.gms.internal.auth.zzei.zzb(r1)
            r10.putInt(r14, r2, r1)
        L_0x0146:
            r5 = r6 | r22
            r11 = r36
        L_0x014a:
            r3 = r7
            goto L_0x0119
        L_0x014c:
            r20 = r13
            goto L_0x00eb
        L_0x014f:
            r2 = r12
            r7 = r17
            r11 = r19
            r13 = r20
            r18 = 1048575(0xfffff, float:1.469367E-39)
            r19 = -1
            r12 = r33
            r17 = r0
            if (r8 != 0) goto L_0x014c
            int r0 = com.google.android.gms.internal.auth.zzdt.zzj(r12, r11, r9)
            int r1 = r9.zza
            com.google.android.gms.internal.auth.zzex r4 = r15.zzx(r7)
            if (r4 == 0) goto L_0x0184
            boolean r4 = r4.zza()
            if (r4 == 0) goto L_0x0174
            goto L_0x0184
        L_0x0174:
            com.google.android.gms.internal.auth.zzgz r2 = zzc(r32)
            long r3 = (long) r1
            java.lang.Long r1 = java.lang.Long.valueOf(r3)
            r2.zzf(r13, r1)
            r11 = r36
            r5 = r6
            goto L_0x014a
        L_0x0184:
            r10.putInt(r14, r2, r1)
            goto L_0x0146
        L_0x0188:
            r2 = r12
            r7 = r17
            r11 = r19
            r13 = r20
            r18 = 1048575(0xfffff, float:1.469367E-39)
            r19 = -1
            r12 = r33
            r17 = r0
            r0 = 2
            if (r8 != r0) goto L_0x014c
            int r0 = com.google.android.gms.internal.auth.zzdt.zza(r12, r11, r9)
            java.lang.Object r1 = r9.zzc
            r10.putObject(r14, r2, r1)
            goto L_0x0146
        L_0x01a5:
            r2 = r12
            r7 = r17
            r11 = r19
            r13 = r20
            r18 = 1048575(0xfffff, float:1.469367E-39)
            r19 = -1
            r12 = r33
            r17 = r0
            r0 = 2
            if (r8 != r0) goto L_0x01ea
            com.google.android.gms.internal.auth.zzgh r0 = r15.zzy(r7)
            r5 = r35
            int r0 = com.google.android.gms.internal.auth.zzdt.zzd(r0, r12, r11, r5, r9)
            r1 = r6 & r22
            if (r1 != 0) goto L_0x01cc
            java.lang.Object r1 = r9.zzc
            r10.putObject(r14, r2, r1)
            goto L_0x01d9
        L_0x01cc:
            java.lang.Object r1 = r10.getObject(r14, r2)
            java.lang.Object r4 = r9.zzc
            java.lang.Object r1 = com.google.android.gms.internal.auth.zzez.zzg(r1, r4)
            r10.putObject(r14, r2, r1)
        L_0x01d9:
            r1 = r6 | r22
            r11 = r36
            r3 = r7
            r2 = r17
            r6 = r23
            r29 = r5
            r5 = r1
            r1 = r13
            r13 = r29
            goto L_0x001a
        L_0x01ea:
            r5 = r35
            goto L_0x014c
        L_0x01ee:
            r5 = r35
            r2 = r12
            r11 = r19
            r13 = r20
            r1 = 2
            r18 = 1048575(0xfffff, float:1.469367E-39)
            r19 = -1
            r12 = r33
            r29 = r17
            r17 = r0
            r0 = r29
            if (r8 != r1) goto L_0x0227
            r1 = 536870912(0x20000000, float:1.0842022E-19)
            r1 = r1 & r7
            if (r1 != 0) goto L_0x020f
            int r1 = com.google.android.gms.internal.auth.zzdt.zzg(r12, r11, r9)
            goto L_0x0213
        L_0x020f:
            int r1 = com.google.android.gms.internal.auth.zzdt.zzh(r12, r11, r9)
        L_0x0213:
            java.lang.Object r4 = r9.zzc
            r10.putObject(r14, r2, r4)
        L_0x0218:
            r2 = r6 | r22
            r11 = r36
            r3 = r0
            r0 = r1
            r1 = r13
            r6 = r23
            r13 = r5
            r5 = r2
            r2 = r17
            goto L_0x001a
        L_0x0227:
            r20 = r13
            r13 = r0
            goto L_0x031e
        L_0x022c:
            r5 = r35
            r2 = r12
            r11 = r19
            r13 = r20
            r18 = 1048575(0xfffff, float:1.469367E-39)
            r19 = -1
            r12 = r33
            r29 = r17
            r17 = r0
            r0 = r29
            if (r8 != 0) goto L_0x0227
            int r1 = com.google.android.gms.internal.auth.zzdt.zzm(r12, r11, r9)
            long r7 = r9.zzb
            r20 = 0
            int r7 = (r7 > r20 ? 1 : (r7 == r20 ? 0 : -1))
            if (r7 == 0) goto L_0x024f
            goto L_0x0251
        L_0x024f:
            r4 = r16
        L_0x0251:
            com.google.android.gms.internal.auth.zzhi.zzk(r14, r2, r4)
            goto L_0x0218
        L_0x0255:
            r5 = r35
            r2 = r12
            r11 = r19
            r13 = r20
            r18 = 1048575(0xfffff, float:1.469367E-39)
            r19 = -1
            r12 = r33
            r29 = r17
            r17 = r0
            r0 = r29
            if (r8 != r1) goto L_0x0227
            int r1 = com.google.android.gms.internal.auth.zzdt.zzb(r12, r11)
            r10.putInt(r14, r2, r1)
            int r1 = r11 + 4
            goto L_0x0218
        L_0x0275:
            r5 = r35
            r2 = r12
            r11 = r19
            r13 = r20
            r18 = 1048575(0xfffff, float:1.469367E-39)
            r19 = -1
            r12 = r33
            r29 = r17
            r17 = r0
            r0 = r29
            if (r8 != r4) goto L_0x0227
            long r7 = com.google.android.gms.internal.auth.zzdt.zzn(r12, r11)
            r4 = r0
            r0 = r10
            r1 = r32
            r20 = r13
            r13 = r4
            r4 = r7
            r0.putLong(r1, r2, r4)
        L_0x029a:
            int r0 = r11 + 8
        L_0x029c:
            r5 = r6 | r22
            r11 = r36
        L_0x02a0:
            r3 = r13
            r2 = r17
            r1 = r20
            goto L_0x011c
        L_0x02a7:
            r2 = r12
            r13 = r17
            r11 = r19
            r18 = 1048575(0xfffff, float:1.469367E-39)
            r19 = -1
            r12 = r33
            r17 = r0
            if (r8 != 0) goto L_0x031e
            int r0 = com.google.android.gms.internal.auth.zzdt.zzj(r12, r11, r9)
            int r1 = r9.zza
            r10.putInt(r14, r2, r1)
            goto L_0x029c
        L_0x02c1:
            r2 = r12
            r13 = r17
            r11 = r19
            r18 = 1048575(0xfffff, float:1.469367E-39)
            r19 = -1
            r12 = r33
            r17 = r0
            if (r8 != 0) goto L_0x031e
            int r7 = com.google.android.gms.internal.auth.zzdt.zzm(r12, r11, r9)
            long r4 = r9.zzb
            r0 = r10
            r1 = r32
            r0.putLong(r1, r2, r4)
            r5 = r6 | r22
            r11 = r36
            r0 = r7
            goto L_0x02a0
        L_0x02e3:
            r2 = r12
            r13 = r17
            r11 = r19
            r18 = 1048575(0xfffff, float:1.469367E-39)
            r19 = -1
            r12 = r33
            r17 = r0
            if (r8 != r1) goto L_0x031e
            int r0 = com.google.android.gms.internal.auth.zzdt.zzb(r12, r11)
            float r0 = java.lang.Float.intBitsToFloat(r0)
            com.google.android.gms.internal.auth.zzhi.zzm(r14, r2, r0)
            int r0 = r11 + 4
            goto L_0x029c
        L_0x0301:
            r2 = r12
            r13 = r17
            r11 = r19
            r18 = 1048575(0xfffff, float:1.469367E-39)
            r19 = -1
            r12 = r33
            r17 = r0
            if (r8 != r4) goto L_0x031e
            long r0 = com.google.android.gms.internal.auth.zzdt.zzn(r12, r11)
            double r0 = java.lang.Double.longBitsToDouble(r0)
            com.google.android.gms.internal.auth.zzhi.zzl(r14, r2, r0)
            goto L_0x029a
        L_0x031e:
            r7 = r36
            r22 = r6
            r28 = r10
            r2 = r11
            r18 = r13
        L_0x0327:
            r8 = r20
            r6 = r23
            goto L_0x0420
        L_0x032d:
            r17 = r0
            r4 = r19
            r18 = 1048575(0xfffff, float:1.469367E-39)
            r19 = -1
            r29 = r12
            r12 = r33
            r13 = r3
            r2 = r29
            r0 = 27
            if (r11 != r0) goto L_0x038c
            r0 = 2
            if (r8 != r0) goto L_0x0381
            java.lang.Object r0 = r10.getObject(r14, r2)
            com.google.android.gms.internal.auth.zzey r0 = (com.google.android.gms.internal.auth.zzey) r0
            boolean r1 = r0.zzc()
            if (r1 != 0) goto L_0x0361
            int r1 = r0.size()
            if (r1 != 0) goto L_0x0359
            r1 = 10
            goto L_0x035a
        L_0x0359:
            int r1 = r1 + r1
        L_0x035a:
            com.google.android.gms.internal.auth.zzey r0 = r0.zzd(r1)
            r10.putObject(r14, r2, r0)
        L_0x0361:
            r7 = r0
            com.google.android.gms.internal.auth.zzgh r0 = r15.zzy(r13)
            r1 = r20
            r2 = r33
            r3 = r4
            r4 = r35
            r22 = r5
            r5 = r7
            r23 = r6
            r6 = r37
            int r0 = com.google.android.gms.internal.auth.zzdt.zze(r0, r1, r2, r3, r4, r5, r6)
            r11 = r36
            r3 = r13
            r2 = r17
            r5 = r22
            goto L_0x011c
        L_0x0381:
            r22 = r5
            r23 = r6
            r15 = r4
            r28 = r10
            r18 = r13
            goto L_0x03fd
        L_0x038c:
            r22 = r5
            r23 = r6
            r0 = 49
            if (r11 > r0) goto L_0x03d9
            long r6 = (long) r7
            r0 = r31
            r1 = r32
            r24 = r2
            r2 = r33
            r3 = r4
            r5 = r4
            r4 = r35
            r15 = r5
            r5 = r20
            r26 = r6
            r6 = r17
            r7 = r8
            r8 = r13
            r28 = r10
            r9 = r26
            r18 = r13
            r12 = r24
            r14 = r37
            int r0 = r0.zzp(r1, r2, r3, r4, r5, r6, r7, r8, r9, r11, r12, r14)
            if (r0 == r15) goto L_0x03d4
        L_0x03ba:
            r15 = r31
            r14 = r32
            r12 = r33
            r13 = r35
            r11 = r36
            r9 = r37
            r2 = r17
            r3 = r18
            r1 = r20
            r5 = r22
            r6 = r23
        L_0x03d0:
            r10 = r28
            goto L_0x001a
        L_0x03d4:
            r7 = r36
            r2 = r0
            goto L_0x0327
        L_0x03d9:
            r24 = r2
            r15 = r4
            r28 = r10
            r18 = r13
            r0 = 50
            if (r11 != r0) goto L_0x0402
            r0 = 2
            if (r8 != r0) goto L_0x03fd
            r0 = r31
            r1 = r32
            r2 = r33
            r3 = r15
            r4 = r35
            r5 = r18
            r6 = r24
            r8 = r37
            int r0 = r0.zzm(r1, r2, r3, r4, r5, r6, r8)
            if (r0 == r15) goto L_0x03d4
            goto L_0x03ba
        L_0x03fd:
            r7 = r36
            r2 = r15
            goto L_0x0327
        L_0x0402:
            r0 = r31
            r1 = r32
            r2 = r33
            r3 = r15
            r4 = r35
            r5 = r20
            r6 = r17
            r9 = r7
            r7 = r8
            r8 = r9
            r9 = r11
            r10 = r24
            r12 = r18
            r13 = r37
            int r0 = r0.zzn(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r12, r13)
            if (r0 == r15) goto L_0x03d4
            goto L_0x03ba
        L_0x0420:
            if (r8 != r7) goto L_0x042c
            if (r7 == 0) goto L_0x042c
            r0 = r2
            r1 = r8
            r5 = r22
        L_0x0428:
            r2 = 1048575(0xfffff, float:1.469367E-39)
            goto L_0x0456
        L_0x042c:
            com.google.android.gms.internal.auth.zzgz r4 = zzc(r32)
            r0 = r8
            r1 = r33
            r3 = r35
            r5 = r37
            int r0 = com.google.android.gms.internal.auth.zzdt.zzi(r0, r1, r2, r3, r4, r5)
            r15 = r31
            r14 = r32
            r12 = r33
            r13 = r35
            r9 = r37
            r11 = r7
            r1 = r8
            r2 = r17
            r3 = r18
            r5 = r22
            goto L_0x03d0
        L_0x044e:
            r22 = r5
            r23 = r6
            r28 = r10
            r7 = r11
            goto L_0x0428
        L_0x0456:
            if (r6 == r2) goto L_0x0463
            long r3 = (long) r6
            r6 = r32
            r8 = r28
            r8.putInt(r6, r3, r5)
        L_0x0460:
            r3 = r31
            goto L_0x0466
        L_0x0463:
            r6 = r32
            goto L_0x0460
        L_0x0466:
            int r4 = r3.zzj
        L_0x0468:
            int r5 = r3.zzk
            if (r4 >= r5) goto L_0x0494
            int[] r5 = r3.zzi
            r5 = r5[r4]
            int[] r8 = r3.zzc
            r8 = r8[r5]
            int r8 = r3.zzv(r5)
            r8 = r8 & r2
            long r8 = (long) r8
            java.lang.Object r8 = com.google.android.gms.internal.auth.zzhi.zzf(r6, r8)
            if (r8 != 0) goto L_0x0481
            goto L_0x0487
        L_0x0481:
            com.google.android.gms.internal.auth.zzex r9 = r3.zzx(r5)
            if (r9 != 0) goto L_0x048a
        L_0x0487:
            int r4 = r4 + 1
            goto L_0x0468
        L_0x048a:
            com.google.android.gms.internal.auth.zzfq r8 = (com.google.android.gms.internal.auth.zzfq) r8
            java.lang.Object r0 = r3.zzz(r5)
            com.google.android.gms.internal.auth.zzfp r0 = (com.google.android.gms.internal.auth.zzfp) r0
            r0 = 0
            throw r0
        L_0x0494:
            if (r7 != 0) goto L_0x04a0
            r2 = r35
            if (r0 != r2) goto L_0x049b
            goto L_0x04a6
        L_0x049b:
            com.google.android.gms.internal.auth.zzfa r0 = com.google.android.gms.internal.auth.zzfa.zzd()
            throw r0
        L_0x04a0:
            r2 = r35
            if (r0 > r2) goto L_0x04a7
            if (r1 != r7) goto L_0x04a7
        L_0x04a6:
            return r0
        L_0x04a7:
            com.google.android.gms.internal.auth.zzfa r0 = com.google.android.gms.internal.auth.zzfa.zzd()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.auth.zzfz.zzb(java.lang.Object, byte[], int, int, int, com.google.android.gms.internal.auth.zzds):int");
    }

    public final Object zzd() {
        return ((zzeu) this.zzg).zzi(4, (Object) null, (Object) null);
    }

    public final void zze(Object obj) {
        int i2;
        int i5 = this.zzj;
        while (true) {
            i2 = this.zzk;
            if (i5 >= i2) {
                break;
            }
            long zzv = (long) (zzv(this.zzi[i5]) & 1048575);
            Object zzf2 = zzhi.zzf(obj, zzv);
            if (zzf2 != null) {
                ((zzfq) zzf2).zzc();
                zzhi.zzp(obj, zzv, zzf2);
            }
            i5++;
        }
        int length = this.zzi.length;
        while (i2 < length) {
            this.zzl.zza(obj, (long) this.zzi[i2]);
            i2++;
        }
        this.zzm.zze(obj);
    }

    public final void zzf(Object obj, Object obj2) {
        obj2.getClass();
        for (int i2 = 0; i2 < this.zzc.length; i2 += 3) {
            int zzv = zzv(i2);
            long j6 = (long) (1048575 & zzv);
            int i5 = this.zzc[i2];
            switch (zzu(zzv)) {
                case 0:
                    if (!zzG(obj2, i2)) {
                        break;
                    } else {
                        zzhi.zzl(obj, j6, zzhi.zza(obj2, j6));
                        zzD(obj, i2);
                        break;
                    }
                case 1:
                    if (!zzG(obj2, i2)) {
                        break;
                    } else {
                        zzhi.zzm(obj, j6, zzhi.zzb(obj2, j6));
                        zzD(obj, i2);
                        break;
                    }
                case 2:
                    if (!zzG(obj2, i2)) {
                        break;
                    } else {
                        zzhi.zzo(obj, j6, zzhi.zzd(obj2, j6));
                        zzD(obj, i2);
                        break;
                    }
                case 3:
                    if (!zzG(obj2, i2)) {
                        break;
                    } else {
                        zzhi.zzo(obj, j6, zzhi.zzd(obj2, j6));
                        zzD(obj, i2);
                        break;
                    }
                case 4:
                    if (!zzG(obj2, i2)) {
                        break;
                    } else {
                        zzhi.zzn(obj, j6, zzhi.zzc(obj2, j6));
                        zzD(obj, i2);
                        break;
                    }
                case 5:
                    if (!zzG(obj2, i2)) {
                        break;
                    } else {
                        zzhi.zzo(obj, j6, zzhi.zzd(obj2, j6));
                        zzD(obj, i2);
                        break;
                    }
                case zzaky.zzf.zzf /*6*/:
                    if (!zzG(obj2, i2)) {
                        break;
                    } else {
                        zzhi.zzn(obj, j6, zzhi.zzc(obj2, j6));
                        zzD(obj, i2);
                        break;
                    }
                case zzaky.zzf.zzg /*7*/:
                    if (!zzG(obj2, i2)) {
                        break;
                    } else {
                        zzhi.zzk(obj, j6, zzhi.zzt(obj2, j6));
                        zzD(obj, i2);
                        break;
                    }
                case 8:
                    if (!zzG(obj2, i2)) {
                        break;
                    } else {
                        zzhi.zzp(obj, j6, zzhi.zzf(obj2, j6));
                        zzD(obj, i2);
                        break;
                    }
                case 9:
                    zzB(obj, obj2, i2);
                    break;
                case 10:
                    if (!zzG(obj2, i2)) {
                        break;
                    } else {
                        zzhi.zzp(obj, j6, zzhi.zzf(obj2, j6));
                        zzD(obj, i2);
                        break;
                    }
                case ModuleDescriptor.MODULE_VERSION:
                    if (!zzG(obj2, i2)) {
                        break;
                    } else {
                        zzhi.zzn(obj, j6, zzhi.zzc(obj2, j6));
                        zzD(obj, i2);
                        break;
                    }
                case 12:
                    if (!zzG(obj2, i2)) {
                        break;
                    } else {
                        zzhi.zzn(obj, j6, zzhi.zzc(obj2, j6));
                        zzD(obj, i2);
                        break;
                    }
                case 13:
                    if (!zzG(obj2, i2)) {
                        break;
                    } else {
                        zzhi.zzn(obj, j6, zzhi.zzc(obj2, j6));
                        zzD(obj, i2);
                        break;
                    }
                case 14:
                    if (!zzG(obj2, i2)) {
                        break;
                    } else {
                        zzhi.zzo(obj, j6, zzhi.zzd(obj2, j6));
                        zzD(obj, i2);
                        break;
                    }
                case 15:
                    if (!zzG(obj2, i2)) {
                        break;
                    } else {
                        zzhi.zzn(obj, j6, zzhi.zzc(obj2, j6));
                        zzD(obj, i2);
                        break;
                    }
                case 16:
                    if (!zzG(obj2, i2)) {
                        break;
                    } else {
                        zzhi.zzo(obj, j6, zzhi.zzd(obj2, j6));
                        zzD(obj, i2);
                        break;
                    }
                case 17:
                    zzB(obj, obj2, i2);
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                    this.zzl.zzb(obj, obj2, j6);
                    break;
                case 50:
                    zzgj.zzi(this.zzp, obj, obj2, j6);
                    break;
                case 51:
                case 52:
                case 53:
                case 54:
                case 55:
                case 56:
                case 57:
                case 58:
                case 59:
                    if (!zzJ(obj2, i5, i2)) {
                        break;
                    } else {
                        zzhi.zzp(obj, j6, zzhi.zzf(obj2, j6));
                        zzE(obj, i5, i2);
                        break;
                    }
                case 60:
                    zzC(obj, obj2, i2);
                    break;
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                    if (!zzJ(obj2, i5, i2)) {
                        break;
                    } else {
                        zzhi.zzp(obj, j6, zzhi.zzf(obj2, j6));
                        zzE(obj, i5, i2);
                        break;
                    }
                case 68:
                    zzC(obj, obj2, i2);
                    break;
            }
        }
        zzgj.zzf(this.zzm, obj, obj2);
    }

    public final void zzg(Object obj, byte[] bArr, int i2, int i5, zzds zzds) {
        if (this.zzh) {
            zzo(obj, bArr, i2, i5, zzds);
        } else {
            zzb(obj, bArr, i2, i5, 0, zzds);
        }
    }

    public final boolean zzh(Object obj, Object obj2) {
        boolean z3;
        int length = this.zzc.length;
        for (int i2 = 0; i2 < length; i2 += 3) {
            int zzv = zzv(i2);
            long j6 = (long) (zzv & 1048575);
            switch (zzu(zzv)) {
                case 0:
                    if (zzF(obj, obj2, i2) && Double.doubleToLongBits(zzhi.zza(obj, j6)) == Double.doubleToLongBits(zzhi.zza(obj2, j6))) {
                        continue;
                    }
                case 1:
                    if (zzF(obj, obj2, i2) && Float.floatToIntBits(zzhi.zzb(obj, j6)) == Float.floatToIntBits(zzhi.zzb(obj2, j6))) {
                        continue;
                    }
                case 2:
                    if (zzF(obj, obj2, i2) && zzhi.zzd(obj, j6) == zzhi.zzd(obj2, j6)) {
                        continue;
                    }
                case 3:
                    if (zzF(obj, obj2, i2) && zzhi.zzd(obj, j6) == zzhi.zzd(obj2, j6)) {
                        continue;
                    }
                case 4:
                    if (zzF(obj, obj2, i2) && zzhi.zzc(obj, j6) == zzhi.zzc(obj2, j6)) {
                        continue;
                    }
                case 5:
                    if (zzF(obj, obj2, i2) && zzhi.zzd(obj, j6) == zzhi.zzd(obj2, j6)) {
                        continue;
                    }
                case zzaky.zzf.zzf /*6*/:
                    if (zzF(obj, obj2, i2) && zzhi.zzc(obj, j6) == zzhi.zzc(obj2, j6)) {
                        continue;
                    }
                case zzaky.zzf.zzg /*7*/:
                    if (zzF(obj, obj2, i2) && zzhi.zzt(obj, j6) == zzhi.zzt(obj2, j6)) {
                        continue;
                    }
                case 8:
                    if (zzF(obj, obj2, i2) && zzgj.zzh(zzhi.zzf(obj, j6), zzhi.zzf(obj2, j6))) {
                        continue;
                    }
                case 9:
                    if (zzF(obj, obj2, i2) && zzgj.zzh(zzhi.zzf(obj, j6), zzhi.zzf(obj2, j6))) {
                        continue;
                    }
                case 10:
                    if (zzF(obj, obj2, i2) && zzgj.zzh(zzhi.zzf(obj, j6), zzhi.zzf(obj2, j6))) {
                        continue;
                    }
                case ModuleDescriptor.MODULE_VERSION:
                    if (zzF(obj, obj2, i2) && zzhi.zzc(obj, j6) == zzhi.zzc(obj2, j6)) {
                        continue;
                    }
                case 12:
                    if (zzF(obj, obj2, i2) && zzhi.zzc(obj, j6) == zzhi.zzc(obj2, j6)) {
                        continue;
                    }
                case 13:
                    if (zzF(obj, obj2, i2) && zzhi.zzc(obj, j6) == zzhi.zzc(obj2, j6)) {
                        continue;
                    }
                case 14:
                    if (zzF(obj, obj2, i2) && zzhi.zzd(obj, j6) == zzhi.zzd(obj2, j6)) {
                        continue;
                    }
                case 15:
                    if (zzF(obj, obj2, i2) && zzhi.zzc(obj, j6) == zzhi.zzc(obj2, j6)) {
                        continue;
                    }
                case 16:
                    if (zzF(obj, obj2, i2) && zzhi.zzd(obj, j6) == zzhi.zzd(obj2, j6)) {
                        continue;
                    }
                case 17:
                    if (zzF(obj, obj2, i2) && zzgj.zzh(zzhi.zzf(obj, j6), zzhi.zzf(obj2, j6))) {
                        continue;
                    }
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                    z3 = zzgj.zzh(zzhi.zzf(obj, j6), zzhi.zzf(obj2, j6));
                    break;
                case 50:
                    z3 = zzgj.zzh(zzhi.zzf(obj, j6), zzhi.zzf(obj2, j6));
                    break;
                case 51:
                case 52:
                case 53:
                case 54:
                case 55:
                case 56:
                case 57:
                case 58:
                case 59:
                case 60:
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                case 68:
                    long zzs = (long) (zzs(i2) & 1048575);
                    if (zzhi.zzc(obj, zzs) == zzhi.zzc(obj2, zzs) && zzgj.zzh(zzhi.zzf(obj, j6), zzhi.zzf(obj2, j6))) {
                        continue;
                    }
            }
            if (!z3) {
                return false;
            }
        }
        if (!this.zzm.zza(obj).equals(this.zzm.zza(obj2))) {
            return false;
        }
        return true;
    }

    public final boolean zzi(Object obj) {
        int i2;
        int i5;
        Object obj2 = obj;
        int i6 = 1048575;
        int i7 = 0;
        int i8 = 0;
        while (i8 < this.zzj) {
            int i9 = this.zzi[i8];
            int i10 = this.zzc[i9];
            int zzv = zzv(i9);
            int i11 = this.zzc[i9 + 2];
            int i12 = i11 & 1048575;
            int i13 = 1 << (i11 >>> 20);
            if (i12 != i6) {
                if (i12 != 1048575) {
                    i7 = zzb.getInt(obj2, (long) i12);
                }
                i2 = i7;
                i5 = i12;
            } else {
                i5 = i6;
                i2 = i7;
            }
            if ((268435456 & zzv) != 0 && !zzH(obj, i9, i5, i2, i13)) {
                return false;
            }
            int zzu = zzu(zzv);
            if (zzu != 9 && zzu != 17) {
                if (zzu != 27) {
                    if (zzu == 60 || zzu == 68) {
                        if (zzJ(obj2, i10, i9) && !zzI(obj2, zzv, zzy(i9))) {
                            return false;
                        }
                    } else if (zzu != 49) {
                        if (zzu == 50 && !((zzfq) zzhi.zzf(obj2, (long) (zzv & 1048575))).isEmpty()) {
                            zzfp zzfp = (zzfp) zzz(i9);
                            throw null;
                        }
                    }
                }
                List list = (List) zzhi.zzf(obj2, (long) (zzv & 1048575));
                if (!list.isEmpty()) {
                    zzgh zzy = zzy(i9);
                    for (int i14 = 0; i14 < list.size(); i14++) {
                        if (!zzy.zzi(list.get(i14))) {
                            return false;
                        }
                    }
                    continue;
                } else {
                    continue;
                }
            } else if (zzH(obj, i9, i5, i2, i13) && !zzI(obj2, zzv, zzy(i9))) {
                return false;
            }
            i8++;
            i6 = i5;
            i7 = i2;
        }
        return true;
    }
}
