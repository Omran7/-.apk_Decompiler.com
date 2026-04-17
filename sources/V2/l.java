package v2;

import F3.e;
import K.O;
import R2.b;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.fragment.app.N;
import c1.i;
import com.bumptech.glide.d;
import com.google.android.gms.internal.measurement.a;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;
import com.mtma.criminal.city.R;
import j4.U;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.WeakHashMap;
import k.C0703b0;
import m2.k;

public final class l extends LinearLayout {

    /* renamed from: A  reason: collision with root package name */
    public boolean f12196A;

    /* renamed from: B  reason: collision with root package name */
    public EditText f12197B;

    /* renamed from: C  reason: collision with root package name */
    public final AccessibilityManager f12198C;

    /* renamed from: D  reason: collision with root package name */
    public e f12199D;

    /* renamed from: E  reason: collision with root package name */
    public final j f12200E = new j(this);

    /* renamed from: a  reason: collision with root package name */
    public final TextInputLayout f12201a;

    /* renamed from: b  reason: collision with root package name */
    public final FrameLayout f12202b;

    /* renamed from: c  reason: collision with root package name */
    public final CheckableImageButton f12203c;
    public ColorStateList d;

    /* renamed from: e  reason: collision with root package name */
    public PorterDuff.Mode f12204e;

    /* renamed from: f  reason: collision with root package name */
    public View.OnLongClickListener f12205f;

    /* renamed from: p  reason: collision with root package name */
    public final CheckableImageButton f12206p;

    /* renamed from: q  reason: collision with root package name */
    public final U f12207q;

    /* renamed from: r  reason: collision with root package name */
    public int f12208r = 0;

    /* renamed from: s  reason: collision with root package name */
    public final LinkedHashSet f12209s = new LinkedHashSet();

    /* renamed from: t  reason: collision with root package name */
    public ColorStateList f12210t;

    /* renamed from: u  reason: collision with root package name */
    public PorterDuff.Mode f12211u;

    /* renamed from: v  reason: collision with root package name */
    public int f12212v;

    /* renamed from: w  reason: collision with root package name */
    public ImageView.ScaleType f12213w;

    /* renamed from: x  reason: collision with root package name */
    public View.OnLongClickListener f12214x;

    /* renamed from: y  reason: collision with root package name */
    public CharSequence f12215y;

