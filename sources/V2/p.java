package v2;

import K.O;
import K1.e;
import Z1.a;
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bumptech.glide.d;
import com.google.android.material.textfield.TextInputLayout;
import com.mtma.criminal.city.R;
import java.util.ArrayList;
import java.util.WeakHashMap;
import k.C0703b0;

public final class p {

    /* renamed from: A  reason: collision with root package name */
    public ColorStateList f12225A;

    /* renamed from: B  reason: collision with root package name */
    public Typeface f12226B;

    /* renamed from: a  reason: collision with root package name */
    public final int f12227a;

    /* renamed from: b  reason: collision with root package name */
    public final int f12228b;

    /* renamed from: c  reason: collision with root package name */
    public final int f12229c;
    public final TimeInterpolator d;

    /* renamed from: e  reason: collision with root package name */
    public final TimeInterpolator f12230e;

    /* renamed from: f  reason: collision with root package name */
    public final TimeInterpolator f12231f;
    public final Context g;
    public final TextInputLayout h;

    /* renamed from: i  reason: collision with root package name */
    public LinearLayout f12232i;

    /* renamed from: j  reason: collision with root package name */
    public int f12233j;

    /* renamed from: k  reason: collision with root package name */
    public FrameLayout f12234k;

    /* renamed from: l  reason: collision with root package name */
    public AnimatorSet f12235l;

    /* renamed from: m  reason: collision with root package name */
    public final float f12236m;

    /* renamed from: n  reason: collision with root package name */
    public int f12237n;

    /* renamed from: o  reason: collision with root package name */
    public int f12238o;

    /* renamed from: p  reason: collision with root package name */
    public CharSequence f12239p;

    /* renamed from: q  reason: collision with root package name */
    public boolean f12240q;

    /* renamed from: r  reason: collision with root package name */
    public C0703b0 f12241r;

    /* renamed from: s  reason: collision with root package name */
    public CharSequence f12242s;

    /* renamed from: t  reason: collision with root package name */
    public int f12243t;

    /* renamed from: u  reason: collision with root package name */
    public int f12244u;

    /* renamed from: v  reason: collision with root package name */
    public ColorStateList f12245v;

    /* renamed from: w  reason: collision with root package name */
    public CharSequence f12246w;

    /* renamed from: x  reason: collision with root package name */
    public boolean f12247x;

    /* renamed from: y  reason: collision with root package name */
    public C0703b0 f12248y;

    /* renamed from: z  reason: collision with root package name */
    public int f12249z;

    public p(TextInputLayout textInputLayout) {
        Context context = textInputLayout.getContext();
        this.g = context;
        this.h = textInputLayout;
        this.f12236m = (float) context.getResources().getDimensionPixelSize(R.dimen.design_textinput_caption_translate_y);
        this.f12227a = e.n0(R.attr.motionDurationShort4, 217, context);
        this.f12228b = e.n0(R.attr.motionDurationMedium4, 167, context);
        this.f12229c = e.n0(R.attr.motionDurationShort4, 167, context);
        this.d = e.o0(context, R.attr.motionEasingEmphasizedDecelerateInterpolator, a.d);
        LinearInterpolator linearInterpolator = a.f4469a;
        this.f12230e = e.o0(context, R.attr.motionEasingEmphasizedDecelerateInterpolator, linearInterpolator);
        this.f12231f = e.o0(context, R.attr.motionEasingLinearInterpolator, linearInterpolator);
    }

    public final void a(C0703b0 b0Var, int i2) {
        if (this.f12232i == null && this.f12234k == null) {
            Context context = this.g;
            LinearLayout linearLayout = new LinearLayout(context);
            this.f12232i = linearLayout;
            linearLayout.setOrientation(0);
            LinearLayout linearLayout2 = this.f12232i;
            TextInputLayout textInputLayout = this.h;
            textInputLayout.addView(linearLayout2, -1, -2);
            this.f12234k = new FrameLayout(context);
            this.f12232i.addView(this.f12234k, new LinearLayout.LayoutParams(0, -2, 1.0f));
            if (textInputLayout.getEditText() != null) {
                b();
            }
        }
        if (i2 == 0 || i2 == 1) {
            this.f12234k.setVisibility(0);
            this.f12234k.addView(b0Var);
        } else {
            this.f12232i.addView(b0Var, new LinearLayout.LayoutParams(-2, -2));
        }
        this.f12232i.setVisibility(0);
        this.f12233j++;
    }

