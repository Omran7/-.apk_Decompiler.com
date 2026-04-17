package p0;

import android.content.Context;
import android.os.Bundle;
import android.os.Trace;
import com.bumptech.glide.d;
import com.mtma.criminal.city.R;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* renamed from: p0.a  reason: case insensitive filesystem */
public final class C0905a {
    public static volatile C0905a d;

    /* renamed from: e  reason: collision with root package name */
    public static final Object f10968e = new Object();

    /* renamed from: a  reason: collision with root package name */
    public final HashMap f10969a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    public final HashSet f10970b = new HashSet();

    /* renamed from: c  reason: collision with root package name */
    public final Context f10971c;

    public C0905a(Context context) {
        this.f10971c = context.getApplicationContext();
    }

    public static C0905a c(Context context) {
        if (d == null) {
            synchronized (f10968e) {
                try {
                    if (d == null) {
                        d = new C0905a(context);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return d;
    }

    public final void a(Bundle bundle) {
        HashSet hashSet;
        String string = this.f10971c.getString(R.string.androidx_startup);
        if (bundle != null) {
            try {
                HashSet hashSet2 = new HashSet();
                Iterator<String> it2 = bundle.keySet().iterator();
                while (true) {
                    boolean hasNext = it2.hasNext();
                    hashSet = this.f10970b;
                    if (!hasNext) {
                        break;
                    }
                    String next = it2.next();
                    if (string.equals(bundle.getString(next, (String) null))) {
                        Class<?> cls = Class.forName(next);
                        if (C0906b.class.isAssignableFrom(cls)) {
                            hashSet.add(cls);
                        }
                    }
                }
                Iterator it3 = hashSet.iterator();
                while (it3.hasNext()) {
                    b((Class) it3.next(), hashSet2);
                }
            } catch (ClassNotFoundException e6) {
                throw new RuntimeException(e6);
            }
        }
    }

    public final Object b(Class cls, HashSet hashSet) {
        Object obj;
        if (d.K0()) {
            try {
                Trace.beginSection(cls.getSimpleName());
            } catch (Throwable th) {
                Trace.endSection();
                throw th;
            }
        }
        if (!hashSet.contains(cls)) {
            HashMap hashMap = this.f10969a;
            if (!hashMap.containsKey(cls)) {
                hashSet.add(cls);
                C0906b bVar = (C0906b) cls.getDeclaredConstructor((Class[]) null).newInstance((Object[]) null);
                List<Class> a6 = bVar.a();
                if (!a6.isEmpty()) {
                    for (Class cls2 : a6) {
                        if (!hashMap.containsKey(cls2)) {
                            b(cls2, hashSet);
                        }
                    }
                }
                obj = bVar.b(this.f10971c);
                hashSet.remove(cls);
                hashMap.put(cls, obj);
            } else {
                obj = hashMap.get(cls);
            }
            Trace.endSection();
            return obj;
        }
        String name = cls.getName();
        throw new IllegalStateException("Cannot initialize " + name + ". Cycle detected.");
    }
}
