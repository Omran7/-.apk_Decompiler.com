package d0;

import B0.H;
import android.support.v4.media.session.a;
import androidx.lifecycle.C0307s;
import androidx.lifecycle.y;
import androidx.lifecycle.z;
import e0.C0477a;
import x1.d;

/* renamed from: d0.a  reason: case insensitive filesystem */
public final class C0456a extends y {

    /* renamed from: l  reason: collision with root package name */
    public final d f7497l;

    /* renamed from: m  reason: collision with root package name */
    public C0307s f7498m;

    /* renamed from: n  reason: collision with root package name */
    public H f7499n;

    public C0456a(d dVar) {
        this.f7497l = dVar;
        if (dVar.f12539a == null) {
            dVar.f12539a = this;
            return;
        }
        throw new IllegalStateException("There is already a listener registered");
    }

    public final void f() {
        d dVar = this.f7497l;
        dVar.f12540b = true;
        dVar.d = false;
        dVar.f12541c = false;
        dVar.f12544i.drainPermits();
        dVar.a();
        dVar.g = new C0477a(dVar);
        dVar.c();
    }

    public final void g() {
        this.f7497l.f12540b = false;
    }

    public final void h(z zVar) {
        super.h(zVar);
        this.f7498m = null;
        this.f7499n = null;
    }

    public final void j() {
        C0307s sVar = this.f7498m;
        H h = this.f7499n;
        if (sVar != null && h != null) {
            super.h(h);
            d(sVar, h);
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(64);
        sb.append("LoaderInfo{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" #0 : ");
        a.c(sb, this.f7497l);
        sb.append("}}");
        return sb.toString();
    }
}
