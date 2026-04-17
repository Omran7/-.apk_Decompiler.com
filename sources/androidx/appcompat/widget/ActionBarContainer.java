package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import com.mtma.criminal.city.R;
import e.C0476a;
import k.C0677N0;
import k.C0700a;

public class ActionBarContainer extends FrameLayout {

    /* renamed from: a  reason: collision with root package name */
    public boolean f4710a;

    /* renamed from: b  reason: collision with root package name */
    public View f4711b;

    /* renamed from: c  reason: collision with root package name */
    public View f4712c;
    public Drawable d;

    /* renamed from: e  reason: collision with root package name */
    public Drawable f4713e;

    /* renamed from: f  reason: collision with root package name */
    public Drawable f4714f;

    /* renamed from: p  reason: collision with root package name */
    public final boolean f4715p;

    /* renamed from: q  reason: collision with root package name */
    public boolean f4716q;

    /* renamed from: r  reason: collision with root package name */
    public final int f4717r;

    public ActionBarContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setBackground(new C0700a(this));
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0476a.f7532a);
        boolean z3 = false;
        this.d = obtainStyledAttributes.getDrawable(0);
        this.f4713e = obtainStyledAttributes.getDrawable(2);
        this.f4717r = obtainStyledAttributes.getDimensionPixelSize(13, -1);
        if (getId() == R.id.split_action_bar) {
            this.f4715p = true;
            this.f4714f = obtainStyledAttributes.getDrawable(1);
        }
        obtainStyledAttributes.recycle();
        if (!this.f4715p ? this.d == null && this.f4713e == null : this.f4714f == null) {
            z3 = true;
        }
        setWillNotDraw(z3);
    }

    public final void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.d;
        if (drawable != null && drawable.isStateful()) {
            this.d.setState(getDrawableState());
        }
        Drawable drawable2 = this.f4713e;
        if (drawable2 != null && drawable2.isStateful()) {
            this.f4713e.setState(getDrawableState());
        }
        Drawable drawable3 = this.f4714f;
        if (drawable3 != null && drawable3.isStateful()) {
            this.f4714f.setState(getDrawableState());
        }
    }

    public View getTabContainer() {
        return null;
    }

    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.d;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        Drawable drawable2 = this.f4713e;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
        Drawable drawable3 = this.f4714f;
        if (drawable3 != null) {
            drawable3.jumpToCurrentState();
        }
    }

    public final void onFinishInflate() {
        super.onFinishInflate();
        this.f4711b = findViewById(R.id.action_bar);
        this.f4712c = findViewById(R.id.action_context_bar);
    }

    public final boolean onHoverEvent(MotionEvent motionEvent) {
        super.onHoverEvent(motionEvent);
        return true;
    }

    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.f4710a || super.onInterceptTouchEvent(motionEvent)) {
            return true;
        }
        return false;
    }

    public final void onLayout(boolean z3, int i2, int i5, int i6, int i7) {
        super.onLayout(z3, i2, i5, i6, i7);
        boolean z4 = true;
        if (this.f4715p) {
            Drawable drawable = this.f4714f;
            if (drawable != null) {
                drawable.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            } else {
                z4 = false;
            }
        } else {
            if (this.d == null) {
                z4 = false;
            } else if (this.f4711b.getVisibility() == 0) {
                this.d.setBounds(this.f4711b.getLeft(), this.f4711b.getTop(), this.f4711b.getRight(), this.f4711b.getBottom());
            } else {
                View view = this.f4712c;
                if (view == null || view.getVisibility() != 0) {
                    this.d.setBounds(0, 0, 0, 0);
                } else {
                    this.d.setBounds(this.f4712c.getLeft(), this.f4712c.getTop(), this.f4712c.getRight(), this.f4712c.getBottom());
                }
            }
            this.f4716q = false;
        }
        if (z4) {
            invalidate();
        }
    }

    public final void onMeasure(int i2, int i5) {
        int i6;
        if (this.f4711b == null && View.MeasureSpec.getMode(i5) == Integer.MIN_VALUE && (i6 = this.f4717r) >= 0) {
            i5 = View.MeasureSpec.makeMeasureSpec(Math.min(i6, View.MeasureSpec.getSize(i5)), Integer.MIN_VALUE);
        }
        super.onMeasure(i2, i5);
        if (this.f4711b != null) {
            View.MeasureSpec.getMode(i5);
        }
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        super.onTouchEvent(motionEvent);
        return true;
    }

    public void setPrimaryBackground(Drawable drawable) {
        Drawable drawable2 = this.d;
        if (drawable2 != null) {
            drawable2.setCallback((Drawable.Callback) null);
            unscheduleDrawable(this.d);
        }
        this.d = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            View view = this.f4711b;
            if (view != null) {
                this.d.setBounds(view.getLeft(), this.f4711b.getTop(), this.f4711b.getRight(), this.f4711b.getBottom());
            }
        }
        boolean z3 = false;
        if (!this.f4715p ? this.d == null && this.f4713e == null : this.f4714f == null) {
            z3 = true;
        }
        setWillNotDraw(z3);
        invalidate();
        invalidateOutline();
    }

    public void setSplitBackground(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.f4714f;
        if (drawable3 != null) {
            drawable3.setCallback((Drawable.Callback) null);
            unscheduleDrawable(this.f4714f);
        }
        this.f4714f = drawable;
        boolean z3 = this.f4715p;
        boolean z4 = false;
        if (drawable != null) {
            drawable.setCallback(this);
            if (z3 && (drawable2 = this.f4714f) != null) {
                drawable2.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            }
        }
        if (!z3 ? this.d == null && this.f4713e == null : this.f4714f == null) {
            z4 = true;
        }
        setWillNotDraw(z4);
        invalidate();
        invalidateOutline();
    }

    public void setStackedBackground(Drawable drawable) {
        Drawable drawable2 = this.f4713e;
        if (drawable2 != null) {
            drawable2.setCallback((Drawable.Callback) null);
            unscheduleDrawable(this.f4713e);
        }
        this.f4713e = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            if (this.f4716q && this.f4713e != null) {
                throw null;
            }
        }
        boolean z3 = false;
        if (!this.f4715p ? this.d == null && this.f4713e == null : this.f4714f == null) {
            z3 = true;
        }
        setWillNotDraw(z3);
        invalidate();
        invalidateOutline();
    }

    public void setTransitioning(boolean z3) {
        int i2;
        this.f4710a = z3;
        if (z3) {
            i2 = 393216;
        } else {
            i2 = 262144;
        }
        setDescendantFocusability(i2);
    }

    public void setVisibility(int i2) {
        boolean z3;
        super.setVisibility(i2);
        if (i2 == 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        Drawable drawable = this.d;
        if (drawable != null) {
            drawable.setVisible(z3, false);
        }
        Drawable drawable2 = this.f4713e;
        if (drawable2 != null) {
            drawable2.setVisible(z3, false);
        }
        Drawable drawable3 = this.f4714f;
        if (drawable3 != null) {
            drawable3.setVisible(z3, false);
        }
    }

    public final ActionMode startActionModeForChild(View view, ActionMode.Callback callback) {
        return null;
    }

    public final boolean verifyDrawable(Drawable drawable) {
        Drawable drawable2 = this.d;
        boolean z3 = this.f4715p;
        if ((drawable != drawable2 || z3) && ((drawable != this.f4713e || !this.f4716q) && ((drawable != this.f4714f || !z3) && !super.verifyDrawable(drawable)))) {
            return false;
        }
        return true;
    }

    public final ActionMode startActionModeForChild(View view, ActionMode.Callback callback, int i2) {
        if (i2 != 0) {
            return super.startActionModeForChild(view, callback, i2);
        }
        return null;
    }

    public void setTabContainer(C0677N0 n02) {
    }
}
