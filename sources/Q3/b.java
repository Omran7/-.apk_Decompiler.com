package q3;

import c1.i;
import e0.C0478b;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledThreadPoolExecutor;

public final class b extends ScheduledThreadPoolExecutor {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ i f11085a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public b(i iVar, C0478b bVar) {
        super(1, bVar);
        this.f11085a = iVar;
    }

    public final void afterExecute(Runnable runnable, Throwable th) {
        super.afterExecute(runnable, th);
        if (th == null && (runnable instanceof Future)) {
            Future future = (Future) runnable;
            try {
                if (future.isDone()) {
                    future.get();
                }
            } catch (CancellationException unused) {
            } catch (ExecutionException e6) {
                th = e6.getCause();
            } catch (InterruptedException unused2) {
                Thread.currentThread().interrupt();
            }
        }
        if (th != null) {
            this.f11085a.w(th);
        }
    }
}
