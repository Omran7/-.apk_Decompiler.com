package com.google.crypto.tink.shaded.protobuf;

import q.C0928e;

/* renamed from: com.google.crypto.tink.shaded.protobuf.s  reason: case insensitive filesystem */
public enum C0413s {
    DOUBLE_LIST_PACKED(35, 3, r47),
    SINT64_LIST_PACKED(48, 3, r55);
    
    public static final C0413s[] d = null;

    /* renamed from: a  reason: collision with root package name */
    public final int f6854a;

    static {
        C0413s[] values = values();
        d = new C0413s[values.length];
        for (C0413s sVar : values) {
            d[sVar.f6854a] = sVar;
        }
    }

    /* access modifiers changed from: public */
    C0413s(int i2, int i5, E e6) {
        this.f6854a = i2;
        int c3 = C0928e.c(i5);
        if (c3 == 1) {
            e6.getClass();
        } else if (c3 == 3) {
            e6.getClass();
        }
        if (i5 == 1) {
            e6.ordinal();
        }
    }

    public final int a() {
        return this.f6854a;
    }
}
