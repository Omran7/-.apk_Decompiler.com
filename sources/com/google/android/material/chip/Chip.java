package com.google.android.material.chip;

import A.h;
import B0.H;
import D.b;
import D.g;
import K.C0062b;
import K.O;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.Log;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.PointerIcon;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Checkable;
import android.widget.CompoundButton;
import android.widget.TextView;
import h2.C0555b;
import h2.d;
import h2.e;
import h2.f;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.Locale;
import java.util.WeakHashMap;
import k.C0734r;
import m2.i;
import p2.C0916d;
import q2.C0935a;
import s2.k;
import s2.v;

public class Chip extends C0734r implements e, v, Checkable {
    public static final Rect F = new Rect();

    /* renamed from: G  reason: collision with root package name */
    public static final int[] f6369G = {16842913};

    /* renamed from: H  reason: collision with root package name */
    public static final int[] f6370H = {16842911};

    /* renamed from: A  reason: collision with root package name */
    public final d f6371A;

    /* renamed from: B  reason: collision with root package name */
    public boolean f6372B;

    /* renamed from: C  reason: collision with root package name */
    public final Rect f6373C = new Rect();

    /* renamed from: D  reason: collision with root package name */
    public final RectF f6374D = new RectF();

    /* renamed from: E  reason: collision with root package name */
    public final C0555b f6375E = new C0555b(this, 0);

    /* renamed from: e  reason: collision with root package name */
    public f f6376e;

    /* renamed from: f  reason: collision with root package name */
    public InsetDrawable f6377f;

    /* renamed from: p  reason: collision with root package name */
    public RippleDrawable f6378p;

    /* renamed from: q  reason: collision with root package name */
    public View.OnClickListener f6379q;

    /* renamed from: r  reason: collision with root package name */
    public CompoundButton.OnCheckedChangeListener f6380r;

    /* renamed from: s  reason: collision with root package name */
    public boolean f6381s;

    /* renamed from: t  reason: collision with root package name */
    public boolean f6382t;

    /* renamed from: u  reason: collision with root package name */
    public boolean f6383u;

    /* renamed from: v  reason: collision with root package name */
    public boolean f6384v;

    /* renamed from: w  reason: collision with root package name */
    public boolean f6385w;

    /* renamed from: x  reason: collision with root package name */
    public int f6386x;

    /* renamed from: y  reason: collision with root package name */
    public int f6387y;

