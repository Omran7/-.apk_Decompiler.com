package F0;

import U0.k;
import java.util.ArrayDeque;

public final class p extends k {
    public final void c(Object obj, Object obj2) {
        q qVar = (q) obj;
        qVar.getClass();
        ArrayDeque arrayDeque = q.f702b;
        synchronized (arrayDeque) {
            arrayDeque.offer(qVar);
        }
    }
}
