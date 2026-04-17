package T1;

import android.os.Process;
import com.google.android.gms.common.internal.I;
import java.util.AbstractQueue;
import java.util.concurrent.BlockingQueue;

/* renamed from: T1.q0  reason: case insensitive filesystem */
public final class C0201q0 extends Thread {

    /* renamed from: a  reason: collision with root package name */
    public final Object f3434a;

    /* renamed from: b  reason: collision with root package name */
    public final AbstractQueue f3435b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f3436c = false;
    public final /* synthetic */ C0203r0 d;

    public C0201q0(C0203r0 r0Var, String str, BlockingQueue blockingQueue) {
        this.d = r0Var;
        I.g(blockingQueue);
        this.f3434a = new Object();
        this.f3435b = (AbstractQueue) blockingQueue;
        setName(str);
    }

    public final void a() {
        C0203r0 r0Var = this.d;
        synchronized (r0Var.f3450r) {
            try {
                if (!this.f3436c) {
                    r0Var.f3451s.release();
                    r0Var.f3450r.notifyAll();
                    if (this == r0Var.f3445c) {
                        r0Var.f3445c = null;
                    } else if (this == r0Var.d) {
                        r0Var.d = null;
                    } else {
                        Z z3 = ((C0212u0) r0Var.f398a).f3496r;
                        C0212u0.k(z3);
                        z3.f3172f.a("Current scheduler thread is neither worker nor network");
                    }
                    this.f3436c = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void run() {
        int i2;
        boolean z3 = false;
        while (!z3) {
            try {
                this.d.f3451s.acquire();
                z3 = true;
            } catch (InterruptedException e6) {
                Z z4 = ((C0212u0) this.d.f398a).f3496r;
                C0212u0.k(z4);
                z4.f3175r.b(e6, String.valueOf(getName()).concat(" was interrupted"));
            }
        }
        try {
            int threadPriority = Process.getThreadPriority(Process.myTid());
            while (true) {
                AbstractQueue abstractQueue = this.f3435b;
                C0198p0 p0Var = (C0198p0) abstractQueue.poll();
                if (p0Var != null) {
                    if (true != p0Var.f3430b) {
                        i2 = 10;
                    } else {
                        i2 = threadPriority;
                    }
                    Process.setThreadPriority(i2);
                    p0Var.run();
                } else {
                    Object obj = this.f3434a;
                    synchronized (obj) {
                        if (abstractQueue.peek() == null) {
                            this.d.getClass();
                            try {
                                obj.wait(30000);
                            } catch (InterruptedException e7) {
                                Z z5 = ((C0212u0) this.d.f398a).f3496r;
                                C0212u0.k(z5);
                                z5.f3175r.b(e7, String.valueOf(getName()).concat(" was interrupted"));
                            }
                        }
                    }
                    synchronized (this.d.f3450r) {
                        if (this.f3435b.peek() == null) {
                            a();
                            a();
                            return;
                        }
                    }
                }
            }
        } catch (Throwable th) {
            a();
            throw th;
        }
    }
}
