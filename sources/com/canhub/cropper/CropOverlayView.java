package com.canhub.cropper;

import K1.e;
import W0.A;
import W0.C0239k;
import W0.I;
import W0.J;
import W0.K;
import W0.L;
import W0.N;
import W0.w;
import W0.x;
import W0.z;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.os.Build;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ScaleGestureDetector;
import android.view.View;
import java.util.Arrays;
import java.util.List;
import kotlin.jvm.internal.j;
import n5.C0876h;

public final class CropOverlayView extends View {

    /* renamed from: A  reason: collision with root package name */
    public int f5891A;

    /* renamed from: B  reason: collision with root package name */
    public int f5892B;

    /* renamed from: C  reason: collision with root package name */
    public float f5893C;

    /* renamed from: D  reason: collision with root package name */
    public float f5894D;

    /* renamed from: E  reason: collision with root package name */
    public float f5895E;
    public float F;

    /* renamed from: G  reason: collision with root package name */
    public float f5896G;

    /* renamed from: H  reason: collision with root package name */
    public N f5897H;

    /* renamed from: I  reason: collision with root package name */
    public boolean f5898I;

    /* renamed from: J  reason: collision with root package name */
    public int f5899J;

    /* renamed from: K  reason: collision with root package name */
    public int f5900K;

    /* renamed from: L  reason: collision with root package name */
    public float f5901L = (((float) this.f5899J) / ((float) this.f5900K));

    /* renamed from: M  reason: collision with root package name */
    public A f5902M;

    /* renamed from: N  reason: collision with root package name */
    public z f5903N;

    /* renamed from: O  reason: collision with root package name */
    public x f5904O;

    /* renamed from: P  reason: collision with root package name */
    public boolean f5905P;

    /* renamed from: Q  reason: collision with root package name */
    public String f5906Q = "";

    /* renamed from: R  reason: collision with root package name */
    public float f5907R = 20.0f;

    /* renamed from: S  reason: collision with root package name */
    public int f5908S = -1;

    /* renamed from: T  reason: collision with root package name */
    public final Rect f5909T = new Rect();

    /* renamed from: U  reason: collision with root package name */
    public boolean f5910U;

    /* renamed from: V  reason: collision with root package name */
    public final float f5911V = TypedValue.applyDimension(1, 200.0f, Resources.getSystem().getDisplayMetrics());

    /* renamed from: a  reason: collision with root package name */
    public float f5912a;

    /* renamed from: b  reason: collision with root package name */
    public Integer f5913b;

    /* renamed from: c  reason: collision with root package name */
    public w f5914c;
    public ScaleGestureDetector d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f5915e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f5916f = true;

    /* renamed from: p  reason: collision with root package name */
    public final L f5917p = new L();

    /* renamed from: q  reason: collision with root package name */
    public I f5918q;

    /* renamed from: r  reason: collision with root package name */
    public final RectF f5919r = new RectF();

    /* renamed from: s  reason: collision with root package name */
    public Paint f5920s;

    /* renamed from: t  reason: collision with root package name */
    public Paint f5921t;

    /* renamed from: u  reason: collision with root package name */
    public Paint f5922u;

    /* renamed from: v  reason: collision with root package name */
    public Paint f5923v;

    /* renamed from: w  reason: collision with root package name */
    public Paint f5924w;

    /* renamed from: x  reason: collision with root package name */
    public final Path f5925x = new Path();

    /* renamed from: y  reason: collision with root package name */
    public final float[] f5926y = new float[8];

