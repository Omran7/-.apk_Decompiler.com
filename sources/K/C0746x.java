package k;

import I1.b;
import T1.A;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.TextView;
import e.C0476a;

/* renamed from: k.x  reason: case insensitive filesystem */
public final class C0746x {

    /* renamed from: a  reason: collision with root package name */
    public final TextView f9408a;

    /* renamed from: b  reason: collision with root package name */
    public final A f9409b;

    public C0746x(TextView textView) {
        this.f9408a = textView;
        this.f9409b = new A(textView);
    }

    /* JADX INFO: finally extract failed */
    public final void a(AttributeSet attributeSet, int i2) {
        TypedArray obtainStyledAttributes = this.f9408a.getContext().obtainStyledAttributes(attributeSet, C0476a.f7537i, i2, 0);
        try {
            boolean z3 = true;
            if (obtainStyledAttributes.hasValue(14)) {
                z3 = obtainStyledAttributes.getBoolean(14, true);
            }
            obtainStyledAttributes.recycle();
            c(z3);
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    public final void b(boolean z3) {
        ((b) this.f9409b.f2796b).C0(z3);
    }

    public final void c(boolean z3) {
        ((b) this.f9409b.f2796b).D0(z3);
    }
}
