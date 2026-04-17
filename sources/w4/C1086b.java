package w4;

import android.widget.SeekBar;
import d5.o;

/* renamed from: w4.b  reason: case insensitive filesystem */
public final class C1086b implements SeekBar.OnSeekBarChangeListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f12443a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ C1088d f12444b;

    public /* synthetic */ C1086b(C1088d dVar, int i2) {
        this.f12443a = i2;
        this.f12444b = dVar;
    }

    public final void onProgressChanged(SeekBar seekBar, int i2, boolean z3) {
        switch (this.f12443a) {
            case 0:
                C1088d dVar = this.f12444b;
                int i5 = dVar.O0;
                int i6 = dVar.f12464P0;
                int i7 = dVar.f12465Q0;
                if (i2 > 100 - ((i5 + i6) + i7)) {
                    i2 = 100 - ((i5 + i6) + i7);
                    dVar.f12482r0.setProgress(i2);
                }
                dVar.f12463N0 = i2;
                dVar.f12478n0.setText(String.valueOf((o.getMainStatesObject().getPowerCurrent() * dVar.f12463N0) / 100));
                return;
            case 1:
                C1088d dVar2 = this.f12444b;
                int i8 = dVar2.f12463N0;
                int i9 = dVar2.f12464P0;
                int i10 = dVar2.f12465Q0;
                if (i2 > 100 - ((i8 + i9) + i10)) {
                    i2 = 100 - ((i8 + i9) + i10);
                    dVar2.s0.setProgress(i2);
                }
                dVar2.O0 = i2;
                dVar2.f12479o0.setText(String.valueOf((o.getMainStatesObject().getPowerCurrent() * dVar2.O0) / 100));
                return;
            case 2:
                C1088d dVar3 = this.f12444b;
                int i11 = dVar3.f12463N0;
                int i12 = dVar3.O0;
                int i13 = dVar3.f12465Q0;
                if (i2 > 100 - ((i11 + i12) + i13)) {
                    i2 = 100 - ((i11 + i12) + i13);
                    dVar3.f12483t0.setProgress(i2);
                }
                dVar3.f12464P0 = i2;
                dVar3.f12480p0.setText(String.valueOf((o.getMainStatesObject().getPowerCurrent() * dVar3.f12464P0) / 100));
                return;
            default:
                C1088d dVar4 = this.f12444b;
                int i14 = dVar4.f12463N0;
                int i15 = dVar4.O0;
                int i16 = dVar4.f12464P0;
                if (i2 > 100 - ((i14 + i15) + i16)) {
                    i2 = 100 - ((i14 + i15) + i16);
                    dVar4.f12484u0.setProgress(i2);
                }
                dVar4.f12465Q0 = i2;
                dVar4.f12481q0.setText(String.valueOf((o.getMainStatesObject().getPowerCurrent() * dVar4.f12465Q0) / 100));
                return;
        }
    }

    public final void onStartTrackingTouch(SeekBar seekBar) {
        int i2 = this.f12443a;
    }

    public final void onStopTrackingTouch(SeekBar seekBar) {
        int i2 = this.f12443a;
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

    private final void g(SeekBar seekBar) {
    }

    private final void h(SeekBar seekBar) {
    }
}
