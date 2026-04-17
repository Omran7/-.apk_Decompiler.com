package g2;

import B.i;
import B.p;
import K.W;
import K1.e;
import M0.b;
import Y1.a;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.AnimatedStateListDrawable;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.autofill.AutofillManager;
import android.widget.CompoundButton;
import com.bumptech.glide.d;
import com.mtma.criminal.city.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import k.C0734r;
import m2.k;
import u0.C1015b;
import u0.C1017d;
import u0.C1018e;
import x2.C1097a;

public final class c extends C0734r {

    /* renamed from: H  reason: collision with root package name */
    public static final int[] f7985H = {R.attr.state_indeterminate};

    /* renamed from: I  reason: collision with root package name */
    public static final int[] f7986I = {R.attr.state_error};

    /* renamed from: J  reason: collision with root package name */
    public static final int[][] f7987J = {new int[]{16842910, R.attr.state_error}, new int[]{16842910, 16842912}, new int[]{16842910, -16842912}, new int[]{-16842910, 16842912}, new int[]{-16842910, -16842912}};

    /* renamed from: K  reason: collision with root package name */
    public static final int f7988K = Resources.getSystem().getIdentifier("btn_check_material_anim", "drawable", "android");

    /* renamed from: A  reason: collision with root package name */
    public int f7989A;

    /* renamed from: B  reason: collision with root package name */
    public int[] f7990B;

    /* renamed from: C  reason: collision with root package name */
    public boolean f7991C;

    /* renamed from: D  reason: collision with root package name */
    public CharSequence f7992D;

    /* renamed from: E  reason: collision with root package name */
    public CompoundButton.OnCheckedChangeListener f7993E;
    public final C1018e F;

    /* renamed from: G  reason: collision with root package name */
    public final C0547a f7994G;

    /* renamed from: e  reason: collision with root package name */
    public final LinkedHashSet f7995e = new LinkedHashSet();

    /* renamed from: f  reason: collision with root package name */
    public final LinkedHashSet f7996f = new LinkedHashSet();

    /* renamed from: p  reason: collision with root package name */
    public ColorStateList f7997p;

    /* renamed from: q  reason: collision with root package name */
    public boolean f7998q;

    /* renamed from: r  reason: collision with root package name */
    public boolean f7999r;

    /* renamed from: s  reason: collision with root package name */
    public boolean f8000s;

    /* renamed from: t  reason: collision with root package name */
    public CharSequence f8001t;

    /* renamed from: u  reason: collision with root package name */
    public Drawable f8002u;

    /* renamed from: v  reason: collision with root package name */
    public Drawable f8003v;

    /* renamed from: w  reason: collision with root package name */
    public boolean f8004w;

    /* renamed from: x  reason: collision with root package name */
    public ColorStateList f8005x;

    /* renamed from: y  reason: collision with root package name */
    public ColorStateList f8006y;

    /* renamed from: z  reason: collision with root package name */
    public PorterDuff.Mode f8007z;

