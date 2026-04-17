package f;

import S3.z;
import X4.d;
import android.content.Context;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.widget.ActionBarContextView;
import i.C0571a;
import i.h;
import j.i;
import j.k;
import java.lang.ref.WeakReference;
import k.C0718j;

public final class I extends C0571a implements i {

    /* renamed from: c  reason: collision with root package name */
    public final Context f7718c;
    public final k d;

    /* renamed from: e  reason: collision with root package name */
    public d f7719e;

    /* renamed from: f  reason: collision with root package name */
    public WeakReference f7720f;

    /* renamed from: p  reason: collision with root package name */
    public final /* synthetic */ J f7721p;

    public I(J j6, Context context, d dVar) {
        this.f7721p = j6;
        this.f7718c = context;
        this.f7719e = dVar;
        k kVar = new k(context);
        kVar.f8736u = 1;
        this.d = kVar;
        kVar.f8729e = this;
    }

    public final void a() {
        J j6 = this.f7721p;
        if (j6.f7744x == this) {
            if (j6.f7728E) {
                j6.f7745y = this;
                j6.f7746z = this.f7719e;
            } else {
                this.f7719e.J(this);
            }
            this.f7719e = null;
            j6.S0(false);
            ActionBarContextView actionBarContextView = j6.f7741u;
            if (actionBarContextView.f4730t == null) {
                actionBarContextView.e();
            }
            j6.f7738r.setHideOnContentScrollEnabled(j6.f7732J);
            j6.f7744x = null;
        }
    }

    public final View b() {
        WeakReference weakReference = this.f7720f;
        if (weakReference != null) {
            return (View) weakReference.get();
        }
        return null;
    }

    public final k c() {
        return this.d;
    }

    public final MenuInflater d() {
        return new h(this.f7718c);
    }

    public final CharSequence e() {
        return this.f7721p.f7741u.getSubtitle();
    }

    public final CharSequence f() {
        return this.f7721p.f7741u.getTitle();
    }

    public final void g() {
        if (this.f7721p.f7744x == this) {
            k kVar = this.d;
            kVar.w();
            try {
                this.f7719e.L(this, kVar);
            } finally {
                kVar.v();
            }
        }
    }

    public final boolean h() {
        return this.f7721p.f7741u.f4719B;
    }

    public final void i(View view) {
        this.f7721p.f7741u.setCustomView(view);
        this.f7720f = new WeakReference(view);
    }

    public final void j(int i2) {
        k(this.f7721p.f7736p.getResources().getString(i2));
    }

    public final void k(CharSequence charSequence) {
        this.f7721p.f7741u.setSubtitle(charSequence);
    }

    public final void l(int i2) {
        m(this.f7721p.f7736p.getResources().getString(i2));
    }

    public final void m(CharSequence charSequence) {
        this.f7721p.f7741u.setTitle(charSequence);
    }

    public final void n(boolean z3) {
        this.f8180b = z3;
        this.f7721p.f7741u.setTitleOptional(z3);
    }

    public final void r(k kVar) {
        if (this.f7719e != null) {
            g();
            C0718j jVar = this.f7721p.f7741u.d;
            if (jVar != null) {
                jVar.l();
            }
        }
    }

    public final boolean s(k kVar, MenuItem menuItem) {
        d dVar = this.f7719e;
        if (dVar != null) {
            return ((z) dVar.f4209b).D(this, menuItem);
        }
        return false;
    }
}
