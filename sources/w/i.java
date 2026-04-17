package W;

import android.text.Editable;
import android.text.Selection;
import android.text.Spannable;
import android.text.TextWatcher;
import android.widget.EditText;
import androidx.emoji2.text.j;

public final class i implements TextWatcher {

    /* renamed from: a  reason: collision with root package name */
    public final EditText f3869a;

    /* renamed from: b  reason: collision with root package name */
    public h f3870b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f3871c = true;

    public i(EditText editText) {
        this.f3869a = editText;
    }

    public static void a(int i2, EditText editText) {
        int i5;
        if (i2 == 1 && editText != null && editText.isAttachedToWindow()) {
            Editable editableText = editText.getEditableText();
            int selectionStart = Selection.getSelectionStart(editableText);
            int selectionEnd = Selection.getSelectionEnd(editableText);
            j a6 = j.a();
            if (editableText == null) {
                i5 = 0;
            } else {
                a6.getClass();
                i5 = editableText.length();
            }
            a6.e(editableText, 0, i5);
            if (selectionStart >= 0 && selectionEnd >= 0) {
                Selection.setSelection(editableText, selectionStart, selectionEnd);
            } else if (selectionStart >= 0) {
                Selection.setSelection(editableText, selectionStart);
            } else if (selectionEnd >= 0) {
                Selection.setSelection(editableText, selectionEnd);
            }
        }
    }

    public final void onTextChanged(CharSequence charSequence, int i2, int i5, int i6) {
        EditText editText = this.f3869a;
        if (!editText.isInEditMode() && this.f3871c && j.f4933k != null && i5 <= i6 && (charSequence instanceof Spannable)) {
            int b6 = j.a().b();
            if (b6 != 0) {
                if (b6 == 1) {
                    j.a().e((Spannable) charSequence, i2, i6 + i2);
                    return;
                } else if (b6 != 3) {
                    return;
                }
            }
            j a6 = j.a();
            if (this.f3870b == null) {
                this.f3870b = new h(editText);
            }
            a6.f(this.f3870b);
        }
    }

    public final void afterTextChanged(Editable editable) {
    }

    public final void beforeTextChanged(CharSequence charSequence, int i2, int i5, int i6) {
    }
}
