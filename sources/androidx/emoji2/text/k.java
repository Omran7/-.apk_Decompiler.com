package androidx.emoji2.text;

import R2.b;
import S3.z;
import java.util.concurrent.ThreadPoolExecutor;

public final class k extends b {

    /* renamed from: t  reason: collision with root package name */
    public final /* synthetic */ b f4940t;

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ ThreadPoolExecutor f4941u;

    public k(b bVar, ThreadPoolExecutor threadPoolExecutor) {
        this.f4940t = bVar;
        this.f4941u = threadPoolExecutor;
    }

    public final void o0(Throwable th) {
        ThreadPoolExecutor threadPoolExecutor = this.f4941u;
        try {
            this.f4940t.o0(th);
        } finally {
            threadPoolExecutor.shutdown();
        }
    }

    public final void p0(z zVar) {
        ThreadPoolExecutor threadPoolExecutor = this.f4941u;
        try {
            this.f4940t.p0(zVar);
        } finally {
            threadPoolExecutor.shutdown();
        }
    }
}
