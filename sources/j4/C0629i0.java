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
import d5.o;

/* renamed from: j4.i0  reason: case insensitive filesystem */
public final class C0629i0 implements TextWatcher {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ D f9026a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ EditText f9027b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ SeekBar f9028c;
    public final /* synthetic */ long d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ TextView f9029e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ C0626h f9030f;

    public C0629i0(C0626h hVar, D d6, EditText editText, SeekBar seekBar, long j6, TextView textView) {
        this.f9030f = hVar;
        this.f9026a = d6;
        this.f9027b = editText;
        this.f9028c = seekBar;
        this.d = j6;
        this.f9029e = textView;
    }

    public final void afterTextChanged(Editable editable) {
        D d6 = this.f9026a;
        try {
            int parseInt = Integer.parseInt(editable.toString().trim());
            int i2 = d6.h;
            SeekBar seekBar = this.f9028c;
            EditText editText = this.f9027b;
            C0626h hVar = this.f9030f;
            if (parseInt > i2) {
                editText.setText(String.valueOf(i2));
                seekBar.setProgress(100);
                c.s0(hVar.f9018b, MyApplication.f7090a.getApplicationContext().getString(R.string.selected_number_of_items_not_available), (String) null);
                return;
            }
            long j6 = (long) parseInt;
            if (d6.f4297f * j6 > o.getMoneyObject().getCash()) {
                editText.setText(String.valueOf(o.getMoneyObject().getCash() / d6.f4297f));
                seekBar.setProgress(100);
                c.s0(hVar.f9018b, MyApplication.f7090a.getApplicationContext().getString(R.string.you_do_not_have_enough_money), (String) null);
                return;
            }
            long j7 = this.d;
            if (j6 > j7) {
                editText.setText(String.valueOf(j7));
                editText.setSelection(editable.length());
                seekBar.setProgress(100);
                if (o.getLocationObject().getCurrentCity() == 0) {
                    c.s0(hVar.f9018b, MyApplication.f7090a.getApplicationContext().getString(R.string.stock_has_only_free_space, new Object[]{Long.valueOf(j7)}), (String) null);
                } else {
                    c.s0(hVar.f9018b, MyApplication.f7090a.getApplicationContext().getString(R.string.bag_has_only_free_space, new Object[]{Long.valueOf(j7)}), (String) null);
                }
            } else {
                this.f9029e.setText(U.a(j6 * d6.f4297f));
            }
        } catch (Exception e6) {
            int i5 = C0626h.d;
            a.q("Exception from try-catch block inside ", "h", " in displayBuyDialog method.", e6, "h");
        }
    }

    public final void beforeTextChanged(CharSequence charSequence, int i2, int i5, int i6) {
    }

    public final void onTextChanged(CharSequence charSequence, int i2, int i5, int i6) {
    }
}
