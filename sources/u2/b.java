package u2;

import D.a;
import K.B;
import K.O;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.util.WeakHashMap;
import s2.k;

public abstract class b extends FrameLayout {

    /* renamed from: r  reason: collision with root package name */
    public static final C1030a f11839r = new Object();

    /* renamed from: a  reason: collision with root package name */
    public final k f11840a;

    /* renamed from: b  reason: collision with root package name */
    public int f11841b;

    /* renamed from: c  reason: collision with root package name */
    public final float f11842c;
    public final float d;

    /* renamed from: e  reason: collision with root package name */
    public final int f11843e;

    /* renamed from: f  reason: collision with root package name */
    public final int f11844f;

    /* renamed from: p  reason: collision with root package name */
    public ColorStateList f11845p;

    /* renamed from: q  reason: collision with root package name */
    public PorterDuff.Mode f11846q;

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v1, resolved type: android.graphics.drawable.GradientDrawable} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v2, resolved type: android.graphics.drawable.GradientDrawable} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v4, resolved type: s2.g} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v5, resolved type: android.graphics.drawable.GradientDrawable} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public b(android.content.Context r5, android.util.AttributeSet r6) {
        /*
            r4 = this;
            r0 = 0
            android.content.Context r5 = x2.C1097a.a(r5, r6, r0, r0)
            r4.<init>(r5, r6)
            android.content.Context r5 = r4.getContext()
            int[] r1 = Y1.a.f4267x
            android.content.res.TypedArray r1 = r5.obtainStyledAttributes(r6, r1)
            r2 = 6
            boolean r3 = r1.hasValue(r2)
            if (r3 == 0) goto L_0x0023
            int r2 = r1.getDimensionPixelSize(r2, r0)
            float r2 = (float) r2
            java.util.WeakHashMap r3 = K.O.f1352a
            K.D.s(r4, r2)
        L_0x0023:
            r2 = 2
            int r2 = r1.getInt(r2, r0)
            r4.f11841b = r2
            r2 = 8
            boolean r2 = r1.hasValue(r2)
            if (r2 != 0) goto L_0x003a
            r2 = 9
            boolean r2 = r1.hasValue(r2)
            if (r2 == 0) goto L_0x0044
        L_0x003a:
            s2.j r6 = s2.k.b(r5, r6, r0, r0)
            s2.k r6 = r6.a()
            r4.f11840a = r6
        L_0x0044:
            r6 = 3
            r2 = 1065353216(0x3f800000, float:1.0)
            float r6 = r1.getFloat(r6, r2)
            r4.f11842c = r6
            r6 = 4
            android.content.res.ColorStateList r5 = com.bumptech.glide.d.a0(r5, r1, r6)
            r4.setBackgroundTintList(r5)
            r5 = 5
            r6 = -1
            int r5 = r1.getInt(r5, r6)
            android.graphics.PorterDuff$Mode r3 = android.graphics.PorterDuff.Mode.SRC_IN
            android.graphics.PorterDuff$Mode r5 = m2.k.g(r5, r3)
            r4.setBackgroundTintMode(r5)
            r5 = 1
            float r2 = r1.getFloat(r5, r2)
            r4.d = r2
            int r2 = r1.getDimensionPixelSize(r0, r6)
            r4.f11843e = r2
            r2 = 7
            int r6 = r1.getDimensionPixelSize(r2, r6)
            r4.f11844f = r6
            r1.recycle()
            u2.a r6 = f11839r
            r4.setOnTouchListener(r6)
            r4.setFocusable(r5)
            android.graphics.drawable.Drawable r5 = r4.getBackground()
            if (r5 != 0) goto L_0x00da
            float r5 = r4.getBackgroundOverlayColorAlpha()
            r6 = 2130903331(0x7f030123, float:1.7413477E38)
            int r6 = K1.e.t(r4, r6)
            r1 = 2130903308(0x7f03010c, float:1.741343E38)
            int r1 = K1.e.t(r4, r1)
            int r5 = K1.e.h0(r6, r1, r5)
            s2.k r6 = r4.f11840a
            if (r6 == 0) goto L_0x00b2
            int r0 = u2.c.f11847a
            s2.g r0 = new s2.g
            r0.<init>((s2.k) r6)
            android.content.res.ColorStateList r5 = android.content.res.ColorStateList.valueOf(r5)
            r0.j(r5)
            goto L_0x00ce
        L_0x00b2:
            android.content.res.Resources r6 = r4.getResources()
            int r1 = u2.c.f11847a
            r1 = 2131100403(0x7f0602f3, float:1.7813186E38)
            float r6 = r6.getDimension(r1)
            android.graphics.drawable.GradientDrawable r1 = new android.graphics.drawable.GradientDrawable
            r1.<init>()
            r1.setShape(r0)
            r1.setCornerRadius(r6)
            r1.setColor(r5)
            r0 = r1
        L_0x00ce:
            android.content.res.ColorStateList r5 = r4.f11845p
            if (r5 == 0) goto L_0x00d5
            D.a.h(r0, r5)
        L_0x00d5:
            java.util.WeakHashMap r5 = K.O.f1352a
            r4.setBackground(r0)
        L_0x00da:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: u2.b.<init>(android.content.Context, android.util.AttributeSet):void");
    }

    public float getActionTextColorAlpha() {
        return this.d;
    }

    public int getAnimationMode() {
        return this.f11841b;
    }

    public float getBackgroundOverlayColorAlpha() {
        return this.f11842c;
    }

    public int getMaxInlineActionWidth() {
        return this.f11844f;
    }

    public int getMaxWidth() {
        return this.f11843e;
    }

    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        WeakHashMap weakHashMap = O.f1352a;
        B.c(this);
    }

    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }

    public final void onLayout(boolean z3, int i2, int i5, int i6, int i7) {
        super.onLayout(z3, i2, i5, i6, i7);
    }

    public void onMeasure(int i2, int i5) {
        super.onMeasure(i2, i5);
        int i6 = this.f11843e;
        if (i6 > 0 && getMeasuredWidth() > i6) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(i6, 1073741824), i5);
        }
    }

    public void setAnimationMode(int i2) {
        this.f11841b = i2;
    }

    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    public void setBackgroundDrawable(Drawable drawable) {
        if (!(drawable == null || this.f11845p == null)) {
            drawable = drawable.mutate();
            a.h(drawable, this.f11845p);
            a.i(drawable, this.f11846q);
        }
        super.setBackgroundDrawable(drawable);
    }

    public void setBackgroundTintList(ColorStateList colorStateList) {
        this.f11845p = colorStateList;
        if (getBackground() != null) {
            Drawable mutate = getBackground().mutate();
            a.h(mutate, colorStateList);
            a.i(mutate, this.f11846q);
            if (mutate != getBackground()) {
                super.setBackgroundDrawable(mutate);
            }
        }
    }

    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        this.f11846q = mode;
        if (getBackground() != null) {
            Drawable mutate = getBackground().mutate();
            a.i(mutate, mode);
            if (mutate != getBackground()) {
                super.setBackgroundDrawable(mutate);
            }
        }
    }

    public void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
        super.setLayoutParams(layoutParams);
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            new Rect(marginLayoutParams.leftMargin, marginLayoutParams.topMargin, marginLayoutParams.rightMargin, marginLayoutParams.bottomMargin);
        }
    }

    public void setOnClickListener(View.OnClickListener onClickListener) {
        C1030a aVar;
        if (onClickListener != null) {
            aVar = null;
        } else {
            aVar = f11839r;
        }
        setOnTouchListener(aVar);
        super.setOnClickListener(onClickListener);
    }

    private void setBaseTransientBottomBar(c cVar) {
    }
}
