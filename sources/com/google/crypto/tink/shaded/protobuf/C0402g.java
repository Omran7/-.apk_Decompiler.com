package com.google.crypto.tink.shaded.protobuf;

import com.google.android.gms.internal.measurement.a;
import h0.C0552a;

/* renamed from: com.google.crypto.tink.shaded.protobuf.g  reason: case insensitive filesystem */
public final class C0402g extends C0403h {

    /* renamed from: e  reason: collision with root package name */
    public final int f6803e;

    /* renamed from: f  reason: collision with root package name */
    public final int f6804f;

    public C0402g(byte[] bArr, int i2, int i5) {
        super(bArr);
        C0404i.t(i2, i2 + i5, bArr.length);
        this.f6803e = i2;
        this.f6804f = i5;
    }

    public final byte k(int i2) {
        int i5 = this.f6804f;
        if (((i5 - (i2 + 1)) | i2) >= 0) {
            return this.d[this.f6803e + i2];
        } else if (i2 < 0) {
            throw new ArrayIndexOutOfBoundsException(a.f(i2, "Index < 0: "));
        } else {
            throw new ArrayIndexOutOfBoundsException(C0552a.l("Index > length: ", i2, i5, ", "));
        }
    }

    public final int size() {
        return this.f6804f;
    }

    public final void w(byte[] bArr, int i2) {
        System.arraycopy(this.d, this.f6803e, bArr, 0, i2);
    }

    public final int y() {
        return this.f6803e;
    }

    public final byte z(int i2) {
        return this.d[this.f6803e + i2];
    }
}
