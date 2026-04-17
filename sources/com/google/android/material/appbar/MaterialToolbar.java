package com.google.android.material.appbar;

import H4.i;
import K.D;
import K.O;
import K1.e;
import Y1.a;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.Menu;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import com.bumptech.glide.d;
import com.mtma.criminal.city.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.WeakHashMap;
import m2.k;
import s2.g;
import x2.C1097a;

public class MaterialToolbar extends Toolbar {

    /* renamed from: i0  reason: collision with root package name */
    public static final ImageView.ScaleType[] f6273i0 = {ImageView.ScaleType.MATRIX, ImageView.ScaleType.FIT_XY, ImageView.ScaleType.FIT_START, ImageView.ScaleType.FIT_CENTER, ImageView.ScaleType.FIT_END, ImageView.ScaleType.CENTER, ImageView.ScaleType.CENTER_CROP, ImageView.ScaleType.CENTER_INSIDE};

    /* renamed from: d0  reason: collision with root package name */
    public Integer f6274d0;

    /* renamed from: e0  reason: collision with root package name */
    public boolean f6275e0;

    /* renamed from: f0  reason: collision with root package name */
    public boolean f6276f0;

    /* renamed from: g0  reason: collision with root package name */
    public ImageView.ScaleType f6277g0;

    /* renamed from: h0  reason: collision with root package name */
    public Boolean f6278h0;

    public MaterialToolbar(Context context, AttributeSet attributeSet) {
        super(C1097a.a(context, attributeSet, R.attr.toolbarStyle, 2131952746), attributeSet, 0);
        ColorStateList colorStateList;
        Context context2 = getContext();
        TypedArray f6 = k.f(context2, attributeSet, a.f4262s, R.attr.toolbarStyle, 2131952746, new int[0]);
        if (f6.hasValue(2)) {
            setNavigationIconTint(f6.getColor(2, -1));
        }
        this.f6275e0 = f6.getBoolean(4, false);
        this.f6276f0 = f6.getBoolean(3, false);
        int i2 = f6.getInt(1, -1);
        if (i2 >= 0) {
            ImageView.ScaleType[] scaleTypeArr = f6273i0;
            if (i2 < scaleTypeArr.length) {
                this.f6277g0 = scaleTypeArr[i2];
            }
        }
        if (f6.hasValue(0)) {
            this.f6278h0 = Boolean.valueOf(f6.getBoolean(0, false));
        }
        f6.recycle();
        Drawable background = getBackground();
        if (background == null) {
            colorStateList = ColorStateList.valueOf(0);
        } else {
            colorStateList = d.c0(background);
        }
        if (colorStateList != null) {
            g gVar = new g();
            gVar.j(colorStateList);
            gVar.h(context2);
            WeakHashMap weakHashMap = O.f1352a;
            gVar.i(D.i(this));
            setBackground(gVar);
        }
    }

    public ImageView.ScaleType getLogoScaleType() {
        return this.f6277g0;
    }

    public Integer getNavigationIconTint() {
        return this.f6274d0;
    }

