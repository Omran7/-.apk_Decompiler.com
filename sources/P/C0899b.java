package p;

/* renamed from: p.b  reason: case insensitive filesystem */
public final class C0899b extends Throwable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f10944a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0899b(String str, int i2) {
        super(str);
        this.f10944a = i2;
    }

    public final synchronized Throwable fillInStackTrace() {
        int i2 = this.f10944a;
        synchronized (this) {
            switch (i2) {
                case 0:
                    return this;
                default:
                    return this;
            }
        }
    }
}
