package B0;

import Q0.f;
import java.util.concurrent.Executor;

public final class s {

    /* renamed from: a  reason: collision with root package name */
    public final f f295a;

    /* renamed from: b  reason: collision with root package name */
    public final Executor f296b;

    public s(f fVar, Executor executor) {
        this.f295a = fVar;
        this.f296b = executor;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof s) {
            return this.f295a.equals(((s) obj).f295a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f295a.hashCode();
    }
}
