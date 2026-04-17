package s2;

import C.d;
import K1.e;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Looper;
import android.util.AttributeSet;
import android.util.Log;
import j4.p0;
import java.util.BitSet;
import java.util.Objects;
import k2.C0759a;
import k2.C0760b;
import l2.C0781a;
import r2.C0949a;

public class g extends Drawable implements v {
    public static final Paint F;

    /* renamed from: A  reason: collision with root package name */
    public final m f11454A;

    /* renamed from: B  reason: collision with root package name */
    public PorterDuffColorFilter f11455B;

    /* renamed from: C  reason: collision with root package name */
    public PorterDuffColorFilter f11456C;

    /* renamed from: D  reason: collision with root package name */
    public final RectF f11457D;

    /* renamed from: E  reason: collision with root package name */
    public final boolean f11458E;

    /* renamed from: a  reason: collision with root package name */
    public f f11459a;

    /* renamed from: b  reason: collision with root package name */
    public final t[] f11460b;

    /* renamed from: c  reason: collision with root package name */
    public final t[] f11461c;
    public final BitSet d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f11462e;

    /* renamed from: f  reason: collision with root package name */
    public final Matrix f11463f;

    /* renamed from: p  reason: collision with root package name */
    public final Path f11464p;

    /* renamed from: q  reason: collision with root package name */
    public final Path f11465q;

    /* renamed from: r  reason: collision with root package name */
    public final RectF f11466r;

    /* renamed from: s  reason: collision with root package name */
    public final RectF f11467s;

    /* renamed from: t  reason: collision with root package name */
    public final Region f11468t;

    /* renamed from: u  reason: collision with root package name */
    public final Region f11469u;

    /* renamed from: v  reason: collision with root package name */
    public k f11470v;

    /* renamed from: w  reason: collision with root package name */
    public final Paint f11471w;

    /* renamed from: x  reason: collision with root package name */
    public final Paint f11472x;

    /* renamed from: y  reason: collision with root package name */
    public final C0949a f11473y;

    /* renamed from: z  reason: collision with root package name */
    public final p0 f11474z;

    static {
        Paint paint = new Paint(1);
        F = paint;
        paint.setColor(-1);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
    }

    public g() {
        this(new k());
    }

    public final void a(RectF rectF, Path path) {
        f fVar = this.f11459a;
        this.f11454A.a(fVar.f11441a, fVar.f11446i, rectF, this.f11474z, path);
        if (this.f11459a.h != 1.0f) {
            Matrix matrix = this.f11463f;
            matrix.reset();
            float f6 = this.f11459a.h;
            matrix.setScale(f6, f6, rectF.width() / 2.0f, rectF.height() / 2.0f);
            path.transform(matrix);
        }
        path.computeBounds(this.f11457D, true);
    }

    public final int b(int i2) {
        float f6;
        int i5;
        f fVar = this.f11459a;
        float f7 = fVar.f11450m + 0.0f + fVar.f11449l;
        C0781a aVar = fVar.f11442b;
        if (aVar == null || !aVar.f9665a || d.d(i2, 255) != aVar.d) {
            return i2;
        }
        float f8 = aVar.f9668e;
        if (f8 <= 0.0f || f7 <= 0.0f) {
            f6 = 0.0f;
        } else {
            f6 = Math.min(((((float) Math.log1p((double) (f7 / f8))) * 4.5f) + 2.0f) / 100.0f, 1.0f);
        }
        int alpha = Color.alpha(i2);
        int h02 = e.h0(d.d(i2, 255), aVar.f9666b, f6);
        if (f6 > 0.0f && (i5 = aVar.f9667c) != 0) {
            h02 = d.b(d.d(i5, C0781a.f9664f), h02);
        }
        return d.d(h02, alpha);
    }

    public final void c(Canvas canvas) {
        if (this.d.cardinality() > 0) {
            Log.w("g", "Compatibility shadow requested but can't be drawn for all operations in this shape.");
        }
        int i2 = this.f11459a.f11452o;
        Path path = this.f11464p;
        C0949a aVar = this.f11473y;
        if (i2 != 0) {
            canvas.drawPath(path, aVar.f11198a);
        }
        for (int i5 = 0; i5 < 4; i5++) {
            t tVar = this.f11460b[i5];
            int i6 = this.f11459a.f11451n;
            Matrix matrix = t.f11515b;
            tVar.a(matrix, aVar, i6, canvas);
            this.f11461c[i5].a(matrix, aVar, this.f11459a.f11451n, canvas);
        }
        if (this.f11458E) {
            double d6 = (double) 0;
            int sin = (int) (Math.sin(Math.toRadians(d6)) * ((double) this.f11459a.f11452o));
            int cos = (int) (Math.cos(Math.toRadians(d6)) * ((double) this.f11459a.f11452o));
            canvas.translate((float) (-sin), (float) (-cos));
            canvas.drawPath(path, F);
            canvas.translate((float) sin, (float) cos);
        }
    }

