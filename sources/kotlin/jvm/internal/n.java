package kotlin.jvm.internal;

public abstract class n {

    /* renamed from: a  reason: collision with root package name */
    public static final o f9657a;

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v0, resolved type: kotlin.jvm.internal.o} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v1, resolved type: kotlin.jvm.internal.o} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v2, resolved type: kotlin.jvm.internal.o} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v3, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v4, resolved type: kotlin.jvm.internal.o} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v5, resolved type: kotlin.jvm.internal.o} */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* JADX WARNING: Multi-variable type inference failed */
    static {
        /*
            r0 = 0
            java.lang.String r1 = "kotlin.reflect.jvm.internal.ReflectionFactoryImpl"
            java.lang.Class r1 = java.lang.Class.forName(r1)     // Catch:{ ClassCastException | ClassNotFoundException | IllegalAccessException | InstantiationException -> 0x000e }
            java.lang.Object r1 = r1.newInstance()     // Catch:{ ClassCastException | ClassNotFoundException | IllegalAccessException | InstantiationException -> 0x000e }
            kotlin.jvm.internal.o r1 = (kotlin.jvm.internal.o) r1     // Catch:{ ClassCastException | ClassNotFoundException | IllegalAccessException | InstantiationException -> 0x000e }
            r0 = r1
        L_0x000e:
            if (r0 == 0) goto L_0x0011
            goto L_0x0016
        L_0x0011:
            kotlin.jvm.internal.o r0 = new kotlin.jvm.internal.o
            r0.<init>()
        L_0x0016:
            f9657a = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.n.<clinit>():void");
    }
}
