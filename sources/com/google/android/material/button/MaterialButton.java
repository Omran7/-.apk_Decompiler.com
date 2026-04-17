package com.google.android.material.button;

import A.h;
import K.O;
import K1.e;
import R2.b;
import T.c;
import Y1.a;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Parcelable;
import android.text.Layout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import android.widget.Checkable;
import android.widget.CompoundButton;
import com.bumptech.glide.d;
import com.mtma.criminal.city.R;
import com.mtma.criminal.city.fragments.gangBase.I;
import e2.C0485a;
import e2.C0486b;
import e2.C0487c;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.WeakHashMap;
import k.C0732q;
import m2.k;
import q2.C0935a;
import s2.C0962a;
import s2.j;
import s2.v;
import x2.C1097a;

public class MaterialButton extends C0732q implements Checkable, v {

    /* renamed from: A  reason: collision with root package name */
    public static final int[] f6341A = {16842911};

    /* renamed from: B  reason: collision with root package name */
    public static final int[] f6342B = {16842912};
    public final C0487c d;

    /* renamed from: e  reason: collision with root package name */
    public final LinkedHashSet f6343e = new LinkedHashSet();

    /* renamed from: f  reason: collision with root package name */
    public C0485a f6344f;

    /* renamed from: p  reason: collision with root package name */
    public PorterDuff.Mode f6345p;

    /* renamed from: q  reason: collision with root package name */
    public ColorStateList f6346q;

    /* renamed from: r  reason: collision with root package name */
    public Drawable f6347r;

    /* renamed from: s  reason: collision with root package name */
    public String f6348s;

    /* renamed from: t  reason: collision with root package name */
    public int f6349t;

    /* renamed from: u  reason: collision with root package name */
    public int f6350u;

    /* renamed from: v  reason: collision with root package name */
    public int f6351v;

    /* renamed from: w  reason: collision with root package name */
    public int f6352w;

    /* renamed from: x  reason: collision with root package name */
    public boolean f6353x;

    /* renamed from: y  reason: collision with root package name */
    public boolean f6354y;

    /* renamed from: z  reason: collision with root package name */
    public int f6355z;

    public MaterialButton(Context context, AttributeSet attributeSet) {
        super(C1097a.a(context, attributeSet, R.attr.materialButtonStyle, 2131952646), attributeSet, R.attr.materialButtonStyle);
        boolean z3 = false;
        this.f6353x = false;
        this.f6354y = false;
        Context context2 = getContext();
        TypedArray f6 = k.f(context2, attributeSet, a.f4253j, R.attr.materialButtonStyle, 2131952646, new int[0]);
        this.f6352w = f6.getDimensionPixelSize(12, 0);
        int i2 = f6.getInt(15, -1);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        this.f6345p = k.g(i2, mode);
        this.f6346q = d.a0(getContext(), f6, 14);
        this.f6347r = d.k0(getContext(), f6, 10);
        this.f6355z = f6.getInteger(11, 1);
        this.f6349t = f6.getDimensionPixelSize(13, 0);
        C0487c cVar = new C0487c(this, s2.k.b(context2, attributeSet, R.attr.materialButtonStyle, 2131952646).a());
        this.d = cVar;
        cVar.f7577c = f6.getDimensionPixelOffset(1, 0);
        cVar.d = f6.getDimensionPixelOffset(2, 0);
        cVar.f7578e = f6.getDimensionPixelOffset(3, 0);
        cVar.f7579f = f6.getDimensionPixelOffset(4, 0);
        if (f6.hasValue(8)) {
            int dimensionPixelSize = f6.getDimensionPixelSize(8, -1);
            cVar.g = dimensionPixelSize;
            float f7 = (float) dimensionPixelSize;
            j e6 = cVar.f7576b.e();
            e6.f11479e = new C0962a(f7);
            e6.f11480f = new C0962a(f7);
            e6.g = new C0962a(f7);
            e6.h = new C0962a(f7);
            cVar.c(e6.a());
            cVar.f7587p = true;
        }
        cVar.h = f6.getDimensionPixelSize(20, 0);
        cVar.f7580i = k.g(f6.getInt(7, -1), mode);
        cVar.f7581j = d.a0(getContext(), f6, 6);
        cVar.f7582k = d.a0(getContext(), f6, 19);
        cVar.f7583l = d.a0(getContext(), f6, 16);
        cVar.f7588q = f6.getBoolean(5, false);
        cVar.f7591t = f6.getDimensionPixelSize(9, 0);
        cVar.f7589r = f6.getBoolean(21, true);
        WeakHashMap weakHashMap = O.f1352a;
        int paddingStart = getPaddingStart();
        int paddingTop = getPaddingTop();
        int paddingEnd = getPaddingEnd();
        int paddingBottom = getPaddingBottom();
        if (f6.hasValue(0)) {
            cVar.f7586o = true;
            setSupportBackgroundTintList(cVar.f7581j);
            setSupportBackgroundTintMode(cVar.f7580i);
        } else {
            cVar.e();
        }
        setPaddingRelative(paddingStart + cVar.f7577c, paddingTop + cVar.f7578e, paddingEnd + cVar.d, paddingBottom + cVar.f7579f);
        f6.recycle();
        setCompoundDrawablePadding(this.f6352w);
        d(this.f6347r != null ? true : z3);
    }

