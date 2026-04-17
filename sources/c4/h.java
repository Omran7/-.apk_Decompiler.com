package c4;

import Z3.d;
import Z3.o;
import Z3.p;
import b4.l;
import com.google.android.gms.internal.measurement.a;
import g4.C0551a;
import h4.C0566a;
import h4.C0567b;
import java.io.Serializable;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import q.C0928e;

public final class h extends p {

    /* renamed from: b  reason: collision with root package name */
    public static final C0341a f5642b = new C0341a(2);

    /* renamed from: a  reason: collision with root package name */
    public final d f5643a;

    public h(d dVar) {
        this.f5643a = dVar;
    }

    public final Object a(C0566a aVar) {
        Object obj;
        String str;
        Serializable serializable;
        boolean z3;
        int C6 = aVar.C();
        int c3 = C0928e.c(C6);
        if (c3 == 0) {
            aVar.c();
            obj = new ArrayList();
        } else if (c3 != 2) {
            obj = null;
        } else {
            aVar.d();
            obj = new l(true);
        }
        if (obj == null) {
            return c(aVar, C6);
        }
        ArrayDeque arrayDeque = new ArrayDeque();
        while (true) {
            if (aVar.p()) {
                if (obj instanceof Map) {
                    str = aVar.w();
                } else {
                    str = null;
                }
                int C7 = aVar.C();
                int c6 = C0928e.c(C7);
                if (c6 == 0) {
                    aVar.c();
                    serializable = new ArrayList();
                } else if (c6 != 2) {
                    serializable = null;
                } else {
                    aVar.d();
                    serializable = new l(true);
                }
                if (serializable != null) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (serializable == null) {
                    serializable = c(aVar, C7);
                }
                if (obj instanceof List) {
                    ((List) obj).add(serializable);
                } else {
                    ((Map) obj).put(str, serializable);
                }
                if (z3) {
                    arrayDeque.addLast(obj);
                    obj = serializable;
                }
            } else {
                if (obj instanceof List) {
                    aVar.l();
                } else {
                    aVar.m();
                }
                if (arrayDeque.isEmpty()) {
                    return obj;
                }
                obj = arrayDeque.removeLast();
            }
        }
    }

    public final void b(C0567b bVar, Object obj) {
        if (obj == null) {
            bVar.p();
            return;
        }
        Class<?> cls = obj.getClass();
        d dVar = this.f5643a;
        dVar.getClass();
        p c3 = dVar.c(new C0551a(cls));
        if (c3 instanceof h) {
            bVar.j();
            bVar.m();
            return;
        }
        c3.b(bVar, obj);
    }

    public final Serializable c(C0566a aVar, int i2) {
        int c3 = C0928e.c(i2);
        if (c3 == 5) {
            return aVar.A();
        }
        if (c3 == 6) {
            o.f4530a.getClass();
            return Double.valueOf(aVar.t());
        } else if (c3 == 7) {
            return Boolean.valueOf(aVar.s());
        } else {
            if (c3 == 8) {
                aVar.y();
                return null;
            }
            throw new IllegalStateException("Unexpected token: ".concat(a.y(i2)));
        }
    }
}
