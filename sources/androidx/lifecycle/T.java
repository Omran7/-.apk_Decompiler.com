package androidx.lifecycle;

import java.io.Closeable;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;

public final class T {

    /* renamed from: a  reason: collision with root package name */
    public final LinkedHashMap f5258a = new LinkedHashMap();

    public final void a() {
        for (O o6 : this.f5258a.values()) {
            o6.f5247c = true;
            HashMap hashMap = o6.f5245a;
            if (hashMap != null) {
                synchronized (hashMap) {
                    try {
                        for (Object a6 : o6.f5245a.values()) {
                            O.a(a6);
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            LinkedHashSet linkedHashSet = o6.f5246b;
            if (linkedHashSet != null) {
                synchronized (linkedHashSet) {
                    try {
                        for (Closeable a7 : o6.f5246b) {
                            O.a(a7);
                        }
                    } finally {
                    }
                }
            }
            o6.b();
        }
        this.f5258a.clear();
    }
}
