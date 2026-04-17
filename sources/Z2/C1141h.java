package z2;

import java.io.Serializable;
import java.util.Arrays;

/* renamed from: z2.h  reason: case insensitive filesystem */
public final class C1141h implements C1138e, Serializable {

    /* renamed from: a  reason: collision with root package name */
    public final Object f12862a;

    public C1141h(Object obj) {
        this.f12862a = obj;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C1141h)) {
            return false;
        }
        Object obj2 = this.f12862a;
        Object obj3 = ((C1141h) obj).f12862a;
        if (obj2 == obj3 || obj2.equals(obj3)) {
            return true;
        }
        return false;
    }

    public final Object get() {
        return this.f12862a;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f12862a});
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f12862a);
        StringBuilder sb = new StringBuilder(valueOf.length() + 22);
        sb.append("Suppliers.ofInstance(");
        sb.append(valueOf);
        sb.append(")");
        return sb.toString();
    }
}
