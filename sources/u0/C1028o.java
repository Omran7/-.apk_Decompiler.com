package u0;

import B.c;
import D.a;
import D.b;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import java.util.ArrayDeque;
import n.e;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: u0.o  reason: case insensitive filesystem */
public final class C1028o extends C1019f {

    /* renamed from: s  reason: collision with root package name */
    public static final PorterDuff.Mode f11831s = PorterDuff.Mode.SRC_IN;

    /* renamed from: b  reason: collision with root package name */
    public C1026m f11832b;

    /* renamed from: c  reason: collision with root package name */
    public PorterDuffColorFilter f11833c;
    public ColorFilter d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f11834e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f11835f = true;

    /* renamed from: p  reason: collision with root package name */
    public final float[] f11836p = new float[9];

    /* renamed from: q  reason: collision with root package name */
    public final Matrix f11837q = new Matrix();

    /* renamed from: r  reason: collision with root package name */
    public final Rect f11838r = new Rect();

    /* JADX WARNING: type inference failed for: r0v5, types: [android.graphics.drawable.Drawable$ConstantState, u0.m] */
    public C1028o() {
        ? constantState = new Drawable.ConstantState();
        constantState.f11823c = null;
        constantState.d = f11831s;
        constantState.f11822b = new C1025l();
        this.f11832b = constantState;
    }

    public final PorterDuffColorFilter a(ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
    }

    public final boolean canApplyTheme() {
        Drawable drawable = this.f11788a;
        if (drawable == null) {
            return false;
        }
        a.b(drawable);
        return false;
    }

    public final void draw(Canvas canvas) {
        Paint paint;
        Canvas canvas2 = canvas;
        Drawable drawable = this.f11788a;
        if (drawable != null) {
            drawable.draw(canvas2);
            return;
        }
        Rect rect = this.f11838r;
        copyBounds(rect);
        if (rect.width() > 0 && rect.height() > 0) {
            ColorFilter colorFilter = this.d;
            if (colorFilter == null) {
                colorFilter = this.f11833c;
            }
            Matrix matrix = this.f11837q;
            canvas2.getMatrix(matrix);
            float[] fArr = this.f11836p;
            matrix.getValues(fArr);
            float abs = Math.abs(fArr[0]);
            float abs2 = Math.abs(fArr[4]);
            float abs3 = Math.abs(fArr[1]);
            float abs4 = Math.abs(fArr[3]);
            if (!(abs3 == 0.0f && abs4 == 0.0f)) {
                abs = 1.0f;
                abs2 = 1.0f;
            }
            int min = Math.min(2048, (int) (((float) rect.width()) * abs));
            int min2 = Math.min(2048, (int) (((float) rect.height()) * abs2));
            if (min > 0 && min2 > 0) {
                int save = canvas.save();
                canvas2.translate((float) rect.left, (float) rect.top);
                if (isAutoMirrored() && b.a(this) == 1) {
                    canvas2.translate((float) rect.width(), 0.0f);
                    canvas2.scale(-1.0f, 1.0f);
                }
                rect.offsetTo(0, 0);
                C1026m mVar = this.f11832b;
                Bitmap bitmap = mVar.f11825f;
                if (!(bitmap != null && min == bitmap.getWidth() && min2 == mVar.f11825f.getHeight())) {
                    mVar.f11825f = Bitmap.createBitmap(min, min2, Bitmap.Config.ARGB_8888);
                    mVar.f11828k = true;
                }
                if (!this.f11835f) {
                    C1026m mVar2 = this.f11832b;
                    mVar2.f11825f.eraseColor(0);
                    Canvas canvas3 = new Canvas(mVar2.f11825f);
                    C1025l lVar = mVar2.f11822b;
                    lVar.a(lVar.g, C1025l.f11808p, canvas3, min, min2);
                } else {
                    C1026m mVar3 = this.f11832b;
                    if (!(!mVar3.f11828k && mVar3.g == mVar3.f11823c && mVar3.h == mVar3.d && mVar3.f11827j == mVar3.f11824e && mVar3.f11826i == mVar3.f11822b.getRootAlpha())) {
                        C1026m mVar4 = this.f11832b;
                        mVar4.f11825f.eraseColor(0);
                        Canvas canvas4 = new Canvas(mVar4.f11825f);
                        C1025l lVar2 = mVar4.f11822b;
                        lVar2.a(lVar2.g, C1025l.f11808p, canvas4, min, min2);
                        C1026m mVar5 = this.f11832b;
                        mVar5.g = mVar5.f11823c;
                        mVar5.h = mVar5.d;
                        mVar5.f11826i = mVar5.f11822b.getRootAlpha();
                        mVar5.f11827j = mVar5.f11824e;
                        mVar5.f11828k = false;
                    }
                }
                C1026m mVar6 = this.f11832b;
                if (mVar6.f11822b.getRootAlpha() >= 255 && colorFilter == null) {
                    paint = null;
                } else {
                    if (mVar6.f11829l == null) {
                        Paint paint2 = new Paint();
                        mVar6.f11829l = paint2;
                        paint2.setFilterBitmap(true);
                    }
                    mVar6.f11829l.setAlpha(mVar6.f11822b.getRootAlpha());
                    mVar6.f11829l.setColorFilter(colorFilter);
                    paint = mVar6.f11829l;
                }
                canvas2.drawBitmap(mVar6.f11825f, (Rect) null, rect, paint);
                canvas2.restoreToCount(save);
            }
        }
    }

