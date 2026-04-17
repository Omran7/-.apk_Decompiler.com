package com.google.android.material.timepicker;

import A4.a;
import K.O;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.mtma.criminal.city.R;
import java.util.WeakHashMap;
import s2.g;
import s2.h;
import s2.j;

public abstract class e extends ConstraintLayout {

    /* renamed from: A  reason: collision with root package name */
    public int f6614A;

    /* renamed from: B  reason: collision with root package name */
    public final g f6615B;

    /* renamed from: z  reason: collision with root package name */
    public final a f6616z = new a(this, 9);

    public e(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.materialClockStyle);
        LayoutInflater.from(context).inflate(R.layout.material_radial_view_group, this);
        g gVar = new g();
        this.f6615B = gVar;
        h hVar = new h(0.5f);
        j e6 = gVar.f11459a.f11441a.e();
        e6.f11479e = hVar;
        e6.f11480f = hVar;
        e6.g = hVar;
        e6.h = hVar;
        gVar.setShapeAppearanceModel(e6.a());
        this.f6615B.j(ColorStateList.valueOf(-1));
        g gVar2 = this.f6615B;
        WeakHashMap weakHashMap = O.f1352a;
        setBackground(gVar2);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, Y1.a.f4263t, R.attr.materialClockStyle, 0);
        this.f6614A = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        obtainStyledAttributes.recycle();
    }

    public final void addView(View view, int i2, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i2, layoutParams);
        if (view.getId() == -1) {
            WeakHashMap weakHashMap = O.f1352a;
            view.setId(View.generateViewId());
        }
        Handler handler = getHandler();
        if (handler != null) {
            a aVar = this.f6616z;
            handler.removeCallbacks(aVar);
            handler.post(aVar);
        }
    }

    public abstract void l();

    public final void onFinishInflate() {
        super.onFinishInflate();
        l();
    }

    public final void onViewRemoved(View view) {
        super.onViewRemoved(view);
        Handler handler = getHandler();
        if (handler != null) {
            a aVar = this.f6616z;
            handler.removeCallbacks(aVar);
            handler.post(aVar);
        }
    }

    public final void setBackgroundColor(int i2) {
        this.f6615B.j(ColorStateList.valueOf(i2));
    }
}
