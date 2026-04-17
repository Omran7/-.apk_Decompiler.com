package u0;

import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import n.e;
import n.j;

/* renamed from: u0.l  reason: case insensitive filesystem */
public final class C1025l {

    /* renamed from: p  reason: collision with root package name */
    public static final Matrix f11808p = new Matrix();

    /* renamed from: a  reason: collision with root package name */
    public final Path f11809a;

    /* renamed from: b  reason: collision with root package name */
    public final Path f11810b;

    /* renamed from: c  reason: collision with root package name */
    public final Matrix f11811c;
    public Paint d;

    /* renamed from: e  reason: collision with root package name */
    public Paint f11812e;

    /* renamed from: f  reason: collision with root package name */
    public PathMeasure f11813f;
    public final C1022i g;
    public float h;

    /* renamed from: i  reason: collision with root package name */
    public float f11814i;

    /* renamed from: j  reason: collision with root package name */
    public float f11815j;

    /* renamed from: k  reason: collision with root package name */
    public float f11816k;

    /* renamed from: l  reason: collision with root package name */
    public int f11817l;

    /* renamed from: m  reason: collision with root package name */
    public String f11818m;

    /* renamed from: n  reason: collision with root package name */
    public Boolean f11819n;

    /* renamed from: o  reason: collision with root package name */
    public final e f11820o;

    /* JADX WARNING: type inference failed for: r0v4, types: [n.e, n.j] */
    public C1025l() {
        this.f11811c = new Matrix();
        this.h = 0.0f;
        this.f11814i = 0.0f;
        this.f11815j = 0.0f;
        this.f11816k = 0.0f;
        this.f11817l = 255;
        this.f11818m = null;
        this.f11819n = null;
        this.f11820o = new j(0);
        this.g = new C1022i();
        this.f11809a = new Path();
        this.f11810b = new Path();
    }

