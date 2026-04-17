package k;

import R2.b;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;

/* renamed from: k.q  reason: case insensitive filesystem */
public class C0732q extends Button {

    /* renamed from: a  reason: collision with root package name */
    public final C0730p f9359a;

    /* renamed from: b  reason: collision with root package name */
    public final C0695X f9360b;

    /* renamed from: c  reason: collision with root package name */
    public C0746x f9361c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C0732q(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        C0683Q0.a(context);
        C0681P0.a(this, getContext());
        C0730p pVar = new C0730p(this);
        this.f9359a = pVar;
        pVar.d(attributeSet, i2);
        C0695X x6 = new C0695X(this);
        this.f9360b = x6;
        x6.f(attributeSet, i2);
        x6.b();
        getEmojiTextViewHelper().a(attributeSet, i2);
    }

    private C0746x getEmojiTextViewHelper() {
        if (this.f9361c == null) {
            this.f9361c = new C0746x(this);
        }
        return this.f9361c;
    }

    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C0730p pVar = this.f9359a;
        if (pVar != null) {
            pVar.a();
        }
        C0695X x6 = this.f9360b;
        if (x6 != null) {
            x6.b();
        }
    }

    public int getAutoSizeMaxTextSize() {
        if (i1.f9317c) {
            return super.getAutoSizeMaxTextSize();
        }
        C0695X x6 = this.f9360b;
        if (x6 != null) {
            return Math.round(x6.f9247i.f9307e);
        }
        return -1;
    }

    public int getAutoSizeMinTextSize() {
        if (i1.f9317c) {
            return super.getAutoSizeMinTextSize();
        }
        C0695X x6 = this.f9360b;
        if (x6 != null) {
            return Math.round(x6.f9247i.d);
        }
        return -1;
    }

    public int getAutoSizeStepGranularity() {
        if (i1.f9317c) {
            return super.getAutoSizeStepGranularity();
        }
        C0695X x6 = this.f9360b;
        if (x6 != null) {
            return Math.round(x6.f9247i.f9306c);
        }
        return -1;
    }

    public int[] getAutoSizeTextAvailableSizes() {
        if (i1.f9317c) {
            return super.getAutoSizeTextAvailableSizes();
        }
        C0695X x6 = this.f9360b;
        if (x6 != null) {
            return x6.f9247i.f9308f;
        }
        return new int[0];
    }

    public int getAutoSizeTextType() {
        if (!i1.f9317c) {
            C0695X x6 = this.f9360b;
            if (x6 != null) {
                return x6.f9247i.f9304a;
            }
            return 0;
        } else if (super.getAutoSizeTextType() == 1) {
            return 1;
        } else {
            return 0;
        }
    }

    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return b.Y0(super.getCustomSelectionActionModeCallback());
    }

    public ColorStateList getSupportBackgroundTintList() {
        C0730p pVar = this.f9359a;
        if (pVar != null) {
            return pVar.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0730p pVar = this.f9359a;
        if (pVar != null) {
            return pVar.c();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f9360b.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f9360b.e();
    }

    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(Button.class.getName());
    }

    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(Button.class.getName());
    }

    public void onLayout(boolean z3, int i2, int i5, int i6, int i7) {
        super.onLayout(z3, i2, i5, i6, i7);
        C0695X x6 = this.f9360b;
        if (x6 != null && !i1.f9317c) {
            x6.f9247i.a();
        }
    }

    public void onTextChanged(CharSequence charSequence, int i2, int i5, int i6) {
        super.onTextChanged(charSequence, i2, i5, i6);
        C0695X x6 = this.f9360b;
        if (x6 != null && !i1.f9317c) {
            C0715h0 h0Var = x6.f9247i;
            if (h0Var.f()) {
                h0Var.a();
            }
        }
    }

    public void setAllCaps(boolean z3) {
        super.setAllCaps(z3);
        getEmojiTextViewHelper().b(z3);
    }

    public final void setAutoSizeTextTypeUniformWithConfiguration(int i2, int i5, int i6, int i7) {
        if (i1.f9317c) {
            super.setAutoSizeTextTypeUniformWithConfiguration(i2, i5, i6, i7);
            return;
        }
        C0695X x6 = this.f9360b;
        if (x6 != null) {
            x6.i(i2, i5, i6, i7);
        }
    }

    public final void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i2) {
        if (i1.f9317c) {
            super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i2);
            return;
        }
        C0695X x6 = this.f9360b;
        if (x6 != null) {
            x6.j(iArr, i2);
        }
    }

    public void setAutoSizeTextTypeWithDefaults(int i2) {
        if (i1.f9317c) {
            super.setAutoSizeTextTypeWithDefaults(i2);
            return;
        }
        C0695X x6 = this.f9360b;
        if (x6 != null) {
            x6.k(i2);
        }
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0730p pVar = this.f9359a;
        if (pVar != null) {
            pVar.e();
        }
    }

    public void setBackgroundResource(int i2) {
        super.setBackgroundResource(i2);
        C0730p pVar = this.f9359a;
        if (pVar != null) {
            pVar.f(i2);
        }
    }

    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(b.d1(callback, this));
    }

    public void setEmojiCompatEnabled(boolean z3) {
        getEmojiTextViewHelper().c(z3);
    }

    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(((I1.b) getEmojiTextViewHelper().f9409b.f2796b).I(inputFilterArr));
    }

    public void setSupportAllCaps(boolean z3) {
        C0695X x6 = this.f9360b;
        if (x6 != null) {
            x6.f9242a.setAllCaps(z3);
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0730p pVar = this.f9359a;
        if (pVar != null) {
            pVar.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0730p pVar = this.f9359a;
        if (pVar != null) {
            pVar.i(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        C0695X x6 = this.f9360b;
        x6.l(colorStateList);
        x6.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        C0695X x6 = this.f9360b;
        x6.m(mode);
        x6.b();
    }

    public final void setTextAppearance(Context context, int i2) {
        super.setTextAppearance(context, i2);
        C0695X x6 = this.f9360b;
        if (x6 != null) {
            x6.g(context, i2);
        }
    }

    public final void setTextSize(int i2, float f6) {
        boolean z3 = i1.f9317c;
        if (z3) {
            super.setTextSize(i2, f6);
            return;
        }
        C0695X x6 = this.f9360b;
        if (x6 != null && !z3) {
            C0715h0 h0Var = x6.f9247i;
            if (!h0Var.f()) {
                h0Var.g(i2, f6);
            }
        }
    }
}
