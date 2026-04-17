package K;

import android.view.View;
import android.view.Window;
import com.bumptech.glide.c;
import s2.e;

public class w0 extends c {

    /* renamed from: w  reason: collision with root package name */
    public final Window f1437w;

    public w0(Window window, e eVar) {
        this.f1437w = window;
    }

    public final void I0(int i2) {
        View decorView = this.f1437w.getDecorView();
        decorView.setSystemUiVisibility((~i2) & decorView.getSystemUiVisibility());
    }

    public final void m0(boolean z3) {
        if (z3) {
            Window window = this.f1437w;
            window.clearFlags(67108864);
            window.addFlags(Integer.MIN_VALUE);
            View decorView = window.getDecorView();
            decorView.setSystemUiVisibility(8192 | decorView.getSystemUiVisibility());
            return;
        }
        I0(8192);
    }
}
