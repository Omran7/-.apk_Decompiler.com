package t0;

import android.view.ViewGroup;
import com.bumptech.glide.c;

/* renamed from: t0.d  reason: case insensitive filesystem */
public final class C0983d extends n {

    /* renamed from: a  reason: collision with root package name */
    public boolean f11633a = false;

    /* renamed from: b  reason: collision with root package name */
    public final ViewGroup f11634b;

    public C0983d(ViewGroup viewGroup) {
        this.f11634b = viewGroup;
    }

    public final void b(m mVar) {
        c.C0(this.f11634b, false);
        this.f11633a = true;
    }

    public final void c() {
        c.C0(this.f11634b, false);
    }

    public final void d() {
        c.C0(this.f11634b, true);
    }

    public final void f(m mVar) {
        if (!this.f11633a) {
            c.C0(this.f11634b, false);
        }
        mVar.y(this);
    }
}
