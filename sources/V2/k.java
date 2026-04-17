package v2;

import android.view.View;
import android.widget.EditText;
import com.google.android.material.textfield.TextInputLayout;

public final class k {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ l f12195a;

    public k(l lVar) {
        this.f12195a = lVar;
    }

    public final void a(TextInputLayout textInputLayout) {
        l lVar = this.f12195a;
        if (lVar.f12197B != textInputLayout.getEditText()) {
            EditText editText = lVar.f12197B;
            j jVar = lVar.f12200E;
            if (editText != null) {
                editText.removeTextChangedListener(jVar);
                if (lVar.f12197B.getOnFocusChangeListener() == lVar.b().e()) {
                    lVar.f12197B.setOnFocusChangeListener((View.OnFocusChangeListener) null);
                }
            }
            EditText editText2 = textInputLayout.getEditText();
            lVar.f12197B = editText2;
            if (editText2 != null) {
                editText2.addTextChangedListener(jVar);
            }
            lVar.b().m(lVar.f12197B);
            lVar.j(lVar.b());
        }
    }
}
