package z;

import K.C0070j;
import K1.e;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import androidx.lifecycle.C0307s;
import androidx.lifecycle.C0309u;
import androidx.lifecycle.E;
import androidx.lifecycle.G;
import kotlin.jvm.internal.j;

public abstract class h extends Activity implements C0307s, C0070j {

    /* renamed from: a  reason: collision with root package name */
    public final C0309u f12758a = new C0309u(this);

    public final boolean b(KeyEvent keyEvent) {
        j.e(keyEvent, "event");
        return super.dispatchKeyEvent(keyEvent);
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        j.e(keyEvent, "event");
        View decorView = getWindow().getDecorView();
        j.d(decorView, "window.decorView");
        if (e.k(decorView, keyEvent)) {
            return true;
        }
        return e.l(this, decorView, this, keyEvent);
    }

    public final boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        j.e(keyEvent, "event");
        View decorView = getWindow().getDecorView();
        j.d(decorView, "window.decorView");
        if (e.k(decorView, keyEvent)) {
            return true;
        }
        return super.dispatchKeyShortcutEvent(keyEvent);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        int i2 = G.f5221b;
        E.b(this);
    }

    public void onSaveInstanceState(Bundle bundle) {
        j.e(bundle, "outState");
        this.f12758a.g();
        super.onSaveInstanceState(bundle);
    }

    public Context zza() {
        return getApplicationContext();
    }
}
