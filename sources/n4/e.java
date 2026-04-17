package n4;

import F4.b;
import android.view.View;
import e5.C0509f;
import r4.j;

public final class e extends C0509f {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f10373a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ f f10374b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(f fVar, View view, int i2) {
        super(view);
        this.f10373a = i2;
        this.f10374b = fVar;
    }

    public final void onClick(View view) {
        switch (this.f10373a) {
            case 0:
                super.onClick(view);
                f fVar = this.f10374b;
                f.V(fVar, new b(fVar.f10375d0));
                return;
            case 1:
                super.onClick(view);
                f fVar2 = this.f10374b;
                f.V(fVar2, new j(fVar2.f10375d0));
                return;
            case 2:
                super.onClick(view);
                f fVar3 = this.f10374b;
                f.V(fVar3, new A4.j(fVar3.f10375d0));
                return;
            default:
                super.onClick(view);
                f fVar4 = this.f10374b;
                f.V(fVar4, new Q4.b(fVar4.f10375d0));
                return;
        }
    }
}