    /* JADX WARNING: type inference failed for: r11v0 */
    /* JADX WARNING: type inference failed for: r11v1, types: [boolean] */
    /* JADX WARNING: type inference failed for: r11v2 */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00e6, code lost:
        if (r0.f11792j != 1.0f) goto L_0x00eb;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(u0.C1022i r19, android.graphics.Matrix r20, android.graphics.Canvas r21, int r22, int r23) {
        /*
            r18 = this;
            r6 = r18
            r7 = r19
            r8 = r21
            r9 = 1
            android.graphics.Matrix r0 = r7.f11797a
            r1 = r20
            r0.set(r1)
            android.graphics.Matrix r0 = r7.f11803j
            android.graphics.Matrix r10 = r7.f11797a
            r10.preConcat(r0)
            r21.save()
            r11 = 0
            r12 = r11
        L_0x001a:
            java.util.ArrayList r0 = r7.f11798b
            int r1 = r0.size()
            if (r12 >= r1) goto L_0x021e
            java.lang.Object r0 = r0.get(r12)
            u0.j r0 = (u0.C1023j) r0
            boolean r1 = r0 instanceof u0.C1022i
            if (r1 == 0) goto L_0x0042
            r1 = r0
            u0.i r1 = (u0.C1022i) r1
            r0 = r18
            r2 = r10
            r3 = r21
            r4 = r22
            r5 = r23
            r0.a(r1, r2, r3, r4, r5)
            r1 = r22
            r0 = r9
            r17 = r10
            goto L_0x0217
        L_0x0042:
            boolean r1 = r0 instanceof u0.C1024k
            if (r1 == 0) goto L_0x0212
            u0.k r0 = (u0.C1024k) r0
            r1 = r22
            float r2 = (float) r1
            float r3 = r6.f11815j
            float r2 = r2 / r3
            r3 = r23
            float r4 = (float) r3
            float r5 = r6.f11816k
            float r4 = r4 / r5
            float r5 = java.lang.Math.min(r2, r4)
            android.graphics.Matrix r13 = r6.f11811c
            r13.set(r10)
            r13.postScale(r2, r4)
            r14 = 4
            float[] r14 = new float[r14]
            r14 = {0, 1065353216, 1065353216, 0} // fill-array
            r10.mapVectors(r14)
            r15 = r14[r11]
            r20 = r5
            double r4 = (double) r15
            r15 = r14[r9]
            double r2 = (double) r15
            double r2 = java.lang.Math.hypot(r4, r2)
            float r2 = (float) r2
            r3 = 2
            r4 = r14[r3]
            double r4 = (double) r4
            r15 = 3
            r3 = r14[r15]
            r17 = r10
            double r9 = (double) r3
            double r3 = java.lang.Math.hypot(r4, r9)
            float r3 = (float) r3
            r4 = r14[r11]
            r5 = 1
            r9 = r14[r5]
            r5 = 2
            r5 = r14[r5]
            r10 = r14[r15]
            float r4 = r4 * r10
            float r9 = r9 * r5
            float r4 = r4 - r9
            float r2 = java.lang.Math.max(r2, r3)
            r16 = 0
            int r3 = (r2 > r16 ? 1 : (r2 == r16 ? 0 : -1))
            if (r3 <= 0) goto L_0x00a3
            float r3 = java.lang.Math.abs(r4)
            float r2 = r3 / r2
            goto L_0x00a5
        L_0x00a3:
            r2 = r16
        L_0x00a5:
            int r3 = (r2 > r16 ? 1 : (r2 == r16 ? 0 : -1))
            if (r3 != 0) goto L_0x00ab
            goto L_0x0210
        L_0x00ab:
            r0.getClass()
            android.graphics.Path r3 = r6.f11809a
            r3.reset()
            C.j[] r4 = r0.f11805a
            if (r4 == 0) goto L_0x00ba
            C.j.b(r4, r3)
        L_0x00ba:
            android.graphics.Path r4 = r6.f11810b
            r4.reset()
            boolean r5 = r0 instanceof u0.C1020g
            if (r5 == 0) goto L_0x00d7
            int r0 = r0.f11807c
            if (r0 != 0) goto L_0x00ca
            android.graphics.Path$FillType r0 = android.graphics.Path.FillType.WINDING
            goto L_0x00cc
        L_0x00ca:
            android.graphics.Path$FillType r0 = android.graphics.Path.FillType.EVEN_ODD
        L_0x00cc:
            r4.setFillType(r0)
            r4.addPath(r3, r13)
            r8.clipPath(r4)
            goto L_0x0210
        L_0x00d7:
            u0.h r0 = (u0.C1021h) r0
            float r5 = r0.f11791i
            r9 = 0
            int r10 = (r5 > r9 ? 1 : (r5 == r9 ? 0 : -1))
            if (r10 != 0) goto L_0x00e9
            float r9 = r0.f11792j
            r10 = 1065353216(0x3f800000, float:1.0)
            int r9 = (r9 > r10 ? 1 : (r9 == r10 ? 0 : -1))
            if (r9 == 0) goto L_0x0129
            goto L_0x00eb
        L_0x00e9:
            r10 = 1065353216(0x3f800000, float:1.0)
        L_0x00eb:
            float r9 = r0.f11793k
            float r5 = r5 + r9
            float r5 = r5 % r10
            float r14 = r0.f11792j
            float r14 = r14 + r9
            float r14 = r14 % r10
            android.graphics.PathMeasure r9 = r6.f11813f
            if (r9 != 0) goto L_0x00fe
            android.graphics.PathMeasure r9 = new android.graphics.PathMeasure
            r9.<init>()
            r6.f11813f = r9
        L_0x00fe:
            android.graphics.PathMeasure r9 = r6.f11813f
            r9.setPath(r3, r11)
            android.graphics.PathMeasure r9 = r6.f11813f
            float r9 = r9.getLength()
            float r5 = r5 * r9
            float r14 = r14 * r9
            r3.reset()
            int r10 = (r5 > r14 ? 1 : (r5 == r14 ? 0 : -1))
            if (r10 <= 0) goto L_0x011f
            android.graphics.PathMeasure r10 = r6.f11813f
            r15 = 1
            r10.getSegment(r5, r9, r3, r15)
            android.graphics.PathMeasure r5 = r6.f11813f
            r9 = 0
            r5.getSegment(r9, r14, r3, r15)
            goto L_0x0126
        L_0x011f:
            r9 = 0
            r15 = 1
            android.graphics.PathMeasure r10 = r6.f11813f
            r10.getSegment(r5, r14, r3, r15)
        L_0x0126:
            r3.rLineTo(r9, r9)
        L_0x0129:
            r4.addPath(r3, r13)
            A2.f r3 = r0.f11790f
            java.lang.Object r5 = r3.f30c
            android.graphics.Shader r5 = (android.graphics.Shader) r5
            if (r5 == 0) goto L_0x0135
            goto L_0x0139
        L_0x0135:
            int r5 = r3.f29b
            if (r5 == 0) goto L_0x013b
        L_0x0139:
            r5 = 1
            goto L_0x013c
        L_0x013b:
            r5 = r11
        L_0x013c:
            r9 = 16777215(0xffffff, float:2.3509886E-38)
            r10 = 0
            r14 = 255(0xff, float:3.57E-43)
            r15 = 1132396544(0x437f0000, float:255.0)
            if (r5 == 0) goto L_0x019c
            android.graphics.Paint r5 = r6.f11812e
            if (r5 != 0) goto L_0x0157
            android.graphics.Paint r5 = new android.graphics.Paint
            r11 = 1
            r5.<init>(r11)
            r6.f11812e = r5
            android.graphics.Paint$Style r11 = android.graphics.Paint.Style.FILL
            r5.setStyle(r11)
        L_0x0157:
            android.graphics.Paint r5 = r6.f11812e
            java.lang.Object r11 = r3.f30c
            android.graphics.Shader r11 = (android.graphics.Shader) r11
            if (r11 == 0) goto L_0x0170
            r11.setLocalMatrix(r13)
            r5.setShader(r11)
            float r3 = r0.h
            float r3 = r3 * r15
            int r3 = java.lang.Math.round(r3)
            r5.setAlpha(r3)
            goto L_0x018a
        L_0x0170:
            r5.setShader(r10)
            r5.setAlpha(r14)
            int r3 = r3.f29b
            float r11 = r0.h
            android.graphics.PorterDuff$Mode r16 = u0.C1028o.f11831s
            int r14 = android.graphics.Color.alpha(r3)
            r3 = r3 & r9
            float r14 = (float) r14
            float r14 = r14 * r11
            int r11 = (int) r14
            int r11 = r11 << 24
            r3 = r3 | r11
            r5.setColor(r3)
        L_0x018a:
            r5.setColorFilter(r10)
            int r3 = r0.f11807c
            if (r3 != 0) goto L_0x0194
            android.graphics.Path$FillType r3 = android.graphics.Path.FillType.WINDING
            goto L_0x0196
        L_0x0194:
            android.graphics.Path$FillType r3 = android.graphics.Path.FillType.EVEN_ODD
        L_0x0196:
            r4.setFillType(r3)
            r8.drawPath(r4, r5)
        L_0x019c:
            A2.f r3 = r0.d
            java.lang.Object r5 = r3.f30c
            android.graphics.Shader r5 = (android.graphics.Shader) r5
            if (r5 == 0) goto L_0x01a5
            goto L_0x01a9
        L_0x01a5:
            int r5 = r3.f29b
            if (r5 == 0) goto L_0x0210
        L_0x01a9:
            android.graphics.Paint r5 = r6.d
            if (r5 != 0) goto L_0x01ba
            android.graphics.Paint r5 = new android.graphics.Paint
            r11 = 1
            r5.<init>(r11)
            r6.d = r5
            android.graphics.Paint$Style r11 = android.graphics.Paint.Style.STROKE
            r5.setStyle(r11)
        L_0x01ba:
            android.graphics.Paint r5 = r6.d
            android.graphics.Paint$Join r11 = r0.f11795m
            if (r11 == 0) goto L_0x01c3
            r5.setStrokeJoin(r11)
        L_0x01c3:
            android.graphics.Paint$Cap r11 = r0.f11794l
            if (r11 == 0) goto L_0x01ca
            r5.setStrokeCap(r11)
        L_0x01ca:
            float r11 = r0.f11796n
            r5.setStrokeMiter(r11)
            java.lang.Object r11 = r3.f30c
            android.graphics.Shader r11 = (android.graphics.Shader) r11
            if (r11 == 0) goto L_0x01e6
            r11.setLocalMatrix(r13)
            r5.setShader(r11)
            float r3 = r0.g
            float r3 = r3 * r15
            int r3 = java.lang.Math.round(r3)
            r5.setAlpha(r3)
            goto L_0x0202
        L_0x01e6:
            r5.setShader(r10)
            r11 = 255(0xff, float:3.57E-43)
            r5.setAlpha(r11)
            int r3 = r3.f29b
            float r11 = r0.g
            android.graphics.PorterDuff$Mode r13 = u0.C1028o.f11831s
            int r13 = android.graphics.Color.alpha(r3)
            r3 = r3 & r9
            float r9 = (float) r13
            float r9 = r9 * r11
            int r9 = (int) r9
            int r9 = r9 << 24
            r3 = r3 | r9
            r5.setColor(r3)
        L_0x0202:
            r5.setColorFilter(r10)
            float r2 = r2 * r20
            float r0 = r0.f11789e
            float r0 = r0 * r2
            r5.setStrokeWidth(r0)
            r8.drawPath(r4, r5)
        L_0x0210:
            r0 = 1
            goto L_0x0217
        L_0x0212:
            r1 = r22
            r17 = r10
            r0 = r9
        L_0x0217:
            int r12 = r12 + r0
            r9 = r0
            r10 = r17
            r11 = 0
            goto L_0x001a
        L_0x021e:
            r21.restore()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: u0.C1025l.a(u0.i, android.graphics.Matrix, android.graphics.Canvas, int, int):void");
    }

    public float getAlpha() {
        return ((float) getRootAlpha()) / 255.0f;
    }

    public int getRootAlpha() {
        return this.f11817l;
    }

    public void setAlpha(float f6) {
        setRootAlpha((int) (f6 * 255.0f));
    }

    public void setRootAlpha(int i2) {
        this.f11817l = i2;
    }

    /* JADX WARNING: type inference failed for: r0v4, types: [n.e, n.j] */
    public C1025l(C1025l lVar) {
        this.f11811c = new Matrix();
        this.h = 0.0f;
        this.f11814i = 0.0f;
        this.f11815j = 0.0f;
        this.f11816k = 0.0f;
        this.f11817l = 255;
        this.f11818m = null;
        this.f11819n = null;
        ? jVar = new j(0);
        this.f11820o = jVar;
        this.g = new C1022i(lVar.g, jVar);
        this.f11809a = new Path(lVar.f11809a);
        this.f11810b = new Path(lVar.f11810b);
        this.h = lVar.h;
        this.f11814i = lVar.f11814i;
        this.f11815j = lVar.f11815j;
        this.f11816k = lVar.f11816k;
        this.f11817l = lVar.f11817l;
        this.f11818m = lVar.f11818m;
        String str = lVar.f11818m;
        if (str != null) {
            jVar.put(str, this);
        }
        this.f11819n = lVar.f11819n;
    }
}
