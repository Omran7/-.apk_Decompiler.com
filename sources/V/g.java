package v;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.Log;
import android.util.Xml;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;

public final class g {

    /* renamed from: a  reason: collision with root package name */
    public final float f12029a = Float.NaN;

    /* renamed from: b  reason: collision with root package name */
    public final float f12030b = Float.NaN;

    /* renamed from: c  reason: collision with root package name */
    public final float f12031c = Float.NaN;
    public final float d = Float.NaN;

    /* renamed from: e  reason: collision with root package name */
    public final int f12032e = -1;

    public g(Context context, XmlResourceParser xmlResourceParser) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), q.f12143j);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i2 = 0; i2 < indexCount; i2++) {
            int index = obtainStyledAttributes.getIndex(i2);
            if (index == 0) {
                int resourceId = obtainStyledAttributes.getResourceId(index, this.f12032e);
                this.f12032e = resourceId;
                String resourceTypeName = context.getResources().getResourceTypeName(resourceId);
                context.getResources().getResourceName(resourceId);
                if ("layout".equals(resourceTypeName)) {
                    new n().b((ConstraintLayout) LayoutInflater.from(context).inflate(resourceId, (ViewGroup) null));
                }
            } else if (index == 1) {
                this.d = obtainStyledAttributes.getDimension(index, this.d);
            } else if (index == 2) {
                this.f12030b = obtainStyledAttributes.getDimension(index, this.f12030b);
            } else if (index == 3) {
                this.f12031c = obtainStyledAttributes.getDimension(index, this.f12031c);
            } else if (index == 4) {
                this.f12029a = obtainStyledAttributes.getDimension(index, this.f12029a);
            } else {
                Log.v("ConstraintLayoutStates", "Unknown tag");
            }
        }
        obtainStyledAttributes.recycle();
    }
}
