package l3;

import h0.C0552a;
import java.util.Map;

/* renamed from: l3.e  reason: case insensitive filesystem */
public final /* synthetic */ class C0786e implements C0791j {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ o f9677a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ boolean f9678b;

    public /* synthetic */ C0786e(o oVar, boolean z3) {
        this.f9677a = oVar;
        this.f9678b = z3;
    }

    public final void a(Map map) {
        o oVar = this.f9677a;
        oVar.getClass();
        String str = (String) map.get("s");
        if (str.equals("ok")) {
            oVar.f9703C = 0;
        } else {
            oVar.f9720r = null;
            oVar.f9721s = true;
            oVar.f9726x.d(C0552a.q("App check failed: ", str, " (", (String) map.get("d"), ")"), (Throwable) null, new Object[0]);
        }
        if (this.f9678b) {
            oVar.g();
        }
    }
}
