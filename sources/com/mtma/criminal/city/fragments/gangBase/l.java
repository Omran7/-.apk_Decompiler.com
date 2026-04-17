package com.mtma.criminal.city.fragments.gangBase;

import android.widget.SeekBar;
import com.mtma.criminal.city.utils.U;
import d5.o;

public final class l implements SeekBar.OnSeekBarChangeListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f7220a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ o f7221b;

    public /* synthetic */ l(o oVar, int i2) {
        this.f7220a = i2;
        this.f7221b = oVar;
    }

    public final void onProgressChanged(SeekBar seekBar, int i2, boolean z3) {
        switch (this.f7220a) {
            case 0:
                o oVar = this.f7221b;
                oVar.f7237l0.setText("");
                oVar.f7237l0.clearFocus();
                oVar.f7234i0.setText(U.a((o.getMoneyObject().getCash() * ((long) i2)) / 100));
                return;
            case 1:
                o oVar2 = this.f7221b;
                oVar2.f7238m0.setText("");
                oVar2.f7238m0.clearFocus();
                oVar2.f7235j0.setText(U.a((long) ((o.getMoneyObject().getGold() * i2) / 100)));
                return;
            default:
                o oVar3 = this.f7221b;
                oVar3.f7239n0.setText("");
                oVar3.f7239n0.clearFocus();
                oVar3.f7236k0.setText(U.a((oVar3.f7246v0.longValue() * ((long) i2)) / 100));
                return;
        }
    }

    public final void onStartTrackingTouch(SeekBar seekBar) {
        int i2 = this.f7220a;
    }

    public final void onStopTrackingTouch(SeekBar seekBar) {
        int i2 = this.f7220a;
    }

    private final void a(SeekBar seekBar) {
    }

    private final void b(SeekBar seekBar) {
    }

    private final void c(SeekBar seekBar) {
    }

    private final void d(SeekBar seekBar) {
    }

    private final void e(SeekBar seekBar) {
    }

    private final void f(SeekBar seekBar) {
    }
}
