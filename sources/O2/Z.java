package O2;

import com.google.crypto.tink.shaded.protobuf.C0420z;

public enum Z implements C0420z {
    UNKNOWN_STATUS(0),
    ENABLED(1),
    DISABLED(2),
    DESTROYED(3),
    UNRECOGNIZED(-1);
    

    /* renamed from: a  reason: collision with root package name */
    public final int f2102a;

    /* access modifiers changed from: public */
    Z(int i2) {
        this.f2102a = i2;
    }

    public final int a() {
        if (this != UNRECOGNIZED) {
            return this.f2102a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
