package k;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.SparseBooleanArray;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.widget.ActionMenuView;
import com.mtma.criminal.city.R;
import j.C0600C;
import j.k;
import j.m;
import j.n;
import j.s;
import j.v;
import j.w;
import j.x;
import j.y;
import j4.p0;
import java.util.ArrayList;

/* renamed from: k.j  reason: case insensitive filesystem */
public final class C0718j implements w {

    /* renamed from: A  reason: collision with root package name */
    public final SparseBooleanArray f9318A = new SparseBooleanArray();

    /* renamed from: B  reason: collision with root package name */
    public C0710f f9319B;

    /* renamed from: C  reason: collision with root package name */
    public C0710f f9320C;

    /* renamed from: D  reason: collision with root package name */
    public C0714h f9321D;

    /* renamed from: E  reason: collision with root package name */
    public C0712g f9322E;
    public final p0 F = new p0(this, 4);

    /* renamed from: a  reason: collision with root package name */
    public final Context f9323a;

    /* renamed from: b  reason: collision with root package name */
    public Context f9324b;

    /* renamed from: c  reason: collision with root package name */
    public k f9325c;
    public final LayoutInflater d;

    /* renamed from: e  reason: collision with root package name */
    public v f9326e;

    /* renamed from: f  reason: collision with root package name */
    public final int f9327f = R.layout.abc_action_menu_layout;

    /* renamed from: p  reason: collision with root package name */
    public final int f9328p = R.layout.abc_action_menu_item_layout;

    /* renamed from: q  reason: collision with root package name */
    public y f9329q;

    /* renamed from: r  reason: collision with root package name */
    public C0716i f9330r;

    /* renamed from: s  reason: collision with root package name */
    public Drawable f9331s;

    /* renamed from: t  reason: collision with root package name */
    public boolean f9332t;

    /* renamed from: u  reason: collision with root package name */
    public boolean f9333u;

    /* renamed from: v  reason: collision with root package name */
    public boolean f9334v;

    /* renamed from: w  reason: collision with root package name */
    public int f9335w;

    /* renamed from: x  reason: collision with root package name */
    public int f9336x;

    /* renamed from: y  reason: collision with root package name */
    public int f9337y;

    /* renamed from: z  reason: collision with root package name */
    public boolean f9338z;

    public C0718j(Context context) {
        this.f9323a = context;
        this.d = LayoutInflater.from(context);
    }

    public final void a(k kVar, boolean z3) {
        c();
        C0710f fVar = this.f9320C;
        if (fVar != null && fVar.b()) {
            fVar.f8788i.dismiss();
        }
        v vVar = this.f9326e;
        if (vVar != null) {
            vVar.a(kVar, z3);
        }
    }

    public final View b(m mVar, View view, ViewGroup viewGroup) {
        x xVar;
        View actionView = mVar.getActionView();
        int i2 = 0;
        if (actionView == null || mVar.e()) {
            if (view instanceof x) {
                xVar = (x) view;
            } else {
                xVar = (x) this.d.inflate(this.f9328p, viewGroup, false);
            }
            xVar.b(mVar);
            ActionMenuItemView actionMenuItemView = (ActionMenuItemView) xVar;
            actionMenuItemView.setItemInvoker((ActionMenuView) this.f9329q);
            if (this.f9322E == null) {
                this.f9322E = new C0712g(this);
            }
            actionMenuItemView.setPopupCallback(this.f9322E);
            actionView = (View) xVar;
        }
        if (mVar.f8755L) {
            i2 = 8;
        }
        actionView.setVisibility(i2);
        ViewGroup.LayoutParams layoutParams = actionView.getLayoutParams();
        ((ActionMenuView) viewGroup).getClass();
        if (!(layoutParams instanceof C0722l)) {
            actionView.setLayoutParams(ActionMenuView.k(layoutParams));
        }
        return actionView;
    }

    public final boolean c() {
        y yVar;
        C0714h hVar = this.f9321D;
        if (hVar == null || (yVar = this.f9329q) == null) {
            C0710f fVar = this.f9319B;
            if (fVar == null) {
                return false;
            }
            if (fVar.b()) {
                fVar.f8788i.dismiss();
            }
            return true;
        }
        ((View) yVar).removeCallbacks(hVar);
        this.f9321D = null;
        return true;
    }

    public final boolean d(m mVar) {
        return false;
    }

