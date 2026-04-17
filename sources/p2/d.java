package P2;

import B0.C0009h;
import C2.c;
import K1.e;
import h0.C0552a;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.List;
import javax.crypto.AEADBadTagException;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class d implements c {

    /* renamed from: c  reason: collision with root package name */
    public static final List f2164c = Arrays.asList(new Integer[]{64});
    public static final byte[] d = new byte[16];

    /* renamed from: e  reason: collision with root package name */
    public static final byte[] f2165e = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1};

    /* renamed from: a  reason: collision with root package name */
    public final C0009h f2166a;

    /* renamed from: b  reason: collision with root package name */
    public final byte[] f2167b;

    public d(byte[] bArr) {
        if (C0552a.d(1)) {
            if (f2164c.contains(Integer.valueOf(bArr.length))) {
                byte[] copyOfRange = Arrays.copyOfRange(bArr, 0, bArr.length / 2);
                this.f2167b = Arrays.copyOfRange(bArr, bArr.length / 2, bArr.length);
                this.f2166a = new C0009h(copyOfRange);
                return;
            }
            throw new InvalidKeyException("invalid key size: " + bArr.length + " bytes; key must have 64 bytes");
        }
        throw new GeneralSecurityException("Can not use AES-SIV in FIPS-mode.");
    }

    public final byte[] a(byte[] bArr, byte[] bArr2) {
        if (bArr.length <= 2147483631) {
            Cipher cipher = (Cipher) j.f2176b.f2178a.b("AES/CTR/NoPadding");
            byte[] c3 = c(bArr2, bArr);
            byte[] bArr3 = (byte[]) c3.clone();
            bArr3[8] = (byte) (bArr3[8] & Byte.MAX_VALUE);
            bArr3[12] = (byte) (bArr3[12] & Byte.MAX_VALUE);
            cipher.init(1, new SecretKeySpec(this.f2167b, "AES"), new IvParameterSpec(bArr3));
            return com.bumptech.glide.d.i(c3, cipher.doFinal(bArr));
        }
        throw new GeneralSecurityException("plaintext too long");
    }

    public final byte[] b(byte[] bArr, byte[] bArr2) {
        if (bArr.length >= 16) {
            Cipher cipher = (Cipher) j.f2176b.f2178a.b("AES/CTR/NoPadding");
            byte[] copyOfRange = Arrays.copyOfRange(bArr, 0, 16);
            byte[] bArr3 = (byte[]) copyOfRange.clone();
            bArr3[8] = (byte) (bArr3[8] & Byte.MAX_VALUE);
            bArr3[12] = (byte) (bArr3[12] & Byte.MAX_VALUE);
            cipher.init(2, new SecretKeySpec(this.f2167b, "AES"), new IvParameterSpec(bArr3));
            byte[] copyOfRange2 = Arrays.copyOfRange(bArr, 16, bArr.length);
            byte[] doFinal = cipher.doFinal(copyOfRange2);
            if (copyOfRange2.length == 0 && doFinal == null && "The Android Project".equals(System.getProperty("java.vendor"))) {
                doFinal = new byte[0];
            }
            if (MessageDigest.isEqual(copyOfRange, c(bArr2, doFinal))) {
                return doFinal;
            }
            throw new AEADBadTagException("Integrity check failed.");
        }
        throw new GeneralSecurityException("Ciphertext too short.");
    }

    public final byte[] c(byte[]... bArr) {
        byte[] bArr2;
        int length = bArr.length;
        C0009h hVar = this.f2166a;
        if (length == 0) {
            return hVar.h(f2165e, 16);
        }
        byte[] h = hVar.h(d, 16);
        for (int i2 = 0; i2 < bArr.length - 1; i2++) {
            byte[] bArr3 = bArr[i2];
            if (bArr3 == null) {
                bArr3 = new byte[0];
            }
            h = com.bumptech.glide.d.q1(e.j(h), hVar.h(bArr3, 16));
        }
        byte[] bArr4 = bArr[bArr.length - 1];
        if (bArr4.length >= 16) {
            if (bArr4.length >= h.length) {
                int length2 = bArr4.length - h.length;
                bArr2 = Arrays.copyOf(bArr4, bArr4.length);
                for (int i5 = 0; i5 < h.length; i5++) {
                    int i6 = length2 + i5;
                    bArr2[i6] = (byte) (bArr2[i6] ^ h[i5]);
                }
            } else {
                throw new IllegalArgumentException("xorEnd requires a.length >= b.length");
            }
        } else if (bArr4.length < 16) {
            byte[] copyOf = Arrays.copyOf(bArr4, 16);
            copyOf[bArr4.length] = Byte.MIN_VALUE;
            bArr2 = com.bumptech.glide.d.q1(copyOf, e.j(h));
        } else {
            throw new IllegalArgumentException("x must be smaller than a block.");
        }
        return hVar.h(bArr2, 16);
    }
}
