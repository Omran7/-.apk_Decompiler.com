package v;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;

public final class l {

    /* renamed from: a  reason: collision with root package name */
    public int f12118a;

    /* renamed from: b  reason: collision with root package name */
    public int f12119b;

    /* renamed from: c  reason: collision with root package name */
    public float f12120c;
    public float d;

    public final void a(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, q.g);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i2 = 0; i2 < indexCount; i2++) {
            int index = obtainStyledAttributes.getIndex(i2);
            if (index == 1) {
                this.f12120c = obtainStyledAttributes.getFloat(index, this.f12120c);
            } else if (index == 0) {
                int i5 = obtainStyledAttributes.getInt(index, this.f12118a);
                this.f12118a = i5;
                this.f12118a = n.d[i5];
            } else if (index == 4) {
                this.f12119b = obtainStyledAttributes.getInt(index, this.f12119b);
            } else if (index == 3) {
                this.d = obtainStyledAttributes.getFloat(index, this.d);
            }
        }
        obtainStyledAttributes.recycle();
    }
}
