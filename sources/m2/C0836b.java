package m2;

import B0.H;
import I.g;
import K.O;
import K1.e;
import Z1.a;
import a0.C0254a;
import android.animation.TimeInterpolator;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.animation.LinearInterpolator;
import com.google.android.material.textfield.TextInputLayout;
import java.util.WeakHashMap;
import p2.C0913a;

/* renamed from: m2.b  reason: case insensitive filesystem */
public final class C0836b {

    /* renamed from: A  reason: collision with root package name */
    public CharSequence f10073A;

    /* renamed from: B  reason: collision with root package name */
    public CharSequence f10074B;

    /* renamed from: C  reason: collision with root package name */
    public boolean f10075C;

    /* renamed from: D  reason: collision with root package name */
    public final boolean f10076D = true;

    /* renamed from: E  reason: collision with root package name */
    public Bitmap f10077E;
    public float F;

    /* renamed from: G  reason: collision with root package name */
    public float f10078G;

    /* renamed from: H  reason: collision with root package name */
    public float f10079H;

    /* renamed from: I  reason: collision with root package name */
    public float f10080I;

    /* renamed from: J  reason: collision with root package name */
    public float f10081J;

    /* renamed from: K  reason: collision with root package name */
    public int f10082K;

    /* renamed from: L  reason: collision with root package name */
    public int[] f10083L;

    /* renamed from: M  reason: collision with root package name */
    public boolean f10084M;

    /* renamed from: N  reason: collision with root package name */
    public final TextPaint f10085N;

    /* renamed from: O  reason: collision with root package name */
    public final TextPaint f10086O;

    /* renamed from: P  reason: collision with root package name */
    public LinearInterpolator f10087P;

    /* renamed from: Q  reason: collision with root package name */
    public LinearInterpolator f10088Q;

    /* renamed from: R  reason: collision with root package name */
    public float f10089R;

    /* renamed from: S  reason: collision with root package name */
    public float f10090S;

    /* renamed from: T  reason: collision with root package name */
    public float f10091T;

    /* renamed from: U  reason: collision with root package name */
    public ColorStateList f10092U;

    /* renamed from: V  reason: collision with root package name */
    public float f10093V;

    /* renamed from: W  reason: collision with root package name */
    public float f10094W;

    /* renamed from: X  reason: collision with root package name */
    public float f10095X;

    /* renamed from: Y  reason: collision with root package name */
    public StaticLayout f10096Y;

    /* renamed from: Z  reason: collision with root package name */
    public float f10097Z;

    /* renamed from: a  reason: collision with root package name */
    public final TextInputLayout f10098a;

    /* renamed from: a0  reason: collision with root package name */
    public float f10099a0;

    /* renamed from: b  reason: collision with root package name */
    public float f10100b;

    /* renamed from: b0  reason: collision with root package name */
    public float f10101b0;

    /* renamed from: c  reason: collision with root package name */
    public final Rect f10102c;

    /* renamed from: c0  reason: collision with root package name */
    public CharSequence f10103c0;
    public final Rect d;

    /* renamed from: d0  reason: collision with root package name */
    public final int f10104d0 = 1;

    /* renamed from: e  reason: collision with root package name */
    public final RectF f10105e;

    /* renamed from: e0  reason: collision with root package name */
    public final float f10106e0 = 1.0f;

    /* renamed from: f  reason: collision with root package name */
    public int f10107f = 16;

    /* renamed from: f0  reason: collision with root package name */
    public final int f10108f0 = 1;
    public int g = 16;
    public float h = 15.0f;

    /* renamed from: i  reason: collision with root package name */
    public float f10109i = 15.0f;

    /* renamed from: j  reason: collision with root package name */
    public ColorStateList f10110j;

    /* renamed from: k  reason: collision with root package name */
    public ColorStateList f10111k;

    /* renamed from: l  reason: collision with root package name */
    public float f10112l;

    /* renamed from: m  reason: collision with root package name */
    public float f10113m;

    /* renamed from: n  reason: collision with root package name */
    public float f10114n;

    /* renamed from: o  reason: collision with root package name */
    public float f10115o;

    /* renamed from: p  reason: collision with root package name */
    public float f10116p;

    /* renamed from: q  reason: collision with root package name */
    public float f10117q;

