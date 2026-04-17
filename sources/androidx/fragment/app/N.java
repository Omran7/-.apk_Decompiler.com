package androidx.fragment.app;

import K.B;
import K.O;
import L.b;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityManager;
import j.C0599B;
import j.e;
import java.util.WeakHashMap;
import v2.l;

public final class N implements View.OnAttachStateChangeListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f5044a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f5045b;

    public /* synthetic */ N(Object obj, int i2) {
        this.f5044a = i2;
        this.f5045b = obj;
    }

    public final void onViewAttachedToWindow(View view) {
        AccessibilityManager accessibilityManager;
        Object obj = this.f5045b;
        switch (this.f5044a) {
            case 0:
                View view2 = (View) obj;
                view2.removeOnAttachStateChangeListener(this);
                WeakHashMap weakHashMap = O.f1352a;
                B.c(view2);
                return;
            case 1:
            case 2:
                return;
            default:
                l lVar = (l) obj;
                if (lVar.f12199D != null && (accessibilityManager = lVar.f12198C) != null) {
                    WeakHashMap weakHashMap2 = O.f1352a;
                    if (lVar.isAttachedToWindow()) {
                        accessibilityManager.addTouchExplorationStateChangeListener(new b(lVar.f12199D));
                        return;
                    }
                    return;
                }
                return;
        }
    }

    public final void onViewDetachedFromWindow(View view) {
        AccessibilityManager accessibilityManager;
        switch (this.f5044a) {
            case 0:
                return;
            case 1:
                e eVar = (e) this.f5045b;
                ViewTreeObserver viewTreeObserver = eVar.f8689G;
                if (viewTreeObserver != null) {
                    if (!viewTreeObserver.isAlive()) {
                        eVar.f8689G = view.getViewTreeObserver();
                    }
                    eVar.f8689G.removeGlobalOnLayoutListener(eVar.f8698r);
                }
                view.removeOnAttachStateChangeListener(this);
                return;
            case 2:
                C0599B b6 = (C0599B) this.f5045b;
                ViewTreeObserver viewTreeObserver2 = b6.f8659x;
                if (viewTreeObserver2 != null) {
                    if (!viewTreeObserver2.isAlive()) {
                        b6.f8659x = view.getViewTreeObserver();
                    }
                    b6.f8659x.removeGlobalOnLayoutListener(b6.f8653r);
                }
                view.removeOnAttachStateChangeListener(this);
                return;
            default:
                l lVar = (l) this.f5045b;
                F3.e eVar2 = lVar.f12199D;
                if (eVar2 != null && (accessibilityManager = lVar.f12198C) != null) {
                    accessibilityManager.removeTouchExplorationStateChangeListener(new b(eVar2));
                    return;
                }
                return;
        }
    }

    private final void a(View view) {
    }

    private final void b(View view) {
    }

    private final void c(View view) {
    }
}
