package W0;

import kotlin.jvm.internal.j;

public final class v {

    /* renamed from: a  reason: collision with root package name */
    public final w f3981a;

    public v(w wVar) {
        this.f3981a = wVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v)) {
            return false;
        }
        v vVar = (v) obj;
        vVar.getClass();
        if (j.a((Object) null, (Object) null) && this.f3981a.equals(vVar.f3981a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f3981a.hashCode();
    }

    public final String toString() {
        return "CropImageContractOptions(uri=null, cropImageOptions=" + this.f3981a + ")";
    }
}
