package n;

import b4.j;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

public class e extends j implements Map {
    public j d;

    /* renamed from: e  reason: collision with root package name */
    public b f10214e;

    /* renamed from: f  reason: collision with root package name */
    public d f10215f;

    public e() {
        super(0);
    }

    public final Set entrySet() {
        j jVar = this.d;
        if (jVar != null) {
            return jVar;
        }
        j jVar2 = new j(this, 2);
        this.d = jVar2;
        return jVar2;
    }

    public final boolean k(Collection collection) {
        for (Object containsKey : collection) {
            if (!super.containsKey(containsKey)) {
                return false;
            }
        }
        return true;
    }

    public final Set keySet() {
        b bVar = this.f10214e;
        if (bVar != null) {
            return bVar;
        }
        b bVar2 = new b(this);
        this.f10214e = bVar2;
        return bVar2;
    }

    public final boolean l(Collection collection) {
        int i2 = this.f10226c;
        for (Object remove : collection) {
            super.remove(remove);
        }
        if (i2 != this.f10226c) {
            return true;
        }
        return false;
    }

    public final void putAll(Map map) {
        b(map.size() + this.f10226c);
        for (Map.Entry entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    public final Collection values() {
        d dVar = this.f10215f;
        if (dVar != null) {
            return dVar;
        }
        d dVar2 = new d(this);
        this.f10215f = dVar2;
        return dVar2;
    }

    public e(e eVar) {
        super(0);
        g(eVar);
    }
}