    /* renamed from: r  reason: collision with root package name */
    public Typeface f10118r;

    /* renamed from: s  reason: collision with root package name */
    public Typeface f10119s;

    /* renamed from: t  reason: collision with root package name */
    public Typeface f10120t;

    /* renamed from: u  reason: collision with root package name */
    public Typeface f10121u;

    /* renamed from: v  reason: collision with root package name */
    public Typeface f10122v;

    /* renamed from: w  reason: collision with root package name */
    public Typeface f10123w;

    /* renamed from: x  reason: collision with root package name */
    public Typeface f10124x;

    /* renamed from: y  reason: collision with root package name */
    public C0913a f10125y;

    /* renamed from: z  reason: collision with root package name */
    public final TextUtils.TruncateAt f10126z = TextUtils.TruncateAt.END;

    public C0836b(TextInputLayout textInputLayout) {
        this.f10098a = textInputLayout;
        TextPaint textPaint = new TextPaint(129);
        this.f10085N = textPaint;
        this.f10086O = new TextPaint(textPaint);
        this.d = new Rect();
        this.f10102c = new Rect();
        this.f10105e = new RectF();
        g(textInputLayout.getContext().getResources().getConfiguration());
    }

    public static int a(int i2, int i5, float f6) {
        float f7 = 1.0f - f6;
        return Color.argb(Math.round((((float) Color.alpha(i5)) * f6) + (((float) Color.alpha(i2)) * f7)), Math.round((((float) Color.red(i5)) * f6) + (((float) Color.red(i2)) * f7)), Math.round((((float) Color.green(i5)) * f6) + (((float) Color.green(i2)) * f7)), Math.round((((float) Color.blue(i5)) * f6) + (((float) Color.blue(i2)) * f7)));
    }

    public static float f(float f6, float f7, float f8, TimeInterpolator timeInterpolator) {
        if (timeInterpolator != null) {
            f8 = timeInterpolator.getInterpolation(f8);
        }
        return a.a(f6, f7, f8);
    }

    public final boolean b(CharSequence charSequence) {
        H h6;
        WeakHashMap weakHashMap = O.f1352a;
        boolean z3 = true;
        if (this.f10098a.getLayoutDirection() != 1) {
            z3 = false;
        }
        if (!this.f10076D) {
            return z3;
        }
        if (z3) {
            h6 = g.d;
        } else {
            h6 = g.f1088c;
        }
        return h6.b(charSequence, charSequence.length());
    }

