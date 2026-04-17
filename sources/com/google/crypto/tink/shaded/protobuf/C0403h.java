package com.google.crypto.tink.shaded.protobuf;

import h0.C0552a;
import java.util.Iterator;

/* renamed from: com.google.crypto.tink.shaded.protobuf.h  reason: case insensitive filesystem */
public class C0403h extends C0404i {
    public final byte[] d;

    public C0403h(byte[] bArr) {
        this.f6812a = 0;
        bArr.getClass();
        this.d = bArr;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0404i) || size() != ((C0404i) obj).size()) {
            return false;
        }
        if (size() == 0) {
            return true;
        }
        if (!(obj instanceof C0403h)) {
            return obj.equals(this);
        }
        C0403h hVar = (C0403h) obj;
        int i2 = this.f6812a;
        int i5 = hVar.f6812a;
        if (i2 != 0 && i5 != 0 && i2 != i5) {
            return false;
        }
        int size = size();
        if (size > hVar.size()) {
            throw new IllegalArgumentException("Length too large: " + size + size());
        } else if (size <= hVar.size()) {
            int y6 = y() + size;
            int y7 = y();
            int y8 = hVar.y();
            while (y7 < y6) {
                if (this.d[y7] != hVar.d[y8]) {
                    return false;
                }
                y7++;
                y8++;
            }
            return true;
        } else {
            StringBuilder s6 = C0552a.s(size, "Ran off end of other: 0, ", ", ");
            s6.append(hVar.size());
            throw new IllegalArgumentException(s6.toString());
        }
    }

    public final Iterator iterator() {
        return new C0400e(this);
    }

    public byte k(int i2) {
        return this.d[i2];
    }

    public int size() {
        return this.d.length;
    }

    public void w(byte[] bArr, int i2) {
        System.arraycopy(this.d, 0, bArr, 0, i2);
    }

    public int y() {
        return 0;
    }

    public byte z(int i2) {
        return this.d[i2];
    }
}
