package G5;

import K5.i;
import K5.k;
import com.bumptech.glide.c;
import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.j;
import o5.d;

public abstract class M extends i {

    /* renamed from: c  reason: collision with root package name */
    public int f876c;

    public M(int i2) {
        super(0, k.g);
        this.f876c = i2;
    }

    public abstract void e(Object obj, CancellationException cancellationException);

    public abstract d f();

    public Throwable g(Object obj) {
        C0048u uVar;
        if (obj instanceof C0048u) {
            uVar = (C0048u) obj;
        } else {
            uVar = null;
        }
        if (uVar != null) {
            return uVar.f950a;
        }
        return null;
    }

    public final void i(Throwable th, Throwable th2) {
        if (th != null || th2 != null) {
            if (!(th == null || th2 == null)) {
                c.a(th, th2);
            }
            if (th == null) {
                th = th2;
            }
            j.b(th);
            F.k(f().getContext(), new Error("Fatal exception in coroutines machinery for " + this + ". Please read KDoc to 'handleFatalException' method and report this incident to maintainers", th));
        }
    }

    public abstract Object j();

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0079, code lost:
        if (r5.M() != false) goto L_0x007b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0095, code lost:
        if (r5.M() != false) goto L_0x0097;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r11 = this;
            m5.h r0 = m5.C0849h.f10203c
            K1.h r1 = r11.f1675b
            o5.d r2 = r11.f()     // Catch:{ all -> 0x0025 }
            java.lang.String r3 = "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<T of kotlinx.coroutines.DispatchedTask>"
            kotlin.jvm.internal.j.c(r2, r3)     // Catch:{ all -> 0x0025 }
            I5.h r2 = (I5.h) r2     // Catch:{ all -> 0x0025 }
            q5.c r3 = r2.f1257e     // Catch:{ all -> 0x0025 }
            java.lang.Object r2 = r2.f1259p     // Catch:{ all -> 0x0025 }
            o5.i r4 = r3.getContext()     // Catch:{ all -> 0x0025 }
            java.lang.Object r2 = I5.a.i(r4, r2)     // Catch:{ all -> 0x0025 }
            I5.u r5 = I5.a.f1248f     // Catch:{ all -> 0x0025 }
            r6 = 0
            if (r2 == r5) goto L_0x0028
            G5.H0 r5 = G5.F.v(r3, r4, r2)     // Catch:{ all -> 0x0025 }
            goto L_0x0029
        L_0x0025:
            r2 = move-exception
            goto L_0x009b
        L_0x0028:
            r5 = r6
        L_0x0029:
            o5.i r7 = r3.getContext()     // Catch:{ all -> 0x0048 }
            java.lang.Object r8 = r11.j()     // Catch:{ all -> 0x0048 }
            java.lang.Throwable r9 = r11.g(r8)     // Catch:{ all -> 0x0048 }
            if (r9 != 0) goto L_0x004a
            int r10 = r11.f876c     // Catch:{ all -> 0x0048 }
            boolean r10 = G5.F.n(r10)     // Catch:{ all -> 0x0048 }
            if (r10 == 0) goto L_0x004a
            G5.B r10 = G5.B.f856b     // Catch:{ all -> 0x0048 }
            o5.g r7 = r7.get(r10)     // Catch:{ all -> 0x0048 }
            G5.h0 r7 = (G5.C0034h0) r7     // Catch:{ all -> 0x0048 }
            goto L_0x004b
        L_0x0048:
            r3 = move-exception
            goto L_0x008f
        L_0x004a:
            r7 = r6
        L_0x004b:
            if (r7 == 0) goto L_0x0062
            boolean r10 = r7.isActive()     // Catch:{ all -> 0x0048 }
            if (r10 != 0) goto L_0x0062
            java.util.concurrent.CancellationException r7 = r7.getCancellationException()     // Catch:{ all -> 0x0048 }
            r11.e(r8, r7)     // Catch:{ all -> 0x0048 }
            m5.e r7 = I1.b.r(r7)     // Catch:{ all -> 0x0048 }
            r3.resumeWith(r7)     // Catch:{ all -> 0x0048 }
            goto L_0x0073
        L_0x0062:
            if (r9 == 0) goto L_0x006c
            m5.e r7 = I1.b.r(r9)     // Catch:{ all -> 0x0048 }
            r3.resumeWith(r7)     // Catch:{ all -> 0x0048 }
            goto L_0x0073
        L_0x006c:
            java.lang.Object r7 = r11.h(r8)     // Catch:{ all -> 0x0048 }
            r3.resumeWith(r7)     // Catch:{ all -> 0x0048 }
        L_0x0073:
            if (r5 == 0) goto L_0x007b
            boolean r3 = r5.M()     // Catch:{ all -> 0x0025 }
            if (r3 == 0) goto L_0x007e
        L_0x007b:
            I5.a.d(r4, r2)     // Catch:{ all -> 0x0025 }
        L_0x007e:
            r1.getClass()     // Catch:{ all -> 0x0082 }
            goto L_0x0087
        L_0x0082:
            r0 = move-exception
            m5.e r0 = I1.b.r(r0)
        L_0x0087:
            java.lang.Throwable r0 = m5.C0847f.a(r0)
            r11.i(r6, r0)
            goto L_0x00ab
        L_0x008f:
            if (r5 == 0) goto L_0x0097
            boolean r5 = r5.M()     // Catch:{ all -> 0x0025 }
            if (r5 == 0) goto L_0x009a
        L_0x0097:
            I5.a.d(r4, r2)     // Catch:{ all -> 0x0025 }
        L_0x009a:
            throw r3     // Catch:{ all -> 0x0025 }
        L_0x009b:
            r1.getClass()     // Catch:{ all -> 0x009f }
            goto L_0x00a4
        L_0x009f:
            r0 = move-exception
            m5.e r0 = I1.b.r(r0)
        L_0x00a4:
            java.lang.Throwable r0 = m5.C0847f.a(r0)
            r11.i(r2, r0)
        L_0x00ab:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: G5.M.run():void");
    }

    public Object h(Object obj) {
        return obj;
    }
}
