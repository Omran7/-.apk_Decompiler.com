package com.google.android.material.textfield;

import B0.H;
import C.d;
import I.b;
import K.O;
import K1.e;
import Z1.a;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.os.Parcelable;
import android.text.Editable;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStructure;
import android.view.ViewTreeObserver;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bumptech.glide.c;
import com.google.android.material.internal.CheckableImageButton;
import com.mtma.criminal.city.R;
import d2.C0462a;
import h3.j;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Locale;
import java.util.WeakHashMap;
import k.C0703b0;
import k.C0724m;
import k.C0725m0;
import k.C0737s0;
import k.C0740u;
import m2.C0836b;
import p2.C0913a;
import p2.C0916d;
import s2.C0962a;
import s2.f;
import s2.g;
import s2.k;
import t0.h;
import t0.q;
import v2.i;
import v2.l;
import v2.o;
import v2.p;
import v2.r;
import v2.t;
import v2.u;
import v2.v;
import v2.w;
import v2.x;

public class TextInputLayout extends LinearLayout implements ViewTreeObserver.OnGlobalLayoutListener {
    public static final int[][] L0 = {new int[]{16842919}, new int[0]};

    /* renamed from: A  reason: collision with root package name */
    public CharSequence f6508A;

    /* renamed from: A0  reason: collision with root package name */
    public int f6509A0;

    /* renamed from: B  reason: collision with root package name */
    public boolean f6510B;

    /* renamed from: B0  reason: collision with root package name */
    public int f6511B0;

    /* renamed from: C  reason: collision with root package name */
    public C0703b0 f6512C;

    /* renamed from: C0  reason: collision with root package name */
    public int f6513C0;

    /* renamed from: D  reason: collision with root package name */
    public ColorStateList f6514D;

    /* renamed from: D0  reason: collision with root package name */
    public boolean f6515D0;

    /* renamed from: E  reason: collision with root package name */
    public int f6516E;

    /* renamed from: E0  reason: collision with root package name */
    public final C0836b f6517E0;
    public h F;

    /* renamed from: F0  reason: collision with root package name */
    public boolean f6518F0;

    /* renamed from: G  reason: collision with root package name */
    public h f6519G;

    /* renamed from: G0  reason: collision with root package name */
    public boolean f6520G0;

    /* renamed from: H  reason: collision with root package name */
    public ColorStateList f6521H;

    /* renamed from: H0  reason: collision with root package name */
    public ValueAnimator f6522H0;

    /* renamed from: I  reason: collision with root package name */
    public ColorStateList f6523I;

    /* renamed from: I0  reason: collision with root package name */
    public boolean f6524I0;

    /* renamed from: J  reason: collision with root package name */
    public ColorStateList f6525J;

    /* renamed from: J0  reason: collision with root package name */
    public boolean f6526J0;

    /* renamed from: K  reason: collision with root package name */
    public ColorStateList f6527K;

    /* renamed from: K0  reason: collision with root package name */
    public boolean f6528K0;

    /* renamed from: L  reason: collision with root package name */
    public boolean f6529L;

    /* renamed from: M  reason: collision with root package name */
    public CharSequence f6530M;

    /* renamed from: N  reason: collision with root package name */
    public boolean f6531N;

    /* renamed from: O  reason: collision with root package name */
    public g f6532O;

    /* renamed from: P  reason: collision with root package name */
    public g f6533P;

    /* renamed from: Q  reason: collision with root package name */
    public StateListDrawable f6534Q;

    /* renamed from: R  reason: collision with root package name */
    public boolean f6535R;

    /* renamed from: S  reason: collision with root package name */
    public g f6536S;

    /* renamed from: T  reason: collision with root package name */
    public g f6537T;

    /* renamed from: U  reason: collision with root package name */
    public k f6538U;

    /* renamed from: V  reason: collision with root package name */
    public boolean f6539V;

    /* renamed from: W  reason: collision with root package name */
    public final int f6540W;

    /* renamed from: a  reason: collision with root package name */
    public final FrameLayout f6541a;

    /* renamed from: a0  reason: collision with root package name */
    public int f6542a0;

    /* renamed from: b  reason: collision with root package name */
    public final t f6543b;

    /* renamed from: b0  reason: collision with root package name */
    public int f6544b0;

    /* renamed from: c  reason: collision with root package name */
    public final l f6545c;

    /* renamed from: c0  reason: collision with root package name */
    public int f6546c0;
    public EditText d;

    /* renamed from: d0  reason: collision with root package name */
    public int f6547d0;

    /* renamed from: e  reason: collision with root package name */
    public CharSequence f6548e;

    /* renamed from: e0  reason: collision with root package name */
    public int f6549e0;

    /* renamed from: f  reason: collision with root package name */
    public int f6550f = -1;

    /* renamed from: f0  reason: collision with root package name */
    public int f6551f0;

    /* renamed from: g0  reason: collision with root package name */
    public int f6552g0;

    /* renamed from: h0  reason: collision with root package name */
    public final Rect f6553h0 = new Rect();

    /* renamed from: i0  reason: collision with root package name */
    public final Rect f6554i0 = new Rect();

    /* renamed from: j0  reason: collision with root package name */
    public final RectF f6555j0 = new RectF();

    /* renamed from: k0  reason: collision with root package name */
    public Typeface f6556k0;

    /* renamed from: l0  reason: collision with root package name */
    public ColorDrawable f6557l0;

    /* renamed from: m0  reason: collision with root package name */
    public int f6558m0;

    /* renamed from: n0  reason: collision with root package name */
    public final LinkedHashSet f6559n0 = new LinkedHashSet();

    /* renamed from: o0  reason: collision with root package name */
    public ColorDrawable f6560o0;

    /* renamed from: p  reason: collision with root package name */
    public int f6561p = -1;

    /* renamed from: p0  reason: collision with root package name */
    public int f6562p0;

    /* renamed from: q  reason: collision with root package name */
    public int f6563q = -1;

    /* renamed from: q0  reason: collision with root package name */
    public Drawable f6564q0;

    /* renamed from: r  reason: collision with root package name */
    public int f6565r = -1;

    /* renamed from: r0  reason: collision with root package name */
    public ColorStateList f6566r0;

    /* renamed from: s  reason: collision with root package name */
    public final p f6567s = new p(this);
    public ColorStateList s0;

    /* renamed from: t  reason: collision with root package name */
    public boolean f6568t;

    /* renamed from: t0  reason: collision with root package name */
    public int f6569t0;

    /* renamed from: u  reason: collision with root package name */
    public int f6570u;

    /* renamed from: u0  reason: collision with root package name */
    public int f6571u0;

    /* renamed from: v  reason: collision with root package name */
    public boolean f6572v;

    /* renamed from: v0  reason: collision with root package name */
    public int f6573v0;

    /* renamed from: w  reason: collision with root package name */
    public w f6574w = new j(10);

    /* renamed from: w0  reason: collision with root package name */
    public ColorStateList f6575w0;

    /* renamed from: x  reason: collision with root package name */
    public C0703b0 f6576x;

    /* renamed from: x0  reason: collision with root package name */
    public int f6577x0;

    /* renamed from: y  reason: collision with root package name */
    public int f6578y;

    /* renamed from: y0  reason: collision with root package name */
    public int f6579y0;

    /* renamed from: z  reason: collision with root package name */
    public int f6580z;

