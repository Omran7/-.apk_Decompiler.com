package T2;

import U0.o;
import java.util.concurrent.Executor;

public final /* synthetic */ class c implements Executor {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f3559a;

    public /* synthetic */ c(int i2) {
        this.f3559a = i2;
    }

    public final void execute(Runnable runnable) {
        switch (this.f3559a) {
            case 0:
                runnable.run();
                return;
            case 1:
                o.f().post(runnable);
                return;
            case 2:
                runnable.run();
                return;
            default:
                new Thread(runnable).start();
                return;
        }
    }
}