    private Layout.Alignment getActualTextAlignment() {
        int textAlignment = getTextAlignment();
        if (textAlignment == 1) {
            return getGravityTextAlignment();
        }
        if (textAlignment == 6 || textAlignment == 3) {
            return Layout.Alignment.ALIGN_OPPOSITE;
        }
        if (textAlignment != 4) {
            return Layout.Alignment.ALIGN_NORMAL;
        }
        return Layout.Alignment.ALIGN_CENTER;
    }

    private Layout.Alignment getGravityTextAlignment() {
        int gravity = getGravity() & 8388615;
        if (gravity == 1) {
            return Layout.Alignment.ALIGN_CENTER;
        }
        if (gravity == 5 || gravity == 8388613) {
            return Layout.Alignment.ALIGN_OPPOSITE;
        }
        return Layout.Alignment.ALIGN_NORMAL;
    }

    private int getTextHeight() {
        if (getLineCount() > 1) {
            return getLayout().getHeight();
        }
        TextPaint paint = getPaint();
        String charSequence = getText().toString();
        if (getTransformationMethod() != null) {
            charSequence = getTransformationMethod().getTransformation(charSequence, this).toString();
        }
        Rect rect = new Rect();
        paint.getTextBounds(charSequence, 0, charSequence.length(), rect);
        return Math.min(rect.height(), getLayout().getHeight());
    }

    private int getTextLayoutWidth() {
        int lineCount = getLineCount();
        float f6 = 0.0f;
        for (int i2 = 0; i2 < lineCount; i2++) {
            f6 = Math.max(f6, getLayout().getLineWidth(i2));
        }
        return (int) Math.ceil((double) f6);
    }

    public final boolean a() {
        C0487c cVar = this.d;
        if (cVar == null || !cVar.f7588q) {
            return false;
        }
        return true;
    }

    public final boolean b() {
        C0487c cVar = this.d;
        if (cVar == null || cVar.f7586o) {
            return false;
        }
        return true;
    }

    public final void c() {
        int i2 = this.f6355z;
        boolean z3 = true;
        if (!(i2 == 1 || i2 == 2)) {
            z3 = false;
        }
        if (z3) {
            setCompoundDrawablesRelative(this.f6347r, (Drawable) null, (Drawable) null, (Drawable) null);
        } else if (i2 == 3 || i2 == 4) {
            setCompoundDrawablesRelative((Drawable) null, (Drawable) null, this.f6347r, (Drawable) null);
        } else if (i2 == 16 || i2 == 32) {
            setCompoundDrawablesRelative((Drawable) null, this.f6347r, (Drawable) null, (Drawable) null);
        }
    }

