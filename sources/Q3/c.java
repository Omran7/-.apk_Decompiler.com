package q3;

import c1.i;
import e0.C0478b;
import java.lang.Thread;

public final class c implements Thread.UncaughtExceptionHandler {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ C0478b f11086a;

    public c(C0478b bVar) {
        this.f11086a = bVar;
    }

    public final void uncaughtException(Thread thread, Throwable th) {
        ((i) this.f11086a.f7565b).w(th);
    }
}
