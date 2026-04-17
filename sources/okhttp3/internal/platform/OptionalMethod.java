package okhttp3.internal.platform;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import javax.net.ssl.SSLSocket;

class OptionalMethod<T> {

    /* renamed from: a  reason: collision with root package name */
    public final Class f10927a;

    /* renamed from: b  reason: collision with root package name */
    public final String f10928b;

    /* renamed from: c  reason: collision with root package name */
    public final Class[] f10929c;

    public OptionalMethod(Class cls, String str, Class... clsArr) {
        this.f10927a = cls;
        this.f10928b = str;
        this.f10929c = clsArr;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x000f, code lost:
        if ((r4.getModifiers() & 1) == 0) goto L_0x0011;
     */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0023  */
    /* JADX WARNING: Removed duplicated region for block: B:17:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.reflect.Method a(java.lang.Class r4) {
        /*
            r3 = this;
            java.lang.String r0 = r3.f10928b
            java.lang.Class[] r1 = r3.f10929c
            r2 = 0
            java.lang.reflect.Method r4 = r4.getMethod(r0, r1)     // Catch:{ NoSuchMethodException -> 0x0011 }
            int r0 = r4.getModifiers()     // Catch:{ NoSuchMethodException -> 0x0012 }
            r0 = r0 & 1
            if (r0 != 0) goto L_0x0012
        L_0x0011:
            r4 = r2
        L_0x0012:
            if (r4 == 0) goto L_0x0023
            java.lang.Class r0 = r3.f10927a
            if (r0 == 0) goto L_0x0023
            java.lang.Class r1 = r4.getReturnType()
            boolean r0 = r0.isAssignableFrom(r1)
            if (r0 != 0) goto L_0x0023
            goto L_0x0024
        L_0x0023:
            r2 = r4
        L_0x0024:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.platform.OptionalMethod.a(java.lang.Class):java.lang.reflect.Method");
    }

    public final Object b(SSLSocket sSLSocket, Object... objArr) {
        Method a6 = a(sSLSocket.getClass());
        if (a6 != null) {
            try {
                return a6.invoke(sSLSocket, objArr);
            } catch (IllegalAccessException e6) {
                AssertionError assertionError = new AssertionError("Unexpectedly could not call: " + a6);
                assertionError.initCause(e6);
                throw assertionError;
            }
        } else {
            throw new AssertionError("Method " + this.f10928b + " not supported for object " + sSLSocket);
        }
    }

    public final void c(SSLSocket sSLSocket, Object... objArr) {
        try {
            Method a6 = a(sSLSocket.getClass());
            if (a6 != null) {
                try {
                    a6.invoke(sSLSocket, objArr);
                } catch (IllegalAccessException unused) {
                }
            }
        } catch (InvocationTargetException e6) {
            Throwable targetException = e6.getTargetException();
            if (targetException instanceof RuntimeException) {
                throw ((RuntimeException) targetException);
            }
            AssertionError assertionError = new AssertionError("Unexpected exception");
            assertionError.initCause(targetException);
            throw assertionError;
        }
    }
}
