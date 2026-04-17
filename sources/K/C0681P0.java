package k;

import A.h;
import C.d;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import e.C0476a;

/* renamed from: k.P0  reason: case insensitive filesystem */
public abstract class C0681P0 {

    /* renamed from: a  reason: collision with root package name */
    public static final ThreadLocal f9215a = new ThreadLocal();

    /* renamed from: b  reason: collision with root package name */
    public static final int[] f9216b = {-16842910};

    /* renamed from: c  reason: collision with root package name */
    public static final int[] f9217c = {16842908};
    public static final int[] d = {16842919};

    /* renamed from: e  reason: collision with root package name */
    public static final int[] f9218e = {16842912};

    /* renamed from: f  reason: collision with root package name */
    public static final int[] f9219f = new int[0];
    public static final int[] g = new int[1];

    public static void a(View view, Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(C0476a.f7538j);
        try {
            if (!obtainStyledAttributes.hasValue(117)) {
                Log.e("ThemeUtils", "View " + view.getClass() + " is an AppCompat widget that can only be used with a Theme.AppCompat theme (or descendant).");
            }
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    public static int b(Context context, int i2) {
        ColorStateList d6 = d(context, i2);
        if (d6 != null && d6.isStateful()) {
            return d6.getColorForState(f9216b, d6.getDefaultColor());
        }
        ThreadLocal threadLocal = f9215a;
        TypedValue typedValue = (TypedValue) threadLocal.get();
        if (typedValue == null) {
            typedValue = new TypedValue();
            threadLocal.set(typedValue);
        }
        context.getTheme().resolveAttribute(16842803, typedValue, true);
        float f6 = typedValue.getFloat();
        int c3 = c(context, i2);
        return d.d(c3, Math.round(((float) Color.alpha(c3)) * f6));
    }

    public static int c(Context context, int i2) {
        int[] iArr = g;
        iArr[0] = i2;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes((AttributeSet) null, iArr);
        try {
            return obtainStyledAttributes.getColor(0, 0);
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    public static ColorStateList d(Context context, int i2) {
        ColorStateList colorStateList;
        int resourceId;
        int[] iArr = g;
        iArr[0] = i2;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes((AttributeSet) null, iArr);
        try {
            if (!obtainStyledAttributes.hasValue(0) || (resourceId = obtainStyledAttributes.getResourceId(0, 0)) == 0 || (colorStateList = h.getColorStateList(context, resourceId)) == null) {
                colorStateList = obtainStyledAttributes.getColorStateList(0);
            }
            return colorStateList;
        } finally {
            obtainStyledAttributes.recycle();
        }
    }
}
