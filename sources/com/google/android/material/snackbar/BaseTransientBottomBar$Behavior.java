package com.google.android.material.snackbar;

import android.view.MotionEvent;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.fragment.app.D;
import com.google.android.material.behavior.SwipeDismissBehavior;
import e1.C0484c;
import u2.b;

public class BaseTransientBottomBar$Behavior extends SwipeDismissBehavior<View> {
    public final D h;

    public BaseTransientBottomBar$Behavior() {
        D d = new D(26);
        this.f6287e = Math.min(Math.max(0.0f, 0.1f), 1.0f);
        this.f6288f = Math.min(Math.max(0.0f, 0.6f), 1.0f);
        this.d = 0;
        this.h = d;
    }

    public final boolean f(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        this.h.getClass();
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked == 1 || actionMasked == 3) {
                if (C0484c.f7572b == null) {
                    C0484c.f7572b = new C0484c();
                }
                synchronized (C0484c.f7572b.f7573a) {
                }
            }
        } else if (coordinatorLayout.o(view, (int) motionEvent.getX(), (int) motionEvent.getY())) {
            if (C0484c.f7572b == null) {
                C0484c.f7572b = new C0484c();
            }
            synchronized (C0484c.f7572b.f7573a) {
            }
        }
        return super.f(coordinatorLayout, view, motionEvent);
    }

    public final boolean r(View view) {
        this.h.getClass();
        return view instanceof b;
    }
}
