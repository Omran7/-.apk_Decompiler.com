package j4;

import K1.e;
import R2.b;
import S4.f;
import android.content.Context;
import androidx.fragment.app.C0269a;
import androidx.fragment.app.C0286s;
import androidx.fragment.app.I;
import b5.n;
import com.google.android.gms.internal.measurement.a;
import com.mtma.criminal.city.R;
import com.mtma.criminal.city.app.MyApplication;
import com.mtma.criminal.city.utils.q0;
import com.mtma.criminal.city.utils.v0;
import d5.o;
import f.C0518i;
import i3.C0587c;
import i3.C0588d;
import i3.q;
import java.util.ArrayList;
import java.util.Iterator;
import o3.d;

public final class F0 implements q, q0 {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f8872a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ M0 f8873b;

    public /* synthetic */ F0(M0 m02, int i2) {
        this.f8873b = m02;
        this.f8872a = i2;
    }

    public void a(boolean z3, n nVar) {
        M0 m02 = this.f8873b;
        if (z3) {
            b.w(false);
            b.M0(R.raw.add_new_item);
            v0.e(m02.f8919a, m02.getContext().getString(R.string.toast_successfully));
            Context context = m02.f8919a;
            C0518i iVar = (C0518i) context;
            Iterator it2 = iVar.l().f5000c.v().iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                C0286s sVar = (C0286s) it2.next();
                if (sVar instanceof f) {
                    I l6 = iVar.l();
                    l6.getClass();
                    C0269a aVar = new C0269a(l6);
                    aVar.h(sVar);
                    aVar.e(false);
                    break;
                }
            }
            I l7 = iVar.l();
            C0269a b6 = d.b(l7, l7);
            b6.i(R.id.fragment_store_frame_layout, new S4.d(context));
            b6.c();
            b6.e(false);
            b.N0();
            return;
        }
        b.w(false);
        int count = nVar.getCount();
        int i2 = this.f8872a;
        if (count < i2) {
            a.n(MyApplication.f7090a, R.string.no_enough_items, m02.f8919a, (String) null);
        } else if (o.getStockObject().getBagFreeSpace() < i2) {
            a.n(MyApplication.f7090a, R.string.no_enough_space_in_bag, m02.f8919a, (String) null);
        } else {
            a.n(MyApplication.f7090a, R.string.unknown_error_try_again, m02.f8919a, (String) null);
        }
    }

    public void u(C0587c cVar) {
        n nVar = (n) cVar.f(n.class);
        int i2 = this.f8872a;
        Integer valueOf = Integer.valueOf(i2);
        M0 m02 = this.f8873b;
        if (nVar == null || !nVar.getMuseumPositions().contains(valueOf)) {
            b.w(false);
            a.n(MyApplication.f7090a, R.string.items_not_exist_in_museum_anymore, m02.f8919a, (String) null);
            return;
        }
        if (nVar.getMuseumPositions().size() > 1) {
            nVar.getMuseumPositions().remove(valueOf);
        } else {
            nVar.setUsedInMuseum(false);
            nVar.setMuseumPositions((ArrayList<Integer>) null);
        }
        m02.f8923f.E("itemsInStock").E(e.y(nVar.getType())).E(e.x(nVar.getId(), nVar.getLevel())).I(nVar).addOnSuccessListener(new E0(this, i2, 0));
    }

    public void B(C0588d dVar) {
    }
}
