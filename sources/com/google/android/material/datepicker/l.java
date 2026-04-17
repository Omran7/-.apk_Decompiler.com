package com.google.android.material.datepicker;

import K.C0062b;
import K.D;
import K.O;
import K.Z;
import K.w0;
import K.y0;
import K1.e;
import R2.b;
import Y1.a;
import a2.C0260b;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.C0280l;
import com.bumptech.glide.c;
import com.bumptech.glide.d;
import com.google.android.material.internal.CheckableImageButton;
import com.mtma.criminal.city.R;
import j2.C0608a;
import java.util.Calendar;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.WeakHashMap;
import s2.g;

public final class l<S> extends C0280l {

    /* renamed from: A0  reason: collision with root package name */
    public int f6424A0;

    /* renamed from: B0  reason: collision with root package name */
    public int f6425B0;

    /* renamed from: C0  reason: collision with root package name */
    public CharSequence f6426C0;

    /* renamed from: D0  reason: collision with root package name */
    public int f6427D0;

    /* renamed from: E0  reason: collision with root package name */
    public CharSequence f6428E0;

    /* renamed from: F0  reason: collision with root package name */
    public int f6429F0;

    /* renamed from: G0  reason: collision with root package name */
    public CharSequence f6430G0;

    /* renamed from: H0  reason: collision with root package name */
    public int f6431H0;

    /* renamed from: I0  reason: collision with root package name */
    public CharSequence f6432I0;

    /* renamed from: J0  reason: collision with root package name */
    public TextView f6433J0;

    /* renamed from: K0  reason: collision with root package name */
    public CheckableImageButton f6434K0;
    public g L0;

    /* renamed from: M0  reason: collision with root package name */
    public boolean f6435M0;

    /* renamed from: N0  reason: collision with root package name */
    public CharSequence f6436N0;
    public CharSequence O0;

    /* renamed from: r0  reason: collision with root package name */
    public final LinkedHashSet f6437r0 = new LinkedHashSet();
    public final LinkedHashSet s0 = new LinkedHashSet();

    /* renamed from: t0  reason: collision with root package name */
    public int f6438t0;

    /* renamed from: u0  reason: collision with root package name */
    public t f6439u0;

    /* renamed from: v0  reason: collision with root package name */
    public b f6440v0;

    /* renamed from: w0  reason: collision with root package name */
    public k f6441w0;

    /* renamed from: x0  reason: collision with root package name */
    public int f6442x0;

    /* renamed from: y0  reason: collision with root package name */
    public CharSequence f6443y0;

    /* renamed from: z0  reason: collision with root package name */
    public boolean f6444z0;

    public l() {
        new LinkedHashSet();
        new LinkedHashSet();
    }