    public final void m(int i2) {
        Menu menu = getMenu();
        boolean z3 = menu instanceof j.k;
        if (z3) {
            ((j.k) menu).w();
        }
        super.m(i2);
        if (z3) {
            ((j.k) menu).v();
        }
    }

    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        Drawable background = getBackground();
        if (background instanceof g) {
            e.q0(this, (g) background);
        }
    }

    public final void onLayout(boolean z3, int i2, int i5, int i6, int i7) {
        ImageView imageView;
        Drawable drawable;
        TextView textView;
        TextView textView2;
        super.onLayout(z3, i2, i5, i6, i7);
        int i8 = 0;
        ImageView imageView2 = null;
        if (this.f6275e0 || this.f6276f0) {
            ArrayList d = k.d(this, getTitle());
            boolean isEmpty = d.isEmpty();
            i iVar = k.f10150c;
            if (isEmpty) {
                textView = null;
            } else {
                textView = (TextView) Collections.min(d, iVar);
            }
            ArrayList d6 = k.d(this, getSubtitle());
            if (d6.isEmpty()) {
                textView2 = null;
            } else {
                textView2 = (TextView) Collections.max(d6, iVar);
            }
            if (!(textView == null && textView2 == null)) {
                int measuredWidth = getMeasuredWidth();
                int i9 = measuredWidth / 2;
                int paddingLeft = getPaddingLeft();
                int paddingRight = measuredWidth - getPaddingRight();
                for (int i10 = 0; i10 < getChildCount(); i10++) {
                    View childAt = getChildAt(i10);
                    if (!(childAt.getVisibility() == 8 || childAt == textView || childAt == textView2)) {
                        if (childAt.getRight() < i9 && childAt.getRight() > paddingLeft) {
                            paddingLeft = childAt.getRight();
                        }
                        if (childAt.getLeft() > i9 && childAt.getLeft() < paddingRight) {
                            paddingRight = childAt.getLeft();
                        }
                    }
                }
                Pair pair = new Pair(Integer.valueOf(paddingLeft), Integer.valueOf(paddingRight));
                if (this.f6275e0 && textView != null) {
                    v(textView, pair);
                }
                if (this.f6276f0 && textView2 != null) {
                    v(textView2, pair);
                }
            }
        }
        Drawable logo = getLogo();
        if (logo != null) {
            while (true) {
                if (i8 >= getChildCount()) {
                    break;
                }
                View childAt2 = getChildAt(i8);
                if ((childAt2 instanceof ImageView) && (drawable = imageView.getDrawable()) != null && drawable.getConstantState() != null && drawable.getConstantState().equals(logo.getConstantState())) {
                    imageView2 = (ImageView) childAt2;
                    break;
                }
                i8++;
            }
        }
        if (imageView2 != null) {
            Boolean bool = this.f6278h0;
            if (bool != null) {
                imageView2.setAdjustViewBounds(bool.booleanValue());
            }
            ImageView.ScaleType scaleType = this.f6277g0;
            if (scaleType != null) {
                imageView2.setScaleType(scaleType);
            }
        }
    }

    public void setElevation(float f6) {
        super.setElevation(f6);
        Drawable background = getBackground();
        if (background instanceof g) {
            ((g) background).i(f6);
        }
    }

    public void setLogoAdjustViewBounds(boolean z3) {
        Boolean bool = this.f6278h0;
        if (bool == null || bool.booleanValue() != z3) {
            this.f6278h0 = Boolean.valueOf(z3);
            requestLayout();
        }
    }

    public void setLogoScaleType(ImageView.ScaleType scaleType) {
        if (this.f6277g0 != scaleType) {
            this.f6277g0 = scaleType;
            requestLayout();
        }
    }

    public void setNavigationIcon(Drawable drawable) {
        if (!(drawable == null || this.f6274d0 == null)) {
            drawable = drawable.mutate();
            D.a.g(drawable, this.f6274d0.intValue());
        }
        super.setNavigationIcon(drawable);
    }

    public void setNavigationIconTint(int i2) {
        this.f6274d0 = Integer.valueOf(i2);
        Drawable navigationIcon = getNavigationIcon();
        if (navigationIcon != null) {
            setNavigationIcon(navigationIcon);
        }
    }

    public void setSubtitleCentered(boolean z3) {
        if (this.f6276f0 != z3) {
            this.f6276f0 = z3;
            requestLayout();
        }
    }

    public void setTitleCentered(boolean z3) {
        if (this.f6275e0 != z3) {
            this.f6275e0 = z3;
            requestLayout();
        }
    }

    public final void v(TextView textView, Pair pair) {
        int measuredWidth = getMeasuredWidth();
        int measuredWidth2 = textView.getMeasuredWidth();
        int i2 = (measuredWidth / 2) - (measuredWidth2 / 2);
        int i5 = measuredWidth2 + i2;
        int max = Math.max(Math.max(((Integer) pair.first).intValue() - i2, 0), Math.max(i5 - ((Integer) pair.second).intValue(), 0));
        if (max > 0) {
            i2 += max;
            i5 -= max;
            textView.measure(View.MeasureSpec.makeMeasureSpec(i5 - i2, 1073741824), textView.getMeasuredHeightAndState());
        }
        textView.layout(i2, textView.getTop(), i5, textView.getBottom());
    }
}
