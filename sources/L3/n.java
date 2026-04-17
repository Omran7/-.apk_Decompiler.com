package l3;

import R2.b;
import java.util.ArrayList;
import java.util.HashMap;

public final class n {

    /* renamed from: a  reason: collision with root package name */
    public final ArrayList f9699a;

    /* renamed from: b  reason: collision with root package name */
    public final HashMap f9700b;

    public n(ArrayList arrayList, HashMap hashMap) {
        this.f9699a = arrayList;
        this.f9700b = hashMap;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        if (!this.f9699a.equals(nVar.f9699a)) {
            return false;
        }
        return this.f9700b.equals(nVar.f9700b);
    }

    public final int hashCode() {
        return this.f9700b.hashCode() + (this.f9699a.hashCode() * 31);
    }

    public final String toString() {
        return b.u0(this.f9699a) + " (params: " + this.f9700b + ")";
    }
}
