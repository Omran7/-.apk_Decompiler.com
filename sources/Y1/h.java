package y1;

import java.util.concurrent.Executor;

public final /* synthetic */ class h implements Executor {

    /* renamed from: b  reason: collision with root package name */
    public static final /* synthetic */ h f12662b = new h(0);

    /* renamed from: c  reason: collision with root package name */
    public static final /* synthetic */ h f12663c = new h(1);

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f12664a;

    public /* synthetic */ h(int i2) {
        this.f12664a = i2;
    }

    public final void execute(Runnable runnable) {
        switch (this.f12664a) {
            case 0:
                runnable.run();
                return;
            default:
                runnable.run();
                return;
        }
    }
}
