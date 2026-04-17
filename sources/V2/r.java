package v2;

import P4.m;
import Y1.a;
import android.accessibilityservice.AccessibilityServiceInfo;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.method.KeyListener;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityManager;
import android.widget.AdapterView;
import android.widget.Filterable;
import android.widget.ListAdapter;
import com.bumptech.glide.d;
import com.google.android.material.textfield.TextInputLayout;
import com.mtma.criminal.city.R;
import java.util.List;
import java.util.Locale;
import k.C0657D0;
import k.C0728o;
import m2.k;
import s2.g;
import x2.C1097a;

public final class r extends C0728o {

    /* renamed from: e  reason: collision with root package name */
    public final C0657D0 f12253e;

    /* renamed from: f  reason: collision with root package name */
    public final AccessibilityManager f12254f;

    /* renamed from: p  reason: collision with root package name */
    public final Rect f12255p = new Rect();

    /* renamed from: q  reason: collision with root package name */
    public final int f12256q;

    /* renamed from: r  reason: collision with root package name */
    public final float f12257r;

    /* renamed from: s  reason: collision with root package name */
    public ColorStateList f12258s;

    /* renamed from: t  reason: collision with root package name */
    public int f12259t;

    /* renamed from: u  reason: collision with root package name */
    public ColorStateList f12260u;

    public r(Context context, AttributeSet attributeSet) {
        super(C1097a.a(context, attributeSet, R.attr.autoCompleteTextViewStyle, 0), attributeSet);
        Context context2 = getContext();
        TypedArray f6 = k.f(context2, attributeSet, a.f4252i, R.attr.autoCompleteTextViewStyle, 2131952378, new int[0]);
        if (f6.hasValue(0) && f6.getInt(0, 0) == 0) {
            setKeyListener((KeyListener) null);
        }
        this.f12256q = f6.getResourceId(3, R.layout.mtrl_auto_complete_simple_item);
        this.f12257r = (float) f6.getDimensionPixelOffset(1, R.dimen.mtrl_exposed_dropdown_menu_popup_elevation);
        if (f6.hasValue(2)) {
            this.f12258s = ColorStateList.valueOf(f6.getColor(2, 0));
        }
        this.f12259t = f6.getColor(4, 0);
        this.f12260u = d.a0(context2, f6, 5);
        this.f12254f = (AccessibilityManager) context2.getSystemService("accessibility");
        C0657D0 d02 = new C0657D0(context2, (AttributeSet) null, R.attr.listPopupWindowStyle);
        this.f12253e = d02;
        d02.f9160H = true;
        d02.f9161I.setFocusable(true);
        d02.f9175x = this;
        d02.f9161I.setInputMethodMode(2);
        d02.p(getAdapter());
        d02.f9176y = new m(this, 3);
        if (f6.hasValue(6)) {
            setSimpleItems(f6.getResourceId(6, 0));
        }
        f6.recycle();
    }

    public static void a(r rVar, Object obj) {
        rVar.setText(rVar.convertSelectionToString(obj), false);
    }

    public final TextInputLayout b() {
        for (ViewParent parent = getParent(); parent != null; parent = parent.getParent()) {
            if (parent instanceof TextInputLayout) {
                return (TextInputLayout) parent;
            }
        }
        return null;
    }

