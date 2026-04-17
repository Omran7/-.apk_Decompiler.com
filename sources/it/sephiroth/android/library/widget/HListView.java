package it.sephiroth.android.library.widget;

import K.C0075o;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.SoundEffectConstants;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.ArrayAdapter;
import android.widget.Checkable;
import android.widget.ListAdapter;
import android.widget.RemoteViews;
import com.mtma.criminal.city.R;
import f5.C0544a;
import java.util.ArrayList;
import k5.C0765b;
import k5.C0767d;
import k5.C0770g;
import k5.C0773j;
import k5.q;
import k5.r;
import k5.s;
import n.k;

@RemoteViews.RemoteView
public class HListView extends C0773j {

    /* renamed from: d1  reason: collision with root package name */
    public final ArrayList f8628d1 = new ArrayList();

    /* renamed from: e1  reason: collision with root package name */
    public final ArrayList f8629e1 = new ArrayList();

    /* renamed from: f1  reason: collision with root package name */
    public Drawable f8630f1;
    public int g1;

    /* renamed from: h1  reason: collision with root package name */
    public final int f8631h1;

    /* renamed from: i1  reason: collision with root package name */
    public Drawable f8632i1;

    /* renamed from: j1  reason: collision with root package name */
    public Drawable f8633j1;

    /* renamed from: k1  reason: collision with root package name */
    public boolean f8634k1;

    /* renamed from: l1  reason: collision with root package name */
    public boolean f8635l1;

    /* renamed from: m1  reason: collision with root package name */
    public boolean f8636m1;

    /* renamed from: n1  reason: collision with root package name */
    public boolean f8637n1;

    /* renamed from: o1  reason: collision with root package name */
    public boolean f8638o1;

    /* renamed from: p1  reason: collision with root package name */
    public boolean f8639p1;

    /* renamed from: q1  reason: collision with root package name */
    public final Rect f8640q1;

    /* renamed from: r1  reason: collision with root package name */
    public Paint f8641r1;

    /* renamed from: s1  reason: collision with root package name */
    public final C0075o f8642s1;

    /* renamed from: t1  reason: collision with root package name */
    public r f8643t1;

