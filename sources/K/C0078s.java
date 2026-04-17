package K;

import android.view.View;
import android.view.ViewTreeObserver;

/* renamed from: K.s  reason: case insensitive filesystem */
public final class C0078s implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {

    /* renamed from: a  reason: collision with root package name */
    public final View f1424a;

    /* renamed from: b  reason: collision with root package name */
    public ViewTreeObserver f1425b;

    /* renamed from: c  reason: collision with root package name */
    public final Runnable f1426c;

    public C0078s(View view, Runnable runnable) {
        this.f1424a = view;
        this.f1425b = view.getViewTreeObserver();
        this.f1426c = runnable;
    }

    public static void a(View view, Runnable runnable) {
        if (view != null) {
            C0078s sVar = new C0078s(view, runnable);
            view.getViewTreeObserver().addOnPreDrawListener(sVar);
            view.addOnAttachStateChangeListener(sVar);
            return;
        }
        throw new NullPointerException("view == null");
    }

    public final boolean onPreDraw() {
        boolean isAlive = this.f1425b.isAlive();
        View view = this.f1424a;
        if (isAlive) {
            this.f1425b.removeOnPreDrawListener(this);
        } else {
            view.getViewTreeObserver().removeOnPreDrawListener(this);
        }
        view.removeOnAttachStateChangeListener(this);
        this.f1426c.run();
        return true;
    }

    public final void onViewAttachedToWindow(View view) {
        this.f1425b = view.getViewTreeObserver();
    }

    public final void onViewDetachedFromWindow(View view) {
        boolean isAlive = this.f1425b.isAlive();
        View view2 = this.f1424a;
        if (isAlive) {
            this.f1425b.removeOnPreDrawListener(this);
        } else {
            view2.getViewTreeObserver().removeOnPreDrawListener(this);
        }
        view2.removeOnAttachStateChangeListener(this);
    }
}
