package I1;

import D0.e;
import android.content.Context;

public final class c {

    /* renamed from: b  reason: collision with root package name */
    public static final c f1153b;

    /* renamed from: a  reason: collision with root package name */
    public e f1154a;

    /* JADX WARNING: type inference failed for: r0v0, types: [java.lang.Object, I1.c] */
    static {
        ? obj = new Object();
        obj.f1154a = null;
        f1153b = obj;
    }

    public static e a(Context context) {
        e eVar;
        c cVar = f1153b;
        synchronized (cVar) {
            try {
                if (cVar.f1154a == null) {
                    if (context.getApplicationContext() != null) {
                        context = context.getApplicationContext();
                    }
                    cVar.f1154a = new e(context, 5);
                }
                eVar = cVar.f1154a;
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }
        return eVar;
    }
}
