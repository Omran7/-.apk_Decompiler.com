package com.bumptech.glide.load;

import z0.C1127c;

public enum ImageHeaderParser$ImageType {
    GIF(true),
    JPEG(false),
    RAW(false),
    PNG_A(true),
    PNG(false),
    WEBP_A(true),
    WEBP(false),
    ANIMATED_WEBP(true),
    AVIF(true),
    ANIMATED_AVIF(true),
    UNKNOWN(false);
    

    /* renamed from: a  reason: collision with root package name */
    public final boolean f5803a;

    /* access modifiers changed from: public */
    ImageHeaderParser$ImageType(boolean z3) {
        this.f5803a = z3;
    }

    public boolean hasAlpha() {
        return this.f5803a;
    }

    public boolean isWebp() {
        int i2 = C1127c.f12788a[ordinal()];
        if (i2 == 1 || i2 == 2 || i2 == 3) {
            return true;
        }
        return false;
    }
}
