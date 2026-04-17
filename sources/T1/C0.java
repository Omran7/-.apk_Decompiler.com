package T1;

import android.os.Bundle;
import java.util.concurrent.Callable;

public final class C0 implements Callable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f2813a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Z1 f2814b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Bundle f2815c;
    public final /* synthetic */ D0 d;

    public /* synthetic */ C0(D0 d02, Z1 z12, Bundle bundle, int i2) {
        this.f2813a = i2;
        this.f2814b = z12;
        this.f2815c = bundle;
        this.d = d02;
    }

    public final /* bridge */ /* synthetic */ Object call() {
        switch (this.f2813a) {
            case 0:
                D0 d02 = this.d;
                d02.f2818a.j();
                return d02.f2818a.i(this.f2814b, this.f2815c);
            default:
                D0 d03 = this.d;
                d03.f2818a.j();
                return d03.f2818a.i(this.f2814b, this.f2815c);
        }
    }
}