    /* renamed from: z  reason: collision with root package name */
    public CharSequence f6388z;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public Chip(android.content.Context r17, android.util.AttributeSet r18) {
        /*
            r16 = this;
            r0 = r16
            r7 = r18
            r8 = 2130903249(0x7f0300d1, float:1.741331E38)
            r1 = 2131952660(0x7f130414, float:1.954177E38)
            r2 = r17
            android.content.Context r1 = x2.C1097a.a(r2, r7, r8, r1)
            r0.<init>(r1, r7, r8)
            android.graphics.Rect r1 = new android.graphics.Rect
            r1.<init>()
            r0.f6373C = r1
            android.graphics.RectF r1 = new android.graphics.RectF
            r1.<init>()
            r0.f6374D = r1
            h2.b r1 = new h2.b
            r2 = 0
            r1.<init>(r0, r2)
            r0.f6375E = r1
            android.content.Context r9 = r16.getContext()
            r10 = 1
            r11 = 8388627(0x800013, float:1.175497E-38)
            if (r7 != 0) goto L_0x0034
            goto L_0x0094
        L_0x0034:
            java.lang.String r1 = "http://schemas.android.com/apk/res/android"
            java.lang.String r2 = "background"
            java.lang.String r2 = r7.getAttributeValue(r1, r2)
            java.lang.String r3 = "Chip"
            if (r2 == 0) goto L_0x0045
            java.lang.String r2 = "Do not set the background; Chip manages its own background drawable."
            android.util.Log.w(r3, r2)
        L_0x0045:
            java.lang.String r2 = "drawableLeft"
            java.lang.String r2 = r7.getAttributeValue(r1, r2)
            if (r2 != 0) goto L_0x03c4
            java.lang.String r2 = "drawableStart"
            java.lang.String r2 = r7.getAttributeValue(r1, r2)
            if (r2 != 0) goto L_0x03bc
            java.lang.String r2 = "drawableEnd"
            java.lang.String r2 = r7.getAttributeValue(r1, r2)
            java.lang.String r4 = "Please set end drawable using R.attr#closeIcon."
            if (r2 != 0) goto L_0x03b6
            java.lang.String r2 = "drawableRight"
            java.lang.String r2 = r7.getAttributeValue(r1, r2)
            if (r2 != 0) goto L_0x03b0
            java.lang.String r2 = "singleLine"
            boolean r2 = r7.getAttributeBooleanValue(r1, r2, r10)
            if (r2 == 0) goto L_0x03a8
            java.lang.String r2 = "lines"
            int r2 = r7.getAttributeIntValue(r1, r2, r10)
            if (r2 != r10) goto L_0x03a8
            java.lang.String r2 = "minLines"
            int r2 = r7.getAttributeIntValue(r1, r2, r10)
            if (r2 != r10) goto L_0x03a8
            java.lang.String r2 = "maxLines"
            int r2 = r7.getAttributeIntValue(r1, r2, r10)
            if (r2 != r10) goto L_0x03a8
            java.lang.String r2 = "gravity"
            int r1 = r7.getAttributeIntValue(r1, r2, r11)
            if (r1 == r11) goto L_0x0094
            java.lang.String r1 = "Chip text must be vertically center and start aligned"
            android.util.Log.w(r3, r1)
        L_0x0094:
            h2.f r12 = new h2.f
            r12.<init>(r9, r7)
            int[] r13 = Y1.a.f4249c
            r14 = 0
            int[] r6 = new int[r14]
            android.content.Context r1 = r12.f8104n0
            r5 = 2131952660(0x7f130414, float:1.954177E38)
            r2 = r18
            r3 = r13
            r4 = r8
            android.content.res.TypedArray r1 = m2.k.f(r1, r2, r3, r4, r5, r6)
            r15 = 37
            boolean r2 = r1.hasValue(r15)
            r12.f8078N0 = r2
            r2 = 24
            android.content.Context r3 = r12.f8104n0
            android.content.res.ColorStateList r2 = com.bumptech.glide.d.a0(r3, r1, r2)
            android.content.res.ColorStateList r4 = r12.f8064G
            if (r4 == r2) goto L_0x00c8
            r12.f8064G = r2
            int[] r2 = r12.getState()
            r12.onStateChange(r2)
        L_0x00c8:
            r2 = 11
            android.content.res.ColorStateList r2 = com.bumptech.glide.d.a0(r3, r1, r2)
            android.content.res.ColorStateList r4 = r12.f8066H
            if (r4 == r2) goto L_0x00db
            r12.f8066H = r2
            int[] r2 = r12.getState()
            r12.onStateChange(r2)
        L_0x00db:
            r2 = 19
            r4 = 0
            float r2 = r1.getDimension(r2, r4)
            float r5 = r12.f8068I
            int r5 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r5 == 0) goto L_0x00f0
            r12.f8068I = r2
            r12.invalidateSelf()
            r12.u()
        L_0x00f0:
            r2 = 12
            boolean r5 = r1.hasValue(r2)
            if (r5 == 0) goto L_0x00ff
            float r2 = r1.getDimension(r2, r4)
            r12.A(r2)
        L_0x00ff:
            r2 = 22
            android.content.res.ColorStateList r2 = com.bumptech.glide.d.a0(r3, r1, r2)
            r12.F(r2)
            r2 = 23
            float r2 = r1.getDimension(r2, r4)
            r12.G(r2)
            r2 = 36
            android.content.res.ColorStateList r2 = com.bumptech.glide.d.a0(r3, r1, r2)
            r12.P(r2)
            r2 = 5
            java.lang.CharSequence r2 = r1.getText(r2)
            if (r2 != 0) goto L_0x0123
            java.lang.String r2 = ""
        L_0x0123:
            java.lang.CharSequence r5 = r12.f8077N
            boolean r5 = android.text.TextUtils.equals(r5, r2)
            if (r5 != 0) goto L_0x0137
            r12.f8077N = r2
            m2.i r2 = r12.f8109t0
            r2.d = r10
            r12.invalidateSelf()
            r12.u()
        L_0x0137:
            boolean r2 = r1.hasValue(r14)
            if (r2 == 0) goto L_0x0149
            int r2 = r1.getResourceId(r14, r14)
            if (r2 == 0) goto L_0x0149
            p2.d r6 = new p2.d
            r6.<init>(r3, r2)
            goto L_0x014a
        L_0x0149:
            r6 = 0
        L_0x014a:
            float r2 = r6.f10989k
            float r2 = r1.getDimension(r10, r2)
            r6.f10989k = r2
            r12.Q(r6)
            r2 = 3
            int r6 = r1.getInt(r2, r14)
            if (r6 == r10) goto L_0x016c
            r5 = 2
            if (r6 == r5) goto L_0x0167
            if (r6 == r2) goto L_0x0162
            goto L_0x0170
        L_0x0162:
            android.text.TextUtils$TruncateAt r2 = android.text.TextUtils.TruncateAt.END
            r12.f8073K0 = r2
            goto L_0x0170
        L_0x0167:
            android.text.TextUtils$TruncateAt r2 = android.text.TextUtils.TruncateAt.MIDDLE
            r12.f8073K0 = r2
            goto L_0x0170
        L_0x016c:
            android.text.TextUtils$TruncateAt r2 = android.text.TextUtils.TruncateAt.START
            r12.f8073K0 = r2
        L_0x0170:
            r2 = 18
            boolean r2 = r1.getBoolean(r2, r14)
            r12.E(r2)
            java.lang.String r2 = "http://schemas.android.com/apk/res-auto"
            if (r7 == 0) goto L_0x0196
            java.lang.String r5 = "chipIconEnabled"
            java.lang.String r5 = r7.getAttributeValue(r2, r5)
            if (r5 == 0) goto L_0x0196
            java.lang.String r5 = "chipIconVisible"
            java.lang.String r5 = r7.getAttributeValue(r2, r5)
            if (r5 != 0) goto L_0x0196
            r5 = 15
            boolean r5 = r1.getBoolean(r5, r14)
            r12.E(r5)
        L_0x0196:
            r5 = 14
            android.graphics.drawable.Drawable r5 = com.bumptech.glide.d.k0(r3, r1, r5)
            r12.B(r5)
            r5 = 17
            boolean r6 = r1.hasValue(r5)
            if (r6 == 0) goto L_0x01ae
            android.content.res.ColorStateList r5 = com.bumptech.glide.d.a0(r3, r1, r5)
            r12.D(r5)
        L_0x01ae:
            r5 = 16
            r6 = -1082130432(0xffffffffbf800000, float:-1.0)
            float r5 = r1.getDimension(r5, r6)
            r12.C(r5)
            r5 = 31
            boolean r5 = r1.getBoolean(r5, r14)
            r12.M(r5)
            if (r7 == 0) goto L_0x01dd
            java.lang.String r5 = "closeIconEnabled"
            java.lang.String r5 = r7.getAttributeValue(r2, r5)
            if (r5 == 0) goto L_0x01dd
            java.lang.String r5 = "closeIconVisible"
            java.lang.String r5 = r7.getAttributeValue(r2, r5)
            if (r5 != 0) goto L_0x01dd
            r5 = 26
            boolean r5 = r1.getBoolean(r5, r14)
            r12.M(r5)
        L_0x01dd:
            r5 = 25
            android.graphics.drawable.Drawable r5 = com.bumptech.glide.d.k0(r3, r1, r5)
            r12.H(r5)
            r5 = 30
            android.content.res.ColorStateList r5 = com.bumptech.glide.d.a0(r3, r1, r5)
            r12.L(r5)
            r5 = 28
            float r5 = r1.getDimension(r5, r4)
            r12.J(r5)
            r5 = 6
            boolean r5 = r1.getBoolean(r5, r14)
            r12.w(r5)
            r5 = 10
            boolean r5 = r1.getBoolean(r5, r14)
            r12.z(r5)
            if (r7 == 0) goto L_0x0224
            java.lang.String r5 = "checkedIconEnabled"
            java.lang.String r5 = r7.getAttributeValue(r2, r5)
            if (r5 == 0) goto L_0x0224
            java.lang.String r5 = "checkedIconVisible"
            java.lang.String r2 = r7.getAttributeValue(r2, r5)
            if (r2 != 0) goto L_0x0224
            r2 = 8
            boolean r2 = r1.getBoolean(r2, r14)
            r12.z(r2)
        L_0x0224:
            r2 = 7
            android.graphics.drawable.Drawable r2 = com.bumptech.glide.d.k0(r3, r1, r2)
            r12.x(r2)
            r2 = 9
            boolean r5 = r1.hasValue(r2)
            if (r5 == 0) goto L_0x023b
            android.content.res.ColorStateList r2 = com.bumptech.glide.d.a0(r3, r1, r2)
            r12.y(r2)
        L_0x023b:
            r2 = 39
            boolean r5 = r1.hasValue(r2)
            if (r5 == 0) goto L_0x024e
            int r2 = r1.getResourceId(r2, r14)
            if (r2 == 0) goto L_0x024e
            Z1.b r2 = Z1.b.a(r3, r2)
            goto L_0x024f
        L_0x024e:
            r2 = 0
        L_0x024f:
            r12.f8094d0 = r2
            r2 = 33
            boolean r5 = r1.hasValue(r2)
            if (r5 == 0) goto L_0x0264
            int r2 = r1.getResourceId(r2, r14)
            if (r2 == 0) goto L_0x0264
            Z1.b r5 = Z1.b.a(r3, r2)
            goto L_0x0265
        L_0x0264:
            r5 = 0
        L_0x0265:
            r12.f8095e0 = r5
            r2 = 21
            float r2 = r1.getDimension(r2, r4)
            float r3 = r12.f8096f0
            int r3 = (r3 > r2 ? 1 : (r3 == r2 ? 0 : -1))
            if (r3 == 0) goto L_0x027b
            r12.f8096f0 = r2
            r12.invalidateSelf()
            r12.u()
        L_0x027b:
            r2 = 35
            float r2 = r1.getDimension(r2, r4)
            r12.O(r2)
            r2 = 34
            float r2 = r1.getDimension(r2, r4)
            r12.N(r2)
            r2 = 41
            float r2 = r1.getDimension(r2, r4)
            float r3 = r12.f8099i0
            int r3 = (r3 > r2 ? 1 : (r3 == r2 ? 0 : -1))
            if (r3 == 0) goto L_0x02a1
            r12.f8099i0 = r2
            r12.invalidateSelf()
            r12.u()
        L_0x02a1:
            r2 = 40
            float r2 = r1.getDimension(r2, r4)
            float r3 = r12.f8100j0
            int r3 = (r3 > r2 ? 1 : (r3 == r2 ? 0 : -1))
            if (r3 == 0) goto L_0x02b5
            r12.f8100j0 = r2
            r12.invalidateSelf()
            r12.u()
        L_0x02b5:
            r2 = 29
            float r2 = r1.getDimension(r2, r4)
            r12.K(r2)
            r2 = 27
            float r2 = r1.getDimension(r2, r4)
            r12.I(r2)
            r2 = 13
            float r2 = r1.getDimension(r2, r4)
            float r3 = r12.f8103m0
            int r3 = (r3 > r2 ? 1 : (r3 == r2 ? 0 : -1))
            if (r3 == 0) goto L_0x02db
            r12.f8103m0 = r2
            r12.invalidateSelf()
            r12.u()
        L_0x02db:
            r2 = 4
            r3 = 2147483647(0x7fffffff, float:NaN)
            int r2 = r1.getDimensionPixelSize(r2, r3)
            r12.f8076M0 = r2
            r1.recycle()
            int[] r6 = new int[r14]
            r5 = 2131952660(0x7f130414, float:1.954177E38)
            m2.k.a(r9, r7, r8, r5)
            r1 = r9
            r2 = r18
            r3 = r13
            r4 = r8
            r17 = r5
            m2.k.b(r1, r2, r3, r4, r5, r6)
            r1 = r17
            android.content.res.TypedArray r1 = r9.obtainStyledAttributes(r7, r13, r8, r1)
            r2 = 32
            boolean r2 = r1.getBoolean(r2, r14)
            r0.f6385w = r2
            android.content.Context r2 = r16.getContext()
            android.content.res.Resources r2 = r2.getResources()
            r3 = 48
            float r3 = (float) r3
            android.util.DisplayMetrics r2 = r2.getDisplayMetrics()
            float r2 = android.util.TypedValue.applyDimension(r10, r3, r2)
            double r2 = (double) r2
            double r2 = java.lang.Math.ceil(r2)
            float r2 = (float) r2
            r3 = 20
            float r2 = r1.getDimension(r3, r2)
            double r2 = (double) r2
            double r2 = java.lang.Math.ceil(r2)
            int r2 = (int) r2
            r0.f6387y = r2
            r1.recycle()
            r0.setChipDrawable(r12)
            float r1 = K.D.i(r16)
            r12.i(r1)
            int[] r6 = new int[r14]
            r14 = 2131952660(0x7f130414, float:1.954177E38)
            m2.k.a(r9, r7, r8, r14)
            r1 = r9
            r2 = r18
            r3 = r13
            r4 = r8
            r5 = r14
            m2.k.b(r1, r2, r3, r4, r5, r6)
            android.content.res.TypedArray r1 = r9.obtainStyledAttributes(r7, r13, r8, r14)
            boolean r2 = r1.hasValue(r15)
            r1.recycle()
            h2.d r1 = new h2.d
            r1.<init>(r0, r0)
            r0.f6371A = r1
            r16.e()
            if (r2 != 0) goto L_0x036c
            h2.c r1 = new h2.c
            r1.<init>(r0)
            r0.setOutlineProvider(r1)
        L_0x036c:
            boolean r1 = r0.f6381s
            r0.setChecked(r1)
            java.lang.CharSequence r1 = r12.f8077N
            r0.setText(r1)
            android.text.TextUtils$TruncateAt r1 = r12.f8073K0
            r0.setEllipsize(r1)
            r16.h()
            h2.f r1 = r0.f6376e
            boolean r1 = r1.L0
            if (r1 != 0) goto L_0x038a
            r0.setLines(r10)
            r0.setHorizontallyScrolling(r10)
        L_0x038a:
            r0.setGravity(r11)
            r16.g()
            boolean r1 = r0.f6385w
            if (r1 == 0) goto L_0x0399
            int r1 = r0.f6387y
            r0.setMinHeight(r1)
        L_0x0399:
            int r1 = r16.getLayoutDirection()
            r0.f6386x = r1
            h2.a r1 = new h2.a
            r1.<init>(r0)
            super.setOnCheckedChangeListener(r1)
            return
        L_0x03a8:
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            java.lang.String r2 = "Chip does not support multi-line text"
            r1.<init>(r2)
            throw r1
        L_0x03b0:
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            r1.<init>(r4)
            throw r1
        L_0x03b6:
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            r1.<init>(r4)
            throw r1
        L_0x03bc:
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            java.lang.String r2 = "Please set start drawable using R.attr#chipIcon."
            r1.<init>(r2)
            throw r1
        L_0x03c4:
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            java.lang.String r2 = "Please set left drawable using R.attr#chipIcon."
            r1.<init>(r2)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.chip.Chip.<init>(android.content.Context, android.util.AttributeSet):void");
    }

    private RectF getCloseIconTouchBounds() {
        RectF rectF = this.f6374D;
        rectF.setEmpty();
        if (c() && this.f6379q != null) {
            f fVar = this.f6376e;
            Rect bounds = fVar.getBounds();
            rectF.setEmpty();
            if (fVar.T()) {
                float f6 = fVar.f8103m0 + fVar.f8102l0 + fVar.f8088X + fVar.f8101k0 + fVar.f8100j0;
                if (b.a(fVar) == 0) {
                    float f7 = (float) bounds.right;
                    rectF.right = f7;
                    rectF.left = f7 - f6;
                } else {
                    float f8 = (float) bounds.left;
                    rectF.left = f8;
                    rectF.right = f8 + f6;
                }
                rectF.top = (float) bounds.top;
                rectF.bottom = (float) bounds.bottom;
            }
        }
        return rectF;
    }

    /* access modifiers changed from: private */
    public Rect getCloseIconTouchBoundsInt() {
        RectF closeIconTouchBounds = getCloseIconTouchBounds();
        Rect rect = this.f6373C;
        rect.set((int) closeIconTouchBounds.left, (int) closeIconTouchBounds.top, (int) closeIconTouchBounds.right, (int) closeIconTouchBounds.bottom);
        return rect;
    }

    private C0916d getTextAppearance() {
        f fVar = this.f6376e;
        if (fVar != null) {
            return fVar.f8109t0.f10147f;
        }
        return null;
    }

    private void setCloseIconHovered(boolean z3) {
        if (this.f6383u != z3) {
            this.f6383u = z3;
            refreshDrawableState();
        }
    }

    private void setCloseIconPressed(boolean z3) {
        if (this.f6382t != z3) {
            this.f6382t = z3;
            refreshDrawableState();
        }
    }

    public final void b(int i2) {
        int i5;
        this.f6387y = i2;
        int i6 = 0;
        if (!this.f6385w) {
            InsetDrawable insetDrawable = this.f6377f;
            if (insetDrawable == null) {
                int[] iArr = C0935a.f11083a;
                f();
            } else if (insetDrawable != null) {
                this.f6377f = null;
                setMinWidth(0);
                setMinHeight((int) getChipMinHeight());
                int[] iArr2 = C0935a.f11083a;
                f();
            }
        } else {
            int max = Math.max(0, i2 - ((int) this.f6376e.f8068I));
            int max2 = Math.max(0, i2 - this.f6376e.getIntrinsicWidth());
            if (max2 > 0 || max > 0) {
                if (max2 > 0) {
                    i5 = max2 / 2;
                } else {
                    i5 = 0;
                }
                if (max > 0) {
                    i6 = max / 2;
                }
                int i7 = i6;
                if (this.f6377f != null) {
                    Rect rect = new Rect();
                    this.f6377f.getPadding(rect);
                    if (rect.top == i7 && rect.bottom == i7 && rect.left == i5 && rect.right == i5) {
                        int[] iArr3 = C0935a.f11083a;
                        f();
                        return;
                    }
                }
                if (getMinHeight() != i2) {
                    setMinHeight(i2);
                }
                if (getMinWidth() != i2) {
                    setMinWidth(i2);
                }
                this.f6377f = new InsetDrawable(this.f6376e, i5, i7, i5, i7);
                int[] iArr4 = C0935a.f11083a;
                f();
                return;
            }
            InsetDrawable insetDrawable2 = this.f6377f;
            if (insetDrawable2 == null) {
                int[] iArr5 = C0935a.f11083a;
                f();
            } else if (insetDrawable2 != null) {
                this.f6377f = null;
                setMinWidth(0);
                setMinHeight((int) getChipMinHeight());
                int[] iArr6 = C0935a.f11083a;
                f();
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:9:0x0011 A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean c() {
        /*
            r2 = this;
            h2.f r0 = r2.f6376e
            if (r0 == 0) goto L_0x0013
            android.graphics.drawable.Drawable r0 = r0.f8085U
            if (r0 == 0) goto L_0x000e
            boolean r1 = r0 instanceof D.g
            if (r1 == 0) goto L_0x000f
            D.g r0 = (D.g) r0
        L_0x000e:
            r0 = 0
        L_0x000f:
            if (r0 == 0) goto L_0x0013
            r0 = 1
            goto L_0x0014
        L_0x0013:
            r0 = 0
        L_0x0014:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.chip.Chip.c():boolean");
    }

    public final boolean d() {
        f fVar = this.f6376e;
        if (fVar == null || !fVar.f8090Z) {
            return false;
        }
        return true;
    }

    public final boolean dispatchHoverEvent(MotionEvent motionEvent) {
        int i2;
        int i5;
        if (!this.f6372B) {
            return super.dispatchHoverEvent(motionEvent);
        }
        d dVar = this.f6371A;
        AccessibilityManager accessibilityManager = dVar.h;
        if (accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled()) {
            int action = motionEvent.getAction();
            if (action == 7 || action == 9) {
                float x6 = motionEvent.getX();
                float y6 = motionEvent.getY();
                Chip chip = dVar.f8056q;
                if (!chip.c() || !chip.getCloseIconTouchBounds().contains(x6, y6)) {
                    i2 = 0;
                } else {
                    i2 = 1;
                }
                int i6 = dVar.f3647m;
                if (i6 != i2) {
                    dVar.f3647m = i2;
                    dVar.q(i2, 128);
                    dVar.q(i6, 256);
                }
                if (i2 != Integer.MIN_VALUE) {
                    return true;
                }
            } else if (action == 10 && (i5 = dVar.f3647m) != Integer.MIN_VALUE) {
                if (i5 == Integer.MIN_VALUE) {
                    return true;
                }
                dVar.f3647m = Integer.MIN_VALUE;
                dVar.q(i5, 256);
                return true;
            }
        }
        if (super.dispatchHoverEvent(motionEvent)) {
            return true;
        }
        return false;
    }

    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (!this.f6372B) {
            return super.dispatchKeyEvent(keyEvent);
        }
        d dVar = this.f6371A;
        dVar.getClass();
        int i2 = 0;
        if (keyEvent.getAction() != 1) {
            int keyCode = keyEvent.getKeyCode();
            if (keyCode != 61) {
                int i5 = 66;
                if (keyCode != 66) {
                    switch (keyCode) {
                        case 19:
                        case 20:
                        case 21:
                        case 22:
                            if (keyEvent.hasNoModifiers()) {
                                if (keyCode == 19) {
                                    i5 = 33;
                                } else if (keyCode == 21) {
                                    i5 = 17;
                                } else if (keyCode != 22) {
                                    i5 = 130;
                                }
                                int repeatCount = keyEvent.getRepeatCount() + 1;
                                int i6 = 0;
                                while (i2 < repeatCount && dVar.m(i5, (Rect) null)) {
                                    i2++;
                                    i6 = 1;
                                }
                                i2 = i6;
                                break;
                            }
                            break;
                        case 23:
                            break;
                    }
                }
                if (keyEvent.hasNoModifiers() && keyEvent.getRepeatCount() == 0) {
                    int i7 = dVar.f3646l;
                    if (i7 != Integer.MIN_VALUE) {
                        Chip chip = dVar.f8056q;
                        if (i7 == 0) {
                            boolean performClick = chip.performClick();
                        } else if (i7 == 1) {
                            chip.playSoundEffect(0);
                            View.OnClickListener onClickListener = chip.f6379q;
                            if (onClickListener != null) {
                                onClickListener.onClick(chip);
                            }
                            if (chip.f6372B) {
                                chip.f6371A.q(1, 1);
                            }
                        }
                    }
                    i2 = 1;
                }
            } else if (keyEvent.hasNoModifiers()) {
                i2 = dVar.m(2, (Rect) null);
            } else if (keyEvent.hasModifiers(1)) {
                i2 = dVar.m(1, (Rect) null);
            }
        }
        if (i2 == 0 || dVar.f3646l == Integer.MIN_VALUE) {
            return super.dispatchKeyEvent(keyEvent);
        }
        return true;
    }

    public final void drawableStateChanged() {
        int i2;
        super.drawableStateChanged();
        f fVar = this.f6376e;
        boolean z3 = false;
        if (fVar != null && f.t(fVar.f8085U)) {
            f fVar2 = this.f6376e;
            int isEnabled = isEnabled();
            if (this.f6384v) {
                isEnabled++;
            }
            if (this.f6383u) {
                isEnabled++;
            }
            if (this.f6382t) {
                isEnabled++;
            }
            if (isChecked()) {
                isEnabled++;
            }
            int[] iArr = new int[isEnabled];
            if (isEnabled()) {
                iArr[0] = 16842910;
                i2 = 1;
            } else {
                i2 = 0;
            }
            if (this.f6384v) {
                iArr[i2] = 16842908;
                i2++;
            }
            if (this.f6383u) {
                iArr[i2] = 16843623;
                i2++;
            }
            if (this.f6382t) {
                iArr[i2] = 16842919;
                i2++;
            }
            if (isChecked()) {
                iArr[i2] = 16842913;
            }
            if (!Arrays.equals(fVar2.f8067H0, iArr)) {
                fVar2.f8067H0 = iArr;
                if (fVar2.T()) {
                    z3 = fVar2.v(fVar2.getState(), iArr);
                }
            }
        }
        if (z3) {
            invalidate();
        }
    }

    public final void e() {
        f fVar;
        if (!c() || (fVar = this.f6376e) == null || !fVar.f8084T || this.f6379q == null) {
            O.l(this, (C0062b) null);
            this.f6372B = false;
            return;
        }
        O.l(this, this.f6371A);
        this.f6372B = true;
    }

    public final void f() {
        this.f6378p = new RippleDrawable(C0935a.a(this.f6376e.f8075M), getBackgroundDrawable(), (Drawable) null);
        this.f6376e.getClass();
        RippleDrawable rippleDrawable = this.f6378p;
        WeakHashMap weakHashMap = O.f1352a;
        setBackground(rippleDrawable);
        g();
    }

    public final void g() {
        f fVar;
        if (!TextUtils.isEmpty(getText()) && (fVar = this.f6376e) != null) {
            int q6 = (int) (fVar.q() + fVar.f8103m0 + fVar.f8100j0);
            f fVar2 = this.f6376e;
            int p6 = (int) (fVar2.p() + fVar2.f8096f0 + fVar2.f8099i0);
            if (this.f6377f != null) {
                Rect rect = new Rect();
                this.f6377f.getPadding(rect);
                p6 += rect.left;
                q6 += rect.right;
            }
            int paddingTop = getPaddingTop();
            int paddingBottom = getPaddingBottom();
            WeakHashMap weakHashMap = O.f1352a;
            setPaddingRelative(p6, paddingTop, q6, paddingBottom);
        }
    }

    public CharSequence getAccessibilityClassName() {
        if (!TextUtils.isEmpty(this.f6388z)) {
            return this.f6388z;
        }
        if (d()) {
            getParent();
            return "android.widget.Button";
        } else if (isClickable()) {
            return "android.widget.Button";
        } else {
            return "android.view.View";
        }
    }

    public Drawable getBackgroundDrawable() {
        InsetDrawable insetDrawable = this.f6377f;
        if (insetDrawable == null) {
            return this.f6376e;
        }
        return insetDrawable;
    }

    public Drawable getCheckedIcon() {
        f fVar = this.f6376e;
        if (fVar != null) {
            return fVar.f8092b0;
        }
        return null;
    }

    public ColorStateList getCheckedIconTint() {
        f fVar = this.f6376e;
        if (fVar != null) {
            return fVar.f8093c0;
        }
        return null;
    }

    public ColorStateList getChipBackgroundColor() {
        f fVar = this.f6376e;
        if (fVar != null) {
            return fVar.f8066H;
        }
        return null;
    }

    public float getChipCornerRadius() {
        f fVar = this.f6376e;
        if (fVar != null) {
            return Math.max(0.0f, fVar.r());
        }
        return 0.0f;
    }

    public Drawable getChipDrawable() {
        return this.f6376e;
    }

    public float getChipEndPadding() {
        f fVar = this.f6376e;
        if (fVar != null) {
            return fVar.f8103m0;
        }
        return 0.0f;
    }

    public Drawable getChipIcon() {
        Drawable drawable;
        f fVar = this.f6376e;
        if (fVar == null || (drawable = fVar.f8080P) == null) {
            return null;
        }
        if (drawable instanceof g) {
            g gVar = (g) drawable;
            drawable = null;
        }
        return drawable;
    }

    public float getChipIconSize() {
        f fVar = this.f6376e;
        if (fVar != null) {
            return fVar.f8082R;
        }
        return 0.0f;
    }

    public ColorStateList getChipIconTint() {
        f fVar = this.f6376e;
        if (fVar != null) {
            return fVar.f8081Q;
        }
        return null;
    }

    public float getChipMinHeight() {
        f fVar = this.f6376e;
        if (fVar != null) {
            return fVar.f8068I;
        }
        return 0.0f;
    }

    public float getChipStartPadding() {
        f fVar = this.f6376e;
        if (fVar != null) {
            return fVar.f8096f0;
        }
        return 0.0f;
    }

    public ColorStateList getChipStrokeColor() {
        f fVar = this.f6376e;
        if (fVar != null) {
            return fVar.f8072K;
        }
        return null;
    }

    public float getChipStrokeWidth() {
        f fVar = this.f6376e;
        if (fVar != null) {
            return fVar.f8074L;
        }
        return 0.0f;
    }

    @Deprecated
    public CharSequence getChipText() {
        return getText();
    }

    public Drawable getCloseIcon() {
        Drawable drawable;
        f fVar = this.f6376e;
        if (fVar == null || (drawable = fVar.f8085U) == null) {
            return null;
        }
        if (drawable instanceof g) {
            g gVar = (g) drawable;
            drawable = null;
        }
        return drawable;
    }

    public CharSequence getCloseIconContentDescription() {
        f fVar = this.f6376e;
        if (fVar != null) {
            return fVar.f8089Y;
        }
        return null;
    }

    public float getCloseIconEndPadding() {
        f fVar = this.f6376e;
        if (fVar != null) {
            return fVar.f8102l0;
        }
        return 0.0f;
    }

    public float getCloseIconSize() {
        f fVar = this.f6376e;
        if (fVar != null) {
            return fVar.f8088X;
        }
        return 0.0f;
    }

    public float getCloseIconStartPadding() {
        f fVar = this.f6376e;
        if (fVar != null) {
            return fVar.f8101k0;
        }
        return 0.0f;
    }

    public ColorStateList getCloseIconTint() {
        f fVar = this.f6376e;
        if (fVar != null) {
            return fVar.f8087W;
        }
        return null;
    }

    public TextUtils.TruncateAt getEllipsize() {
        f fVar = this.f6376e;
        if (fVar != null) {
            return fVar.f8073K0;
        }
        return null;
    }

    public final void getFocusedRect(Rect rect) {
        if (this.f6372B) {
            d dVar = this.f6371A;
            if (dVar.f3646l == 1 || dVar.f3645k == 1) {
                rect.set(getCloseIconTouchBoundsInt());
                return;
            }
        }
        super.getFocusedRect(rect);
    }

    public Z1.b getHideMotionSpec() {
        f fVar = this.f6376e;
        if (fVar != null) {
            return fVar.f8095e0;
        }
        return null;
    }

    public float getIconEndPadding() {
        f fVar = this.f6376e;
        if (fVar != null) {
            return fVar.f8098h0;
        }
        return 0.0f;
    }

    public float getIconStartPadding() {
        f fVar = this.f6376e;
        if (fVar != null) {
            return fVar.f8097g0;
        }
        return 0.0f;
    }

    public ColorStateList getRippleColor() {
        f fVar = this.f6376e;
        if (fVar != null) {
            return fVar.f8075M;
        }
        return null;
    }

    public k getShapeAppearanceModel() {
        return this.f6376e.f11459a.f11441a;
    }

    public Z1.b getShowMotionSpec() {
        f fVar = this.f6376e;
        if (fVar != null) {
            return fVar.f8094d0;
        }
        return null;
    }

    public float getTextEndPadding() {
        f fVar = this.f6376e;
        if (fVar != null) {
            return fVar.f8100j0;
        }
        return 0.0f;
    }

    public float getTextStartPadding() {
        f fVar = this.f6376e;
        if (fVar != null) {
            return fVar.f8099i0;
        }
        return 0.0f;
    }

    public final void h() {
        TextPaint paint = getPaint();
        f fVar = this.f6376e;
        if (fVar != null) {
            paint.drawableState = fVar.getState();
        }
        C0916d textAppearance = getTextAppearance();
        if (textAppearance != null) {
            textAppearance.e(getContext(), paint, this.f6375E);
        }
    }

    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        K1.e.q0(this, this.f6376e);
    }

    public final int[] onCreateDrawableState(int i2) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i2 + 2);
        if (isChecked()) {
            View.mergeDrawableStates(onCreateDrawableState, f6369G);
        }
        if (d()) {
            View.mergeDrawableStates(onCreateDrawableState, f6370H);
        }
        return onCreateDrawableState;
    }

    public final void onFocusChanged(boolean z3, int i2, Rect rect) {
        super.onFocusChanged(z3, i2, rect);
        if (this.f6372B) {
            d dVar = this.f6371A;
            int i5 = dVar.f3646l;
            if (i5 != Integer.MIN_VALUE) {
                dVar.j(i5);
            }
            if (z3) {
                dVar.m(i2, rect);
            }
        }
    }

    public final boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 7) {
            setCloseIconHovered(getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY()));
        } else if (actionMasked == 10) {
            setCloseIconHovered(false);
        }
        return super.onHoverEvent(motionEvent);
    }

    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(getAccessibilityClassName());
        accessibilityNodeInfo.setCheckable(d());
        accessibilityNodeInfo.setClickable(isClickable());
        getParent();
    }

    public final PointerIcon onResolvePointerIcon(MotionEvent motionEvent, int i2) {
        if (!getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY()) || !isEnabled()) {
            return super.onResolvePointerIcon(motionEvent, i2);
        }
        return PointerIcon.getSystemIcon(getContext(), 1002);
    }

    public final void onRtlPropertiesChanged(int i2) {
        super.onRtlPropertiesChanged(i2);
        if (this.f6386x != i2) {
            this.f6386x = i2;
            g();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001e, code lost:
        if (r0 != 3) goto L_0x0050;
     */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0059  */
    /* JADX WARNING: Removed duplicated region for block: B:31:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean onTouchEvent(android.view.MotionEvent r6) {
        /*
            r5 = this;
            int r0 = r6.getActionMasked()
            android.graphics.RectF r1 = r5.getCloseIconTouchBounds()
            float r2 = r6.getX()
            float r3 = r6.getY()
            boolean r1 = r1.contains(r2, r3)
            r2 = 0
            r3 = 1
            if (r0 == 0) goto L_0x004a
            if (r0 == r3) goto L_0x002c
            r4 = 2
            if (r0 == r4) goto L_0x0021
            r1 = 3
            if (r0 == r1) goto L_0x0045
            goto L_0x0050
        L_0x0021:
            boolean r0 = r5.f6382t
            if (r0 == 0) goto L_0x0050
            if (r1 != 0) goto L_0x002a
            r5.setCloseIconPressed(r2)
        L_0x002a:
            r0 = r3
            goto L_0x0051
        L_0x002c:
            boolean r0 = r5.f6382t
            if (r0 == 0) goto L_0x0045
            r5.playSoundEffect(r2)
            android.view.View$OnClickListener r0 = r5.f6379q
            if (r0 == 0) goto L_0x003a
            r0.onClick(r5)
        L_0x003a:
            boolean r0 = r5.f6372B
            if (r0 == 0) goto L_0x0043
            h2.d r0 = r5.f6371A
            r0.q(r3, r3)
        L_0x0043:
            r0 = r3
            goto L_0x0046
        L_0x0045:
            r0 = r2
        L_0x0046:
            r5.setCloseIconPressed(r2)
            goto L_0x0051
        L_0x004a:
            if (r1 == 0) goto L_0x0050
            r5.setCloseIconPressed(r3)
            goto L_0x002a
        L_0x0050:
            r0 = r2
        L_0x0051:
            if (r0 != 0) goto L_0x0059
            boolean r6 = super.onTouchEvent(r6)
            if (r6 == 0) goto L_0x005a
        L_0x0059:
            r2 = r3
        L_0x005a:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.chip.Chip.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void setAccessibilityClassName(CharSequence charSequence) {
        this.f6388z = charSequence;
    }

    public void setBackground(Drawable drawable) {
        if (drawable == getBackgroundDrawable() || drawable == this.f6378p) {
            super.setBackground(drawable);
        } else {
            Log.w("Chip", "Do not set the background; Chip manages its own background drawable.");
        }
    }

    public void setBackgroundColor(int i2) {
        Log.w("Chip", "Do not set the background color; Chip manages its own background drawable.");
    }

    public void setBackgroundDrawable(Drawable drawable) {
        if (drawable == getBackgroundDrawable() || drawable == this.f6378p) {
            super.setBackgroundDrawable(drawable);
        } else {
            Log.w("Chip", "Do not set the background drawable; Chip manages its own background drawable.");
        }
    }

    public void setBackgroundResource(int i2) {
        Log.w("Chip", "Do not set the background resource; Chip manages its own background drawable.");
    }

    public void setBackgroundTintList(ColorStateList colorStateList) {
        Log.w("Chip", "Do not set the background tint list; Chip manages its own background drawable.");
    }

    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        Log.w("Chip", "Do not set the background tint mode; Chip manages its own background drawable.");
    }

    public void setCheckable(boolean z3) {
        f fVar = this.f6376e;
        if (fVar != null) {
            fVar.w(z3);
        }
    }

    public void setCheckableResource(int i2) {
        f fVar = this.f6376e;
        if (fVar != null) {
            fVar.w(fVar.f8104n0.getResources().getBoolean(i2));
        }
    }

    public void setChecked(boolean z3) {
        f fVar = this.f6376e;
        if (fVar == null) {
            this.f6381s = z3;
        } else if (fVar.f8090Z) {
            super.setChecked(z3);
        }
    }

    public void setCheckedIcon(Drawable drawable) {
        f fVar = this.f6376e;
        if (fVar != null) {
            fVar.x(drawable);
        }
    }

    @Deprecated
    public void setCheckedIconEnabled(boolean z3) {
        setCheckedIconVisible(z3);
    }

    @Deprecated
    public void setCheckedIconEnabledResource(int i2) {
        setCheckedIconVisible(i2);
    }

    public void setCheckedIconResource(int i2) {
        f fVar = this.f6376e;
        if (fVar != null) {
            fVar.x(R2.b.J(fVar.f8104n0, i2));
        }
    }

    public void setCheckedIconTint(ColorStateList colorStateList) {
        f fVar = this.f6376e;
        if (fVar != null) {
            fVar.y(colorStateList);
        }
    }

    public void setCheckedIconTintResource(int i2) {
        f fVar = this.f6376e;
        if (fVar != null) {
            fVar.y(h.getColorStateList(fVar.f8104n0, i2));
        }
    }

    public void setCheckedIconVisible(int i2) {
        f fVar = this.f6376e;
        if (fVar != null) {
            fVar.z(fVar.f8104n0.getResources().getBoolean(i2));
        }
    }

    public void setChipBackgroundColor(ColorStateList colorStateList) {
        f fVar = this.f6376e;
        if (fVar != null && fVar.f8066H != colorStateList) {
            fVar.f8066H = colorStateList;
            fVar.onStateChange(fVar.getState());
        }
    }

    public void setChipBackgroundColorResource(int i2) {
        ColorStateList colorStateList;
        f fVar = this.f6376e;
        if (fVar != null && fVar.f8066H != (colorStateList = h.getColorStateList(fVar.f8104n0, i2))) {
            fVar.f8066H = colorStateList;
            fVar.onStateChange(fVar.getState());
        }
    }

    @Deprecated
    public void setChipCornerRadius(float f6) {
        f fVar = this.f6376e;
        if (fVar != null) {
            fVar.A(f6);
        }
    }

    @Deprecated
    public void setChipCornerRadiusResource(int i2) {
        f fVar = this.f6376e;
        if (fVar != null) {
            fVar.A(fVar.f8104n0.getResources().getDimension(i2));
        }
    }

    public void setChipDrawable(f fVar) {
        f fVar2 = this.f6376e;
        if (fVar2 != fVar) {
            if (fVar2 != null) {
                fVar2.f8071J0 = new WeakReference((Object) null);
            }
            this.f6376e = fVar;
            fVar.L0 = false;
            fVar.f8071J0 = new WeakReference(this);
            b(this.f6387y);
        }
    }

    public void setChipEndPadding(float f6) {
        f fVar = this.f6376e;
        if (fVar != null && fVar.f8103m0 != f6) {
            fVar.f8103m0 = f6;
            fVar.invalidateSelf();
            fVar.u();
        }
    }

    public void setChipEndPaddingResource(int i2) {
        f fVar = this.f6376e;
        if (fVar != null) {
            float dimension = fVar.f8104n0.getResources().getDimension(i2);
            if (fVar.f8103m0 != dimension) {
                fVar.f8103m0 = dimension;
                fVar.invalidateSelf();
                fVar.u();
            }
        }
    }

    public void setChipIcon(Drawable drawable) {
        f fVar = this.f6376e;
        if (fVar != null) {
            fVar.B(drawable);
        }
    }

    @Deprecated
    public void setChipIconEnabled(boolean z3) {
        setChipIconVisible(z3);
    }

    @Deprecated
    public void setChipIconEnabledResource(int i2) {
        setChipIconVisible(i2);
    }

    public void setChipIconResource(int i2) {
        f fVar = this.f6376e;
        if (fVar != null) {
            fVar.B(R2.b.J(fVar.f8104n0, i2));
        }
    }

    public void setChipIconSize(float f6) {
        f fVar = this.f6376e;
        if (fVar != null) {
            fVar.C(f6);
        }
    }

    public void setChipIconSizeResource(int i2) {
        f fVar = this.f6376e;
        if (fVar != null) {
            fVar.C(fVar.f8104n0.getResources().getDimension(i2));
        }
    }

    public void setChipIconTint(ColorStateList colorStateList) {
        f fVar = this.f6376e;
        if (fVar != null) {
            fVar.D(colorStateList);
        }
    }

    public void setChipIconTintResource(int i2) {
        f fVar = this.f6376e;
        if (fVar != null) {
            fVar.D(h.getColorStateList(fVar.f8104n0, i2));
        }
    }

    public void setChipIconVisible(int i2) {
        f fVar = this.f6376e;
        if (fVar != null) {
            fVar.E(fVar.f8104n0.getResources().getBoolean(i2));
        }
    }

    public void setChipMinHeight(float f6) {
        f fVar = this.f6376e;
        if (fVar != null && fVar.f8068I != f6) {
            fVar.f8068I = f6;
            fVar.invalidateSelf();
            fVar.u();
        }
    }

    public void setChipMinHeightResource(int i2) {
        f fVar = this.f6376e;
        if (fVar != null) {
            float dimension = fVar.f8104n0.getResources().getDimension(i2);
            if (fVar.f8068I != dimension) {
                fVar.f8068I = dimension;
                fVar.invalidateSelf();
                fVar.u();
            }
        }
    }

    public void setChipStartPadding(float f6) {
        f fVar = this.f6376e;
        if (fVar != null && fVar.f8096f0 != f6) {
            fVar.f8096f0 = f6;
            fVar.invalidateSelf();
            fVar.u();
        }
    }

    public void setChipStartPaddingResource(int i2) {
        f fVar = this.f6376e;
        if (fVar != null) {
            float dimension = fVar.f8104n0.getResources().getDimension(i2);
            if (fVar.f8096f0 != dimension) {
                fVar.f8096f0 = dimension;
                fVar.invalidateSelf();
                fVar.u();
            }
        }
    }

    public void setChipStrokeColor(ColorStateList colorStateList) {
        f fVar = this.f6376e;
        if (fVar != null) {
            fVar.F(colorStateList);
        }
    }

    public void setChipStrokeColorResource(int i2) {
        f fVar = this.f6376e;
        if (fVar != null) {
            fVar.F(h.getColorStateList(fVar.f8104n0, i2));
        }
    }

    public void setChipStrokeWidth(float f6) {
        f fVar = this.f6376e;
        if (fVar != null) {
            fVar.G(f6);
        }
    }

    public void setChipStrokeWidthResource(int i2) {
        f fVar = this.f6376e;
        if (fVar != null) {
            fVar.G(fVar.f8104n0.getResources().getDimension(i2));
        }
    }

    @Deprecated
    public void setChipText(CharSequence charSequence) {
        setText(charSequence);
    }

    @Deprecated
    public void setChipTextResource(int i2) {
        setText(getResources().getString(i2));
    }

    public void setCloseIcon(Drawable drawable) {
        f fVar = this.f6376e;
        if (fVar != null) {
            fVar.H(drawable);
        }
        e();
    }

    public void setCloseIconContentDescription(CharSequence charSequence) {
        I.b bVar;
        f fVar = this.f6376e;
        if (fVar != null && fVar.f8089Y != charSequence) {
            String str = I.b.f1078b;
            if (TextUtils.getLayoutDirectionFromLocale(Locale.getDefault()) == 1) {
                bVar = I.b.f1080e;
            } else {
                bVar = I.b.d;
            }
            bVar.getClass();
            H h = I.g.f1086a;
            fVar.f8089Y = bVar.c(charSequence);
            fVar.invalidateSelf();
        }
    }

    @Deprecated
    public void setCloseIconEnabled(boolean z3) {
        setCloseIconVisible(z3);
    }

    @Deprecated
    public void setCloseIconEnabledResource(int i2) {
        setCloseIconVisible(i2);
    }

    public void setCloseIconEndPadding(float f6) {
        f fVar = this.f6376e;
        if (fVar != null) {
            fVar.I(f6);
        }
    }

    public void setCloseIconEndPaddingResource(int i2) {
        f fVar = this.f6376e;
        if (fVar != null) {
            fVar.I(fVar.f8104n0.getResources().getDimension(i2));
        }
    }

    public void setCloseIconResource(int i2) {
        f fVar = this.f6376e;
        if (fVar != null) {
            fVar.H(R2.b.J(fVar.f8104n0, i2));
        }
        e();
    }

    public void setCloseIconSize(float f6) {
        f fVar = this.f6376e;
        if (fVar != null) {
            fVar.J(f6);
        }
    }

    public void setCloseIconSizeResource(int i2) {
        f fVar = this.f6376e;
        if (fVar != null) {
            fVar.J(fVar.f8104n0.getResources().getDimension(i2));
        }
    }

    public void setCloseIconStartPadding(float f6) {
        f fVar = this.f6376e;
        if (fVar != null) {
            fVar.K(f6);
        }
    }

    public void setCloseIconStartPaddingResource(int i2) {
        f fVar = this.f6376e;
        if (fVar != null) {
            fVar.K(fVar.f8104n0.getResources().getDimension(i2));
        }
    }

    public void setCloseIconTint(ColorStateList colorStateList) {
        f fVar = this.f6376e;
        if (fVar != null) {
            fVar.L(colorStateList);
        }
    }

    public void setCloseIconTintResource(int i2) {
        f fVar = this.f6376e;
        if (fVar != null) {
            fVar.L(h.getColorStateList(fVar.f8104n0, i2));
        }
    }

    public void setCloseIconVisible(int i2) {
        setCloseIconVisible(getResources().getBoolean(i2));
    }

    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        } else if (drawable3 == null) {
            super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        } else {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
    }

    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        } else if (drawable3 == null) {
            super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        } else {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
    }

    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(int i2, int i5, int i6, int i7) {
        if (i2 != 0) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        } else if (i6 == 0) {
            super.setCompoundDrawablesRelativeWithIntrinsicBounds(i2, i5, i6, i7);
        } else {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
    }

    public final void setCompoundDrawablesWithIntrinsicBounds(int i2, int i5, int i6, int i7) {
        if (i2 != 0) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        } else if (i6 == 0) {
            super.setCompoundDrawablesWithIntrinsicBounds(i2, i5, i6, i7);
        } else {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
    }

    public void setElevation(float f6) {
        super.setElevation(f6);
        f fVar = this.f6376e;
        if (fVar != null) {
            fVar.i(f6);
        }
    }

    public void setEllipsize(TextUtils.TruncateAt truncateAt) {
        if (this.f6376e != null) {
            if (truncateAt != TextUtils.TruncateAt.MARQUEE) {
                super.setEllipsize(truncateAt);
                f fVar = this.f6376e;
                if (fVar != null) {
                    fVar.f8073K0 = truncateAt;
                    return;
                }
                return;
            }
            throw new UnsupportedOperationException("Text within a chip are not allowed to scroll.");
        }
    }

    public void setEnsureMinTouchTargetSize(boolean z3) {
        this.f6385w = z3;
        b(this.f6387y);
    }

    public void setGravity(int i2) {
        if (i2 != 8388627) {
            Log.w("Chip", "Chip text must be vertically center and start aligned");
        } else {
            super.setGravity(i2);
        }
    }

    public void setHideMotionSpec(Z1.b bVar) {
        f fVar = this.f6376e;
        if (fVar != null) {
            fVar.f8095e0 = bVar;
        }
    }

    public void setHideMotionSpecResource(int i2) {
        f fVar = this.f6376e;
        if (fVar != null) {
            fVar.f8095e0 = Z1.b.a(fVar.f8104n0, i2);
        }
    }

    public void setIconEndPadding(float f6) {
        f fVar = this.f6376e;
        if (fVar != null) {
            fVar.N(f6);
        }
    }

    public void setIconEndPaddingResource(int i2) {
        f fVar = this.f6376e;
        if (fVar != null) {
            fVar.N(fVar.f8104n0.getResources().getDimension(i2));
        }
    }

    public void setIconStartPadding(float f6) {
        f fVar = this.f6376e;
        if (fVar != null) {
            fVar.O(f6);
        }
    }

    public void setIconStartPaddingResource(int i2) {
        f fVar = this.f6376e;
        if (fVar != null) {
            fVar.O(fVar.f8104n0.getResources().getDimension(i2));
        }
    }

    public void setLayoutDirection(int i2) {
        if (this.f6376e != null) {
            super.setLayoutDirection(i2);
        }
    }

    public void setLines(int i2) {
        if (i2 <= 1) {
            super.setLines(i2);
            return;
        }
        throw new UnsupportedOperationException("Chip does not support multi-line text");
    }

    public void setMaxLines(int i2) {
        if (i2 <= 1) {
            super.setMaxLines(i2);
            return;
        }
        throw new UnsupportedOperationException("Chip does not support multi-line text");
    }

    public void setMaxWidth(int i2) {
        super.setMaxWidth(i2);
        f fVar = this.f6376e;
        if (fVar != null) {
            fVar.f8076M0 = i2;
        }
    }

    public void setMinLines(int i2) {
        if (i2 <= 1) {
            super.setMinLines(i2);
            return;
        }
        throw new UnsupportedOperationException("Chip does not support multi-line text");
    }

    public void setOnCheckedChangeListener(CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        this.f6380r = onCheckedChangeListener;
    }

    public void setOnCloseIconClickListener(View.OnClickListener onClickListener) {
        this.f6379q = onClickListener;
        e();
    }

    public void setRippleColor(ColorStateList colorStateList) {
        f fVar = this.f6376e;
        if (fVar != null) {
            fVar.P(colorStateList);
        }
        this.f6376e.getClass();
        f();
    }

    public void setRippleColorResource(int i2) {
        f fVar = this.f6376e;
        if (fVar != null) {
            fVar.P(h.getColorStateList(fVar.f8104n0, i2));
            this.f6376e.getClass();
            f();
        }
    }

    public void setShapeAppearanceModel(k kVar) {
        this.f6376e.setShapeAppearanceModel(kVar);
    }

    public void setShowMotionSpec(Z1.b bVar) {
        f fVar = this.f6376e;
        if (fVar != null) {
            fVar.f8094d0 = bVar;
        }
    }

    public void setShowMotionSpecResource(int i2) {
        f fVar = this.f6376e;
        if (fVar != null) {
            fVar.f8094d0 = Z1.b.a(fVar.f8104n0, i2);
        }
    }

    public void setSingleLine(boolean z3) {
        if (z3) {
            super.setSingleLine(z3);
            return;
        }
        throw new UnsupportedOperationException("Chip does not support multi-line text");
    }

    public final void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        CharSequence charSequence2;
        f fVar = this.f6376e;
        if (fVar != null) {
            if (charSequence == null) {
                charSequence = "";
            }
            if (fVar.L0) {
                charSequence2 = null;
            } else {
                charSequence2 = charSequence;
            }
            super.setText(charSequence2, bufferType);
            f fVar2 = this.f6376e;
            if (fVar2 != null && !TextUtils.equals(fVar2.f8077N, charSequence)) {
                fVar2.f8077N = charSequence;
                fVar2.f8109t0.d = true;
                fVar2.invalidateSelf();
                fVar2.u();
            }
        }
    }

    public void setTextAppearance(C0916d dVar) {
        f fVar = this.f6376e;
        if (fVar != null) {
            fVar.Q(dVar);
        }
        h();
    }

    public void setTextAppearanceResource(int i2) {
        setTextAppearance(getContext(), i2);
    }

    public void setTextEndPadding(float f6) {
        f fVar = this.f6376e;
        if (fVar != null && fVar.f8100j0 != f6) {
            fVar.f8100j0 = f6;
            fVar.invalidateSelf();
            fVar.u();
        }
    }

    public void setTextEndPaddingResource(int i2) {
        f fVar = this.f6376e;
        if (fVar != null) {
            float dimension = fVar.f8104n0.getResources().getDimension(i2);
            if (fVar.f8100j0 != dimension) {
                fVar.f8100j0 = dimension;
                fVar.invalidateSelf();
                fVar.u();
            }
        }
    }

    public final void setTextSize(int i2, float f6) {
        super.setTextSize(i2, f6);
        f fVar = this.f6376e;
        if (fVar != null) {
            float applyDimension = TypedValue.applyDimension(i2, f6, getResources().getDisplayMetrics());
            i iVar = fVar.f8109t0;
            C0916d dVar = iVar.f10147f;
            if (dVar != null) {
                dVar.f10989k = applyDimension;
                iVar.f10143a.setTextSize(applyDimension);
                fVar.u();
                fVar.invalidateSelf();
            }
        }
        h();
    }

    public void setTextStartPadding(float f6) {
        f fVar = this.f6376e;
        if (fVar != null && fVar.f8099i0 != f6) {
            fVar.f8099i0 = f6;
            fVar.invalidateSelf();
            fVar.u();
        }
    }

    public void setTextStartPaddingResource(int i2) {
        f fVar = this.f6376e;
        if (fVar != null) {
            float dimension = fVar.f8104n0.getResources().getDimension(i2);
            if (fVar.f8099i0 != dimension) {
                fVar.f8099i0 = dimension;
                fVar.invalidateSelf();
                fVar.u();
            }
        }
    }

    public void setCloseIconVisible(boolean z3) {
        f fVar = this.f6376e;
        if (fVar != null) {
            fVar.M(z3);
        }
        e();
    }

    public void setCheckedIconVisible(boolean z3) {
        f fVar = this.f6376e;
        if (fVar != null) {
            fVar.z(z3);
        }
    }

    public void setChipIconVisible(boolean z3) {
        f fVar = this.f6376e;
        if (fVar != null) {
            fVar.E(z3);
        }
    }

    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        } else if (drawable3 == null) {
            super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        } else {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
    }

    public final void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set left drawable using R.attr#chipIcon.");
        } else if (drawable3 == null) {
            super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        } else {
            throw new UnsupportedOperationException("Please set right drawable using R.attr#closeIcon.");
        }
    }

    public final void setTextAppearance(Context context, int i2) {
        super.setTextAppearance(context, i2);
        f fVar = this.f6376e;
        if (fVar != null) {
            fVar.Q(new C0916d(fVar.f8104n0, i2));
        }
        h();
    }

    public void setTextAppearance(int i2) {
        super.setTextAppearance(i2);
        f fVar = this.f6376e;
        if (fVar != null) {
            fVar.Q(new C0916d(fVar.f8104n0, i2));
        }
        h();
    }

    public void setInternalOnCheckedChangeListener(m2.e eVar) {
    }
}