    public final void d(boolean z3) {
        Drawable drawable = this.f6347r;
        if (drawable != null) {
            Drawable mutate = drawable.mutate();
            this.f6347r = mutate;
            D.a.h(mutate, this.f6346q);
            PorterDuff.Mode mode = this.f6345p;
            if (mode != null) {
                D.a.i(this.f6347r, mode);
            }
            int i2 = this.f6349t;
            if (i2 == 0) {
                i2 = this.f6347r.getIntrinsicWidth();
            }
            int i5 = this.f6349t;
            if (i5 == 0) {
                i5 = this.f6347r.getIntrinsicHeight();
            }
            Drawable drawable2 = this.f6347r;
            int i6 = this.f6350u;
            int i7 = this.f6351v;
            drawable2.setBounds(i6, i7, i2 + i6, i5 + i7);
            this.f6347r.setVisible(true, z3);
        }
        if (z3) {
            c();
            return;
        }
        Drawable[] compoundDrawablesRelative = getCompoundDrawablesRelative();
        Drawable drawable3 = compoundDrawablesRelative[0];
        Drawable drawable4 = compoundDrawablesRelative[1];
        Drawable drawable5 = compoundDrawablesRelative[2];
        int i8 = this.f6355z;
        if (((i8 == 1 || i8 == 2) && drawable3 != this.f6347r) || (((i8 == 3 || i8 == 4) && drawable5 != this.f6347r) || ((i8 == 16 || i8 == 32) && drawable4 != this.f6347r))) {
            c();
        }
    }

    public final void e(int i2, int i5) {
        boolean z3;
        boolean z4;
        if (this.f6347r != null && getLayout() != null) {
            int i6 = this.f6355z;
            boolean z5 = true;
            if (i6 == 1 || i6 == 2) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (z3 || i6 == 3 || i6 == 4) {
                this.f6351v = 0;
                Layout.Alignment actualTextAlignment = getActualTextAlignment();
                int i7 = this.f6355z;
                if (i7 == 1 || i7 == 3 || ((i7 == 2 && actualTextAlignment == Layout.Alignment.ALIGN_NORMAL) || (i7 == 4 && actualTextAlignment == Layout.Alignment.ALIGN_OPPOSITE))) {
                    this.f6350u = 0;
                    d(false);
                    return;
                }
                int i8 = this.f6349t;
                if (i8 == 0) {
                    i8 = this.f6347r.getIntrinsicWidth();
                }
                int textLayoutWidth = i2 - getTextLayoutWidth();
                WeakHashMap weakHashMap = O.f1352a;
                int paddingEnd = (((textLayoutWidth - getPaddingEnd()) - i8) - this.f6352w) - getPaddingStart();
                if (actualTextAlignment == Layout.Alignment.ALIGN_CENTER) {
                    paddingEnd /= 2;
                }
                if (getLayoutDirection() == 1) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (this.f6355z != 4) {
                    z5 = false;
                }
                if (z4 != z5) {
                    paddingEnd = -paddingEnd;
                }
                if (this.f6350u != paddingEnd) {
                    this.f6350u = paddingEnd;
                    d(false);
                }
            } else if (i6 == 16 || i6 == 32) {
                this.f6350u = 0;
                if (i6 == 16) {
                    this.f6351v = 0;
                    d(false);
                    return;
                }
                int i9 = this.f6349t;
                if (i9 == 0) {
                    i9 = this.f6347r.getIntrinsicHeight();
                }
                int max = Math.max(0, (((((i5 - getTextHeight()) - getPaddingTop()) - i9) - this.f6352w) - getPaddingBottom()) / 2);
                if (this.f6351v != max) {
                    this.f6351v = max;
                    d(false);
                }
            }
        }
    }

    public String getA11yClassName() {
        Class cls;
        if (!TextUtils.isEmpty(this.f6348s)) {
            return this.f6348s;
        }
        if (a()) {
            cls = CompoundButton.class;
        } else {
            cls = Button.class;
        }
        return cls.getName();
    }

