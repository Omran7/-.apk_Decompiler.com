package z2;

import com.google.android.gms.internal.measurement.zzjz;
import java.util.Objects;

/* renamed from: z2.g  reason: case insensitive filesystem */
public final class C1140g implements C1138e {

    /* renamed from: a  reason: collision with root package name */
    public volatile zzjz f12859a;

    /* renamed from: b  reason: collision with root package name */
    public volatile boolean f12860b;

    /* renamed from: c  reason: collision with root package name */
    public Object f12861c;

    public final Object get() {
        if (!this.f12860b) {
            synchronized (this) {
                try {
                    if (!this.f12860b) {
                        zzjz zzjz = this.f12859a;
                        Objects.requireNonNull(zzjz);
                        Object obj = zzjz.get();
                        this.f12861c = obj;
                        this.f12860b = true;
                        this.f12859a = null;
                        return obj;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return this.f12861c;
    }

    public final String toString() {
        Object obj = this.f12859a;
        if (obj == null) {
            String valueOf = String.valueOf(this.f12861c);
            StringBuilder sb = new StringBuilder(valueOf.length() + 25);
            sb.append("<supplier that returned ");
            sb.append(valueOf);
            sb.append(">");
            obj = sb.toString();
        }
        String valueOf2 = String.valueOf(obj);
        StringBuilder sb2 = new StringBuilder(valueOf2.length() + 19);
        sb2.append("Suppliers.memoize(");
        sb2.append(valueOf2);
        sb2.append(")");
        return sb2.toString();
    }
}
