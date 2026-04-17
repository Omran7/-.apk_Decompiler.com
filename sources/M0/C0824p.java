package m0;

import android.view.View;
import androidx.emoji2.text.g;

/* renamed from: m0.p  reason: case insensitive filesystem */
public final class C0824p {

    /* renamed from: a  reason: collision with root package name */
    public g f10031a;

    /* renamed from: b  reason: collision with root package name */
    public int f10032b;

    /* renamed from: c  reason: collision with root package name */
    public int f10033c;
    public boolean d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f10034e;

    public C0824p() {
        d();
    }

    public final void a() {
        int i2;
        if (this.d) {
            i2 = this.f10031a.g();
        } else {
            i2 = this.f10031a.k();
        }
        this.f10033c = i2;
    }

    public final void b(View view, int i2) {
        if (this.d) {
            this.f10033c = this.f10031a.m() + this.f10031a.b(view);
        } else {
            this.f10033c = this.f10031a.e(view);
        }
        this.f10032b = i2;
    }

    public final void c(View view, int i2) {
        int m6 = this.f10031a.m();
        if (m6 >= 0) {
            b(view, i2);
            return;
        }
        this.f10032b = i2;
        if (this.d) {
            int g = (this.f10031a.g() - m6) - this.f10031a.b(view);
            this.f10033c = this.f10031a.g() - g;
            if (g > 0) {
                int c3 = this.f10033c - this.f10031a.c(view);
                int k6 = this.f10031a.k();
                int min = c3 - (Math.min(this.f10031a.e(view) - k6, 0) + k6);
                if (min < 0) {
                    this.f10033c = Math.min(g, -min) + this.f10033c;
                    return;
                }
                return;
            }
            return;
        }
        int e6 = this.f10031a.e(view);
        int k7 = e6 - this.f10031a.k();
        this.f10033c = e6;
        if (k7 > 0) {
            int g5 = (this.f10031a.g() - Math.min(0, (this.f10031a.g() - m6) - this.f10031a.b(view))) - (this.f10031a.c(view) + e6);
            if (g5 < 0) {
                this.f10033c -= Math.min(k7, -g5);
            }
        }
    }

    public final void d() {
        this.f10032b = -1;
        this.f10033c = Integer.MIN_VALUE;
        this.d = false;
        this.f10034e = false;
    }

    public final String toString() {
        return "AnchorInfo{mPosition=" + this.f10032b + ", mCoordinate=" + this.f10033c + ", mLayoutFromEnd=" + this.d + ", mValid=" + this.f10034e + '}';
    }
}
