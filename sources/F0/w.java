package F0;

import B0.C0009h;
import B0.y;
import U0.g;
import com.bumptech.glide.f;
import com.bumptech.glide.load.data.d;
import com.bumptech.glide.load.data.e;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class w implements e, d {

    /* renamed from: a  reason: collision with root package name */
    public final ArrayList f710a;

    /* renamed from: b  reason: collision with root package name */
    public final C0009h f711b;

    /* renamed from: c  reason: collision with root package name */
    public int f712c;
    public f d;

    /* renamed from: e  reason: collision with root package name */
    public d f713e;

    /* renamed from: f  reason: collision with root package name */
    public List f714f;

    /* renamed from: p  reason: collision with root package name */
    public boolean f715p;

    public w(ArrayList arrayList, C0009h hVar) {
        this.f711b = hVar;
        if (!arrayList.isEmpty()) {
            this.f710a = arrayList;
            this.f712c = 0;
            return;
        }
        throw new IllegalArgumentException("Must not be empty.");
    }

    public final void a(Exception exc) {
        List list = this.f714f;
        g.c(list, "Argument must not be null");
        list.add(exc);
        g();
    }

    public final Class b() {
        return ((e) this.f710a.get(0)).b();
    }

    public final void c() {
        List list = this.f714f;
        if (list != null) {
            this.f711b.D(list);
        }
        this.f714f = null;
        Iterator it2 = this.f710a.iterator();
        while (it2.hasNext()) {
            ((e) it2.next()).c();
        }
    }

    public final void cancel() {
        this.f715p = true;
        Iterator it2 = this.f710a.iterator();
        while (it2.hasNext()) {
            ((e) it2.next()).cancel();
        }
    }

    public final void d(Object obj) {
        if (obj != null) {
            this.f713e.d(obj);
        } else {
            g();
        }
    }

    public final int e() {
        return ((e) this.f710a.get(0)).e();
    }

    public final void f(f fVar, d dVar) {
        this.d = fVar;
        this.f713e = dVar;
        this.f714f = (List) this.f711b.j();
        ((e) this.f710a.get(this.f712c)).f(fVar, this);
        if (this.f715p) {
            cancel();
        }
    }

    public final void g() {
        if (!this.f715p) {
            if (this.f712c < this.f710a.size() - 1) {
                this.f712c++;
                f(this.d, this.f713e);
                return;
            }
            g.b(this.f714f);
            this.f713e.a(new y("Fetch failed", new ArrayList(this.f714f)));
        }
    }
}
