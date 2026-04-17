package l3;

import c1.i;
import java.util.HashMap;
import java.util.Map;

/* renamed from: l3.g  reason: case insensitive filesystem */
public final class C0788g implements C0791j {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ String f9681a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ long f9682b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ m f9683c;
    public final /* synthetic */ q d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ o f9684e;

    public C0788g(o oVar, String str, long j6, m mVar, q qVar) {
        this.f9684e = oVar;
        this.f9681a = str;
        this.f9682b = j6;
        this.f9683c = mVar;
        this.d = qVar;
    }

    public final void a(Map map) {
        o oVar = this.f9684e;
        boolean y6 = oVar.f9726x.y();
        i iVar = oVar.f9726x;
        if (y6) {
            iVar.d(this.f9681a + " response: " + map, (Throwable) null, new Object[0]);
        }
        HashMap hashMap = oVar.f9715m;
        long j6 = this.f9682b;
        if (((m) hashMap.get(Long.valueOf(j6))) == this.f9683c) {
            oVar.f9715m.remove(Long.valueOf(j6));
            q qVar = this.d;
            String str = (String) map.get("s");
            if (str.equals("ok")) {
                qVar.c((String) null, (String) null);
            } else {
                qVar.c(str, (String) map.get("d"));
            }
        } else if (iVar.y()) {
            iVar.d("Ignoring on complete for put " + j6 + " because it was removed already.", (Throwable) null, new Object[0]);
        }
        oVar.b();
    }
}
