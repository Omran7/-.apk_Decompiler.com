package P2;

import C2.a;
import E2.b;
import E2.e;
import h0.C0552a;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.security.spec.AlgorithmParameterSpec;
import java.util.Arrays;
import javax.crypto.Cipher;

public final class c implements a {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f2162a;

    /* renamed from: b  reason: collision with root package name */
    public final Object f2163b;

    public c(byte[] bArr, int i2) {
        this.f2162a = i2;
        switch (i2) {
            case 1:
                this.f2163b = new e(bArr, 0);
                return;
            case 2:
                this.f2163b = new e(bArr, 1);
                return;
            default:
                if (C0552a.e(2)) {
                    this.f2163b = new b(bArr);
                    return;
                }
                throw new GeneralSecurityException("Can not use AES-GCM in FIPS-mode, as BoringCrypto module is not available.");
        }
    }

    public final byte[] a(byte[] bArr, byte[] bArr2) {
        int i2;
        int i5;
        switch (this.f2162a) {
            case 0:
                byte[] a6 = o.a(12);
                b bVar = (b) this.f2163b;
                bVar.getClass();
                if (a6.length != 12) {
                    throw new GeneralSecurityException("iv is wrong size");
                } else if (bArr.length <= 2147483619) {
                    boolean z3 = bVar.f615b;
                    if (z3) {
                        i2 = bArr.length + 28;
                    } else {
                        i2 = bArr.length + 16;
                    }
                    byte[] bArr3 = new byte[i2];
                    if (z3) {
                        System.arraycopy(a6, 0, bArr3, 0, 12);
                    }
                    AlgorithmParameterSpec a7 = b.a(a6);
                    A5.b bVar2 = b.f613c;
                    ((Cipher) bVar2.get()).init(1, bVar.f614a, a7);
                    if (!(bArr2 == null || bArr2.length == 0)) {
                        ((Cipher) bVar2.get()).updateAAD(bArr2);
                    }
                    if (z3) {
                        i5 = 12;
                    } else {
                        i5 = 0;
                    }
                    int doFinal = ((Cipher) bVar2.get()).doFinal(bArr, 0, bArr.length, bArr3, i5);
                    if (doFinal == bArr.length + 16) {
                        return bArr3;
                    }
                    throw new GeneralSecurityException(C0552a.k(doFinal - bArr.length, "encryption failed; GCM tag must be 16 bytes, but got only ", " bytes"));
                } else {
                    throw new GeneralSecurityException("plaintext too long");
                }
            case 1:
                ByteBuffer allocate = ByteBuffer.allocate(bArr.length + 28);
                byte[] a8 = o.a(12);
                allocate.put(a8);
                ((e) this.f2163b).h(allocate, a8, bArr, bArr2);
                return allocate.array();
            default:
                ByteBuffer allocate2 = ByteBuffer.allocate(bArr.length + 40);
                byte[] a9 = o.a(24);
                allocate2.put(a9);
                ((e) this.f2163b).h(allocate2, a9, bArr, bArr2);
                return allocate2.array();
        }
    }

    public final byte[] b(byte[] bArr, byte[] bArr2) {
        int i2;
        switch (this.f2162a) {
            case 0:
                byte[] copyOf = Arrays.copyOf(bArr, 12);
                b bVar = (b) this.f2163b;
                bVar.getClass();
                if (copyOf.length == 12) {
                    boolean z3 = bVar.f615b;
                    if (z3) {
                        i2 = 28;
                    } else {
                        i2 = 16;
                    }
                    if (bArr.length >= i2) {
                        int i5 = 0;
                        if (!z3 || ByteBuffer.wrap(copyOf).equals(ByteBuffer.wrap(bArr, 0, 12))) {
                            AlgorithmParameterSpec a6 = b.a(copyOf);
                            A5.b bVar2 = b.f613c;
                            ((Cipher) bVar2.get()).init(2, bVar.f614a, a6);
                            if (!(bArr2 == null || bArr2.length == 0)) {
                                ((Cipher) bVar2.get()).updateAAD(bArr2);
                            }
                            if (z3) {
                                i5 = 12;
                            }
                            int length = bArr.length;
                            if (z3) {
                                length -= 12;
                            }
                            return ((Cipher) bVar2.get()).doFinal(bArr, i5, length);
                        }
                        throw new GeneralSecurityException("iv does not match prepended iv");
                    }
                    throw new GeneralSecurityException("ciphertext too short");
                }
                throw new GeneralSecurityException("iv is wrong size");
            case 1:
                if (bArr.length >= 28) {
                    return ((e) this.f2163b).g(ByteBuffer.wrap(bArr, 12, bArr.length - 12), Arrays.copyOf(bArr, 12), bArr2);
                }
                throw new GeneralSecurityException("ciphertext too short");
            default:
                if (bArr.length >= 40) {
                    return ((e) this.f2163b).g(ByteBuffer.wrap(bArr, 24, bArr.length - 24), Arrays.copyOf(bArr, 24), bArr2);
                }
                throw new GeneralSecurityException("ciphertext too short");
        }
    }
}
