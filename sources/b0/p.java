package B0;

public final class p {

    /* renamed from: b  reason: collision with root package name */
    public static final p f284b = new p(0);

    /* renamed from: c  reason: collision with root package name */
    public static final p f285c = new p(1);
    public static final p d = new p(2);

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f286a;

    public /* synthetic */ p(int i2) {
        this.f286a = i2;
    }

    public final boolean a(int i2) {
        switch (this.f286a) {
            case 0:
                return false;
            case 1:
                return (i2 == 3 || i2 == 5) ? false : true;
            default:
                return i2 == 2;
        }
    }
}
