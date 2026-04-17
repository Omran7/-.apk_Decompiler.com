package com.google.android.material.appbar;

import K.O;
import Y1.a;
import a2.C0259a;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.bumptech.glide.d;
import java.util.ArrayList;
import java.util.WeakHashMap;
import x.C1089a;
import x.C1092d;

public class AppBarLayout$ScrollingViewBehavior extends C0259a {

    /* renamed from: b  reason: collision with root package name */
    public final int f6272b;

    public AppBarLayout$ScrollingViewBehavior() {
        new Rect();
        new Rect();
    }

    public static void s(ArrayList arrayList) {
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            View view = (View) arrayList.get(i2);
        }
    }

    public boolean d(CoordinatorLayout coordinatorLayout, View view, View view2) {
        int i2;
        C1089a aVar = ((C1092d) view2.getLayoutParams()).f12491a;
        if (aVar instanceof AppBarLayout$BaseBehavior) {
            int bottom = view2.getBottom() - view.getTop();
            ((AppBarLayout$BaseBehavior) aVar).getClass();
            int i5 = this.f6272b;
            if (i5 == 0) {
                i2 = 0;
            } else {
                i2 = d.h((int) (0.0f * ((float) i5)), 0, i5);
            }
            int i6 = bottom - i2;
            WeakHashMap weakHashMap = O.f1352a;
            view.offsetTopAndBottom(i6);
        }
        return false;
    }

    public final boolean h(CoordinatorLayout coordinatorLayout, View view, int i2, int i5, int i6) {
        int i7 = view.getLayoutParams().height;
        if (i7 != -1 && i7 != -2) {
            return false;
        }
        s(coordinatorLayout.j(view));
        return false;
    }

    public final void l(CoordinatorLayout coordinatorLayout, View view) {
        s(coordinatorLayout.j(view));
    }

    public final void r(CoordinatorLayout coordinatorLayout, View view, int i2) {
        s(coordinatorLayout.j(view));
        coordinatorLayout.q(view, i2);
    }

    public AppBarLayout$ScrollingViewBehavior(Context context, AttributeSet attributeSet) {
        new Rect();
        new Rect();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a.f4264u);
        this.f6272b = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        obtainStyledAttributes.recycle();
    }

    public final void b(View view) {
    }
}
