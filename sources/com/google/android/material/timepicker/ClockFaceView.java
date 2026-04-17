package com.google.android.material.timepicker;

import A.h;
import K.O;
import Y1.a;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.TextView;
import com.bumptech.glide.d;
import com.mtma.criminal.city.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import v.i;
import v.j;
import v.n;

class ClockFaceView extends e implements d {

    /* renamed from: C  reason: collision with root package name */
    public final ClockHandView f6584C;

    /* renamed from: D  reason: collision with root package name */
    public final Rect f6585D = new Rect();

    /* renamed from: E  reason: collision with root package name */
    public final RectF f6586E = new RectF();
    public final Rect F = new Rect();

    /* renamed from: G  reason: collision with root package name */
    public final SparseArray f6587G;

    /* renamed from: H  reason: collision with root package name */
    public final c f6588H;

    /* renamed from: I  reason: collision with root package name */
    public final int[] f6589I;

    /* renamed from: J  reason: collision with root package name */
    public final float[] f6590J;

    /* renamed from: K  reason: collision with root package name */
    public final int f6591K;

    /* renamed from: L  reason: collision with root package name */
    public final int f6592L;

    /* renamed from: M  reason: collision with root package name */
    public final int f6593M;

    /* renamed from: N  reason: collision with root package name */
    public final int f6594N;

    /* renamed from: O  reason: collision with root package name */
    public final String[] f6595O;

    /* renamed from: P  reason: collision with root package name */
    public float f6596P;

    /* renamed from: Q  reason: collision with root package name */
    public final ColorStateList f6597Q;

