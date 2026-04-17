package q5;

import kotlin.jvm.internal.n;
import kotlin.jvm.internal.o;
import o5.d;
import o5.i;
import o5.j;

public abstract class g extends a implements kotlin.jvm.internal.g {

    /* renamed from: a  reason: collision with root package name */
    public final int f11125a;

    public g(d dVar) {
        super(dVar);
        if (dVar == null || dVar.getContext() == j.f10479a) {
            this.f11125a = 2;
            return;
        }
        throw new IllegalArgumentException("Coroutines with restricted suspension must have EmptyCoroutineContext");
    }

    public final int getArity() {
        return this.f11125a;
    }

    public final i getContext() {
        return j.f10479a;
    }

    public final String toString() {
        if (getCompletion() != null) {
            return super.toString();
        }
        n.f9657a.getClass();
        String a6 = o.a(this);
        kotlin.jvm.internal.j.d(a6, "renderLambdaToString(...)");
        return a6;
    }
}
