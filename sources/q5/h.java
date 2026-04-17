package q5;

import kotlin.jvm.internal.g;
import kotlin.jvm.internal.j;
import kotlin.jvm.internal.n;
import kotlin.jvm.internal.o;
import o5.d;

public abstract class h extends c implements g {
    private final int arity;

    public h(int i2, d dVar) {
        super(dVar);
        this.arity = i2;
    }

    public int getArity() {
        return this.arity;
    }

    public String toString() {
        if (getCompletion() != null) {
            return super.toString();
        }
        n.f9657a.getClass();
        String a6 = o.a(this);
        j.d(a6, "renderLambdaToString(...)");
        return a6;
    }
}
