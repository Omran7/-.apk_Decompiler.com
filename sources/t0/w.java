package t0;

import android.graphics.Rect;
import android.os.Build;
import android.view.View;

public abstract class w {

    /* renamed from: a  reason: collision with root package name */
    public static final C0979B f11697a;

    /* renamed from: b  reason: collision with root package name */
    public static final C0981b f11698b = new C0981b(Float.class, "translationAlpha", 5);

    /* JADX WARNING: type inference failed for: r0v3, types: [t0.B, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r0v4, types: [t0.B, java.lang.Object] */
    static {
        if (Build.VERSION.SDK_INT >= 29) {
            f11697a = new Object();
        } else {
            f11697a = new Object();
        }
        new C0981b(Rect.class, "clipBounds", 6);
    }

    public static void a(View view, int i2, int i5, int i6, int i7) {
        f11697a.t1(view, i2, i5, i6, i7);
    }

    public static void b(View view, int i2) {
        f11697a.c1(view, i2);
    }
}