    public c(Context context, AttributeSet attributeSet) {
        super(C1097a.a(context, attributeSet, R.attr.checkboxStyle, 2131952670), attributeSet, R.attr.checkboxStyle);
        Context context2 = getContext();
        C1018e eVar = new C1018e(context2);
        Resources resources = context2.getResources();
        Resources.Theme theme = context2.getTheme();
        ThreadLocal threadLocal = p.f164a;
        Drawable a6 = i.a(resources, R.drawable.mtrl_checkbox_button_checked_unchecked, theme);
        eVar.f11788a = a6;
        a6.setCallback(eVar.f11787f);
        new b(eVar.f11788a.getConstantState(), 1);
        this.F = eVar;
        this.f7994G = new C0547a(this);
        Context context3 = getContext();
        this.f8002u = Q.c.a(this);
        this.f8005x = getSuperButtonTintList();
        setSupportButtonTintList((ColorStateList) null);
        int[] iArr = a.f4257n;
        k.a(context3, attributeSet, R.attr.checkboxStyle, 2131952670);
        k.b(context3, attributeSet, iArr, R.attr.checkboxStyle, 2131952670, new int[0]);
        TypedArray obtainStyledAttributes = context3.obtainStyledAttributes(attributeSet, iArr, R.attr.checkboxStyle, 2131952670);
        c1.i iVar = new c1.i(context3, obtainStyledAttributes);
        this.f8003v = iVar.n(2);
        if (this.f8002u != null && com.bumptech.glide.c.i0(context3, R.attr.isMaterial3Theme, false)) {
            int resourceId = obtainStyledAttributes.getResourceId(0, 0);
            int resourceId2 = obtainStyledAttributes.getResourceId(1, 0);
            if (resourceId == f7988K && resourceId2 == 0) {
                super.setButtonDrawable((Drawable) null);
                this.f8002u = R2.b.J(context3, R.drawable.mtrl_checkbox_button);
                this.f8004w = true;
                if (this.f8003v == null) {
                    this.f8003v = R2.b.J(context3, R.drawable.mtrl_checkbox_button_icon);
                }
            }
        }
        this.f8006y = d.b0(context3, iVar, 3);
        this.f8007z = k.g(obtainStyledAttributes.getInt(4, -1), PorterDuff.Mode.SRC_IN);
        this.f7998q = obtainStyledAttributes.getBoolean(10, false);
        this.f7999r = obtainStyledAttributes.getBoolean(6, true);
        this.f8000s = obtainStyledAttributes.getBoolean(9, false);
        this.f8001t = obtainStyledAttributes.getText(8);
        if (obtainStyledAttributes.hasValue(7)) {
            setCheckedState(obtainStyledAttributes.getInt(7, 0));
        }
        iVar.G();
        a();
    }

    private String getButtonStateDescription() {
        int i2 = this.f7989A;
        if (i2 == 1) {
            return getResources().getString(R.string.mtrl_checkbox_state_description_checked);
        }
        if (i2 == 0) {
            return getResources().getString(R.string.mtrl_checkbox_state_description_unchecked);
        }
        return getResources().getString(R.string.mtrl_checkbox_state_description_indeterminate);
    }

    private ColorStateList getMaterialThemeColorsTintList() {
        if (this.f7997p == null) {
            int t6 = e.t(this, R.attr.colorControlActivated);
            int t7 = e.t(this, R.attr.colorError);
            int t8 = e.t(this, R.attr.colorSurface);
            int t9 = e.t(this, R.attr.colorOnSurface);
            this.f7997p = new ColorStateList(f7987J, new int[]{e.h0(t8, t7, 1.0f), e.h0(t8, t6, 1.0f), e.h0(t8, t9, 0.54f), e.h0(t8, t9, 0.38f), e.h0(t8, t9, 0.38f)});
        }
        return this.f7997p;
    }

    private ColorStateList getSuperButtonTintList() {
        ColorStateList colorStateList = this.f8005x;
        if (colorStateList != null) {
            return colorStateList;
        }
        if (super.getButtonTintList() != null) {
            return super.getButtonTintList();
        }
        return getSupportButtonTintList();
    }

