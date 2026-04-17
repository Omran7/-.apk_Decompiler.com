package M4;

import android.view.View;
import android.widget.TextView;
import androidx.fragment.app.C0269a;
import e5.C0509f;
import java.util.ArrayList;

public final class d extends C0509f {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f1856a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ e f1857b;

    public /* synthetic */ d(e eVar, int i2) {
        this.f1856a = i2;
        this.f1857b = eVar;
    }

    public final void onClick(View view) {
        switch (this.f1856a) {
            case 0:
                super.onClick(view);
                e eVar = this.f1857b;
                int i2 = eVar.f1860f0;
                ArrayList arrayList = (ArrayList) eVar.f1866l0;
                if (i2 != arrayList.indexOf(eVar.f1862h0)) {
                    eVar.f1860f0 = arrayList.indexOf(eVar.f1862h0);
                    eVar.W();
                    eVar.V(new c(eVar.f1859e0, 0), true);
                    return;
                }
                return;
            case 1:
                super.onClick(view);
                e eVar2 = this.f1857b;
                int i5 = eVar2.f1860f0;
                ArrayList arrayList2 = (ArrayList) eVar2.f1866l0;
                if (i5 != arrayList2.indexOf(eVar2.f1863i0)) {
                    eVar2.f1860f0 = arrayList2.indexOf(eVar2.f1863i0);
                    eVar2.W();
                    eVar2.V(new c(eVar2.f1859e0, 1), true);
                    return;
                }
                return;
            case 2:
                super.onClick(view);
                e eVar3 = this.f1857b;
                int i6 = eVar3.f1860f0;
                ArrayList arrayList3 = (ArrayList) eVar3.f1866l0;
                if (i6 != arrayList3.indexOf((TextView) eVar3.f1865k0)) {
                    eVar3.f1860f0 = arrayList3.indexOf((TextView) eVar3.f1865k0);
                    eVar3.W();
                    eVar3.V(new c(eVar3.f1859e0, 2), true);
                    return;
                }
                return;
            default:
                super.onClick(view);
                e eVar4 = this.f1857b;
                C0269a aVar = new C0269a(eVar4.p());
                aVar.h(eVar4);
                aVar.e(false);
                return;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public d(e eVar, View view) {
        super(view);
        this.f1856a = 3;
        this.f1857b = eVar;
    }
}
