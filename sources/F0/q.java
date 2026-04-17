package F0;

import U0.o;
import java.util.ArrayDeque;

public final class q {

    /* renamed from: b  reason: collision with root package name */
    public static final ArrayDeque f702b = new ArrayDeque(0);

    /* renamed from: a  reason: collision with root package name */
    public Object f703a;

    static {
        char[] cArr = o.f3697a;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: F0.q} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v3, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v4, resolved type: F0.q} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v5, resolved type: F0.q} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static F0.q a(java.lang.Object r2) {
        /*
            java.util.ArrayDeque r0 = f702b
            monitor-enter(r0)
            java.lang.Object r1 = r0.poll()     // Catch:{ all -> 0x0014 }
            F0.q r1 = (F0.q) r1     // Catch:{ all -> 0x0014 }
            monitor-exit(r0)     // Catch:{ all -> 0x0014 }
            if (r1 != 0) goto L_0x0011
            F0.q r1 = new F0.q
            r1.<init>()
        L_0x0011:
            r1.f703a = r2
            return r1
        L_0x0014:
            r2 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0014 }
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: F0.q.a(java.lang.Object):F0.q");
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        qVar.getClass();
        return this.f703a.equals(qVar.f703a);
    }

    public final int hashCode() {
        return this.f703a.hashCode();
    }
}
