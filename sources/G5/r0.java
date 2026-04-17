package G5;

import E5.e;
import I5.k;
import m5.C0849h;
import o5.d;
import q5.g;
import x5.p;

public final class r0 extends g implements p {

    /* renamed from: b  reason: collision with root package name */
    public w0 f939b;

    /* renamed from: c  reason: collision with root package name */
    public k f940c;
    public int d;

    /* renamed from: e  reason: collision with root package name */
    public /* synthetic */ Object f941e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ v0 f942f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public r0(v0 v0Var, d dVar) {
        super(dVar);
        this.f942f = v0Var;
    }

    public final d create(Object obj, d dVar) {
        r0 r0Var = new r0(this.f942f, dVar);
        r0Var.f941e = obj;
        return r0Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((r0) create((e) obj, (d) obj2)).invokeSuspend(C0849h.f10203c);
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x0060  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            p5.a r0 = p5.a.f11033a
            int r1 = r6.d
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L_0x0024
            if (r1 == r3) goto L_0x0020
            if (r1 != r2) goto L_0x0018
            I5.k r1 = r6.f940c
            G5.w0 r3 = r6.f939b
            java.lang.Object r4 = r6.f941e
            E5.e r4 = (E5.e) r4
            I1.b.I0(r7)
            goto L_0x0077
        L_0x0018:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L_0x0020:
            I1.b.I0(r7)
            goto L_0x007c
        L_0x0024:
            I1.b.I0(r7)
            java.lang.Object r7 = r6.f941e
            E5.e r7 = (E5.e) r7
            G5.v0 r1 = r6.f942f
            java.lang.Object r1 = r1.u()
            boolean r4 = r1 instanceof G5.C0044p
            if (r4 == 0) goto L_0x003f
            G5.p r1 = (G5.C0044p) r1
            G5.q r1 = r1.f932e
            r6.d = r3
            r7.e(r1, r6)
            return r0
        L_0x003f:
            boolean r3 = r1 instanceof G5.C0024c0
            if (r3 == 0) goto L_0x007c
            G5.c0 r1 = (G5.C0024c0) r1
            G5.w0 r1 = r1.b()
            if (r1 == 0) goto L_0x007c
            java.lang.Object r3 = r1.f()
            java.lang.String r4 = "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }"
            kotlin.jvm.internal.j.c(r3, r4)
            I5.k r3 = (I5.k) r3
            r4 = r7
            r5 = r3
            r3 = r1
            r1 = r5
        L_0x005a:
            boolean r7 = r1.equals(r3)
            if (r7 != 0) goto L_0x007c
            boolean r7 = r1 instanceof G5.C0044p
            if (r7 == 0) goto L_0x0077
            r7 = r1
            G5.p r7 = (G5.C0044p) r7
            r6.f941e = r4
            r6.f939b = r3
            r6.f940c = r1
            r6.d = r2
            G5.q r7 = r7.f932e
            r4.e(r7, r6)
            p5.a r7 = p5.a.f11033a
            return r0
        L_0x0077:
            I5.k r1 = r1.g()
            goto L_0x005a
        L_0x007c:
            m5.h r7 = m5.C0849h.f10203c
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: G5.r0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
