package G5;

import B2.a;
import I5.c;
import java.lang.reflect.Method;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import o5.i;

/* renamed from: G5.a0  reason: case insensitive filesystem */
public final class C0020a0 extends Z implements K {

    /* renamed from: c  reason: collision with root package name */
    public final Executor f894c;

    public C0020a0(Executor executor) {
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor;
        this.f894c = executor;
        Method method = c.f1250a;
        try {
            if (executor instanceof ScheduledThreadPoolExecutor) {
                scheduledThreadPoolExecutor = (ScheduledThreadPoolExecutor) executor;
            } else {
                scheduledThreadPoolExecutor = null;
            }
            if (scheduledThreadPoolExecutor != null) {
                Method method2 = c.f1250a;
                if (method2 != null) {
                    method2.invoke(scheduledThreadPoolExecutor, new Object[]{Boolean.TRUE});
                }
            }
        } catch (Throwable unused) {
        }
    }

    public final P c(long j6, F0 f02, i iVar) {
        ScheduledExecutorService scheduledExecutorService;
        Executor executor = this.f894c;
        ScheduledFuture<?> scheduledFuture = null;
        if (executor instanceof ScheduledExecutorService) {
            scheduledExecutorService = (ScheduledExecutorService) executor;
        } else {
            scheduledExecutorService = null;
        }
        if (scheduledExecutorService != null) {
            try {
                scheduledFuture = scheduledExecutorService.schedule(f02, j6, TimeUnit.MILLISECONDS);
            } catch (RejectedExecutionException e6) {
                CancellationException cancellationException = new CancellationException("The task was rejected");
                cancellationException.initCause(e6);
                F.e(iVar, cancellationException);
            }
        }
        if (scheduledFuture != null) {
            return new O(scheduledFuture);
        }
        return G.f869r.c(j6, f02, iVar);
    }

    public final void close() {
        ExecutorService executorService;
        Executor executor = this.f894c;
        if (executor instanceof ExecutorService) {
            executorService = (ExecutorService) executor;
        } else {
            executorService = null;
        }
        if (executorService != null) {
            executorService.shutdown();
        }
    }

    public final void d(long j6, C0040l lVar) {
        ScheduledExecutorService scheduledExecutorService;
        Executor executor = this.f894c;
        ScheduledFuture<?> scheduledFuture = null;
        if (executor instanceof ScheduledExecutorService) {
            scheduledExecutorService = (ScheduledExecutorService) executor;
        } else {
            scheduledExecutorService = null;
        }
        if (scheduledExecutorService != null) {
            try {
                scheduledFuture = scheduledExecutorService.schedule(new a((Object) this, (Object) lVar, 2), j6, TimeUnit.MILLISECONDS);
            } catch (RejectedExecutionException e6) {
                CancellationException cancellationException = new CancellationException("The task was rejected");
                cancellationException.initCause(e6);
                F.e(lVar.f923e, cancellationException);
            }
        }
        if (scheduledFuture != null) {
            lVar.u(new C0035i(scheduledFuture, 0));
        } else {
            G.f869r.d(j6, lVar);
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C0020a0) || ((C0020a0) obj).f894c != this.f894c) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return System.identityHashCode(this.f894c);
    }

    public final void j(i iVar, Runnable runnable) {
        try {
            this.f894c.execute(runnable);
        } catch (RejectedExecutionException e6) {
            CancellationException cancellationException = new CancellationException("The task was rejected");
            cancellationException.initCause(e6);
            F.e(iVar, cancellationException);
            N.f878b.j(iVar, runnable);
        }
    }

    public final String toString() {
        return this.f894c.toString();
    }
}