    /* renamed from: z0  reason: collision with root package name */
    public int f6581z0;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public TextInputLayout(android.content.Context r18, android.util.AttributeSet r19) {
        /*
            r17 = this;
            r0 = r17
            r7 = r19
            r8 = 2130904242(0x7f0304b2, float:1.7415325E38)
            r9 = 2131952453(0x7f130345, float:1.954135E38)
            r1 = r18
            android.content.Context r1 = x2.C1097a.a(r1, r7, r8, r9)
            r0.<init>(r1, r7, r8)
            r10 = -1
            r0.f6550f = r10
            r0.f6561p = r10
            r0.f6563q = r10
            r0.f6565r = r10
            v2.p r1 = new v2.p
            r1.<init>(r0)
            r0.f6567s = r1
            h3.j r1 = new h3.j
            r2 = 10
            r1.<init>(r2)
            r0.f6574w = r1
            android.graphics.Rect r1 = new android.graphics.Rect
            r1.<init>()
            r0.f6553h0 = r1
            android.graphics.Rect r1 = new android.graphics.Rect
            r1.<init>()
            r0.f6554i0 = r1
            android.graphics.RectF r1 = new android.graphics.RectF
            r1.<init>()
            r0.f6555j0 = r1
            java.util.LinkedHashSet r1 = new java.util.LinkedHashSet
            r1.<init>()
            r0.f6559n0 = r1
            m2.b r1 = new m2.b
            r1.<init>(r0)
            r0.f6517E0 = r1
            r11 = 0
            r0.f6528K0 = r11
            android.content.Context r12 = r17.getContext()
            r13 = 1
            r0.setOrientation(r13)
            r0.setWillNotDraw(r11)
            r0.setAddStatesFromChildren(r13)
            android.widget.FrameLayout r14 = new android.widget.FrameLayout
            r14.<init>(r12)
            r0.f6541a = r14
            r14.setAddStatesFromChildren(r13)
            android.view.animation.LinearInterpolator r2 = Z1.a.f4469a
            r1.f10088Q = r2
            r1.h(r11)
            r1.f10087P = r2
            r1.h(r11)
            int r2 = r1.g
            r3 = 8388659(0x800033, float:1.1755015E-38)
            if (r2 == r3) goto L_0x0082
            r1.g = r3
            r1.h(r11)
        L_0x0082:
            int[] r15 = Y1.a.f4245A
            r6 = 22
            r5 = 20
            r4 = 40
            r3 = 45
            r2 = 49
            int[] r16 = new int[]{r6, r5, r4, r3, r2}
            r1 = 2131952453(0x7f130345, float:1.954135E38)
            m2.k.a(r12, r7, r8, r1)
            r18 = r1
            r1 = r12
            r2 = r19
            r3 = r15
            r4 = r8
            r5 = r18
            r6 = r16
            m2.k.b(r1, r2, r3, r4, r5, r6)
            c1.i r1 = new c1.i
            r2 = r18
            android.content.res.TypedArray r2 = r12.obtainStyledAttributes(r7, r15, r8, r2)
            r1.<init>((android.content.Context) r12, (android.content.res.TypedArray) r2)
            v2.t r3 = new v2.t
            r3.<init>(r0, r1)
            r0.f6543b = r3
            r4 = 48
            boolean r4 = r2.getBoolean(r4, r13)
            r0.f6529L = r4
            r4 = 4
            java.lang.CharSequence r4 = r2.getText(r4)
            r0.setHint((java.lang.CharSequence) r4)
            r4 = 47
            boolean r4 = r2.getBoolean(r4, r13)
            r0.f6520G0 = r4
            r4 = 42
            boolean r4 = r2.getBoolean(r4, r13)
            r0.f6518F0 = r4
            r4 = 6
            boolean r5 = r2.hasValue(r4)
            if (r5 == 0) goto L_0x00e7
            int r4 = r2.getInt(r4, r10)
            r0.setMinEms(r4)
            goto L_0x00f5
        L_0x00e7:
            r4 = 3
            boolean r5 = r2.hasValue(r4)
            if (r5 == 0) goto L_0x00f5
            int r4 = r2.getDimensionPixelSize(r4, r10)
            r0.setMinWidth(r4)
        L_0x00f5:
            r4 = 5
            boolean r5 = r2.hasValue(r4)
            r6 = 2
            if (r5 == 0) goto L_0x0105
            int r4 = r2.getInt(r4, r10)
            r0.setMaxEms(r4)
            goto L_0x0112
        L_0x0105:
            boolean r4 = r2.hasValue(r6)
            if (r4 == 0) goto L_0x0112
            int r4 = r2.getDimensionPixelSize(r6, r10)
            r0.setMaxWidth(r4)
        L_0x0112:
            s2.j r4 = s2.k.b(r12, r7, r8, r9)
            s2.k r4 = r4.a()
            r0.f6538U = r4
            android.content.res.Resources r4 = r12.getResources()
            r5 = 2131100416(0x7f060300, float:1.7813213E38)
            int r4 = r4.getDimensionPixelOffset(r5)
            r0.f6540W = r4
            r4 = 9
            int r4 = r2.getDimensionPixelOffset(r4, r11)
            r0.f6544b0 = r4
            android.content.res.Resources r4 = r12.getResources()
            r5 = 2131100417(0x7f060301, float:1.7813215E38)
            int r4 = r4.getDimensionPixelSize(r5)
            r5 = 16
            int r4 = r2.getDimensionPixelSize(r5, r4)
            r0.f6547d0 = r4
            android.content.res.Resources r4 = r12.getResources()
            r5 = 2131100418(0x7f060302, float:1.7813217E38)
            int r4 = r4.getDimensionPixelSize(r5)
            r5 = 17
            int r4 = r2.getDimensionPixelSize(r5, r4)
            r0.f6549e0 = r4
            int r4 = r0.f6547d0
            r0.f6546c0 = r4
            r4 = 13
            r5 = -1082130432(0xffffffffbf800000, float:-1.0)
            float r4 = r2.getDimension(r4, r5)
            r7 = 12
            float r7 = r2.getDimension(r7, r5)
            r8 = 10
            float r8 = r2.getDimension(r8, r5)
            r9 = 11
            float r5 = r2.getDimension(r9, r5)
            s2.k r9 = r0.f6538U
            s2.j r9 = r9.e()
            r15 = 0
            int r16 = (r4 > r15 ? 1 : (r4 == r15 ? 0 : -1))
            if (r16 < 0) goto L_0x0187
            s2.a r6 = new s2.a
            r6.<init>(r4)
            r9.f11479e = r6
        L_0x0187:
            int r4 = (r7 > r15 ? 1 : (r7 == r15 ? 0 : -1))
            if (r4 < 0) goto L_0x0192
            s2.a r4 = new s2.a
            r4.<init>(r7)
            r9.f11480f = r4
        L_0x0192:
            int r4 = (r8 > r15 ? 1 : (r8 == r15 ? 0 : -1))
            if (r4 < 0) goto L_0x019d
            s2.a r4 = new s2.a
            r4.<init>(r8)
            r9.g = r4
        L_0x019d:
            int r4 = (r5 > r15 ? 1 : (r5 == r15 ? 0 : -1))
            if (r4 < 0) goto L_0x01a8
            s2.a r4 = new s2.a
            r4.<init>(r5)
            r9.h = r4
        L_0x01a8:
            s2.k r4 = r9.a()
            r0.f6538U = r4
            r4 = 7
            android.content.res.ColorStateList r4 = com.bumptech.glide.d.b0(r12, r1, r4)
            if (r4 == 0) goto L_0x020e
            int r5 = r4.getDefaultColor()
            r0.f6577x0 = r5
            r0.f6552g0 = r5
            boolean r5 = r4.isStateful()
            r6 = 16843623(0x1010367, float:2.3696E-38)
            r7 = -16842910(0xfffffffffefeff62, float:-1.6947497E38)
            if (r5 == 0) goto L_0x01ee
            int[] r5 = new int[]{r7}
            int r5 = r4.getColorForState(r5, r10)
            r0.f6579y0 = r5
            r5 = 16842908(0x101009c, float:2.3693995E-38)
            r7 = 16842910(0x101009e, float:2.3694E-38)
            int[] r5 = new int[]{r5, r7}
            int r5 = r4.getColorForState(r5, r10)
            r0.f6581z0 = r5
            int[] r5 = new int[]{r6, r7}
            int r4 = r4.getColorForState(r5, r10)
            r0.f6509A0 = r4
            goto L_0x0218
        L_0x01ee:
            int r4 = r0.f6577x0
            r0.f6581z0 = r4
            r4 = 2131034865(0x7f0502f1, float:1.768026E38)
            android.content.res.ColorStateList r4 = A.h.getColorStateList(r12, r4)
            int[] r5 = new int[]{r7}
            int r5 = r4.getColorForState(r5, r10)
            r0.f6579y0 = r5
            int[] r5 = new int[]{r6}
            int r4 = r4.getColorForState(r5, r10)
            r0.f6509A0 = r4
            goto L_0x0218
        L_0x020e:
            r0.f6552g0 = r11
            r0.f6577x0 = r11
            r0.f6579y0 = r11
            r0.f6581z0 = r11
            r0.f6509A0 = r11
        L_0x0218:
            boolean r4 = r2.hasValue(r13)
            if (r4 == 0) goto L_0x0226
            android.content.res.ColorStateList r4 = r1.m(r13)
            r0.s0 = r4
            r0.f6566r0 = r4
        L_0x0226:
            r4 = 14
            android.content.res.ColorStateList r5 = com.bumptech.glide.d.b0(r12, r1, r4)
            int r4 = r2.getColor(r4, r11)
            r0.f6573v0 = r4
            r4 = 2131034892(0x7f05030c, float:1.7680314E38)
            int r4 = A.h.getColor(r12, r4)
            r0.f6569t0 = r4
            r4 = 2131034893(0x7f05030d, float:1.7680316E38)
            int r4 = A.h.getColor(r12, r4)
            r0.f6511B0 = r4
            r4 = 2131034896(0x7f050310, float:1.7680322E38)
            int r4 = A.h.getColor(r12, r4)
            r0.f6571u0 = r4
            if (r5 == 0) goto L_0x0252
            r0.setBoxStrokeColorStateList(r5)
        L_0x0252:
            r4 = 15
            boolean r5 = r2.hasValue(r4)
            if (r5 == 0) goto L_0x0261
            android.content.res.ColorStateList r4 = com.bumptech.glide.d.b0(r12, r1, r4)
            r0.setBoxStrokeErrorColor(r4)
        L_0x0261:
            r4 = 49
            int r5 = r2.getResourceId(r4, r10)
            if (r5 == r10) goto L_0x0270
            int r4 = r2.getResourceId(r4, r11)
            r0.setHintTextAppearance(r4)
        L_0x0270:
            r4 = 24
            android.content.res.ColorStateList r4 = r1.m(r4)
            r0.f6525J = r4
            r4 = 25
            android.content.res.ColorStateList r4 = r1.m(r4)
            r0.f6527K = r4
            r4 = 40
            int r4 = r2.getResourceId(r4, r11)
            r5 = 35
            java.lang.CharSequence r5 = r2.getText(r5)
            r6 = 34
            int r6 = r2.getInt(r6, r13)
            r7 = 36
            boolean r7 = r2.getBoolean(r7, r11)
            r8 = 45
            int r8 = r2.getResourceId(r8, r11)
            r9 = 44
            boolean r9 = r2.getBoolean(r9, r11)
            r12 = 43
            java.lang.CharSequence r12 = r2.getText(r12)
            r15 = 57
            int r15 = r2.getResourceId(r15, r11)
            r13 = 56
            java.lang.CharSequence r13 = r2.getText(r13)
            r10 = 18
            boolean r10 = r2.getBoolean(r10, r11)
            r11 = 19
            r19 = r12
            r12 = -1
            int r11 = r2.getInt(r11, r12)
            r0.setCounterMaxLength(r11)
            r11 = 0
            r12 = 22
            int r12 = r2.getResourceId(r12, r11)
            r0.f6580z = r12
            r12 = 20
            int r12 = r2.getResourceId(r12, r11)
            r0.f6578y = r12
            r12 = 8
            int r12 = r2.getInt(r12, r11)
            r0.setBoxBackgroundMode(r12)
            r0.setErrorContentDescription(r5)
            r0.setErrorAccessibilityLiveRegion(r6)
            int r5 = r0.f6578y
            r0.setCounterOverflowTextAppearance(r5)
            r0.setHelperTextTextAppearance(r8)
            r0.setErrorTextAppearance(r4)
            int r4 = r0.f6580z
            r0.setCounterTextAppearance(r4)
            r0.setPlaceholderText(r13)
            r0.setPlaceholderTextAppearance(r15)
            r4 = 41
            boolean r5 = r2.hasValue(r4)
            if (r5 == 0) goto L_0x030d
            android.content.res.ColorStateList r4 = r1.m(r4)
            r0.setErrorTextColor(r4)
        L_0x030d:
            r4 = 46
            boolean r5 = r2.hasValue(r4)
            if (r5 == 0) goto L_0x031c
            android.content.res.ColorStateList r4 = r1.m(r4)
            r0.setHelperTextColor(r4)
        L_0x031c:
            r4 = 50
            boolean r5 = r2.hasValue(r4)
            if (r5 == 0) goto L_0x032b
            android.content.res.ColorStateList r4 = r1.m(r4)
            r0.setHintTextColor(r4)
        L_0x032b:
            r4 = 23
            boolean r5 = r2.hasValue(r4)
            if (r5 == 0) goto L_0x033a
            android.content.res.ColorStateList r4 = r1.m(r4)
            r0.setCounterTextColor(r4)
        L_0x033a:
            r4 = 21
            boolean r5 = r2.hasValue(r4)
            if (r5 == 0) goto L_0x0349
            android.content.res.ColorStateList r4 = r1.m(r4)
            r0.setCounterOverflowTextColor(r4)
        L_0x0349:
            r4 = 58
            boolean r5 = r2.hasValue(r4)
            if (r5 == 0) goto L_0x0358
            android.content.res.ColorStateList r4 = r1.m(r4)
            r0.setPlaceholderTextColor(r4)
        L_0x0358:
            v2.l r4 = new v2.l
            r4.<init>(r0, r1)
            r0.f6545c = r4
            r5 = 0
            r6 = 1
            boolean r2 = r2.getBoolean(r5, r6)
            r1.G()
            r1 = 2
            r0.setImportantForAccessibility(r1)
            int r1 = android.os.Build.VERSION.SDK_INT
            r5 = 26
            if (r1 < r5) goto L_0x0377
            if (r1 < r5) goto L_0x0377
            K.F.m(r0, r6)
        L_0x0377:
            r14.addView(r3)
            r14.addView(r4)
            r0.addView(r14)
            r0.setEnabled(r2)
            r0.setHelperTextEnabled(r9)
            r0.setErrorEnabled(r7)
            r0.setCounterEnabled(r10)
            r1 = r19
            r0.setHelperText(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.<init>(android.content.Context, android.util.AttributeSet):void");
    }

    private Drawable getEditTextBoxBackground() {
        int i2;
        EditText editText = this.d;
        if (!(editText instanceof AutoCompleteTextView) || e.c0(editText)) {
            return this.f6532O;
        }
        int t6 = e.t(this.d, R.attr.colorControlHighlight);
        int i5 = this.f6542a0;
        int[][] iArr = L0;
        if (i5 == 2) {
            Context context = getContext();
            g gVar = this.f6532O;
            TypedValue j02 = c.j0(R.attr.colorSurface, context, "TextInputLayout");
            int i6 = j02.resourceId;
            if (i6 != 0) {
                i2 = A.h.getColor(context, i6);
            } else {
                i2 = j02.data;
            }
            g gVar2 = new g(gVar.f11459a.f11441a);
            int h02 = e.h0(t6, i2, 0.1f);
            gVar2.j(new ColorStateList(iArr, new int[]{h02, 0}));
            gVar2.setTint(i2);
            ColorStateList colorStateList = new ColorStateList(iArr, new int[]{h02, i2});
            g gVar3 = new g(gVar.f11459a.f11441a);
            gVar3.setTint(-1);
            return new LayerDrawable(new Drawable[]{new RippleDrawable(colorStateList, gVar2, gVar3), gVar});
        } else if (i5 != 1) {
            return null;
        } else {
            g gVar4 = this.f6532O;
            int i7 = this.f6552g0;
            return new RippleDrawable(new ColorStateList(iArr, new int[]{e.h0(t6, i7, 0.1f), i7}), gVar4, gVar4);
        }
    }

    private Drawable getOrCreateFilledDropDownMenuBackground() {
        if (this.f6534Q == null) {
            StateListDrawable stateListDrawable = new StateListDrawable();
            this.f6534Q = stateListDrawable;
            stateListDrawable.addState(new int[]{16842922}, getOrCreateOutlinedDropDownMenuBackground());
            this.f6534Q.addState(new int[0], f(false));
        }
        return this.f6534Q;
    }

    private Drawable getOrCreateOutlinedDropDownMenuBackground() {
        if (this.f6533P == null) {
            this.f6533P = f(true);
        }
        return this.f6533P;
    }

    public static void k(ViewGroup viewGroup, boolean z3) {
        int childCount = viewGroup.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = viewGroup.getChildAt(i2);
            childAt.setEnabled(z3);
            if (childAt instanceof ViewGroup) {
                k((ViewGroup) childAt, z3);
            }
        }
    }

    private void setEditText(EditText editText) {
        if (this.d == null) {
            if (getEndIconMode() != 3 && !(editText instanceof TextInputEditText)) {
                Log.i("TextInputLayout", "EditText added is not a TextInputEditText. Please switch to using that class instead.");
            }
            this.d = editText;
            int i2 = this.f6550f;
            if (i2 != -1) {
                setMinEms(i2);
            } else {
                setMinWidth(this.f6563q);
            }
            int i5 = this.f6561p;
            if (i5 != -1) {
                setMaxEms(i5);
            } else {
                setMaxWidth(this.f6565r);
            }
            this.f6535R = false;
            i();
            setTextInputAccessibilityDelegate(new v(this));
            Typeface typeface = this.d.getTypeface();
            C0836b bVar = this.f6517E0;
            bVar.m(typeface);
            float textSize = this.d.getTextSize();
            if (bVar.h != textSize) {
                bVar.h = textSize;
                bVar.h(false);
            }
            int i6 = Build.VERSION.SDK_INT;
            float letterSpacing = this.d.getLetterSpacing();
            if (bVar.f10094W != letterSpacing) {
                bVar.f10094W = letterSpacing;
                bVar.h(false);
            }
            int gravity = this.d.getGravity();
            int i7 = (gravity & -113) | 48;
            if (bVar.g != i7) {
                bVar.g = i7;
                bVar.h(false);
            }
            if (bVar.f10107f != gravity) {
                bVar.f10107f = gravity;
                bVar.h(false);
            }
            WeakHashMap weakHashMap = O.f1352a;
            this.f6513C0 = editText.getMinimumHeight();
            this.d.addTextChangedListener(new u(this, editText));
            if (this.f6566r0 == null) {
                this.f6566r0 = this.d.getHintTextColors();
            }
            if (this.f6529L) {
                if (TextUtils.isEmpty(this.f6530M)) {
                    CharSequence hint = this.d.getHint();
                    this.f6548e = hint;
                    setHint(hint);
                    this.d.setHint((CharSequence) null);
                }
                this.f6531N = true;
            }
            if (i6 >= 29) {
                p();
            }
            if (this.f6576x != null) {
                n(this.d.getText());
            }
            r();
            this.f6567s.b();
            this.f6543b.bringToFront();
            l lVar = this.f6545c;
            lVar.bringToFront();
            Iterator it2 = this.f6559n0.iterator();
            while (it2.hasNext()) {
                ((v2.k) it2.next()).a(this);
            }
            lVar.m();
            if (!isEnabled()) {
                editText.setEnabled(false);
            }
            u(false, true);
            return;
        }
        throw new IllegalArgumentException("We already have an EditText, can only have one");
    }

    private void setHintInternal(CharSequence charSequence) {
        if (!TextUtils.equals(charSequence, this.f6530M)) {
            this.f6530M = charSequence;
            C0836b bVar = this.f6517E0;
            if (charSequence == null || !TextUtils.equals(bVar.f10073A, charSequence)) {
                bVar.f10073A = charSequence;
                bVar.f10074B = null;
                Bitmap bitmap = bVar.f10077E;
                if (bitmap != null) {
                    bitmap.recycle();
                    bVar.f10077E = null;
                }
                bVar.h(false);
            }
            if (!this.f6515D0) {
                j();
            }
        }
    }

    private void setPlaceholderTextEnabled(boolean z3) {
        if (this.f6510B != z3) {
            if (z3) {
                C0703b0 b0Var = this.f6512C;
                if (b0Var != null) {
                    this.f6541a.addView(b0Var);
                    this.f6512C.setVisibility(0);
                }
            } else {
                C0703b0 b0Var2 = this.f6512C;
                if (b0Var2 != null) {
                    b0Var2.setVisibility(8);
                }
                this.f6512C = null;
            }
            this.f6510B = z3;
        }
    }

    public final void a(float f6) {
        C0836b bVar = this.f6517E0;
        if (bVar.f10100b != f6) {
            if (this.f6522H0 == null) {
                ValueAnimator valueAnimator = new ValueAnimator();
                this.f6522H0 = valueAnimator;
                valueAnimator.setInterpolator(e.o0(getContext(), R.attr.motionEasingEmphasizedInterpolator, a.f4470b));
                this.f6522H0.setDuration((long) e.n0(R.attr.motionDurationMedium4, 167, getContext()));
                this.f6522H0.addUpdateListener(new C0462a(this, 2));
            }
            this.f6522H0.setFloatValues(new float[]{bVar.f10100b, f6});
            this.f6522H0.start();
        }
    }

    public final void addView(View view, int i2, ViewGroup.LayoutParams layoutParams) {
        if (view instanceof EditText) {
            FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(layoutParams);
            layoutParams2.gravity = (layoutParams2.gravity & -113) | 16;
            FrameLayout frameLayout = this.f6541a;
            frameLayout.addView(view, layoutParams2);
            frameLayout.setLayoutParams(layoutParams);
            t();
            setEditText((EditText) view);
            return;
        }
        super.addView(view, i2, layoutParams);
    }

    public final void b() {
        ColorStateList colorStateList;
        int i2;
        int i5;
        g gVar = this.f6532O;
        if (gVar != null) {
            k kVar = gVar.f11459a.f11441a;
            k kVar2 = this.f6538U;
            if (kVar != kVar2) {
                gVar.setShapeAppearanceModel(kVar2);
            }
            if (this.f6542a0 == 2 && (i2 = this.f6546c0) > -1 && (i5 = this.f6551f0) != 0) {
                g gVar2 = this.f6532O;
                gVar2.f11459a.f11447j = (float) i2;
                gVar2.invalidateSelf();
                ColorStateList valueOf = ColorStateList.valueOf(i5);
                f fVar = gVar2.f11459a;
                if (fVar.d != valueOf) {
                    fVar.d = valueOf;
                    gVar2.onStateChange(gVar2.getState());
                }
            }
            int i6 = this.f6552g0;
            if (this.f6542a0 == 1) {
                i6 = d.b(this.f6552g0, e.s(R.attr.colorSurface, 0, getContext()));
            }
            this.f6552g0 = i6;
            this.f6532O.j(ColorStateList.valueOf(i6));
            g gVar3 = this.f6536S;
            if (!(gVar3 == null || this.f6537T == null)) {
                if (this.f6546c0 > -1 && this.f6551f0 != 0) {
                    if (this.d.isFocused()) {
                        colorStateList = ColorStateList.valueOf(this.f6569t0);
                    } else {
                        colorStateList = ColorStateList.valueOf(this.f6551f0);
                    }
                    gVar3.j(colorStateList);
                    this.f6537T.j(ColorStateList.valueOf(this.f6551f0));
                }
                invalidate();
            }
            s();
        }
    }

    public final int c() {
        float d6;
        if (!this.f6529L) {
            return 0;
        }
        int i2 = this.f6542a0;
        C0836b bVar = this.f6517E0;
        if (i2 == 0) {
            d6 = bVar.d();
        } else if (i2 != 2) {
            return 0;
        } else {
            d6 = bVar.d() / 2.0f;
        }
        return (int) d6;
    }

    public final h d() {
        h hVar = new h();
        hVar.f11670c = (long) e.n0(R.attr.motionDurationShort2, 87, getContext());
        hVar.d = e.o0(getContext(), R.attr.motionEasingLinearInterpolator, a.f4469a);
        return hVar;
    }

    public final void dispatchProvideAutofillStructure(ViewStructure viewStructure, int i2) {
        EditText editText = this.d;
        if (editText == null) {
            super.dispatchProvideAutofillStructure(viewStructure, i2);
            return;
        }
        if (this.f6548e != null) {
            boolean z3 = this.f6531N;
            this.f6531N = false;
            CharSequence hint = editText.getHint();
            this.d.setHint(this.f6548e);
            try {
                super.dispatchProvideAutofillStructure(viewStructure, i2);
            } finally {
                this.d.setHint(hint);
                this.f6531N = z3;
            }
        } else {
            viewStructure.setAutofillId(getAutofillId());
            onProvideAutofillStructure(viewStructure, i2);
            onProvideAutofillVirtualStructure(viewStructure, i2);
            FrameLayout frameLayout = this.f6541a;
            viewStructure.setChildCount(frameLayout.getChildCount());
            for (int i5 = 0; i5 < frameLayout.getChildCount(); i5++) {
                View childAt = frameLayout.getChildAt(i5);
                ViewStructure newChild = viewStructure.newChild(i5);
                childAt.dispatchProvideAutofillStructure(newChild, i2);
                if (childAt == this.d) {
                    newChild.setHint(getHint());
                }
            }
        }
    }

    public final void dispatchRestoreInstanceState(SparseArray sparseArray) {
        this.f6526J0 = true;
        super.dispatchRestoreInstanceState(sparseArray);
        this.f6526J0 = false;
    }

    public final void draw(Canvas canvas) {
        g gVar;
        int i2;
        Canvas canvas2 = canvas;
        super.draw(canvas);
        boolean z3 = this.f6529L;
        C0836b bVar = this.f6517E0;
        if (z3) {
            bVar.getClass();
            int save = canvas.save();
            if (bVar.f10074B != null) {
                RectF rectF = bVar.f10105e;
                if (rectF.width() > 0.0f && rectF.height() > 0.0f) {
                    TextPaint textPaint = bVar.f10085N;
                    textPaint.setTextSize(bVar.f10078G);
                    float f6 = bVar.f10116p;
                    float f7 = bVar.f10117q;
                    float f8 = bVar.F;
                    if (f8 != 1.0f) {
                        canvas2.scale(f8, f8, f6, f7);
                    }
                    if (bVar.f10104d0 <= 1 || bVar.f10075C) {
                        canvas2.translate(f6, f7);
                        bVar.f10096Y.draw(canvas2);
                    } else {
                        int alpha = textPaint.getAlpha();
                        canvas2.translate(bVar.f10116p - ((float) bVar.f10096Y.getLineStart(0)), f7);
                        float f9 = (float) alpha;
                        textPaint.setAlpha((int) (bVar.f10101b0 * f9));
                        int i5 = Build.VERSION.SDK_INT;
                        if (i5 >= 31) {
                            float f10 = bVar.f10079H;
                            float f11 = bVar.f10080I;
                            float f12 = bVar.f10081J;
                            int i6 = bVar.f10082K;
                            textPaint.setShadowLayer(f10, f11, f12, d.d(i6, (textPaint.getAlpha() * Color.alpha(i6)) / 255));
                        }
                        bVar.f10096Y.draw(canvas2);
                        textPaint.setAlpha((int) (bVar.f10099a0 * f9));
                        if (i5 >= 31) {
                            float f13 = bVar.f10079H;
                            float f14 = bVar.f10080I;
                            float f15 = bVar.f10081J;
                            int i7 = bVar.f10082K;
                            textPaint.setShadowLayer(f13, f14, f15, d.d(i7, (Color.alpha(i7) * textPaint.getAlpha()) / 255));
                        }
                        int lineBaseline = bVar.f10096Y.getLineBaseline(0);
                        CharSequence charSequence = bVar.f10103c0;
                        float f16 = (float) lineBaseline;
                        float f17 = f16;
                        canvas.drawText(charSequence, 0, charSequence.length(), 0.0f, f16, textPaint);
                        if (i5 >= 31) {
                            textPaint.setShadowLayer(bVar.f10079H, bVar.f10080I, bVar.f10081J, bVar.f10082K);
                        }
                        String trim = bVar.f10103c0.toString().trim();
                        if (trim.endsWith("…")) {
                            i2 = 0;
                            trim = trim.substring(0, trim.length() - 1);
                        } else {
                            i2 = 0;
                        }
                        String str = trim;
                        textPaint.setAlpha(alpha);
                        canvas.drawText(str, 0, Math.min(bVar.f10096Y.getLineEnd(i2), str.length()), 0.0f, f17, textPaint);
                    }
                    canvas2.restoreToCount(save);
                }
            }
        }
        if (this.f6537T != null && (gVar = this.f6536S) != null) {
            gVar.draw(canvas2);
            if (this.d.isFocused()) {
                Rect bounds = this.f6537T.getBounds();
                Rect bounds2 = this.f6536S.getBounds();
                float f18 = bVar.f10100b;
                int centerX = bounds2.centerX();
                bounds.left = a.c(centerX, bounds2.left, f18);
                bounds.right = a.c(centerX, bounds2.right, f18);
                this.f6537T.draw(canvas2);
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0034  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x004f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void drawableStateChanged() {
        /*
            r4 = this;
            boolean r0 = r4.f6524I0
            if (r0 == 0) goto L_0x0005
            return
        L_0x0005:
            r0 = 1
            r4.f6524I0 = r0
            super.drawableStateChanged()
            int[] r1 = r4.getDrawableState()
            r2 = 0
            m2.b r3 = r4.f6517E0
            if (r3 == 0) goto L_0x002f
            r3.f10083L = r1
            android.content.res.ColorStateList r1 = r3.f10111k
            if (r1 == 0) goto L_0x0020
            boolean r1 = r1.isStateful()
            if (r1 != 0) goto L_0x002a
        L_0x0020:
            android.content.res.ColorStateList r1 = r3.f10110j
            if (r1 == 0) goto L_0x002f
            boolean r1 = r1.isStateful()
            if (r1 == 0) goto L_0x002f
        L_0x002a:
            r3.h(r2)
            r1 = r0
            goto L_0x0030
        L_0x002f:
            r1 = r2
        L_0x0030:
            android.widget.EditText r3 = r4.d
            if (r3 == 0) goto L_0x0047
            java.util.WeakHashMap r3 = K.O.f1352a
            boolean r3 = r4.isLaidOut()
            if (r3 == 0) goto L_0x0043
            boolean r3 = r4.isEnabled()
            if (r3 == 0) goto L_0x0043
            goto L_0x0044
        L_0x0043:
            r0 = r2
        L_0x0044:
            r4.u(r0, r2)
        L_0x0047:
            r4.r()
            r4.x()
            if (r1 == 0) goto L_0x0052
            r4.invalidate()
        L_0x0052:
            r4.f6524I0 = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.drawableStateChanged():void");
    }

    public final boolean e() {
        if (!this.f6529L || TextUtils.isEmpty(this.f6530M) || !(this.f6532O instanceof v2.g)) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: type inference failed for: r6v1, types: [java.lang.Object, I1.b] */
    /* JADX WARNING: type inference failed for: r7v0, types: [java.lang.Object, I1.b] */
    /* JADX WARNING: type inference failed for: r8v0, types: [java.lang.Object, I1.b] */
    /* JADX WARNING: type inference failed for: r9v0, types: [java.lang.Object, I1.b] */
    /* JADX WARNING: type inference failed for: r2v3, types: [s2.k, java.lang.Object] */
    public final g f(boolean z3) {
        float f6;
        float f7;
        ColorStateList colorStateList;
        int i2;
        float dimensionPixelOffset = (float) getResources().getDimensionPixelOffset(R.dimen.mtrl_shape_corner_size_small_component);
        if (z3) {
            f6 = dimensionPixelOffset;
        } else {
            f6 = 0.0f;
        }
        EditText editText = this.d;
        if (editText instanceof r) {
            f7 = ((r) editText).getPopupElevation();
        } else {
            f7 = (float) getResources().getDimensionPixelOffset(R.dimen.m3_comp_outlined_autocomplete_menu_container_elevation);
        }
        int dimensionPixelOffset2 = getResources().getDimensionPixelOffset(R.dimen.mtrl_exposed_dropdown_menu_popup_vertical_padding);
        ? obj = new Object();
        ? obj2 = new Object();
        ? obj3 = new Object();
        ? obj4 = new Object();
        s2.e eVar = new s2.e(0);
        s2.e eVar2 = new s2.e(0);
        s2.e eVar3 = new s2.e(0);
        s2.e eVar4 = new s2.e(0);
        C0962a aVar = new C0962a(f6);
        C0962a aVar2 = new C0962a(f6);
        C0962a aVar3 = new C0962a(dimensionPixelOffset);
        C0962a aVar4 = new C0962a(dimensionPixelOffset);
        ? obj5 = new Object();
        obj5.f11485a = obj;
        obj5.f11486b = obj2;
        obj5.f11487c = obj3;
        obj5.d = obj4;
        obj5.f11488e = aVar;
        obj5.f11489f = aVar2;
        obj5.g = aVar4;
        obj5.h = aVar3;
        obj5.f11490i = eVar;
        obj5.f11491j = eVar2;
        obj5.f11492k = eVar3;
        obj5.f11493l = eVar4;
        EditText editText2 = this.d;
        if (editText2 instanceof r) {
            colorStateList = ((r) editText2).getDropDownBackgroundTintList();
        } else {
            colorStateList = null;
        }
        Context context = getContext();
        if (colorStateList == null) {
            Paint paint = g.F;
            TypedValue j02 = c.j0(R.attr.colorSurface, context, g.class.getSimpleName());
            int i5 = j02.resourceId;
            if (i5 != 0) {
                i2 = A.h.getColor(context, i5);
            } else {
                i2 = j02.data;
            }
            colorStateList = ColorStateList.valueOf(i2);
        }
        g gVar = new g();
        gVar.h(context);
        gVar.j(colorStateList);
        gVar.i(f7);
        gVar.setShapeAppearanceModel(obj5);
        f fVar = gVar.f11459a;
        if (fVar.g == null) {
            fVar.g = new Rect();
        }
        gVar.f11459a.g.set(0, dimensionPixelOffset2, 0, dimensionPixelOffset2);
        gVar.invalidateSelf();
        return gVar;
    }

    public final int g(int i2, boolean z3) {
        int compoundPaddingLeft;
        if (!z3 && getPrefixText() != null) {
            compoundPaddingLeft = this.f6543b.a();
        } else if (!z3 || getSuffixText() == null) {
            compoundPaddingLeft = this.d.getCompoundPaddingLeft();
        } else {
            compoundPaddingLeft = this.f6545c.c();
        }
        return compoundPaddingLeft + i2;
    }

    public int getBaseline() {
        EditText editText = this.d;
        if (editText == null) {
            return super.getBaseline();
        }
        return c() + getPaddingTop() + editText.getBaseline();
    }

    public g getBoxBackground() {
        int i2 = this.f6542a0;
        if (i2 == 1 || i2 == 2) {
            return this.f6532O;
        }
        throw new IllegalStateException();
    }

    public int getBoxBackgroundColor() {
        return this.f6552g0;
    }

    public int getBoxBackgroundMode() {
        return this.f6542a0;
    }

    public int getBoxCollapsedPaddingTop() {
        return this.f6544b0;
    }

    public float getBoxCornerRadiusBottomEnd() {
        boolean e6 = m2.k.e(this);
        RectF rectF = this.f6555j0;
        if (e6) {
            return this.f6538U.h.a(rectF);
        }
        return this.f6538U.g.a(rectF);
    }

    public float getBoxCornerRadiusBottomStart() {
        boolean e6 = m2.k.e(this);
        RectF rectF = this.f6555j0;
        if (e6) {
            return this.f6538U.g.a(rectF);
        }
        return this.f6538U.h.a(rectF);
    }

    public float getBoxCornerRadiusTopEnd() {
        boolean e6 = m2.k.e(this);
        RectF rectF = this.f6555j0;
        if (e6) {
            return this.f6538U.f11488e.a(rectF);
        }
        return this.f6538U.f11489f.a(rectF);
    }

    public float getBoxCornerRadiusTopStart() {
        boolean e6 = m2.k.e(this);
        RectF rectF = this.f6555j0;
        if (e6) {
            return this.f6538U.f11489f.a(rectF);
        }
        return this.f6538U.f11488e.a(rectF);
    }

    public int getBoxStrokeColor() {
        return this.f6573v0;
    }

    public ColorStateList getBoxStrokeErrorColor() {
        return this.f6575w0;
    }

    public int getBoxStrokeWidth() {
        return this.f6547d0;
    }

    public int getBoxStrokeWidthFocused() {
        return this.f6549e0;
    }

    public int getCounterMaxLength() {
        return this.f6570u;
    }

    public CharSequence getCounterOverflowDescription() {
        C0703b0 b0Var;
        if (!this.f6568t || !this.f6572v || (b0Var = this.f6576x) == null) {
            return null;
        }
        return b0Var.getContentDescription();
    }

    public ColorStateList getCounterOverflowTextColor() {
        return this.f6523I;
    }

    public ColorStateList getCounterTextColor() {
        return this.f6521H;
    }

    public ColorStateList getCursorColor() {
        return this.f6525J;
    }

    public ColorStateList getCursorErrorColor() {
        return this.f6527K;
    }

    public ColorStateList getDefaultHintTextColor() {
        return this.f6566r0;
    }

    public EditText getEditText() {
        return this.d;
    }

    public CharSequence getEndIconContentDescription() {
        return this.f6545c.f12206p.getContentDescription();
    }

    public Drawable getEndIconDrawable() {
        return this.f6545c.f12206p.getDrawable();
    }

    public int getEndIconMinSize() {
        return this.f6545c.f12212v;
    }

    public int getEndIconMode() {
        return this.f6545c.f12208r;
    }

    public ImageView.ScaleType getEndIconScaleType() {
        return this.f6545c.f12213w;
    }

    public CheckableImageButton getEndIconView() {
        return this.f6545c.f12206p;
    }

    public CharSequence getError() {
        p pVar = this.f6567s;
        if (pVar.f12240q) {
            return pVar.f12239p;
        }
        return null;
    }

    public int getErrorAccessibilityLiveRegion() {
        return this.f6567s.f12243t;
    }

    public CharSequence getErrorContentDescription() {
        return this.f6567s.f12242s;
    }

    public int getErrorCurrentTextColors() {
        C0703b0 b0Var = this.f6567s.f12241r;
        if (b0Var != null) {
            return b0Var.getCurrentTextColor();
        }
        return -1;
    }

    public Drawable getErrorIconDrawable() {
        return this.f6545c.f12203c.getDrawable();
    }

    public CharSequence getHelperText() {
        p pVar = this.f6567s;
        if (pVar.f12247x) {
            return pVar.f12246w;
        }
        return null;
    }

    public int getHelperTextCurrentTextColor() {
        C0703b0 b0Var = this.f6567s.f12248y;
        if (b0Var != null) {
            return b0Var.getCurrentTextColor();
        }
        return -1;
    }

    public CharSequence getHint() {
        if (this.f6529L) {
            return this.f6530M;
        }
        return null;
    }

    public final float getHintCollapsedTextHeight() {
        return this.f6517E0.d();
    }

    public final int getHintCurrentCollapsedTextColor() {
        C0836b bVar = this.f6517E0;
        return bVar.e(bVar.f10111k);
    }

    public ColorStateList getHintTextColor() {
        return this.s0;
    }

    public w getLengthCounter() {
        return this.f6574w;
    }

    public int getMaxEms() {
        return this.f6561p;
    }

    public int getMaxWidth() {
        return this.f6565r;
    }

    public int getMinEms() {
        return this.f6550f;
    }

    public int getMinWidth() {
        return this.f6563q;
    }

    @Deprecated
    public CharSequence getPasswordVisibilityToggleContentDescription() {
        return this.f6545c.f12206p.getContentDescription();
    }

    @Deprecated
    public Drawable getPasswordVisibilityToggleDrawable() {
        return this.f6545c.f12206p.getDrawable();
    }

    public CharSequence getPlaceholderText() {
        if (this.f6510B) {
            return this.f6508A;
        }
        return null;
    }

    public int getPlaceholderTextAppearance() {
        return this.f6516E;
    }

    public ColorStateList getPlaceholderTextColor() {
        return this.f6514D;
    }

    public CharSequence getPrefixText() {
        return this.f6543b.f12265c;
    }

    public ColorStateList getPrefixTextColor() {
        return this.f6543b.f12264b.getTextColors();
    }

    public TextView getPrefixTextView() {
        return this.f6543b.f12264b;
    }

    public k getShapeAppearanceModel() {
        return this.f6538U;
    }

    public CharSequence getStartIconContentDescription() {
        return this.f6543b.d.getContentDescription();
    }

    public Drawable getStartIconDrawable() {
        return this.f6543b.d.getDrawable();
    }

    public int getStartIconMinSize() {
        return this.f6543b.f12268p;
    }

    public ImageView.ScaleType getStartIconScaleType() {
        return this.f6543b.f12269q;
    }

    public CharSequence getSuffixText() {
        return this.f6545c.f12215y;
    }

    public ColorStateList getSuffixTextColor() {
        return this.f6545c.f12216z.getTextColors();
    }

    public TextView getSuffixTextView() {
        return this.f6545c.f12216z;
    }

    public Typeface getTypeface() {
        return this.f6556k0;
    }

    public final int h(int i2, boolean z3) {
        int compoundPaddingRight;
        if (!z3 && getSuffixText() != null) {
            compoundPaddingRight = this.f6545c.c();
        } else if (!z3 || getPrefixText() == null) {
            compoundPaddingRight = this.d.getCompoundPaddingRight();
        } else {
            compoundPaddingRight = this.f6543b.a();
        }
        return i2 - compoundPaddingRight;
    }

    /* JADX WARNING: type inference failed for: r0v37, types: [v2.g, s2.g] */
    public final void i() {
        int i2 = this.f6542a0;
        if (i2 == 0) {
            this.f6532O = null;
            this.f6536S = null;
            this.f6537T = null;
        } else if (i2 == 1) {
            this.f6532O = new g(this.f6538U);
            this.f6536S = new g();
            this.f6537T = new g();
        } else if (i2 == 2) {
            if (!this.f6529L || (this.f6532O instanceof v2.g)) {
                this.f6532O = new g(this.f6538U);
            } else {
                k kVar = this.f6538U;
                int i5 = v2.g.f12179H;
                if (kVar == null) {
                    kVar = new k();
                }
                v2.f fVar = new v2.f(kVar, new RectF());
                ? gVar = new g((f) fVar);
                gVar.f12180G = fVar;
                this.f6532O = gVar;
            }
            this.f6536S = null;
            this.f6537T = null;
        } else {
            throw new IllegalArgumentException(this.f6542a0 + " is illegal; only @BoxBackgroundMode constants are supported.");
        }
        s();
        x();
        if (this.f6542a0 == 1) {
            if (getContext().getResources().getConfiguration().fontScale >= 2.0f) {
                this.f6544b0 = getResources().getDimensionPixelSize(R.dimen.material_font_2_0_box_collapsed_padding_top);
            } else if (com.bumptech.glide.d.L0(getContext())) {
                this.f6544b0 = getResources().getDimensionPixelSize(R.dimen.material_font_1_3_box_collapsed_padding_top);
            }
        }
        if (this.d != null && this.f6542a0 == 1) {
            if (getContext().getResources().getConfiguration().fontScale >= 2.0f) {
                EditText editText = this.d;
                WeakHashMap weakHashMap = O.f1352a;
                editText.setPaddingRelative(editText.getPaddingStart(), getResources().getDimensionPixelSize(R.dimen.material_filled_edittext_font_2_0_padding_top), this.d.getPaddingEnd(), getResources().getDimensionPixelSize(R.dimen.material_filled_edittext_font_2_0_padding_bottom));
            } else if (com.bumptech.glide.d.L0(getContext())) {
                EditText editText2 = this.d;
                WeakHashMap weakHashMap2 = O.f1352a;
                editText2.setPaddingRelative(editText2.getPaddingStart(), getResources().getDimensionPixelSize(R.dimen.material_filled_edittext_font_1_3_padding_top), this.d.getPaddingEnd(), getResources().getDimensionPixelSize(R.dimen.material_filled_edittext_font_1_3_padding_bottom));
            }
        }
        if (this.f6542a0 != 0) {
            t();
        }
        EditText editText3 = this.d;
        if (editText3 instanceof AutoCompleteTextView) {
            AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) editText3;
            if (autoCompleteTextView.getDropDownBackground() == null) {
                int i6 = this.f6542a0;
                if (i6 == 2) {
                    autoCompleteTextView.setDropDownBackgroundDrawable(getOrCreateOutlinedDropDownMenuBackground());
                } else if (i6 == 1) {
                    autoCompleteTextView.setDropDownBackgroundDrawable(getOrCreateFilledDropDownMenuBackground());
                }
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x006c  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x008d  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00b8  */
    /* JADX WARNING: Removed duplicated region for block: B:45:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void j() {
        /*
            r12 = this;
            boolean r0 = r12.e()
            if (r0 != 0) goto L_0x0007
            return
        L_0x0007:
            android.widget.EditText r0 = r12.d
            int r0 = r0.getWidth()
            android.widget.EditText r1 = r12.d
            int r1 = r1.getGravity()
            m2.b r2 = r12.f6517E0
            java.lang.CharSequence r3 = r2.f10073A
            boolean r3 = r2.b(r3)
            r2.f10075C = r3
            r4 = 5
            r5 = 1073741824(0x40000000, float:2.0)
            r6 = 8388613(0x800005, float:1.175495E-38)
            r7 = 1
            r8 = 17
            android.graphics.Rect r9 = r2.d
            if (r1 == r8) goto L_0x004f
            r10 = r1 & 7
            if (r10 != r7) goto L_0x002f
            goto L_0x004f
        L_0x002f:
            r10 = r1 & r6
            if (r10 == r6) goto L_0x0044
            r10 = r1 & 5
            if (r10 != r4) goto L_0x0038
            goto L_0x0044
        L_0x0038:
            if (r3 == 0) goto L_0x0040
            int r3 = r9.right
            float r3 = (float) r3
            float r10 = r2.f10097Z
            goto L_0x0054
        L_0x0040:
            int r3 = r9.left
        L_0x0042:
            float r3 = (float) r3
            goto L_0x0055
        L_0x0044:
            if (r3 == 0) goto L_0x0049
            int r3 = r9.left
            goto L_0x0042
        L_0x0049:
            int r3 = r9.right
            float r3 = (float) r3
            float r10 = r2.f10097Z
            goto L_0x0054
        L_0x004f:
            float r3 = (float) r0
            float r3 = r3 / r5
            float r10 = r2.f10097Z
            float r10 = r10 / r5
        L_0x0054:
            float r3 = r3 - r10
        L_0x0055:
            int r10 = r9.left
            float r10 = (float) r10
            float r3 = java.lang.Math.max(r3, r10)
            android.graphics.RectF r10 = r12.f6555j0
            r10.left = r3
            int r11 = r9.top
            float r11 = (float) r11
            r10.top = r11
            if (r1 == r8) goto L_0x008d
            r8 = r1 & 7
            if (r8 != r7) goto L_0x006c
            goto L_0x008d
        L_0x006c:
            r0 = r1 & r6
            if (r0 == r6) goto L_0x0081
            r0 = r1 & 5
            if (r0 != r4) goto L_0x0075
            goto L_0x0081
        L_0x0075:
            boolean r0 = r2.f10075C
            if (r0 == 0) goto L_0x007d
            int r0 = r9.right
        L_0x007b:
            float r0 = (float) r0
            goto L_0x0093
        L_0x007d:
            float r0 = r2.f10097Z
            float r0 = r0 + r3
            goto L_0x0093
        L_0x0081:
            boolean r0 = r2.f10075C
            if (r0 == 0) goto L_0x008a
            float r0 = r2.f10097Z
            float r3 = r3 + r0
            r0 = r3
            goto L_0x0093
        L_0x008a:
            int r0 = r9.right
            goto L_0x007b
        L_0x008d:
            float r0 = (float) r0
            float r0 = r0 / r5
            float r1 = r2.f10097Z
            float r1 = r1 / r5
            float r0 = r0 + r1
        L_0x0093:
            int r1 = r9.right
            float r1 = (float) r1
            float r0 = java.lang.Math.min(r0, r1)
            r10.right = r0
            int r0 = r9.top
            float r0 = (float) r0
            float r1 = r2.d()
            float r1 = r1 + r0
            r10.bottom = r1
            float r0 = r10.width()
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x00f0
            float r0 = r10.height()
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 > 0) goto L_0x00b8
            goto L_0x00f0
        L_0x00b8:
            float r0 = r10.left
            int r1 = r12.f6540W
            float r1 = (float) r1
            float r0 = r0 - r1
            r10.left = r0
            float r0 = r10.right
            float r0 = r0 + r1
            r10.right = r0
            int r0 = r12.getPaddingLeft()
            int r0 = -r0
            float r0 = (float) r0
            int r1 = r12.getPaddingTop()
            int r1 = -r1
            float r1 = (float) r1
            float r2 = r10.height()
            float r2 = r2 / r5
            float r1 = r1 - r2
            int r2 = r12.f6546c0
            float r2 = (float) r2
            float r1 = r1 + r2
            r10.offset(r0, r1)
            s2.g r0 = r12.f6532O
            v2.g r0 = (v2.g) r0
            r0.getClass()
            float r1 = r10.left
            float r2 = r10.top
            float r3 = r10.right
            float r4 = r10.bottom
            r0.n(r1, r2, r3, r4)
        L_0x00f0:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.j():void");
    }

    public final void l(C0703b0 b0Var, int i2) {
        try {
            b0Var.setTextAppearance(i2);
            if (b0Var.getTextColors().getDefaultColor() != -65281) {
                return;
            }
        } catch (Exception unused) {
        }
        b0Var.setTextAppearance(2131952026);
        b0Var.setTextColor(A.h.getColor(getContext(), R.color.design_error));
    }

    public final boolean m() {
        p pVar = this.f6567s;
        if (pVar.f12238o != 1 || pVar.f12241r == null || TextUtils.isEmpty(pVar.f12239p)) {
            return false;
        }
        return true;
    }

    public final void n(Editable editable) {
        int i2;
        boolean z3;
        int i5;
        b bVar;
        ((j) this.f6574w).getClass();
        if (editable != null) {
            i2 = editable.length();
        } else {
            i2 = 0;
        }
        boolean z4 = this.f6572v;
        int i6 = this.f6570u;
        String str = null;
        if (i6 == -1) {
            this.f6576x.setText(String.valueOf(i2));
            this.f6576x.setContentDescription((CharSequence) null);
            this.f6572v = false;
        } else {
            if (i2 > i6) {
                z3 = true;
            } else {
                z3 = false;
            }
            this.f6572v = z3;
            Context context = getContext();
            C0703b0 b0Var = this.f6576x;
            int i7 = this.f6570u;
            if (this.f6572v) {
                i5 = R.string.character_counter_overflowed_content_description;
            } else {
                i5 = R.string.character_counter_content_description;
            }
            b0Var.setContentDescription(context.getString(i5, new Object[]{Integer.valueOf(i2), Integer.valueOf(i7)}));
            if (z4 != this.f6572v) {
                o();
            }
            String str2 = b.f1078b;
            if (TextUtils.getLayoutDirectionFromLocale(Locale.getDefault()) == 1) {
                bVar = b.f1080e;
            } else {
                bVar = b.d;
            }
            C0703b0 b0Var2 = this.f6576x;
            String string = getContext().getString(R.string.character_counter_pattern, new Object[]{Integer.valueOf(i2), Integer.valueOf(this.f6570u)});
            if (string == null) {
                bVar.getClass();
            } else {
                bVar.getClass();
                H h = I.g.f1086a;
                str = bVar.c(string).toString();
            }
            b0Var2.setText(str);
        }
        if (this.d != null && z4 != this.f6572v) {
            u(false, false);
            x();
            r();
        }
    }

    public final void o() {
        int i2;
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        C0703b0 b0Var = this.f6576x;
        if (b0Var != null) {
            if (this.f6572v) {
                i2 = this.f6578y;
            } else {
                i2 = this.f6580z;
            }
            l(b0Var, i2);
            if (!this.f6572v && (colorStateList2 = this.f6521H) != null) {
                this.f6576x.setTextColor(colorStateList2);
            }
            if (this.f6572v && (colorStateList = this.f6523I) != null) {
                this.f6576x.setTextColor(colorStateList);
            }
        }
    }

    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f6517E0.g(configuration);
    }

    public final void onGlobalLayout() {
        int max;
        l lVar = this.f6545c;
        lVar.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        boolean z3 = false;
        this.f6528K0 = false;
        if (this.d != null && this.d.getMeasuredHeight() < (max = Math.max(lVar.getMeasuredHeight(), this.f6543b.getMeasuredHeight()))) {
            this.d.setMinimumHeight(max);
            z3 = true;
        }
        boolean q6 = q();
        if (z3 || q6) {
            this.d.post(new A4.a(this, 22));
        }
    }

    public final void onLayout(boolean z3, int i2, int i5, int i6, int i7) {
        int i8;
        int i9;
        super.onLayout(z3, i2, i5, i6, i7);
        EditText editText = this.d;
        if (editText != null) {
            ThreadLocal threadLocal = m2.c.f10127a;
            int width = editText.getWidth();
            int height = editText.getHeight();
            Rect rect = this.f6553h0;
            rect.set(0, 0, width, height);
            ThreadLocal threadLocal2 = m2.c.f10127a;
            Matrix matrix = (Matrix) threadLocal2.get();
            if (matrix == null) {
                matrix = new Matrix();
                threadLocal2.set(matrix);
            } else {
                matrix.reset();
            }
            m2.c.a(this, editText, matrix);
            ThreadLocal threadLocal3 = m2.c.f10128b;
            RectF rectF = (RectF) threadLocal3.get();
            if (rectF == null) {
                rectF = new RectF();
                threadLocal3.set(rectF);
            }
            rectF.set(rect);
            matrix.mapRect(rectF);
            rect.set((int) (rectF.left + 0.5f), (int) (rectF.top + 0.5f), (int) (rectF.right + 0.5f), (int) (rectF.bottom + 0.5f));
            g gVar = this.f6536S;
            if (gVar != null) {
                int i10 = rect.bottom;
                gVar.setBounds(rect.left, i10 - this.f6547d0, rect.right, i10);
            }
            g gVar2 = this.f6537T;
            if (gVar2 != null) {
                int i11 = rect.bottom;
                gVar2.setBounds(rect.left, i11 - this.f6549e0, rect.right, i11);
            }
            if (this.f6529L) {
                float textSize = this.d.getTextSize();
                C0836b bVar = this.f6517E0;
                if (bVar.h != textSize) {
                    bVar.h = textSize;
                    bVar.h(false);
                }
                int gravity = this.d.getGravity();
                int i12 = (gravity & -113) | 48;
                if (bVar.g != i12) {
                    bVar.g = i12;
                    bVar.h(false);
                }
                if (bVar.f10107f != gravity) {
                    bVar.f10107f = gravity;
                    bVar.h(false);
                }
                if (this.d != null) {
                    boolean e6 = m2.k.e(this);
                    int i13 = rect.bottom;
                    Rect rect2 = this.f6554i0;
                    rect2.bottom = i13;
                    int i14 = this.f6542a0;
                    if (i14 == 1) {
                        rect2.left = g(rect.left, e6);
                        rect2.top = rect.top + this.f6544b0;
                        rect2.right = h(rect.right, e6);
                    } else if (i14 != 2) {
                        rect2.left = g(rect.left, e6);
                        rect2.top = getPaddingTop();
                        rect2.right = h(rect.right, e6);
                    } else {
                        rect2.left = this.d.getPaddingLeft() + rect.left;
                        rect2.top = rect.top - c();
                        rect2.right = rect.right - this.d.getPaddingRight();
                    }
                    int i15 = rect2.left;
                    int i16 = rect2.top;
                    int i17 = rect2.right;
                    int i18 = rect2.bottom;
                    Rect rect3 = bVar.d;
                    if (!(rect3.left == i15 && rect3.top == i16 && rect3.right == i17 && rect3.bottom == i18)) {
                        rect3.set(i15, i16, i17, i18);
                        bVar.f10084M = true;
                    }
                    if (this.d != null) {
                        TextPaint textPaint = bVar.f10086O;
                        textPaint.setTextSize(bVar.h);
                        textPaint.setTypeface(bVar.f10121u);
                        textPaint.setLetterSpacing(bVar.f10094W);
                        float f6 = -textPaint.ascent();
                        rect2.left = this.d.getCompoundPaddingLeft() + rect.left;
                        if (this.f6542a0 != 1 || this.d.getMinLines() > 1) {
                            i8 = rect.top + this.d.getCompoundPaddingTop();
                        } else {
                            i8 = (int) (((float) rect.centerY()) - (f6 / 2.0f));
                        }
                        rect2.top = i8;
                        rect2.right = rect.right - this.d.getCompoundPaddingRight();
                        if (this.f6542a0 != 1 || this.d.getMinLines() > 1) {
                            i9 = rect.bottom - this.d.getCompoundPaddingBottom();
                        } else {
                            i9 = (int) (((float) rect2.top) + f6);
                        }
                        rect2.bottom = i9;
                        int i19 = rect2.left;
                        int i20 = rect2.top;
                        int i21 = rect2.right;
                        Rect rect4 = bVar.f10102c;
                        if (!(rect4.left == i19 && rect4.top == i20 && rect4.right == i21 && rect4.bottom == i9)) {
                            rect4.set(i19, i20, i21, i9);
                            bVar.f10084M = true;
                        }
                        bVar.h(false);
                        if (e() && !this.f6515D0) {
                            j();
                            return;
                        }
                        return;
                    }
                    throw new IllegalStateException();
                }
                throw new IllegalStateException();
            }
        }
    }

    public final void onMeasure(int i2, int i5) {
        EditText editText;
        super.onMeasure(i2, i5);
        boolean z3 = this.f6528K0;
        l lVar = this.f6545c;
        if (!z3) {
            lVar.getViewTreeObserver().addOnGlobalLayoutListener(this);
            this.f6528K0 = true;
        }
        if (!(this.f6512C == null || (editText = this.d) == null)) {
            this.f6512C.setGravity(editText.getGravity());
            this.f6512C.setPadding(this.d.getCompoundPaddingLeft(), this.d.getCompoundPaddingTop(), this.d.getCompoundPaddingRight(), this.d.getCompoundPaddingBottom());
        }
        lVar.m();
    }

    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof x)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        x xVar = (x) parcelable;
        super.onRestoreInstanceState(xVar.f2792a);
        setError(xVar.f12275c);
        if (xVar.d) {
            post(new C0737s0(this, 13));
        }
        requestLayout();
    }

    /* JADX WARNING: type inference failed for: r3v3, types: [s2.k, java.lang.Object] */
    public final void onRtlPropertiesChanged(int i2) {
        super.onRtlPropertiesChanged(i2);
        boolean z3 = true;
        if (i2 != 1) {
            z3 = false;
        }
        if (z3 != this.f6539V) {
            s2.c cVar = this.f6538U.f11488e;
            RectF rectF = this.f6555j0;
            float a6 = cVar.a(rectF);
            float a7 = this.f6538U.f11489f.a(rectF);
            float a8 = this.f6538U.h.a(rectF);
            float a9 = this.f6538U.g.a(rectF);
            k kVar = this.f6538U;
            I1.b bVar = kVar.f11485a;
            I1.b bVar2 = kVar.f11486b;
            I1.b bVar3 = kVar.d;
            I1.b bVar4 = kVar.f11487c;
            s2.e eVar = new s2.e(0);
            s2.e eVar2 = new s2.e(0);
            s2.e eVar3 = new s2.e(0);
            s2.e eVar4 = new s2.e(0);
            s2.j.b(bVar2);
            s2.j.b(bVar);
            s2.j.b(bVar4);
            s2.j.b(bVar3);
            C0962a aVar = new C0962a(a7);
            C0962a aVar2 = new C0962a(a6);
            C0962a aVar3 = new C0962a(a9);
            C0962a aVar4 = new C0962a(a8);
            ? obj = new Object();
            obj.f11485a = bVar2;
            obj.f11486b = bVar;
            obj.f11487c = bVar3;
            obj.d = bVar4;
            obj.f11488e = aVar;
            obj.f11489f = aVar2;
            obj.g = aVar4;
            obj.h = aVar3;
            obj.f11490i = eVar;
            obj.f11491j = eVar2;
            obj.f11492k = eVar3;
            obj.f11493l = eVar4;
            this.f6539V = z3;
            setShapeAppearanceModel(obj);
        }
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [v2.x, android.os.Parcelable, T.c] */
    public final Parcelable onSaveInstanceState() {
        boolean z3;
        ? cVar = new T.c(super.onSaveInstanceState());
        if (m()) {
            cVar.f12275c = getError();
        }
        l lVar = this.f6545c;
        if (lVar.f12208r == 0 || !lVar.f12206p.d) {
            z3 = false;
        } else {
            z3 = true;
        }
        cVar.d = z3;
        return cVar;
    }

    public final void p() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2 = this.f6525J;
        if (colorStateList2 == null) {
            Context context = getContext();
            TypedValue h02 = c.h0(context, R.attr.colorControlActivated);
            if (h02 != null) {
                int i2 = h02.resourceId;
                if (i2 != 0) {
                    colorStateList2 = A.h.getColorStateList(context, i2);
                } else {
                    int i5 = h02.data;
                    if (i5 != 0) {
                        colorStateList2 = ColorStateList.valueOf(i5);
                    }
                }
            }
            colorStateList2 = null;
        }
        EditText editText = this.d;
        if (editText != null && editText.getTextCursorDrawable() != null) {
            Drawable mutate = this.d.getTextCursorDrawable().mutate();
            if ((m() || (this.f6576x != null && this.f6572v)) && (colorStateList = this.f6527K) != null) {
                colorStateList2 = colorStateList;
            }
            D.a.h(mutate, colorStateList2);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:34:0x0095  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x0110  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean q() {
        /*
            r10 = this;
            android.widget.EditText r0 = r10.d
            r1 = 0
            if (r0 != 0) goto L_0x0006
            return r1
        L_0x0006:
            android.graphics.drawable.Drawable r0 = r10.getStartIconDrawable()
            r2 = 0
            r3 = 2
            r4 = 3
            r5 = 1
            if (r0 != 0) goto L_0x0020
            java.lang.CharSequence r0 = r10.getPrefixText()
            if (r0 == 0) goto L_0x005f
            android.widget.TextView r0 = r10.getPrefixTextView()
            int r0 = r0.getVisibility()
            if (r0 != 0) goto L_0x005f
        L_0x0020:
            v2.t r0 = r10.f6543b
            int r6 = r0.getMeasuredWidth()
            if (r6 <= 0) goto L_0x005f
            int r0 = r0.getMeasuredWidth()
            android.widget.EditText r6 = r10.d
            int r6 = r6.getPaddingLeft()
            int r0 = r0 - r6
            android.graphics.drawable.ColorDrawable r6 = r10.f6557l0
            if (r6 == 0) goto L_0x003b
            int r6 = r10.f6558m0
            if (r6 == r0) goto L_0x0047
        L_0x003b:
            android.graphics.drawable.ColorDrawable r6 = new android.graphics.drawable.ColorDrawable
            r6.<init>()
            r10.f6557l0 = r6
            r10.f6558m0 = r0
            r6.setBounds(r1, r1, r0, r5)
        L_0x0047:
            android.widget.EditText r0 = r10.d
            android.graphics.drawable.Drawable[] r0 = r0.getCompoundDrawablesRelative()
            r6 = r0[r1]
            android.graphics.drawable.ColorDrawable r7 = r10.f6557l0
            if (r6 == r7) goto L_0x0078
            android.widget.EditText r6 = r10.d
            r8 = r0[r5]
            r9 = r0[r3]
            r0 = r0[r4]
            r6.setCompoundDrawablesRelative(r7, r8, r9, r0)
            goto L_0x0076
        L_0x005f:
            android.graphics.drawable.ColorDrawable r0 = r10.f6557l0
            if (r0 == 0) goto L_0x0078
            android.widget.EditText r0 = r10.d
            android.graphics.drawable.Drawable[] r0 = r0.getCompoundDrawablesRelative()
            android.widget.EditText r6 = r10.d
            r7 = r0[r5]
            r8 = r0[r3]
            r0 = r0[r4]
            r6.setCompoundDrawablesRelative(r2, r7, r8, r0)
            r10.f6557l0 = r2
        L_0x0076:
            r0 = r5
            goto L_0x0079
        L_0x0078:
            r0 = r1
        L_0x0079:
            v2.l r6 = r10.f6545c
            boolean r7 = r6.e()
            if (r7 != 0) goto L_0x008f
            int r7 = r6.f12208r
            if (r7 == 0) goto L_0x008b
            boolean r7 = r6.d()
            if (r7 != 0) goto L_0x008f
        L_0x008b:
            java.lang.CharSequence r7 = r6.f12215y
            if (r7 == 0) goto L_0x0110
        L_0x008f:
            int r7 = r6.getMeasuredWidth()
            if (r7 <= 0) goto L_0x0110
            k.b0 r7 = r6.f12216z
            int r7 = r7.getMeasuredWidth()
            android.widget.EditText r8 = r10.d
            int r8 = r8.getPaddingRight()
            int r7 = r7 - r8
            boolean r8 = r6.e()
            if (r8 == 0) goto L_0x00ab
            com.google.android.material.internal.CheckableImageButton r2 = r6.f12203c
            goto L_0x00b7
        L_0x00ab:
            int r8 = r6.f12208r
            if (r8 == 0) goto L_0x00b7
            boolean r8 = r6.d()
            if (r8 == 0) goto L_0x00b7
            com.google.android.material.internal.CheckableImageButton r2 = r6.f12206p
        L_0x00b7:
            if (r2 == 0) goto L_0x00ca
            int r6 = r2.getMeasuredWidth()
            int r6 = r6 + r7
            android.view.ViewGroup$LayoutParams r2 = r2.getLayoutParams()
            android.view.ViewGroup$MarginLayoutParams r2 = (android.view.ViewGroup.MarginLayoutParams) r2
            int r2 = r2.getMarginStart()
            int r7 = r2 + r6
        L_0x00ca:
            android.widget.EditText r2 = r10.d
            android.graphics.drawable.Drawable[] r2 = r2.getCompoundDrawablesRelative()
            android.graphics.drawable.ColorDrawable r6 = r10.f6560o0
            if (r6 == 0) goto L_0x00eb
            int r8 = r10.f6562p0
            if (r8 == r7) goto L_0x00eb
            r10.f6562p0 = r7
            r6.setBounds(r1, r1, r7, r5)
            android.widget.EditText r0 = r10.d
            r1 = r2[r1]
            r3 = r2[r5]
            android.graphics.drawable.ColorDrawable r6 = r10.f6560o0
            r2 = r2[r4]
            r0.setCompoundDrawablesRelative(r1, r3, r6, r2)
            goto L_0x010e
        L_0x00eb:
            if (r6 != 0) goto L_0x00f9
            android.graphics.drawable.ColorDrawable r6 = new android.graphics.drawable.ColorDrawable
            r6.<init>()
            r10.f6560o0 = r6
            r10.f6562p0 = r7
            r6.setBounds(r1, r1, r7, r5)
        L_0x00f9:
            r3 = r2[r3]
            android.graphics.drawable.ColorDrawable r6 = r10.f6560o0
            if (r3 == r6) goto L_0x010d
            r10.f6564q0 = r3
            android.widget.EditText r0 = r10.d
            r1 = r2[r1]
            r3 = r2[r5]
            r2 = r2[r4]
            r0.setCompoundDrawablesRelative(r1, r3, r6, r2)
            goto L_0x010e
        L_0x010d:
            r5 = r0
        L_0x010e:
            r0 = r5
            goto L_0x0132
        L_0x0110:
            android.graphics.drawable.ColorDrawable r6 = r10.f6560o0
            if (r6 == 0) goto L_0x0132
            android.widget.EditText r6 = r10.d
            android.graphics.drawable.Drawable[] r6 = r6.getCompoundDrawablesRelative()
            r3 = r6[r3]
            android.graphics.drawable.ColorDrawable r7 = r10.f6560o0
            if (r3 != r7) goto L_0x012e
            android.widget.EditText r0 = r10.d
            r1 = r6[r1]
            r3 = r6[r5]
            android.graphics.drawable.Drawable r7 = r10.f6564q0
            r4 = r6[r4]
            r0.setCompoundDrawablesRelative(r1, r3, r7, r4)
            goto L_0x012f
        L_0x012e:
            r5 = r0
        L_0x012f:
            r10.f6560o0 = r2
            goto L_0x010e
        L_0x0132:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.q():boolean");
    }

    public final void r() {
        Drawable background;
        C0703b0 b0Var;
        EditText editText = this.d;
        if (editText != null && this.f6542a0 == 0 && (background = editText.getBackground()) != null) {
            int[] iArr = C0725m0.f9346a;
            Drawable mutate = background.mutate();
            if (m()) {
                mutate.setColorFilter(C0740u.c(getErrorCurrentTextColors(), PorterDuff.Mode.SRC_IN));
            } else if (!this.f6572v || (b0Var = this.f6576x) == null) {
                mutate.clearColorFilter();
                this.d.refreshDrawableState();
            } else {
                mutate.setColorFilter(C0740u.c(b0Var.getCurrentTextColor(), PorterDuff.Mode.SRC_IN));
            }
        }
    }

    public final void s() {
        EditText editText = this.d;
        if (editText != null && this.f6532O != null) {
            if ((this.f6535R || editText.getBackground() == null) && this.f6542a0 != 0) {
                Drawable editTextBoxBackground = getEditTextBoxBackground();
                EditText editText2 = this.d;
                WeakHashMap weakHashMap = O.f1352a;
                editText2.setBackground(editTextBoxBackground);
                this.f6535R = true;
            }
        }
    }

    public void setBoxBackgroundColor(int i2) {
        if (this.f6552g0 != i2) {
            this.f6552g0 = i2;
            this.f6577x0 = i2;
            this.f6581z0 = i2;
            this.f6509A0 = i2;
            b();
        }
    }

    public void setBoxBackgroundColorResource(int i2) {
        setBoxBackgroundColor(A.h.getColor(getContext(), i2));
    }

    public void setBoxBackgroundColorStateList(ColorStateList colorStateList) {
        int defaultColor = colorStateList.getDefaultColor();
        this.f6577x0 = defaultColor;
        this.f6552g0 = defaultColor;
        this.f6579y0 = colorStateList.getColorForState(new int[]{-16842910}, -1);
        this.f6581z0 = colorStateList.getColorForState(new int[]{16842908, 16842910}, -1);
        this.f6509A0 = colorStateList.getColorForState(new int[]{16843623, 16842910}, -1);
        b();
    }

    public void setBoxBackgroundMode(int i2) {
        if (i2 != this.f6542a0) {
            this.f6542a0 = i2;
            if (this.d != null) {
                i();
            }
        }
    }

    public void setBoxCollapsedPaddingTop(int i2) {
        this.f6544b0 = i2;
    }

    public void setBoxCornerFamily(int i2) {
        s2.j e6 = this.f6538U.e();
        s2.c cVar = this.f6538U.f11488e;
        I1.b i5 = e.i(i2);
        e6.f11476a = i5;
        s2.j.b(i5);
        e6.f11479e = cVar;
        s2.c cVar2 = this.f6538U.f11489f;
        I1.b i6 = e.i(i2);
        e6.f11477b = i6;
        s2.j.b(i6);
        e6.f11480f = cVar2;
        s2.c cVar3 = this.f6538U.h;
        I1.b i7 = e.i(i2);
        e6.d = i7;
        s2.j.b(i7);
        e6.h = cVar3;
        s2.c cVar4 = this.f6538U.g;
        I1.b i8 = e.i(i2);
        e6.f11478c = i8;
        s2.j.b(i8);
        e6.g = cVar4;
        this.f6538U = e6.a();
        b();
    }

    public void setBoxStrokeColor(int i2) {
        if (this.f6573v0 != i2) {
            this.f6573v0 = i2;
            x();
        }
    }

    public void setBoxStrokeColorStateList(ColorStateList colorStateList) {
        if (colorStateList.isStateful()) {
            this.f6569t0 = colorStateList.getDefaultColor();
            this.f6511B0 = colorStateList.getColorForState(new int[]{-16842910}, -1);
            this.f6571u0 = colorStateList.getColorForState(new int[]{16843623, 16842910}, -1);
            this.f6573v0 = colorStateList.getColorForState(new int[]{16842908, 16842910}, -1);
        } else if (this.f6573v0 != colorStateList.getDefaultColor()) {
            this.f6573v0 = colorStateList.getDefaultColor();
        }
        x();
    }

    public void setBoxStrokeErrorColor(ColorStateList colorStateList) {
        if (this.f6575w0 != colorStateList) {
            this.f6575w0 = colorStateList;
            x();
        }
    }

    public void setBoxStrokeWidth(int i2) {
        this.f6547d0 = i2;
        x();
    }

    public void setBoxStrokeWidthFocused(int i2) {
        this.f6549e0 = i2;
        x();
    }

    public void setBoxStrokeWidthFocusedResource(int i2) {
        setBoxStrokeWidthFocused(getResources().getDimensionPixelSize(i2));
    }

    public void setBoxStrokeWidthResource(int i2) {
        setBoxStrokeWidth(getResources().getDimensionPixelSize(i2));
    }

    public void setCounterEnabled(boolean z3) {
        if (this.f6568t != z3) {
            Editable editable = null;
            p pVar = this.f6567s;
            if (z3) {
                C0703b0 b0Var = new C0703b0(getContext(), (AttributeSet) null);
                this.f6576x = b0Var;
                b0Var.setId(R.id.textinput_counter);
                Typeface typeface = this.f6556k0;
                if (typeface != null) {
                    this.f6576x.setTypeface(typeface);
                }
                this.f6576x.setMaxLines(1);
                pVar.a(this.f6576x, 2);
                ((ViewGroup.MarginLayoutParams) this.f6576x.getLayoutParams()).setMarginStart(getResources().getDimensionPixelOffset(R.dimen.mtrl_textinput_counter_margin_start));
                o();
                if (this.f6576x != null) {
                    EditText editText = this.d;
                    if (editText != null) {
                        editable = editText.getText();
                    }
                    n(editable);
                }
            } else {
                pVar.g(this.f6576x, 2);
                this.f6576x = null;
            }
            this.f6568t = z3;
        }
    }

    public void setCounterMaxLength(int i2) {
        Editable editable;
        if (this.f6570u != i2) {
            if (i2 > 0) {
                this.f6570u = i2;
            } else {
                this.f6570u = -1;
            }
            if (this.f6568t && this.f6576x != null) {
                EditText editText = this.d;
                if (editText == null) {
                    editable = null;
                } else {
                    editable = editText.getText();
                }
                n(editable);
            }
        }
    }

    public void setCounterOverflowTextAppearance(int i2) {
        if (this.f6578y != i2) {
            this.f6578y = i2;
            o();
        }
    }

    public void setCounterOverflowTextColor(ColorStateList colorStateList) {
        if (this.f6523I != colorStateList) {
            this.f6523I = colorStateList;
            o();
        }
    }

    public void setCounterTextAppearance(int i2) {
        if (this.f6580z != i2) {
            this.f6580z = i2;
            o();
        }
    }

    public void setCounterTextColor(ColorStateList colorStateList) {
        if (this.f6521H != colorStateList) {
            this.f6521H = colorStateList;
            o();
        }
    }

    public void setCursorColor(ColorStateList colorStateList) {
        if (this.f6525J != colorStateList) {
            this.f6525J = colorStateList;
            p();
        }
    }

    public void setCursorErrorColor(ColorStateList colorStateList) {
        if (this.f6527K != colorStateList) {
            this.f6527K = colorStateList;
            if (m() || (this.f6576x != null && this.f6572v)) {
                p();
            }
        }
    }

    public void setDefaultHintTextColor(ColorStateList colorStateList) {
        this.f6566r0 = colorStateList;
        this.s0 = colorStateList;
        if (this.d != null) {
            u(false, false);
        }
    }

    public void setEnabled(boolean z3) {
        k(this, z3);
        super.setEnabled(z3);
    }

    public void setEndIconActivated(boolean z3) {
        this.f6545c.f12206p.setActivated(z3);
    }

    public void setEndIconCheckable(boolean z3) {
        this.f6545c.f12206p.setCheckable(z3);
    }

    public void setEndIconContentDescription(int i2) {
        l lVar = this.f6545c;
        CharSequence text = i2 != 0 ? lVar.getResources().getText(i2) : null;
        CheckableImageButton checkableImageButton = lVar.f12206p;
        if (checkableImageButton.getContentDescription() != text) {
            checkableImageButton.setContentDescription(text);
        }
    }

    public void setEndIconDrawable(int i2) {
        l lVar = this.f6545c;
        Drawable J5 = i2 != 0 ? R2.b.J(lVar.getContext(), i2) : null;
        CheckableImageButton checkableImageButton = lVar.f12206p;
        checkableImageButton.setImageDrawable(J5);
        if (J5 != null) {
            ColorStateList colorStateList = lVar.f12210t;
            PorterDuff.Mode mode = lVar.f12211u;
            TextInputLayout textInputLayout = lVar.f12201a;
            R2.b.d(textInputLayout, checkableImageButton, colorStateList, mode);
            R2.b.F0(textInputLayout, checkableImageButton, lVar.f12210t);
        }
    }

    public void setEndIconMinSize(int i2) {
        l lVar = this.f6545c;
        if (i2 < 0) {
            lVar.getClass();
            throw new IllegalArgumentException("endIconSize cannot be less than 0");
        } else if (i2 != lVar.f12212v) {
            lVar.f12212v = i2;
            CheckableImageButton checkableImageButton = lVar.f12206p;
            checkableImageButton.setMinimumWidth(i2);
            checkableImageButton.setMinimumHeight(i2);
            CheckableImageButton checkableImageButton2 = lVar.f12203c;
            checkableImageButton2.setMinimumWidth(i2);
            checkableImageButton2.setMinimumHeight(i2);
        }
    }

    public void setEndIconMode(int i2) {
        this.f6545c.g(i2);
    }

    public void setEndIconOnClickListener(View.OnClickListener onClickListener) {
        l lVar = this.f6545c;
        View.OnLongClickListener onLongClickListener = lVar.f12214x;
        CheckableImageButton checkableImageButton = lVar.f12206p;
        checkableImageButton.setOnClickListener(onClickListener);
        R2.b.P0(checkableImageButton, onLongClickListener);
    }

    public void setEndIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        l lVar = this.f6545c;
        lVar.f12214x = onLongClickListener;
        CheckableImageButton checkableImageButton = lVar.f12206p;
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        R2.b.P0(checkableImageButton, onLongClickListener);
    }

    public void setEndIconScaleType(ImageView.ScaleType scaleType) {
        l lVar = this.f6545c;
        lVar.f12213w = scaleType;
        lVar.f12206p.setScaleType(scaleType);
        lVar.f12203c.setScaleType(scaleType);
    }

    public void setEndIconTintList(ColorStateList colorStateList) {
        l lVar = this.f6545c;
        if (lVar.f12210t != colorStateList) {
            lVar.f12210t = colorStateList;
            R2.b.d(lVar.f12201a, lVar.f12206p, colorStateList, lVar.f12211u);
        }
    }

    public void setEndIconTintMode(PorterDuff.Mode mode) {
        l lVar = this.f6545c;
        if (lVar.f12211u != mode) {
            lVar.f12211u = mode;
            R2.b.d(lVar.f12201a, lVar.f12206p, lVar.f12210t, mode);
        }
    }

    public void setEndIconVisible(boolean z3) {
        this.f6545c.h(z3);
    }

    public void setError(CharSequence charSequence) {
        p pVar = this.f6567s;
        if (!pVar.f12240q) {
            if (!TextUtils.isEmpty(charSequence)) {
                setErrorEnabled(true);
            } else {
                return;
            }
        }
        if (!TextUtils.isEmpty(charSequence)) {
            pVar.c();
            pVar.f12239p = charSequence;
            pVar.f12241r.setText(charSequence);
            int i2 = pVar.f12237n;
            if (i2 != 1) {
                pVar.f12238o = 1;
            }
            pVar.i(i2, pVar.f12238o, pVar.h(pVar.f12241r, charSequence));
            return;
        }
        pVar.f();
    }

    public void setErrorAccessibilityLiveRegion(int i2) {
        p pVar = this.f6567s;
        pVar.f12243t = i2;
        C0703b0 b0Var = pVar.f12241r;
        if (b0Var != null) {
            WeakHashMap weakHashMap = O.f1352a;
            b0Var.setAccessibilityLiveRegion(i2);
        }
    }

    public void setErrorContentDescription(CharSequence charSequence) {
        p pVar = this.f6567s;
        pVar.f12242s = charSequence;
        C0703b0 b0Var = pVar.f12241r;
        if (b0Var != null) {
            b0Var.setContentDescription(charSequence);
        }
    }

    public void setErrorEnabled(boolean z3) {
        p pVar = this.f6567s;
        if (pVar.f12240q != z3) {
            pVar.c();
            TextInputLayout textInputLayout = pVar.h;
            if (z3) {
                C0703b0 b0Var = new C0703b0(pVar.g, (AttributeSet) null);
                pVar.f12241r = b0Var;
                b0Var.setId(R.id.textinput_error);
                pVar.f12241r.setTextAlignment(5);
                Typeface typeface = pVar.f12226B;
                if (typeface != null) {
                    pVar.f12241r.setTypeface(typeface);
                }
                int i2 = pVar.f12244u;
                pVar.f12244u = i2;
                C0703b0 b0Var2 = pVar.f12241r;
                if (b0Var2 != null) {
                    textInputLayout.l(b0Var2, i2);
                }
                ColorStateList colorStateList = pVar.f12245v;
                pVar.f12245v = colorStateList;
                C0703b0 b0Var3 = pVar.f12241r;
                if (!(b0Var3 == null || colorStateList == null)) {
                    b0Var3.setTextColor(colorStateList);
                }
                CharSequence charSequence = pVar.f12242s;
                pVar.f12242s = charSequence;
                C0703b0 b0Var4 = pVar.f12241r;
                if (b0Var4 != null) {
                    b0Var4.setContentDescription(charSequence);
                }
                int i5 = pVar.f12243t;
                pVar.f12243t = i5;
                C0703b0 b0Var5 = pVar.f12241r;
                if (b0Var5 != null) {
                    WeakHashMap weakHashMap = O.f1352a;
                    b0Var5.setAccessibilityLiveRegion(i5);
                }
                pVar.f12241r.setVisibility(4);
                pVar.a(pVar.f12241r, 0);
            } else {
                pVar.f();
                pVar.g(pVar.f12241r, 0);
                pVar.f12241r = null;
                textInputLayout.r();
                textInputLayout.x();
            }
            pVar.f12240q = z3;
        }
    }

    public void setErrorIconDrawable(int i2) {
        l lVar = this.f6545c;
        lVar.i(i2 != 0 ? R2.b.J(lVar.getContext(), i2) : null);
        R2.b.F0(lVar.f12201a, lVar.f12203c, lVar.d);
    }

    public void setErrorIconOnClickListener(View.OnClickListener onClickListener) {
        l lVar = this.f6545c;
        CheckableImageButton checkableImageButton = lVar.f12203c;
        View.OnLongClickListener onLongClickListener = lVar.f12205f;
        checkableImageButton.setOnClickListener(onClickListener);
        R2.b.P0(checkableImageButton, onLongClickListener);
    }

    public void setErrorIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        l lVar = this.f6545c;
        lVar.f12205f = onLongClickListener;
        CheckableImageButton checkableImageButton = lVar.f12203c;
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        R2.b.P0(checkableImageButton, onLongClickListener);
    }

    public void setErrorIconTintList(ColorStateList colorStateList) {
        l lVar = this.f6545c;
        if (lVar.d != colorStateList) {
            lVar.d = colorStateList;
            R2.b.d(lVar.f12201a, lVar.f12203c, colorStateList, lVar.f12204e);
        }
    }

    public void setErrorIconTintMode(PorterDuff.Mode mode) {
        l lVar = this.f6545c;
        if (lVar.f12204e != mode) {
            lVar.f12204e = mode;
            R2.b.d(lVar.f12201a, lVar.f12203c, lVar.d, mode);
        }
    }

    public void setErrorTextAppearance(int i2) {
        p pVar = this.f6567s;
        pVar.f12244u = i2;
        C0703b0 b0Var = pVar.f12241r;
        if (b0Var != null) {
            pVar.h.l(b0Var, i2);
        }
    }

    public void setErrorTextColor(ColorStateList colorStateList) {
        p pVar = this.f6567s;
        pVar.f12245v = colorStateList;
        C0703b0 b0Var = pVar.f12241r;
        if (b0Var != null && colorStateList != null) {
            b0Var.setTextColor(colorStateList);
        }
    }

    public void setExpandedHintEnabled(boolean z3) {
        if (this.f6518F0 != z3) {
            this.f6518F0 = z3;
            u(false, false);
        }
    }

    public void setHelperText(CharSequence charSequence) {
        boolean isEmpty = TextUtils.isEmpty(charSequence);
        p pVar = this.f6567s;
        if (!isEmpty) {
            if (!pVar.f12247x) {
                setHelperTextEnabled(true);
            }
            pVar.c();
            pVar.f12246w = charSequence;
            pVar.f12248y.setText(charSequence);
            int i2 = pVar.f12237n;
            if (i2 != 2) {
                pVar.f12238o = 2;
            }
            pVar.i(i2, pVar.f12238o, pVar.h(pVar.f12248y, charSequence));
        } else if (pVar.f12247x) {
            setHelperTextEnabled(false);
        }
    }

    public void setHelperTextColor(ColorStateList colorStateList) {
        p pVar = this.f6567s;
        pVar.f12225A = colorStateList;
        C0703b0 b0Var = pVar.f12248y;
        if (b0Var != null && colorStateList != null) {
            b0Var.setTextColor(colorStateList);
        }
    }

    public void setHelperTextEnabled(boolean z3) {
        p pVar = this.f6567s;
        if (pVar.f12247x != z3) {
            pVar.c();
            if (z3) {
                C0703b0 b0Var = new C0703b0(pVar.g, (AttributeSet) null);
                pVar.f12248y = b0Var;
                b0Var.setId(R.id.textinput_helper_text);
                pVar.f12248y.setTextAlignment(5);
                Typeface typeface = pVar.f12226B;
                if (typeface != null) {
                    pVar.f12248y.setTypeface(typeface);
                }
                pVar.f12248y.setVisibility(4);
                pVar.f12248y.setAccessibilityLiveRegion(1);
                int i2 = pVar.f12249z;
                pVar.f12249z = i2;
                C0703b0 b0Var2 = pVar.f12248y;
                if (b0Var2 != null) {
                    b0Var2.setTextAppearance(i2);
                }
                ColorStateList colorStateList = pVar.f12225A;
                pVar.f12225A = colorStateList;
                C0703b0 b0Var3 = pVar.f12248y;
                if (!(b0Var3 == null || colorStateList == null)) {
                    b0Var3.setTextColor(colorStateList);
                }
                pVar.a(pVar.f12248y, 1);
                pVar.f12248y.setAccessibilityDelegate(new o(pVar));
            } else {
                pVar.c();
                int i5 = pVar.f12237n;
                if (i5 == 2) {
                    pVar.f12238o = 0;
                }
                pVar.i(i5, pVar.f12238o, pVar.h(pVar.f12248y, ""));
                pVar.g(pVar.f12248y, 1);
                pVar.f12248y = null;
                TextInputLayout textInputLayout = pVar.h;
                textInputLayout.r();
                textInputLayout.x();
            }
            pVar.f12247x = z3;
        }
    }

    public void setHelperTextTextAppearance(int i2) {
        p pVar = this.f6567s;
        pVar.f12249z = i2;
        C0703b0 b0Var = pVar.f12248y;
        if (b0Var != null) {
            b0Var.setTextAppearance(i2);
        }
    }

    public void setHint(CharSequence charSequence) {
        if (this.f6529L) {
            setHintInternal(charSequence);
            sendAccessibilityEvent(2048);
        }
    }

    public void setHintAnimationEnabled(boolean z3) {
        this.f6520G0 = z3;
    }

    public void setHintEnabled(boolean z3) {
        if (z3 != this.f6529L) {
            this.f6529L = z3;
            if (!z3) {
                this.f6531N = false;
                if (!TextUtils.isEmpty(this.f6530M) && TextUtils.isEmpty(this.d.getHint())) {
                    this.d.setHint(this.f6530M);
                }
                setHintInternal((CharSequence) null);
            } else {
                CharSequence hint = this.d.getHint();
                if (!TextUtils.isEmpty(hint)) {
                    if (TextUtils.isEmpty(this.f6530M)) {
                        setHint(hint);
                    }
                    this.d.setHint((CharSequence) null);
                }
                this.f6531N = true;
            }
            if (this.d != null) {
                t();
            }
        }
    }

    public void setHintTextAppearance(int i2) {
        C0836b bVar = this.f6517E0;
        TextInputLayout textInputLayout = bVar.f10098a;
        C0916d dVar = new C0916d(textInputLayout.getContext(), i2);
        ColorStateList colorStateList = dVar.f10988j;
        if (colorStateList != null) {
            bVar.f10111k = colorStateList;
        }
        float f6 = dVar.f10989k;
        if (f6 != 0.0f) {
            bVar.f10109i = f6;
        }
        ColorStateList colorStateList2 = dVar.f10982a;
        if (colorStateList2 != null) {
            bVar.f10092U = colorStateList2;
        }
        bVar.f10090S = dVar.f10985e;
        bVar.f10091T = dVar.f10986f;
        bVar.f10089R = dVar.g;
        bVar.f10093V = dVar.f10987i;
        C0913a aVar = bVar.f10125y;
        if (aVar != null) {
            aVar.f10976r = true;
        }
        C0724m mVar = new C0724m(bVar, 4);
        dVar.a();
        bVar.f10125y = new C0913a(mVar, dVar.f10992n);
        dVar.c(textInputLayout.getContext(), bVar.f10125y);
        bVar.h(false);
        this.s0 = bVar.f10111k;
        if (this.d != null) {
            u(false, false);
            t();
        }
    }

    public void setHintTextColor(ColorStateList colorStateList) {
        if (this.s0 != colorStateList) {
            if (this.f6566r0 == null) {
                C0836b bVar = this.f6517E0;
                if (bVar.f10111k != colorStateList) {
                    bVar.f10111k = colorStateList;
                    bVar.h(false);
                }
            }
            this.s0 = colorStateList;
            if (this.d != null) {
                u(false, false);
            }
        }
    }

    public void setLengthCounter(w wVar) {
        this.f6574w = wVar;
    }

    public void setMaxEms(int i2) {
        this.f6561p = i2;
        EditText editText = this.d;
        if (editText != null && i2 != -1) {
            editText.setMaxEms(i2);
        }
    }

    public void setMaxWidth(int i2) {
        this.f6565r = i2;
        EditText editText = this.d;
        if (editText != null && i2 != -1) {
            editText.setMaxWidth(i2);
        }
    }

    public void setMaxWidthResource(int i2) {
        setMaxWidth(getContext().getResources().getDimensionPixelSize(i2));
    }

    public void setMinEms(int i2) {
        this.f6550f = i2;
        EditText editText = this.d;
        if (editText != null && i2 != -1) {
            editText.setMinEms(i2);
        }
    }

    public void setMinWidth(int i2) {
        this.f6563q = i2;
        EditText editText = this.d;
        if (editText != null && i2 != -1) {
            editText.setMinWidth(i2);
        }
    }

    public void setMinWidthResource(int i2) {
        setMinWidth(getContext().getResources().getDimensionPixelSize(i2));
    }

    @Deprecated
    public void setPasswordVisibilityToggleContentDescription(int i2) {
        l lVar = this.f6545c;
        lVar.f12206p.setContentDescription(i2 != 0 ? lVar.getResources().getText(i2) : null);
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(int i2) {
        l lVar = this.f6545c;
        lVar.f12206p.setImageDrawable(i2 != 0 ? R2.b.J(lVar.getContext(), i2) : null);
    }

    @Deprecated
    public void setPasswordVisibilityToggleEnabled(boolean z3) {
        l lVar = this.f6545c;
        if (z3 && lVar.f12208r != 1) {
            lVar.g(1);
        } else if (!z3) {
            lVar.g(0);
        } else {
            lVar.getClass();
        }
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintList(ColorStateList colorStateList) {
        l lVar = this.f6545c;
        lVar.f12210t = colorStateList;
        R2.b.d(lVar.f12201a, lVar.f12206p, colorStateList, lVar.f12211u);
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintMode(PorterDuff.Mode mode) {
        l lVar = this.f6545c;
        lVar.f12211u = mode;
        R2.b.d(lVar.f12201a, lVar.f12206p, lVar.f12210t, mode);
    }

    public void setPlaceholderText(CharSequence charSequence) {
        Editable editable = null;
        if (this.f6512C == null) {
            C0703b0 b0Var = new C0703b0(getContext(), (AttributeSet) null);
            this.f6512C = b0Var;
            b0Var.setId(R.id.textinput_placeholder);
            this.f6512C.setImportantForAccessibility(2);
            h d6 = d();
            this.F = d6;
            d6.f11669b = 67;
            this.f6519G = d();
            setPlaceholderTextAppearance(this.f6516E);
            setPlaceholderTextColor(this.f6514D);
        }
        if (TextUtils.isEmpty(charSequence)) {
            setPlaceholderTextEnabled(false);
        } else {
            if (!this.f6510B) {
                setPlaceholderTextEnabled(true);
            }
            this.f6508A = charSequence;
        }
        EditText editText = this.d;
        if (editText != null) {
            editable = editText.getText();
        }
        v(editable);
    }

    public void setPlaceholderTextAppearance(int i2) {
        this.f6516E = i2;
        C0703b0 b0Var = this.f6512C;
        if (b0Var != null) {
            b0Var.setTextAppearance(i2);
        }
    }

    public void setPlaceholderTextColor(ColorStateList colorStateList) {
        if (this.f6514D != colorStateList) {
            this.f6514D = colorStateList;
            C0703b0 b0Var = this.f6512C;
            if (b0Var != null && colorStateList != null) {
                b0Var.setTextColor(colorStateList);
            }
        }
    }

    public void setPrefixText(CharSequence charSequence) {
        CharSequence charSequence2;
        t tVar = this.f6543b;
        tVar.getClass();
        if (TextUtils.isEmpty(charSequence)) {
            charSequence2 = null;
        } else {
            charSequence2 = charSequence;
        }
        tVar.f12265c = charSequence2;
        tVar.f12264b.setText(charSequence);
        tVar.e();
    }

    public void setPrefixTextAppearance(int i2) {
        this.f6543b.f12264b.setTextAppearance(i2);
    }

    public void setPrefixTextColor(ColorStateList colorStateList) {
        this.f6543b.f12264b.setTextColor(colorStateList);
    }

    public void setShapeAppearanceModel(k kVar) {
        g gVar = this.f6532O;
        if (gVar != null && gVar.f11459a.f11441a != kVar) {
            this.f6538U = kVar;
            b();
        }
    }

    public void setStartIconCheckable(boolean z3) {
        this.f6543b.d.setCheckable(z3);
    }

    public void setStartIconContentDescription(CharSequence charSequence) {
        CheckableImageButton checkableImageButton = this.f6543b.d;
        if (checkableImageButton.getContentDescription() != charSequence) {
            checkableImageButton.setContentDescription(charSequence);
        }
    }

    public void setStartIconDrawable(int i2) {
        setStartIconDrawable(i2 != 0 ? R2.b.J(getContext(), i2) : null);
    }

    public void setStartIconMinSize(int i2) {
        t tVar = this.f6543b;
        if (i2 < 0) {
            tVar.getClass();
            throw new IllegalArgumentException("startIconSize cannot be less than 0");
        } else if (i2 != tVar.f12268p) {
            tVar.f12268p = i2;
            CheckableImageButton checkableImageButton = tVar.d;
            checkableImageButton.setMinimumWidth(i2);
            checkableImageButton.setMinimumHeight(i2);
        }
    }

    public void setStartIconOnClickListener(View.OnClickListener onClickListener) {
        t tVar = this.f6543b;
        View.OnLongClickListener onLongClickListener = tVar.f12270r;
        CheckableImageButton checkableImageButton = tVar.d;
        checkableImageButton.setOnClickListener(onClickListener);
        R2.b.P0(checkableImageButton, onLongClickListener);
    }

    public void setStartIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        t tVar = this.f6543b;
        tVar.f12270r = onLongClickListener;
        CheckableImageButton checkableImageButton = tVar.d;
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        R2.b.P0(checkableImageButton, onLongClickListener);
    }

    public void setStartIconScaleType(ImageView.ScaleType scaleType) {
        t tVar = this.f6543b;
        tVar.f12269q = scaleType;
        tVar.d.setScaleType(scaleType);
    }

    public void setStartIconTintList(ColorStateList colorStateList) {
        t tVar = this.f6543b;
        if (tVar.f12266e != colorStateList) {
            tVar.f12266e = colorStateList;
            R2.b.d(tVar.f12263a, tVar.d, colorStateList, tVar.f12267f);
        }
    }

    public void setStartIconTintMode(PorterDuff.Mode mode) {
        t tVar = this.f6543b;
        if (tVar.f12267f != mode) {
            tVar.f12267f = mode;
            R2.b.d(tVar.f12263a, tVar.d, tVar.f12266e, mode);
        }
    }

    public void setStartIconVisible(boolean z3) {
        this.f6543b.c(z3);
    }

    public void setSuffixText(CharSequence charSequence) {
        CharSequence charSequence2;
        l lVar = this.f6545c;
        lVar.getClass();
        if (TextUtils.isEmpty(charSequence)) {
            charSequence2 = null;
        } else {
            charSequence2 = charSequence;
        }
        lVar.f12215y = charSequence2;
        lVar.f12216z.setText(charSequence);
        lVar.n();
    }

    public void setSuffixTextAppearance(int i2) {
        this.f6545c.f12216z.setTextAppearance(i2);
    }

    public void setSuffixTextColor(ColorStateList colorStateList) {
        this.f6545c.f12216z.setTextColor(colorStateList);
    }

    public void setTextInputAccessibilityDelegate(v vVar) {
        EditText editText = this.d;
        if (editText != null) {
            O.l(editText, vVar);
        }
    }

    public void setTypeface(Typeface typeface) {
        if (typeface != this.f6556k0) {
            this.f6556k0 = typeface;
            this.f6517E0.m(typeface);
            p pVar = this.f6567s;
            if (typeface != pVar.f12226B) {
                pVar.f12226B = typeface;
                C0703b0 b0Var = pVar.f12241r;
                if (b0Var != null) {
                    b0Var.setTypeface(typeface);
                }
                C0703b0 b0Var2 = pVar.f12248y;
                if (b0Var2 != null) {
                    b0Var2.setTypeface(typeface);
                }
            }
            C0703b0 b0Var3 = this.f6576x;
            if (b0Var3 != null) {
                b0Var3.setTypeface(typeface);
            }
        }
    }

    public final void t() {
        if (this.f6542a0 != 1) {
            FrameLayout frameLayout = this.f6541a;
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) frameLayout.getLayoutParams();
            int c3 = c();
            if (c3 != layoutParams.topMargin) {
                layoutParams.topMargin = c3;
                frameLayout.requestLayout();
            }
        }
    }

    public final void u(boolean z3, boolean z4) {
        boolean z5;
        boolean z6;
        ColorStateList colorStateList;
        C0703b0 b0Var;
        ColorStateList colorStateList2;
        int i2;
        boolean isEnabled = isEnabled();
        EditText editText = this.d;
        if (editText == null || TextUtils.isEmpty(editText.getText())) {
            z5 = false;
        } else {
            z5 = true;
        }
        EditText editText2 = this.d;
        if (editText2 == null || !editText2.hasFocus()) {
            z6 = false;
        } else {
            z6 = true;
        }
        ColorStateList colorStateList3 = this.f6566r0;
        C0836b bVar = this.f6517E0;
        if (colorStateList3 != null) {
            bVar.i(colorStateList3);
        }
        Editable editable = null;
        if (!isEnabled) {
            ColorStateList colorStateList4 = this.f6566r0;
            if (colorStateList4 != null) {
                i2 = colorStateList4.getColorForState(new int[]{-16842910}, this.f6511B0);
            } else {
                i2 = this.f6511B0;
            }
            bVar.i(ColorStateList.valueOf(i2));
        } else if (m()) {
            C0703b0 b0Var2 = this.f6567s.f12241r;
            if (b0Var2 != null) {
                colorStateList2 = b0Var2.getTextColors();
            } else {
                colorStateList2 = null;
            }
            bVar.i(colorStateList2);
        } else if (this.f6572v && (b0Var = this.f6576x) != null) {
            bVar.i(b0Var.getTextColors());
        } else if (!(!z6 || (colorStateList = this.s0) == null || bVar.f10111k == colorStateList)) {
            bVar.f10111k = colorStateList;
            bVar.h(false);
        }
        l lVar = this.f6545c;
        t tVar = this.f6543b;
        if (z5 || !this.f6518F0 || (isEnabled() && z6)) {
            if (z4 || this.f6515D0) {
                ValueAnimator valueAnimator = this.f6522H0;
                if (valueAnimator != null && valueAnimator.isRunning()) {
                    this.f6522H0.cancel();
                }
                if (!z3 || !this.f6520G0) {
                    bVar.k(1.0f);
                } else {
                    a(1.0f);
                }
                this.f6515D0 = false;
                if (e()) {
                    j();
                }
                EditText editText3 = this.d;
                if (editText3 != null) {
                    editable = editText3.getText();
                }
                v(editable);
                tVar.f12271s = false;
                tVar.e();
                lVar.f12196A = false;
                lVar.n();
            }
        } else if (z4 || !this.f6515D0) {
            ValueAnimator valueAnimator2 = this.f6522H0;
            if (valueAnimator2 != null && valueAnimator2.isRunning()) {
                this.f6522H0.cancel();
            }
            if (!z3 || !this.f6520G0) {
                bVar.k(0.0f);
            } else {
                a(0.0f);
            }
            if (e() && !((v2.g) this.f6532O).f12180G.f12178q.isEmpty() && e()) {
                ((v2.g) this.f6532O).n(0.0f, 0.0f, 0.0f, 0.0f);
            }
            this.f6515D0 = true;
            C0703b0 b0Var3 = this.f6512C;
            if (b0Var3 != null && this.f6510B) {
                b0Var3.setText((CharSequence) null);
                q.a(this.f6541a, this.f6519G);
                this.f6512C.setVisibility(4);
            }
            tVar.f12271s = true;
            tVar.e();
            lVar.f12196A = true;
            lVar.n();
        }
    }

    public final void v(Editable editable) {
        int i2;
        ((j) this.f6574w).getClass();
        if (editable != null) {
            i2 = editable.length();
        } else {
            i2 = 0;
        }
        FrameLayout frameLayout = this.f6541a;
        if (i2 != 0 || this.f6515D0) {
            C0703b0 b0Var = this.f6512C;
            if (b0Var != null && this.f6510B) {
                b0Var.setText((CharSequence) null);
                q.a(frameLayout, this.f6519G);
                this.f6512C.setVisibility(4);
            }
        } else if (this.f6512C != null && this.f6510B && !TextUtils.isEmpty(this.f6508A)) {
            this.f6512C.setText(this.f6508A);
            q.a(frameLayout, this.F);
            this.f6512C.setVisibility(0);
            this.f6512C.bringToFront();
            announceForAccessibility(this.f6508A);
        }
    }

    public final void w(boolean z3, boolean z4) {
        int defaultColor = this.f6575w0.getDefaultColor();
        int colorForState = this.f6575w0.getColorForState(new int[]{16843623, 16842910}, defaultColor);
        int colorForState2 = this.f6575w0.getColorForState(new int[]{16843518, 16842910}, defaultColor);
        if (z3) {
            this.f6551f0 = colorForState2;
        } else if (z4) {
            this.f6551f0 = colorForState;
        } else {
            this.f6551f0 = defaultColor;
        }
    }

    public final void x() {
        boolean z3;
        C0703b0 b0Var;
        EditText editText;
        EditText editText2;
        if (this.f6532O != null && this.f6542a0 != 0) {
            boolean z4 = false;
            if (isFocused() || ((editText2 = this.d) != null && editText2.hasFocus())) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (isHovered() || ((editText = this.d) != null && editText.isHovered())) {
                z4 = true;
            }
            if (!isEnabled()) {
                this.f6551f0 = this.f6511B0;
            } else if (m()) {
                if (this.f6575w0 != null) {
                    w(z3, z4);
                } else {
                    this.f6551f0 = getErrorCurrentTextColors();
                }
            } else if (!this.f6572v || (b0Var = this.f6576x) == null) {
                if (z3) {
                    this.f6551f0 = this.f6573v0;
                } else if (z4) {
                    this.f6551f0 = this.f6571u0;
                } else {
                    this.f6551f0 = this.f6569t0;
                }
            } else if (this.f6575w0 != null) {
                w(z3, z4);
            } else {
                this.f6551f0 = b0Var.getCurrentTextColor();
            }
            if (Build.VERSION.SDK_INT >= 29) {
                p();
            }
            l lVar = this.f6545c;
            lVar.l();
            CheckableImageButton checkableImageButton = lVar.f12203c;
            ColorStateList colorStateList = lVar.d;
            TextInputLayout textInputLayout = lVar.f12201a;
            R2.b.F0(textInputLayout, checkableImageButton, colorStateList);
            ColorStateList colorStateList2 = lVar.f12210t;
            CheckableImageButton checkableImageButton2 = lVar.f12206p;
            R2.b.F0(textInputLayout, checkableImageButton2, colorStateList2);
            if (lVar.b() instanceof i) {
                if (!textInputLayout.m() || checkableImageButton2.getDrawable() == null) {
                    R2.b.d(textInputLayout, checkableImageButton2, lVar.f12210t, lVar.f12211u);
                } else {
                    Drawable mutate = checkableImageButton2.getDrawable().mutate();
                    D.a.g(mutate, textInputLayout.getErrorCurrentTextColors());
                    checkableImageButton2.setImageDrawable(mutate);
                }
            }
            t tVar = this.f6543b;
            R2.b.F0(tVar.f12263a, tVar.d, tVar.f12266e);
            if (this.f6542a0 == 2) {
                int i2 = this.f6546c0;
                if (!z3 || !isEnabled()) {
                    this.f6546c0 = this.f6547d0;
                } else {
                    this.f6546c0 = this.f6549e0;
                }
                if (this.f6546c0 != i2 && e() && !this.f6515D0) {
                    if (e()) {
                        ((v2.g) this.f6532O).n(0.0f, 0.0f, 0.0f, 0.0f);
                    }
                    j();
                }
            }
            if (this.f6542a0 == 1) {
                if (!isEnabled()) {
                    this.f6552g0 = this.f6579y0;
                } else if (z4 && !z3) {
                    this.f6552g0 = this.f6509A0;
                } else if (z3) {
                    this.f6552g0 = this.f6581z0;
                } else {
                    this.f6552g0 = this.f6577x0;
                }
            }
            b();
        }
    }

    public void setStartIconDrawable(Drawable drawable) {
        this.f6543b.b(drawable);
    }

    public void setHint(int i2) {
        setHint(i2 != 0 ? getResources().getText(i2) : null);
    }

    public void setStartIconContentDescription(int i2) {
        setStartIconContentDescription(i2 != 0 ? getResources().getText(i2) : null);
    }

    @Deprecated
    public void setPasswordVisibilityToggleContentDescription(CharSequence charSequence) {
        this.f6545c.f12206p.setContentDescription(charSequence);
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(Drawable drawable) {
        this.f6545c.f12206p.setImageDrawable(drawable);
    }

    public void setErrorIconDrawable(Drawable drawable) {
        this.f6545c.i(drawable);
    }

    public void setEndIconContentDescription(CharSequence charSequence) {
        CheckableImageButton checkableImageButton = this.f6545c.f12206p;
        if (checkableImageButton.getContentDescription() != charSequence) {
            checkableImageButton.setContentDescription(charSequence);
        }
    }

    public void setEndIconDrawable(Drawable drawable) {
        l lVar = this.f6545c;
        CheckableImageButton checkableImageButton = lVar.f12206p;
        checkableImageButton.setImageDrawable(drawable);
        if (drawable != null) {
            ColorStateList colorStateList = lVar.f12210t;
            PorterDuff.Mode mode = lVar.f12211u;
            TextInputLayout textInputLayout = lVar.f12201a;
            R2.b.d(textInputLayout, checkableImageButton, colorStateList, mode);
            R2.b.F0(textInputLayout, checkableImageButton, lVar.f12210t);
        }
    }
}
