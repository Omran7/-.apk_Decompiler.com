package r3;

import com.google.firebase.database.GenericTypeIndicator;
import h0.C0552a;
import java.lang.reflect.Field;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import o3.d;
import q3.l;

public abstract class b {

    /* renamed from: a  reason: collision with root package name */
    public static final ConcurrentHashMap f11208a = new ConcurrentHashMap();

    public static Double a(Object obj) {
        if (obj instanceof Integer) {
            return Double.valueOf(((Integer) obj).doubleValue());
        }
        if (obj instanceof Long) {
            Long l6 = (Long) obj;
            Double valueOf = Double.valueOf(l6.doubleValue());
            if (valueOf.longValue() == l6.longValue()) {
                return valueOf;
            }
            throw new RuntimeException("Loss of precision while converting number to double: " + obj + ". Did you mean to use a 64-bit long instead?");
        } else if (obj instanceof Double) {
            return (Double) obj;
        } else {
            throw new RuntimeException("Failed to convert a value of type " + obj.getClass().getName() + " to double");
        }
    }

    public static Object b(Object obj, GenericTypeIndicator genericTypeIndicator) {
        Type genericSuperclass = genericTypeIndicator.getClass().getGenericSuperclass();
        if (genericSuperclass instanceof ParameterizedType) {
            ParameterizedType parameterizedType = (ParameterizedType) genericSuperclass;
            if (parameterizedType.getRawType().equals(GenericTypeIndicator.class)) {
                return d(obj, parameterizedType.getActualTypeArguments()[0]);
            }
            throw new RuntimeException("Not a direct subclass of GenericTypeIndicator: " + genericSuperclass);
        }
        throw new RuntimeException("Not a direct subclass of GenericTypeIndicator: " + genericSuperclass);
    }

    public static Object c(Class cls, Object obj) {
        Object obj2;
        if (obj == null) {
            return null;
        }
        Class<Boolean> cls2 = Boolean.class;
        if (cls.isPrimitive() || Number.class.isAssignableFrom(cls) || cls2.isAssignableFrom(cls) || Character.class.isAssignableFrom(cls)) {
            if (Integer.class.isAssignableFrom(cls) || Integer.TYPE.isAssignableFrom(cls)) {
                if (obj instanceof Integer) {
                    obj2 = (Integer) obj;
                } else if ((obj instanceof Long) || (obj instanceof Double)) {
                    Number number = (Number) obj;
                    double doubleValue = number.doubleValue();
                    if (doubleValue >= -2.147483648E9d && doubleValue <= 2.147483647E9d) {
                        return Integer.valueOf(number.intValue());
                    }
                    throw new RuntimeException("Numeric value out of 32-bit integer range: " + doubleValue + ". Did you mean to use a long or double instead of an int?");
                } else {
                    throw new RuntimeException("Failed to convert a value of type " + obj.getClass().getName() + " to int");
                }
            } else if (cls2.isAssignableFrom(cls) || Boolean.TYPE.isAssignableFrom(cls)) {
                if (obj instanceof Boolean) {
                    return (Boolean) obj;
                }
                throw new RuntimeException("Failed to convert value of type " + obj.getClass().getName() + " to boolean");
            } else if (Double.class.isAssignableFrom(cls) || Double.TYPE.isAssignableFrom(cls)) {
                return a(obj);
            } else {
                if (Long.class.isAssignableFrom(cls) || Long.TYPE.isAssignableFrom(cls)) {
                    if (obj instanceof Integer) {
                        return Long.valueOf(((Integer) obj).longValue());
                    }
                    if (obj instanceof Long) {
                        obj2 = (Long) obj;
                    } else if (obj instanceof Double) {
                        Double d = (Double) obj;
                        if (d.doubleValue() >= -9.223372036854776E18d && d.doubleValue() <= 9.223372036854776E18d) {
                            return Long.valueOf(d.longValue());
                        }
                        throw new RuntimeException("Numeric value out of 64-bit long range: " + d + ". Did you mean to use a double instead of a long?");
                    } else {
                        throw new RuntimeException("Failed to convert a value of type " + obj.getClass().getName() + " to long");
                    }
                } else if (Float.class.isAssignableFrom(cls) || Float.TYPE.isAssignableFrom(cls)) {
                    return Float.valueOf(a(obj).floatValue());
                } else {
                    throw new RuntimeException(C0552a.o("Deserializing values to ", cls.getSimpleName(), " is not supported"));
                }
            }
            return obj2;
        } else if (String.class.isAssignableFrom(cls)) {
            if (obj instanceof String) {
                return (String) obj;
            }
            throw new RuntimeException("Failed to convert value of type " + obj.getClass().getName() + " to String");
        } else if (cls.isArray()) {
            throw new RuntimeException("Converting to Arrays is not supported, please use Listsinstead");
        } else if (cls.getTypeParameters().length > 0) {
            throw new RuntimeException("Class " + cls.getName() + " has generic type parameters, please use GenericTypeIndicator instead");
        } else if (cls.equals(Object.class)) {
            return obj;
        } else {
            if (!cls.isEnum()) {
                C0950a f6 = f(cls);
                if (obj instanceof Map) {
                    return f6.c(e(obj), Collections.emptyMap());
                }
                throw new RuntimeException("Can't convert object of type " + obj.getClass().getName() + " to type " + cls.getName());
            } else if (obj instanceof String) {
                String str = (String) obj;
                try {
                    return Enum.valueOf(cls, str);
                } catch (IllegalArgumentException unused) {
                    throw new RuntimeException("Could not find enum value of " + cls.getName() + " for value \"" + str + "\"");
                }
            } else {
                throw new RuntimeException("Expected a String while deserializing to enum " + cls + " but got a " + obj.getClass());
            }
        }
    }

