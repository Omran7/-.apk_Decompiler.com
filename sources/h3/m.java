package h3;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

public enum m implements Executor {
    ;
    

    /* renamed from: b  reason: collision with root package name */
    public static final Handler f8151b = null;

    /* JADX WARNING: type inference failed for: r0v0, types: [java.lang.Enum, h3.m] */
    static {
        f8151b = new Handler(Looper.getMainLooper());
    }

    public final void execute(Runnable runnable) {
        f8151b.post(runnable);
    }
}
