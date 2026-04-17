package j;

import B0.l;
import android.content.Context;
import android.content.ContextWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.WindowManager;
import android.widget.AdapterView;
import androidx.appcompat.view.menu.ExpandedMenuView;
import f.C0511b;
import f.C0515f;

public final class g implements w, AdapterView.OnItemClickListener {

    /* renamed from: a  reason: collision with root package name */
    public Context f8709a;

    /* renamed from: b  reason: collision with root package name */
    public LayoutInflater f8710b;

    /* renamed from: c  reason: collision with root package name */
    public k f8711c;
    public ExpandedMenuView d;

    /* renamed from: e  reason: collision with root package name */
    public v f8712e;

    /* renamed from: f  reason: collision with root package name */
    public f f8713f;

    public g(ContextWrapper contextWrapper) {
        this.f8709a = contextWrapper;
        this.f8710b = LayoutInflater.from(contextWrapper);
    }

    public final void a(k kVar, boolean z3) {
        v vVar = this.f8712e;
        if (vVar != null) {
            vVar.a(kVar, z3);
        }
    }

    public final boolean d(m mVar) {
        return false;
    }

    public final void e() {
        f fVar = this.f8713f;
        if (fVar != null) {
            fVar.notifyDataSetChanged();
        }
    }

    public final void g(Context context, k kVar) {
        if (this.f8709a != null) {
            this.f8709a = context;
            if (this.f8710b == null) {
                this.f8710b = LayoutInflater.from(context);
            }
        }
        this.f8711c = kVar;
        f fVar = this.f8713f;
        if (fVar != null) {
            fVar.notifyDataSetChanged();
        }
    }

    public final boolean h() {
        return false;
    }

    public final boolean i(m mVar) {
        return false;
    }

    public final void j(v vVar) {
        throw null;
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [android.content.DialogInterface$OnClickListener, j.v, android.content.DialogInterface$OnKeyListener, j.l, java.lang.Object, android.content.DialogInterface$OnDismissListener] */
    public final boolean k(C0600C c3) {
        if (!c3.hasVisibleItems()) {
            return false;
        }
        ? obj = new Object();
        obj.f8742a = c3;
        Context context = c3.f8726a;
        l lVar = new l(context);
        C0511b bVar = (C0511b) lVar.f247c;
        g gVar = new g(bVar.f7749a);
        obj.f8744c = gVar;
        gVar.f8712e = obj;
        c3.b(gVar, context);
        g gVar2 = obj.f8744c;
        if (gVar2.f8713f == null) {
            gVar2.f8713f = new f(gVar2);
        }
        bVar.f7754i = gVar2.f8713f;
        bVar.f7755j = obj;
        View view = c3.f8739x;
        if (view != null) {
            bVar.f7752e = view;
        } else {
            bVar.f7751c = c3.f8738w;
            bVar.d = c3.f8737v;
        }
        bVar.g = obj;
        C0515f a6 = lVar.a();
        obj.f8743b = a6;
        a6.setOnDismissListener(obj);
        WindowManager.LayoutParams attributes = obj.f8743b.getWindow().getAttributes();
        attributes.type = 1003;
        attributes.flags |= 131072;
        obj.f8743b.show();
        v vVar = this.f8712e;
        if (vVar == null) {
            return true;
        }
        vVar.p(c3);
        return true;
    }

    public final void onItemClick(AdapterView adapterView, View view, int i2, long j6) {
        this.f8711c.q(this.f8713f.getItem(i2), this, 0);
    }
}
