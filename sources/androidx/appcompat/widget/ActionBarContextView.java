package androidx.appcompat.widget;

import K.O;
import K.X;
import K4.m;
import R2.b;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.mtma.criminal.city.R;
import com.mtma.criminal.city.utils.C0432b;
import e.C0476a;
import i.C0571a;
import j.k;
import j.y;
import k.C0710f;
import k.C0718j;
import k.i1;

public class ActionBarContextView extends ViewGroup {

    /* renamed from: A  reason: collision with root package name */
    public final int f4718A;

    /* renamed from: B  reason: collision with root package name */
    public boolean f4719B;

    /* renamed from: C  reason: collision with root package name */
    public final int f4720C;

    /* renamed from: a  reason: collision with root package name */
    public final C0432b f4721a = new C0432b(this);

    /* renamed from: b  reason: collision with root package name */
    public final Context f4722b;

    /* renamed from: c  reason: collision with root package name */
    public ActionMenuView f4723c;
    public C0718j d;

    /* renamed from: e  reason: collision with root package name */
    public int f4724e;

    /* renamed from: f  reason: collision with root package name */
    public X f4725f;

    /* renamed from: p  reason: collision with root package name */
    public boolean f4726p;

    /* renamed from: q  reason: collision with root package name */
    public boolean f4727q;

    /* renamed from: r  reason: collision with root package name */
    public CharSequence f4728r;

    /* renamed from: s  reason: collision with root package name */
    public CharSequence f4729s;

    /* renamed from: t  reason: collision with root package name */
    public View f4730t;

    /* renamed from: u  reason: collision with root package name */
    public View f4731u;

    /* renamed from: v  reason: collision with root package name */
    public View f4732v;

    /* renamed from: w  reason: collision with root package name */
    public LinearLayout f4733w;

    /* renamed from: x  reason: collision with root package name */
    public TextView f4734x;

    /* renamed from: y  reason: collision with root package name */
    public TextView f4735y;

    /* renamed from: z  reason: collision with root package name */
    public final int f4736z;

