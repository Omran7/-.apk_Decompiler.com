package c4;

import X4.d;
import Z3.q;
import b4.C0321d;
import b4.C0323f;
import b4.p;
import e4.C0503c;
import g4.C0551a;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
import java.lang.reflect.Member;
import java.lang.reflect.Modifier;
import java.util.Iterator;
import java.util.List;

public final class m implements q {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f5659a = 0;

    /* renamed from: b  reason: collision with root package name */
    public final Object f5660b;

    /* renamed from: c  reason: collision with root package name */
    public final Object f5661c;
    public final Object d;

    public m(d dVar, C0323f fVar, c cVar, List list) {
        this.f5660b = dVar;
        this.f5661c = fVar;
        this.d = list;
    }

    public static void b(Object obj, AccessibleObject accessibleObject) {
        if (Modifier.isStatic(((Member) accessibleObject).getModifiers())) {
            obj = null;
        }
        if (!p.f5553a.a(obj, accessibleObject)) {
            throw new RuntimeException(o3.d.f(C0503c.d(accessibleObject, true), " is not accessible and ReflectionAccessFilter does not permit making it accessible. Register a TypeAdapter for the declaring type, adjust the access filter or increase the visibility of the element and its declaring type."));
        }
    }

    public final Z3.p a(Z3.d dVar, C0551a aVar) {
        switch (this.f5659a) {
            case 0:
                Class cls = aVar.f8044a;
                if (!Object.class.isAssignableFrom(cls)) {
                    return null;
                }
                C0321d.e((List) this.d);
                if (C0503c.f7669a.a0(cls)) {
                    return new l(cls, c(dVar, aVar, cls, true));
                }
                return new k(((d) this.f5660b).y(aVar), c(dVar, aVar, cls, false));
            default:
                Class cls2 = (Class) this.f5660b;
                Class cls3 = aVar.f8044a;
                if (cls3 == cls2 || cls3 == ((Class) this.f5661c)) {
                    return (Z3.p) this.d;
                }
                return null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:78:0x020b, code lost:
        r36 = r12;
        r13 = new g4.C0551a(b4.C0321d.h(r1, r36, r36.getGenericSuperclass(), new java.util.HashMap()));
        r12 = r13.f8044a;
        r0 = r34;
        r14 = r35;
        r15 = r15;
     */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0096  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00ae  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00ba  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00e4  */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x01cf A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x01ba A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.LinkedHashMap c(Z3.d r35, g4.C0551a r36, java.lang.Class r37, boolean r38) {
        /*
            r34 = this;
            r0 = r34
            r14 = r35
            java.util.LinkedHashMap r15 = new java.util.LinkedHashMap
            r15.<init>()
            boolean r1 = r37.isInterface()
            if (r1 == 0) goto L_0x0010
            return r15
        L_0x0010:
            r13 = r36
            r12 = r37
        L_0x0014:
            java.lang.Class<java.lang.Object> r1 = java.lang.Object.class
            if (r12 == r1) goto L_0x022b
            java.lang.reflect.Field[] r11 = r12.getDeclaredFields()
            r10 = r37
            if (r12 == r10) goto L_0x002a
            int r1 = r11.length
            if (r1 <= 0) goto L_0x002a
            java.lang.Object r1 = r0.d
            java.util.List r1 = (java.util.List) r1
            b4.C0321d.e(r1)
        L_0x002a:
            int r9 = r11.length
            r8 = 0
            r7 = r8
        L_0x002d:
            java.lang.reflect.Type r1 = r13.f8045b
            if (r7 >= r9) goto L_0x020b
            r6 = r11[r7]
            r5 = 1
            boolean r2 = r0.d(r6, r5)
            boolean r3 = r0.d(r6, r8)
            if (r2 != 0) goto L_0x004f
            if (r3 != 0) goto L_0x004f
            r28 = r7
            r19 = r8
            r26 = r9
            r27 = r11
            r36 = r12
            r23 = r13
            r2 = r15
            goto L_0x01ba
        L_0x004f:
            java.lang.Class<a4.b> r4 = a4.C0263b.class
            r16 = 0
            if (r38 == 0) goto L_0x0091
            int r17 = r6.getModifiers()
            boolean r17 = java.lang.reflect.Modifier.isStatic(r17)
            if (r17 == 0) goto L_0x0064
            r17 = r8
        L_0x0061:
            r18 = r16
            goto L_0x0094
        L_0x0064:
            com.bumptech.glide.c r5 = e4.C0503c.f7669a
            java.lang.reflect.Method r5 = r5.t(r12, r6)
            e4.C0503c.e(r5)
            java.lang.annotation.Annotation r17 = r5.getAnnotation(r4)
            if (r17 == 0) goto L_0x008c
            java.lang.annotation.Annotation r17 = r6.getAnnotation(r4)
            if (r17 == 0) goto L_0x007a
            goto L_0x008c
        L_0x007a:
            java.lang.String r1 = e4.C0503c.d(r5, r8)
            Z3.g r2 = new Z3.g
            java.lang.String r3 = "@SerializedName on "
            java.lang.String r4 = " is not supported"
            java.lang.String r1 = h0.C0552a.o(r3, r1, r4)
            r2.<init>(r1)
            throw r2
        L_0x008c:
            r17 = r3
            r18 = r5
            goto L_0x0094
        L_0x0091:
            r17 = r3
            goto L_0x0061
        L_0x0094:
            if (r18 != 0) goto L_0x0099
            e4.C0503c.e(r6)
        L_0x0099:
            java.lang.reflect.Type r3 = r6.getGenericType()
            java.util.HashMap r5 = new java.util.HashMap
            r5.<init>()
            java.lang.reflect.Type r5 = b4.C0321d.h(r1, r12, r3, r5)
            java.lang.annotation.Annotation r1 = r6.getAnnotation(r4)
            a4.b r1 = (a4.C0263b) r1
            if (r1 != 0) goto L_0x00ba
            java.lang.String r1 = r6.getName()
            java.util.List r1 = java.util.Collections.singletonList(r1)
        L_0x00b6:
            r8 = r1
            r20 = 1
            goto L_0x00db
        L_0x00ba:
            java.lang.String r3 = r1.value()
            java.lang.String[] r1 = r1.alternate()
            int r4 = r1.length
            if (r4 != 0) goto L_0x00ca
            java.util.List r1 = java.util.Collections.singletonList(r3)
            goto L_0x00b6
        L_0x00ca:
            java.util.ArrayList r4 = new java.util.ArrayList
            int r8 = r1.length
            r20 = 1
            int r8 = r8 + 1
            r4.<init>(r8)
            r4.add(r3)
            java.util.Collections.addAll(r4, r1)
            r8 = r4
        L_0x00db:
            int r4 = r8.size()
            r1 = r16
            r3 = 0
        L_0x00e2:
            if (r3 >= r4) goto L_0x01a8
            java.lang.Object r21 = r8.get(r3)
            r22 = r15
            r15 = r21
            java.lang.String r15 = (java.lang.String) r15
            if (r3 == 0) goto L_0x00f3
            r21 = 0
            goto L_0x00f5
        L_0x00f3:
            r21 = r2
        L_0x00f5:
            g4.a r2 = new g4.a
            r2.<init>(r5)
            r36 = r1
            java.lang.Class r1 = r2.f8044a
            if (r1 == 0) goto L_0x0109
            boolean r1 = r1.isPrimitive()
            if (r1 == 0) goto L_0x0109
            r23 = r20
            goto L_0x010b
        L_0x0109:
            r23 = 0
        L_0x010b:
            int r1 = r6.getModifiers()
            boolean r24 = java.lang.reflect.Modifier.isStatic(r1)
            if (r24 == 0) goto L_0x011e
            boolean r1 = java.lang.reflect.Modifier.isFinal(r1)
            if (r1 == 0) goto L_0x011e
            r24 = r20
            goto L_0x0120
        L_0x011e:
            r24 = 0
        L_0x0120:
            java.lang.Class<a4.a> r1 = a4.C0262a.class
            java.lang.annotation.Annotation r1 = r6.getAnnotation(r1)
            a4.a r1 = (a4.C0262a) r1
            r25 = r3
            if (r1 == 0) goto L_0x0135
            java.lang.Object r3 = r0.f5660b
            X4.d r3 = (X4.d) r3
            Z3.p r1 = c4.c.b(r3, r14, r2, r1)
            goto L_0x0137
        L_0x0135:
            r1 = r16
        L_0x0137:
            if (r1 == 0) goto L_0x013c
            r26 = r20
            goto L_0x013e
        L_0x013c:
            r26 = 0
        L_0x013e:
            if (r1 != 0) goto L_0x0144
            Z3.p r1 = r14.c(r2)
        L_0x0144:
            r27 = r1
            c4.i r3 = new c4.i
            r28 = 0
            r0 = r36
            r1 = r3
            r29 = r2
            r2 = r15
            r14 = r3
            r3 = r6
            r30 = r4
            r4 = r21
            r31 = r5
            r5 = r17
            r32 = r6
            r6 = r28
            r28 = r7
            r7 = r18
            r33 = r8
            r19 = 0
            r8 = r26
            r26 = r9
            r9 = r27
            r10 = r35
            r27 = r11
            r11 = r29
            r36 = r12
            r12 = r23
            r23 = r13
            r13 = r24
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            r2 = r22
            java.lang.Object r1 = r2.put(r15, r14)
            c4.i r1 = (c4.i) r1
            if (r0 != 0) goto L_0x0188
            goto L_0x0189
        L_0x0188:
            r1 = r0
        L_0x0189:
            int r3 = r25 + 1
            r0 = r34
            r14 = r35
            r12 = r36
            r10 = r37
            r15 = r2
            r2 = r21
            r13 = r23
            r9 = r26
            r11 = r27
            r7 = r28
            r4 = r30
            r5 = r31
            r6 = r32
            r8 = r33
            goto L_0x00e2
        L_0x01a8:
            r0 = r1
            r32 = r6
            r28 = r7
            r26 = r9
            r27 = r11
            r36 = r12
            r23 = r13
            r2 = r15
            r19 = 0
            if (r0 != 0) goto L_0x01cf
        L_0x01ba:
            int r7 = r28 + 1
            r0 = r34
            r14 = r35
            r12 = r36
            r10 = r37
            r15 = r2
            r8 = r19
            r13 = r23
            r9 = r26
            r11 = r27
            goto L_0x002d
        L_0x01cf:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Class "
            r2.<init>(r3)
            java.lang.String r3 = r37.getName()
            r2.append(r3)
            java.lang.String r3 = " declares multiple JSON fields named '"
            r2.append(r3)
            java.lang.String r3 = r0.f5644a
            r2.append(r3)
            java.lang.String r3 = "'; conflict is caused by fields "
            r2.append(r3)
            java.lang.reflect.Field r0 = r0.f5645b
            java.lang.String r0 = e4.C0503c.c(r0)
            r2.append(r0)
            java.lang.String r0 = " and "
            r2.append(r0)
            java.lang.String r0 = e4.C0503c.c(r32)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r1.<init>(r0)
            throw r1
        L_0x020b:
            r36 = r12
            r2 = r15
            java.lang.reflect.Type r0 = r36.getGenericSuperclass()
            java.util.HashMap r3 = new java.util.HashMap
            r3.<init>()
            r4 = r36
            java.lang.reflect.Type r0 = b4.C0321d.h(r1, r4, r0, r3)
            g4.a r13 = new g4.a
            r13.<init>(r0)
            java.lang.Class r12 = r13.f8044a
            r0 = r34
            r14 = r35
            r15 = r2
            goto L_0x0014
        L_0x022b:
            r2 = r15
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: c4.m.c(Z3.d, g4.a, java.lang.Class, boolean):java.util.LinkedHashMap");
    }

    public boolean d(Field field, boolean z3) {
        List list;
        Class<?> type = field.getType();
        C0323f fVar = (C0323f) this.f5661c;
        fVar.getClass();
        if (!C0323f.c(type)) {
            fVar.b(z3);
            if ((field.getModifiers() & 136) == 0 && !field.isSynthetic() && !C0323f.c(field.getType())) {
                if (z3) {
                    list = fVar.f5526a;
                } else {
                    list = fVar.f5527b;
                }
                if (!list.isEmpty()) {
                    Iterator it2 = list.iterator();
                    if (it2.hasNext()) {
                        throw o3.d.e(it2);
                    }
                }
                return true;
            }
        }
        return false;
    }

    public String toString() {
        switch (this.f5659a) {
            case 1:
                return "Factory[type=" + ((Class) this.f5661c).getName() + "+" + ((Class) this.f5660b).getName() + ",adapter=" + ((Z3.p) this.d) + "]";
            default:
                return super.toString();
        }
    }

    public m(Class cls, Class cls2, Z3.p pVar) {
        this.f5660b = cls;
        this.f5661c = cls2;
        this.d = pVar;
    }
}
