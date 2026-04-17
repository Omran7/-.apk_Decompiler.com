package b4;

import java.io.Serializable;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.Objects;

/* renamed from: b4.b  reason: case insensitive filesystem */
public final class C0319b implements ParameterizedType, Serializable {

    /* renamed from: a  reason: collision with root package name */
    public final Type f5514a;

    /* renamed from: b  reason: collision with root package name */
    public final Type f5515b;

    /* renamed from: c  reason: collision with root package name */
    public final Type[] f5516c;

    public C0319b(Type type, Type type2, Type... typeArr) {
        Type type3;
        boolean z3;
        Objects.requireNonNull(type2);
        if (type2 instanceof Class) {
            Class cls = (Class) type2;
            boolean z4 = true;
            if (Modifier.isStatic(cls.getModifiers()) || cls.getEnclosingClass() == null) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (type == null && !z3) {
                z4 = false;
            }
            C0321d.b(z4);
        }
        if (type == null) {
            type3 = null;
        } else {
            type3 = C0321d.a(type);
        }
        this.f5514a = type3;
        this.f5515b = C0321d.a(type2);
        Type[] typeArr2 = (Type[]) typeArr.clone();
        this.f5516c = typeArr2;
        int length = typeArr2.length;
        for (int i2 = 0; i2 < length; i2++) {
            Objects.requireNonNull(this.f5516c[i2]);
            C0321d.c(this.f5516c[i2]);
            Type[] typeArr3 = this.f5516c;
            typeArr3[i2] = C0321d.a(typeArr3[i2]);
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ParameterizedType) || !C0321d.d(this, (ParameterizedType) obj)) {
            return false;
        }
        return true;
    }

    public final Type[] getActualTypeArguments() {
        return (Type[]) this.f5516c.clone();
    }

    public final Type getOwnerType() {
        return this.f5514a;
    }

    public final Type getRawType() {
        return this.f5515b;
    }

    public final int hashCode() {
        int i2;
        int hashCode = Arrays.hashCode(this.f5516c) ^ this.f5515b.hashCode();
        Type type = this.f5514a;
        if (type != null) {
            i2 = type.hashCode();
        } else {
            i2 = 0;
        }
        return hashCode ^ i2;
    }

    public final String toString() {
        Type[] typeArr = this.f5516c;
        int length = typeArr.length;
        Type type = this.f5515b;
        if (length == 0) {
            return C0321d.i(type);
        }
        StringBuilder sb = new StringBuilder((length + 1) * 30);
        sb.append(C0321d.i(type));
        sb.append("<");
        sb.append(C0321d.i(typeArr[0]));
        for (int i2 = 1; i2 < length; i2++) {
            sb.append(", ");
            sb.append(C0321d.i(typeArr[i2]));
        }
        sb.append(">");
        return sb.toString();
    }
}
