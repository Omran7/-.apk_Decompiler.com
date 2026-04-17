package B0;

import H.i;
import java.util.concurrent.ThreadFactory;

/* renamed from: B0.b  reason: case insensitive filesystem */
public final class C0003b implements ThreadFactory {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f210a;

    public /* synthetic */ C0003b(int i2) {
        this.f210a = i2;
    }

    public final Thread newThread(Runnable runnable) {
        switch (this.f210a) {
            case 0:
                return new Thread(new C0002a(runnable, 0), "glide-active-resources");
            default:
                return new i(runnable);
        }
    }
}
