package h2;

import D.a;
import Z1.b;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import com.google.android.material.chip.Chip;
import com.mtma.criminal.city.R;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import m2.h;
import m2.i;
import p2.C0916d;
import q2.C0935a;
import s2.C0962a;
import s2.g;
import s2.j;

public final class f extends g implements Drawable.Callback, h {
    public static final int[] O0 = {16842910};

    /* renamed from: P0  reason: collision with root package name */
    public static final ShapeDrawable f8057P0 = new ShapeDrawable(new OvalShape());

    /* renamed from: A0  reason: collision with root package name */
    public boolean f8058A0;

    /* renamed from: B0  reason: collision with root package name */
    public int f8059B0;

    /* renamed from: C0  reason: collision with root package name */
    public int f8060C0 = 255;

    /* renamed from: D0  reason: collision with root package name */
    public ColorFilter f8061D0;

    /* renamed from: E0  reason: collision with root package name */
    public PorterDuffColorFilter f8062E0;

    /* renamed from: F0  reason: collision with root package name */
    public ColorStateList f8063F0;

    /* renamed from: G  reason: collision with root package name */
    public ColorStateList f8064G;

    /* renamed from: G0  reason: collision with root package name */
    public PorterDuff.Mode f8065G0 = PorterDuff.Mode.SRC_IN;

    /* renamed from: H  reason: collision with root package name */
    public ColorStateList f8066H;

    /* renamed from: H0  reason: collision with root package name */
    public int[] f8067H0;

    /* renamed from: I  reason: collision with root package name */
    public float f8068I;

    /* renamed from: I0  reason: collision with root package name */
    public ColorStateList f8069I0;

    /* renamed from: J  reason: collision with root package name */
    public float f8070J = -1.0f;

    /* renamed from: J0  reason: collision with root package name */
    public WeakReference f8071J0 = new WeakReference((Object) null);

    /* renamed from: K  reason: collision with root package name */
    public ColorStateList f8072K;

    /* renamed from: K0  reason: collision with root package name */
    public TextUtils.TruncateAt f8073K0;

    /* renamed from: L  reason: collision with root package name */
    public float f8074L;
    public boolean L0;

    /* renamed from: M  reason: collision with root package name */
    public ColorStateList f8075M;

    /* renamed from: M0  reason: collision with root package name */
    public int f8076M0;

    /* renamed from: N  reason: collision with root package name */
    public CharSequence f8077N;

    /* renamed from: N0  reason: collision with root package name */
    public boolean f8078N0;

    /* renamed from: O  reason: collision with root package name */
    public boolean f8079O;

    /* renamed from: P  reason: collision with root package name */
    public Drawable f8080P;

    /* renamed from: Q  reason: collision with root package name */
    public ColorStateList f8081Q;

    /* renamed from: R  reason: collision with root package name */
    public float f8082R;

    /* renamed from: S  reason: collision with root package name */
    public boolean f8083S;

    /* renamed from: T  reason: collision with root package name */
    public boolean f8084T;

    /* renamed from: U  reason: collision with root package name */
    public Drawable f8085U;

    /* renamed from: V  reason: collision with root package name */
    public RippleDrawable f8086V;

    /* renamed from: W  reason: collision with root package name */
    public ColorStateList f8087W;

    /* renamed from: X  reason: collision with root package name */
    public float f8088X;

    /* renamed from: Y  reason: collision with root package name */
    public SpannableStringBuilder f8089Y;

    /* renamed from: Z  reason: collision with root package name */
    public boolean f8090Z;

    /* renamed from: a0  reason: collision with root package name */
    public boolean f8091a0;

    /* renamed from: b0  reason: collision with root package name */
    public Drawable f8092b0;

    /* renamed from: c0  reason: collision with root package name */
    public ColorStateList f8093c0;

    /* renamed from: d0  reason: collision with root package name */
    public b f8094d0;

    /* renamed from: e0  reason: collision with root package name */
    public b f8095e0;

    /* renamed from: f0  reason: collision with root package name */
    public float f8096f0;

    /* renamed from: g0  reason: collision with root package name */
    public float f8097g0;

    /* renamed from: h0  reason: collision with root package name */
    public float f8098h0;

    /* renamed from: i0  reason: collision with root package name */
    public float f8099i0;

    /* renamed from: j0  reason: collision with root package name */
    public float f8100j0;

    /* renamed from: k0  reason: collision with root package name */
    public float f8101k0;

    /* renamed from: l0  reason: collision with root package name */
    public float f8102l0;

    /* renamed from: m0  reason: collision with root package name */
    public float f8103m0;

    /* renamed from: n0  reason: collision with root package name */
    public final Context f8104n0;

    /* renamed from: o0  reason: collision with root package name */
    public final Paint f8105o0 = new Paint(1);

    /* renamed from: p0  reason: collision with root package name */
    public final Paint.FontMetrics f8106p0 = new Paint.FontMetrics();

