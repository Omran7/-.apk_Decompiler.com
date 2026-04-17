package com.mtma.criminal.city.views;

import android.content.Context;
import android.util.AttributeSet;
import k.C0750z;

public class SquareView extends C0750z {
    public SquareView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
    }

    public final void onMeasure(int i2, int i5) {
        super.onMeasure(i2, i5);
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        if (measuredWidth > measuredHeight) {
            setMeasuredDimension(measuredHeight, measuredHeight);
        } else {
            setMeasuredDimension(measuredWidth, measuredWidth);
        }
    }
}
