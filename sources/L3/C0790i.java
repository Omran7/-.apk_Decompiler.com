package l3;

import h0.C0552a;
import java.util.Map;

/* renamed from: l3.i  reason: case insensitive filesystem */
public final class C0790i implements C0791j {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ o f9687a;

    public C0790i(o oVar) {
        this.f9687a = oVar;
    }

    public final void a(Map map) {
        String str = (String) map.get("s");
        if (!str.equals("ok")) {
            String str2 = (String) map.get("d");
            o oVar = this.f9687a;
            if (oVar.f9726x.y()) {
                oVar.f9726x.d(C0552a.q("Failed to send stats: ", str, " (message: ", str2, ")"), (Throwable) null, new Object[0]);
            }
        }
    }
}
