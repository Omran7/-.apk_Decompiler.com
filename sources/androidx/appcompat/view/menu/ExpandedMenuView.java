package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import c1.i;
import j.j;
import j.k;
import j.m;
import j.w;
import j.y;

public final class ExpandedMenuView extends ListView implements j, y, AdapterView.OnItemClickListener {

    /* renamed from: b  reason: collision with root package name */
    public static final int[] f4692b = {16842964, 16843049};

    /* renamed from: a  reason: collision with root package name */
    public k f4693a;

    public ExpandedMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setOnItemClickListener(this);
        i A6 = i.A(context, attributeSet, f4692b, 16842868);
        TypedArray typedArray = (TypedArray) A6.f5606c;
        if (typedArray.hasValue(0)) {
            setBackgroundDrawable(A6.n(0));
        }
        if (typedArray.hasValue(1)) {
            setDivider(A6.n(1));
        }
        A6.G();
    }

    public final void a(k kVar) {
        this.f4693a = kVar;
    }

    public final boolean c(m mVar) {
        return this.f4693a.q(mVar, (w) null, 0);
    }

    public int getWindowAnimations() {
        return 0;
    }

    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        setChildrenDrawingCacheEnabled(false);
    }

    public final void onItemClick(AdapterView adapterView, View view, int i2, long j6) {
        c((m) getAdapter().getItem(i2));
    }
}
