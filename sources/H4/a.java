package H4;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import androidx.fragment.app.C0286s;
import com.bumptech.glide.c;
import com.mtma.criminal.city.R;
import com.mtma.criminal.city.app.MyApplication;
import r4.j;

public final class a implements TextWatcher {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f1018a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ C0286s f1019b;

    public /* synthetic */ a(int i2, C0286s sVar) {
        this.f1018a = i2;
        this.f1019b = sVar;
    }

    public final void afterTextChanged(Editable editable) {
        int i2 = this.f1018a;
    }

    public final void beforeTextChanged(CharSequence charSequence, int i2, int i5, int i6) {
        int i7 = this.f1018a;
    }

    public final void onTextChanged(CharSequence charSequence, int i2, int i5, int i6) {
        switch (this.f1018a) {
            case 0:
                h hVar = (h) this.f1019b;
                try {
                    if (hVar.f1038h0.getLineCount() > 20) {
                        c.s0(hVar.f1034d0, MyApplication.f7090a.getApplicationContext().getString(R.string.reach_chat_message_maximum_lines), (String) null);
                        hVar.f1038h0.setText(charSequence.subSequence(0, charSequence.length() - 1));
                        EditText editText = hVar.f1038h0;
                        editText.setSelection(editText.getText().length());
                        return;
                    }
                    return;
                } catch (Exception unused) {
                    return;
                }
            default:
                j jVar = (j) this.f1019b;
                try {
                    if (jVar.f11251j0.getLineCount() > 20) {
                        c.s0(jVar.f11245d0, MyApplication.f7090a.getApplicationContext().getString(R.string.reach_chat_message_maximum_lines), (String) null);
                        jVar.f11251j0.setText(charSequence.subSequence(0, charSequence.length() - 1));
                        EditText editText2 = jVar.f11251j0;
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
