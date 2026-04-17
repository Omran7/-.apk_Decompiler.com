package p4;

import android.widget.EditText;
import android.widget.SeekBar;
import com.bumptech.glide.c;
import d5.o;
import j4.C0640p;

/* renamed from: p4.d  reason: case insensitive filesystem */
public final class C0921d implements SeekBar.OnSeekBarChangeListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f11009a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f11010b;

    public /* synthetic */ C0921d(Object obj, int i2) {
        this.f11009a = i2;
        this.f11010b = obj;
    }

    public final void onProgressChanged(SeekBar seekBar, int i2, boolean z3) {
        switch (this.f11009a) {
            case 0:
                C0923f fVar = (C0923f) this.f11010b;
                int round = (int) Math.round(((double) (((long) (fVar.W() / fVar.f11025p0)) * ((long) i2))) / 100.0d);
                if (round == 0 && fVar.W() >= fVar.f11025p0) {
                    round = 1;
                }
                int i5 = round * fVar.f11025p0;
                fVar.f11027r0 = i5;
                C0640p pVar = fVar.f11030v0;
                pVar.d = i5;
                pVar.notifyDataSetChanged();
                int P5 = c.P(fVar.f11014e0, fVar.f11015f0, fVar.f11027r0);
                fVar.f11026q0 = P5;
                fVar.f11021l0.setText(String.valueOf(P5));
                return;
            default:
                EditText editText = (EditText) this.f11010b;
                if (i2 == 0) {
                    editText.setText("1");
                    editText.setSelection(1);
                    return;
                }
                long gold = (((long) (o.getMoneyObject().getGold() / 5)) * ((long) i2)) / 100;
                if (gold == 0) {
                    gold = 1;
                }
                editText.setText(String.valueOf(gold));
                editText.setSelection(editText.getText().length());
                return;
        }
    }

    public final void onStartTrackingTouch(SeekBar seekBar) {
        int i2 = this.f11009a;
    }

    public final void onStopTrackingTouch(SeekBar seekBar) {
        int i2 = this.f11009a;
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
