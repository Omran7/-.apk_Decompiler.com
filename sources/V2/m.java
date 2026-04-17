package v2;

import F3.e;
import L.j;
import android.content.Context;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.widget.EditText;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;

public abstract class m {

    /* renamed from: a  reason: collision with root package name */
    public final TextInputLayout f12217a;

    /* renamed from: b  reason: collision with root package name */
    public final l f12218b;

    /* renamed from: c  reason: collision with root package name */
    public final Context f12219c;
    public final CheckableImageButton d;

    public m(l lVar) {
        this.f12217a = lVar.f12201a;
        this.f12218b = lVar;
        this.f12219c = lVar.getContext();
        this.d = lVar.f12206p;
    }

    public int c() {
        return 0;
    }

    public int d() {
        return 0;
    }

    public View.OnFocusChangeListener e() {
        return null;
    }

    public View.OnClickListener f() {
        return null;
    }

    public View.OnFocusChangeListener g() {
        return null;
    }

    public e h() {
        return null;
    }

    public boolean i(int i2) {
        return true;
    }

    public boolean j() {
        return false;
    }

    public boolean k() {
        return this instanceof i;
    }

    public boolean l() {
        return false;
    }

    public final void q() {
        this.f12218b.f(false);
    }

    public void a() {
    }

    public void b() {
    }

    public void r() {
    }

    public void s() {
    }

    public void m(EditText editText) {
    }

    public void n(j jVar) {
    }

    public void o(AccessibilityEvent accessibilityEvent) {
    }

    public void p(boolean z3) {
    }
}
