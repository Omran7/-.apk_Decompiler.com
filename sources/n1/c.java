package n1;

import java.lang.ref.WeakReference;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

public final class c extends Thread {

    /* renamed from: a  reason: collision with root package name */
    public final WeakReference f10236a;

    /* renamed from: b  reason: collision with root package name */
    public final long f10237b;

    /* renamed from: c  reason: collision with root package name */
    public final CountDownLatch f10238c = new CountDownLatch(1);
    public boolean d = false;

    public c(C0854a aVar, long j6) {
        this.f10236a = new WeakReference(aVar);
        this.f10237b = j6;
        start();
    }

    public final void run() {
        C0854a aVar;
        WeakReference weakReference = this.f10236a;
        try {
            if (!this.f10238c.await(this.f10237b, TimeUnit.MILLISECONDS) && (aVar = (C0854a) weakReference.get()) != null) {
                aVar.b();
                this.d = true;
            }
        } catch (InterruptedException unused) {
            C0854a aVar2 = (C0854a) weakReference.get();
            if (aVar2 != null) {
                aVar2.b();
                this.d = true;
            }
        }
    }
}
