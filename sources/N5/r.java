package N5;

public abstract class r {

    /* renamed from: a  reason: collision with root package name */
    public static q f1960a;

    /* renamed from: b  reason: collision with root package name */
    public static long f1961b;

    /* renamed from: c  reason: collision with root package name */
    public static final byte[] f1962c = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 43, 47};

    public static void a(q qVar) {
        if (qVar.f1959f != null || qVar.g != null) {
            throw new IllegalArgumentException();
        } else if (!qVar.d) {
            synchronized (r.class) {
                try {
                    long j6 = f1961b + 8192;
                    if (j6 <= 65536) {
                        f1961b = j6;
                        qVar.f1959f = f1960a;
                        qVar.f1957c = 0;
                        qVar.f1956b = 0;
                        f1960a = qVar;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public static q b() {
        synchronized (r.class) {
            try {
                q qVar = f1960a;
                if (qVar == null) {
                    return new q();
                }
                f1960a = qVar.f1959f;
                qVar.f1959f = null;
                f1961b -= 8192;
                return qVar;
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }
    }
}
