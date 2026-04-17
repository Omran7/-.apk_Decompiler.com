package androidx.appcompat.app;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.ListView;
import e.C0476a;

public class AlertController$RecycleListView extends ListView {

    /* renamed from: a  reason: collision with root package name */
    public final int f4679a;

    /* renamed from: b  reason: collision with root package name */
    public final int f4680b;

    public AlertController$RecycleListView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0476a.f7548t);
        this.f4680b = obtainStyledAttributes.getDimensionPixelOffset(0, -1);
        this.f4679a = obtainStyledAttributes.getDimensionPixelOffset(1, -1);
    }
}
