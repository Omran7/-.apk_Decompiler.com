package o;

import kotlin.jvm.internal.j;

/* renamed from: o.a  reason: case insensitive filesystem */
public abstract class C0890a {

    /* renamed from: a  reason: collision with root package name */
    public static final int[] f10413a = new int[0];

    /* renamed from: b  reason: collision with root package name */
    public static final long[] f10414b = new long[0];

    /* renamed from: c  reason: collision with root package name */
    public static final Object[] f10415c = new Object[0];

    public static final int a(int i2, int i5, int[] iArr) {
        j.e(iArr, "array");
        int i6 = i2 - 1;
        int i7 = 0;
        while (i7 <= i6) {
            int i8 = (i7 + i6) >>> 1;
            int i9 = iArr[i8];
            if (i9 < i5) {
                i7 = i8 + 1;
            } else if (i9 <= i5) {
                return i8;
            } else {
                i6 = i8 - 1;
            }
        }
        return ~i7;
    }

    public static final int b(long[] jArr, int i2, long j6) {
        j.e(jArr, "array");
        int i5 = i2 - 1;
        int i6 = 0;
        while (i6 <= i5) {
            int i7 = (i6 + i5) >>> 1;
            int i8 = (jArr[i7] > j6 ? 1 : (jArr[i7] == j6 ? 0 : -1));
            if (i8 < 0) {
                i6 = i7 + 1;
            } else if (i8 <= 0) {
                return i7;
            } else {
                i5 = i7 - 1;
            }
        }
        return ~i6;
    }
}