    public ColorStateList getBackgroundTintList() {
        return getSupportBackgroundTintList();
    }

    public PorterDuff.Mode getBackgroundTintMode() {
        return getSupportBackgroundTintMode();
    }

    public int getCornerRadius() {
        if (b()) {
            return this.d.g;
        }
        return 0;
    }

    public Drawable getIcon() {
        return this.f6347r;
    }

    public int getIconGravity() {
        return this.f6355z;
    }

    public int getIconPadding() {
        return this.f6352w;
    }

    public int getIconSize() {
        return this.f6349t;
    }

    public ColorStateList getIconTint() {
        return this.f6346q;
    }

    public PorterDuff.Mode getIconTintMode() {
        return this.f6345p;
    }

    public int getInsetBottom() {
        return this.d.f7579f;
    }

    public int getInsetTop() {
        return this.d.f7578e;
    }

    public ColorStateList getRippleColor() {
        if (b()) {
            return this.d.f7583l;
        }
        return null;
    }

    public s2.k getShapeAppearanceModel() {
        if (b()) {
            return this.d.f7576b;
        }
        throw new IllegalStateException("Attempted to get ShapeAppearanceModel from a MaterialButton which has an overwritten background.");
    }

    public ColorStateList getStrokeColor() {
        if (b()) {
            return this.d.f7582k;
        }
        return null;
    }

    public int getStrokeWidth() {
        if (b()) {
            return this.d.h;
        }
        return 0;
    }

    public ColorStateList getSupportBackgroundTintList() {
        if (b()) {
            return this.d.f7581j;
        }
        return super.getSupportBackgroundTintList();
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        if (b()) {
            return this.d.f7580i;
        }
        return super.getSupportBackgroundTintMode();
    }

