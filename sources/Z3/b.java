package Z3;

import h4.C0566a;
import h4.C0567b;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicLongArray;

public final class b extends p {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f4517a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ p f4518b;

    public /* synthetic */ b(p pVar, int i2) {
        this.f4517a = i2;
        this.f4518b = pVar;
    }

    public final Object a(C0566a aVar) {
        switch (this.f4517a) {
            case 0:
                return new AtomicLong(((Number) this.f4518b.a(aVar)).longValue());
            case 1:
                ArrayList arrayList = new ArrayList();
                aVar.c();
                while (aVar.p()) {
                    arrayList.add(Long.valueOf(((Number) this.f4518b.a(aVar)).longValue()));
                }
                aVar.l();
                int size = arrayList.size();
                AtomicLongArray atomicLongArray = new AtomicLongArray(size);
                for (int i2 = 0; i2 < size; i2++) {
                    atomicLongArray.set(i2, ((Long) arrayList.get(i2)).longValue());
                }
                return atomicLongArray;
            default:
                if (aVar.C() != 9) {
                    return this.f4518b.a(aVar);
                }
                aVar.y();
                return null;
        }
    }

    public final void b(C0567b bVar, Object obj) {
        switch (this.f4517a) {
            case 0:
                this.f4518b.b(bVar, Long.valueOf(((AtomicLong) obj).get()));
                return;
            case 1:
                AtomicLongArray atomicLongArray = (AtomicLongArray) obj;
                bVar.d();
                int length = atomicLongArray.length();
                for (int i2 = 0; i2 < length; i2++) {
                    this.f4518b.b(bVar, Long.valueOf(atomicLongArray.get(i2)));
                }
                bVar.l();
                return;
            default:
                if (obj == null) {
                    bVar.p();
                    return;
                } else {
                    this.f4518b.b(bVar, obj);
                    return;
                }
        }
    }
}
