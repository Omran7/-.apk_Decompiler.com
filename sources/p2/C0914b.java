package p2;

import B.b;
import android.graphics.Typeface;

/* renamed from: p2.b  reason: case insensitive filesystem */
public final class C0914b extends b {
    public final /* synthetic */ I1.b h;

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ C0916d f10977i;

    public C0914b(C0916d dVar, I1.b bVar) {
        this.f10977i = dVar;
        this.h = bVar;
    }

    public final void g(int i2) {
        this.f10977i.f10991m = true;
        this.h.w0(i2);
    }

    public final void h(Typeface typeface) {
        C0916d dVar = this.f10977i;
        dVar.f10992n = Typeface.create(typeface, dVar.f10984c);
        dVar.f10991m = true;
        this.h.x0(dVar.f10992n, false);
    }
}
