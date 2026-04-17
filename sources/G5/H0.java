package G5;

import I5.a;
import I5.s;
import m5.C0845d;
import o5.d;
import o5.i;

public final class H0 extends s {

    /* renamed from: e  reason: collision with root package name */
    public final ThreadLocal f873e;
    private volatile boolean threadLocalIsSet;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public H0(o5.i r3, o5.d r4) {
        /*
            r2 = this;
            G5.I0 r0 = G5.I0.f874a
            o5.g r1 = r3.get(r0)
            if (r1 != 0) goto L_0x000d
            o5.i r0 = r3.plus(r0)
            goto L_0x000e
        L_0x000d:
            r0 = r3
        L_0x000e:
            r2.<init>(r0, r4)
            java.lang.ThreadLocal r0 = new java.lang.ThreadLocal
            r0.<init>()
            r2.f873e = r0
            o5.i r4 = r4.getContext()
            o5.e r0 = o5.e.f10478a
            o5.g r4 = r4.get(r0)
            boolean r4 = r4 instanceof G5.A
            if (r4 != 0) goto L_0x0031
            r4 = 0
            java.lang.Object r4 = I5.a.i(r3, r4)
            I5.a.d(r3, r4)
            r2.N(r3, r4)
        L_0x0031:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: G5.H0.<init>(o5.i, o5.d):void");
    }

    public final boolean M() {
        boolean z3;
        if (!this.threadLocalIsSet || this.f873e.get() != null) {
            z3 = false;
        } else {
            z3 = true;
        }
        this.f873e.remove();
        return !z3;
    }

    public final void N(i iVar, Object obj) {
        this.threadLocalIsSet = true;
        this.f873e.set(new C0845d(iVar, obj));
    }

    public final void g(Object obj) {
        if (this.threadLocalIsSet) {
            C0845d dVar = (C0845d) this.f873e.get();
            if (dVar != null) {
                a.d((i) dVar.f10195a, dVar.f10196b);
            }
            this.f873e.remove();
        }
        Object r6 = F.r(obj);
        d dVar2 = this.d;
        i context = dVar2.getContext();
        H0 h02 = null;
        Object i2 = a.i(context, h02);
        if (i2 != a.f1248f) {
            h02 = F.v(dVar2, context, i2);
        }
        try {
            this.d.resumeWith(r6);
        } finally {
            if (h02 == null || h02.M()) {
                a.d(context, i2);
            }
        }
    }
}
