package H1;

import B0.C0002a;
import java.io.Serializable;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

public final class a implements ThreadFactory {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f993a;

    /* renamed from: b  reason: collision with root package name */
    public final ThreadFactory f994b;

    /* renamed from: c  reason: collision with root package name */
    public final Serializable f995c;

    public a() {
        this.f993a = 1;
        this.f994b = Executors.defaultThreadFactory();
        this.f995c = new AtomicInteger(1);
    }

    public final Thread newThread(Runnable runnable) {
        switch (this.f993a) {
            case 0:
                Thread newThread = this.f994b.newThread(new C0002a(runnable, 1));
                newThread.setName((String) this.f995c);
                return newThread;
            default:
                Thread newThread2 = this.f994b.newThread(runnable);
                int andIncrement = ((AtomicInteger) this.f995c).getAndIncrement();
                newThread2.setName("PlayBillingLibrary-" + andIncrement);
                return newThread2;
        }
    }

    public a(String str) {
        this.f993a = 0;
        this.f994b = Executors.defaultThreadFactory();
        this.f995c = str;
    }
}
