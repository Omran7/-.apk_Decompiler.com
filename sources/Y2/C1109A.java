package y2;

import com.google.android.gms.tasks.TaskCompletionSource;

/* renamed from: y2.A  reason: case insensitive filesystem */
public abstract class C1109A implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final TaskCompletionSource f12680a;

    public C1109A() {
        this.f12680a = null;
    }

    public void a(Exception exc) {
        TaskCompletionSource taskCompletionSource = this.f12680a;
        if (taskCompletionSource != null) {
            taskCompletionSource.trySetException(exc);
        }
    }

    public abstract void b();

    public final TaskCompletionSource c() {
        return this.f12680a;
    }

    public final void run() {
        try {
            b();
        } catch (Exception e6) {
            a(e6);
        }
    }

    public C1109A(TaskCompletionSource taskCompletionSource) {
        this.f12680a = taskCompletionSource;
    }
}
