package j4;

import Y4.D;
import android.widget.EditText;
import android.widget.SeekBar;
import d5.o;

/* renamed from: j4.h0  reason: case insensitive filesystem */
public final class C0627h0 implements SeekBar.OnSeekBarChangeListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ EditText f9020a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ long f9021b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ D f9022c;

    public C0627h0(EditText editText, long j6, D d) {
        this.f9020a = editText;
        this.f9021b = j6;
        this.f9022c = d;
    }

    public final void onProgressChanged(SeekBar seekBar, int i2, boolean z3) {
        EditText editText = this.f9020a;
        if (i2 == 0) {
            editText.setText("1");
            return;
        }
        D d = this.f9022c;
        long j6 = d.f4297f;
        long j7 = this.f9021b;
        if (j6 * j7 > o.getMoneyObject().getCash()) {
            j7 = o.getMoneyObject().getCash() / d.f4297f;
        }
        int i5 = d.h;
        if (j7 > ((long) i5)) {
            j7 = (long) i5;
        }
        long j8 = (j7 * ((long) i2)) / 100;
        if (j8 == 0) {
            j8 = 1;
        }
        editText.setText(String.valueOf(j8));
    }

    public final void onStartTrackingTouch(SeekBar seekBar) {
    }

    public final void onStopTrackingTouch(SeekBar seekBar) {
    }
}
