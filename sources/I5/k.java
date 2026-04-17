package I5;

import G5.F;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.j;

public class k {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f1266a;

    /* renamed from: b  reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f1267b;

    /* renamed from: c  reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f1268c;
    private volatile /* synthetic */ Object _next$volatile = this;
    private volatile /* synthetic */ Object _prev$volatile = this;
    private volatile /* synthetic */ Object _removedRef$volatile;

    static {
        Class<k> cls = k.class;
        Class<Object> cls2 = Object.class;
        f1266a = AtomicReferenceFieldUpdater.newUpdater(cls, cls2, "_next$volatile");
        f1267b = AtomicReferenceFieldUpdater.newUpdater(cls, cls2, "_prev$volatile");
        f1268c = AtomicReferenceFieldUpdater.newUpdater(cls, cls2, "_removedRef$volatile");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x003e, code lost:
        r6 = ((I5.q) r6).f1277a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0046, code lost:
        if (r5.compareAndSet(r4, r3, r6) == false) goto L_0x004a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x004e, code lost:
        if (r5.get(r4) == r3) goto L_0x0042;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final I5.k c() {
        /*
            r9 = this;
        L_0x0000:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = f1267b
            java.lang.Object r1 = r0.get(r9)
            I5.k r1 = (I5.k) r1
            r2 = 0
            r3 = r1
        L_0x000a:
            r4 = r2
        L_0x000b:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r5 = f1266a
            java.lang.Object r6 = r5.get(r3)
            if (r6 != r9) goto L_0x0024
            if (r1 != r3) goto L_0x0016
            return r3
        L_0x0016:
            boolean r2 = r0.compareAndSet(r9, r1, r3)
            if (r2 == 0) goto L_0x001d
            return r3
        L_0x001d:
            java.lang.Object r2 = r0.get(r9)
            if (r2 == r1) goto L_0x0016
            goto L_0x0000
        L_0x0024:
            boolean r7 = r9.h()
            if (r7 == 0) goto L_0x002b
            return r2
        L_0x002b:
            if (r6 != 0) goto L_0x002e
            return r3
        L_0x002e:
            boolean r7 = r6 instanceof I5.p
            if (r7 == 0) goto L_0x0038
            I5.p r6 = (I5.p) r6
            r6.a(r3)
            goto L_0x0000
        L_0x0038:
            boolean r7 = r6 instanceof I5.q
            if (r7 == 0) goto L_0x0058
            if (r4 == 0) goto L_0x0051
            I5.q r6 = (I5.q) r6
            I5.k r6 = r6.f1277a
        L_0x0042:
            boolean r7 = r5.compareAndSet(r4, r3, r6)
            if (r7 == 0) goto L_0x004a
            r3 = r4
            goto L_0x000a
        L_0x004a:
            java.lang.Object r7 = r5.get(r4)
            if (r7 == r3) goto L_0x0042
            goto L_0x0000
        L_0x0051:
            java.lang.Object r3 = r0.get(r3)
            I5.k r3 = (I5.k) r3
            goto L_0x000b
        L_0x0058:
            java.lang.String r4 = "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }"
            kotlin.jvm.internal.j.c(r6, r4)
            r4 = r6
            I5.k r4 = (I5.k) r4
            r8 = r4
            r4 = r3
            r3 = r8
            goto L_0x000b
        */
        throw new UnsupportedOperationException("Method not decompiled: I5.k.c():I5.k");
    }

    public final void d(k kVar) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f1267b;
            k kVar2 = (k) atomicReferenceFieldUpdater.get(kVar);
            if (f() == kVar) {
                while (true) {
                    if (atomicReferenceFieldUpdater.compareAndSet(kVar, kVar2, this)) {
                        if (h()) {
                            kVar.c();
                            return;
                        }
                        return;
                    } else if (atomicReferenceFieldUpdater.get(kVar) != kVar2) {
                    }
                }
            } else {
                return;
            }
        }
    }

    public final Object f() {
        while (true) {
            Object obj = f1266a.get(this);
            if (!(obj instanceof p)) {
                return obj;
            }
            ((p) obj).a(this);
        }
    }

    public final k g() {
        q qVar;
        k kVar;
        Object f6 = f();
        if (f6 instanceof q) {
            qVar = (q) f6;
        } else {
            qVar = null;
        }
        if (qVar != null && (kVar = qVar.f1277a) != null) {
            return kVar;
        }
        j.c(f6, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }");
        return (k) f6;
    }

    public boolean h() {
        return f() instanceof q;
    }

    public String toString() {
        return new j(this) + '@' + F.j(this);
    }
}
