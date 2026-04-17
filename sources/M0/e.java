package M0;

import Q0.c;
import Q0.f;
import R0.d;
import U0.o;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Handler;

public final class e implements d {

    /* renamed from: a  reason: collision with root package name */
    public final int f1793a;

    /* renamed from: b  reason: collision with root package name */
    public final int f1794b;

    /* renamed from: c  reason: collision with root package name */
    public c f1795c;
    public final Handler d;

    /* renamed from: e  reason: collision with root package name */
    public final int f1796e;

    /* renamed from: f  reason: collision with root package name */
    public final long f1797f;

    /* renamed from: p  reason: collision with root package name */
    public Bitmap f1798p;

    public e(Handler handler, int i2, long j6) {
        if (o.i(Integer.MIN_VALUE, Integer.MIN_VALUE)) {
            this.f1793a = Integer.MIN_VALUE;
            this.f1794b = Integer.MIN_VALUE;
            this.d = handler;
            this.f1796e = i2;
            this.f1797f = j6;
            return;
        }
        throw new IllegalArgumentException("Width and height must both be > 0 or Target#SIZE_ORIGINAL, but given width: -2147483648 and height: -2147483648");
    }

    public final void d(c cVar) {
        this.f1795c = cVar;
    }

    public final void e(f fVar) {
        fVar.n(this.f1793a, this.f1794b);
    }

    public final c g() {
        return this.f1795c;
    }

    public final void h(Drawable drawable) {
        this.f1798p = null;
    }

    public final void i(Object obj) {
        this.f1798p = (Bitmap) obj;
        Handler handler = this.d;
        handler.sendMessageAtTime(handler.obtainMessage(1, this), this.f1797f);
    }

    public final void c() {
    }

    public final void j() {
    }

    public final void k() {
    }

    public final void a(f fVar) {
    }

    public final void b(Drawable drawable) {
    }

    public final void f(Drawable drawable) {
    }
}
