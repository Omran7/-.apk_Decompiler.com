package E2;

import com.google.crypto.tink.shaded.protobuf.C0403h;
import com.google.crypto.tink.shaded.protobuf.C0405j;
import com.google.crypto.tink.shaded.protobuf.D;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.GeneralSecurityException;
import k5.C0773j;

public abstract class d {

    /* renamed from: a  reason: collision with root package name */
    public int f617a;

    /* renamed from: b  reason: collision with root package name */
    public Object f618b;

    public d(C0773j jVar) {
        this.f618b = jVar;
    }

    public static int d(int i2) {
        return (-(i2 & 1)) ^ (i2 >>> 1);
    }

    public static long e(long j6) {
        return (-(j6 & 1)) ^ (j6 >>> 1);
    }

    public static C0405j h(byte[] bArr, int i2, int i5, boolean z3) {
        C0405j jVar = new C0405j(bArr, i2, i5, z3);
        try {
            jVar.l(i5);
            return jVar;
        } catch (D e6) {
            throw new IllegalArgumentException(e6);
        }
    }

    public abstract String A();

    public abstract int B();

    public abstract int C();

    public abstract long D();

    public boolean E() {
        C0773j jVar = (C0773j) this.f618b;
        if (!jVar.hasWindowFocus() || jVar.getWindowAttachCount() != this.f617a) {
            return false;
        }
        return true;
    }

    public ByteBuffer a(byte[] bArr, int i2) {
        int[] c3 = c(a.c(bArr), i2);
        int[] iArr = (int[]) c3.clone();
        a.b(iArr);
        for (int i5 = 0; i5 < c3.length; i5++) {
            c3[i5] = c3[i5] + iArr[i5];
        }
        ByteBuffer order = ByteBuffer.allocate(64).order(ByteOrder.LITTLE_ENDIAN);
        order.asIntBuffer().put(c3, 0, 16);
        return order;
    }

    public abstract void b(int i2);

    public abstract int[] c(int[] iArr, int i2);

    public abstract int f();

    public abstract boolean g();

    public abstract int i();

    public abstract void j(int i2);

    public void k(byte[] bArr, ByteBuffer byteBuffer, ByteBuffer byteBuffer2) {
        if (bArr.length == i()) {
            int remaining = byteBuffer2.remaining();
            int i2 = remaining / 64;
            int i5 = i2 + 1;
            for (int i6 = 0; i6 < i5; i6++) {
                ByteBuffer a6 = a(bArr, this.f617a + i6);
                if (i6 == i2) {
                    com.bumptech.glide.d.o1(byteBuffer, byteBuffer2, a6, remaining % 64);
                } else {
                    com.bumptech.glide.d.o1(byteBuffer, byteBuffer2, a6, 64);
                }
            }
            return;
        }
        throw new GeneralSecurityException("The nonce length (in bytes) must be " + i());
    }

    public abstract int l(int i2);

    public abstract boolean m();

    public abstract C0403h n();

    public abstract double o();

    public abstract int p();

    public abstract int q();

    public abstract long r();

    public abstract float s();

    public abstract int t();

    public abstract long u();

    public abstract int v();

    public abstract long w();

    public abstract int x();

    public abstract long y();

    public abstract String z();
}
