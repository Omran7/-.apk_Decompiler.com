package k;

import I1.b;
import Q.s;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.widget.CheckBox;

/* renamed from: k.r  reason: case insensitive filesystem */
public class C0734r extends CheckBox implements s {

    /* renamed from: a  reason: collision with root package name */
    public final C0738t f9364a;

    /* renamed from: b  reason: collision with root package name */
    public final C0730p f9365b;

    /* renamed from: c  reason: collision with root package name */
    public final C0695X f9366c;
    public C0746x d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C0734r(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        C0683Q0.a(context);
        C0681P0.a(this, getContext());
        C0738t tVar = new C0738t(this);
        this.f9364a = tVar;
        tVar.e(attributeSet, i2);
        C0730p pVar = new C0730p(this);
        this.f9365b = pVar;
        pVar.d(attributeSet, i2);
        C0695X x6 = new C0695X(this);
        this.f9366c = x6;
        x6.f(attributeSet, i2);
        getEmojiTextViewHelper().a(attributeSet, i2);
    }

    private C0746x getEmojiTextViewHelper() {
        if (this.d == null) {
            this.d = new C0746x(this);
        }
        return this.d;
    }

    public void drawableStateChanged() {
        super.drawableStateChanged();
        C0730p pVar = this.f9365b;
        if (pVar != null) {
            pVar.a();
        }
        C0695X x6 = this.f9366c;
        if (x6 != null) {
            x6.b();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        C0730p pVar = this.f9365b;
        if (pVar != null) {
            return pVar.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0730p pVar = this.f9365b;
        if (pVar != null) {
            return pVar.c();
        }
        return null;
    }

    public ColorStateList getSupportButtonTintList() {
        C0738t tVar = this.f9364a;
        if (tVar != null) {
            return (ColorStateList) tVar.f9373a;
        }
        return null;
    }

    public PorterDuff.Mode getSupportButtonTintMode() {
        C0738t tVar = this.f9364a;
        if (tVar != null) {
            return (PorterDuff.Mode) tVar.f9374b;
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f9366c.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f9366c.e();
    }

    public void setAllCaps(boolean z3) {
        super.setAllCaps(z3);
        getEmojiTextViewHelper().b(z3);
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0730p pVar = this.f9365b;
        if (pVar != null) {
            pVar.e();
        }
    }

    public void setBackgroundResource(int i2) {
        super.setBackgroundResource(i2);
        C0730p pVar = this.f9365b;
        if (pVar != null) {
            pVar.f(i2);
        }
    }

    public void setButtonDrawable(Drawable drawable) {
        super.setButtonDrawable(drawable);
        C0738t tVar = this.f9364a;
        if (tVar == null) {
            return;
        }
        if (tVar.f9376e) {
            tVar.f9376e = false;
            return;
        }
        tVar.f9376e = true;
        tVar.a();
    }

    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        C0695X x6 = this.f9366c;
        if (x6 != null) {
            x6.b();
        }
    }

    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        C0695X x6 = this.f9366c;
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
        C0730p pVar = this.f9365b;
        if (pVar != null) {
            pVar.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0730p pVar = this.f9365b;
        if (pVar != null) {
            pVar.i(mode);
        }
    }

    public void setSupportButtonTintList(ColorStateList colorStateList) {
        C0738t tVar = this.f9364a;
        if (tVar != null) {
            tVar.f9373a = colorStateList;
            tVar.f9375c = true;
            tVar.a();
        }
    }

    public void setSupportButtonTintMode(PorterDuff.Mode mode) {
        C0738t tVar = this.f9364a;
        if (tVar != null) {
            tVar.f9374b = mode;
            tVar.d = true;
            tVar.a();
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        C0695X x6 = this.f9366c;
        x6.l(colorStateList);
        x6.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        C0695X x6 = this.f9366c;
        x6.m(mode);
        x6.b();
    }

    public void setButtonDrawable(int i2) {
        setButtonDrawable(R2.b.J(getContext(), i2));
    }
}
