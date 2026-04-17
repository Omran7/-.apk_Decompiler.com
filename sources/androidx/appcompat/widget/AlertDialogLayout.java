package androidx.appcompat.widget;

import K.O;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.mtma.criminal.city.R;
import java.util.WeakHashMap;
import k.C0747x0;
import k.C0749y0;

public class AlertDialogLayout extends C0749y0 {
    public AlertDialogLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public static int j(View view) {
        WeakHashMap weakHashMap = O.f1352a;
        int minimumHeight = view.getMinimumHeight();
        if (minimumHeight > 0) {
            return minimumHeight;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            if (viewGroup.getChildCount() == 1) {
                return j(viewGroup.getChildAt(0));
            }
        }
        return 0;
    }

    /* JADX WARNING: Removed duplicated region for block: B:29:0x009e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onLayout(boolean r10, int r11, int r12, int r13, int r14) {
        /*
            r9 = this;
            int r10 = r9.getPaddingLeft()
            int r13 = r13 - r11
            int r11 = r9.getPaddingRight()
            int r11 = r13 - r11
            int r13 = r13 - r10
            int r0 = r9.getPaddingRight()
            int r13 = r13 - r0
            int r0 = r9.getMeasuredHeight()
            int r1 = r9.getChildCount()
            int r2 = r9.getGravity()
            r3 = r2 & 112(0x70, float:1.57E-43)
            r4 = 8388615(0x800007, float:1.1754953E-38)
            r2 = r2 & r4
            r4 = 16
            if (r3 == r4) goto L_0x0039
            r4 = 80
            if (r3 == r4) goto L_0x0030
            int r12 = r9.getPaddingTop()
            goto L_0x0043
        L_0x0030:
            int r3 = r9.getPaddingTop()
            int r3 = r3 + r14
            int r3 = r3 - r12
            int r12 = r3 - r0
            goto L_0x0043
        L_0x0039:
            int r3 = r9.getPaddingTop()
            int r14 = r14 - r12
            int r14 = r14 - r0
            int r14 = r14 / 2
            int r12 = r14 + r3
        L_0x0043:
            android.graphics.drawable.Drawable r14 = r9.getDividerDrawable()
            r0 = 0
            if (r14 != 0) goto L_0x004c
            r14 = r0
            goto L_0x0050
        L_0x004c:
            int r14 = r14.getIntrinsicHeight()
        L_0x0050:
            if (r0 >= r1) goto L_0x00b0
            android.view.View r3 = r9.getChildAt(r0)
            if (r3 == 0) goto L_0x00ad
            int r4 = r3.getVisibility()
            r5 = 8
            if (r4 == r5) goto L_0x00ad
            int r4 = r3.getMeasuredWidth()
            int r5 = r3.getMeasuredHeight()
            android.view.ViewGroup$LayoutParams r6 = r3.getLayoutParams()
            k.x0 r6 = (k.C0747x0) r6
            int r7 = r6.gravity
            if (r7 >= 0) goto L_0x0073
            r7 = r2
        L_0x0073:
            int r8 = r9.getLayoutDirection()
            int r7 = android.view.Gravity.getAbsoluteGravity(r7, r8)
            r7 = r7 & 7
            r8 = 1
            if (r7 == r8) goto L_0x008d
            r8 = 5
            if (r7 == r8) goto L_0x0087
            int r7 = r6.leftMargin
            int r7 = r7 + r10
            goto L_0x0098
        L_0x0087:
            int r7 = r11 - r4
            int r8 = r6.rightMargin
        L_0x008b:
            int r7 = r7 - r8
            goto L_0x0098
        L_0x008d:
            int r7 = r13 - r4
            int r7 = r7 / 2
            int r7 = r7 + r10
            int r8 = r6.leftMargin
            int r7 = r7 + r8
            int r8 = r6.rightMargin
            goto L_0x008b
        L_0x0098:
            boolean r8 = r9.i(r0)
            if (r8 == 0) goto L_0x009f
            int r12 = r12 + r14
        L_0x009f:
            int r8 = r6.topMargin
            int r12 = r12 + r8
            int r4 = r4 + r7
            int r8 = r12 + r5
            r3.layout(r7, r12, r4, r8)
            int r3 = r6.bottomMargin
            int r5 = r5 + r3
            int r5 = r5 + r12
            r12 = r5
        L_0x00ad:
            int r0 = r0 + 1
            goto L_0x0050
        L_0x00b0:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.AlertDialogLayout.onLayout(boolean, int, int, int, int):void");
    }

    public final void onMeasure(int i2, int i5) {
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11 = i2;
        int childCount = getChildCount();
        View view = null;
        View view2 = null;
        View view3 = null;
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt = getChildAt(i12);
            if (childAt.getVisibility() != 8) {
                int id = childAt.getId();
                if (id == R.id.topPanel) {
                    view = childAt;
                } else if (id == R.id.buttonPanel) {
                    view2 = childAt;
                } else if ((id == R.id.contentPanel || id == R.id.customPanel) && view3 == null) {
                    view3 = childAt;
                } else {
                    super.onMeasure(i2, i5);
                    return;
                }
            }
        }
        int mode = View.MeasureSpec.getMode(i5);
        int size = View.MeasureSpec.getSize(i5);
        int mode2 = View.MeasureSpec.getMode(i2);
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        if (view != null) {
            view.measure(i11, 0);
            paddingBottom += view.getMeasuredHeight();
            i6 = View.combineMeasuredStates(0, view.getMeasuredState());
        } else {
            i6 = 0;
        }
        if (view2 != null) {
            view2.measure(i11, 0);
            i8 = j(view2);
            i7 = view2.getMeasuredHeight() - i8;
            paddingBottom += i8;
            i6 = View.combineMeasuredStates(i6, view2.getMeasuredState());
        } else {
            i8 = 0;
            i7 = 0;
        }
        if (view3 != null) {
            if (mode == 0) {
                i10 = 0;
            } else {
                i10 = View.MeasureSpec.makeMeasureSpec(Math.max(0, size - paddingBottom), mode);
            }
            view3.measure(i11, i10);
            i9 = view3.getMeasuredHeight();
            paddingBottom += i9;
            i6 = View.combineMeasuredStates(i6, view3.getMeasuredState());
        } else {
            i9 = 0;
        }
        int i13 = size - paddingBottom;
        if (view2 != null) {
            int i14 = paddingBottom - i8;
            int min = Math.min(i13, i7);
            if (min > 0) {
                i13 -= min;
                i8 += min;
            }
            view2.measure(i11, View.MeasureSpec.makeMeasureSpec(i8, 1073741824));
            paddingBottom = i14 + view2.getMeasuredHeight();
            i6 = View.combineMeasuredStates(i6, view2.getMeasuredState());
        }
        if (view3 != null && i13 > 0) {
            view3.measure(i11, View.MeasureSpec.makeMeasureSpec(i9 + i13, mode));
            paddingBottom = (paddingBottom - i9) + view3.getMeasuredHeight();
            i6 = View.combineMeasuredStates(i6, view3.getMeasuredState());
        }
        int i15 = 0;
        for (int i16 = 0; i16 < childCount; i16++) {
            View childAt2 = getChildAt(i16);
            if (childAt2.getVisibility() != 8) {
                i15 = Math.max(i15, childAt2.getMeasuredWidth());
            }
        }
        setMeasuredDimension(View.resolveSizeAndState(getPaddingRight() + getPaddingLeft() + i15, i11, i6), View.resolveSizeAndState(paddingBottom, i5, 0));
        if (mode2 != 1073741824) {
            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824);
            for (int i17 = 0; i17 < childCount; i17++) {
                View childAt3 = getChildAt(i17);
                if (childAt3.getVisibility() != 8) {
                    C0747x0 x0Var = (C0747x0) childAt3.getLayoutParams();
                    if (x0Var.width == -1) {
                        int i18 = x0Var.height;
                        x0Var.height = childAt3.getMeasuredHeight();
                        measureChildWithMargins(childAt3, makeMeasureSpec, 0, i5, 0);
                        x0Var.height = i18;
                    }
                }
            }
        }
    }
}
