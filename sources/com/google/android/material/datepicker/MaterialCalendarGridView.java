package com.google.android.material.datepicker;

import K.O;
import Q.h;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Adapter;
import android.widget.GridView;
import android.widget.ListAdapter;
import com.mtma.criminal.city.R;
import java.util.Calendar;

final class MaterialCalendarGridView extends GridView {

    /* renamed from: a  reason: collision with root package name */
    public final boolean f6389a;

    public MaterialCalendarGridView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        w.c((Calendar) null);
        if (l.Y(getContext(), 16843277)) {
            setNextFocusLeftId(R.id.cancel_button);
            setNextFocusRightId(R.id.confirm_button);
        }
        this.f6389a = l.Y(getContext(), R.attr.nestedScrollable);
        O.l(this, new h(3));
    }

    public final p a() {
        return (p) super.getAdapter();
    }

    public final Adapter getAdapter() {
        return (p) super.getAdapter();
    }

    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ((p) super.getAdapter()).notifyDataSetChanged();
    }

    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        p pVar = (p) super.getAdapter();
        pVar.getClass();
        int max = Math.max(pVar.a(), getFirstVisiblePosition());
        int min = Math.min(pVar.c(), getLastVisiblePosition());
        pVar.getItem(max);
        pVar.getItem(min);
        throw null;
    }

    public final void onFocusChanged(boolean z3, int i2, Rect rect) {
        if (!z3) {
            super.onFocusChanged(false, i2, rect);
        } else if (i2 == 33) {
            setSelection(((p) super.getAdapter()).c());
        } else if (i2 == 130) {
            setSelection(((p) super.getAdapter()).a());
        } else {
            super.onFocusChanged(true, i2, rect);
        }
    }

    public final boolean onKeyDown(int i2, KeyEvent keyEvent) {
        if (!super.onKeyDown(i2, keyEvent)) {
            return false;
        }
        if (getSelectedItemPosition() == -1 || getSelectedItemPosition() >= ((p) super.getAdapter()).a()) {
            return true;
        }
        if (19 != i2) {
            return false;
        }
        setSelection(((p) super.getAdapter()).a());
        return true;
    }

    public final void onMeasure(int i2, int i5) {
        if (this.f6389a) {
            super.onMeasure(i2, View.MeasureSpec.makeMeasureSpec(16777215, Integer.MIN_VALUE));
            getLayoutParams().height = getMeasuredHeight();
            return;
        }
        super.onMeasure(i2, i5);
    }

    public final void setSelection(int i2) {
        if (i2 < ((p) super.getAdapter()).a()) {
            super.setSelection(((p) super.getAdapter()).a());
        } else {
            super.setSelection(i2);
        }
    }

    /* renamed from: getAdapter  reason: collision with other method in class */
    public final ListAdapter m9getAdapter() {
        return (p) super.getAdapter();
    }

    public final void setAdapter(ListAdapter listAdapter) {
        if (listAdapter instanceof p) {
            super.setAdapter(listAdapter);
            return;
        }
        throw new IllegalArgumentException(String.format("%1$s must have its Adapter set to a %2$s", new Object[]{MaterialCalendarGridView.class.getCanonicalName(), p.class.getCanonicalName()}));
    }
}
