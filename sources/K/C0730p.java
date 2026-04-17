package k;

import K.D;
import K.O;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import c1.i;
import e.C0476a;
import java.util.WeakHashMap;

/* renamed from: k.p  reason: case insensitive filesystem */
public final class C0730p {

    /* renamed from: a  reason: collision with root package name */
    public final View f9354a;

    /* renamed from: b  reason: collision with root package name */
    public final C0740u f9355b;

    /* renamed from: c  reason: collision with root package name */
    public int f9356c = -1;
    public C0684R0 d;

    /* renamed from: e  reason: collision with root package name */
    public C0684R0 f9357e;

    /* renamed from: f  reason: collision with root package name */
    public C0684R0 f9358f;

    public C0730p(View view) {
        this.f9354a = view;
        this.f9355b = C0740u.a();
    }

    /* JADX WARNING: type inference failed for: r2v5, types: [k.R0, java.lang.Object] */
    public final void a() {
        View view = this.f9354a;
        Drawable background = view.getBackground();
        if (background != null) {
            if (this.d != null) {
                if (this.f9358f == null) {
                    this.f9358f = new Object();
                }
                C0684R0 r02 = this.f9358f;
                r02.f9229a = null;
                r02.d = false;
                r02.f9230b = null;
                r02.f9231c = false;
                WeakHashMap weakHashMap = O.f1352a;
                ColorStateList g = D.g(view);
                if (g != null) {
                    r02.d = true;
                    r02.f9229a = g;
                }
                PorterDuff.Mode h = D.h(view);
                if (h != null) {
                    r02.f9231c = true;
                    r02.f9230b = h;
                }
                if (r02.d || r02.f9231c) {
                    C0740u.e(background, r02, view.getDrawableState());
                    return;
                }
            }
            C0684R0 r03 = this.f9357e;
            if (r03 != null) {
                C0740u.e(background, r03, view.getDrawableState());
                return;
            }
            C0684R0 r04 = this.d;
            if (r04 != null) {
                C0740u.e(background, r04, view.getDrawableState());
            }
        }
    }

    public final ColorStateList b() {
        C0684R0 r02 = this.f9357e;
        if (r02 != null) {
            return r02.f9229a;
        }
        return null;
    }

    public final PorterDuff.Mode c() {
        C0684R0 r02 = this.f9357e;
        if (r02 != null) {
            return r02.f9230b;
        }
        return null;
    }

    public final void d(AttributeSet attributeSet, int i2) {
        ColorStateList f6;
        View view = this.f9354a;
        Context context = view.getContext();
        int[] iArr = C0476a.f7553y;
        i A6 = i.A(context, attributeSet, iArr, i2);
        TypedArray typedArray = (TypedArray) A6.f5606c;
        View view2 = this.f9354a;
        O.k(view2, view2.getContext(), iArr, attributeSet, (TypedArray) A6.f5606c, i2);
        try {
            if (typedArray.hasValue(0)) {
                this.f9356c = typedArray.getResourceId(0, -1);
                C0740u uVar = this.f9355b;
                Context context2 = view.getContext();
                int i5 = this.f9356c;
                synchronized (uVar) {
                    f6 = uVar.f9391a.f(context2, i5);
                }
                if (f6 != null) {
                    g(f6);
                }
            }
            if (typedArray.hasValue(1)) {
                D.q(view, A6.m(1));
            }
            if (typedArray.hasValue(2)) {
                D.r(view, C0725m0.b(typedArray.getInt(2, -1), (PorterDuff.Mode) null));
            }
            A6.G();
        } catch (Throwable th) {
            A6.G();
            throw th;
        }
    }

    public final void e() {
        this.f9356c = -1;
        g((ColorStateList) null);
        a();
    }

    public final void f(int i2) {
        ColorStateList colorStateList;
        this.f9356c = i2;
        C0740u uVar = this.f9355b;
        if (uVar != null) {
            Context context = this.f9354a.getContext();
            synchronized (uVar) {
                colorStateList = uVar.f9391a.f(context, i2);
            }
        } else {
            colorStateList = null;
        }
        g(colorStateList);
        a();
    }

    /* JADX WARNING: type inference failed for: r0v2, types: [k.R0, java.lang.Object] */
    public final void g(ColorStateList colorStateList) {
        if (colorStateList != null) {
            if (this.d == null) {
                this.d = new Object();
            }
            C0684R0 r02 = this.d;
            r02.f9229a = colorStateList;
            r02.d = true;
        } else {
            this.d = null;
        }
        a();
    }

    /* JADX WARNING: type inference failed for: r0v2, types: [k.R0, java.lang.Object] */
    public final void h(ColorStateList colorStateList) {
        if (this.f9357e == null) {
            this.f9357e = new Object();
        }
        C0684R0 r02 = this.f9357e;
        r02.f9229a = colorStateList;
        r02.d = true;
        a();
    }

    /* JADX WARNING: type inference failed for: r0v2, types: [k.R0, java.lang.Object] */
    public final void i(PorterDuff.Mode mode) {
        if (this.f9357e == null) {
            this.f9357e = new Object();
        }
        C0684R0 r02 = this.f9357e;
        r02.f9230b = mode;
        r02.f9231c = true;
        a();
    }
}
