package androidx.fragment.app;

import h0.C0552a;
import java.util.ArrayList;

public final class T implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f5061a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ U f5062b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ C0276h f5063c;

    public /* synthetic */ T(C0276h hVar, U u6, int i2) {
        this.f5061a = i2;
        this.f5063c = hVar;
        this.f5062b = u6;
    }

    public final void run() {
        switch (this.f5061a) {
            case 0:
                ArrayList arrayList = this.f5063c.f5110b;
                U u6 = this.f5062b;
                if (arrayList.contains(u6)) {
                    C0552a.a(u6.f5066c.f5159N, u6.f5064a);
                    return;
                }
                return;
            default:
                C0276h hVar = this.f5063c;
                ArrayList arrayList2 = hVar.f5110b;
                U u7 = this.f5062b;
                arrayList2.remove(u7);
                hVar.f5111c.remove(u7);
                return;
        }
    }
}
