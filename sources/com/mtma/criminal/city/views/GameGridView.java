package com.mtma.criminal.city.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.GridView;

public class GameGridView extends GridView {

    /* renamed from: a  reason: collision with root package name */
    public int f7496a = 1;

    public GameGridView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public final void onMeasure(int i2, int i5) {
        if (getLayoutParams().height == -2) {
            i5 = View.MeasureSpec.makeMeasureSpec(536870911, Integer.MIN_VALUE);
        }
        super.onMeasure(i2, i5);
        int i6 = this.f7496a;
        if (i6 > 0) {
            int columnWidth = getColumnWidth() * i6;
            int horizontalSpacing = getHorizontalSpacing();
            int listPaddingLeft = getListPaddingLeft();
            setMeasuredDimension(getListPaddingRight() + listPaddingLeft + (horizontalSpacing * (this.f7496a - 1)) + columnWidth, getMeasuredHeight());
        }
    }

    public void setNumColumns(int i2) {
        super.setNumColumns(i2);
        if (i2 != this.f7496a) {
            this.f7496a = i2;
        }
    }
}
