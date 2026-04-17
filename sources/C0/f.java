package C0;

import U0.o;
import java.util.ArrayDeque;

public final class f extends a {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ int f406b;

    public f(int i2) {
        this.f406b = i2;
        char[] cArr = o.f3697a;
        this.f398a = new ArrayDeque(20);
    }

    public final j p() {
        switch (this.f406b) {
            case 0:
                return new e(this);
            default:
                return new l(this);
        }
    }
}
