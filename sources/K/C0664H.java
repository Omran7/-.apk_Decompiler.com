package k;

import D.a;
import D.b;
import K.O;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.AbsSeekBar;
import c1.i;
import com.mtma.criminal.city.R;
import e.C0476a;

/* renamed from: k.H  reason: case insensitive filesystem */
public final class C0664H extends C0654C {

    /* renamed from: e  reason: collision with root package name */
    public final C0662G f9180e;

    /* renamed from: f  reason: collision with root package name */
    public Drawable f9181f;
    public ColorStateList g = null;
    public PorterDuff.Mode h = null;

    /* renamed from: i  reason: collision with root package name */
    public boolean f9182i = false;

    /* renamed from: j  reason: collision with root package name */
    public boolean f9183j = false;

    public C0664H(C0662G g5) {
        super((AbsSeekBar) g5);
        this.f9180e = g5;
    }

    public final void b(AttributeSet attributeSet, int i2) {
        super.b(attributeSet, R.attr.seekBarStyle);
        C0662G g5 = this.f9180e;
        Context context = g5.getContext();
        int[] iArr = C0476a.g;
        i A6 = i.A(context, attributeSet, iArr, R.attr.seekBarStyle);
        O.k(g5, g5.getContext(), iArr, attributeSet, (TypedArray) A6.f5606c, R.attr.seekBarStyle);
        Drawable o6 = A6.o(0);
        if (o6 != null) {
            g5.setThumb(o6);
        }
        Drawable n2 = A6.n(1);
        Drawable drawable = this.f9181f;
        if (drawable != null) {
            drawable.setCallback((Drawable.Callback) null);
        }
        this.f9181f = n2;
        if (n2 != null) {
            n2.setCallback(g5);
            b.b(n2, g5.getLayoutDirection());
            if (n2.isStateful()) {
                n2.setState(g5.getDrawableState());
            }
            f();
        }
        g5.invalidate();
        TypedArray typedArray = (TypedArray) A6.f5606c;
        if (typedArray.hasValue(3)) {
            this.h = C0725m0.b(typedArray.getInt(3, -1), this.h);
            this.f9183j = true;
        }
        if (typedArray.hasValue(2)) {
            this.g = A6.m(2);
            this.f9182i = true;
        }
        A6.G();
        f();
    }

    public final void f() {
        Drawable drawable = this.f9181f;
        if (drawable == null) {
            return;
        }
        if (this.f9182i || this.f9183j) {
            Drawable mutate = drawable.mutate();
            this.f9181f = mutate;
            if (this.f9182i) {
                a.h(mutate, this.g);
            }
            if (this.f9183j) {
                a.i(this.f9181f, this.h);
            }
            if (this.f9181f.isStateful()) {
                this.f9181f.setState(this.f9180e.getDrawableState());
            }
        }
    }

    public final void g(Canvas canvas) {
        int i2;
        if (this.f9181f != null) {
            C0662G g5 = this.f9180e;
            int max = g5.getMax();
            int i5 = 1;
            if (max > 1) {
                int intrinsicWidth = this.f9181f.getIntrinsicWidth();
                int intrinsicHeight = this.f9181f.getIntrinsicHeight();
                if (intrinsicWidth >= 0) {
                    i2 = intrinsicWidth / 2;
                } else {
                    i2 = 1;
                }
                if (intrinsicHeight >= 0) {
                    i5 = intrinsicHeight / 2;
                }
                this.f9181f.setBounds(-i2, -i5, i2, i5);
                float width = ((float) ((g5.getWidth() - g5.getPaddingLeft()) - g5.getPaddingRight())) / ((float) max);
                int save = canvas.save();
                canvas.translate((float) g5.getPaddingLeft(), (float) (g5.getHeight() / 2));
                for (int i6 = 0; i6 <= max; i6++) {
                    this.f9181f.draw(canvas);
                    canvas.translate(width, 0.0f);
                }
                canvas.restoreToCount(save);
            }
        }
    }
}
