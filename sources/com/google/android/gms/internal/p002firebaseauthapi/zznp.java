package com.google.android.gms.internal.p002firebaseauthapi;

import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zznp  reason: invalid package */
public final class zznp {
    private static final int[] zza = {0, 3, 6, 9, 12, 16, 19, 22, 25, 28};
    private static final int[] zzb = {0, 2, 3, 5, 6, 0, 1, 3, 4, 6};
    private static final int[] zzc = {67108863, 33554431};
    private static final int[] zzd = {26, 25};

    public static void zza(long[] jArr, long[] jArr2) {
        long[] jArr3 = new long[10];
        long[] jArr4 = new long[10];
        long[] jArr5 = new long[10];
        long[] jArr6 = new long[10];
        long[] jArr7 = new long[10];
        long[] jArr8 = new long[10];
        long[] jArr9 = new long[10];
        long[] jArr10 = new long[10];
        long[] jArr11 = new long[10];
        long[] jArr12 = new long[10];
        zzb(jArr3, jArr2);
        zzb(jArr12, jArr3);
        zzb(jArr11, jArr12);
        zza(jArr4, jArr11, jArr2);
        zza(jArr5, jArr4, jArr3);
        zzb(jArr11, jArr5);
        zza(jArr6, jArr11, jArr4);
        zzb(jArr11, jArr6);
        zzb(jArr12, jArr11);
        zzb(jArr11, jArr12);
        zzb(jArr12, jArr11);
        zzb(jArr11, jArr12);
        zza(jArr7, jArr11, jArr6);
        zzb(jArr11, jArr7);
        zzb(jArr12, jArr11);
        for (int i2 = 2; i2 < 10; i2 += 2) {
            zzb(jArr11, jArr12);
            zzb(jArr12, jArr11);
        }
        zza(jArr8, jArr12, jArr7);
        zzb(jArr11, jArr8);
        zzb(jArr12, jArr11);
        for (int i5 = 2; i5 < 20; i5 += 2) {
            zzb(jArr11, jArr12);
            zzb(jArr12, jArr11);
        }
        zza(jArr11, jArr12, jArr8);
        zzb(jArr12, jArr11);
        zzb(jArr11, jArr12);
        for (int i6 = 2; i6 < 10; i6 += 2) {
            zzb(jArr12, jArr11);
            zzb(jArr11, jArr12);
        }
        zza(jArr9, jArr11, jArr7);
        zzb(jArr11, jArr9);
        zzb(jArr12, jArr11);
        for (int i7 = 2; i7 < 50; i7 += 2) {
            zzb(jArr11, jArr12);
            zzb(jArr12, jArr11);
        }
        zza(jArr10, jArr12, jArr9);
        zzb(jArr12, jArr10);
        zzb(jArr11, jArr12);
        for (int i8 = 2; i8 < 100; i8 += 2) {
            zzb(jArr12, jArr11);
            zzb(jArr11, jArr12);
        }
        zza(jArr12, jArr11, jArr10);
        zzb(jArr11, jArr12);
        zzb(jArr12, jArr11);
        for (int i9 = 2; i9 < 50; i9 += 2) {
            zzb(jArr11, jArr12);
            zzb(jArr12, jArr11);
        }
        zza(jArr11, jArr12, jArr9);
        zzb(jArr12, jArr11);
        zzb(jArr11, jArr12);
        zzb(jArr12, jArr11);
        zzb(jArr11, jArr12);
        zzb(jArr12, jArr11);
        zza(jArr, jArr12, jArr5);
    }

