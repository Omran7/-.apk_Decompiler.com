package com.google.crypto.tink.shaded.protobuf;

public final class c0 {

    /* renamed from: a  reason: collision with root package name */
    public final C0396a f6793a;

    /* renamed from: b  reason: collision with root package name */
    public final String f6794b;

    /* renamed from: c  reason: collision with root package name */
    public final Object[] f6795c;
    public final int d;

    public c0(C0396a aVar, String str, Object[] objArr) {
        this.f6793a = aVar;
        this.f6794b = str;
        this.f6795c = objArr;
        char charAt = str.charAt(0);
        if (charAt < 55296) {
            this.d = charAt;
            return;
        }
        char c3 = charAt & 8191;
        int i2 = 1;
        int i5 = 13;
        while (true) {
            int i6 = i2 + 1;
            char charAt2 = str.charAt(i2);
            if (charAt2 >= 55296) {
                c3 |= (charAt2 & 8191) << i5;
                i5 += 13;
                i2 = i6;
            } else {
                this.d = c3 | (charAt2 << i5);
                return;
            }
        }
    }

    public final C0396a a() {
        return this.f6793a;
    }

    public final Object[] b() {
        return this.f6795c;
    }

    public final String c() {
        return this.f6794b;
    }

    public final int d() {
        if ((this.d & 1) == 1) {
            return 1;
        }
        return 2;
    }
}
