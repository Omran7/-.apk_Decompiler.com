package K;

import C.g;
import android.graphics.Rect;
import android.util.Log;
import android.view.View;
import android.view.WindowInsets;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

public final class k0 extends n0 {

    /* renamed from: e  reason: collision with root package name */
    public static Field f1401e = null;

    /* renamed from: f  reason: collision with root package name */
    public static boolean f1402f = false;
    public static Constructor g = null;
    public static boolean h = false;

    /* renamed from: c  reason: collision with root package name */
    public WindowInsets f1403c;
    public g d;

    public k0() {
        this.f1403c = i();
    }

    private static WindowInsets i() {
        Class<WindowInsets> cls = WindowInsets.class;
        if (!f1402f) {
            try {
                f1401e = cls.getDeclaredField("CONSUMED");
            } catch (ReflectiveOperationException e6) {
                Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets.CONSUMED field", e6);
            }
            f1402f = true;
        }
        Field field = f1401e;
        if (field != null) {
            try {
                WindowInsets windowInsets = (WindowInsets) field.get((Object) null);
                if (windowInsets != null) {
                    return new WindowInsets(windowInsets);
                }
            } catch (ReflectiveOperationException e7) {
                Log.i("WindowInsetsCompat", "Could not get value from WindowInsets.CONSUMED field", e7);
            }
        }
        if (!h) {
            try {
                g = cls.getConstructor(new Class[]{Rect.class});
            } catch (ReflectiveOperationException e8) {
                Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets(Rect) constructor", e8);
            }
            h = true;
        }
        Constructor constructor = g;
        if (constructor != null) {
            try {
                return (WindowInsets) constructor.newInstance(new Object[]{new Rect()});
            } catch (ReflectiveOperationException e9) {
                Log.i("WindowInsetsCompat", "Could not invoke WindowInsets(Rect) constructor", e9);
            }
        }
        return null;
    }

    public v0 b() {
        a();
        v0 g5 = v0.g((View) null, this.f1403c);
        g[] gVarArr = this.f1410b;
        t0 t0Var = g5.f1432a;
        t0Var.o(gVarArr);
        t0Var.q(this.d);
        return g5;
    }

    public void e(g gVar) {
        this.d = gVar;
    }

    public void g(g gVar) {
        WindowInsets windowInsets = this.f1403c;
        if (windowInsets != null) {
            this.f1403c = windowInsets.replaceSystemWindowInsets(gVar.f374a, gVar.f375b, gVar.f376c, gVar.d);
        }
    }

    public k0(v0 v0Var) {
        super(v0Var);
        this.f1403c = v0Var.f();
    }
}
