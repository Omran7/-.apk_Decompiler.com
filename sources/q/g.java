package Q;

import B0.C0004c;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.widget.ListView;
import k.C0739t0;

public final class g implements View.OnTouchListener {

    /* renamed from: A  reason: collision with root package name */
    public static final int f2315A = ViewConfiguration.getTapTimeout();

    /* renamed from: a  reason: collision with root package name */
    public final a f2316a;

    /* renamed from: b  reason: collision with root package name */
    public final AccelerateInterpolator f2317b = new AccelerateInterpolator();

    /* renamed from: c  reason: collision with root package name */
    public final ListView f2318c;
    public C0004c d;

    /* renamed from: e  reason: collision with root package name */
    public final float[] f2319e;

    /* renamed from: f  reason: collision with root package name */
    public final float[] f2320f;

    /* renamed from: p  reason: collision with root package name */
    public final int f2321p;

    /* renamed from: q  reason: collision with root package name */
    public final int f2322q;

    /* renamed from: r  reason: collision with root package name */
    public final float[] f2323r;

    /* renamed from: s  reason: collision with root package name */
    public final float[] f2324s;

    /* renamed from: t  reason: collision with root package name */
    public final float[] f2325t;

    /* renamed from: u  reason: collision with root package name */
    public boolean f2326u;

    /* renamed from: v  reason: collision with root package name */
    public boolean f2327v;

    /* renamed from: w  reason: collision with root package name */
    public boolean f2328w;

    /* renamed from: x  reason: collision with root package name */
    public boolean f2329x;

    /* renamed from: y  reason: collision with root package name */
    public boolean f2330y;

    /* renamed from: z  reason: collision with root package name */
    public final C0739t0 f2331z;

    /* JADX WARNING: type inference failed for: r1v0, types: [Q.a, java.lang.Object] */
    public g(C0739t0 t0Var) {
        ? obj = new Object();
        obj.f2312e = Long.MIN_VALUE;
        obj.g = -1;
        obj.f2313f = 0;
        this.f2316a = obj;
        float[] fArr = {0.0f, 0.0f};
        this.f2319e = fArr;
        float[] fArr2 = {Float.MAX_VALUE, Float.MAX_VALUE};
        this.f2320f = fArr2;
        float[] fArr3 = {0.0f, 0.0f};
        this.f2323r = fArr3;
        float[] fArr4 = {0.0f, 0.0f};
        this.f2324s = fArr4;
        float[] fArr5 = {Float.MAX_VALUE, Float.MAX_VALUE};
        this.f2325t = fArr5;
        this.f2318c = t0Var;
        float f6 = Resources.getSystem().getDisplayMetrics().density;
        float f7 = ((float) ((int) ((1575.0f * f6) + 0.5f))) / 1000.0f;
        fArr5[0] = f7;
        fArr5[1] = f7;
        float f8 = ((float) ((int) ((f6 * 315.0f) + 0.5f))) / 1000.0f;
        fArr4[0] = f8;
        fArr4[1] = f8;
        this.f2321p = 1;
        fArr2[0] = Float.MAX_VALUE;
        fArr2[1] = Float.MAX_VALUE;
        fArr[0] = 0.2f;
        fArr[1] = 0.2f;
        fArr3[0] = 0.001f;
        fArr3[1] = 0.001f;
        this.f2322q = f2315A;
        obj.f2309a = 500;
        obj.f2310b = 500;
        this.f2331z = t0Var;
    }

