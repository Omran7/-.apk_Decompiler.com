package androidx.lifecycle;

import kotlin.jvm.internal.j;

/* renamed from: androidx.lifecycle.k  reason: case insensitive filesystem */
public final class C0300k {
    public static C0302m a(C0303n nVar) {
        j.e(nVar, "state");
        int ordinal = nVar.ordinal();
        if (ordinal == 1) {
            return C0302m.ON_CREATE;
        }
        if (ordinal == 2) {
            return C0302m.ON_START;
        }
        if (ordinal != 3) {
            return null;
        }
        return C0302m.ON_RESUME;
    }
}