    public final void e() {
        y yVar;
        int i2;
        m mVar;
        ViewGroup viewGroup = (ViewGroup) this.f9329q;
        ArrayList arrayList = null;
        boolean z3 = false;
        if (viewGroup != null) {
            k kVar = this.f9325c;
            if (kVar != null) {
                kVar.i();
                ArrayList l6 = this.f9325c.l();
                int size = l6.size();
                i2 = 0;
                for (int i5 = 0; i5 < size; i5++) {
                    m mVar2 = (m) l6.get(i5);
                    if (mVar2.f()) {
                        View childAt = viewGroup.getChildAt(i2);
                        if (childAt instanceof x) {
                            mVar = ((x) childAt).getItemData();
                        } else {
                            mVar = null;
                        }
                        View b6 = b(mVar2, childAt, viewGroup);
                        if (mVar2 != mVar) {
                            b6.setPressed(false);
                            b6.jumpDrawablesToCurrentState();
                        }
                        if (b6 != childAt) {
                            ViewGroup viewGroup2 = (ViewGroup) b6.getParent();
                            if (viewGroup2 != null) {
                                viewGroup2.removeView(b6);
                            }
                            ((ViewGroup) this.f9329q).addView(b6, i2);
                        }
                        i2++;
                    }
                }
            } else {
                i2 = 0;
            }
            while (i2 < viewGroup.getChildCount()) {
                if (viewGroup.getChildAt(i2) == this.f9330r) {
                    i2++;
                } else {
                    viewGroup.removeViewAt(i2);
                }
            }
        }
        ((View) this.f9329q).requestLayout();
        k kVar2 = this.f9325c;
        if (kVar2 != null) {
            kVar2.i();
            ArrayList arrayList2 = kVar2.f8733r;
            int size2 = arrayList2.size();
            for (int i6 = 0; i6 < size2; i6++) {
                n nVar = ((m) arrayList2.get(i6)).f8753J;
            }
        }
        k kVar3 = this.f9325c;
        if (kVar3 != null) {
            kVar3.i();
            arrayList = kVar3.f8734s;
        }
        if (this.f9333u && arrayList != null) {
            int size3 = arrayList.size();
            if (size3 == 1) {
                z3 = !((m) arrayList.get(0)).f8755L;
            } else if (size3 > 0) {
                z3 = true;
            }
        }
        if (z3) {
            if (this.f9330r == null) {
                this.f9330r = new C0716i(this, this.f9323a);
            }
            ViewGroup viewGroup3 = (ViewGroup) this.f9330r.getParent();
            if (viewGroup3 != this.f9329q) {
                if (viewGroup3 != null) {
                    viewGroup3.removeView(this.f9330r);
                }
                ActionMenuView actionMenuView = (ActionMenuView) this.f9329q;
                C0716i iVar = this.f9330r;
                actionMenuView.getClass();
                C0722l j6 = ActionMenuView.j();
                j6.f9339a = true;
                actionMenuView.addView(iVar, j6);
            }
        } else {
            C0716i iVar2 = this.f9330r;
            if (iVar2 != null && iVar2.getParent() == (yVar = this.f9329q)) {
                ((ViewGroup) yVar).removeView(this.f9330r);
            }
        }
        ((ActionMenuView) this.f9329q).setOverflowReserved(this.f9333u);
    }

    public final boolean f() {
        C0710f fVar = this.f9319B;
        if (fVar == null || !fVar.b()) {
            return false;
        }
        return true;
    }

    public final void g(Context context, k kVar) {
        this.f9324b = context;
        LayoutInflater.from(context);
        this.f9325c = kVar;
        Resources resources = context.getResources();
        if (!this.f9334v) {
            this.f9333u = true;
        }
        int i2 = 2;
        this.f9335w = context.getResources().getDisplayMetrics().widthPixels / 2;
        Configuration configuration = context.getResources().getConfiguration();
        int i5 = configuration.screenWidthDp;
        int i6 = configuration.screenHeightDp;
        if (configuration.smallestScreenWidthDp > 600 || i5 > 600 || ((i5 > 960 && i6 > 720) || (i5 > 720 && i6 > 960))) {
            i2 = 5;
        } else if (i5 >= 500 || ((i5 > 640 && i6 > 480) || (i5 > 480 && i6 > 640))) {
            i2 = 4;
        } else if (i5 >= 360) {
            i2 = 3;
        }
        this.f9337y = i2;
        int i7 = this.f9335w;
        if (this.f9333u) {
            if (this.f9330r == null) {
                C0716i iVar = new C0716i(this, this.f9323a);
                this.f9330r = iVar;
                if (this.f9332t) {
                    iVar.setImageDrawable(this.f9331s);
                    this.f9331s = null;
                    this.f9332t = false;
                }
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                this.f9330r.measure(makeMeasureSpec, makeMeasureSpec);
            }
            i7 -= this.f9330r.getMeasuredWidth();
        } else {
            this.f9330r = null;
        }
        this.f9336x = i7;
        float f6 = resources.getDisplayMetrics().density;
    }

