package d1;

import android.content.Context;
import h0.C0552a;
import l1.C0780a;

/* renamed from: d1.b  reason: case insensitive filesystem */
public final class C0459b extends C0460c {

    /* renamed from: a  reason: collision with root package name */
    public final Context f7504a;

    /* renamed from: b  reason: collision with root package name */
    public final C0780a f7505b;

    /* renamed from: c  reason: collision with root package name */
    public final C0780a f7506c;
    public final String d;

    public C0459b(Context context, C0780a aVar, C0780a aVar2, String str) {
        if (context != null) {
            this.f7504a = context;
            if (aVar != null) {
                this.f7505b = aVar;
                if (aVar2 != null) {
                    this.f7506c = aVar2;
                    if (str != null) {
                        this.d = str;
                        return;
                    }
                    throw new NullPointerException("Null backendName");
                }
                throw new NullPointerException("Null monotonicClock");
            }
            throw new NullPointerException("Null wallClock");
        }
        throw new NullPointerException("Null applicationContext");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0460c)) {
            return false;
        }
        C0460c cVar = (C0460c) obj;
        if (this.f7504a.equals(((C0459b) cVar).f7504a)) {
            C0459b bVar = (C0459b) cVar;
            if (this.f7505b.equals(bVar.f7505b) && this.f7506c.equals(bVar.f7506c) && this.d.equals(bVar.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((this.f7504a.hashCode() ^ 1000003) * 1000003) ^ this.f7505b.hashCode()) * 1000003) ^ this.f7506c.hashCode()) * 1000003) ^ this.d.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CreationContext{applicationContext=");
        sb.append(this.f7504a);
        sb.append(", wallClock=");
        sb.append(this.f7505b);
        sb.append(", monotonicClock=");
        sb.append(this.f7506c);
        sb.append(", backendName=");
        return C0552a.r(sb, this.d, "}");
    }
}
