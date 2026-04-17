package v2;

import A4.b;
import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.EditText;
import com.mtma.criminal.city.R;

public final class s extends m {

    /* renamed from: e  reason: collision with root package name */
    public final int f12261e = R.drawable.design_password_eye;

    /* renamed from: f  reason: collision with root package name */
    public EditText f12262f;
    public final b g = new b(this, 4);

    public s(l lVar, int i2) {
        super(lVar);
        if (i2 != 0) {
            this.f12261e = i2;
        }
    }

    public final void b() {
        q();
    }

    public final int c() {
        return R.string.password_toggle_content_description;
    }

    public final int d() {
        return this.f12261e;
    }

    public final View.OnClickListener f() {
        return this.g;
    }

    public final boolean k() {
        return true;
    }

    public final boolean l() {
        boolean z3;
        EditText editText = this.f12262f;
        if (editText == null || !(editText.getTransformationMethod() instanceof PasswordTransformationMethod)) {
            z3 = false;
        } else {
            z3 = true;
        }
        return !z3;
    }

    public final void m(EditText editText) {
        this.f12262f = editText;
        q();
    }

    public final void r() {
        EditText editText = this.f12262f;
        if (editText == null) {
            return;
        }
        if (editText.getInputType() == 16 || editText.getInputType() == 128 || editText.getInputType() == 144 || editText.getInputType() == 224) {
            this.f12262f.setTransformationMethod(PasswordTransformationMethod.getInstance());
        }
    }

    public final void s() {
        EditText editText = this.f12262f;
        if (editText != null) {
            editText.setTransformationMethod(PasswordTransformationMethod.getInstance());
        }
    }
}
