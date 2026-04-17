package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import e.C0476a;
import java.lang.ref.WeakReference;
import k.g1;

public final class ViewStubCompat extends View {

    /* renamed from: a  reason: collision with root package name */
    public int f4831a = 0;

    /* renamed from: b  reason: collision with root package name */
    public int f4832b;

    /* renamed from: c  reason: collision with root package name */
    public WeakReference f4833c;
    public LayoutInflater d;

    public ViewStubCompat(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0476a.f7554z, 0, 0);
        this.f4832b = obtainStyledAttributes.getResourceId(2, -1);
        this.f4831a = obtainStyledAttributes.getResourceId(1, 0);
        setId(obtainStyledAttributes.getResourceId(0, -1));
        obtainStyledAttributes.recycle();
        setVisibility(8);
        setWillNotDraw(true);
    }

    public final View a() {
        ViewParent parent = getParent();
        if (!(parent instanceof ViewGroup)) {
            throw new IllegalStateException("ViewStub must have a non-null ViewGroup viewParent");
        } else if (this.f4831a != 0) {
            ViewGroup viewGroup = (ViewGroup) parent;
            LayoutInflater layoutInflater = this.d;
            if (layoutInflater == null) {
                layoutInflater = LayoutInflater.from(getContext());
            }
            View inflate = layoutInflater.inflate(this.f4831a, viewGroup, false);
            int i2 = this.f4832b;
            if (i2 != -1) {
                inflate.setId(i2);
            }
            int indexOfChild = viewGroup.indexOfChild(this);
            viewGroup.removeViewInLayout(this);
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            if (layoutParams != null) {
                viewGroup.addView(inflate, indexOfChild, layoutParams);
            } else {
                viewGroup.addView(inflate, indexOfChild);
            }
            this.f4833c = new WeakReference(inflate);
            return inflate;
        } else {
            throw new IllegalArgumentException("ViewStub must have a valid layoutResource");
        }
    }

    public final void dispatchDraw(Canvas canvas) {
    }

    public final void draw(Canvas canvas) {
    }

    public int getInflatedId() {
        return this.f4832b;
    }

    public LayoutInflater getLayoutInflater() {
        return this.d;
    }

    public int getLayoutResource() {
        return this.f4831a;
    }

    public final void onMeasure(int i2, int i5) {
        setMeasuredDimension(0, 0);
    }

    public void setInflatedId(int i2) {
        this.f4832b = i2;
    }

    public void setLayoutInflater(LayoutInflater layoutInflater) {
        this.d = layoutInflater;
    }

    public void setLayoutResource(int i2) {
        this.f4831a = i2;
    }

    public void setVisibility(int i2) {
        WeakReference weakReference = this.f4833c;
        if (weakReference != null) {
            View view = (View) weakReference.get();
            if (view != null) {
                view.setVisibility(i2);
                return;
            }
            throw new IllegalStateException("setVisibility called on un-referenced view");
        }
        super.setVisibility(i2);
        if (i2 == 0 || i2 == 4) {
            a();
        }
    }

    public void setOnInflateListener(g1 g1Var) {
    }
}
