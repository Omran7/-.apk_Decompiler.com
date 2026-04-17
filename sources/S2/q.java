package s2;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;

public final class q extends s {
    public static final RectF h = new RectF();

    /* renamed from: b  reason: collision with root package name */
    public final float f11508b;

    /* renamed from: c  reason: collision with root package name */
    public final float f11509c;
    public final float d;

    /* renamed from: e  reason: collision with root package name */
    public final float f11510e;

    /* renamed from: f  reason: collision with root package name */
    public float f11511f;
    public float g;

    public q(float f6, float f7, float f8, float f9) {
        this.f11508b = f6;
        this.f11509c = f7;
        this.d = f8;
        this.f11510e = f9;
    }

    public final void a(Matrix matrix, Path path) {
        Matrix matrix2 = this.f11514a;
        matrix.invert(matrix2);
        path.transform(matrix2);
        RectF rectF = h;
        rectF.set(this.f11508b, this.f11509c, this.d, this.f11510e);
        path.arcTo(rectF, this.f11511f, this.g, false);
        path.transform(matrix);
    }
}
