package j;

import android.view.View;
import androidx.appcompat.view.menu.ActionMenuItemView;
import k.C0710f;
import k.C0712g;
import k.C0716i;
import k.C0718j;
import k.C0745w0;

/* renamed from: j.b  reason: case insensitive filesystem */
public final class C0602b extends C0745w0 {

    /* renamed from: s  reason: collision with root package name */
    public final /* synthetic */ int f8679s = 0;

    /* renamed from: t  reason: collision with root package name */
    public final /* synthetic */ View f8680t;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C0602b(ActionMenuItemView actionMenuItemView) {
        super(actionMenuItemView);
        this.f8680t = actionMenuItemView;
    }

    public final C0598A b() {
        C0710f fVar;
        switch (this.f8679s) {
            case 0:
                C0603c cVar = ((ActionMenuItemView) this.f8680t).f4687v;
                if (cVar == null || (fVar = ((C0712g) cVar).f9299a.f9320C) == null) {
                    return null;
                }
                return fVar.a();
            default:
                C0710f fVar2 = ((C0716i) this.f8680t).d.f9319B;
                if (fVar2 == null) {
                    return null;
                }
                return fVar2.a();
        }
    }

    public final boolean c() {
        C0598A b6;
        switch (this.f8679s) {
            case 0:
                ActionMenuItemView actionMenuItemView = (ActionMenuItemView) this.f8680t;
                j jVar = actionMenuItemView.f4685t;
                if (jVar == null || !jVar.c(actionMenuItemView.f4682q) || (b6 = b()) == null || !b6.b()) {
                    return false;
                }
                return true;
            default:
                ((C0716i) this.f8680t).d.l();
                return true;
        }
    }

    public boolean d() {
        switch (this.f8679s) {
            case 1:
                C0718j jVar = ((C0716i) this.f8680t).d;
                if (jVar.f9321D != null) {
                    return false;
                }
                jVar.c();
                return true;
            default:
                return super.d();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C0602b(C0716i iVar, C0716i iVar2) {
        super(iVar2);
        this.f8680t = iVar;
    }
}
