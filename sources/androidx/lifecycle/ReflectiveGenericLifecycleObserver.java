package androidx.lifecycle;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.List;

@Deprecated
class ReflectiveGenericLifecycleObserver implements C0306q {

    /* renamed from: a  reason: collision with root package name */
    public final r f5252a;

    /* renamed from: b  reason: collision with root package name */
    public final C0291b f5253b;

    public ReflectiveGenericLifecycleObserver(r rVar) {
        this.f5252a = rVar;
        C0293d dVar = C0293d.f5263c;
        Class<?> cls = rVar.getClass();
        C0291b bVar = (C0291b) dVar.f5264a.get(cls);
        this.f5253b = bVar == null ? dVar.a(cls, (Method[]) null) : bVar;
    }

    public final void a(C0307s sVar, C0302m mVar) {
        HashMap hashMap = this.f5253b.f5259a;
        r rVar = this.f5252a;
        C0291b.a((List) hashMap.get(mVar), sVar, mVar, rVar);
        C0291b.a((List) hashMap.get(C0302m.ON_ANY), sVar, mVar, rVar);
    }
}
