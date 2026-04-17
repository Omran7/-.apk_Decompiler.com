package g4;

import b4.C0321d;
import java.lang.reflect.Type;
import java.util.Objects;

/* renamed from: g4.a  reason: case insensitive filesystem */
public final class C0551a {

    /* renamed from: a  reason: collision with root package name */
    public final Class f8044a;

    /* renamed from: b  reason: collision with root package name */
    public final Type f8045b;

    /* renamed from: c  reason: collision with root package name */
    public final int f8046c;

    public C0551a(Type type) {
        Objects.requireNonNull(type);
        Type a6 = C0321d.a(type);
        this.f8045b = a6;
        this.f8044a = C0321d.g(a6);
        this.f8046c = a6.hashCode();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C0551a) {
            if (C0321d.d(this.f8045b, ((C0551a) obj).f8045b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f8046c;
    }

    public final String toString() {
        return C0321d.i(this.f8045b);
    }
}
