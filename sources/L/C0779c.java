package l;

import K1.e;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import e0.C0478b;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* renamed from: l.c  reason: case insensitive filesystem */
public final class C0779c extends e {

    /* renamed from: i  reason: collision with root package name */
    public final Object f9660i = new Object();

    /* renamed from: j  reason: collision with root package name */
    public final ExecutorService f9661j = Executors.newFixedThreadPool(4, new C0478b(1));

    /* renamed from: k  reason: collision with root package name */
    public volatile Handler f9662k;

    public static Handler z0(Looper looper) {
        if (Build.VERSION.SDK_INT >= 28) {
            return C0778b.a(looper);
        }
        try {
            return Handler.class.getDeclaredConstructor(new Class[]{Looper.class, Handler.Callback.class, Boolean.TYPE}).newInstance(new Object[]{looper, null, Boolean.TRUE});
        } catch (IllegalAccessException | InstantiationException | NoSuchMethodException unused) {
            return new Handler(looper);
        } catch (InvocationTargetException unused2) {
            return new Handler(looper);
        }
    }
}
