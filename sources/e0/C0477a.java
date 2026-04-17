package e0;

import T1.C0186l0;
import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import x1.d;

/* renamed from: e0.a  reason: case insensitive filesystem */
public final class C0477a implements Runnable {

    /* renamed from: q  reason: collision with root package name */
    public static final ThreadPoolExecutor f7555q;

    /* renamed from: r  reason: collision with root package name */
    public static C0481e f7556r;

    /* renamed from: s  reason: collision with root package name */
    public static volatile ThreadPoolExecutor f7557s;

    /* renamed from: a  reason: collision with root package name */
    public final C0186l0 f7558a;

    /* renamed from: b  reason: collision with root package name */
    public final C0479c f7559b;

    /* renamed from: c  reason: collision with root package name */
    public volatile int f7560c = 1;
    public final AtomicBoolean d = new AtomicBoolean();

    /* renamed from: e  reason: collision with root package name */
    public final AtomicBoolean f7561e = new AtomicBoolean();

    /* renamed from: f  reason: collision with root package name */
    public final CountDownLatch f7562f;

    /* renamed from: p  reason: collision with root package name */
    public final /* synthetic */ d f7563p;

    static {
        C0478b bVar = new C0478b(0);
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(5, 128, 1, TimeUnit.SECONDS, new LinkedBlockingQueue(10), bVar);
        f7555q = threadPoolExecutor;
        f7557s = threadPoolExecutor;
    }

    public C0477a(d dVar) {
        this.f7563p = dVar;
        C0186l0 l0Var = new C0186l0(this, 2);
        this.f7558a = l0Var;
        this.f7559b = new C0479c(this, l0Var);
        this.f7562f = new CountDownLatch(1);
    }

    /* JADX WARNING: type inference failed for: r1v2, types: [android.os.Handler, e0.e] */
    public final void a(Object obj) {
        C0481e eVar;
        synchronized (C0477a.class) {
            try {
                if (f7556r == null) {
                    f7556r = new Handler(Looper.getMainLooper());
                }
                eVar = f7556r;
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }
        eVar.obtainMessage(1, new C0480d(this, obj)).sendToTarget();
    }

    public final void run() {
        this.f7563p.c();
    }
}
