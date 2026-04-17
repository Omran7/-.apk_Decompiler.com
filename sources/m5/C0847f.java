package m5;

import java.io.Serializable;
import kotlin.jvm.internal.j;

/* renamed from: m5.f  reason: case insensitive filesystem */
public final class C0847f implements Serializable {

    /* renamed from: a  reason: collision with root package name */
    public final Object f10198a;

    public /* synthetic */ C0847f(Object obj) {
        this.f10198a = obj;
    }

    public static final Throwable a(Object obj) {
        if (obj instanceof C0846e) {
            return ((C0846e) obj).f10197a;
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C0847f)) {
            return false;
        }
        if (!j.a(this.f10198a, ((C0847f) obj).f10198a)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        Object obj = this.f10198a;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final String toString() {
        Object obj = this.f10198a;
        if (obj instanceof C0846e) {
            return obj.toString();
        }
        return "Success(" + obj + ')';
    }
}
