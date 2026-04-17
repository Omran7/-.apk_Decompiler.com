package H5;

import I1.b;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import kotlin.jvm.internal.j;
import m5.C0846e;

public abstract class f {
    private static volatile Choreographer choreographer;

    static {
        Object obj;
        try {
            obj = new e(a(Looper.getMainLooper()));
        } catch (Throwable th) {
            obj = b.r(th);
        }
        if (obj instanceof C0846e) {
            obj = null;
        }
        e eVar = (e) obj;
    }

    public static final Handler a(Looper looper) {
        Class<Looper> cls = Looper.class;
        Class<Handler> cls2 = Handler.class;
        if (Build.VERSION.SDK_INT >= 28) {
            Object invoke = cls2.getDeclaredMethod("createAsync", new Class[]{cls}).invoke((Object) null, new Object[]{looper});
            j.c(invoke, "null cannot be cast to non-null type android.os.Handler");
            return (Handler) invoke;
        }
        try {
            return cls2.getDeclaredConstructor(new Class[]{cls, Handler.Callback.class, Boolean.TYPE}).newInstance(new Object[]{looper, null, Boolean.TRUE});
        } catch (NoSuchMethodException unused) {
            return new Handler(looper);
        }
    }
}
