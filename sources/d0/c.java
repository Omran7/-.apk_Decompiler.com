package D0;

import U0.o;
import java.util.ArrayDeque;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public final ArrayDeque f488a;

    public c(int i2) {
        switch (i2) {
            case 1:
                char[] cArr = o.f3697a;
                this.f488a = new ArrayDeque(0);
                return;
            default:
                this.f488a = new ArrayDeque();
                return;
        }
    }

    public synchronized void a(y0.c cVar) {
        cVar.f12629b = null;
        cVar.f12630c = null;
        this.f488a.offer(cVar);
    }
}
