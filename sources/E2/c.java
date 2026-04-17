package E2;

import java.security.InvalidKeyException;
import java.util.Arrays;

public final class c extends d {

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ int f616c;

    public c(byte[] bArr, int i2, int i5) {
        this.f616c = i5;
        if (bArr.length == 32) {
            this.f618b = a.c(bArr);
            this.f617a = i2;
            return;
        }
        throw new InvalidKeyException("The key length in bytes must be 32.");
    }

    public final int[] c(int[] iArr, int i2) {
        switch (this.f616c) {
            case 0:
                if (iArr.length == 3) {
                    int[] iArr2 = new int[16];
                    int[] iArr3 = a.f612a;
                    System.arraycopy(iArr3, 0, iArr2, 0, iArr3.length);
                    System.arraycopy((int[]) this.f618b, 0, iArr2, iArr3.length, 8);
                    iArr2[12] = i2;
                    System.arraycopy(iArr, 0, iArr2, 13, iArr.length);
                    return iArr2;
                }
                throw new IllegalArgumentException(String.format("ChaCha20 uses 96-bit nonces, but got a %d-bit nonce", new Object[]{Integer.valueOf(iArr.length * 32)}));
            default:
                if (iArr.length == 6) {
                    int[] iArr4 = new int[16];
                    int[] iArr5 = new int[16];
                    int[] iArr6 = a.f612a;
                    System.arraycopy(iArr6, 0, iArr5, 0, iArr6.length);
                    System.arraycopy((int[]) this.f618b, 0, iArr5, iArr6.length, 8);
                    iArr5[12] = iArr[0];
                    iArr5[13] = iArr[1];
                    iArr5[14] = iArr[2];
                    iArr5[15] = iArr[3];
                    a.b(iArr5);
                    iArr5[4] = iArr5[12];
                    iArr5[5] = iArr5[13];
                    iArr5[6] = iArr5[14];
                    iArr5[7] = iArr5[15];
                    int[] copyOf = Arrays.copyOf(iArr5, 8);
                    System.arraycopy(iArr6, 0, iArr4, 0, iArr6.length);
                    System.arraycopy(copyOf, 0, iArr4, iArr6.length, 8);
                    iArr4[12] = i2;
                    iArr4[13] = 0;
                    iArr4[14] = iArr[4];
                    iArr4[15] = iArr[5];
                    return iArr4;
                }
                throw new IllegalArgumentException(String.format("XChaCha20 uses 192-bit nonces, but got a %d-bit nonce", new Object[]{Integer.valueOf(iArr.length * 32)}));
        }
    }

    public final int i() {
        switch (this.f616c) {
            case 0:
                return 12;
            default:
                return 24;
        }
    }
}
