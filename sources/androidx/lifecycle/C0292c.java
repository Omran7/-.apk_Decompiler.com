package androidx.lifecycle;

import java.lang.reflect.Method;

/* renamed from: androidx.lifecycle.c  reason: case insensitive filesystem */
public final class C0292c {

    /* renamed from: a  reason: collision with root package name */
    public final int f5261a;

    /* renamed from: b  reason: collision with root package name */
    public final Method f5262b;

    public C0292c(int i2, Method method) {
        this.f5261a = i2;
        this.f5262b = method;
        method.setAccessible(true);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0292c)) {
            return false;
        }
        C0292c cVar = (C0292c) obj;
        if (this.f5261a != cVar.f5261a || !this.f5262b.getName().equals(cVar.f5262b.getName())) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.f5262b.getName().hashCode() + (this.f5261a * 31);
    }
}
