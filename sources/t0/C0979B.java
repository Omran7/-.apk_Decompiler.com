package t0;

import android.graphics.Matrix;
import android.os.Build;
import android.view.View;
import com.bumptech.glide.d;

/* renamed from: t0.B  reason: case insensitive filesystem */
public class C0979B extends d {

    /* renamed from: j  reason: collision with root package name */
    public static boolean f11609j = true;

    /* renamed from: k  reason: collision with root package name */
    public static boolean f11610k = true;

    /* renamed from: l  reason: collision with root package name */
    public static boolean f11611l = true;

    /* renamed from: m  reason: collision with root package name */
    public static boolean f11612m = true;

    public void c1(View view, int i2) {
        if (Build.VERSION.SDK_INT == 28) {
            super.c1(view, i2);
        } else if (f11612m) {
            try {
                C0978A.a(view, i2);
            } catch (NoSuchMethodError unused) {
                f11612m = false;
            }
        }
    }

    public void t1(View view, int i2, int i5, int i6, int i7) {
        if (f11611l) {
            try {
                z.a(view, i2, i5, i6, i7);
            } catch (NoSuchMethodError unused) {
                f11611l = false;
            }
        }
    }

    public void u1(View view, Matrix matrix) {
        if (f11609j) {
            try {
                y.b(view, matrix);
            } catch (NoSuchMethodError unused) {
                f11609j = false;
            }
        }
    }

    public void v1(View view, Matrix matrix) {
        if (f11610k) {
            try {
                y.c(view, matrix);
            } catch (NoSuchMethodError unused) {
                f11610k = false;
            }
        }
    }
}
