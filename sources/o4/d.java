package o4;

import android.text.Editable;
import android.text.TextWatcher;
import com.bumptech.glide.c;
import com.mtma.criminal.city.R;
import com.mtma.criminal.city.app.MyApplication;
import com.mtma.criminal.city.utils.U;
import d5.o;
import h0.C0552a;

public final class d implements TextWatcher {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f10450a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ e f10451b;

    public /* synthetic */ d(e eVar, int i2) {
        this.f10450a = i2;
        this.f10451b = eVar;
    }

    public final void afterTextChanged(Editable editable) {
        e eVar = this.f10451b;
        long j6 = 0;
        switch (this.f10450a) {
            case 0:
                try {
                    j6 = Long.parseLong(editable.toString().trim());
                } catch (Exception e6) {
                    C0552a.x(e6, "Exception from try-catch block when get integer from EditText (ignore it, default value added 0).", "e");
                }
                if (j6 > o.getMoneyObject().getCash()) {
                    long cash = o.getMoneyObject().getCash();
                    eVar.f10463n0.setText(U.a(cash));
                    eVar.f10466q0.setText(String.valueOf(cash));
                    eVar.s0.setProgress(100);
                    c.s0(eVar.f10453d0, MyApplication.f7090a.getApplicationContext().getString(R.string.selected_deposit_Value_not_available), (String) null);
                    return;
                }
                eVar.f10463n0.setText(U.a(j6));
                return;
            default:
                try {
                    j6 = Long.parseLong(editable.toString().trim());
                } catch (Exception e7) {
                    C0552a.x(e7, "Exception from try-catch block when get integer from EditText (ignore it, default value added 0).", "e");
                }
                if (j6 > o.getMoneyObject().getBankCash()) {
                    long bankCash = o.getMoneyObject().getBankCash();
                    eVar.f10464o0.setText(U.a(bankCash));
                    eVar.f10467r0.setText(String.valueOf(bankCash));
                    eVar.f10468t0.setProgress(100);
                    c.s0(eVar.f10453d0, MyApplication.f7090a.getApplicationContext().getString(R.string.selected_withdrawal_Value_not_available), (String) null);
                    return;
                }
                eVar.f10464o0.setText(U.a(j6));
                return;
        }
    }

    public final void beforeTextChanged(CharSequence charSequence, int i2, int i5, int i6) {
        int i7 = this.f10450a;
    }

    public final void onTextChanged(CharSequence charSequence, int i2, int i5, int i6) {
        int i7 = this.f10450a;
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
