package j4;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import android.widget.TextView;
import com.mtma.criminal.city.R;
import com.mtma.criminal.city.app.MyApplication;
import com.mtma.criminal.city.utils.U;
import com.mtma.criminal.city.utils.v0;
import h0.C0552a;

public final class L0 implements TextWatcher {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ EditText f8911a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ TextView f8912b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ M0 f8913c;

    public L0(M0 m02, EditText editText, TextView textView) {
        this.f8913c = m02;
        this.f8911a = editText;
        this.f8912b = textView;
    }

    public final void afterTextChanged(Editable editable) {
        long j6;
        String trim = editable.toString().trim();
        try {
            j6 = Long.parseLong(trim);
        } catch (Exception e6) {
            int i2 = M0.f8918k;
            C0552a.x(e6, "Exception from try-catch block when get integer from EditText (ignore it, default value added 0).", "M0");
            j6 = 0;
        }
        if (trim.length() == 13) {
            v0.d(this.f8913c.f8919a, this.f8911a, MyApplication.f7090a.getApplicationContext().getString(R.string.toast_reach_to_maximum_character_number));
            return;
        }
        this.f8912b.setText(U.a(j6));
    }

    public final void beforeTextChanged(CharSequence charSequence, int i2, int i5, int i6) {
    }

    public final void onTextChanged(CharSequence charSequence, int i2, int i5, int i6) {
    }
}
