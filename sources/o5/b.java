package o5;

import kotlin.jvm.internal.j;
import kotlin.jvm.internal.k;
import x5.p;

public final class b extends k implements p {

    /* renamed from: b  reason: collision with root package name */
    public static final b f10473b = new b(2, 0);

    /* renamed from: c  reason: collision with root package name */
    public static final b f10474c = new b(2, 1);

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f10475a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(int i2, int i5) {
        super(i2);
        this.f10475a = i5;
    }

    public final Object invoke(Object obj, Object obj2) {
        c cVar;
        switch (this.f10475a) {
            case 0:
                String str = (String) obj;
                g gVar = (g) obj2;
                j.e(str, "acc");
                j.e(gVar, "element");
                if (str.length() == 0) {
                    return gVar.toString();
                }
                return str + ", " + gVar;
            default:
                i iVar = (i) obj;
                g gVar2 = (g) obj2;
                j.e(iVar, "acc");
                j.e(gVar2, "element");
                i minusKey = iVar.minusKey(gVar2.getKey());
                j jVar = j.f10479a;
                if (minusKey == jVar) {
                    return gVar2;
                }
                e eVar = e.f10478a;
                f fVar = (f) minusKey.get(eVar);
                if (fVar == null) {
                    cVar = new c(gVar2, minusKey);
                } else {
                    i minusKey2 = minusKey.minusKey(eVar);
                    if (minusKey2 == jVar) {
                        return new c(fVar, gVar2);
                    }
                    cVar = new c(fVar, new c(gVar2, minusKey2));
                }
                return cVar;
        }
    }
}
