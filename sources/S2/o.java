package s2;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.Shader;
import r2.C0949a;

public final class o extends t {

    /* renamed from: c  reason: collision with root package name */
    public final q f11505c;

    public o(q qVar) {
        this.f11505c = qVar;
    }

    public final void a(Matrix matrix, C0949a aVar, int i2, Canvas canvas) {
        boolean z3;
        C0949a aVar2 = aVar;
        int i5 = i2;
        Canvas canvas2 = canvas;
        q qVar = this.f11505c;
        float f6 = qVar.f11511f;
        float f7 = qVar.g;
        RectF rectF = new RectF(qVar.f11508b, qVar.f11509c, qVar.d, qVar.f11510e);
        aVar.getClass();
        if (f7 < 0.0f) {
            z3 = true;
        } else {
            z3 = false;
        }
        Path path = aVar2.g;
        int[] iArr = C0949a.f11196k;
        if (z3) {
            iArr[0] = 0;
            iArr[1] = aVar2.f11202f;
            iArr[2] = aVar2.f11201e;
            iArr[3] = aVar2.d;
        } else {
            path.rewind();
            path.moveTo(rectF.centerX(), rectF.centerY());
            path.arcTo(rectF, f6, f7);
            path.close();
            float f8 = (float) (-i5);
            rectF.inset(f8, f8);
            iArr[0] = 0;
            iArr[1] = aVar2.d;
            iArr[2] = aVar2.f11201e;
            iArr[3] = aVar2.f11202f;
        }
        float width = rectF.width() / 2.0f;
        if (width > 0.0f) {
            float f9 = 1.0f - (((float) i5) / width);
            float[] fArr = C0949a.f11197l;
            fArr[1] = f9;
            fArr[2] = ((1.0f - f9) / 2.0f) + f9;
            RadialGradient radialGradient = new RadialGradient(rectF.centerX(), rectF.centerY(), width, iArr, fArr, Shader.TileMode.CLAMP);
            Paint paint = aVar2.f11199b;
            paint.setShader(radialGradient);
            canvas.save();
            canvas2.concat(matrix);
            canvas2.scale(1.0f, rectF.height() / rectF.width());
            if (!z3) {
                canvas2.clipPath(path, Region.Op.DIFFERENCE);
                canvas2.drawPath(path, aVar2.h);
            }
            canvas.drawArc(rectF, f6, f7, true, paint);
            canvas.restore();
        }
    }
}
