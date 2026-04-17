package k;

import android.content.Context;
import android.view.View;
import com.mtma.criminal.city.R;
import j.C0600C;
import j.k;
import j.s;
import j.u;
import j4.p0;

/* renamed from: k.f  reason: case insensitive filesystem */
public final class C0710f extends u {

    /* renamed from: l  reason: collision with root package name */
    public final /* synthetic */ int f9296l = 0;

    /* renamed from: m  reason: collision with root package name */
    public final /* synthetic */ C0718j f9297m;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C0710f(C0718j jVar, Context context, k kVar, View view) {
        super(R.attr.actionOverflowMenuStyle, context, view, kVar, true);
        this.f9297m = jVar;
        this.f8787f = 8388613;
        p0 p0Var = jVar.F;
        this.h = p0Var;
        s sVar = this.f8788i;
        if (sVar != null) {
            sVar.j(p0Var);
        }
    }

    public final void c() {
        switch (this.f9296l) {
            case 0:
                C0718j jVar = this.f9297m;
                jVar.f9320C = null;
                jVar.getClass();
                super.c();
                return;
            default:
                C0718j jVar2 = this.f9297m;
                k kVar = jVar2.f9325c;
                if (kVar != null) {
                    kVar.c(true);
                }
                jVar2.f9319B = null;
                super.c();
                return;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C0710f(C0718j jVar, Context context, C0600C c3, View view) {
        super(R.attr.actionOverflowMenuStyle, context, view, c3, false);
        this.f9297m = jVar;
        if (!c3.f8663J.f()) {
            View view2 = jVar.f9330r;
            this.f8786e = view2 == null ? (View) jVar.f9329q : view2;
        }
        p0 p0Var = jVar.F;
        this.h = p0Var;
        s sVar = this.f8788i;
        if (sVar != null) {
            sVar.j(p0Var);
        }
    }
}
