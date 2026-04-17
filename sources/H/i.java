package H;

import android.os.Process;

public final class i extends Thread {

    /* renamed from: a  reason: collision with root package name */
    public final int f983a = 10;

    public i(Runnable runnable) {
        super(runnable, "fonts-androidx");
    }

    public final void run() {
        Process.setThreadPriority(this.f983a);
        super.run();
    }
}
