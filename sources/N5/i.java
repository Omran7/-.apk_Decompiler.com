package N5;

public abstract class i implements u {

    /* renamed from: a  reason: collision with root package name */
    public final u f1938a;

    public i(u uVar) {
        if (uVar != null) {
            this.f1938a = uVar;
            return;
        }
        throw new IllegalArgumentException("delegate == null");
    }

    public final w b() {
        return this.f1938a.b();
    }

    public void close() {
        this.f1938a.close();
    }

    public long e(long j6, d dVar) {
        return this.f1938a.e(8192, dVar);
    }

    public final String toString() {
        return getClass().getSimpleName() + "(" + this.f1938a.toString() + ")";
    }
}
