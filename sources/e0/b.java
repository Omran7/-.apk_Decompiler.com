package E0;

import java.util.concurrent.ThreadFactory;

public final class b implements ThreadFactory {
    public final Thread newThread(Runnable runnable) {
        return new a(runnable);
    }
}
