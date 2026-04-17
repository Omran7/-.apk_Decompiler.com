package l3;

import c1.i;
import h0.C0552a;
import java.util.Map;
import m3.C0837a;
import n3.C0862c;
import n3.m;

/* renamed from: l3.f  reason: case insensitive filesystem */
public final class C0787f implements C0791j {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ boolean f9679a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ o f9680b;

    public C0787f(o oVar, boolean z3) {
        this.f9680b = oVar;
        this.f9679a = z3;
    }

    public final void a(Map map) {
        String str = (String) map.get("s");
        boolean equals = str.equals("ok");
        o oVar = this.f9680b;
        if (equals) {
            oVar.h = C0792k.f9691e;
            oVar.f9702B = 0;
            oVar.i(this.f9679a);
            return;
        }
        oVar.f9718p = null;
        oVar.f9719q = true;
        m mVar = oVar.f9706a;
        mVar.getClass();
        mVar.q(C0862c.f10261c, Boolean.FALSE);
        i iVar = oVar.f9726x;
        iVar.d(C0552a.q("Authentication failed: ", str, " (", (String) map.get("d"), ")"), (Throwable) null, new Object[0]);
        oVar.g.b(2);
        if (str.equals("invalid_token")) {
            int i2 = oVar.f9702B + 1;
            oVar.f9702B = i2;
            if (((long) i2) >= 3) {
                C0837a aVar = oVar.f9727y;
                aVar.f10156i = aVar.d;
                iVar.Q("Provided authentication credentials are invalid. This usually indicates your FirebaseApp instance was not initialized correctly. Make sure your google-services.json file has the correct firebase_url and api_key. You can re-download google-services.json from https://console.firebase.google.com/.");
            }
        }
    }
}
