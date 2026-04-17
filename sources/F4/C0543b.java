package f4;

import c4.C0341a;

/* renamed from: f4.b  reason: case insensitive filesystem */
public abstract class C0543b {

    /* renamed from: a  reason: collision with root package name */
    public static final boolean f7975a;

    /* renamed from: b  reason: collision with root package name */
    public static final C0341a f7976b;

    /* renamed from: c  reason: collision with root package name */
    public static final C0341a f7977c;
    public static final C0341a d;

    static {
        boolean z3;
        try {
            Class.forName("java.sql.Date");
            z3 = true;
        } catch (ClassNotFoundException unused) {
            z3 = false;
        }
        f7975a = z3;
        if (z3) {
            f7976b = C0542a.f7971c;
            f7977c = C0542a.d;
            d = C0542a.f7972e;
            return;
        }
        f7976b = null;
        f7977c = null;
        d = null;
    }
}
