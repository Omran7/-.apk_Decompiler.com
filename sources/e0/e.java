package E0;

import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public final class e implements ExecutorService {

    /* renamed from: b  reason: collision with root package name */
    public static final long f584b = TimeUnit.SECONDS.toMillis(10);

    /* renamed from: c  reason: collision with root package name */
    public static volatile int f585c;

    /* renamed from: a  reason: collision with root package name */
    public final ThreadPoolExecutor f586a;

    public e(ThreadPoolExecutor threadPoolExecutor) {
        this.f586a = threadPoolExecutor;
    }

    public final boolean awaitTermination(long j6, TimeUnit timeUnit) {
        return this.f586a.awaitTermination(j6, timeUnit);
    }

    public final void execute(Runnable runnable) {
        this.f586a.execute(runnable);
    }

    public final List invokeAll(Collection collection) {
        return this.f586a.invokeAll(collection);
    }

    public final Object invokeAny(Collection collection) {
        return this.f586a.invokeAny(collection);
    }

    public final boolean isShutdown() {
        return this.f586a.isShutdown();
    }

    public final boolean isTerminated() {
        return this.f586a.isTerminated();
    }

    public final void shutdown() {
        this.f586a.shutdown();
    }

    public final List shutdownNow() {
        return this.f586a.shutdownNow();
    }

    public final Future submit(Runnable runnable) {
        return this.f586a.submit(runnable);
    }

    public final String toString() {
        return this.f586a.toString();
    }

    public final List invokeAll(Collection collection, long j6, TimeUnit timeUnit) {
        return this.f586a.invokeAll(collection, j6, timeUnit);
    }

    public final Object invokeAny(Collection collection, long j6, TimeUnit timeUnit) {
        return this.f586a.invokeAny(collection, j6, timeUnit);
    }

    public final Future submit(Runnable runnable, Object obj) {
        return this.f586a.submit(runnable, obj);
    }

    public final Future submit(Callable callable) {
        return this.f586a.submit(callable);
    }
}