    public final void d(Canvas canvas, Paint paint, Path path, k kVar, RectF rectF) {
        if (kVar.d(rectF)) {
            float a6 = kVar.f11489f.a(rectF) * this.f11459a.f11446i;
            canvas.drawRoundRect(rectF, a6, a6, paint);
            return;
        }
        canvas.drawPath(path, paint);
    }

    public void draw(Canvas canvas) {
        float f6;
        Canvas canvas2 = canvas;
        Paint paint = this.f11471w;
        paint.setColorFilter(this.f11455B);
        int alpha = paint.getAlpha();
        int i2 = this.f11459a.f11448k;
        paint.setAlpha(((i2 + (i2 >>> 7)) * alpha) >>> 8);
        Paint paint2 = this.f11472x;
        paint2.setColorFilter(this.f11456C);
        paint2.setStrokeWidth(this.f11459a.f11447j);
        int alpha2 = paint2.getAlpha();
        int i5 = this.f11459a.f11448k;
        paint2.setAlpha(((i5 + (i5 >>> 7)) * alpha2) >>> 8);
        boolean z3 = this.f11462e;
        Path path = this.f11464p;
        if (z3) {
            float f7 = 0.0f;
            if (g()) {
                f6 = paint2.getStrokeWidth() / 2.0f;
            } else {
                f6 = 0.0f;
            }
            float f8 = -f6;
            k kVar = this.f11459a.f11441a;
            j e6 = kVar.e();
            c cVar = kVar.f11488e;
            if (!(cVar instanceof h)) {
                cVar = new b(f8, cVar);
            }
            e6.f11479e = cVar;
            c cVar2 = kVar.f11489f;
            if (!(cVar2 instanceof h)) {
                cVar2 = new b(f8, cVar2);
            }
            e6.f11480f = cVar2;
            c cVar3 = kVar.h;
            if (!(cVar3 instanceof h)) {
                cVar3 = new b(f8, cVar3);
            }
            e6.h = cVar3;
            c cVar4 = kVar.g;
            if (!(cVar4 instanceof h)) {
                cVar4 = new b(f8, cVar4);
            }
            e6.g = cVar4;
            k a6 = e6.a();
            this.f11470v = a6;
            float f9 = this.f11459a.f11446i;
            RectF rectF = this.f11467s;
            rectF.set(f());
            if (g()) {
                f7 = paint2.getStrokeWidth() / 2.0f;
            }
            rectF.inset(f7, f7);
            this.f11454A.a(a6, f9, rectF, (p0) null, this.f11465q);
            a(f(), path);
            this.f11462e = false;
        }
        f fVar = this.f11459a;
        fVar.getClass();
        if (fVar.f11451n > 0) {
            int i6 = Build.VERSION.SDK_INT;
            if (!this.f11459a.f11441a.d(f()) && !path.isConvex() && i6 < 29) {
                canvas.save();
                double d6 = (double) 0;
                canvas2.translate((float) ((int) (Math.sin(Math.toRadians(d6)) * ((double) this.f11459a.f11452o))), (float) ((int) (Math.cos(Math.toRadians(d6)) * ((double) this.f11459a.f11452o))));
                if (!this.f11458E) {
                    c(canvas);
                    canvas.restore();
                } else {
                    RectF rectF2 = this.f11457D;
                    int width = (int) (rectF2.width() - ((float) getBounds().width()));
                    int height = (int) (rectF2.height() - ((float) getBounds().height()));
                    if (width < 0 || height < 0) {
                        throw new IllegalStateException("Invalid shadow bounds. Check that the treatments result in a valid path.");
                    }
                    Bitmap createBitmap = Bitmap.createBitmap((this.f11459a.f11451n * 2) + ((int) rectF2.width()) + width, (this.f11459a.f11451n * 2) + ((int) rectF2.height()) + height, Bitmap.Config.ARGB_8888);
                    Canvas canvas3 = new Canvas(createBitmap);
                    float f10 = (float) ((getBounds().left - this.f11459a.f11451n) - width);
                    float f11 = (float) ((getBounds().top - this.f11459a.f11451n) - height);
                    canvas3.translate(-f10, -f11);
                    c(canvas3);
                    canvas2.drawBitmap(createBitmap, f10, f11, (Paint) null);
                    createBitmap.recycle();
                    canvas.restore();
                }
            }
        }
        f fVar2 = this.f11459a;
        Paint.Style style = fVar2.f11453p;
        if (style == Paint.Style.FILL_AND_STROKE || style == Paint.Style.FILL) {
            d(canvas, paint, path, fVar2.f11441a, f());
        }
        if (g()) {
            e(canvas);
        }
        paint.setAlpha(alpha);
        paint2.setAlpha(alpha2);
    }