    public static Object d(Object obj, Type type) {
        if (obj == null) {
            return null;
        }
        boolean z3 = true;
        if (type instanceof ParameterizedType) {
            ParameterizedType parameterizedType = (ParameterizedType) type;
            Class cls = (Class) parameterizedType.getRawType();
            if (List.class.isAssignableFrom(cls)) {
                Type type2 = parameterizedType.getActualTypeArguments()[0];
                if (obj instanceof List) {
                    List<Object> list = (List) obj;
                    ArrayList arrayList = new ArrayList(list.size());
                    for (Object d : list) {
                        arrayList.add(d(d, type2));
                    }
                    return arrayList;
                }
                throw new RuntimeException("Expected a List while deserializing, but got a " + obj.getClass());
            } else if (Map.class.isAssignableFrom(cls)) {
                Type type3 = parameterizedType.getActualTypeArguments()[0];
                Type type4 = parameterizedType.getActualTypeArguments()[1];
                if (type3.equals(String.class)) {
                    Map e6 = e(obj);
                    HashMap hashMap = new HashMap();
                    for (Map.Entry entry : e6.entrySet()) {
                        hashMap.put((String) entry.getKey(), d(entry.getValue(), type4));
                    }
                    return hashMap;
                }
                throw new RuntimeException("Only Maps with string keys are supported, but found Map with key type " + type3);
            } else if (!Collection.class.isAssignableFrom(cls)) {
                Map e7 = e(obj);
                C0950a f6 = f(cls);
                HashMap hashMap2 = new HashMap();
                TypeVariable[] typeParameters = f6.f11203a.getTypeParameters();
                Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
                if (actualTypeArguments.length == typeParameters.length) {
                    for (int i2 = 0; i2 < typeParameters.length; i2++) {
                        hashMap2.put(typeParameters[i2], actualTypeArguments[i2]);
                    }
                    return f6.c(e7, hashMap2);
                }
                throw new IllegalStateException("Mismatched lengths for type variables and actual types");
            } else {
                throw new RuntimeException("Collections are not supported, please use Lists instead");
            }
        } else if (type instanceof Class) {
            return c((Class) type, obj);
        } else {
            if (type instanceof WildcardType) {
                WildcardType wildcardType = (WildcardType) type;
                if (wildcardType.getLowerBounds().length <= 0) {
                    Type[] upperBounds = wildcardType.getUpperBounds();
                    if (upperBounds.length <= 0) {
                        z3 = false;
                    }
                    l.b("Wildcard type " + type + " is not upper bounded.", z3);
                    return d(obj, upperBounds[0]);
                }
                throw new RuntimeException("Generic lower-bounded wildcard types are not supported");
            } else if (type instanceof TypeVariable) {
                Type[] bounds = ((TypeVariable) type).getBounds();
                if (bounds.length <= 0) {
                    z3 = false;
                }
                l.b("Wildcard type " + type + " is not upper bounded.", z3);
                return d(obj, bounds[0]);
            } else if (type instanceof GenericArrayType) {
                throw new RuntimeException("Generic Arrays are not supported, please use Lists instead");
            } else {
                throw new IllegalStateException("Unknown type encountered: " + type);
            }
        }
    }

