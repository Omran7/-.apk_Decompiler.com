package j;

import android.content.DialogInterface;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import f.C0515f;

public final class l implements DialogInterface.OnKeyListener, DialogInterface.OnClickListener, DialogInterface.OnDismissListener, v {

    /* renamed from: a  reason: collision with root package name */
    public C0600C f8742a;

    /* renamed from: b  reason: collision with root package name */
    public C0515f f8743b;

    /* renamed from: c  reason: collision with root package name */
    public g f8744c;

    public final void a(k kVar, boolean z3) {
        C0515f fVar;
        if ((z3 || kVar == this.f8742a) && (fVar = this.f8743b) != null) {
            fVar.dismiss();
        }
    }

    public final void onClick(DialogInterface dialogInterface, int i2) {
        g gVar = this.f8744c;
        if (gVar.f8713f == null) {
            gVar.f8713f = new f(gVar);
        }
        this.f8742a.q(gVar.f8713f.getItem(i2), (w) null, 0);
    }

    public final void onDismiss(DialogInterface dialogInterface) {
        this.f8744c.a(this.f8742a, true);
    }

    public final boolean onKey(DialogInterface dialogInterface, int i2, KeyEvent keyEvent) {
        Window window;
        View decorView;
        KeyEvent.DispatcherState keyDispatcherState;
        View decorView2;
        KeyEvent.DispatcherState keyDispatcherState2;
        C0600C c3 = this.f8742a;
        if (i2 == 82 || i2 == 4) {
            if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                Window window2 = this.f8743b.getWindow();
                if (!(window2 == null || (decorView2 = window2.getDecorView()) == null || (keyDispatcherState2 = decorView2.getKeyDispatcherState()) == null)) {
                    keyDispatcherState2.startTracking(keyEvent, this);
                    return true;
                }
            } else if (keyEvent.getAction() == 1 && !keyEvent.isCanceled() && (window = this.f8743b.getWindow()) != null && (decorView = window.getDecorView()) != null && (keyDispatcherState = decorView.getKeyDispatcherState()) != null && keyDispatcherState.isTracking(keyEvent)) {
                c3.c(true);
                dialogInterface.dismiss();
                return true;
            }
        }
        return c3.performShortcut(i2, keyEvent, 0);
    }

    public final boolean p(k kVar) {
        return false;
    }
}