    public final int getAlpha() {
        Drawable drawable = this.f11788a;
        if (drawable != null) {
            return drawable.getAlpha();
        }
        return this.f11832b.f11822b.getRootAlpha();
    }

    public final int getChangingConfigurations() {
        Drawable drawable = this.f11788a;
        if (drawable != null) {
            return drawable.getChangingConfigurations();
        }
        return super.getChangingConfigurations() | this.f11832b.getChangingConfigurations();
    }

    public final ColorFilter getColorFilter() {
        Drawable drawable = this.f11788a;
        if (drawable != null) {
            return a.c(drawable);
        }
        return this.d;
    }

    public final Drawable.ConstantState getConstantState() {
        if (this.f11788a != null) {
            return new C1027n(this.f11788a.getConstantState());
        }
        this.f11832b.f11821a = getChangingConfigurations();
        return this.f11832b;
    }

    public final int getIntrinsicHeight() {
        Drawable drawable = this.f11788a;
        if (drawable != null) {
            return drawable.getIntrinsicHeight();
        }
        return (int) this.f11832b.f11822b.f11814i;
    }

    public final int getIntrinsicWidth() {
        Drawable drawable = this.f11788a;
        if (drawable != null) {
            return drawable.getIntrinsicWidth();
        }
        return (int) this.f11832b.f11822b.h;
    }

