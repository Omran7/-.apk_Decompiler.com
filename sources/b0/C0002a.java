package B0;

import android.os.Process;
import android.support.v4.media.session.a;

/* renamed from: B0.a  reason: case insensitive filesystem */
public final class C0002a implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f208a;

    /* renamed from: b  reason: collision with root package name */
    public final Runnable f209b;

    public /* synthetic */ C0002a(Runnable runnable, int i2) {
        this.f208a = i2;
        this.f209b = runnable;
    }

    public final void run() {
        switch (this.f208a) {
            case 0:
                Process.setThreadPriority(10);
                this.f209b.run();
                return;
            case 1:
                Process.setThreadPriority(0);
                this.f209b.run();
                return;
            case 2:
                try {
                    this.f209b.run();
                    return;
                } catch (Exception e6) {
                    a.q(e6, "Executor", "Background execution failure.");
                    return;
                }
            default:
                this.f209b.run();
                return;
        }
    }

    public String toString() {
        switch (this.f208a) {
            case 3:
                return this.f209b.toString();
            default:
                return super.toString();
        }
    }
}