    public final void c(float f6, boolean z3) {
        boolean z4;
        float f7;
        float f8;
        Typeface typeface;
        boolean z5;
        Layout.Alignment alignment;
        boolean z6;
        boolean z7;
        boolean z8;
        boolean z9;
        boolean z10;
        if (this.f10073A != null) {
            float width = (float) this.d.width();
            float width2 = (float) this.f10102c.width();
            if (Math.abs(f6 - 1.0f) < 1.0E-5f) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (z4) {
                f8 = this.f10109i;
                f7 = this.f10093V;
                this.F = 1.0f;
                typeface = this.f10118r;
            } else {
                float f9 = this.h;
                float f10 = this.f10094W;
                Typeface typeface2 = this.f10121u;
                if (Math.abs(f6 - 0.0f) < 1.0E-5f) {
                    this.F = 1.0f;
                } else {
                    this.F = f(this.h, this.f10109i, f6, this.f10088Q) / this.h;
                }
                float f11 = this.f10109i / this.h;
                float f12 = width2 * f11;
                if (z3 || f12 <= width) {
                    width = width2;
                } else {
                    width = Math.min(width / f11, width2);
                }
                f8 = f9;
                f7 = f10;
                typeface = typeface2;
            }
            int i2 = (width > 0.0f ? 1 : (width == 0.0f ? 0 : -1));
            TextPaint textPaint = this.f10085N;
            if (i2 > 0) {
                if (this.f10078G != f8) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                if (this.f10095X != f7) {
                    z7 = true;
                } else {
                    z7 = false;
                }
                if (this.f10124x != typeface) {
                    z8 = true;
                } else {
                    z8 = false;
                }
                StaticLayout staticLayout = this.f10096Y;
                if (staticLayout == null || width == ((float) staticLayout.getWidth())) {
                    z9 = false;
                } else {
                    z9 = true;
                }
                if (z6 || z7 || z9 || z8 || this.f10084M) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                this.f10078G = f8;
                this.f10095X = f7;
                this.f10124x = typeface;
                this.f10084M = false;
                if (this.F != 1.0f) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                textPaint.setLinearText(z10);
            } else {
                z5 = false;
            }
            if (this.f10074B == null || z5) {
                textPaint.setTextSize(this.f10078G);
                textPaint.setTypeface(this.f10124x);
                textPaint.setLetterSpacing(this.f10095X);
                boolean b6 = b(this.f10073A);
                this.f10075C = b6;
                int i5 = this.f10104d0;
                if (i5 <= 1 || b6) {
                    i5 = 1;
                }
                if (i5 == 1) {
                    alignment = Layout.Alignment.ALIGN_NORMAL;
                } else {
                    int absoluteGravity = Gravity.getAbsoluteGravity(this.f10107f, b6 ? 1 : 0) & 7;
                    if (absoluteGravity == 1) {
                        alignment = Layout.Alignment.ALIGN_CENTER;
                    } else if (absoluteGravity != 5) {
                        if (this.f10075C) {
                            alignment = Layout.Alignment.ALIGN_OPPOSITE;
                        } else {
                            alignment = Layout.Alignment.ALIGN_NORMAL;
                        }
                    } else if (this.f10075C) {
                        alignment = Layout.Alignment.ALIGN_NORMAL;
                    } else {
                        alignment = Layout.Alignment.ALIGN_OPPOSITE;
                    }
                }
                g gVar = new g(this.f10073A, textPaint, (int) width);
                gVar.f10142k = this.f10126z;
                gVar.f10141j = b6;
                gVar.f10138e = alignment;
                gVar.f10140i = false;
                gVar.f10139f = i5;
                gVar.g = this.f10106e0;
                gVar.h = this.f10108f0;
                StaticLayout a6 = gVar.a();
                a6.getClass();
                this.f10096Y = a6;
                this.f10074B = a6.getText();
            }
        }
    }

    public final float d() {
        TextPaint textPaint = this.f10086O;
        textPaint.setTextSize(this.f10109i);
        textPaint.setTypeface(this.f10118r);
        textPaint.setLetterSpacing(this.f10093V);
        return -textPaint.ascent();
    }

    public final int e(ColorStateList colorStateList) {
        if (colorStateList == null) {
            return 0;
        }
        int[] iArr = this.f10083L;
        if (iArr != null) {
            return colorStateList.getColorForState(iArr, 0);
        }
        return colorStateList.getDefaultColor();
    }

    public final void g(Configuration configuration) {
        if (Build.VERSION.SDK_INT >= 31) {
            Typeface typeface = this.f10120t;
            if (typeface != null) {
                this.f10119s = e.j0(configuration, typeface);
            }
            Typeface typeface2 = this.f10123w;
            if (typeface2 != null) {
                this.f10122v = e.j0(configuration, typeface2);
            }
            Typeface typeface3 = this.f10119s;
            if (typeface3 == null) {
                typeface3 = this.f10120t;
            }
            this.f10118r = typeface3;
            Typeface typeface4 = this.f10122v;
            if (typeface4 == null) {
                typeface4 = this.f10123w;
            }
            this.f10121u = typeface4;
            h(true);
        }
    }

