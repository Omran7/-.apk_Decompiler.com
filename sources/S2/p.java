package s2;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
import r2.C0949a;

public final class p extends t {

    /* renamed from: c  reason: collision with root package name */
    public final r f11506c;
    public final float d;

    /* renamed from: e  reason: collision with root package name */
    public final float f11507e;

    public p(r rVar, float f6, float f7) {
        this.f11506c = rVar;
        this.d = f6;
        this.f11507e = f7;
    }

    public final void a(Matrix matrix, C0949a aVar, int i2, Canvas canvas) {
        C0949a aVar2 = aVar;
        int i5 = i2;
        Canvas canvas2 = canvas;
        r rVar = this.f11506c;
        float f6 = rVar.f11513c;
        float f7 = this.f11507e;
        float f8 = rVar.f11512b;
        float f9 = this.d;
        RectF rectF = new RectF(0.0f, 0.0f, (float) Math.hypot((double) (f6 - f7), (double) (f8 - f9)), 0.0f);
        Matrix matrix2 = this.f11516a;
        matrix2.set(matrix);
        matrix2.preTranslate(f9, f7);
        matrix2.preRotate(b());
        aVar.getClass();
        rectF.bottom += (float) i5;
        rectF.offset(0.0f, (float) (-i5));
        int[] iArr = C0949a.f11194i;
        iArr[0] = aVar2.f11202f;
        iArr[1] = aVar2.f11201e;
        iArr[2] = aVar2.d;
        Paint paint = aVar2.f11200c;
        float f10 = rectF.left;
        paint.setShader(new LinearGradient(f10, rectF.top, f10, rectF.bottom, iArr, C0949a.f11195j, Shader.TileMode.CLAMP));
        canvas.save();
        canvas2.concat(matrix2);
        canvas2.drawRect(rectF, paint);
        canvas.restore();
    }

    public final float b() {
        r rVar = this.f11506c;
        return (float) Math.toDegrees(Math.atan((double) ((rVar.f11513c - this.f11507e) / (rVar.f11512b - this.d))));
    }
}