    public static float b(float f6, float f7, float f8) {
        if (f6 > f8) {
            return f8;
        }
        if (f6 < f7) {
            return f7;
        }
        return f6;
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x003b A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x003c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final float a(int r4, float r5, float r6, float r7) {
        /*
            r3 = this;
            float[] r0 = r3.f2319e
            r0 = r0[r4]
            float[] r1 = r3.f2320f
            r1 = r1[r4]
            float r0 = r0 * r6
            r2 = 0
            float r0 = b(r0, r2, r1)
            float r1 = r3.c(r5, r0)
            float r6 = r6 - r5
            float r5 = r3.c(r6, r0)
            float r5 = r5 - r1
            int r6 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            android.view.animation.AccelerateInterpolator r0 = r3.f2317b
            if (r6 >= 0) goto L_0x0025
            float r5 = -r5
            float r5 = r0.getInterpolation(r5)
            float r5 = -r5
            goto L_0x002d
        L_0x0025:
            int r6 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r6 <= 0) goto L_0x0036
            float r5 = r0.getInterpolation(r5)
        L_0x002d:
            r6 = -1082130432(0xffffffffbf800000, float:-1.0)
            r0 = 1065353216(0x3f800000, float:1.0)
            float r5 = b(r5, r6, r0)
            goto L_0x0037
        L_0x0036:
            r5 = r2
        L_0x0037:
            int r6 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r6 != 0) goto L_0x003c
            return r2
        L_0x003c:
            float[] r0 = r3.f2323r
            r0 = r0[r4]
            float[] r1 = r3.f2324s
            r1 = r1[r4]
            float[] r2 = r3.f2325t
            r4 = r2[r4]
            float r0 = r0 * r7
            if (r6 <= 0) goto L_0x0051
            float r5 = r5 * r0
            float r4 = b(r5, r1, r4)
            return r4
        L_0x0051:
            float r5 = -r5
            float r5 = r5 * r0
            float r4 = b(r5, r1, r4)
            float r4 = -r4
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: Q.g.a(int, float, float, float):float");
    }

    public final float c(float f6, float f7) {
        if (f7 == 0.0f) {
            return 0.0f;
        }
        int i2 = this.f2321p;
        if (i2 == 0 || i2 == 1) {
            if (f6 < f7) {
                if (f6 >= 0.0f) {
                    return 1.0f - (f6 / f7);
                }
                if (!this.f2329x || i2 != 1) {
                    return 0.0f;
                }
                return 1.0f;
            }
        } else if (i2 == 2 && f6 < 0.0f) {
            return f6 / (-f7);
        }
        return 0.0f;
    }

    public final void d() {
        int i2 = 0;
        if (this.f2327v) {
            this.f2329x = false;
            return;
        }
        a aVar = this.f2316a;
        long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        int i5 = (int) (currentAnimationTimeMillis - aVar.f2312e);
        int i6 = aVar.f2310b;
        if (i5 > i6) {
            i2 = i6;
        } else if (i5 >= 0) {
            i2 = i5;
        }
        aVar.f2314i = i2;
        aVar.h = aVar.a(currentAnimationTimeMillis);
        aVar.g = currentAnimationTimeMillis;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0012, code lost:
        r2 = r8.f2331z;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean e() {
        /*
            r8 = this;
            Q.a r0 = r8.f2316a
            float r1 = r0.d
            float r2 = java.lang.Math.abs(r1)
            float r1 = r1 / r2
            int r1 = (int) r1
            float r0 = r0.f2311c
            java.lang.Math.abs(r0)
            r0 = 0
            if (r1 == 0) goto L_0x004a
            k.t0 r2 = r8.f2331z
            int r3 = r2.getCount()
            if (r3 != 0) goto L_0x001b
            goto L_0x004a
        L_0x001b:
            int r4 = r2.getChildCount()
            int r5 = r2.getFirstVisiblePosition()
            int r6 = r5 + r4
            r7 = 1
            if (r1 <= 0) goto L_0x003a
            if (r6 < r3) goto L_0x0049
            int r4 = r4 - r7
            android.view.View r1 = r2.getChildAt(r4)
            int r1 = r1.getBottom()
            int r2 = r2.getHeight()
            if (r1 > r2) goto L_0x0049
            goto L_0x004a
        L_0x003a:
            if (r1 >= 0) goto L_0x004a
            if (r5 > 0) goto L_0x0049
            android.view.View r1 = r2.getChildAt(r0)
            int r1 = r1.getTop()
            if (r1 < 0) goto L_0x0049
            goto L_0x004a
        L_0x0049:
            r0 = r7
        L_0x004a:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: Q.g.e():boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0013, code lost:
        if (r1 != 3) goto L_0x007b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean onTouch(android.view.View r8, android.view.MotionEvent r9) {
        /*
            r7 = this;
            r0 = 3
            boolean r1 = r7.f2330y
            r2 = 0
            if (r1 != 0) goto L_0x0007
            return r2
        L_0x0007:
            int r1 = r9.getActionMasked()
            r3 = 1
            if (r1 == 0) goto L_0x001a
            if (r1 == r3) goto L_0x0016
            r4 = 2
            if (r1 == r4) goto L_0x001e
            if (r1 == r0) goto L_0x0016
            goto L_0x007b
        L_0x0016:
            r7.d()
            goto L_0x007b
        L_0x001a:
            r7.f2328w = r3
            r7.f2326u = r2
        L_0x001e:
            float r1 = r9.getX()
            int r4 = r8.getWidth()
            float r4 = (float) r4
            android.widget.ListView r5 = r7.f2318c
            int r6 = r5.getWidth()
            float r6 = (float) r6
            float r1 = r7.a(r2, r1, r4, r6)
            float r9 = r9.getY()
            int r8 = r8.getHeight()
            float r8 = (float) r8
            int r4 = r5.getHeight()
            float r4 = (float) r4
            float r8 = r7.a(r3, r9, r8, r4)
            Q.a r9 = r7.f2316a
            r9.f2311c = r1
            r9.d = r8
            boolean r8 = r7.f2329x
            if (r8 != 0) goto L_0x007b
            boolean r8 = r7.e()
            if (r8 == 0) goto L_0x007b
            B0.c r8 = r7.d
            if (r8 != 0) goto L_0x005f
            B0.c r8 = new B0.c
            r8.<init>((java.lang.Object) r7, (int) r0)
            r7.d = r8
        L_0x005f:
            r7.f2329x = r3
            r7.f2327v = r3
            boolean r8 = r7.f2326u
            if (r8 != 0) goto L_0x0074
            int r8 = r7.f2322q
            if (r8 <= 0) goto L_0x0074
            B0.c r9 = r7.d
            long r0 = (long) r8
            java.util.WeakHashMap r8 = K.O.f1352a
            r5.postOnAnimationDelayed(r9, r0)
            goto L_0x0079
        L_0x0074:
            B0.c r8 = r7.d
            r8.run()
        L_0x0079:
            r7.f2326u = r3
        L_0x007b:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: Q.g.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }
}
