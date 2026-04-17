package androidx.lifecycle;

public final class DefaultLifecycleObserverAdapter implements C0306q {

    /* renamed from: a  reason: collision with root package name */
    public final C0294e f5219a;

    /* renamed from: b  reason: collision with root package name */
    public final C0306q f5220b;

    public DefaultLifecycleObserverAdapter(C0294e eVar, C0306q qVar) {
        this.f5219a = eVar;
        this.f5220b = qVar;
    }

    public final void a(C0307s sVar, C0302m mVar) {
        int i2 = C0295f.f5266a[mVar.ordinal()];
        C0294e eVar = this.f5219a;
        if (i2 == 3) {
            eVar.c();
        } else if (i2 == 7) {
            throw new IllegalArgumentException("ON_ANY must not been send by anybody");
        }
        C0306q qVar = this.f5220b;
        if (qVar != null) {
            qVar.a(sVar, mVar);
        }
    }
}
