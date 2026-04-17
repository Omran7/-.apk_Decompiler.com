package b4;

import java.io.Serializable;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import java.util.Objects;

/* renamed from: b4.a  reason: case insensitive filesystem */
public final class C0318a implements GenericArrayType, Serializable {

    /* renamed from: a  reason: collision with root package name */
    public final Type f5513a;

    public C0318a(Type type) {
        Objects.requireNonNull(type);
        this.f5513a = C0321d.a(type);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof GenericArrayType) || !C0321d.d(this, (GenericArrayType) obj)) {
            return false;
        }
        return true;
    }

    public final Type getGenericComponentType() {
        return this.f5513a;
    }

    public final int hashCode() {
        return this.f5513a.hashCode();
    }

    public final String toString() {
        return C0321d.i(this.f5513a) + "[]";
    }
}
