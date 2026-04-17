package j4;

import Y4.D;
import android.widget.EditText;
import android.widget.SeekBar;
import android.widget.TextView;
import com.mtma.criminal.city.utils.U;
import d5.o;

/* renamed from: j4.m  reason: case insensitive filesystem */
public final class C0636m implements SeekBar.OnSeekBarChangeListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f9049a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ EditText f9050b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Object f9051c;

    public /* synthetic */ C0636m(EditText editText, Object obj, int i2) {
        this.f9049a = i2;
        this.f9050b = editText;
        this.f9051c = obj;
    }

    public final void onProgressChanged(SeekBar seekBar, int i2, boolean z3) {
        switch (this.f9049a) {
            case 0:
                EditText editText = this.f9050b;
                if (i2 == 0) {
                    editText.setText("1");
                    editText.setSelection(1);
                    return;
                }
                long j6 = (((long) ((D) this.f9051c).h) * ((long) i2)) / 100;
                if (j6 == 0) {
                    j6 = 1;
                }
                editText.setText(String.valueOf(j6));
                editText.setSelection(String.valueOf(j6).length());
                return;
            case 1:
                EditText editText2 = this.f9050b;
                if (i2 == 0) {
                    editText2.setText("1");
                    editText2.setSelection(1);
                    return;
                }
                long j7 = (((long) ((D) this.f9051c).h) * ((long) i2)) / 100;
                if (j7 == 0) {
                    j7 = 1;
                }
                editText2.setText(String.valueOf(j7));
                editText2.setSelection(String.valueOf(j7).length());
                return;
            case 2:
                EditText editText3 = this.f9050b;
                if (i2 == 0) {
                    editText3.setText("1");
                    editText3.setSelection(1);
                    return;
                }
                long j8 = (((long) ((D) this.f9051c).h) * ((long) i2)) / 100;
                if (j8 == 0) {
                    j8 = 1;
                }
                editText3.setText(String.valueOf(j8));
                editText3.setSelection(String.valueOf(j8).length());
                return;
            case 3:
                EditText editText4 = this.f9050b;
                if (i2 == 0) {
                    editText4.setText("1");
                    editText4.setSelection(1);
                    return;
                }
                long j9 = (((long) ((D) this.f9051c).h) * ((long) i2)) / 100;
                if (j9 == 0) {
                    j9 = 1;
                }
                editText4.setText(String.valueOf(j9));
                editText4.setSelection(String.valueOf(j9).length());
                return;
            case 4:
                EditText editText5 = this.f9050b;
                if (i2 == 0) {
                    editText5.setText("1");
                    editText5.setSelection(1);
                    return;
                }
                long j10 = (((long) ((D) this.f9051c).h) * ((long) i2)) / 100;
                if (j10 == 0) {
                    j10 = 1;
                }
                editText5.setText(String.valueOf(j10));
                editText5.setSelection(String.valueOf(j10).length());
                return;
            default:
                long cash = (o.getMoneyObject().getCash() * ((long) i2)) / 100;
                if (z3) {
                    EditText editText6 = this.f9050b;
                    editText6.setText("");
                    editText6.clearFocus();
                    ((TextView) this.f9051c).setText(U.a(cash));
                    return;
                }
                return;
        }
    }

    public final void onStartTrackingTouch(SeekBar seekBar) {
        int i2 = this.f9049a;
    }

    public final void onStopTrackingTouch(SeekBar seekBar) {
        int i2 = this.f9049a;
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

    private final void i(SeekBar seekBar) {
    }

    private final void j(SeekBar seekBar) {
    }

    private final void k(SeekBar seekBar) {
    }

    private final void l(SeekBar seekBar) {
    }
}
