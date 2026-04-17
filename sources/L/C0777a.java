package l;

import K1.e;

/* renamed from: l.a  reason: case insensitive filesystem */
public final class C0777a extends e {

    /* renamed from: j  reason: collision with root package name */
    public static volatile C0777a f9658j;

    /* renamed from: i  reason: collision with root package name */
    public final C0779c f9659i = new C0779c();

    public static C0777a z0() {
        if (f9658j != null) {
            return f9658j;
        }
        synchronized (C0777a.class) {
            try {
                if (f9658j == null) {
                    f9658j = new C0777a();
                }
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }
        return f9658j;
    }
}
