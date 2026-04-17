package j4;

import android.content.Context;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import android.widget.SeekBar;
import android.widget.TextView;
import com.bumptech.glide.c;
import com.google.android.gms.internal.measurement.a;
import com.mtma.criminal.city.R;
import com.mtma.criminal.city.app.MyApplication;

public final class s0 implements TextWatcher {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ long f9091a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ long f9092b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ EditText f9093c;
    public final /* synthetic */ SeekBar d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ TextView f9094e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ Z f9095f;

    public s0(Z z3, long j6, long j7, EditText editText, SeekBar seekBar, TextView textView) {
        this.f9095f = z3;
        this.f9091a = j6;
        this.f9092b = j7;
        this.f9093c = editText;
        this.d = seekBar;
        this.f9094e = textView;
    }

    public final void afterTextChanged(Editable editable) {
        try {
            long j6 = this.f9091a;
            long intValue = ((long) Integer.valueOf(editable.toString().trim()).intValue()) * j6;
            long j7 = this.f9092b;
            if (intValue > j7) {
                this.f9093c.setText(String.valueOf(j7 / j6));
                this.d.setProgress(100);
                Z z3 = this.f9095f;
                int i2 = z3.d;
                Context context = z3.f8965b;
                if (i2 == 0) {
                    c.y0(context);
                } else if (i2 == 1) {
                    c.s0(context, MyApplication.f7090a.getApplicationContext().getString(R.string.do_not_have_enough_check), (String) null);
                }
            } else {
                this.f9094e.setText(String.valueOf(intValue));
            }
        } catch (Exception e6) {
            int i5 = Z.g;
            a.q("Exception from try-catch block inside ", "Z", " in displayBuyDialog method.", e6, "Z");
        }
    }

    public final void beforeTextChanged(CharSequence charSequence, int i2, int i5, int i6) {
    }

    public final void onTextChanged(CharSequence charSequence, int i2, int i5, int i6) {
    }
}
