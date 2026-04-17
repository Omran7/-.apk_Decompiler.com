package m5;

import java.io.Serializable;
import kotlin.jvm.internal.j;
import x5.a;

/* renamed from: m5.g  reason: case insensitive filesystem */
public final class C0848g implements C0844c, Serializable {

    /* renamed from: a  reason: collision with root package name */
    public a f10199a;

    /* renamed from: b  reason: collision with root package name */
    public volatile Object f10200b = C0849h.f10202b;

    /* renamed from: c  reason: collision with root package name */
    public final Object f10201c = this;

    public C0848g(a aVar) {
        j.e(aVar, "initializer");
        this.f10199a = aVar;
    }

    public final Object a() {
        Object obj;
        Object obj2 = this.f10200b;
        C0849h hVar = C0849h.f10202b;
        if (obj2 != hVar) {
            return obj2;
        }
        synchronized (this.f10201c) {
            obj = this.f10200b;
            if (obj == hVar) {
                a aVar = this.f10199a;
                j.b(aVar);
                obj = aVar.invoke();
                this.f10200b = obj;
                this.f10199a = null;
            }
        }
        return obj;
    }

    public final String toString() {
        if (this.f10200b != C0849h.f10202b) {
            return String.valueOf(a());
        }
        return "Lazy value not initialized yet.";
    }
}
