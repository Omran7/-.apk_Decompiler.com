package com.google.android.material.snackbar;

import K.O;
import K1.e;
import Z1.a;
import android.content.Context;
import android.text.Layout;
import android.util.AttributeSet;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.mtma.criminal.city.R;
import java.util.WeakHashMap;

public class SnackbarContentLayout extends LinearLayout {

    /* renamed from: a  reason: collision with root package name */
    public TextView f6503a;

    /* renamed from: b  reason: collision with root package name */
    public Button f6504b;

    /* renamed from: c  reason: collision with root package name */
    public int f6505c;

    public SnackbarContentLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        e.o0(context, R.attr.motionEasingEmphasizedInterpolator, a.f4470b);
    }

    public final boolean a(int i2, int i5, int i6) {
        boolean z3;
        if (i2 != getOrientation()) {
            setOrientation(i2);
            z3 = true;
        } else {
            z3 = false;
        }
        if (this.f6503a.getPaddingTop() == i5 && this.f6503a.getPaddingBottom() == i6) {
            return z3;
        }
        TextView textView = this.f6503a;
        WeakHashMap weakHashMap = O.f1352a;
        if (textView.isPaddingRelative()) {
            textView.setPaddingRelative(textView.getPaddingStart(), i5, textView.getPaddingEnd(), i6);
            return true;
        }
        textView.setPadding(textView.getPaddingLeft(), i5, textView.getPaddingRight(), i6);
        return true;
    }

    public Button getActionView() {
        return this.f6504b;
    }

    public TextView getMessageView() {
        return this.f6503a;
    }

    public final void onFinishInflate() {
        super.onFinishInflate();
        this.f6503a = (TextView) findViewById(R.id.snackbar_text);
        this.f6504b = (Button) findViewById(R.id.snackbar_action);
    }

    public final void onMeasure(int i2, int i5) {
        boolean z3;
        super.onMeasure(i2, i5);
        if (getOrientation() != 1) {
            int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.design_snackbar_padding_vertical_2lines);
            int dimensionPixelSize2 = getResources().getDimensionPixelSize(R.dimen.design_snackbar_padding_vertical);
            Layout layout = this.f6503a.getLayout();
            if (layout == null || layout.getLineCount() <= 1) {
                z3 = false;
            } else {
                z3 = true;
            }
            if (!z3 || this.f6505c <= 0 || this.f6504b.getMeasuredWidth() <= this.f6505c) {
                if (!z3) {
                    dimensionPixelSize = dimensionPixelSize2;
                }
                if (!a(0, dimensionPixelSize, dimensionPixelSize)) {
                    return;
                }
            } else if (!a(1, dimensionPixelSize, dimensionPixelSize - dimensionPixelSize2)) {
                return;
            }
            super.onMeasure(i2, i5);
        }
    }

    public void setMaxInlineActionWidth(int i2) {
        this.f6505c = i2;
    }
}
