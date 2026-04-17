package i;

import S3.z;
import X4.d;
import android.content.Context;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.widget.ActionBarContextView;
import j.i;
import j.k;
import java.lang.ref.WeakReference;
import k.C0718j;

/* renamed from: i.d  reason: case insensitive filesystem */
public final class C0574d extends C0571a implements i {

    /* renamed from: c  reason: collision with root package name */
    public Context f8186c;
    public ActionBarContextView d;

    /* renamed from: e  reason: collision with root package name */
    public d f8187e;

    /* renamed from: f  reason: collision with root package name */
    public WeakReference f8188f;

    /* renamed from: p  reason: collision with root package name */
    public boolean f8189p;

    /* renamed from: q  reason: collision with root package name */
    public k f8190q;

    public final void a() {
        if (!this.f8189p) {
            this.f8189p = true;
            this.f8187e.J(this);
        }
    }

    public final View b() {
        WeakReference weakReference = this.f8188f;
        if (weakReference != null) {
            return (View) weakReference.get();
        }
        return null;
    }

    public final k c() {
        return this.f8190q;
    }

    public final MenuInflater d() {
        return new h(this.d.getContext());
    }

    public final CharSequence e() {
        return this.d.getSubtitle();
    }

    public final CharSequence f() {
        return this.d.getTitle();
    }

    public final void g() {
        this.f8187e.L(this, this.f8190q);
    }

    public final boolean h() {
        return this.d.f4719B;
    }

    public final void i(View view) {
        WeakReference weakReference;
        this.d.setCustomView(view);
        if (view != null) {
            weakReference = new WeakReference(view);
        } else {
            weakReference = null;
        }
        this.f8188f = weakReference;
    }

    public final void j(int i2) {
        k(this.f8186c.getString(i2));
    }

    public final void k(CharSequence charSequence) {
        this.d.setSubtitle(charSequence);
    }

    public final void l(int i2) {
        m(this.f8186c.getString(i2));
    }

    public final void m(CharSequence charSequence) {
        this.d.setTitle(charSequence);
    }

    public final void n(boolean z3) {
        this.f8180b = z3;
        this.d.setTitleOptional(z3);
    }

    public final void r(k kVar) {
        g();
        C0718j jVar = this.d.d;
        if (jVar != null) {
            jVar.l();
        }
    }

    public final boolean s(k kVar, MenuItem menuItem) {
        return ((z) this.f8187e.f4209b).D(this, menuItem);
    }
}
