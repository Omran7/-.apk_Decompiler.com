package androidx.lifecycle;

import A4.a;
import S3.t;
import android.os.Handler;
import kotlin.jvm.internal.j;

public final class D implements C0307s {

    /* renamed from: r  reason: collision with root package name */
    public static final D f5211r = new D();

    /* renamed from: a  reason: collision with root package name */
    public int f5212a;

    /* renamed from: b  reason: collision with root package name */
    public int f5213b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f5214c = true;
    public boolean d = true;

    /* renamed from: e  reason: collision with root package name */
    public Handler f5215e;

    /* renamed from: f  reason: collision with root package name */
    public final C0309u f5216f = new C0309u(this);

    /* renamed from: p  reason: collision with root package name */
    public final a f5217p = new a(this, 8);

    /* renamed from: q  reason: collision with root package name */
    public final t f5218q = new t(this, 16);

    public final void b() {
        int i2 = this.f5213b + 1;
        this.f5213b = i2;
        if (i2 != 1) {
            return;
        }
        if (this.f5214c) {
            this.f5216f.d(C0302m.ON_RESUME);
            this.f5214c = false;
            return;
        }
        Handler handler = this.f5215e;
        j.b(handler);
        handler.removeCallbacks(this.f5217p);
    }

    public final C0309u h() {
        return this.f5216f;
    }
}
