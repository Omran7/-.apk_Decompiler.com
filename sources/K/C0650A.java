package k;

import R2.b;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.support.v4.media.session.a;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.EditText;
import android.widget.MultiAutoCompleteTextView;
import c1.i;
import com.mtma.criminal.city.R;

/* renamed from: k.A  reason: case insensitive filesystem */
public final class C0650A extends MultiAutoCompleteTextView {
    public static final int[] d = {16843126};

    /* renamed from: a  reason: collision with root package name */
    public final C0730p f9141a;

    /* renamed from: b  reason: collision with root package name */
    public final C0695X f9142b;

    /* renamed from: c  reason: collision with root package name */
    public final C0654C f9143c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C0650A(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.autoCompleteTextViewStyle);
        C0683Q0.a(context);
        C0681P0.a(this, getContext());
        i A6 = i.A(getContext(), attributeSet, d, R.attr.autoCompleteTextViewStyle);
        if (((TypedArray) A6.f5606c).hasValue(0)) {
            setDropDownBackgroundDrawable(A6.n(0));
        }
        A6.G();
        C0730p pVar = new C0730p(this);
        this.f9141a = pVar;
        pVar.d(attributeSet, R.attr.autoCompleteTextViewStyle);
        C0695X x6 = new C0695X(this);
        this.f9142b = x6;
        x6.f(attributeSet, R.attr.autoCompleteTextViewStyle);
        x6.b();
        C0654C c3 = new C0654C((EditText) this);
        this.f9143c = c3;
        c3.b(attributeSet, R.attr.autoCompleteTextViewStyle);
        KeyListener keyListener = getKeyListener();
        if (!(keyListener instanceof NumberKeyListener)) {
            boolean isFocusable = isFocusable();
            boolean isClickable = isClickable();
            boolean isLongClickable = isLongClickable();
            int inputType = getInputType();
            KeyListener a6 = c3.a(keyListener);
            if (a6 != keyListener) {
                super.setKeyListener(a6);
                setRawInputType(inputType);
                setFocusable(isFocusable);
                setClickable(isClickable);
                setLongClickable(isLongClickable);
            }
        }
    }

    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C0730p pVar = this.f9141a;
        if (pVar != null) {
            pVar.a();
        }
        C0695X x6 = this.f9142b;
        if (x6 != null) {
            x6.b();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        C0730p pVar = this.f9141a;
        if (pVar != null) {
            return pVar.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0730p pVar = this.f9141a;
        if (pVar != null) {
            return pVar.c();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f9142b.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f9142b.e();
    }

    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        a.n0(editorInfo, onCreateInputConnection, this);
        return this.f9143c.c(onCreateInputConnection, editorInfo);
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0730p pVar = this.f9141a;
        if (pVar != null) {
            pVar.e();
        }
    }

    public void setBackgroundResource(int i2) {
        super.setBackgroundResource(i2);
        C0730p pVar = this.f9141a;
        if (pVar != null) {
            pVar.f(i2);
        }
    }

    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        C0695X x6 = this.f9142b;
        if (x6 != null) {
            x6.b();
        }
    }

    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        C0695X x6 = this.f9142b;
        if (x6 != null) {
            x6.b();
        }
    }

    public void setDropDownBackgroundResource(int i2) {
        setDropDownBackgroundDrawable(b.J(getContext(), i2));
    }

    public void setEmojiCompatEnabled(boolean z3) {
        this.f9143c.d(z3);
    }

    public void setKeyListener(KeyListener keyListener) {
        super.setKeyListener(this.f9143c.a(keyListener));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0730p pVar = this.f9141a;
        if (pVar != null) {
            pVar.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0730p pVar = this.f9141a;
        if (pVar != null) {
            pVar.i(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        C0695X x6 = this.f9142b;
        x6.l(colorStateList);
        x6.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        C0695X x6 = this.f9142b;
        x6.m(mode);
        x6.b();
    }

    public final void setTextAppearance(Context context, int i2) {
        super.setTextAppearance(context, i2);
        C0695X x6 = this.f9142b;
        if (x6 != null) {
            x6.g(context, i2);
        }
    }
}
