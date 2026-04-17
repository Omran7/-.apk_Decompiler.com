package k;

import B.b;
import V4.g;
import android.graphics.Typeface;
import android.os.Build;
import android.widget.TextView;
import java.lang.ref.WeakReference;

/* renamed from: k.T  reason: case insensitive filesystem */
public final class C0687T extends b {
    public final /* synthetic */ int h;

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ int f9232i;

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ WeakReference f9233j;

    /* renamed from: k  reason: collision with root package name */
    public final /* synthetic */ C0695X f9234k;

    public C0687T(C0695X x6, int i2, int i5, WeakReference weakReference) {
        this.f9234k = x6;
        this.h = i2;
        this.f9232i = i5;
        this.f9233j = weakReference;
    }

    public final void h(Typeface typeface) {
        int i2;
        boolean z3;
        if (Build.VERSION.SDK_INT >= 28 && (i2 = this.h) != -1) {
            if ((this.f9232i & 2) != 0) {
                z3 = true;
            } else {
                z3 = false;
            }
            typeface = C0693W.a(typeface, i2, z3);
        }
        C0695X x6 = this.f9234k;
        if (x6.f9251m) {
            x6.f9250l = typeface;
            TextView textView = (TextView) this.f9233j.get();
            if (textView == null) {
                return;
            }
            if (textView.isAttachedToWindow()) {
                textView.post(new g(textView, typeface, x6.f9248j));
            } else {
                textView.setTypeface(typeface, x6.f9248j);
            }
        }
    }

    public final void g(int i2) {
    }
}
