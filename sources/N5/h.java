package N5;

public abstract class h implements t {

    /* renamed from: a  reason: collision with root package name */
    public final t f1937a;

    public h(t tVar) {
        if (tVar != null) {
            this.f1937a = tVar;
            return;
        }
        throw new IllegalArgumentException("delegate == null");
    }

    public final w b() {
        return this.f1937a.b();
    }

    public void close() {
        this.f1937a.close();
    }

    public void f(long j6, d dVar) {
        this.f1937a.f(j6, dVar);
    }

    public void flush() {
        this.f1937a.flush();
    }

    public final String toString() {
        return getClass().getSimpleName() + "(" + this.f1937a.toString() + ")";
    }
}
