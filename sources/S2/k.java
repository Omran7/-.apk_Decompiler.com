package s2;

import I1.b;
import K1.e;
import Y1.a;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;

public final class k {

    /* renamed from: a  reason: collision with root package name */
    public b f11485a = new Object();

    /* renamed from: b  reason: collision with root package name */
    public b f11486b = new Object();

    /* renamed from: c  reason: collision with root package name */
    public b f11487c = new Object();
    public b d = new Object();

    /* renamed from: e  reason: collision with root package name */
    public c f11488e = new C0962a(0.0f);

    /* renamed from: f  reason: collision with root package name */
    public c f11489f = new C0962a(0.0f);
    public c g = new C0962a(0.0f);
    public c h = new C0962a(0.0f);

    /* renamed from: i  reason: collision with root package name */
    public e f11490i = new e(0);

    /* renamed from: j  reason: collision with root package name */
    public e f11491j = new e(0);

    /* renamed from: k  reason: collision with root package name */
    public e f11492k = new e(0);

    /* renamed from: l  reason: collision with root package name */
    public e f11493l = new e(0);

    public static j a(Context context, int i2, int i5, C0962a aVar) {
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, i2);
        if (i5 != 0) {
            contextThemeWrapper = new ContextThemeWrapper(contextThemeWrapper, i5);
        }
        TypedArray obtainStyledAttributes = contextThemeWrapper.obtainStyledAttributes(a.f4265v);
        try {
            int i6 = obtainStyledAttributes.getInt(0, 0);
            int i7 = obtainStyledAttributes.getInt(3, i6);
            int i8 = obtainStyledAttributes.getInt(4, i6);
            int i9 = obtainStyledAttributes.getInt(2, i6);
            int i10 = obtainStyledAttributes.getInt(1, i6);
            c c3 = c(obtainStyledAttributes, 5, aVar);
            c c6 = c(obtainStyledAttributes, 8, c3);
            c c7 = c(obtainStyledAttributes, 9, c3);
            c c8 = c(obtainStyledAttributes, 7, c3);
            c c9 = c(obtainStyledAttributes, 6, c3);
            j jVar = new j();
            b i11 = e.i(i7);
            jVar.f11476a = i11;
            j.b(i11);
            jVar.f11479e = c6;
            b i12 = e.i(i8);
            jVar.f11477b = i12;
            j.b(i12);
            jVar.f11480f = c7;
            b i13 = e.i(i9);
            jVar.f11478c = i13;
            j.b(i13);
            jVar.g = c8;
            b i14 = e.i(i10);
            jVar.d = i14;
            j.b(i14);
            jVar.h = c9;
            return jVar;
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    public static j b(Context context, AttributeSet attributeSet, int i2, int i5) {
        C0962a aVar = new C0962a((float) 0);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a.f4259p, i2, i5);
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        int resourceId2 = obtainStyledAttributes.getResourceId(1, 0);
        obtainStyledAttributes.recycle();
        return a(context, resourceId, resourceId2, aVar);
    }

    public static c c(TypedArray typedArray, int i2, c cVar) {
        TypedValue peekValue = typedArray.peekValue(i2);
        if (peekValue == null) {
            return cVar;
        }
        int i5 = peekValue.type;
        if (i5 == 5) {
            return new C0962a((float) TypedValue.complexToDimensionPixelSize(peekValue.data, typedArray.getResources().getDisplayMetrics()));
        }
        if (i5 == 6) {
            return new h(peekValue.getFraction(1.0f, 1.0f));
        }
        return cVar;
    }

    public final boolean d(RectF rectF) {
        boolean z3;
        boolean z4;
        boolean z5;
        Class<e> cls = e.class;
        if (!this.f11493l.getClass().equals(cls) || !this.f11491j.getClass().equals(cls) || !this.f11490i.getClass().equals(cls) || !this.f11492k.getClass().equals(cls)) {
            z3 = false;
        } else {
            z3 = true;
        }
        float a6 = this.f11488e.a(rectF);
        if (this.f11489f.a(rectF) == a6 && this.h.a(rectF) == a6 && this.g.a(rectF) == a6) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (!(this.f11486b instanceof i) || !(this.f11485a instanceof i) || !(this.f11487c instanceof i) || !(this.d instanceof i)) {
            z5 = false;
        } else {
            z5 = true;
        }
        if (!z3 || !z4 || !z5) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [java.lang.Object, s2.j] */
    public final j e() {
        ? obj = new Object();
        obj.f11476a = this.f11485a;
        obj.f11477b = this.f11486b;
        obj.f11478c = this.f11487c;
        obj.d = this.d;
        obj.f11479e = this.f11488e;
        obj.f11480f = this.f11489f;
        obj.g = this.g;
        obj.h = this.h;
        obj.f11481i = this.f11490i;
        obj.f11482j = this.f11491j;
        obj.f11483k = this.f11492k;
        obj.f11484l = this.f11493l;
        return obj;
    }
}
