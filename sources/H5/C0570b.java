package h5;

import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import k5.C0773j;
import n.g;
import n.k;

/* renamed from: h5.b  reason: case insensitive filesystem */
public final class C0570b implements C0569a {

    /* renamed from: a  reason: collision with root package name */
    public C0569a f8177a;

    /* renamed from: b  reason: collision with root package name */
    public C0773j f8178b;

    public final void a(ActionMode actionMode, int i2, long j6, boolean z3) {
        ((C0570b) this.f8177a).a(actionMode, i2, j6, z3);
        if (this.f8178b.getCheckedItemCount() == 0) {
            actionMode.finish();
        }
    }

    public final boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
        return ((C0570b) this.f8177a).onActionItemClicked(actionMode, menuItem);
    }

    public final boolean onCreateActionMode(ActionMode actionMode, Menu menu) {
        if (!((C0570b) this.f8177a).onCreateActionMode(actionMode, menu)) {
            return false;
        }
        this.f8178b.setLongClickable(false);
        return true;
    }

    public final void onDestroyActionMode(ActionMode actionMode) {
        ((C0570b) this.f8177a).onDestroyActionMode(actionMode);
        C0773j jVar = this.f8178b;
        jVar.f9517J = null;
        k kVar = jVar.f9522M;
        if (kVar != null) {
            kVar.b();
        }
        g gVar = jVar.f9524N;
        if (gVar != null) {
            gVar.a();
        }
        jVar.f9521L = 0;
        jVar.f9586s = true;
        jVar.f();
        jVar.requestLayout();
        jVar.setLongClickable(true);
    }

    public final boolean onPrepareActionMode(ActionMode actionMode, Menu menu) {
        return ((C0570b) this.f8177a).onPrepareActionMode(actionMode, menu);
    }
}
