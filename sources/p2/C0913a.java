package p2;

import I1.b;
import android.graphics.Typeface;
import k.C0724m;
import m2.C0836b;

/* renamed from: p2.a  reason: case insensitive filesystem */
public final class C0913a extends b {

    /* renamed from: p  reason: collision with root package name */
    public final Typeface f10974p;

    /* renamed from: q  reason: collision with root package name */
    public final C0724m f10975q;

    /* renamed from: r  reason: collision with root package name */
    public boolean f10976r;

    public C0913a(C0724m mVar, Typeface typeface) {
        this.f10974p = typeface;
        this.f10975q = mVar;
    }

    public final void w0(int i2) {
        if (!this.f10976r) {
            C0836b bVar = (C0836b) this.f10975q.f9345b;
            if (bVar.j(this.f10974p)) {
                bVar.h(false);
            }
        }
    }

    public final void x0(Typeface typeface, boolean z3) {
        if (!this.f10976r) {
            C0836b bVar = (C0836b) this.f10975q.f9345b;
            if (bVar.j(typeface)) {
                bVar.h(false);
            }
        }
    }
}
