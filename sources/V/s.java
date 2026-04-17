package v;

import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import androidx.constraintlayout.widget.ConstraintLayout;
import s.g;

public abstract class s extends c {

    /* renamed from: q  reason: collision with root package name */
    public boolean f12144q;

    /* renamed from: r  reason: collision with root package name */
    public boolean f12145r;

    public final void e(ConstraintLayout constraintLayout) {
        d(constraintLayout);
    }

    public void g(AttributeSet attributeSet) {
        super.g(attributeSet);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, q.f12138b);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i2 = 0; i2 < indexCount; i2++) {
                int index = obtainStyledAttributes.getIndex(i2);
                if (index == 6) {
                    this.f12144q = true;
                } else if (index == 22) {
                    this.f12145r = true;
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    public abstract void j(g gVar, int i2, int i5);

    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f12144q || this.f12145r) {
            ViewParent parent = getParent();
            if (parent instanceof ConstraintLayout) {
                ConstraintLayout constraintLayout = (ConstraintLayout) parent;
                int visibility = getVisibility();
                float elevation = getElevation();
                for (int i2 = 0; i2 < this.f11954b; i2++) {
                    View view = (View) constraintLayout.f4838a.get(this.f11953a[i2]);
                    if (view != null) {
                        if (this.f12144q) {
                            view.setVisibility(visibility);
                        }
                        if (this.f12145r && elevation > 0.0f) {
                            view.setTranslationZ(view.getTranslationZ() + elevation);
                        }
                    }
                }
            }
        }
    }

    public void setElevation(float f6) {
        super.setElevation(f6);
        ViewParent parent = getParent();
        if (parent != null && (parent instanceof ConstraintLayout)) {
            d((ConstraintLayout) parent);
        }
    }

    public void setVisibility(int i2) {
        super.setVisibility(i2);
        ViewParent parent = getParent();
        if (parent != null && (parent instanceof ConstraintLayout)) {
            d((ConstraintLayout) parent);
        }
    }
}
