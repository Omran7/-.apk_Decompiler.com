package G5;

import kotlin.jvm.internal.j;
import x5.l;

/* renamed from: G5.v  reason: case insensitive filesystem */
public final class C0049v {

    /* renamed from: a  reason: collision with root package name */
    public final Object f952a;

    /* renamed from: b  reason: collision with root package name */
    public final l f953b;

    public C0049v(Object obj, l lVar) {
        this.f952a = obj;
        this.f953b = lVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0049v)) {
            return false;
        }
        C0049v vVar = (C0049v) obj;
        if (j.a(this.f952a, vVar.f952a) && j.a(this.f953b, vVar.f953b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i2;
        Object obj = this.f952a;
        if (obj == null) {
            i2 = 0;
        } else {
            i2 = obj.hashCode();
        }
        return this.f953b.hashCode() + (i2 * 31);
    }

    public final String toString() {
        return "CompletedWithCancellation(result=" + this.f952a + ", onCancellation=" + this.f953b + ')';
    }
}
