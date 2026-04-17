package r0;

import a0.C0254a;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.view.animation.LinearInterpolator;
import o3.d;

/* renamed from: r0.e  reason: case insensitive filesystem */
public final class C0944e extends Drawable implements Animatable {

    /* renamed from: p  reason: collision with root package name */
    public static final LinearInterpolator f11151p = new LinearInterpolator();

    /* renamed from: q  reason: collision with root package name */
    public static final C0254a f11152q = new C0254a(1);

    /* renamed from: r  reason: collision with root package name */
    public static final int[] f11153r = {-16777216};

    /* renamed from: a  reason: collision with root package name */
    public final C0943d f11154a;

    /* renamed from: b  reason: collision with root package name */
    public float f11155b;

    /* renamed from: c  reason: collision with root package name */
    public final Resources f11156c;
    public final ValueAnimator d;

    /* renamed from: e  reason: collision with root package name */
    public float f11157e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f11158f;

    public C0944e(Context context) {
        context.getClass();
        this.f11156c = context.getResources();
        C0943d dVar = new C0943d();
        this.f11154a = dVar;
        dVar.f11138i = f11153r;
        dVar.a(0);
        dVar.h = 2.5f;
        dVar.f11134b.setStrokeWidth(2.5f);
        invalidateSelf();
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
        ofFloat.addUpdateListener(new C0941b(this, dVar));
        ofFloat.setRepeatCount(-1);
        ofFloat.setRepeatMode(1);
        ofFloat.setInterpolator(f11151p);
        ofFloat.addListener(new C0942c(this, dVar));
        this.d = ofFloat;
    }

    public static void d(float f6, C0943d dVar) {
        if (f6 > 0.75f) {
            float f7 = (f6 - 0.75f) / 0.25f;
            int[] iArr = dVar.f11138i;
            int i2 = dVar.f11139j;
            int i5 = iArr[i2];
            int i6 = iArr[(i2 + 1) % iArr.length];
            int i7 = (i5 >> 24) & 255;
            int i8 = (i5 >> 16) & 255;
            int i9 = (i5 >> 8) & 255;
            int i10 = i5 & 255;
            dVar.f11150u = ((i7 + ((int) (((float) (((i6 >> 24) & 255) - i7)) * f7))) << 24) | ((i8 + ((int) (((float) (((i6 >> 16) & 255) - i8)) * f7))) << 16) | ((i9 + ((int) (((float) (((i6 >> 8) & 255) - i9)) * f7))) << 8) | (i10 + ((int) (f7 * ((float) ((i6 & 255) - i10)))));
            return;
        }
        dVar.f11150u = dVar.f11138i[dVar.f11139j];
    }

    public final void a(float f6, C0943d dVar, boolean z3) {
        float f7;
        float f8;
        if (this.f11158f) {
            d(f6, dVar);
            float floor = (float) (Math.floor((double) (dVar.f11142m / 0.8f)) + 1.0d);
            float f9 = dVar.f11140k;
            float f10 = dVar.f11141l;
            dVar.f11136e = (((f10 - 0.01f) - f9) * f6) + f9;
            dVar.f11137f = f10;
            float f11 = dVar.f11142m;
            dVar.g = d.a(floor, f11, f6, f11);
        } else if (f6 != 1.0f || z3) {
            float f12 = dVar.f11142m;
            int i2 = (f6 > 0.5f ? 1 : (f6 == 0.5f ? 0 : -1));
            C0254a aVar = f11152q;
            if (i2 < 0) {
                f7 = dVar.f11140k;
                f8 = (aVar.getInterpolation(f6 / 0.5f) * 0.79f) + 0.01f + f7;
            } else {
                float f13 = dVar.f11140k + 0.79f;
                float f14 = f13;
                f7 = f13 - (((1.0f - aVar.getInterpolation((f6 - 0.5f) / 0.5f)) * 0.79f) + 0.01f);
                f8 = f14;
            }
            dVar.f11136e = f7;
            dVar.f11137f = f8;
            dVar.g = (0.20999998f * f6) + f12;
            this.f11155b = (f6 + this.f11157e) * 216.0f;
        }
    }

    public final void b(float f6, float f7, float f8, float f9) {
        float f10 = this.f11156c.getDisplayMetrics().density;
        float f11 = f7 * f10;
        C0943d dVar = this.f11154a;
        dVar.h = f11;
        dVar.f11134b.setStrokeWidth(f11);
        dVar.f11146q = f6 * f10;
        dVar.a(0);
        dVar.f11147r = (int) (f8 * f10);
        dVar.f11148s = (int) (f9 * f10);
    }

