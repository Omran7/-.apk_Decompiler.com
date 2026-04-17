package j4;

import Y4.D;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.SeekBar;
import android.widget.TextView;
import com.bumptech.glide.c;
import com.google.android.gms.internal.measurement.a;
import com.mtma.criminal.city.R;
import com.mtma.criminal.city.app.MyApplication;
import com.mtma.criminal.city.utils.U;

/* renamed from: j4.n  reason: case insensitive filesystem */
public final class C0638n implements TextWatcher {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f9055a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ D f9056b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ EditText f9057c;
    public final /* synthetic */ SeekBar d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ TextView f9058e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ ArrayAdapter f9059f;

    public /* synthetic */ C0638n(ArrayAdapter arrayAdapter, D d6, EditText editText, SeekBar seekBar, TextView textView, int i2) {
        this.f9055a = i2;
        this.f9059f = arrayAdapter;
        this.f9056b = d6;
        this.f9057c = editText;
        this.d = seekBar;
        this.f9058e = textView;
    }

    public final void afterTextChanged(Editable editable) {
        TextView textView = this.f9058e;
        ArrayAdapter arrayAdapter = this.f9059f;
        SeekBar seekBar = this.d;
        D d6 = this.f9056b;
        EditText editText = this.f9057c;
        switch (this.f9055a) {
            case 0:
                try {
                    int parseInt = Integer.parseInt(editable.toString().trim());
                    int i2 = d6.h;
                    if (parseInt > i2) {
                        editText.setText(String.valueOf(i2));
                        editText.setSelection(String.valueOf(i2).length());
                        seekBar.setProgress(100);
                        c.s0(((C0639o) arrayAdapter).f9065a, MyApplication.f7090a.getApplicationContext().getString(R.string.selected_number_of_items_not_available), (String) null);
                        return;
                    }
                    textView.setText(U.a(((long) parseInt) * (d6.f4297f / 2)));
                    return;
                } catch (Exception e6) {
                    int i5 = C0639o.f9064e;
                    a.q("Exception from try-catch block inside ", "o", " in displaySellDialog method.", e6, "o");
                    return;
                }
            default:
                try {
                    int parseInt2 = Integer.parseInt(editable.toString().trim());
                    int i6 = d6.h;
                    if (parseInt2 > i6) {
                        editText.setText(String.valueOf(i6));
                        editText.setSelection(String.valueOf(i6).length());
                        seekBar.setProgress(100);
                        c.s0(((A0) arrayAdapter).f8839a, MyApplication.f7090a.getApplicationContext().getString(R.string.selected_number_of_items_not_available), (String) null);
                        return;
                    }
                    textView.setText(U.a(((long) parseInt2) * (d6.f4297f / 2)));
                    return;
                } catch (Exception e7) {
                    int i7 = A0.f8838f;
                    a.q("Exception from try-catch block inside ", "A0", " in displayDialog method.", e7, "A0");
                    return;
                }
        }
    }

    public final void beforeTextChanged(CharSequence charSequence, int i2, int i5, int i6) {
        int i7 = this.f9055a;
    }

    public final void onTextChanged(CharSequence charSequence, int i2, int i5, int i6) {
        int i7 = this.f9055a;
    }

    private final void a(int i2, int i5, int i6, CharSequence charSequence) {
    }

    private final void b(int i2, int i5, int i6, CharSequence charSequence) {
    }

    private final void c(int i2, int i5, int i6, CharSequence charSequence) {
    }

    private final void d(int i2, int i5, int i6, CharSequence charSequence) {
    }
}
