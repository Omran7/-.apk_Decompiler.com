package C3;

import B3.a;
import java.util.Date;
import java.util.HashMap;

public final class d implements a {

    /* renamed from: e  reason: collision with root package name */
    public static final a f458e = new a(0);

    /* renamed from: f  reason: collision with root package name */
    public static final b f459f = new b(0);
    public static final b g = new b(1);
    public static final c h = new Object();

    /* renamed from: a  reason: collision with root package name */
    public final HashMap f460a;

    /* renamed from: b  reason: collision with root package name */
    public final HashMap f461b;

    /* renamed from: c  reason: collision with root package name */
    public final a f462c = f458e;
    public boolean d = false;

    public d() {
        HashMap hashMap = new HashMap();
        this.f460a = hashMap;
        HashMap hashMap2 = new HashMap();
        this.f461b = hashMap2;
        Class<String> cls = String.class;
        hashMap2.put(cls, f459f);
        hashMap.remove(cls);
        Class<Boolean> cls2 = Boolean.class;
        hashMap2.put(cls2, g);
        hashMap.remove(cls2);
        Class<Date> cls3 = Date.class;
        hashMap2.put(cls3, h);
        hashMap.remove(cls3);
    }

    public final a a(Class cls, A3.d dVar) {
        this.f460a.put(cls, dVar);
        this.f461b.remove(cls);
        return this;
    }
}
