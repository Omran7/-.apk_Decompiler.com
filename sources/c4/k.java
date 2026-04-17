package c4;

import b4.m;
import e4.C0503c;
import h4.C0566a;
import java.lang.reflect.Field;
import java.util.LinkedHashMap;
import o3.d;

public final class k extends j {

    /* renamed from: b  reason: collision with root package name */
    public final m f5655b;

    public k(m mVar, LinkedHashMap linkedHashMap) {
        super(linkedHashMap);
        this.f5655b = mVar;
    }

    public final Object c() {
        return this.f5655b.n();
    }

    public final void e(Object obj, C0566a aVar, i iVar) {
        Object a6 = iVar.f5649i.a(aVar);
        if (a6 != null || !iVar.f5652l) {
            Field field = iVar.f5645b;
            if (iVar.f5648f) {
                m.b(obj, field);
            } else if (iVar.f5653m) {
                throw new RuntimeException(d.i("Cannot set value of 'static final' ", C0503c.d(field, false)));
            }
            field.set(obj, a6);
        }
    }

    public final Object d(Object obj) {
        return obj;
    }
}
