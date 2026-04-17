package g3;

import E3.a;
import E3.b;
import E3.c;
import h3.m;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;

public final class j implements c, b {

    /* renamed from: a  reason: collision with root package name */
    public final HashMap f8031a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    public ArrayDeque f8032b = new ArrayDeque();

    /* renamed from: c  reason: collision with root package name */
    public final m f8033c;

    public j() {
        m mVar = m.f8150a;
        this.f8033c = mVar;
    }

    public final synchronized void a(Executor executor, a aVar) {
        Class<R2.b> cls = R2.b.class;
        synchronized (this) {
            try {
                executor.getClass();
                if (!this.f8031a.containsKey(cls)) {
                    this.f8031a.put(cls, new ConcurrentHashMap());
                }
                ((ConcurrentHashMap) this.f8031a.get(cls)).put(aVar, executor);
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }
    }
}