    public ActionBarContextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.actionModeStyle);
        Drawable drawable;
        int resourceId;
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(R.attr.actionBarPopupTheme, typedValue, true) || typedValue.resourceId == 0) {
            this.f4722b = context;
        } else {
            this.f4722b = new ContextThemeWrapper(context, typedValue.resourceId);
        }
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0476a.d, R.attr.actionModeStyle, 0);
        if (!obtainStyledAttributes.hasValue(0) || (resourceId = obtainStyledAttributes.getResourceId(0, 0)) == 0) {
            drawable = obtainStyledAttributes.getDrawable(0);
        } else {
            drawable = b.J(context, resourceId);
        }
        setBackground(drawable);
        this.f4736z = obtainStyledAttributes.getResourceId(5, 0);
        this.f4718A = obtainStyledAttributes.getResourceId(4, 0);
        this.f4724e = obtainStyledAttributes.getLayoutDimension(3, 0);
        this.f4720C = obtainStyledAttributes.getResourceId(2, R.layout.abc_action_mode_close_item_material);
        obtainStyledAttributes.recycle();
    }

    public static int f(View view, int i2, int i5) {
        view.measure(View.MeasureSpec.makeMeasureSpec(i2, Integer.MIN_VALUE), i5);
        return Math.max(0, i2 - view.getMeasuredWidth());
    }

    public static int g(View view, int i2, int i5, int i6, boolean z3) {
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        int i7 = ((i6 - measuredHeight) / 2) + i5;
        if (z3) {
            view.layout(i2 - measuredWidth, i7, i2, measuredHeight + i7);
        } else {
            view.layout(i2, i7, i2 + measuredWidth, measuredHeight + i7);
        }
        if (z3) {
            return -measuredWidth;
        }
        return measuredWidth;
    }

    public final void c(C0571a aVar) {
        View view = this.f4730t;
        if (view == null) {
            View inflate = LayoutInflater.from(getContext()).inflate(this.f4720C, this, false);
            this.f4730t = inflate;
            addView(inflate);
        } else if (view.getParent() == null) {
            addView(this.f4730t);
        }
        View findViewById = this.f4730t.findViewById(R.id.action_mode_close_button);
        this.f4731u = findViewById;
        findViewById.setOnClickListener(new m(aVar, 3));
        k c3 = aVar.c();
        C0718j jVar = this.d;
        if (jVar != null) {
            jVar.c();
            C0710f fVar = jVar.f9320C;
            if (fVar != null && fVar.b()) {
                fVar.f8788i.dismiss();
            }
        }
        C0718j jVar2 = new C0718j(getContext());
        this.d = jVar2;
        jVar2.f9333u = true;
        jVar2.f9334v = true;
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-2, -1);
        c3.b(this.d, this.f4722b);
        C0718j jVar3 = this.d;
        y yVar = jVar3.f9329q;
        if (yVar == null) {
            y yVar2 = (y) jVar3.d.inflate(jVar3.f9327f, this, false);
            jVar3.f9329q = yVar2;
            yVar2.a(jVar3.f9325c);
            jVar3.e();
        }
        y yVar3 = jVar3.f9329q;
        if (yVar != yVar3) {
            ((ActionMenuView) yVar3).setPresenter(jVar3);
        }
        ActionMenuView actionMenuView = (ActionMenuView) yVar3;
        this.f4723c = actionMenuView;
        actionMenuView.setBackground((Drawable) null);
        addView(this.f4723c, layoutParams);
    }

    public final void d() {
        int i2;
        if (this.f4733w == null) {
            LayoutInflater.from(getContext()).inflate(R.layout.abc_action_bar_title_item, this);
            LinearLayout linearLayout = (LinearLayout) getChildAt(getChildCount() - 1);
            this.f4733w = linearLayout;
            this.f4734x = (TextView) linearLayout.findViewById(R.id.action_bar_title);
            this.f4735y = (TextView) this.f4733w.findViewById(R.id.action_bar_subtitle);
            int i5 = this.f4736z;
            if (i5 != 0) {
                this.f4734x.setTextAppearance(getContext(), i5);
            }
            int i6 = this.f4718A;
            if (i6 != 0) {
                this.f4735y.setTextAppearance(getContext(), i6);
            }
        }
        this.f4734x.setText(this.f4728r);
        this.f4735y.setText(this.f4729s);
        boolean isEmpty = TextUtils.isEmpty(this.f4728r);
        boolean isEmpty2 = TextUtils.isEmpty(this.f4729s);
        TextView textView = this.f4735y;
        int i7 = 8;
        if (!isEmpty2) {
            i2 = 0;
        } else {
            i2 = 8;
        }
        textView.setVisibility(i2);
        LinearLayout linearLayout2 = this.f4733w;
        if (!isEmpty || !isEmpty2) {
            i7 = 0;
        }
        linearLayout2.setVisibility(i7);
        if (this.f4733w.getParent() == null) {
            addView(this.f4733w);
        }
    }

    public final void e() {
        removeAllViews();
        this.f4732v = null;
        this.f4723c = null;
        this.d = null;
        View view = this.f4731u;
        if (view != null) {
            view.setOnClickListener((View.OnClickListener) null);
        }
    }

    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new ViewGroup.MarginLayoutParams(-1, -2);
    }

    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new ViewGroup.MarginLayoutParams(getContext(), attributeSet);
    }

    public int getAnimatedVisibility() {
        if (this.f4725f != null) {
            return this.f4721a.f7393c;
        }
        return getVisibility();
    }

    public int getContentHeight() {
        return this.f4724e;
    }

    public CharSequence getSubtitle() {
        return this.f4729s;
    }

    public CharSequence getTitle() {
        return this.f4728r;
    }

    /* renamed from: h */
    public final void setVisibility(int i2) {
        if (i2 != getVisibility()) {
            X x6 = this.f4725f;
            if (x6 != null) {
                x6.b();
            }
            super.setVisibility(i2);
        }
    }

    public final X i(int i2, long j6) {
        X x6 = this.f4725f;
        if (x6 != null) {
            x6.b();
        }
        C0432b bVar = this.f4721a;
        if (i2 == 0) {
            if (getVisibility() != 0) {
                setAlpha(0.0f);
            }
            X a6 = O.a(this);
            a6.a(1.0f);
            a6.c(j6);
            ((ActionBarContextView) bVar.d).f4725f = a6;
            bVar.f7393c = i2;
            a6.d(bVar);
            return a6;
        }
        X a7 = O.a(this);
        a7.a(0.0f);
        a7.c(j6);
        ((ActionBarContextView) bVar.d).f4725f = a7;
        bVar.f7393c = i2;
        a7.d(bVar);
        return a7;
    }

    public final void onConfigurationChanged(Configuration configuration) {
        int i2;
        super.onConfigurationChanged(configuration);
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes((AttributeSet) null, C0476a.f7532a, R.attr.actionBarStyle, 0);
        setContentHeight(obtainStyledAttributes.getLayoutDimension(13, 0));
        obtainStyledAttributes.recycle();
        C0718j jVar = this.d;
        if (jVar != null) {
            Configuration configuration2 = jVar.f9324b.getResources().getConfiguration();
            int i5 = configuration2.screenWidthDp;
            int i6 = configuration2.screenHeightDp;
            if (configuration2.smallestScreenWidthDp > 600 || i5 > 600 || ((i5 > 960 && i6 > 720) || (i5 > 720 && i6 > 960))) {
                i2 = 5;
            } else if (i5 >= 500 || ((i5 > 640 && i6 > 480) || (i5 > 480 && i6 > 640))) {
                i2 = 4;
            } else if (i5 >= 360) {
                i2 = 3;
            } else {
                i2 = 2;
            }
            jVar.f9337y = i2;
            k kVar = jVar.f9325c;
            if (kVar != null) {
                kVar.p(true);
            }
        }
    }

    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C0718j jVar = this.d;
        if (jVar != null) {
            jVar.c();
            C0710f fVar = this.d.f9320C;
            if (fVar != null && fVar.b()) {
                fVar.f8788i.dismiss();
            }
        }
    }

    public final boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.f4727q = false;
        }
        if (!this.f4727q) {
            boolean onHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !onHoverEvent) {
                this.f4727q = true;
            }
        }
        if (actionMasked == 10 || actionMasked == 3) {
            this.f4727q = false;
        }
        return true;
    }

    public final void onLayout(boolean z3, int i2, int i5, int i6, int i7) {
        boolean z4;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        boolean z5 = i1.f9315a;
        if (getLayoutDirection() == 1) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z4) {
            i8 = (i6 - i2) - getPaddingRight();
        } else {
            i8 = getPaddingLeft();
        }
        int paddingTop = getPaddingTop();
        int paddingTop2 = ((i7 - i5) - getPaddingTop()) - getPaddingBottom();
        View view = this.f4730t;
        if (!(view == null || view.getVisibility() == 8)) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f4730t.getLayoutParams();
            if (z4) {
                i10 = marginLayoutParams.rightMargin;
            } else {
                i10 = marginLayoutParams.leftMargin;
            }
            if (z4) {
                i11 = marginLayoutParams.leftMargin;
            } else {
                i11 = marginLayoutParams.rightMargin;
            }
            if (z4) {
                i12 = i8 - i10;
            } else {
                i12 = i8 + i10;
            }
            int g = g(this.f4730t, i12, paddingTop, paddingTop2, z4) + i12;
            if (z4) {
                i13 = g - i11;
            } else {
                i13 = g + i11;
            }
            i8 = i13;
        }
        LinearLayout linearLayout = this.f4733w;
        if (!(linearLayout == null || this.f4732v != null || linearLayout.getVisibility() == 8)) {
            i8 += g(this.f4733w, i8, paddingTop, paddingTop2, z4);
        }
        View view2 = this.f4732v;
        if (view2 != null) {
            g(view2, i8, paddingTop, paddingTop2, z4);
        }
        if (z4) {
            i9 = getPaddingLeft();
        } else {
            i9 = (i6 - i2) - getPaddingRight();
        }
        ActionMenuView actionMenuView = this.f4723c;
        if (actionMenuView != null) {
            g(actionMenuView, i9, paddingTop, paddingTop2, !z4);
        }
    }

    public final void onMeasure(int i2, int i5) {
        int i6;
        boolean z3;
        int i7;
        int i8 = 1073741824;
        if (View.MeasureSpec.getMode(i2) != 1073741824) {
            throw new IllegalStateException(getClass().getSimpleName().concat(" can only be used with android:layout_width=\"match_parent\" (or fill_parent)"));
        } else if (View.MeasureSpec.getMode(i5) != 0) {
            int size = View.MeasureSpec.getSize(i2);
            int i9 = this.f4724e;
            if (i9 <= 0) {
                i9 = View.MeasureSpec.getSize(i5);
            }
            int paddingBottom = getPaddingBottom() + getPaddingTop();
            int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
            int i10 = i9 - paddingBottom;
            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i10, Integer.MIN_VALUE);
            View view = this.f4730t;
            if (view != null) {
                int f6 = f(view, paddingLeft, makeMeasureSpec);
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f4730t.getLayoutParams();
                paddingLeft = f6 - (marginLayoutParams.leftMargin + marginLayoutParams.rightMargin);
            }
            ActionMenuView actionMenuView = this.f4723c;
            if (actionMenuView != null && actionMenuView.getParent() == this) {
                paddingLeft = f(this.f4723c, paddingLeft, makeMeasureSpec);
            }
            LinearLayout linearLayout = this.f4733w;
            if (linearLayout != null && this.f4732v == null) {
                if (this.f4719B) {
                    this.f4733w.measure(View.MeasureSpec.makeMeasureSpec(0, 0), makeMeasureSpec);
                    int measuredWidth = this.f4733w.getMeasuredWidth();
                    if (measuredWidth <= paddingLeft) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if (z3) {
                        paddingLeft -= measuredWidth;
                    }
                    LinearLayout linearLayout2 = this.f4733w;
                    if (z3) {
                        i7 = 0;
                    } else {
                        i7 = 8;
                    }
                    linearLayout2.setVisibility(i7);
                } else {
                    paddingLeft = f(linearLayout, paddingLeft, makeMeasureSpec);
                }
            }
            View view2 = this.f4732v;
            if (view2 != null) {
                ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                int i11 = layoutParams.width;
                if (i11 != -2) {
                    i6 = 1073741824;
                } else {
                    i6 = Integer.MIN_VALUE;
                }
                if (i11 >= 0) {
                    paddingLeft = Math.min(i11, paddingLeft);
                }
                int i12 = layoutParams.height;
                if (i12 == -2) {
                    i8 = Integer.MIN_VALUE;
                }
                if (i12 >= 0) {
                    i10 = Math.min(i12, i10);
                }
                this.f4732v.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, i6), View.MeasureSpec.makeMeasureSpec(i10, i8));
            }
            if (this.f4724e <= 0) {
                int childCount = getChildCount();
                int i13 = 0;
                for (int i14 = 0; i14 < childCount; i14++) {
                    int measuredHeight = getChildAt(i14).getMeasuredHeight() + paddingBottom;
                    if (measuredHeight > i13) {
                        i13 = measuredHeight;
                    }
                }
                setMeasuredDimension(size, i13);
                return;
            }
            setMeasuredDimension(size, i9);
        } else {
            throw new IllegalStateException(getClass().getSimpleName().concat(" can only be used with android:layout_height=\"wrap_content\""));
        }
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f4726p = false;
        }
        if (!this.f4726p) {
            boolean onTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !onTouchEvent) {
                this.f4726p = true;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.f4726p = false;
        }
        return true;
    }

    public void setContentHeight(int i2) {
        this.f4724e = i2;
    }

    public void setCustomView(View view) {
        LinearLayout linearLayout;
        View view2 = this.f4732v;
        if (view2 != null) {
            removeView(view2);
        }
        this.f4732v = view;
        if (!(view == null || (linearLayout = this.f4733w) == null)) {
            removeView(linearLayout);
            this.f4733w = null;
        }
        if (view != null) {
            addView(view);
        }
        requestLayout();
    }

    public void setSubtitle(CharSequence charSequence) {
        this.f4729s = charSequence;
        d();
    }

    public void setTitle(CharSequence charSequence) {
        this.f4728r = charSequence;
        d();
        O.m(this, charSequence);
    }

    public void setTitleOptional(boolean z3) {
        if (z3 != this.f4719B) {
            requestLayout();
        }
        this.f4719B = z3;
    }

    public final boolean shouldDelayChildPressedState() {
        return false;
    }
}
