package c4;

import Z3.d;
import Z3.p;
import Z3.q;
import b4.C0321d;
import f4.C0542a;
import g4.C0551a;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import java.sql.Time;
import java.sql.Timestamp;
import java.util.Date;

/* renamed from: c4.a  reason: case insensitive filesystem */
public final class C0341a implements q {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f5627a;

    public /* synthetic */ C0341a(int i2) {
        this.f5627a = i2;
    }

    public final p a(d dVar, C0551a aVar) {
        Type type;
        switch (this.f5627a) {
            case 0:
                Type type2 = aVar.f8045b;
                boolean z3 = type2 instanceof GenericArrayType;
                if (!z3 && (!(type2 instanceof Class) || !((Class) type2).isArray())) {
                    return null;
                }
                if (z3) {
                    type = ((GenericArrayType) type2).getGenericComponentType();
                } else {
                    type = ((Class) type2).getComponentType();
                }
                return new b(dVar, dVar.c(new C0551a(type)), C0321d.g(type));
            case 1:
                if (aVar.f8044a == Date.class) {
                    return new d();
                }
                return null;
            case 2:
                if (aVar.f8044a == Object.class) {
                    return new h(dVar);
                }
                return null;
            case 3:
                Class<Enum> cls = Enum.class;
                Class<? super Object> cls2 = aVar.f8044a;
                if (!cls.isAssignableFrom(cls2) || cls2 == cls) {
                    return null;
                }
                if (!cls2.isEnum()) {
                    cls2 = cls2.getSuperclass();
                }
                return new n(cls2);
            case 4:
                if (aVar.f8044a == java.sql.Date.class) {
                    return new C0542a(0);
                }
                return null;
            case 5:
                if (aVar.f8044a == Time.class) {
                    return new C0542a(1);
                }
                return null;
            default:
                if (aVar.f8044a != Timestamp.class) {
                    return null;
                }
                dVar.getClass();
                return new C0542a(dVar.c(new C0551a(Date.class)));
        }
    }
}
