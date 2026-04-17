package C;

import H.h;
import I1.b;
import android.content.Context;
import android.graphics.Typeface;
import android.net.Uri;
import android.util.Log;
import com.bumptech.glide.d;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.List;
import n.j;

public final class m extends d {

    /* renamed from: j  reason: collision with root package name */
    public static final Class f387j;

    /* renamed from: k  reason: collision with root package name */
    public static final Constructor f388k;

    /* renamed from: l  reason: collision with root package name */
    public static final Method f389l;

    /* renamed from: m  reason: collision with root package name */
    public static final Method f390m;

    static {
        Method method;
        Method method2;
        Class<?> cls;
        Constructor<?> constructor = null;
        try {
            cls = Class.forName("android.graphics.FontFamily");
            Constructor<?> constructor2 = cls.getConstructor((Class[]) null);
            Class cls2 = Integer.TYPE;
            method = cls.getMethod("addFontWeightStyle", new Class[]{ByteBuffer.class, cls2, List.class, cls2, Boolean.TYPE});
            Constructor<?> constructor3 = constructor2;
            method2 = Typeface.class.getMethod("createFromFamiliesWithDefault", new Class[]{Array.newInstance(cls, 1).getClass()});
            constructor = constructor3;
        } catch (ClassNotFoundException | NoSuchMethodException e6) {
            Log.e("TypefaceCompatApi24Impl", e6.getClass().getName(), e6);
            cls = null;
            method2 = null;
            method = null;
        }
        f388k = constructor;
        f387j = cls;
        f389l = method;
        f390m = method2;
    }

    public static boolean t1(Object obj, ByteBuffer byteBuffer, int i2, int i5, boolean z3) {
        try {
            return ((Boolean) f389l.invoke(obj, new Object[]{byteBuffer, Integer.valueOf(i2), null, Integer.valueOf(i5), Boolean.valueOf(z3)})).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    public static Typeface u1(Object obj) {
        try {
            Object newInstance = Array.newInstance(f387j, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) f390m.invoke((Object) null, new Object[]{newInstance});
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:39:0x005c  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x005b A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.graphics.Typeface k(android.content.Context r17, B.f r18, android.content.res.Resources r19, int r20) {
        /*
            r16 = this;
            r1 = 0
            java.lang.reflect.Constructor r0 = f388k     // Catch:{ IllegalAccessException | InstantiationException | InvocationTargetException -> 0x0009 }
            java.lang.Object r0 = r0.newInstance(r1)     // Catch:{ IllegalAccessException | InstantiationException | InvocationTargetException -> 0x0009 }
            r2 = r0
            goto L_0x000a
        L_0x0009:
            r2 = r1
        L_0x000a:
            if (r2 != 0) goto L_0x000d
            return r1
        L_0x000d:
            r0 = r18
            B.g[] r3 = r0.f144a
            int r4 = r3.length
            r0 = 0
            r5 = r0
        L_0x0014:
            if (r5 >= r4) goto L_0x0071
            r6 = r3[r5]
            int r0 = r6.f149f
            java.io.File r7 = I1.b.h0(r17)
            if (r7 != 0) goto L_0x0024
            r8 = r19
        L_0x0022:
            r0 = r1
            goto L_0x0059
        L_0x0024:
            r8 = r19
            boolean r0 = I1.b.p(r7, r8, r0)     // Catch:{ all -> 0x006c }
            if (r0 != 0) goto L_0x0030
            r7.delete()
            goto L_0x0022
        L_0x0030:
            java.io.FileInputStream r9 = new java.io.FileInputStream     // Catch:{ IOException -> 0x0055 }
            r9.<init>(r7)     // Catch:{ IOException -> 0x0055 }
            java.nio.channels.FileChannel r10 = r9.getChannel()     // Catch:{ all -> 0x0049 }
            long r14 = r10.size()     // Catch:{ all -> 0x0049 }
            java.nio.channels.FileChannel$MapMode r11 = java.nio.channels.FileChannel.MapMode.READ_ONLY     // Catch:{ all -> 0x0049 }
            r12 = 0
            java.nio.MappedByteBuffer r0 = r10.map(r11, r12, r14)     // Catch:{ all -> 0x0049 }
            r9.close()     // Catch:{ IOException -> 0x0055 }
            goto L_0x0056
        L_0x0049:
            r0 = move-exception
            r10 = r0
            r9.close()     // Catch:{ all -> 0x004f }
            goto L_0x0054
        L_0x004f:
            r0 = move-exception
            r9 = r0
            r10.addSuppressed(r9)     // Catch:{ IOException -> 0x0055 }
        L_0x0054:
            throw r10     // Catch:{ IOException -> 0x0055 }
        L_0x0055:
            r0 = r1
        L_0x0056:
            r7.delete()
        L_0x0059:
            if (r0 != 0) goto L_0x005c
            return r1
        L_0x005c:
            int r7 = r6.f146b
            boolean r9 = r6.f147c
            int r6 = r6.f148e
            boolean r0 = t1(r2, r0, r6, r7, r9)
            if (r0 != 0) goto L_0x0069
            return r1
        L_0x0069:
            int r5 = r5 + 1
            goto L_0x0014
        L_0x006c:
            r0 = move-exception
            r7.delete()
            throw r0
        L_0x0071:
            android.graphics.Typeface r0 = u1(r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: C.m.k(android.content.Context, B.f, android.content.res.Resources, int):android.graphics.Typeface");
    }

    public final Typeface l(Context context, h[] hVarArr, int i2) {
        Object obj;
        try {
            obj = f388k.newInstance((Object[]) null);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            obj = null;
        }
        if (obj == null) {
            return null;
        }
        j jVar = new j(0);
        for (h hVar : hVarArr) {
            Uri uri = hVar.f979a;
            ByteBuffer byteBuffer = (ByteBuffer) jVar.get(uri);
            if (byteBuffer == null) {
                byteBuffer = b.u0(context, uri);
                jVar.put(uri, byteBuffer);
            }
            if (byteBuffer == null) {
                return null;
            }
            if (!t1(obj, byteBuffer, hVar.f980b, hVar.f981c, hVar.d)) {
                return null;
            }
        }
        Typeface u12 = u1(obj);
        if (u12 == null) {
            return null;
        }
        return Typeface.create(u12, i2);
    }
}
