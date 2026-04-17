package A4;

import B4.g;
import android.text.Editable;
import android.text.method.PasswordTransformationMethod;
import android.text.method.TransformationMethod;
import android.view.View;
import android.widget.EditText;
import com.google.android.material.datepicker.l;
import v2.C1045d;
import v2.i;
import v2.s;

public final /* synthetic */ class b implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f65a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f66b;

    public /* synthetic */ b(Object obj, int i2) {
        this.f65a = i2;
        this.f66b = obj;
    }

    public final void onClick(View view) {
        switch (this.f65a) {
            case 0:
                j jVar = (j) this.f66b;
                jVar.W(new g(jVar.f107d0));
                return;
            case 1:
                ((l) this.f66b).W();
                throw null;
            case 2:
                C1045d dVar = (C1045d) this.f66b;
                EditText editText = dVar.f12172i;
                if (editText != null) {
                    Editable text = editText.getText();
                    if (text != null) {
                        text.clear();
                    }
                    dVar.q();
                    return;
                }
                return;
            case 3:
                ((i) this.f66b).u();
                return;
            default:
                s sVar = (s) this.f66b;
                EditText editText2 = sVar.f12262f;
                if (editText2 != null) {
                    int selectionEnd = editText2.getSelectionEnd();
                    EditText editText3 = sVar.f12262f;
                    if (editText3 == null || !(editText3.getTransformationMethod() instanceof PasswordTransformationMethod)) {
                        sVar.f12262f.setTransformationMethod(PasswordTransformationMethod.getInstance());
                    } else {
                        sVar.f12262f.setTransformationMethod((TransformationMethod) null);
                    }
                    if (selectionEnd >= 0) {
                        sVar.f12262f.setSelection(selectionEnd);
                    }
                    sVar.q();
                    return;
                }
                return;
        }
    }
}
