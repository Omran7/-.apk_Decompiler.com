package j4;

import Y4.D;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import android.widget.SeekBar;
import android.widget.TextView;
import com.bumptech.glide.c;
import com.google.android.gms.internal.measurement.a;
import com.mtma.criminal.city.R;
import com.mtma.criminal.city.app.MyApplication;
import com.mtma.criminal.city.utils.U;

public final class z0 implements TextWatcher {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ D f9136a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ EditText f9137b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ SeekBar f9138c;
    public final /* synthetic */ TextView d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ TextView f9139e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ A0 f9140f;

    public z0(A0 a02, D d6, EditText editText, SeekBar seekBar, TextView textView, TextView textView2) {
        this.f9140f = a02;
        this.f9136a = d6;
        this.f9137b = editText;
        this.f9138c = seekBar;
        this.d = textView;
        this.f9139e = textView2;
    }

    public final void afterTextChanged(Editable editable) {
        EditText editText = this.f9137b;
        try {
            int parseInt = Integer.parseInt(editable.toString().trim());
            D d6 = this.f9136a;
            int i2 = d6.h;
            if (parseInt > i2) {
                editText.setText(String.valueOf(i2));
                editText.setSelection(String.valueOf(i2).length());
                this.f9138c.setProgress(100);
                c.s0(this.f9140f.f8839a, MyApplication.f7090a.getApplicationContext().getString(R.string.selected_number_of_items_not_available), (String) null);
                return;
            }
            long j6 = (long) parseInt;
            long j7 = d6.f4297f * j6;
            long j8 = j6 * d6.g;
            this.d.setText(U.a(j7));
            this.f9139e.setText(U.a(j8));
        } catch (Exception e6) {
            int i5 = A0.f8838f;
            a.q("Exception from try-catch block inside ", "A0", " in displayDialog method.", e6, "A0");
        }
    }

    public final void beforeTextChanged(CharSequence charSequence, int i2, int i5, int i6) {
    }

    public final void onTextChanged(CharSequence charSequence, int i2, int i5, int i6) {
    }
}
