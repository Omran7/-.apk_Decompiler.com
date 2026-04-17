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
import com.mtma.criminal.city.utils.v0;
import h0.C0552a;

public final class O implements TextWatcher {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f8929a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ int f8930b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ EditText f8931c;
    public final /* synthetic */ SeekBar d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ Object f8932e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ TextView f8933f;

    /* renamed from: p  reason: collision with root package name */
    public final /* synthetic */ ArrayAdapter f8934p;

    public /* synthetic */ O(ArrayAdapter arrayAdapter, int i2, EditText editText, SeekBar seekBar, D d6, TextView textView, int i5) {
        this.f8929a = i5;
        this.f8934p = arrayAdapter;
        this.f8930b = i2;
        this.f8931c = editText;
        this.d = seekBar;
        this.f8932e = d6;
        this.f8933f = textView;
    }

    public final void afterTextChanged(Editable editable) {
        int i2;
        Object obj = this.f8932e;
        ArrayAdapter arrayAdapter = this.f8934p;
        SeekBar seekBar = this.d;
        EditText editText = this.f8931c;
        int i5 = this.f8930b;
        TextView textView = this.f8933f;
        switch (this.f8929a) {
            case 0:
                try {
                    int intValue = Integer.valueOf(editable.toString().trim()).intValue();
                    D d6 = (D) obj;
                    if (intValue > i5) {
                        editText.setText(String.valueOf(i5));
                        seekBar.setProgress(100);
                        C0626h hVar = (C0626h) arrayAdapter;
                        if (intValue > d6.h) {
                            c.s0(hVar.f9018b, MyApplication.f7090a.getApplicationContext().getString(R.string.selected_number_of_items_not_available), (String) null);
                            return;
                        } else {
                            c.x0(hVar.f9018b);
                            return;
                        }
                    } else {
                        textView.setText(U.a(((long) intValue) * d6.f4297f));
                        return;
                    }
                } catch (Exception e6) {
                    int i6 = C0626h.d;
                    a.q("Exception from try-catch block inside ", "h", " in displayBuyDialog method.", e6, "h");
                    return;
                }
            case 1:
                try {
                    int intValue2 = Integer.valueOf(editable.toString().trim()).intValue();
                    D d7 = (D) obj;
                    if (intValue2 > i5) {
                        editText.setText(String.valueOf(i5));
                        seekBar.setProgress(100);
                        C0621e0 e0Var = (C0621e0) arrayAdapter;
                        if (intValue2 > d7.h) {
                            c.s0(e0Var.f8999a, MyApplication.f7090a.getApplicationContext().getString(R.string.selected_number_of_items_not_available), (String) null);
                            return;
                        } else {
                            c.x0(e0Var.f8999a);
                            return;
                        }
                    } else {
                        textView.setText(U.a(((long) intValue2) * d7.f4297f));
                        return;
                    }
                } catch (Exception e7) {
                    int i7 = C0621e0.f8998i;
                    a.q("Exception from try-catch block inside ", "e0", " in displayBuyDialog method.", e7, "e0");
                    return;
                }
            default:
                try {
                    i2 = Integer.parseInt(editable.toString().trim());
                } catch (Exception e8) {
                    int i8 = M0.f8918k;
                    C0552a.x(e8, "Exception from try-catch block when get integer from EditText (ignore it, default value added 0).", "M0");
                    i2 = 0;
                }
                if (i2 > i5) {
                    textView.setText(String.valueOf(i5));
                    editText.setText(String.valueOf(i5));
                    seekBar.setProgress(100);
                    v0.d(((M0) arrayAdapter).f8919a, (EditText) obj, MyApplication.f7090a.getApplicationContext().getString(R.string.selected_number_of_items_not_available));
                    return;
                }
                textView.setText(String.valueOf(i2));
                return;
        }
    }

    public final void beforeTextChanged(CharSequence charSequence, int i2, int i5, int i6) {
        int i7 = this.f8929a;
    }

    public final void onTextChanged(CharSequence charSequence, int i2, int i5, int i6) {
        int i7 = this.f8929a;
    }

    public O(M0 m02, int i2, TextView textView, EditText editText, SeekBar seekBar, EditText editText2) {
        this.f8929a = 2;
        this.f8934p = m02;
        this.f8930b = i2;
        this.f8933f = textView;
        this.f8931c = editText;
        this.d = seekBar;
        this.f8932e = editText2;
    }

    private final void a(int i2, int i5, int i6, CharSequence charSequence) {
    }

    private final void b(int i2, int i5, int i6, CharSequence charSequence) {
    }

    private final void c(int i2, int i5, int i6, CharSequence charSequence) {
    }

    private final void d(int i2, int i5, int i6, CharSequence charSequence) {
    }

    private final void e(int i2, int i5, int i6, CharSequence charSequence) {
    }

    private final void f(int i2, int i5, int i6, CharSequence charSequence) {
    }
}
