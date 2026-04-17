package K;

import android.view.DisplayCutout;
import android.view.View;
import android.view.WindowInsets;
import java.util.Objects;

public class q0 extends p0 {
    public q0(v0 v0Var, WindowInsets windowInsets) {
        super(v0Var, windowInsets);
    }

    public v0 a() {
        return v0.g((View) null, this.f1417c.consumeDisplayCutout());
    }

    public C0069i e() {
        DisplayCutout p6 = this.f1417c.getDisplayCutout();
        if (p6 == null) {
            return null;
        }
        return new C0069i(p6);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q0)) {
            return false;
        }
        q0 q0Var = (q0) obj;
        if (!Objects.equals(this.f1417c, q0Var.f1417c) || !Objects.equals(this.g, q0Var.g)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return this.f1417c.hashCode();
    }
}
