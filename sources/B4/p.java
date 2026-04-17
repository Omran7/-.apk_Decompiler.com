package b4;

import java.lang.reflect.AccessibleObject;

public abstract class p {

    /* renamed from: a  reason: collision with root package name */
    public static final p f5553a;

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: b4.n} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: b4.n} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v3, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v4, resolved type: b4.n} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v7, resolved type: b4.n} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v8, resolved type: b4.n} */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x001d  */
    static {
        /*
            int r0 = b4.C0324g.f5528a
            r1 = 9
            if (r0 < r1) goto L_0x001a
            java.lang.Class<java.lang.reflect.AccessibleObject> r0 = java.lang.reflect.AccessibleObject.class
            java.lang.String r1 = "canAccess"
            java.lang.Class<java.lang.Object> r2 = java.lang.Object.class
            java.lang.Class[] r2 = new java.lang.Class[]{r2}     // Catch:{ NoSuchMethodException -> 0x001a }
            java.lang.reflect.Method r0 = r0.getDeclaredMethod(r1, r2)     // Catch:{ NoSuchMethodException -> 0x001a }
            b4.n r1 = new b4.n     // Catch:{ NoSuchMethodException -> 0x001a }
            r1.<init>(r0)     // Catch:{ NoSuchMethodException -> 0x001a }
            goto L_0x001b
        L_0x001a:
            r1 = 0
        L_0x001b:
            if (r1 != 0) goto L_0x0022
            b4.o r1 = new b4.o
            r1.<init>()
        L_0x0022:
            f5553a = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: b4.p.<clinit>():void");
    }

    public abstract boolean a(Object obj, AccessibleObject accessibleObject);
}
