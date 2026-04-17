package G5;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* renamed from: G5.u  reason: case insensitive filesystem */
public class C0048u {

    /* renamed from: b  reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f949b = AtomicIntegerFieldUpdater.newUpdater(C0048u.class, "_handled$volatile");
    private volatile /* synthetic */ int _handled$volatile;

    /* renamed from: a  reason: collision with root package name */
    public final Throwable f950a;

    public C0048u(boolean z3, Throwable th) {
        this.f950a = th;
        this._handled$volatile = z3 ? 1 : 0;
    }

    public final String toString() {
        return getClass().getSimpleName() + '[' + this.f950a + ']';
    }
}
