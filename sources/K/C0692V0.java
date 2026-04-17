package k;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.appcompat.widget.Toolbar;
import i.C0572b;
import j.C0600C;
import j.k;
import j.m;
import j.o;
import j.w;
import java.util.ArrayList;

/* renamed from: k.V0  reason: case insensitive filesystem */
public final class C0692V0 implements w {

    /* renamed from: a  reason: collision with root package name */
    public k f9237a;

    /* renamed from: b  reason: collision with root package name */
    public m f9238b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Toolbar f9239c;

    public C0692V0(Toolbar toolbar) {
        this.f9239c = toolbar;
    }

    public final boolean d(m mVar) {
        Toolbar toolbar = this.f9239c;
        toolbar.c();
        ViewParent parent = toolbar.f4821q.getParent();
        if (parent != toolbar) {
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(toolbar.f4821q);
            }
            toolbar.addView(toolbar.f4821q);
        }
        View actionView = mVar.getActionView();
        toolbar.f4822r = actionView;
        this.f9238b = mVar;
        ViewParent parent2 = actionView.getParent();
        if (parent2 != toolbar) {
            if (parent2 instanceof ViewGroup) {
                ((ViewGroup) parent2).removeView(toolbar.f4822r);
            }
            C0694W0 h = Toolbar.h();
            h.f9240a = (toolbar.f4827w & 112) | 8388611;
            h.f9241b = 2;
            toolbar.f4822r.setLayoutParams(h);
            toolbar.addView(toolbar.f4822r);
        }
        for (int childCount = toolbar.getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = toolbar.getChildAt(childCount);
            if (!(((C0694W0) childAt.getLayoutParams()).f9241b == 2 || childAt == toolbar.f4812a)) {
                toolbar.removeViewAt(childCount);
                toolbar.f4802N.add(childAt);
            }
        }
        toolbar.requestLayout();
        mVar.f8755L = true;
        mVar.f8768w.p(false);
        View view = toolbar.f4822r;
        if (view instanceof C0572b) {
            ((o) ((C0572b) view)).f8775a.onActionViewExpanded();
        }
        toolbar.u();
        return true;
    }

    public final void e() {
        if (this.f9238b != null) {
            k kVar = this.f9237a;
            if (kVar != null) {
                int size = kVar.f8730f.size();
                int i2 = 0;
                while (i2 < size) {
                    if (this.f9237a.getItem(i2) != this.f9238b) {
                        i2++;
                    } else {
                        return;
                    }
                }
            }
            i(this.f9238b);
        }
    }

    public final void g(Context context, k kVar) {
        m mVar;
        k kVar2 = this.f9237a;
        if (!(kVar2 == null || (mVar = this.f9238b) == null)) {
            kVar2.d(mVar);
        }
        this.f9237a = kVar;
    }

    public final boolean h() {
        return false;
    }

    public final boolean i(m mVar) {
        Toolbar toolbar = this.f9239c;
        View view = toolbar.f4822r;
        if (view instanceof C0572b) {
            ((o) ((C0572b) view)).f8775a.onActionViewCollapsed();
        }
        toolbar.removeView(toolbar.f4822r);
        toolbar.removeView(toolbar.f4821q);
        toolbar.f4822r = null;
        ArrayList arrayList = toolbar.f4802N;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            toolbar.addView((View) arrayList.get(size));
        }
        arrayList.clear();
        this.f9238b = null;
        toolbar.requestLayout();
        mVar.f8755L = false;
        mVar.f8768w.p(false);
        toolbar.u();
        return true;
    }

    public final boolean k(C0600C c3) {
        return false;
    }

    public final void a(k kVar, boolean z3) {
    }
}
