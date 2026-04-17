package com.google.android.gms.internal.p002firebaseauthapi;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzanw  reason: invalid package */
public enum zzanw {
    DOUBLE(zzaod.DOUBLE, 1),
    FLOAT(zzaod.FLOAT, 5),
    INT64(r5, 0),
    UINT64(r5, 0),
    INT32(r11, 0),
    FIXED64(r5, 1),
    FIXED32(r11, 5),
    BOOL(zzaod.BOOLEAN, 0),
    STRING(zzaod.STRING, (zzaod) null),
    GROUP(r19, (zzaod) null),
    MESSAGE(r19, (zzaod) null),
    BYTES(zzaod.BYTE_STRING, (zzaod) null),
    UINT32(r11, 0),
    ENUM(zzaod.ENUM, 0),
    SFIXED32(r11, 5),
    SFIXED64(r5, 1),
    SINT32(r11, 0),
    SINT64(r5, 0);
    
    private final zzaod zzt;
    private final int zzu;

    public final int zza() {
        return this.zzu;
    }

    public final zzaod zzb() {
        return this.zzt;
    }

    private zzanw(zzaod zzaod, int i2) {
        this.zzt = zzaod;
        this.zzu = i2;
    }
}
