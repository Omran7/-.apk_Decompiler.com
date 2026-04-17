package kotlin.jvm.internal;

import D5.b;
import D5.e;

public abstract class h extends c implements g, e {
    private final int arity;
    private final int flags;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public h(int r9, java.lang.Object r10, java.lang.Class r11, java.lang.String r12, java.lang.String r13, int r14) {
        /*
            r8 = this;
            r0 = 1
            r14 = r14 & r0
            r1 = 0
            if (r14 != r0) goto L_0x0007
            r7 = r0
            goto L_0x0008
        L_0x0007:
            r7 = r1
        L_0x0008:
            r2 = r8
            r3 = r10
            r4 = r11
            r5 = r12
            r6 = r13
            r2.<init>(r3, r4, r5, r6, r7)
            r8.arity = r9
            r8.flags = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.h.<init>(int, java.lang.Object, java.lang.Class, java.lang.String, java.lang.String, int):void");
    }

    public b computeReflected() {
        n.f9657a.getClass();
        return this;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof h) {
            h hVar = (h) obj;
            if (!getName().equals(hVar.getName()) || !getSignature().equals(hVar.getSignature()) || this.flags != hVar.flags || this.arity != hVar.arity || !j.a(getBoundReceiver(), hVar.getBoundReceiver()) || !j.a(getOwner(), hVar.getOwner())) {
                return false;
            }
            return true;
        } else if (obj instanceof e) {
            return obj.equals(compute());
        } else {
            return false;
        }
    }

    public int getArity() {
        return this.arity;
    }

    public int hashCode() {
        int i2;
        if (getOwner() == null) {
            i2 = 0;
        } else {
            i2 = getOwner().hashCode() * 31;
        }
        return getSignature().hashCode() + ((getName().hashCode() + i2) * 31);
    }

    public boolean isExternal() {
        return getReflected().isExternal();
    }

    public boolean isInfix() {
        return getReflected().isInfix();
    }

    public boolean isInline() {
        return getReflected().isInline();
    }

    public boolean isOperator() {
        return getReflected().isOperator();
    }

    public boolean isSuspend() {
        return getReflected().isSuspend();
    }

    public String toString() {
        b compute = compute();
        if (compute != this) {
            return compute.toString();
        }
        if ("<init>".equals(getName())) {
            return "constructor (Kotlin reflection is not available)";
        }
        return "function " + getName() + " (Kotlin reflection is not available)";
    }

    public e getReflected() {
        b compute = compute();
        if (compute != this) {
            return (e) compute;
        }
        throw new Error("Kotlin reflection implementation is not found at runtime. Make sure you have kotlin-reflect.jar in the classpath");
    }
}
