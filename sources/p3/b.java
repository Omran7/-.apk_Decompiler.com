package P3;

import X4.d;
import com.google.android.gms.common.internal.I;
import java.util.Arrays;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public String f2184a;

    public final boolean equals(Object obj) {
        if (!(obj instanceof b)) {
            return false;
        }
        return I.j(this.f2184a, ((b) obj).f2184a);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f2184a});
    }

    public final String toString() {
        d dVar = new d((Object) this);
        dVar.c(this.f2184a, "token");
        return dVar.toString();
    }
}