    public final void c(int i2) {
        if (i2 == 0) {
            b(11.0f, 3.0f, 12.0f, 6.0f);
        } else {
            b(7.5f, 2.5f, 10.0f, 5.0f);
        }
        invalidateSelf();
    }

    public final void draw(Canvas canvas) {
        Rect bounds = getBounds();
        canvas.save();
        canvas.rotate(this.f11155b, bounds.exactCenterX(), bounds.exactCenterY());
        C0943d dVar = this.f11154a;
        RectF rectF = dVar.f11133a;
        float f6 = dVar.f11146q;
        float f7 = (dVar.h / 2.0f) + f6;
        if (f6 <= 0.0f) {
            f7 = (((float) Math.min(bounds.width(), bounds.height())) / 2.0f) - Math.max((((float) dVar.f11147r) * dVar.f11145p) / 2.0f, dVar.h / 2.0f);
        }
        rectF.set(((float) bounds.centerX()) - f7, ((float) bounds.centerY()) - f7, ((float) bounds.centerX()) + f7, ((float) bounds.centerY()) + f7);
        float f8 = dVar.f11136e;
        float f9 = dVar.g;
        float f10 = (f8 + f9) * 360.0f;
        float f11 = ((dVar.f11137f + f9) * 360.0f) - f10;
        Paint paint = dVar.f11134b;
        paint.setColor(dVar.f11150u);
        paint.setAlpha(dVar.f11149t);
        float f12 = dVar.h / 2.0f;
        rectF.inset(f12, f12);
        canvas.drawCircle(rectF.centerX(), rectF.centerY(), rectF.width() / 2.0f, dVar.d);
        float f13 = -f12;
        rectF.inset(f13, f13);
        canvas.drawArc(rectF, f10, f11, false, paint);
        if (dVar.f11143n) {
            Path path = dVar.f11144o;
            if (path == null) {
                Path path2 = new Path();
                dVar.f11144o = path2;
                path2.setFillType(Path.FillType.EVEN_ODD);
            } else {
                path.reset();
            }
            dVar.f11144o.moveTo(0.0f, 0.0f);
            dVar.f11144o.lineTo(((float) dVar.f11147r) * dVar.f11145p, 0.0f);
            Path path3 = dVar.f11144o;
            float f14 = dVar.f11145p;
            path3.lineTo((((float) dVar.f11147r) * f14) / 2.0f, ((float) dVar.f11148s) * f14);
            dVar.f11144o.offset((rectF.centerX() + (Math.min(rectF.width(), rectF.height()) / 2.0f)) - ((((float) dVar.f11147r) * dVar.f11145p) / 2.0f), (dVar.h / 2.0f) + rectF.centerY());
            dVar.f11144o.close();
            Paint paint2 = dVar.f11135c;
            paint2.setColor(dVar.f11150u);
            paint2.setAlpha(dVar.f11149t);
            canvas.save();
            canvas.rotate(f10 + f11, rectF.centerX(), rectF.centerY());
            canvas.drawPath(dVar.f11144o, paint2);
            canvas.restore();
        }
        canvas.restore();
    }

    public final int getAlpha() {
        return this.f11154a.f11149t;
    }

    public final int getOpacity() {
        return -3;
    }

    public final boolean isRunning() {
        return this.d.isRunning();
    }

    public final void setAlpha(int i2) {
        this.f11154a.f11149t = i2;
        invalidateSelf();
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        this.f11154a.f11134b.setColorFilter(colorFilter);
        invalidateSelf();
    }

    public final void start() {
        this.d.cancel();
        C0943d dVar = this.f11154a;
        float f6 = dVar.f11136e;
        dVar.f11140k = f6;
        float f7 = dVar.f11137f;
        dVar.f11141l = f7;
        dVar.f11142m = dVar.g;
        if (f7 != f6) {
            this.f11158f = true;
            this.d.setDuration(666);
            this.d.start();
            return;
        }
        dVar.a(0);
        dVar.f11140k = 0.0f;
        dVar.f11141l = 0.0f;
        dVar.f11142m = 0.0f;
        dVar.f11136e = 0.0f;
        dVar.f11137f = 0.0f;
        dVar.g = 0.0f;
        this.d.setDuration(1332);
        this.d.start();
    }

    public final void stop() {
        this.d.cancel();
        this.f11155b = 0.0f;
        C0943d dVar = this.f11154a;
        if (dVar.f11143n) {
            dVar.f11143n = false;
        }
        dVar.a(0);
        dVar.f11140k = 0.0f;
        dVar.f11141l = 0.0f;
        dVar.f11142m = 0.0f;
        dVar.f11136e = 0.0f;
        dVar.f11137f = 0.0f;
        dVar.g = 0.0f;
        invalidateSelf();
    }
}
