package s2;

import android.graphics.Matrix;
import android.graphics.Path;

public final class r extends s {

    /* renamed from: b  reason: collision with root package name */
    public float f11512b;

    /* renamed from: c  reason: collision with root package name */
    public float f11513c;

    public final void a(Matrix matrix, Path path) {
        Matrix matrix2 = this.f11514a;
        matrix.invert(matrix2);
        path.transform(matrix2);
        path.lineTo(this.f11512b, this.f11513c);
        path.transform(matrix);
    }
}
