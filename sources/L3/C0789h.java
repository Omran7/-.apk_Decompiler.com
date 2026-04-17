package l3;

import R2.b;
import h0.C0552a;
import java.util.List;
import java.util.Map;
import m0.a0;

/* renamed from: l3.h  reason: case insensitive filesystem */
public final class C0789h implements C0791j {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ l f9685a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ o f9686b;

    public C0789h(o oVar, l lVar) {
        this.f9686b = oVar;
        this.f9685a = lVar;
    }

    public final void a(Map map) {
        String str = (String) map.get("s");
        boolean equals = str.equals("ok");
        o oVar = this.f9686b;
        l lVar = this.f9685a;
        if (equals) {
            Map map2 = (Map) map.get("d");
            if (map2.containsKey("w")) {
                n nVar = lVar.f9694b;
                oVar.getClass();
                if (((List) map2.get("w")).contains("no_index")) {
                    StringBuilder t6 = C0552a.t("Using an unspecified index. Your data will be downloaded and filtered on the client. Consider adding '", "\".indexOn\": \"" + nVar.f9700b.get("i") + '\"', "' at ");
                    t6.append(b.u0(nVar.f9699a));
                    t6.append(" to your security and Firebase Database rules for better performance");
                    oVar.f9726x.Q(t6.toString());
                }
            }
        }
        if (((l) oVar.f9717o.get(lVar.f9694b)) == lVar) {
            boolean equals2 = str.equals("ok");
            a0 a0Var = lVar.f9693a;
            if (!equals2) {
                oVar.f(lVar.f9694b);
                a0Var.c(str, (String) map.get("d"));
                return;
            }
            a0Var.c((String) null, (String) null);
        }
    }
}
