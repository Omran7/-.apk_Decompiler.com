package k;

import Q.g;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListAdapter;
import android.widget.ListView;
import com.mtma.criminal.city.R;
import java.lang.reflect.InvocationTargetException;

/* renamed from: k.t0  reason: case insensitive filesystem */
public class C0739t0 extends ListView {

    /* renamed from: a  reason: collision with root package name */
    public final Rect f9378a = new Rect();

    /* renamed from: b  reason: collision with root package name */
    public int f9379b = 0;

    /* renamed from: c  reason: collision with root package name */
    public int f9380c = 0;
    public int d = 0;

    /* renamed from: e  reason: collision with root package name */
    public int f9381e = 0;

    /* renamed from: f  reason: collision with root package name */
    public int f9382f;

    /* renamed from: p  reason: collision with root package name */
    public C0733q0 f9383p;

    /* renamed from: q  reason: collision with root package name */
    public boolean f9384q;

    /* renamed from: r  reason: collision with root package name */
    public final boolean f9385r;

    /* renamed from: s  reason: collision with root package name */
    public boolean f9386s;

    /* renamed from: t  reason: collision with root package name */
    public g f9387t;

    /* renamed from: u  reason: collision with root package name */
    public C0737s0 f9388u;

    public C0739t0(Context context, boolean z3) {
        super(context, (AttributeSet) null, R.attr.dropDownListViewStyle);
        this.f9385r = z3;
        setCacheColorHint(0);
    }

