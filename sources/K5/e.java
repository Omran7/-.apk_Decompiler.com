package K5;

import G5.A;

public final class e extends h {
    public static final e d;

    /* JADX WARNING: type inference failed for: r0v0, types: [G5.A, K5.e, K5.h] */
    static {
        int i2 = k.f1679c;
        int i5 = k.d;
        long j6 = k.f1680e;
        String str = k.f1677a;
        ? a6 = new A();
        a6.f1673c = new c(i2, i5, j6, str);
        d = a6;
    }

    public final void close() {
        throw new UnsupportedOperationException("Dispatchers.Default cannot be closed");
    }

    public final String toString() {
        return "Dispatchers.Default";
    }
}
