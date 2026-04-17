package x2;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import com.mtma.criminal.city.R;
import i.C0573c;

/* renamed from: x2.a  reason: case insensitive filesystem */
public abstract class C1097a {

    /* renamed from: a  reason: collision with root package name */
    public static final int[] f12555a = {16842752, R.attr.theme};

    /* renamed from: b  reason: collision with root package name */
    public static final int[] f12556b = {R.attr.materialThemeOverlay};

    public static Context a(Context context, AttributeSet attributeSet, int i2, int i5) {
        boolean z3;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f12556b, i2, i5);
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        obtainStyledAttributes.recycle();
        if (!(context instanceof C0573c) || ((C0573c) context).f8182a != resourceId) {
            z3 = false;
        } else {
            z3 = true;
        }
        if (resourceId == 0 || z3) {
            return context;
        }
        C0573c cVar = new C0573c(context, resourceId);
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, f12555a);
        int resourceId2 = obtainStyledAttributes2.getResourceId(0, 0);
        int resourceId3 = obtainStyledAttributes2.getResourceId(1, 0);
        obtainStyledAttributes2.recycle();
        if (resourceId2 == 0) {
            resourceId2 = resourceId3;
        }
        if (resourceId2 != 0) {
            cVar.getTheme().applyStyle(resourceId2, true);
        }
        return cVar;
    }
}
