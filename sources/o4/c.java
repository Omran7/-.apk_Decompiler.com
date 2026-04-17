package o4;

import android.widget.SeekBar;
import com.mtma.criminal.city.utils.U;
import d5.o;

public final class c implements SeekBar.OnSeekBarChangeListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f10448a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ e f10449b;

    public /* synthetic */ c(e eVar, int i2) {
        this.f10448a = i2;
        this.f10449b = eVar;
    }

    public final void onProgressChanged(SeekBar seekBar, int i2, boolean z3) {
        switch (this.f10448a) {
            case 0:
                e eVar = this.f10449b;
                eVar.f10466q0.setText("");
                eVar.f10466q0.clearFocus();
                eVar.f10463n0.setText(U.a((o.getMoneyObject().getCash() * ((long) i2)) / 100));
                return;
            default:
                e eVar2 = this.f10449b;
                eVar2.f10467r0.setText("");
                eVar2.f10467r0.clearFocus();
                eVar2.f10464o0.setText(U.a((o.getMoneyObject().getBankCash() * ((long) i2)) / 100));
                return;
        }
    }

    public final void onStartTrackingTouch(SeekBar seekBar) {
        int i2 = this.f10448a;
    }

    public final void onStopTrackingTouch(SeekBar seekBar) {
        int i2 = this.f10448a;
    }

    private final void a(SeekBar seekBar) {
    }

    private final void b(SeekBar seekBar) {
    }

    private final void c(SeekBar seekBar) {
    }

    private final void d(SeekBar seekBar) {
    }
}
