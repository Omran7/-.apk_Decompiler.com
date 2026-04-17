package b4;

import java.io.Serializable;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.Objects;

/* renamed from: b4.c  reason: case insensitive filesystem */
public final class C0320c implements WildcardType, Serializable {

    /* renamed from: a  reason: collision with root package name */
    public final Type f5517a;

    /* renamed from: b  reason: collision with root package name */
    public final Type f5518b;

    public C0320c(Type[] typeArr, Type[] typeArr2) {
        boolean z3;
        boolean z4;
        boolean z5 = true;
        if (typeArr2.length <= 1) {
            z3 = true;
        } else {
            z3 = false;
        }
        C0321d.b(z3);
        if (typeArr.length == 1) {
            z4 = true;
        } else {
            z4 = false;
        }
        C0321d.b(z4);
        if (typeArr2.length == 1) {
            Objects.requireNonNull(typeArr2[0]);
            C0321d.c(typeArr2[0]);
            Class<Object> cls = Object.class;
            C0321d.b(typeArr[0] != cls ? false : z5);
            this.f5518b = C0321d.a(typeArr2[0]);
            this.f5517a = cls;
            return;
        }
        Objects.requireNonNull(typeArr[0]);
        C0321d.c(typeArr[0]);
        this.f5518b = null;
        this.f5517a = C0321d.a(typeArr[0]);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof WildcardType) || !C0321d.d(this, (WildcardType) obj)) {
            return false;
        }
        return true;
    }

    public final Type[] getLowerBounds() {
        Type type = this.f5518b;
        if (type == null) {
            return C0321d.f5519a;
        }
        return new Type[]{type};
    }

    public final Type[] getUpperBounds() {
        return new Type[]{this.f5517a};
    }

    public final int hashCode() {
        int i2;
        Type type = this.f5518b;
        if (type != null) {
            i2 = type.hashCode() + 31;
        } else {
            i2 = 1;
        }
        return i2 ^ (this.f5517a.hashCode() + 31);
    }

    public final String toString() {
        Type type = this.f5518b;
        if (type != null) {
            return "? super " + C0321d.i(type);
        }
        Class<Object> cls = Object.class;
        Type type2 = this.f5517a;
        if (type2 == cls) {
            return "?";
        }
        return "? extends " + C0321d.i(type2);
    }
}
