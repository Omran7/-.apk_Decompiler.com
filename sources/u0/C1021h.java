package u0;

import A2.f;
import android.graphics.Paint;

/* renamed from: u0.h  reason: case insensitive filesystem */
public final class C1021h extends C1024k {
    public f d;

    /* renamed from: e  reason: collision with root package name */
    public float f11789e;

    /* renamed from: f  reason: collision with root package name */
    public f f11790f;
    public float g;
    public float h;

    /* renamed from: i  reason: collision with root package name */
    public float f11791i;

    /* renamed from: j  reason: collision with root package name */
    public float f11792j;

    /* renamed from: k  reason: collision with root package name */
    public float f11793k;

    /* renamed from: l  reason: collision with root package name */
    public Paint.Cap f11794l;

    /* renamed from: m  reason: collision with root package name */
    public Paint.Join f11795m;

    /* renamed from: n  reason: collision with root package name */
    public float f11796n;

    public final boolean a() {
        if (this.f11790f.i() || this.d.i()) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:8:0x0027  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean b(int[] r7) {
        /*
            r6 = this;
            A2.f r0 = r6.f11790f
            boolean r1 = r0.i()
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L_0x001e
            java.lang.Object r1 = r0.d
            android.content.res.ColorStateList r1 = (android.content.res.ColorStateList) r1
            int r4 = r1.getDefaultColor()
            int r1 = r1.getColorForState(r7, r4)
            int r4 = r0.f29b
            if (r1 == r4) goto L_0x001e
            r0.f29b = r1
            r0 = r3
            goto L_0x001f
        L_0x001e:
            r0 = r2
        L_0x001f:
            A2.f r1 = r6.d
            boolean r4 = r1.i()
            if (r4 == 0) goto L_0x003a
            java.lang.Object r4 = r1.d
            android.content.res.ColorStateList r4 = (android.content.res.ColorStateList) r4
            int r5 = r4.getDefaultColor()
            int r7 = r4.getColorForState(r7, r5)
            int r4 = r1.f29b
            if (r7 == r4) goto L_0x003a
            r1.f29b = r7
            r2 = r3
        L_0x003a:
            r7 = r0 | r2
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: u0.C1021h.b(int[]):boolean");
    }

    public float getFillAlpha() {
        return this.h;
    }

    public int getFillColor() {
        return this.f11790f.f29b;
    }

    public float getStrokeAlpha() {
        return this.g;
    }

    public int getStrokeColor() {
        return this.d.f29b;
    }

    public float getStrokeWidth() {
        return this.f11789e;
    }

    public float getTrimPathEnd() {
        return this.f11792j;
    }

    public float getTrimPathOffset() {
        return this.f11793k;
    }

    public float getTrimPathStart() {
        return this.f11791i;
    }

    public void setFillAlpha(float f6) {
        this.h = f6;
    }

    public void setFillColor(int i2) {
        this.f11790f.f29b = i2;
    }

    public void setStrokeAlpha(float f6) {
        this.g = f6;
    }

    public void setStrokeColor(int i2) {
        this.d.f29b = i2;
    }

    public void setStrokeWidth(float f6) {
        this.f11789e = f6;
    }

    public void setTrimPathEnd(float f6) {
        this.f11792j = f6;
    }

    public void setTrimPathOffset(float f6) {
        this.f11793k = f6;
    }

    public void setTrimPathStart(float f6) {
        this.f11791i = f6;
    }
}