    public final boolean c() {
        List<AccessibilityServiceInfo> enabledAccessibilityServiceList;
        AccessibilityManager accessibilityManager = this.f12254f;
        if (accessibilityManager == null || !accessibilityManager.isTouchExplorationEnabled()) {
            if (!(accessibilityManager == null || !accessibilityManager.isEnabled() || (enabledAccessibilityServiceList = accessibilityManager.getEnabledAccessibilityServiceList(16)) == null)) {
                for (AccessibilityServiceInfo next : enabledAccessibilityServiceList) {
                    if (next.getSettingsActivityName() == null || !next.getSettingsActivityName().contains("SwitchAccess")) {
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final void dismissDropDown() {
        if (c()) {
            this.f12253e.dismiss();
        } else {
            super.dismissDropDown();
        }
    }

    public ColorStateList getDropDownBackgroundTintList() {
        return this.f12258s;
    }

    public CharSequence getHint() {
        TextInputLayout b6 = b();
        if (b6 == null || !b6.f6531N) {
            return super.getHint();
        }
        return b6.getHint();
    }

    public float getPopupElevation() {
        return this.f12257r;
    }

    public int getSimpleItemSelectedColor() {
        return this.f12259t;
    }

    public ColorStateList getSimpleItemSelectedRippleColor() {
        return this.f12260u;
    }

    public final void onAttachedToWindow() {
        String str;
        super.onAttachedToWindow();
        TextInputLayout b6 = b();
        if (b6 != null && b6.f6531N && super.getHint() == null) {
            String str2 = Build.MANUFACTURER;
            if (str2 != null) {
                str = str2.toLowerCase(Locale.ENGLISH);
            } else {
                str = "";
            }
            if (str.equals("meizu")) {
                setHint("");
            }
        }
    }

    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f12253e.dismiss();
    }

    public final void onMeasure(int i2, int i5) {
        int i6;
        super.onMeasure(i2, i5);
        if (View.MeasureSpec.getMode(i2) == Integer.MIN_VALUE) {
            int measuredWidth = getMeasuredWidth();
            ListAdapter adapter = getAdapter();
            TextInputLayout b6 = b();
            int i7 = 0;
            if (!(adapter == null || b6 == null)) {
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
                int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
                C0657D0 d02 = this.f12253e;
                if (!d02.f9161I.isShowing()) {
                    i6 = -1;
                } else {
                    i6 = d02.f9164c.getSelectedItemPosition();
                }
                int min = Math.min(adapter.getCount(), Math.max(0, i6) + 15);
                View view = null;
                int i8 = 0;
                for (int max = Math.max(0, min - 15); max < min; max++) {
                    int itemViewType = adapter.getItemViewType(max);
                    if (itemViewType != i7) {
                        view = null;
                        i7 = itemViewType;
                    }
                    view = adapter.getView(max, view, b6);
                    if (view.getLayoutParams() == null) {
                        view.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
                    }
                    view.measure(makeMeasureSpec, makeMeasureSpec2);
                    i8 = Math.max(i8, view.getMeasuredWidth());
                }
                Drawable background = d02.f9161I.getBackground();
                if (background != null) {
                    Rect rect = this.f12255p;
                    background.getPadding(rect);
                    i8 += rect.left + rect.right;
                }
                i7 = b6.getEndIconView().getMeasuredWidth() + i8;
            }
            setMeasuredDimension(Math.min(Math.max(measuredWidth, i7), View.MeasureSpec.getSize(i2)), getMeasuredHeight());
        }
    }

    public final void onWindowFocusChanged(boolean z3) {
        if (!c()) {
            super.onWindowFocusChanged(z3);
        }
    }

    public <T extends ListAdapter & Filterable> void setAdapter(T t6) {
        super.setAdapter(t6);
        this.f12253e.p(getAdapter());
    }

    public void setDropDownBackgroundDrawable(Drawable drawable) {
        super.setDropDownBackgroundDrawable(drawable);
        C0657D0 d02 = this.f12253e;
        if (d02 != null) {
            d02.h(drawable);
        }
    }

    public void setDropDownBackgroundTint(int i2) {
        setDropDownBackgroundTintList(ColorStateList.valueOf(i2));
    }

    public void setDropDownBackgroundTintList(ColorStateList colorStateList) {
        this.f12258s = colorStateList;
        Drawable dropDownBackground = getDropDownBackground();
        if (dropDownBackground instanceof g) {
            ((g) dropDownBackground).j(this.f12258s);
        }
    }

    public void setOnItemSelectedListener(AdapterView.OnItemSelectedListener onItemSelectedListener) {
        super.setOnItemSelectedListener(onItemSelectedListener);
        this.f12253e.f9177z = getOnItemSelectedListener();
    }

    public void setRawInputType(int i2) {
        super.setRawInputType(i2);
        TextInputLayout b6 = b();
        if (b6 != null) {
            b6.s();
        }
    }

    public void setSimpleItemSelectedColor(int i2) {
        this.f12259t = i2;
        if (getAdapter() instanceof q) {
            ((q) getAdapter()).a();
        }
    }

    public void setSimpleItemSelectedRippleColor(ColorStateList colorStateList) {
        this.f12260u = colorStateList;
        if (getAdapter() instanceof q) {
            ((q) getAdapter()).a();
        }
    }

    public void setSimpleItems(int i2) {
        setSimpleItems(getResources().getStringArray(i2));
    }

    public final void showDropDown() {
        if (c()) {
            this.f12253e.c();
        } else {
            super.showDropDown();
        }
    }

    public void setSimpleItems(String[] strArr) {
        setAdapter(new q(this, getContext(), this.f12256q, strArr));
    }
}
