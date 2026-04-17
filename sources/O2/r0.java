package O2;

import com.google.crypto.tink.shaded.protobuf.C0420z;

public enum r0 implements C0420z {
    UNKNOWN_PREFIX(0),
    TINK(1),
    LEGACY(2),
    RAW(3),
    CRUNCHY(4),
    UNRECOGNIZED(-1);
    

    /* renamed from: a  reason: collision with root package name */
    public final int f2109a;

    /* access modifiers changed from: public */
    r0(int i2) {
        this.f2109a = i2;
    }

    public static r0 a(int i2) {
        if (i2 == 0) {
            return UNKNOWN_PREFIX;
        }
        if (i2 == 1) {
            return TINK;
        }
        if (i2 == 2) {
            return LEGACY;
        }
        if (i2 == 3) {
            return RAW;
        }
        if (i2 != 4) {
            return null;
        }
        return CRUNCHY;
    }

    public final int e() {
        if (this != UNRECOGNIZED) {
            return this.f2109a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
