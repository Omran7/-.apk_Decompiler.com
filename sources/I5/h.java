package I5;

import G5.A;
import G5.C0048u;
import G5.C0049v;
import G5.D0;
import G5.F;
import G5.M;
import G5.Y;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.j;
import m5.C0847f;
import n5.C0873e;
import o5.i;
import q5.c;
import q5.d;

public final class h extends M implements d, o5.d {

    /* renamed from: q  reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f1256q = AtomicReferenceFieldUpdater.newUpdater(h.class, Object.class, "_reusableCancellableContinuation$volatile");
    private volatile /* synthetic */ Object _reusableCancellableContinuation$volatile;
    public final A d;

    /* renamed from: e  reason: collision with root package name */
    public final c f1257e;

    /* renamed from: f  reason: collision with root package name */
    public Object f1258f = a.f1246c;

    /* renamed from: p  reason: collision with root package name */
    public final Object f1259p;

    public h(A a6, c cVar) {
        super(-1);
        this.d = a6;
        this.f1257e = cVar;
        Object fold = cVar.getContext().fold(0, w.f1282b);
        j.b(fold);
        this.f1259p = fold;
    }

    public final void e(Object obj, CancellationException cancellationException) {
        if (obj instanceof C0049v) {
            ((C0049v) obj).f953b.invoke(cancellationException);
        }
    }

    public final d getCallerFrame() {
        c cVar = this.f1257e;
        if (cVar != null) {
            return cVar;
        }
        return null;
    }

    public final i getContext() {
        return this.f1257e.getContext();
    }

    public final Object j() {
        Object obj = this.f1258f;
        this.f1258f = a.f1246c;
        return obj;
    }

    public final void resumeWith(Object obj) {
        Object obj2;
        i context;
        Object i2;
        c cVar = this.f1257e;
        i context2 = cVar.getContext();
        Throwable a6 = C0847f.a(obj);
        if (a6 == null) {
            obj2 = obj;
        } else {
            obj2 = new C0048u(false, a6);
        }
        A a7 = this.d;
        if (a7.k()) {
            this.f1258f = obj2;
            this.f876c = 0;
            a7.j(context2, this);
            return;
        }
        Y a8 = D0.a();
        if (a8.f891c >= 4294967296L) {
            this.f1258f = obj2;
            this.f876c = 0;
            C0873e eVar = a8.f892e;
            if (eVar == null) {
                eVar = new C0873e();
                a8.f892e = eVar;
            }
            eVar.addLast(this);
            return;
        }
        a8.n(true);
        try {
            context = cVar.getContext();
            i2 = a.i(context, this.f1259p);
            cVar.resumeWith(obj);
            a.d(context, i2);
            do {
            } while (a8.o());
        } catch (Throwable th) {
            a8.l();
            throw th;
        }
        a8.l();
    }

    public final String toString() {
        return "DispatchedContinuation[" + this.d + ", " + F.t(this.f1257e) + ']';
    }

    public final o5.d f() {
        return this;
    }
}
