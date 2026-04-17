package I5;

import E5.c;
import E5.f;
import H5.a;
import H5.e;
import android.os.Looper;
import java.util.Arrays;
import java.util.Iterator;
import java.util.ServiceConfigurationError;
import kotlin.jvm.internal.j;

public abstract class o {

    /* renamed from: a  reason: collision with root package name */
    public static final e f1276a;

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: type inference failed for: r0v3, types: [H5.a, java.lang.Object] */
    static {
        String str;
        int i2 = v.f1281a;
        Object obj = null;
        try {
            str = System.getProperty("kotlinx.coroutines.fast.service.loader");
        } catch (SecurityException unused) {
            str = null;
        }
        if (str != null) {
            Boolean.parseBoolean(str);
        }
        try {
            Iterator it2 = Arrays.asList(new a[]{new Object()}).iterator();
            j.e(it2, "<this>");
            Iterator it3 = f.I0(new E5.a(new c(it2, 2))).iterator();
            if (it3.hasNext()) {
                obj = it3.next();
                if (it3.hasNext()) {
                    int a6 = ((a) obj).a();
                    do {
                        Object next = it3.next();
                        int a7 = ((a) next).a();
                        if (a6 < a7) {
                            obj = next;
                            a6 = a7;
                        }
                    } while (it3.hasNext());
                }
            }
            a aVar = (a) obj;
            if (aVar != null) {
                try {
                    aVar.getClass();
                    Looper mainLooper = Looper.getMainLooper();
                    if (mainLooper != null) {
                        f1276a = new e(H5.f.a(mainLooper));
                        return;
                    }
                    throw new IllegalStateException("The main looper is not available");
                } catch (Throwable th) {
                    aVar.getClass();
                    throw th;
                }
            } else {
                throw new IllegalStateException("Module with the Main dispatcher is missing. Add dependency providing the Main dispatcher, e.g. 'kotlinx-coroutines-android' and ensure it has the same version as 'kotlinx-coroutines-core'");
            }
        } catch (Throwable th2) {
            throw new ServiceConfigurationError(th2.getMessage(), th2);
        }
    }
}