    /* renamed from: z  reason: collision with root package name */
    public final C0703b0 f12216z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public l(TextInputLayout textInputLayout, i iVar) {
        super(textInputLayout.getContext());
        CharSequence text;
        TextInputLayout textInputLayout2 = textInputLayout;
        i iVar2 = iVar;
        k kVar = new k(this);
        this.f12198C = (AccessibilityManager) getContext().getSystemService("accessibility");
        this.f12201a = textInputLayout2;
        setVisibility(8);
        setOrientation(0);
        setLayoutParams(new FrameLayout.LayoutParams(-2, -1, 8388613));
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.f12202b = frameLayout;
        frameLayout.setVisibility(8);
        frameLayout.setLayoutParams(new LinearLayout.LayoutParams(-2, -1));
        LayoutInflater from = LayoutInflater.from(getContext());
        CheckableImageButton a6 = a(this, from, R.id.text_input_error_icon);
        this.f12203c = a6;
        CheckableImageButton a7 = a(frameLayout, from, R.id.text_input_end_icon);
        this.f12206p = a7;
        this.f12207q = new U(this, iVar2);
        CharSequence charSequence = null;
        C0703b0 b0Var = new C0703b0(getContext(), (AttributeSet) null);
        this.f12216z = b0Var;
        TypedArray typedArray = (TypedArray) iVar2.f5606c;
        if (typedArray.hasValue(38)) {
            this.d = d.b0(getContext(), iVar2, 38);
        }
        if (typedArray.hasValue(39)) {
            this.f12204e = k.g(typedArray.getInt(39, -1), (PorterDuff.Mode) null);
        }
        if (typedArray.hasValue(37)) {
            i(iVar2.n(37));
        }
        a6.setContentDescription(getResources().getText(R.string.error_icon_content_description));
        WeakHashMap weakHashMap = O.f1352a;
        a6.setImportantForAccessibility(2);
        a6.setClickable(false);
        a6.setPressable(false);
        a6.setFocusable(false);
        if (!typedArray.hasValue(53)) {
            if (typedArray.hasValue(32)) {
                this.f12210t = d.b0(getContext(), iVar2, 32);
            }
            if (typedArray.hasValue(33)) {
                this.f12211u = k.g(typedArray.getInt(33, -1), (PorterDuff.Mode) null);
            }
        }
        if (typedArray.hasValue(30)) {
            g(typedArray.getInt(30, 0));
            if (typedArray.hasValue(27) && a7.getContentDescription() != (text = typedArray.getText(27))) {
                a7.setContentDescription(text);
            }
            a7.setCheckable(typedArray.getBoolean(26, true));
        } else if (typedArray.hasValue(53)) {
            if (typedArray.hasValue(54)) {
                this.f12210t = d.b0(getContext(), iVar2, 54);
            }
            if (typedArray.hasValue(55)) {
                this.f12211u = k.g(typedArray.getInt(55, -1), (PorterDuff.Mode) null);
            }
            g(typedArray.getBoolean(53, false) ? 1 : 0);
            CharSequence text2 = typedArray.getText(51);
            if (a7.getContentDescription() != text2) {
                a7.setContentDescription(text2);
            }
        }
        int dimensionPixelSize = typedArray.getDimensionPixelSize(29, getResources().getDimensionPixelSize(R.dimen.mtrl_min_touch_target_size));
        if (dimensionPixelSize >= 0) {
            if (dimensionPixelSize != this.f12212v) {
                this.f12212v = dimensionPixelSize;
                a7.setMinimumWidth(dimensionPixelSize);
                a7.setMinimumHeight(dimensionPixelSize);
                a6.setMinimumWidth(dimensionPixelSize);
                a6.setMinimumHeight(dimensionPixelSize);
            }
            if (typedArray.hasValue(31)) {
                ImageView.ScaleType k6 = b.k(typedArray.getInt(31, -1));
                this.f12213w = k6;
                a7.setScaleType(k6);
                a6.setScaleType(k6);
            }
            b0Var.setVisibility(8);
            b0Var.setId(R.id.textinput_suffix_text);
            b0Var.setLayoutParams(new LinearLayout.LayoutParams(-2, -2, 80.0f));
            b0Var.setAccessibilityLiveRegion(1);
            b0Var.setTextAppearance(typedArray.getResourceId(72, 0));
            if (typedArray.hasValue(73)) {
                b0Var.setTextColor(iVar2.m(73));
            }
            CharSequence text3 = typedArray.getText(71);
            this.f12215y = !TextUtils.isEmpty(text3) ? text3 : charSequence;
            b0Var.setText(text3);
            n();
            frameLayout.addView(a7);
            addView(b0Var);
            addView(frameLayout);
            addView(a6);
            textInputLayout2.f6559n0.add(kVar);
            if (textInputLayout2.d != null) {
                kVar.a(textInputLayout2);
            }
            addOnAttachStateChangeListener(new N(this, 3));
            return;
        }
        throw new IllegalArgumentException("endIconSize cannot be less than 0");
    }

