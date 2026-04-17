package p3;

import java.util.concurrent.Callable;
import n3.C0861b;
import n3.C0866g;
import q3.l;
import s3.C0969g;
import v3.s;

/* renamed from: p3.a  reason: case insensitive filesystem */
public final class C0917a {

    /* renamed from: a  reason: collision with root package name */
    public boolean f10993a = false;

    public final Object a(Callable callable) {
        l.b("runInTransaction called when an existing transaction is already in progress.", !this.f10993a);
        this.f10993a = true;
        try {
            Object call = callable.call();
            this.f10993a = false;
            return call;
        } catch (Throwable th) {
            this.f10993a = false;
            throw th;
        }
    }

    public final void b(C0969g gVar) {
        e();
    }

    public final void c(C0866g gVar, C0861b bVar) {
        e();
    }

    public final void d(C0969g gVar, s sVar) {
        e();
    }

    public final void e() {
        l.b("Transaction expected to already be in progress.", this.f10993a);
    }
}
