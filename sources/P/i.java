package p;

public final class i {

    /* renamed from: a  reason: collision with root package name */
    public Object f10962a;

    /* renamed from: b  reason: collision with root package name */
    public k f10963b;

    /* renamed from: c  reason: collision with root package name */
    public l f10964c;
    public boolean d;

    public final void finalize() {
        l lVar;
        k kVar = this.f10963b;
        if (kVar != null) {
            j jVar = kVar.f10967b;
            if (!jVar.isDone()) {
                jVar.y(new C0899b("The completer object was garbage collected - this future would otherwise never complete. The tag was: " + this.f10962a, 1));
            }
        }
        if (!this.d && (lVar = this.f10964c) != null) {
            lVar.x((Object) null);
        }
    }
}
