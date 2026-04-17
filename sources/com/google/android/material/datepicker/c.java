package com.google.android.material.datepicker;

import Y1.a;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Paint;
import androidx.fragment.app.D;
import com.bumptech.glide.d;
import com.mtma.criminal.city.R;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public final D f6398a;

    /* renamed from: b  reason: collision with root package name */
    public final D f6399b;

    public c(Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(com.bumptech.glide.c.j0(R.attr.materialCalendarStyle, context, k.class.getCanonicalName()).data, a.f4255l);
        D.h(context, obtainStyledAttributes.getResourceId(4, 0));
        D.h(context, obtainStyledAttributes.getResourceId(2, 0));
        D.h(context, obtainStyledAttributes.getResourceId(3, 0));
        D.h(context, obtainStyledAttributes.getResourceId(5, 0));
        ColorStateList a02 = d.a0(context, obtainStyledAttributes, 7);
        this.f6398a = D.h(context, obtainStyledAttributes.getResourceId(9, 0));
        D.h(context, obtainStyledAttributes.getResourceId(8, 0));
        this.f6399b = D.h(context, obtainStyledAttributes.getResourceId(10, 0));
        new Paint().setColor(a02.getDefaultColor());
        obtainStyledAttributes.recycle();
    }
}
