package s2;

import I1.b;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import j4.p0;
import java.util.ArrayList;
import java.util.BitSet;

public final class m {

    /* renamed from: a  reason: collision with root package name */
    public final u[] f11495a = new u[4];

    /* renamed from: b  reason: collision with root package name */
    public final Matrix[] f11496b = new Matrix[4];

    /* renamed from: c  reason: collision with root package name */
    public final Matrix[] f11497c = new Matrix[4];
    public final PointF d = new PointF();

    /* renamed from: e  reason: collision with root package name */
    public final Path f11498e = new Path();

    /* renamed from: f  reason: collision with root package name */
    public final Path f11499f = new Path();
    public final u g = new u();
    public final float[] h = new float[2];

    /* renamed from: i  reason: collision with root package name */
    public final float[] f11500i = new float[2];

    /* renamed from: j  reason: collision with root package name */
    public final Path f11501j = new Path();

    /* renamed from: k  reason: collision with root package name */
    public final Path f11502k = new Path();

    /* renamed from: l  reason: collision with root package name */
    public final boolean f11503l = true;

    public m() {
        for (int i2 = 0; i2 < 4; i2++) {
            this.f11495a[i2] = new u();
            this.f11496b[i2] = new Matrix();
            this.f11497c[i2] = new Matrix();
        }
    }

