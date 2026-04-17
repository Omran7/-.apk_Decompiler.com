package F0;

import T0.b;
import java.io.File;
import z0.i;

public final class D implements s {

    /* renamed from: b  reason: collision with root package name */
    public static final D f667b = new D(0);

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f668a;

    public /* synthetic */ D(int i2) {
        this.f668a = i2;
    }

    public final r a(Object obj, int i2, int i5, i iVar) {
        switch (this.f668a) {
            case 0:
                return new r(new b(obj), new C0014d(obj, 1));
            case 1:
                File file = (File) obj;
                return new r(new b(file), new C0014d(file, 0));
            default:
                return null;
        }
    }

    public final boolean b(Object obj) {
        switch (this.f668a) {
            case 0:
                return true;
            case 1:
                File file = (File) obj;
                return true;
            default:
                return false;
        }
    }
}