    public final void b() {
        if (this.f12232i != null) {
            TextInputLayout textInputLayout = this.h;
            if (textInputLayout.getEditText() != null) {
                EditText editText = textInputLayout.getEditText();
                Context context = this.g;
                boolean L0 = d.L0(context);
                LinearLayout linearLayout = this.f12232i;
                WeakHashMap weakHashMap = O.f1352a;
                int paddingStart = editText.getPaddingStart();
                if (L0) {
                    paddingStart = context.getResources().getDimensionPixelSize(R.dimen.material_helper_text_font_1_3_padding_horizontal);
                }
                int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.material_helper_text_default_padding_top);
                if (L0) {
                    dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.material_helper_text_font_1_3_padding_top);
                }
                int paddingEnd = editText.getPaddingEnd();
                if (L0) {
                    paddingEnd = context.getResources().getDimensionPixelSize(R.dimen.material_helper_text_font_1_3_padding_horizontal);
                }
                linearLayout.setPaddingRelative(paddingStart, dimensionPixelSize, paddingEnd, 0);
            }
        }
    }

    public final void c() {
        AnimatorSet animatorSet = this.f12235l;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
    }

    public final void d(ArrayList arrayList, boolean z3, C0703b0 b0Var, int i2, int i5, int i6) {
        boolean z4;
        float f6;
        long j6;
        TimeInterpolator timeInterpolator;
        if (b0Var != null && z3) {
            if (i2 == i6 || i2 == i5) {
                if (i6 == i2) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (z4) {
                    f6 = 1.0f;
                } else {
                    f6 = 0.0f;
                }
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(b0Var, View.ALPHA, new float[]{f6});
                int i7 = this.f12229c;
                if (z4) {
                    j6 = (long) this.f12228b;
                } else {
                    j6 = (long) i7;
                }
                ofFloat.setDuration(j6);
                if (z4) {
                    timeInterpolator = this.f12230e;
                } else {
                    timeInterpolator = this.f12231f;
                }
                ofFloat.setInterpolator(timeInterpolator);
                if (i2 == i6 && i5 != 0) {
                    ofFloat.setStartDelay((long) i7);
                }
                arrayList.add(ofFloat);
                if (i6 == i2 && i5 != 0) {
                    ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(b0Var, View.TRANSLATION_Y, new float[]{-this.f12236m, 0.0f});
                    ofFloat2.setDuration((long) this.f12227a);
                    ofFloat2.setInterpolator(this.d);
                    ofFloat2.setStartDelay((long) i7);
                    arrayList.add(ofFloat2);
                }
            }
        }
    }

    public final TextView e(int i2) {
        if (i2 == 1) {
            return this.f12241r;
        }
        if (i2 != 2) {
            return null;
        }
        return this.f12248y;
    }

    public final void f() {
        this.f12239p = null;
        c();
        if (this.f12237n == 1) {
            if (!this.f12247x || TextUtils.isEmpty(this.f12246w)) {
                this.f12238o = 0;
            } else {
                this.f12238o = 2;
            }
        }
        i(this.f12237n, this.f12238o, h(this.f12241r, ""));
    }

    public final void g(C0703b0 b0Var, int i2) {
        FrameLayout frameLayout;
        LinearLayout linearLayout = this.f12232i;
        if (linearLayout != null) {
            if ((i2 == 0 || i2 == 1) && (frameLayout = this.f12234k) != null) {
                frameLayout.removeView(b0Var);
            } else {
                linearLayout.removeView(b0Var);
            }
            int i5 = this.f12233j - 1;
            this.f12233j = i5;
            LinearLayout linearLayout2 = this.f12232i;
            if (i5 == 0) {
                linearLayout2.setVisibility(8);
            }
        }
    }

    public final boolean h(C0703b0 b0Var, CharSequence charSequence) {
        WeakHashMap weakHashMap = O.f1352a;
        TextInputLayout textInputLayout = this.h;
        if (!textInputLayout.isLaidOut() || !textInputLayout.isEnabled() || (this.f12238o == this.f12237n && b0Var != null && TextUtils.equals(b0Var.getText(), charSequence))) {
            return false;
        }
        return true;
    }

    public final void i(int i2, int i5, boolean z3) {
        TextView e6;
        TextView e7;
        int i6 = i2;
        int i7 = i5;
        boolean z4 = z3;
        if (i6 != i7) {
            if (z4) {
                AnimatorSet animatorSet = new AnimatorSet();
                this.f12235l = animatorSet;
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = arrayList;
                int i8 = i2;
                int i9 = i5;
                d(arrayList2, this.f12247x, this.f12248y, 2, i8, i9);
                d(arrayList2, this.f12240q, this.f12241r, 1, i8, i9);
                int size = arrayList.size();
                long j6 = 0;
                for (int i10 = 0; i10 < size; i10++) {
                    Animator animator = (Animator) arrayList.get(i10);
                    j6 = Math.max(j6, animator.getDuration() + animator.getStartDelay());
                }
                ValueAnimator ofInt = ValueAnimator.ofInt(new int[]{0, 0});
                ofInt.setDuration(j6);
                arrayList.add(0, ofInt);
                animatorSet.playTogether(arrayList);
                animatorSet.addListener(new n(this, i5, e(i2), i2, e(i7)));
                animatorSet.start();
            } else if (i6 != i7) {
                if (!(i7 == 0 || (e7 = e(i7)) == null)) {
                    e7.setVisibility(0);
                    e7.setAlpha(1.0f);
                }
                if (!(i6 == 0 || (e6 = e(i2)) == null)) {
                    e6.setVisibility(4);
                    if (i6 == 1) {
                        e6.setText((CharSequence) null);
                    }
                }
                this.f12237n = i7;
            }
            TextInputLayout textInputLayout = this.h;
            textInputLayout.r();
            textInputLayout.u(z4, false);
            textInputLayout.x();
        }
    }
}
