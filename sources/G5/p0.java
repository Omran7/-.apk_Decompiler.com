package G5;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

public final class p0 implements C0024c0 {

    /* renamed from: b  reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f933b;

    /* renamed from: c  reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f934c;
    public static final /* synthetic */ AtomicReferenceFieldUpdater d;
    private volatile /* synthetic */ Object _exceptionsHolder$volatile;
    private volatile /* synthetic */ int _isCompleting$volatile = 0;
    private volatile /* synthetic */ Object _rootCause$volatile;

    /* renamed from: a  reason: collision with root package name */
    public final w0 f935a;

    static {
        Class<p0> cls = p0.class;
        f933b = AtomicIntegerFieldUpdater.newUpdater(cls, "_isCompleting$volatile");
        Class<Object> cls2 = Object.class;
        f934c = AtomicReferenceFieldUpdater.newUpdater(cls, cls2, "_rootCause$volatile");
        d = AtomicReferenceFieldUpdater.newUpdater(cls, cls2, "_exceptionsHolder$volatile");
    }

    public p0(w0 w0Var, Throwable th) {
        this.f935a = w0Var;
        this._rootCause$volatile = th;
    }

    public final void a(Throwable th) {
        Throwable c3 = c();
        if (c3 == null) {
            f934c.set(this, th);
        } else if (th != c3) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = d;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj == null) {
                atomicReferenceFieldUpdater.set(this, th);
            } else if (obj instanceof Throwable) {
                if (th != obj) {
                    ArrayList arrayList = new ArrayList(4);
                    arrayList.add(obj);
                    arrayList.add(th);
                    atomicReferenceFieldUpdater.set(this, arrayList);
                }
            } else if (obj instanceof ArrayList) {
                ((ArrayList) obj).add(th);
            } else {
                throw new IllegalStateException(("State is " + obj).toString());
            }
        }
    }

    public final w0 b() {
        return this.f935a;
    }

    public final Throwable c() {
        return (Throwable) f934c.get(this);
    }

    public final boolean d() {
        if (c() != null) {
            return true;
        }
        return false;
    }

    public final boolean e() {
        if (f933b.get(this) != 0) {
            return true;
        }
        return false;
    }

    public final ArrayList f(Throwable th) {
        ArrayList arrayList;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = d;
        Object obj = atomicReferenceFieldUpdater.get(this);
        if (obj == null) {
            arrayList = new ArrayList(4);
        } else if (obj instanceof Throwable) {
            ArrayList arrayList2 = new ArrayList(4);
            arrayList2.add(obj);
            arrayList = arrayList2;
        } else if (obj instanceof ArrayList) {
            arrayList = (ArrayList) obj;
        } else {
            throw new IllegalStateException(("State is " + obj).toString());
        }
        Throwable c3 = c();
        if (c3 != null) {
            arrayList.add(0, c3);
        }
        if (th != null && !th.equals(c3)) {
            arrayList.add(th);
        }
        atomicReferenceFieldUpdater.set(this, F.h);
        return arrayList;
    }

    public final boolean isActive() {
        if (c() == null) {
            return true;
        }
        return false;
    }

    public final String toString() {
        return "Finishing[cancelling=" + d() + ", completing=" + e() + ", rootCause=" + c() + ", exceptions=" + d.get(this) + ", list=" + this.f935a + ']';
    }
}
