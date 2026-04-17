package c4;

import Z3.p;
import com.bumptech.glide.c;
import e4.C0503c;
import h4.C0566a;
import h4.C0567b;
import java.util.LinkedHashMap;

public abstract class j extends p {

    /* renamed from: a  reason: collision with root package name */
    public final LinkedHashMap f5654a;

    public j(LinkedHashMap linkedHashMap) {
        this.f5654a = linkedHashMap;
    }

    public final Object a(C0566a aVar) {
        if (aVar.C() == 9) {
            aVar.y();
            return null;
        }
        Object c3 = c();
        try {
            aVar.d();
            while (aVar.p()) {
                i iVar = (i) this.f5654a.get(aVar.w());
                if (iVar != null) {
                    if (iVar.f5647e) {
                        e(c3, aVar, iVar);
                    }
                }
                aVar.I();
            }
            aVar.m();
            return d(c3);
        } catch (IllegalStateException e6) {
            throw new RuntimeException(e6);
        } catch (IllegalAccessException e7) {
            c cVar = C0503c.f7669a;
            throw new RuntimeException("Unexpected IllegalAccessException occurred (Gson 2.10.1). Certain ReflectionAccessFilter features require Java >= 9 to work correctly. If you are not using ReflectionAccessFilter, report this to the Gson maintainers.", e7);
        }
    }

    public final void b(C0567b bVar, Object obj) {
        if (obj == null) {
            bVar.p();
            return;
        }
        bVar.j();
        try {
            for (i a6 : this.f5654a.values()) {
                a6.a(bVar, obj);
            }
            bVar.m();
        } catch (IllegalAccessException e6) {
            c cVar = C0503c.f7669a;
            throw new RuntimeException("Unexpected IllegalAccessException occurred (Gson 2.10.1). Certain ReflectionAccessFilter features require Java >= 9 to work correctly. If you are not using ReflectionAccessFilter, report this to the Gson maintainers.", e6);
        }
    }

    public abstract Object c();

    public abstract Object d(Object obj);

    public abstract void e(Object obj, C0566a aVar, i iVar);
}
