package O2;

import com.google.crypto.tink.shaded.protobuf.C0420z;

public enum X implements C0420z {
    UNKNOWN_KEYMATERIAL(0),
    SYMMETRIC(1),
    ASYMMETRIC_PRIVATE(2),
    ASYMMETRIC_PUBLIC(3),
    REMOTE(4),
    UNRECOGNIZED(-1);
    

    /* renamed from: a  reason: collision with root package name */
    public final int f2096a;

    /* access modifiers changed from: public */
    X(int i2) {
        this.f2096a = i2;
    }
}
