package com.google.android.recaptcha.internal;

public enum zzpw {
    DOUBLE(zzpx.DOUBLE, 1),
    FLOAT(zzpx.FLOAT, 5),
    INT64(r12, 0),
    UINT64(r12, 0),
    INT32(r9, 0),
    FIXED64(r12, 1),
    FIXED32(r9, 5),
    BOOL(zzpx.BOOLEAN, 0),
    STRING(zzpx.STRING, 2),
    GROUP(r13, 3),
    MESSAGE(r13, 2),
    BYTES(zzpx.BYTE_STRING, 2),
    UINT32(r15, 0),
    ENUM(zzpx.ENUM, 0),
    SFIXED32(r15, 5),
    SFIXED64(r1, 1),
    SINT32(r3, 0),
    SINT64(r1, 0);
    
    private final zzpx zzt;

    private zzpw(zzpx zzpx, int i2) {
        this.zzt = zzpx;
    }

    public final zzpx zza() {
        return this.zzt;
    }
}