    public static int X(Context context) {
        Resources resources = context.getResources();
        int dimensionPixelOffset = resources.getDimensionPixelOffset(R.dimen.mtrl_calendar_content_padding);
        Calendar b6 = w.b();
        b6.set(5, 1);
        Calendar a6 = w.a(b6);
        a6.get(2);
        a6.get(1);
        int maximum = a6.getMaximum(7);
        a6.getActualMaximum(5);
        a6.getTimeInMillis();
        int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.mtrl_calendar_day_width) * maximum;
        return ((maximum - 1) * resources.getDimensionPixelOffset(R.dimen.mtrl_calendar_month_horizontal_padding)) + dimensionPixelSize + (dimensionPixelOffset * 2);
    }

    public static boolean Y(Context context, int i2) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(c.j0(R.attr.materialCalendarStyle, context, k.class.getCanonicalName()).data, new int[]{i2});
        boolean z3 = obtainStyledAttributes.getBoolean(0, false);
        obtainStyledAttributes.recycle();
        return z3;
    }

    public final void B(Bundle bundle) {
        super.B(bundle);
        if (bundle == null) {
            bundle = this.f5178f;
        }
        this.f6438t0 = bundle.getInt("OVERRIDE_THEME_RES_ID");
        if (bundle.getParcelable("DATE_SELECTOR_KEY") == null) {
            this.f6440v0 = (b) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
            if (bundle.getParcelable("DAY_VIEW_DECORATOR_KEY") == null) {
                this.f6442x0 = bundle.getInt("TITLE_TEXT_RES_ID_KEY");
                this.f6443y0 = bundle.getCharSequence("TITLE_TEXT_KEY");
                this.f6424A0 = bundle.getInt("INPUT_MODE_KEY");
                this.f6425B0 = bundle.getInt("POSITIVE_BUTTON_TEXT_RES_ID_KEY");
                this.f6426C0 = bundle.getCharSequence("POSITIVE_BUTTON_TEXT_KEY");
                this.f6427D0 = bundle.getInt("POSITIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY");
                this.f6428E0 = bundle.getCharSequence("POSITIVE_BUTTON_CONTENT_DESCRIPTION_KEY");
                this.f6429F0 = bundle.getInt("NEGATIVE_BUTTON_TEXT_RES_ID_KEY");
                this.f6430G0 = bundle.getCharSequence("NEGATIVE_BUTTON_TEXT_KEY");
                this.f6431H0 = bundle.getInt("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY");
                this.f6432I0 = bundle.getCharSequence("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_KEY");
                CharSequence charSequence = this.f6443y0;
                if (charSequence == null) {
                    charSequence = Q().getResources().getText(this.f6442x0);
                }
                this.f6436N0 = charSequence;
                if (charSequence != null) {
                    CharSequence[] split = TextUtils.split(String.valueOf(charSequence), "\n");
                    if (split.length > 1) {
                        charSequence = split[0];
                    }
                } else {
                    charSequence = null;
                }
                this.O0 = charSequence;
                return;
            }
            throw new ClassCastException();
        }
        throw new ClassCastException();
    }

    public final View C(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        int i2;
        String str;
        if (this.f6444z0) {
            i2 = R.layout.mtrl_picker_fullscreen;
        } else {
            i2 = R.layout.mtrl_picker_dialog;
        }
        View inflate = layoutInflater.inflate(i2, viewGroup);
        Context context = inflate.getContext();
        if (this.f6444z0) {
            inflate.findViewById(R.id.mtrl_calendar_frame).setLayoutParams(new LinearLayout.LayoutParams(X(context), -2));
        } else {
            inflate.findViewById(R.id.mtrl_calendar_main_pane).setLayoutParams(new LinearLayout.LayoutParams(X(context), -1));
        }
        WeakHashMap weakHashMap = O.f1352a;
        ((TextView) inflate.findViewById(R.id.mtrl_picker_header_selection_text)).setAccessibilityLiveRegion(1);
        this.f6434K0 = (CheckableImageButton) inflate.findViewById(R.id.mtrl_picker_header_toggle);
        this.f6433J0 = (TextView) inflate.findViewById(R.id.mtrl_picker_title_text);
        this.f6434K0.setTag("TOGGLE_BUTTON_TAG");
        CheckableImageButton checkableImageButton = this.f6434K0;
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{16842912}, b.J(context, R.drawable.material_ic_calendar_black_24dp));
        boolean z3 = false;
        stateListDrawable.addState(new int[0], b.J(context, R.drawable.material_ic_edit_black_24dp));
        checkableImageButton.setImageDrawable(stateListDrawable);
        CheckableImageButton checkableImageButton2 = this.f6434K0;
        if (this.f6424A0 != 0) {
            z3 = true;
        }
        checkableImageButton2.setChecked(z3);
        O.l(this.f6434K0, (C0062b) null);
        CheckableImageButton checkableImageButton3 = this.f6434K0;
        if (this.f6424A0 == 1) {
            str = checkableImageButton3.getContext().getString(R.string.mtrl_picker_toggle_to_calendar_input_mode);
        } else {
            str = checkableImageButton3.getContext().getString(R.string.mtrl_picker_toggle_to_text_input_mode);
        }
        this.f6434K0.setContentDescription(str);
        this.f6434K0.setOnClickListener(new A4.b(this, 1));
        Button button = (Button) inflate.findViewById(R.id.confirm_button);
        W();
        throw null;
    }

    /* JADX WARNING: type inference failed for: r2v2, types: [java.lang.Object, com.google.android.material.datepicker.a] */
    public final void J(Bundle bundle) {
        o oVar;
        o oVar2;
        Bundle bundle2 = bundle;
        super.J(bundle);
        bundle2.putInt("OVERRIDE_THEME_RES_ID", this.f6438t0);
        bundle2.putParcelable("DATE_SELECTOR_KEY", (Parcelable) null);
        b bVar = this.f6440v0;
        ? obj = new Object();
        int i2 = a.f6390b;
        int i5 = a.f6390b;
        long j6 = bVar.f6392a.f6452f;
        long j7 = bVar.f6393b.f6452f;
        obj.f6391a = Long.valueOf(bVar.d.f6452f);
        k kVar = this.f6441w0;
        if (kVar == null) {
            oVar = null;
        } else {
            oVar = kVar.f6415g0;
        }
        if (oVar != null) {
            obj.f6391a = Long.valueOf(oVar.f6452f);
        }
        Bundle bundle3 = new Bundle();
        bundle3.putParcelable("DEEP_COPY_VALIDATOR_KEY", bVar.f6394c);
        o e6 = o.e(j6);
        o e7 = o.e(j7);
        d dVar = (d) bundle3.getParcelable("DEEP_COPY_VALIDATOR_KEY");
        Long l6 = obj.f6391a;
        if (l6 == null) {
            oVar2 = null;
        } else {
            oVar2 = o.e(l6.longValue());
        }
        bundle2.putParcelable("CALENDAR_CONSTRAINTS_KEY", new b(e6, e7, dVar, oVar2, bVar.f6395e));
        bundle2.putParcelable("DAY_VIEW_DECORATOR_KEY", (Parcelable) null);
        bundle2.putInt("TITLE_TEXT_RES_ID_KEY", this.f6442x0);
        bundle2.putCharSequence("TITLE_TEXT_KEY", this.f6443y0);
        bundle2.putInt("INPUT_MODE_KEY", this.f6424A0);
        bundle2.putInt("POSITIVE_BUTTON_TEXT_RES_ID_KEY", this.f6425B0);
        bundle2.putCharSequence("POSITIVE_BUTTON_TEXT_KEY", this.f6426C0);
        bundle2.putInt("POSITIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY", this.f6427D0);
        bundle2.putCharSequence("POSITIVE_BUTTON_CONTENT_DESCRIPTION_KEY", this.f6428E0);
        bundle2.putInt("NEGATIVE_BUTTON_TEXT_RES_ID_KEY", this.f6429F0);
        bundle2.putCharSequence("NEGATIVE_BUTTON_TEXT_KEY", this.f6430G0);
        bundle2.putInt("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY", this.f6431H0);
        bundle2.putCharSequence("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_KEY", this.f6432I0);
    }

    public final void K() {
        CharSequence charSequence;
        Integer num;
        boolean z3;
        int i2;
        boolean z4;
        y0 y0Var;
        y0 y0Var2;
        super.K();
        Dialog dialog = this.f5126m0;
        if (dialog != null) {
            Window window = dialog.getWindow();
            if (this.f6444z0) {
                window.setLayout(-1, -1);
                window.setBackgroundDrawable(this.L0);
                if (!this.f6435M0) {
                    View findViewById = R().findViewById(R.id.fullscreen_header);
                    ColorStateList c02 = d.c0(findViewById.getBackground());
                    if (c02 != null) {
                        num = Integer.valueOf(c02.getDefaultColor());
                    } else {
                        num = null;
                    }
                    int i5 = Build.VERSION.SDK_INT;
                    boolean z5 = false;
                    if (num == null || num.intValue() == 0) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    int s6 = e.s(16842801, -16777216, window.getContext());
                    if (z3) {
                        num = Integer.valueOf(s6);
                    }
                    if (i5 >= 30) {
                        Z.a(window, false);
                    } else {
                        View decorView = window.getDecorView();
                        decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | 1792);
                    }
                    window.getContext();
                    Context context = window.getContext();
                    if (i5 < 27) {
                        i2 = C.d.d(e.s(16843858, -16777216, context), 128);
                    } else {
                        i2 = 0;
                    }
                    window.setStatusBarColor(0);
                    window.setNavigationBarColor(i2);
                    boolean a02 = e.a0(num.intValue());
                    if (e.a0(0) || a02) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    s2.e eVar = new s2.e(window.getDecorView());
                    int i6 = Build.VERSION.SDK_INT;
                    if (i6 >= 30) {
                        y0 y0Var3 = new y0(window.getInsetsController(), eVar);
                        y0Var3.f1440x = window;
                        y0Var = y0Var3;
                    } else if (i6 >= 26) {
                        y0Var = new w0(window, eVar);
                    } else {
                        y0Var = new w0(window, eVar);
                    }
                    y0Var.m0(z4);
                    boolean a03 = e.a0(s6);
                    if (e.a0(i2) || (i2 == 0 && a03)) {
                        z5 = true;
                    }
                    s2.e eVar2 = new s2.e(window.getDecorView());
                    int i7 = Build.VERSION.SDK_INT;
                    if (i7 >= 30) {
                        y0 y0Var4 = new y0(window.getInsetsController(), eVar2);
                        y0Var4.f1440x = window;
                        y0Var2 = y0Var4;
                    } else if (i7 >= 26) {
                        y0Var2 = new w0(window, eVar2);
                    } else {
                        y0Var2 = new w0(window, eVar2);
                    }
                    y0Var2.l0(z5);
                    C0260b bVar = new C0260b(findViewById, findViewById.getLayoutParams().height, findViewById.getPaddingTop());
                    WeakHashMap weakHashMap = O.f1352a;
                    D.u(findViewById, bVar);
                    this.f6435M0 = true;
                }
            } else {
                window.setLayout(-2, -2);
                int dimensionPixelOffset = q().getDimensionPixelOffset(R.dimen.mtrl_calendar_dialog_background_inset);
                Rect rect = new Rect(dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset);
                window.setBackgroundDrawable(new InsetDrawable(this.L0, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset));
                View decorView2 = window.getDecorView();
                Dialog dialog2 = this.f5126m0;
                if (dialog2 != null) {
                    decorView2.setOnTouchListener(new C0608a(dialog2, rect));
                } else {
                    throw new IllegalStateException("DialogFragment " + this + " does not have a Dialog.");
                }
            }
            Q();
            int i8 = this.f6438t0;
            if (i8 != 0) {
                W();
                b bVar2 = this.f6440v0;
                k kVar = new k();
                Bundle bundle = new Bundle();
                bundle.putInt("THEME_RES_ID_KEY", i8);
                bundle.putParcelable("GRID_SELECTOR_KEY", (Parcelable) null);
                bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", bVar2);
                bundle.putParcelable("DAY_VIEW_DECORATOR_KEY", (Parcelable) null);
                bundle.putParcelable("CURRENT_MONTH_KEY", bVar2.d);
                kVar.T(bundle);
                this.f6441w0 = kVar;
                t tVar = kVar;
                if (this.f6424A0 == 1) {
                    W();
                    b bVar3 = this.f6440v0;
                    t mVar = new m();
                    Bundle bundle2 = new Bundle();
                    bundle2.putInt("THEME_RES_ID_KEY", i8);
                    bundle2.putParcelable("DATE_SELECTOR_KEY", (Parcelable) null);
                    bundle2.putParcelable("CALENDAR_CONSTRAINTS_KEY", bVar3);
                    mVar.T(bundle2);
                    tVar = mVar;
                }
                this.f6439u0 = tVar;
                TextView textView = this.f6433J0;
                if (this.f6424A0 == 1 && q().getConfiguration().orientation == 2) {
                    charSequence = this.O0;
                } else {
                    charSequence = this.f6436N0;
                }
                textView.setText(charSequence);
                W();
                throw null;
            }
            W();
            throw null;
        }
        throw new IllegalStateException("DialogFragment " + this + " does not have a Dialog.");
    }

    public final void L() {
        this.f6439u0.f6464d0.clear();
        super.L();
    }

    public final Dialog V() {
        Context Q5 = Q();
        Q();
        int i2 = this.f6438t0;
        if (i2 != 0) {
            Dialog dialog = new Dialog(Q5, i2);
            Context context = dialog.getContext();
            this.f6444z0 = Y(context, 16843277);
            this.L0 = new g(context, (AttributeSet) null, R.attr.materialCalendarStyle, 2131952679);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes((AttributeSet) null, a.f4255l, R.attr.materialCalendarStyle, 2131952679);
            int color = obtainStyledAttributes.getColor(1, 0);
            obtainStyledAttributes.recycle();
            this.L0.h(context);
            this.L0.j(ColorStateList.valueOf(color));
            g gVar = this.L0;
            View decorView = dialog.getWindow().getDecorView();
            WeakHashMap weakHashMap = O.f1352a;
            gVar.i(D.i(decorView));
            return dialog;
        }
        W();
        throw null;
    }

    public final void W() {
        if (this.f5178f.getParcelable("DATE_SELECTOR_KEY") != null) {
            throw new ClassCastException();
        }
    }

    public final void onCancel(DialogInterface dialogInterface) {
        Iterator it2 = this.f6437r0.iterator();
        while (it2.hasNext()) {
            ((DialogInterface.OnCancelListener) it2.next()).onCancel(dialogInterface);
        }
    }

    public final void onDismiss(DialogInterface dialogInterface) {
        Iterator it2 = this.s0.iterator();
        while (it2.hasNext()) {
            ((DialogInterface.OnDismissListener) it2.next()).onDismiss(dialogInterface);
        }
        ViewGroup viewGroup = (ViewGroup) this.f5159N;
        if (viewGroup != null) {
            viewGroup.removeAllViews();
        }
        super.onDismiss(dialogInterface);
    }
}
