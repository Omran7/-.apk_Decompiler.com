package j4;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import android.widget.SeekBar;
import com.bumptech.glide.c;
import com.google.android.gms.internal.measurement.a;
import com.mtma.criminal.city.R;
import com.mtma.criminal.city.app.MyApplication;

public final class G0 implements TextWatcher {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f8879a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ EditText f8880b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ SeekBar f8881c;
    public final /* synthetic */ M0 d;

    public G0(M0 m02, int i2, EditText editText, SeekBar seekBar) {
        this.d = m02;
        this.f8879a = i2;
        this.f8880b = editText;
        this.f8881c = seekBar;
    }

    public final void afterTextChanged(Editable editable) {
        EditText editText = this.f8880b;
        try {
            int parseInt = Integer.parseInt(editable.toString().trim());
            int i2 = this.f8879a;
            if (parseInt > i2) {
                editText.setText(String.valueOf(i2));
                editText.setSelection(String.valueOf(i2).length());
                this.f8881c.setProgress(100);
                c.s0(this.d.f8919a, MyApplication.f7090a.getApplicationContext().getString(R.string.no_enough_space_in_bag), (String) null);
            }
        } catch (Exception e6) {
            int i5 = M0.f8918k;
            a.q("Exception from try-catch block inside ", "M0", " in displayAddItemToBagDialog method.", e6, "M0");
        }
    }

    public final void beforeTextChanged(CharSequence charSequence, int i2, int i5, int i6) {
    }

    public final void onTextChanged(CharSequence charSequence, int i2, int i5, int i6) {
    }
}
