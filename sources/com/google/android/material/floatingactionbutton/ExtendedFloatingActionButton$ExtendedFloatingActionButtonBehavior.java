package com.google.android.material.floatingactionbutton;

import Y1.a;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import x.C1089a;
import x.C1092d;

public class ExtendedFloatingActionButton$ExtendedFloatingActionButtonBehavior<T> extends C1089a {
    public ExtendedFloatingActionButton$ExtendedFloatingActionButtonBehavior() {
    }

    public final /* synthetic */ boolean a(View view) {
        throw new ClassCastException();
    }

    public final void c(C1092d dVar) {
        if (dVar.h == 0) {
            dVar.h = 80;
        }
    }

    public final boolean d(CoordinatorLayout coordinatorLayout, View view, View view2) {
        throw new ClassCastException();
    }

    public final boolean g(CoordinatorLayout coordinatorLayout, View view, int i2) {
        throw new ClassCastException();
    }

    public ExtendedFloatingActionButton$ExtendedFloatingActionButtonBehavior(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a.f4251f);
        obtainStyledAttributes.getBoolean(0, false);
        obtainStyledAttributes.getBoolean(1, true);
        obtainStyledAttributes.recycle();
    }
}
