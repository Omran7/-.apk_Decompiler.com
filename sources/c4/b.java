package c4;

import Z3.d;
import Z3.p;
import b4.m;
import h4.C0566a;
import h4.C0567b;
import java.lang.reflect.Array;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collection;

public final class b extends p {
    public static final C0341a d = new C0341a(0);

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f5628a = 0;

    /* renamed from: b  reason: collision with root package name */
    public final Object f5629b;

    /* renamed from: c  reason: collision with root package name */
    public final Object f5630c;

    public b(d dVar, p pVar, Class cls) {
        this.f5629b = new n(dVar, pVar, cls);
        this.f5630c = cls;
    }

    public final Object a(C0566a aVar) {
        switch (this.f5628a) {
            case 0:
                if (aVar.C() == 9) {
                    aVar.y();
                    return null;
                }
                ArrayList arrayList = new ArrayList();
                aVar.c();
                while (aVar.p()) {
                    arrayList.add(((p) ((n) this.f5629b).f5664c).a(aVar));
                }
                aVar.l();
                int size = arrayList.size();
                Class cls = (Class) this.f5630c;
                if (!cls.isPrimitive()) {
                    return arrayList.toArray((Object[]) Array.newInstance(cls, size));
                }
                Object newInstance = Array.newInstance(cls, size);
                for (int i2 = 0; i2 < size; i2++) {
                    Array.set(newInstance, i2, arrayList.get(i2));
                }
                return newInstance;
            case 1:
                if (aVar.C() == 9) {
                    aVar.y();
                    return null;
                }
                Collection collection = (Collection) ((m) this.f5630c).n();
                aVar.c();
                while (aVar.p()) {
                    collection.add(((p) ((n) this.f5629b).f5664c).a(aVar));
                }
                aVar.l();
                return collection;
            default:
                Object a6 = ((o) this.f5629b).f5667c.a(aVar);
                if (a6 != null) {
                    Class cls2 = (Class) this.f5630c;
                    if (!cls2.isInstance(a6)) {
                        throw new RuntimeException("Expected a " + cls2.getName() + " but was " + a6.getClass().getName() + "; at path " + aVar.o(true));
                    }
                }
                return a6;
        }
    }

    public final void b(C0567b bVar, Object obj) {
        switch (this.f5628a) {
            case 0:
                if (obj == null) {
                    bVar.p();
                    return;
                }
                bVar.d();
                int length = Array.getLength(obj);
                for (int i2 = 0; i2 < length; i2++) {
                    ((n) this.f5629b).b(bVar, Array.get(obj, i2));
                }
                bVar.l();
                return;
            case 1:
                Collection<Object> collection = (Collection) obj;
                if (collection == null) {
                    bVar.p();
                    return;
                }
                bVar.d();
                for (Object b6 : collection) {
                    ((n) this.f5629b).b(bVar, b6);
                }
                bVar.l();
                return;
            default:
                ((o) this.f5629b).f5667c.b(bVar, obj);
                return;
        }
    }

    public b(d dVar, Type type, p pVar, m mVar) {
        this.f5629b = new n(dVar, pVar, type);
        this.f5630c = mVar;
    }

    public b(o oVar, Class cls) {
        this.f5629b = oVar;
        this.f5630c = cls;
    }
}
