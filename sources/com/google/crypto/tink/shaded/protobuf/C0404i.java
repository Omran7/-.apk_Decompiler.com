package com.google.crypto.tink.shaded.protobuf;

import K1.e;
import h0.C0552a;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Locale;

/* renamed from: com.google.crypto.tink.shaded.protobuf.i  reason: case insensitive filesystem */
public abstract class C0404i implements Iterable, Serializable {

    /* renamed from: b  reason: collision with root package name */
    public static final C0403h f6810b = new C0403h(B.f6743b);

    /* renamed from: c  reason: collision with root package name */
    public static final C0401f f6811c;

    /* renamed from: a  reason: collision with root package name */
    public int f6812a;

    static {
        C0401f fVar;
        if (C0398c.a()) {
            fVar = new C0401f(1);
        } else {
            fVar = new C0401f(0);
        }
        f6811c = fVar;
    }

    public static int t(int i2, int i5, int i6) {
        int i7 = i5 - i2;
        if ((i2 | i5 | i7 | (i6 - i5)) >= 0) {
            return i7;
        }
        if (i2 < 0) {
            throw new IndexOutOfBoundsException(C0552a.k(i2, "Beginning index: ", " < 0"));
        } else if (i5 < i2) {
            throw new IndexOutOfBoundsException(C0552a.l("Beginning index larger than ending index: ", i2, i5, ", "));
        } else {
            throw new IndexOutOfBoundsException(C0552a.l("End index: ", i5, i6, " >= "));
        }
    }

    public static C0403h v(byte[] bArr, int i2, int i5) {
        byte[] bArr2;
        t(i2, i2 + i5, bArr.length);
        switch (f6811c.f6802a) {
            case 0:
                bArr2 = Arrays.copyOfRange(bArr, i2, i5 + i2);
                break;
            default:
                bArr2 = new byte[i5];
                System.arraycopy(bArr, i2, bArr2, 0, i5);
                break;
        }
        return new C0403h(bArr2);
    }

    public final int hashCode() {
        int i2 = this.f6812a;
        if (i2 == 0) {
            int size = size();
            C0403h hVar = (C0403h) this;
            int y6 = hVar.y();
            int i5 = size;
            for (int i6 = y6; i6 < y6 + size; i6++) {
                i5 = (i5 * 31) + hVar.d[i6];
            }
            if (i5 == 0) {
                i2 = 1;
            } else {
                i2 = i5;
            }
            this.f6812a = i2;
        }
        return i2;
    }

    public abstract byte k(int i2);

    public abstract int size();

    public final String toString() {
        String str;
        C0403h hVar;
        Locale locale = Locale.ROOT;
        String hexString = Integer.toHexString(System.identityHashCode(this));
        int size = size();
        if (size() <= 50) {
            str = e.n(this);
        } else {
            StringBuilder sb = new StringBuilder();
            C0403h hVar2 = (C0403h) this;
            int t6 = t(0, 47, hVar2.size());
            if (t6 == 0) {
                hVar = f6810b;
            } else {
                hVar = new C0402g(hVar2.d, hVar2.y(), t6);
            }
            sb.append(e.n(hVar));
            sb.append("...");
            str = sb.toString();
        }
        StringBuilder sb2 = new StringBuilder("<ByteString@");
        sb2.append(hexString);
        sb2.append(" size=");
        sb2.append(size);
        sb2.append(" contents=\"");
        return C0552a.r(sb2, str, "\">");
    }

    public abstract void w(byte[] bArr, int i2);

    public final byte[] x() {
        int size = size();
        if (size == 0) {
            return B.f6743b;
        }
        byte[] bArr = new byte[size];
        w(bArr, size);
        return bArr;
    }
}
