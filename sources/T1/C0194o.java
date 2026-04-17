package T1;

import B2.a;
import G1.b;
import android.os.Handler;
import com.google.android.gms.common.internal.I;
import com.google.android.gms.internal.measurement.zzcr;

/* renamed from: T1.o  reason: case insensitive filesystem */
public abstract class C0194o {
    public static volatile zzcr d;

    /* renamed from: a  reason: collision with root package name */
    public final F0 f3413a;

    /* renamed from: b  reason: collision with root package name */
    public final a f3414b;

    /* renamed from: c  reason: collision with root package name */
    public volatile long f3415c;

    public C0194o(F0 f02) {
        I.g(f02);
        this.f3413a = f02;
        this.f3414b = new a(this, f02, 7, false);
    }

    public final void a() {
        this.f3415c = 0;
        d().removeCallbacks(this.f3414b);
    }

    public abstract void b();

    public final void c(long j6) {
        a();
        if (j6 >= 0) {
            F0 f02 = this.f3413a;
            ((b) f02.g()).getClass();
            this.f3415c = System.currentTimeMillis();
            if (!d().postDelayed(this.f3414b, j6)) {
                f02.c().f3172f.b(Long.valueOf(j6), "Failed to schedule delayed post. time");
            }
        }
    }

    public final Handler d() {
        zzcr zzcr;
        if (d != null) {
            return d;
        }
        synchronized (C0194o.class) {
            try {
                if (d == null) {
                    d = new zzcr(this.f3413a.d().getMainLooper());
                }
                zzcr = d;
            } catch (Throwable th) {
                throw th;
            }
        }
        return zzcr;
    }
}
