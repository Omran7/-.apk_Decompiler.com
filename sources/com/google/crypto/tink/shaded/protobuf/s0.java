package com.google.crypto.tink.shaded.protobuf;

import android.support.v4.media.session.a;

public abstract class s0 {

    /* renamed from: a  reason: collision with root package name */
    public static final a f6855a;

    static {
        q0 q0Var;
        if (!p0.f6846e || !p0.d || C0398c.a()) {
            q0Var = new q0(0);
        } else {
            q0Var = new q0(1);
        }
        f6855a = q0Var;
    }

    public static int a(byte[] bArr, int i2, int i5) {
        byte b6 = bArr[i2 - 1];
        int i6 = i5 - i2;
        if (i6 == 0) {
            if (b6 > -12) {
                b6 = -1;
            }
            return b6;
        } else if (i6 == 1) {
            return c(b6, bArr[i2]);
        } else {
            if (i6 == 2) {
                return d(b6, bArr[i2], bArr[i2 + 1]);
            }
            throw new AssertionError();
        }
    }

    public static int b(String str) {
        int length = str.length();
        int i2 = 0;
        int i5 = 0;
        while (i5 < length && str.charAt(i5) < 128) {
            i5++;
        }
        int i6 = length;
        while (true) {
            if (i5 >= length) {
                break;
            }
            char charAt = str.charAt(i5);
            if (charAt < 2048) {
                i6 += (127 - charAt) >>> 31;
                i5++;
            } else {
                int length2 = str.length();
                while (i5 < length2) {
                    char charAt2 = str.charAt(i5);
                    if (charAt2 < 2048) {
                        i2 += (127 - charAt2) >>> 31;
                    } else {
                        i2 += 2;
                        if (55296 <= charAt2 && charAt2 <= 57343) {
                            if (Character.codePointAt(str, i5) >= 65536) {
                                i5++;
                            } else {
                                throw new r0(i5, length2);
                            }
                        }
                    }
                    i5++;
                }
                i6 += i2;
            }
        }
        if (i6 >= length) {
            return i6;
        }
        throw new IllegalArgumentException("UTF-8 length does not fit in int: " + (((long) i6) + 4294967296L));
    }

    public static int c(int i2, int i5) {
        if (i2 > -12 || i5 > -65) {
            return -1;
        }
        return i2 ^ (i5 << 8);
    }

    public static int d(int i2, int i5, int i6) {
        if (i2 > -12 || i5 > -65 || i6 > -65) {
            return -1;
        }
        return (i2 ^ (i5 << 8)) ^ (i6 << 16);
    }

    public static boolean e(byte[] bArr, int i2, int i5) {
        if (f6855a.q0(bArr, i2, i5) == 0) {
            return true;
        }
        return false;
    }
}