    public final void a(k kVar, float f6, RectF rectF, p0 p0Var, Path path) {
        Matrix[] matrixArr;
        Matrix[] matrixArr2;
        u[] uVarArr;
        int i2;
        float[] fArr;
        e eVar;
        c cVar;
        b bVar;
        int i5;
        m mVar = this;
        k kVar2 = kVar;
        RectF rectF2 = rectF;
        p0 p0Var2 = p0Var;
        Path path2 = path;
        path.rewind();
        Path path3 = mVar.f11498e;
        path3.rewind();
        Path path4 = mVar.f11499f;
        path4.rewind();
        path4.addRect(rectF2, Path.Direction.CW);
        int i6 = 0;
        while (true) {
            matrixArr = mVar.f11497c;
            matrixArr2 = mVar.f11496b;
            uVarArr = mVar.f11495a;
            i2 = 4;
            fArr = mVar.h;
            if (i6 >= 4) {
                break;
            }
            if (i6 == 1) {
                cVar = kVar2.g;
            } else if (i6 == 2) {
                cVar = kVar2.h;
            } else if (i6 != 3) {
                cVar = kVar2.f11489f;
            } else {
                cVar = kVar2.f11488e;
            }
            if (i6 == 1) {
                bVar = kVar2.f11487c;
            } else if (i6 == 2) {
                bVar = kVar2.d;
            } else if (i6 != 3) {
                bVar = kVar2.f11486b;
            } else {
                bVar = kVar2.f11485a;
            }
            u uVar = uVarArr[i6];
            bVar.getClass();
            bVar.G(uVar, f6, cVar.a(rectF2));
            int i7 = i6 + 1;
            float f7 = (float) ((i7 % 4) * 90);
            matrixArr2[i6].reset();
            PointF pointF = mVar.d;
            if (i6 == 1) {
                i5 = i7;
                pointF.set(rectF2.right, rectF2.bottom);
            } else if (i6 == 2) {
                i5 = i7;
                pointF.set(rectF2.left, rectF2.bottom);
            } else if (i6 != 3) {
                i5 = i7;
                pointF.set(rectF2.right, rectF2.top);
            } else {
                i5 = i7;
                pointF.set(rectF2.left, rectF2.top);
            }
            matrixArr2[i6].setTranslate(pointF.x, pointF.y);
            matrixArr2[i6].preRotate(f7);
            u uVar2 = uVarArr[i6];
            fArr[0] = uVar2.f11518b;
            fArr[1] = uVar2.f11519c;
            matrixArr2[i6].mapPoints(fArr);
            matrixArr[i6].reset();
            matrixArr[i6].setTranslate(fArr[0], fArr[1]);
            matrixArr[i6].preRotate(f7);
            i6 = i5;
        }
        int i8 = 0;
        while (i8 < i2) {
            u uVar3 = uVarArr[i8];
            uVar3.getClass();
            fArr[0] = 0.0f;
            fArr[1] = uVar3.f11517a;
            matrixArr2[i8].mapPoints(fArr);
            if (i8 == 0) {
                path2.moveTo(fArr[0], fArr[1]);
            } else {
                path2.lineTo(fArr[0], fArr[1]);
            }
            uVarArr[i8].b(matrixArr2[i8], path2);
            if (p0Var2 != null) {
                u uVar4 = uVarArr[i8];
                Matrix matrix = matrixArr2[i8];
                g gVar = (g) p0Var2.f9075b;
                BitSet bitSet = gVar.d;
                uVar4.getClass();
                bitSet.set(i8, false);
                uVar4.a(uVar4.f11520e);
                gVar.f11460b[i8] = new n(new ArrayList(uVar4.g), new Matrix(matrix));
            }
            int i9 = i8 + 1;
            int i10 = i9 % 4;
            u uVar5 = uVarArr[i8];
            fArr[0] = uVar5.f11518b;
            fArr[1] = uVar5.f11519c;
            matrixArr2[i8].mapPoints(fArr);
            u uVar6 = uVarArr[i10];
            uVar6.getClass();
            float[] fArr2 = mVar.f11500i;
            fArr2[0] = 0.0f;
            fArr2[1] = uVar6.f11517a;
            matrixArr2[i10].mapPoints(fArr2);
            int i11 = i9;
            float max = Math.max(((float) Math.hypot((double) (fArr[0] - fArr2[0]), (double) (fArr[1] - fArr2[1]))) - 0.001f, 0.0f);
            u uVar7 = uVarArr[i8];
            fArr[0] = uVar7.f11518b;
            fArr[1] = uVar7.f11519c;
            matrixArr2[i8].mapPoints(fArr);
            if (i8 == 1 || i8 == 3) {
                Math.abs(rectF.centerX() - fArr[0]);
            } else {
                Math.abs(rectF.centerY() - fArr[1]);
            }
            u uVar8 = mVar.g;
            uVar8.d(0.0f, 270.0f, 0.0f);
            if (i8 == 1) {
                eVar = kVar2.f11492k;
            } else if (i8 == 2) {
                eVar = kVar2.f11493l;
            } else if (i8 != 3) {
                eVar = kVar2.f11491j;
            } else {
                eVar = kVar2.f11490i;
            }
            eVar.getClass();
            uVar8.c(max, 0.0f);
            Path path5 = mVar.f11501j;
            path5.reset();
            uVar8.b(matrixArr[i8], path5);
            if (!mVar.f11503l || (!mVar.b(path5, i8) && !mVar.b(path5, i10))) {
                uVar8.b(matrixArr[i8], path2);
            } else {
                path5.op(path5, path4, Path.Op.DIFFERENCE);
                fArr[0] = 0.0f;
                fArr[1] = uVar8.f11517a;
                matrixArr[i8].mapPoints(fArr);
                path3.moveTo(fArr[0], fArr[1]);
                uVar8.b(matrixArr[i8], path3);
            }
            if (p0Var2 != null) {
                Matrix matrix2 = matrixArr[i8];
                g gVar2 = (g) p0Var2.f9075b;
                gVar2.d.set(i8 + 4, false);
                uVar8.a(uVar8.f11520e);
                gVar2.f11461c[i8] = new n(new ArrayList(uVar8.g), new Matrix(matrix2));
            }
            i2 = 4;
            mVar = this;
            RectF rectF3 = rectF;
            i8 = i11;
        }
        path.close();
        path3.close();
        if (!path3.isEmpty()) {
            path2.op(path3, Path.Op.UNION);
        }
    }

    public final boolean b(Path path, int i2) {
        Path path2 = this.f11502k;
        path2.reset();
        this.f11495a[i2].b(this.f11496b[i2], path2);
        RectF rectF = new RectF();
        path.computeBounds(rectF, true);
        path2.computeBounds(rectF, true);
        path.op(path2, Path.Op.INTERSECT);
        path.computeBounds(rectF, true);
        if (!rectF.isEmpty()) {
            return true;
        }
        if (rectF.width() <= 1.0f || rectF.height() <= 1.0f) {
            return false;
        }
        return true;
    }
}
