package com.google.android.material.behavior;

import K.O;
import T1.A;
import U.e;
import android.view.MotionEvent;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import b2.C0316a;
import java.util.WeakHashMap;
import x.C1089a;

public class SwipeDismissBehavior<V extends View> extends C1089a {

    /* renamed from: a  reason: collision with root package name */
    public e f6284a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f6285b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f6286c;
    public int d = 2;

    /* renamed from: e  reason: collision with root package name */
    public float f6287e = 0.0f;

    /* renamed from: f  reason: collision with root package name */
    public float f6288f = 0.5f;
    public final C0316a g = new C0316a(this);

    public boolean f(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        boolean z3 = this.f6285b;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            z3 = coordinatorLayout.o(view, (int) motionEvent.getX(), (int) motionEvent.getY());
            this.f6285b = z3;
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.f6285b = false;
        }
        if (!z3) {
            return false;
        }
        if (this.f6284a == null) {
            this.f6284a = new e(coordinatorLayout.getContext(), coordinatorLayout, this.g);
        }
        if (this.f6286c || !this.f6284a.p(motionEvent)) {
            return false;
        }
        return true;
    }

    public final boolean g(CoordinatorLayout coordinatorLayout, View view, int i2) {
        WeakHashMap weakHashMap = O.f1352a;
        if (view.getImportantForAccessibility() == 0) {
            view.setImportantForAccessibility(1);
            O.i(view, 1048576);
            O.g(view, 0);
            if (r(view)) {
                O.j(view, L.e.f1694j, new A((Object) this, 17));
            }
        }
        return false;
    }

    public final boolean q(View view, MotionEvent motionEvent) {
        if (this.f6284a == null) {
            return false;
        }
        if (this.f6286c && motionEvent.getActionMasked() == 3) {
            return true;
        }
        this.f6284a.j(motionEvent);
        return true;
    }

    public boolean r(View view) {
        return true;
    }
}
