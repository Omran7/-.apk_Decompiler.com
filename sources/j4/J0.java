package j4;

import android.widget.EditText;
import android.widget.SeekBar;
import android.widget.TextView;
import com.mtma.criminal.city.utils.U;

public final class J0 implements SeekBar.OnSeekBarChangeListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ EditText f8899a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ int f8900b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ TextView f8901c;

    public J0(EditText editText, int i2, TextView textView) {
        this.f8899a = editText;
        this.f8900b = i2;
        this.f8901c = textView;
    }

    public final void onProgressChanged(SeekBar seekBar, int i2, boolean z3) {
        EditText editText = this.f8899a;
        editText.setText("");
        editText.clearFocus();
        this.f8901c.setText(U.a((long) ((this.f8900b * i2) / 100)));
    }

    public final void onStartTrackingTouch(SeekBar seekBar) {
    }

    public final void onStopTrackingTouch(SeekBar seekBar) {
    }
}
