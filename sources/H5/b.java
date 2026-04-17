package H5;

import G5.B;
import o5.a;
import o5.g;

public final class b extends a implements g {
    private volatile Object _preHandler = this;

    public b() {
        super(B.f855a);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x002c, code lost:
        if (java.lang.reflect.Modifier.isStatic(r3.getModifiers()) != false) goto L_0x0030;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void j(o5.i r3, java.lang.Throwable r4) {
        /*
            r2 = this;
            int r3 = android.os.Build.VERSION.SDK_INT
            r0 = 26
            if (r0 > r3) goto L_0x004a
            r0 = 28
            if (r3 >= r0) goto L_0x004a
            java.lang.Object r3 = r2._preHandler
            r0 = 0
            if (r3 == r2) goto L_0x0012
            java.lang.reflect.Method r3 = (java.lang.reflect.Method) r3
            goto L_0x0032
        L_0x0012:
            java.lang.Class<java.lang.Thread> r3 = java.lang.Thread.class
            java.lang.String r1 = "getUncaughtExceptionPreHandler"
            java.lang.reflect.Method r3 = r3.getDeclaredMethod(r1, r0)     // Catch:{ all -> 0x002f }
            int r1 = r3.getModifiers()     // Catch:{ all -> 0x002f }
            boolean r1 = java.lang.reflect.Modifier.isPublic(r1)     // Catch:{ all -> 0x002f }
            if (r1 == 0) goto L_0x002f
            int r1 = r3.getModifiers()     // Catch:{ all -> 0x002f }
            boolean r1 = java.lang.reflect.Modifier.isStatic(r1)     // Catch:{ all -> 0x002f }
            if (r1 == 0) goto L_0x002f
            goto L_0x0030
        L_0x002f:
            r3 = r0
        L_0x0030:
            r2._preHandler = r3
        L_0x0032:
            if (r3 == 0) goto L_0x0039
            java.lang.Object r3 = r3.invoke(r0, r0)
            goto L_0x003a
        L_0x0039:
            r3 = r0
        L_0x003a:
            boolean r1 = r3 instanceof java.lang.Thread.UncaughtExceptionHandler
            if (r1 == 0) goto L_0x0041
            r0 = r3
            java.lang.Thread$UncaughtExceptionHandler r0 = (java.lang.Thread.UncaughtExceptionHandler) r0
        L_0x0041:
            if (r0 == 0) goto L_0x004a
            java.lang.Thread r3 = java.lang.Thread.currentThread()
            r0.uncaughtException(r3, r4)
        L_0x004a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: H5.b.j(o5.i, java.lang.Throwable):void");
    }
}
