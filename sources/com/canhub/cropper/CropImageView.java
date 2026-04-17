package com.canhub.cropper;

import G5.N;
import W0.A;
import W0.B;
import W0.C;
import W0.C0236h;
import W0.C0237i;
import W0.C0239k;
import W0.D;
import W0.E;
import W0.F;
import W0.G;
import W0.H;
import W0.I;
import W0.J;
import W0.L;
import W0.t;
import W0.w;
import W0.x;
import W0.z;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Pair;
import android.view.ScaleGestureDetector;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ProgressBar;
import java.lang.ref.WeakReference;
import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.j;
import o5.d;

public final class CropImageView extends FrameLayout implements I {

    /* renamed from: A  reason: collision with root package name */
    public boolean f5854A;

    /* renamed from: B  reason: collision with root package name */
    public boolean f5855B = true;

    /* renamed from: C  reason: collision with root package name */
    public boolean f5856C;

    /* renamed from: D  reason: collision with root package name */
    public String f5857D = "";

    /* renamed from: E  reason: collision with root package name */
    public float f5858E = 20.0f;
    public int F = -1;

    /* renamed from: G  reason: collision with root package name */
    public boolean f5859G = true;

    /* renamed from: H  reason: collision with root package name */
    public boolean f5860H = true;

    /* renamed from: I  reason: collision with root package name */
    public int f5861I;

    /* renamed from: J  reason: collision with root package name */
    public F f5862J;

    /* renamed from: K  reason: collision with root package name */
    public B f5863K;

    /* renamed from: L  reason: collision with root package name */
    public Uri f5864L;

    /* renamed from: M  reason: collision with root package name */
    public int f5865M = 1;

    /* renamed from: N  reason: collision with root package name */
    public float f5866N = 1.0f;

    /* renamed from: O  reason: collision with root package name */
    public float f5867O;

    /* renamed from: P  reason: collision with root package name */
    public float f5868P;

    /* renamed from: Q  reason: collision with root package name */
    public RectF f5869Q;

    /* renamed from: R  reason: collision with root package name */
    public int f5870R;

    /* renamed from: S  reason: collision with root package name */
    public boolean f5871S;

    /* renamed from: T  reason: collision with root package name */
    public WeakReference f5872T;

    /* renamed from: U  reason: collision with root package name */
    public WeakReference f5873U;

    /* renamed from: V  reason: collision with root package name */
    public Uri f5874V;

    /* renamed from: a  reason: collision with root package name */
    public final ImageView f5875a;

    /* renamed from: b  reason: collision with root package name */
    public final CropOverlayView f5876b;

    /* renamed from: c  reason: collision with root package name */
    public final Matrix f5877c = new Matrix();
    public final Matrix d = new Matrix();

    /* renamed from: e  reason: collision with root package name */
    public final ProgressBar f5878e;

    /* renamed from: f  reason: collision with root package name */
    public final float[] f5879f = new float[8];

    /* renamed from: p  reason: collision with root package name */
    public final float[] f5880p = new float[8];

    /* renamed from: q  reason: collision with root package name */
    public t f5881q;

    /* renamed from: r  reason: collision with root package name */
    public Bitmap f5882r;

    /* renamed from: s  reason: collision with root package name */
    public int f5883s;

    /* renamed from: t  reason: collision with root package name */
    public int f5884t;

    /* renamed from: u  reason: collision with root package name */
    public boolean f5885u;

    /* renamed from: v  reason: collision with root package name */
    public boolean f5886v;

    /* renamed from: w  reason: collision with root package name */
    public int f5887w;

    /* renamed from: x  reason: collision with root package name */
    public int f5888x;

    /* renamed from: y  reason: collision with root package name */
    public int f5889y;

