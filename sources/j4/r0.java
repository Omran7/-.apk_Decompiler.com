package j4;

import android.widget.EditText;
import android.widget.SeekBar;

public final class r0 implements SeekBar.OnSeekBarChangeListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ EditText f9085a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ long f9086b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ long f9087c;

    public r0(EditText editText, long j6, long j7) {
        this.f9085a = editText;
        this.f9086b = j6;
        this.f9087c = j7;
    }

    public final void onProgressChanged(SeekBar seekBar, int i2, boolean z3) {
        EditText editText = this.f9085a;
        if (i2 == 0) {
            editText.setText("1");
            editText.setSelection(1);
            return;
        }
        long j6 = ((this.f9086b / this.f9087c) * ((long) i2)) / 100;
        if (j6 == 0) {
            j6 = 1;
        }
        editText.setText(String.valueOf(j6));
        editText.setSelection(String.valueOf(j6).length());
    }

    public final void onStartTrackingTouch(SeekBar seekBar) {
    }

    public final void onStopTrackingTouch(SeekBar seekBar) {
    }
}
