package R4;

import T4.d;
import U4.a;
import android.view.View;
import e5.C0509f;

public final class h extends C0509f {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f2587a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ i f2588b;

    public /* synthetic */ h(i iVar, int i2) {
        this.f2587a = i2;
        this.f2588b = iVar;
    }

    public final void onClick(View view) {
        switch (this.f2587a) {
            case 0:
                super.onClick(view);
                i iVar = this.f2588b;
                if (iVar.f2598m0 != 0) {
                    iVar.f2598m0 = 0;
                    iVar.W();
                    iVar.V(new d(iVar.f2589d0), true);
                    return;
                }
                return;
            case 1:
                super.onClick(view);
                i iVar2 = this.f2588b;
                if (iVar2.f2598m0 != 1) {
                    iVar2.f2598m0 = 1;
                    iVar2.W();
                    iVar2.V(new a(iVar2.f2589d0), true);
                    return;
                }
                return;
            case 2:
                super.onClick(view);
                i iVar3 = this.f2588b;
                if (iVar3.f2598m0 != 2) {
                    iVar3.f2598m0 = 2;
                    iVar3.W();
                    iVar3.V(new g(iVar3.f2589d0), true);
                    return;
                }
                return;
            default:
                super.onClick(view);
                i iVar4 = this.f2588b;
                if (iVar4.f2598m0 != 3) {
                    iVar4.f2598m0 = 3;
                    iVar4.W();
                    iVar4.V(new S4.d(iVar4.f2589d0), true);
                    return;
                }
                return;
        }
    }
}