    public final boolean isChecked() {
        return this.f6353x;
    }

    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (b()) {
            e.q0(this, this.d.b(false));
        }
    }

    public final int[] onCreateDrawableState(int i2) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i2 + 2);
        if (a()) {
            View.mergeDrawableStates(onCreateDrawableState, f6341A);
        }
        if (this.f6353x) {
            View.mergeDrawableStates(onCreateDrawableState, f6342B);
        }
        return onCreateDrawableState;
    }

    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(getA11yClassName());
        accessibilityEvent.setChecked(this.f6353x);
    }

    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(getA11yClassName());
        accessibilityNodeInfo.setCheckable(a());
        accessibilityNodeInfo.setChecked(this.f6353x);
        accessibilityNodeInfo.setClickable(isClickable());
    }

    public final void onLayout(boolean z3, int i2, int i5, int i6, int i7) {
        super.onLayout(z3, i2, i5, i6, i7);
        e(getMeasuredWidth(), getMeasuredHeight());
    }

    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof C0486b)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C0486b bVar = (C0486b) parcelable;
        super.onRestoreInstanceState(bVar.f2792a);
        setChecked(bVar.f7574c);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [android.os.Parcelable, T.c, e2.b] */
    public final Parcelable onSaveInstanceState() {
        ? cVar = new c(super.onSaveInstanceState());
        cVar.f7574c = this.f6353x;
        return cVar;
    }

    public final void onTextChanged(CharSequence charSequence, int i2, int i5, int i6) {
        super.onTextChanged(charSequence, i2, i5, i6);
        e(getMeasuredWidth(), getMeasuredHeight());
    }

    public final boolean performClick() {
        if (this.d.f7589r) {
            toggle();
        }
        return super.performClick();
    }

    public final void refreshDrawableState() {
        super.refreshDrawableState();
        if (this.f6347r != null) {
            if (this.f6347r.setState(getDrawableState())) {
                invalidate();
            }
        }
    }

    public void setA11yClassName(String str) {
        this.f6348s = str;
    }

    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    public void setBackgroundColor(int i2) {
        if (b()) {
            C0487c cVar = this.d;
            if (cVar.b(false) != null) {
                cVar.b(false).setTint(i2);
                return;
            }
            return;
        }
        super.setBackgroundColor(i2);
    }

    public void setBackgroundDrawable(Drawable drawable) {
        if (!b()) {
            super.setBackgroundDrawable(drawable);
        } else if (drawable != getBackground()) {
            Log.w("MaterialButton", "MaterialButton manages its own background to control elevation, shape, color and states. Consider using backgroundTint, shapeAppearance and other attributes where available. A custom background will ignore these attributes and you should consider handling interaction states such as pressed, focused and disabled");
            C0487c cVar = this.d;
            cVar.f7586o = true;
            ColorStateList colorStateList = cVar.f7581j;
            MaterialButton materialButton = cVar.f7575a;
            materialButton.setSupportBackgroundTintList(colorStateList);
            materialButton.setSupportBackgroundTintMode(cVar.f7580i);
            super.setBackgroundDrawable(drawable);
        } else {
            getBackground().setState(drawable.getState());
        }
    }

    public void setBackgroundResource(int i2) {
        Drawable drawable;
        if (i2 != 0) {
            drawable = b.J(getContext(), i2);
        } else {
            drawable = null;
        }
        setBackgroundDrawable(drawable);
    }

    public void setBackgroundTintList(ColorStateList colorStateList) {
        setSupportBackgroundTintList(colorStateList);
    }

    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        setSupportBackgroundTintMode(mode);
    }

    public void setCheckable(boolean z3) {
        if (b()) {
            this.d.f7588q = z3;
        }
    }

    public void setChecked(boolean z3) {
        if (a() && isEnabled() && this.f6353x != z3) {
            this.f6353x = z3;
            refreshDrawableState();
            if (getParent() instanceof MaterialButtonToggleGroup) {
                MaterialButtonToggleGroup materialButtonToggleGroup = (MaterialButtonToggleGroup) getParent();
                boolean z4 = this.f6353x;
                if (!materialButtonToggleGroup.f6361f) {
                    materialButtonToggleGroup.b(getId(), z4);
                }
            }
            if (!this.f6354y) {
                this.f6354y = true;
                Iterator it2 = this.f6343e.iterator();
                if (!it2.hasNext()) {
                    this.f6354y = false;
                    return;
                }
                throw o3.d.e(it2);
            }
        }
    }

    public void setCornerRadius(int i2) {
        if (b()) {
            C0487c cVar = this.d;
            if (!cVar.f7587p || cVar.g != i2) {
                cVar.g = i2;
                cVar.f7587p = true;
                float f6 = (float) i2;
                j e6 = cVar.f7576b.e();
                e6.f11479e = new C0962a(f6);
                e6.f11480f = new C0962a(f6);
                e6.g = new C0962a(f6);
                e6.h = new C0962a(f6);
                cVar.c(e6.a());
            }
        }
    }

    public void setCornerRadiusResource(int i2) {
        if (b()) {
            setCornerRadius(getResources().getDimensionPixelSize(i2));
        }
    }

    public void setElevation(float f6) {
        super.setElevation(f6);
        if (b()) {
            this.d.b(false).i(f6);
        }
    }

    public void setIcon(Drawable drawable) {
        if (this.f6347r != drawable) {
            this.f6347r = drawable;
            d(true);
            e(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public void setIconGravity(int i2) {
        if (this.f6355z != i2) {
            this.f6355z = i2;
            e(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public void setIconPadding(int i2) {
        if (this.f6352w != i2) {
            this.f6352w = i2;
            setCompoundDrawablePadding(i2);
        }
    }

    public void setIconResource(int i2) {
        Drawable drawable;
        if (i2 != 0) {
            drawable = b.J(getContext(), i2);
        } else {
            drawable = null;
        }
        setIcon(drawable);
    }

    public void setIconSize(int i2) {
        if (i2 < 0) {
            throw new IllegalArgumentException("iconSize cannot be less than 0");
        } else if (this.f6349t != i2) {
            this.f6349t = i2;
            d(true);
        }
    }

    public void setIconTint(ColorStateList colorStateList) {
        if (this.f6346q != colorStateList) {
            this.f6346q = colorStateList;
            d(false);
        }
    }

    public void setIconTintMode(PorterDuff.Mode mode) {
        if (this.f6345p != mode) {
            this.f6345p = mode;
            d(false);
        }
    }

    public void setIconTintResource(int i2) {
        setIconTint(h.getColorStateList(getContext(), i2));
    }

    public void setInsetBottom(int i2) {
        C0487c cVar = this.d;
        cVar.d(cVar.f7578e, i2);
    }

    public void setInsetTop(int i2) {
        C0487c cVar = this.d;
        cVar.d(i2, cVar.f7579f);
    }

    public void setInternalBackground(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
    }

    public void setOnPressedChangeListenerInternal(C0485a aVar) {
        this.f6344f = aVar;
    }

    public void setPressed(boolean z3) {
        C0485a aVar = this.f6344f;
        if (aVar != null) {
            ((MaterialButtonToggleGroup) ((I) aVar).f7143b).invalidate();
        }
        super.setPressed(z3);
    }

    public void setRippleColor(ColorStateList colorStateList) {
        if (b()) {
            C0487c cVar = this.d;
            if (cVar.f7583l != colorStateList) {
                cVar.f7583l = colorStateList;
                MaterialButton materialButton = cVar.f7575a;
                if (materialButton.getBackground() instanceof RippleDrawable) {
                    ((RippleDrawable) materialButton.getBackground()).setColor(C0935a.a(colorStateList));
                }
            }
        }
    }

    public void setRippleColorResource(int i2) {
        if (b()) {
            setRippleColor(h.getColorStateList(getContext(), i2));
        }
    }

    public void setShapeAppearanceModel(s2.k kVar) {
        if (b()) {
            this.d.c(kVar);
            return;
        }
        throw new IllegalStateException("Attempted to set ShapeAppearanceModel on a MaterialButton which has an overwritten background.");
    }

    public void setShouldDrawSurfaceColorStroke(boolean z3) {
        if (b()) {
            C0487c cVar = this.d;
            cVar.f7585n = z3;
            cVar.f();
        }
    }

    public void setStrokeColor(ColorStateList colorStateList) {
        if (b()) {
            C0487c cVar = this.d;
            if (cVar.f7582k != colorStateList) {
                cVar.f7582k = colorStateList;
                cVar.f();
            }
        }
    }

    public void setStrokeColorResource(int i2) {
        if (b()) {
            setStrokeColor(h.getColorStateList(getContext(), i2));
        }
    }

    public void setStrokeWidth(int i2) {
        if (b()) {
            C0487c cVar = this.d;
            if (cVar.h != i2) {
                cVar.h = i2;
                cVar.f();
            }
        }
    }

    public void setStrokeWidthResource(int i2) {
        if (b()) {
            setStrokeWidth(getResources().getDimensionPixelSize(i2));
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        if (b()) {
            C0487c cVar = this.d;
            if (cVar.f7581j != colorStateList) {
                cVar.f7581j = colorStateList;
                if (cVar.b(false) != null) {
                    D.a.h(cVar.b(false), cVar.f7581j);
                    return;
                }
                return;
            }
            return;
        }
        super.setSupportBackgroundTintList(colorStateList);
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        if (b()) {
            C0487c cVar = this.d;
            if (cVar.f7580i != mode) {
                cVar.f7580i = mode;
                if (cVar.b(false) != null && cVar.f7580i != null) {
                    D.a.i(cVar.b(false), cVar.f7580i);
                    return;
                }
                return;
            }
            return;
        }
        super.setSupportBackgroundTintMode(mode);
    }

    public void setTextAlignment(int i2) {
        super.setTextAlignment(i2);
        e(getMeasuredWidth(), getMeasuredHeight());
    }

    public void setToggleCheckedStateOnClick(boolean z3) {
        this.d.f7589r = z3;
    }

    public final void toggle() {
        setChecked(!this.f6353x);
    }
}
