package K4;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import androidx.fragment.app.C0286s;
import com.mtma.criminal.city.R;
import com.mtma.criminal.city.app.MyApplication;
import com.mtma.criminal.city.fragments.gangBase.D;

public final class c implements TextWatcher {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f1505a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ EditText f1506b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ C0286s f1507c;

    public /* synthetic */ c(C0286s sVar, EditText editText, int i2) {
        this.f1505a = i2;
        this.f1507c = sVar;
        this.f1506b = editText;
    }

    public final void afterTextChanged(Editable editable) {
        int i2 = this.f1505a;
    }

    public final void beforeTextChanged(CharSequence charSequence, int i2, int i5, int i6) {
        int i7 = this.f1505a;
    }

    public final void onTextChanged(CharSequence charSequence, int i2, int i5, int i6) {
        switch (this.f1505a) {
            case 0:
                EditText editText = this.f1506b;
                try {
                    if (editText.getLineCount() > 20) {
                        com.bumptech.glide.c.s0(((k) this.f1507c).f1553d0, MyApplication.f7090a.getApplicationContext().getString(R.string.reach_chat_message_maximum_lines), (String) null);
                        editText.setText(charSequence.subSequence(0, charSequence.length() - 1));
                        editText.setSelection(editText.getText().length());
                        return;
                    }
                    return;
                } catch (Exception unused) {
                    return;
                }
            default:
                EditText editText2 = this.f1506b;
                try {
                    if (editText2.getLineCount() > 10) {
                        com.bumptech.glide.c.s0(((D) this.f1507c).f7109d0, MyApplication.f7090a.getApplicationContext().getString(R.string.reach_chat_message_maximum_lines), (String) null);
                        editText2.setText(charSequence.subSequence(0, charSequence.length() - 1));
                        editText2.setSelection(editText2.getText().length());
                        return;
                    }
                    return;
                } catch (Exception unused2) {
                    return;
                }
        }
    }

    private final void a(Editable editable) {
    }

    private final void b(Editable editable) {
    }

    private final void c(int i2, int i5, int i6, CharSequence charSequence) {
    }

    private final void d(int i2, int i5, int i6, CharSequence charSequence) {
    }
}
