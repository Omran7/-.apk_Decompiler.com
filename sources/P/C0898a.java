package p;

import java.util.concurrent.CancellationException;

/* renamed from: p.a  reason: case insensitive filesystem */
public final class C0898a {

    /* renamed from: c  reason: collision with root package name */
    public static final C0898a f10941c;
    public static final C0898a d;

    /* renamed from: a  reason: collision with root package name */
    public final boolean f10942a;

    /* renamed from: b  reason: collision with root package name */
    public final CancellationException f10943b;

    static {
        if (h.d) {
            d = null;
            f10941c = null;
            return;
        }
        d = new C0898a(false, (CancellationException) null);
        f10941c = new C0898a(true, (CancellationException) null);
    }

    public C0898a(boolean z3, CancellationException cancellationException) {
        this.f10942a = z3;
        this.f10943b = cancellationException;
    }
}
