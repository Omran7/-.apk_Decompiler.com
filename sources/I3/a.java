package I3;

import java.util.concurrent.Executor;

public final /* synthetic */ class a implements Executor {

    /* renamed from: b  reason: collision with root package name */
    public static final a f1160b = new a(0);

    /* renamed from: c  reason: collision with root package name */
    public static final a f1161c = new a(1);
    public static final a d = new a(2);

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f1162a;

    public /* synthetic */ a(int i2) {
        this.f1162a = i2;
    }

    public final void execute(Runnable runnable) {
        switch (this.f1162a) {
            case 0:
                runnable.run();
                return;
            case 1:
                runnable.run();
                return;
            default:
                runnable.run();
                return;
        }
    }
}
