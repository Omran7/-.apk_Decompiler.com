package p2;

import I1.b;
import android.content.Context;
import android.graphics.Typeface;
import android.text.TextPaint;

/* renamed from: p2.c  reason: case insensitive filesystem */
public final class C0915c extends b {

    /* renamed from: p  reason: collision with root package name */
    public final /* synthetic */ Context f10978p;

    /* renamed from: q  reason: collision with root package name */
    public final /* synthetic */ TextPaint f10979q;

    /* renamed from: r  reason: collision with root package name */
    public final /* synthetic */ b f10980r;

    /* renamed from: s  reason: collision with root package name */
    public final /* synthetic */ C0916d f10981s;

    public C0915c(C0916d dVar, Context context, TextPaint textPaint, b bVar) {
        this.f10981s = dVar;
        this.f10978p = context;
        this.f10979q = textPaint;
        this.f10980r = bVar;
    }

    public final void w0(int i2) {
        this.f10980r.w0(i2);
    }

    public final void x0(Typeface typeface, boolean z3) {
        this.f10981s.g(this.f10978p, this.f10979q, typeface);
        this.f10980r.x0(typeface, z3);
    }
}