    public final void h(boolean z3) {
        float f6;
        float f7;
        StaticLayout staticLayout;
        boolean z4 = z3;
        TextInputLayout textInputLayout = this.f10098a;
        if ((textInputLayout.getHeight() > 0 && textInputLayout.getWidth() > 0) || z4) {
            c(1.0f, z4);
            CharSequence charSequence = this.f10074B;
            TextPaint textPaint = this.f10085N;
            if (!(charSequence == null || (staticLayout = this.f10096Y) == null)) {
                this.f10103c0 = TextUtils.ellipsize(charSequence, textPaint, (float) staticLayout.getWidth(), this.f10126z);
            }
            CharSequence charSequence2 = this.f10103c0;
            if (charSequence2 != null) {
                this.f10097Z = textPaint.measureText(charSequence2, 0, charSequence2.length());
            } else {
                this.f10097Z = 0.0f;
            }
            int absoluteGravity = Gravity.getAbsoluteGravity(this.g, this.f10075C ? 1 : 0);
            int i2 = absoluteGravity & 112;
            Rect rect = this.d;
            if (i2 == 48) {
                this.f10113m = (float) rect.top;
            } else if (i2 != 80) {
                this.f10113m = ((float) rect.centerY()) - ((textPaint.descent() - textPaint.ascent()) / 2.0f);
            } else {
                this.f10113m = textPaint.ascent() + ((float) rect.bottom);
            }
            int i5 = absoluteGravity & 8388615;
            if (i5 == 1) {
                this.f10115o = ((float) rect.centerX()) - (this.f10097Z / 2.0f);
            } else if (i5 != 5) {
                this.f10115o = (float) rect.left;
            } else {
                this.f10115o = ((float) rect.right) - this.f10097Z;
            }
            c(0.0f, z4);
            StaticLayout staticLayout2 = this.f10096Y;
            if (staticLayout2 != null) {
                f6 = (float) staticLayout2.getHeight();
            } else {
                f6 = 0.0f;
            }
            StaticLayout staticLayout3 = this.f10096Y;
            if (staticLayout3 == null || this.f10104d0 <= 1) {
                CharSequence charSequence3 = this.f10074B;
                if (charSequence3 != null) {
                    f7 = textPaint.measureText(charSequence3, 0, charSequence3.length());
                } else {
                    f7 = 0.0f;
                }
            } else {
                f7 = (float) staticLayout3.getWidth();
            }
            StaticLayout staticLayout4 = this.f10096Y;
            if (staticLayout4 != null) {
                staticLayout4.getLineCount();
            }
            int absoluteGravity2 = Gravity.getAbsoluteGravity(this.f10107f, this.f10075C ? 1 : 0);
            int i6 = absoluteGravity2 & 112;
            Rect rect2 = this.f10102c;
            if (i6 == 48) {
                this.f10112l = (float) rect2.top;
            } else if (i6 != 80) {
                this.f10112l = ((float) rect2.centerY()) - (f6 / 2.0f);
            } else {
                this.f10112l = textPaint.descent() + (((float) rect2.bottom) - f6);
            }
            int i7 = absoluteGravity2 & 8388615;
            if (i7 == 1) {
                this.f10114n = ((float) rect2.centerX()) - (f7 / 2.0f);
            } else if (i7 != 5) {
                this.f10114n = (float) rect2.left;
            } else {
                this.f10114n = ((float) rect2.right) - f7;
            }
            Bitmap bitmap = this.f10077E;
            if (bitmap != null) {
                bitmap.recycle();
                this.f10077E = null;
            }
            l(this.f10100b);
            float f8 = this.f10100b;
            float f9 = f((float) rect2.left, (float) rect.left, f8, this.f10087P);
            RectF rectF = this.f10105e;
            rectF.left = f9;
            rectF.top = f(this.f10112l, this.f10113m, f8, this.f10087P);
            rectF.right = f((float) rect2.right, (float) rect.right, f8, this.f10087P);
            rectF.bottom = f((float) rect2.bottom, (float) rect.bottom, f8, this.f10087P);
            this.f10116p = f(this.f10114n, this.f10115o, f8, this.f10087P);
            this.f10117q = f(this.f10112l, this.f10113m, f8, this.f10087P);
            l(f8);
            C0254a aVar = a.f4470b;
            this.f10099a0 = 1.0f - f(0.0f, 1.0f, 1.0f - f8, aVar);
            WeakHashMap weakHashMap = O.f1352a;
            textInputLayout.postInvalidateOnAnimation();
            this.f10101b0 = f(1.0f, 0.0f, f8, aVar);
            textInputLayout.postInvalidateOnAnimation();
            ColorStateList colorStateList = this.f10111k;
            ColorStateList colorStateList2 = this.f10110j;
            if (colorStateList != colorStateList2) {
                textPaint.setColor(a(e(colorStateList2), e(this.f10111k), f8));
            } else {
                textPaint.setColor(e(colorStateList));
            }
            float f10 = this.f10093V;
            float f11 = this.f10094W;
            if (f10 != f11) {
                textPaint.setLetterSpacing(f(f11, f10, f8, aVar));
            } else {
                textPaint.setLetterSpacing(f10);
            }
            this.f10079H = a.a(0.0f, this.f10089R, f8);
            this.f10080I = a.a(0.0f, this.f10090S, f8);
            this.f10081J = a.a(0.0f, this.f10091T, f8);
            int a6 = a(0, e(this.f10092U), f8);
            this.f10082K = a6;
            textPaint.setShadowLayer(this.f10079H, this.f10080I, this.f10081J, a6);
            textInputLayout.postInvalidateOnAnimation();
        }
    }

