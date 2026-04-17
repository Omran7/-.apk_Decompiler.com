package androidx.lifecycle;

import java.io.Closeable;
import java.io.IOException;
import java.util.HashMap;
import java.util.LinkedHashSet;

public abstract class O {

    /* renamed from: a  reason: collision with root package name */
    public final HashMap f5245a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    public final LinkedHashSet f5246b = new LinkedHashSet();

    /* renamed from: c  reason: collision with root package name */
    public volatile boolean f5247c = false;

    public static void a(Object obj) {
        if (obj instanceof Closeable) {
            try {
                ((Closeable) obj).close();
            } catch (IOException e6) {
                throw new RuntimeException(e6);
            }
        }
    }

    public void b() {
    }
}
