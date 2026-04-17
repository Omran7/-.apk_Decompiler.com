package V3;

import B.m;
import android.app.Activity;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final Activity f3762a;

    /* renamed from: b  reason: collision with root package name */
    public final m f3763b;

    /* renamed from: c  reason: collision with root package name */
    public final Object f3764c;

    public a(m mVar, Activity activity, Object obj) {
        this.f3762a = activity;
        this.f3763b = mVar;
        this.f3764c = obj;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        if (aVar.f3764c.equals(this.f3764c) && aVar.f3763b == this.f3763b && aVar.f3762a == this.f3762a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f3764c.hashCode();
    }
}
