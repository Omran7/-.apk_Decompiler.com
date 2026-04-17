package v2;

import K.O;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import com.google.android.material.textfield.TextInputLayout;
import java.util.WeakHashMap;

public final class u implements TextWatcher {

    /* renamed from: a  reason: collision with root package name */
    public int f12272a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ EditText f12273b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ TextInputLayout f12274c;

    public u(TextInputLayout textInputLayout, EditText editText) {
        this.f12274c = textInputLayout;
        this.f12273b = editText;
        this.f12272a = editText.getLineCount();
    }

    public final void afterTextChanged(Editable editable) {
        TextInputLayout textInputLayout = this.f12274c;
        textInputLayout.u(!textInputLayout.f6526J0, false);
        if (textInputLayout.f6568t) {
            textInputLayout.n(editable);
        }
        if (textInputLayout.f6510B) {
            textInputLayout.v(editable);
        }
        EditText editText = this.f12273b;
        int lineCount = editText.getLineCount();
        int i2 = this.f12272a;
        if (lineCount != i2) {
            if (lineCount < i2) {
                WeakHashMap weakHashMap = O.f1352a;
                int minimumHeight = editText.getMinimumHeight();
                int i5 = textInputLayout.f6513C0;
                if (minimumHeight != i5) {
                    editText.setMinimumHeight(i5);
                }
            }
            this.f12272a = lineCount;
        }
    }

    public final void beforeTextChanged(CharSequence charSequence, int i2, int i5, int i6) {
    }

    public final void onTextChanged(CharSequence charSequence, int i2, int i5, int i6) {
    }
}
