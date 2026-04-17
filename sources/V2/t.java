package v2;

import K.O;
import R2.b;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import c1.i;
import com.bumptech.glide.d;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;
import com.mtma.criminal.city.R;
import java.util.WeakHashMap;
import k.C0703b0;
import m2.k;

public final class t extends LinearLayout {

    /* renamed from: a  reason: collision with root package name */
    public final TextInputLayout f12263a;

    /* renamed from: b  reason: collision with root package name */
    public final C0703b0 f12264b;

    /* renamed from: c  reason: collision with root package name */
    public CharSequence f12265c;
    public final CheckableImageButton d;

    /* renamed from: e  reason: collision with root package name */
    public ColorStateList f12266e;

    /* renamed from: f  reason: collision with root package name */
    public PorterDuff.Mode f12267f;

    /* renamed from: p  reason: collision with root package name */
    public int f12268p;

    /* renamed from: q  reason: collision with root package name */
    public ImageView.ScaleType f12269q;

    /* renamed from: r  reason: collision with root package name */
    public View.OnLongClickListener f12270r;

    /* renamed from: s  reason: collision with root package name */
    public boolean f12271s;

    public t(TextInputLayout textInputLayout, i iVar) {
        super(textInputLayout.getContext());
        CharSequence text;
        this.f12263a = textInputLayout;
        setVisibility(8);
        setOrientation(0);
        setLayoutParams(new FrameLayout.LayoutParams(-2, -1, 8388611));
        CheckableImageButton checkableImageButton = (CheckableImageButton) LayoutInflater.from(getContext()).inflate(R.layout.design_text_input_start_icon, this, false);
        this.d = checkableImageButton;
        CharSequence charSequence = null;
        C0703b0 b0Var = new C0703b0(getContext(), (AttributeSet) null);
        this.f12264b = b0Var;
        if (d.L0(getContext())) {
            ((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()).setMarginEnd(0);
        }
        View.OnLongClickListener onLongClickListener = this.f12270r;
        checkableImageButton.setOnClickListener((View.OnClickListener) null);
        b.P0(checkableImageButton, onLongClickListener);
        this.f12270r = null;
        checkableImageButton.setOnLongClickListener((View.OnLongClickListener) null);
        b.P0(checkableImageButton, (View.OnLongClickListener) null);
        TypedArray typedArray = (TypedArray) iVar.f5606c;
        if (typedArray.hasValue(69)) {
            this.f12266e = d.b0(getContext(), iVar, 69);
        }
        if (typedArray.hasValue(70)) {
            this.f12267f = k.g(typedArray.getInt(70, -1), (PorterDuff.Mode) null);
        }
        if (typedArray.hasValue(66)) {
            b(iVar.n(66));
            if (typedArray.hasValue(65) && checkableImageButton.getContentDescription() != (text = typedArray.getText(65))) {
                checkableImageButton.setContentDescription(text);
            }
            checkableImageButton.setCheckable(typedArray.getBoolean(64, true));
        }
        int dimensionPixelSize = typedArray.getDimensionPixelSize(67, getResources().getDimensionPixelSize(R.dimen.mtrl_min_touch_target_size));
        if (dimensionPixelSize >= 0) {
            if (dimensionPixelSize != this.f12268p) {
                this.f12268p = dimensionPixelSize;
                checkableImageButton.setMinimumWidth(dimensionPixelSize);
                checkableImageButton.setMinimumHeight(dimensionPixelSize);
            }
            if (typedArray.hasValue(68)) {
                ImageView.ScaleType k6 = b.k(typedArray.getInt(68, -1));
                this.f12269q = k6;
                checkableImageButton.setScaleType(k6);
            }
            b0Var.setVisibility(8);
            b0Var.setId(R.id.textinput_prefix_text);
            b0Var.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
            WeakHashMap weakHashMap = O.f1352a;
            b0Var.setAccessibilityLiveRegion(1);
            b0Var.setTextAppearance(typedArray.getResourceId(60, 0));
            if (typedArray.hasValue(61)) {
                b0Var.setTextColor(iVar.m(61));
            }
            CharSequence text2 = typedArray.getText(59);
            this.f12265c = !TextUtils.isEmpty(text2) ? text2 : charSequence;
            b0Var.setText(text2);
            e();
            addView(checkableImageButton);
            addView(b0Var);
            return;
        }
        throw new IllegalArgumentException("startIconSize cannot be less than 0");
    }

    public final int a() {
        int i2;
        CheckableImageButton checkableImageButton = this.d;
        if (checkableImageButton.getVisibility() == 0) {
            i2 = ((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()).getMarginEnd() + checkableImageButton.getMeasuredWidth();
        } else {
            i2 = 0;
        }
        WeakHashMap weakHashMap = O.f1352a;
        return this.f12264b.getPaddingStart() + getPaddingStart() + i2;
    }

    public final void b(Drawable drawable) {
        CheckableImageButton checkableImageButton = this.d;
        checkableImageButton.setImageDrawable(drawable);
        if (drawable != null) {
            ColorStateList colorStateList = this.f12266e;
            PorterDuff.Mode mode = this.f12267f;
            TextInputLayout textInputLayout = this.f12263a;
            b.d(textInputLayout, checkableImageButton, colorStateList, mode);
            c(true);
            b.F0(textInputLayout, checkableImageButton, this.f12266e);
            return;
        }
        c(false);
        View.OnLongClickListener onLongClickListener = this.f12270r;
        checkableImageButton.setOnClickListener((View.OnClickListener) null);
        b.P0(checkableImageButton, onLongClickListener);
        this.f12270r = null;
        checkableImageButton.setOnLongClickListener((View.OnLongClickListener) null);
        b.P0(checkableImageButton, (View.OnLongClickListener) null);
        if (checkableImageButton.getContentDescription() != null) {
            checkableImageButton.setContentDescription((CharSequence) null);
        }
    }

    public final void c(boolean z3) {
        boolean z4;
        CheckableImageButton checkableImageButton = this.d;
        int i2 = 0;
        if (checkableImageButton.getVisibility() == 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z4 != z3) {
            if (!z3) {
                i2 = 8;
            }
            checkableImageButton.setVisibility(i2);
            d();
            e();
        }
    }

    public final void d() {
        int i2;
        EditText editText = this.f12263a.d;
        if (editText != null) {
            if (this.d.getVisibility() == 0) {
                i2 = 0;
            } else {
                WeakHashMap weakHashMap = O.f1352a;
                i2 = editText.getPaddingStart();
            }
            int compoundPaddingTop = editText.getCompoundPaddingTop();
            int dimensionPixelSize = getContext().getResources().getDimensionPixelSize(R.dimen.material_input_text_to_prefix_suffix_padding);
            int compoundPaddingBottom = editText.getCompoundPaddingBottom();
            WeakHashMap weakHashMap2 = O.f1352a;
            this.f12264b.setPaddingRelative(i2, compoundPaddingTop, dimensionPixelSize, compoundPaddingBottom);
        }
    }

    public final void e() {
        int i2;
        int i5 = 8;
        if (this.f12265c == null || this.f12271s) {
            i2 = 8;
        } else {
            i2 = 0;
        }
        if (this.d.getVisibility() == 0 || i2 == 0) {
            i5 = 0;
        }
        setVisibility(i5);
        this.f12264b.setVisibility(i2);
        this.f12263a.q();
    }

    public final void onMeasure(int i2, int i5) {
        super.onMeasure(i2, i5);
        d();
    }
}
