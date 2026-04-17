package E2;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.IntBuffer;

public abstract class a {

    /* renamed from: a  reason: collision with root package name */
    public static final int[] f612a = c(new byte[]{101, 120, 112, 97, 110, 100, 32, 51, 50, 45, 98, 121, 116, 101, 32, 107});

    public static void a(int[] iArr, int i2, int i5, int i6, int i7) {
        int i8 = iArr[i2] + iArr[i5];
        iArr[i2] = i8;
        int i9 = i8 ^ iArr[i7];
        int i10 = (i9 >>> -16) | (i9 << 16);
        iArr[i7] = i10;
        int i11 = iArr[i6] + i10;
        iArr[i6] = i11;
        int i12 = iArr[i5] ^ i11;
        int i13 = (i12 >>> -12) | (i12 << 12);
        iArr[i5] = i13;
        int i14 = iArr[i2] + i13;
        iArr[i2] = i14;
        int i15 = iArr[i7] ^ i14;
        int i16 = (i15 >>> -8) | (i15 << 8);
        iArr[i7] = i16;
        int i17 = iArr[i6] + i16;
        iArr[i6] = i17;
        int i18 = iArr[i5] ^ i17;
        iArr[i5] = (i18 >>> -7) | (i18 << 7);
    }

    public static void b(int[] iArr) {
        int[] iArr2 = iArr;
        for (int i2 = 0; i2 < 10; i2++) {
            a(iArr2, 0, 4, 8, 12);
            a(iArr2, 1, 5, 9, 13);
            a(iArr2, 2, 6, 10, 14);
            a(iArr2, 3, 7, 11, 15);
            a(iArr2, 0, 5, 10, 15);
            a(iArr2, 1, 6, 11, 12);
            a(iArr2, 2, 7, 8, 13);
            a(iArr2, 3, 4, 9, 14);
        }
    }

    public static int[] c(byte[] bArr) {
        IntBuffer asIntBuffer = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN).asIntBuffer();
        int[] iArr = new int[asIntBuffer.remaining()];
        asIntBuffer.get(iArr);
        return iArr;
    }
}