    /* renamed from: q0  reason: collision with root package name */
    public final RectF f8107q0 = new RectF();

    /* renamed from: r0  reason: collision with root package name */
    public final PointF f8108r0 = new PointF();
    public final Path s0 = new Path();

    /* renamed from: t0  reason: collision with root package name */
    public final i f8109t0;

    /* renamed from: u0  reason: collision with root package name */
    public int f8110u0;

    /* renamed from: v0  reason: collision with root package name */
    public int f8111v0;

    /* renamed from: w0  reason: collision with root package name */
    public int f8112w0;

    /* renamed from: x0  reason: collision with root package name */
    public int f8113x0;

    /* renamed from: y0  reason: collision with root package name */
    public int f8114y0;

    /* renamed from: z0  reason: collision with root package name */
    public int f8115z0;

    public f(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.chipStyle, 2131952660);
        h(context);
        this.f8104n0 = context;
        i iVar = new i(this);
        this.f8109t0 = iVar;
        this.f8077N = "";
        iVar.f10143a.density = context.getResources().getDisplayMetrics().density;
        int[] iArr = O0;
        setState(iArr);
        if (!Arrays.equals(this.f8067H0, iArr)) {
            this.f8067H0 = iArr;
            if (T()) {
                v(getState(), iArr);
            }
        }
        this.L0 = true;
        int[] iArr2 = C0935a.f11083a;
        f8057P0.setTint(-1);
    }

    public static void U(Drawable drawable) {
        if (drawable != null) {
            drawable.setCallback((Drawable.Callback) null);
        }
    }

    public static boolean s(ColorStateList colorStateList) {
        if (colorStateList == null || !colorStateList.isStateful()) {
            return false;
        }
        return true;
    }

    public static boolean t(Drawable drawable) {
        if (drawable == null || !drawable.isStateful()) {
            return false;
        }
        return true;
    }

    public final void A(float f6) {
        if (this.f8070J != f6) {
            this.f8070J = f6;
            j e6 = this.f11459a.f11441a.e();
            e6.f11479e = new C0962a(f6);
            e6.f11480f = new C0962a(f6);
            e6.g = new C0962a(f6);
            e6.h = new C0962a(f6);
            setShapeAppearanceModel(e6.a());
        }
    }

    public final void B(Drawable drawable) {
        Drawable drawable2 = this.f8080P;
        Drawable drawable3 = null;
        if (drawable2 == null) {
            drawable2 = null;
        } else if (drawable2 instanceof D.g) {
            D.g gVar = (D.g) drawable2;
            drawable2 = null;
        }
        if (drawable2 != drawable) {
            float p6 = p();
            if (drawable != null) {
                drawable3 = drawable.mutate();
            }
            this.f8080P = drawable3;
            float p7 = p();
            U(drawable2);
            if (S()) {
                n(this.f8080P);
            }
            invalidateSelf();
            if (p6 != p7) {
                u();
            }
        }
    }

    public final void C(float f6) {
        if (this.f8082R != f6) {
            float p6 = p();
            this.f8082R = f6;
            float p7 = p();
            invalidateSelf();
            if (p6 != p7) {
                u();
            }
        }
    }

    public final void D(ColorStateList colorStateList) {
        this.f8083S = true;
        if (this.f8081Q != colorStateList) {
            this.f8081Q = colorStateList;
            if (S()) {
                a.h(this.f8080P, colorStateList);
            }
            onStateChange(getState());
        }
    }

    public final void E(boolean z3) {
        if (this.f8079O != z3) {
            boolean S5 = S();
            this.f8079O = z3;
            boolean S6 = S();
            if (S5 != S6) {
                if (S6) {
                    n(this.f8080P);
                } else {
                    U(this.f8080P);
                }
                invalidateSelf();
                u();
            }
        }
    }

    public final void F(ColorStateList colorStateList) {
        if (this.f8072K != colorStateList) {
            this.f8072K = colorStateList;
            if (this.f8078N0) {
                s2.f fVar = this.f11459a;
                if (fVar.d != colorStateList) {
                    fVar.d = colorStateList;
                    onStateChange(getState());
                }
            }
            onStateChange(getState());
        }
    }

    public final void G(float f6) {
        if (this.f8074L != f6) {
            this.f8074L = f6;
            this.f8105o0.setStrokeWidth(f6);
            if (this.f8078N0) {
                this.f11459a.f11447j = f6;
                invalidateSelf();
            }
            invalidateSelf();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x000e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void H(android.graphics.drawable.Drawable r6) {
        /*
            r5 = this;
            r0 = 0
            android.graphics.drawable.Drawable r1 = r5.f8085U
            if (r1 == 0) goto L_0x000b
            boolean r2 = r1 instanceof D.g
            if (r2 == 0) goto L_0x000c
            D.g r1 = (D.g) r1
        L_0x000b:
            r1 = r0
        L_0x000c:
            if (r1 == r6) goto L_0x0049
            float r2 = r5.q()
            if (r6 == 0) goto L_0x0018
            android.graphics.drawable.Drawable r0 = r6.mutate()
        L_0x0018:
            r5.f8085U = r0
            int[] r6 = q2.C0935a.f11083a
            android.graphics.drawable.RippleDrawable r6 = new android.graphics.drawable.RippleDrawable
            android.content.res.ColorStateList r0 = r5.f8075M
            android.content.res.ColorStateList r0 = q2.C0935a.a(r0)
            android.graphics.drawable.Drawable r3 = r5.f8085U
            android.graphics.drawable.ShapeDrawable r4 = f8057P0
            r6.<init>(r0, r3, r4)
            r5.f8086V = r6
            float r6 = r5.q()
            U(r1)
            boolean r0 = r5.T()
            if (r0 == 0) goto L_0x003f
            android.graphics.drawable.Drawable r0 = r5.f8085U
            r5.n(r0)
        L_0x003f:
            r5.invalidateSelf()
            int r6 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r6 == 0) goto L_0x0049
            r5.u()
        L_0x0049:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: h2.f.H(android.graphics.drawable.Drawable):void");
    }

    public final void I(float f6) {
        if (this.f8102l0 != f6) {
            this.f8102l0 = f6;
            invalidateSelf();
            if (T()) {
                u();
            }
        }
    }

    public final void J(float f6) {
        if (this.f8088X != f6) {
            this.f8088X = f6;
            invalidateSelf();
            if (T()) {
                u();
            }
        }
    }

    public final void K(float f6) {
        if (this.f8101k0 != f6) {
            this.f8101k0 = f6;
            invalidateSelf();
            if (T()) {
                u();
            }
        }
    }

    public final void L(ColorStateList colorStateList) {
        if (this.f8087W != colorStateList) {
            this.f8087W = colorStateList;
            if (T()) {
                a.h(this.f8085U, colorStateList);
            }
            onStateChange(getState());
        }
    }

    public final void M(boolean z3) {
        if (this.f8084T != z3) {
            boolean T5 = T();
            this.f8084T = z3;
            boolean T6 = T();
            if (T5 != T6) {
                if (T6) {
                    n(this.f8085U);
                } else {
                    U(this.f8085U);
                }
                invalidateSelf();
                u();
            }
        }
    }

    public final void N(float f6) {
        if (this.f8098h0 != f6) {
            float p6 = p();
            this.f8098h0 = f6;
            float p7 = p();
            invalidateSelf();
            if (p6 != p7) {
                u();
            }
        }
    }

    public final void O(float f6) {
        if (this.f8097g0 != f6) {
            float p6 = p();
            this.f8097g0 = f6;
            float p7 = p();
            invalidateSelf();
            if (p6 != p7) {
                u();
            }
        }
    }

    public final void P(ColorStateList colorStateList) {
        if (this.f8075M != colorStateList) {
            this.f8075M = colorStateList;
            this.f8069I0 = null;
            onStateChange(getState());
        }
    }

    public final void Q(C0916d dVar) {
        i iVar = this.f8109t0;
        if (iVar.f10147f != dVar) {
            iVar.f10147f = dVar;
            if (dVar != null) {
                TextPaint textPaint = iVar.f10143a;
                Context context = this.f8104n0;
                C0555b bVar = iVar.f10144b;
                dVar.f(context, textPaint, bVar);
                h hVar = (h) iVar.f10146e.get();
                if (hVar != null) {
                    textPaint.drawableState = hVar.getState();
                }
                dVar.e(context, textPaint, bVar);
                iVar.d = true;
            }
            h hVar2 = (h) iVar.f10146e.get();
            if (hVar2 != null) {
                f fVar = (f) hVar2;
                fVar.u();
                fVar.invalidateSelf();
                fVar.onStateChange(hVar2.getState());
            }
        }
    }

    public final boolean R() {
        if (!this.f8091a0 || this.f8092b0 == null || !this.f8058A0) {
            return false;
        }
        return true;
    }

    public final boolean S() {
        if (!this.f8079O || this.f8080P == null) {
            return false;
        }
        return true;
    }

    public final boolean T() {
        if (!this.f8084T || this.f8085U == null) {
            return false;
        }
        return true;
    }

    public final void draw(Canvas canvas) {
        int i2;
        int i5;
        RectF rectF;
        int i6;
        int i7;
        int i8;
        RectF rectF2;
        boolean z3;
        int i9;
        Canvas canvas2 = canvas;
        Rect bounds = getBounds();
        if (!bounds.isEmpty() && (i2 = this.f8060C0) != 0) {
            if (i2 < 255) {
                i5 = canvas.saveLayerAlpha((float) bounds.left, (float) bounds.top, (float) bounds.right, (float) bounds.bottom, i2);
            } else {
                i5 = 0;
            }
            boolean z4 = this.f8078N0;
            Paint paint = this.f8105o0;
            RectF rectF3 = this.f8107q0;
            if (!z4) {
                paint.setColor(this.f8110u0);
                paint.setStyle(Paint.Style.FILL);
                rectF3.set(bounds);
                canvas2.drawRoundRect(rectF3, r(), r(), paint);
            }
            if (!this.f8078N0) {
                paint.setColor(this.f8111v0);
                paint.setStyle(Paint.Style.FILL);
                ColorFilter colorFilter = this.f8061D0;
                if (colorFilter == null) {
                    colorFilter = this.f8062E0;
                }
                paint.setColorFilter(colorFilter);
                rectF3.set(bounds);
                canvas2.drawRoundRect(rectF3, r(), r(), paint);
            }
            if (this.f8078N0) {
                super.draw(canvas);
            }
            if (this.f8074L > 0.0f && !this.f8078N0) {
                paint.setColor(this.f8113x0);
                paint.setStyle(Paint.Style.STROKE);
                if (!this.f8078N0) {
                    ColorFilter colorFilter2 = this.f8061D0;
                    if (colorFilter2 == null) {
                        colorFilter2 = this.f8062E0;
                    }
                    paint.setColorFilter(colorFilter2);
                }
                float f6 = this.f8074L / 2.0f;
                rectF3.set(((float) bounds.left) + f6, ((float) bounds.top) + f6, ((float) bounds.right) - f6, ((float) bounds.bottom) - f6);
                float f7 = this.f8070J - (this.f8074L / 2.0f);
                canvas2.drawRoundRect(rectF3, f7, f7, paint);
            }
            paint.setColor(this.f8114y0);
            paint.setStyle(Paint.Style.FILL);
            rectF3.set(bounds);
            if (!this.f8078N0) {
                canvas2.drawRoundRect(rectF3, r(), r(), paint);
            } else {
                RectF rectF4 = new RectF(bounds);
                Path path = this.s0;
                s2.f fVar = this.f11459a;
                this.f11454A.a(fVar.f11441a, fVar.f11446i, rectF4, this.f11474z, path);
                d(canvas, paint, path, this.f11459a.f11441a, f());
            }
            if (S()) {
                o(bounds, rectF3);
                float f8 = rectF3.left;
                float f9 = rectF3.top;
                canvas2.translate(f8, f9);
                this.f8080P.setBounds(0, 0, (int) rectF3.width(), (int) rectF3.height());
                this.f8080P.draw(canvas2);
                canvas2.translate(-f8, -f9);
            }
            if (R()) {
                o(bounds, rectF3);
                float f10 = rectF3.left;
                float f11 = rectF3.top;
                canvas2.translate(f10, f11);
                this.f8092b0.setBounds(0, 0, (int) rectF3.width(), (int) rectF3.height());
                this.f8092b0.draw(canvas2);
                canvas2.translate(-f10, -f11);
            }
            if (!this.L0 || this.f8077N == null) {
                rectF = rectF3;
                i7 = i5;
                i6 = 0;
                i8 = 255;
            } else {
                PointF pointF = this.f8108r0;
                pointF.set(0.0f, 0.0f);
                Paint.Align align = Paint.Align.LEFT;
                CharSequence charSequence = this.f8077N;
                i iVar = this.f8109t0;
                if (charSequence != null) {
                    float p6 = p() + this.f8096f0 + this.f8099i0;
                    if (D.b.a(this) == 0) {
                        pointF.x = ((float) bounds.left) + p6;
                    } else {
                        pointF.x = ((float) bounds.right) - p6;
                        align = Paint.Align.RIGHT;
                    }
                    TextPaint textPaint = iVar.f10143a;
                    Paint.FontMetrics fontMetrics = this.f8106p0;
                    textPaint.getFontMetrics(fontMetrics);
                    pointF.y = ((float) bounds.centerY()) - ((fontMetrics.descent + fontMetrics.ascent) / 2.0f);
                }
                rectF3.setEmpty();
                if (this.f8077N != null) {
                    float p7 = p() + this.f8096f0 + this.f8099i0;
                    float q6 = q() + this.f8103m0 + this.f8100j0;
                    if (D.b.a(this) == 0) {
                        rectF3.left = ((float) bounds.left) + p7;
                        rectF3.right = ((float) bounds.right) - q6;
                    } else {
                        rectF3.left = ((float) bounds.left) + q6;
                        rectF3.right = ((float) bounds.right) - p7;
                    }
                    rectF3.top = (float) bounds.top;
                    rectF3.bottom = (float) bounds.bottom;
                }
                C0916d dVar = iVar.f10147f;
                TextPaint textPaint2 = iVar.f10143a;
                if (dVar != null) {
                    textPaint2.drawableState = getState();
                    iVar.f10147f.e(this.f8104n0, textPaint2, iVar.f10144b);
                }
                textPaint2.setTextAlign(align);
                if (Math.round(iVar.a(this.f8077N.toString())) > Math.round(rectF3.width())) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (z3) {
                    i9 = canvas.save();
                    canvas2.clipRect(rectF3);
                } else {
                    i9 = 0;
                }
                CharSequence charSequence2 = this.f8077N;
                if (z3 && this.f8073K0 != null) {
                    charSequence2 = TextUtils.ellipsize(charSequence2, textPaint2, rectF3.width(), this.f8073K0);
                }
                CharSequence charSequence3 = charSequence2;
                rectF = rectF3;
                int length = charSequence3.length();
                i7 = i5;
                float f12 = pointF.x;
                i6 = 0;
                float f13 = pointF.y;
                i8 = 255;
                canvas.drawText(charSequence3, 0, length, f12, f13, textPaint2);
                if (z3) {
                    canvas2.restoreToCount(i9);
                }
            }
            if (T()) {
                rectF.setEmpty();
                if (T()) {
                    float f14 = this.f8103m0 + this.f8102l0;
                    if (D.b.a(this) == 0) {
                        float f15 = ((float) bounds.right) - f14;
                        rectF2 = rectF;
                        rectF2.right = f15;
                        rectF2.left = f15 - this.f8088X;
                    } else {
                        rectF2 = rectF;
                        float f16 = ((float) bounds.left) + f14;
                        rectF2.left = f16;
                        rectF2.right = f16 + this.f8088X;
                    }
                    float exactCenterY = bounds.exactCenterY();
                    float f17 = this.f8088X;
                    float f18 = exactCenterY - (f17 / 2.0f);
                    rectF2.top = f18;
                    rectF2.bottom = f18 + f17;
                } else {
                    rectF2 = rectF;
                }
                float f19 = rectF2.left;
                float f20 = rectF2.top;
                canvas2.translate(f19, f20);
                this.f8085U.setBounds(i6, i6, (int) rectF2.width(), (int) rectF2.height());
                int[] iArr = C0935a.f11083a;
                this.f8086V.setBounds(this.f8085U.getBounds());
                this.f8086V.jumpToCurrentState();
                this.f8086V.draw(canvas2);
                canvas2.translate(-f19, -f20);
            }
            if (this.f8060C0 < i8) {
                canvas2.restoreToCount(i7);
            }
        }
    }

    public final int getAlpha() {
        return this.f8060C0;
    }

    public final ColorFilter getColorFilter() {
        return this.f8061D0;
    }

    public final int getIntrinsicHeight() {
        return (int) this.f8068I;
    }

    public final int getIntrinsicWidth() {
        return Math.min(Math.round(q() + this.f8109t0.a(this.f8077N.toString()) + p() + this.f8096f0 + this.f8099i0 + this.f8100j0 + this.f8103m0), this.f8076M0);
    }

    public final int getOpacity() {
        return -3;
    }

    public final void getOutline(Outline outline) {
        if (this.f8078N0) {
            super.getOutline(outline);
            return;
        }
        Rect bounds = getBounds();
        if (!bounds.isEmpty()) {
            outline.setRoundRect(bounds, this.f8070J);
        } else {
            outline.setRoundRect(0, 0, getIntrinsicWidth(), (int) this.f8068I, this.f8070J);
        }
        outline.setAlpha(((float) this.f8060C0) / 255.0f);
    }

    public final void invalidateDrawable(Drawable drawable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.invalidateDrawable(this);
        }
    }

    public final boolean isStateful() {
        C0916d dVar;
        ColorStateList colorStateList;
        if (s(this.f8064G) || s(this.f8066H) || s(this.f8072K) || (((dVar = this.f8109t0.f10147f) != null && (colorStateList = dVar.f10988j) != null && colorStateList.isStateful()) || ((this.f8091a0 && this.f8092b0 != null && this.f8090Z) || t(this.f8080P) || t(this.f8092b0) || s(this.f8063F0)))) {
            return true;
        }
        return false;
    }

    public final void n(Drawable drawable) {
        if (drawable != null) {
            drawable.setCallback(this);
            D.b.b(drawable, D.b.a(this));
            drawable.setLevel(getLevel());
            drawable.setVisible(isVisible(), false);
            if (drawable == this.f8085U) {
                if (drawable.isStateful()) {
                    drawable.setState(this.f8067H0);
                }
                a.h(drawable, this.f8087W);
                return;
            }
            Drawable drawable2 = this.f8080P;
            if (drawable == drawable2 && this.f8083S) {
                a.h(drawable2, this.f8081Q);
            }
            if (drawable.isStateful()) {
                drawable.setState(getState());
            }
        }
    }

    public final void o(Rect rect, RectF rectF) {
        Drawable drawable;
        Drawable drawable2;
        rectF.setEmpty();
        if (S() || R()) {
            float f6 = this.f8096f0 + this.f8097g0;
            if (this.f8058A0) {
                drawable = this.f8092b0;
            } else {
                drawable = this.f8080P;
            }
            float f7 = this.f8082R;
            if (f7 <= 0.0f && drawable != null) {
                f7 = (float) drawable.getIntrinsicWidth();
            }
            if (D.b.a(this) == 0) {
                float f8 = ((float) rect.left) + f6;
                rectF.left = f8;
                rectF.right = f8 + f7;
            } else {
                float f9 = ((float) rect.right) - f6;
                rectF.right = f9;
                rectF.left = f9 - f7;
            }
            if (this.f8058A0) {
                drawable2 = this.f8092b0;
            } else {
                drawable2 = this.f8080P;
            }
            float f10 = this.f8082R;
            if (f10 <= 0.0f && drawable2 != null) {
                f10 = (float) Math.ceil((double) TypedValue.applyDimension(1, (float) 24, this.f8104n0.getResources().getDisplayMetrics()));
                if (((float) drawable2.getIntrinsicHeight()) <= f10) {
                    f10 = (float) drawable2.getIntrinsicHeight();
                }
            }
            float exactCenterY = rect.exactCenterY() - (f10 / 2.0f);
            rectF.top = exactCenterY;
            rectF.bottom = exactCenterY + f10;
        }
    }

    public final boolean onLayoutDirectionChanged(int i2) {
        boolean onLayoutDirectionChanged = super.onLayoutDirectionChanged(i2);
        if (S()) {
            onLayoutDirectionChanged |= D.b.b(this.f8080P, i2);
        }
        if (R()) {
            onLayoutDirectionChanged |= D.b.b(this.f8092b0, i2);
        }
        if (T()) {
            onLayoutDirectionChanged |= D.b.b(this.f8085U, i2);
        }
        if (!onLayoutDirectionChanged) {
            return true;
        }
        invalidateSelf();
        return true;
    }

    public final boolean onLevelChange(int i2) {
        boolean onLevelChange = super.onLevelChange(i2);
        if (S()) {
            onLevelChange |= this.f8080P.setLevel(i2);
        }
        if (R()) {
            onLevelChange |= this.f8092b0.setLevel(i2);
        }
        if (T()) {
            onLevelChange |= this.f8085U.setLevel(i2);
        }
        if (onLevelChange) {
            invalidateSelf();
        }
        return onLevelChange;
    }

    public final boolean onStateChange(int[] iArr) {
        if (this.f8078N0) {
            super.onStateChange(iArr);
        }
        return v(iArr, this.f8067H0);
    }

    public final float p() {
        Drawable drawable;
        if (!S() && !R()) {
            return 0.0f;
        }
        float f6 = this.f8097g0;
        if (this.f8058A0) {
            drawable = this.f8092b0;
        } else {
            drawable = this.f8080P;
        }
        float f7 = this.f8082R;
        if (f7 <= 0.0f && drawable != null) {
            f7 = (float) drawable.getIntrinsicWidth();
        }
        return f7 + f6 + this.f8098h0;
    }

    public final float q() {
        if (T()) {
            return this.f8101k0 + this.f8088X + this.f8102l0;
        }
        return 0.0f;
    }

    public final float r() {
        if (this.f8078N0) {
            return this.f11459a.f11441a.f11488e.a(f());
        }
        return this.f8070J;
    }

    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j6) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.scheduleDrawable(this, runnable, j6);
        }
    }

    public final void setAlpha(int i2) {
        if (this.f8060C0 != i2) {
            this.f8060C0 = i2;
            invalidateSelf();
        }
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        if (this.f8061D0 != colorFilter) {
            this.f8061D0 = colorFilter;
            invalidateSelf();
        }
    }

    public final void setTintList(ColorStateList colorStateList) {
        if (this.f8063F0 != colorStateList) {
            this.f8063F0 = colorStateList;
            onStateChange(getState());
        }
    }

    public final void setTintMode(PorterDuff.Mode mode) {
        PorterDuffColorFilter porterDuffColorFilter;
        if (this.f8065G0 != mode) {
            this.f8065G0 = mode;
            ColorStateList colorStateList = this.f8063F0;
            if (colorStateList == null || mode == null) {
                porterDuffColorFilter = null;
            } else {
                porterDuffColorFilter = new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
            }
            this.f8062E0 = porterDuffColorFilter;
            invalidateSelf();
        }
    }

    public final boolean setVisible(boolean z3, boolean z4) {
        boolean visible = super.setVisible(z3, z4);
        if (S()) {
            visible |= this.f8080P.setVisible(z3, z4);
        }
        if (R()) {
            visible |= this.f8092b0.setVisible(z3, z4);
        }
        if (T()) {
            visible |= this.f8085U.setVisible(z3, z4);
        }
        if (visible) {
            invalidateSelf();
        }
        return visible;
    }

    public final void u() {
        e eVar = (e) this.f8071J0.get();
        if (eVar != null) {
            Chip chip = (Chip) eVar;
            chip.b(chip.f6387y);
            chip.requestLayout();
            chip.invalidateOutline();
        }
    }

    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.unscheduleDrawable(this, runnable);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:67:0x00cc  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x00cf  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x00d5  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x00dc  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x00e1  */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x00fe  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x0107  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x0116  */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x0125  */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x0144  */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x014d  */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x0152  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean v(int[] r9, int[] r10) {
        /*
            r8 = this;
            r0 = 1
            boolean r1 = super.onStateChange(r9)
            android.content.res.ColorStateList r2 = r8.f8064G
            r3 = 0
            if (r2 == 0) goto L_0x0011
            int r4 = r8.f8110u0
            int r2 = r2.getColorForState(r9, r4)
            goto L_0x0012
        L_0x0011:
            r2 = r3
        L_0x0012:
            int r2 = r8.b(r2)
            int r4 = r8.f8110u0
            if (r4 == r2) goto L_0x001d
            r8.f8110u0 = r2
            r1 = r0
        L_0x001d:
            android.content.res.ColorStateList r4 = r8.f8066H
            if (r4 == 0) goto L_0x0028
            int r5 = r8.f8111v0
            int r4 = r4.getColorForState(r9, r5)
            goto L_0x0029
        L_0x0028:
            r4 = r3
        L_0x0029:
            int r4 = r8.b(r4)
            int r5 = r8.f8111v0
            if (r5 == r4) goto L_0x0034
            r8.f8111v0 = r4
            r1 = r0
        L_0x0034:
            int r2 = C.d.b(r4, r2)
            int r4 = r8.f8112w0
            if (r4 == r2) goto L_0x003e
            r4 = r0
            goto L_0x003f
        L_0x003e:
            r4 = r3
        L_0x003f:
            s2.f r5 = r8.f11459a
            android.content.res.ColorStateList r5 = r5.f11443c
            if (r5 != 0) goto L_0x0047
            r5 = r0
            goto L_0x0048
        L_0x0047:
            r5 = r3
        L_0x0048:
            r4 = r4 | r5
            if (r4 == 0) goto L_0x0055
            r8.f8112w0 = r2
            android.content.res.ColorStateList r1 = android.content.res.ColorStateList.valueOf(r2)
            r8.j(r1)
            r1 = r0
        L_0x0055:
            android.content.res.ColorStateList r2 = r8.f8072K
            if (r2 == 0) goto L_0x0060
            int r4 = r8.f8113x0
            int r2 = r2.getColorForState(r9, r4)
            goto L_0x0061
        L_0x0060:
            r2 = r3
        L_0x0061:
            int r4 = r8.f8113x0
            if (r4 == r2) goto L_0x0068
            r8.f8113x0 = r2
            r1 = r0
        L_0x0068:
            android.content.res.ColorStateList r2 = r8.f8069I0
            if (r2 == 0) goto L_0x007b
            boolean r2 = q2.C0935a.b(r9)
            if (r2 == 0) goto L_0x007b
            android.content.res.ColorStateList r2 = r8.f8069I0
            int r4 = r8.f8114y0
            int r2 = r2.getColorForState(r9, r4)
            goto L_0x007c
        L_0x007b:
            r2 = r3
        L_0x007c:
            int r4 = r8.f8114y0
            if (r4 == r2) goto L_0x0082
            r8.f8114y0 = r2
        L_0x0082:
            m2.i r2 = r8.f8109t0
            p2.d r2 = r2.f10147f
            if (r2 == 0) goto L_0x0093
            android.content.res.ColorStateList r2 = r2.f10988j
            if (r2 == 0) goto L_0x0093
            int r4 = r8.f8115z0
            int r2 = r2.getColorForState(r9, r4)
            goto L_0x0094
        L_0x0093:
            r2 = r3
        L_0x0094:
            int r4 = r8.f8115z0
            if (r4 == r2) goto L_0x009b
            r8.f8115z0 = r2
            r1 = r0
        L_0x009b:
            int[] r2 = r8.getState()
            if (r2 != 0) goto L_0x00a2
            goto L_0x00b5
        L_0x00a2:
            int r4 = r2.length
            r5 = r3
        L_0x00a4:
            if (r5 >= r4) goto L_0x00b5
            r6 = r2[r5]
            r7 = 16842912(0x10100a0, float:2.3694006E-38)
            if (r6 != r7) goto L_0x00b3
            boolean r2 = r8.f8090Z
            if (r2 == 0) goto L_0x00b5
            r2 = r0
            goto L_0x00b6
        L_0x00b3:
            int r5 = r5 + r0
            goto L_0x00a4
        L_0x00b5:
            r2 = r3
        L_0x00b6:
            boolean r4 = r8.f8058A0
            if (r4 == r2) goto L_0x00d0
            android.graphics.drawable.Drawable r4 = r8.f8092b0
            if (r4 == 0) goto L_0x00d0
            float r1 = r8.p()
            r8.f8058A0 = r2
            float r2 = r8.p()
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r1 == 0) goto L_0x00cf
            r1 = r0
            r2 = r1
            goto L_0x00d1
        L_0x00cf:
            r1 = r0
        L_0x00d0:
            r2 = r3
        L_0x00d1:
            android.content.res.ColorStateList r4 = r8.f8063F0
            if (r4 == 0) goto L_0x00dc
            int r5 = r8.f8059B0
            int r4 = r4.getColorForState(r9, r5)
            goto L_0x00dd
        L_0x00dc:
            r4 = r3
        L_0x00dd:
            int r5 = r8.f8059B0
            if (r5 == r4) goto L_0x00fe
            r8.f8059B0 = r4
            android.content.res.ColorStateList r1 = r8.f8063F0
            android.graphics.PorterDuff$Mode r4 = r8.f8065G0
            if (r1 == 0) goto L_0x00fa
            if (r4 != 0) goto L_0x00ec
            goto L_0x00fa
        L_0x00ec:
            int[] r5 = r8.getState()
            int r1 = r1.getColorForState(r5, r3)
            android.graphics.PorterDuffColorFilter r5 = new android.graphics.PorterDuffColorFilter
            r5.<init>(r1, r4)
            goto L_0x00fb
        L_0x00fa:
            r5 = 0
        L_0x00fb:
            r8.f8062E0 = r5
            goto L_0x00ff
        L_0x00fe:
            r0 = r1
        L_0x00ff:
            android.graphics.drawable.Drawable r1 = r8.f8080P
            boolean r1 = t(r1)
            if (r1 == 0) goto L_0x010e
            android.graphics.drawable.Drawable r1 = r8.f8080P
            boolean r1 = r1.setState(r9)
            r0 = r0 | r1
        L_0x010e:
            android.graphics.drawable.Drawable r1 = r8.f8092b0
            boolean r1 = t(r1)
            if (r1 == 0) goto L_0x011d
            android.graphics.drawable.Drawable r1 = r8.f8092b0
            boolean r1 = r1.setState(r9)
            r0 = r0 | r1
        L_0x011d:
            android.graphics.drawable.Drawable r1 = r8.f8085U
            boolean r1 = t(r1)
            if (r1 == 0) goto L_0x013a
            int r1 = r9.length
            int r4 = r10.length
            int r1 = r1 + r4
            int[] r1 = new int[r1]
            int r4 = r9.length
            java.lang.System.arraycopy(r9, r3, r1, r3, r4)
            int r9 = r9.length
            int r4 = r10.length
            java.lang.System.arraycopy(r10, r3, r1, r9, r4)
            android.graphics.drawable.Drawable r9 = r8.f8085U
            boolean r9 = r9.setState(r1)
            r0 = r0 | r9
        L_0x013a:
            int[] r9 = q2.C0935a.f11083a
            android.graphics.drawable.RippleDrawable r9 = r8.f8086V
            boolean r9 = t(r9)
            if (r9 == 0) goto L_0x014b
            android.graphics.drawable.RippleDrawable r9 = r8.f8086V
            boolean r9 = r9.setState(r10)
            r0 = r0 | r9
        L_0x014b:
            if (r0 == 0) goto L_0x0150
            r8.invalidateSelf()
        L_0x0150:
            if (r2 == 0) goto L_0x0155
            r8.u()
        L_0x0155:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: h2.f.v(int[], int[]):boolean");
    }

    public final void w(boolean z3) {
        if (this.f8090Z != z3) {
            this.f8090Z = z3;
            float p6 = p();
            if (!z3 && this.f8058A0) {
                this.f8058A0 = false;
            }
            float p7 = p();
            invalidateSelf();
            if (p6 != p7) {
                u();
            }
        }
    }

    public final void x(Drawable drawable) {
        if (this.f8092b0 != drawable) {
            float p6 = p();
            this.f8092b0 = drawable;
            float p7 = p();
            U(this.f8092b0);
            n(this.f8092b0);
            invalidateSelf();
            if (p6 != p7) {
                u();
            }
        }
    }

    public final void y(ColorStateList colorStateList) {
        Drawable drawable;
        if (this.f8093c0 != colorStateList) {
            this.f8093c0 = colorStateList;
            if (this.f8091a0 && (drawable = this.f8092b0) != null && this.f8090Z) {
                a.h(drawable, colorStateList);
            }
            onStateChange(getState());
        }
    }

    public final void z(boolean z3) {
        if (this.f8091a0 != z3) {
            boolean R5 = R();
            this.f8091a0 = z3;
            boolean R6 = R();
            if (R5 != R6) {
                if (R6) {
                    n(this.f8092b0);
                } else {
                    U(this.f8092b0);
                }
                invalidateSelf();
                u();
            }
        }
    }
}
