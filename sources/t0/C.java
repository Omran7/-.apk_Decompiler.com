package t0;

import android.graphics.Matrix;
import android.view.View;

public final class C extends C0979B {
    public final float F0(View view) {
        return view.getTransitionAlpha();
    }

    public final void b1(View view, float f6) {
        view.setTransitionAlpha(f6);
    }

    public final void c1(View view, int i2) {
        view.setTransitionVisibility(i2);
    }

    public final void t1(View view, int i2, int i5, int i6, int i7) {
        view.setLeftTopRightBottom(i2, i5, i6, i7);
    }

    public final void u1(View view, Matrix matrix) {
        view.transformMatrixToGlobal(matrix);
    }

    public final void v1(View view, Matrix matrix) {
        view.transformMatrixToLocal(matrix);
    }
}
