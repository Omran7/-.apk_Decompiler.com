package m0;

import K.C0075o;
import K4.u;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import c1.i;
import java.util.ArrayList;
import k5.C0770g;

/* renamed from: m0.C  reason: case insensitive filesystem */
public abstract class C0801C {

    /* renamed from: a  reason: collision with root package name */
    public C0831x f9841a;

    /* renamed from: b  reason: collision with root package name */
    public ArrayList f9842b;

    /* renamed from: c  reason: collision with root package name */
    public long f9843c;
    public long d;

    /* renamed from: e  reason: collision with root package name */
    public long f9844e;

    /* renamed from: f  reason: collision with root package name */
    public long f9845f;

    public static void b(T t6) {
        RecyclerView recyclerView;
        int i2 = t6.f9899j;
        if (!t6.g() && (i2 & 4) == 0 && (recyclerView = t6.f9907r) != null) {
            recyclerView.F(t6);
        }
    }

    public abstract boolean a(T t6, T t7, C0075o oVar, C0075o oVar2);

    public final void c(T t6) {
        C0831x xVar = this.f9841a;
        if (xVar != null) {
            boolean z3 = true;
            t6.o(true);
            if (t6.h != null && t6.f9898i == null) {
                t6.h = null;
            }
            t6.f9898i = null;
            if ((t6.f9899j & 16) == 0) {
                RecyclerView recyclerView = xVar.f10067a;
                recyclerView.a0();
                i iVar = recyclerView.f5356e;
                C0831x xVar2 = (C0831x) iVar.f5605b;
                RecyclerView recyclerView2 = xVar2.f10067a;
                View view = t6.f9893a;
                int indexOfChild = recyclerView2.indexOfChild(view);
                if (indexOfChild == -1) {
                    iVar.L(view);
                } else {
                    u uVar = (u) iVar.f5606c;
                    if (uVar.e(indexOfChild)) {
                        uVar.m(indexOfChild);
                        iVar.L(view);
                        xVar2.a(indexOfChild);
                    } else {
                        z3 = false;
                    }
                }
                if (z3) {
                    T I6 = RecyclerView.I(view);
                    C0770g gVar = recyclerView.f5351b;
                    gVar.o(I6);
                    gVar.i(I6);
                }
                recyclerView.b0(!z3);
                if (!z3 && t6.k()) {
                    recyclerView.removeDetachedView(view, false);
                }
            }
        }
    }

    public abstract void d(T t6);

    public abstract void e();

    public abstract boolean f();
}