    public void e(Canvas canvas) {
        float f6;
        Paint paint = this.f11472x;
        Path path = this.f11465q;
        k kVar = this.f11470v;
        RectF rectF = this.f11467s;
        rectF.set(f());
        if (g()) {
            f6 = paint.getStrokeWidth() / 2.0f;
        } else {
            f6 = 0.0f;
        }
        rectF.inset(f6, f6);
        d(canvas, paint, path, kVar, rectF);
    }

    public final RectF f() {
        RectF rectF = this.f11466r;
        rectF.set(getBounds());
        return rectF;
    }

    public final boolean g() {
        Paint.Style style = this.f11459a.f11453p;
        if ((style == Paint.Style.FILL_AND_STROKE || style == Paint.Style.STROKE) && this.f11472x.getStrokeWidth() > 0.0f) {
            return true;
        }
        return false;
    }

    public int getAlpha() {
        return this.f11459a.f11448k;
    }

    public final Drawable.ConstantState getConstantState() {
        return this.f11459a;
    }

    public int getOpacity() {
        return -3;
    }

    public void getOutline(Outline outline) {
        this.f11459a.getClass();
        if (this.f11459a.f11441a.d(f())) {
            outline.setRoundRect(getBounds(), this.f11459a.f11441a.f11488e.a(f()) * this.f11459a.f11446i);
            return;
        }
        RectF f6 = f();
        Path path = this.f11464p;
        a(f6, path);
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 30) {
            C0760b.a(outline, path);
        } else if (i2 >= 29) {
            try {
                C0759a.a(outline, path);
            } catch (IllegalArgumentException unused) {
            }
        } else if (path.isConvex()) {
            C0759a.a(outline, path);
        }
    }

    public final boolean getPadding(Rect rect) {
        Rect rect2 = this.f11459a.g;
        if (rect2 == null) {
            return super.getPadding(rect);
        }
        rect.set(rect2);
        return true;
    }

    public final Region getTransparentRegion() {
        Rect bounds = getBounds();
        Region region = this.f11468t;
        region.set(bounds);
        RectF f6 = f();
        Path path = this.f11464p;
        a(f6, path);
        Region region2 = this.f11469u;
        region2.setPath(path, region);
        region.op(region2, Region.Op.DIFFERENCE);
        return region;
    }

    public final void h(Context context) {
        this.f11459a.f11442b = new C0781a(context);
        m();
    }

    public final void i(float f6) {
        f fVar = this.f11459a;
        if (fVar.f11450m != f6) {
            fVar.f11450m = f6;
            m();
        }
    }

    public final void invalidateSelf() {
        this.f11462e = true;
        super.invalidateSelf();
    }

    public boolean isStateful() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        if (!super.isStateful() && ((colorStateList = this.f11459a.f11444e) == null || !colorStateList.isStateful())) {
            this.f11459a.getClass();
            ColorStateList colorStateList3 = this.f11459a.d;
            if ((colorStateList3 == null || !colorStateList3.isStateful()) && ((colorStateList2 = this.f11459a.f11443c) == null || !colorStateList2.isStateful())) {
                return false;
            }
        }
        return true;
    }

    public final void j(ColorStateList colorStateList) {
        f fVar = this.f11459a;
        if (fVar.f11443c != colorStateList) {
            fVar.f11443c = colorStateList;
            onStateChange(getState());
        }
    }

    public final boolean k(int[] iArr) {
        boolean z3;
        Paint paint;
        int color;
        int colorForState;
        Paint paint2;
        int color2;
        int colorForState2;
        if (this.f11459a.f11443c == null || (color2 = paint2.getColor()) == (colorForState2 = this.f11459a.f11443c.getColorForState(iArr, color2))) {
            z3 = false;
        } else {
            (paint2 = this.f11471w).setColor(colorForState2);
            z3 = true;
        }
        if (this.f11459a.d == null || (color = paint.getColor()) == (colorForState = this.f11459a.d.getColorForState(iArr, color))) {
            return z3;
        }
        (paint = this.f11472x).setColor(colorForState);
        return true;
    }

    public final boolean l() {
        PorterDuffColorFilter porterDuffColorFilter;
        PorterDuffColorFilter porterDuffColorFilter2;
        PorterDuffColorFilter porterDuffColorFilter3 = this.f11455B;
        PorterDuffColorFilter porterDuffColorFilter4 = this.f11456C;
        f fVar = this.f11459a;
        ColorStateList colorStateList = fVar.f11444e;
        PorterDuff.Mode mode = fVar.f11445f;
        Paint paint = this.f11471w;
        if (colorStateList == null || mode == null) {
            int color = paint.getColor();
            int b6 = b(color);
            if (b6 != color) {
                porterDuffColorFilter2 = new PorterDuffColorFilter(b6, PorterDuff.Mode.SRC_IN);
            } else {
                porterDuffColorFilter2 = null;
            }
            porterDuffColorFilter = porterDuffColorFilter2;
        } else {
            porterDuffColorFilter = new PorterDuffColorFilter(b(colorStateList.getColorForState(getState(), 0)), mode);
        }
        this.f11455B = porterDuffColorFilter;
        this.f11459a.getClass();
        this.f11456C = null;
        this.f11459a.getClass();
        if (!Objects.equals(porterDuffColorFilter3, this.f11455B) || !Objects.equals(porterDuffColorFilter4, this.f11456C)) {
            return true;
        }
        return false;
    }

    public final void m() {
        f fVar = this.f11459a;
        float f6 = fVar.f11450m + 0.0f;
        fVar.f11451n = (int) Math.ceil((double) (0.75f * f6));
        this.f11459a.f11452o = (int) Math.ceil((double) (f6 * 0.25f));
        l();
        super.invalidateSelf();
    }

    public Drawable mutate() {
        this.f11459a = new f(this.f11459a);
        return this;
    }

    public final void onBoundsChange(Rect rect) {
        this.f11462e = true;
        super.onBoundsChange(rect);
    }

    public boolean onStateChange(int[] iArr) {
        boolean z3;
        boolean k6 = k(iArr);
        boolean l6 = l();
        if (k6 || l6) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (z3) {
            invalidateSelf();
        }
        return z3;
    }

    public void setAlpha(int i2) {
        f fVar = this.f11459a;
        if (fVar.f11448k != i2) {
            fVar.f11448k = i2;
            super.invalidateSelf();
        }
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.f11459a.getClass();
        super.invalidateSelf();
    }

    public final void setShapeAppearanceModel(k kVar) {
        this.f11459a.f11441a = kVar;
        invalidateSelf();
    }

    public final void setTint(int i2) {
        setTintList(ColorStateList.valueOf(i2));
    }

    public void setTintList(ColorStateList colorStateList) {
        this.f11459a.f11444e = colorStateList;
        l();
        super.invalidateSelf();
    }

    public void setTintMode(PorterDuff.Mode mode) {
        f fVar = this.f11459a;
        if (fVar.f11445f != mode) {
            fVar.f11445f = mode;
            l();
            super.invalidateSelf();
        }
    }

    public g(Context context, AttributeSet attributeSet, int i2, int i5) {
        this(k.b(context, attributeSet, i2, i5).a());
    }

    public g(k kVar) {
        this(new f(kVar));
    }

    public g(f fVar) {
        m mVar;
        this.f11460b = new t[4];
        this.f11461c = new t[4];
        this.d = new BitSet(8);
        this.f11463f = new Matrix();
        this.f11464p = new Path();
        this.f11465q = new Path();
        this.f11466r = new RectF();
        this.f11467s = new RectF();
        this.f11468t = new Region();
        this.f11469u = new Region();
        Paint paint = new Paint(1);
        this.f11471w = paint;
        Paint paint2 = new Paint(1);
        this.f11472x = paint2;
        this.f11473y = new C0949a();
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            mVar = l.f11494a;
        } else {
            mVar = new m();
        }
        this.f11454A = mVar;
        this.f11457D = new RectF();
        this.f11458E = true;
        this.f11459a = fVar;
        paint2.setStyle(Paint.Style.STROKE);
        paint.setStyle(Paint.Style.FILL);
        l();
        k(getState());
        this.f11474z = new p0(this, 14);
    }
}
