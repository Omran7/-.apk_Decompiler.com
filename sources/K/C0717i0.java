package k;

import I1.b;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.widget.ToggleButton;

/* renamed from: k.i0  reason: case insensitive filesystem */
public final class C0717i0 extends ToggleButton {

    /* renamed from: a  reason: collision with root package name */
    public final C0730p f9312a;

    /* renamed from: b  reason: collision with root package name */
    public final C0695X f9313b;

    /* renamed from: c  reason: collision with root package name */
    public C0746x f9314c;

    public C0717i0(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 16842827);
        C0681P0.a(this, getContext());
        C0730p pVar = new C0730p(this);
        this.f9312a = pVar;
        pVar.d(attributeSet, 16842827);
        C0695X x6 = new C0695X(this);
        this.f9313b = x6;
        x6.f(attributeSet, 16842827);
        getEmojiTextViewHelper().a(attributeSet, 16842827);
    }

    private C0746x getEmojiTextViewHelper() {
        if (this.f9314c == null) {
            this.f9314c = new C0746x(this);
        }
        return this.f9314c;
    }

    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C0730p pVar = this.f9312a;
        if (pVar != null) {
            pVar.a();
        }
        C0695X x6 = this.f9313b;
        if (x6 != null) {
            x6.b();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        C0730p pVar = this.f9312a;
        if (pVar != null) {
            return pVar.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0730p pVar = this.f9312a;
        if (pVar != null) {
            return pVar.c();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f9313b.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f9313b.e();
    }

    public void setAllCaps(boolean z3) {
        super.setAllCaps(z3);
        getEmojiTextViewHelper().b(z3);
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0730p pVar = this.f9312a;
        if (pVar != null) {
            pVar.e();
        }
    }

    public void setBackgroundResource(int i2) {
        super.setBackgroundResource(i2);
        C0730p pVar = this.f9312a;
        if (pVar != null) {
            pVar.f(i2);
        }
    }

    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        C0695X x6 = this.f9313b;
        if (x6 != null) {
            x6.b();
        }
    }

    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        C0695X x6 = this.f9313b;
        if (x6 != null) {
            x6.b();
        }
    }

    public void setEmojiCompatEnabled(boolean z3) {
        getEmojiTextViewHelper().c(z3);
    }

    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(((b) getEmojiTextViewHelper().f9409b.f2796b).I(inputFilterArr));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0730p pVar = this.f9312a;
        if (pVar != null) {
            pVar.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0730p pVar = this.f9312a;
        if (pVar != null) {
            pVar.i(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        C0695X x6 = this.f9313b;
        x6.l(colorStateList);
        x6.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        C0695X x6 = this.f9313b;
        x6.m(mode);
        x6.b();
    }
}
