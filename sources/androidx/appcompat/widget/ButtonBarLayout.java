package androidx.appcompat.widget;

import K.O;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import com.mtma.criminal.city.R;
import e.C0476a;
import java.util.WeakHashMap;

public class ButtonBarLayout extends LinearLayout {

    /* renamed from: a  reason: collision with root package name */
    public boolean f4777a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f4778b;

    /* renamed from: c  reason: collision with root package name */
    public int f4779c = -1;

    public ButtonBarLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        int[] iArr = C0476a.f7539k;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr);
        O.k(this, context, iArr, attributeSet, obtainStyledAttributes, 0);
        this.f4777a = obtainStyledAttributes.getBoolean(0, true);
        obtainStyledAttributes.recycle();
        if (getOrientation() == 1) {
            setStacked(this.f4777a);
        }
    }

    private void setStacked(boolean z3) {
        int i2;
        int i5;
        if (this.f4778b == z3) {
            return;
        }
        if (!z3 || this.f4777a) {
            this.f4778b = z3;
            setOrientation(z3 ? 1 : 0);
            if (z3) {
                i2 = 8388613;
            } else {
                i2 = 80;
            }
            setGravity(i2);
            View findViewById = findViewById(R.id.spacer);
            if (findViewById != null) {
                if (z3) {
                    i5 = 8;
                } else {
                    i5 = 4;
                }
                findViewById.setVisibility(i5);
            }
            for (int childCount = getChildCount() - 2; childCount >= 0; childCount--) {
                bringChildToFront(getChildAt(childCount));
            }
        }
    }

    public final void onMeasure(int i2, int i5) {
        boolean z3;
        int i6;
        int i7;
        int size = View.MeasureSpec.getSize(i2);
        int i8 = 0;
        if (this.f4777a) {
            if (size > this.f4779c && this.f4778b) {
                setStacked(false);
            }
            this.f4779c = size;
        }
        if (this.f4778b || View.MeasureSpec.getMode(i2) != 1073741824) {
            i6 = i2;
            z3 = false;
        } else {
            i6 = View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE);
            z3 = true;
        }
        super.onMeasure(i6, i5);
        if (this.f4777a && !this.f4778b && (getMeasuredWidthAndState() & -16777216) == 16777216) {
            setStacked(true);
            z3 = true;
        }
        if (z3) {
            super.onMeasure(i2, i5);
        }
        int childCount = getChildCount();
        int i9 = 0;
        while (true) {
            i7 = -1;
            if (i9 >= childCount) {
                i9 = -1;
                break;
            } else if (getChildAt(i9).getVisibility() == 0) {
                break;
            } else {
                i9++;
            }
        }
        if (i9 >= 0) {
            View childAt = getChildAt(i9);
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight() + getPaddingTop() + layoutParams.topMargin + layoutParams.bottomMargin;
            if (this.f4778b) {
                int i10 = i9 + 1;
                int childCount2 = getChildCount();
                while (true) {
                    if (i10 >= childCount2) {
                        break;
                    } else if (getChildAt(i10).getVisibility() == 0) {
                        i7 = i10;
                        break;
                    } else {
                        i10++;
                    }
                }
                if (i7 >= 0) {
                    i8 = getChildAt(i7).getPaddingTop() + ((int) (getResources().getDisplayMetrics().density * 16.0f)) + measuredHeight;
                } else {
                    i8 = measuredHeight;
                }
            } else {
                i8 = getPaddingBottom() + measuredHeight;
            }
        }
        WeakHashMap weakHashMap = O.f1352a;
        if (getMinimumHeight() != i8) {
            setMinimumHeight(i8);
            if (i5 == 0) {
                super.onMeasure(i2, i5);
            }
        }
    }

    public void setAllowStacking(boolean z3) {
        if (this.f4777a != z3) {
            this.f4777a = z3;
            if (!z3 && this.f4778b) {
                setStacked(false);
            }
            requestLayout();
        }
    }
}