    /* JADX WARNING: type inference failed for: r44v0, types: [long[]] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void zzb(long[] r44, long[] r45, long[] r46) {
        /*
            r0 = 0
            r1 = r45[r0]
            r3 = r46[r0]
            long r1 = r1 * r3
            r44[r0] = r1
            r1 = r45[r0]
            r3 = 1
            r4 = r46[r3]
            long r4 = r4 * r1
            r6 = r45[r3]
            r8 = r46[r0]
            long r6 = r6 * r8
            long r6 = r6 + r4
            r44[r3] = r6
            r4 = r45[r3]
            r6 = 2
            long r10 = r4 * r6
            r12 = r46[r3]
            long r10 = r10 * r12
            r0 = 2
            r14 = r46[r0]
            long r14 = r14 * r1
            long r14 = r14 + r10
            r10 = r45[r0]
            long r10 = r10 * r8
            long r10 = r10 + r14
            r44[r0] = r10
            r10 = r46[r0]
            long r14 = r4 * r10
            r16 = r45[r0]
            long r18 = r16 * r12
            long r18 = r18 + r14
            r0 = 3
            r14 = r46[r0]
            long r14 = r14 * r1
            long r14 = r14 + r18
            r18 = r45[r0]
            long r18 = r18 * r8
            long r18 = r18 + r14
            r44[r0] = r18
            long r14 = r16 * r10
            r18 = r46[r0]
            long r20 = r4 * r18
            r22 = r45[r0]
            long r24 = r22 * r12
            long r24 = r24 + r20
            long r24 = r24 * r6
            long r24 = r24 + r14
            r0 = 4
            r14 = r46[r0]
            long r14 = r14 * r1
            long r14 = r14 + r24
            r20 = r45[r0]
            long r20 = r20 * r8
            long r20 = r20 + r14
            r44[r0] = r20
            long r14 = r16 * r18
            long r20 = r22 * r10
            long r20 = r20 + r14
            r14 = r46[r0]
            long r24 = r4 * r14
            long r24 = r24 + r20
            r20 = r45[r0]
            long r26 = r20 * r12
            long r26 = r26 + r24
            r0 = 5
            r24 = r46[r0]
            long r24 = r24 * r1
            long r24 = r24 + r26
            r26 = r45[r0]
            long r26 = r26 * r8
            long r26 = r26 + r24
            r44[r0] = r26
            long r24 = r22 * r18
            r26 = r46[r0]
            long r28 = r4 * r26
            long r28 = r28 + r24
            r24 = r45[r0]
            long r30 = r24 * r12
            long r30 = r30 + r28
            long r30 = r30 * r6
            long r28 = r16 * r14
            long r28 = r28 + r30
            long r30 = r20 * r10
            long r30 = r30 + r28
            r0 = 6
            r28 = r46[r0]
            long r28 = r28 * r1
            long r28 = r28 + r30
            r30 = r45[r0]
            long r30 = r30 * r8
            long r30 = r30 + r28
            r44[r0] = r30
            long r28 = r22 * r14
            long r30 = r20 * r18
            long r30 = r30 + r28
            long r28 = r16 * r26
            long r28 = r28 + r30
            long r30 = r24 * r10
            long r30 = r30 + r28
            r28 = r46[r0]
            long r32 = r4 * r28
            long r32 = r32 + r30
            r30 = r45[r0]
            long r34 = r30 * r12
            long r34 = r34 + r32
            r0 = 7
            r32 = r46[r0]
            long r32 = r32 * r1
            long r32 = r32 + r34
            r34 = r45[r0]
            long r34 = r34 * r8
            long r34 = r34 + r32
            r44[r0] = r34
            long r32 = r20 * r14
            long r34 = r22 * r26
            long r36 = r24 * r18
            long r36 = r36 + r34
            r34 = r46[r0]
            long r38 = r4 * r34
            long r38 = r38 + r36
            r36 = r45[r0]
            long r40 = r36 * r12
            long r40 = r40 + r38
            long r40 = r40 * r6
            long r40 = r40 + r32
            long r32 = r16 * r28
            long r32 = r32 + r40
            long r38 = r30 * r10
            long r38 = r38 + r32
            r0 = 8
            r32 = r46[r0]
            long r32 = r32 * r1
            long r32 = r32 + r38
            r38 = r45[r0]
            long r38 = r38 * r8
            long r38 = r38 + r32
            r44[r0] = r38
            long r32 = r20 * r26
            long r38 = r24 * r14
            long r38 = r38 + r32
            long r32 = r22 * r28
            long r32 = r32 + r38
            long r38 = r30 * r18
            long r38 = r38 + r32
            long r32 = r16 * r34
            long r32 = r32 + r38
            long r38 = r36 * r10
            long r38 = r38 + r32
            r32 = r46[r0]
            long r40 = r4 * r32
            long r40 = r40 + r38
            r38 = r45[r0]
            long r42 = r38 * r12
            long r42 = r42 + r40
            r0 = 9
            r40 = r46[r0]
            long r1 = r1 * r40
            long r1 = r1 + r42
            r40 = r45[r0]
            long r40 = r40 * r8
            long r40 = r40 + r1
            r44[r0] = r40
            long r1 = r24 * r26
            long r8 = r22 * r34
            long r8 = r8 + r1
            long r1 = r36 * r18
            long r1 = r1 + r8
            r8 = r46[r0]
            long r4 = r4 * r8
            long r4 = r4 + r1
            r0 = r45[r0]
            long r12 = r12 * r0
            long r12 = r12 + r4
            long r12 = r12 * r6
            long r2 = r20 * r28
            long r2 = r2 + r12
            long r4 = r30 * r14
            long r4 = r4 + r2
            long r2 = r16 * r32
            long r2 = r2 + r4
            long r4 = r38 * r10
            long r4 = r4 + r2
            r2 = 10
            r44[r2] = r4
            long r2 = r24 * r28
            long r4 = r30 * r26
            long r4 = r4 + r2
            long r2 = r20 * r34
            long r2 = r2 + r4
            long r4 = r36 * r14
            long r4 = r4 + r2
            long r2 = r22 * r32
            long r2 = r2 + r4
            long r4 = r38 * r18
            long r4 = r4 + r2
            long r16 = r16 * r8
            long r16 = r16 + r4
            long r10 = r10 * r0
            long r10 = r10 + r16
            r2 = 11
            r44[r2] = r10
            long r2 = r30 * r28
            long r4 = r24 * r34
            long r10 = r36 * r26
            long r10 = r10 + r4
            long r22 = r22 * r8
            long r22 = r22 + r10
            long r18 = r18 * r0
            long r18 = r18 + r22
            long r18 = r18 * r6
            long r18 = r18 + r2
            long r2 = r20 * r32
            long r2 = r2 + r18
            long r4 = r38 * r14
            long r4 = r4 + r2
            r2 = 12
            r44[r2] = r4
            long r2 = r30 * r34
            long r4 = r36 * r28
            long r4 = r4 + r2
            long r2 = r24 * r32
            long r2 = r2 + r4
            long r4 = r38 * r26
            long r4 = r4 + r2
            long r20 = r20 * r8
            long r20 = r20 + r4
            long r14 = r14 * r0
            long r14 = r14 + r20
            r2 = 13
            r44[r2] = r14
            long r2 = r36 * r34
            long r24 = r24 * r8
            long r24 = r24 + r2
            long r26 = r26 * r0
            long r26 = r26 + r24
            long r26 = r26 * r6
            long r2 = r30 * r32
            long r2 = r2 + r26
            long r4 = r38 * r28
            long r4 = r4 + r2
            r2 = 14
            r44[r2] = r4
            long r2 = r36 * r32
            long r4 = r38 * r34
            long r4 = r4 + r2
            long r30 = r30 * r8
            long r30 = r30 + r4
            long r28 = r28 * r0
            long r28 = r28 + r30
            r2 = 15
            r44[r2] = r28
            long r2 = r38 * r32
            long r36 = r36 * r8
            long r34 = r34 * r0
            long r34 = r34 + r36
            long r34 = r34 * r6
            long r34 = r34 + r2
            r2 = 16
            r44[r2] = r34
            long r38 = r38 * r8
            long r32 = r32 * r0
            long r32 = r32 + r38
            r2 = 17
            r44[r2] = r32
            long r0 = r0 * r6
            long r0 = r0 * r8
            r2 = 18
            r44[r2] = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.p002firebaseauthapi.zznp.zzb(long[], long[], long[]):void");
    }

    public static void zzc(long[] jArr, long[] jArr2) {
        zzc(jArr, jArr2, jArr);
    }

    public static void zzd(long[] jArr, long[] jArr2) {
        zzd(jArr, jArr, jArr2);
    }

    private static void zze(long[] jArr, long[] jArr2) {
        if (jArr.length != 19) {
            long[] jArr3 = new long[19];
            System.arraycopy(jArr, 0, jArr3, 0, jArr.length);
            jArr = jArr3;
        }
        zzb(jArr);
        zza(jArr);
        System.arraycopy(jArr, 0, jArr2, 0, 10);
    }

    public static void zzc(long[] jArr, long[] jArr2, long[] jArr3) {
        for (int i2 = 0; i2 < 10; i2++) {
            jArr[i2] = jArr2[i2] - jArr3[i2];
        }
    }

    public static void zzd(long[] jArr, long[] jArr2, long[] jArr3) {
        for (int i2 = 0; i2 < 10; i2++) {
            jArr[i2] = jArr2[i2] + jArr3[i2];
        }
    }

    public static byte[] zzc(long[] jArr) {
        int i2;
        long[] copyOf = Arrays.copyOf(jArr, 10);
        int i5 = 0;
        while (true) {
            if (i5 >= 2) {
                break;
            }
            int i6 = 0;
            while (i6 < 9) {
                long j6 = copyOf[i6];
                int i7 = zzd[i6 & 1];
                int i8 = -((int) (((j6 >> 31) & j6) >> i7));
                copyOf[i6] = j6 + ((long) (i8 << i7));
                i6++;
                copyOf[i6] = copyOf[i6] - ((long) i8);
            }
            long j7 = copyOf[9];
            int i9 = -((int) (((j7 >> 31) & j7) >> 25));
            copyOf[9] = j7 + ((long) (i9 << 25));
            copyOf[0] = copyOf[0] - (((long) i9) * 19);
            i5++;
        }
        long j8 = copyOf[0];
        int i10 = -((int) (((j8 >> 31) & j8) >> 26));
        copyOf[0] = j8 + ((long) (i10 << 26));
        copyOf[1] = copyOf[1] - ((long) i10);
        int i11 = 0;
        for (i2 = 2; i11 < i2; i2 = 2) {
            int i12 = 0;
            while (i12 < 9) {
                long j9 = copyOf[i12];
                int i13 = i12 & 1;
                copyOf[i12] = j9 & ((long) zzc[i13]);
                i12++;
                copyOf[i12] = copyOf[i12] + ((long) ((int) (j9 >> zzd[i13])));
            }
            i11++;
        }
        long j10 = copyOf[9];
        copyOf[9] = j10 & 33554431;
        long j11 = (((long) ((int) (j10 >> 25))) * 19) + copyOf[0];
        copyOf[0] = j11;
        int i14 = ~((((int) j11) - 67108845) >> 31);
        for (int i15 = 1; i15 < 10; i15++) {
            int i16 = ~(((int) copyOf[i15]) ^ zzc[i15 & 1]);
            int i17 = i16 & (i16 << 16);
            int i18 = i17 & (i17 << 8);
            int i19 = i18 & (i18 << 4);
            int i20 = i19 & (i19 << 2);
            i14 &= (i20 & (i20 << 1)) >> 31;
        }
        copyOf[0] = copyOf[0] - ((long) (67108845 & i14));
        long j12 = (long) (33554431 & i14);
        copyOf[1] = copyOf[1] - j12;
        for (int i21 = 2; i21 < 10; i21 += 2) {
            copyOf[i21] = copyOf[i21] - ((long) (67108863 & i14));
            int i22 = i21 + 1;
            copyOf[i22] = copyOf[i22] - j12;
        }
        for (int i23 = 0; i23 < 10; i23++) {
            copyOf[i23] = copyOf[i23] << zzb[i23];
        }
        byte[] bArr = new byte[32];
        for (int i24 = 0; i24 < 10; i24++) {
            int i25 = zza[i24];
            long j13 = copyOf[i24];
            bArr[i25] = (byte) ((int) (((long) bArr[i25]) | (j13 & 255)));
            int i26 = i25 + 1;
            bArr[i26] = (byte) ((int) (((long) bArr[i26]) | ((j13 >> 8) & 255)));
            int i27 = i25 + 2;
            bArr[i27] = (byte) ((int) (((long) bArr[i27]) | ((j13 >> 16) & 255)));
            int i28 = i25 + 3;
            bArr[i28] = (byte) ((int) (((long) bArr[i28]) | ((j13 >> 24) & 255)));
        }
        return bArr;
    }

    public static void zzb(long[] jArr) {
        long j6 = jArr[8];
        long j7 = jArr[18];
        long j8 = j6 + (j7 << 4);
        jArr[8] = j8;
        long j9 = j8 + (j7 << 1);
        jArr[8] = j9;
        jArr[8] = j9 + j7;
        long j10 = jArr[7];
        long j11 = jArr[17];
        long j12 = j10 + (j11 << 4);
        jArr[7] = j12;
        long j13 = j12 + (j11 << 1);
        jArr[7] = j13;
        jArr[7] = j13 + j11;
        long j14 = jArr[6];
        long j15 = jArr[16];
        long j16 = j14 + (j15 << 4);
        jArr[6] = j16;
        long j17 = j16 + (j15 << 1);
        jArr[6] = j17;
        jArr[6] = j17 + j15;
        long j18 = jArr[5];
        long j19 = jArr[15];
        long j20 = j18 + (j19 << 4);
        jArr[5] = j20;
        long j21 = j20 + (j19 << 1);
        jArr[5] = j21;
        jArr[5] = j21 + j19;
        long j22 = jArr[4];
        long j23 = jArr[14];
        long j24 = j22 + (j23 << 4);
        jArr[4] = j24;
        long j25 = j24 + (j23 << 1);
        jArr[4] = j25;
        jArr[4] = j25 + j23;
        long j26 = jArr[3];
        long j27 = jArr[13];
        long j28 = j26 + (j27 << 4);
        jArr[3] = j28;
        long j29 = j28 + (j27 << 1);
        jArr[3] = j29;
        jArr[3] = j29 + j27;
        long j30 = jArr[2];
        long j31 = jArr[12];
        long j32 = j30 + (j31 << 4);
        jArr[2] = j32;
        long j33 = j32 + (j31 << 1);
        jArr[2] = j33;
        jArr[2] = j33 + j31;
        long j34 = jArr[1];
        long j35 = jArr[11];
        long j36 = j34 + (j35 << 4);
        jArr[1] = j36;
        long j37 = j36 + (j35 << 1);
        jArr[1] = j37;
        jArr[1] = j37 + j35;
        long j38 = jArr[0];
        long j39 = jArr[10];
        long j40 = j38 + (j39 << 4);
        jArr[0] = j40;
        long j41 = j40 + (j39 << 1);
        jArr[0] = j41;
        jArr[0] = j41 + j39;
    }

    public static void zzb(long[] jArr, long[] jArr2) {
        long j6 = jArr2[0];
        long j7 = jArr2[1];
        long j8 = jArr2[2];
        long j9 = jArr2[3];
        long j10 = jArr2[4];
        long j11 = (j6 * 2 * j10) + (j7 * 4 * j9) + (j8 * j8);
        long j12 = jArr2[5];
        long j13 = j6 * j12;
        long j14 = jArr2[6];
        long j15 = jArr2[7];
        long j16 = j6 * j15;
        long j17 = jArr2[8];
        long j18 = (((((j9 * j12) + (j7 * j15)) * 2) + (j6 * j17) + (j8 * j14)) * 2) + (j10 * j10);
        long j19 = jArr2[9];
        long j20 = j6 * j19;
        long j21 = j8 * j19;
        long j22 = (((((j9 * j19) + (j12 * j15)) * 2) + (j10 * j17)) * 2) + (j14 * j14);
        long j23 = j10 * j19;
        long j24 = j12 * 2 * j19;
        zze(new long[]{j6 * j6, j6 * 2 * j7, ((j6 * j8) + (j7 * j7)) * 2, ((j6 * j9) + (j7 * j8)) * 2, j11, (j13 + (j7 * j10) + (j8 * j9)) * 2, ((j7 * 2 * j12) + (j6 * j14) + (j8 * j10) + (j9 * j9)) * 2, (j16 + (j7 * j14) + (j8 * j12) + (j9 * j10)) * 2, j18, (j20 + (j7 * j17) + (j8 * j15) + (j9 * j14) + (j10 * j12)) * 2, ((((j7 * j19) + (j9 * j15)) * 2) + (j8 * j17) + (j10 * j14) + (j12 * j12)) * 2, (j21 + (j9 * j17) + (j10 * j15) + (j12 * j14)) * 2, j22, (j23 + (j12 * j17) + (j14 * j15)) * 2, (j24 + (j14 * j17) + (j15 * j15)) * 2, ((j14 * j19) + (j15 * j17)) * 2, (j15 * 4 * j19) + (j17 * j17), j17 * 2 * j19, 2 * j19 * j19}, jArr);
    }

    public static void zza(long[] jArr, long[] jArr2, long[] jArr3) {
        long[] jArr4 = new long[19];
        zzb(jArr4, jArr2, jArr3);
        zze(jArr4, jArr);
    }

    public static void zza(long[] jArr) {
        jArr[10] = 0;
        int i2 = 0;
        while (i2 < 10) {
            long j6 = jArr[i2];
            long j7 = j6 / 67108864;
            jArr[i2] = j6 - (j7 << 26);
            int i5 = i2 + 1;
            long j8 = jArr[i5] + j7;
            jArr[i5] = j8;
            long j9 = j8 / 33554432;
            jArr[i5] = j8 - (j9 << 25);
            i2 += 2;
            jArr[i2] = jArr[i2] + j9;
        }
        long j10 = jArr[0];
        long j11 = jArr[10];
        long j12 = j10 + (j11 << 4);
        jArr[0] = j12;
        long j13 = j12 + (j11 << 1);
        jArr[0] = j13;
        long j14 = j13 + j11;
        jArr[0] = j14;
        jArr[10] = 0;
        long j15 = j14 / 67108864;
        jArr[0] = j14 - (j15 << 26);
        jArr[1] = jArr[1] + j15;
    }

    public static void zza(long[] jArr, long[] jArr2, long j6) {
        for (int i2 = 0; i2 < 10; i2++) {
            jArr[i2] = jArr2[i2] * j6;
        }
    }

    public static long[] zza(byte[] bArr) {
        long[] jArr = new long[10];
        for (int i2 = 0; i2 < 10; i2++) {
            int i5 = zza[i2];
            jArr[i2] = ((((((long) (bArr[i5] & 255)) | (((long) (bArr[i5 + 1] & 255)) << 8)) | (((long) (bArr[i5 + 2] & 255)) << 16)) | (((long) (bArr[i5 + 3] & 255)) << 24)) >> zzb[i2]) & ((long) zzc[i2 & 1]);
        }
        return jArr;
    }
}
