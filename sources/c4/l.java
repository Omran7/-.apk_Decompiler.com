package c4;

import com.bumptech.glide.c;
import e4.C0503c;
import h0.C0552a;
import h4.C0566a;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;

public final class l extends j {

    /* renamed from: e  reason: collision with root package name */
    public static final HashMap f5656e;

    /* renamed from: b  reason: collision with root package name */
    public final Constructor f5657b;

    /* renamed from: c  reason: collision with root package name */
    public final Object[] f5658c;
    public final HashMap d = new HashMap();

    static {
        HashMap hashMap = new HashMap();
        hashMap.put(Byte.TYPE, (byte) 0);
        hashMap.put(Short.TYPE, (short) 0);
        hashMap.put(Integer.TYPE, 0);
        hashMap.put(Long.TYPE, 0L);
        hashMap.put(Float.TYPE, Float.valueOf(0.0f));
        hashMap.put(Double.TYPE, Double.valueOf(0.0d));
        hashMap.put(Character.TYPE, 0);
        hashMap.put(Boolean.TYPE, Boolean.FALSE);
        f5656e = hashMap;
    }

    public l(Class cls, LinkedHashMap linkedHashMap) {
        super(linkedHashMap);
        c cVar = C0503c.f7669a;
        Constructor u6 = cVar.u(cls);
        this.f5657b = u6;
        C0503c.e(u6);
        String[] O3 = cVar.O(cls);
        for (int i2 = 0; i2 < O3.length; i2++) {
            this.d.put(O3[i2], Integer.valueOf(i2));
        }
        Class[] parameterTypes = this.f5657b.getParameterTypes();
        this.f5658c = new Object[parameterTypes.length];
        for (int i5 = 0; i5 < parameterTypes.length; i5++) {
            this.f5658c[i5] = f5656e.get(parameterTypes[i5]);
        }
    }

    public final Object c() {
        return (Object[]) this.f5658c.clone();
    }

    public final Object d(Object obj) {
        Object[] objArr = (Object[]) obj;
        Constructor constructor = this.f5657b;
        try {
            return constructor.newInstance(objArr);
        } catch (IllegalAccessException e6) {
            c cVar = C0503c.f7669a;
            throw new RuntimeException("Unexpected IllegalAccessException occurred (Gson 2.10.1). Certain ReflectionAccessFilter features require Java >= 9 to work correctly. If you are not using ReflectionAccessFilter, report this to the Gson maintainers.", e6);
        } catch (IllegalArgumentException | InstantiationException e7) {
            throw new RuntimeException("Failed to invoke constructor '" + C0503c.b(constructor) + "' with args " + Arrays.toString(objArr), e7);
        } catch (InvocationTargetException e8) {
            throw new RuntimeException("Failed to invoke constructor '" + C0503c.b(constructor) + "' with args " + Arrays.toString(objArr), e8.getCause());
        }
    }

    public final void e(Object obj, C0566a aVar, i iVar) {
        Object[] objArr = (Object[]) obj;
        HashMap hashMap = this.d;
        String str = iVar.f5646c;
        Integer num = (Integer) hashMap.get(str);
        if (num != null) {
            int intValue = num.intValue();
            Object a6 = iVar.f5649i.a(aVar);
            if (a6 != null || !iVar.f5652l) {
                objArr[intValue] = a6;
                return;
            }
            StringBuilder t6 = C0552a.t("null is not allowed as value for record component '", str, "' of primitive type; at path ");
            t6.append(aVar.o(false));
            throw new RuntimeException(t6.toString());
        }
        throw new IllegalStateException("Could not find the index in the constructor '" + C0503c.b(this.f5657b) + "' for field with name '" + str + "', unable to determine which argument in the constructor the field corresponds to. This is unexpected behavior, as we expect the RecordComponents to have the same names as the fields in the Java class, and that the order of the RecordComponents is the same as the order of the canonical constructor parameters.");
    }
}
