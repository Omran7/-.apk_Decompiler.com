package a2;

import K.O;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.util.WeakHashMap;
import x.C1089a;

/* renamed from: a2.a  reason: case insensitive filesystem */
public abstract class C0259a extends C1089a {

    /* renamed from: a  reason: collision with root package name */
    public C0260b f4557a;

    public boolean g(CoordinatorLayout coordinatorLayout, View view, int i2) {
        r(coordinatorLayout, view, i2);
        if (this.f4557a == null) {
            this.f4557a = new C0260b(view);
        }
        C0260b bVar = this.f4557a;
        View view2 = bVar.f4559b;
        bVar.f4558a = view2.getTop();
        bVar.f4560c = view2.getLeft();
        C0260b bVar2 = this.f4557a;
        View view3 = bVar2.f4559b;
        WeakHashMap weakHashMap = O.f1352a;
        view3.offsetTopAndBottom(0 - (view3.getTop() - bVar2.f4558a));
        view3.offsetLeftAndRight(0 - (view3.getLeft() - bVar2.f4560c));
        return true;
    }

    public void r(CoordinatorLayout coordinatorLayout, View view, int i2) {
        coordinatorLayout.q(view, i2);
    }
}
