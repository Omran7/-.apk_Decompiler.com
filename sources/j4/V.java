package j4;

import R2.b;
import Y4.l;
import Z4.k;
import android.content.Context;
import androidx.fragment.app.C0286s;
import com.google.android.gms.internal.measurement.a;
import com.mtma.criminal.city.R;
import com.mtma.criminal.city.app.MyApplication;
import com.mtma.criminal.city.fragments.gangBase.C0429i;
import com.mtma.criminal.city.utils.v0;
import f.C0518i;
import i3.C0587c;
import i3.C0588d;
import i3.q;

public final class V implements q {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ l f8952a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Z f8953b;

    public /* synthetic */ V(Z z3, l lVar) {
        this.f8953b = z3;
        this.f8952a = lVar;
    }

    public void a(k kVar) {
        boolean z3 = kVar.isAllProcessSuccess;
        Z z4 = this.f8953b;
        if (z3) {
            l lVar = this.f8952a;
            z4.remove(lVar);
            z4.notifyDataSetChanged();
            b.w(false);
            String string = MyApplication.f7090a.getApplicationContext().getString(R.string.toast_successfully);
            Context context = z4.f8965b;
            v0.e(context, string);
            b.M0(R.raw.add_new_item);
            for (C0286s sVar : ((C0518i) context).l().f5000c.v()) {
                if (sVar instanceof C0429i) {
                    ((C0429i) sVar).X(-1, lVar.f4385a);
                }
            }
            return;
        }
        b.w(false);
        if (!kVar.isPositionAllowedFireOtherPlayer) {
            a.n(MyApplication.f7090a, R.string.dialog_gang_position_not_allowed_to_take_action, z4.f8965b, (String) null);
            return;
        }
        a.n(MyApplication.f7090a, R.string.unknown_error_try_again, z4.f8965b, (String) null);
    }

    public void u(C0587c cVar) {
        Integer num = (Integer) cVar.f(Integer.class);
        if (num != null) {
            b.w(false);
            int intValue = num.intValue();
            Z z3 = this.f8953b;
            z3.d = intValue;
            Z.e(z3, this.f8952a);
        }
    }

    public void B(C0588d dVar) {
    }
}
