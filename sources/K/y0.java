package K;

import android.view.View;
import android.view.Window;
import android.view.WindowInsetsController;
import com.bumptech.glide.c;
import s2.e;

public final class y0 extends c {

    /* renamed from: w  reason: collision with root package name */
    public final WindowInsetsController f1439w;

    /* renamed from: x  reason: collision with root package name */
    public Window f1440x;

    public y0(WindowInsetsController windowInsetsController, e eVar) {
        this.f1439w = windowInsetsController;
    }

    public final void l0(boolean z3) {
        Window window = this.f1440x;
        if (z3) {
            if (window != null) {
                View decorView = window.getDecorView();
                decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | 16);
            }
            this.f1439w.setSystemBarsAppearance(16, 16);
            return;
        }
        if (window != null) {
            View decorView2 = window.getDecorView();
            decorView2.setSystemUiVisibility(decorView2.getSystemUiVisibility() & -17);
        }
        this.f1439w.setSystemBarsAppearance(0, 16);
    }

    public final void m0(boolean z3) {
        Window window = this.f1440x;
        if (z3) {
            if (window != null) {
                View decorView = window.getDecorView();
                decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | 8192);
            }
            this.f1439w.setSystemBarsAppearance(8, 8);
            return;
        }
        if (window != null) {
            View decorView2 = window.getDecorView();
            decorView2.setSystemUiVisibility(decorView2.getSystemUiVisibility() & -8193);
        }
        this.f1439w.setSystemBarsAppearance(0, 8);
    }
}