    public final void a() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        W w6;
        Drawable drawable = this.f8002u;
        ColorStateList colorStateList3 = this.f8005x;
        PorterDuff.Mode b6 = Q.b.b(this);
        if (drawable == null) {
            drawable = null;
        } else if (colorStateList3 != null) {
            drawable = drawable.mutate();
            if (b6 != null) {
                D.a.i(drawable, b6);
            }
        }
        this.f8002u = drawable;
        Drawable drawable2 = this.f8003v;
        ColorStateList colorStateList4 = this.f8006y;
        PorterDuff.Mode mode = this.f8007z;
        if (drawable2 == null) {
            drawable2 = null;
        } else if (colorStateList4 != null) {
            drawable2 = drawable2.mutate();
            if (mode != null) {
                D.a.i(drawable2, mode);
            }
        }
        this.f8003v = drawable2;
        if (this.f8004w) {
            C1018e eVar = this.F;
            if (eVar != null) {
                Drawable drawable3 = eVar.f11788a;
                C0547a aVar = this.f7994G;
                if (drawable3 != null) {
                    AnimatedVectorDrawable animatedVectorDrawable = (AnimatedVectorDrawable) drawable3;
                    if (aVar.f7982a == null) {
                        aVar.f7982a = new C1015b(aVar);
                    }
                    animatedVectorDrawable.unregisterAnimationCallback(aVar.f7982a);
                }
                ArrayList arrayList = eVar.f11786e;
                C1017d dVar = eVar.f11784b;
                if (!(arrayList == null || aVar == null)) {
                    arrayList.remove(aVar);
                    if (eVar.f11786e.size() == 0 && (w6 = eVar.d) != null) {
                        dVar.f11782b.removeListener(w6);
                        eVar.d = null;
                    }
                }
                Drawable drawable4 = eVar.f11788a;
                if (drawable4 != null) {
                    AnimatedVectorDrawable animatedVectorDrawable2 = (AnimatedVectorDrawable) drawable4;
                    if (aVar.f7982a == null) {
                        aVar.f7982a = new C1015b(aVar);
                    }
                    animatedVectorDrawable2.registerAnimationCallback(aVar.f7982a);
                } else if (aVar != null) {
                    if (eVar.f11786e == null) {
                        eVar.f11786e = new ArrayList();
                    }
                    if (!eVar.f11786e.contains(aVar)) {
                        eVar.f11786e.add(aVar);
                        if (eVar.d == null) {
                            eVar.d = new W((Object) eVar, 9);
                        }
                        dVar.f11782b.addListener(eVar.d);
                    }
                }
            }
            Drawable drawable5 = this.f8002u;
            if ((drawable5 instanceof AnimatedStateListDrawable) && eVar != null) {
                ((AnimatedStateListDrawable) drawable5).addTransition(R.id.checked, R.id.unchecked, eVar, false);
                ((AnimatedStateListDrawable) this.f8002u).addTransition(R.id.indeterminate, R.id.unchecked, eVar, false);
            }
        }
        Drawable drawable6 = this.f8002u;
        if (!(drawable6 == null || (colorStateList2 = this.f8005x) == null)) {
            D.a.h(drawable6, colorStateList2);
        }
        Drawable drawable7 = this.f8003v;
        if (!(drawable7 == null || (colorStateList = this.f8006y) == null)) {
            D.a.h(drawable7, colorStateList);
        }
        Drawable drawable8 = this.f8002u;
        Drawable drawable9 = this.f8003v;
        if (drawable8 == null) {
            drawable8 = drawable9;
        } else if (drawable9 != null) {
            int intrinsicWidth = drawable9.getIntrinsicWidth();
            if (intrinsicWidth == -1) {
                intrinsicWidth = drawable8.getIntrinsicWidth();
            }
            int intrinsicHeight = drawable9.getIntrinsicHeight();
            if (intrinsicHeight == -1) {
                intrinsicHeight = drawable8.getIntrinsicHeight();
            }
            if (intrinsicWidth > drawable8.getIntrinsicWidth() || intrinsicHeight > drawable8.getIntrinsicHeight()) {
                float f6 = ((float) intrinsicWidth) / ((float) intrinsicHeight);
                if (f6 >= ((float) drawable8.getIntrinsicWidth()) / ((float) drawable8.getIntrinsicHeight())) {
                    int intrinsicWidth2 = drawable8.getIntrinsicWidth();
                    intrinsicHeight = (int) (((float) intrinsicWidth2) / f6);
                    intrinsicWidth = intrinsicWidth2;
                } else {
                    intrinsicHeight = drawable8.getIntrinsicHeight();
                    intrinsicWidth = (int) (f6 * ((float) intrinsicHeight));
                }
            }
            LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{drawable8, drawable9});
            layerDrawable.setLayerSize(1, intrinsicWidth, intrinsicHeight);
            layerDrawable.setLayerGravity(1, 17);
            drawable8 = layerDrawable;
        }
        super.setButtonDrawable(drawable8);
        refreshDrawableState();
    }

    public Drawable getButtonDrawable() {
        return this.f8002u;
    }

    public Drawable getButtonIconDrawable() {
        return this.f8003v;
    }

    public ColorStateList getButtonIconTintList() {
        return this.f8006y;
    }

    public PorterDuff.Mode getButtonIconTintMode() {
        return this.f8007z;
    }

    public ColorStateList getButtonTintList() {
        return this.f8005x;
    }

    public int getCheckedState() {
        return this.f7989A;
    }

    public CharSequence getErrorAccessibilityLabel() {
        return this.f8001t;
    }

    public final boolean isChecked() {
        if (this.f7989A == 1) {
            return true;
        }
        return false;
    }

    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f7998q && this.f8005x == null && this.f8006y == null) {
            setUseMaterialThemeColors(true);
        }
    }

    public final int[] onCreateDrawableState(int i2) {
        int[] copyOf;
        int[] onCreateDrawableState = super.onCreateDrawableState(i2 + 2);
        if (getCheckedState() == 2) {
            View.mergeDrawableStates(onCreateDrawableState, f7985H);
        }
        if (this.f8000s) {
            View.mergeDrawableStates(onCreateDrawableState, f7986I);
        }
        int i5 = 0;
        while (true) {
            if (i5 >= onCreateDrawableState.length) {
                copyOf = Arrays.copyOf(onCreateDrawableState, onCreateDrawableState.length + 1);
                copyOf[onCreateDrawableState.length] = 16842912;
                break;
            }
            int i6 = onCreateDrawableState[i5];
            if (i6 == 16842912) {
                copyOf = onCreateDrawableState;
                break;
            } else if (i6 == 0) {
                copyOf = (int[]) onCreateDrawableState.clone();
                copyOf[i5] = 16842912;
                break;
            } else {
                i5++;
            }
        }
        this.f7990B = copyOf;
        return onCreateDrawableState;
    }

    public final void onDraw(Canvas canvas) {
        Drawable a6;
        int i2;
        if (!this.f7999r || !TextUtils.isEmpty(getText()) || (a6 = Q.c.a(this)) == null) {
            super.onDraw(canvas);
            return;
        }
        if (k.e(this)) {
            i2 = -1;
        } else {
            i2 = 1;
        }
        int width = ((getWidth() - a6.getIntrinsicWidth()) / 2) * i2;
        int save = canvas.save();
        canvas.translate((float) width, 0.0f);
        super.onDraw(canvas);
        canvas.restoreToCount(save);
        if (getBackground() != null) {
            Rect bounds = a6.getBounds();
            D.a.f(getBackground(), bounds.left + width, bounds.top, bounds.right + width, bounds.bottom);
        }
    }

    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        if (accessibilityNodeInfo != null && this.f8000s) {
            accessibilityNodeInfo.setText(accessibilityNodeInfo.getText() + ", " + this.f8001t);
        }
    }

    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof b)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        b bVar = (b) parcelable;
        super.onRestoreInstanceState(bVar.getSuperState());
        setCheckedState(bVar.f7984a);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [android.view.View$BaseSavedState, g2.b, android.os.Parcelable] */
    public final Parcelable onSaveInstanceState() {
        ? baseSavedState = new View.BaseSavedState(super.onSaveInstanceState());
        baseSavedState.f7984a = getCheckedState();
        return baseSavedState;
    }

    public void setButtonDrawable(int i2) {
        setButtonDrawable(R2.b.J(getContext(), i2));
    }

    public void setButtonIconDrawable(Drawable drawable) {
        this.f8003v = drawable;
        a();
    }

    public void setButtonIconDrawableResource(int i2) {
        setButtonIconDrawable(R2.b.J(getContext(), i2));
    }

    public void setButtonIconTintList(ColorStateList colorStateList) {
        if (this.f8006y != colorStateList) {
            this.f8006y = colorStateList;
            a();
        }
    }

    public void setButtonIconTintMode(PorterDuff.Mode mode) {
        if (this.f8007z != mode) {
            this.f8007z = mode;
            a();
        }
    }

    public void setButtonTintList(ColorStateList colorStateList) {
        if (this.f8005x != colorStateList) {
            this.f8005x = colorStateList;
            a();
        }
    }

    public void setButtonTintMode(PorterDuff.Mode mode) {
        setSupportButtonTintMode(mode);
        a();
    }

    public void setCenterIfNoTextEnabled(boolean z3) {
        this.f7999r = z3;
    }

    public void setChecked(boolean z3) {
        setCheckedState(z3 ? 1 : 0);
    }

    public void setCheckedState(int i2) {
        boolean z3;
        AutofillManager autofillManager;
        CompoundButton.OnCheckedChangeListener onCheckedChangeListener;
        if (this.f7989A != i2) {
            this.f7989A = i2;
            if (i2 == 1) {
                z3 = true;
            } else {
                z3 = false;
            }
            super.setChecked(z3);
            refreshDrawableState();
            int i5 = Build.VERSION.SDK_INT;
            if (i5 >= 30 && this.f7992D == null) {
                super.setStateDescription(getButtonStateDescription());
            }
            if (!this.f7991C) {
                this.f7991C = true;
                LinkedHashSet linkedHashSet = this.f7996f;
                if (linkedHashSet != null) {
                    Iterator it2 = linkedHashSet.iterator();
                    if (it2.hasNext()) {
                        throw o3.d.e(it2);
                    }
                }
                if (!(this.f7989A == 2 || (onCheckedChangeListener = this.f7993E) == null)) {
                    onCheckedChangeListener.onCheckedChanged(this, isChecked());
                }
                if (i5 >= 26 && (autofillManager = (AutofillManager) getContext().getSystemService(AutofillManager.class)) != null) {
                    autofillManager.notifyValueChanged(this);
                }
                this.f7991C = false;
            }
        }
    }

    public void setEnabled(boolean z3) {
        super.setEnabled(z3);
    }

    public void setErrorAccessibilityLabel(CharSequence charSequence) {
        this.f8001t = charSequence;
    }

    public void setErrorAccessibilityLabelResource(int i2) {
        CharSequence charSequence;
        if (i2 != 0) {
            charSequence = getResources().getText(i2);
        } else {
            charSequence = null;
        }
        setErrorAccessibilityLabel(charSequence);
    }

    public void setErrorShown(boolean z3) {
        if (this.f8000s != z3) {
            this.f8000s = z3;
            refreshDrawableState();
            Iterator it2 = this.f7995e.iterator();
            if (it2.hasNext()) {
                throw o3.d.e(it2);
            }
        }
    }

    public void setOnCheckedChangeListener(CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        this.f7993E = onCheckedChangeListener;
    }

    public void setStateDescription(CharSequence charSequence) {
        this.f7992D = charSequence;
        if (charSequence != null) {
            super.setStateDescription(charSequence);
        } else if (Build.VERSION.SDK_INT >= 30 && charSequence == null) {
            super.setStateDescription(getButtonStateDescription());
        }
    }

    public void setUseMaterialThemeColors(boolean z3) {
        this.f7998q = z3;
        if (z3) {
            Q.b.c(this, getMaterialThemeColorsTintList());
        } else {
            Q.b.c(this, (ColorStateList) null);
        }
    }

    public final void toggle() {
        setChecked(!isChecked());
    }

    public void setButtonDrawable(Drawable drawable) {
        this.f8002u = drawable;
        this.f8004w = false;
        a();
    }
}
