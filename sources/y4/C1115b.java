package y4;

import R2.b;
import android.view.View;
import androidx.fragment.app.C0269a;
import com.bumptech.glide.c;
import d5.o;
import e5.C0509f;

/* renamed from: y4.b  reason: case insensitive filesystem */
public final class C1115b extends C0509f {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f12714a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ C1118e f12715b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1115b(C1118e eVar, View view, int i2) {
        super(view);
        this.f12714a = i2;
        this.f12715b = eVar;
    }

    public final void onClick(View view) {
        switch (this.f12714a) {
            case 0:
                super.onClick(view);
                C1118e eVar = this.f12715b;
                if (!eVar.f12743y0) {
                    eVar.Z(c.f5744o);
                    return;
                } else if (o.getMoneyObject().getGold() < eVar.f12734o0) {
                    c.y0(eVar.f12723d0);
                    return;
                } else {
                    b.w(true);
                    int E6 = c.E(c.f5744o);
                    if (E6 < eVar.f12736q0 || E6 > eVar.f12737r0) {
                        eVar.Z(c.f5744o);
                        eVar.Y(true);
                    }
                    c.s(true, new C1117d(eVar, 0));
                    return;
                }
            case 1:
                super.onClick(view);
                C1118e eVar2 = this.f12715b;
                if (!eVar2.f12743y0) {
                    eVar2.Z(c.f5744o);
                    return;
                } else if (o.getMoneyObject().getGold() < eVar2.f12735p0) {
                    c.y0(eVar2.f12723d0);
                    return;
                } else {
                    b.w(true);
                    int E7 = c.E(c.f5744o);
                    if (E7 < eVar2.f12736q0 || E7 > eVar2.f12737r0) {
                        eVar2.Z(c.f5744o);
                        eVar2.Y(true);
                    }
                    c.s(true, new C1117d(eVar2, 1));
                    return;
                }
            default:
                super.onClick(view);
                C1118e eVar3 = this.f12715b;
                if (eVar3.f12744z0) {
                    C0269a aVar = new C0269a(eVar3.p());
                    aVar.h(eVar3);
                    aVar.e(false);
                    return;
                }
                return;
        }
    }
}
