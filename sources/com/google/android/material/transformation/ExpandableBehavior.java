package com.google.android.material.transformation;

import K.O;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.util.ArrayList;
import java.util.WeakHashMap;
import x.C1089a;

@Deprecated
public abstract class ExpandableBehavior extends C1089a {
    public ExpandableBehavior() {
    }

    public abstract void b(View view);

    public final boolean d(CoordinatorLayout coordinatorLayout, View view, View view2) {
        view2.getClass();
        throw new ClassCastException();
    }

    public final boolean g(CoordinatorLayout coordinatorLayout, View view, int i2) {
        WeakHashMap weakHashMap = O.f1352a;
        if (!view.isLaidOut()) {
            ArrayList j6 = coordinatorLayout.j(view);
            int size = j6.size();
            for (int i5 = 0; i5 < size; i5++) {
                View view2 = (View) j6.get(i5);
                b(view);
            }
        }
        return false;
    }

    public ExpandableBehavior(Context context, AttributeSet attributeSet) {
    }
}
