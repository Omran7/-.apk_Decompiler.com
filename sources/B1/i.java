package b1;

import java.util.ArrayList;

public final class i extends o {

    /* renamed from: a  reason: collision with root package name */
    public final ArrayList f5487a;

    public i(ArrayList arrayList) {
        this.f5487a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        return this.f5487a.equals(((i) ((o) obj)).f5487a);
    }

    public final int hashCode() {
        return this.f5487a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "BatchedLogRequest{logRequests=" + this.f5487a + "}";
    }
}
