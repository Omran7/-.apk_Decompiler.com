package c4;

import X4.d;
import Z3.b;
import Z3.p;
import Z3.q;
import a4.C0262a;
import b4.C0321d;
import b4.m;
import g4.C0551a;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

public final class c implements q {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f5631a;

    /* renamed from: b  reason: collision with root package name */
    public final d f5632b;

    public /* synthetic */ c(d dVar, int i2) {
        this.f5631a = i2;
        this.f5632b = dVar;
    }

    public static p b(d dVar, Z3.d dVar2, C0551a aVar, C0262a aVar2) {
        p pVar;
        Object n2 = dVar.y(new C0551a(aVar2.value())).n();
        boolean nullSafe = aVar2.nullSafe();
        if (n2 instanceof p) {
            pVar = (p) n2;
        } else if (n2 instanceof q) {
            pVar = ((q) n2).a(dVar2, aVar);
        } else {
            throw new IllegalArgumentException("Invalid attempt to bind an instance of " + n2.getClass().getName() + " as a @JsonAdapter for " + C0321d.i(aVar.f8045b) + ". @JsonAdapter value must be a TypeAdapter, TypeAdapterFactory, JsonSerializer or JsonDeserializer.");
        }
        if (pVar == null || !nullSafe) {
            return pVar;
        }
        return new b(pVar, 2);
    }

    public final p a(Z3.d dVar, C0551a aVar) {
        Type[] typeArr;
        p pVar;
        Type type = Object.class;
        d dVar2 = this.f5632b;
        switch (this.f5631a) {
            case 0:
                Class<Collection> cls = Collection.class;
                Class cls2 = aVar.f8044a;
                if (!cls.isAssignableFrom(cls2)) {
                    return null;
                }
                Type type2 = aVar.f8045b;
                if (type2 instanceof WildcardType) {
                    type2 = ((WildcardType) type2).getUpperBounds()[0];
                }
                C0321d.b(cls.isAssignableFrom(cls2));
                Type h = C0321d.h(type2, cls2, C0321d.f(type2, cls2, cls), new HashMap());
                if (h instanceof ParameterizedType) {
                    type = ((ParameterizedType) h).getActualTypeArguments()[0];
                }
                return new b(dVar, type, dVar.c(new C0551a(type)), dVar2.y(aVar));
            case 1:
                C0262a aVar2 = (C0262a) aVar.f8044a.getAnnotation(C0262a.class);
                if (aVar2 == null) {
                    return null;
                }
                return b(dVar2, dVar, aVar, aVar2);
            default:
                Class<Map> cls3 = Map.class;
                Class cls4 = aVar.f8044a;
                if (!cls3.isAssignableFrom(cls4)) {
                    return null;
                }
                Class<Properties> cls5 = Properties.class;
                Type type3 = aVar.f8045b;
                if (type3 == cls5) {
                    Class<String> cls6 = String.class;
                    typeArr = new Type[]{cls6, cls6};
                } else {
                    if (type3 instanceof WildcardType) {
                        type3 = ((WildcardType) type3).getUpperBounds()[0];
                    }
                    C0321d.b(cls3.isAssignableFrom(cls4));
                    Type h6 = C0321d.h(type3, cls4, C0321d.f(type3, cls4, cls3), new HashMap());
                    if (h6 instanceof ParameterizedType) {
                        typeArr = ((ParameterizedType) h6).getActualTypeArguments();
                    } else {
                        typeArr = new Type[]{type, type};
                    }
                }
                Type type4 = typeArr[0];
                if (type4 == Boolean.TYPE || type4 == Boolean.class) {
                    pVar = q.f5672c;
                } else {
                    pVar = dVar.c(new C0551a(type4));
                }
                p pVar2 = pVar;
                p c3 = dVar.c(new C0551a(typeArr[1]));
                m y6 = dVar2.y(aVar);
                return new e(this, dVar, typeArr[0], pVar2, typeArr[1], c3, y6);
        }
    }
}