    public final void i(ColorStateList colorStateList) {
        if (this.f10111k != colorStateList || this.f10110j != colorStateList) {
            this.f10111k = colorStateList;
            this.f10110j = colorStateList;
            h(false);
        }
    }

    public final boolean j(Typeface typeface) {
        C0913a aVar = this.f10125y;
        if (aVar != null) {
            aVar.f10976r = true;
        }
        if (this.f10120t == typeface) {
            return false;
        }
        this.f10120t = typeface;
        Typeface j02 = e.j0(this.f10098a.getContext().getResources().getConfiguration(), typeface);
        this.f10119s = j02;
        if (j02 == null) {
            j02 = this.f10120t;
        }
        this.f10118r = j02;
        return true;
    }

    public final void k(float f6) {
        if (f6 < 0.0f) {
            f6 = 0.0f;
        } else if (f6 > 1.0f) {
            f6 = 1.0f;
        }
        if (f6 != this.f10100b) {
            this.f10100b = f6;
            Rect rect = this.f10102c;
            Rect rect2 = this.d;
            float f7 = f((float) rect.left, (float) rect2.left, f6, this.f10087P);
            RectF rectF = this.f10105e;
            rectF.left = f7;
            rectF.top = f(this.f10112l, this.f10113m, f6, this.f10087P);
            rectF.right = f((float) rect.right, (float) rect2.right, f6, this.f10087P);
            rectF.bottom = f((float) rect.bottom, (float) rect2.bottom, f6, this.f10087P);
            this.f10116p = f(this.f10114n, this.f10115o, f6, this.f10087P);
            this.f10117q = f(this.f10112l, this.f10113m, f6, this.f10087P);
            l(f6);
            C0254a aVar = a.f4470b;
            this.f10099a0 = 1.0f - f(0.0f, 1.0f, 1.0f - f6, aVar);
            WeakHashMap weakHashMap = O.f1352a;
            TextInputLayout textInputLayout = this.f10098a;
            textInputLayout.postInvalidateOnAnimation();
            this.f10101b0 = f(1.0f, 0.0f, f6, aVar);
            textInputLayout.postInvalidateOnAnimation();
            ColorStateList colorStateList = this.f10111k;
            ColorStateList colorStateList2 = this.f10110j;
            TextPaint textPaint = this.f10085N;
            if (colorStateList != colorStateList2) {
                textPaint.setColor(a(e(colorStateList2), e(this.f10111k), f6));
            } else {
                textPaint.setColor(e(colorStateList));
            }
            float f8 = this.f10093V;
            float f9 = this.f10094W;
            if (f8 != f9) {
                textPaint.setLetterSpacing(f(f9, f8, f6, aVar));
            } else {
                textPaint.setLetterSpacing(f8);
            }
            this.f10079H = a.a(0.0f, this.f10089R, f6);
            this.f10080I = a.a(0.0f, this.f10090S, f6);
            this.f10081J = a.a(0.0f, this.f10091T, f6);
            int a6 = a(0, e(this.f10092U), f6);
            this.f10082K = a6;
            textPaint.setShadowLayer(this.f10079H, this.f10080I, this.f10081J, a6);
            textInputLayout.postInvalidateOnAnimation();
        }
    }

    public final void l(float f6) {
        c(f6, false);
        WeakHashMap weakHashMap = O.f1352a;
        this.f10098a.postInvalidateOnAnimation();
    }

    public final void m(Typeface typeface) {
        boolean z3;
        boolean j6 = j(typeface);
        if (this.f10123w != typeface) {
            this.f10123w = typeface;
            Typeface j02 = e.j0(this.f10098a.getContext().getResources().getConfiguration(), typeface);
            this.f10122v = j02;
            if (j02 == null) {
                j02 = this.f10123w;
            }
            this.f10121u = j02;
            z3 = true;
        } else {
            z3 = false;
        }
        if (j6 || z3) {
            h(false);
        }
    }
}
