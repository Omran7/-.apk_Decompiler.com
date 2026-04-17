package com.google.crypto.tink.shaded.protobuf;

public final class L implements Q {

    /* renamed from: a  reason: collision with root package name */
    public Q[] f6759a;

    public final c0 a(Class cls) {
        for (Q q6 : this.f6759a) {
            if (q6.b(cls)) {
                return q6.a(cls);
            }
        }
        throw new UnsupportedOperationException("No factory is available for message type: ".concat(cls.getName()));
    }

    public final boolean b(Class cls) {
        for (Q b6 : this.f6759a) {
            if (b6.b(cls)) {
                return true;
            }
        }
        return false;
    }
}
