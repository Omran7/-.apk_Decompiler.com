package G5;

public abstract class D0 {

    /* renamed from: a  reason: collision with root package name */
    public static final ThreadLocal f859a = new ThreadLocal();

    public static Y a() {
        ThreadLocal threadLocal = f859a;
        Y y6 = (Y) threadLocal.get();
        if (y6 != null) {
            return y6;
        }
        C0033h hVar = new C0033h(Thread.currentThread());
        threadLocal.set(hVar);
        return hVar;
    }
}
