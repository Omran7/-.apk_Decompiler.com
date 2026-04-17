package W;

import android.text.InputFilter;
import android.text.Spanned;
import android.widget.TextView;
import androidx.emoji2.text.j;

public final class d implements InputFilter {

    /* renamed from: a  reason: collision with root package name */
    public final TextView f3860a;

    /* renamed from: b  reason: collision with root package name */
    public c f3861b;

    public d(TextView textView) {
        this.f3860a = textView;
    }

    public final CharSequence filter(CharSequence charSequence, int i2, int i5, Spanned spanned, int i6, int i7) {
        TextView textView = this.f3860a;
        if (textView.isInEditMode()) {
            return charSequence;
        }
        int b6 = j.a().b();
        if (b6 != 0) {
            if (b6 != 1) {
                if (b6 != 3) {
                    return charSequence;
                }
            } else if ((i7 == 0 && i6 == 0 && spanned.length() == 0 && charSequence == textView.getText()) || charSequence == null) {
                return charSequence;
            } else {
                if (!(i2 == 0 && i5 == charSequence.length())) {
                    charSequence = charSequence.subSequence(i2, i5);
                }
                return j.a().e(charSequence, 0, charSequence.length());
            }
        }
        j a6 = j.a();
        if (this.f3861b == null) {
            this.f3861b = new c(textView, this);
        }
        a6.f(this.f3861b);
        return charSequence;
    }
}