    public final CheckableImageButton a(ViewGroup viewGroup, LayoutInflater layoutInflater, int i2) {
        CheckableImageButton checkableImageButton = (CheckableImageButton) layoutInflater.inflate(R.layout.design_text_input_end_icon, viewGroup, false);
        checkableImageButton.setId(i2);
        if (d.L0(getContext())) {
            ((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()).setMarginStart(0);
        }
        return checkableImageButton;
    }

    public final m b() {
        m eVar;
        int i2 = this.f12208r;
        U u6 = this.f12207q;
        SparseArray sparseArray = (SparseArray) u6.f8951c;
        m mVar = (m) sparseArray.get(i2);
        if (mVar == null) {
            l lVar = (l) u6.d;
            if (i2 == -1) {
                eVar = new e(lVar, 0);
            } else if (i2 == 0) {
                eVar = new e(lVar, 1);
            } else if (i2 == 1) {
                mVar = new s(lVar, u6.f8950b);
                sparseArray.append(i2, mVar);
            } else if (i2 == 2) {
                eVar = new C1045d(lVar);
            } else if (i2 == 3) {
                eVar = new i(lVar);
            } else {
                throw new IllegalArgumentException(a.f(i2, "Invalid end icon mode: "));
            }
            mVar = eVar;
            sparseArray.append(i2, mVar);
        }
        return mVar;
    }

    public final int c() {
        int i2;
        if (d() || e()) {
            CheckableImageButton checkableImageButton = this.f12206p;
            i2 = ((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()).getMarginStart() + checkableImageButton.getMeasuredWidth();
        } else {
            i2 = 0;
        }
        WeakHashMap weakHashMap = O.f1352a;
        return this.f12216z.getPaddingEnd() + getPaddingEnd() + i2;
    }

    public final boolean d() {
        if (this.f12202b.getVisibility() == 0 && this.f12206p.getVisibility() == 0) {
            return true;
        }
        return false;
    }

    public final boolean e() {
        if (this.f12203c.getVisibility() == 0) {
            return true;
        }
        return false;
    }

    public final void f(boolean z3) {
        boolean z4;
        boolean isActivated;
        boolean z5;
        m b6 = b();
        boolean k6 = b6.k();
        CheckableImageButton checkableImageButton = this.f12206p;
        boolean z6 = true;
        if (!k6 || (z5 = checkableImageButton.d) == b6.l()) {
            z4 = false;
        } else {
            checkableImageButton.setChecked(!z5);
            z4 = true;
        }
        if (!(b6 instanceof i) || (isActivated = checkableImageButton.isActivated()) == b6.j()) {
            z6 = z4;
        } else {
            checkableImageButton.setActivated(!isActivated);
        }
        if (z3 || z6) {
            b.F0(this.f12201a, checkableImageButton, this.f12210t);
        }
    }

    public final void g(int i2) {
        boolean z3;
        Drawable drawable;
        if (this.f12208r != i2) {
            m b6 = b();
            e eVar = this.f12199D;
            AccessibilityManager accessibilityManager = this.f12198C;
            if (!(eVar == null || accessibilityManager == null)) {
                accessibilityManager.removeTouchExplorationStateChangeListener(new L.b(eVar));
            }
            CharSequence charSequence = null;
            this.f12199D = null;
            b6.s();
            this.f12208r = i2;
            Iterator it2 = this.f12209s.iterator();
            if (!it2.hasNext()) {
                if (i2 != 0) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                h(z3);
                m b7 = b();
                int i5 = this.f12207q.f8949a;
                if (i5 == 0) {
                    i5 = b7.d();
                }
                if (i5 != 0) {
                    drawable = b.J(getContext(), i5);
                } else {
                    drawable = null;
                }
                CheckableImageButton checkableImageButton = this.f12206p;
                checkableImageButton.setImageDrawable(drawable);
                TextInputLayout textInputLayout = this.f12201a;
                if (drawable != null) {
                    b.d(textInputLayout, checkableImageButton, this.f12210t, this.f12211u);
                    b.F0(textInputLayout, checkableImageButton, this.f12210t);
                }
                int c3 = b7.c();
                if (c3 != 0) {
                    charSequence = getResources().getText(c3);
                }
                if (checkableImageButton.getContentDescription() != charSequence) {
                    checkableImageButton.setContentDescription(charSequence);
                }
                checkableImageButton.setCheckable(b7.k());
                if (b7.i(textInputLayout.getBoxBackgroundMode())) {
                    b7.r();
                    e h = b7.h();
                    this.f12199D = h;
                    if (!(h == null || accessibilityManager == null)) {
                        WeakHashMap weakHashMap = O.f1352a;
                        if (isAttachedToWindow()) {
                            accessibilityManager.addTouchExplorationStateChangeListener(new L.b(this.f12199D));
                        }
                    }
                    View.OnClickListener f6 = b7.f();
                    View.OnLongClickListener onLongClickListener = this.f12214x;
                    checkableImageButton.setOnClickListener(f6);
                    b.P0(checkableImageButton, onLongClickListener);
                    EditText editText = this.f12197B;
                    if (editText != null) {
                        b7.m(editText);
                        j(b7);
                    }
                    b.d(textInputLayout, checkableImageButton, this.f12210t, this.f12211u);
                    f(true);
                    return;
                }
                throw new IllegalStateException("The current box background mode " + textInputLayout.getBoxBackgroundMode() + " is not supported by the end icon mode " + i2);
            }
            throw o3.d.e(it2);
        }
    }

    public final void h(boolean z3) {
        int i2;
        if (d() != z3) {
            if (z3) {
                i2 = 0;
            } else {
                i2 = 8;
            }
            this.f12206p.setVisibility(i2);
            k();
            m();
            this.f12201a.q();
        }
    }

    public final void i(Drawable drawable) {
        CheckableImageButton checkableImageButton = this.f12203c;
        checkableImageButton.setImageDrawable(drawable);
        l();
        b.d(this.f12201a, checkableImageButton, this.d, this.f12204e);
    }

    public final void j(m mVar) {
        if (this.f12197B != null) {
            if (mVar.e() != null) {
                this.f12197B.setOnFocusChangeListener(mVar.e());
            }
            if (mVar.g() != null) {
                this.f12206p.setOnFocusChangeListener(mVar.g());
            }
        }
    }

    public final void k() {
        int i2;
        boolean z3;
        int i5 = 8;
        if (this.f12206p.getVisibility() != 0 || e()) {
            i2 = 8;
        } else {
            i2 = 0;
        }
        this.f12202b.setVisibility(i2);
        if (this.f12215y == null || this.f12196A) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (d() || e() || !z3) {
            i5 = 0;
        }
        setVisibility(i5);
    }

    public final void l() {
        int i2;
        CheckableImageButton checkableImageButton = this.f12203c;
        Drawable drawable = checkableImageButton.getDrawable();
        TextInputLayout textInputLayout = this.f12201a;
        if (drawable == null || !textInputLayout.f6567s.f12240q || !textInputLayout.m()) {
            i2 = 8;
        } else {
            i2 = 0;
        }
        checkableImageButton.setVisibility(i2);
        k();
        m();
        if (this.f12208r == 0) {
            textInputLayout.q();
        }
    }

    public final void m() {
        int i2;
        TextInputLayout textInputLayout = this.f12201a;
        if (textInputLayout.d != null) {
            if (d() || e()) {
                i2 = 0;
            } else {
                EditText editText = textInputLayout.d;
                WeakHashMap weakHashMap = O.f1352a;
                i2 = editText.getPaddingEnd();
            }
            int dimensionPixelSize = getContext().getResources().getDimensionPixelSize(R.dimen.material_input_text_to_prefix_suffix_padding);
            int paddingTop = textInputLayout.d.getPaddingTop();
            int paddingBottom = textInputLayout.d.getPaddingBottom();
            WeakHashMap weakHashMap2 = O.f1352a;
            this.f12216z.setPaddingRelative(dimensionPixelSize, paddingTop, i2, paddingBottom);
        }
    }

    public final void n() {
        int i2;
        C0703b0 b0Var = this.f12216z;
        int visibility = b0Var.getVisibility();
        boolean z3 = false;
        if (this.f12215y == null || this.f12196A) {
            i2 = 8;
        } else {
            i2 = 0;
        }
        if (visibility != i2) {
            m b6 = b();
            if (i2 == 0) {
                z3 = true;
            }
            b6.p(z3);
        }
        k();
        b0Var.setVisibility(i2);
        this.f12201a.q();
    }
}
