package k;

import K.O;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.LinearLayout;
import c1.i;
import e.C0476a;

/* renamed from: k.y0  reason: case insensitive filesystem */
public abstract class C0749y0 extends ViewGroup {

    /* renamed from: a  reason: collision with root package name */
    public boolean f9413a = true;

    /* renamed from: b  reason: collision with root package name */
    public int f9414b = -1;

    /* renamed from: c  reason: collision with root package name */
    public int f9415c = 0;
    public int d;

    /* renamed from: e  reason: collision with root package name */
    public int f9416e = 8388659;

    /* renamed from: f  reason: collision with root package name */
    public int f9417f;

    /* renamed from: p  reason: collision with root package name */
    public float f9418p;

    /* renamed from: q  reason: collision with root package name */
    public boolean f9419q;

    /* renamed from: r  reason: collision with root package name */
    public int[] f9420r;

    /* renamed from: s  reason: collision with root package name */
    public int[] f9421s;

    /* renamed from: t  reason: collision with root package name */
    public Drawable f9422t;

    /* renamed from: u  reason: collision with root package name */
    public int f9423u;

    /* renamed from: v  reason: collision with root package name */
    public int f9424v;

    /* renamed from: w  reason: collision with root package name */
    public int f9425w;

    /* renamed from: x  reason: collision with root package name */
    public int f9426x;

