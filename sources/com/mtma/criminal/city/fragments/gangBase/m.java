package com.mtma.criminal.city.fragments.gangBase;

import android.text.Editable;
import android.text.TextWatcher;
import com.bumptech.glide.c;
import com.mtma.criminal.city.R;
import com.mtma.criminal.city.app.MyApplication;
import com.mtma.criminal.city.utils.U;
import d5.o;
import h0.C0552a;

public final class m implements TextWatcher {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f7222a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ o f7223b;

    public /* synthetic */ m(o oVar, int i2) {
        this.f7222a = i2;
        this.f7223b = oVar;
    }

    public final void afterTextChanged(Editable editable) {
        int i2;
        long j6 = 0;
        o oVar = this.f7223b;
        switch (this.f7222a) {
            case 0:
                try {
                    j6 = Long.parseLong(editable.toString().trim());
                } catch (Exception e6) {
                    C0552a.x(e6, "Exception from try-catch block when get integer from EditText (ignore it, default value added 0).", "o");
                }
                if (j6 > o.getMoneyObject().getCash()) {
                    long cash = o.getMoneyObject().getCash();
                    oVar.f7234i0.setText(U.a(cash));
                    oVar.f7237l0.setText(String.valueOf(cash));
                    oVar.f7240o0.setProgress(100);
                    c.s0(oVar.f7229d0, MyApplication.f7090a.getApplicationContext().getString(R.string.selected_deposit_Value_not_available), (String) null);
                    return;
                }
                oVar.f7234i0.setText(U.a(j6));
                return;
            case 1:
                try {
                    i2 = Integer.parseInt(editable.toString().trim());
                } catch (Exception e7) {
                    C0552a.x(e7, "Exception from try-catch block when get integer from EditText (ignore it, default value added 0).", "o");
                    i2 = 0;
                }
                if (i2 > o.getMoneyObject().getGold()) {
                    int gold = o.getMoneyObject().getGold();
                    oVar.f7235j0.setText(U.a((long) gold));
                    oVar.f7238m0.setText(String.valueOf(gold));
                    oVar.f7241p0.setProgress(100);
                    c.s0(oVar.f7229d0, MyApplication.f7090a.getApplicationContext().getString(R.string.selected_deposit_Value_not_available), (String) null);
                    return;
                }
                oVar.f7235j0.setText(U.a((long) i2));
                return;
            default:
                try {
                    j6 = Long.parseLong(editable.toString().trim());
                } catch (Exception e8) {
                    C0552a.x(e8, "Exception from try-catch block when get integer from EditText (ignore it, default value added 0).", "o");
                }
                if (j6 > oVar.f7246v0.longValue()) {
                    long longValue = oVar.f7246v0.longValue();
                    oVar.f7236k0.setText(U.a(longValue));
                    oVar.f7239n0.setText(String.valueOf(longValue));
                    oVar.f7242q0.setProgress(100);
                    c.s0(oVar.f7229d0, MyApplication.f7090a.getApplicationContext().getString(R.string.toast_gang_not_has_enough_cash), (String) null);
                    return;
                }
                oVar.f7236k0.setText(U.a(j6));
                return;
        }
    }

    public final void beforeTextChanged(CharSequence charSequence, int i2, int i5, int i6) {
        int i7 = this.f7222a;
    }

    public final void onTextChanged(CharSequence charSequence, int i2, int i5, int i6) {
        int i7 = this.f7222a;
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
