package g3;

import com.bumptech.glide.d;
import java.util.Collections;
import java.util.HashSet;

/* renamed from: g3.a  reason: case insensitive filesystem */
public final class C0548a {

    /* renamed from: a  reason: collision with root package name */
    public String f8008a = null;

    /* renamed from: b  reason: collision with root package name */
    public final HashSet f8009b;

    /* renamed from: c  reason: collision with root package name */
    public final HashSet f8010c;
    public int d;

    /* renamed from: e  reason: collision with root package name */
    public int f8011e;

    /* renamed from: f  reason: collision with root package name */
    public d f8012f;
    public final HashSet g;

    public C0548a(Class cls, Class[] clsArr) {
        HashSet hashSet = new HashSet();
        this.f8009b = hashSet;
        this.f8010c = new HashSet();
        this.d = 0;
        this.f8011e = 0;
        this.g = new HashSet();
        hashSet.add(p.a(cls));
        for (Class cls2 : clsArr) {
            d.g(cls2, "Null interface");
            this.f8009b.add(p.a(cls2));
        }
    }

    public final void a(h hVar) {
        if (!this.f8009b.contains(hVar.f8028a)) {
            this.f8010c.add(hVar);
            return;
        }
        throw new IllegalArgumentException("Components are not allowed to depend on interfaces they themselves provide.");
    }

    public final C0549b b() {
        boolean z3;
        if (this.f8012f != null) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (z3) {
            return new C0549b(this.f8008a, new HashSet(this.f8009b), new HashSet(this.f8010c), this.d, this.f8011e, this.f8012f, this.g);
        }
        throw new IllegalStateException("Missing required property: factory.");
    }

    public final void c(int i2) {
        boolean z3;
        if (this.d == 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (z3) {
            this.d = i2;
            return;
        }
        throw new IllegalStateException("Instantiation type has already been set.");
    }

    public C0548a(p pVar, p[] pVarArr) {
        HashSet hashSet = new HashSet();
        this.f8009b = hashSet;
        this.f8010c = new HashSet();
        this.d = 0;
        this.f8011e = 0;
        this.g = new HashSet();
        hashSet.add(pVar);
        for (p g5 : pVarArr) {
            d.g(g5, "Null interface");
        }
        Collections.addAll(this.f8009b, pVarArr);
    }
}
