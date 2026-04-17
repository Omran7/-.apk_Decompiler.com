package kotlin.jvm.internal;

import java.io.Serializable;

public abstract class k implements g, Serializable {
    private final int arity;

    public k(int i2) {
        this.arity = i2;
    }

    public int getArity() {
        return this.arity;
    }

    public String toString() {
        n.f9657a.getClass();
        String a6 = o.a(this);
        j.d(a6, "renderLambdaToString(...)");
        return a6;
    }
}
