package W;

import android.text.InputFilter;
import android.text.Selection;
import android.text.Spannable;
import android.widget.TextView;
import androidx.emoji2.text.h;
import androidx.emoji2.text.j;
import java.lang.ref.WeakReference;

public final class c extends h {

    /* renamed from: a  reason: collision with root package name */
    public final WeakReference f3858a;

    /* renamed from: b  reason: collision with root package name */
    public final WeakReference f3859b;

    public c(TextView textView, d dVar) {
        this.f3858a = new WeakReference(textView);
        this.f3859b = new WeakReference(dVar);
    }

    public final void a() {
        InputFilter[] filters;
        int i2;
        TextView textView = (TextView) this.f3858a.get();
        InputFilter inputFilter = (InputFilter) this.f3859b.get();
        if (inputFilter != null && textView != null && (filters = textView.getFilters()) != null) {
            int i5 = 0;
            while (i5 < filters.length) {
                if (filters[i5] != inputFilter) {
                    i5++;
                } else if (textView.isAttachedToWindow()) {
                    CharSequence text = textView.getText();
                    j a6 = j.a();
                    if (text == null) {
                        i2 = 0;
                    } else {
                        a6.getClass();
                        i2 = text.length();
                    }
                    CharSequence e6 = a6.e(text, 0, i2);
                    if (text != e6) {
                        int selectionStart = Selection.getSelectionStart(e6);
                        int selectionEnd = Selection.getSelectionEnd(e6);
                        textView.setText(e6);
                        if (e6 instanceof Spannable) {
                            Spannable spannable = (Spannable) e6;
                            if (selectionStart >= 0 && selectionEnd >= 0) {
                                Selection.setSelection(spannable, selectionStart, selectionEnd);
                                return;
                            } else if (selectionStart >= 0) {
                                Selection.setSelection(spannable, selectionStart);
                                return;
                            } else if (selectionEnd >= 0) {
                                Selection.setSelection(spannable, selectionEnd);
                                return;
                            } else {
                                return;
                            }
                        } else {
                            return;
                        }
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            }
        }
    }
}
