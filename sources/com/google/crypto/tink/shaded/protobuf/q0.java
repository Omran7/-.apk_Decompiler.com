package com.google.crypto.tink.shaded.protobuf;

import android.support.v4.media.session.a;

public final class q0 extends a {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ int f6848b;

    public /* synthetic */ q0(int i2) {
        this.f6848b = i2;
    }

    public static int Z0(long j6, byte[] bArr, int i2, int i5) {
        if (i5 == 0) {
            a aVar = s0.f6855a;
            if (i2 > -12) {
                return -1;
            }
            return i2;
        } else if (i5 == 1) {
            return s0.c(i2, p0.g(bArr, j6));
        } else {
            if (i5 == 2) {
                return s0.d(i2, p0.g(bArr, j6), p0.g(bArr, j6 + 1));
            }
            throw new AssertionError();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0049  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String p(byte[] r11, int r12, int r13) {
        /*
            r10 = this;
            int r0 = r10.f6848b
            switch(r0) {
                case 0: goto L_0x002a;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.String r0 = new java.lang.String
            java.nio.charset.Charset r1 = com.google.crypto.tink.shaded.protobuf.B.f6742a
            r0.<init>(r11, r12, r13, r1)
            java.lang.String r2 = "�"
            boolean r2 = r0.contains(r2)
            if (r2 != 0) goto L_0x0015
            goto L_0x0024
        L_0x0015:
            byte[] r1 = r0.getBytes(r1)
            int r13 = r13 + r12
            byte[] r11 = java.util.Arrays.copyOfRange(r11, r12, r13)
            boolean r11 = java.util.Arrays.equals(r1, r11)
            if (r11 == 0) goto L_0x0025
        L_0x0024:
            return r0
        L_0x0025:
            com.google.crypto.tink.shaded.protobuf.D r11 = com.google.crypto.tink.shaded.protobuf.D.b()
            throw r11
        L_0x002a:
            r0 = r12 | r13
            int r1 = r11.length
            int r1 = r1 - r12
            int r1 = r1 - r13
            r0 = r0 | r1
            if (r0 < 0) goto L_0x013c
            int r0 = r12 + r13
            char[] r13 = new char[r13]
            r1 = 0
            r2 = r1
        L_0x0038:
            if (r12 >= r0) goto L_0x0047
            byte r3 = r11[r12]
            if (r3 < 0) goto L_0x0047
            int r12 = r12 + 1
            int r4 = r2 + 1
            char r3 = (char) r3
            r13[r2] = r3
            r2 = r4
            goto L_0x0038
        L_0x0047:
            if (r12 >= r0) goto L_0x0136
            int r3 = r12 + 1
            byte r4 = r11[r12]
            if (r4 < 0) goto L_0x0066
            int r12 = r2 + 1
            char r4 = (char) r4
            r13[r2] = r4
        L_0x0054:
            if (r3 >= r0) goto L_0x0063
            byte r2 = r11[r3]
            if (r2 < 0) goto L_0x0063
            int r3 = r3 + 1
            int r4 = r12 + 1
            char r2 = (char) r2
            r13[r12] = r2
            r12 = r4
            goto L_0x0054
        L_0x0063:
            r2 = r12
            r12 = r3
            goto L_0x0047
        L_0x0066:
            r5 = -32
            if (r4 >= r5) goto L_0x0092
            if (r3 >= r0) goto L_0x008d
            int r12 = r12 + 2
            byte r3 = r11[r3]
            int r5 = r2 + 1
            r6 = -62
            if (r4 < r6) goto L_0x0088
            boolean r6 = R2.b.j0(r3)
            if (r6 != 0) goto L_0x0088
            r4 = r4 & 31
            int r4 = r4 << 6
            r3 = r3 & 63
            r3 = r3 | r4
            char r3 = (char) r3
            r13[r2] = r3
            r2 = r5
            goto L_0x0047
        L_0x0088:
            com.google.crypto.tink.shaded.protobuf.D r11 = com.google.crypto.tink.shaded.protobuf.D.b()
            throw r11
        L_0x008d:
            com.google.crypto.tink.shaded.protobuf.D r11 = com.google.crypto.tink.shaded.protobuf.D.b()
            throw r11
        L_0x0092:
            r6 = -16
            if (r4 >= r6) goto L_0x00d8
            int r6 = r0 + -1
            if (r3 >= r6) goto L_0x00d3
            int r6 = r12 + 2
            byte r3 = r11[r3]
            int r12 = r12 + 3
            byte r6 = r11[r6]
            int r7 = r2 + 1
            boolean r8 = R2.b.j0(r3)
            if (r8 != 0) goto L_0x00ce
            r8 = -96
            if (r4 != r5) goto L_0x00b0
            if (r3 < r8) goto L_0x00ce
        L_0x00b0:
            r5 = -19
            if (r4 != r5) goto L_0x00b6
            if (r3 >= r8) goto L_0x00ce
        L_0x00b6:
            boolean r5 = R2.b.j0(r6)
            if (r5 != 0) goto L_0x00ce
            r4 = r4 & 15
            int r4 = r4 << 12
            r3 = r3 & 63
            int r3 = r3 << 6
            r3 = r3 | r4
            r4 = r6 & 63
            r3 = r3 | r4
            char r3 = (char) r3
            r13[r2] = r3
            r2 = r7
            goto L_0x0047
        L_0x00ce:
            com.google.crypto.tink.shaded.protobuf.D r11 = com.google.crypto.tink.shaded.protobuf.D.b()
            throw r11
        L_0x00d3:
            com.google.crypto.tink.shaded.protobuf.D r11 = com.google.crypto.tink.shaded.protobuf.D.b()
            throw r11
        L_0x00d8:
            int r5 = r0 + -2
            if (r3 >= r5) goto L_0x0131
            int r5 = r12 + 2
            byte r3 = r11[r3]
            int r6 = r12 + 3
            byte r5 = r11[r5]
            int r12 = r12 + 4
            byte r6 = r11[r6]
            int r7 = r2 + 1
            boolean r8 = R2.b.j0(r3)
            if (r8 != 0) goto L_0x012c
            int r8 = r4 << 28
            int r9 = r3 + 112
            int r9 = r9 + r8
            int r8 = r9 >> 30
            if (r8 != 0) goto L_0x012c
            boolean r8 = R2.b.j0(r5)
            if (r8 != 0) goto L_0x012c
            boolean r8 = R2.b.j0(r6)
            if (r8 != 0) goto L_0x012c
            r4 = r4 & 7
            int r4 = r4 << 18
            r3 = r3 & 63
            int r3 = r3 << 12
            r3 = r3 | r4
            r4 = r5 & 63
            int r4 = r4 << 6
            r3 = r3 | r4
            r4 = r6 & 63
            r3 = r3 | r4
            int r4 = r3 >>> 10
            r5 = 55232(0xd7c0, float:7.7397E-41)
            int r4 = r4 + r5
            char r4 = (char) r4
            r13[r2] = r4
            r3 = r3 & 1023(0x3ff, float:1.434E-42)
            r4 = 56320(0xdc00, float:7.8921E-41)
            int r3 = r3 + r4
            char r3 = (char) r3
            r13[r7] = r3
            int r2 = r2 + 2
            goto L_0x0047
        L_0x012c:
            com.google.crypto.tink.shaded.protobuf.D r11 = com.google.crypto.tink.shaded.protobuf.D.b()
            throw r11
        L_0x0131:
            com.google.crypto.tink.shaded.protobuf.D r11 = com.google.crypto.tink.shaded.protobuf.D.b()
            throw r11
        L_0x0136:
            java.lang.String r11 = new java.lang.String
            r11.<init>(r13, r1, r2)
            return r11
        L_0x013c:
            java.lang.ArrayIndexOutOfBoundsException r0 = new java.lang.ArrayIndexOutOfBoundsException
            int r11 = r11.length
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)
            java.lang.Object[] r11 = new java.lang.Object[]{r11, r12, r13}
            java.lang.String r12 = "buffer length=%d, index=%d, size=%d"
            java.lang.String r11 = java.lang.String.format(r12, r11)
            r0.<init>(r11)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.crypto.tink.shaded.protobuf.q0.p(byte[], int, int):java.lang.String");
    }

    public final int q0(byte[] bArr, int i2, int i5) {
        int i6;
        int i7;
        byte[] bArr2 = bArr;
        int i8 = i2;
        int i9 = i5;
        switch (this.f6848b) {
            case 0:
                break;
            default:
                if ((i8 | i9 | (bArr2.length - i9)) >= 0) {
                    long j6 = (long) i8;
                    int i10 = (int) (((long) i9) - j6);
                    long j7 = 1;
                    if (i10 < 16) {
                        i7 = 0;
                    } else {
                        int i11 = 8 - (((int) j6) & 7);
                        long j8 = j6;
                        i7 = 0;
                        while (true) {
                            if (i7 < i11) {
                                long j9 = j8 + 1;
                                if (p0.g(bArr2, j8) >= 0) {
                                    i7++;
                                    j8 = j9;
                                }
                            } else {
                                while (true) {
                                    int i12 = i7 + 8;
                                    if (i12 <= i10) {
                                        if ((p0.f6845c.h(bArr2, p0.f6847f + j8) & -9187201950435737472L) == 0) {
                                            j8 += 8;
                                            i7 = i12;
                                        }
                                    }
                                }
                                while (true) {
                                    if (i7 < i10) {
                                        long j10 = j8 + 1;
                                        if (p0.g(bArr2, j8) >= 0) {
                                            i7++;
                                            j8 = j10;
                                        }
                                    } else {
                                        i7 = i10;
                                    }
                                }
                            }
                        }
                    }
                    int i13 = i10 - i7;
                    long j11 = j6 + ((long) i7);
                    while (true) {
                        byte b6 = 0;
                        while (true) {
                            if (i13 > 0) {
                                long j12 = j11 + j7;
                                b6 = p0.g(bArr2, j11);
                                if (b6 >= 0) {
                                    i13--;
                                    j11 = j12;
                                } else {
                                    j11 = j12;
                                }
                            }
                        }
                        if (i13 == 0) {
                            return 0;
                        }
                        int i14 = i13 - 1;
                        if (b6 < -32) {
                            if (i14 == 0) {
                                return b6;
                            }
                            i13 -= 2;
                            if (b6 >= -62) {
                                long j13 = j11 + j7;
                                if (p0.g(bArr2, j11) <= -65) {
                                    j11 = j13;
                                    j7 = 1;
                                }
                            }
                        } else if (b6 < -16) {
                            if (i14 < 2) {
                                return Z0(j11, bArr2, b6, i14);
                            }
                            i13 -= 3;
                            long j14 = j11 + j7;
                            byte g = p0.g(bArr2, j11);
                            if (g <= -65 && ((b6 != -32 || g >= -96) && (b6 != -19 || g < -96))) {
                                j11 += 2;
                                if (p0.g(bArr2, j14) <= -65) {
                                    j7 = 1;
                                }
                            }
                        } else if (i14 < 3) {
                            return Z0(j11, bArr2, b6, i14);
                        } else {
                            i13 -= 4;
                            long j15 = j11 + j7;
                            byte g5 = p0.g(bArr2, j11);
                            if (g5 <= -65) {
                                if ((((g5 + 112) + (b6 << 28)) >> 30) == 0) {
                                    long j16 = j11 + 2;
                                    if (p0.g(bArr2, j15) <= -65) {
                                        j11 += 3;
                                        if (p0.g(bArr2, j16) <= -65) {
                                            j7 = 1;
                                        }
                                    }
                                }
                            }
                        }
                    }
                    return -1;
                }
                throw new ArrayIndexOutOfBoundsException(String.format("Array length=%d, index=%d, limit=%d", new Object[]{Integer.valueOf(bArr2.length), Integer.valueOf(i2), Integer.valueOf(i5)}));
        }
        while (i6 < i9 && bArr2[i6] >= 0) {
            i8 = i6 + 1;
        }
        if (i6 >= i9) {
            return 0;
        }
        while (i6 < i9) {
            int i15 = i6 + 1;
            byte b7 = bArr2[i6];
            if (b7 < 0) {
                if (b7 < -32) {
                    if (i15 >= i9) {
                        return b7;
                    }
                    if (b7 >= -62) {
                        i6 += 2;
                        if (bArr2[i15] > -65) {
                        }
                    }
                } else if (b7 < -16) {
                    if (i15 >= i9 - 1) {
                        return s0.a(bArr2, i15, i9);
                    }
                    int i16 = i6 + 2;
                    byte b8 = bArr2[i15];
                    if (b8 <= -65 && ((b7 != -32 || b8 >= -96) && (b7 != -19 || b8 < -96))) {
                        i6 += 3;
                        if (bArr2[i16] > -65) {
                        }
                    }
                } else if (i15 >= i9 - 2) {
                    return s0.a(bArr2, i15, i9);
                } else {
                    int i17 = i6 + 2;
                    byte b9 = bArr2[i15];
                    if (b9 <= -65) {
                        if ((((b9 + 112) + (b7 << 28)) >> 30) == 0) {
                            int i18 = i6 + 3;
                            if (bArr2[i17] <= -65) {
                                i6 += 4;
                                if (bArr2[i18] > -65) {
                                }
                            }
                        }
                    }
                }
                return -1;
            }
            i6 = i15;
        }
        return 0;
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x003b A[LOOP:1: B:14:0x003b->B:38:0x00f6, LOOP_START, PHI: r2 r5 r10 r11 r12 
      PHI: (r2v10 int) = (r2v9 int), (r2v12 int) binds: [B:12:0x0036, B:38:0x00f6] A[DONT_GENERATE, DONT_INLINE]
      PHI: (r5v19 long) = (r5v18 long), (r5v20 long) binds: [B:12:0x0036, B:38:0x00f6] A[DONT_GENERATE, DONT_INLINE]
      PHI: (r10v15 java.lang.String) = (r10v14 java.lang.String), (r10v16 java.lang.String) binds: [B:12:0x0036, B:38:0x00f6] A[DONT_GENERATE, DONT_INLINE]
      PHI: (r11v1 java.lang.String) = (r11v0 java.lang.String), (r11v2 java.lang.String) binds: [B:12:0x0036, B:38:0x00f6] A[DONT_GENERATE, DONT_INLINE]
      PHI: (r12v3 long) = (r12v2 long), (r12v4 long) binds: [B:12:0x0036, B:38:0x00f6] A[DONT_GENERATE, DONT_INLINE]] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int r(java.lang.String r24, byte[] r25, int r26, int r27) {
        /*
            r23 = this;
            r0 = r24
            r1 = r25
            r2 = r26
            r3 = r23
            r4 = r27
            int r5 = r3.f6848b
            switch(r5) {
                case 0: goto L_0x0160;
                default: goto L_0x000f;
            }
        L_0x000f:
            long r5 = (long) r2
            long r7 = (long) r4
            long r7 = r7 + r5
            int r9 = r24.length()
            java.lang.String r10 = " at index "
            java.lang.String r11 = "Failed writing "
            if (r9 > r4) goto L_0x013e
            int r12 = r1.length
            int r12 = r12 - r4
            if (r12 < r2) goto L_0x013e
            r2 = 0
        L_0x0021:
            r12 = 1
            r4 = 128(0x80, float:1.794E-43)
            if (r2 >= r9) goto L_0x0036
            char r14 = r0.charAt(r2)
            if (r14 >= r4) goto L_0x0036
            long r12 = r12 + r5
            byte r4 = (byte) r14
            com.google.crypto.tink.shaded.protobuf.p0.o(r1, r5, r4)
            int r2 = r2 + 1
            r5 = r12
            goto L_0x0021
        L_0x0036:
            if (r2 != r9) goto L_0x003b
        L_0x0038:
            int r0 = (int) r5
            goto L_0x013d
        L_0x003b:
            if (r2 >= r9) goto L_0x0038
            char r14 = r0.charAt(r2)
            if (r14 >= r4) goto L_0x0053
            int r15 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r15 >= 0) goto L_0x0053
            long r15 = r5 + r12
            byte r14 = (byte) r14
            com.google.crypto.tink.shaded.protobuf.p0.o(r1, r5, r14)
            r18 = r11
            r5 = r15
            r15 = r10
            goto L_0x00f6
        L_0x0053:
            r15 = 2048(0x800, float:2.87E-42)
            r16 = 2
            if (r14 >= r15) goto L_0x0077
            long r18 = r7 - r16
            int r15 = (r5 > r18 ? 1 : (r5 == r18 ? 0 : -1))
            if (r15 > 0) goto L_0x0077
            r15 = r10
            r18 = r11
            long r10 = r5 + r12
            int r12 = r14 >>> 6
            r12 = r12 | 960(0x3c0, float:1.345E-42)
            byte r12 = (byte) r12
            com.google.crypto.tink.shaded.protobuf.p0.o(r1, r5, r12)
            long r5 = r5 + r16
            r12 = r14 & 63
            r12 = r12 | r4
            byte r12 = (byte) r12
            com.google.crypto.tink.shaded.protobuf.p0.o(r1, r10, r12)
            goto L_0x00f6
        L_0x0077:
            r15 = r10
            r18 = r11
            r10 = 57343(0xdfff, float:8.0355E-41)
            r11 = 55296(0xd800, float:7.7486E-41)
            r12 = 3
            if (r14 < r11) goto L_0x0086
            if (r10 >= r14) goto L_0x00ae
        L_0x0086:
            long r19 = r7 - r12
            int r19 = (r5 > r19 ? 1 : (r5 == r19 ? 0 : -1))
            if (r19 > 0) goto L_0x00ae
            r19 = 1
            long r10 = r5 + r19
            int r12 = r14 >>> 12
            r12 = r12 | 480(0x1e0, float:6.73E-43)
            byte r12 = (byte) r12
            com.google.crypto.tink.shaded.protobuf.p0.o(r1, r5, r12)
            long r12 = r5 + r16
            int r16 = r14 >>> 6
            r3 = r16 & 63
            r3 = r3 | r4
            byte r3 = (byte) r3
            com.google.crypto.tink.shaded.protobuf.p0.o(r1, r10, r3)
            r10 = 3
            long r5 = r5 + r10
            r3 = r14 & 63
            r3 = r3 | r4
            byte r3 = (byte) r3
            com.google.crypto.tink.shaded.protobuf.p0.o(r1, r12, r3)
            goto L_0x00f6
        L_0x00ae:
            r12 = 4
            long r21 = r7 - r12
            int r3 = (r5 > r21 ? 1 : (r5 == r21 ? 0 : -1))
            if (r3 > 0) goto L_0x010a
            int r3 = r2 + 1
            if (r3 == r9) goto L_0x0102
            char r2 = r0.charAt(r3)
            boolean r10 = java.lang.Character.isSurrogatePair(r14, r2)
            if (r10 == 0) goto L_0x0101
            int r2 = java.lang.Character.toCodePoint(r14, r2)
            r10 = 1
            long r12 = r5 + r10
            int r14 = r2 >>> 18
            r14 = r14 | 240(0xf0, float:3.36E-43)
            byte r14 = (byte) r14
            com.google.crypto.tink.shaded.protobuf.p0.o(r1, r5, r14)
            long r10 = r5 + r16
            int r14 = r2 >>> 12
            r14 = r14 & 63
            r14 = r14 | r4
            byte r14 = (byte) r14
            com.google.crypto.tink.shaded.protobuf.p0.o(r1, r12, r14)
            r12 = 3
            long r12 = r12 + r5
            int r14 = r2 >>> 6
            r14 = r14 & 63
            r14 = r14 | r4
            byte r14 = (byte) r14
            com.google.crypto.tink.shaded.protobuf.p0.o(r1, r10, r14)
            r10 = 4
            long r5 = r5 + r10
            r2 = r2 & 63
            r2 = r2 | r4
            byte r2 = (byte) r2
            com.google.crypto.tink.shaded.protobuf.p0.o(r1, r12, r2)
            r2 = r3
        L_0x00f6:
            int r2 = r2 + 1
            r3 = r23
            r10 = r15
            r11 = r18
            r12 = 1
            goto L_0x003b
        L_0x0101:
            r2 = r3
        L_0x0102:
            com.google.crypto.tink.shaded.protobuf.r0 r0 = new com.google.crypto.tink.shaded.protobuf.r0
            int r2 = r2 + -1
            r0.<init>(r2, r9)
            throw r0
        L_0x010a:
            if (r11 > r14) goto L_0x0122
            if (r14 > r10) goto L_0x0122
            int r1 = r2 + 1
            if (r1 == r9) goto L_0x011c
            char r0 = r0.charAt(r1)
            boolean r0 = java.lang.Character.isSurrogatePair(r14, r0)
            if (r0 != 0) goto L_0x0122
        L_0x011c:
            com.google.crypto.tink.shaded.protobuf.r0 r0 = new com.google.crypto.tink.shaded.protobuf.r0
            r0.<init>(r2, r9)
            throw r0
        L_0x0122:
            java.lang.ArrayIndexOutOfBoundsException r0 = new java.lang.ArrayIndexOutOfBoundsException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r3 = r18
            r1.<init>(r3)
            r1.append(r14)
            r7 = r15
            r1.append(r7)
            r1.append(r5)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x013d:
            return r0
        L_0x013e:
            r7 = r10
            r3 = r11
            java.lang.ArrayIndexOutOfBoundsException r1 = new java.lang.ArrayIndexOutOfBoundsException
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>(r3)
            int r9 = r9 + -1
            char r0 = r0.charAt(r9)
            r5.append(r0)
            r5.append(r7)
            int r0 = r2 + r4
            r5.append(r0)
            java.lang.String r0 = r5.toString()
            r1.<init>(r0)
            throw r1
        L_0x0160:
            int r3 = r24.length()
            int r4 = r4 + r2
            r5 = 0
        L_0x0166:
            r6 = 128(0x80, float:1.794E-43)
            if (r5 >= r3) goto L_0x017a
            int r7 = r5 + r2
            if (r7 >= r4) goto L_0x017a
            char r8 = r0.charAt(r5)
            if (r8 >= r6) goto L_0x017a
            byte r6 = (byte) r8
            r1[r7] = r6
            int r5 = r5 + 1
            goto L_0x0166
        L_0x017a:
            if (r5 != r3) goto L_0x0180
            int r0 = r2 + r3
            goto L_0x025d
        L_0x0180:
            int r2 = r2 + r5
        L_0x0181:
            if (r5 >= r3) goto L_0x025c
            char r7 = r0.charAt(r5)
            if (r7 >= r6) goto L_0x0193
            if (r2 >= r4) goto L_0x0193
            int r8 = r2 + 1
            byte r7 = (byte) r7
            r1[r2] = r7
            r2 = r8
            goto L_0x0217
        L_0x0193:
            r8 = 2048(0x800, float:2.87E-42)
            if (r7 >= r8) goto L_0x01ad
            int r8 = r4 + -2
            if (r2 > r8) goto L_0x01ad
            int r8 = r2 + 1
            int r9 = r7 >>> 6
            r9 = r9 | 960(0x3c0, float:1.345E-42)
            byte r9 = (byte) r9
            r1[r2] = r9
            int r2 = r2 + 2
            r7 = r7 & 63
            r7 = r7 | r6
            byte r7 = (byte) r7
            r1[r8] = r7
            goto L_0x0217
        L_0x01ad:
            r8 = 57343(0xdfff, float:8.0355E-41)
            r9 = 55296(0xd800, float:7.7486E-41)
            if (r7 < r9) goto L_0x01b7
            if (r8 >= r7) goto L_0x01d7
        L_0x01b7:
            int r10 = r4 + -3
            if (r2 > r10) goto L_0x01d7
            int r8 = r2 + 1
            int r9 = r7 >>> 12
            r9 = r9 | 480(0x1e0, float:6.73E-43)
            byte r9 = (byte) r9
            r1[r2] = r9
            int r9 = r2 + 2
            int r10 = r7 >>> 6
            r10 = r10 & 63
            r10 = r10 | r6
            byte r10 = (byte) r10
            r1[r8] = r10
            int r2 = r2 + 3
            r7 = r7 & 63
            r7 = r7 | r6
            byte r7 = (byte) r7
            r1[r9] = r7
            goto L_0x0217
        L_0x01d7:
            int r10 = r4 + -4
            if (r2 > r10) goto L_0x0224
            int r8 = r5 + 1
            int r9 = r24.length()
            if (r8 == r9) goto L_0x021c
            char r5 = r0.charAt(r8)
            boolean r9 = java.lang.Character.isSurrogatePair(r7, r5)
            if (r9 == 0) goto L_0x021b
            int r5 = java.lang.Character.toCodePoint(r7, r5)
            int r7 = r2 + 1
            int r9 = r5 >>> 18
            r9 = r9 | 240(0xf0, float:3.36E-43)
            byte r9 = (byte) r9
            r1[r2] = r9
            int r9 = r2 + 2
            int r10 = r5 >>> 12
            r10 = r10 & 63
            r10 = r10 | r6
            byte r10 = (byte) r10
            r1[r7] = r10
            int r7 = r2 + 3
            int r10 = r5 >>> 6
            r10 = r10 & 63
            r10 = r10 | r6
            byte r10 = (byte) r10
            r1[r9] = r10
            int r2 = r2 + 4
            r5 = r5 & 63
            r5 = r5 | r6
            byte r5 = (byte) r5
            r1[r7] = r5
            r5 = r8
        L_0x0217:
            int r5 = r5 + 1
            goto L_0x0181
        L_0x021b:
            r5 = r8
        L_0x021c:
            com.google.crypto.tink.shaded.protobuf.r0 r0 = new com.google.crypto.tink.shaded.protobuf.r0
            int r5 = r5 + -1
            r0.<init>(r5, r3)
            throw r0
        L_0x0224:
            if (r9 > r7) goto L_0x0240
            if (r7 > r8) goto L_0x0240
            int r1 = r5 + 1
            int r4 = r24.length()
            if (r1 == r4) goto L_0x023a
            char r0 = r0.charAt(r1)
            boolean r0 = java.lang.Character.isSurrogatePair(r7, r0)
            if (r0 != 0) goto L_0x0240
        L_0x023a:
            com.google.crypto.tink.shaded.protobuf.r0 r0 = new com.google.crypto.tink.shaded.protobuf.r0
            r0.<init>(r5, r3)
            throw r0
        L_0x0240:
            java.lang.ArrayIndexOutOfBoundsException r0 = new java.lang.ArrayIndexOutOfBoundsException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r3 = "Failed writing "
            r1.<init>(r3)
            r1.append(r7)
            java.lang.String r3 = " at index "
            r1.append(r3)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x025c:
            r0 = r2
        L_0x025d:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.crypto.tink.shaded.protobuf.q0.r(java.lang.String, byte[], int, int):int");
    }
}
