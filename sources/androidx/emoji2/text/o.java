package androidx.emoji2.text;

import A4.a;
import B0.l;
import F3.k;
import H.h;
import R2.b;
import T1.C;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Handler;
import com.bumptech.glide.c;
import h0.C0552a;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public final class o implements i {

    /* renamed from: a  reason: collision with root package name */
    public final Context f4947a;

    /* renamed from: b  reason: collision with root package name */
    public final k f4948b;

    /* renamed from: c  reason: collision with root package name */
    public final C f4949c;
    public final Object d = new Object();

    /* renamed from: e  reason: collision with root package name */
    public Handler f4950e;

    /* renamed from: f  reason: collision with root package name */
    public ThreadPoolExecutor f4951f;

    /* renamed from: p  reason: collision with root package name */
    public ThreadPoolExecutor f4952p;

    /* renamed from: q  reason: collision with root package name */
    public b f4953q;

    public o(Context context, k kVar) {
        C c3 = p.d;
        c.e(context, "Context cannot be null");
        this.f4947a = context.getApplicationContext();
        this.f4948b = kVar;
        this.f4949c = c3;
    }

    public final void a(b bVar) {
        synchronized (this.d) {
            this.f4953q = bVar;
        }
        synchronized (this.d) {
            try {
                if (this.f4953q != null) {
                    if (this.f4951f == null) {
                        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 15, TimeUnit.SECONDS, new LinkedBlockingDeque(), new a("emojiCompat"));
                        threadPoolExecutor.allowCoreThreadTimeOut(true);
                        this.f4952p = threadPoolExecutor;
                        this.f4951f = threadPoolExecutor;
                    }
                    this.f4951f.execute(new a(this, 7));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void b() {
        synchronized (this.d) {
            try {
                this.f4953q = null;
                Handler handler = this.f4950e;
                if (handler != null) {
                    handler.removeCallbacks((Runnable) null);
                }
                this.f4950e = null;
                ThreadPoolExecutor threadPoolExecutor = this.f4952p;
                if (threadPoolExecutor != null) {
                    threadPoolExecutor.shutdown();
                }
                this.f4951f = null;
                this.f4952p = null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final h c() {
        try {
            C c3 = this.f4949c;
            Context context = this.f4947a;
            k kVar = this.f4948b;
            c3.getClass();
            l a6 = H.c.a(context, kVar);
            int i2 = a6.f246b;
            if (i2 == 0) {
                h[] hVarArr = (h[]) a6.f247c;
                if (hVarArr != null && hVarArr.length != 0) {
                    return hVarArr[0];
                }
                throw new RuntimeException("fetchFonts failed (empty result)");
            }
            throw new RuntimeException(C0552a.k(i2, "fetchFonts failed (", ")"));
        } catch (PackageManager.NameNotFoundException e6) {
            throw new RuntimeException("provider not found", e6);
        }
    }
}
