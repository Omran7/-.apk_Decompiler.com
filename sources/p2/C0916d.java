package p2;

import B.p;
import I1.b;
import K1.e;
import Y1.a;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.util.Log;
import android.util.TypedValue;
import com.bumptech.glide.d;

/* renamed from: p2.d  reason: case insensitive filesystem */
public final class C0916d {

    /* renamed from: a  reason: collision with root package name */
    public final ColorStateList f10982a;

    /* renamed from: b  reason: collision with root package name */
    public final String f10983b;

    /* renamed from: c  reason: collision with root package name */
    public final int f10984c;
    public final int d;

    /* renamed from: e  reason: collision with root package name */
    public final float f10985e;

    /* renamed from: f  reason: collision with root package name */
    public final float f10986f;
    public final float g;
    public final boolean h;

    /* renamed from: i  reason: collision with root package name */
    public final float f10987i;

    /* renamed from: j  reason: collision with root package name */
    public final ColorStateList f10988j;

    /* renamed from: k  reason: collision with root package name */
    public float f10989k;

    /* renamed from: l  reason: collision with root package name */
    public final int f10990l;

    /* renamed from: m  reason: collision with root package name */
    public boolean f10991m = false;

    /* renamed from: n  reason: collision with root package name */
    public Typeface f10992n;

    public C0916d(Context context, int i2) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i2, a.f4268y);
        this.f10989k = obtainStyledAttributes.getDimension(0, 0.0f);
        this.f10988j = d.a0(context, obtainStyledAttributes, 3);
        d.a0(context, obtainStyledAttributes, 4);
        d.a0(context, obtainStyledAttributes, 5);
        this.f10984c = obtainStyledAttributes.getInt(2, 0);
        this.d = obtainStyledAttributes.getInt(1, 1);
        int i5 = !obtainStyledAttributes.hasValue(12) ? 10 : 12;
        this.f10990l = obtainStyledAttributes.getResourceId(i5, 0);
        this.f10983b = obtainStyledAttributes.getString(i5);
        obtainStyledAttributes.getBoolean(14, false);
        this.f10982a = d.a0(context, obtainStyledAttributes, 6);
        this.f10985e = obtainStyledAttributes.getFloat(7, 0.0f);
        this.f10986f = obtainStyledAttributes.getFloat(8, 0.0f);
        this.g = obtainStyledAttributes.getFloat(9, 0.0f);
        obtainStyledAttributes.recycle();
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(i2, a.f4260q);
        this.h = obtainStyledAttributes2.hasValue(0);
        this.f10987i = obtainStyledAttributes2.getFloat(0, 0.0f);
        obtainStyledAttributes2.recycle();
    }

    public final void a() {
        String str;
        Typeface typeface = this.f10992n;
        int i2 = this.f10984c;
        if (typeface == null && (str = this.f10983b) != null) {
            this.f10992n = Typeface.create(str, i2);
        }
        if (this.f10992n == null) {
            int i5 = this.d;
            if (i5 == 1) {
                this.f10992n = Typeface.SANS_SERIF;
            } else if (i5 == 2) {
                this.f10992n = Typeface.SERIF;
            } else if (i5 != 3) {
                this.f10992n = Typeface.DEFAULT;
            } else {
                this.f10992n = Typeface.MONOSPACE;
            }
            this.f10992n = Typeface.create(this.f10992n, i2);
        }
    }

    public final Typeface b(Context context) {
        if (this.f10991m) {
            return this.f10992n;
        }
        if (!context.isRestricted()) {
            try {
                Typeface a6 = p.a(context, this.f10990l);
                this.f10992n = a6;
                if (a6 != null) {
                    this.f10992n = Typeface.create(a6, this.f10984c);
                }
            } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
            } catch (Exception e6) {
                Log.d("TextAppearance", "Error loading font " + this.f10983b, e6);
            }
        }
        a();
        this.f10991m = true;
        return this.f10992n;
    }

    public final void c(Context context, b bVar) {
        if (d(context)) {
            b(context);
        } else {
            a();
        }
        int i2 = this.f10990l;
        if (i2 == 0) {
            this.f10991m = true;
        }
        if (this.f10991m) {
            bVar.x0(this.f10992n, true);
            return;
        }
        try {
            C0914b bVar2 = new C0914b(this, bVar);
            ThreadLocal threadLocal = p.f164a;
            if (context.isRestricted()) {
                bVar2.a(-4);
                return;
            }
            p.b(context, i2, new TypedValue(), 0, bVar2, false, false);
        } catch (Resources.NotFoundException unused) {
            this.f10991m = true;
            bVar.w0(1);
        } catch (Exception e6) {
            Log.d("TextAppearance", "Error loading font " + this.f10983b, e6);
            this.f10991m = true;
            bVar.w0(-3);
        }
    }

    public final boolean d(Context context) {
        Typeface typeface = null;
        int i2 = this.f10990l;
        if (i2 != 0) {
            ThreadLocal threadLocal = p.f164a;
            if (!context.isRestricted()) {
                typeface = p.b(context, i2, new TypedValue(), 0, (B.b) null, false, true);
            }
        }
        if (typeface != null) {
            return true;
        }
        return false;
    }

    public final void e(Context context, TextPaint textPaint, b bVar) {
        int i2;
        int i5;
        f(context, textPaint, bVar);
        ColorStateList colorStateList = this.f10988j;
        if (colorStateList != null) {
            i2 = colorStateList.getColorForState(textPaint.drawableState, colorStateList.getDefaultColor());
        } else {
            i2 = -16777216;
        }
        textPaint.setColor(i2);
        ColorStateList colorStateList2 = this.f10982a;
        if (colorStateList2 != null) {
            i5 = colorStateList2.getColorForState(textPaint.drawableState, colorStateList2.getDefaultColor());
        } else {
            i5 = 0;
        }
        textPaint.setShadowLayer(this.g, this.f10985e, this.f10986f, i5);
    }

    public final void f(Context context, TextPaint textPaint, b bVar) {
        if (d(context)) {
            g(context, textPaint, b(context));
            return;
        }
        a();
        g(context, textPaint, this.f10992n);
        c(context, new C0915c(this, context, textPaint, bVar));
    }

    public final void g(Context context, TextPaint textPaint, Typeface typeface) {
        boolean z3;
        float f6;
        Typeface j02 = e.j0(context.getResources().getConfiguration(), typeface);
        if (j02 != null) {
            typeface = j02;
        }
        textPaint.setTypeface(typeface);
        int i2 = (~typeface.getStyle()) & this.f10984c;
        if ((i2 & 1) != 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        textPaint.setFakeBoldText(z3);
        if ((i2 & 2) != 0) {
            f6 = -0.25f;
        } else {
            f6 = 0.0f;
        }
        textPaint.setTextSkewX(f6);
        textPaint.setTextSize(this.f10989k);
        if (this.h) {
            textPaint.setLetterSpacing(this.f10987i);
        }
    }
}