    public final int a(int i2, int i5) {
        int i6;
        int listPaddingTop = getListPaddingTop();
        int listPaddingBottom = getListPaddingBottom();
        int dividerHeight = getDividerHeight();
        Drawable divider = getDivider();
        ListAdapter adapter = getAdapter();
        if (adapter == null) {
            return listPaddingTop + listPaddingBottom;
        }
        int i7 = listPaddingTop + listPaddingBottom;
        if (dividerHeight <= 0 || divider == null) {
            dividerHeight = 0;
        }
        int count = adapter.getCount();
        int i8 = 0;
        View view = null;
        for (int i9 = 0; i9 < count; i9++) {
            int itemViewType = adapter.getItemViewType(i9);
            if (itemViewType != i8) {
                view = null;
                i8 = itemViewType;
            }
            view = adapter.getView(i9, view, this);
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams == null) {
                layoutParams = generateDefaultLayoutParams();
                view.setLayoutParams(layoutParams);
            }
            int i10 = layoutParams.height;
            if (i10 > 0) {
                i6 = View.MeasureSpec.makeMeasureSpec(i10, 1073741824);
            } else {
                i6 = View.MeasureSpec.makeMeasureSpec(0, 0);
            }
            view.measure(i2, i6);
            view.forceLayout();
            if (i9 > 0) {
                i7 += dividerHeight;
            }
            i7 += view.getMeasuredHeight();
            if (i7 >= i5) {
                return i5;
            }
        }
        return i7;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0022  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x0160  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x0165  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x017a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean b(android.view.MotionEvent r17, int r18) {
        /*
            r16 = this;
            r1 = r16
            r2 = r17
            int r3 = r17.getActionMasked()
            r4 = 1
            r5 = 0
            if (r3 == r4) goto L_0x001a
            r0 = 2
            if (r3 == r0) goto L_0x0018
            r0 = 3
            if (r3 == r0) goto L_0x0015
            r0 = r4
            goto L_0x0146
        L_0x0015:
            r0 = r5
            goto L_0x0146
        L_0x0018:
            r0 = r4
            goto L_0x001b
        L_0x001a:
            r0 = r5
        L_0x001b:
            int r6 = r17.findPointerIndex(r18)
            if (r6 >= 0) goto L_0x0022
            goto L_0x0015
        L_0x0022:
            float r7 = r2.getX(r6)
            int r7 = (int) r7
            float r6 = r2.getY(r6)
            int r6 = (int) r6
            int r8 = r1.pointToPosition(r7, r6)
            r9 = -1
            if (r8 != r9) goto L_0x0036
            r5 = r4
            goto L_0x0146
        L_0x0036:
            int r0 = r16.getFirstVisiblePosition()
            int r0 = r8 - r0
            android.view.View r10 = r1.getChildAt(r0)
            float r7 = (float) r7
            float r6 = (float) r6
            r1.f9386s = r4
            int r0 = android.os.Build.VERSION.SDK_INT
            k.C0727n0.a(r1, r7, r6)
            boolean r11 = r16.isPressed()
            if (r11 != 0) goto L_0x0052
            r1.setPressed(r4)
        L_0x0052:
            r16.layoutChildren()
            int r11 = r1.f9382f
            if (r11 == r9) goto L_0x006f
            int r12 = r16.getFirstVisiblePosition()
            int r11 = r11 - r12
            android.view.View r11 = r1.getChildAt(r11)
            if (r11 == 0) goto L_0x006f
            if (r11 == r10) goto L_0x006f
            boolean r12 = r11.isPressed()
            if (r12 == 0) goto L_0x006f
            r11.setPressed(r5)
        L_0x006f:
            r1.f9382f = r8
            int r11 = r10.getLeft()
            float r11 = (float) r11
            float r11 = r7 - r11
            int r12 = r10.getTop()
            float r12 = (float) r12
            float r12 = r6 - r12
            k.C0727n0.a(r10, r11, r12)
            boolean r11 = r10.isPressed()
            if (r11 != 0) goto L_0x008b
            r10.setPressed(r4)
        L_0x008b:
            android.graphics.drawable.Drawable r11 = r16.getSelector()
            if (r11 == 0) goto L_0x0095
            if (r8 == r9) goto L_0x0095
            r12 = r4
            goto L_0x0096
        L_0x0095:
            r12 = r5
        L_0x0096:
            if (r12 == 0) goto L_0x009b
            r11.setVisible(r5, r5)
        L_0x009b:
            int r13 = r10.getLeft()
            int r14 = r10.getTop()
            int r15 = r10.getRight()
            int r5 = r10.getBottom()
            android.graphics.Rect r9 = r1.f9378a
            r9.set(r13, r14, r15, r5)
            int r5 = r9.left
            int r13 = r1.f9379b
            int r5 = r5 - r13
            r9.left = r5
            int r5 = r9.top
            int r13 = r1.f9380c
            int r5 = r5 - r13
            r9.top = r5
            int r5 = r9.right
            int r13 = r1.d
            int r5 = r5 + r13
            r9.right = r5
            int r5 = r9.bottom
            int r13 = r1.f9381e
            int r5 = r5 + r13
            r9.bottom = r5
            r5 = 33
            if (r0 < r5) goto L_0x00d5
            boolean r0 = k.C0731p0.a(r16)
            goto L_0x00e4
        L_0x00d5:
            java.lang.reflect.Field r0 = k.C0735r0.f9367a
            if (r0 == 0) goto L_0x00e3
            boolean r0 = r0.getBoolean(r1)     // Catch:{ IllegalAccessException -> 0x00de }
            goto L_0x00e4
        L_0x00de:
            r0 = move-exception
            r13 = r0
            r13.printStackTrace()
        L_0x00e3:
            r0 = 0
        L_0x00e4:
            boolean r13 = r10.isEnabled()
            if (r13 == r0) goto L_0x010a
            r0 = r0 ^ r4
            int r13 = android.os.Build.VERSION.SDK_INT
            if (r13 < r5) goto L_0x00f4
            k.C0731p0.b(r1, r0)
        L_0x00f2:
            r5 = -1
            goto L_0x0105
        L_0x00f4:
            java.lang.reflect.Field r5 = k.C0735r0.f9367a
            if (r5 == 0) goto L_0x00f2
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch:{ IllegalAccessException -> 0x0100 }
            r5.set(r1, r0)     // Catch:{ IllegalAccessException -> 0x0100 }
            goto L_0x00f2
        L_0x0100:
            r0 = move-exception
            r0.printStackTrace()
            goto L_0x00f2
        L_0x0105:
            if (r8 == r5) goto L_0x010a
            r16.refreshDrawableState()
        L_0x010a:
            if (r12 == 0) goto L_0x0125
            float r0 = r9.exactCenterX()
            float r5 = r9.exactCenterY()
            int r9 = r16.getVisibility()
            if (r9 != 0) goto L_0x011d
            r9 = r4
        L_0x011b:
            r12 = 0
            goto L_0x011f
        L_0x011d:
            r9 = 0
            goto L_0x011b
        L_0x011f:
            r11.setVisible(r9, r12)
            D.a.e(r11, r0, r5)
        L_0x0125:
            android.graphics.drawable.Drawable r0 = r16.getSelector()
            if (r0 == 0) goto L_0x0131
            r5 = -1
            if (r8 == r5) goto L_0x0131
            D.a.e(r0, r7, r6)
        L_0x0131:
            k.q0 r0 = r1.f9383p
            if (r0 == 0) goto L_0x0138
            r5 = 0
            r0.f9363b = r5
        L_0x0138:
            r16.refreshDrawableState()
            if (r3 != r4) goto L_0x0144
            long r5 = r1.getItemIdAtPosition(r8)
            r1.performItemClick(r10, r8, r5)
        L_0x0144:
            r0 = r4
            r5 = 0
        L_0x0146:
            if (r0 == 0) goto L_0x014a
            if (r5 == 0) goto L_0x0163
        L_0x014a:
            r3 = 0
            r1.f9386s = r3
            r1.setPressed(r3)
            r16.drawableStateChanged()
            int r5 = r1.f9382f
            int r6 = r16.getFirstVisiblePosition()
            int r5 = r5 - r6
            android.view.View r5 = r1.getChildAt(r5)
            if (r5 == 0) goto L_0x0163
            r5.setPressed(r3)
        L_0x0163:
            if (r0 == 0) goto L_0x017a
            Q.g r3 = r1.f9387t
            if (r3 != 0) goto L_0x0170
            Q.g r3 = new Q.g
            r3.<init>(r1)
            r1.f9387t = r3
        L_0x0170:
            Q.g r3 = r1.f9387t
            boolean r5 = r3.f2330y
            r3.f2330y = r4
            r3.onTouch(r1, r2)
            goto L_0x0188
        L_0x017a:
            Q.g r2 = r1.f9387t
            if (r2 == 0) goto L_0x0188
            boolean r3 = r2.f2330y
            if (r3 == 0) goto L_0x0185
            r2.d()
        L_0x0185:
            r3 = 0
            r2.f2330y = r3
        L_0x0188:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: k.C0739t0.b(android.view.MotionEvent, int):boolean");
    }

    public final void dispatchDraw(Canvas canvas) {
        Drawable selector;
        Rect rect = this.f9378a;
        if (!rect.isEmpty() && (selector = getSelector()) != null) {
            selector.setBounds(rect);
            selector.draw(canvas);
        }
        super.dispatchDraw(canvas);
    }

    public final void drawableStateChanged() {
        if (this.f9388u == null) {
            super.drawableStateChanged();
            C0733q0 q0Var = this.f9383p;
            if (q0Var != null) {
                q0Var.f9363b = true;
            }
            Drawable selector = getSelector();
            if (selector != null && this.f9386s && isPressed()) {
                selector.setState(getDrawableState());
            }
        }
    }

    public final boolean hasFocus() {
        if (this.f9385r || super.hasFocus()) {
            return true;
        }
        return false;
    }

    public final boolean hasWindowFocus() {
        if (this.f9385r || super.hasWindowFocus()) {
            return true;
        }
        return false;
    }

    public final boolean isFocused() {
        if (this.f9385r || super.isFocused()) {
            return true;
        }
        return false;
    }

    public final boolean isInTouchMode() {
        if ((!this.f9385r || !this.f9384q) && !super.isInTouchMode()) {
            return false;
        }
        return true;
    }

    public final void onDetachedFromWindow() {
        this.f9388u = null;
        super.onDetachedFromWindow();
    }

    public boolean onHoverEvent(MotionEvent motionEvent) {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 < 26) {
            return super.onHoverEvent(motionEvent);
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 10 && this.f9388u == null) {
            C0737s0 s0Var = new C0737s0(this, 0);
            this.f9388u = s0Var;
            post(s0Var);
        }
        boolean onHoverEvent = super.onHoverEvent(motionEvent);
        if (actionMasked == 9 || actionMasked == 7) {
            int pointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
            if (!(pointToPosition == -1 || pointToPosition == getSelectedItemPosition())) {
                View childAt = getChildAt(pointToPosition - getFirstVisiblePosition());
                if (childAt.isEnabled()) {
                    requestFocus();
                    if (i2 < 30 || !C0729o0.d) {
                        setSelectionFromTop(pointToPosition, childAt.getTop() - getTop());
                    } else {
                        try {
                            C0729o0.f9351a.invoke(this, new Object[]{Integer.valueOf(pointToPosition), childAt, Boolean.FALSE, -1, -1});
                            C0729o0.f9352b.invoke(this, new Object[]{Integer.valueOf(pointToPosition)});
                            C0729o0.f9353c.invoke(this, new Object[]{Integer.valueOf(pointToPosition)});
                        } catch (IllegalAccessException e6) {
                            e6.printStackTrace();
                        } catch (InvocationTargetException e7) {
                            e7.printStackTrace();
                        }
                    }
                }
                Drawable selector = getSelector();
                if (selector != null && this.f9386s && isPressed()) {
                    selector.setState(getDrawableState());
                }
            }
        } else {
            setSelection(-1);
        }
        return onHoverEvent;
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.f9382f = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
        }
        C0737s0 s0Var = this.f9388u;
        if (s0Var != null) {
            C0739t0 t0Var = (C0739t0) s0Var.f9372b;
            t0Var.f9388u = null;
            t0Var.removeCallbacks(s0Var);
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setListSelectionHidden(boolean z3) {
        this.f9384q = z3;
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [k.q0, android.graphics.drawable.Drawable$Callback, android.graphics.drawable.Drawable] */
    public void setSelector(Drawable drawable) {
        C0733q0 q0Var = null;
        if (drawable != null) {
            ? drawable2 = new Drawable();
            Drawable drawable3 = drawable2.f9362a;
            if (drawable3 != null) {
                drawable3.setCallback((Drawable.Callback) null);
            }
            drawable2.f9362a = drawable;
            drawable.setCallback(drawable2);
            drawable2.f9363b = true;
            q0Var = drawable2;
        }
        this.f9383p = q0Var;
        super.setSelector(q0Var);
        Rect rect = new Rect();
        if (drawable != null) {
            drawable.getPadding(rect);
        }
        this.f9379b = rect.left;
        this.f9380c = rect.top;
        this.d = rect.right;
        this.f9381e = rect.bottom;
    }
}
