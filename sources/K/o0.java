package K;

import C.g;
import android.graphics.Rect;
import android.os.Build;
import android.support.v4.media.session.a;
import android.util.Log;
import android.view.View;
import android.view.WindowInsets;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Objects;

public abstract class o0 extends t0 {
    public static boolean h = false;

    /* renamed from: i  reason: collision with root package name */
    public static Method f1413i;

    /* renamed from: j  reason: collision with root package name */
    public static Class f1414j;

    /* renamed from: k  reason: collision with root package name */
    public static Field f1415k;

    /* renamed from: l  reason: collision with root package name */
    public static Field f1416l;

    /* renamed from: c  reason: collision with root package name */
    public final WindowInsets f1417c;
    public g[] d;

    /* renamed from: e  reason: collision with root package name */
    public g f1418e = null;

    /* renamed from: f  reason: collision with root package name */
    public v0 f1419f;
    public g g;

    public o0(v0 v0Var, WindowInsets windowInsets) {
        super(v0Var);
        this.f1417c = windowInsets;
    }

    private g r(int i2, boolean z3) {
        g gVar = g.f373e;
        for (int i5 = 1; i5 <= 256; i5 <<= 1) {
            if ((i2 & i5) != 0) {
                gVar = g.a(gVar, s(i5, z3));
            }
        }
        return gVar;
    }

    private g t() {
        v0 v0Var = this.f1419f;
        if (v0Var != null) {
            return v0Var.f1432a.h();
        }
        return g.f373e;
    }

    private g u(View view) {
        if (Build.VERSION.SDK_INT < 30) {
            if (!h) {
                v();
            }
            Method method = f1413i;
            if (!(method == null || f1414j == null || f1415k == null)) {
                try {
                    Object invoke = method.invoke(view, (Object[]) null);
                    if (invoke == null) {
                        Log.w("WindowInsetsCompat", "Failed to get visible insets. getViewRootImpl() returned null from the provided view. This means that the view is either not attached or the method has been overridden", new NullPointerException());
                        return null;
                    }
                    Rect rect = (Rect) f1415k.get(f1416l.get(invoke));
                    if (rect != null) {
                        return g.b(rect.left, rect.top, rect.right, rect.bottom);
                    }
                    return null;
                } catch (ReflectiveOperationException e6) {
                    Log.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). " + e6.getMessage(), e6);
                }
            }
            return null;
        }
        throw new UnsupportedOperationException("getVisibleInsets() should not be called on API >= 30. Use WindowInsets.isVisible() instead.");
    }

    private static void v() {
        try {
            f1413i = View.class.getDeclaredMethod("getViewRootImpl", (Class[]) null);
            Class<?> cls = Class.forName("android.view.View$AttachInfo");
            f1414j = cls;
            f1415k = cls.getDeclaredField("mVisibleInsets");
            f1416l = Class.forName("android.view.ViewRootImpl").getDeclaredField("mAttachInfo");
            f1415k.setAccessible(true);
            f1416l.setAccessible(true);
        } catch (ReflectiveOperationException e6) {
            Log.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). " + e6.getMessage(), e6);
        }
        h = true;
    }

    public void d(View view) {
        g u6 = u(view);
        if (u6 == null) {
            u6 = g.f373e;
        }
        w(u6);
    }

    public boolean equals(Object obj) {
        if (!super.equals(obj)) {
            return false;
        }
        return Objects.equals(this.g, ((o0) obj).g);
    }

    public g f(int i2) {
        return r(i2, false);
    }

    public final g j() {
        if (this.f1418e == null) {
            WindowInsets windowInsets = this.f1417c;
            this.f1418e = g.b(windowInsets.getSystemWindowInsetLeft(), windowInsets.getSystemWindowInsetTop(), windowInsets.getSystemWindowInsetRight(), windowInsets.getSystemWindowInsetBottom());
        }
        return this.f1418e;
    }

    public v0 l(int i2, int i5, int i6, int i7) {
        n0 n0Var;
        v0 g5 = v0.g((View) null, this.f1417c);
        int i8 = Build.VERSION.SDK_INT;
        if (i8 >= 30) {
            n0Var = new m0(g5);
        } else if (i8 >= 29) {
            n0Var = new l0(g5);
        } else {
            n0Var = new k0(g5);
        }
        n0Var.g(v0.e(j(), i2, i5, i6, i7));
        n0Var.e(v0.e(h(), i2, i5, i6, i7));
        return n0Var.b();
    }

    public boolean n() {
        return this.f1417c.isRound();
    }

    public void o(g[] gVarArr) {
        this.d = gVarArr;
    }

    public void p(v0 v0Var) {
        this.f1419f = v0Var;
    }

    public g s(int i2, boolean z3) {
        int i5;
        C0069i iVar;
        int i6;
        int i7;
        int i8;
        int i9 = 0;
        if (i2 != 1) {
            g gVar = null;
            if (i2 != 2) {
                g gVar2 = g.f373e;
                if (i2 == 8) {
                    g[] gVarArr = this.d;
                    if (gVarArr != null) {
                        gVar = gVarArr[a.j0(8)];
                    }
                    if (gVar != null) {
                        return gVar;
                    }
                    g j6 = j();
                    g t6 = t();
                    int i10 = j6.d;
                    if (i10 > t6.d) {
                        return g.b(0, 0, 0, i10);
                    }
                    g gVar3 = this.g;
                    if (gVar3 == null || gVar3.equals(gVar2) || (i5 = this.g.d) <= t6.d) {
                        return gVar2;
                    }
                    return g.b(0, 0, 0, i5);
                } else if (i2 == 16) {
                    return i();
                } else {
                    if (i2 == 32) {
                        return g();
                    }
                    if (i2 == 64) {
                        return k();
                    }
                    if (i2 != 128) {
                        return gVar2;
                    }
                    v0 v0Var = this.f1419f;
                    if (v0Var != null) {
                        iVar = v0Var.f1432a.e();
                    } else {
                        iVar = e();
                    }
                    if (iVar == null) {
                        return gVar2;
                    }
                    int i11 = Build.VERSION.SDK_INT;
                    if (i11 >= 28) {
                        i6 = C0068h.d(iVar.f1396a);
                    } else {
                        i6 = 0;
                    }
                    if (i11 >= 28) {
                        i7 = C0068h.f(iVar.f1396a);
                    } else {
                        i7 = 0;
                    }
                    if (i11 >= 28) {
                        i8 = C0068h.e(iVar.f1396a);
                    } else {
                        i8 = 0;
                    }
                    if (i11 >= 28) {
                        i9 = C0068h.c(iVar.f1396a);
                    }
                    return g.b(i6, i7, i8, i9);
                }
            } else if (z3) {
                g t7 = t();
                g h6 = h();
                return g.b(Math.max(t7.f374a, h6.f374a), 0, Math.max(t7.f376c, h6.f376c), Math.max(t7.d, h6.d));
            } else {
                g j7 = j();
                v0 v0Var2 = this.f1419f;
                if (v0Var2 != null) {
                    gVar = v0Var2.f1432a.h();
                }
                int i12 = j7.d;
                if (gVar != null) {
                    i12 = Math.min(i12, gVar.d);
                }
                return g.b(j7.f374a, 0, j7.f376c, i12);
            }
        } else if (z3) {
            return g.b(0, Math.max(t().f375b, j().f375b), 0, 0);
        } else {
            return g.b(0, j().f375b, 0, 0);
        }
    }

    public void w(g gVar) {
        this.g = gVar;
    }
}
