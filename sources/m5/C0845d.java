package m5;

import java.io.Serializable;
import kotlin.jvm.internal.j;

/* renamed from: m5.d  reason: case insensitive filesystem */
public final class C0845d implements Serializable {

    /* renamed from: a  reason: collision with root package name */
    public final Object f10195a;

    /* renamed from: b  reason: collision with root package name */
    public final Object f10196b;

    public C0845d(Object obj, Object obj2) {
        this.f10195a = obj;
        this.f10196b = obj2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0845d)) {
            return false;
        }
        C0845d dVar = (C0845d) obj;
        if (j.a(this.f10195a, dVar.f10195a) && j.a(this.f10196b, dVar.f10196b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i2;
        int i5 = 0;
        Object obj = this.f10195a;
        if (obj == null) {
            i2 = 0;
        } else {
            i2 = obj.hashCode();
        }
        int i6 = i2 * 31;
        Object obj2 = this.f10196b;
        if (obj2 != null) {
            i5 = obj2.hashCode();
        }
        return i6 + i5;
    }

    public final String toString() {
        return "(" + this.f10195a + ", " + this.f10196b + ')';
    }
}