    public final int getOpacity() {
        Drawable drawable = this.f11788a;
        if (drawable != null) {
            return drawable.getOpacity();
        }
        return -3;
    }

    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) {
        Drawable drawable = this.f11788a;
        if (drawable != null) {
            drawable.inflate(resources, xmlPullParser, attributeSet);
        } else {
            inflate(resources, xmlPullParser, attributeSet, (Resources.Theme) null);
        }
    }

    public final void invalidateSelf() {
        Drawable drawable = this.f11788a;
        if (drawable != null) {
            drawable.invalidateSelf();
        } else {
            super.invalidateSelf();
        }
    }

    public final boolean isAutoMirrored() {
        Drawable drawable = this.f11788a;
        if (drawable != null) {
            return drawable.isAutoMirrored();
        }
        return this.f11832b.f11824e;
    }

    public final boolean isStateful() {
        ColorStateList colorStateList;
        Drawable drawable = this.f11788a;
        if (drawable != null) {
            return drawable.isStateful();
        }
        if (!super.isStateful()) {
            C1026m mVar = this.f11832b;
            if (mVar != null) {
                C1025l lVar = mVar.f11822b;
                if (lVar.f11819n == null) {
                    lVar.f11819n = Boolean.valueOf(lVar.g.a());
                }
                if (lVar.f11819n.booleanValue() || ((colorStateList = this.f11832b.f11823c) != null && colorStateList.isStateful())) {
                    return true;
                }
            }
            return false;
        }
        return true;
    }

    /* JADX WARNING: type inference failed for: r0v3, types: [android.graphics.drawable.Drawable$ConstantState, u0.m] */
    public final Drawable mutate() {
        Drawable drawable = this.f11788a;
        if (drawable != null) {
            drawable.mutate();
            return this;
        }
        if (!this.f11834e && super.mutate() == this) {
            C1026m mVar = this.f11832b;
            ? constantState = new Drawable.ConstantState();
            constantState.f11823c = null;
            constantState.d = f11831s;
            if (mVar != null) {
                constantState.f11821a = mVar.f11821a;
                C1025l lVar = new C1025l(mVar.f11822b);
                constantState.f11822b = lVar;
                if (mVar.f11822b.f11812e != null) {
                    lVar.f11812e = new Paint(mVar.f11822b.f11812e);
                }
                if (mVar.f11822b.d != null) {
                    constantState.f11822b.d = new Paint(mVar.f11822b.d);
                }
                constantState.f11823c = mVar.f11823c;
                constantState.d = mVar.d;
                constantState.f11824e = mVar.f11824e;
            }
            this.f11832b = constantState;
            this.f11834e = true;
        }
        return this;
    }

    public final void onBoundsChange(Rect rect) {
        Drawable drawable = this.f11788a;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
    }

    public final boolean onStateChange(int[] iArr) {
        boolean z3;
        PorterDuff.Mode mode;
        Drawable drawable = this.f11788a;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        C1026m mVar = this.f11832b;
        ColorStateList colorStateList = mVar.f11823c;
        if (colorStateList == null || (mode = mVar.d) == null) {
            z3 = false;
        } else {
            this.f11833c = a(colorStateList, mode);
            invalidateSelf();
            z3 = true;
        }
        C1025l lVar = mVar.f11822b;
        if (lVar.f11819n == null) {
            lVar.f11819n = Boolean.valueOf(lVar.g.a());
        }
        if (lVar.f11819n.booleanValue()) {
            boolean b6 = mVar.f11822b.g.b(iArr);
            mVar.f11828k |= b6;
            if (b6) {
                invalidateSelf();
                return true;
            }
        }
        return z3;
    }

    public final void scheduleSelf(Runnable runnable, long j6) {
        Drawable drawable = this.f11788a;
        if (drawable != null) {
            drawable.scheduleSelf(runnable, j6);
        } else {
            super.scheduleSelf(runnable, j6);
        }
    }

    public final void setAlpha(int i2) {
        Drawable drawable = this.f11788a;
        if (drawable != null) {
            drawable.setAlpha(i2);
        } else if (this.f11832b.f11822b.getRootAlpha() != i2) {
            this.f11832b.f11822b.setRootAlpha(i2);
            invalidateSelf();
        }
    }

    public final void setAutoMirrored(boolean z3) {
        Drawable drawable = this.f11788a;
        if (drawable != null) {
            drawable.setAutoMirrored(z3);
        } else {
            this.f11832b.f11824e = z3;
        }
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f11788a;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
            return;
        }
        this.d = colorFilter;
        invalidateSelf();
    }

    public final void setTint(int i2) {
        Drawable drawable = this.f11788a;
        if (drawable != null) {
            R2.b.S0(drawable, i2);
        } else {
            setTintList(ColorStateList.valueOf(i2));
        }
    }

    public final void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.f11788a;
        if (drawable != null) {
            a.h(drawable, colorStateList);
            return;
        }
        C1026m mVar = this.f11832b;
        if (mVar.f11823c != colorStateList) {
            mVar.f11823c = colorStateList;
            this.f11833c = a(colorStateList, mVar.d);
            invalidateSelf();
        }
    }

    public final void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.f11788a;
        if (drawable != null) {
            a.i(drawable, mode);
            return;
        }
        C1026m mVar = this.f11832b;
        if (mVar.d != mode) {
            mVar.d = mode;
            this.f11833c = a(mVar.f11823c, mode);
            invalidateSelf();
        }
    }

    public final boolean setVisible(boolean z3, boolean z4) {
        Drawable drawable = this.f11788a;
        if (drawable != null) {
            return drawable.setVisible(z3, z4);
        }
        return super.setVisible(z3, z4);
    }

    public final void unscheduleSelf(Runnable runnable) {
        Drawable drawable = this.f11788a;
        if (drawable != null) {
            drawable.unscheduleSelf(runnable);
        } else {
            super.unscheduleSelf(runnable);
        }
    }

    /* JADX WARNING: type inference failed for: r9v14, types: [u0.h, java.lang.Object, u0.k] */
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        int i2;
        int i5;
        C1025l lVar;
        char c3;
        int i6;
        boolean z3;
        int i7;
        int i8;
        Paint.Cap cap;
        int i9;
        Resources resources2 = resources;
        XmlPullParser xmlPullParser2 = xmlPullParser;
        AttributeSet attributeSet2 = attributeSet;
        Resources.Theme theme2 = theme;
        Drawable drawable = this.f11788a;
        if (drawable != null) {
            a.d(drawable, resources2, xmlPullParser2, attributeSet2, theme2);
            return;
        }
        C1026m mVar = this.f11832b;
        mVar.f11822b = new C1025l();
        TypedArray f6 = B.b.f(resources2, theme2, attributeSet2, C1014a.f11774a);
        C1026m mVar2 = this.f11832b;
        C1025l lVar2 = mVar2.f11822b;
        if (!B.b.c(xmlPullParser2, "tintMode")) {
            i2 = -1;
        } else {
            i2 = f6.getInt(6, -1);
        }
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        int i10 = 3;
        if (i2 == 3) {
            mode = PorterDuff.Mode.SRC_OVER;
        } else if (i2 != 5) {
            if (i2 != 9) {
                switch (i2) {
                    case 14:
                        mode = PorterDuff.Mode.MULTIPLY;
                        break;
                    case 15:
                        mode = PorterDuff.Mode.SCREEN;
                        break;
                    case 16:
                        mode = PorterDuff.Mode.ADD;
                        break;
                }
            } else {
                mode = PorterDuff.Mode.SRC_ATOP;
            }
        }
        mVar2.d = mode;
        int i11 = 1;
        ColorStateList colorStateList = null;
        boolean z4 = false;
        if (B.b.c(xmlPullParser2, "tint")) {
            TypedValue typedValue = new TypedValue();
            f6.getValue(1, typedValue);
            int i12 = typedValue.type;
            if (i12 == 2) {
                throw new UnsupportedOperationException("Failed to resolve attribute at index 1: " + typedValue);
            } else if (i12 < 28 || i12 > 31) {
                Resources resources3 = f6.getResources();
                int resourceId = f6.getResourceId(1, 0);
                ThreadLocal threadLocal = c.f143a;
                try {
                    colorStateList = c.a(resources3, resources3.getXml(resourceId), theme2);
                } catch (Exception e6) {
                    Log.e("CSLCompat", "Failed to inflate ColorStateList.", e6);
                }
            } else {
                colorStateList = ColorStateList.valueOf(typedValue.data);
            }
        }
        ColorStateList colorStateList2 = colorStateList;
        if (colorStateList2 != null) {
            mVar2.f11823c = colorStateList2;
        }
        boolean z5 = mVar2.f11824e;
        if (B.b.c(xmlPullParser2, "autoMirrored")) {
            z5 = f6.getBoolean(5, z5);
        }
        mVar2.f11824e = z5;
        float f7 = lVar2.f11815j;
        if (B.b.c(xmlPullParser2, "viewportWidth")) {
            f7 = f6.getFloat(7, f7);
        }
        lVar2.f11815j = f7;
        float f8 = lVar2.f11816k;
        if (B.b.c(xmlPullParser2, "viewportHeight")) {
            f8 = f6.getFloat(8, f8);
        }
        lVar2.f11816k = f8;
        if (lVar2.f11815j <= 0.0f) {
            throw new XmlPullParserException(f6.getPositionDescription() + "<vector> tag requires viewportWidth > 0");
        } else if (f8 > 0.0f) {
            lVar2.h = f6.getDimension(3, lVar2.h);
            float dimension = f6.getDimension(2, lVar2.f11814i);
            lVar2.f11814i = dimension;
            if (lVar2.h <= 0.0f) {
                throw new XmlPullParserException(f6.getPositionDescription() + "<vector> tag requires width > 0");
            } else if (dimension > 0.0f) {
                float alpha = lVar2.getAlpha();
                if (B.b.c(xmlPullParser2, "alpha")) {
                    alpha = f6.getFloat(4, alpha);
                }
                lVar2.setAlpha(alpha);
                String string = f6.getString(0);
                if (string != null) {
                    lVar2.f11818m = string;
                    lVar2.f11820o.put(string, lVar2);
                }
                f6.recycle();
                mVar.f11821a = getChangingConfigurations();
                mVar.f11828k = true;
                C1026m mVar3 = this.f11832b;
                C1025l lVar3 = mVar3.f11822b;
                ArrayDeque arrayDeque = new ArrayDeque();
                arrayDeque.push(lVar3.g);
                int eventType = xmlPullParser.getEventType();
                int depth = xmlPullParser.getDepth() + 1;
                boolean z6 = true;
                while (eventType != i11 && (xmlPullParser.getDepth() >= depth || eventType != i10)) {
                    if (eventType == 2) {
                        String name = xmlPullParser.getName();
                        C1022i iVar = (C1022i) arrayDeque.peek();
                        boolean equals = "path".equals(name);
                        e eVar = lVar3.f11820o;
                        lVar = lVar3;
                        if (equals) {
                            ? kVar = new C1024k();
                            kVar.f11789e = 0.0f;
                            kVar.g = 1.0f;
                            kVar.h = 1.0f;
                            kVar.f11791i = 0.0f;
                            kVar.f11792j = 1.0f;
                            kVar.f11793k = 0.0f;
                            Paint.Cap cap2 = Paint.Cap.BUTT;
                            kVar.f11794l = cap2;
                            Paint.Join join = Paint.Join.MITER;
                            kVar.f11795m = join;
                            i5 = depth;
                            kVar.f11796n = 4.0f;
                            TypedArray f9 = B.b.f(resources2, theme2, attributeSet2, C1014a.f11776c);
                            if (B.b.c(xmlPullParser2, "pathData")) {
                                Paint.Cap cap3 = cap2;
                                String string2 = f9.getString(0);
                                if (string2 != null) {
                                    kVar.f11806b = string2;
                                }
                                String string3 = f9.getString(2);
                                if (string3 != null) {
                                    kVar.f11805a = com.bumptech.glide.c.k(string3);
                                }
                                kVar.f11790f = B.b.b(f9, xmlPullParser2, theme2, "fillColor", 1);
                                float f10 = kVar.h;
                                if (B.b.c(xmlPullParser2, "fillAlpha")) {
                                    f10 = f9.getFloat(12, f10);
                                }
                                kVar.h = f10;
                                if (!B.b.c(xmlPullParser2, "strokeLineCap")) {
                                    i8 = -1;
                                } else {
                                    i8 = f9.getInt(8, -1);
                                }
                                Paint.Cap cap4 = kVar.f11794l;
                                if (i8 != 0) {
                                    cap = i8 != 1 ? i8 != 2 ? cap4 : Paint.Cap.SQUARE : Paint.Cap.ROUND;
                                } else {
                                    cap = cap3;
                                }
                                kVar.f11794l = cap;
                                if (!B.b.c(xmlPullParser2, "strokeLineJoin")) {
                                    i9 = -1;
                                } else {
                                    i9 = f9.getInt(9, -1);
                                }
                                Paint.Join join2 = kVar.f11795m;
                                if (i9 != 0) {
                                    Paint.Join join3 = join2;
                                    if (i9 == 1) {
                                        join = Paint.Join.ROUND;
                                    } else if (i9 != 2) {
                                        join = join3;
                                    } else {
                                        join = Paint.Join.BEVEL;
                                    }
                                }
                                kVar.f11795m = join;
                                float f11 = kVar.f11796n;
                                if (B.b.c(xmlPullParser2, "strokeMiterLimit")) {
                                    f11 = f9.getFloat(10, f11);
                                }
                                kVar.f11796n = f11;
                                kVar.d = B.b.b(f9, xmlPullParser2, theme2, "strokeColor", 3);
                                float f12 = kVar.g;
                                if (B.b.c(xmlPullParser2, "strokeAlpha")) {
                                    f12 = f9.getFloat(11, f12);
                                }
                                kVar.g = f12;
                                float f13 = kVar.f11789e;
                                if (B.b.c(xmlPullParser2, "strokeWidth")) {
                                    f13 = f9.getFloat(4, f13);
                                }
                                kVar.f11789e = f13;
                                float f14 = kVar.f11792j;
                                if (B.b.c(xmlPullParser2, "trimPathEnd")) {
                                    f14 = f9.getFloat(6, f14);
                                }
                                kVar.f11792j = f14;
                                float f15 = kVar.f11793k;
                                if (B.b.c(xmlPullParser2, "trimPathOffset")) {
                                    f15 = f9.getFloat(7, f15);
                                }
                                kVar.f11793k = f15;
                                float f16 = kVar.f11791i;
                                if (B.b.c(xmlPullParser2, "trimPathStart")) {
                                    f16 = f9.getFloat(5, f16);
                                }
                                kVar.f11791i = f16;
                                int i13 = kVar.f11807c;
                                if (B.b.c(xmlPullParser2, "fillType")) {
                                    i13 = f9.getInt(13, i13);
                                }
                                kVar.f11807c = i13;
                            }
                            f9.recycle();
                            iVar.f11798b.add(kVar);
                            if (kVar.getPathName() != null) {
                                eVar.put(kVar.getPathName(), kVar);
                            }
                            mVar3.f11821a = mVar3.f11821a;
                            z3 = false;
                            c3 = 8;
                            z6 = false;
                        } else {
                            i5 = depth;
                            c3 = 8;
                            if ("clip-path".equals(name)) {
                                C1024k kVar2 = new C1024k();
                                if (B.b.c(xmlPullParser2, "pathData")) {
                                    TypedArray f17 = B.b.f(resources2, theme2, attributeSet2, C1014a.d);
                                    String string4 = f17.getString(0);
                                    if (string4 != null) {
                                        kVar2.f11806b = string4;
                                    }
                                    String string5 = f17.getString(1);
                                    if (string5 != null) {
                                        kVar2.f11805a = com.bumptech.glide.c.k(string5);
                                    }
                                    if (!B.b.c(xmlPullParser2, "fillType")) {
                                        i7 = 0;
                                    } else {
                                        i7 = f17.getInt(2, 0);
                                    }
                                    kVar2.f11807c = i7;
                                    f17.recycle();
                                }
                                iVar.f11798b.add(kVar2);
                                if (kVar2.getPathName() != null) {
                                    eVar.put(kVar2.getPathName(), kVar2);
                                }
                                mVar3.f11821a = mVar3.f11821a;
                            } else if ("group".equals(name)) {
                                C1022i iVar2 = new C1022i();
                                TypedArray f18 = B.b.f(resources2, theme2, attributeSet2, C1014a.f11775b);
                                float f19 = iVar2.f11799c;
                                if (B.b.c(xmlPullParser2, "rotation")) {
                                    f19 = f18.getFloat(5, f19);
                                }
                                iVar2.f11799c = f19;
                                iVar2.d = f18.getFloat(1, iVar2.d);
                                iVar2.f11800e = f18.getFloat(2, iVar2.f11800e);
                                float f20 = iVar2.f11801f;
                                if (B.b.c(xmlPullParser2, "scaleX")) {
                                    f20 = f18.getFloat(3, f20);
                                }
                                iVar2.f11801f = f20;
                                float f21 = iVar2.g;
                                if (B.b.c(xmlPullParser2, "scaleY")) {
                                    f21 = f18.getFloat(4, f21);
                                }
                                iVar2.g = f21;
                                float f22 = iVar2.h;
                                if (B.b.c(xmlPullParser2, "translateX")) {
                                    f22 = f18.getFloat(6, f22);
                                }
                                iVar2.h = f22;
                                float f23 = iVar2.f11802i;
                                if (B.b.c(xmlPullParser2, "translateY")) {
                                    f23 = f18.getFloat(7, f23);
                                }
                                iVar2.f11802i = f23;
                                z3 = false;
                                String string6 = f18.getString(0);
                                if (string6 != null) {
                                    iVar2.f11804k = string6;
                                }
                                iVar2.c();
                                f18.recycle();
                                iVar.f11798b.add(iVar2);
                                arrayDeque.push(iVar2);
                                if (iVar2.getGroupName() != null) {
                                    eVar.put(iVar2.getGroupName(), iVar2);
                                }
                                mVar3.f11821a = mVar3.f11821a;
                            }
                            z3 = false;
                        }
                        i10 = 3;
                        i6 = 1;
                    } else {
                        lVar = lVar3;
                        i5 = depth;
                        z3 = z4;
                        c3 = 8;
                        i6 = i11;
                        i10 = 3;
                        if (eventType == 3 && "group".equals(xmlPullParser.getName())) {
                            arrayDeque.pop();
                        }
                    }
                    eventType = xmlPullParser.next();
                    i11 = i6;
                    char c6 = c3;
                    lVar3 = lVar;
                    z4 = z3;
                    depth = i5;
                }
                if (!z6) {
                    this.f11833c = a(mVar.f11823c, mVar.d);
                    return;
                }
                throw new XmlPullParserException("no path defined");
            } else {
                throw new XmlPullParserException(f6.getPositionDescription() + "<vector> tag requires height > 0");
            }
        } else {
            throw new XmlPullParserException(f6.getPositionDescription() + "<vector> tag requires viewportHeight > 0");
        }
    }

    public C1028o(C1026m mVar) {
        this.f11832b = mVar;
        this.f11833c = a(mVar.f11823c, mVar.d);
    }
}
