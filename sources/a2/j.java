package A2;

import java.util.AbstractMap;
import java.util.Objects;
import w5.a;

public final class j extends d {

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ k f37c;

    public j(k kVar) {
        this.f37c = kVar;
    }

    public final Object get(int i2) {
        k kVar = this.f37c;
        a.b(i2, kVar.f39f);
        int i5 = i2 * 2;
        Object[] objArr = kVar.f38e;
        Object obj = objArr[i5];
        Objects.requireNonNull(obj);
        Object obj2 = objArr[i5 + 1];
        Objects.requireNonNull(obj2);
        return new AbstractMap.SimpleImmutableEntry(obj, obj2);
    }

    public final int size() {
        return this.f37c.f39f;
    }
}
