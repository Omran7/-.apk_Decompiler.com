package O2;

import com.google.crypto.tink.shaded.protobuf.C0420z;

public enum O implements C0420z {
    UNKNOWN_HASH(0),
    SHA1(1),
    SHA384(2),
    SHA256(3),
    SHA512(4),
    SHA224(5),
    UNRECOGNIZED(-1);
    

    /* renamed from: a  reason: collision with root package name */
    public final int f2089a;

    /* access modifiers changed from: public */
    O(int i2) {
        this.f2089a = i2;
    }

    public final int a() {
        if (this != UNRECOGNIZED) {
            return this.f2089a;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
