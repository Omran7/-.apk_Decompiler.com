package i;

import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import j.z;

/* renamed from: i.e  reason: case insensitive filesystem */
public final class C0575e extends ActionMode {

    /* renamed from: a  reason: collision with root package name */
    public final Context f8191a;

    /* renamed from: b  reason: collision with root package name */
    public final C0571a f8192b;

    public C0575e(Context context, C0571a aVar) {
        this.f8191a = context;
        this.f8192b = aVar;
    }

    public final void finish() {
        this.f8192b.a();
    }

    public final View getCustomView() {
        return this.f8192b.b();
    }

    public final Menu getMenu() {
        return new z(this.f8191a, this.f8192b.c());
    }

    public final MenuInflater getMenuInflater() {
        return this.f8192b.d();
    }

    public final CharSequence getSubtitle() {
        return this.f8192b.e();
    }

    public final Object getTag() {
        return this.f8192b.f8179a;
    }

    public final CharSequence getTitle() {
        return this.f8192b.f();
    }

    public final boolean getTitleOptionalHint() {
        return this.f8192b.f8180b;
    }

    public final void invalidate() {
        this.f8192b.g();
    }

    public final boolean isTitleOptional() {
        return this.f8192b.h();
    }

    public final void setCustomView(View view) {
        this.f8192b.i(view);
    }

    public final void setSubtitle(CharSequence charSequence) {
        this.f8192b.k(charSequence);
    }

    public final void setTag(Object obj) {
        this.f8192b.f8179a = obj;
    }

    public final void setTitle(CharSequence charSequence) {
        this.f8192b.m(charSequence);
    }

    public final void setTitleOptionalHint(boolean z3) {
        this.f8192b.n(z3);
    }

    public final void setSubtitle(int i2) {
        this.f8192b.j(i2);
    }

    public final void setTitle(int i2) {
        this.f8192b.l(i2);
    }
}
