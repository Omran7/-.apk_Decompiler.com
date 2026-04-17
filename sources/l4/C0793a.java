package l4;

import A4.j;
import I1.b;
import K4.o;
import R4.i;
import S4.d;
import android.view.View;
import e5.C0509f;
import i3.C0590f;
import j4.p0;
import s4.C0974c;

/* renamed from: l4.a  reason: case insensitive filesystem */
public final class C0793a extends C0509f {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f9744a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ C0794b f9745b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0793a(C0794b bVar, View view, int i2) {
        super(view);
        this.f9744a = i2;
        this.f9745b = bVar;
    }

    public final void onClick(View view) {
        p0 p0Var;
        switch (this.f9744a) {
            case 0:
                super.onClick(view);
                C0794b bVar = this.f9745b;
                C0794b.V(bVar, new o(bVar.f9746d0));
                return;
            case 1:
                super.onClick(view);
                int currentCity = d5.o.getLocationObject().getCurrentCity();
                C0794b bVar2 = this.f9745b;
                if (currentCity == 0) {
                    C0794b.V(bVar2, new i(bVar2.f9746d0));
                    return;
                } else {
                    C0794b.V(bVar2, new d(bVar2.f9746d0));
                    return;
                }
            case 2:
                super.onClick(view);
                int currentCity2 = d5.o.getLocationObject().getCurrentCity();
                C0794b bVar3 = this.f9745b;
                if (currentCity2 == 0) {
                    C0794b.V(bVar3, new C0974c(bVar3.f9746d0));
                    return;
                }
                bVar3.f9753k0.setVisibility(4);
                bVar3.f9748f0.setText(b.D(d5.o.getLocationObject().getCurrentCity()));
                bVar3.f9750h0.setVisibility(0);
                return;
            case 3:
                super.onClick(view);
                C0794b bVar4 = this.f9745b;
                C0794b.V(bVar4, new j(bVar4.f9746d0));
                return;
            case 4:
                super.onClick(view);
                C0794b bVar5 = this.f9745b;
                C0794b.V(bVar5, new r4.j(bVar5.f9746d0));
                bVar5.f9762u0 = true;
                bVar5.f9761t0 = false;
                bVar5.f9763v0 = false;
                bVar5.f9758p0.setVisibility(8);
                C0590f fVar = bVar5.f9759q0;
                if (fVar != null && (p0Var = bVar5.f9760r0) != null) {
                    fVar.u(p0Var);
                    return;
                }
                return;
            default:
                super.onClick(view);
                C0794b bVar6 = this.f9745b;
                C0794b.V(bVar6, new Q4.b(bVar6.f9746d0));
                return;
        }
    }
}
