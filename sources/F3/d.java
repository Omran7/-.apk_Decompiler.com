package F3;

import K3.b;
import g3.n;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.internal.j;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    public final b f735a;

    /* renamed from: b  reason: collision with root package name */
    public final b f736b;

    /* renamed from: c  reason: collision with root package name */
    public final Executor f737c;
    public final AtomicReference d = new AtomicReference();

    public d(b bVar, b bVar2, n nVar, Executor executor) {
        j.e(bVar, "tokenProvider");
        j.e(bVar2, "instanceId");
        j.e(nVar, "appCheckDeferred");
        j.e(executor, "executor");
        this.f735a = bVar;
        this.f736b = bVar2;
        this.f737c = executor;
        nVar.a(new a(this));
    }
}
