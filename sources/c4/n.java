package c4;

import Z3.d;
import Z3.p;
import a4.C0263b;
import h4.C0566a;
import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.security.AccessController;
import java.util.HashMap;

public final class n extends p {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f5662a;

    /* renamed from: b  reason: collision with root package name */
    public final Object f5663b;

    /* renamed from: c  reason: collision with root package name */
    public final Object f5664c;
    public final Object d;

    public n(d dVar, p pVar, Type type) {
        this.f5662a = 0;
        this.f5663b = dVar;
        this.f5664c = pVar;
        this.d = type;
    }

    public final Object a(C0566a aVar) {
        switch (this.f5662a) {
            case 0:
                return ((p) this.f5664c).a(aVar);
            default:
                if (aVar.C() == 9) {
                    aVar.y();
                    return null;
                }
                String A6 = aVar.A();
                Enum enumR = (Enum) ((HashMap) this.f5663b).get(A6);
                if (enumR == null) {
                    return (Enum) ((HashMap) this.f5664c).get(A6);
                }
                return enumR;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0060, code lost:
        if ((r1 instanceof c4.j) != false) goto L_0x0063;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void b(h4.C0567b r5, java.lang.Object r6) {
        /*
            r4 = this;
            int r0 = r4.f5662a
            switch(r0) {
                case 0: goto L_0x0019;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Enum r6 = (java.lang.Enum) r6
            if (r6 != 0) goto L_0x000b
            r6 = 0
            goto L_0x0015
        L_0x000b:
            java.lang.Object r0 = r4.d
            java.util.HashMap r0 = (java.util.HashMap) r0
            java.lang.Object r6 = r0.get(r6)
            java.lang.String r6 = (java.lang.String) r6
        L_0x0015:
            r5.v(r6)
            return
        L_0x0019:
            java.lang.Object r0 = r4.d
            java.lang.reflect.Type r0 = (java.lang.reflect.Type) r0
            if (r6 == 0) goto L_0x002c
            boolean r1 = r0 instanceof java.lang.Class
            if (r1 != 0) goto L_0x0027
            boolean r1 = r0 instanceof java.lang.reflect.TypeVariable
            if (r1 == 0) goto L_0x002c
        L_0x0027:
            java.lang.Class r1 = r6.getClass()
            goto L_0x002d
        L_0x002c:
            r1 = r0
        L_0x002d:
            java.lang.Object r2 = r4.f5664c
            Z3.p r2 = (Z3.p) r2
            if (r1 == r0) goto L_0x0064
            g4.a r0 = new g4.a
            r0.<init>(r1)
            java.lang.Object r1 = r4.f5663b
            Z3.d r1 = (Z3.d) r1
            Z3.p r0 = r1.c(r0)
            boolean r1 = r0 instanceof c4.j
            if (r1 != 0) goto L_0x0045
            goto L_0x0063
        L_0x0045:
            r1 = r2
        L_0x0046:
            boolean r3 = r1 instanceof Z3.c
            if (r3 == 0) goto L_0x005e
            r3 = r1
            Z3.c r3 = (Z3.c) r3
            Z3.p r3 = r3.f4519a
            if (r3 == 0) goto L_0x0056
            if (r3 != r1) goto L_0x0054
            goto L_0x005e
        L_0x0054:
            r1 = r3
            goto L_0x0046
        L_0x0056:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "Adapter for type with cyclic dependency has been used before dependency has been resolved"
            r5.<init>(r6)
            throw r5
        L_0x005e:
            boolean r1 = r1 instanceof c4.j
            if (r1 != 0) goto L_0x0063
            goto L_0x0064
        L_0x0063:
            r2 = r0
        L_0x0064:
            r2.b(r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: c4.n.b(h4.b, java.lang.Object):void");
    }

    public n(Class cls) {
        this.f5662a = 1;
        this.f5663b = new HashMap();
        this.f5664c = new HashMap();
        this.d = new HashMap();
        try {
            for (Field field : (Field[]) AccessController.doPrivileged(new p(cls))) {
                Enum enumR = (Enum) field.get((Object) null);
                String name = enumR.name();
                String str = enumR.toString();
                C0263b bVar = (C0263b) field.getAnnotation(C0263b.class);
                if (bVar != null) {
                    name = bVar.value();
                    for (String put : bVar.alternate()) {
                        ((HashMap) this.f5663b).put(put, enumR);
                    }
                }
                ((HashMap) this.f5663b).put(name, enumR);
                ((HashMap) this.f5664c).put(str, enumR);
                ((HashMap) this.d).put(enumR, name);
            }
        } catch (IllegalAccessException e6) {
            throw new AssertionError(e6);
        }
    }
}