    public static Map e(Object obj) {
        if (obj instanceof Map) {
            return (Map) obj;
        }
        throw new RuntimeException("Expected a Map while deserializing, but got a " + obj.getClass());
    }

    public static C0950a f(Class cls) {
        ConcurrentHashMap concurrentHashMap = f11208a;
        C0950a aVar = (C0950a) concurrentHashMap.get(cls);
        if (aVar != null) {
            return aVar;
        }
        C0950a aVar2 = new C0950a(cls);
        concurrentHashMap.put(cls, aVar2);
        return aVar2;
    }

    public static Object g(Object obj) {
        Object obj2;
        if (obj == null) {
            return null;
        }
        if (obj instanceof Number) {
            if ((obj instanceof Float) || (obj instanceof Double)) {
                Number number = (Number) obj;
                double doubleValue = number.doubleValue();
                if (doubleValue > 9.223372036854776E18d || doubleValue < -9.223372036854776E18d || Math.floor(doubleValue) != doubleValue) {
                    return Double.valueOf(doubleValue);
                }
                return Long.valueOf(number.longValue());
            } else if ((obj instanceof Long) || (obj instanceof Integer)) {
                return obj;
            } else {
                throw new RuntimeException(C0552a.o("Numbers of type ", obj.getClass().getSimpleName(), " are not supported, please use an int, long, float or double"));
            }
        } else if ((obj instanceof String) || (obj instanceof Boolean)) {
            return obj;
        } else {
            if (obj instanceof Character) {
                throw new RuntimeException("Characters are not supported, please use Strings");
            } else if (obj instanceof Map) {
                HashMap hashMap = new HashMap();
                for (Map.Entry entry : ((Map) obj).entrySet()) {
                    Object key = entry.getKey();
                    if (key instanceof String) {
                        hashMap.put((String) key, g(entry.getValue()));
                    } else {
                        throw new RuntimeException("Maps with non-string keys are not supported");
                    }
                }
                return hashMap;
            } else if (obj instanceof Collection) {
                if (obj instanceof List) {
                    List<Object> list = (List) obj;
                    ArrayList arrayList = new ArrayList(list.size());
                    for (Object g : list) {
                        arrayList.add(g(g));
                    }
                    return arrayList;
                }
                throw new RuntimeException("Serializing Collections is not supported, please use Lists instead");
            } else if (obj.getClass().isArray()) {
                throw new RuntimeException("Serializing Arrays is not supported, please use Lists instead");
            } else if (obj instanceof Enum) {
                return ((Enum) obj).name();
            } else {
                C0950a f6 = f(obj.getClass());
                Class<?> cls = obj.getClass();
                Class cls2 = f6.f11203a;
                if (cls2.isAssignableFrom(cls)) {
                    HashMap hashMap2 = new HashMap();
                    for (String str : f6.f11206e.values()) {
                        HashMap hashMap3 = f6.f11207f;
                        if (hashMap3.containsKey(str)) {
                            try {
                                obj2 = ((Method) hashMap3.get(str)).invoke(obj, (Object[]) null);
                            } catch (IllegalAccessException e6) {
                                throw new RuntimeException(e6);
                            } catch (InvocationTargetException e7) {
                                throw new RuntimeException(e7);
                            }
                        } else {
                            Field field = (Field) f6.h.get(str);
                            if (field != null) {
                                try {
                                    obj2 = field.get(obj);
                                } catch (IllegalAccessException e8) {
                                    throw new RuntimeException(e8);
                                }
                            } else {
                                throw new IllegalStateException(d.i("Bean property without field or getter:", str));
                            }
                        }
                        hashMap2.put(str, g(obj2));
                    }
                    return hashMap2;
                }
                throw new IllegalArgumentException("Can't serialize object of class " + obj.getClass() + " with BeanMapper for class " + cls2);
            }
        }
    }
}
