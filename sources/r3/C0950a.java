package r3;

import android.util.Log;
import h0.C0552a;
import i3.l;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import o3.d;

/* renamed from: r3.a  reason: case insensitive filesystem */
public final class C0950a {

    /* renamed from: a  reason: collision with root package name */
    public final Class f11203a;

    /* renamed from: b  reason: collision with root package name */
    public final Constructor f11204b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f11205c;
    public final boolean d;

    /* renamed from: e  reason: collision with root package name */
    public final HashMap f11206e = new HashMap();

    /* renamed from: f  reason: collision with root package name */
    public final HashMap f11207f = new HashMap();
    public final HashMap g = new HashMap();
    public final HashMap h = new HashMap();

    /* JADX WARNING: Removed duplicated region for block: B:52:0x0138  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x0229  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C0950a(java.lang.Class r14) {
        /*
            r13 = this;
            r13.<init>()
            r13.f11203a = r14
            java.lang.Class<i3.o> r0 = i3.o.class
            boolean r0 = r14.isAnnotationPresent(r0)
            r13.f11205c = r0
            java.lang.Class<i3.j> r0 = i3.C0594j.class
            boolean r0 = r14.isAnnotationPresent(r0)
            r1 = 1
            r0 = r0 ^ r1
            r13.d = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r13.f11206e = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r13.g = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r13.f11207f = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r13.h = r0
            r0 = 0
            java.lang.reflect.Constructor r2 = r14.getDeclaredConstructor(r0)     // Catch:{ NoSuchMethodException -> 0x003c }
            r2.setAccessible(r1)     // Catch:{ NoSuchMethodException -> 0x003c }
            r0 = r2
        L_0x003c:
            r13.f11204b = r0
            java.lang.reflect.Method[] r0 = r14.getMethods()
            int r2 = r0.length
            r3 = 0
            r4 = r3
        L_0x0045:
            java.lang.Class<i3.g> r5 = i3.C0591g.class
            java.lang.Class<java.lang.Object> r6 = java.lang.Object.class
            if (r4 >= r2) goto L_0x00dc
            r7 = r0[r4]
            java.lang.String r8 = r7.getName()
            java.lang.String r9 = "get"
            boolean r8 = r8.startsWith(r9)
            if (r8 != 0) goto L_0x0066
            java.lang.String r8 = r7.getName()
            java.lang.String r9 = "is"
            boolean r8 = r8.startsWith(r9)
            if (r8 != 0) goto L_0x0066
            goto L_0x00c1
        L_0x0066:
            java.lang.Class r8 = r7.getDeclaringClass()
            boolean r6 = r8.equals(r6)
            if (r6 == 0) goto L_0x0071
            goto L_0x00c1
        L_0x0071:
            int r6 = r7.getModifiers()
            boolean r6 = java.lang.reflect.Modifier.isPublic(r6)
            if (r6 != 0) goto L_0x007c
            goto L_0x00c1
        L_0x007c:
            int r6 = r7.getModifiers()
            boolean r6 = java.lang.reflect.Modifier.isStatic(r6)
            if (r6 == 0) goto L_0x0087
            goto L_0x00c1
        L_0x0087:
            java.lang.Class r6 = r7.getReturnType()
            java.lang.Class r8 = java.lang.Void.TYPE
            boolean r6 = r6.equals(r8)
            if (r6 == 0) goto L_0x0094
            goto L_0x00c1
        L_0x0094:
            java.lang.Class[] r6 = r7.getParameterTypes()
            int r6 = r6.length
            if (r6 == 0) goto L_0x009c
            goto L_0x00c1
        L_0x009c:
            boolean r6 = r7.isBridge()
            if (r6 == 0) goto L_0x00a3
            goto L_0x00c1
        L_0x00a3:
            boolean r5 = r7.isAnnotationPresent(r5)
            if (r5 == 0) goto L_0x00aa
            goto L_0x00c1
        L_0x00aa:
            java.lang.String r5 = e(r7)
            r13.a(r5)
            r7.setAccessible(r1)
            java.util.HashMap r6 = r13.f11207f
            boolean r6 = r6.containsKey(r5)
            if (r6 != 0) goto L_0x00c4
            java.util.HashMap r6 = r13.f11207f
            r6.put(r5, r7)
        L_0x00c1:
            int r4 = r4 + 1
            goto L_0x0045
        L_0x00c4:
            i3.e r14 = new i3.e
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Found conflicting getters for name: "
            r0.<init>(r1)
            java.lang.String r1 = r7.getName()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r14.<init>(r0)
            throw r14
        L_0x00dc:
            java.lang.reflect.Field[] r0 = r14.getFields()
            int r2 = r0.length
            r4 = r3
        L_0x00e2:
            if (r4 >= r2) goto L_0x012a
            r7 = r0[r4]
            java.lang.Class r8 = r7.getDeclaringClass()
            boolean r8 = r8.equals(r6)
            if (r8 == 0) goto L_0x00f1
            goto L_0x0127
        L_0x00f1:
            int r8 = r7.getModifiers()
            boolean r8 = java.lang.reflect.Modifier.isPublic(r8)
            if (r8 != 0) goto L_0x00fc
            goto L_0x0127
        L_0x00fc:
            int r8 = r7.getModifiers()
            boolean r8 = java.lang.reflect.Modifier.isStatic(r8)
            if (r8 == 0) goto L_0x0107
            goto L_0x0127
        L_0x0107:
            int r8 = r7.getModifiers()
            boolean r8 = java.lang.reflect.Modifier.isTransient(r8)
            if (r8 == 0) goto L_0x0112
            goto L_0x0127
        L_0x0112:
            boolean r8 = r7.isAnnotationPresent(r5)
            if (r8 == 0) goto L_0x0119
            goto L_0x0127
        L_0x0119:
            java.lang.String r8 = b(r7)
            if (r8 == 0) goto L_0x0120
            goto L_0x0124
        L_0x0120:
            java.lang.String r8 = r7.getName()
        L_0x0124:
            r13.a(r8)
        L_0x0127:
            int r4 = r4 + 1
            goto L_0x00e2
        L_0x012a:
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r2 = r14
        L_0x0130:
            java.lang.reflect.Method[] r4 = r2.getDeclaredMethods()
            int r7 = r4.length
            r8 = r3
        L_0x0136:
            if (r8 >= r7) goto L_0x0221
            r9 = r4[r8]
            java.lang.String r10 = r9.getName()
            java.lang.String r11 = "set"
            boolean r10 = r10.startsWith(r11)
            if (r10 != 0) goto L_0x0148
            goto L_0x021d
        L_0x0148:
            java.lang.Class r10 = r9.getDeclaringClass()
            boolean r10 = r10.equals(r6)
            if (r10 == 0) goto L_0x0154
            goto L_0x021d
        L_0x0154:
            int r10 = r9.getModifiers()
            boolean r10 = java.lang.reflect.Modifier.isStatic(r10)
            if (r10 == 0) goto L_0x0160
            goto L_0x021d
        L_0x0160:
            java.lang.Class r10 = r9.getReturnType()
            java.lang.Class r11 = java.lang.Void.TYPE
            boolean r10 = r10.equals(r11)
            if (r10 != 0) goto L_0x016e
            goto L_0x021d
        L_0x016e:
            java.lang.Class[] r10 = r9.getParameterTypes()
            int r10 = r10.length
            if (r10 == r1) goto L_0x0177
            goto L_0x021d
        L_0x0177:
            boolean r10 = r9.isAnnotationPresent(r5)
            if (r10 == 0) goto L_0x017f
            goto L_0x021d
        L_0x017f:
            java.lang.String r10 = e(r9)
            java.util.HashMap r11 = r13.f11206e
            java.util.Locale r12 = java.util.Locale.US
            java.lang.String r12 = r10.toLowerCase(r12)
            java.lang.Object r11 = r11.get(r12)
            java.lang.String r11 = (java.lang.String) r11
            if (r11 == 0) goto L_0x021d
            boolean r11 = r11.equals(r10)
            if (r11 == 0) goto L_0x0205
            boolean r11 = r9.isBridge()
            if (r11 == 0) goto L_0x01a4
            r0.put(r10, r9)
            goto L_0x021d
        L_0x01a4:
            java.util.HashMap r11 = r13.g
            java.lang.Object r11 = r11.get(r10)
            java.lang.reflect.Method r11 = (java.lang.reflect.Method) r11
            java.lang.Object r12 = r0.get(r10)
            java.lang.reflect.Method r12 = (java.lang.reflect.Method) r12
            if (r11 != 0) goto L_0x01bd
            r9.setAccessible(r1)
            java.util.HashMap r11 = r13.g
            r11.put(r10, r9)
            goto L_0x021d
        L_0x01bd:
            boolean r10 = d(r9, r11)
            if (r10 != 0) goto L_0x021d
            if (r12 == 0) goto L_0x01cc
            boolean r10 = d(r9, r12)
            if (r10 == 0) goto L_0x01cc
            goto L_0x021d
        L_0x01cc:
            i3.e r14 = new i3.e
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Found a conflicting setters with name: "
            r0.<init>(r1)
            java.lang.String r1 = r9.getName()
            r0.append(r1)
            java.lang.String r1 = " (conflicts with "
            r0.append(r1)
            java.lang.String r1 = r11.getName()
            r0.append(r1)
            java.lang.String r1 = " defined on "
            r0.append(r1)
            java.lang.Class r1 = r11.getDeclaringClass()
            java.lang.String r1 = r1.getName()
            r0.append(r1)
            java.lang.String r1 = ")"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r14.<init>(r0)
            throw r14
        L_0x0205:
            i3.e r14 = new i3.e
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Found setter with invalid case-sensitive name: "
            r0.<init>(r1)
            java.lang.String r1 = r9.getName()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r14.<init>(r0)
            throw r14
        L_0x021d:
            int r8 = r8 + 1
            goto L_0x0136
        L_0x0221:
            java.lang.reflect.Field[] r4 = r2.getDeclaredFields()
            int r7 = r4.length
            r8 = r3
        L_0x0227:
            if (r8 >= r7) goto L_0x0257
            r9 = r4[r8]
            java.lang.String r10 = b(r9)
            if (r10 == 0) goto L_0x0232
            goto L_0x0236
        L_0x0232:
            java.lang.String r10 = r9.getName()
        L_0x0236:
            java.util.HashMap r11 = r13.f11206e
            java.util.Locale r12 = java.util.Locale.US
            java.lang.String r12 = r10.toLowerCase(r12)
            boolean r11 = r11.containsKey(r12)
            if (r11 == 0) goto L_0x0254
            java.util.HashMap r11 = r13.h
            boolean r11 = r11.containsKey(r10)
            if (r11 != 0) goto L_0x0254
            r9.setAccessible(r1)
            java.util.HashMap r11 = r13.h
            r11.put(r10, r9)
        L_0x0254:
            int r8 = r8 + 1
            goto L_0x0227
        L_0x0257:
            java.lang.Class r2 = r2.getSuperclass()
            if (r2 == 0) goto L_0x0263
            boolean r4 = r2.equals(r6)
            if (r4 == 0) goto L_0x0130
        L_0x0263:
            java.util.HashMap r0 = r13.f11206e
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x026c
            return
        L_0x026c:
            i3.e r0 = new i3.e
            java.lang.String r14 = r14.getName()
            java.lang.String r1 = "No properties to serialize found on class "
            java.lang.String r14 = r1.concat(r14)
            r0.<init>(r14)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: r3.C0950a.<init>(java.lang.Class):void");
    }

    public static String b(AccessibleObject accessibleObject) {
        Class cls = l.class;
        if (accessibleObject.isAnnotationPresent(cls)) {
            return ((l) accessibleObject.getAnnotation(cls)).value();
        }
        return null;
    }

    public static boolean d(Method method, Method method2) {
        boolean z3;
        boolean z4;
        q3.l.b("Expected override from a base class", method.getDeclaringClass().isAssignableFrom(method2.getDeclaringClass()));
        Class<?> returnType = method.getReturnType();
        Class cls = Void.TYPE;
        q3.l.b("Expected void return type", returnType.equals(cls));
        q3.l.b("Expected void return type", method2.getReturnType().equals(cls));
        Class[] parameterTypes = method.getParameterTypes();
        Class[] parameterTypes2 = method2.getParameterTypes();
        if (parameterTypes.length == 1) {
            z3 = true;
        } else {
            z3 = false;
        }
        q3.l.b("Expected exactly one parameter", z3);
        if (parameterTypes2.length == 1) {
            z4 = true;
        } else {
            z4 = false;
        }
        q3.l.b("Expected exactly one parameter", z4);
        if (!method.getName().equals(method2.getName()) || !parameterTypes[0].equals(parameterTypes2[0])) {
            return false;
        }
        return true;
    }

    public static String e(Method method) {
        String b6 = b(method);
        if (b6 != null) {
            return b6;
        }
        String name = method.getName();
        String[] strArr = {"get", "set", "is"};
        String str = null;
        int i2 = 0;
        for (int i5 = 0; i5 < 3; i5++) {
            String str2 = strArr[i5];
            if (name.startsWith(str2)) {
                str = str2;
            }
        }
        if (str != null) {
            char[] charArray = name.substring(str.length()).toCharArray();
            while (i2 < charArray.length && Character.isUpperCase(charArray[i2])) {
                charArray[i2] = Character.toLowerCase(charArray[i2]);
                i2++;
            }
            return new String(charArray);
        }
        throw new IllegalArgumentException(d.i("Unknown Bean prefix for method: ", name));
    }

    public static Type f(Type type, Map map) {
        if (!(type instanceof TypeVariable)) {
            return type;
        }
        Type type2 = (Type) map.get(type);
        if (type2 != null) {
            return type2;
        }
        throw new IllegalStateException("Could not resolve type " + type);
    }

    public final void a(String str) {
        Locale locale = Locale.US;
        String str2 = (String) this.f11206e.put(str.toLowerCase(locale), str);
        if (str2 != null && !str.equals(str2)) {
            throw new RuntimeException("Found two getters or fields with conflicting case sensitivity for property: " + str.toLowerCase(locale));
        }
    }

    public final Object c(Map map, Map map2) {
        Class cls = this.f11203a;
        Constructor constructor = this.f11204b;
        if (constructor != null) {
            try {
                Object newInstance = constructor.newInstance((Object[]) null);
                for (Map.Entry entry : map.entrySet()) {
                    String str = (String) entry.getKey();
                    HashMap hashMap = this.g;
                    if (hashMap.containsKey(str)) {
                        Method method = (Method) hashMap.get(str);
                        Type[] genericParameterTypes = method.getGenericParameterTypes();
                        if (genericParameterTypes.length == 1) {
                            try {
                                method.invoke(newInstance, new Object[]{b.d(entry.getValue(), f(genericParameterTypes[0], map2))});
                            } catch (IllegalAccessException e6) {
                                throw new RuntimeException(e6);
                            } catch (InvocationTargetException e7) {
                                throw new RuntimeException(e7);
                            }
                        } else {
                            throw new IllegalStateException("Setter does not have exactly one parameter");
                        }
                    } else {
                        HashMap hashMap2 = this.h;
                        if (hashMap2.containsKey(str)) {
                            Field field = (Field) hashMap2.get(str);
                            try {
                                field.set(newInstance, b.d(entry.getValue(), f(field.getGenericType(), map2)));
                            } catch (IllegalAccessException e8) {
                                throw new RuntimeException(e8);
                            }
                        } else {
                            StringBuilder t6 = C0552a.t("No setter/field for ", str, " found on class ");
                            t6.append(cls.getName());
                            String sb = t6.toString();
                            if (this.f11206e.containsKey(str.toLowerCase(Locale.US))) {
                                sb = d.f(sb, " (fields/setters are case sensitive!)");
                            }
                            if (this.f11205c) {
                                throw new RuntimeException(sb);
                            } else if (this.d) {
                                Log.w("ClassMapper", sb);
                            }
                        }
                    }
                }
                return newInstance;
            } catch (InstantiationException e9) {
                throw new RuntimeException(e9);
            } catch (IllegalAccessException e10) {
                throw new RuntimeException(e10);
            } catch (InvocationTargetException e11) {
                throw new RuntimeException(e11);
            }
        } else {
            throw new RuntimeException("Class " + cls.getName() + " does not define a no-argument constructor. If you are using ProGuard, make sure these constructors are not stripped.");
        }
    }
}
