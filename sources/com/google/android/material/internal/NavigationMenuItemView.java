package com.google.android.material.internal;

import B.p;
import D.a;
import K.O;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.CheckedTextView;
import android.widget.FrameLayout;
import com.bumptech.glide.c;
import com.google.android.material.datepicker.i;
import com.mtma.criminal.city.R;
import j.m;
import j.x;
import java.util.WeakHashMap;
import k.C0747x0;
import m2.d;

public class NavigationMenuItemView extends d implements x {

    /* renamed from: P  reason: collision with root package name */
    public static final int[] f6472P = {16842912};

    /* renamed from: E  reason: collision with root package name */
    public int f6473E;
    public boolean F;

    /* renamed from: G  reason: collision with root package name */
    public boolean f6474G;

    /* renamed from: H  reason: collision with root package name */
    public final boolean f6475H = true;

    /* renamed from: I  reason: collision with root package name */
    public final CheckedTextView f6476I;

    /* renamed from: J  reason: collision with root package name */
    public FrameLayout f6477J;

    /* renamed from: K  reason: collision with root package name */
    public m f6478K;

    /* renamed from: L  reason: collision with root package name */
    public ColorStateList f6479L;

    /* renamed from: M  reason: collision with root package name */
    public boolean f6480M;

    /* renamed from: N  reason: collision with root package name */
    public Drawable f6481N;

    /* renamed from: O  reason: collision with root package name */
    public final i f6482O;

