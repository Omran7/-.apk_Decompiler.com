package K4;

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
import h0.C0552a;
import j4.A0;
import j4.M0;
import r4.j;

public final class s implements TextWatcher {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f1604a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ EditText f1605b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ SeekBar f1606c;
    public final /* synthetic */ Object d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ Object f1607e;

    public /* synthetic */ s(Object obj, Object obj2, EditText editText, SeekBar seekBar, int i2) {
        this.f1604a = i2;
        this.f1607e = obj;
        this.d = obj2;
        this.f1605b = editText;
        this.f1606c = seekBar;
    }

    public final void afterTextChanged(Editable editable) {
        long j6;
        Object obj = this.d;
        Object obj2 = this.f1607e;
        SeekBar seekBar = this.f1606c;
        EditText editText = this.f1605b;
        switch (this.f1604a) {
            case 0:
                try {
                    j6 = Long.parseLong(editable.toString().trim());
                } catch (Exception e6) {
                    C0552a.x(e6, "Exception from try-catch block when get integer from EditText (ignore it, default value added 0).", "v");
                    j6 = 0;
                }
                TextView textView = (TextView) obj;
                if (j6 > o.getMoneyObject().getCash()) {
                    long cash = o.getMoneyObject().getCash();
                    textView.setText(U.a(cash));
                    editText.setText(String.valueOf(cash));
                    seekBar.setProgress(100);
                    a.n(MyApplication.f7090a, R.string.selected_cash_value_not_available, ((v) obj2).f1626d0, (String) null);
                    return;
                }
                textView.setText(U.a(j6));
                return;
            case 1:
                try {
                    int parseInt = Integer.parseInt(editable.toString().trim());
                    int i2 = ((D) obj).h;
                    if (parseInt > i2) {
                        editText.setText(String.valueOf(i2));
                        editText.setSelection(String.valueOf(i2).length());
                        seekBar.setProgress(100);
                        c.s0(((A0) obj2).f8839a, MyApplication.f7090a.getApplicationContext().getString(R.string.selected_number_of_items_not_available), (String) null);
                        return;
                    }
                    return;
                } catch (Exception e7) {
                    int i5 = A0.f8838f;
                    a.q("Exception from try-catch block inside ", "A0", " in displayRemoveItemsDialog method.", e7, "A0");
                    return;
                }
            case 2:
                try {
                    int parseInt2 = Integer.parseInt(editable.toString().trim());
                    int i6 = ((D) obj).h;
                    if (parseInt2 > i6) {
                        editText.setText(String.valueOf(i6));
                        editText.setSelection(String.valueOf(i6).length());
                        seekBar.setProgress(100);
                        c.s0(((M0) obj2).f8919a, MyApplication.f7090a.getApplicationContext().getString(R.string.selected_number_of_items_not_available), (String) null);
                        return;
                    }
                    return;
                } catch (Exception e8) {
                    int i7 = M0.f8918k;
                    a.q("Exception from try-catch block inside ", "M0", " in displaySendMaterialDialog method.", e8, "M0");
                    return;
                }
            default:
                try {
                    int parseInt3 = Integer.parseInt(editable.toString().trim()) * 5;
                    if (parseInt3 > o.getMoneyObject().getGold()) {
                        editText.setText(String.valueOf((long) (o.getMoneyObject().getGold() / 5)));
                        seekBar.setProgress(100);
                        c.y0(((j) obj2).f11245d0);
                        return;
                    }
                    ((TextView) obj).setText(String.valueOf(parseInt3));
                    return;
                } catch (Exception e9) {
                    a.q("Exception from try-catch block inside ", "j", " in displayBuySpeakersDialog method.", e9, "j");
                    return;
                }
        }
    }

    public final void beforeTextChanged(CharSequence charSequence, int i2, int i5, int i6) {
        int i7 = this.f1604a;
    }

    public final void onTextChanged(CharSequence charSequence, int i2, int i5, int i6) {
        int i7 = this.f1604a;
    }

    public s(j jVar, EditText editText, SeekBar seekBar, TextView textView) {
        this.f1604a = 3;
        this.f1607e = jVar;
        this.f1605b = editText;
        this.f1606c = seekBar;
        this.d = textView;
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

    private final void g(int i2, int i5, int i6, CharSequence charSequence) {
    }

    private final void h(int i2, int i5, int i6, CharSequence charSequence) {
    }
}
