package k5;

import android.graphics.drawable.Drawable;
import android.graphics.drawable.TransitionDrawable;
import android.view.View;
import android.view.ViewConfiguration;

/* renamed from: k5.a  reason: case insensitive filesystem */
public final class C0764a implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f9482a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ C0773j f9483b;

    public /* synthetic */ C0764a(C0773j jVar, int i2) {
        this.f9482a = i2;
        this.f9483b = jVar;
    }

    public final void run() {
        Drawable current;
        switch (this.f9482a) {
            case 0:
                C0773j jVar = this.f9483b;
                if (jVar.f9553g0) {
                    jVar.f9554h0 = false;
                    jVar.f9553g0 = false;
                    jVar.setChildrenDrawnWithCacheEnabled(false);
                    if ((jVar.getPersistentDrawingCache() & 2) == 0) {
                        jVar.setChildrenDrawingCacheEnabled(false);
                    }
                    if (!jVar.isAlwaysDrawnWithCacheEnabled()) {
                        jVar.invalidate();
                        return;
                    }
                    return;
                }
                return;
            case 1:
                C0773j jVar2 = this.f9483b;
                if (jVar2.f9558l0 == 0) {
                    jVar2.f9558l0 = 1;
                    View childAt = jVar2.getChildAt(jVar2.f9555i0 - jVar2.f9578a);
                    if (childAt != null && !childAt.hasFocusable()) {
                        jVar2.f9526O = 0;
                        if (!jVar2.f9586s) {
                            childAt.setPressed(true);
                            jVar2.setPressed(true);
                            jVar2.A();
                            jVar2.H(childAt, jVar2.f9555i0);
                            jVar2.refreshDrawableState();
                            int longPressTimeout = ViewConfiguration.getLongPressTimeout();
                            boolean isLongClickable = jVar2.isLongClickable();
                            Drawable drawable = jVar2.f9535T;
                            if (!(drawable == null || (current = drawable.getCurrent()) == null || !(current instanceof TransitionDrawable))) {
                                if (isLongClickable) {
                                    ((TransitionDrawable) current).startTransition(longPressTimeout);
                                } else {
                                    ((TransitionDrawable) current).resetTransition();
                                }
                            }
                            if (isLongClickable) {
                                if (jVar2.f9570y0 == null) {
                                    jVar2.f9570y0 = new C0766c(jVar2, 1);
                                }
                                C0766c cVar = jVar2.f9570y0;
                                cVar.f617a = ((C0773j) cVar.f618b).getWindowAttachCount();
                                jVar2.postDelayed(jVar2.f9570y0, (long) longPressTimeout);
                                return;
                            }
                            jVar2.f9558l0 = 2;
                            return;
                        }
                        jVar2.f9558l0 = 2;
                        return;
                    }
                    return;
                }
                return;
            default:
                C0773j jVar3 = this.f9483b;
                if (jVar3.f9586s) {
                    if (jVar3.getAdapter() != null) {
                        jVar3.post(this);
                        return;
                    }
                    return;
                } else if (jVar3.f9572A.isEnabled() && jVar3.getSelectedItemPosition() >= 0) {
                    jVar3.sendAccessibilityEvent(4);
                    return;
                } else {
                    return;
                }
        }
    }
}
