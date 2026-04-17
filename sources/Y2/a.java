package Y2;

import B.m;
import D2.l;
import F3.e;
import F3.k;
import K3.b;
import R2.i;
import Z2.h;
import com.google.android.gms.common.internal.I;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.concurrent.Executor;

public final class a implements W2.a {

    /* renamed from: a  reason: collision with root package name */
    public final k f4270a;

    /* renamed from: b  reason: collision with root package name */
    public final Executor f4271b;

    /* renamed from: c  reason: collision with root package name */
    public final Executor f4272c;
    public final h d = new h();

    /* renamed from: e  reason: collision with root package name */
    public final Task f4273e;

    public a(i iVar, b bVar, Executor executor, Executor executor2, Executor executor3) {
        I.g(iVar);
        this.f4270a = new k(iVar);
        this.f4271b = executor;
        this.f4272c = executor3;
        if (bVar.get() == null) {
            TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
            executor2.execute(new m(iVar, taskCompletionSource, 4));
            this.f4273e = taskCompletionSource.getTask();
            return;
        }
        bVar.get().getClass();
        throw new ClassCastException();
    }

    public final Task a() {
        e eVar = new e((Object) this, 4);
        Task task = this.f4273e;
        Executor executor = this.f4271b;
        return task.onSuccessTask(executor, eVar).onSuccessTask(executor, new l(22));
    }
}
