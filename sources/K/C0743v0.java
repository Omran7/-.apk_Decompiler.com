package k;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;

/* renamed from: k.v0  reason: case insensitive filesystem */
public final class C0743v0 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f9393a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ C0745w0 f9394b;

    public /* synthetic */ C0743v0(C0745w0 w0Var, int i2) {
        this.f9393a = i2;
        this.f9394b = w0Var;
    }

    public final void run() {
        switch (this.f9393a) {
            case 0:
                ViewParent parent = this.f9394b.d.getParent();
                if (parent != null) {
                    parent.requestDisallowInterceptTouchEvent(true);
                    return;
                }
                return;
            default:
                C0745w0 w0Var = this.f9394b;
                w0Var.a();
                View view = w0Var.d;
                if (view.isEnabled() && !view.isLongClickable() && w0Var.c()) {
                    view.getParent().requestDisallowInterceptTouchEvent(true);
                    long uptimeMillis = SystemClock.uptimeMillis();
                    MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                    view.onTouchEvent(obtain);
                    obtain.recycle();
                    w0Var.f9405p = true;
                    return;
                }
                return;
        }
    }
}
