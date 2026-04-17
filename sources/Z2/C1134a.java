package z2;

/* renamed from: z2.a  reason: case insensitive filesystem */
public final class C1134a extends C1136c {

    /* renamed from: a  reason: collision with root package name */
    public static final C1134a f12854a = new Object();

    public final Object a() {
        throw new IllegalStateException("Optional.get() cannot be called on an absent value");
    }

    public final boolean b() {
        return false;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return 2040732332;
    }

    public final String toString() {
        return "Optional.absent()";
    }
}
