package com.google.android.material.internal;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;

public class BaselineLayout extends ViewGroup {

    /* renamed from: a  reason: collision with root package name */
    public int f6468a = -1;

    public BaselineLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
    }

    public int getBaseline() {
        return this.f6468a;
    }

    public final void onLayout(boolean z3, int i2, int i5, int i6, int i7) {
        int i8;
        int childCount = getChildCount();
        int paddingLeft = getPaddingLeft();
        int paddingRight = ((i6 - i2) - getPaddingRight()) - paddingLeft;
        int paddingTop = getPaddingTop();
        for (int i9 = 0; i9 < childCount; i9++) {
            View childAt = getChildAt(i9);
            if (childAt.getVisibility() != 8) {
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                int i10 = ((paddingRight - measuredWidth) / 2) + paddingLeft;
                if (this.f6468a == -1 || childAt.getBaseline() == -1) {
                    i8 = paddingTop;
                } else {
                    i8 = (this.f6468a + paddingTop) - childAt.getBaseline();
                }
                childAt.layout(i10, i8, measuredWidth + i10, measuredHeight + i8);
            }
        }
    }

    public final void onMeasure(int i2, int i5) {
        int childCount = getChildCount();
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        int i9 = -1;
        int i10 = -1;
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = getChildAt(i11);
            if (childAt.getVisibility() != 8) {
                measureChild(childAt, i2, i5);
                int baseline = childAt.getBaseline();
                if (baseline != -1) {
                    i9 = Math.max(i9, baseline);
                    i10 = Math.max(i10, childAt.getMeasuredHeight() - baseline);
                }
                i7 = Math.max(i7, childAt.getMeasuredWidth());
                i6 = Math.max(i6, childAt.getMeasuredHeight());
                i8 = View.combineMeasuredStates(i8, childAt.getMeasuredState());
            }
        }
        if (i9 != -1) {
            i6 = Math.max(i6, Math.max(i10, getPaddingBottom()) + i9);
            this.f6468a = i9;
        }
        setMeasuredDimension(View.resolveSizeAndState(Math.max(i7, getSuggestedMinimumWidth()), i2, i8), View.resolveSizeAndState(Math.max(i6, getSuggestedMinimumHeight()), i5, i8 << 16));
    }
}
