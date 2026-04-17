package S3;

import D0.e;
import D2.l;
import R2.b;
import a1.d;
import android.content.Intent;
import androidx.emoji2.text.i;
import androidx.emoji2.text.k;
import androidx.emoji2.text.o;
import androidx.emoji2.text.p;
import c1.h;
import c1.j;
import com.google.android.gms.tasks.TaskCompletionSource;
import d1.g;
import h1.C0553a;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.logging.Logger;

/* renamed from: S3.h  reason: case insensitive filesystem */
public final /* synthetic */ class C0147h implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f2669a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f2670b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Object f2671c;
    public final /* synthetic */ Object d;

    public /* synthetic */ C0147h(C0553a aVar, j jVar, l lVar, h hVar) {
        this.f2669a = 2;
        this.f2670b = aVar;
        this.f2671c = jVar;
        this.d = hVar;
    }

    public final void run() {
        switch (this.f2669a) {
            case 0:
                Intent intent = (Intent) this.f2671c;
                TaskCompletionSource taskCompletionSource = (TaskCompletionSource) this.d;
                C0148i iVar = (C0148i) this.f2670b;
                iVar.getClass();
                try {
                    iVar.b(intent);
                    return;
                } finally {
                    taskCompletionSource.setResult(null);
                }
            case 1:
                e eVar = (e) this.f2670b;
                b bVar = (b) this.f2671c;
                ThreadPoolExecutor threadPoolExecutor = (ThreadPoolExecutor) this.d;
                eVar.getClass();
                try {
                    p g = K1.e.g(eVar.f494b);
                    if (g != null) {
                        o oVar = (o) ((i) g.f4930b);
                        synchronized (oVar.d) {
                            oVar.f4951f = threadPoolExecutor;
                        }
                        ((i) g.f4930b).a(new k(bVar, threadPoolExecutor));
                        return;
                    }
                    throw new RuntimeException("EmojiCompat font provider not available on this device.");
                } catch (Throwable th) {
                    bVar.o0(th);
                    threadPoolExecutor.shutdown();
                    return;
                }
            default:
                j jVar = (j) this.f2671c;
                String str = jVar.f5607a;
                h hVar = (h) this.d;
                C0553a aVar = (C0553a) this.f2670b;
                aVar.getClass();
                Logger logger = C0553a.f8047f;
                try {
                    g a6 = aVar.f8050c.a(str);
                    if (a6 == null) {
                        String str2 = "Transport backend '" + str + "' is not registered";
                        logger.warning(str2);
                        new IllegalArgumentException(str2);
                        return;
                    }
                    ((j1.g) aVar.f8051e).m(new F3.b(aVar, jVar, ((d) a6).a(hVar), 4));
                    return;
                } catch (Exception e6) {
                    logger.warning("Error scheduling event " + e6.getMessage());
                    return;
                }
        }
    }

    public /* synthetic */ C0147h(Object obj, Object obj2, Object obj3, int i2) {
        this.f2669a = i2;
        this.f2670b = obj;
        this.f2671c = obj2;
        this.d = obj3;
    }
}
