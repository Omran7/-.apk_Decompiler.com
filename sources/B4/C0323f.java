package b4;

import Z3.d;
import Z3.p;
import Z3.q;
import g4.C0551a;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* renamed from: b4.f  reason: case insensitive filesystem */
public final class C0323f implements q, Cloneable {

    /* renamed from: c  reason: collision with root package name */
    public static final C0323f f5525c;

    /* renamed from: a  reason: collision with root package name */
    public List f5526a;

    /* renamed from: b  reason: collision with root package name */
    public List f5527b;

    /* JADX WARNING: type inference failed for: r0v0, types: [b4.f, java.lang.Object] */
    static {
        ? obj = new Object();
        obj.f5526a = Collections.emptyList();
        obj.f5527b = Collections.emptyList();
        f5525c = obj;
    }

    public static boolean c(Class cls) {
        if (Enum.class.isAssignableFrom(cls) || (cls.getModifiers() & 8) != 0 || (!cls.isAnonymousClass() && !cls.isLocalClass())) {
            return false;
        }
        return true;
    }

    public final p a(d dVar, C0551a aVar) {
        boolean z3;
        boolean z4;
        boolean c3 = c(aVar.f8044a);
        if (!c3) {
            b(true);
            z3 = false;
        } else {
            z3 = true;
        }
        if (!c3) {
            b(false);
            z4 = false;
        } else {
            z4 = true;
        }
        if (z3 || z4) {
            return new C0322e(this, z4, z3, dVar, aVar);
        }
        return null;
    }

    public final void b(boolean z3) {
        List list;
        if (z3) {
            list = this.f5526a;
        } else {
            list = this.f5527b;
        }
        Iterator it2 = list.iterator();
        if (it2.hasNext()) {
            throw o3.d.e(it2);
        }
    }

    public final Object clone() {
        try {
            return (C0323f) super.clone();
        } catch (CloneNotSupportedException e6) {
            throw new AssertionError(e6);
        }
    }
}
