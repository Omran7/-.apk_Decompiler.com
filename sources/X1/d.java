package x1;

import B0.C0004c;
import android.os.Looper;
import android.os.SystemClock;
import android.support.v4.media.session.a;
import android.util.Log;
import androidx.lifecycle.y;
import com.google.android.gms.auth.api.signin.internal.SignInHubActivity;
import com.google.android.gms.common.api.o;
import d0.C0456a;
import e0.C0477a;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Semaphore;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import l.C0777a;
import l.C0779c;
import q.C0928e;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    public C0456a f12539a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f12540b = false;

    /* renamed from: c  reason: collision with root package name */
    public boolean f12541c = false;
    public boolean d = true;

    /* renamed from: e  reason: collision with root package name */
    public boolean f12542e = false;

    /* renamed from: f  reason: collision with root package name */
    public final ThreadPoolExecutor f12543f;
    public volatile C0477a g;
    public volatile C0477a h;

    /* renamed from: i  reason: collision with root package name */
    public final Semaphore f12544i;

    /* renamed from: j  reason: collision with root package name */
    public final Set f12545j;

    public d(SignInHubActivity signInHubActivity, Set set) {
        ThreadPoolExecutor threadPoolExecutor = C0477a.f7555q;
        signInHubActivity.getApplicationContext();
        this.f12543f = threadPoolExecutor;
        this.f12544i = new Semaphore(0);
        this.f12545j = set;
    }

    public final void a() {
        if (this.g != null) {
            if (!this.f12540b) {
                this.f12542e = true;
            }
            if (this.h != null) {
                this.g.getClass();
                this.g = null;
                return;
            }
            this.g.getClass();
            C0477a aVar = this.g;
            aVar.d.set(true);
            if (aVar.f7559b.cancel(false)) {
                this.h = this.g;
            }
            this.g = null;
        }
    }

    public final void b(C0477a aVar, Object obj) {
        boolean z3;
        if (this.g != aVar) {
            if (this.h == aVar) {
                SystemClock.uptimeMillis();
                this.h = null;
                c();
            }
        } else if (!this.f12541c) {
            SystemClock.uptimeMillis();
            this.g = null;
            C0456a aVar2 = this.f12539a;
            if (aVar2 == null) {
                return;
            }
            if (Looper.myLooper() == Looper.getMainLooper()) {
                aVar2.i(obj);
                return;
            }
            synchronized (aVar2.f5287a) {
                if (aVar2.f5291f == y.f5286k) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                aVar2.f5291f = obj;
            }
            if (z3) {
                C0777a z02 = C0777a.z0();
                C0004c cVar = aVar2.f5293j;
                C0779c cVar2 = z02.f9659i;
                if (cVar2.f9662k == null) {
                    synchronized (cVar2.f9660i) {
                        try {
                            if (cVar2.f9662k == null) {
                                cVar2.f9662k = C0779c.z0(Looper.getMainLooper());
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
                cVar2.f9662k.post(cVar);
            }
        }
    }

    public final void c() {
        if (this.h == null && this.g != null) {
            this.g.getClass();
            C0477a aVar = this.g;
            ThreadPoolExecutor threadPoolExecutor = this.f12543f;
            if (aVar.f7560c != 1) {
                int c3 = C0928e.c(aVar.f7560c);
                if (c3 == 1) {
                    throw new IllegalStateException("Cannot execute task: the task is already running.");
                } else if (c3 != 2) {
                    throw new IllegalStateException("We should never reach this state");
                } else {
                    throw new IllegalStateException("Cannot execute task: the task has already been executed (a task can be executed only once)");
                }
            } else {
                aVar.f7560c = 2;
                aVar.f7558a.getClass();
                threadPoolExecutor.execute(aVar.f7559b);
            }
        }
    }

    public final void d() {
        Iterator it2 = this.f12545j.iterator();
        if (!it2.hasNext()) {
            try {
                this.f12544i.tryAcquire(0, 5, TimeUnit.SECONDS);
            } catch (InterruptedException e6) {
                Log.i("GACSignInLoader", "Unexpected InterruptedException", e6);
                Thread.currentThread().interrupt();
            }
        } else {
            ((o) it2.next()).getClass();
            throw new UnsupportedOperationException();
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(64);
        a.c(sb, this);
        sb.append(" id=");
        sb.append(0);
        sb.append("}");
        return sb.toString();
    }
}
