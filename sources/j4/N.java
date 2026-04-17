package j4;

import android.widget.EditText;
import android.widget.SeekBar;

public final class N implements SeekBar.OnSeekBarChangeListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f8926a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ EditText f8927b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ int f8928c;

    public /* synthetic */ N(EditText editText, int i2, int i5) {
        this.f8926a = i5;
        this.f8927b = editText;
        this.f8928c = i2;
    }

    public final void onProgressChanged(SeekBar seekBar, int i2, boolean z3) {
        switch (this.f8926a) {
            case 0:
                int i5 = 1;
                EditText editText = this.f8927b;
                if (i2 == 0) {
                    editText.setText("1");
                    editText.setSelection(1);
                    return;
                }
                int i6 = (this.f8928c * i2) / 100;
                if (i6 != 0) {
                    i5 = i6;
                }
                editText.setText(String.valueOf(i5));
                editText.setSelection(String.valueOf(i5).length());
                return;
            case 1:
                int i7 = 1;
                EditText editText2 = this.f8927b;
                if (i2 == 0) {
                    editText2.setText("1");
                    editText2.setSelection(1);
                    return;
                }
                int i8 = (this.f8928c * i2) / 100;
                if (i8 != 0) {
                    i7 = i8;
                }
                editText2.setText(String.valueOf(i7));
                editText2.setSelection(String.valueOf(i7).length());
                return;
            default:
                int i9 = this.f8928c;
                EditText editText3 = this.f8927b;
                if (i2 != 0 || i9 == 0) {
                    long j6 = (((long) i9) * ((long) i2)) / 100;
                    if (j6 == 0 && i9 != 0) {
                        j6 = 1;
                    }
                    editText3.setText(String.valueOf(j6));
                    editText3.setSelection(String.valueOf(j6).length());
                    return;
                }
                editText3.setText("1");
                editText3.setSelection(1);
                return;
        }
    }

    public final void onStartTrackingTouch(SeekBar seekBar) {
        int i2 = this.f8926a;
    }

    public final void onStopTrackingTouch(SeekBar seekBar) {
        int i2 = this.f8926a;
    }

    public N(int i2, EditText editText) {
        this.f8926a = 2;
        this.f8928c = i2;
        this.f8927b = editText;
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