    /* JADX WARNING: type inference failed for: r2v1, types: [java.lang.Object, K.o] */
    public HListView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        boolean z3;
        Drawable drawable;
        Drawable drawable2;
        Drawable drawable3;
        CharSequence[] charSequenceArr;
        boolean z4 = true;
        this.f8638o1 = true;
        int i2 = 0;
        this.f8639p1 = false;
        this.f8640q1 = new Rect();
        this.f8642s1 = new Object();
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, C0544a.f7979b, R.attr.hlv_listViewStyle, 0);
        int i5 = -1;
        if (obtainStyledAttributes != null) {
            charSequenceArr = obtainStyledAttributes.getTextArray(0);
            drawable3 = obtainStyledAttributes.getDrawable(1);
            drawable2 = obtainStyledAttributes.getDrawable(5);
            drawable = obtainStyledAttributes.getDrawable(6);
            i2 = obtainStyledAttributes.getDimensionPixelSize(2, 0);
            boolean z5 = obtainStyledAttributes.getBoolean(3, true);
            boolean z6 = obtainStyledAttributes.getBoolean(4, true);
            i5 = obtainStyledAttributes.getInteger(7, -1);
            obtainStyledAttributes.recycle();
            z3 = z6;
            z4 = z5;
        } else {
            charSequenceArr = null;
            z3 = true;
            drawable3 = null;
            drawable2 = null;
            drawable = null;
        }
        if (charSequenceArr != null) {
            setAdapter((ListAdapter) new ArrayAdapter(context, 17367043, charSequenceArr));
        }
        if (drawable3 != null) {
            setDivider(drawable3);
        }
        if (drawable2 != null) {
            setOverscrollHeader(drawable2);
        }
        if (drawable != null) {
            setOverscrollFooter(drawable);
        }
        if (i2 != 0) {
            setDividerWidth(i2);
        }
        this.f8636m1 = z4;
        this.f8637n1 = z3;
        this.f8631h1 = i5;
    }

    public static void V(ArrayList arrayList) {
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                C0767d dVar = (C0767d) ((q) arrayList.get(i2)).f9619a.getLayoutParams();
                if (dVar != null) {
                    dVar.f9488b = false;
                }
            }
        }
    }

    public static void a0(Canvas canvas, Drawable drawable, Rect rect) {
        int minimumWidth = drawable.getMinimumWidth();
        canvas.save();
        canvas.clipRect(rect);
        int i2 = rect.right;
        int i5 = rect.left;
        if (i2 - i5 < minimumWidth) {
            rect.right = i5 + minimumWidth;
        }
        drawable.setBounds(rect);
        drawable.draw(canvas);
        canvas.restore();
    }

    public static void b0(Canvas canvas, Drawable drawable, Rect rect) {
        int minimumWidth = drawable.getMinimumWidth();
        canvas.save();
        canvas.clipRect(rect);
        int i2 = rect.right;
        if (i2 - rect.left < minimumWidth) {
            rect.left = i2 - minimumWidth;
        }
        drawable.setBounds(rect);
        drawable.draw(canvas);
        canvas.restore();
    }

    private int getArrowScrollPreviewLength() {
        return Math.max(2, getHorizontalFadingEdgeLength());
    }

    public static boolean k0(View view, View view2) {
        if (view == view2) {
            return true;
        }
        ViewParent parent = view.getParent();
        if (!(parent instanceof ViewGroup) || !k0((View) parent, view2)) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:186:0x0310  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0083 A[Catch:{ all -> 0x0024 }] */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x008a A[Catch:{ all -> 0x0024 }] */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0095 A[SYNTHETIC, Splitter:B:44:0x0095] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A() {
        /*
            r18 = this;
            r7 = r18
            android.graphics.Rect r0 = r7.f9551e0
            java.lang.String r1 = "The content of the adapter has changed but ListView did not receive a notification. Make sure the content of your adapter is not modified from a background thread, but only from the UI thread. [in ListView("
            boolean r8 = r7.f9577G
            if (r8 != 0) goto L_0x0314
            r2 = 1
            r7.f9577G = r2
            r9 = 0
            r18.invalidate()     // Catch:{ all -> 0x0024 }
            android.widget.ListAdapter r3 = r7.f9529Q     // Catch:{ all -> 0x0024 }
            if (r3 != 0) goto L_0x0026
            r18.I()     // Catch:{ all -> 0x0024 }
            r7.onScrollChanged(r9, r9, r9, r9)     // Catch:{ all -> 0x0024 }
            if (r8 != 0) goto L_0x001f
            r7.f9577G = r9
        L_0x001f:
            return
        L_0x0020:
            r17 = r8
            goto L_0x030e
        L_0x0024:
            r0 = move-exception
            goto L_0x0020
        L_0x0026:
            int r5 = r0.left     // Catch:{ all -> 0x0024 }
            int r3 = r18.getRight()     // Catch:{ all -> 0x0024 }
            int r4 = r18.getLeft()     // Catch:{ all -> 0x0024 }
            int r3 = r3 - r4
            int r4 = r0.right     // Catch:{ all -> 0x0024 }
            int r6 = r3 - r4
            int r3 = r18.getChildCount()     // Catch:{ all -> 0x0024 }
            int r4 = r7.f9526O     // Catch:{ all -> 0x0024 }
            r10 = 3
            r11 = 2
            if (r4 == r2) goto L_0x007c
            if (r4 == r11) goto L_0x006b
            if (r4 == r10) goto L_0x007c
            r13 = 4
            if (r4 == r13) goto L_0x007c
            r13 = 5
            if (r4 == r13) goto L_0x007c
            int r4 = r7.f9589v     // Catch:{ all -> 0x0024 }
            int r13 = r7.f9578a     // Catch:{ all -> 0x0024 }
            int r4 = r4 - r13
            if (r4 < 0) goto L_0x0057
            if (r4 >= r3) goto L_0x0057
            android.view.View r13 = r7.getChildAt(r4)     // Catch:{ all -> 0x0024 }
            goto L_0x0058
        L_0x0057:
            r13 = 0
        L_0x0058:
            android.view.View r14 = r7.getChildAt(r9)     // Catch:{ all -> 0x0024 }
            int r15 = r7.f9587t     // Catch:{ all -> 0x0024 }
            if (r15 < 0) goto L_0x0064
            int r12 = r7.f9589v     // Catch:{ all -> 0x0024 }
            int r15 = r15 - r12
            goto L_0x0065
        L_0x0064:
            r15 = r9
        L_0x0065:
            int r4 = r4 + r15
            android.view.View r4 = r7.getChildAt(r4)     // Catch:{ all -> 0x0024 }
            goto L_0x007f
        L_0x006b:
            int r4 = r7.f9587t     // Catch:{ all -> 0x0024 }
            int r12 = r7.f9578a     // Catch:{ all -> 0x0024 }
            int r4 = r4 - r12
            if (r4 < 0) goto L_0x007c
            if (r4 >= r3) goto L_0x007c
            android.view.View r4 = r7.getChildAt(r4)     // Catch:{ all -> 0x0024 }
            r15 = r9
        L_0x0079:
            r13 = 0
            r14 = 0
            goto L_0x007f
        L_0x007c:
            r15 = r9
            r4 = 0
            goto L_0x0079
        L_0x007f:
            boolean r12 = r7.f9586s     // Catch:{ all -> 0x0024 }
            if (r12 == 0) goto L_0x0086
            r18.x()     // Catch:{ all -> 0x0024 }
        L_0x0086:
            int r10 = r7.f9592y     // Catch:{ all -> 0x0024 }
            if (r10 != 0) goto L_0x0095
            r18.I()     // Catch:{ all -> 0x0024 }
            r7.onScrollChanged(r9, r9, r9, r9)     // Catch:{ all -> 0x0024 }
            if (r8 != 0) goto L_0x0094
            r7.f9577G = r9
        L_0x0094:
            return
        L_0x0095:
            android.widget.ListAdapter r11 = r7.f9529Q     // Catch:{ all -> 0x0024 }
            int r11 = r11.getCount()     // Catch:{ all -> 0x0024 }
            if (r10 != r11) goto L_0x02d7
            int r1 = r7.f9587t     // Catch:{ all -> 0x0024 }
            r7.setSelectedPositionInt(r1)     // Catch:{ all -> 0x0024 }
            int r1 = r7.f9578a     // Catch:{ all -> 0x0024 }
            k5.g r10 = r7.f9541W     // Catch:{ all -> 0x0024 }
            if (r12 == 0) goto L_0x00bc
            r11 = r9
        L_0x00a9:
            if (r11 >= r3) goto L_0x00b9
            android.view.View r2 = r7.getChildAt(r11)     // Catch:{ all -> 0x0024 }
            int r9 = r1 + r11
            r10.a(r2, r9)     // Catch:{ all -> 0x0024 }
            int r11 = r11 + 1
            r2 = 1
            r9 = 0
            goto L_0x00a9
        L_0x00b9:
            r17 = r8
            goto L_0x00f1
        L_0x00bc:
            java.lang.Object r2 = r10.f9494e     // Catch:{ all -> 0x0024 }
            android.view.View[] r2 = (android.view.View[]) r2     // Catch:{ all -> 0x0024 }
            int r2 = r2.length     // Catch:{ all -> 0x0024 }
            if (r2 >= r3) goto L_0x00c7
            android.view.View[] r2 = new android.view.View[r3]     // Catch:{ all -> 0x0024 }
            r10.f9494e = r2     // Catch:{ all -> 0x0024 }
        L_0x00c7:
            r10.f9493c = r1     // Catch:{ all -> 0x0024 }
            java.lang.Object r1 = r10.f9494e     // Catch:{ all -> 0x0024 }
            android.view.View[] r1 = (android.view.View[]) r1     // Catch:{ all -> 0x0024 }
            r2 = 0
        L_0x00ce:
            if (r2 >= r3) goto L_0x00b9
            android.view.ViewGroup r9 = r10.h     // Catch:{ all -> 0x0024 }
            it.sephiroth.android.library.widget.HListView r9 = (it.sephiroth.android.library.widget.HListView) r9     // Catch:{ all -> 0x0024 }
            android.view.View r9 = r9.getChildAt(r2)     // Catch:{ all -> 0x0024 }
            android.view.ViewGroup$LayoutParams r11 = r9.getLayoutParams()     // Catch:{ all -> 0x0024 }
            k5.d r11 = (k5.C0767d) r11     // Catch:{ all -> 0x0024 }
            if (r11 == 0) goto L_0x00ea
            int r11 = r11.f9487a     // Catch:{ all -> 0x0024 }
            r17 = r8
            r8 = -2
            if (r11 == r8) goto L_0x00ec
            r1[r2] = r9     // Catch:{ all -> 0x0135 }
            goto L_0x00ec
        L_0x00ea:
            r17 = r8
        L_0x00ec:
            int r2 = r2 + 1
            r8 = r17
            goto L_0x00ce
        L_0x00f1:
            android.view.View r1 = r18.getFocusedChild()     // Catch:{ all -> 0x0135 }
            if (r1 == 0) goto L_0x013f
            if (r12 == 0) goto L_0x012b
            java.util.ArrayList r2 = r7.f8628d1     // Catch:{ all -> 0x0135 }
            int r8 = r2.size()     // Catch:{ all -> 0x0135 }
            r9 = 0
        L_0x0100:
            if (r9 >= r8) goto L_0x0110
            java.lang.Object r11 = r2.get(r9)     // Catch:{ all -> 0x0135 }
            k5.q r11 = (k5.q) r11     // Catch:{ all -> 0x0135 }
            android.view.View r11 = r11.f9619a     // Catch:{ all -> 0x0135 }
            if (r1 != r11) goto L_0x010d
            goto L_0x012b
        L_0x010d:
            int r9 = r9 + 1
            goto L_0x0100
        L_0x0110:
            java.util.ArrayList r2 = r7.f8629e1     // Catch:{ all -> 0x0135 }
            int r8 = r2.size()     // Catch:{ all -> 0x0135 }
            r9 = 0
        L_0x0117:
            if (r9 >= r8) goto L_0x0127
            java.lang.Object r11 = r2.get(r9)     // Catch:{ all -> 0x0135 }
            k5.q r11 = (k5.q) r11     // Catch:{ all -> 0x0135 }
            android.view.View r11 = r11.f9619a     // Catch:{ all -> 0x0135 }
            if (r1 != r11) goto L_0x0124
            goto L_0x012b
        L_0x0124:
            int r9 = r9 + 1
            goto L_0x0117
        L_0x0127:
            r12 = 0
            r16 = 0
            goto L_0x013b
        L_0x012b:
            android.view.View r12 = r18.findFocus()     // Catch:{ all -> 0x0135 }
            if (r12 == 0) goto L_0x0138
            r12.onStartTemporaryDetach()     // Catch:{ all -> 0x0135 }
            goto L_0x0138
        L_0x0135:
            r0 = move-exception
            goto L_0x030e
        L_0x0138:
            r16 = r12
            r12 = r1
        L_0x013b:
            r18.requestFocus()     // Catch:{ all -> 0x0135 }
            goto L_0x0142
        L_0x013f:
            r12 = 0
            r16 = 0
        L_0x0142:
            r18.detachAllViewsFromParent()     // Catch:{ all -> 0x0135 }
            r10.j()     // Catch:{ all -> 0x0135 }
            int r1 = r7.f9526O     // Catch:{ all -> 0x0135 }
            switch(r1) {
                case 1: goto L_0x0233;
                case 2: goto L_0x01e1;
                case 3: goto L_0x01d5;
                case 4: goto L_0x01bb;
                case 5: goto L_0x01b1;
                case 6: goto L_0x01a6;
                default: goto L_0x014d;
            }     // Catch:{ all -> 0x0135 }
        L_0x014d:
            if (r3 != 0) goto L_0x0177
            boolean r0 = r7.f9564r0     // Catch:{ all -> 0x0135 }
            if (r0 != 0) goto L_0x0162
            r0 = 1
            r1 = 0
            int r0 = r7.e(r1, r0)     // Catch:{ all -> 0x0135 }
            r7.setSelectedPositionInt(r0)     // Catch:{ all -> 0x0135 }
            android.view.View r0 = r7.d0(r5)     // Catch:{ all -> 0x0135 }
            goto L_0x023d
        L_0x0162:
            int r0 = r7.f9592y     // Catch:{ all -> 0x0135 }
            r1 = 1
            int r0 = r0 - r1
            r2 = 0
            int r0 = r7.e(r0, r2)     // Catch:{ all -> 0x0135 }
            r7.setSelectedPositionInt(r0)     // Catch:{ all -> 0x0135 }
            int r0 = r7.f9592y     // Catch:{ all -> 0x0135 }
            int r0 = r0 - r1
            android.view.View r0 = r7.f0(r0, r6)     // Catch:{ all -> 0x0135 }
            goto L_0x023d
        L_0x0177:
            int r0 = r7.f9589v     // Catch:{ all -> 0x0135 }
            if (r0 < 0) goto L_0x018c
            int r1 = r7.f9592y     // Catch:{ all -> 0x0135 }
            if (r0 >= r1) goto L_0x018c
            if (r13 != 0) goto L_0x0182
            goto L_0x0186
        L_0x0182:
            int r5 = r13.getLeft()     // Catch:{ all -> 0x0135 }
        L_0x0186:
            android.view.View r0 = r7.h0(r0, r5)     // Catch:{ all -> 0x0135 }
            goto L_0x023d
        L_0x018c:
            int r0 = r7.f9578a     // Catch:{ all -> 0x0135 }
            int r1 = r7.f9592y     // Catch:{ all -> 0x0135 }
            if (r0 >= r1) goto L_0x019f
            if (r14 != 0) goto L_0x0195
            goto L_0x0199
        L_0x0195:
            int r5 = r14.getLeft()     // Catch:{ all -> 0x0135 }
        L_0x0199:
            android.view.View r0 = r7.h0(r0, r5)     // Catch:{ all -> 0x0135 }
            goto L_0x023d
        L_0x019f:
            r1 = 0
            android.view.View r0 = r7.h0(r1, r5)     // Catch:{ all -> 0x0135 }
            goto L_0x023d
        L_0x01a6:
            r1 = r18
            r2 = r13
            r3 = r4
            r4 = r15
            android.view.View r0 = r1.p0(r2, r3, r4, r5, r6)     // Catch:{ all -> 0x0135 }
            goto L_0x023d
        L_0x01b1:
            int r0 = r7.f9580c     // Catch:{ all -> 0x0135 }
            int r1 = r7.f9579b     // Catch:{ all -> 0x0135 }
            android.view.View r0 = r7.h0(r0, r1)     // Catch:{ all -> 0x0135 }
            goto L_0x023d
        L_0x01bb:
            int r0 = r7.f9589v     // Catch:{ all -> 0x0135 }
            if (r0 >= 0) goto L_0x01c1
            int r0 = r7.f9567v0     // Catch:{ all -> 0x0135 }
        L_0x01c1:
            r1 = 0
            int r0 = java.lang.Math.max(r1, r0)     // Catch:{ all -> 0x0135 }
            int r1 = r7.f9592y     // Catch:{ all -> 0x0135 }
            r2 = 1
            int r1 = r1 - r2
            int r0 = java.lang.Math.min(r0, r1)     // Catch:{ all -> 0x0135 }
            int r1 = r7.f9579b     // Catch:{ all -> 0x0135 }
            android.view.View r0 = r7.h0(r0, r1)     // Catch:{ all -> 0x0135 }
            goto L_0x023d
        L_0x01d5:
            int r0 = r7.f9592y     // Catch:{ all -> 0x0135 }
            r1 = 1
            int r0 = r0 - r1
            android.view.View r0 = r7.f0(r0, r6)     // Catch:{ all -> 0x0135 }
            r18.S()     // Catch:{ all -> 0x0135 }
            goto L_0x023d
        L_0x01e1:
            if (r4 == 0) goto L_0x01ec
            int r0 = r4.getLeft()     // Catch:{ all -> 0x0135 }
            android.view.View r0 = r7.e0(r0, r5, r6)     // Catch:{ all -> 0x0135 }
            goto L_0x023d
        L_0x01ec:
            int r8 = r6 - r5
            int r1 = r7.f9589v     // Catch:{ all -> 0x0135 }
            if (r1 >= 0) goto L_0x01f4
            int r1 = r7.f9567v0     // Catch:{ all -> 0x0135 }
        L_0x01f4:
            r2 = 0
            int r1 = java.lang.Math.max(r2, r1)     // Catch:{ all -> 0x0135 }
            int r2 = r7.f9592y     // Catch:{ all -> 0x0135 }
            r3 = 1
            int r2 = r2 - r3
            int r9 = java.lang.Math.min(r1, r2)     // Catch:{ all -> 0x0135 }
            int r4 = r0.top     // Catch:{ all -> 0x0135 }
            r6 = 1
            r0 = 1
            r1 = r18
            r2 = r9
            r3 = r5
            r5 = r0
            android.view.View r0 = r1.m0(r2, r3, r4, r5, r6)     // Catch:{ all -> 0x0135 }
            r7.f9578a = r9     // Catch:{ all -> 0x0135 }
            int r1 = r0.getMeasuredWidth()     // Catch:{ all -> 0x0135 }
            if (r1 > r8) goto L_0x021c
            int r8 = r8 - r1
            r1 = 2
            int r8 = r8 / r1
            r0.offsetLeftAndRight(r8)     // Catch:{ all -> 0x0135 }
        L_0x021c:
            r7.c0(r0, r9)     // Catch:{ all -> 0x0135 }
            boolean r1 = r7.f9564r0     // Catch:{ all -> 0x0135 }
            if (r1 != 0) goto L_0x022b
            int r1 = r18.getChildCount()     // Catch:{ all -> 0x0135 }
            r7.Y(r1)     // Catch:{ all -> 0x0135 }
            goto L_0x023d
        L_0x022b:
            int r1 = r18.getChildCount()     // Catch:{ all -> 0x0135 }
            r7.X(r1)     // Catch:{ all -> 0x0135 }
            goto L_0x023d
        L_0x0233:
            r1 = 0
            r7.f9578a = r1     // Catch:{ all -> 0x0135 }
            android.view.View r0 = r7.d0(r5)     // Catch:{ all -> 0x0135 }
            r18.S()     // Catch:{ all -> 0x0135 }
        L_0x023d:
            r10.k()     // Catch:{ all -> 0x0135 }
            android.graphics.Rect r1 = r7.f9539V
            if (r0 == 0) goto L_0x0287
            boolean r2 = r7.f8639p1     // Catch:{ all -> 0x0135 }
            r3 = -1
            if (r2 == 0) goto L_0x027d
            boolean r2 = r18.hasFocus()     // Catch:{ all -> 0x0135 }
            if (r2 == 0) goto L_0x027d
            boolean r2 = r0.hasFocus()     // Catch:{ all -> 0x0135 }
            if (r2 != 0) goto L_0x027d
            if (r0 != r12) goto L_0x0262
            if (r16 == 0) goto L_0x0262
            boolean r2 = r16.requestFocus()     // Catch:{ all -> 0x0135 }
            if (r2 != 0) goto L_0x0260
            goto L_0x0262
        L_0x0260:
            r2 = 0
            goto L_0x0269
        L_0x0262:
            boolean r2 = r0.requestFocus()     // Catch:{ all -> 0x0135 }
            if (r2 == 0) goto L_0x0270
            goto L_0x0260
        L_0x0269:
            r0.setSelected(r2)     // Catch:{ all -> 0x0135 }
            r1.setEmpty()     // Catch:{ all -> 0x0135 }
            goto L_0x0280
        L_0x0270:
            android.view.View r1 = r18.getFocusedChild()     // Catch:{ all -> 0x0135 }
            if (r1 == 0) goto L_0x0279
            r1.clearFocus()     // Catch:{ all -> 0x0135 }
        L_0x0279:
            r7.H(r0, r3)     // Catch:{ all -> 0x0135 }
            goto L_0x0280
        L_0x027d:
            r7.H(r0, r3)     // Catch:{ all -> 0x0135 }
        L_0x0280:
            int r0 = r0.getLeft()     // Catch:{ all -> 0x0135 }
            r7.f9563q0 = r0     // Catch:{ all -> 0x0135 }
            goto L_0x02b0
        L_0x0287:
            int r0 = r7.f9558l0     // Catch:{ all -> 0x0135 }
            if (r0 <= 0) goto L_0x029f
            r2 = 3
            if (r0 >= r2) goto L_0x029f
            int r0 = r7.f9555i0     // Catch:{ all -> 0x0135 }
            int r1 = r7.f9578a     // Catch:{ all -> 0x0135 }
            int r0 = r0 - r1
            android.view.View r0 = r7.getChildAt(r0)     // Catch:{ all -> 0x0135 }
            if (r0 == 0) goto L_0x02a5
            int r1 = r7.f9555i0     // Catch:{ all -> 0x0135 }
            r7.H(r0, r1)     // Catch:{ all -> 0x0135 }
            goto L_0x02a5
        L_0x029f:
            r2 = 0
            r7.f9563q0 = r2     // Catch:{ all -> 0x0135 }
            r1.setEmpty()     // Catch:{ all -> 0x0135 }
        L_0x02a5:
            boolean r0 = r18.hasFocus()     // Catch:{ all -> 0x0135 }
            if (r0 == 0) goto L_0x02b0
            if (r16 == 0) goto L_0x02b0
            r16.requestFocus()     // Catch:{ all -> 0x0135 }
        L_0x02b0:
            if (r16 == 0) goto L_0x02bb
            android.os.IBinder r0 = r16.getWindowToken()     // Catch:{ all -> 0x0135 }
            if (r0 == 0) goto L_0x02bb
            r16.onFinishTemporaryDetach()     // Catch:{ all -> 0x0135 }
        L_0x02bb:
            r1 = 0
            r7.f9526O = r1     // Catch:{ all -> 0x0135 }
            r7.f9586s = r1     // Catch:{ all -> 0x0135 }
            r7.f9582f = r1     // Catch:{ all -> 0x0135 }
            int r0 = r7.f9589v     // Catch:{ all -> 0x0135 }
            r7.setNextSelectedPositionInt(r0)     // Catch:{ all -> 0x0135 }
            int r0 = r7.f9592y     // Catch:{ all -> 0x0135 }
            if (r0 <= 0) goto L_0x02ce
            r18.b()     // Catch:{ all -> 0x0135 }
        L_0x02ce:
            r1 = 0
            r7.onScrollChanged(r1, r1, r1, r1)     // Catch:{ all -> 0x0135 }
            if (r17 != 0) goto L_0x02d6
            r7.f9577G = r1
        L_0x02d6:
            return
        L_0x02d7:
            r17 = r8
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0135 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x0135 }
            r2.<init>(r1)     // Catch:{ all -> 0x0135 }
            int r1 = r18.getId()     // Catch:{ all -> 0x0135 }
            r2.append(r1)     // Catch:{ all -> 0x0135 }
            java.lang.String r1 = ", "
            r2.append(r1)     // Catch:{ all -> 0x0135 }
            java.lang.Class r1 = r18.getClass()     // Catch:{ all -> 0x0135 }
            r2.append(r1)     // Catch:{ all -> 0x0135 }
            java.lang.String r1 = ") with Adapter("
            r2.append(r1)     // Catch:{ all -> 0x0135 }
            android.widget.ListAdapter r1 = r7.f9529Q     // Catch:{ all -> 0x0135 }
            java.lang.Class r1 = r1.getClass()     // Catch:{ all -> 0x0135 }
            r2.append(r1)     // Catch:{ all -> 0x0135 }
            java.lang.String r1 = ")]"
            r2.append(r1)     // Catch:{ all -> 0x0135 }
            java.lang.String r1 = r2.toString()     // Catch:{ all -> 0x0135 }
            r0.<init>(r1)     // Catch:{ all -> 0x0135 }
            throw r0     // Catch:{ all -> 0x0135 }
        L_0x030e:
            if (r17 != 0) goto L_0x0313
            r1 = 0
            r7.f9577G = r1
        L_0x0313:
            throw r0
        L_0x0314:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: it.sephiroth.android.library.widget.HListView.A():void");
    }

    public final void I() {
        V(this.f8628d1);
        V(this.f8629e1);
        removeAllViewsInLayout();
        this.f9578a = 0;
        this.f9586s = false;
        this.f9582f = false;
        this.f9546a1 = null;
        this.f9573B = -1;
        this.f9574C = Long.MIN_VALUE;
        setSelectedPositionInt(-1);
        setNextSelectedPositionInt(-1);
        this.f9563q0 = 0;
        this.f9537U = -1;
        this.f9539V.setEmpty();
        invalidate();
        this.f9526O = 0;
    }

    public final void S() {
        int childCount = getChildCount();
        if (childCount > 0) {
            boolean z3 = this.f9564r0;
            Rect rect = this.f9551e0;
            int i2 = 0;
            if (!z3) {
                int left = getChildAt(0).getLeft() - rect.left;
                if (this.f9578a != 0) {
                    left -= this.g1;
                }
                if (left >= 0) {
                    i2 = left;
                }
            } else {
                int right = getChildAt(childCount - 1).getRight() - (getWidth() - rect.right);
                if (this.f9578a + childCount < this.f9592y) {
                    right += this.g1;
                }
                if (right <= 0) {
                    i2 = right;
                }
            }
            if (i2 != 0) {
                C(-i2);
            }
        }
    }

    /* JADX INFO: finally extract failed */
    public final boolean T(int i2) {
        try {
            this.f9585r = true;
            boolean U5 = U(i2);
            if (U5) {
                playSoundEffect(SoundEffectConstants.getContantForFocusDirection(i2));
            }
            this.f9585r = false;
            return U5;
        } catch (Throwable th) {
            this.f9585r = false;
            throw th;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:106:0x01ae  */
    /* JADX WARNING: Removed duplicated region for block: B:107:0x01b6  */
    /* JADX WARNING: Removed duplicated region for block: B:115:0x01d2  */
    /* JADX WARNING: Removed duplicated region for block: B:117:0x01d8  */
    /* JADX WARNING: Removed duplicated region for block: B:118:0x01da  */
    /* JADX WARNING: Removed duplicated region for block: B:120:0x01dd  */
    /* JADX WARNING: Removed duplicated region for block: B:151:0x024d  */
    /* JADX WARNING: Removed duplicated region for block: B:166:0x0278 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:172:0x028a  */
    /* JADX WARNING: Removed duplicated region for block: B:179:0x02a3 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00d4  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean U(int r19) {
        /*
            r18 = this;
            r0 = r18
            r1 = r19
            int r2 = r18.getChildCount()
            r3 = 0
            if (r2 > 0) goto L_0x000c
            return r3
        L_0x000c:
            android.view.View r2 = r18.getSelectedView()
            int r4 = r0.f9589v
            int r5 = r18.l0(r19)
            int r6 = r18.getWidth()
            android.graphics.Rect r7 = r0.f9551e0
            int r8 = r7.right
            int r6 = r6 - r8
            int r8 = r7.left
            int r9 = r18.getChildCount()
            r10 = 1
            r11 = 130(0x82, float:1.82E-43)
            r12 = -1
            if (r1 != r11) goto L_0x0083
            int r8 = r9 + -1
            if (r5 == r12) goto L_0x0034
            int r13 = r0.f9578a
            int r13 = r5 - r13
            goto L_0x0035
        L_0x0034:
            r13 = r8
        L_0x0035:
            int r14 = r0.f9578a
            int r14 = r14 + r13
            android.view.View r13 = r0.getChildAt(r13)
            int r15 = r0.f9592y
            int r15 = r15 - r10
            if (r14 >= r15) goto L_0x0048
            int r14 = r18.getArrowScrollPreviewLength()
            int r14 = r6 - r14
            goto L_0x0049
        L_0x0048:
            r14 = r6
        L_0x0049:
            int r15 = r13.getRight()
            if (r15 > r14) goto L_0x0052
        L_0x004f:
            r6 = r3
            goto L_0x00ce
        L_0x0052:
            if (r5 == r12) goto L_0x0061
            int r15 = r13.getLeft()
            int r15 = r14 - r15
            int r10 = r18.getMaxScrollAmount()
            if (r15 < r10) goto L_0x0061
            goto L_0x004f
        L_0x0061:
            int r10 = r13.getRight()
            int r10 = r10 - r14
            int r13 = r0.f9578a
            int r13 = r13 + r9
            int r9 = r0.f9592y
            if (r13 != r9) goto L_0x007a
            android.view.View r8 = r0.getChildAt(r8)
            int r8 = r8.getRight()
            int r8 = r8 - r6
            int r10 = java.lang.Math.min(r10, r8)
        L_0x007a:
            int r6 = r18.getMaxScrollAmount()
            int r6 = java.lang.Math.min(r10, r6)
            goto L_0x00ce
        L_0x0083:
            if (r5 == r12) goto L_0x008a
            int r6 = r0.f9578a
            int r6 = r5 - r6
            goto L_0x008b
        L_0x008a:
            r6 = r3
        L_0x008b:
            int r9 = r0.f9578a
            int r9 = r9 + r6
            android.view.View r6 = r0.getChildAt(r6)
            if (r9 <= 0) goto L_0x009a
            int r9 = r18.getArrowScrollPreviewLength()
            int r9 = r9 + r8
            goto L_0x009b
        L_0x009a:
            r9 = r8
        L_0x009b:
            int r10 = r6.getLeft()
            if (r10 < r9) goto L_0x00a2
            goto L_0x004f
        L_0x00a2:
            if (r5 == r12) goto L_0x00b0
            int r10 = r6.getRight()
            int r10 = r10 - r9
            int r13 = r18.getMaxScrollAmount()
            if (r10 < r13) goto L_0x00b0
            goto L_0x004f
        L_0x00b0:
            int r6 = r6.getLeft()
            int r9 = r9 - r6
            int r6 = r0.f9578a
            if (r6 != 0) goto L_0x00c6
            android.view.View r6 = r0.getChildAt(r3)
            int r6 = r6.getLeft()
            int r8 = r8 - r6
            int r9 = java.lang.Math.min(r9, r8)
        L_0x00c6:
            int r6 = r18.getMaxScrollAmount()
            int r6 = java.lang.Math.min(r9, r6)
        L_0x00ce:
            boolean r8 = r0.f8639p1
            r9 = 33
            if (r8 == 0) goto L_0x01cf
            android.view.View r8 = r18.getSelectedView()
            android.graphics.Rect r13 = r0.f8640q1
            if (r8 == 0) goto L_0x00ef
            boolean r14 = r8.hasFocus()
            if (r14 == 0) goto L_0x00ef
            android.view.View r8 = r8.findFocus()
            android.view.FocusFinder r14 = android.view.FocusFinder.getInstance()
            android.view.View r8 = r14.findNextFocus(r0, r8, r1)
            goto L_0x014a
        L_0x00ef:
            if (r1 != r11) goto L_0x0113
            int r14 = r0.f9578a
            if (r14 <= 0) goto L_0x00f7
            r14 = 1
            goto L_0x00f8
        L_0x00f7:
            r14 = r3
        L_0x00f8:
            int r15 = r7.left
            if (r14 == 0) goto L_0x0101
            int r14 = r18.getArrowScrollPreviewLength()
            goto L_0x0102
        L_0x0101:
            r14 = r3
        L_0x0102:
            int r15 = r15 + r14
            if (r8 == 0) goto L_0x010f
            int r14 = r8.getLeft()
            if (r14 <= r15) goto L_0x010f
            int r15 = r8.getLeft()
        L_0x010f:
            r13.set(r15, r3, r15, r3)
            goto L_0x0142
        L_0x0113:
            int r14 = r0.f9578a
            int r15 = r18.getChildCount()
            int r15 = r15 + r14
            r14 = 1
            int r15 = r15 - r14
            int r14 = r0.f9592y
            if (r15 >= r14) goto L_0x0122
            r14 = 1
            goto L_0x0123
        L_0x0122:
            r14 = r3
        L_0x0123:
            int r15 = r18.getWidth()
            int r10 = r7.right
            int r15 = r15 - r10
            if (r14 == 0) goto L_0x0131
            int r10 = r18.getArrowScrollPreviewLength()
            goto L_0x0132
        L_0x0131:
            r10 = r3
        L_0x0132:
            int r15 = r15 - r10
            if (r8 == 0) goto L_0x013f
            int r10 = r8.getRight()
            if (r10 >= r15) goto L_0x013f
            int r15 = r8.getRight()
        L_0x013f:
            r13.set(r15, r3, r15, r3)
        L_0x0142:
            android.view.FocusFinder r8 = android.view.FocusFinder.getInstance()
            android.view.View r8 = r8.findNextFocusFromRect(r0, r13, r1)
        L_0x014a:
            if (r8 == 0) goto L_0x01cf
            int r10 = r18.getChildCount()
            r14 = r3
        L_0x0151:
            if (r14 >= r10) goto L_0x01c7
            android.view.View r15 = r0.getChildAt(r14)
            boolean r15 = k0(r8, r15)
            if (r15 == 0) goto L_0x01c4
            int r10 = r0.f9578a
            int r10 = r10 + r14
            int r14 = r0.f9589v
            if (r14 == r12) goto L_0x0175
            if (r10 == r14) goto L_0x0175
            int r14 = r18.l0(r19)
            if (r14 == r12) goto L_0x0175
            if (r1 != r11) goto L_0x0170
            if (r14 < r10) goto L_0x01cf
        L_0x0170:
            if (r1 != r9) goto L_0x0175
            if (r14 <= r10) goto L_0x0175
            goto L_0x01cf
        L_0x0175:
            r8.getDrawingRect(r13)
            r0.offsetDescendantRectToMyCoords(r8, r13)
            if (r1 != r9) goto L_0x018c
            int r11 = r13.left
            int r7 = r7.left
            if (r11 >= r7) goto L_0x01a5
            int r7 = r7 - r11
            if (r10 <= 0) goto L_0x01a6
            int r11 = r18.getArrowScrollPreviewLength()
        L_0x018a:
            int r7 = r7 + r11
            goto L_0x01a6
        L_0x018c:
            int r11 = r18.getWidth()
            int r7 = r7.right
            int r11 = r11 - r7
            int r7 = r13.bottom
            if (r7 <= r11) goto L_0x01a5
            int r7 = r13.right
            int r7 = r7 - r11
            int r11 = r0.f9592y
            r13 = 1
            int r11 = r11 - r13
            if (r10 >= r11) goto L_0x01a6
            int r11 = r18.getArrowScrollPreviewLength()
            goto L_0x018a
        L_0x01a5:
            r7 = r3
        L_0x01a6:
            int r11 = r18.getMaxScrollAmount()
            K.o r13 = r0.f8642s1
            if (r7 >= r11) goto L_0x01b6
            r8.requestFocus(r1)
            r13.f1411a = r10
            r13.f1412b = r7
            goto L_0x01d0
        L_0x01b6:
            int r7 = r0.Z(r8)
            if (r7 >= r11) goto L_0x01cf
            r8.requestFocus(r1)
            r13.f1411a = r10
            r13.f1412b = r11
            goto L_0x01d0
        L_0x01c4:
            int r14 = r14 + 1
            goto L_0x0151
        L_0x01c7:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "newFocus is not a child of any of the children of the list!"
            r1.<init>(r2)
            throw r1
        L_0x01cf:
            r13 = 0
        L_0x01d0:
            if (r13 == 0) goto L_0x01d6
            int r5 = r13.f1411a
            int r6 = r13.f1412b
        L_0x01d6:
            if (r13 == 0) goto L_0x01da
            r14 = 1
            goto L_0x01db
        L_0x01da:
            r14 = r3
        L_0x01db:
            if (r5 == r12) goto L_0x024b
            if (r13 == 0) goto L_0x01e1
            r14 = 1
            goto L_0x01e2
        L_0x01e1:
            r14 = r3
        L_0x01e2:
            if (r5 == r12) goto L_0x0243
            int r4 = r0.f9589v
            int r7 = r0.f9578a
            int r4 = r4 - r7
            int r7 = r5 - r7
            if (r1 != r9) goto L_0x01fd
            android.view.View r8 = r0.getChildAt(r7)
            r10 = 1
            r16 = r8
            r8 = r2
            r2 = r16
            r17 = r7
            r7 = r4
            r4 = r17
            goto L_0x0202
        L_0x01fd:
            android.view.View r8 = r0.getChildAt(r7)
            r10 = r3
        L_0x0202:
            int r11 = r18.getChildCount()
            if (r2 == 0) goto L_0x0215
            if (r14 != 0) goto L_0x020e
            if (r10 == 0) goto L_0x020e
            r15 = 1
            goto L_0x020f
        L_0x020e:
            r15 = r3
        L_0x020f:
            r2.setSelected(r15)
            r0.n0(r2, r4, r11)
        L_0x0215:
            if (r8 == 0) goto L_0x0224
            if (r14 != 0) goto L_0x021d
            if (r10 != 0) goto L_0x021d
            r14 = 1
            goto L_0x021e
        L_0x021d:
            r14 = r3
        L_0x021e:
            r8.setSelected(r14)
            r0.n0(r8, r7, r11)
        L_0x0224:
            r0.setSelectedPositionInt(r5)
            r0.setNextSelectedPositionInt(r5)
            android.view.View r2 = r18.getSelectedView()
            boolean r4 = r0.f8639p1
            if (r4 == 0) goto L_0x023d
            if (r13 != 0) goto L_0x023d
            android.view.View r4 = r18.getFocusedChild()
            if (r4 == 0) goto L_0x023d
            r4.clearFocus()
        L_0x023d:
            r18.b()
            r4 = r5
            r14 = 1
            goto L_0x024b
        L_0x0243:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "newSelectedPosition needs to be valid"
            r1.<init>(r2)
            throw r1
        L_0x024b:
            if (r6 <= 0) goto L_0x0255
            if (r1 != r9) goto L_0x0250
            goto L_0x0251
        L_0x0250:
            int r6 = -r6
        L_0x0251:
            r0.r0(r6)
            r14 = 1
        L_0x0255:
            boolean r1 = r0.f8639p1
            if (r1 == 0) goto L_0x0276
            if (r13 != 0) goto L_0x0276
            if (r2 == 0) goto L_0x0276
            boolean r1 = r2.hasFocus()
            if (r1 == 0) goto L_0x0276
            android.view.View r1 = r2.findFocus()
            boolean r6 = k0(r1, r0)
            if (r6 == 0) goto L_0x0273
            int r6 = r0.Z(r1)
            if (r6 <= 0) goto L_0x0276
        L_0x0273:
            r1.clearFocus()
        L_0x0276:
            if (r5 != r12) goto L_0x0287
            if (r2 == 0) goto L_0x0287
            boolean r1 = k0(r2, r0)
            if (r1 != 0) goto L_0x0287
            r18.y()
            r0.f9567v0 = r12
            r10 = 0
            goto L_0x0288
        L_0x0287:
            r10 = r2
        L_0x0288:
            if (r14 == 0) goto L_0x02a3
            if (r10 == 0) goto L_0x0295
            r0.H(r10, r4)
            int r1 = r10.getLeft()
            r0.f9563q0 = r1
        L_0x0295:
            boolean r1 = r18.awakenScrollBars()
            if (r1 != 0) goto L_0x029e
            r18.invalidate()
        L_0x029e:
            r0.onScrollChanged(r3, r3, r3, r3)
            r1 = 1
            return r1
        L_0x02a3:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: it.sephiroth.android.library.widget.HListView.U(int):boolean");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0067, code lost:
        if (i0(130) != false) goto L_0x01c9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x0097, code lost:
        if (i0(33) != false) goto L_0x01c9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x00c3, code lost:
        if (i0(130) != false) goto L_0x01c9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x00d7, code lost:
        if (i0(33) != false) goto L_0x01c9;
     */
    /* JADX WARNING: Removed duplicated region for block: B:149:0x01f0 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:150:0x01f1  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean W(int r8, int r9, android.view.KeyEvent r10) {
        /*
            r7 = this;
            android.widget.ListAdapter r0 = r7.f9529Q
            r1 = 0
            if (r0 == 0) goto L_0x0200
            boolean r0 = r7.f9543Y0
            if (r0 != 0) goto L_0x000b
            goto L_0x0200
        L_0x000b:
            boolean r0 = r7.f9586s
            if (r0 == 0) goto L_0x0012
            r7.A()
        L_0x0012:
            int r0 = r10.getAction()
            r2 = 1
            r3 = 2
            if (r0 == r2) goto L_0x01ed
            r4 = 62
            r5 = 33
            r6 = 130(0x82, float:1.82E-43)
            if (r8 == r4) goto L_0x01cb
            r4 = 66
            if (r8 == r4) goto L_0x012b
            r4 = 92
            if (r8 == r4) goto L_0x0103
            r4 = 93
            if (r8 == r4) goto L_0x00db
            r4 = 122(0x7a, float:1.71E-43)
            if (r8 == r4) goto L_0x00c7
            r4 = 123(0x7b, float:1.72E-43)
            if (r8 == r4) goto L_0x00b3
            switch(r8) {
                case 19: goto L_0x00a7;
                case 20: goto L_0x009b;
                case 21: goto L_0x006b;
                case 22: goto L_0x003b;
                case 23: goto L_0x012b;
                default: goto L_0x0039;
            }
        L_0x0039:
            goto L_0x01ed
        L_0x003b:
            boolean r4 = r10.hasNoModifiers()
            if (r4 == 0) goto L_0x0057
            boolean r4 = r7.K()
            if (r4 != 0) goto L_0x01ee
        L_0x0047:
            int r5 = r9 + -1
            if (r9 <= 0) goto L_0x0054
            boolean r9 = r7.T(r6)
            if (r9 == 0) goto L_0x0054
            r4 = r2
            r9 = r5
            goto L_0x0047
        L_0x0054:
            r9 = r5
            goto L_0x01ee
        L_0x0057:
            boolean r4 = r10.hasModifiers(r3)
            if (r4 == 0) goto L_0x01ed
            boolean r4 = r7.K()
            if (r4 != 0) goto L_0x01c9
            boolean r4 = r7.i0(r6)
            if (r4 == 0) goto L_0x01ed
            goto L_0x01c9
        L_0x006b:
            boolean r4 = r10.hasNoModifiers()
            if (r4 == 0) goto L_0x0087
            boolean r4 = r7.K()
            if (r4 != 0) goto L_0x01ee
        L_0x0077:
            int r6 = r9 + -1
            if (r9 <= 0) goto L_0x0084
            boolean r9 = r7.T(r5)
            if (r9 == 0) goto L_0x0084
            r4 = r2
            r9 = r6
            goto L_0x0077
        L_0x0084:
            r9 = r6
            goto L_0x01ee
        L_0x0087:
            boolean r4 = r10.hasModifiers(r3)
            if (r4 == 0) goto L_0x01ed
            boolean r4 = r7.K()
            if (r4 != 0) goto L_0x01c9
            boolean r4 = r7.i0(r5)
            if (r4 == 0) goto L_0x01ed
            goto L_0x01c9
        L_0x009b:
            boolean r4 = r10.hasNoModifiers()
            if (r4 == 0) goto L_0x01ed
            boolean r4 = r7.j0(r6)
            goto L_0x01ee
        L_0x00a7:
            boolean r4 = r10.hasNoModifiers()
            if (r4 == 0) goto L_0x01ed
            boolean r4 = r7.j0(r5)
            goto L_0x01ee
        L_0x00b3:
            boolean r4 = r10.hasNoModifiers()
            if (r4 == 0) goto L_0x01ed
            boolean r4 = r7.K()
            if (r4 != 0) goto L_0x01c9
            boolean r4 = r7.i0(r6)
            if (r4 == 0) goto L_0x01ed
            goto L_0x01c9
        L_0x00c7:
            boolean r4 = r10.hasNoModifiers()
            if (r4 == 0) goto L_0x01ed
            boolean r4 = r7.K()
            if (r4 != 0) goto L_0x01c9
            boolean r4 = r7.i0(r5)
            if (r4 == 0) goto L_0x01ed
            goto L_0x01c9
        L_0x00db:
            boolean r4 = r10.hasNoModifiers()
            if (r4 == 0) goto L_0x00ef
            boolean r4 = r7.K()
            if (r4 != 0) goto L_0x01c9
            boolean r4 = r7.q0(r6)
            if (r4 == 0) goto L_0x01ed
            goto L_0x01c9
        L_0x00ef:
            boolean r4 = r10.hasModifiers(r3)
            if (r4 == 0) goto L_0x01ed
            boolean r4 = r7.K()
            if (r4 != 0) goto L_0x01c9
            boolean r4 = r7.i0(r6)
            if (r4 == 0) goto L_0x01ed
            goto L_0x01c9
        L_0x0103:
            boolean r4 = r10.hasNoModifiers()
            if (r4 == 0) goto L_0x0117
            boolean r4 = r7.K()
            if (r4 != 0) goto L_0x01c9
            boolean r4 = r7.q0(r5)
            if (r4 == 0) goto L_0x01ed
            goto L_0x01c9
        L_0x0117:
            boolean r4 = r10.hasModifiers(r3)
            if (r4 == 0) goto L_0x01ed
            boolean r4 = r7.K()
            if (r4 != 0) goto L_0x01c9
            boolean r4 = r7.i0(r5)
            if (r4 == 0) goto L_0x01ed
            goto L_0x01c9
        L_0x012b:
            boolean r4 = r10.hasNoModifiers()
            if (r4 == 0) goto L_0x01ed
            boolean r4 = r7.K()
            if (r4 != 0) goto L_0x01ee
            int r5 = r10.getRepeatCount()
            if (r5 != 0) goto L_0x01ee
            int r5 = r7.getChildCount()
            if (r5 <= 0) goto L_0x01ee
            boolean r4 = r7.isEnabled()
            if (r4 == 0) goto L_0x01c9
            boolean r4 = r7.isClickable()
            if (r4 != 0) goto L_0x0151
            goto L_0x01c9
        L_0x0151:
            android.graphics.drawable.Drawable r4 = r7.f9535T
            if (r4 == 0) goto L_0x01c9
            boolean r5 = r7.isFocused()
            if (r5 != 0) goto L_0x0162
            int r5 = r7.f9558l0
            if (r5 == r2) goto L_0x0162
            if (r5 == r3) goto L_0x0162
            goto L_0x01c9
        L_0x0162:
            android.graphics.Rect r5 = r7.f9539V
            boolean r5 = r5.isEmpty()
            if (r5 != 0) goto L_0x01c9
            int r5 = r7.f9589v
            int r6 = r7.f9578a
            int r5 = r5 - r6
            android.view.View r5 = r7.getChildAt(r5)
            if (r5 == 0) goto L_0x017f
            boolean r6 = r5.hasFocusable()
            if (r6 == 0) goto L_0x017c
            goto L_0x01c9
        L_0x017c:
            r5.setPressed(r2)
        L_0x017f:
            r7.setPressed(r2)
            boolean r5 = r7.isLongClickable()
            android.graphics.drawable.Drawable r4 = r4.getCurrent()
            if (r4 == 0) goto L_0x01a1
            boolean r6 = r4 instanceof android.graphics.drawable.TransitionDrawable
            if (r6 == 0) goto L_0x01a1
            if (r5 == 0) goto L_0x019c
            android.graphics.drawable.TransitionDrawable r4 = (android.graphics.drawable.TransitionDrawable) r4
            int r6 = android.view.ViewConfiguration.getLongPressTimeout()
            r4.startTransition(r6)
            goto L_0x01a1
        L_0x019c:
            android.graphics.drawable.TransitionDrawable r4 = (android.graphics.drawable.TransitionDrawable) r4
            r4.resetTransition()
        L_0x01a1:
            if (r5 == 0) goto L_0x01c9
            boolean r4 = r7.f9586s
            if (r4 != 0) goto L_0x01c9
            k5.c r4 = r7.f9506A0
            if (r4 != 0) goto L_0x01b3
            k5.c r4 = new k5.c
            r5 = 0
            r4.<init>(r7, r5)
            r7.f9506A0 = r4
        L_0x01b3:
            k5.c r4 = r7.f9506A0
            java.lang.Object r5 = r4.f618b
            k5.j r5 = (k5.C0773j) r5
            int r5 = r5.getWindowAttachCount()
            r4.f617a = r5
            k5.c r4 = r7.f9506A0
            int r5 = android.view.ViewConfiguration.getLongPressTimeout()
            long r5 = (long) r5
            r7.postDelayed(r4, r5)
        L_0x01c9:
            r4 = r2
            goto L_0x01ee
        L_0x01cb:
            boolean r4 = r10.hasNoModifiers()
            if (r4 == 0) goto L_0x01dc
            boolean r4 = r7.K()
            if (r4 != 0) goto L_0x01c9
            boolean r4 = r7.q0(r6)
            goto L_0x01c9
        L_0x01dc:
            boolean r4 = r10.hasModifiers(r2)
            if (r4 == 0) goto L_0x01c9
            boolean r4 = r7.K()
            if (r4 != 0) goto L_0x01c9
            boolean r4 = r7.q0(r5)
            goto L_0x01c9
        L_0x01ed:
            r4 = r1
        L_0x01ee:
            if (r4 == 0) goto L_0x01f1
            return r2
        L_0x01f1:
            if (r0 == r2) goto L_0x01fb
            if (r0 == r3) goto L_0x01f6
            return r1
        L_0x01f6:
            boolean r8 = super.onKeyMultiple(r8, r9, r10)
            return r8
        L_0x01fb:
            boolean r8 = super.onKeyUp(r8, r10)
            return r8
        L_0x0200:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: it.sephiroth.android.library.widget.HListView.W(int, int, android.view.KeyEvent):boolean");
    }

    public final void X(int i2) {
        if (this.f9578a == 0 && i2 > 0) {
            int left = getChildAt(0).getLeft();
            Rect rect = this.f9551e0;
            int i5 = rect.left;
            int right = (getRight() - getLeft()) - rect.right;
            int i6 = left - i5;
            View childAt = getChildAt(i2 - 1);
            int right2 = childAt.getRight();
            int i7 = this.f9578a + i2;
            int i8 = i7 - 1;
            if (i6 > 0) {
                int i9 = this.f9592y;
                if (i8 < i9 - 1 || right2 > right) {
                    if (i8 == i9 - 1) {
                        i6 = Math.min(i6, right2 - right);
                    }
                    C(-i6);
                    if (i8 < this.f9592y - 1) {
                        g0(i7, childAt.getRight() + this.g1);
                        S();
                    }
                } else if (i8 == i9 - 1) {
                    S();
                }
            }
        }
    }

    public final void Y(int i2) {
        if ((this.f9578a + i2) - 1 == this.f9592y - 1 && i2 > 0) {
            int right = getChildAt(i2 - 1).getRight();
            int right2 = getRight() - getLeft();
            Rect rect = this.f9551e0;
            int i5 = (right2 - rect.right) - right;
            View childAt = getChildAt(0);
            int left = childAt.getLeft();
            if (i5 > 0) {
                int i6 = this.f9578a;
                if (i6 > 0 || left < rect.top) {
                    if (i6 == 0) {
                        i5 = Math.min(i5, rect.top - left);
                    }
                    C(i5);
                    int i7 = this.f9578a;
                    if (i7 > 0) {
                        f0(i7 - 1, childAt.getLeft() - this.g1);
                        S();
                    }
                }
            }
        }
    }

    public final int Z(View view) {
        Rect rect = this.f8640q1;
        view.getDrawingRect(rect);
        offsetDescendantRectToMyCoords(view, rect);
        int right = getRight() - getLeft();
        Rect rect2 = this.f9551e0;
        int i2 = right - rect2.right;
        int i5 = rect.right;
        int i6 = rect2.left;
        if (i5 < i6) {
            return i6 - i5;
        }
        int i7 = rect.left;
        if (i7 > i2) {
            return i7 - i2;
        }
        return 0;
    }

    public final void c0(View view, int i2) {
        int i5 = this.g1;
        if (!this.f9564r0) {
            f0(i2 - 1, view.getLeft() - i5);
            S();
            g0(i2 + 1, view.getRight() + i5);
            return;
        }
        g0(i2 + 1, view.getRight() + i5);
        S();
        f0(i2 - 1, view.getLeft() - i5);
    }

    public final boolean canAnimate() {
        if (!super.canAnimate() || this.f9592y <= 0) {
            return false;
        }
        return true;
    }

    public final View d0(int i2) {
        int min = Math.min(this.f9578a, this.f9589v);
        this.f9578a = min;
        int min2 = Math.min(min, this.f9592y - 1);
        this.f9578a = min2;
        if (min2 < 0) {
            this.f9578a = 0;
        }
        return g0(this.f9578a, i2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:101:0x01ca, code lost:
        if (r13.isEnabled(r3 + 1) == false) goto L_0x01cf;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x011b, code lost:
        if (r13.isEnabled(r7 + 1) == false) goto L_0x0122;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void dispatchDraw(android.graphics.Canvas r25) {
        /*
            r24 = this;
            r0 = r24
            r1 = r25
            boolean r2 = r0.f9553g0
            r3 = 1
            if (r2 == 0) goto L_0x000b
            r0.f9554h0 = r3
        L_0x000b:
            int r2 = r0.g1
            android.graphics.drawable.Drawable r4 = r0.f8632i1
            android.graphics.drawable.Drawable r5 = r0.f8633j1
            if (r4 == 0) goto L_0x0015
            r7 = r3
            goto L_0x0016
        L_0x0015:
            r7 = 0
        L_0x0016:
            if (r5 == 0) goto L_0x001a
            r8 = r3
            goto L_0x001b
        L_0x001a:
            r8 = 0
        L_0x001b:
            if (r2 <= 0) goto L_0x0023
            android.graphics.drawable.Drawable r9 = r0.f8630f1
            if (r9 == 0) goto L_0x0023
            r9 = r3
            goto L_0x0024
        L_0x0023:
            r9 = 0
        L_0x0024:
            if (r9 != 0) goto L_0x002a
            if (r7 != 0) goto L_0x002a
            if (r8 == 0) goto L_0x0219
        L_0x002a:
            int r10 = r24.getPaddingTop()
            android.graphics.Rect r11 = r0.f8640q1
            r11.top = r10
            int r10 = r24.getBottom()
            int r12 = r24.getTop()
            int r10 = r10 - r12
            int r12 = r24.getPaddingBottom()
            int r10 = r10 - r12
            r11.bottom = r10
            int r10 = r24.getChildCount()
            java.util.ArrayList r12 = r0.f8628d1
            int r12 = r12.size()
            int r13 = r0.f9592y
            java.util.ArrayList r14 = r0.f8629e1
            int r14 = r14.size()
            int r14 = r13 - r14
            int r14 = r14 - r3
            boolean r15 = r0.f8636m1
            boolean r3 = r0.f8637n1
            int r6 = r0.f9578a
            r18 = r5
            boolean r5 = r0.f8638o1
            r19 = r13
            android.widget.ListAdapter r13 = r0.f9529Q
            boolean r20 = r24.isOpaque()
            if (r20 == 0) goto L_0x0074
            boolean r20 = super.isOpaque()
            if (r20 != 0) goto L_0x0074
            r16 = 1
            goto L_0x0076
        L_0x0074:
            r16 = 0
        L_0x0076:
            if (r16 == 0) goto L_0x0096
            r20 = r13
            android.graphics.Paint r13 = r0.f8641r1
            if (r13 != 0) goto L_0x0093
            boolean r13 = r0.f8634k1
            if (r13 == 0) goto L_0x0093
            android.graphics.Paint r13 = new android.graphics.Paint
            r13.<init>()
            r0.f8641r1 = r13
            r21 = r5
            int r5 = r24.getCacheColorHint()
            r13.setColor(r5)
            goto L_0x009a
        L_0x0093:
            r21 = r5
            goto L_0x009a
        L_0x0096:
            r21 = r5
            r20 = r13
        L_0x009a:
            android.graphics.Paint r5 = r0.f8641r1
            int r13 = r24.getRight()
            int r22 = r24.getLeft()
            int r13 = r13 - r22
            int r22 = r24.getScrollX()
            int r13 = r22 + r13
            r22 = r5
            boolean r5 = r0.f9564r0
            if (r5 != 0) goto L_0x016d
            int r5 = r24.getScrollX()
            if (r10 <= 0) goto L_0x00d5
            if (r5 >= 0) goto L_0x00d5
            if (r7 == 0) goto L_0x00c5
            r7 = 0
            r11.right = r7
            r11.left = r5
            b0(r1, r4, r11)
            goto L_0x00d5
        L_0x00c5:
            r7 = 0
            if (r9 == 0) goto L_0x00d5
            r11.right = r7
            int r4 = -r2
            r11.left = r4
            android.graphics.drawable.Drawable r4 = r0.f8630f1
            r4.setBounds(r11)
            r4.draw(r1)
        L_0x00d5:
            r4 = 0
            r5 = 0
        L_0x00d7:
            if (r4 >= r10) goto L_0x0150
            if (r15 != 0) goto L_0x00df
            int r7 = r6 + r4
            if (r7 < r12) goto L_0x00e6
        L_0x00df:
            if (r3 != 0) goto L_0x00ef
            int r7 = r6 + r4
            if (r7 >= r14) goto L_0x00e6
            goto L_0x00ef
        L_0x00e6:
            r23 = r13
            r13 = r20
            r20 = r9
        L_0x00ec:
            r9 = r22
            goto L_0x0145
        L_0x00ef:
            android.view.View r5 = r0.getChildAt(r4)
            int r5 = r5.getRight()
            if (r9 == 0) goto L_0x00e6
            if (r5 >= r13) goto L_0x00e6
            if (r8 == 0) goto L_0x0101
            int r7 = r10 + -1
            if (r4 == r7) goto L_0x00e6
        L_0x0101:
            if (r21 != 0) goto L_0x0130
            int r7 = r6 + r4
            r23 = r13
            r13 = r20
            boolean r17 = r13.isEnabled(r7)
            if (r17 == 0) goto L_0x0120
            r20 = r9
            int r9 = r10 + -1
            if (r4 == r9) goto L_0x011d
            int r7 = r7 + 1
            boolean r7 = r13.isEnabled(r7)
            if (r7 == 0) goto L_0x0122
        L_0x011d:
            r9 = r22
            goto L_0x0137
        L_0x0120:
            r20 = r9
        L_0x0122:
            if (r16 == 0) goto L_0x00ec
            r11.left = r5
            int r7 = r5 + r2
            r11.right = r7
            r9 = r22
            r1.drawRect(r11, r9)
            goto L_0x0145
        L_0x0130:
            r23 = r13
            r13 = r20
            r20 = r9
            goto L_0x011d
        L_0x0137:
            r11.left = r5
            int r7 = r5 + r2
            r11.right = r7
            android.graphics.drawable.Drawable r7 = r0.f8630f1
            r7.setBounds(r11)
            r7.draw(r1)
        L_0x0145:
            int r4 = r4 + 1
            r22 = r9
            r9 = r20
            r20 = r13
            r13 = r23
            goto L_0x00d7
        L_0x0150:
            int r2 = r24.getRight()
            int r3 = r24.getScrollX()
            int r3 = r3 + r2
            if (r8 == 0) goto L_0x0219
            int r6 = r6 + r10
            r2 = r19
            if (r6 != r2) goto L_0x0219
            if (r3 <= r5) goto L_0x0219
            r11.left = r5
            r11.right = r3
            r5 = r18
            a0(r1, r5, r11)
            goto L_0x0219
        L_0x016d:
            r23 = r13
            r13 = r20
            r20 = r9
            r9 = r22
            int r5 = r24.getScrollX()
            if (r10 <= 0) goto L_0x0190
            if (r7 == 0) goto L_0x0190
            r11.left = r5
            r19 = r7
            r7 = 0
            android.view.View r7 = r0.getChildAt(r7)
            int r7 = r7.getLeft()
            r11.right = r7
            b0(r1, r4, r11)
            goto L_0x0192
        L_0x0190:
            r19 = r7
        L_0x0192:
            r7 = r19
        L_0x0194:
            if (r7 >= r10) goto L_0x01f2
            if (r15 != 0) goto L_0x01a2
            int r4 = r6 + r7
            if (r4 < r12) goto L_0x019d
            goto L_0x01a2
        L_0x019d:
            r17 = r3
            r19 = r6
            goto L_0x01eb
        L_0x01a2:
            if (r3 != 0) goto L_0x01a8
            int r4 = r6 + r7
            if (r4 >= r14) goto L_0x019d
        L_0x01a8:
            android.view.View r4 = r0.getChildAt(r7)
            int r4 = r4.getLeft()
            if (r4 <= 0) goto L_0x019d
            r17 = r3
            if (r21 != 0) goto L_0x01db
            int r3 = r6 + r7
            boolean r19 = r13.isEnabled(r3)
            if (r19 == 0) goto L_0x01cd
            r19 = r6
            int r6 = r10 + -1
            if (r7 == r6) goto L_0x01dd
            int r3 = r3 + 1
            boolean r3 = r13.isEnabled(r3)
            if (r3 == 0) goto L_0x01cf
            goto L_0x01dd
        L_0x01cd:
            r19 = r6
        L_0x01cf:
            if (r16 == 0) goto L_0x01eb
            int r3 = r4 - r2
            r11.left = r3
            r11.right = r4
            r1.drawRect(r11, r9)
            goto L_0x01eb
        L_0x01db:
            r19 = r6
        L_0x01dd:
            int r3 = r4 - r2
            r11.left = r3
            r11.right = r4
            android.graphics.drawable.Drawable r3 = r0.f8630f1
            r3.setBounds(r11)
            r3.draw(r1)
        L_0x01eb:
            int r7 = r7 + 1
            r3 = r17
            r6 = r19
            goto L_0x0194
        L_0x01f2:
            if (r10 <= 0) goto L_0x0219
            if (r5 <= 0) goto L_0x0219
            if (r8 == 0) goto L_0x0207
            int r2 = r24.getRight()
            r11.left = r2
            int r2 = r2 + r5
            r11.right = r2
            r2 = r18
            a0(r1, r2, r11)
            goto L_0x0219
        L_0x0207:
            if (r20 == 0) goto L_0x0219
            r3 = r23
            r11.left = r3
            int r13 = r3 + r2
            r11.right = r13
            android.graphics.drawable.Drawable r2 = r0.f8630f1
            r2.setBounds(r11)
            r2.draw(r1)
        L_0x0219:
            super.dispatchDraw(r25)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: it.sephiroth.android.library.widget.HListView.dispatchDraw(android.graphics.Canvas):void");
    }

    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        boolean dispatchKeyEvent = super.dispatchKeyEvent(keyEvent);
        if (dispatchKeyEvent || getFocusedChild() == null || keyEvent.getAction() != 0) {
            return dispatchKeyEvent;
        }
        return W(keyEvent.getKeyCode(), 1, keyEvent);
    }

    public final boolean drawChild(Canvas canvas, View view, long j6) {
        boolean drawChild = super.drawChild(canvas, view, j6);
        if (this.f9554h0) {
            this.f9554h0 = false;
        }
        return drawChild;
    }

    public final int e(int i2, boolean z3) {
        int i5;
        ListAdapter listAdapter = this.f9529Q;
        if (listAdapter != null && !isInTouchMode()) {
            int count = listAdapter.getCount();
            if (!this.f8638o1) {
                if (z3) {
                    i5 = Math.max(0, i2);
                    while (i5 < count && !listAdapter.isEnabled(i5)) {
                        i5++;
                    }
                } else {
                    int min = Math.min(i2, count - 1);
                    while (i5 >= 0 && !listAdapter.isEnabled(i5)) {
                        min = i5 - 1;
                    }
                }
                if (i5 < 0 || i5 >= count) {
                    return -1;
                }
                return i5;
            } else if (i2 < 0 || i2 >= count) {
                return -1;
            } else {
                return i2;
            }
        }
        return -1;
    }

    public final View e0(int i2, int i5, int i6) {
        int horizontalFadingEdgeLength = getHorizontalFadingEdgeLength();
        int i7 = this.f9589v;
        if (i7 > 0) {
            i5 += horizontalFadingEdgeLength;
        }
        if (i7 != this.f9592y - 1) {
            i6 -= horizontalFadingEdgeLength;
        }
        View m02 = m0(i7, i2, this.f9551e0.top, true, true);
        if (m02.getRight() > i6) {
            m02.offsetLeftAndRight(-Math.min(m02.getLeft() - i5, m02.getRight() - i6));
        } else if (m02.getLeft() < i5) {
            m02.offsetLeftAndRight(Math.min(i5 - m02.getLeft(), i6 - m02.getRight()));
        }
        c0(m02, i7);
        if (!this.f9564r0) {
            Y(getChildCount());
        } else {
            X(getChildCount());
        }
        return m02;
    }

    public final View f0(int i2, int i5) {
        View view = null;
        int i6 = i5;
        while (true) {
            boolean z3 = true;
            if (i6 <= 0 || i2 < 0) {
                this.f9578a = i2 + 1;
                getChildCount();
            } else {
                if (i2 != this.f9589v) {
                    z3 = false;
                }
                View m02 = m0(i2, i6, this.f9551e0.top, false, z3);
                i6 = m02.getLeft() - this.g1;
                if (z3) {
                    view = m02;
                }
                i2--;
            }
        }
        this.f9578a = i2 + 1;
        getChildCount();
        return view;
    }

    public final View g0(int i2, int i5) {
        boolean z3;
        int right = getRight() - getLeft();
        View view = null;
        int i6 = i5;
        while (i6 < right && i2 < this.f9592y) {
            if (i2 == this.f9589v) {
                z3 = true;
            } else {
                z3 = false;
            }
            View m02 = m0(i2, i6, this.f9551e0.top, true, z3);
            i6 = this.g1 + m02.getRight();
            if (z3) {
                view = m02;
            }
            i2++;
        }
        getChildCount();
        return view;
    }

    @Deprecated
    public long[] getCheckItemIds() {
        k kVar;
        ListAdapter listAdapter = this.f9529Q;
        if (listAdapter != null && listAdapter.hasStableIds()) {
            return getCheckedItemIds();
        }
        if (this.f9515I == 0 || (kVar = this.f9522M) == null || this.f9529Q == null) {
            return new long[0];
        }
        int h = kVar.h();
        long[] jArr = new long[h];
        ListAdapter listAdapter2 = this.f9529Q;
        int i2 = 0;
        for (int i5 = 0; i5 < h; i5++) {
            if (((Boolean) kVar.i(i5)).booleanValue()) {
                jArr[i2] = listAdapter2.getItemId(kVar.f(i5));
                i2++;
            }
        }
        if (i2 == h) {
            return jArr;
        }
        long[] jArr2 = new long[i2];
        System.arraycopy(jArr, 0, jArr2, 0, i2);
        return jArr2;
    }

    public Drawable getDivider() {
        return this.f8630f1;
    }

    public int getDividerWidth() {
        return this.g1;
    }

    public int getFooterViewsCount() {
        return this.f8629e1.size();
    }

    public int getHeaderViewsCount() {
        return this.f8628d1.size();
    }

    public boolean getItemsCanFocus() {
        return this.f8639p1;
    }

    public int getMaxScrollAmount() {
        return (int) (((float) (getRight() - getLeft())) * 0.33f);
    }

    public Drawable getOverscrollFooter() {
        return this.f8633j1;
    }

    public Drawable getOverscrollHeader() {
        return this.f8632i1;
    }

    public final View h0(int i2, int i5) {
        boolean z3;
        View view;
        View view2;
        if (i2 == this.f9589v) {
            z3 = true;
        } else {
            z3 = false;
        }
        View m02 = m0(i2, i5, this.f9551e0.top, true, z3);
        this.f9578a = i2;
        int i6 = this.g1;
        if (!this.f9564r0) {
            view2 = f0(i2 - 1, m02.getLeft() - i6);
            S();
            view = g0(i2 + 1, m02.getRight() + i6);
            int childCount = getChildCount();
            if (childCount > 0) {
                Y(childCount);
            }
        } else {
            View g02 = g0(i2 + 1, m02.getRight() + i6);
            S();
            View f02 = f0(i2 - 1, m02.getLeft() - i6);
            int childCount2 = getChildCount();
            if (childCount2 > 0) {
                X(childCount2);
            }
            View view3 = g02;
            view2 = f02;
            view = view3;
        }
        if (z3) {
            return m02;
        }
        if (view2 != null) {
            return view2;
        }
        return view;
    }

    public final boolean i0(int i2) {
        int i5;
        boolean z3 = true;
        if (i2 == 33) {
            if (this.f9589v != 0) {
                int e6 = e(0, true);
                if (e6 >= 0) {
                    this.f9526O = 1;
                    setSelectionInt(e6);
                    onScrollChanged(0, 0, 0, 0);
                }
                if (z3 && !awakenScrollBars()) {
                    awakenScrollBars();
                    invalidate();
                }
                return z3;
            }
        } else if (i2 == 130 && this.f9589v < (i5 = this.f9592y - 1)) {
            int e7 = e(i5, true);
            if (e7 >= 0) {
                this.f9526O = 3;
                setSelectionInt(e7);
                onScrollChanged(0, 0, 0, 0);
            }
            awakenScrollBars();
            invalidate();
            return z3;
        }
        z3 = false;
        awakenScrollBars();
        invalidate();
        return z3;
    }

    public final boolean isOpaque() {
        boolean z3;
        int i2;
        int i5;
        if ((!this.f9554h0 || !this.f8634k1 || !this.f8635l1) && !super.isOpaque()) {
            z3 = false;
        } else {
            z3 = true;
        }
        if (z3) {
            Rect rect = this.f9551e0;
            if (rect != null) {
                i2 = rect.left;
            } else {
                i2 = getPaddingLeft();
            }
            View childAt = getChildAt(0);
            if (childAt != null && childAt.getLeft() <= i2) {
                int width = getWidth();
                if (rect != null) {
                    i5 = rect.right;
                } else {
                    i5 = getPaddingRight();
                }
                int i6 = width - i5;
                View childAt2 = getChildAt(getChildCount() - 1);
                if (childAt2 == null || childAt2.getRight() < i6) {
                    return false;
                }
            }
            return false;
        }
        return z3;
    }

    public final boolean j0(int i2) {
        View selectedView;
        if (i2 == 33 || i2 == 130) {
            int childCount = getChildCount();
            if (!this.f8639p1 || childCount <= 0 || this.f9589v == -1 || (selectedView = getSelectedView()) == null || !selectedView.hasFocus() || !(selectedView instanceof ViewGroup)) {
                return false;
            }
            View findFocus = selectedView.findFocus();
            View findNextFocus = FocusFinder.getInstance().findNextFocus((ViewGroup) selectedView, findFocus, i2);
            if (findNextFocus != null) {
                Rect rect = this.f8640q1;
                findFocus.getFocusedRect(rect);
                offsetDescendantRectToMyCoords(findFocus, rect);
                offsetRectIntoDescendantCoords(findNextFocus, rect);
                if (findNextFocus.requestFocus(i2, rect)) {
                    return true;
                }
            }
            View findNextFocus2 = FocusFinder.getInstance().findNextFocus((ViewGroup) getRootView(), findFocus, i2);
            if (findNextFocus2 != null) {
                return k0(findNextFocus2, this);
            }
            return false;
        }
        throw new IllegalArgumentException("direction must be one of {View.FOCUS_UP, View.FOCUS_DOWN}");
    }

    public final int l0(int i2) {
        int i5;
        int i6 = this.f9578a;
        if (i2 == 130) {
            int i7 = this.f9589v;
            if (i7 != -1) {
                i5 = i7 + 1;
            } else {
                i5 = i6;
            }
            if (i5 >= this.f9529Q.getCount()) {
                return -1;
            }
            if (i5 < i6) {
                i5 = i6;
            }
            int lastVisiblePosition = getLastVisiblePosition();
            ListAdapter adapter = getAdapter();
            while (i5 <= lastVisiblePosition) {
                if (adapter.isEnabled(i5) && getChildAt(i5 - i6).getVisibility() == 0) {
                    return i5;
                }
                i5++;
            }
        } else {
            int childCount = (getChildCount() + i6) - 1;
            int i8 = this.f9589v;
            if (i8 == -1) {
                i8 = getChildCount() + i6;
            }
            int i9 = i8 - 1;
            if (i9 >= 0 && i9 < this.f9529Q.getCount()) {
                if (i9 <= childCount) {
                    childCount = i9;
                }
                ListAdapter adapter2 = getAdapter();
                while (childCount >= i6) {
                    if (adapter2.isEnabled(childCount) && getChildAt(childCount - i6).getVisibility() == 0) {
                        return childCount;
                    }
                    childCount--;
                }
            }
        }
        return -1;
    }

    public final View m0(int i2, int i5, int i6, boolean z3, boolean z4) {
        View view;
        if (!this.f9586s) {
            C0770g gVar = this.f9541W;
            int i7 = i2 - gVar.f9493c;
            View[] viewArr = (View[]) gVar.f9494e;
            if (i7 < 0 || i7 >= viewArr.length) {
                view = null;
            } else {
                View view2 = viewArr[i7];
                viewArr[i7] = null;
                view = view2;
            }
            if (view != null) {
                t0(view, i2, i5, z3, i6, z4, true);
                return view;
            }
        }
        boolean[] zArr = this.L0;
        View B6 = B(zArr, i2);
        t0(B6, i2, i5, z3, i6, z4, zArr[0]);
        return B6;
    }

    public final void n0(View view, int i2, int i5) {
        int i6;
        int width = view.getWidth();
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new ViewGroup.LayoutParams(-2, -1);
        }
        int i7 = this.f9552f0;
        Rect rect = this.f9551e0;
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i7, rect.top + rect.bottom, layoutParams.height);
        int i8 = layoutParams.width;
        if (i8 > 0) {
            i6 = View.MeasureSpec.makeMeasureSpec(i8, 1073741824);
        } else {
            i6 = View.MeasureSpec.makeMeasureSpec(0, 0);
        }
        view.measure(i6, childMeasureSpec);
        if (view.getMeasuredWidth() != width) {
            int measuredWidth = view.getMeasuredWidth();
            int measuredHeight = view.getMeasuredHeight();
            int i9 = rect.top;
            int left = view.getLeft();
            view.layout(left, i9, measuredWidth + left, measuredHeight + i9);
            int measuredWidth2 = view.getMeasuredWidth() - width;
            while (true) {
                i2++;
                if (i2 < i5) {
                    getChildAt(i2).offsetLeftAndRight(measuredWidth2);
                } else {
                    return;
                }
            }
        }
    }

    public final void o0(View view, int i2, int i5) {
        int i6;
        C0767d dVar = (C0767d) view.getLayoutParams();
        if (dVar == null) {
            dVar = (C0767d) generateDefaultLayoutParams();
            view.setLayoutParams(dVar);
        }
        dVar.f9487a = this.f9529Q.getItemViewType(i2);
        dVar.f9489c = true;
        Rect rect = this.f9551e0;
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i5, rect.top + rect.bottom, dVar.height);
        int i7 = dVar.width;
        if (i7 > 0) {
            i6 = View.MeasureSpec.makeMeasureSpec(i7, 1073741824);
        } else {
            i6 = View.MeasureSpec.makeMeasureSpec(0, 0);
        }
        view.measure(i6, childMeasureSpec);
    }

    /* JADX WARNING: type inference failed for: r3v1, types: [java.lang.Object, k5.q] */
    public final void onFinishInflate() {
        C0765b bVar;
        super.onFinishInflate();
        int childCount = getChildCount();
        if (childCount > 0) {
            int i2 = 0;
            while (i2 < childCount) {
                View childAt = getChildAt(i2);
                ListAdapter listAdapter = this.f9529Q;
                if (listAdapter == null || (listAdapter instanceof s)) {
                    ? obj = new Object();
                    obj.f9619a = childAt;
                    this.f8628d1.add(obj);
                    if (!(this.f9529Q == null || (bVar = this.f9527P) == null)) {
                        bVar.a();
                    }
                    i2++;
                } else {
                    throw new IllegalStateException("Cannot add header view to list -- setAdapter has already been called.");
                }
            }
            removeAllViews();
            throw null;
        }
    }

    public final void onFocusChanged(boolean z3, int i2, Rect rect) {
        int i5;
        int i6;
        int i7;
        int i8;
        int i9 = i2;
        Rect rect2 = rect;
        super.onFocusChanged(z3, i2, rect);
        ListAdapter listAdapter = this.f9529Q;
        int i10 = -1;
        int i11 = 0;
        if (!(listAdapter == null || !z3 || rect2 == null)) {
            rect2.offset(getScrollX(), getScrollY());
            if (listAdapter.getCount() < getChildCount() + this.f9578a) {
                this.f9526O = 0;
                A();
            }
            int childCount = getChildCount();
            int i12 = this.f9578a;
            int i13 = Integer.MAX_VALUE;
            int i14 = 0;
            while (i11 < childCount) {
                if (listAdapter.isEnabled(i12 + i11)) {
                    View childAt = getChildAt(i11);
                    Rect rect3 = this.f8640q1;
                    childAt.getDrawingRect(rect3);
                    offsetDescendantRectToMyCoords(childAt, rect3);
                    if (i9 == 1 || i9 == 2) {
                        i6 = (rect.width() / 2) + rect2.right;
                        i7 = (rect.height() / 2) + rect2.top;
                        i5 = (rect3.width() / 2) + rect3.left;
                        i8 = (rect3.height() / 2) + rect3.top;
                    } else if (i9 == 17) {
                        i6 = rect2.left;
                        i7 = (rect.height() / 2) + rect2.top;
                        int i15 = rect3.right;
                        i8 = (rect3.height() / 2) + rect3.top;
                        i5 = i15;
                    } else if (i9 == 33) {
                        i6 = (rect.width() / 2) + rect2.left;
                        i7 = rect2.top;
                        i5 = (rect3.width() / 2) + rect3.left;
                        i8 = rect3.bottom;
                    } else if (i9 == 66) {
                        i6 = rect2.right;
                        i7 = rect2.top + (rect.height() / 2);
                        int i16 = rect3.left;
                        i8 = (rect3.height() / 2) + rect3.top;
                        i5 = i16;
                    } else if (i9 == 130) {
                        i6 = (rect.width() / 2) + rect2.left;
                        i7 = rect2.bottom;
                        i5 = (rect3.width() / 2) + rect3.left;
                        i8 = rect3.top;
                    } else {
                        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT, FOCUS_FORWARD, FOCUS_BACKWARD}.");
                    }
                    int i17 = i5 - i6;
                    int i18 = i8 - i7;
                    int i19 = (i17 * i17) + (i18 * i18);
                    if (i19 < i13) {
                        i13 = i19;
                        i14 = childAt.getLeft();
                        i10 = i11;
                    }
                }
                i11++;
                i9 = i2;
            }
            i11 = i14;
        }
        if (i10 >= 0) {
            s0(i10 + this.f9578a, i11);
        } else {
            requestLayout();
        }
    }

    public final void onGlobalLayout() {
    }

    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(HListView.class.getName());
    }

    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(HListView.class.getName());
    }

    public final boolean onKeyDown(int i2, KeyEvent keyEvent) {
        return W(i2, 1, keyEvent);
    }

    public final boolean onKeyMultiple(int i2, int i5, KeyEvent keyEvent) {
        return W(i2, i5, keyEvent);
    }

    public final boolean onKeyUp(int i2, KeyEvent keyEvent) {
        return W(i2, 1, keyEvent);
    }

    public final void onMeasure(int i2, int i5) {
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int[] iArr;
        int i13 = i5;
        super.onMeasure(i2, i5);
        int mode = View.MeasureSpec.getMode(i2);
        int mode2 = View.MeasureSpec.getMode(i5);
        int size = View.MeasureSpec.getSize(i2);
        int size2 = View.MeasureSpec.getSize(i5);
        ListAdapter listAdapter = this.f9529Q;
        if (listAdapter == null) {
            i6 = 0;
        } else {
            i6 = listAdapter.getCount();
        }
        this.f9592y = i6;
        boolean[] zArr = this.L0;
        C0770g gVar = this.f9541W;
        if (i6 <= 0 || !(mode == 0 || mode2 == 0)) {
            i9 = 0;
            i8 = 0;
            i7 = 0;
        } else {
            View B6 = B(zArr, 0);
            o0(B6, 0, i13);
            i9 = B6.getMeasuredWidth();
            i8 = B6.getMeasuredHeight();
            i7 = View.combineMeasuredStates(0, B6.getMeasuredState());
            int i14 = ((C0767d) B6.getLayoutParams()).f9487a;
            gVar.getClass();
            if (C0770g.m(i14)) {
                gVar.a(B6, -1);
            }
        }
        Rect rect = this.f9551e0;
        if (mode2 == 0) {
            i10 = getHorizontalScrollbarHeight() + rect.top + rect.bottom + i8;
        } else if (mode2 != Integer.MIN_VALUE || this.f9592y <= 0 || (i11 = this.f8631h1) <= -1) {
            i10 = size2 | (-16777216 & i7);
        } else {
            ListAdapter listAdapter2 = this.f9529Q;
            if (listAdapter2 == null) {
                iArr = new int[]{rect.left + rect.right, rect.top + rect.bottom};
            } else {
                int i15 = rect.left + rect.right;
                int i16 = rect.top + rect.bottom;
                int i17 = this.g1;
                if (i17 <= 0 || this.f8630f1 == null) {
                    i17 = 0;
                }
                if (i11 == -1) {
                    i12 = listAdapter2.getCount() - 1;
                } else {
                    i12 = i11;
                }
                int i18 = 0;
                int i19 = 0;
                while (i11 <= i12) {
                    View B7 = B(zArr, i11);
                    o0(B7, i11, i13);
                    int i20 = i12;
                    int i21 = ((C0767d) B7.getLayoutParams()).f9487a;
                    gVar.getClass();
                    if (C0770g.m(i21)) {
                        gVar.a(B7, -1);
                    }
                    i18 = Math.max(i18, B7.getMeasuredWidth() + i17);
                    i19 = Math.max(i19, B7.getMeasuredHeight());
                    i11++;
                    i12 = i20;
                }
                iArr = new int[]{Math.min(i15 + i18, size), Math.min(i16 + i19, size2)};
            }
            i10 = iArr[1];
        }
        if (mode == 0) {
            size = (getHorizontalFadingEdgeLength() * 2) + rect.left + rect.right + i9;
        }
        if (mode == Integer.MIN_VALUE) {
            ListAdapter listAdapter3 = this.f9529Q;
            if (listAdapter3 != null) {
                int i22 = rect.left + rect.right;
                int i23 = this.g1;
                if (i23 <= 0 || this.f8630f1 == null) {
                    i23 = 0;
                }
                int count = listAdapter3.getCount() - 1;
                int i24 = 0;
                while (true) {
                    if (i24 > count) {
                        size = i22;
                        break;
                    }
                    View B8 = B(zArr, i24);
                    o0(B8, i24, i13);
                    if (i24 > 0) {
                        i22 += i23;
                    }
                    int i25 = ((C0767d) B8.getLayoutParams()).f9487a;
                    gVar.getClass();
                    if (C0770g.m(i25)) {
                        gVar.a(B8, -1);
                    }
                    i22 += B8.getMeasuredWidth();
                    if (i22 >= size) {
                        break;
                    }
                    i24++;
                }
            } else {
                size = rect.left + rect.right;
            }
        }
        setMeasuredDimension(size, i10);
        this.f9552f0 = i13;
    }

    public final void onSizeChanged(int i2, int i5, int i6, int i7) {
        View focusedChild;
        if (getChildCount() > 0 && (focusedChild = getFocusedChild()) != null) {
            int indexOfChild = indexOfChild(focusedChild) + this.f9578a;
            int left = focusedChild.getLeft() - Math.max(0, focusedChild.getRight() - (i2 - getPaddingLeft()));
            if (this.f8643t1 == null) {
                this.f8643t1 = new r(this);
            }
            r rVar = this.f8643t1;
            rVar.f9621b = indexOfChild;
            rVar.f9622c = left;
            post(rVar);
        }
        super.onSizeChanged(i2, i5, i6, i7);
    }

    public final View p0(View view, View view2, int i2, int i5, int i6) {
        int i7;
        int i8;
        View view3;
        int i9 = i5;
        int horizontalFadingEdgeLength = getHorizontalFadingEdgeLength();
        int i10 = this.f9589v;
        if (i10 > 0) {
            i7 = i9 + horizontalFadingEdgeLength;
        } else {
            i7 = i9;
        }
        if (i10 != this.f9592y - 1) {
            i8 = i9 - horizontalFadingEdgeLength;
        } else {
            i8 = i9;
        }
        Rect rect = this.f9551e0;
        if (i2 > 0) {
            View m02 = m0(i10 - 1, view.getLeft(), rect.top, true, false);
            int i11 = this.g1;
            view3 = m0(i10, m02.getRight() + i11, rect.top, true, true);
            if (view3.getRight() > i8) {
                int i12 = -Math.min(Math.min(view3.getLeft() - i7, view3.getRight() - i8), (i6 - i9) / 2);
                m02.offsetLeftAndRight(i12);
                view3.offsetLeftAndRight(i12);
            }
            if (!this.f9564r0) {
                f0(this.f9589v - 2, view3.getLeft() - i11);
                S();
                g0(this.f9589v + 1, view3.getRight() + i11);
            } else {
                g0(this.f9589v + 1, view3.getRight() + i11);
                S();
                f0(this.f9589v - 2, view3.getLeft() - i11);
            }
        } else if (i2 < 0) {
            if (view2 != null) {
                view3 = m0(i10, view2.getLeft(), rect.top, true, true);
            } else {
                view3 = m0(i10, view.getLeft(), rect.top, false, true);
            }
            if (view3.getLeft() < i7) {
                view3.offsetLeftAndRight(Math.min(Math.min(i7 - view3.getLeft(), i8 - view3.getRight()), (i6 - i9) / 2));
            }
            c0(view3, i10);
        } else {
            int left = view.getLeft();
            view3 = m0(i10, left, rect.top, true, true);
            if (left < i9 && view3.getRight() < i9 + 20) {
                view3.offsetLeftAndRight(i9 - view3.getLeft());
            }
            c0(view3, i10);
        }
        return view3;
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0033  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0069 A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean q0(int r6) {
        /*
            r5 = this;
            r0 = 33
            r1 = 1
            r2 = 0
            if (r6 != r0) goto L_0x0014
            int r6 = r5.f9589v
            int r0 = r5.getChildCount()
            int r6 = r6 - r0
            int r6 = r6 - r1
            int r6 = java.lang.Math.max(r2, r6)
        L_0x0012:
            r0 = r2
            goto L_0x002b
        L_0x0014:
            r0 = 130(0x82, float:1.82E-43)
            if (r6 != r0) goto L_0x0029
            int r6 = r5.f9592y
            int r6 = r6 - r1
            int r0 = r5.f9589v
            int r3 = r5.getChildCount()
            int r3 = r3 + r0
            int r3 = r3 - r1
            int r6 = java.lang.Math.min(r6, r3)
            r0 = r1
            goto L_0x002b
        L_0x0029:
            r6 = -1
            goto L_0x0012
        L_0x002b:
            if (r6 < 0) goto L_0x0069
            int r6 = r5.e(r6, r0)
            if (r6 < 0) goto L_0x0069
            r3 = 4
            r5.f9526O = r3
            int r3 = r5.getPaddingLeft()
            int r4 = r5.getHorizontalFadingEdgeLength()
            int r4 = r4 + r3
            r5.f9579b = r4
            if (r0 == 0) goto L_0x004f
            int r3 = r5.f9592y
            int r4 = r5.getChildCount()
            int r3 = r3 - r4
            if (r6 <= r3) goto L_0x004f
            r3 = 3
            r5.f9526O = r3
        L_0x004f:
            if (r0 != 0) goto L_0x0059
            int r0 = r5.getChildCount()
            if (r6 >= r0) goto L_0x0059
            r5.f9526O = r1
        L_0x0059:
            r5.setSelectionInt(r6)
            r5.onScrollChanged(r2, r2, r2, r2)
            boolean r6 = r5.awakenScrollBars()
            if (r6 != 0) goto L_0x0068
            r5.invalidate()
        L_0x0068:
            return r1
        L_0x0069:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: it.sephiroth.android.library.widget.HListView.q0(int):boolean");
    }

    public final void r0(int i2) {
        int i5;
        C(i2);
        int width = getWidth();
        Rect rect = this.f9551e0;
        int i6 = width - rect.right;
        int i7 = rect.left;
        boolean[] zArr = this.L0;
        C0770g gVar = this.f9541W;
        if (i2 < 0) {
            int childCount = getChildCount();
            View childAt = getChildAt(childCount - 1);
            int i8 = childCount;
            while (childAt.getRight() < i6) {
                int i9 = this.f9578a + i8;
                if (i9 - 1 >= this.f9592y - 1) {
                    break;
                }
                View B6 = B(zArr, i9);
                t0(B6, i9, childAt.getRight() + this.g1, true, rect.top, false, zArr[0]);
                i8++;
                childAt = B6;
            }
            if (childAt.getBottom() < i6) {
                C(i6 - childAt.getRight());
            }
            View childAt2 = getChildAt(0);
            while (childAt2.getRight() < i7) {
                int i10 = ((C0767d) childAt2.getLayoutParams()).f9487a;
                gVar.getClass();
                if (C0770g.m(i10)) {
                    detachViewFromParent(childAt2);
                    gVar.a(childAt2, this.f9578a);
                } else {
                    removeViewInLayout(childAt2);
                }
                childAt2 = getChildAt(0);
                this.f9578a++;
            }
            return;
        }
        View childAt3 = getChildAt(0);
        while (childAt3.getLeft() > i7 && (i5 = this.f9578a) > 0) {
            int i11 = i5 - 1;
            View B7 = B(zArr, i11);
            t0(B7, i11, childAt3.getLeft() - this.g1, false, rect.top, false, zArr[0]);
            this.f9578a--;
            childAt3 = B7;
        }
        if (childAt3.getLeft() > i7) {
            C(i7 - childAt3.getLeft());
        }
        int childCount2 = getChildCount() - 1;
        View childAt4 = getChildAt(childCount2);
        while (childAt4.getLeft() > i6) {
            int i12 = ((C0767d) childAt4.getLayoutParams()).f9487a;
            gVar.getClass();
            if (C0770g.m(i12)) {
                detachViewFromParent(childAt4);
                gVar.a(childAt4, this.f9578a + childCount2);
            } else {
                removeViewInLayout(childAt4);
            }
            childCount2--;
            childAt4 = getChildAt(childCount2);
        }
    }

    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z3) {
        int i2;
        int i5;
        int i6;
        int i7 = rect.left;
        rect.offset(view.getLeft(), view.getTop());
        rect.offset(-view.getScrollX(), -view.getScrollY());
        int width = getWidth();
        int scrollX = getScrollX();
        int i8 = scrollX + width;
        int horizontalFadingEdgeLength = getHorizontalFadingEdgeLength();
        int scrollX2 = getScrollX();
        Rect rect2 = this.f9551e0;
        int i9 = scrollX2 + rect2.left;
        boolean z4 = false;
        if ((this.f9578a > 0 || getChildAt(0).getLeft() > i9) && (this.f9589v > 0 || i7 > horizontalFadingEdgeLength)) {
            scrollX += horizontalFadingEdgeLength;
        }
        int right = getChildAt(getChildCount() - 1).getRight();
        int childCount = getChildCount();
        int right2 = getChildAt(childCount - 1).getRight();
        int i10 = (this.f9578a + childCount) - 1;
        int width2 = (getWidth() + getScrollX()) - rect2.right;
        int i11 = this.f9592y;
        if ((i10 < i11 - 1 || right2 < width2) && (this.f9589v < i11 - 1 || rect.right < right - horizontalFadingEdgeLength)) {
            i8 -= horizontalFadingEdgeLength;
        }
        int i12 = rect.right;
        if (i12 > i8 && rect.left > scrollX) {
            if (rect.width() > width) {
                i6 = rect.left - scrollX;
            } else {
                i6 = rect.right - i8;
            }
            i2 = Math.min(i6, right - i8);
        } else if (rect.left >= scrollX || i12 >= i8) {
            i2 = 0;
        } else {
            if (rect.width() > width) {
                i5 = 0 - (i8 - rect.right);
            } else {
                i5 = 0 - (scrollX - rect.left);
            }
            i2 = Math.max(i5, getChildAt(0).getLeft() - scrollX);
        }
        if (i2 != 0) {
            z4 = true;
        }
        if (z4) {
            r0(-i2);
            H(view, -1);
            this.f9563q0 = view.getTop();
            invalidate();
        }
        return z4;
    }

    public final void s0(int i2, int i5) {
        if (this.f9529Q != null) {
            if (!isInTouchMode()) {
                i2 = e(i2, true);
                if (i2 >= 0) {
                    setNextSelectedPositionInt(i2);
                }
            } else {
                this.f9567v0 = i2;
            }
            if (i2 >= 0) {
                this.f9526O = 4;
                this.f9579b = this.f9551e0.left + i5;
                if (this.f9582f) {
                    this.f9580c = i2;
                    this.d = this.f9529Q.getItemId(i2);
                }
                requestLayout();
            }
        }
    }

    public void setCacheColorHint(int i2) {
        boolean z3;
        if ((i2 >>> 24) == 255) {
            z3 = true;
        } else {
            z3 = false;
        }
        this.f8634k1 = z3;
        if (z3) {
            if (this.f8641r1 == null) {
                this.f8641r1 = new Paint();
            }
            this.f8641r1.setColor(i2);
        }
        super.setCacheColorHint(i2);
    }

    public void setDivider(Drawable drawable) {
        boolean z3 = false;
        if (drawable != null) {
            this.g1 = drawable.getIntrinsicWidth();
        } else {
            this.g1 = 0;
        }
        this.f8630f1 = drawable;
        if (drawable == null || drawable.getOpacity() == -1) {
            z3 = true;
        }
        this.f8635l1 = z3;
        requestLayout();
        invalidate();
    }

    public void setDividerWidth(int i2) {
        this.g1 = i2;
        requestLayout();
        invalidate();
    }

    public void setFooterDividersEnabled(boolean z3) {
        this.f8637n1 = z3;
        invalidate();
    }

    public void setHeaderDividersEnabled(boolean z3) {
        this.f8636m1 = z3;
        invalidate();
    }

    public void setItemsCanFocus(boolean z3) {
        this.f8639p1 = z3;
        if (!z3) {
            setDescendantFocusability(393216);
        }
    }

    public void setOverscrollFooter(Drawable drawable) {
        this.f8633j1 = drawable;
        invalidate();
    }

    public void setOverscrollHeader(Drawable drawable) {
        this.f8632i1 = drawable;
        if (getScrollX() < 0) {
            invalidate();
        }
    }

    public void setSelection(int i2) {
        s0(i2, 0);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x000e, code lost:
        if (r4 == (r0 + 1)) goto L_0x0012;
     */
    /* JADX WARNING: Removed duplicated region for block: B:11:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0017  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void setSelectionInt(int r4) {
        /*
            r3 = this;
            r3.setNextSelectedPositionInt(r4)
            int r0 = r3.f9589v
            if (r0 < 0) goto L_0x0011
            int r1 = r0 + -1
            r2 = 1
            if (r4 != r1) goto L_0x000d
            goto L_0x0012
        L_0x000d:
            int r0 = r0 + r2
            if (r4 != r0) goto L_0x0011
            goto L_0x0012
        L_0x0011:
            r2 = 0
        L_0x0012:
            r3.A()
            if (r2 == 0) goto L_0x001a
            r3.awakenScrollBars()
        L_0x001a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: it.sephiroth.android.library.widget.HListView.setSelectionInt(int):void");
    }

    public final void t0(View view, int i2, int i5, boolean z3, int i6, boolean z4, boolean z5) {
        boolean z6;
        boolean z7;
        boolean z8;
        boolean z9;
        boolean z10;
        int i7;
        int i8;
        k kVar;
        int i9;
        View view2 = view;
        int i10 = i2;
        int i11 = i6;
        if (!z4 || !((hasFocus() && !isInTouchMode()) || (i9 = this.f9558l0) == 1 || i9 == 2)) {
            z6 = false;
        } else {
            z6 = true;
        }
        if (z6 != view.isSelected()) {
            z7 = true;
        } else {
            z7 = false;
        }
        int i12 = this.f9558l0;
        if (i12 <= 0 || i12 >= 3 || this.f9555i0 != i10) {
            z8 = false;
        } else {
            z8 = true;
        }
        if (z8 != view.isPressed()) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (!z5 || z7 || view.isLayoutRequested()) {
            z10 = true;
        } else {
            z10 = false;
        }
        C0767d dVar = (C0767d) view.getLayoutParams();
        if (dVar == null) {
            dVar = (C0767d) generateDefaultLayoutParams();
        }
        int itemViewType = this.f9529Q.getItemViewType(i10);
        dVar.f9487a = itemViewType;
        int i13 = -1;
        if ((!z5 || dVar.f9489c) && (!dVar.f9488b || itemViewType != -2)) {
            dVar.f9489c = false;
            if (itemViewType == -2) {
                dVar.f9488b = true;
            }
            if (!z3) {
                i13 = 0;
            }
            addViewInLayout(view2, i13, dVar, true);
        } else {
            if (!z3) {
                i13 = 0;
            }
            attachViewToParent(view2, i13, dVar);
        }
        if (z7) {
            view2.setSelected(z6);
        }
        if (z9) {
            view2.setPressed(z8);
        }
        if (!(this.f9515I == 0 || (kVar = this.f9522M) == null)) {
            if (view2 instanceof Checkable) {
                ((Checkable) view2).setChecked(((Boolean) kVar.e(i10, Boolean.FALSE)).booleanValue());
            } else {
                view2.setActivated(((Boolean) kVar.e(i10, Boolean.FALSE)).booleanValue());
            }
        }
        if (z10) {
            int i14 = this.f9552f0;
            Rect rect = this.f9551e0;
            int childMeasureSpec = ViewGroup.getChildMeasureSpec(i14, rect.top + rect.bottom, dVar.height);
            int i15 = dVar.width;
            if (i15 > 0) {
                i8 = View.MeasureSpec.makeMeasureSpec(i15, 1073741824);
            } else {
                i8 = View.MeasureSpec.makeMeasureSpec(0, 0);
            }
            view2.measure(i8, childMeasureSpec);
        } else {
            cleanupLayoutState(view);
        }
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        if (z3) {
            i7 = i5;
        } else {
            i7 = i5 - measuredWidth;
        }
        if (z10) {
            view2.layout(i7, i11, measuredWidth + i7, measuredHeight + i11);
        } else {
            view2.offsetLeftAndRight(i7 - view.getLeft());
            view2.offsetTopAndBottom(i11 - view.getTop());
        }
        if (this.f9553g0 && !view.isDrawingCacheEnabled()) {
            view2.setDrawingCacheEnabled(true);
        }
        if (z5 && ((C0767d) view.getLayoutParams()).d != i10) {
            view.jumpDrawablesToCurrentState();
        }
    }

    public final int w(int i2) {
        int childCount = getChildCount();
        if (childCount <= 0) {
            return -1;
        }
        if (!this.f9564r0) {
            for (int i5 = 0; i5 < childCount; i5++) {
                if (i2 <= getChildAt(i5).getRight()) {
                    return this.f9578a + i5;
                }
            }
            return -1;
        }
        for (int i6 = childCount - 1; i6 >= 0; i6--) {
            if (i2 >= getChildAt(i6).getLeft()) {
                return this.f9578a + i6;
            }
        }
        return -1;
    }

    public ListAdapter getAdapter() {
        return this.f9529Q;
    }

    public void setAdapter(ListAdapter listAdapter) {
        int i2;
        C0765b bVar;
        ListAdapter listAdapter2 = this.f9529Q;
        if (!(listAdapter2 == null || (bVar = this.f9527P) == null)) {
            listAdapter2.unregisterDataSetObserver(bVar);
        }
        I();
        C0770g gVar = this.f9541W;
        gVar.c();
        ArrayList arrayList = this.f8628d1;
        int size = arrayList.size();
        ArrayList arrayList2 = this.f8629e1;
        if (size > 0 || arrayList2.size() > 0) {
            this.f9529Q = new s(arrayList, arrayList2, listAdapter);
        } else {
            this.f9529Q = listAdapter;
        }
        this.f9573B = -1;
        this.f9574C = Long.MIN_VALUE;
        super.setAdapter(listAdapter);
        ListAdapter listAdapter3 = this.f9529Q;
        if (listAdapter3 != null) {
            this.f8638o1 = listAdapter3.areAllItemsEnabled();
            this.f9593z = this.f9592y;
            this.f9592y = this.f9529Q.getCount();
            a();
            C0765b bVar2 = new C0765b(this);
            this.f9527P = bVar2;
            this.f9529Q.registerDataSetObserver(bVar2);
            int viewTypeCount = this.f9529Q.getViewTypeCount();
            if (viewTypeCount >= 1) {
                ArrayList[] arrayListArr = new ArrayList[viewTypeCount];
                for (int i5 = 0; i5 < viewTypeCount; i5++) {
                    arrayListArr[i5] = new ArrayList();
                }
                gVar.d = viewTypeCount;
                gVar.f9491a = arrayListArr[0];
                gVar.f9495f = arrayListArr;
                if (this.f9564r0) {
                    i2 = e(this.f9592y - 1, false);
                } else {
                    i2 = e(0, true);
                }
                setSelectedPositionInt(i2);
                setNextSelectedPositionInt(i2);
                if (this.f9592y == 0) {
                    b();
                }
            } else {
                throw new IllegalArgumentException("Can't have a viewTypeCount < 1");
            }
        } else {
            this.f8638o1 = true;
            a();
            b();
        }
        requestLayout();
    }
}
