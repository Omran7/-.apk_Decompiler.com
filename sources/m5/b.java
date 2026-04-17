package M5;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.k;
import m5.C0849h;
import x5.l;

public final class b extends k implements l {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f1869a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ d f1870b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ c f1871c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(d dVar, c cVar, int i2) {
        super(1);
        this.f1869a = i2;
        this.f1870b = dVar;
        this.f1871c = cVar;
    }

    public final Object invoke(Object obj) {
        switch (this.f1869a) {
            case 0:
                Throwable th = (Throwable) obj;
                this.f1871c.getClass();
                this.f1870b.d();
                return C0849h.f10203c;
            default:
                Throwable th2 = (Throwable) obj;
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = d.g;
                this.f1871c.getClass();
                d dVar = this.f1870b;
                atomicReferenceFieldUpdater.set(dVar, (Object) null);
                dVar.d();
                return C0849h.f10203c;
        }
    }
}
