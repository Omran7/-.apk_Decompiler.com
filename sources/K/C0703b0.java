package k;

import C.k;
import I.d;
import I.e;
import Q.m;
import Q.p;
import R2.b;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.support.v4.media.session.a;
import android.text.InputFilter;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.view.textclassifier.TextClassifier;
import android.widget.TextView;
import j4.p0;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

/* renamed from: k.b0  reason: case insensitive filesystem */
public class C0703b0 extends TextView {

    /* renamed from: a  reason: collision with root package name */
    public final C0730p f9271a;

    /* renamed from: b  reason: collision with root package name */
    public final C0695X f9272b;

    /* renamed from: c  reason: collision with root package name */
    public final C0654C f9273c;
    public C0746x d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f9274e;

    /* renamed from: f  reason: collision with root package name */
    public p0 f9275f;

    /* renamed from: p  reason: collision with root package name */
    public Future f9276p;

    public C0703b0(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 16842884);
    }

    private C0746x getEmojiTextViewHelper() {
        if (this.d == null) {
            this.d = new C0746x(this);
        }
        return this.d;
    }

    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C0730p pVar = this.f9271a;
        if (pVar != null) {
            pVar.a();
        }
        C0695X x6 = this.f9272b;
        if (x6 != null) {
            x6.b();
        }
    }

    public final void g() {
        Future future = this.f9276p;
        if (future != null) {
            try {
                this.f9276p = null;
                if (future.get() != null) {
                    throw new ClassCastException();
                } else if (Build.VERSION.SDK_INT >= 29) {
                    throw null;
                } else {
                    b.c0(this);
                    throw null;
                }
            } catch (InterruptedException | ExecutionException unused) {
            }
        }
    }

    public int getAutoSizeMaxTextSize() {
        if (i1.f9317c) {
            return super.getAutoSizeMaxTextSize();
        }
        C0695X x6 = this.f9272b;
        if (x6 != null) {
            return Math.round(x6.f9247i.f9307e);
        }
        return -1;
    }

    public int getAutoSizeMinTextSize() {
        if (i1.f9317c) {
            return super.getAutoSizeMinTextSize();
        }
        C0695X x6 = this.f9272b;
        if (x6 != null) {
            return Math.round(x6.f9247i.d);
        }
        return -1;
    }

    public int getAutoSizeStepGranularity() {
        if (i1.f9317c) {
            return super.getAutoSizeStepGranularity();
        }
        C0695X x6 = this.f9272b;
        if (x6 != null) {
            return Math.round(x6.f9247i.f9306c);
        }
        return -1;
    }

    public int[] getAutoSizeTextAvailableSizes() {
        if (i1.f9317c) {
            return super.getAutoSizeTextAvailableSizes();
        }
        C0695X x6 = this.f9272b;
        if (x6 != null) {
            return x6.f9247i.f9308f;
        }
        return new int[0];
    }

    public int getAutoSizeTextType() {
        if (!i1.f9317c) {
            C0695X x6 = this.f9272b;
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

    public int getFirstBaselineToTopHeight() {
        return getPaddingTop() - getPaint().getFontMetricsInt().top;
    }

    public int getLastBaselineToBottomHeight() {
        return getPaddingBottom() + getPaint().getFontMetricsInt().bottom;
    }

    public C0697Y getSuperCaller() {
        if (this.f9275f == null) {
            int i2 = Build.VERSION.SDK_INT;
            if (i2 >= 34) {
                this.f9275f = new C0701a0(this);
            } else if (i2 >= 28) {
                this.f9275f = new C0699Z(this);
            } else if (i2 >= 26) {
                this.f9275f = new p0(this, 5);
            }
        }
        return this.f9275f;
    }

    public ColorStateList getSupportBackgroundTintList() {
        C0730p pVar = this.f9271a;
        if (pVar != null) {
            return pVar.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0730p pVar = this.f9271a;
        if (pVar != null) {
            return pVar.c();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f9272b.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f9272b.e();
    }

    public CharSequence getText() {
        g();
        return super.getText();
    }

    public TextClassifier getTextClassifier() {
        C0654C c3;
        if (Build.VERSION.SDK_INT >= 28 || (c3 = this.f9273c) == null) {
            return super.getTextClassifier();
        }
        TextClassifier textClassifier = (TextClassifier) c3.f9146c;
        if (textClassifier == null) {
            return C0685S.a((TextView) c3.f9145b);
        }
        return textClassifier;
    }

    public d getTextMetricsParamsCompat() {
        return b.c0(this);
    }

    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        this.f9272b.getClass();
        C0695X.h(editorInfo, onCreateInputConnection, this);
        a.n0(editorInfo, onCreateInputConnection, this);
        return onCreateInputConnection;
    }

    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 30 && i2 < 33 && onCheckIsTextEditor()) {
            ((InputMethodManager) getContext().getSystemService("input_method")).isActive(this);
        }
    }

    public final void onLayout(boolean z3, int i2, int i5, int i6, int i7) {
        super.onLayout(z3, i2, i5, i6, i7);
        C0695X x6 = this.f9272b;
        if (x6 != null && !i1.f9317c) {
            x6.f9247i.a();
        }
    }

    public void onMeasure(int i2, int i5) {
        g();
        super.onMeasure(i2, i5);
    }

    public final void onTextChanged(CharSequence charSequence, int i2, int i5, int i6) {
        super.onTextChanged(charSequence, i2, i5, i6);
        C0695X x6 = this.f9272b;
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
        C0695X x6 = this.f9272b;
        if (x6 != null) {
            x6.i(i2, i5, i6, i7);
        }
    }

    public final void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i2) {
        if (i1.f9317c) {
            super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i2);
            return;
        }
        C0695X x6 = this.f9272b;
        if (x6 != null) {
            x6.j(iArr, i2);
        }
    }

    public void setAutoSizeTextTypeWithDefaults(int i2) {
        if (i1.f9317c) {
            super.setAutoSizeTextTypeWithDefaults(i2);
            return;
        }
        C0695X x6 = this.f9272b;
        if (x6 != null) {
            x6.k(i2);
        }
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0730p pVar = this.f9271a;
        if (pVar != null) {
            pVar.e();
        }
    }

    public void setBackgroundResource(int i2) {
        super.setBackgroundResource(i2);
        C0730p pVar = this.f9271a;
        if (pVar != null) {
            pVar.f(i2);
        }
    }

    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        C0695X x6 = this.f9272b;
        if (x6 != null) {
            x6.b();
        }
    }

    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        C0695X x6 = this.f9272b;
        if (x6 != null) {
            x6.b();
        }
    }

    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        C0695X x6 = this.f9272b;
        if (x6 != null) {
            x6.b();
        }
    }

    public final void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        C0695X x6 = this.f9272b;
        if (x6 != null) {
            x6.b();
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

    public void setFirstBaselineToTopHeight(int i2) {
        if (Build.VERSION.SDK_INT >= 28) {
            getSuperCaller().w(i2);
        } else {
            b.O0(this, i2);
        }
    }

    public void setLastBaselineToBottomHeight(int i2) {
        if (Build.VERSION.SDK_INT >= 28) {
            getSuperCaller().f(i2);
        } else {
            b.Q0(this, i2);
        }
    }

    public void setLineHeight(int i2) {
        b.R0(this, i2);
    }

    public void setPrecomputedText(e eVar) {
        if (Build.VERSION.SDK_INT >= 29) {
            throw null;
        }
        b.c0(this);
        throw null;
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0730p pVar = this.f9271a;
        if (pVar != null) {
            pVar.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0730p pVar = this.f9271a;
        if (pVar != null) {
            pVar.i(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        C0695X x6 = this.f9272b;
        x6.l(colorStateList);
        x6.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        C0695X x6 = this.f9272b;
        x6.m(mode);
        x6.b();
    }

    public void setTextAppearance(Context context, int i2) {
        super.setTextAppearance(context, i2);
        C0695X x6 = this.f9272b;
        if (x6 != null) {
            x6.g(context, i2);
        }
    }

    public void setTextClassifier(TextClassifier textClassifier) {
        C0654C c3;
        if (Build.VERSION.SDK_INT >= 28 || (c3 = this.f9273c) == null) {
            super.setTextClassifier(textClassifier);
        } else {
            c3.f9146c = textClassifier;
        }
    }

    public void setTextFuture(Future<e> future) {
        this.f9276p = future;
        if (future != null) {
            requestLayout();
        }
    }

    public void setTextMetricsParamsCompat(d dVar) {
        TextDirectionHeuristic textDirectionHeuristic;
        TextDirectionHeuristic textDirectionHeuristic2 = dVar.f1083b;
        TextDirectionHeuristic textDirectionHeuristic3 = TextDirectionHeuristics.FIRSTSTRONG_RTL;
        int i2 = 1;
        if (!(textDirectionHeuristic2 == textDirectionHeuristic3 || textDirectionHeuristic2 == (textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_LTR))) {
            if (textDirectionHeuristic2 == TextDirectionHeuristics.ANYRTL_LTR) {
                i2 = 2;
            } else if (textDirectionHeuristic2 == TextDirectionHeuristics.LTR) {
                i2 = 3;
            } else if (textDirectionHeuristic2 == TextDirectionHeuristics.RTL) {
                i2 = 4;
            } else if (textDirectionHeuristic2 == TextDirectionHeuristics.LOCALE) {
                i2 = 5;
            } else if (textDirectionHeuristic2 == textDirectionHeuristic) {
                i2 = 6;
            } else if (textDirectionHeuristic2 == textDirectionHeuristic3) {
                i2 = 7;
            }
        }
        setTextDirection(i2);
        getPaint().set(dVar.f1082a);
        m.e(this, dVar.f1084c);
        m.h(this, dVar.d);
    }

    public final void setTextSize(int i2, float f6) {
        boolean z3 = i1.f9317c;
        if (z3) {
            super.setTextSize(i2, f6);
            return;
        }
        C0695X x6 = this.f9272b;
        if (x6 != null && !z3) {
            C0715h0 h0Var = x6.f9247i;
            if (!h0Var.f()) {
                h0Var.g(i2, f6);
            }
        }
    }

    public final void setTypeface(Typeface typeface, int i2) {
        Typeface typeface2;
        if (!this.f9274e) {
            if (typeface == null || i2 <= 0) {
                typeface2 = null;
            } else {
                Context context = getContext();
                com.bumptech.glide.d dVar = k.f380a;
                if (context != null) {
                    typeface2 = Typeface.create(typeface, i2);
                } else {
                    throw new IllegalArgumentException("Context cannot be null");
                }
            }
            this.f9274e = true;
            if (typeface2 != null) {
                typeface = typeface2;
            }
            try {
                super.setTypeface(typeface, i2);
            } finally {
                this.f9274e = false;
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C0703b0(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        C0683Q0.a(context);
        this.f9274e = false;
        this.f9275f = null;
        C0681P0.a(this, getContext());
        C0730p pVar = new C0730p(this);
        this.f9271a = pVar;
        pVar.d(attributeSet, i2);
        C0695X x6 = new C0695X(this);
        this.f9272b = x6;
        x6.f(attributeSet, i2);
        x6.b();
        C0654C c3 = new C0654C();
        c3.f9145b = this;
        this.f9273c = c3;
        getEmojiTextViewHelper().a(attributeSet, i2);
    }

    public final void setLineHeight(int i2, float f6) {
        int i5 = Build.VERSION.SDK_INT;
        if (i5 >= 34) {
            getSuperCaller().y(i2, f6);
        } else if (i5 >= 34) {
            p.a(this, i2, f6);
        } else {
            b.R0(this, Math.round(TypedValue.applyDimension(i2, f6, getResources().getDisplayMetrics())));
        }
    }

    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(int i2, int i5, int i6, int i7) {
        Context context = getContext();
        Drawable drawable = null;
        Drawable J5 = i2 != 0 ? b.J(context, i2) : null;
        Drawable J6 = i5 != 0 ? b.J(context, i5) : null;
        Drawable J7 = i6 != 0 ? b.J(context, i6) : null;
        if (i7 != 0) {
            drawable = b.J(context, i7);
        }
        setCompoundDrawablesRelativeWithIntrinsicBounds(J5, J6, J7, drawable);
        C0695X x6 = this.f9272b;
        if (x6 != null) {
            x6.b();
        }
    }

    public final void setCompoundDrawablesWithIntrinsicBounds(int i2, int i5, int i6, int i7) {
        Context context = getContext();
        Drawable drawable = null;
        Drawable J5 = i2 != 0 ? b.J(context, i2) : null;
        Drawable J6 = i5 != 0 ? b.J(context, i5) : null;
        Drawable J7 = i6 != 0 ? b.J(context, i6) : null;
        if (i7 != 0) {
            drawable = b.J(context, i7);
        }
        setCompoundDrawablesWithIntrinsicBounds(J5, J6, J7, drawable);
        C0695X x6 = this.f9272b;
        if (x6 != null) {
            x6.b();
        }
    }
}
