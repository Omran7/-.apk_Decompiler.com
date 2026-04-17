package j4;

import Y4.D;
import android.widget.EditText;
import android.widget.SeekBar;
import android.widget.TextView;
import com.mtma.criminal.city.utils.U;

public final class K0 implements SeekBar.OnSeekBarChangeListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ EditText f8905a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ D f8906b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ TextView f8907c;

    public K0(EditText editText, D d, TextView textView) {
        this.f8905a = editText;
        this.f8906b = d;
        this.f8907c = textView;
    }

    public final void onProgressChanged(SeekBar seekBar, int i2, boolean z3) {
        EditText editText = this.f8905a;
        editText.setText("");
        editText.clearFocus();
        this.f8907c.setText(U.a(((this.f8906b.f4297f * 10) * ((long) i2)) / 100));
    }

    public final void onStartTrackingTouch(SeekBar seekBar) {
    }

    public final void onStopTrackingTouch(SeekBar seekBar) {
    }
}
