package x4;

import F4.b;
import android.view.View;
import e5.C0509f;
import r4.j;

/* renamed from: x4.g  reason: case insensitive filesystem */
public final class C1104g extends C0509f {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f12591a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ C1105h f12592b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1104g(C1105h hVar, View view, int i2) {
        super(view);
        this.f12591a = i2;
        this.f12592b = hVar;
    }

    public final void onClick(View view) {
        switch (this.f12591a) {
            case 0:
                super.onClick(view);
                C1105h hVar = this.f12592b;
                C1105h.V(hVar, new b(hVar.f12593d0));
                return;
            case 1:
                super.onClick(view);
                C1105h hVar2 = this.f12592b;
                C1105h.V(hVar2, new j(hVar2.f12593d0));
                return;
            case 2:
                super.onClick(view);
                C1105h hVar3 = this.f12592b;
                C1105h.V(hVar3, new A4.j(hVar3.f12593d0));
                return;
            case 3:
                super.onClick(view);
                C1105h hVar4 = this.f12592b;
                C1105h.V(hVar4, new C1102e(hVar4.f12593d0));
                return;
            default:
                super.onClick(view);
                C1105h hVar5 = this.f12592b;
                C1105h.V(hVar5, new Q4.b(hVar5.f12593d0));
                return;
        }
    }
}
