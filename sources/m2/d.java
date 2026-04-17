package m2;

import Y1.a;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.Gravity;
import k.C0749y0;

public abstract class d extends C0749y0 {

    /* renamed from: A  reason: collision with root package name */
    public final Rect f10129A = new Rect();

    /* renamed from: B  reason: collision with root package name */
    public int f10130B = 119;

    /* renamed from: C  reason: collision with root package name */
    public final boolean f10131C = true;

    /* renamed from: D  reason: collision with root package name */
    public boolean f10132D = false;

    /* renamed from: y  reason: collision with root package name */
    public Drawable f10133y;

    /* renamed from: z  reason: collision with root package name */
    public final Rect f10134z = new Rect();

    public d(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        int[] iArr = a.h;
        k.a(context, attributeSet, 0, 0);
        k.b(context, attributeSet, iArr, 0, 0, new int[0]);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, 0, 0);
        this.f10130B = obtainStyledAttributes.getInt(1, this.f10130B);
        Drawable drawable = obtainStyledAttributes.getDrawable(0);
        if (drawable != null) {
            setForeground(drawable);
        }
        this.f10131C = obtainStyledAttributes.getBoolean(2, true);
        obtainStyledAttributes.recycle();
    }

    public final void draw(Canvas canvas) {
        super.draw(canvas);
        Drawable drawable = this.f10133y;
        if (drawable != null) {
            if (this.f10132D) {
                this.f10132D = false;
                int right = getRight() - getLeft();
                int bottom = getBottom() - getTop();
                boolean z3 = this.f10131C;
                Rect rect = this.f10134z;
                if (z3) {
                    rect.set(0, 0, right, bottom);
                } else {
                    rect.set(getPaddingLeft(), getPaddingTop(), right - getPaddingRight(), bottom - getPaddingBottom());
                }
                int i2 = this.f10130B;
                int intrinsicWidth = drawable.getIntrinsicWidth();
                int intrinsicHeight = drawable.getIntrinsicHeight();
                Rect rect2 = this.f10129A;
                Gravity.apply(i2, intrinsicWidth, intrinsicHeight, rect, rect2);
                drawable.setBounds(rect2);
            }
            drawable.draw(canvas);
        }
    }

    public final void drawableHotspotChanged(float f6, float f7) {
        super.drawableHotspotChanged(f6, f7);
        Drawable drawable = this.f10133y;
        if (drawable != null) {
            drawable.setHotspot(f6, f7);
        }
    }

    public final void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f10133y;
        if (drawable != null && drawable.isStateful()) {
            this.f10133y.setState(getDrawableState());
        }
    }

    public Drawable getForeground() {
        return this.f10133y;
    }

    public int getForegroundGravity() {
        return this.f10130B;
    }

    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f10133y;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    public final void onLayout(boolean z3, int i2, int i5, int i6, int i7) {
        super.onLayout(z3, i2, i5, i6, i7);
        this.f10132D = z3 | this.f10132D;
    }

    public final void onSizeChanged(int i2, int i5, int i6, int i7) {
        super.onSizeChanged(i2, i5, i6, i7);
        this.f10132D = true;
    }

    public void setForeground(Drawable drawable) {
        Drawable drawable2 = this.f10133y;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback((Drawable.Callback) null);
                unscheduleDrawable(this.f10133y);
            }
            this.f10133y = drawable;
            this.f10132D = true;
            if (drawable != null) {
                setWillNotDraw(false);
                drawable.setCallback(this);
                if (drawable.isStateful()) {
                    drawable.setState(getDrawableState());
                }
                if (this.f10130B == 119) {
                    drawable.getPadding(new Rect());
                }
            } else {
                setWillNotDraw(true);
            }
            requestLayout();
            invalidate();
        }
    }

    public void setForegroundGravity(int i2) {
        if (this.f10130B != i2) {
            if ((8388615 & i2) == 0) {
                i2 |= 8388611;
            }
            if ((i2 & 112) == 0) {
                i2 |= 48;
            }
            this.f10130B = i2;
            if (i2 == 119 && this.f10133y != null) {
                this.f10133y.getPadding(new Rect());
            }
            requestLayout();
        }
    }

    public final boolean verifyDrawable(Drawable drawable) {
        if (super.verifyDrawable(drawable) || drawable == this.f10133y) {
            return true;
        }
        return false;
    }
}