    /* renamed from: z  reason: collision with root package name */
    public final RectF f5927z = new RectF();

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CropOverlayView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        j.e(context, "context");
    }

    public final boolean a(RectF rectF) {
        boolean z3;
        float f6;
        float f7;
        float f8;
        RectF rectF2 = rectF;
        Rect rect = C0239k.f3959a;
        float[] fArr = this.f5926y;
        float q6 = C0239k.q(fArr);
        float s6 = C0239k.s(fArr);
        float r6 = C0239k.r(fArr);
        float l6 = C0239k.l(fArr);
        if (fArr[0] == fArr[6] || fArr[1] == fArr[7]) {
            z3 = false;
        } else {
            z3 = true;
        }
        RectF rectF3 = this.f5927z;
        if (!z3) {
            rectF3.set(q6, s6, r6, l6);
            return false;
        }
        float f9 = fArr[0];
        float f10 = fArr[1];
        float f11 = fArr[4];
        float f12 = fArr[5];
        float f13 = fArr[6];
        float f14 = fArr[7];
        if (f14 < f10) {
            f6 = fArr[3];
            if (f10 < f6) {
                float f15 = fArr[2];
                f7 = f13;
                f10 = f12;
                f13 = f15;
                f12 = f14;
                f9 = f11;
            } else {
                f13 = f9;
                f9 = fArr[2];
                f7 = f11;
                float f16 = f6;
                f6 = f10;
                f10 = f16;
            }
        } else {
            float f17 = fArr[3];
            if (f10 > f17) {
                f7 = fArr[2];
                f12 = f17;
                f6 = f14;
            } else {
                f7 = f9;
                f9 = f13;
                f13 = f11;
                f6 = f12;
                f12 = f10;
                f10 = f14;
            }
        }
        float f18 = (f10 - f12) / (f9 - f7);
        float f19 = -1.0f / f18;
        float f20 = f12 - (f18 * f7);
        float f21 = f12 - (f7 * f19);
        float f22 = f6 - (f18 * f13);
        float f23 = f6 - (f13 * f19);
        float centerY = rectF.centerY() - rectF2.top;
        float centerX = rectF.centerX();
        float f24 = rectF2.left;
        float f25 = centerY / (centerX - f24);
        float f26 = -f25;
        float f27 = rectF2.top;
        float f28 = f27 - (f24 * f25);
        RectF rectF4 = rectF3;
        float f29 = rectF2.right;
        float f30 = f27 - (f26 * f29);
        float f31 = f18 - f25;
        float f32 = (f28 - f20) / f31;
        if (f32 < f29) {
            f8 = f32;
        } else {
            f8 = q6;
        }
        float max = Math.max(q6, f8);
        float f33 = (f28 - f21) / (f19 - f25);
        if (f33 >= rectF2.right) {
            f33 = max;
        }
        float max2 = Math.max(max, f33);
        float f34 = f19 - f26;
        float f35 = (f30 - f23) / f34;
        float f36 = l6;
        if (f35 >= rectF2.right) {
            f35 = max2;
        }
        float max3 = Math.max(max2, f35);
        float f37 = (f30 - f21) / f34;
        if (f37 <= rectF2.left) {
            f37 = r6;
        }
        float min = Math.min(r6, f37);
        float f38 = (f30 - f22) / (f18 - f26);
        if (f38 <= rectF2.left) {
            f38 = min;
        }
        float min2 = Math.min(min, f38);
        float f39 = (f28 - f22) / f31;
        if (f39 <= rectF2.left) {
            f39 = min2;
        }
        float min3 = Math.min(min2, f39);
        float max4 = Math.max(s6, Math.max((f18 * max3) + f20, (f19 * min3) + f21));
        float min4 = Math.min(f36, Math.min((f19 * max3) + f23, (f18 * min3) + f22));
        RectF rectF5 = rectF4;
        rectF5.left = max3;
        rectF5.top = max4;
        rectF5.right = min3;
        rectF5.bottom = min4;
        return true;
    }

    public final void b(Canvas canvas, RectF rectF, float f6, float f7) {
        int i2;
        int i5;
        z zVar = this.f5903N;
        if (zVar == null) {
            i2 = -1;
        } else {
            i2 = K.f3885a[zVar.ordinal()];
        }
        if (i2 == 1) {
            float f8 = this.f5912a;
            x xVar = this.f5904O;
            if (xVar == null) {
                i5 = -1;
            } else {
                i5 = K.f3886b[xVar.ordinal()];
            }
            if (i5 == -1) {
                return;
            }
            if (i5 == 1) {
                Paint paint = this.f5921t;
                j.b(paint);
                canvas.drawCircle(rectF.left - f6, rectF.top - f6, f8, paint);
                Paint paint2 = this.f5921t;
                j.b(paint2);
                canvas.drawCircle(rectF.right + f6, rectF.top - f6, f8, paint2);
                Paint paint3 = this.f5921t;
                j.b(paint3);
                canvas.drawCircle(rectF.left - f6, rectF.bottom + f6, f8, paint3);
                float f9 = rectF.right + f6;
                float f10 = rectF.bottom + f6;
                Paint paint4 = this.f5921t;
                j.b(paint4);
                canvas.drawCircle(f9, f10, f8, paint4);
            } else if (i5 == 2) {
                d(canvas, rectF, f6, f7);
            } else {
                throw new RuntimeException();
            }
        } else if (i2 == 2) {
            Paint paint5 = this.f5921t;
            j.b(paint5);
            Canvas canvas2 = canvas;
            canvas2.drawLine(rectF.centerX() - this.f5894D, rectF.top - f6, rectF.centerX() + this.f5894D, rectF.top - f6, paint5);
            Paint paint6 = this.f5921t;
            j.b(paint6);
            canvas2.drawLine(rectF.centerX() - this.f5894D, rectF.bottom + f6, rectF.centerX() + this.f5894D, rectF.bottom + f6, paint6);
        } else if (i2 == 3) {
            float f11 = rectF.left - f6;
            float centerY = rectF.centerY() - this.f5894D;
            float f12 = rectF.left - f6;
            float centerY2 = rectF.centerY() + this.f5894D;
            Paint paint7 = this.f5921t;
            j.b(paint7);
            canvas.drawLine(f11, centerY, f12, centerY2, paint7);
            Paint paint8 = this.f5921t;
            j.b(paint8);
            canvas.drawLine(rectF.right + f6, rectF.centerY() - this.f5894D, rectF.right + f6, rectF.centerY() + this.f5894D, paint8);
        } else if (i2 == 4) {
            d(canvas, rectF, f6, f7);
        } else {
            throw new IllegalStateException("Unrecognized crop shape");
        }
    }

    public final void c(Canvas canvas) {
        float f6;
        int i2;
        if (this.f5922u != null) {
            Paint paint = this.f5920s;
            if (paint != null) {
                j.b(paint);
                f6 = paint.getStrokeWidth();
            } else {
                f6 = 0.0f;
            }
            RectF c3 = this.f5917p.c();
            c3.inset(f6, f6);
            float f7 = (float) 3;
            float width = c3.width() / f7;
            float height = c3.height() / f7;
            z zVar = this.f5903N;
            if (zVar == null) {
                i2 = -1;
            } else {
                i2 = K.f3885a[zVar.ordinal()];
            }
            if (i2 == 1 || i2 == 2 || i2 == 3) {
                float f8 = c3.left + width;
                float f9 = c3.right - width;
                float f10 = c3.top;
                float f11 = c3.bottom;
                Paint paint2 = this.f5922u;
                j.b(paint2);
                Canvas canvas2 = canvas;
                canvas2.drawLine(f8, f10, f8, f11, paint2);
                float f12 = c3.top;
                float f13 = c3.bottom;
                Paint paint3 = this.f5922u;
                j.b(paint3);
                canvas.drawLine(f9, f12, f9, f13, paint3);
                float f14 = c3.top + height;
                float f15 = c3.bottom - height;
                float f16 = c3.left;
                float f17 = c3.right;
                Paint paint4 = this.f5922u;
                j.b(paint4);
                canvas2.drawLine(f16, f14, f17, f14, paint4);
                float f18 = c3.left;
                float f19 = c3.right;
                Paint paint5 = this.f5922u;
                j.b(paint5);
                canvas.drawLine(f18, f15, f19, f15, paint5);
            } else if (i2 == 4) {
                float f20 = (float) 2;
                float width2 = (c3.width() / f20) - f6;
                float height2 = (c3.height() / f20) - f6;
                float f21 = c3.left + width;
                float f22 = c3.right - width;
                float sin = (float) (Math.sin(Math.acos((double) ((width2 - width) / width2))) * ((double) height2));
                Paint paint6 = this.f5922u;
                j.b(paint6);
                canvas.drawLine(f21, (c3.top + height2) - sin, f21, (c3.bottom - height2) + sin, paint6);
                float f23 = (c3.top + height2) - sin;
                float f24 = (c3.bottom - height2) + sin;
                Paint paint7 = this.f5922u;
                j.b(paint7);
                canvas.drawLine(f22, f23, f22, f24, paint7);
                float f25 = c3.top + height;
                float f26 = c3.bottom - height;
                float cos = (float) (Math.cos(Math.asin((double) ((height2 - height) / height2))) * ((double) width2));
                Paint paint8 = this.f5922u;
                j.b(paint8);
                canvas.drawLine((c3.left + width2) - cos, f25, (c3.right - width2) + cos, f25, paint8);
                float f27 = (c3.left + width2) - cos;
                float f28 = (c3.right - width2) + cos;
                Paint paint9 = this.f5922u;
                j.b(paint9);
                canvas.drawLine(f27, f26, f28, f26, paint9);
            } else {
                throw new IllegalStateException("Unrecognized crop shape");
            }
        }
    }

    public final void d(Canvas canvas, RectF rectF, float f6, float f7) {
        float f8 = rectF.left - f6;
        float f9 = rectF.top;
        float f10 = f9 + this.f5894D;
        Paint paint = this.f5921t;
        j.b(paint);
        canvas.drawLine(f8, f9 - f7, f8, f10, paint);
        float f11 = rectF.left;
        float f12 = rectF.top - f6;
        float f13 = f11 + this.f5894D;
        Paint paint2 = this.f5921t;
        j.b(paint2);
        canvas.drawLine(f11 - f7, f12, f13, f12, paint2);
        float f14 = rectF.right + f6;
        float f15 = rectF.top;
        float f16 = f15 + this.f5894D;
        Paint paint3 = this.f5921t;
        j.b(paint3);
        canvas.drawLine(f14, f15 - f7, f14, f16, paint3);
        float f17 = rectF.right;
        float f18 = rectF.top - f6;
        float f19 = f17 - this.f5894D;
        Paint paint4 = this.f5921t;
        j.b(paint4);
        canvas.drawLine(f17 + f7, f18, f19, f18, paint4);
        float f20 = rectF.left - f6;
        float f21 = rectF.bottom;
        float f22 = f21 - this.f5894D;
        Paint paint5 = this.f5921t;
        j.b(paint5);
        canvas.drawLine(f20, f21 + f7, f20, f22, paint5);
        float f23 = rectF.left;
        float f24 = rectF.bottom + f6;
        float f25 = f23 + this.f5894D;
        Paint paint6 = this.f5921t;
        j.b(paint6);
        canvas.drawLine(f23 - f7, f24, f25, f24, paint6);
        float f26 = rectF.right + f6;
        float f27 = rectF.bottom;
        float f28 = f27 - this.f5894D;
        Paint paint7 = this.f5921t;
        j.b(paint7);
        Canvas canvas2 = canvas;
        canvas2.drawLine(f26, f27 + f7, f26, f28, paint7);
        float f29 = rectF.right;
        float f30 = rectF.bottom + f6;
        Paint paint8 = this.f5921t;
        j.b(paint8);
        canvas2.drawLine(f29 + f7, f30, f29 - this.f5894D, f30, paint8);
    }

    public final void e(RectF rectF) {
        float width = rectF.width();
        L l6 = this.f5917p;
        float f6 = l6.f3889c;
        float f7 = l6.g;
        float f8 = l6.f3894k;
        float f9 = f7 / f8;
        if (f6 >= f9) {
            f9 = f6;
        }
        if (width < f9) {
            float f10 = f7 / f8;
            if (f6 < f10) {
                f6 = f10;
            }
            float width2 = (f6 - rectF.width()) / ((float) 2);
            rectF.left -= width2;
            rectF.right += width2;
        }
        float height = rectF.height();
        float f11 = l6.d;
        float f12 = l6.h;
        float f13 = l6.f3895l;
        float f14 = f12 / f13;
        if (f11 >= f14) {
            f14 = f11;
        }
        if (height < f14) {
            float f15 = f12 / f13;
            if (f11 < f15) {
                f11 = f15;
            }
            float height2 = (f11 - rectF.height()) / ((float) 2);
            rectF.top -= height2;
            rectF.bottom += height2;
        }
        float width3 = rectF.width();
        float f16 = l6.f3890e;
        float f17 = l6.f3892i / l6.f3894k;
        if (f16 > f17) {
            f16 = f17;
        }
        if (width3 > f16) {
            float width4 = rectF.width();
            float f18 = l6.f3890e;
            float f19 = l6.f3892i / l6.f3894k;
            if (f18 > f19) {
                f18 = f19;
            }
            float f20 = (width4 - f18) / ((float) 2);
            rectF.left += f20;
            rectF.right -= f20;
        }
        float height3 = rectF.height();
        float f21 = l6.f3891f;
        float f22 = l6.f3893j / l6.f3895l;
        if (f21 > f22) {
            f21 = f22;
        }
        if (height3 > f21) {
            float height4 = rectF.height();
            float f23 = l6.f3891f;
            float f24 = l6.f3893j / l6.f3895l;
            if (f23 > f24) {
                f23 = f24;
            }
            float f25 = (height4 - f23) / ((float) 2);
            rectF.top += f25;
            rectF.bottom -= f25;
        }
        a(rectF);
        RectF rectF2 = this.f5927z;
        if (rectF2.width() > 0.0f && rectF2.height() > 0.0f) {
            float max = Math.max(rectF2.left, 0.0f);
            float max2 = Math.max(rectF2.top, 0.0f);
            float min = Math.min(rectF2.right, (float) getWidth());
            float min2 = Math.min(rectF2.bottom, (float) getHeight());
            if (rectF.left < max) {
                rectF.left = max;
            }
            if (rectF.top < max2) {
                rectF.top = max2;
            }
            if (rectF.right > min) {
                rectF.right = min;
            }
            if (rectF.bottom > min2) {
                rectF.bottom = min2;
            }
        }
        if (this.f5898I && ((double) Math.abs(rectF.width() - (rectF.height() * this.f5901L))) > 0.1d) {
            if (rectF.width() > rectF.height() * this.f5901L) {
                float abs = Math.abs((rectF.height() * this.f5901L) - rectF.width()) / ((float) 2);
                rectF.left += abs;
                rectF.right -= abs;
                return;
            }
            float abs2 = Math.abs((rectF.width() / this.f5901L) - rectF.height()) / ((float) 2);
            rectF.top += abs2;
            rectF.bottom -= abs2;
        }
    }

    public final void f() {
        Rect rect = C0239k.f3959a;
        float[] fArr = this.f5926y;
        float max = Math.max(C0239k.q(fArr), 0.0f);
        float max2 = Math.max(C0239k.s(fArr), 0.0f);
        float min = Math.min(C0239k.r(fArr), (float) getWidth());
        float min2 = Math.min(C0239k.l(fArr), (float) getHeight());
        if (min > max && min2 > max2) {
            RectF rectF = new RectF();
            this.f5910U = true;
            float f6 = this.f5895E;
            float f7 = min - max;
            float f8 = f6 * f7;
            float f9 = min2 - max2;
            float f10 = f6 * f9;
            Rect rect2 = this.f5909T;
            int width = rect2.width();
            L l6 = this.f5917p;
            if (width > 0 && rect2.height() > 0) {
                float f11 = (((float) rect2.left) / l6.f3894k) + max;
                rectF.left = f11;
                rectF.top = (((float) rect2.top) / l6.f3895l) + max2;
                rectF.right = (((float) rect2.width()) / l6.f3894k) + f11;
                rectF.bottom = (((float) rect2.height()) / l6.f3895l) + rectF.top;
                rectF.left = Math.max(max, rectF.left);
                rectF.top = Math.max(max2, rectF.top);
                rectF.right = Math.min(min, rectF.right);
                rectF.bottom = Math.min(min2, rectF.bottom);
            } else if (!this.f5898I || min <= max || min2 <= max2) {
                rectF.left = max + f8;
                rectF.top = max2 + f10;
                rectF.right = min - f8;
                rectF.bottom = min2 - f10;
            } else if (f7 / f9 > this.f5901L) {
                rectF.top = max2 + f10;
                rectF.bottom = min2 - f10;
                float width2 = ((float) getWidth()) / 2.0f;
                this.f5901L = ((float) this.f5899J) / ((float) this.f5900K);
                float f12 = l6.f3889c;
                float f13 = l6.g / l6.f3894k;
                if (f12 < f13) {
                    f12 = f13;
                }
                float max3 = Math.max(f12, rectF.height() * this.f5901L) / 2.0f;
                rectF.left = width2 - max3;
                rectF.right = width2 + max3;
            } else {
                rectF.left = max + f8;
                rectF.right = min - f8;
                float height = ((float) getHeight()) / 2.0f;
                float f14 = l6.d;
                float f15 = l6.h / l6.f3895l;
                if (f14 < f15) {
                    f14 = f15;
                }
                float max4 = Math.max(f14, rectF.width() / this.f5901L) / 2.0f;
                rectF.top = height - max4;
                rectF.bottom = height + max4;
            }
            e(rectF);
            l6.e(rectF);
        }
    }

    public final void g() {
        if (this.f5910U) {
            setCropWindowRect(C0239k.f3960b);
            f();
            invalidate();
        }
    }

    public final int getAspectRatioX() {
        return this.f5899J;
    }

    public final int getAspectRatioY() {
        return this.f5900K;
    }

    public final x getCornerShape() {
        return this.f5904O;
    }

    public final z getCropShape() {
        return this.f5903N;
    }

    public final RectF getCropWindowRect() {
        return this.f5917p.c();
    }

    public final A getGuidelines() {
        return this.f5902M;
    }

    public final Rect getInitialCropWindowRect() {
        return this.f5909T;
    }

    public final void h(float[] fArr, int i2, int i5) {
        float[] fArr2 = this.f5926y;
        if (fArr == null || !Arrays.equals(fArr2, fArr)) {
            if (fArr == null) {
                Arrays.fill(fArr2, 0.0f);
            } else {
                System.arraycopy(fArr, 0, fArr2, 0, fArr.length);
            }
            this.f5891A = i2;
            this.f5892B = i5;
            RectF c3 = this.f5917p.c();
            if (c3.width() == 0.0f || c3.height() == 0.0f) {
                f();
            }
        }
    }

    public final void onDraw(Canvas canvas) {
        int i2;
        String str;
        float f6;
        int i5;
        Object obj;
        Object obj2;
        Object obj3;
        float f7;
        int i6;
        Paint paint;
        int i7;
        Canvas canvas2 = canvas;
        j.e(canvas2, "canvas");
        super.onDraw(canvas);
        L l6 = this.f5917p;
        RectF c3 = l6.c();
        Rect rect = C0239k.f3959a;
        float[] fArr = this.f5926y;
        float max = Math.max(C0239k.q(fArr), 0.0f);
        float max2 = Math.max(C0239k.s(fArr), 0.0f);
        float min = Math.min(C0239k.r(fArr), (float) getWidth());
        float min2 = Math.min(C0239k.l(fArr), (float) getHeight());
        z zVar = this.f5903N;
        if (zVar == null) {
            i2 = -1;
        } else {
            i2 = K.f3885a[zVar.ordinal()];
        }
        Path path = this.f5925x;
        if (i2 == 1 || i2 == 2 || i2 == 3) {
            str = "Unrecognized crop shape";
            if (fArr[0] == fArr[6] || fArr[1] == fArr[7]) {
                float f8 = c3.top;
                Paint paint2 = this.f5923v;
                j.b(paint2);
                Canvas canvas3 = canvas;
                float f9 = max;
                float f10 = min;
                canvas3.drawRect(f9, max2, f10, f8, paint2);
                float f11 = c3.bottom;
                Paint paint3 = this.f5923v;
                j.b(paint3);
                canvas3.drawRect(f9, f11, f10, min2, paint3);
                float f12 = c3.top;
                float f13 = c3.left;
                float f14 = c3.bottom;
                Paint paint4 = this.f5923v;
                j.b(paint4);
                canvas3.drawRect(f9, f12, f13, f14, paint4);
                float f15 = c3.right;
                float f16 = c3.top;
                float f17 = c3.bottom;
                Paint paint5 = this.f5923v;
                j.b(paint5);
                canvas3.drawRect(f15, f16, min, f17, paint5);
            } else {
                path.reset();
                path.moveTo(fArr[0], fArr[1]);
                path.lineTo(fArr[2], fArr[3]);
                path.lineTo(fArr[4], fArr[5]);
                path.lineTo(fArr[6], fArr[7]);
                path.close();
                canvas.save();
                if (Build.VERSION.SDK_INT >= 26) {
                    canvas2.clipOutPath(path);
                } else {
                    canvas2.clipPath(path, Region.Op.INTERSECT);
                }
                Paint paint6 = this.f5923v;
                j.b(paint6);
                canvas.drawRect(max, max2, min, min2, paint6);
                canvas.restore();
            }
        } else if (i2 == 4) {
            path.reset();
            RectF rectF = this.f5919r;
            rectF.set(c3.left, c3.top, c3.right, c3.bottom);
            path.addOval(rectF, Path.Direction.CW);
            canvas.save();
            if (Build.VERSION.SDK_INT >= 26) {
                canvas2.clipOutPath(path);
            } else {
                canvas2.clipPath(path, Region.Op.XOR);
            }
            Paint paint7 = this.f5923v;
            j.b(paint7);
            str = "Unrecognized crop shape";
            canvas.drawRect(max, max2, min, min2, paint7);
            canvas.restore();
        } else {
            throw new IllegalStateException("Unrecognized crop shape");
        }
        RectF rectF2 = l6.f3887a;
        if (rectF2.width() >= 100.0f && rectF2.height() >= 100.0f) {
            A a6 = this.f5902M;
            if (a6 == A.f3874b) {
                c(canvas);
            } else if (a6 == A.f3873a && this.f5897H != null) {
                c(canvas);
            }
        }
        w wVar = this.f5914c;
        if (wVar != null) {
            f6 = wVar.f3989H;
        } else {
            f6 = 0.0f;
        }
        if (wVar != null) {
            i5 = wVar.f3992K;
        } else {
            i5 = -1;
        }
        this.f5921t = e.D(i5, f6);
        if (this.f5905P) {
            RectF c6 = l6.c();
            float f18 = (c6.left + c6.right) / ((float) 2);
            float f19 = c6.top - ((float) 50);
            Paint paint8 = this.f5924w;
            if (paint8 != null) {
                paint8.setTextSize(this.f5907R);
                paint8.setColor(this.f5908S);
            }
            String str2 = this.f5906Q;
            Paint paint9 = this.f5924w;
            j.b(paint9);
            canvas2.drawText(str2, f18, f19, paint9);
            canvas.save();
        }
        Paint paint10 = this.f5920s;
        if (paint10 != null) {
            float strokeWidth = paint10.getStrokeWidth();
            RectF c7 = l6.c();
            float f20 = strokeWidth / ((float) 2);
            c7.inset(f20, f20);
            z zVar2 = this.f5903N;
            if (zVar2 == null) {
                i7 = -1;
            } else {
                i7 = K.f3885a[zVar2.ordinal()];
            }
            if (i7 == 1 || i7 == 2 || i7 == 3) {
                Paint paint11 = this.f5920s;
                j.b(paint11);
                canvas2.drawRect(c7, paint11);
            } else if (i7 == 4) {
                Paint paint12 = this.f5920s;
                j.b(paint12);
                canvas2.drawOval(c7, paint12);
            } else {
                throw new IllegalStateException(str);
            }
        }
        if (this.f5921t != null) {
            Paint paint13 = this.f5920s;
            if (paint13 != null) {
                f7 = paint13.getStrokeWidth();
            } else {
                f7 = 0.0f;
            }
            Paint paint14 = this.f5921t;
            j.b(paint14);
            float strokeWidth2 = paint14.getStrokeWidth();
            float f21 = (float) 2;
            float f22 = (strokeWidth2 - f7) / f21;
            float f23 = strokeWidth2 / f21;
            float f24 = f23 + f22;
            z zVar3 = this.f5903N;
            if (zVar3 == null) {
                i6 = -1;
            } else {
                i6 = K.f3885a[zVar3.ordinal()];
            }
            if (i6 == 1 || i6 == 2 || i6 == 3) {
                f23 += this.f5893C;
            } else if (i6 != 4) {
                throw new IllegalStateException(str);
            }
            RectF c8 = l6.c();
            c8.inset(f23, f23);
            b(canvas2, c8, f22, f24);
            if (this.f5904O == x.f4050b) {
                Integer num = this.f5913b;
                if (num != null) {
                    int intValue = num.intValue();
                    paint = new Paint();
                    paint.setColor(intValue);
                    paint.setStyle(Paint.Style.FILL);
                    paint.setAntiAlias(true);
                } else {
                    paint = null;
                }
                this.f5921t = paint;
                b(canvas2, c8, f22, f24);
            }
        }
        if (Build.VERSION.SDK_INT >= 29) {
            RectF c9 = l6.c();
            List k6 = getSystemGestureExclusionRects();
            j.d(k6, "getSystemGestureExclusionRects(...)");
            if (k6.size() > 0) {
                obj = k6.get(0);
            } else {
                obj = new Rect();
            }
            Rect rect2 = (Rect) obj;
            List k7 = getSystemGestureExclusionRects();
            j.d(k7, "getSystemGestureExclusionRects(...)");
            if (1 < k7.size()) {
                obj2 = k7.get(1);
            } else {
                obj2 = new Rect();
            }
            Rect rect3 = (Rect) obj2;
            List k8 = getSystemGestureExclusionRects();
            j.d(k8, "getSystemGestureExclusionRects(...)");
            if (2 < k8.size()) {
                obj3 = k8.get(2);
            } else {
                obj3 = new Rect();
            }
            Rect rect4 = (Rect) obj3;
            float f25 = c9.left;
            float f26 = this.F;
            int i8 = (int) (f25 - f26);
            rect2.left = i8;
            int i9 = (int) (c9.right + f26);
            rect2.right = i9;
            float f27 = c9.top;
            int i10 = (int) (f27 - f26);
            rect2.top = i10;
            float f28 = this.f5911V;
            float f29 = 0.3f * f28;
            rect2.bottom = (int) (((float) i10) + f29);
            rect3.left = i8;
            rect3.right = i9;
            float f30 = c9.bottom;
            int i11 = (int) (((f27 + f30) / 2.0f) - (0.2f * f28));
            rect3.top = i11;
            rect3.bottom = (int) ((f28 * 0.4f) + ((float) i11));
            rect4.left = rect2.left;
            rect4.right = rect2.right;
            int i12 = (int) (f30 + f26);
            rect4.bottom = i12;
            rect4.top = (int) (((float) i12) - f29);
            setSystemGestureExclusionRects(C0876h.S0(rect2, rect3, rect4));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0096, code lost:
        if (r7 <= r15.right) goto L_0x00a2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00bb, code lost:
        if (r7 <= r15.bottom) goto L_0x00c7;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean onTouchEvent(android.view.MotionEvent r19) {
        /*
            r18 = this;
            r0 = r18
            r1 = r19
            java.lang.String r2 = "event"
            kotlin.jvm.internal.j.e(r1, r2)
            boolean r2 = r18.isEnabled()
            r3 = 0
            if (r2 == 0) goto L_0x04f8
            boolean r2 = r0.f5915e
            if (r2 == 0) goto L_0x001b
            android.view.ScaleGestureDetector r2 = r0.d
            if (r2 == 0) goto L_0x001b
            r2.onTouchEvent(r1)
        L_0x001b:
            int r2 = r19.getAction()
            r4 = 1
            r5 = 0
            W0.L r6 = r0.f5917p
            r7 = 3
            r8 = 2
            if (r2 == 0) goto L_0x0332
            if (r2 == r4) goto L_0x0317
            if (r2 == r8) goto L_0x002f
            if (r2 == r7) goto L_0x0317
            goto L_0x04f8
        L_0x002f:
            float r2 = r19.getX()
            float r1 = r19.getY()
            W0.N r3 = r0.f5897H
            if (r3 == 0) goto L_0x030c
            float r3 = r0.f5896G
            android.graphics.RectF r5 = r6.c()
            boolean r7 = r0.a(r5)
            r9 = 0
            if (r7 == 0) goto L_0x0049
            r3 = r9
        L_0x0049:
            W0.N r7 = r0.f5897H
            kotlin.jvm.internal.j.b(r7)
            android.graphics.RectF r15 = r0.f5927z
            int r14 = r0.f5891A
            int r13 = r0.f5892B
            boolean r10 = r0.f5898I
            float r12 = r0.f5901L
            java.lang.String r11 = "rect"
            kotlin.jvm.internal.j.e(r5, r11)
            java.lang.String r11 = "bounds"
            kotlin.jvm.internal.j.e(r15, r11)
            android.graphics.PointF r11 = r7.f3909f
            float r4 = r11.x
            float r2 = r2 + r4
            float r4 = r11.y
            float r1 = r1 + r4
            W0.M r4 = W0.M.f3903r
            W0.M r8 = r7.f3905a
            if (r8 != r4) goto L_0x0104
            float r4 = r5.centerX()
            float r2 = r2 - r4
            float r4 = r5.centerY()
            float r1 = r1 - r4
            float r4 = r5.left
            float r4 = r4 + r2
            int r7 = (r4 > r9 ? 1 : (r4 == r9 ? 0 : -1))
            r8 = 1065772646(0x3f866666, float:1.05)
            if (r7 < 0) goto L_0x0098
            float r7 = r5.right
            float r7 = r7 + r2
            float r10 = (float) r14
            int r10 = (r7 > r10 ? 1 : (r7 == r10 ? 0 : -1))
            if (r10 > 0) goto L_0x0098
            float r10 = r15.left
            int r4 = (r4 > r10 ? 1 : (r4 == r10 ? 0 : -1))
            if (r4 < 0) goto L_0x0098
            float r4 = r15.right
            int r4 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r4 <= 0) goto L_0x00a2
        L_0x0098:
            float r2 = r2 / r8
            float r4 = r11.x
            r7 = 2
            float r10 = (float) r7
            float r7 = r2 / r10
            float r4 = r4 - r7
            r11.x = r4
        L_0x00a2:
            float r4 = r5.top
            float r4 = r4 + r1
            int r7 = (r4 > r9 ? 1 : (r4 == r9 ? 0 : -1))
            if (r7 < 0) goto L_0x00bd
            float r7 = r5.bottom
            float r7 = r7 + r1
            float r10 = (float) r13
            int r10 = (r7 > r10 ? 1 : (r7 == r10 ? 0 : -1))
            if (r10 > 0) goto L_0x00bd
            float r10 = r15.top
            int r4 = (r4 > r10 ? 1 : (r4 == r10 ? 0 : -1))
            if (r4 < 0) goto L_0x00bd
            float r4 = r15.bottom
            int r4 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r4 <= 0) goto L_0x00c7
        L_0x00bd:
            float r1 = r1 / r8
            float r4 = r11.y
            r7 = 2
            float r7 = (float) r7
            float r7 = r1 / r7
            float r4 = r4 - r7
            r11.y = r4
        L_0x00c7:
            r5.offset(r2, r1)
            float r1 = r5.left
            float r2 = r15.left
            float r4 = r2 + r3
            int r4 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r4 >= 0) goto L_0x00d8
            float r2 = r2 - r1
            r5.offset(r2, r9)
        L_0x00d8:
            float r1 = r5.top
            float r2 = r15.top
            float r4 = r2 + r3
            int r4 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r4 >= 0) goto L_0x00e6
            float r2 = r2 - r1
            r5.offset(r9, r2)
        L_0x00e6:
            float r1 = r5.right
            float r2 = r15.right
            float r4 = r2 - r3
            int r4 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r4 <= 0) goto L_0x00f4
            float r2 = r2 - r1
            r5.offset(r2, r9)
        L_0x00f4:
            float r1 = r5.bottom
            float r2 = r15.bottom
            float r3 = r2 - r3
            int r3 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r3 <= 0) goto L_0x02f9
            float r2 = r2 - r1
            r5.offset(r9, r2)
            goto L_0x02f9
        L_0x0104:
            if (r10 == 0) goto L_0x0260
            int r4 = r8.ordinal()
            switch(r4) {
                case 0: goto L_0x0223;
                case 1: goto L_0x01e3;
                case 2: goto L_0x01a4;
                case 3: goto L_0x0162;
                case 4: goto L_0x014f;
                case 5: goto L_0x013c;
                case 6: goto L_0x0127;
                case 7: goto L_0x0113;
                case 8: goto L_0x02f9;
                default: goto L_0x010d;
            }
        L_0x010d:
            G5.w r1 = new G5.w
            r1.<init>()
            throw r1
        L_0x0113:
            r16 = 1
            r17 = 1
            r9 = r7
            r10 = r5
            r11 = r1
            r4 = r12
            r12 = r15
            r14 = r3
            r8 = r15
            r15 = r4
            r9.a(r10, r11, r12, r13, r14, r15, r16, r17)
            W0.N.c(r5, r8, r4)
            goto L_0x02f9
        L_0x0127:
            r4 = r12
            r8 = r15
            r16 = 1
            r17 = 1
            r9 = r7
            r10 = r5
            r11 = r2
            r12 = r8
            r13 = r14
            r14 = r3
            r15 = r4
            r9.d(r10, r11, r12, r13, r14, r15, r16, r17)
            W0.N.f(r5, r8, r4)
            goto L_0x02f9
        L_0x013c:
            r4 = r12
            r8 = r15
            r15 = 1
            r16 = 1
            r9 = r7
            r10 = r5
            r11 = r1
            r12 = r8
            r13 = r3
            r14 = r4
            r9.e(r10, r11, r12, r13, r14, r15, r16)
            W0.N.c(r5, r8, r4)
            goto L_0x02f9
        L_0x014f:
            r4 = r12
            r8 = r15
            r15 = 1
            r16 = 1
            r9 = r7
            r10 = r5
            r11 = r2
            r12 = r8
            r13 = r3
            r14 = r4
            r9.b(r10, r11, r12, r13, r14, r15, r16)
            W0.N.f(r5, r8, r4)
            goto L_0x02f9
        L_0x0162:
            r4 = r12
            r8 = r15
            float r9 = r5.left
            float r10 = r5.top
            float r9 = r2 - r9
            float r10 = r1 - r10
            float r9 = r9 / r10
            int r9 = (r9 > r4 ? 1 : (r9 == r4 ? 0 : -1))
            if (r9 >= 0) goto L_0x018a
            r16 = 0
            r17 = 1
            r9 = r7
            r10 = r5
            r11 = r1
            r12 = r8
            r14 = r3
            r15 = r4
            r9.a(r10, r11, r12, r13, r14, r15, r16, r17)
            float r1 = r5.left
            float r2 = r5.height()
            float r2 = r2 * r4
            float r2 = r2 + r1
            r5.right = r2
            goto L_0x02f9
        L_0x018a:
            r16 = 0
            r17 = 1
            r9 = r7
            r10 = r5
            r11 = r2
            r12 = r8
            r13 = r14
            r14 = r3
            r15 = r4
            r9.d(r10, r11, r12, r13, r14, r15, r16, r17)
            float r1 = r5.top
            float r2 = r5.width()
            float r2 = r2 / r4
            float r2 = r2 + r1
            r5.bottom = r2
            goto L_0x02f9
        L_0x01a4:
            r4 = r12
            r8 = r15
            float r9 = r5.top
            float r10 = r5.right
            float r10 = r10 - r2
            float r9 = r1 - r9
            float r10 = r10 / r9
            int r9 = (r10 > r4 ? 1 : (r10 == r4 ? 0 : -1))
            if (r9 >= 0) goto L_0x01cb
            r16 = 1
            r17 = 0
            r9 = r7
            r10 = r5
            r11 = r1
            r12 = r8
            r14 = r3
            r15 = r4
            r9.a(r10, r11, r12, r13, r14, r15, r16, r17)
            float r1 = r5.right
            float r2 = r5.height()
            float r2 = r2 * r4
            float r1 = r1 - r2
            r5.left = r1
            goto L_0x02f9
        L_0x01cb:
            r15 = 0
            r16 = 1
            r9 = r7
            r10 = r5
            r11 = r2
            r12 = r8
            r13 = r3
            r14 = r4
            r9.b(r10, r11, r12, r13, r14, r15, r16)
            float r1 = r5.top
            float r2 = r5.width()
            float r2 = r2 / r4
            float r2 = r2 + r1
            r5.bottom = r2
            goto L_0x02f9
        L_0x01e3:
            r4 = r12
            r8 = r15
            float r9 = r5.left
            float r10 = r5.bottom
            float r9 = r2 - r9
            float r10 = r10 - r1
            float r9 = r9 / r10
            int r9 = (r9 > r4 ? 1 : (r9 == r4 ? 0 : -1))
            if (r9 >= 0) goto L_0x0209
            r15 = 0
            r16 = 1
            r9 = r7
            r10 = r5
            r11 = r1
            r12 = r8
            r13 = r3
            r14 = r4
            r9.e(r10, r11, r12, r13, r14, r15, r16)
            float r1 = r5.left
            float r2 = r5.height()
            float r2 = r2 * r4
            float r2 = r2 + r1
            r5.right = r2
            goto L_0x02f9
        L_0x0209:
            r16 = 1
            r17 = 0
            r9 = r7
            r10 = r5
            r11 = r2
            r12 = r8
            r13 = r14
            r14 = r3
            r15 = r4
            r9.d(r10, r11, r12, r13, r14, r15, r16, r17)
            float r1 = r5.bottom
            float r2 = r5.width()
            float r2 = r2 / r4
            float r1 = r1 - r2
            r5.top = r1
            goto L_0x02f9
        L_0x0223:
            r4 = r12
            r8 = r15
            float r9 = r5.right
            float r10 = r5.bottom
            float r9 = r9 - r2
            float r10 = r10 - r1
            float r9 = r9 / r10
            int r9 = (r9 > r4 ? 1 : (r9 == r4 ? 0 : -1))
            if (r9 >= 0) goto L_0x0248
            r15 = 1
            r16 = 0
            r9 = r7
            r10 = r5
            r11 = r1
            r12 = r8
            r13 = r3
            r14 = r4
            r9.e(r10, r11, r12, r13, r14, r15, r16)
            float r1 = r5.right
            float r2 = r5.height()
            float r2 = r2 * r4
            float r1 = r1 - r2
            r5.left = r1
            goto L_0x02f9
        L_0x0248:
            r15 = 1
            r16 = 0
            r9 = r7
            r10 = r5
            r11 = r2
            r12 = r8
            r13 = r3
            r14 = r4
            r9.b(r10, r11, r12, r13, r14, r15, r16)
            float r1 = r5.bottom
            float r2 = r5.width()
            float r2 = r2 / r4
            float r1 = r1 - r2
            r5.top = r1
            goto L_0x02f9
        L_0x0260:
            r4 = r15
            int r8 = r8.ordinal()
            switch(r8) {
                case 0: goto L_0x02e9;
                case 1: goto L_0x02d2;
                case 2: goto L_0x02bd;
                case 3: goto L_0x02a9;
                case 4: goto L_0x029b;
                case 5: goto L_0x028d;
                case 6: goto L_0x027d;
                case 7: goto L_0x026e;
                case 8: goto L_0x02f9;
                default: goto L_0x0268;
            }
        L_0x0268:
            G5.w r1 = new G5.w
            r1.<init>()
            throw r1
        L_0x026e:
            r17 = 0
            r15 = 0
            r16 = 0
            r9 = r7
            r10 = r5
            r11 = r1
            r12 = r4
            r14 = r3
            r9.a(r10, r11, r12, r13, r14, r15, r16, r17)
            goto L_0x02f9
        L_0x027d:
            r17 = 0
            r15 = 0
            r16 = 0
            r9 = r7
            r10 = r5
            r11 = r2
            r12 = r4
            r13 = r14
            r14 = r3
            r9.d(r10, r11, r12, r13, r14, r15, r16, r17)
            goto L_0x02f9
        L_0x028d:
            r16 = 0
            r14 = 0
            r15 = 0
            r9 = r7
            r10 = r5
            r11 = r1
            r12 = r4
            r13 = r3
            r9.e(r10, r11, r12, r13, r14, r15, r16)
            goto L_0x02f9
        L_0x029b:
            r16 = 0
            r14 = 0
            r15 = 0
            r9 = r7
            r10 = r5
            r11 = r2
            r12 = r4
            r13 = r3
            r9.b(r10, r11, r12, r13, r14, r15, r16)
            goto L_0x02f9
        L_0x02a9:
            r17 = 0
            r15 = 0
            r16 = 0
            r9 = r7
            r10 = r5
            r11 = r1
            r12 = r4
            r8 = r14
            r14 = r3
            r9.a(r10, r11, r12, r13, r14, r15, r16, r17)
            r11 = r2
            r13 = r8
            r9.d(r10, r11, r12, r13, r14, r15, r16, r17)
            goto L_0x02f9
        L_0x02bd:
            r17 = 0
            r15 = 0
            r16 = 0
            r9 = r7
            r10 = r5
            r11 = r1
            r12 = r4
            r14 = r3
            r9.a(r10, r11, r12, r13, r14, r15, r16, r17)
            r14 = 0
            r15 = 0
            r11 = r2
            r13 = r3
            r9.b(r10, r11, r12, r13, r14, r15, r16)
            goto L_0x02f9
        L_0x02d2:
            r8 = r14
            r16 = 0
            r14 = 0
            r15 = 0
            r9 = r7
            r10 = r5
            r11 = r1
            r12 = r4
            r13 = r3
            r9.e(r10, r11, r12, r13, r14, r15, r16)
            r17 = 0
            r15 = 0
            r11 = r2
            r13 = r8
            r14 = r3
            r9.d(r10, r11, r12, r13, r14, r15, r16, r17)
            goto L_0x02f9
        L_0x02e9:
            r16 = 0
            r14 = 0
            r15 = 0
            r9 = r7
            r10 = r5
            r11 = r1
            r12 = r4
            r13 = r3
            r9.e(r10, r11, r12, r13, r14, r15, r16)
            r11 = r2
            r9.b(r10, r11, r12, r13, r14, r15, r16)
        L_0x02f9:
            r6.e(r5)
            W0.I r1 = r0.f5918q
            if (r1 == 0) goto L_0x0307
            com.canhub.cropper.CropImageView r1 = (com.canhub.cropper.CropImageView) r1
            r2 = 1
            r1.c(r2, r2)
            goto L_0x0308
        L_0x0307:
            r2 = 1
        L_0x0308:
            r18.invalidate()
            goto L_0x030d
        L_0x030c:
            r2 = r4
        L_0x030d:
            android.view.ViewParent r1 = r18.getParent()
            r1.requestDisallowInterceptTouchEvent(r2)
        L_0x0314:
            r3 = 1
            goto L_0x04f8
        L_0x0317:
            android.view.ViewParent r1 = r18.getParent()
            r1.requestDisallowInterceptTouchEvent(r3)
            W0.N r1 = r0.f5897H
            if (r1 == 0) goto L_0x0314
            r0.f5897H = r5
            W0.I r1 = r0.f5918q
            if (r1 == 0) goto L_0x032e
            com.canhub.cropper.CropImageView r1 = (com.canhub.cropper.CropImageView) r1
            r2 = 1
            r1.c(r3, r2)
        L_0x032e:
            r18.invalidate()
            goto L_0x0314
        L_0x0332:
            float r2 = r19.getX()
            float r1 = r19.getY()
            float r4 = r0.F
            W0.z r8 = r0.f5903N
            kotlin.jvm.internal.j.b(r8)
            boolean r13 = r0.f5916f
            r6.getClass()
            int r8 = r8.ordinal()
            android.graphics.RectF r14 = r6.f3887a
            if (r8 == 0) goto L_0x03e2
            r15 = 1
            if (r8 == r15) goto L_0x03dc
            r3 = 2
            if (r8 == r3) goto L_0x039c
            if (r8 != r7) goto L_0x0396
            float r3 = r14.left
            float r7 = r14.centerY()
            float r3 = W0.L.a(r2, r1, r3, r7)
            int r3 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r3 > 0) goto L_0x0368
            W0.M r3 = W0.M.f3899e
            goto L_0x04e9
        L_0x0368:
            float r3 = r14.right
            float r7 = r14.centerY()
            float r3 = W0.L.a(r2, r1, r3, r7)
            int r3 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r3 > 0) goto L_0x037a
            W0.M r3 = W0.M.f3901p
            goto L_0x04e9
        L_0x037a:
            if (r13 == 0) goto L_0x0390
            float r9 = r14.left
            float r10 = r14.top
            float r11 = r14.right
            float r12 = r14.bottom
            r7 = r2
            r8 = r1
            boolean r3 = W0.L.d(r7, r8, r9, r10, r11, r12)
            if (r3 == 0) goto L_0x0390
            W0.M r3 = W0.M.f3903r
            goto L_0x04e9
        L_0x0390:
            W0.M r3 = r6.b(r2, r1, r13)
            goto L_0x04e9
        L_0x0396:
            G5.w r1 = new G5.w
            r1.<init>()
            throw r1
        L_0x039c:
            float r3 = r14.centerX()
            float r7 = r14.top
            float r3 = W0.L.a(r2, r1, r3, r7)
            int r3 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r3 > 0) goto L_0x03ae
            W0.M r3 = W0.M.f3900f
            goto L_0x04e9
        L_0x03ae:
            float r3 = r14.centerX()
            float r7 = r14.bottom
            float r3 = W0.L.a(r2, r1, r3, r7)
            int r3 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r3 > 0) goto L_0x03c0
            W0.M r3 = W0.M.f3902q
            goto L_0x04e9
        L_0x03c0:
            if (r13 == 0) goto L_0x03d6
            float r9 = r14.left
            float r10 = r14.top
            float r11 = r14.right
            float r12 = r14.bottom
            r7 = r2
            r8 = r1
            boolean r3 = W0.L.d(r7, r8, r9, r10, r11, r12)
            if (r3 == 0) goto L_0x03d6
            W0.M r3 = W0.M.f3903r
            goto L_0x04e9
        L_0x03d6:
            W0.M r3 = r6.b(r2, r1, r13)
            goto L_0x04e9
        L_0x03dc:
            W0.M r3 = r6.b(r2, r1, r13)
            goto L_0x04e9
        L_0x03e2:
            r15 = 1
            float r7 = r14.left
            float r8 = r14.top
            float r7 = W0.L.a(r2, r1, r7, r8)
            int r7 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r7 > 0) goto L_0x03f3
            W0.M r3 = W0.M.f3896a
            goto L_0x04e9
        L_0x03f3:
            float r7 = r14.right
            float r8 = r14.top
            float r7 = W0.L.a(r2, r1, r7, r8)
            int r7 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r7 > 0) goto L_0x0403
            W0.M r3 = W0.M.f3897b
            goto L_0x04e9
        L_0x0403:
            float r7 = r14.left
            float r8 = r14.bottom
            float r7 = W0.L.a(r2, r1, r7, r8)
            int r7 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r7 > 0) goto L_0x0413
            W0.M r3 = W0.M.f3898c
            goto L_0x04e9
        L_0x0413:
            float r7 = r14.right
            float r8 = r14.bottom
            float r7 = W0.L.a(r2, r1, r7, r8)
            int r7 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r7 > 0) goto L_0x0423
            W0.M r3 = W0.M.d
            goto L_0x04e9
        L_0x0423:
            r16 = 1120403456(0x42c80000, float:100.0)
            if (r13 == 0) goto L_0x0450
            float r9 = r14.left
            float r10 = r14.top
            float r11 = r14.right
            float r12 = r14.bottom
            r7 = r2
            r8 = r1
            boolean r7 = W0.L.d(r7, r8, r9, r10, r11, r12)
            if (r7 == 0) goto L_0x0450
            float r7 = r14.width()
            int r7 = (r7 > r16 ? 1 : (r7 == r16 ? 0 : -1))
            if (r7 < 0) goto L_0x0449
            float r7 = r14.height()
            int r7 = (r7 > r16 ? 1 : (r7 == r16 ? 0 : -1))
            if (r7 < 0) goto L_0x0449
            r7 = r15
            goto L_0x044a
        L_0x0449:
            r7 = r3
        L_0x044a:
            if (r7 != 0) goto L_0x0450
            W0.M r3 = W0.M.f3903r
            goto L_0x04e9
        L_0x0450:
            float r7 = r14.left
            float r8 = r14.right
            float r9 = r14.top
            int r7 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
            if (r7 <= 0) goto L_0x046c
            int r7 = (r2 > r8 ? 1 : (r2 == r8 ? 0 : -1))
            if (r7 >= 0) goto L_0x046c
            float r7 = r1 - r9
            float r7 = java.lang.Math.abs(r7)
            int r7 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r7 > 0) goto L_0x046c
            W0.M r3 = W0.M.f3900f
            goto L_0x04e9
        L_0x046c:
            float r7 = r14.left
            float r8 = r14.right
            float r9 = r14.bottom
            int r7 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
            if (r7 <= 0) goto L_0x0487
            int r7 = (r2 > r8 ? 1 : (r2 == r8 ? 0 : -1))
            if (r7 >= 0) goto L_0x0487
            float r7 = r1 - r9
            float r7 = java.lang.Math.abs(r7)
            int r7 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r7 > 0) goto L_0x0487
            W0.M r3 = W0.M.f3902q
            goto L_0x04e9
        L_0x0487:
            float r7 = r14.left
            float r8 = r14.top
            float r9 = r14.bottom
            float r7 = r2 - r7
            float r7 = java.lang.Math.abs(r7)
            int r7 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r7 > 0) goto L_0x04a2
            int r7 = (r1 > r8 ? 1 : (r1 == r8 ? 0 : -1))
            if (r7 <= 0) goto L_0x04a2
            int r7 = (r1 > r9 ? 1 : (r1 == r9 ? 0 : -1))
            if (r7 >= 0) goto L_0x04a2
            W0.M r3 = W0.M.f3899e
            goto L_0x04e9
        L_0x04a2:
            float r7 = r14.right
            float r8 = r14.top
            float r9 = r14.bottom
            float r7 = r2 - r7
            float r7 = java.lang.Math.abs(r7)
            int r4 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r4 > 0) goto L_0x04bd
            int r4 = (r1 > r8 ? 1 : (r1 == r8 ? 0 : -1))
            if (r4 <= 0) goto L_0x04bd
            int r4 = (r1 > r9 ? 1 : (r1 == r9 ? 0 : -1))
            if (r4 >= 0) goto L_0x04bd
            W0.M r3 = W0.M.f3901p
            goto L_0x04e9
        L_0x04bd:
            if (r13 == 0) goto L_0x04e5
            float r9 = r14.left
            float r10 = r14.top
            float r11 = r14.right
            float r12 = r14.bottom
            r7 = r2
            r8 = r1
            boolean r4 = W0.L.d(r7, r8, r9, r10, r11, r12)
            if (r4 == 0) goto L_0x04e5
            float r4 = r14.width()
            int r4 = (r4 > r16 ? 1 : (r4 == r16 ? 0 : -1))
            if (r4 < 0) goto L_0x04e0
            float r4 = r14.height()
            int r4 = (r4 > r16 ? 1 : (r4 == r16 ? 0 : -1))
            if (r4 < 0) goto L_0x04e0
            r3 = r15
        L_0x04e0:
            if (r3 == 0) goto L_0x04e5
            W0.M r3 = W0.M.f3903r
            goto L_0x04e9
        L_0x04e5:
            W0.M r3 = r6.b(r2, r1, r13)
        L_0x04e9:
            if (r3 == 0) goto L_0x04f0
            W0.N r5 = new W0.N
            r5.<init>(r3, r6, r2, r1)
        L_0x04f0:
            r0.f5897H = r5
            if (r5 == 0) goto L_0x04f7
            r18.invalidate()
        L_0x04f7:
            r3 = r15
        L_0x04f8:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.canhub.cropper.CropOverlayView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public final void setAspectRatioX(int i2) {
        if (i2 <= 0) {
            throw new IllegalArgumentException("Cannot set aspect ratio value to a number less than or equal to 0.");
        } else if (this.f5899J != i2) {
            this.f5899J = i2;
            this.f5901L = ((float) i2) / ((float) this.f5900K);
            if (this.f5910U) {
                f();
                invalidate();
            }
        }
    }

    public final void setAspectRatioY(int i2) {
        if (i2 <= 0) {
            throw new IllegalArgumentException("Cannot set aspect ratio value to a number less than or equal to 0.");
        } else if (this.f5900K != i2) {
            this.f5900K = i2;
            this.f5901L = ((float) this.f5899J) / ((float) i2);
            if (this.f5910U) {
                f();
                invalidate();
            }
        }
    }

    public final void setCropCornerRadius(float f6) {
        this.f5912a = f6;
    }

    public final void setCropCornerShape(x xVar) {
        j.e(xVar, "cropCornerShape");
        if (this.f5904O != xVar) {
            this.f5904O = xVar;
            invalidate();
        }
    }

    public final void setCropLabelText(String str) {
        if (str != null) {
            this.f5906Q = str;
        }
    }

    public final void setCropLabelTextColor(int i2) {
        this.f5908S = i2;
        invalidate();
    }

    public final void setCropLabelTextSize(float f6) {
        this.f5907R = f6;
        invalidate();
    }

    public final void setCropShape(z zVar) {
        j.e(zVar, "cropShape");
        if (this.f5903N != zVar) {
            this.f5903N = zVar;
            invalidate();
        }
    }

    public final void setCropWindowChangeListener(I i2) {
        this.f5918q = i2;
    }

    public final void setCropWindowRect(RectF rectF) {
        j.e(rectF, "rect");
        this.f5917p.e(rectF);
    }

    public final void setCropperTextLabelVisibility(boolean z3) {
        this.f5905P = z3;
        invalidate();
    }

    public final void setFixedAspectRatio(boolean z3) {
        if (this.f5898I != z3) {
            this.f5898I = z3;
            if (this.f5910U) {
                f();
                invalidate();
            }
        }
    }

    public final void setGuidelines(A a6) {
        j.e(a6, "guidelines");
        if (this.f5902M != a6) {
            this.f5902M = a6;
            if (this.f5910U) {
                invalidate();
            }
        }
    }

    public final void setInitialAttributeValues(w wVar) {
        boolean z3;
        I i2;
        j.e(wVar, "options");
        boolean a6 = j.a(this.f5914c, wVar);
        w wVar2 = this.f5914c;
        int i5 = wVar.f3987E;
        int i6 = wVar.f3986D;
        if (wVar2 != null && wVar.f3985C == wVar2.f3985C && i6 == wVar2.f3986D && i5 == wVar2.f3987E) {
            z3 = false;
        } else {
            z3 = true;
        }
        this.f5914c = wVar;
        float f6 = (float) wVar.f3999R;
        L l6 = this.f5917p;
        l6.g = f6;
        float f7 = (float) wVar.f4000S;
        l6.h = f7;
        float f8 = (float) wVar.f4001T;
        l6.f3892i = f8;
        float f9 = (float) wVar.f4002U;
        l6.f3893j = f9;
        if (!a6) {
            l6.f3889c = (float) wVar.f3997P;
            l6.d = (float) wVar.f3998Q;
            l6.g = f6;
            l6.h = f7;
            l6.f3892i = f8;
            l6.f3893j = f9;
            int i7 = wVar.f4038u0;
            this.f5908S = i7;
            float f10 = wVar.f4036t0;
            this.f5907R = f10;
            String str = wVar.f4040v0;
            if (str == null) {
                str = "";
            }
            this.f5906Q = str;
            this.f5905P = wVar.f4035t;
            this.f5912a = wVar.f4015e;
            this.f5904O = wVar.d;
            this.f5903N = wVar.f4012c;
            this.f5896G = wVar.f4017f;
            setEnabled(wVar.f4047z);
            this.f5902M = wVar.f4030q;
            this.f5898I = wVar.f3985C;
            setAspectRatioX(i6);
            setAspectRatioY(i5);
            boolean z4 = wVar.f4043x;
            this.f5915e = z4;
            if (z4 && this.d == null) {
                this.d = new ScaleGestureDetector(getContext(), new J(this));
            }
            this.f5916f = wVar.f4045y;
            this.F = wVar.f4028p;
            this.f5895E = wVar.f3984B;
            this.f5920s = e.D(wVar.f3988G, wVar.F);
            this.f5893C = wVar.f3990I;
            this.f5894D = wVar.f3991J;
            this.f5913b = Integer.valueOf(wVar.f3993L);
            this.f5921t = e.D(wVar.f3992K, wVar.f3989H);
            this.f5922u = e.D(wVar.f3995N, wVar.f3994M);
            Paint paint = new Paint();
            paint.setColor(wVar.f3996O);
            this.f5923v = paint;
            Paint paint2 = new Paint();
            paint2.setStrokeWidth(1.0f);
            paint2.setTextSize(f10);
            paint2.setStyle(Paint.Style.FILL);
            paint2.setTextAlign(Paint.Align.CENTER);
            paint2.setColor(i7);
            this.f5924w = paint2;
            if (z3) {
                f();
            }
            invalidate();
            if (z3 && (i2 = this.f5918q) != null) {
                ((CropImageView) i2).c(false, true);
            }
        }
    }

    public final void setInitialCropWindowRect(Rect rect) {
        if (rect == null) {
            rect = C0239k.f3959a;
        }
        this.f5909T.set(rect);
        if (this.f5910U) {
            f();
            invalidate();
            I i2 = this.f5918q;
            if (i2 != null) {
                ((CropImageView) i2).c(false, true);
            }
        }
    }

    public final void setSnapRadius(float f6) {
        this.f5896G = f6;
    }
}
