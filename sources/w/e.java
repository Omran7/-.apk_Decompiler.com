package W;

import B0.C0009h;
import T1.C;
import android.text.Editable;
import android.text.method.KeyListener;
import android.text.method.MetaKeyKeyListener;
import android.view.KeyEvent;
import android.view.View;

public final class e implements KeyListener {

    /* renamed from: a  reason: collision with root package name */
    public final KeyListener f3862a;

    /* renamed from: b  reason: collision with root package name */
    public final C f3863b;

    public e(KeyListener keyListener) {
        C c3 = new C(26);
        this.f3862a = keyListener;
        this.f3863b = c3;
    }

    public final void clearMetaKeyState(View view, Editable editable, int i2) {
        this.f3862a.clearMetaKeyState(view, editable, i2);
    }

    public final int getInputType() {
        return this.f3862a.getInputType();
    }

    public final boolean onKeyDown(View view, Editable editable, int i2, KeyEvent keyEvent) {
        boolean z3;
        boolean z4;
        this.f3863b.getClass();
        if (i2 == 67) {
            z3 = C0009h.s(editable, keyEvent, false);
        } else if (i2 != 112) {
            z3 = false;
        } else {
            z3 = C0009h.s(editable, keyEvent, true);
        }
        if (z3) {
            MetaKeyKeyListener.adjustMetaAfterKeypress(editable);
            z4 = true;
        } else {
            z4 = false;
        }
        if (z4 || this.f3862a.onKeyDown(view, editable, i2, keyEvent)) {
            return true;
        }
        return false;
    }

    public final boolean onKeyOther(View view, Editable editable, KeyEvent keyEvent) {
        return this.f3862a.onKeyOther(view, editable, keyEvent);
    }

    public final boolean onKeyUp(View view, Editable editable, int i2, KeyEvent keyEvent) {
        return this.f3862a.onKeyUp(view, editable, i2, keyEvent);
    }
}
