package com.google.android.material.theme;

import Q.b;
import Y1.a;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import com.bumptech.glide.d;
import com.google.android.material.button.MaterialButton;
import com.mtma.criminal.city.R;
import f.C;
import g2.c;
import k.C0656D;
import k.C0703b0;
import k.C0728o;
import k.C0732q;
import k.C0734r;
import m2.k;
import v2.r;
import w2.C1079a;
import x2.C1097a;

public class MaterialComponentsViewInflater extends C {
    public final C0728o a(Context context, AttributeSet attributeSet) {
        return new r(context, attributeSet);
    }

    public final C0732q b(Context context, AttributeSet attributeSet) {
        return new MaterialButton(context, attributeSet);
    }

    public final C0734r c(Context context, AttributeSet attributeSet) {
        return new c(context, attributeSet);
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [k.D, o2.a, android.widget.CompoundButton, android.view.View] */
    public final C0656D d(Context context, AttributeSet attributeSet) {
        ? d = new C0656D(C1097a.a(context, attributeSet, R.attr.radioButtonStyle, 2131952671), attributeSet);
        Context context2 = d.getContext();
        TypedArray f6 = k.f(context2, attributeSet, a.f4258o, R.attr.radioButtonStyle, 2131952671, new int[0]);
        if (f6.hasValue(0)) {
            b.c(d, d.a0(context2, f6, 0));
        }
        d.f10439f = f6.getBoolean(1, false);
        f6.recycle();
        return d;
    }

    public final C0703b0 e(Context context, AttributeSet attributeSet) {
        C0703b0 b0Var = new C0703b0(C1097a.a(context, attributeSet, 16842884, 0), attributeSet, 16842884);
        Context context2 = b0Var.getContext();
        if (com.bumptech.glide.c.i0(context2, R.attr.textAppearanceLineHeightEnabled, true)) {
            Resources.Theme theme = context2.getTheme();
            int[] iArr = a.f4261r;
            TypedArray obtainStyledAttributes = theme.obtainStyledAttributes(attributeSet, iArr, 16842884, 0);
            int h = C1079a.h(context2, obtainStyledAttributes, 1, 2);
            obtainStyledAttributes.recycle();
            if (h == -1) {
                TypedArray obtainStyledAttributes2 = theme.obtainStyledAttributes(attributeSet, iArr, 16842884, 0);
                int resourceId = obtainStyledAttributes2.getResourceId(0, -1);
                obtainStyledAttributes2.recycle();
                if (resourceId != -1) {
                    TypedArray obtainStyledAttributes3 = theme.obtainStyledAttributes(resourceId, a.f4260q);
                    int h6 = C1079a.h(b0Var.getContext(), obtainStyledAttributes3, 1, 2);
                    obtainStyledAttributes3.recycle();
                    if (h6 >= 0) {
                        b0Var.setLineHeight(h6);
                    }
                }
            }
        }
        return b0Var;
    }
}
