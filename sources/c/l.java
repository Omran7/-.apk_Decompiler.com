package C;

import B.f;
import B.g;
import I1.b;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.util.Log;
import com.bumptech.glide.d;
import java.io.File;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class l extends d {

    /* renamed from: j  reason: collision with root package name */
    public static Class f382j = null;

    /* renamed from: k  reason: collision with root package name */
    public static Constructor f383k = null;

    /* renamed from: l  reason: collision with root package name */
    public static Method f384l = null;

    /* renamed from: m  reason: collision with root package name */
    public static Method f385m = null;

    /* renamed from: n  reason: collision with root package name */
    public static boolean f386n = false;

    public static boolean t1(Object obj, String str, int i2, boolean z3) {
        u1();
        try {
            return ((Boolean) f384l.invoke(obj, new Object[]{str, Integer.valueOf(i2), Boolean.valueOf(z3)})).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException e6) {
            throw new RuntimeException(e6);
        }
    }

    public static void u1() {
        Method method;
        Class<?> cls;
        Method method2;
        if (!f386n) {
            f386n = true;
            Constructor<?> constructor = null;
            try {
                cls = Class.forName("android.graphics.FontFamily");
                Constructor<?> constructor2 = cls.getConstructor((Class[]) null);
                method = cls.getMethod("addFontWeightStyle", new Class[]{String.class, Integer.TYPE, Boolean.TYPE});
                method2 = Typeface.class.getMethod("createFromFamiliesWithDefault", new Class[]{Array.newInstance(cls, 1).getClass()});
                constructor = constructor2;
            } catch (ClassNotFoundException | NoSuchMethodException e6) {
                Log.e("TypefaceCompatApi21Impl", e6.getClass().getName(), e6);
                method2 = null;
                cls = null;
                method = null;
            }
            f383k = constructor;
            f382j = cls;
            f384l = method;
            f385m = method2;
        }
    }

    public Typeface k(Context context, f fVar, Resources resources, int i2) {
        u1();
        try {
            Object newInstance = f383k.newInstance((Object[]) null);
            g[] gVarArr = fVar.f144a;
            int length = gVarArr.length;
            int i5 = 0;
            while (i5 < length) {
                g gVar = gVarArr[i5];
                File h02 = b.h0(context);
                if (h02 == null) {
                    return null;
                }
                try {
                    if (!b.p(h02, resources, gVar.f149f)) {
                        h02.delete();
                        return null;
                    } else if (!t1(newInstance, h02.getPath(), gVar.f146b, gVar.f147c)) {
                        return null;
                    } else {
                        h02.delete();
                        i5++;
                    }
                } catch (RuntimeException unused) {
                    return null;
                } finally {
                    h02.delete();
                }
            }
            u1();
            try {
                Object newInstance2 = Array.newInstance(f382j, 1);
                Array.set(newInstance2, 0, newInstance);
                return (Typeface) f385m.invoke((Object) null, new Object[]{newInstance2});
            } catch (IllegalAccessException | InvocationTargetException e6) {
                throw new RuntimeException(e6);
            }
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException e7) {
            throw new RuntimeException(e7);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0049 A[SYNTHETIC, Splitter:B:18:0x0049] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.graphics.Typeface l(android.content.Context r4, H.h[] r5, int r6) {
        /*
            r3 = this;
            int r0 = r5.length
            r1 = 1
            r2 = 0
            if (r0 >= r1) goto L_0x0006
            return r2
        L_0x0006:
            H.h r5 = r3.X(r5, r6)
            android.content.ContentResolver r6 = r4.getContentResolver()
            android.net.Uri r5 = r5.f979a     // Catch:{ IOException -> 0x0081 }
            java.lang.String r0 = "r"
            android.os.ParcelFileDescriptor r5 = r6.openFileDescriptor(r5, r0, r2)     // Catch:{ IOException -> 0x0081 }
            if (r5 != 0) goto L_0x001e
            if (r5 == 0) goto L_0x001d
            r5.close()     // Catch:{ IOException -> 0x0081 }
        L_0x001d:
            return r2
        L_0x001e:
            java.lang.String r6 = "/proc/self/fd/"
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ ErrnoException -> 0x0046 }
            r0.<init>(r6)     // Catch:{ ErrnoException -> 0x0046 }
            int r6 = r5.getFd()     // Catch:{ ErrnoException -> 0x0046 }
            r0.append(r6)     // Catch:{ ErrnoException -> 0x0046 }
            java.lang.String r6 = r0.toString()     // Catch:{ ErrnoException -> 0x0046 }
            java.lang.String r6 = android.system.Os.readlink(r6)     // Catch:{ ErrnoException -> 0x0046 }
            android.system.StructStat r0 = android.system.Os.stat(r6)     // Catch:{ ErrnoException -> 0x0046 }
            int r0 = r0.st_mode     // Catch:{ ErrnoException -> 0x0046 }
            boolean r0 = android.system.OsConstants.S_ISREG(r0)     // Catch:{ ErrnoException -> 0x0046 }
            if (r0 == 0) goto L_0x0046
            java.io.File r0 = new java.io.File     // Catch:{ ErrnoException -> 0x0046 }
            r0.<init>(r6)     // Catch:{ ErrnoException -> 0x0046 }
            goto L_0x0047
        L_0x0046:
            r0 = r2
        L_0x0047:
            if (r0 == 0) goto L_0x005a
            boolean r6 = r0.canRead()     // Catch:{ all -> 0x0058 }
            if (r6 != 0) goto L_0x0050
            goto L_0x005a
        L_0x0050:
            android.graphics.Typeface r4 = android.graphics.Typeface.createFromFile(r0)     // Catch:{ all -> 0x0058 }
            r5.close()     // Catch:{ IOException -> 0x0081 }
            return r4
        L_0x0058:
            r4 = move-exception
            goto L_0x0078
        L_0x005a:
            java.io.FileInputStream r6 = new java.io.FileInputStream     // Catch:{ all -> 0x0058 }
            java.io.FileDescriptor r0 = r5.getFileDescriptor()     // Catch:{ all -> 0x0058 }
            r6.<init>(r0)     // Catch:{ all -> 0x0058 }
            android.graphics.Typeface r4 = r3.m(r4, r6)     // Catch:{ all -> 0x006e }
            r6.close()     // Catch:{ all -> 0x0058 }
            r5.close()     // Catch:{ IOException -> 0x0081 }
            return r4
        L_0x006e:
            r4 = move-exception
            r6.close()     // Catch:{ all -> 0x0073 }
            goto L_0x0077
        L_0x0073:
            r6 = move-exception
            r4.addSuppressed(r6)     // Catch:{ all -> 0x0058 }
        L_0x0077:
            throw r4     // Catch:{ all -> 0x0058 }
        L_0x0078:
            r5.close()     // Catch:{ all -> 0x007c }
            goto L_0x0080
        L_0x007c:
            r5 = move-exception
            r4.addSuppressed(r5)     // Catch:{ IOException -> 0x0081 }
        L_0x0080:
            throw r4     // Catch:{ IOException -> 0x0081 }
        L_0x0081:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: C.l.l(android.content.Context, H.h[], int):android.graphics.Typeface");
    }
}
