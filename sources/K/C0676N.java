package k;

import K4.e;
import P4.m;
import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ViewTreeObserver;
import android.widget.ListAdapter;
import com.mtma.criminal.city.R;

/* renamed from: k.N  reason: case insensitive filesystem */
public final class C0676N extends C0657D0 implements C0680P {

    /* renamed from: L  reason: collision with root package name */
    public CharSequence f9209L;

    /* renamed from: M  reason: collision with root package name */
    public C0672L f9210M;

    /* renamed from: N  reason: collision with root package name */
    public final Rect f9211N = new Rect();

    /* renamed from: O  reason: collision with root package name */
    public int f9212O;

    /* renamed from: P  reason: collision with root package name */
    public final /* synthetic */ C0682Q f9213P;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C0676N(C0682Q q6, Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.spinnerStyle);
        this.f9213P = q6;
        this.f9175x = q6;
        this.f9160H = true;
        this.f9161I.setFocusable(true);
        this.f9176y = new m(this, 2);
    }

    public final void e(CharSequence charSequence) {
        this.f9209L = charSequence;
    }

    public final void j(int i2) {
        this.f9212O = i2;
    }

    public final void m(int i2, int i5) {
        ViewTreeObserver viewTreeObserver;
        C0652B b6 = this.f9161I;
        boolean isShowing = b6.isShowing();
        s();
        this.f9161I.setInputMethodMode(2);
        c();
        C0739t0 t0Var = this.f9164c;
        t0Var.setChoiceMode(1);
        t0Var.setTextDirection(i2);
        t0Var.setTextAlignment(i5);
        C0682Q q6 = this.f9213P;
        int selectedItemPosition = q6.getSelectedItemPosition();
        C0739t0 t0Var2 = this.f9164c;
        if (b6.isShowing() && t0Var2 != null) {
            t0Var2.setListSelectionHidden(false);
            t0Var2.setSelection(selectedItemPosition);
            if (t0Var2.getChoiceMode() != 0) {
                t0Var2.setItemChecked(selectedItemPosition, true);
            }
        }
        if (!isShowing && (viewTreeObserver = q6.getViewTreeObserver()) != null) {
            e eVar = new e(this, 8);
            viewTreeObserver.addOnGlobalLayoutListener(eVar);
            this.f9161I.setOnDismissListener(new C0674M(this, eVar));
        }
    }

    public final CharSequence o() {
        return this.f9209L;
    }

    public final void p(ListAdapter listAdapter) {
        super.p(listAdapter);
        this.f9210M = (C0672L) listAdapter;
    }

    public final void s() {
        int i2;
        int i5;
        C0652B b6 = this.f9161I;
        Drawable background = b6.getBackground();
        C0682Q q6 = this.f9213P;
        if (background != null) {
            background.getPadding(q6.f9227q);
            boolean z3 = i1.f9315a;
            int layoutDirection = q6.getLayoutDirection();
            Rect rect = q6.f9227q;
            if (layoutDirection == 1) {
                i2 = rect.right;
            } else {
                i2 = -rect.left;
            }
        } else {
            Rect rect2 = q6.f9227q;
            rect2.right = 0;
            rect2.left = 0;
            i2 = 0;
        }
        int paddingLeft = q6.getPaddingLeft();
        int paddingRight = q6.getPaddingRight();
        int width = q6.getWidth();
        int i6 = q6.f9226p;
        if (i6 == -2) {
            int a6 = q6.a(this.f9210M, b6.getBackground());
            int i7 = q6.getContext().getResources().getDisplayMetrics().widthPixels;
            Rect rect3 = q6.f9227q;
            int i8 = (i7 - rect3.left) - rect3.right;
            if (a6 > i8) {
                a6 = i8;
            }
            r(Math.max(a6, (width - paddingLeft) - paddingRight));
        } else if (i6 == -1) {
            r((width - paddingLeft) - paddingRight);
        } else {
            r(i6);
        }
        boolean z4 = i1.f9315a;
        if (q6.getLayoutDirection() == 1) {
            i5 = (((width - paddingRight) - this.f9165e) - this.f9212O) + i2;
        } else {
            i5 = paddingLeft + this.f9212O + i2;
        }
        this.f9166f = i5;
    }
}
