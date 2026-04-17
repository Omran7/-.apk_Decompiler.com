package d1;

import X4.d;
import android.content.Context;
import com.google.android.datatransport.cct.CctBackendFactory;
import java.util.HashMap;

public final class f {

    /* renamed from: a  reason: collision with root package name */
    public final d f7512a;

    /* renamed from: b  reason: collision with root package name */
    public final C0461d f7513b;

    /* renamed from: c  reason: collision with root package name */
    public final HashMap f7514c = new HashMap();

    public f(Context context, C0461d dVar) {
        d dVar2 = new d((Object) context, 15);
        this.f7512a = dVar2;
        this.f7513b = dVar;
    }

    public final synchronized g a(String str) {
        if (this.f7514c.containsKey(str)) {
            return (g) this.f7514c.get(str);
        }
        CctBackendFactory z3 = this.f7512a.z(str);
        if (z3 == null) {
            return null;
        }
        C0461d dVar = this.f7513b;
        g create = z3.create(new C0459b(dVar.f7507a, dVar.f7508b, dVar.f7509c, str));
        this.f7514c.put(str, create);
        return create;
    }
}