    /* renamed from: z  reason: collision with root package name */
    public H f5890z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0066, code lost:
        if (r6 == null) goto L_0x0068;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public CropImageView(android.content.Context r53, android.util.AttributeSet r54) {
        /*
            r52 = this;
            r1 = r52
            r0 = r53
            r2 = r54
            java.lang.String r3 = "context"
            kotlin.jvm.internal.j.e(r0, r3)
            r52.<init>(r53, r54)
            android.graphics.Matrix r3 = new android.graphics.Matrix
            r3.<init>()
            r1.f5877c = r3
            android.graphics.Matrix r3 = new android.graphics.Matrix
            r3.<init>()
            r1.d = r3
            r3 = 8
            float[] r4 = new float[r3]
            r1.f5879f = r4
            float[] r4 = new float[r3]
            r1.f5880p = r4
            r4 = 1
            r1.f5855B = r4
            java.lang.String r5 = ""
            r1.f5857D = r5
            r5 = 1101004800(0x41a00000, float:20.0)
            r1.f5858E = r5
            r5 = -1
            r1.F = r5
            r1.f5859G = r4
            r1.f5860H = r4
            r1.f5865M = r4
            r5 = 1065353216(0x3f800000, float:1.0)
            r1.f5866N = r5
            boolean r5 = r0 instanceof android.app.Activity
            r6 = 0
            if (r5 == 0) goto L_0x0047
            r5 = r0
            android.app.Activity r5 = (android.app.Activity) r5
            goto L_0x0048
        L_0x0047:
            r5 = r6
        L_0x0048:
            if (r5 == 0) goto L_0x0068
            android.content.Intent r5 = r5.getIntent()
            if (r5 == 0) goto L_0x0068
            java.lang.String r7 = "CROP_IMAGE_EXTRA_BUNDLE"
            android.os.Bundle r5 = r5.getBundleExtra(r7)
            if (r5 == 0) goto L_0x0068
            java.lang.String r7 = "CROP_IMAGE_EXTRA_OPTIONS"
            android.os.Parcelable r5 = r5.getParcelable(r7)
            boolean r7 = r5 instanceof W0.w
            if (r7 != 0) goto L_0x0063
            goto L_0x0064
        L_0x0063:
            r6 = r5
        L_0x0064:
            W0.w r6 = (W0.w) r6
            if (r6 != 0) goto L_0x02b9
        L_0x0068:
            if (r2 == 0) goto L_0x026a
            int[] r5 = W0.O.f3910a
            r6 = 0
            android.content.res.TypedArray r2 = r0.obtainStyledAttributes(r2, r5, r6, r6)
            java.lang.String r5 = "obtainStyledAttributes(...)"
            kotlin.jvm.internal.j.d(r2, r5)
            W0.w r5 = new W0.w
            r7 = r5
            r47 = -1
            r48 = -1
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            r24 = 0
            r25 = 0
            r26 = 0
            r27 = 0
            r28 = 0
            r29 = 0
            r30 = 0
            r31 = 0
            r32 = 0
            r33 = 0
            r34 = 0
            r35 = 0
            r36 = 0
            r37 = 0
            r38 = 0
            r39 = 0
            r40 = 0
            r41 = 0
            r42 = 0
            r43 = 0
            r44 = 0
            r45 = 0
            r46 = 0
            r49 = 63
            r7.<init>(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, r49)
            boolean r7 = r1.f5854A     // Catch:{ all -> 0x0240 }
            r8 = 29
            boolean r7 = r2.getBoolean(r8, r7)     // Catch:{ all -> 0x0240 }
            r1.f5854A = r7     // Catch:{ all -> 0x0240 }
            W0.H[] r7 = W0.H.values()     // Catch:{ all -> 0x0240 }
            W0.H r8 = r5.f4032r     // Catch:{ all -> 0x0240 }
            int r8 = r8.ordinal()     // Catch:{ all -> 0x0240 }
            r9 = 30
            int r8 = r2.getInt(r9, r8)     // Catch:{ all -> 0x0240 }
            r16 = r7[r8]     // Catch:{ all -> 0x0240 }
            W0.z[] r7 = W0.z.values()     // Catch:{ all -> 0x0240 }
            W0.z r8 = r5.f4012c     // Catch:{ all -> 0x0240 }
            int r8 = r8.ordinal()     // Catch:{ all -> 0x0240 }
            r9 = 31
            int r8 = r2.getInt(r9, r8)     // Catch:{ all -> 0x0240 }
            r10 = r7[r8]     // Catch:{ all -> 0x0240 }
            W0.x[] r7 = W0.x.values()     // Catch:{ all -> 0x0240 }
            W0.x r8 = r5.d     // Catch:{ all -> 0x0240 }
            int r8 = r8.ordinal()     // Catch:{ all -> 0x0240 }
            int r8 = r2.getInt(r6, r8)     // Catch:{ all -> 0x0240 }
            r11 = r7[r8]     // Catch:{ all -> 0x0240 }
            W0.A[] r7 = W0.A.values()     // Catch:{ all -> 0x0240 }
            W0.A r8 = r5.f4030q     // Catch:{ all -> 0x0240 }
            int r8 = r8.ordinal()     // Catch:{ all -> 0x0240 }
            r9 = 17
            int r8 = r2.getInt(r9, r8)     // Catch:{ all -> 0x0240 }
            r15 = r7[r8]     // Catch:{ all -> 0x0240 }
            int r7 = r5.f3986D     // Catch:{ all -> 0x0240 }
            int r26 = r2.getInteger(r4, r7)     // Catch:{ all -> 0x0240 }
            int r7 = r5.f3987E     // Catch:{ all -> 0x0240 }
            r8 = 2
            int r27 = r2.getInteger(r8, r7)     // Catch:{ all -> 0x0240 }
            boolean r7 = r5.f4041w     // Catch:{ all -> 0x0240 }
            r8 = 3
            boolean r20 = r2.getBoolean(r8, r7)     // Catch:{ all -> 0x0240 }
            boolean r7 = r5.f4043x     // Catch:{ all -> 0x0240 }
            r8 = 28
            boolean r21 = r2.getBoolean(r8, r7)     // Catch:{ all -> 0x0240 }
            boolean r7 = r5.f4045y     // Catch:{ all -> 0x0240 }
            r8 = 11
            boolean r22 = r2.getBoolean(r8, r7)     // Catch:{ all -> 0x0240 }
            float r7 = r5.f4015e     // Catch:{ all -> 0x0240 }
            r8 = 13
            float r12 = r2.getDimension(r8, r7)     // Catch:{ all -> 0x0240 }
            float r7 = r5.f4017f     // Catch:{ all -> 0x0240 }
            r8 = 35
            float r13 = r2.getDimension(r8, r7)     // Catch:{ all -> 0x0240 }
            float r7 = r5.f4028p     // Catch:{ all -> 0x0240 }
            r8 = 36
            float r14 = r2.getDimension(r8, r7)     // Catch:{ all -> 0x0240 }
            float r7 = r5.f3984B     // Catch:{ all -> 0x0240 }
            r8 = 20
            float r24 = r2.getFloat(r8, r7)     // Catch:{ all -> 0x0240 }
            int r7 = r5.f3993L     // Catch:{ all -> 0x0240 }
            r8 = 12
            int r34 = r2.getInteger(r8, r7)     // Catch:{ all -> 0x0240 }
            float r7 = r5.F     // Catch:{ all -> 0x0240 }
            r8 = 10
            float r28 = r2.getDimension(r8, r7)     // Catch:{ all -> 0x0240 }
            int r7 = r5.f3988G     // Catch:{ all -> 0x0240 }
            r8 = 9
            int r29 = r2.getInteger(r8, r7)     // Catch:{ all -> 0x0240 }
            float r7 = r5.f3989H     // Catch:{ all -> 0x0240 }
            float r30 = r2.getDimension(r3, r7)     // Catch:{ all -> 0x0240 }
            float r3 = r5.f3990I     // Catch:{ all -> 0x0240 }
            r7 = 7
            float r31 = r2.getDimension(r7, r3)     // Catch:{ all -> 0x0240 }
            float r3 = r5.f3991J     // Catch:{ all -> 0x0240 }
            r7 = 6
            float r32 = r2.getDimension(r7, r3)     // Catch:{ all -> 0x0240 }
            int r3 = r5.f3992K     // Catch:{ all -> 0x0240 }
            r7 = 5
            int r33 = r2.getInteger(r7, r3)     // Catch:{ all -> 0x0240 }
            float r3 = r5.f3994M     // Catch:{ all -> 0x0240 }
            r7 = 19
            float r35 = r2.getDimension(r7, r3)     // Catch:{ all -> 0x0240 }
            int r3 = r5.f3995N     // Catch:{ all -> 0x0240 }
            r7 = 18
            int r36 = r2.getInteger(r7, r3)     // Catch:{ all -> 0x0240 }
            int r3 = r5.f3996O     // Catch:{ all -> 0x0240 }
            r7 = 4
            int r37 = r2.getInteger(r7, r3)     // Catch:{ all -> 0x0240 }
            int r3 = r5.f3997P     // Catch:{ all -> 0x0240 }
            float r3 = (float) r3     // Catch:{ all -> 0x0240 }
            r7 = 27
            float r3 = r2.getDimension(r7, r3)     // Catch:{ all -> 0x0240 }
            int r3 = (int) r3     // Catch:{ all -> 0x0240 }
            int r7 = r5.f3998Q     // Catch:{ all -> 0x0240 }
            float r7 = (float) r7     // Catch:{ all -> 0x0240 }
            r8 = 26
            float r7 = r2.getDimension(r8, r7)     // Catch:{ all -> 0x0240 }
            int r7 = (int) r7     // Catch:{ all -> 0x0240 }
            int r8 = r5.f3999R     // Catch:{ all -> 0x0240 }
            float r8 = (float) r8     // Catch:{ all -> 0x0240 }
            r9 = 25
            float r8 = r2.getFloat(r9, r8)     // Catch:{ all -> 0x0240 }
            int r8 = (int) r8     // Catch:{ all -> 0x0240 }
            int r9 = r5.f4000S     // Catch:{ all -> 0x0240 }
            float r9 = (float) r9     // Catch:{ all -> 0x0240 }
            r6 = 24
            float r6 = r2.getFloat(r6, r9)     // Catch:{ all -> 0x0240 }
            int r6 = (int) r6     // Catch:{ all -> 0x0240 }
            int r9 = r5.f4001T     // Catch:{ all -> 0x0240 }
            float r9 = (float) r9     // Catch:{ all -> 0x0240 }
            r4 = 22
            float r4 = r2.getFloat(r4, r9)     // Catch:{ all -> 0x0240 }
            int r4 = (int) r4     // Catch:{ all -> 0x0240 }
            int r9 = r5.f4002U     // Catch:{ all -> 0x0240 }
            float r9 = (float) r9     // Catch:{ all -> 0x0240 }
            r0 = 21
            float r0 = r2.getFloat(r0, r9)     // Catch:{ all -> 0x0240 }
            int r0 = (int) r0     // Catch:{ all -> 0x0240 }
            boolean r9 = r5.f4024l0     // Catch:{ all -> 0x0240 }
            r1 = 15
            boolean r44 = r2.getBoolean(r1, r9)     // Catch:{ all -> 0x0240 }
            boolean r9 = r5.f4025m0     // Catch:{ all -> 0x0240 }
            boolean r45 = r2.getBoolean(r1, r9)     // Catch:{ all -> 0x0240 }
            float r1 = r5.f4036t0     // Catch:{ all -> 0x0240 }
            r9 = 39
            float r46 = r2.getDimension(r9, r1)     // Catch:{ all -> 0x0240 }
            int r1 = r5.f4038u0     // Catch:{ all -> 0x0240 }
            r9 = 38
            int r47 = r2.getInteger(r9, r1)     // Catch:{ all -> 0x0240 }
            boolean r1 = r5.f4035t     // Catch:{ all -> 0x0240 }
            r9 = 33
            boolean r18 = r2.getBoolean(r9, r1)     // Catch:{ all -> 0x0240 }
            int r1 = r5.f3982A     // Catch:{ all -> 0x0240 }
            r9 = 23
            int r23 = r2.getInteger(r9, r1)     // Catch:{ all -> 0x0240 }
            boolean r1 = r5.f4034s     // Catch:{ all -> 0x0240 }
            r9 = 32
            boolean r1 = r2.getBoolean(r9, r1)     // Catch:{ all -> 0x0240 }
            boolean r9 = r5.f4037u     // Catch:{ all -> 0x0240 }
            r43 = r0
            r0 = 34
            boolean r19 = r2.getBoolean(r0, r9)     // Catch:{ all -> 0x0240 }
            r0 = 37
            java.lang.String r48 = r2.getString(r0)     // Catch:{ all -> 0x0240 }
            boolean r0 = r5.f3985C     // Catch:{ all -> 0x0240 }
            r5 = 14
            boolean r0 = r2.getBoolean(r5, r0)     // Catch:{ all -> 0x0240 }
            if (r0 != 0) goto L_0x0245
            r0 = 1
            boolean r5 = r2.hasValue(r0)     // Catch:{ all -> 0x0240 }
            if (r5 == 0) goto L_0x0242
            boolean r5 = r2.hasValue(r0)     // Catch:{ all -> 0x0240 }
            if (r5 == 0) goto L_0x0242
            goto L_0x0245
        L_0x0240:
            r0 = move-exception
            goto L_0x0266
        L_0x0242:
            r25 = 0
            goto L_0x0247
        L_0x0245:
            r25 = 1
        L_0x0247:
            W0.w r0 = new W0.w     // Catch:{ all -> 0x0240 }
            r49 = 69635(0x11003, float:9.758E-41)
            r50 = 1061158848(0x3f3fffc0, float:0.7499962)
            r51 = 62
            r9 = r0
            r17 = r1
            r38 = r3
            r39 = r7
            r40 = r8
            r41 = r6
            r42 = r4
            r9.<init>(r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, r49, r50, r51)     // Catch:{ all -> 0x0240 }
            r2.recycle()
        L_0x0264:
            r6 = r0
            goto L_0x02b9
        L_0x0266:
            r2.recycle()
            throw r0
        L_0x026a:
            W0.w r0 = new W0.w
            r3 = r0
            r43 = -1
            r44 = -1
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            r24 = 0
            r25 = 0
            r26 = 0
            r27 = 0
            r28 = 0
            r29 = 0
            r30 = 0
            r31 = 0
            r32 = 0
            r33 = 0
            r34 = 0
            r35 = 0
            r36 = 0
            r37 = 0
            r38 = 0
            r39 = 0
            r40 = 0
            r41 = 0
            r42 = 0
            r45 = 63
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45)
            goto L_0x0264
        L_0x02b9:
            W0.H r0 = r6.f4032r
            r1 = r52
            r1.f5890z = r0
            boolean r0 = r6.f4041w
            r1.f5860H = r0
            int r0 = r6.f3982A
            r1.f5861I = r0
            float r0 = r6.f4036t0
            r1.f5858E = r0
            boolean r0 = r6.f4035t
            r1.f5856C = r0
            boolean r0 = r6.f4034s
            r1.f5855B = r0
            boolean r0 = r6.f4037u
            r1.f5859G = r0
            boolean r0 = r6.f4024l0
            r1.f5885u = r0
            boolean r0 = r6.f4025m0
            r1.f5886v = r0
            android.view.LayoutInflater r0 = android.view.LayoutInflater.from(r53)
            r2 = 2131492898(0x7f0c0022, float:1.860926E38)
            r3 = 1
            android.view.View r0 = r0.inflate(r2, r1, r3)
            r2 = 2131296263(0x7f090007, float:1.8210438E38)
            android.view.View r2 = r0.findViewById(r2)
            android.widget.ImageView r2 = (android.widget.ImageView) r2
            r1.f5875a = r2
            android.widget.ImageView$ScaleType r3 = android.widget.ImageView.ScaleType.MATRIX
            r2.setScaleType(r3)
            r2 = 2131296260(0x7f090004, float:1.8210432E38)
            android.view.View r2 = r0.findViewById(r2)
            com.canhub.cropper.CropOverlayView r2 = (com.canhub.cropper.CropOverlayView) r2
            r1.f5876b = r2
            r2.setCropWindowChangeListener(r1)
            r2.setInitialAttributeValues(r6)
            r2 = 2131296261(0x7f090005, float:1.8210434E38)
            android.view.View r0 = r0.findViewById(r2)
            android.widget.ProgressBar r0 = (android.widget.ProgressBar) r0
            r1.f5878e = r0
            int r2 = r6.f4039v
            android.content.res.ColorStateList r2 = android.content.res.ColorStateList.valueOf(r2)
            r0.setIndeterminateTintList(r2)
            r52.h()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.canhub.cropper.CropImageView.<init>(android.content.Context, android.util.AttributeSet):void");
    }

    public final void a(float f6, float f7, boolean z3, boolean z4) {
        float f8;
        float f9;
        float f10;
        Bitmap bitmap = this.f5882r;
        if (bitmap != null) {
            float f11 = 0.0f;
            if (f6 > 0.0f && f7 > 0.0f) {
                Matrix matrix = this.f5877c;
                Matrix matrix2 = this.d;
                matrix.invert(matrix2);
                CropOverlayView cropOverlayView = this.f5876b;
                j.b(cropOverlayView);
                RectF cropWindowRect = cropOverlayView.getCropWindowRect();
                matrix2.mapRect(cropWindowRect);
                matrix.reset();
                float f12 = (float) 2;
                matrix.postTranslate((f6 - ((float) bitmap.getWidth())) / f12, (f7 - ((float) bitmap.getHeight())) / f12);
                d();
                int i2 = this.f5884t;
                float[] fArr = this.f5879f;
                if (i2 > 0) {
                    matrix.postRotate((float) i2, C0239k.m(fArr), C0239k.n(fArr));
                    d();
                }
                float min = Math.min(f6 / C0239k.t(fArr), f7 / C0239k.p(fArr));
                H h = this.f5890z;
                if (h == H.f3881a || ((h == H.f3883c && min < 1.0f) || (min > 1.0f && this.f5860H))) {
                    matrix.postScale(min, min, C0239k.m(fArr), C0239k.n(fArr));
                    d();
                } else if (h == H.f3882b) {
                    this.f5866N = Math.max(((float) getWidth()) / C0239k.t(fArr), ((float) getHeight()) / C0239k.p(fArr));
                }
                if (this.f5885u) {
                    f8 = -this.f5866N;
                } else {
                    f8 = this.f5866N;
                }
                if (this.f5886v) {
                    f9 = -this.f5866N;
                } else {
                    f9 = this.f5866N;
                }
                matrix.postScale(f8, f9, C0239k.m(fArr), C0239k.n(fArr));
                d();
                matrix.mapRect(cropWindowRect);
                if (this.f5890z == H.f3882b && z3 && !z4) {
                    this.f5867O = 0.0f;
                    this.f5868P = 0.0f;
                } else if (z3) {
                    if (f6 > C0239k.t(fArr)) {
                        f10 = 0.0f;
                    } else {
                        f10 = Math.max(Math.min((f6 / f12) - cropWindowRect.centerX(), -C0239k.q(fArr)), ((float) getWidth()) - C0239k.r(fArr)) / f8;
                    }
                    this.f5867O = f10;
                    if (f7 <= C0239k.p(fArr)) {
                        f11 = Math.max(Math.min((f7 / f12) - cropWindowRect.centerY(), -C0239k.s(fArr)), ((float) getHeight()) - C0239k.l(fArr)) / f9;
                    }
                    this.f5868P = f11;
                } else {
                    this.f5867O = Math.min(Math.max(this.f5867O * f8, -cropWindowRect.left), (-cropWindowRect.right) + f6) / f8;
                    this.f5868P = Math.min(Math.max(this.f5868P * f9, -cropWindowRect.top), (-cropWindowRect.bottom) + f7) / f9;
                }
                matrix.postTranslate(this.f5867O * f8, this.f5868P * f9);
                cropWindowRect.offset(this.f5867O * f8, this.f5868P * f9);
                cropOverlayView.setCropWindowRect(cropWindowRect);
                d();
                cropOverlayView.invalidate();
                ImageView imageView = this.f5875a;
                if (z4) {
                    t tVar = this.f5881q;
                    j.b(tVar);
                    System.arraycopy(fArr, 0, tVar.d, 0, 8);
                    tVar.f3977f.set(tVar.f3974b.getCropWindowRect());
                    matrix.getValues(tVar.f3979q);
                    imageView.startAnimation(this.f5881q);
                } else {
                    imageView.setImageMatrix(matrix);
                }
                i(false);
            }
        }
    }

    public final void b() {
        Bitmap bitmap = this.f5882r;
        if (bitmap != null && (this.f5889y > 0 || this.f5864L != null)) {
            j.b(bitmap);
            bitmap.recycle();
        }
        this.f5882r = null;
        this.f5889y = 0;
        this.f5864L = null;
        this.f5865M = 1;
        this.f5884t = 0;
        this.f5866N = 1.0f;
        this.f5867O = 0.0f;
        this.f5868P = 0.0f;
        this.f5877c.reset();
        this.f5869Q = null;
        this.f5870R = 0;
        this.f5875a.setImageBitmap((Bitmap) null);
        g();
    }

    /* JADX WARNING: Removed duplicated region for block: B:29:0x0092  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00cd  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00d9  */
    /* JADX WARNING: Removed duplicated region for block: B:55:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void c(boolean r13, boolean r14) {
        /*
            r12 = this;
            int r0 = r12.getWidth()
            int r1 = r12.getHeight()
            android.graphics.Bitmap r2 = r12.f5882r
            if (r2 == 0) goto L_0x011d
            if (r0 <= 0) goto L_0x011d
            if (r1 <= 0) goto L_0x011d
            com.canhub.cropper.CropOverlayView r2 = r12.f5876b
            kotlin.jvm.internal.j.b(r2)
            android.graphics.RectF r3 = r2.getCropWindowRect()
            r4 = 0
            r5 = 0
            if (r13 == 0) goto L_0x003e
            float r13 = r3.left
            int r13 = (r13 > r5 ? 1 : (r13 == r5 ? 0 : -1))
            if (r13 < 0) goto L_0x0037
            float r13 = r3.top
            int r13 = (r13 > r5 ? 1 : (r13 == r5 ? 0 : -1))
            if (r13 < 0) goto L_0x0037
            float r13 = r3.right
            float r14 = (float) r0
            int r13 = (r13 > r14 ? 1 : (r13 == r14 ? 0 : -1))
            if (r13 > 0) goto L_0x0037
            float r13 = r3.bottom
            float r14 = (float) r1
            int r13 = (r13 > r14 ? 1 : (r13 == r14 ? 0 : -1))
            if (r13 <= 0) goto L_0x011d
        L_0x0037:
            float r13 = (float) r0
            float r14 = (float) r1
            r12.a(r13, r14, r4, r4)
            goto L_0x011d
        L_0x003e:
            boolean r13 = r12.f5860H
            r6 = 1065353216(0x3f800000, float:1.0)
            if (r13 != 0) goto L_0x004a
            float r13 = r12.f5866N
            int r13 = (r13 > r6 ? 1 : (r13 == r6 ? 0 : -1))
            if (r13 <= 0) goto L_0x011d
        L_0x004a:
            float r13 = r12.f5866N
            int r7 = r12.f5861I
            float r7 = (float) r7
            int r13 = (r13 > r7 ? 1 : (r13 == r7 ? 0 : -1))
            if (r13 >= 0) goto L_0x008b
            float r13 = r3.width()
            float r7 = (float) r0
            r8 = 1056964608(0x3f000000, float:0.5)
            float r9 = r7 * r8
            int r13 = (r13 > r9 ? 1 : (r13 == r9 ? 0 : -1))
            if (r13 >= 0) goto L_0x008b
            float r13 = r3.height()
            float r9 = (float) r1
            float r8 = r8 * r9
            int r13 = (r13 > r8 ? 1 : (r13 == r8 ? 0 : -1))
            if (r13 >= 0) goto L_0x008b
            int r13 = r12.f5861I
            float r13 = (float) r13
            float r8 = r3.width()
            float r10 = r12.f5866N
            float r8 = r8 / r10
            r10 = 1059313418(0x3f23d70a, float:0.64)
            float r8 = r8 / r10
            float r7 = r7 / r8
            float r8 = r3.height()
            float r11 = r12.f5866N
            float r8 = r8 / r11
            float r8 = r8 / r10
            float r9 = r9 / r8
            float r7 = java.lang.Math.min(r7, r9)
            float r13 = java.lang.Math.min(r13, r7)
            goto L_0x008c
        L_0x008b:
            r13 = r5
        L_0x008c:
            float r7 = r12.f5866N
            int r7 = (r7 > r6 ? 1 : (r7 == r6 ? 0 : -1))
            if (r7 <= 0) goto L_0x00c8
            float r7 = r3.width()
            float r8 = (float) r0
            r9 = 1059481190(0x3f266666, float:0.65)
            float r10 = r8 * r9
            int r7 = (r7 > r10 ? 1 : (r7 == r10 ? 0 : -1))
            if (r7 > 0) goto L_0x00aa
            float r7 = r3.height()
            float r10 = (float) r1
            float r10 = r10 * r9
            int r7 = (r7 > r10 ? 1 : (r7 == r10 ? 0 : -1))
            if (r7 <= 0) goto L_0x00c8
        L_0x00aa:
            float r13 = r3.width()
            float r7 = r12.f5866N
            float r13 = r13 / r7
            r7 = 1057132380(0x3f028f5c, float:0.51)
            float r13 = r13 / r7
            float r8 = r8 / r13
            float r13 = (float) r1
            float r3 = r3.height()
            float r9 = r12.f5866N
            float r3 = r3 / r9
            float r3 = r3 / r7
            float r13 = r13 / r3
            float r13 = java.lang.Math.min(r8, r13)
            float r13 = java.lang.Math.max(r6, r13)
        L_0x00c8:
            boolean r3 = r12.f5860H
            if (r3 != 0) goto L_0x00cd
            goto L_0x00ce
        L_0x00cd:
            r6 = r13
        L_0x00ce:
            int r13 = (r6 > r5 ? 1 : (r6 == r5 ? 0 : -1))
            if (r13 <= 0) goto L_0x011d
            float r13 = r12.f5866N
            int r13 = (r6 > r13 ? 1 : (r6 == r13 ? 0 : -1))
            if (r13 != 0) goto L_0x00d9
            goto L_0x011d
        L_0x00d9:
            if (r14 == 0) goto L_0x0115
            W0.t r13 = r12.f5881q
            if (r13 != 0) goto L_0x00e8
            W0.t r13 = new W0.t
            android.widget.ImageView r3 = r12.f5875a
            r13.<init>(r3, r2)
            r12.f5881q = r13
        L_0x00e8:
            W0.t r13 = r12.f5881q
            kotlin.jvm.internal.j.b(r13)
            android.graphics.Matrix r2 = r12.f5877c
            float[] r3 = r12.f5879f
            java.lang.String r5 = "boundPoints"
            kotlin.jvm.internal.j.e(r3, r5)
            java.lang.String r5 = "imageMatrix"
            kotlin.jvm.internal.j.e(r2, r5)
            r13.reset()
            float[] r5 = r13.f3975c
            r7 = 8
            java.lang.System.arraycopy(r3, r4, r5, r4, r7)
            android.graphics.RectF r3 = r13.f3976e
            com.canhub.cropper.CropOverlayView r4 = r13.f3974b
            android.graphics.RectF r4 = r4.getCropWindowRect()
            r3.set(r4)
            float[] r13 = r13.f3978p
            r2.getValues(r13)
        L_0x0115:
            r12.f5866N = r6
            float r13 = (float) r0
            float r0 = (float) r1
            r1 = 1
            r12.a(r13, r0, r1, r14)
        L_0x011d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.canhub.cropper.CropImageView.c(boolean, boolean):void");
    }

    public final void d() {
        float[] fArr = this.f5879f;
        fArr[0] = 0.0f;
        fArr[1] = 0.0f;
        Bitmap bitmap = this.f5882r;
        j.b(bitmap);
        fArr[2] = (float) bitmap.getWidth();
        fArr[3] = 0.0f;
        Bitmap bitmap2 = this.f5882r;
        j.b(bitmap2);
        fArr[4] = (float) bitmap2.getWidth();
        Bitmap bitmap3 = this.f5882r;
        j.b(bitmap3);
        fArr[5] = (float) bitmap3.getHeight();
        fArr[6] = 0.0f;
        Bitmap bitmap4 = this.f5882r;
        j.b(bitmap4);
        fArr[7] = (float) bitmap4.getHeight();
        Matrix matrix = this.f5877c;
        matrix.mapPoints(fArr);
        float[] fArr2 = this.f5880p;
        fArr2[0] = 0.0f;
        fArr2[1] = 0.0f;
        fArr2[2] = 100.0f;
        fArr2[3] = 0.0f;
        fArr2[4] = 100.0f;
        fArr2[5] = 100.0f;
        fArr2[6] = 0.0f;
        fArr2[7] = 100.0f;
        matrix.mapPoints(fArr2);
    }

    public final void e(int i2) {
        int i5;
        boolean z3;
        float f6;
        float f7;
        int i6 = i2;
        if (this.f5882r != null) {
            if (i6 < 0) {
                i5 = (i6 % 360) + 360;
            } else {
                i5 = i6 % 360;
            }
            CropOverlayView cropOverlayView = this.f5876b;
            j.b(cropOverlayView);
            if (cropOverlayView.f5898I || ((46 > i5 || i5 >= 135) && (216 > i5 || i5 >= 305))) {
                z3 = false;
            } else {
                z3 = true;
            }
            RectF rectF = C0239k.f3961c;
            rectF.set(cropOverlayView.getCropWindowRect());
            if (z3) {
                f6 = rectF.height();
            } else {
                f6 = rectF.width();
            }
            float f8 = f6 / 2.0f;
            if (z3) {
                f7 = rectF.width();
            } else {
                f7 = rectF.height();
            }
            float f9 = f7 / 2.0f;
            if (z3) {
                boolean z4 = this.f5885u;
                this.f5885u = this.f5886v;
                this.f5886v = z4;
            }
            Matrix matrix = this.f5877c;
            Matrix matrix2 = this.d;
            matrix.invert(matrix2);
            float[] fArr = C0239k.d;
            fArr[0] = rectF.centerX();
            fArr[1] = rectF.centerY();
            fArr[2] = 0.0f;
            fArr[3] = 0.0f;
            fArr[4] = 1.0f;
            fArr[5] = 0.0f;
            matrix2.mapPoints(fArr);
            this.f5884t = (this.f5884t + i5) % 360;
            a((float) getWidth(), (float) getHeight(), true, false);
            float[] fArr2 = C0239k.f3962e;
            matrix.mapPoints(fArr2, fArr);
            float sqrt = this.f5866N / ((float) Math.sqrt(Math.pow((double) (fArr2[5] - fArr2[3]), 2.0d) + Math.pow((double) (fArr2[4] - fArr2[2]), 2.0d)));
            this.f5866N = sqrt;
            this.f5866N = Math.max(sqrt, 1.0f);
            a((float) getWidth(), (float) getHeight(), true, false);
            matrix.mapPoints(fArr2, fArr);
            float sqrt2 = (float) Math.sqrt(Math.pow((double) (fArr2[5] - fArr2[3]), 2.0d) + Math.pow((double) (fArr2[4] - fArr2[2]), 2.0d));
            float f10 = f8 * sqrt2;
            float f11 = f9 * sqrt2;
            float f12 = fArr2[0];
            float f13 = fArr2[1];
            rectF.set(f12 - f10, f13 - f11, f12 + f10, f13 + f11);
            cropOverlayView.g();
            cropOverlayView.setCropWindowRect(rectF);
            a((float) getWidth(), (float) getHeight(), true, false);
            c(false, false);
            RectF cropWindowRect = cropOverlayView.getCropWindowRect();
            cropOverlayView.e(cropWindowRect);
            cropOverlayView.f5917p.e(cropWindowRect);
        }
    }

    public final void f(Bitmap bitmap, int i2, Uri uri, int i5, int i6) {
        Bitmap bitmap2 = this.f5882r;
        if (bitmap2 == null || !j.a(bitmap2, bitmap)) {
            b();
            this.f5882r = bitmap;
            this.f5875a.setImageBitmap(bitmap);
            this.f5864L = uri;
            this.f5889y = i2;
            this.f5865M = i5;
            this.f5884t = i6;
            a((float) getWidth(), (float) getHeight(), true, false);
            CropOverlayView cropOverlayView = this.f5876b;
            if (cropOverlayView != null) {
                cropOverlayView.g();
                g();
            }
        }
    }

    public final void g() {
        int i2;
        CropOverlayView cropOverlayView = this.f5876b;
        if (cropOverlayView != null) {
            if (!this.f5855B || this.f5882r == null) {
                i2 = 4;
            } else {
                i2 = 0;
            }
            cropOverlayView.setVisibility(i2);
        }
    }

    public final Pair<Integer, Integer> getAspectRatio() {
        CropOverlayView cropOverlayView = this.f5876b;
        j.b(cropOverlayView);
        return new Pair<>(Integer.valueOf(cropOverlayView.getAspectRatioX()), Integer.valueOf(cropOverlayView.getAspectRatioY()));
    }

    public final x getCornerShape() {
        CropOverlayView cropOverlayView = this.f5876b;
        j.b(cropOverlayView);
        return cropOverlayView.getCornerShape();
    }

    public final String getCropLabelText() {
        return this.f5857D;
    }

    public final int getCropLabelTextColor() {
        return this.F;
    }

    public final float getCropLabelTextSize() {
        return this.f5858E;
    }

    public final float[] getCropPoints() {
        CropOverlayView cropOverlayView = this.f5876b;
        j.b(cropOverlayView);
        RectF cropWindowRect = cropOverlayView.getCropWindowRect();
        float f6 = cropWindowRect.left;
        float f7 = cropWindowRect.top;
        float f8 = cropWindowRect.right;
        float f9 = cropWindowRect.bottom;
        float[] fArr = {f6, f7, f8, f7, f8, f9, f6, f9};
        Matrix matrix = this.f5877c;
        Matrix matrix2 = this.d;
        matrix.invert(matrix2);
        matrix2.mapPoints(fArr);
        float[] fArr2 = new float[8];
        for (int i2 = 0; i2 < 8; i2++) {
            fArr2[i2] = fArr[i2] * ((float) this.f5865M);
        }
        return fArr2;
    }

    public final Rect getCropRect() {
        int i2 = this.f5865M;
        Bitmap bitmap = this.f5882r;
        if (bitmap == null) {
            return null;
        }
        float[] cropPoints = getCropPoints();
        int width = bitmap.getWidth() * i2;
        int height = i2 * bitmap.getHeight();
        Rect rect = C0239k.f3959a;
        CropOverlayView cropOverlayView = this.f5876b;
        j.b(cropOverlayView);
        return C0239k.o(cropPoints, width, height, cropOverlayView.f5898I, cropOverlayView.getAspectRatioX(), cropOverlayView.getAspectRatioY());
    }

    public final z getCropShape() {
        CropOverlayView cropOverlayView = this.f5876b;
        j.b(cropOverlayView);
        return cropOverlayView.getCropShape();
    }

    public final RectF getCropWindowRect() {
        CropOverlayView cropOverlayView = this.f5876b;
        if (cropOverlayView != null) {
            return cropOverlayView.getCropWindowRect();
        }
        return null;
    }

    public final Bitmap getCroppedImage() {
        int i2;
        Bitmap bitmap;
        G g = G.f3878c;
        Bitmap bitmap2 = this.f5882r;
        if (bitmap2 == null) {
            return null;
        }
        Uri uri = this.f5864L;
        CropOverlayView cropOverlayView = this.f5876b;
        if (uri == null || this.f5865M <= 1) {
            i2 = 0;
            Rect rect = C0239k.f3959a;
            float[] cropPoints = getCropPoints();
            int i5 = this.f5884t;
            j.b(cropOverlayView);
            bitmap = (Bitmap) C0239k.e(bitmap2, cropPoints, i5, cropOverlayView.f5898I, cropOverlayView.getAspectRatioX(), cropOverlayView.getAspectRatioY(), this.f5885u, this.f5886v).f247c;
        } else {
            Rect rect2 = C0239k.f3959a;
            Context context = getContext();
            j.d(context, "getContext(...)");
            Uri uri2 = this.f5864L;
            float[] cropPoints2 = getCropPoints();
            int i6 = this.f5884t;
            Bitmap bitmap3 = this.f5882r;
            j.b(bitmap3);
            int width = this.f5865M * bitmap3.getWidth();
            Bitmap bitmap4 = this.f5882r;
            j.b(bitmap4);
            int height = this.f5865M * bitmap4.getHeight();
            j.b(cropOverlayView);
            i2 = 0;
            bitmap = (Bitmap) C0239k.c(context, uri2, cropPoints2, i6, width, height, cropOverlayView.f5898I, cropOverlayView.getAspectRatioX(), cropOverlayView.getAspectRatioY(), 0, 0, this.f5885u, this.f5886v).f247c;
        }
        return C0239k.v(bitmap, 0, i2, g);
    }

    public final Uri getCustomOutputUri() {
        return this.f5874V;
    }

    public final A getGuidelines() {
        CropOverlayView cropOverlayView = this.f5876b;
        j.b(cropOverlayView);
        return cropOverlayView.getGuidelines();
    }

    public final int getImageResource() {
        return this.f5889y;
    }

    public final Uri getImageUri() {
        return this.f5864L;
    }

    public final int getMaxZoom() {
        return this.f5861I;
    }

    public final int getRotatedDegrees() {
        return this.f5884t;
    }

    public final H getScaleType() {
        return this.f5890z;
    }

    public final Rect getWholeImageRect() {
        int i2 = this.f5865M;
        Bitmap bitmap = this.f5882r;
        if (bitmap == null) {
            return null;
        }
        return new Rect(0, 0, bitmap.getWidth() * i2, bitmap.getHeight() * i2);
    }

    public final void h() {
        boolean z3;
        int i2 = 0;
        if (!this.f5859G || ((this.f5882r != null || this.f5872T == null) && this.f5873U == null)) {
            z3 = false;
        } else {
            z3 = true;
        }
        if (!z3) {
            i2 = 4;
        }
        this.f5878e.setVisibility(i2);
    }

    public final void i(boolean z3) {
        float[] fArr;
        Bitmap bitmap = this.f5882r;
        CropOverlayView cropOverlayView = this.f5876b;
        if (bitmap != null && !z3) {
            Rect rect = C0239k.f3959a;
            float[] fArr2 = this.f5880p;
            float t6 = (((float) this.f5865M) * 100.0f) / C0239k.t(fArr2);
            float p6 = (((float) this.f5865M) * 100.0f) / C0239k.p(fArr2);
            j.b(cropOverlayView);
            L l6 = cropOverlayView.f5917p;
            l6.f3890e = (float) getWidth();
            l6.f3891f = (float) getHeight();
            l6.f3894k = t6;
            l6.f3895l = p6;
        }
        j.b(cropOverlayView);
        if (z3) {
            fArr = null;
        } else {
            fArr = this.f5879f;
        }
        cropOverlayView.h(fArr, getWidth(), getHeight());
    }

    public final void onLayout(boolean z3, int i2, int i5, int i6, int i7) {
        super.onLayout(z3, i2, i5, i6, i7);
        if (this.f5887w <= 0 || this.f5888x <= 0) {
            i(true);
            return;
        }
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        layoutParams.width = this.f5887w;
        layoutParams.height = this.f5888x;
        setLayoutParams(layoutParams);
        if (this.f5882r != null) {
            float f6 = (float) (i6 - i2);
            float f7 = (float) (i7 - i5);
            a(f6, f7, true, false);
            RectF rectF = this.f5869Q;
            if (rectF != null) {
                int i8 = this.f5870R;
                if (i8 != this.f5883s) {
                    this.f5884t = i8;
                    a(f6, f7, true, false);
                    this.f5870R = 0;
                }
                this.f5877c.mapRect(this.f5869Q);
                CropOverlayView cropOverlayView = this.f5876b;
                if (cropOverlayView != null) {
                    cropOverlayView.setCropWindowRect(rectF);
                }
                c(false, false);
                if (cropOverlayView != null) {
                    RectF cropWindowRect = cropOverlayView.getCropWindowRect();
                    cropOverlayView.e(cropWindowRect);
                    cropOverlayView.f5917p.e(cropWindowRect);
                }
                this.f5869Q = null;
            } else if (this.f5871S) {
                this.f5871S = false;
                c(false, false);
            }
        } else {
            i(true);
        }
    }

    public final void onMeasure(int i2, int i5) {
        double d6;
        double d7;
        int i6;
        int i7;
        super.onMeasure(i2, i5);
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        int mode2 = View.MeasureSpec.getMode(i5);
        int size2 = View.MeasureSpec.getSize(i5);
        Bitmap bitmap = this.f5882r;
        if (bitmap != null) {
            if (size2 == 0) {
                size2 = bitmap.getHeight();
            }
            if (size < bitmap.getWidth()) {
                d6 = ((double) size) / ((double) bitmap.getWidth());
            } else {
                d6 = Double.POSITIVE_INFINITY;
            }
            if (size2 < bitmap.getHeight()) {
                d7 = ((double) size2) / ((double) bitmap.getHeight());
            } else {
                d7 = Double.POSITIVE_INFINITY;
            }
            if (d6 == Double.POSITIVE_INFINITY && d7 == Double.POSITIVE_INFINITY) {
                i6 = bitmap.getWidth();
                i7 = bitmap.getHeight();
            } else if (d6 <= d7) {
                i7 = (int) (((double) bitmap.getHeight()) * d6);
                i6 = size;
            } else {
                i6 = (int) (((double) bitmap.getWidth()) * d7);
                i7 = size2;
            }
            if (mode == Integer.MIN_VALUE) {
                size = Math.min(i6, size);
            } else if (mode != 1073741824) {
                size = i6;
            }
            if (mode2 == Integer.MIN_VALUE) {
                size2 = Math.min(i7, size2);
            } else if (mode2 != 1073741824) {
                size2 = i7;
            }
            this.f5887w = size;
            this.f5888x = size2;
            setMeasuredDimension(size, size2);
            return;
        }
        setMeasuredDimension(size, size2);
    }

    public final void onRestoreInstanceState(Parcelable parcelable) {
        Bitmap bitmap;
        Bitmap bitmap2;
        j.e(parcelable, "state");
        if (parcelable instanceof Bundle) {
            Parcelable parcelable2 = null;
            if (this.f5872T == null && this.f5864L == null && this.f5882r == null && this.f5889y == 0) {
                Bundle bundle = (Bundle) parcelable;
                Parcelable parcelable3 = bundle.getParcelable("LOADED_IMAGE_URI");
                if (!(parcelable3 instanceof Uri)) {
                    parcelable3 = null;
                }
                Uri uri = (Uri) parcelable3;
                if (uri != null) {
                    String string = bundle.getString("LOADED_IMAGE_STATE_BITMAP_KEY");
                    if (string != null) {
                        Rect rect = C0239k.f3959a;
                        Pair pair = C0239k.g;
                        if (pair != null) {
                            if (j.a(pair.first, string)) {
                                bitmap2 = (Bitmap) ((WeakReference) pair.second).get();
                            } else {
                                bitmap2 = null;
                            }
                            bitmap = bitmap2;
                        } else {
                            bitmap = null;
                        }
                        C0239k.g = null;
                        if (bitmap != null && !bitmap.isRecycled()) {
                            f(bitmap, 0, uri, bundle.getInt("LOADED_SAMPLE_SIZE"), 0);
                        }
                    }
                    if (this.f5864L == null) {
                        setImageUriAsync(uri);
                    }
                } else {
                    int i2 = bundle.getInt("LOADED_IMAGE_RESOURCE");
                    if (i2 > 0) {
                        setImageResource(i2);
                    } else {
                        Parcelable parcelable4 = bundle.getParcelable("LOADING_IMAGE_URI");
                        if (!(parcelable4 instanceof Uri)) {
                            parcelable4 = null;
                        }
                        Uri uri2 = (Uri) parcelable4;
                        if (uri2 != null) {
                            setImageUriAsync(uri2);
                        }
                    }
                }
                int i5 = bundle.getInt("DEGREES_ROTATED");
                this.f5870R = i5;
                this.f5884t = i5;
                Parcelable parcelable5 = bundle.getParcelable("INITIAL_CROP_RECT");
                if (!(parcelable5 instanceof Rect)) {
                    parcelable5 = null;
                }
                Rect rect2 = (Rect) parcelable5;
                CropOverlayView cropOverlayView = this.f5876b;
                if (rect2 != null && (rect2.width() > 0 || rect2.height() > 0)) {
                    j.b(cropOverlayView);
                    cropOverlayView.setInitialCropWindowRect(rect2);
                }
                Parcelable parcelable6 = bundle.getParcelable("CROP_WINDOW_RECT");
                if (!(parcelable6 instanceof RectF)) {
                    parcelable6 = null;
                }
                RectF rectF = (RectF) parcelable6;
                if (rectF != null && (rectF.width() > 0.0f || rectF.height() > 0.0f)) {
                    this.f5869Q = rectF;
                }
                j.b(cropOverlayView);
                String string2 = bundle.getString("CROP_SHAPE");
                j.b(string2);
                cropOverlayView.setCropShape(z.valueOf(string2));
                this.f5860H = bundle.getBoolean("CROP_AUTO_ZOOM_ENABLED");
                this.f5861I = bundle.getInt("CROP_MAX_ZOOM");
                this.f5885u = bundle.getBoolean("CROP_FLIP_HORIZONTALLY");
                this.f5886v = bundle.getBoolean("CROP_FLIP_VERTICALLY");
                boolean z3 = bundle.getBoolean("SHOW_CROP_LABEL");
                this.f5856C = z3;
                cropOverlayView.setCropperTextLabelVisibility(z3);
            }
            Parcelable parcelable7 = ((Bundle) parcelable).getParcelable("instanceState");
            if (parcelable7 != null) {
                parcelable2 = parcelable7;
            }
            super.onRestoreInstanceState(parcelable2);
            return;
        }
        super.onRestoreInstanceState(parcelable);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v16, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v8, resolved type: W0.i} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.os.Parcelable onSaveInstanceState() {
        /*
            r7 = this;
            android.net.Uri r0 = r7.f5864L
            r1 = 1
            if (r0 != 0) goto L_0x0012
            android.graphics.Bitmap r0 = r7.f5882r
            if (r0 != 0) goto L_0x0012
            int r0 = r7.f5889y
            if (r0 >= r1) goto L_0x0012
            android.os.Parcelable r0 = super.onSaveInstanceState()
            return r0
        L_0x0012:
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
            boolean r2 = r7.f5854A
            r3 = 0
            if (r2 == 0) goto L_0x0049
            android.net.Uri r2 = r7.f5864L
            if (r2 != 0) goto L_0x0049
            int r2 = r7.f5889y
            if (r2 >= r1) goto L_0x0049
            android.graphics.Rect r1 = W0.C0239k.f3959a
            android.content.Context r1 = r7.getContext()
            java.lang.String r2 = "getContext(...)"
            kotlin.jvm.internal.j.d(r1, r2)
            android.graphics.Bitmap r2 = r7.f5882r
            android.net.Uri r4 = r7.f5874V
            kotlin.jvm.internal.j.b(r2)     // Catch:{ Exception -> 0x003f }
            android.graphics.Bitmap$CompressFormat r5 = android.graphics.Bitmap.CompressFormat.JPEG     // Catch:{ Exception -> 0x003f }
            r6 = 95
            android.net.Uri r1 = W0.C0239k.w(r1, r2, r5, r6, r4)     // Catch:{ Exception -> 0x003f }
            goto L_0x004b
        L_0x003f:
            r1 = move-exception
            java.lang.String r2 = "AIC"
            java.lang.String r4 = "Failed to write bitmap to temp file for image-cropper save instance state"
            android.util.Log.w(r2, r4, r1)
            r1 = r3
            goto L_0x004b
        L_0x0049:
            android.net.Uri r1 = r7.f5864L
        L_0x004b:
            if (r1 == 0) goto L_0x0073
            android.graphics.Bitmap r2 = r7.f5882r
            if (r2 == 0) goto L_0x0073
            java.util.UUID r2 = java.util.UUID.randomUUID()
            java.lang.String r2 = r2.toString()
            java.lang.String r4 = "toString(...)"
            kotlin.jvm.internal.j.d(r2, r4)
            android.graphics.Rect r4 = W0.C0239k.f3959a
            android.util.Pair r4 = new android.util.Pair
            java.lang.ref.WeakReference r5 = new java.lang.ref.WeakReference
            android.graphics.Bitmap r6 = r7.f5882r
            r5.<init>(r6)
            r4.<init>(r2, r5)
            W0.C0239k.g = r4
            java.lang.String r4 = "LOADED_IMAGE_STATE_BITMAP_KEY"
            r0.putString(r4, r2)
        L_0x0073:
            java.lang.ref.WeakReference r2 = r7.f5872T
            if (r2 == 0) goto L_0x007e
            java.lang.Object r2 = r2.get()
            r3 = r2
            W0.i r3 = (W0.C0237i) r3
        L_0x007e:
            if (r3 == 0) goto L_0x0087
            java.lang.String r2 = "LOADING_IMAGE_URI"
            android.net.Uri r3 = r3.f3954b
            r0.putParcelable(r2, r3)
        L_0x0087:
            java.lang.String r2 = "instanceState"
            android.os.Parcelable r3 = super.onSaveInstanceState()
            r0.putParcelable(r2, r3)
            java.lang.String r2 = "LOADED_IMAGE_URI"
            r0.putParcelable(r2, r1)
            java.lang.String r1 = "LOADED_IMAGE_RESOURCE"
            int r2 = r7.f5889y
            r0.putInt(r1, r2)
            java.lang.String r1 = "LOADED_SAMPLE_SIZE"
            int r2 = r7.f5865M
            r0.putInt(r1, r2)
            java.lang.String r1 = "DEGREES_ROTATED"
            int r2 = r7.f5884t
            r0.putInt(r1, r2)
            com.canhub.cropper.CropOverlayView r1 = r7.f5876b
            kotlin.jvm.internal.j.b(r1)
            android.graphics.Rect r2 = r1.getInitialCropWindowRect()
            java.lang.String r3 = "INITIAL_CROP_RECT"
            r0.putParcelable(r3, r2)
            android.graphics.RectF r2 = W0.C0239k.f3961c
            android.graphics.RectF r3 = r1.getCropWindowRect()
            r2.set(r3)
            android.graphics.Matrix r3 = r7.f5877c
            android.graphics.Matrix r4 = r7.d
            r3.invert(r4)
            r4.mapRect(r2)
            java.lang.String r3 = "CROP_WINDOW_RECT"
            r0.putParcelable(r3, r2)
            W0.z r1 = r1.getCropShape()
            kotlin.jvm.internal.j.b(r1)
            java.lang.String r1 = r1.name()
            java.lang.String r2 = "CROP_SHAPE"
            r0.putString(r2, r1)
            java.lang.String r1 = "CROP_AUTO_ZOOM_ENABLED"
            boolean r2 = r7.f5860H
            r0.putBoolean(r1, r2)
            java.lang.String r1 = "CROP_MAX_ZOOM"
            int r2 = r7.f5861I
            r0.putInt(r1, r2)
            java.lang.String r1 = "CROP_FLIP_HORIZONTALLY"
            boolean r2 = r7.f5885u
            r0.putBoolean(r1, r2)
            java.lang.String r1 = "CROP_FLIP_VERTICALLY"
            boolean r2 = r7.f5886v
            r0.putBoolean(r1, r2)
            java.lang.String r1 = "SHOW_CROP_LABEL"
            boolean r2 = r7.f5856C
            r0.putBoolean(r1, r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.canhub.cropper.CropImageView.onSaveInstanceState():android.os.Parcelable");
    }

    public final void onSizeChanged(int i2, int i5, int i6, int i7) {
        boolean z3;
        super.onSizeChanged(i2, i5, i6, i7);
        if (i6 <= 0 || i7 <= 0) {
            z3 = false;
        } else {
            z3 = true;
        }
        this.f5871S = z3;
    }

    public final void setAutoZoomEnabled(boolean z3) {
        if (this.f5860H != z3) {
            this.f5860H = z3;
            c(false, false);
            CropOverlayView cropOverlayView = this.f5876b;
            j.b(cropOverlayView);
            cropOverlayView.invalidate();
        }
    }

    public final void setCenterMoveEnabled(boolean z3) {
        CropOverlayView cropOverlayView = this.f5876b;
        j.b(cropOverlayView);
        if (cropOverlayView.f5916f != z3) {
            cropOverlayView.f5916f = z3;
            c(false, false);
            cropOverlayView.invalidate();
        }
    }

    public final void setCornerShape(x xVar) {
        CropOverlayView cropOverlayView = this.f5876b;
        j.b(cropOverlayView);
        j.b(xVar);
        cropOverlayView.setCropCornerShape(xVar);
    }

    public final void setCropLabelText(String str) {
        j.e(str, "cropLabelText");
        this.f5857D = str;
        CropOverlayView cropOverlayView = this.f5876b;
        if (cropOverlayView != null) {
            cropOverlayView.setCropLabelText(str);
        }
    }

    public final void setCropLabelTextColor(int i2) {
        this.F = i2;
        CropOverlayView cropOverlayView = this.f5876b;
        if (cropOverlayView != null) {
            cropOverlayView.setCropLabelTextColor(i2);
        }
    }

    public final void setCropLabelTextSize(float f6) {
        this.f5858E = getCropLabelTextSize();
        CropOverlayView cropOverlayView = this.f5876b;
        if (cropOverlayView != null) {
            cropOverlayView.setCropLabelTextSize(f6);
        }
    }

    public final void setCropRect(Rect rect) {
        CropOverlayView cropOverlayView = this.f5876b;
        j.b(cropOverlayView);
        cropOverlayView.setInitialCropWindowRect(rect);
    }

    public final void setCropShape(z zVar) {
        CropOverlayView cropOverlayView = this.f5876b;
        j.b(cropOverlayView);
        j.b(zVar);
        cropOverlayView.setCropShape(zVar);
    }

    public final void setCustomOutputUri(Uri uri) {
        this.f5874V = uri;
    }

    public final void setFixedAspectRatio(boolean z3) {
        CropOverlayView cropOverlayView = this.f5876b;
        j.b(cropOverlayView);
        cropOverlayView.setFixedAspectRatio(z3);
    }

    public final void setFlippedHorizontally(boolean z3) {
        if (this.f5885u != z3) {
            this.f5885u = z3;
            a((float) getWidth(), (float) getHeight(), true, false);
        }
    }

    public final void setFlippedVertically(boolean z3) {
        if (this.f5886v != z3) {
            this.f5886v = z3;
            a((float) getWidth(), (float) getHeight(), true, false);
        }
    }

    public final void setGuidelines(A a6) {
        CropOverlayView cropOverlayView = this.f5876b;
        j.b(cropOverlayView);
        j.b(a6);
        cropOverlayView.setGuidelines(a6);
    }

    public final void setImageBitmap(Bitmap bitmap) {
        CropOverlayView cropOverlayView = this.f5876b;
        j.b(cropOverlayView);
        cropOverlayView.setInitialCropWindowRect((Rect) null);
        f(bitmap, 0, (Uri) null, 1, 0);
    }

    public final void setImageCropOptions(w wVar) {
        j.e(wVar, "options");
        setScaleType(wVar.f4032r);
        this.f5874V = wVar.f4006Y;
        CropOverlayView cropOverlayView = this.f5876b;
        if (cropOverlayView != null) {
            cropOverlayView.setInitialAttributeValues(wVar);
        }
        setMultiTouchEnabled(wVar.f4043x);
        setCenterMoveEnabled(wVar.f4045y);
        boolean z3 = wVar.f4034s;
        setShowCropOverlay(z3);
        boolean z4 = wVar.f4037u;
        setShowProgressBar(z4);
        setAutoZoomEnabled(wVar.f4041w);
        setMaxZoom(wVar.f3982A);
        setFlippedHorizontally(wVar.f4024l0);
        setFlippedVertically(wVar.f4025m0);
        this.f5860H = wVar.f4041w;
        this.f5855B = z3;
        this.f5859G = z4;
        this.f5878e.setIndeterminateTintList(ColorStateList.valueOf(wVar.f4039v));
    }

    public final void setImageResource(int i2) {
        if (i2 != 0) {
            CropOverlayView cropOverlayView = this.f5876b;
            j.b(cropOverlayView);
            cropOverlayView.setInitialCropWindowRect((Rect) null);
            f(BitmapFactory.decodeResource(getResources(), i2), i2, (Uri) null, 1, 0);
        }
    }

    public final void setImageUriAsync(Uri uri) {
        C0237i iVar;
        if (uri != null) {
            WeakReference weakReference = this.f5872T;
            if (!(weakReference == null || (iVar = (C0237i) weakReference.get()) == null)) {
                iVar.f3957f.cancel((CancellationException) null);
            }
            b();
            CropOverlayView cropOverlayView = this.f5876b;
            j.b(cropOverlayView);
            cropOverlayView.setInitialCropWindowRect((Rect) null);
            Context context = getContext();
            j.d(context, "getContext(...)");
            WeakReference weakReference2 = new WeakReference(new C0237i(context, this, uri));
            this.f5872T = weakReference2;
            C0237i iVar2 = (C0237i) weakReference2.get();
            if (iVar2 != null) {
                iVar2.f3957f = G5.F.q(iVar2, N.f877a, new C0236h(iVar2, (d) null), 2);
            }
            h();
        }
    }

    public final void setMaxZoom(int i2) {
        if (this.f5861I != i2 && i2 > 0) {
            this.f5861I = i2;
            c(false, false);
            CropOverlayView cropOverlayView = this.f5876b;
            j.b(cropOverlayView);
            cropOverlayView.invalidate();
        }
    }

    public final void setMultiTouchEnabled(boolean z3) {
        CropOverlayView cropOverlayView = this.f5876b;
        j.b(cropOverlayView);
        if (cropOverlayView.f5915e != z3) {
            cropOverlayView.f5915e = z3;
            if (z3 && cropOverlayView.d == null) {
                cropOverlayView.d = new ScaleGestureDetector(cropOverlayView.getContext(), new J(cropOverlayView));
            }
            c(false, false);
            cropOverlayView.invalidate();
        }
    }

    public final void setOnCropImageCompleteListener(B b6) {
        this.f5863K = b6;
    }

    public final void setOnSetImageUriCompleteListener(F f6) {
        this.f5862J = f6;
    }

    public final void setRotatedDegrees(int i2) {
        int i5 = this.f5884t;
        if (i5 != i2) {
            e(i2 - i5);
        }
    }

    public final void setSaveBitmapToInstanceState(boolean z3) {
        this.f5854A = z3;
    }

    public final void setScaleType(H h) {
        j.e(h, "scaleType");
        if (h != this.f5890z) {
            this.f5890z = h;
            this.f5866N = 1.0f;
            this.f5868P = 0.0f;
            this.f5867O = 0.0f;
            CropOverlayView cropOverlayView = this.f5876b;
            if (cropOverlayView != null) {
                cropOverlayView.g();
            }
            requestLayout();
        }
    }

    public final void setShowCropLabel(boolean z3) {
        if (this.f5856C != z3) {
            this.f5856C = z3;
            CropOverlayView cropOverlayView = this.f5876b;
            if (cropOverlayView != null) {
                cropOverlayView.setCropperTextLabelVisibility(z3);
            }
        }
    }

    public final void setShowCropOverlay(boolean z3) {
        if (this.f5855B != z3) {
            this.f5855B = z3;
            g();
        }
    }

    public final void setShowProgressBar(boolean z3) {
        if (this.f5859G != z3) {
            this.f5859G = z3;
            h();
        }
    }

    public final void setSnapRadius(float f6) {
        if (f6 >= 0.0f) {
            CropOverlayView cropOverlayView = this.f5876b;
            j.b(cropOverlayView);
            cropOverlayView.setSnapRadius(f6);
        }
    }

    public final void setOnCropWindowChangedListener(E e6) {
    }

    public final void setOnSetCropOverlayMovedListener(C c3) {
    }

    public final void setOnSetCropOverlayReleasedListener(D d6) {
    }
}
