package com.google.crypto.tink.shaded.protobuf;

/* renamed from: com.google.crypto.tink.shaded.protobuf.u  reason: case insensitive filesystem */
public final class C0415u implements Q {

    /* renamed from: b  reason: collision with root package name */
    public static final C0415u f6856b = new C0415u(0);

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f6857a;

    public /* synthetic */ C0415u(int i2) {
        this.f6857a = i2;
    }

    public final c0 a(Class cls) {
        switch (this.f6857a) {
            case 0:
                Class<C0418x> cls2 = C0418x.class;
                if (cls2.isAssignableFrom(cls)) {
                    try {
                        return (c0) C0418x.l(cls.asSubclass(cls2)).k(3);
                    } catch (Exception e6) {
                        throw new RuntimeException("Unable to get message info for ".concat(cls.getName()), e6);
                    }
                } else {
                    throw new IllegalArgumentException("Unsupported message type: ".concat(cls.getName()));
                }
            default:
                throw new IllegalStateException("This should never be called.");
        }
    }

    public final boolean b(Class cls) {
        switch (this.f6857a) {
            case 0:
                return C0418x.class.isAssignableFrom(cls);
            default:
                return false;
        }
    }
}
