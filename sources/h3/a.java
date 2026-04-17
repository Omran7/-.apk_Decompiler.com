package H3;

import java.util.ArrayList;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final String f1002a;

    /* renamed from: b  reason: collision with root package name */
    public final ArrayList f1003b;

    public a(String str, ArrayList arrayList) {
        if (str != null) {
            this.f1002a = str;
            this.f1003b = arrayList;
            return;
        }
        throw new NullPointerException("Null userAgent");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        if (!this.f1002a.equals(aVar.f1002a) || !this.f1003b.equals(aVar.f1003b)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((this.f1002a.hashCode() ^ 1000003) * 1000003) ^ this.f1003b.hashCode();
    }

    public final String toString() {
        return "HeartBeatResult{userAgent=" + this.f1002a + ", usedDates=" + this.f1003b + "}";
    }
}
