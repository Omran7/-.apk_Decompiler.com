package z2;

import com.google.android.gms.internal.measurement.zzjz;
import java.io.Serializable;

/* renamed from: z2.f  reason: case insensitive filesystem */
public final class C1139f implements C1138e, Serializable {

    /* renamed from: a  reason: collision with root package name */
    public final zzjz f12856a;

    /* renamed from: b  reason: collision with root package name */
    public volatile transient boolean f12857b;

    /* renamed from: c  reason: collision with root package name */
    public transient Object f12858c;

    public C1139f(zzjz zzjz) {
        this.f12856a = zzjz;
    }

    public final Object get() {
        if (!this.f12857b) {
            synchronized (this) {
                try {
                    if (!this.f12857b) {
                        Object obj = this.f12856a.get();
                        this.f12858c = obj;
                        this.f12857b = true;
                        return obj;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return this.f12858c;
    }

    public final String toString() {
        Object obj;
        if (this.f12857b) {
            String valueOf = String.valueOf(this.f12858c);
            StringBuilder sb = new StringBuilder(valueOf.length() + 25);
            sb.append("<supplier that returned ");
            sb.append(valueOf);
            sb.append(">");
            obj = sb.toString();
        } else {
            obj = this.f12856a;
        }
        String valueOf2 = String.valueOf(obj);
        StringBuilder sb2 = new StringBuilder(valueOf2.length() + 19);
        sb2.append("Suppliers.memoize(");
        sb2.append(valueOf2);
        sb2.append(")");
        return sb2.toString();
    }
}
