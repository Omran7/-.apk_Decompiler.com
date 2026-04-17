package U0;

import T2.c;

public abstract class g {

    /* renamed from: a  reason: collision with root package name */
    public static final c f3683a = new c(1);

    /* renamed from: b  reason: collision with root package name */
    public static final c f3684b = new c(2);

    public static void a(String str, boolean z3) {
        if (!z3) {
            throw new IllegalArgumentException(str);
        }
    }

    public static void b(Object obj) {
        c(obj, "Argument must not be null");
    }

    public static void c(Object obj, String str) {
        if (obj == null) {
            throw new NullPointerException(str);
        }
    }
}
