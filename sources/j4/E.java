package j4;

import P4.i;
import R2.b;
import Y4.D;
import Y4.h;
import android.content.Context;
import android.view.View;
import android.widget.RelativeLayout;
import androidx.fragment.app.C0269a;
import androidx.fragment.app.I;
import com.bumptech.glide.c;
import com.google.android.gms.internal.measurement.a;
import com.mtma.criminal.city.R;
import com.mtma.criminal.city.app.MyApplication;
import d5.o;
import e5.C0509f;
import f.C0518i;
import i3.C0590f;
import o3.d;

public final class E extends C0509f {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f8863a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ h f8864b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ G f8865c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ E(G g, RelativeLayout relativeLayout, h hVar, int i2) {
        super(relativeLayout);
        this.f8863a = i2;
        this.f8865c = g;
        this.f8864b = hVar;
    }

    public final void onClick(View view) {
        switch (this.f8863a) {
            case 0:
                super.onClick(view);
                G g = this.f8865c;
                int i2 = g.f8876c;
                h hVar = this.f8864b;
                Context context = g.f8875b;
                if (i2 == 0) {
                    if (o.getMoneyObject().getCash() < hVar.h) {
                        c.x0(context);
                        return;
                    } else {
                        G.a(g, hVar);
                        return;
                    }
                } else if (i2 != 1) {
                    return;
                } else {
                    if (hVar.f4360j) {
                        i iVar = new i(context, hVar);
                        I l6 = ((C0518i) context).l();
                        C0269a b6 = d.b(l6, l6);
                        b6.f(R.id.activity_main_body_frame_layout, iVar, (String) null, 1);
                        a.j(b6, false);
                        return;
                    }
                    b.w(true);
                    if (!com.bumptech.glide.d.j(o.getEstateObject()).f4359i || hVar.f4359i || D.s(o.getArmingObject().getSpecialEquipmentId(), 0, 1).f4313x != 2 || !D.s(o.getArmingObject().getSpecialEquipmentId(), 0, 1).f4315z.contains(0) || o.getStockObject().getBagFreeSpace() - 1 >= ((Integer) D.s(o.getArmingObject().getSpecialEquipmentId(), 0, 1).f4289A.get(D.s(o.getArmingObject().getSpecialEquipmentId(), 0, 1).f4315z.indexOf(0))).intValue()) {
                        ((C0590f) g.f8878f).E("allOwnEstates").q("used").j().d(new F(g, hVar, 2));
                        return;
                    }
                    b.w(false);
                    c.s0(context, MyApplication.f7090a.getApplicationContext().getString(R.string.bag_will_effected_with_moving_to_new_estate), MyApplication.f7090a.getApplicationContext().getString(R.string.alert));
                    return;
                }
            default:
                super.onClick(view);
                G g5 = this.f8865c;
                if (g5.f8876c == 1) {
                    h hVar2 = this.f8864b;
                    boolean t6 = a.t(hVar2.f4355b);
                    Context context2 = g5.f8875b;
                    if (!t6) {
                        a.k(MyApplication.f7090a, R.string.can_not_sell_house_not_owner, context2);
                        return;
                    } else if (hVar2.f4360j) {
                        a.k(MyApplication.f7090a, R.string.can_not_sell_house_lived_in, context2);
                        return;
                    } else if (hVar2.f4361k) {
                        a.k(MyApplication.f7090a, R.string.can_not_sell_house_spouse_lived_in, context2);
                        return;
                    } else if (hVar2.f4354a.equals("--defaultEstate")) {
                        a.k(MyApplication.f7090a, R.string.can_not_sell_default_estate, context2);
                        return;
                    } else {
                        G.a(g5, hVar2);
                        return;
                    }
                } else {
                    return;
                }
        }
    }
}
