package P2;

import C2.a;
import h0.C0552a;
import java.security.GeneralSecurityException;
import java.util.Arrays;
import javax.crypto.AEADBadTagException;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class b implements a {

    /* renamed from: e  reason: collision with root package name */
    public static final A5.b f2157e = new A5.b(5);

    /* renamed from: f  reason: collision with root package name */
    public static final A5.b f2158f = new A5.b(6);

    /* renamed from: a  reason: collision with root package name */
    public final byte[] f2159a;

    /* renamed from: b  reason: collision with root package name */
    public final byte[] f2160b;

    /* renamed from: c  reason: collision with root package name */
    public final SecretKeySpec f2161c;
    public final int d;

    public b(byte[] bArr, int i2) {
        if (!C0552a.d(1)) {
            throw new GeneralSecurityException("Can not use AES-EAX in FIPS-mode.");
        } else if (i2 == 12 || i2 == 16) {
            this.d = i2;
            p.a(bArr.length);
            SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "AES");
            this.f2161c = secretKeySpec;
            Cipher cipher = (Cipher) f2157e.get();
            cipher.init(1, secretKeySpec);
            byte[] c3 = c(cipher.doFinal(new byte[16]));
            this.f2159a = c3;
            this.f2160b = c(c3);
        } else {
            throw new IllegalArgumentException("IV size should be either 12 or 16 bytes");
        }
    }

    public static byte[] c(byte[] bArr) {
        byte[] bArr2 = new byte[16];
        int i2 = 0;
        while (i2 < 15) {
            int i5 = i2 + 1;
            bArr2[i2] = (byte) (((bArr[i2] << 1) ^ ((bArr[i5] & 255) >>> 7)) & 255);
            i2 = i5;
        }
        bArr2[15] = (byte) (((bArr[0] >> 7) & 135) ^ (bArr[15] << 1));
        return bArr2;
    }

    public static byte[] e(byte[] bArr, byte[] bArr2) {
        int length = bArr.length;
        byte[] bArr3 = new byte[length];
        for (int i2 = 0; i2 < length; i2++) {
            bArr3[i2] = (byte) (bArr[i2] ^ bArr2[i2]);
        }
        return bArr3;
    }

    public final byte[] a(byte[] bArr, byte[] bArr2) {
        byte[] bArr3;
        byte[] bArr4 = bArr;
        int length = bArr4.length;
        int i2 = this.d;
        if (length <= 2147483631 - i2) {
            byte[] bArr5 = new byte[(bArr4.length + i2 + 16)];
            byte[] a6 = o.a(i2);
            System.arraycopy(a6, 0, bArr5, 0, i2);
            Cipher cipher = (Cipher) f2157e.get();
            SecretKeySpec secretKeySpec = this.f2161c;
            cipher.init(1, secretKeySpec);
            byte[] d6 = d(cipher, 0, a6, 0, a6.length);
            if (bArr2 == null) {
                bArr3 = new byte[0];
            } else {
                bArr3 = bArr2;
            }
            byte[] d7 = d(cipher, 1, bArr3, 0, bArr3.length);
            Cipher cipher2 = (Cipher) f2158f.get();
            cipher2.init(1, secretKeySpec, new IvParameterSpec(d6));
            cipher2.doFinal(bArr, 0, bArr4.length, bArr5, this.d);
            Cipher cipher3 = cipher;
            byte[] bArr6 = bArr5;
            byte[] d8 = d(cipher3, 2, bArr6, this.d, bArr4.length);
            int length2 = bArr4.length + i2;
            for (int i5 = 0; i5 < 16; i5++) {
                bArr5[length2 + i5] = (byte) ((d7[i5] ^ d6[i5]) ^ d8[i5]);
            }
            return bArr5;
        }
        throw new GeneralSecurityException("plaintext too long");
    }

    public final byte[] b(byte[] bArr, byte[] bArr2) {
        byte[] bArr3;
        byte[] bArr4 = bArr;
        int length = bArr4.length;
        int i2 = this.d;
        int i5 = (length - i2) - 16;
        if (i5 >= 0) {
            Cipher cipher = (Cipher) f2157e.get();
            SecretKeySpec secretKeySpec = this.f2161c;
            cipher.init(1, secretKeySpec);
            byte[] d6 = d(cipher, 0, bArr, 0, this.d);
            if (bArr2 == null) {
                bArr3 = new byte[0];
            } else {
                bArr3 = bArr2;
            }
            Cipher cipher2 = cipher;
            byte[] d7 = d(cipher2, 1, bArr3, 0, bArr3.length);
            byte[] d8 = d(cipher2, 2, bArr, this.d, i5);
            int length2 = bArr4.length - 16;
            byte b6 = 0;
            for (int i6 = 0; i6 < 16; i6++) {
                b6 = (byte) (b6 | (((bArr4[length2 + i6] ^ d7[i6]) ^ d6[i6]) ^ d8[i6]));
            }
            if (b6 == 0) {
                Cipher cipher3 = (Cipher) f2158f.get();
                cipher3.init(1, secretKeySpec, new IvParameterSpec(d6));
                return cipher3.doFinal(bArr4, i2, i5);
            }
            throw new AEADBadTagException("tag mismatch");
        }
        throw new GeneralSecurityException("ciphertext too short");
    }

    public final byte[] d(Cipher cipher, int i2, byte[] bArr, int i5, int i6) {
        byte[] bArr2;
        byte[] bArr3 = new byte[16];
        bArr3[15] = (byte) i2;
        byte[] bArr4 = this.f2159a;
        if (i6 == 0) {
            return cipher.doFinal(e(bArr3, bArr4));
        }
        byte[] doFinal = cipher.doFinal(bArr3);
        int i7 = 0;
        while (i6 - i7 > 16) {
            for (int i8 = 0; i8 < 16; i8++) {
                doFinal[i8] = (byte) (doFinal[i8] ^ bArr[(i5 + i7) + i8]);
            }
            doFinal = cipher.doFinal(doFinal);
            i7 += 16;
        }
        byte[] copyOfRange = Arrays.copyOfRange(bArr, i7 + i5, i5 + i6);
        if (copyOfRange.length == 16) {
            bArr2 = e(copyOfRange, bArr4);
        } else {
            bArr2 = Arrays.copyOf(this.f2160b, 16);
            for (int i9 = 0; i9 < copyOfRange.length; i9++) {
                bArr2[i9] = (byte) (bArr2[i9] ^ copyOfRange[i9]);
            }
            bArr2[copyOfRange.length] = (byte) (bArr2[copyOfRange.length] ^ 128);
        }
        return cipher.doFinal(e(doFinal, bArr2));
    }
}
