package g3;

import F3.e;
import com.bumptech.glide.d;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* renamed from: g3.b  reason: case insensitive filesystem */
public final class C0549b {

    /* renamed from: a  reason: collision with root package name */
    public final String f8013a;

    /* renamed from: b  reason: collision with root package name */
    public final Set f8014b;

    /* renamed from: c  reason: collision with root package name */
    public final Set f8015c;
    public final int d;

    /* renamed from: e  reason: collision with root package name */
    public final int f8016e;

    /* renamed from: f  reason: collision with root package name */
    public final d f8017f;
    public final Set g;

    public C0549b(String str, Set set, Set set2, int i2, int i5, d dVar, Set set3) {
        this.f8013a = str;
        this.f8014b = Collections.unmodifiableSet(set);
        this.f8015c = Collections.unmodifiableSet(set2);
        this.d = i2;
        this.f8016e = i5;
        this.f8017f = dVar;
        this.g = Collections.unmodifiableSet(set3);
    }

    public static C0548a a(p pVar) {
        return new C0548a(pVar, new p[0]);
    }

    public static C0548a b(Class cls) {
        return new C0548a(cls, new Class[0]);
    }

    public static C0549b c(Object obj, Class cls, Class... clsArr) {
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        hashSet.add(p.a(cls));
        for (Class cls2 : clsArr) {
            d.g(cls2, "Null interface");
            hashSet.add(p.a(cls2));
        }
        return new C0549b((String) null, new HashSet(hashSet), new HashSet(hashSet2), 0, 0, new e(obj, 11), hashSet3);
    }

    public final String toString() {
        return "Component<" + Arrays.toString(this.f8014b.toArray()) + ">{" + this.d + ", type=" + this.f8016e + ", deps=" + Arrays.toString(this.f8015c.toArray()) + "}";
    }
}