    public final boolean h() {
        int i2;
        ArrayList arrayList;
        int i5;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        k kVar = this.f9325c;
        if (kVar != null) {
            arrayList = kVar.l();
            i2 = arrayList.size();
        } else {
            i2 = 0;
            arrayList = null;
        }
        int i6 = this.f9337y;
        int i7 = this.f9336x;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        ViewGroup viewGroup = (ViewGroup) this.f9329q;
        int i8 = 0;
        boolean z7 = false;
        int i9 = 0;
        int i10 = 0;
        while (true) {
            i5 = 2;
            z3 = true;
            if (i8 >= i2) {
                break;
            }
            m mVar = (m) arrayList.get(i8);
            int i11 = mVar.f8751H;
            if ((i11 & 2) == 2) {
                i9++;
            } else if ((i11 & 1) == 1) {
                i10++;
            } else {
                z7 = true;
            }
            if (this.f9338z && mVar.f8755L) {
                i6 = 0;
            }
            i8++;
        }
        if (this.f9333u && (z7 || i10 + i9 > i6)) {
            i6--;
        }
        int i12 = i6 - i9;
        SparseBooleanArray sparseBooleanArray = this.f9318A;
        sparseBooleanArray.clear();
        int i13 = 0;
        int i14 = 0;
        while (i13 < i2) {
            m mVar2 = (m) arrayList.get(i13);
            int i15 = mVar2.f8751H;
            if ((i15 & 2) == i5) {
                z4 = z3;
            } else {
                z4 = false;
            }
            int i16 = mVar2.f8757b;
            if (z4) {
                View b6 = b(mVar2, (View) null, viewGroup);
                b6.measure(makeMeasureSpec, makeMeasureSpec);
                int measuredWidth = b6.getMeasuredWidth();
                i7 -= measuredWidth;
                if (i14 == 0) {
                    i14 = measuredWidth;
                }
                if (i16 != 0) {
                    sparseBooleanArray.put(i16, z3);
                }
                mVar2.g(z3);
            } else if ((i15 & true) == z3) {
                boolean z8 = sparseBooleanArray.get(i16);
                if ((i12 > 0 || z8) && i7 > 0) {
                    z5 = z3;
                } else {
                    z5 = false;
                }
                if (z5) {
                    View b7 = b(mVar2, (View) null, viewGroup);
                    b7.measure(makeMeasureSpec, makeMeasureSpec);
                    int measuredWidth2 = b7.getMeasuredWidth();
                    i7 -= measuredWidth2;
                    if (i14 == 0) {
                        i14 = measuredWidth2;
                    }
                    if (i7 + i14 > 0) {
                        z6 = true;
                    } else {
                        z6 = false;
                    }
                    z5 &= z6;
                }
                if (z5 && i16 != 0) {
                    sparseBooleanArray.put(i16, true);
                } else if (z8) {
                    sparseBooleanArray.put(i16, false);
                    for (int i17 = 0; i17 < i13; i17++) {
                        m mVar3 = (m) arrayList.get(i17);
                        if (mVar3.f8757b == i16) {
                            if (mVar3.f()) {
                                i12++;
                            }
                            mVar3.g(false);
                        }
                    }
                }
                if (z5) {
                    i12--;
                }
                mVar2.g(z5);
            } else {
                mVar2.g(false);
                i13++;
                i5 = 2;
                z3 = true;
            }
            i13++;
            i5 = 2;
            z3 = true;
        }
        return z3;
    }

    public final boolean i(m mVar) {
        return false;
    }

    public final void j(v vVar) {
        throw null;
    }

    public final boolean k(C0600C c3) {
        boolean z3;
        if (!c3.hasVisibleItems()) {
            return false;
        }
        C0600C c6 = c3;
        while (true) {
            k kVar = c6.f8662I;
            if (kVar == this.f9325c) {
                break;
            }
            c6 = kVar;
        }
        ViewGroup viewGroup = (ViewGroup) this.f9329q;
        View view = null;
        if (viewGroup != null) {
            int childCount = viewGroup.getChildCount();
            int i2 = 0;
            while (true) {
                if (i2 >= childCount) {
                    break;
                }
                View childAt = viewGroup.getChildAt(i2);
                if ((childAt instanceof x) && ((x) childAt).getItemData() == c6.f8663J) {
                    view = childAt;
                    break;
                }
                i2++;
            }
        }
        if (view == null) {
            return false;
        }
        c3.f8663J.getClass();
        int size = c3.f8730f.size();
        int i5 = 0;
        while (true) {
            if (i5 >= size) {
                z3 = false;
                break;
            }
            MenuItem item = c3.getItem(i5);
            if (item.isVisible() && item.getIcon() != null) {
                z3 = true;
                break;
            }
            i5++;
        }
        C0710f fVar = new C0710f(this, this.f9324b, c3, view);
        this.f9320C = fVar;
        fVar.g = z3;
        s sVar = fVar.f8788i;
        if (sVar != null) {
            sVar.o(z3);
        }
        C0710f fVar2 = this.f9320C;
        if (!fVar2.b()) {
            if (fVar2.f8786e != null) {
                fVar2.d(0, 0, false, false);
            } else {
                throw new IllegalStateException("MenuPopupHelper cannot be used without an anchor");
            }
        }
        v vVar = this.f9326e;
        if (vVar != null) {
            vVar.p(c3);
        }
        return true;
    }

    public final boolean l() {
        k kVar;
        if (!this.f9333u || f() || (kVar = this.f9325c) == null || this.f9329q == null || this.f9321D != null) {
            return false;
        }
        kVar.i();
        if (kVar.f8734s.isEmpty()) {
            return false;
        }
        C0714h hVar = new C0714h(this, new C0710f(this, this.f9324b, this.f9325c, (View) this.f9330r));
        this.f9321D = hVar;
        ((View) this.f9329q).post(hVar);
        return true;
    }
}
