package com.google.crypto.tink.shaded.protobuf;

import java.io.Serializable;

public enum E {
    VOID(Void.class, (int) null),
    INT(r6, 0),
    LONG(Long.class, 0L),
    FLOAT(Float.class, Float.valueOf(0.0f)),
    DOUBLE(Double.class, Double.valueOf(0.0d)),
    BOOLEAN(Boolean.class, Boolean.FALSE),
    STRING(String.class, ""),
    BYTE_STRING(C0404i.class, C0404i.f6810b),
    ENUM(r6, (int) null),
    MESSAGE(Object.class, (int) null);

    /* access modifiers changed from: public */
    E(Class cls, Serializable serializable) {
    }
}
