package w2;

import Y1.a;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.TypedValue;
import com.bumptech.glide.c;
import com.mtma.criminal.city.R;
import k.C0703b0;

/* renamed from: w2.a  reason: case insensitive filesystem */
public final class C1079a extends C0703b0 {
    public static int h(Context context, TypedArray typedArray, int... iArr) {
        int i2 = -1;
        for (int i5 = 0; i5 < iArr.length && i2 < 0; i5++) {
            int i6 = iArr[i5];
            TypedValue typedValue = new TypedValue();
            if (!typedArray.getValue(i6, typedValue) || typedValue.type != 2) {
                i2 = typedArray.getDimensionPixelSize(i6, -1);
            } else {
                TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{typedValue.data});
                int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(0, -1);
                obtainStyledAttributes.recycle();
                i2 = dimensionPixelSize;
            }
        }
        return i2;
    }

    public final void setTextAppearance(Context context, int i2) {
        super.setTextAppearance(context, i2);
        if (c.i0(context, R.attr.textAppearanceLineHeightEnabled, true)) {
            TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(i2, a.f4260q);
            int h = h(getContext(), obtainStyledAttributes, 1, 2);
            obtainStyledAttributes.recycle();
            if (h >= 0) {
                setLineHeight(h);
            }
        }
    }
}
