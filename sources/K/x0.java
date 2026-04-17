package K;

import android.view.View;
import android.view.Window;

public final class x0 extends w0 {
    public final void l0(boolean z3) {
        if (z3) {
            Window window = this.f1437w;
            window.clearFlags(134217728);
            window.addFlags(Integer.MIN_VALUE);
            View decorView = window.getDecorView();
            decorView.setSystemUiVisibility(16 | decorView.getSystemUiVisibility());
            return;
        }
        I0(16);
    }
}
