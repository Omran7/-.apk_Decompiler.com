package K5;

import G5.F;
import K1.h;

public final class j extends i {

    /* renamed from: c  reason: collision with root package name */
    public final Runnable f1676c;

    public j(Runnable runnable, long j6, h hVar) {
        super(j6, hVar);
        this.f1676c = runnable;
    }

    public final void run() {
        try {
            this.f1676c.run();
        } finally {
            this.f1675b.getClass();
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Task[");
        Runnable runnable = this.f1676c;
        sb.append(runnable.getClass().getSimpleName());
        sb.append('@');
        sb.append(F.j(runnable));
        sb.append(", ");
        sb.append(this.f1674a);
        sb.append(", ");
        sb.append(this.f1675b);
        sb.append(']');
        return sb.toString();
    }
}
