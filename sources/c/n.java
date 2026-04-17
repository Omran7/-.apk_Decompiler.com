package C;

import B.f;
import B.g;
import H.h;
import I1.b;
import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.FontVariationAxis;
import android.net.Uri;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class n extends l {

    /* renamed from: o  reason: collision with root package name */
    public final Class f391o;

    /* renamed from: p  reason: collision with root package name */
    public final Constructor f392p;

    /* renamed from: q  reason: collision with root package name */
    public final Method f393q;

    /* renamed from: r  reason: collision with root package name */
    public final Method f394r;

    /* renamed from: s  reason: collision with root package name */
    public final Method f395s;

    /* renamed from: t  reason: collision with root package name */
    public final Method f396t;

    /* renamed from: u  reason: collision with root package name */
    public final Method f397u;

    public n() {
        Method method;
        Method method2;
        Method method3;
        Method method4;
        Constructor<?> constructor;
        Method method5;
        Class<?> cls = null;
        try {
            Class<?> cls2 = Class.forName("android.graphics.FontFamily");
            constructor = cls2.getConstructor((Class[]) null);
            method4 = B1(cls2);
            Class cls3 = Integer.TYPE;
            method3 = cls2.getMethod("addFontFromBuffer", new Class[]{ByteBuffer.class, cls3, FontVariationAxis[].class, cls3, cls3});
            method2 = cls2.getMethod("freeze", (Class[]) null);
            method = cls2.getMethod("abortCreation", (Class[]) null);
            Class<?> cls4 = cls2;
            method5 = C1(cls2);
            cls = cls4;
        } catch (ClassNotFoundException | NoSuchMethodException e6) {
            Log.e("TypefaceCompatApi26Impl", "Unable to collect necessary methods for class ".concat(e6.getClass().getName()), e6);
            method5 = null;
            constructor = null;
            method4 = null;
            method3 = null;
            method2 = null;
            method = null;
        }
        this.f391o = cls;
        this.f392p = constructor;
        this.f393q = method4;
        this.f394r = method3;
        this.f395s = method2;
        this.f396t = method;
        this.f397u = method5;
    }

    public static Method B1(Class cls) {
        Class cls2 = Integer.TYPE;
        return cls.getMethod("addFontFromAssetManager", new Class[]{AssetManager.class, String.class, cls2, Boolean.TYPE, cls2, cls2, cls2, FontVariationAxis[].class});
    }

    public final Object A1() {
        try {
            return this.f392p.newInstance((Object[]) null);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            return null;
        }
    }

    public Method C1(Class cls) {
        Class<?> cls2 = Array.newInstance(cls, 1).getClass();
        Class cls3 = Integer.TYPE;
        Method declaredMethod = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", new Class[]{cls2, cls3, cls3});
        declaredMethod.setAccessible(true);
        return declaredMethod;
    }

    public final Typeface k(Context context, f fVar, Resources resources, int i2) {
        if (!z1()) {
            return super.k(context, fVar, resources, i2);
        }
        Object A12 = A1();
        if (A12 == null) {
            return null;
        }
        for (g gVar : fVar.f144a) {
            if (!w1(context, A12, gVar.f145a, gVar.f148e, gVar.f146b, gVar.f147c ? 1 : 0, FontVariationAxis.fromFontVariationSettings(gVar.d))) {
                v1(A12);
                return null;
            }
        }
        if (!y1(A12)) {
            return null;
        }
        return x1(A12);
    }

    public final Typeface l(Context context, h[] hVarArr, int i2) {
        Typeface x12;
        boolean z3;
        ParcelFileDescriptor openFileDescriptor;
        if (hVarArr.length < 1) {
            return null;
        }
        if (!z1()) {
            h X3 = X(hVarArr, i2);
            try {
                openFileDescriptor = context.getContentResolver().openFileDescriptor(X3.f979a, "r", (CancellationSignal) null);
                if (openFileDescriptor == null) {
                    if (openFileDescriptor != null) {
                        openFileDescriptor.close();
                    }
                    return null;
                }
                Typeface build = new Typeface.Builder(openFileDescriptor.getFileDescriptor()).setWeight(X3.f981c).setItalic(X3.d).build();
                openFileDescriptor.close();
                return build;
            } catch (IOException unused) {
                return null;
            } catch (Throwable th) {
                th.addSuppressed(th);
            }
        } else {
            HashMap hashMap = new HashMap();
            for (h hVar : hVarArr) {
                if (hVar.f982e == 0) {
                    Uri uri = hVar.f979a;
                    if (!hashMap.containsKey(uri)) {
                        hashMap.put(uri, b.u0(context, uri));
                    }
                }
            }
            Map unmodifiableMap = Collections.unmodifiableMap(hashMap);
            Object A12 = A1();
            if (A12 == null) {
                return null;
            }
            boolean z4 = false;
            for (h hVar2 : hVarArr) {
                ByteBuffer byteBuffer = (ByteBuffer) unmodifiableMap.get(hVar2.f979a);
                if (byteBuffer != null) {
                    try {
                        z3 = ((Boolean) this.f394r.invoke(A12, new Object[]{byteBuffer, Integer.valueOf(hVar2.f980b), null, Integer.valueOf(hVar2.f981c), Integer.valueOf(hVar2.d ? 1 : 0)})).booleanValue();
                    } catch (IllegalAccessException | InvocationTargetException unused2) {
                        z3 = false;
                    }
                    if (!z3) {
                        v1(A12);
                        return null;
                    }
                    z4 = true;
                }
            }
            if (!z4) {
                v1(A12);
                return null;
            } else if (y1(A12) && (x12 = x1(A12)) != null) {
                return Typeface.create(x12, i2);
            } else {
                return null;
            }
        }
        throw th;
    }

    public final Typeface n(Context context, Resources resources, int i2, String str, int i5) {
        if (!z1()) {
            return super.n(context, resources, i2, str, i5);
        }
        Object A12 = A1();
        if (A12 == null) {
            return null;
        }
        if (!w1(context, A12, str, 0, -1, -1, (FontVariationAxis[]) null)) {
            v1(A12);
            return null;
        } else if (!y1(A12)) {
            return null;
        } else {
            return x1(A12);
        }
    }

    public final void v1(Object obj) {
        try {
            this.f396t.invoke(obj, (Object[]) null);
        } catch (IllegalAccessException | InvocationTargetException unused) {
        }
    }

    public final boolean w1(Context context, Object obj, String str, int i2, int i5, int i6, FontVariationAxis[] fontVariationAxisArr) {
        try {
            Object obj2 = obj;
            return ((Boolean) this.f393q.invoke(obj, new Object[]{context.getAssets(), str, 0, Boolean.FALSE, Integer.valueOf(i2), Integer.valueOf(i5), Integer.valueOf(i6), fontVariationAxisArr})).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    public Typeface x1(Object obj) {
        try {
            Object newInstance = Array.newInstance(this.f391o, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) this.f397u.invoke((Object) null, new Object[]{newInstance, -1, -1});
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    public final boolean y1(Object obj) {
        try {
            return ((Boolean) this.f395s.invoke(obj, (Object[]) null)).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    public final boolean z1() {
        Method method = this.f393q;
        if (method == null) {
            Log.w("TypefaceCompatApi26Impl", "Unable to collect necessary private methods. Fallback to legacy implementation.");
        }
        if (method != null) {
            return true;
        }
        return false;
    }
}
