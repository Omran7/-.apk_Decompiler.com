package h3;

import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* renamed from: h3.g  reason: case insensitive filesystem */
public final class C0563g implements ScheduledExecutorService {

    /* renamed from: a  reason: collision with root package name */
    public final ExecutorService f8138a;

    /* renamed from: b  reason: collision with root package name */
    public final ScheduledExecutorService f8139b;

    public C0563g(ExecutorService executorService, ScheduledExecutorService scheduledExecutorService) {
        this.f8138a = executorService;
        this.f8139b = scheduledExecutorService;
    }

    public final boolean awaitTermination(long j6, TimeUnit timeUnit) {
        return this.f8138a.awaitTermination(j6, timeUnit);
    }

    public final void execute(Runnable runnable) {
        this.f8138a.execute(runnable);
    }

    public final List invokeAll(Collection collection) {
        return this.f8138a.invokeAll(collection);
    }

    public final Object invokeAny(Collection collection) {
        return this.f8138a.invokeAny(collection);
    }

    public final boolean isShutdown() {
        return this.f8138a.isShutdown();
    }

    public final boolean isTerminated() {
        return this.f8138a.isTerminated();
    }

    public final ScheduledFuture schedule(Runnable runnable, long j6, TimeUnit timeUnit) {
        return new C0565i(new C0558b(this, runnable, j6, timeUnit, 0));
    }

    public final ScheduledFuture scheduleAtFixedRate(Runnable runnable, long j6, long j7, TimeUnit timeUnit) {
        return new C0565i(new C0560d(this, runnable, j6, j7, timeUnit, 0));
    }

    public final ScheduledFuture scheduleWithFixedDelay(Runnable runnable, long j6, long j7, TimeUnit timeUnit) {
        return new C0565i(new C0560d(this, runnable, j6, j7, timeUnit, 1));
    }

    public final void shutdown() {
        throw new UnsupportedOperationException("Shutting down is not allowed.");
    }

    public final List shutdownNow() {
        throw new UnsupportedOperationException("Shutting down is not allowed.");
    }

    public final Future submit(Callable callable) {
        return this.f8138a.submit(callable);
    }

    public final List invokeAll(Collection collection, long j6, TimeUnit timeUnit) {
        return this.f8138a.invokeAll(collection, j6, timeUnit);
    }

    public final Object invokeAny(Collection collection, long j6, TimeUnit timeUnit) {
        return this.f8138a.invokeAny(collection, j6, timeUnit);
    }

    public final ScheduledFuture schedule(Callable callable, long j6, TimeUnit timeUnit) {
        return new C0565i(new C0558b(this, callable, j6, timeUnit, 1));
    }

    public final Future submit(Runnable runnable, Object obj) {
        return this.f8138a.submit(runnable, obj);
    }

    public final Future submit(Runnable runnable) {
        return this.f8138a.submit(runnable);
    }
}
