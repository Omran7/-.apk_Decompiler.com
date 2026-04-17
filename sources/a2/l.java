package A2;

public final class l extends g {
    public final transient n d;

    /* renamed from: e  reason: collision with root package name */
    public final transient m f40e;

    public l(n nVar, m mVar) {
        this.d = nVar;
        this.f40e = mVar;
    }

    /* renamed from: B */
    public final s iterator() {
        return this.f40e.listIterator(0);
    }

    public final boolean contains(Object obj) {
        if (this.d.get(obj) != null) {
            return true;
        }
        return false;
    }

    public final int k(Object[] objArr) {
        return this.f40e.k(objArr);
    }

    public final int size() {
        return this.d.f48f;
    }

    public final d x() {
        throw null;
    }
}
