package a2;

import K.C0076p;
import K.v0;
import android.view.View;

/* renamed from: a2.b  reason: case insensitive filesystem */
public final class C0260b implements C0076p {

    /* renamed from: a  reason: collision with root package name */
    public int f4558a;

    /* renamed from: b  reason: collision with root package name */
    public final View f4559b;

    /* renamed from: c  reason: collision with root package name */
    public int f4560c;

    public C0260b(View view) {
        this.f4559b = view;
    }

    public v0 b(View view, v0 v0Var) {
        int i2 = v0Var.f1432a.f(7).f375b;
        View view2 = this.f4559b;
        int i5 = this.f4558a;
        if (i5 >= 0) {
            view2.getLayoutParams().height = i5 + i2;
            view2.setLayoutParams(view2.getLayoutParams());
        }
        view2.setPadding(view2.getPaddingLeft(), this.f4560c + i2, view2.getPaddingRight(), view2.getPaddingBottom());
        return v0Var;
    }

    public C0260b(View view, int i2, int i5) {
        this.f4558a = i2;
        this.f4559b = view;
        this.f4560c = i5;
    }
}
