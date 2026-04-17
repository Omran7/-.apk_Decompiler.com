package p4;

import B0.l;
import F3.h;
import H4.d;
import J.a;
import d5.o;
import java.util.HashMap;

/* renamed from: p4.c  reason: case insensitive filesystem */
public final /* synthetic */ class C0920c implements a {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ C0923f f11007a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ int f11008b;

    public /* synthetic */ C0920c(C0923f fVar, int i2) {
        this.f11007a = fVar;
        this.f11008b = i2;
    }

    public final void accept(Object obj) {
        Boolean bool = (Boolean) obj;
        C0923f fVar = this.f11007a;
        fVar.getClass();
        int i2 = this.f11008b;
        l lVar = new l((Object) fVar, i2, 29);
        HashMap hashMap = new HashMap();
        hashMap.put("serverNumber", Integer.valueOf(o.getAccountObject().getCurrentOpenedServer()));
        hashMap.put("playerId", o.getAccountObject().getId());
        hashMap.put("mainCategoryPosition", Integer.valueOf(fVar.f11014e0));
        hashMap.put("subCategoryPosition", Integer.valueOf(fVar.f11015f0));
        hashMap.put("countValue", Integer.valueOf(i2));
        h.b().a("convertMaterials").q(hashMap).addOnCompleteListener(new d((Object) lVar, 17));
    }
}
