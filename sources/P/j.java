package p;

public final class j extends h {

    /* renamed from: q  reason: collision with root package name */
    public final /* synthetic */ k f10965q;

    public j(k kVar) {
        this.f10965q = kVar;
    }

    public final String v() {
        i iVar = (i) this.f10965q.f10966a.get();
        if (iVar == null) {
            return "Completer object has been garbage collected, future will fail soon";
        }
        return "tag=[" + iVar.f10962a + "]";
    }
}