    public ClockFaceView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        SparseArray sparseArray = new SparseArray();
        this.f6587G = sparseArray;
        this.f6590J = new float[]{0.0f, 0.9f, 1.0f};
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a.d, R.attr.materialClockStyle, 2131952738);
        Resources resources = getResources();
        ColorStateList a02 = d.a0(context, obtainStyledAttributes, 1);
        this.f6597Q = a02;
        LayoutInflater.from(context).inflate(R.layout.material_clockface_view, this, true);
        ClockHandView clockHandView = (ClockHandView) findViewById(R.id.material_clock_hand);
        this.f6584C = clockHandView;
        this.f6591K = resources.getDimensionPixelSize(R.dimen.material_clock_hand_padding);
        int colorForState = a02.getColorForState(new int[]{16842913}, a02.getDefaultColor());
        this.f6589I = new int[]{colorForState, colorForState, a02.getDefaultColor()};
        clockHandView.f6600c.add(this);
        int defaultColor = h.getColorStateList(context, R.color.material_timepicker_clockface).getDefaultColor();
        ColorStateList a03 = d.a0(context, obtainStyledAttributes, 0);
        setBackgroundColor(a03 != null ? a03.getDefaultColor() : defaultColor);
        getViewTreeObserver().addOnPreDrawListener(new b(this));
        setFocusable(true);
        obtainStyledAttributes.recycle();
        this.f6588H = new c(this);
        String[] strArr = new String[12];
        Arrays.fill(strArr, "");
        this.f6595O = strArr;
        LayoutInflater from = LayoutInflater.from(getContext());
        int size = sparseArray.size();
        boolean z3 = false;
        for (int i2 = 0; i2 < Math.max(this.f6595O.length, size); i2++) {
            TextView textView = (TextView) sparseArray.get(i2);
            if (i2 >= this.f6595O.length) {
                removeView(textView);
                sparseArray.remove(i2);
            } else {
                if (textView == null) {
                    textView = (TextView) from.inflate(R.layout.material_clockface_textview, this, false);
                    sparseArray.put(i2, textView);
                    addView(textView);
                }
                textView.setText(this.f6595O[i2]);
                textView.setTag(R.id.material_value_index, Integer.valueOf(i2));
                int i5 = (i2 / 12) + 1;
                textView.setTag(R.id.material_clock_level, Integer.valueOf(i5));
                z3 = i5 > 1 ? true : z3;
                O.l(textView, this.f6588H);
                textView.setTextColor(this.f6597Q);
            }
        }
        ClockHandView clockHandView2 = this.f6584C;
        if (clockHandView2.f6599b && !z3) {
            clockHandView2.f6609v = 1;
        }
        clockHandView2.f6599b = z3;
        clockHandView2.invalidate();
        this.f6592L = resources.getDimensionPixelSize(R.dimen.material_time_picker_minimum_screen_height);
        this.f6593M = resources.getDimensionPixelSize(R.dimen.material_time_picker_minimum_screen_width);
        this.f6594N = resources.getDimensionPixelSize(R.dimen.material_clock_size);
    }

    public final void l() {
        int i2;
        n nVar = new n();
        nVar.b(this);
        HashMap hashMap = new HashMap();
        for (int i5 = 0; i5 < getChildCount(); i5++) {
            View childAt = getChildAt(i5);
            if (childAt.getId() != R.id.circle_center && !"skip".equals(childAt.getTag())) {
                int i6 = (Integer) childAt.getTag(R.id.material_clock_level);
                if (i6 == null) {
                    i6 = 1;
                }
                if (!hashMap.containsKey(i6)) {
                    hashMap.put(i6, new ArrayList());
                }
                ((List) hashMap.get(i6)).add(childAt);
            }
        }
        for (Map.Entry entry : hashMap.entrySet()) {
            List<View> list = (List) entry.getValue();
            if (((Integer) entry.getKey()).intValue() == 2) {
                i2 = Math.round(((float) this.f6614A) * 0.66f);
            } else {
                i2 = this.f6614A;
            }
            float f6 = 0.0f;
            for (View id : list) {
                int id2 = id.getId();
                HashMap hashMap2 = nVar.f12136c;
                if (!hashMap2.containsKey(Integer.valueOf(id2))) {
                    hashMap2.put(Integer.valueOf(id2), new i());
                }
                j jVar = ((i) hashMap2.get(Integer.valueOf(id2))).d;
                jVar.f12110z = R.id.circle_center;
                jVar.f12048A = i2;
                jVar.f12049B = f6;
                f6 += 360.0f / ((float) list.size());
            }
        }
        nVar.a(this);
        setConstraintSet((n) null);
        requestLayout();
        int i7 = 0;
        while (true) {
            SparseArray sparseArray = this.f6587G;
            if (i7 < sparseArray.size()) {
                ((TextView) sparseArray.get(i7)).setVisibility(0);
                i7++;
            } else {
                return;
            }
        }
    }

    public final void m() {
        SparseArray sparseArray;
        RectF rectF;
        Rect rect;
        boolean z3;
        RadialGradient radialGradient;
        RectF rectF2 = this.f6584C.f6603p;
        float f6 = Float.MAX_VALUE;
        TextView textView = null;
        int i2 = 0;
        while (true) {
            sparseArray = this.f6587G;
            int size = sparseArray.size();
            rectF = this.f6586E;
            rect = this.f6585D;
            if (i2 >= size) {
                break;
            }
            TextView textView2 = (TextView) sparseArray.get(i2);
            if (textView2 != null) {
                textView2.getHitRect(rect);
                rectF.set(rect);
                rectF.union(rectF2);
                float height = rectF.height() * rectF.width();
                if (height < f6) {
                    textView = textView2;
                    f6 = height;
                }
            }
            i2++;
        }
        for (int i5 = 0; i5 < sparseArray.size(); i5++) {
            TextView textView3 = (TextView) sparseArray.get(i5);
            if (textView3 != null) {
                if (textView3 == textView) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                textView3.setSelected(z3);
                textView3.getHitRect(rect);
                rectF.set(rect);
                Rect rect2 = this.F;
                textView3.getLineBounds(0, rect2);
                rectF.inset((float) rect2.left, (float) rect2.top);
                if (!RectF.intersects(rectF2, rectF)) {
                    radialGradient = null;
                } else {
                    radialGradient = new RadialGradient(rectF2.centerX() - rectF.left, rectF2.centerY() - rectF.top, 0.5f * rectF2.width(), this.f6589I, this.f6590J, Shader.TileMode.CLAMP);
                }
                textView3.getPaint().setShader(radialGradient);
                textView3.invalidate();
            }
        }
    }

    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(1, this.f6595O.length, false, 1));
    }

    public final void onLayout(boolean z3, int i2, int i5, int i6, int i7) {
        super.onLayout(z3, i2, i5, i6, i7);
        m();
    }

    public final void onMeasure(int i2, int i5) {
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        int max = (int) (((float) this.f6594N) / Math.max(Math.max(((float) this.f6592L) / ((float) displayMetrics.heightPixels), ((float) this.f6593M) / ((float) displayMetrics.widthPixels)), 1.0f));
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(max, 1073741824);
        setMeasuredDimension(max, max);
        super.onMeasure(makeMeasureSpec, makeMeasureSpec);
    }
}