    public C0749y0(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        int[] iArr = C0476a.f7542n;
        i A6 = i.A(context, attributeSet, iArr, 0);
        O.k(this, context, iArr, attributeSet, (TypedArray) A6.f5606c, 0);
        TypedArray typedArray = (TypedArray) A6.f5606c;
        int i2 = typedArray.getInt(1, -1);
        if (i2 >= 0) {
            setOrientation(i2);
        }
        int i5 = typedArray.getInt(0, -1);
        if (i5 >= 0) {
            setGravity(i5);
        }
        boolean z3 = typedArray.getBoolean(2, true);
        if (!z3) {
            setBaselineAligned(z3);
        }
        this.f9418p = typedArray.getFloat(4, -1.0f);
        this.f9414b = typedArray.getInt(3, -1);
        this.f9419q = typedArray.getBoolean(7, false);
        setDividerDrawable(A6.n(5));
        this.f9425w = typedArray.getInt(8, 0);
        this.f9426x = typedArray.getDimensionPixelSize(6, 0);
        A6.G();
    }

    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C0747x0;
    }

    public final void d(Canvas canvas, int i2) {
        this.f9422t.setBounds(getPaddingLeft() + this.f9426x, i2, (getWidth() - getPaddingRight()) - this.f9426x, this.f9424v + i2);
        this.f9422t.draw(canvas);
    }

    public final void e(Canvas canvas, int i2) {
        this.f9422t.setBounds(i2, getPaddingTop() + this.f9426x, this.f9423u + i2, (getHeight() - getPaddingBottom()) - this.f9426x);
        this.f9422t.draw(canvas);
    }

    /* JADX WARNING: type inference failed for: r0v2, types: [android.widget.LinearLayout$LayoutParams, k.x0] */
    /* JADX WARNING: type inference failed for: r0v3, types: [android.widget.LinearLayout$LayoutParams, k.x0] */
    /* renamed from: f */
    public C0747x0 generateDefaultLayoutParams() {
        int i2 = this.d;
        if (i2 == 0) {
            return new LinearLayout.LayoutParams(-2, -2);
        }
        if (i2 == 1) {
            return new LinearLayout.LayoutParams(-1, -2);
        }
        return null;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [android.widget.LinearLayout$LayoutParams, k.x0] */
    /* renamed from: g */
    public C0747x0 generateLayoutParams(AttributeSet attributeSet) {
        return new LinearLayout.LayoutParams(getContext(), attributeSet);
    }

    public int getBaseline() {
        int i2;
        if (this.f9414b < 0) {
            return super.getBaseline();
        }
        int childCount = getChildCount();
        int i5 = this.f9414b;
        if (childCount > i5) {
            View childAt = getChildAt(i5);
            int baseline = childAt.getBaseline();
            if (baseline != -1) {
                int i6 = this.f9415c;
                if (this.d == 1 && (i2 = this.f9416e & 112) != 48) {
                    if (i2 == 16) {
                        i6 += ((((getBottom() - getTop()) - getPaddingTop()) - getPaddingBottom()) - this.f9417f) / 2;
                    } else if (i2 == 80) {
                        i6 = ((getBottom() - getTop()) - getPaddingBottom()) - this.f9417f;
                    }
                }
                return i6 + ((C0747x0) childAt.getLayoutParams()).topMargin + baseline;
            } else if (this.f9414b == 0) {
                return -1;
            } else {
                throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout points to a View that doesn't know how to get its baseline.");
            }
        } else {
            throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout set to an index that is out of bounds.");
        }
    }

    public int getBaselineAlignedChildIndex() {
        return this.f9414b;
    }

    public Drawable getDividerDrawable() {
        return this.f9422t;
    }

    public int getDividerPadding() {
        return this.f9426x;
    }

    public int getDividerWidth() {
        return this.f9423u;
    }

    public int getGravity() {
        return this.f9416e;
    }

    public int getOrientation() {
        return this.d;
    }

    public int getShowDividers() {
        return this.f9425w;
    }

    public int getVirtualChildCount() {
        return getChildCount();
    }

    public float getWeightSum() {
        return this.f9418p;
    }

    /* JADX WARNING: type inference failed for: r0v2, types: [android.widget.LinearLayout$LayoutParams, k.x0] */
    /* JADX WARNING: type inference failed for: r0v3, types: [android.widget.LinearLayout$LayoutParams, k.x0] */
    /* JADX WARNING: type inference failed for: r0v4, types: [android.widget.LinearLayout$LayoutParams, k.x0] */
    /* renamed from: h */
    public C0747x0 generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof C0747x0) {
            return new LinearLayout.LayoutParams((C0747x0) layoutParams);
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new LinearLayout.LayoutParams((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new LinearLayout.LayoutParams(layoutParams);
    }

    public final boolean i(int i2) {
        if (i2 == 0) {
            if ((this.f9425w & 1) != 0) {
                return true;
            }
            return false;
        } else if (i2 == getChildCount()) {
            if ((this.f9425w & 4) != 0) {
                return true;
            }
            return false;
        } else if ((this.f9425w & 2) == 0) {
            return false;
        } else {
            for (int i5 = i2 - 1; i5 >= 0; i5--) {
                if (getChildAt(i5).getVisibility() != 8) {
                    return true;
                }
            }
            return false;
        }
    }

    public final void onDraw(Canvas canvas) {
        boolean z3;
        int i2;
        int left;
        int i5;
        int i6;
        int i7;
        if (this.f9422t != null) {
            int i8 = 0;
            if (this.d == 1) {
                int virtualChildCount = getVirtualChildCount();
                while (i8 < virtualChildCount) {
                    View childAt = getChildAt(i8);
                    if (!(childAt == null || childAt.getVisibility() == 8 || !i(i8))) {
                        d(canvas, (childAt.getTop() - ((C0747x0) childAt.getLayoutParams()).topMargin) - this.f9424v);
                    }
                    i8++;
                }
                if (i(virtualChildCount)) {
                    View childAt2 = getChildAt(virtualChildCount - 1);
                    if (childAt2 == null) {
                        i7 = (getHeight() - getPaddingBottom()) - this.f9424v;
                    } else {
                        i7 = childAt2.getBottom() + ((C0747x0) childAt2.getLayoutParams()).bottomMargin;
                    }
                    d(canvas, i7);
                    return;
                }
                return;
            }
            int virtualChildCount2 = getVirtualChildCount();
            boolean z4 = i1.f9315a;
            if (getLayoutDirection() == 1) {
                z3 = true;
            } else {
                z3 = false;
            }
            while (i8 < virtualChildCount2) {
                View childAt3 = getChildAt(i8);
                if (!(childAt3 == null || childAt3.getVisibility() == 8 || !i(i8))) {
                    C0747x0 x0Var = (C0747x0) childAt3.getLayoutParams();
                    if (z3) {
                        i6 = childAt3.getRight() + x0Var.rightMargin;
                    } else {
                        i6 = (childAt3.getLeft() - x0Var.leftMargin) - this.f9423u;
                    }
                    e(canvas, i6);
                }
                i8++;
            }
            if (i(virtualChildCount2)) {
                View childAt4 = getChildAt(virtualChildCount2 - 1);
                if (childAt4 != null) {
                    C0747x0 x0Var2 = (C0747x0) childAt4.getLayoutParams();
                    if (z3) {
                        left = childAt4.getLeft() - x0Var2.leftMargin;
                        i5 = this.f9423u;
                    } else {
                        i2 = childAt4.getRight() + x0Var2.rightMargin;
                        e(canvas, i2);
                    }
                } else if (z3) {
                    i2 = getPaddingLeft();
                    e(canvas, i2);
                } else {
                    left = getWidth() - getPaddingRight();
                    i5 = this.f9423u;
                }
                i2 = left - i5;
                e(canvas, i2);
            }
        }
    }

    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName("androidx.appcompat.widget.LinearLayoutCompat");
    }

    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("androidx.appcompat.widget.LinearLayoutCompat");
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:0x0099  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x0156  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x015f  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x018f  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x01a1  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onLayout(boolean r23, int r24, int r25, int r26, int r27) {
        /*
            r22 = this;
            r0 = r22
            int r1 = r0.d
            r2 = 5
            r3 = 8
            r5 = 80
            r6 = 2
            r7 = 16
            r8 = 8388615(0x800007, float:1.1754953E-38)
            r9 = 1
            if (r1 != r9) goto L_0x00af
            int r1 = r22.getPaddingLeft()
            int r10 = r26 - r24
            int r11 = r22.getPaddingRight()
            int r11 = r10 - r11
            int r10 = r10 - r1
            int r12 = r22.getPaddingRight()
            int r10 = r10 - r12
            int r12 = r22.getVirtualChildCount()
            int r13 = r0.f9416e
            r14 = r13 & 112(0x70, float:1.57E-43)
            r8 = r8 & r13
            if (r14 == r7) goto L_0x0042
            if (r14 == r5) goto L_0x0036
            int r5 = r22.getPaddingTop()
            goto L_0x004d
        L_0x0036:
            int r5 = r22.getPaddingTop()
            int r5 = r5 + r27
            int r5 = r5 - r25
            int r7 = r0.f9417f
            int r5 = r5 - r7
            goto L_0x004d
        L_0x0042:
            int r5 = r22.getPaddingTop()
            int r7 = r27 - r25
            int r13 = r0.f9417f
            int r7 = r7 - r13
            int r7 = r7 / r6
            int r5 = r5 + r7
        L_0x004d:
            r4 = 0
        L_0x004e:
            if (r4 >= r12) goto L_0x01cc
            android.view.View r7 = r0.getChildAt(r4)
            if (r7 != 0) goto L_0x0057
            goto L_0x00aa
        L_0x0057:
            int r13 = r7.getVisibility()
            if (r13 == r3) goto L_0x00aa
            int r13 = r7.getMeasuredWidth()
            int r14 = r7.getMeasuredHeight()
            android.view.ViewGroup$LayoutParams r15 = r7.getLayoutParams()
            k.x0 r15 = (k.C0747x0) r15
            int r3 = r15.gravity
            if (r3 >= 0) goto L_0x0070
            r3 = r8
        L_0x0070:
            int r6 = r22.getLayoutDirection()
            int r3 = android.view.Gravity.getAbsoluteGravity(r3, r6)
            r3 = r3 & 7
            if (r3 == r9) goto L_0x0088
            if (r3 == r2) goto L_0x0082
            int r3 = r15.leftMargin
            int r3 = r3 + r1
            goto L_0x0093
        L_0x0082:
            int r3 = r11 - r13
            int r6 = r15.rightMargin
        L_0x0086:
            int r3 = r3 - r6
            goto L_0x0093
        L_0x0088:
            int r3 = r10 - r13
            r6 = 2
            int r3 = r3 / r6
            int r3 = r3 + r1
            int r6 = r15.leftMargin
            int r3 = r3 + r6
            int r6 = r15.rightMargin
            goto L_0x0086
        L_0x0093:
            boolean r6 = r0.i(r4)
            if (r6 == 0) goto L_0x009c
            int r6 = r0.f9424v
            int r5 = r5 + r6
        L_0x009c:
            int r6 = r15.topMargin
            int r5 = r5 + r6
            int r13 = r13 + r3
            int r6 = r5 + r14
            r7.layout(r3, r5, r13, r6)
            int r3 = r15.bottomMargin
            int r14 = r14 + r3
            int r14 = r14 + r5
            r5 = r14
        L_0x00aa:
            int r4 = r4 + r9
            r3 = 8
            r6 = 2
            goto L_0x004e
        L_0x00af:
            boolean r1 = k.i1.f9315a
            int r1 = r22.getLayoutDirection()
            if (r1 != r9) goto L_0x00b9
            r1 = r9
            goto L_0x00ba
        L_0x00b9:
            r1 = 0
        L_0x00ba:
            int r3 = r22.getPaddingTop()
            int r6 = r27 - r25
            int r10 = r22.getPaddingBottom()
            int r10 = r6 - r10
            int r6 = r6 - r3
            int r11 = r22.getPaddingBottom()
            int r6 = r6 - r11
            int r11 = r22.getVirtualChildCount()
            int r12 = r0.f9416e
            r8 = r8 & r12
            r12 = r12 & 112(0x70, float:1.57E-43)
            boolean r13 = r0.f9413a
            int[] r14 = r0.f9420r
            int[] r15 = r0.f9421s
            int r4 = r22.getLayoutDirection()
            int r4 = android.view.Gravity.getAbsoluteGravity(r8, r4)
            if (r4 == r9) goto L_0x00f8
            if (r4 == r2) goto L_0x00ec
            int r2 = r22.getPaddingLeft()
            goto L_0x0104
        L_0x00ec:
            int r2 = r22.getPaddingLeft()
            int r2 = r2 + r26
            int r2 = r2 - r24
            int r4 = r0.f9417f
            int r2 = r2 - r4
            goto L_0x0104
        L_0x00f8:
            int r2 = r22.getPaddingLeft()
            int r4 = r26 - r24
            int r8 = r0.f9417f
            int r4 = r4 - r8
            r8 = 2
            int r4 = r4 / r8
            int r2 = r2 + r4
        L_0x0104:
            if (r1 == 0) goto L_0x010a
            int r1 = r11 + -1
            r8 = -1
            goto L_0x010c
        L_0x010a:
            r8 = r9
            r1 = 0
        L_0x010c:
            r9 = 0
        L_0x010d:
            if (r9 >= r11) goto L_0x01cc
            int r17 = r8 * r9
            int r5 = r17 + r1
            android.view.View r7 = r0.getChildAt(r5)
            if (r7 != 0) goto L_0x0125
            r25 = r1
            r26 = r8
            r27 = r11
            r19 = r12
            r1 = 1
            r12 = -1
            goto L_0x01bd
        L_0x0125:
            int r4 = r7.getVisibility()
            r25 = r1
            r1 = 8
            if (r4 == r1) goto L_0x01b5
            int r4 = r7.getMeasuredWidth()
            int r18 = r7.getMeasuredHeight()
            android.view.ViewGroup$LayoutParams r19 = r7.getLayoutParams()
            r1 = r19
            k.x0 r1 = (k.C0747x0) r1
            r26 = r8
            if (r13 == 0) goto L_0x014f
            int r8 = r1.height
            r27 = r11
            r11 = -1
            if (r8 == r11) goto L_0x0151
            int r11 = r7.getBaseline()
            goto L_0x0152
        L_0x014f:
            r27 = r11
        L_0x0151:
            r11 = -1
        L_0x0152:
            int r8 = r1.gravity
            if (r8 >= 0) goto L_0x0157
            r8 = r12
        L_0x0157:
            r8 = r8 & 112(0x70, float:1.57E-43)
            r19 = r12
            r12 = 16
            if (r8 == r12) goto L_0x018f
            r12 = 48
            if (r8 == r12) goto L_0x0180
            r12 = 80
            if (r8 == r12) goto L_0x016a
            r8 = r3
            r12 = -1
            goto L_0x019b
        L_0x016a:
            int r8 = r10 - r18
            int r12 = r1.bottomMargin
            int r8 = r8 - r12
            r12 = -1
            if (r11 == r12) goto L_0x019b
            int r20 = r7.getMeasuredHeight()
            int r20 = r20 - r11
            r11 = 2
            r21 = r15[r11]
            int r21 = r21 - r20
            int r8 = r8 - r21
            goto L_0x019b
        L_0x0180:
            r12 = -1
            int r8 = r1.topMargin
            int r8 = r8 + r3
            if (r11 == r12) goto L_0x019b
            r16 = 1
            r20 = r14[r16]
            int r20 = r20 - r11
            int r8 = r20 + r8
            goto L_0x019b
        L_0x018f:
            r12 = -1
            int r8 = r6 - r18
            r11 = 2
            int r8 = r8 / r11
            int r8 = r8 + r3
            int r11 = r1.topMargin
            int r8 = r8 + r11
            int r11 = r1.bottomMargin
            int r8 = r8 - r11
        L_0x019b:
            boolean r5 = r0.i(r5)
            if (r5 == 0) goto L_0x01a4
            int r5 = r0.f9423u
            int r2 = r2 + r5
        L_0x01a4:
            int r5 = r1.leftMargin
            int r2 = r2 + r5
            int r5 = r2 + r4
            int r11 = r8 + r18
            r7.layout(r2, r8, r5, r11)
            int r1 = r1.rightMargin
            int r4 = r4 + r1
            int r4 = r4 + r2
            r2 = r4
        L_0x01b3:
            r1 = 1
            goto L_0x01bd
        L_0x01b5:
            r26 = r8
            r27 = r11
            r19 = r12
            r12 = -1
            goto L_0x01b3
        L_0x01bd:
            int r9 = r9 + r1
            r1 = r25
            r8 = r26
            r11 = r27
            r12 = r19
            r5 = 80
            r7 = 16
            goto L_0x010d
        L_0x01cc:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: k.C0749y0.onLayout(boolean, int, int, int, int):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:136:0x02e0, code lost:
        if (r13.width == -1) goto L_0x02e7;
     */
    /* JADX WARNING: Removed duplicated region for block: B:203:0x0486  */
    /* JADX WARNING: Removed duplicated region for block: B:204:0x048b  */
    /* JADX WARNING: Removed duplicated region for block: B:207:0x04b3  */
    /* JADX WARNING: Removed duplicated region for block: B:208:0x04b8  */
    /* JADX WARNING: Removed duplicated region for block: B:211:0x04c0  */
    /* JADX WARNING: Removed duplicated region for block: B:212:0x04cc  */
    /* JADX WARNING: Removed duplicated region for block: B:214:0x04de  */
    /* JADX WARNING: Removed duplicated region for block: B:219:0x04ed  */
    /* JADX WARNING: Removed duplicated region for block: B:220:0x04f2  */
    /* JADX WARNING: Removed duplicated region for block: B:225:0x050e  */
    /* JADX WARNING: Removed duplicated region for block: B:230:0x0537  */
    /* JADX WARNING: Removed duplicated region for block: B:235:0x0545  */
    /* JADX WARNING: Removed duplicated region for block: B:236:0x0548  */
    /* JADX WARNING: Removed duplicated region for block: B:239:0x0550  */
    /* JADX WARNING: Removed duplicated region for block: B:242:0x055b  */
    /* JADX WARNING: Removed duplicated region for block: B:269:0x05e4  */
    /* JADX WARNING: Removed duplicated region for block: B:301:0x0698  */
    /* JADX WARNING: Removed duplicated region for block: B:304:0x06b4  */
    /* JADX WARNING: Removed duplicated region for block: B:347:0x07a7  */
    /* JADX WARNING: Removed duplicated region for block: B:351:0x07cb  */
    /* JADX WARNING: Removed duplicated region for block: B:360:0x07fe  */
    /* JADX WARNING: Removed duplicated region for block: B:363:0x0806  */
    /* JADX WARNING: Removed duplicated region for block: B:372:0x0860  */
    /* JADX WARNING: Removed duplicated region for block: B:423:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onMeasure(int r38, int r39) {
        /*
            r37 = this;
            r6 = r37
            r7 = r38
            r8 = r39
            int r0 = r6.d
            r10 = -2
            r11 = 1073741824(0x40000000, float:2.0)
            r12 = 8
            r14 = -2147483648(0xffffffff80000000, float:-0.0)
            r15 = 0
            r5 = 0
            r4 = 1
            if (r0 != r4) goto L_0x0382
            r6.f9417f = r5
            int r3 = r37.getVirtualChildCount()
            int r2 = android.view.View.MeasureSpec.getMode(r38)
            int r1 = android.view.View.MeasureSpec.getMode(r39)
            int r0 = r6.f9414b
            boolean r9 = r6.f9419q
            r24 = r4
            r13 = r5
            r18 = r13
            r19 = r18
            r20 = r19
            r21 = r20
            r22 = r21
            r23 = r22
            r25 = r23
            r17 = r15
        L_0x0039:
            if (r13 >= r3) goto L_0x0175
            android.view.View r26 = r6.getChildAt(r13)
            if (r26 != 0) goto L_0x0051
            int r4 = r6.f9417f
            r6.f9417f = r4
        L_0x0045:
            r10 = r0
            r29 = r1
            r1 = r2
            r31 = r3
            r3 = r22
            r27 = 1
            goto L_0x015e
        L_0x0051:
            int r4 = r26.getVisibility()
            if (r4 != r12) goto L_0x0058
            goto L_0x0045
        L_0x0058:
            boolean r4 = r6.i(r13)
            if (r4 == 0) goto L_0x0065
            int r4 = r6.f9417f
            int r5 = r6.f9424v
            int r4 = r4 + r5
            r6.f9417f = r4
        L_0x0065:
            android.view.ViewGroup$LayoutParams r4 = r26.getLayoutParams()
            r5 = r4
            k.x0 r5 = (k.C0747x0) r5
            float r4 = r5.weight
            float r17 = r17 + r4
            if (r1 != r11) goto L_0x0094
            int r12 = r5.height
            if (r12 != 0) goto L_0x0094
            int r12 = (r4 > r15 ? 1 : (r4 == r15 ? 0 : -1))
            if (r12 <= 0) goto L_0x0094
            int r4 = r6.f9417f
            int r12 = r5.topMargin
            int r12 = r12 + r4
            int r11 = r5.bottomMargin
            int r12 = r12 + r11
            int r4 = java.lang.Math.max(r4, r12)
            r6.f9417f = r4
            r10 = r0
            r29 = r1
            r30 = r2
            r31 = r3
            r15 = r5
            r4 = 1
            r27 = 1
            goto L_0x00e4
        L_0x0094:
            int r11 = r5.height
            if (r11 != 0) goto L_0x00a0
            int r4 = (r4 > r15 ? 1 : (r4 == r15 ? 0 : -1))
            if (r4 <= 0) goto L_0x00a0
            r5.height = r10
            r11 = 0
            goto L_0x00a1
        L_0x00a0:
            r11 = r14
        L_0x00a1:
            int r4 = (r17 > r15 ? 1 : (r17 == r15 ? 0 : -1))
            if (r4 != 0) goto L_0x00a9
            int r4 = r6.f9417f
            r12 = r4
            goto L_0x00aa
        L_0x00a9:
            r12 = 0
        L_0x00aa:
            r4 = 0
            r10 = r0
            r0 = r37
            r29 = r1
            r1 = r26
            r30 = r2
            r2 = r38
            r31 = r3
            r3 = r4
            r27 = 1
            r4 = r39
            r15 = r5
            r5 = r12
            r0.measureChildWithMargins(r1, r2, r3, r4, r5)
            if (r11 == r14) goto L_0x00c6
            r15.height = r11
        L_0x00c6:
            int r0 = r26.getMeasuredHeight()
            int r1 = r6.f9417f
            int r2 = r1 + r0
            int r3 = r15.topMargin
            int r2 = r2 + r3
            int r3 = r15.bottomMargin
            int r2 = r2 + r3
            int r1 = java.lang.Math.max(r1, r2)
            r6.f9417f = r1
            r5 = r21
            if (r9 == 0) goto L_0x00e2
            int r21 = java.lang.Math.max(r0, r5)
        L_0x00e2:
            r4 = r20
        L_0x00e4:
            if (r10 < 0) goto L_0x00ee
            int r0 = r13 + 1
            if (r10 != r0) goto L_0x00ee
            int r0 = r6.f9417f
            r6.f9415c = r0
        L_0x00ee:
            if (r13 >= r10) goto L_0x00f7
            float r0 = r15.weight
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 > 0) goto L_0x00fc
        L_0x00f7:
            r1 = r30
            r0 = 1073741824(0x40000000, float:2.0)
            goto L_0x0104
        L_0x00fc:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            java.lang.String r1 = "A child of LinearLayout with index less than mBaselineAlignedChildIndex has weight > 0, which won't work.  Either remove the weight, or don't set mBaselineAlignedChildIndex."
            r0.<init>(r1)
            throw r0
        L_0x0104:
            if (r1 == r0) goto L_0x0110
            int r0 = r15.width
            r2 = -1
            if (r0 != r2) goto L_0x0110
            r5 = r27
            r25 = r5
            goto L_0x0111
        L_0x0110:
            r5 = 0
        L_0x0111:
            int r0 = r15.leftMargin
            int r2 = r15.rightMargin
            int r0 = r0 + r2
            int r2 = r26.getMeasuredWidth()
            int r2 = r2 + r0
            r3 = r22
            int r3 = java.lang.Math.max(r3, r2)
            int r11 = r26.getMeasuredState()
            r12 = r23
            int r11 = android.view.View.combineMeasuredStates(r12, r11)
            if (r24 == 0) goto L_0x0135
            int r12 = r15.width
            r14 = -1
            if (r12 != r14) goto L_0x0135
            r12 = r27
            goto L_0x0136
        L_0x0135:
            r12 = 0
        L_0x0136:
            float r14 = r15.weight
            r15 = 0
            int r14 = (r14 > r15 ? 1 : (r14 == r15 ? 0 : -1))
            if (r14 <= 0) goto L_0x0149
            if (r5 == 0) goto L_0x0142
        L_0x013f:
            r14 = r19
            goto L_0x0144
        L_0x0142:
            r0 = r2
            goto L_0x013f
        L_0x0144:
            int r19 = java.lang.Math.max(r14, r0)
            goto L_0x0158
        L_0x0149:
            r14 = r19
            if (r5 == 0) goto L_0x0150
        L_0x014d:
            r2 = r18
            goto L_0x0152
        L_0x0150:
            r0 = r2
            goto L_0x014d
        L_0x0152:
            int r18 = java.lang.Math.max(r2, r0)
            r19 = r14
        L_0x0158:
            r20 = r4
            r23 = r11
            r24 = r12
        L_0x015e:
            int r13 = r13 + 1
            r2 = r1
            r22 = r3
            r0 = r10
            r4 = r27
            r1 = r29
            r3 = r31
            r5 = 0
            r10 = -2
            r11 = 1073741824(0x40000000, float:2.0)
            r12 = 8
            r14 = -2147483648(0xffffffff80000000, float:-0.0)
            r15 = 0
            goto L_0x0039
        L_0x0175:
            r29 = r1
            r1 = r2
            r31 = r3
            r27 = r4
            r2 = r18
            r14 = r19
            r5 = r21
            r3 = r22
            r12 = r23
            int r0 = r6.f9417f
            r10 = r31
            if (r0 <= 0) goto L_0x0199
            boolean r0 = r6.i(r10)
            if (r0 == 0) goto L_0x0199
            int r0 = r6.f9417f
            int r4 = r6.f9424v
            int r0 = r0 + r4
            r6.f9417f = r0
        L_0x0199:
            r4 = r29
            if (r9 == 0) goto L_0x01d9
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r4 == r0) goto L_0x01a3
            if (r4 != 0) goto L_0x01d9
        L_0x01a3:
            r11 = 0
            r6.f9417f = r11
            r0 = r11
        L_0x01a7:
            if (r0 >= r10) goto L_0x01d9
            android.view.View r13 = r6.getChildAt(r0)
            if (r13 != 0) goto L_0x01b4
            int r13 = r6.f9417f
            r6.f9417f = r13
            goto L_0x01d5
        L_0x01b4:
            int r15 = r13.getVisibility()
            r11 = 8
            if (r15 != r11) goto L_0x01bd
            goto L_0x01d5
        L_0x01bd:
            android.view.ViewGroup$LayoutParams r11 = r13.getLayoutParams()
            k.x0 r11 = (k.C0747x0) r11
            int r13 = r6.f9417f
            int r21 = r13 + r5
            int r15 = r11.topMargin
            int r21 = r21 + r15
            int r11 = r11.bottomMargin
            int r11 = r21 + r11
            int r11 = java.lang.Math.max(r13, r11)
            r6.f9417f = r11
        L_0x01d5:
            int r0 = r0 + 1
            r11 = 0
            goto L_0x01a7
        L_0x01d9:
            int r0 = r6.f9417f
            int r11 = r37.getPaddingTop()
            int r13 = r37.getPaddingBottom()
            int r13 = r13 + r11
            int r13 = r13 + r0
            r6.f9417f = r13
            int r0 = r37.getSuggestedMinimumHeight()
            int r0 = java.lang.Math.max(r13, r0)
            r11 = 0
            int r0 = android.view.View.resolveSizeAndState(r0, r8, r11)
            r11 = 16777215(0xffffff, float:2.3509886E-38)
            r11 = r11 & r0
            int r13 = r6.f9417f
            int r11 = r11 - r13
            if (r20 != 0) goto L_0x0246
            if (r11 == 0) goto L_0x0205
            r13 = 0
            int r15 = (r17 > r13 ? 1 : (r17 == r13 ? 0 : -1))
            if (r15 <= 0) goto L_0x0205
            goto L_0x0246
        L_0x0205:
            int r2 = java.lang.Math.max(r2, r14)
            if (r9 == 0) goto L_0x0242
            r9 = 1073741824(0x40000000, float:2.0)
            if (r4 == r9) goto L_0x0242
            r4 = 0
        L_0x0210:
            if (r4 >= r10) goto L_0x0242
            android.view.View r9 = r6.getChildAt(r4)
            if (r9 == 0) goto L_0x023f
            int r11 = r9.getVisibility()
            r13 = 8
            if (r11 != r13) goto L_0x0221
            goto L_0x023f
        L_0x0221:
            android.view.ViewGroup$LayoutParams r11 = r9.getLayoutParams()
            k.x0 r11 = (k.C0747x0) r11
            float r11 = r11.weight
            r13 = 0
            int r11 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r11 <= 0) goto L_0x023f
            int r11 = r9.getMeasuredWidth()
            r13 = 1073741824(0x40000000, float:2.0)
            int r11 = android.view.View.MeasureSpec.makeMeasureSpec(r11, r13)
            int r14 = android.view.View.MeasureSpec.makeMeasureSpec(r5, r13)
            r9.measure(r11, r14)
        L_0x023f:
            int r4 = r4 + 1
            goto L_0x0210
        L_0x0242:
            r22 = r3
            goto L_0x0322
        L_0x0246:
            float r5 = r6.f9418p
            r9 = 0
            int r13 = (r5 > r9 ? 1 : (r5 == r9 ? 0 : -1))
            if (r13 <= 0) goto L_0x024f
            r17 = r5
        L_0x024f:
            r5 = 0
            r6.f9417f = r5
            r5 = 0
        L_0x0253:
            if (r5 >= r10) goto L_0x0312
            android.view.View r9 = r6.getChildAt(r5)
            int r13 = r9.getVisibility()
            r14 = 8
            if (r13 != r14) goto L_0x0265
            r29 = r4
            goto L_0x030c
        L_0x0265:
            android.view.ViewGroup$LayoutParams r13 = r9.getLayoutParams()
            k.x0 r13 = (k.C0747x0) r13
            float r14 = r13.weight
            r15 = 0
            int r16 = (r14 > r15 ? 1 : (r14 == r15 ? 0 : -1))
            if (r16 <= 0) goto L_0x02c7
            float r15 = (float) r11
            float r15 = r15 * r14
            float r15 = r15 / r17
            int r15 = (int) r15
            float r17 = r17 - r14
            int r11 = r11 - r15
            int r14 = r37.getPaddingLeft()
            int r16 = r37.getPaddingRight()
            int r16 = r16 + r14
            int r14 = r13.leftMargin
            int r16 = r16 + r14
            int r14 = r13.rightMargin
            int r14 = r16 + r14
            r16 = r11
            int r11 = r13.width
            int r11 = android.view.ViewGroup.getChildMeasureSpec(r7, r14, r11)
            int r14 = r13.height
            if (r14 != 0) goto L_0x02a9
            r14 = 1073741824(0x40000000, float:2.0)
            if (r4 == r14) goto L_0x029d
            goto L_0x02ab
        L_0x029d:
            if (r15 <= 0) goto L_0x02a0
            goto L_0x02a1
        L_0x02a0:
            r15 = 0
        L_0x02a1:
            int r15 = android.view.View.MeasureSpec.makeMeasureSpec(r15, r14)
            r9.measure(r11, r15)
            goto L_0x02bb
        L_0x02a9:
            r14 = 1073741824(0x40000000, float:2.0)
        L_0x02ab:
            int r18 = r9.getMeasuredHeight()
            int r15 = r18 + r15
            if (r15 >= 0) goto L_0x02b4
            r15 = 0
        L_0x02b4:
            int r15 = android.view.View.MeasureSpec.makeMeasureSpec(r15, r14)
            r9.measure(r11, r15)
        L_0x02bb:
            int r11 = r9.getMeasuredState()
            r11 = r11 & -256(0xffffffffffffff00, float:NaN)
            int r12 = android.view.View.combineMeasuredStates(r12, r11)
            r11 = r16
        L_0x02c7:
            int r14 = r13.leftMargin
            int r15 = r13.rightMargin
            int r14 = r14 + r15
            int r15 = r9.getMeasuredWidth()
            int r15 = r15 + r14
            int r3 = java.lang.Math.max(r3, r15)
            r16 = r3
            r3 = 1073741824(0x40000000, float:2.0)
            if (r1 == r3) goto L_0x02e3
            int r3 = r13.width
            r29 = r4
            r4 = -1
            if (r3 != r4) goto L_0x02e6
            goto L_0x02e7
        L_0x02e3:
            r29 = r4
            r4 = -1
        L_0x02e6:
            r14 = r15
        L_0x02e7:
            int r2 = java.lang.Math.max(r2, r14)
            if (r24 == 0) goto L_0x02f4
            int r3 = r13.width
            if (r3 != r4) goto L_0x02f4
            r3 = r27
            goto L_0x02f5
        L_0x02f4:
            r3 = 0
        L_0x02f5:
            int r4 = r6.f9417f
            int r9 = r9.getMeasuredHeight()
            int r9 = r9 + r4
            int r14 = r13.topMargin
            int r9 = r9 + r14
            int r13 = r13.bottomMargin
            int r9 = r9 + r13
            int r4 = java.lang.Math.max(r4, r9)
            r6.f9417f = r4
            r24 = r3
            r3 = r16
        L_0x030c:
            int r5 = r5 + 1
            r4 = r29
            goto L_0x0253
        L_0x0312:
            int r4 = r6.f9417f
            int r5 = r37.getPaddingTop()
            int r9 = r37.getPaddingBottom()
            int r9 = r9 + r5
            int r9 = r9 + r4
            r6.f9417f = r9
            goto L_0x0242
        L_0x0322:
            if (r24 != 0) goto L_0x0329
            r3 = 1073741824(0x40000000, float:2.0)
            if (r1 == r3) goto L_0x0329
            goto L_0x032b
        L_0x0329:
            r2 = r22
        L_0x032b:
            int r1 = r37.getPaddingLeft()
            int r3 = r37.getPaddingRight()
            int r3 = r3 + r1
            int r3 = r3 + r2
            int r1 = r37.getSuggestedMinimumWidth()
            int r1 = java.lang.Math.max(r3, r1)
            int r1 = android.view.View.resolveSizeAndState(r1, r7, r12)
            r6.setMeasuredDimension(r1, r0)
            if (r25 == 0) goto L_0x089f
            int r0 = r37.getMeasuredWidth()
            r1 = 1073741824(0x40000000, float:2.0)
            int r7 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r1)
            r9 = 0
        L_0x0351:
            if (r9 >= r10) goto L_0x089f
            android.view.View r1 = r6.getChildAt(r9)
            int r0 = r1.getVisibility()
            r2 = 8
            if (r0 == r2) goto L_0x037f
            android.view.ViewGroup$LayoutParams r0 = r1.getLayoutParams()
            r11 = r0
            k.x0 r11 = (k.C0747x0) r11
            int r0 = r11.width
            r2 = -1
            if (r0 != r2) goto L_0x037f
            int r12 = r11.height
            int r0 = r1.getMeasuredHeight()
            r11.height = r0
            r3 = 0
            r5 = 0
            r0 = r37
            r2 = r7
            r4 = r39
            r0.measureChildWithMargins(r1, r2, r3, r4, r5)
            r11.height = r12
        L_0x037f:
            int r9 = r9 + 1
            goto L_0x0351
        L_0x0382:
            r27 = r4
            r0 = r5
            r6.f9417f = r0
            int r9 = r37.getVirtualChildCount()
            int r10 = android.view.View.MeasureSpec.getMode(r38)
            int r11 = android.view.View.MeasureSpec.getMode(r39)
            int[] r0 = r6.f9420r
            r12 = 4
            if (r0 == 0) goto L_0x039c
            int[] r0 = r6.f9421s
            if (r0 != 0) goto L_0x03a4
        L_0x039c:
            int[] r0 = new int[r12]
            r6.f9420r = r0
            int[] r0 = new int[r12]
            r6.f9421s = r0
        L_0x03a4:
            int[] r13 = r6.f9420r
            int[] r14 = r6.f9421s
            r15 = 3
            r0 = -1
            r13[r15] = r0
            r17 = 2
            r13[r17] = r0
            r13[r27] = r0
            r1 = 0
            r13[r1] = r0
            r14[r15] = r0
            r14[r17] = r0
            r14[r27] = r0
            r14[r1] = r0
            boolean r5 = r6.f9413a
            boolean r4 = r6.f9419q
            r0 = 1073741824(0x40000000, float:2.0)
            if (r10 != r0) goto L_0x03c8
            r18 = r27
            goto L_0x03ca
        L_0x03c8:
            r18 = 0
        L_0x03ca:
            r19 = r27
            r0 = 0
            r1 = 0
            r2 = 0
            r3 = 0
            r8 = 0
            r12 = 0
            r15 = 0
            r21 = 0
            r24 = 0
        L_0x03d7:
            if (r3 >= r9) goto L_0x0577
            android.view.View r7 = r6.getChildAt(r3)
            if (r7 != 0) goto L_0x03eb
            int r7 = r6.f9417f
            r6.f9417f = r7
            r25 = r3
            r26 = r4
            r30 = r5
            goto L_0x056d
        L_0x03eb:
            r25 = r0
            int r0 = r7.getVisibility()
            r26 = r2
            r2 = 8
            if (r0 != r2) goto L_0x0403
            r30 = r5
            r0 = r25
            r2 = r26
            r25 = r3
            r26 = r4
            goto L_0x056d
        L_0x0403:
            boolean r0 = r6.i(r3)
            if (r0 == 0) goto L_0x0410
            int r0 = r6.f9417f
            int r2 = r6.f9423u
            int r0 = r0 + r2
            r6.f9417f = r0
        L_0x0410:
            android.view.ViewGroup$LayoutParams r0 = r7.getLayoutParams()
            r2 = r0
            k.x0 r2 = (k.C0747x0) r2
            float r0 = r2.weight
            float r29 = r1 + r0
            r1 = 1073741824(0x40000000, float:2.0)
            if (r10 != r1) goto L_0x046f
            int r1 = r2.width
            if (r1 != 0) goto L_0x046f
            r1 = 0
            int r30 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r30 <= 0) goto L_0x046f
            if (r18 == 0) goto L_0x0437
            int r0 = r6.f9417f
            int r1 = r2.leftMargin
            r30 = r3
            int r3 = r2.rightMargin
            int r1 = r1 + r3
            int r1 = r1 + r0
            r6.f9417f = r1
            goto L_0x0447
        L_0x0437:
            r30 = r3
            int r0 = r6.f9417f
            int r1 = r2.leftMargin
            int r1 = r1 + r0
            int r3 = r2.rightMargin
            int r1 = r1 + r3
            int r0 = java.lang.Math.max(r0, r1)
            r6.f9417f = r0
        L_0x0447:
            if (r5 == 0) goto L_0x045e
            r0 = 0
            int r1 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r0)
            r7.measure(r1, r1)
            r0 = r2
            r33 = r25
            r34 = r26
            r25 = r30
            r26 = r4
            r30 = r5
            goto L_0x04e2
        L_0x045e:
            r0 = r2
            r33 = r25
            r34 = r26
            r25 = r30
            r1 = 1073741824(0x40000000, float:2.0)
            r26 = r4
            r30 = r5
            r4 = r27
            goto L_0x04e6
        L_0x046f:
            r30 = r3
            int r1 = r2.width
            if (r1 != 0) goto L_0x047f
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x0480
            r0 = -2
            r2.width = r0
            r3 = 0
            goto L_0x0482
        L_0x047f:
            r1 = 0
        L_0x0480:
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
        L_0x0482:
            int r0 = (r29 > r1 ? 1 : (r29 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x048b
            int r0 = r6.f9417f
            r31 = r0
            goto L_0x048d
        L_0x048b:
            r31 = 0
        L_0x048d:
            r32 = 0
            r1 = r25
            r0 = r37
            r33 = r1
            r1 = r7
            r35 = r2
            r34 = r26
            r2 = r38
            r36 = r3
            r25 = r30
            r3 = r31
            r26 = r4
            r4 = r39
            r30 = r5
            r5 = r32
            r0.measureChildWithMargins(r1, r2, r3, r4, r5)
            r1 = r36
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r1 == r0) goto L_0x04b8
            r0 = r35
            r0.width = r1
            goto L_0x04ba
        L_0x04b8:
            r0 = r35
        L_0x04ba:
            int r1 = r7.getMeasuredWidth()
            if (r18 == 0) goto L_0x04cc
            int r2 = r6.f9417f
            int r3 = r0.leftMargin
            int r3 = r3 + r1
            int r4 = r0.rightMargin
            int r3 = r3 + r4
            int r3 = r3 + r2
            r6.f9417f = r3
            goto L_0x04dc
        L_0x04cc:
            int r2 = r6.f9417f
            int r3 = r2 + r1
            int r4 = r0.leftMargin
            int r3 = r3 + r4
            int r4 = r0.rightMargin
            int r3 = r3 + r4
            int r2 = java.lang.Math.max(r2, r3)
            r6.f9417f = r2
        L_0x04dc:
            if (r26 == 0) goto L_0x04e2
            int r12 = java.lang.Math.max(r1, r12)
        L_0x04e2:
            r4 = r21
            r1 = 1073741824(0x40000000, float:2.0)
        L_0x04e6:
            if (r11 == r1) goto L_0x04f2
            int r1 = r0.height
            r2 = -1
            if (r1 != r2) goto L_0x04f2
            r5 = r27
            r24 = r5
            goto L_0x04f3
        L_0x04f2:
            r5 = 0
        L_0x04f3:
            int r1 = r0.topMargin
            int r2 = r0.bottomMargin
            int r1 = r1 + r2
            int r2 = r7.getMeasuredHeight()
            int r2 = r2 + r1
            int r3 = r7.getMeasuredState()
            int r3 = android.view.View.combineMeasuredStates(r8, r3)
            if (r30 == 0) goto L_0x0537
            int r7 = r7.getBaseline()
            r8 = -1
            if (r7 == r8) goto L_0x0537
            int r8 = r0.gravity
            if (r8 >= 0) goto L_0x0514
            int r8 = r6.f9416e
        L_0x0514:
            r8 = r8 & 112(0x70, float:1.57E-43)
            r21 = 4
            int r8 = r8 >> 4
            r21 = -2
            r8 = r8 & -2
            int r8 = r8 >> 1
            r21 = r1
            r1 = r13[r8]
            int r1 = java.lang.Math.max(r1, r7)
            r13[r8] = r1
            r1 = r14[r8]
            int r7 = r2 - r7
            int r1 = java.lang.Math.max(r1, r7)
            r14[r8] = r1
        L_0x0534:
            r7 = r34
            goto L_0x053a
        L_0x0537:
            r21 = r1
            goto L_0x0534
        L_0x053a:
            int r1 = java.lang.Math.max(r7, r2)
            if (r19 == 0) goto L_0x0548
            int r7 = r0.height
            r8 = -1
            if (r7 != r8) goto L_0x0548
            r7 = r27
            goto L_0x0549
        L_0x0548:
            r7 = 0
        L_0x0549:
            float r0 = r0.weight
            r8 = 0
            int r0 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            if (r0 <= 0) goto L_0x055b
            if (r5 == 0) goto L_0x0554
            r2 = r21
        L_0x0554:
            int r15 = java.lang.Math.max(r15, r2)
            r0 = r33
            goto L_0x0565
        L_0x055b:
            if (r5 == 0) goto L_0x055f
            r2 = r21
        L_0x055f:
            r0 = r33
            int r0 = java.lang.Math.max(r0, r2)
        L_0x0565:
            r2 = r1
            r8 = r3
            r21 = r4
            r19 = r7
            r1 = r29
        L_0x056d:
            int r3 = r25 + 1
            r7 = r38
            r4 = r26
            r5 = r30
            goto L_0x03d7
        L_0x0577:
            r7 = r2
            r26 = r4
            r30 = r5
            int r2 = r6.f9417f
            if (r2 <= 0) goto L_0x058d
            boolean r2 = r6.i(r9)
            if (r2 == 0) goto L_0x058d
            int r2 = r6.f9417f
            int r3 = r6.f9423u
            int r2 = r2 + r3
            r6.f9417f = r2
        L_0x058d:
            r2 = r13[r27]
            r3 = -1
            if (r2 != r3) goto L_0x05a5
            r4 = 0
            r5 = r13[r4]
            if (r5 != r3) goto L_0x05a5
            r4 = r13[r17]
            if (r4 != r3) goto L_0x05a5
            r4 = 3
            r5 = r13[r4]
            if (r5 == r3) goto L_0x05a1
            goto L_0x05a6
        L_0x05a1:
            r2 = r7
            r25 = r8
            goto L_0x05d6
        L_0x05a5:
            r4 = 3
        L_0x05a6:
            r3 = r13[r4]
            r5 = 0
            r4 = r13[r5]
            r5 = r13[r17]
            int r2 = java.lang.Math.max(r2, r5)
            int r2 = java.lang.Math.max(r4, r2)
            int r2 = java.lang.Math.max(r3, r2)
            r3 = 3
            r4 = r14[r3]
            r3 = 0
            r5 = r14[r3]
            r3 = r14[r27]
            r25 = r8
            r8 = r14[r17]
            int r3 = java.lang.Math.max(r3, r8)
            int r3 = java.lang.Math.max(r5, r3)
            int r3 = java.lang.Math.max(r4, r3)
            int r3 = r3 + r2
            int r2 = java.lang.Math.max(r7, r3)
        L_0x05d6:
            if (r26 == 0) goto L_0x061f
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r10 == r3) goto L_0x05de
            if (r10 != 0) goto L_0x061f
        L_0x05de:
            r3 = 0
            r6.f9417f = r3
            r5 = 0
        L_0x05e2:
            if (r5 >= r9) goto L_0x061f
            android.view.View r3 = r6.getChildAt(r5)
            if (r3 != 0) goto L_0x05ef
            int r3 = r6.f9417f
            r6.f9417f = r3
            goto L_0x061c
        L_0x05ef:
            int r4 = r3.getVisibility()
            r7 = 8
            if (r4 != r7) goto L_0x05f8
            goto L_0x061c
        L_0x05f8:
            android.view.ViewGroup$LayoutParams r3 = r3.getLayoutParams()
            k.x0 r3 = (k.C0747x0) r3
            if (r18 == 0) goto L_0x060c
            int r4 = r6.f9417f
            int r7 = r3.leftMargin
            int r7 = r7 + r12
            int r3 = r3.rightMargin
            int r7 = r7 + r3
            int r7 = r7 + r4
            r6.f9417f = r7
            goto L_0x061c
        L_0x060c:
            int r4 = r6.f9417f
            int r7 = r4 + r12
            int r8 = r3.leftMargin
            int r7 = r7 + r8
            int r3 = r3.rightMargin
            int r7 = r7 + r3
            int r3 = java.lang.Math.max(r4, r7)
            r6.f9417f = r3
        L_0x061c:
            int r5 = r5 + 1
            goto L_0x05e2
        L_0x061f:
            int r3 = r6.f9417f
            int r4 = r37.getPaddingLeft()
            int r5 = r37.getPaddingRight()
            int r5 = r5 + r4
            int r5 = r5 + r3
            r6.f9417f = r5
            int r3 = r37.getSuggestedMinimumWidth()
            int r3 = java.lang.Math.max(r5, r3)
            r7 = r38
            r4 = 0
            int r3 = android.view.View.resolveSizeAndState(r3, r7, r4)
            r4 = 16777215(0xffffff, float:2.3509886E-38)
            r4 = r4 & r3
            int r5 = r6.f9417f
            int r4 = r4 - r5
            if (r21 != 0) goto L_0x0691
            if (r4 == 0) goto L_0x064d
            r8 = 0
            int r16 = (r1 > r8 ? 1 : (r1 == r8 ? 0 : -1))
            if (r16 <= 0) goto L_0x064d
            goto L_0x0691
        L_0x064d:
            int r0 = java.lang.Math.max(r0, r15)
            if (r26 == 0) goto L_0x068a
            r1 = 1073741824(0x40000000, float:2.0)
            if (r10 == r1) goto L_0x068a
            r1 = 0
        L_0x0658:
            if (r1 >= r9) goto L_0x068a
            android.view.View r4 = r6.getChildAt(r1)
            if (r4 == 0) goto L_0x0687
            int r8 = r4.getVisibility()
            r10 = 8
            if (r8 != r10) goto L_0x0669
            goto L_0x0687
        L_0x0669:
            android.view.ViewGroup$LayoutParams r8 = r4.getLayoutParams()
            k.x0 r8 = (k.C0747x0) r8
            float r8 = r8.weight
            r10 = 0
            int r8 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r8 <= 0) goto L_0x0687
            r8 = 1073741824(0x40000000, float:2.0)
            int r10 = android.view.View.MeasureSpec.makeMeasureSpec(r12, r8)
            int r13 = r4.getMeasuredHeight()
            int r13 = android.view.View.MeasureSpec.makeMeasureSpec(r13, r8)
            r4.measure(r10, r13)
        L_0x0687:
            int r1 = r1 + 1
            goto L_0x0658
        L_0x068a:
            r4 = r39
            r22 = r9
            r8 = 0
            goto L_0x0836
        L_0x0691:
            float r2 = r6.f9418p
            r8 = 0
            int r12 = (r2 > r8 ? 1 : (r2 == r8 ? 0 : -1))
            if (r12 <= 0) goto L_0x0699
            r1 = r2
        L_0x0699:
            r2 = -1
            r8 = 3
            r13[r8] = r2
            r13[r17] = r2
            r13[r27] = r2
            r12 = 0
            r13[r12] = r2
            r14[r8] = r2
            r14[r17] = r2
            r14[r27] = r2
            r14[r12] = r2
            r6.f9417f = r12
            r12 = r25
            r2 = -1
            r8 = 0
        L_0x06b2:
            if (r8 >= r9) goto L_0x07de
            android.view.View r15 = r6.getChildAt(r8)
            if (r15 == 0) goto L_0x06c2
            int r5 = r15.getVisibility()
            r7 = 8
            if (r5 != r7) goto L_0x06cf
        L_0x06c2:
            r7 = r4
            r22 = r9
            r21 = 0
            r23 = 4
            r28 = -2
            r4 = r39
            goto L_0x07d5
        L_0x06cf:
            android.view.ViewGroup$LayoutParams r5 = r15.getLayoutParams()
            k.x0 r5 = (k.C0747x0) r5
            float r7 = r5.weight
            r21 = 0
            int r22 = (r7 > r21 ? 1 : (r7 == r21 ? 0 : -1))
            if (r22 <= 0) goto L_0x073a
            r22 = r9
            float r9 = (float) r4
            float r9 = r9 * r7
            float r9 = r9 / r1
            int r9 = (int) r9
            float r1 = r1 - r7
            int r4 = r4 - r9
            int r7 = r37.getPaddingTop()
            int r25 = r37.getPaddingBottom()
            int r25 = r25 + r7
            int r7 = r5.topMargin
            int r25 = r25 + r7
            int r7 = r5.bottomMargin
            int r7 = r25 + r7
            r25 = r1
            int r1 = r5.height
            r26 = r4
            r4 = r39
            int r1 = android.view.ViewGroup.getChildMeasureSpec(r4, r7, r1)
            int r7 = r5.width
            if (r7 != 0) goto L_0x0718
            r7 = 1073741824(0x40000000, float:2.0)
            if (r10 == r7) goto L_0x070c
            goto L_0x071a
        L_0x070c:
            if (r9 <= 0) goto L_0x070f
            goto L_0x0710
        L_0x070f:
            r9 = 0
        L_0x0710:
            int r9 = android.view.View.MeasureSpec.makeMeasureSpec(r9, r7)
            r15.measure(r9, r1)
            goto L_0x072a
        L_0x0718:
            r7 = 1073741824(0x40000000, float:2.0)
        L_0x071a:
            int r28 = r15.getMeasuredWidth()
            int r9 = r28 + r9
            if (r9 >= 0) goto L_0x0723
            r9 = 0
        L_0x0723:
            int r9 = android.view.View.MeasureSpec.makeMeasureSpec(r9, r7)
            r15.measure(r9, r1)
        L_0x072a:
            int r1 = r15.getMeasuredState()
            r7 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r1 = r1 & r7
            int r12 = android.view.View.combineMeasuredStates(r12, r1)
            r1 = r25
            r7 = r26
            goto L_0x073f
        L_0x073a:
            r7 = r4
            r22 = r9
            r4 = r39
        L_0x073f:
            if (r18 == 0) goto L_0x075a
            int r9 = r6.f9417f
            int r25 = r15.getMeasuredWidth()
            r26 = r1
            int r1 = r5.leftMargin
            int r25 = r25 + r1
            int r1 = r5.rightMargin
            int r25 = r25 + r1
            int r1 = r25 + r9
            r6.f9417f = r1
            r25 = r7
        L_0x0757:
            r1 = 1073741824(0x40000000, float:2.0)
            goto L_0x0772
        L_0x075a:
            r26 = r1
            int r1 = r6.f9417f
            int r9 = r15.getMeasuredWidth()
            int r9 = r9 + r1
            r25 = r7
            int r7 = r5.leftMargin
            int r9 = r9 + r7
            int r7 = r5.rightMargin
            int r9 = r9 + r7
            int r1 = java.lang.Math.max(r1, r9)
            r6.f9417f = r1
            goto L_0x0757
        L_0x0772:
            if (r11 == r1) goto L_0x077c
            int r1 = r5.height
            r7 = -1
            if (r1 != r7) goto L_0x077c
            r1 = r27
            goto L_0x077d
        L_0x077c:
            r1 = 0
        L_0x077d:
            int r7 = r5.topMargin
            int r9 = r5.bottomMargin
            int r7 = r7 + r9
            int r9 = r15.getMeasuredHeight()
            int r9 = r9 + r7
            int r2 = java.lang.Math.max(r2, r9)
            if (r1 == 0) goto L_0x078e
            goto L_0x078f
        L_0x078e:
            r7 = r9
        L_0x078f:
            int r0 = java.lang.Math.max(r0, r7)
            if (r19 == 0) goto L_0x079d
            int r1 = r5.height
            r7 = -1
            if (r1 != r7) goto L_0x079e
            r1 = r27
            goto L_0x079f
        L_0x079d:
            r7 = -1
        L_0x079e:
            r1 = 0
        L_0x079f:
            if (r30 == 0) goto L_0x07cb
            int r15 = r15.getBaseline()
            if (r15 == r7) goto L_0x07cb
            int r5 = r5.gravity
            if (r5 >= 0) goto L_0x07ad
            int r5 = r6.f9416e
        L_0x07ad:
            r5 = r5 & 112(0x70, float:1.57E-43)
            r23 = 4
            int r5 = r5 >> 4
            r28 = -2
            r5 = r5 & -2
            int r5 = r5 >> 1
            r7 = r13[r5]
            int r7 = java.lang.Math.max(r7, r15)
            r13[r5] = r7
            r7 = r14[r5]
            int r9 = r9 - r15
            int r7 = java.lang.Math.max(r7, r9)
            r14[r5] = r7
            goto L_0x07cf
        L_0x07cb:
            r23 = 4
            r28 = -2
        L_0x07cf:
            r19 = r1
            r7 = r25
            r1 = r26
        L_0x07d5:
            int r8 = r8 + 1
            r4 = r7
            r9 = r22
            r7 = r38
            goto L_0x06b2
        L_0x07de:
            r4 = r39
            r22 = r9
            int r1 = r6.f9417f
            int r5 = r37.getPaddingLeft()
            int r7 = r37.getPaddingRight()
            int r7 = r7 + r5
            int r7 = r7 + r1
            r6.f9417f = r7
            r1 = r13[r27]
            r5 = -1
            if (r1 != r5) goto L_0x0806
            r7 = 0
            r8 = r13[r7]
            if (r8 != r5) goto L_0x0806
            r7 = r13[r17]
            if (r7 != r5) goto L_0x0806
            r7 = 3
            r8 = r13[r7]
            if (r8 == r5) goto L_0x0804
            goto L_0x0807
        L_0x0804:
            r8 = 0
            goto L_0x0834
        L_0x0806:
            r7 = 3
        L_0x0807:
            r5 = r13[r7]
            r8 = 0
            r9 = r13[r8]
            r10 = r13[r17]
            int r1 = java.lang.Math.max(r1, r10)
            int r1 = java.lang.Math.max(r9, r1)
            int r1 = java.lang.Math.max(r5, r1)
            r5 = r14[r7]
            r7 = r14[r8]
            r9 = r14[r27]
            r10 = r14[r17]
            int r9 = java.lang.Math.max(r9, r10)
            int r7 = java.lang.Math.max(r7, r9)
            int r5 = java.lang.Math.max(r5, r7)
            int r5 = r5 + r1
            int r1 = java.lang.Math.max(r2, r5)
            r2 = r1
        L_0x0834:
            r25 = r12
        L_0x0836:
            if (r19 != 0) goto L_0x083d
            r1 = 1073741824(0x40000000, float:2.0)
            if (r11 == r1) goto L_0x083d
            goto L_0x083e
        L_0x083d:
            r0 = r2
        L_0x083e:
            int r1 = r37.getPaddingTop()
            int r2 = r37.getPaddingBottom()
            int r2 = r2 + r1
            int r2 = r2 + r0
            int r0 = r37.getSuggestedMinimumHeight()
            int r0 = java.lang.Math.max(r2, r0)
            r1 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r1 = r25 & r1
            r1 = r1 | r3
            int r2 = r25 << 16
            int r0 = android.view.View.resolveSizeAndState(r0, r4, r2)
            r6.setMeasuredDimension(r1, r0)
            if (r24 == 0) goto L_0x089f
            int r0 = r37.getMeasuredHeight()
            r1 = 1073741824(0x40000000, float:2.0)
            int r7 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r1)
            r9 = r22
        L_0x086c:
            if (r8 >= r9) goto L_0x089f
            android.view.View r1 = r6.getChildAt(r8)
            int r0 = r1.getVisibility()
            r10 = 8
            if (r0 == r10) goto L_0x089b
            android.view.ViewGroup$LayoutParams r0 = r1.getLayoutParams()
            r11 = r0
            k.x0 r11 = (k.C0747x0) r11
            int r0 = r11.height
            r12 = -1
            if (r0 != r12) goto L_0x089c
            int r13 = r11.width
            int r0 = r1.getMeasuredWidth()
            r11.width = r0
            r3 = 0
            r5 = 0
            r0 = r37
            r2 = r38
            r4 = r7
            r0.measureChildWithMargins(r1, r2, r3, r4, r5)
            r11.width = r13
            goto L_0x089c
        L_0x089b:
            r12 = -1
        L_0x089c:
            int r8 = r8 + 1
            goto L_0x086c
        L_0x089f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: k.C0749y0.onMeasure(int, int):void");
    }

    public void setBaselineAligned(boolean z3) {
        this.f9413a = z3;
    }

    public void setBaselineAlignedChildIndex(int i2) {
        if (i2 < 0 || i2 >= getChildCount()) {
            throw new IllegalArgumentException("base aligned child index out of range (0, " + getChildCount() + ")");
        }
        this.f9414b = i2;
    }

    public void setDividerDrawable(Drawable drawable) {
        if (drawable != this.f9422t) {
            this.f9422t = drawable;
            boolean z3 = false;
            if (drawable != null) {
                this.f9423u = drawable.getIntrinsicWidth();
                this.f9424v = drawable.getIntrinsicHeight();
            } else {
                this.f9423u = 0;
                this.f9424v = 0;
            }
            if (drawable == null) {
                z3 = true;
            }
            setWillNotDraw(z3);
            requestLayout();
        }
    }

    public void setDividerPadding(int i2) {
        this.f9426x = i2;
    }

    public void setGravity(int i2) {
        if (this.f9416e != i2) {
            if ((8388615 & i2) == 0) {
                i2 |= 8388611;
            }
            if ((i2 & 112) == 0) {
                i2 |= 48;
            }
            this.f9416e = i2;
            requestLayout();
        }
    }

    public void setHorizontalGravity(int i2) {
        int i5 = i2 & 8388615;
        int i6 = this.f9416e;
        if ((8388615 & i6) != i5) {
            this.f9416e = i5 | (-8388616 & i6);
            requestLayout();
        }
    }

    public void setMeasureWithLargestChildEnabled(boolean z3) {
        this.f9419q = z3;
    }

    public void setOrientation(int i2) {
        if (this.d != i2) {
            this.d = i2;
            requestLayout();
        }
    }

    public void setShowDividers(int i2) {
        if (i2 != this.f9425w) {
            requestLayout();
        }
        this.f9425w = i2;
    }

    public void setVerticalGravity(int i2) {
        int i5 = i2 & 112;
        int i6 = this.f9416e;
        if ((i6 & 112) != i5) {
            this.f9416e = i5 | (i6 & -113);
            requestLayout();
        }
    }

    public void setWeightSum(float f6) {
        this.f9418p = Math.max(0.0f, f6);
    }

    public final boolean shouldDelayChildPressedState() {
        return false;
    }
}
