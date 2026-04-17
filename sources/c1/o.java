package c1;

import F3.k;
import Z0.c;
import Z0.e;
import Z0.f;
import java.util.Set;

public final class o implements f {

    /* renamed from: a  reason: collision with root package name */
    public final Set f5619a;

    /* renamed from: b  reason: collision with root package name */
    public final j f5620b;

    /* renamed from: c  reason: collision with root package name */
    public final p f5621c;

    public o(Set set, j jVar, p pVar) {
        this.f5619a = set;
        this.f5620b = jVar;
        this.f5621c = pVar;
    }

    public final k a(String str, c cVar, e eVar) {
        Set set = this.f5619a;
        if (set.contains(cVar)) {
            return new k(this.f5620b, str, cVar, eVar, this.f5621c, 6);
        }
        throw new IllegalArgumentException(String.format("%s is not supported byt this factory. Supported encodings are: %s.", new Object[]{cVar, set}));
    }
}
