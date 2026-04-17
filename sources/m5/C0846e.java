package m5;

import java.io.Serializable;
import kotlin.jvm.internal.j;

/* renamed from: m5.e  reason: case insensitive filesystem */
public final class C0846e implements Serializable {

    /* renamed from: a  reason: collision with root package name */
    public final Throwable f10197a;

    public C0846e(Throwable th) {
        j.e(th, "exception");
        this.f10197a = th;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C0846e) {
            if (j.a(this.f10197a, ((C0846e) obj).f10197a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f10197a.hashCode();
    }

    public final String toString() {
        return "Failure(" + this.f10197a + ')';
    }
}
