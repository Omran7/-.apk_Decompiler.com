package j4;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import com.bumptech.glide.c;
import com.mtma.criminal.city.R;
import com.mtma.criminal.city.app.MyApplication;

/* renamed from: j4.e  reason: case insensitive filesystem */
public final class C0620e implements TextWatcher {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f8995a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ EditText f8996b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ C0626h f8997c;

    public /* synthetic */ C0620e(C0626h hVar, EditText editText, int i2) {
        this.f8995a = i2;
        this.f8997c = hVar;
        this.f8996b = editText;
    }

    public final void afterTextChanged(Editable editable) {
        int i2 = this.f8995a;
    }

    public final void beforeTextChanged(CharSequence charSequence, int i2, int i5, int i6) {
        int i7 = this.f8995a;
    }

    public final void onTextChanged(CharSequence charSequence, int i2, int i5, int i6) {
        switch (this.f8995a) {
            case 0:
                EditText editText = this.f8996b;
                try {
                    if (editText.getLineCount() > 20) {
                        c.s0(this.f8997c.f9018b, MyApplication.f7090a.getApplicationContext().getString(R.string.reach_chat_message_maximum_lines), (String) null);
                        editText.setText(charSequence.subSequence(0, charSequence.length() - 1));
                        editText.setSelection(editText.getText().length());
                        return;
                    }
                    return;
                } catch (Exception unused) {
                    return;
                }
            default:
                EditText editText2 = this.f8996b;
                try {
                    if (editText2.getLineCount() > 20) {
                        c.s0(this.f8997c.f9018b, MyApplication.f7090a.getApplicationContext().getString(R.string.reach_chat_message_maximum_lines), (String) null);
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
