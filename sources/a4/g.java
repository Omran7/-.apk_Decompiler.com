package A4;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;

public final class g implements TextWatcher {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f77a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ EditText f78b;

    public /* synthetic */ g(int i2, EditText editText) {
        this.f77a = i2;
        this.f78b = editText;
    }

    public final void afterTextChanged(Editable editable) {
        switch (this.f77a) {
            case 0:
                EditText editText = this.f78b;
                try {
                    if (editText.getLineCount() > 3) {
                        String substring = editable.toString().substring(0, editable.length() - 1);
                        editText.setText(substring);
                        editText.setSelection(substring.length());
                        return;
                    }
                    return;
                } catch (Exception unused) {
                    return;
                }
            default:
                EditText editText2 = this.f78b;
                try {
                    if (editText2.getLineCount() > 2) {
                        String substring2 = editable.toString().substring(0, editable.length() - 1);
                        editText2.setText(substring2);
                        editText2.setSelection(substring2.length());
                        return;
                    }
                    return;
                } catch (Exception unused2) {
                    return;
                }
        }
    }

    public final void beforeTextChanged(CharSequence charSequence, int i2, int i5, int i6) {
        int i7 = this.f77a;
    }

    public final void onTextChanged(CharSequence charSequence, int i2, int i5, int i6) {
        int i7 = this.f77a;
    }

    private final void a(int i2, int i5, int i6, CharSequence charSequence) {
    }

    private final void b(int i2, int i5, int i6, CharSequence charSequence) {
    }

    private final void c(int i2, int i5, int i6, CharSequence charSequence) {
    }

    private final void d(int i2, int i5, int i6, CharSequence charSequence) {
    }
}
