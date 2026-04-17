package K;

import C.g;
import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import java.util.Objects;
import java.util.WeakHashMap;

public final class v0 {

    /* renamed from: b  reason: collision with root package name */
    public static final v0 f1431b;

    /* renamed from: a  reason: collision with root package name */
    public final t0 f1432a;

    static {
        if (Build.VERSION.SDK_INT >= 30) {
            f1431b = s0.f1427q;
        } else {
            f1431b = t0.f1428b;
        }
    }

    public v0(WindowInsets windowInsets) {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 30) {
            this.f1432a = new s0(this, windowInsets);
        } else if (i2 >= 29) {
            this.f1432a = new r0(this, windowInsets);
        } else if (i2 >= 28) {
            this.f1432a = new q0(this, windowInsets);
        } else {
            this.f1432a = new p0(this, windowInsets);
        }
    }

    public static g e(g gVar, int i2, int i5, int i6, int i7) {
        int max = Math.max(0, gVar.f374a - i2);
        int max2 = Math.max(0, gVar.f375b - i5);
        int max3 = Math.max(0, gVar.f376c - i6);
        int max4 = Math.max(0, gVar.d - i7);
        if (max == i2 && max2 == i5 && max3 == i6 && max4 == i7) {
            return gVar;
        }
        return g.b(max, max2, max3, max4);
    }

    public static v0 g(View view, WindowInsets windowInsets) {
        windowInsets.getClass();
        v0 v0Var = new v0(windowInsets);
        if (view != null && view.isAttachedToWindow()) {
            WeakHashMap weakHashMap = O.f1352a;
            v0 a6 = E.a(view);
            t0 t0Var = v0Var.f1432a;
            t0Var.p(a6);
            t0Var.d(view.getRootView());
        }
        return v0Var;
    }

    public final int a() {
        return this.f1432a.j().d;
    }

    public final int b() {
        return this.f1432a.j().f374a;
    }

    public final int c() {
        return this.f1432a.j().f376c;
    }

    public final int d() {
        return this.f1432a.j().f375b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v0)) {
            return false;
        }
        return Objects.equals(this.f1432a, ((v0) obj).f1432a);
    }

    public final WindowInsets f() {
        t0 t0Var = this.f1432a;
        if (t0Var instanceof o0) {
            return ((o0) t0Var).f1417c;
        }
        return null;
    }

    public final int hashCode() {
        t0 t0Var = this.f1432a;
        if (t0Var == null) {
            return 0;
        }
        return t0Var.hashCode();
    }

    public v0() {
        this.f1432a = new t0(this);
    }
}