    public NavigationMenuItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        i iVar = new i(this, 4);
        this.f6482O = iVar;
        setOrientation(0);
        LayoutInflater.from(context).inflate(R.layout.design_navigation_menu_item, this, true);
        setIconSize(context.getResources().getDimensionPixelSize(R.dimen.design_navigation_icon_size));
        CheckedTextView checkedTextView = (CheckedTextView) findViewById(R.id.design_menu_item_text);
        this.f6476I = checkedTextView;
        checkedTextView.setDuplicateParentStateEnabled(true);
        O.l(checkedTextView, iVar);
    }

    private void setActionView(View view) {
        if (view != null) {
            if (this.f6477J == null) {
                this.f6477J = (FrameLayout) ((ViewStub) findViewById(R.id.design_menu_item_action_area_stub)).inflate();
            }
            if (view.getParent() != null) {
                ((ViewGroup) view.getParent()).removeView(view);
            }
            this.f6477J.removeAllViews();
            this.f6477J.addView(view);
        }
    }

    public final void b(m mVar) {
        int i2;
        StateListDrawable stateListDrawable;
        this.f6478K = mVar;
        int i5 = mVar.f8756a;
        if (i5 > 0) {
            setId(i5);
        }
        if (mVar.isVisible()) {
            i2 = 0;
        } else {
            i2 = 8;
        }
        setVisibility(i2);
        if (getBackground() == null) {
            TypedValue typedValue = new TypedValue();
            if (getContext().getTheme().resolveAttribute(R.attr.colorControlHighlight, typedValue, true)) {
                stateListDrawable = new StateListDrawable();
                stateListDrawable.addState(f6472P, new ColorDrawable(typedValue.data));
                stateListDrawable.addState(ViewGroup.EMPTY_STATE_SET, new ColorDrawable(0));
            } else {
                stateListDrawable = null;
            }
            WeakHashMap weakHashMap = O.f1352a;
            setBackground(stateListDrawable);
        }
        setCheckable(mVar.isCheckable());
        setChecked(mVar.isChecked());
        setEnabled(mVar.isEnabled());
        setTitle(mVar.f8759e);
        setIcon(mVar.getIcon());
        setActionView(mVar.getActionView());
        setContentDescription(mVar.f8771z);
        c.o0(this, mVar.f8745A);
        m mVar2 = this.f6478K;
        CharSequence charSequence = mVar2.f8759e;
        CheckedTextView checkedTextView = this.f6476I;
        if (charSequence == null && mVar2.getIcon() == null && this.f6478K.getActionView() != null) {
            checkedTextView.setVisibility(8);
            FrameLayout frameLayout = this.f6477J;
            if (frameLayout != null) {
                C0747x0 x0Var = (C0747x0) frameLayout.getLayoutParams();
                x0Var.width = -1;
                this.f6477J.setLayoutParams(x0Var);
                return;
            }
            return;
        }
        checkedTextView.setVisibility(0);
        FrameLayout frameLayout2 = this.f6477J;
        if (frameLayout2 != null) {
            C0747x0 x0Var2 = (C0747x0) frameLayout2.getLayoutParams();
            x0Var2.width = -2;
            this.f6477J.setLayoutParams(x0Var2);
        }
    }

    public m getItemData() {
        return this.f6478K;
    }

    public final int[] onCreateDrawableState(int i2) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i2 + 1);
        m mVar = this.f6478K;
        if (mVar != null && mVar.isCheckable() && this.f6478K.isChecked()) {
            View.mergeDrawableStates(onCreateDrawableState, f6472P);
        }
        return onCreateDrawableState;
    }

    public void setCheckable(boolean z3) {
        refreshDrawableState();
        if (this.f6474G != z3) {
            this.f6474G = z3;
            this.f6482O.h(this.f6476I, 2048);
        }
    }

    public void setChecked(boolean z3) {
        int i2;
        refreshDrawableState();
        CheckedTextView checkedTextView = this.f6476I;
        checkedTextView.setChecked(z3);
        Typeface typeface = checkedTextView.getTypeface();
        if (!z3 || !this.f6475H) {
            i2 = 0;
        } else {
            i2 = 1;
        }
        checkedTextView.setTypeface(typeface, i2);
    }

    public void setHorizontalPadding(int i2) {
        setPadding(i2, getPaddingTop(), i2, getPaddingBottom());
    }

    public void setIcon(Drawable drawable) {
        if (drawable != null) {
            if (this.f6480M) {
                Drawable.ConstantState constantState = drawable.getConstantState();
                if (constantState != null) {
                    drawable = constantState.newDrawable();
                }
                drawable = drawable.mutate();
                a.h(drawable, this.f6479L);
            }
            int i2 = this.f6473E;
            drawable.setBounds(0, 0, i2, i2);
        } else if (this.F) {
            if (this.f6481N == null) {
                Resources resources = getResources();
                Resources.Theme theme = getContext().getTheme();
                ThreadLocal threadLocal = p.f164a;
                Drawable a6 = B.i.a(resources, R.drawable.navigation_empty_icon, theme);
                this.f6481N = a6;
                if (a6 != null) {
                    int i5 = this.f6473E;
                    a6.setBounds(0, 0, i5, i5);
                }
            }
            drawable = this.f6481N;
        }
        this.f6476I.setCompoundDrawablesRelative(drawable, (Drawable) null, (Drawable) null, (Drawable) null);
    }

    public void setIconPadding(int i2) {
        this.f6476I.setCompoundDrawablePadding(i2);
    }

    public void setIconSize(int i2) {
        this.f6473E = i2;
    }

    public void setIconTintList(ColorStateList colorStateList) {
        boolean z3;
        this.f6479L = colorStateList;
        if (colorStateList != null) {
            z3 = true;
        } else {
            z3 = false;
        }
        this.f6480M = z3;
        m mVar = this.f6478K;
        if (mVar != null) {
            setIcon(mVar.getIcon());
        }
    }

    public void setMaxLines(int i2) {
        this.f6476I.setMaxLines(i2);
    }

    public void setNeedsEmptyIcon(boolean z3) {
        this.F = z3;
    }

    public void setTextAppearance(int i2) {
        this.f6476I.setTextAppearance(i2);
    }

    public void setTextColor(ColorStateList colorStateList) {
        this.f6476I.setTextColor(colorStateList);
    }

    public void setTitle(CharSequence charSequence) {
        this.f6476I.setText(charSequence);
    }
}
