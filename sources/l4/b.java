package L4;

import Y4.D;
import android.view.View;
import androidx.fragment.app.C0269a;
import androidx.fragment.app.I;
import com.google.android.gms.internal.measurement.a;
import com.mtma.criminal.city.R;
import com.mtma.criminal.city.app.MyApplication;
import d5.o;
import e5.C0509f;
import f.C0518i;
import o3.d;
import p4.C0918a;

public final class b extends C0509f {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f1737a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ d f1738b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(d dVar, View view, int i2) {
        super(view);
        this.f1737a = i2;
        this.f1738b = dVar;
    }

    public final void onClick(View view) {
        switch (this.f1737a) {
            case 0:
                super.onClick(view);
                I l6 = ((C0518i) view.getContext()).l();
                C0269a b6 = d.b(l6, l6);
                b6.h(this.f1738b);
                b6.e(false);
                return;
            case 1:
                super.onClick(view);
                int gunId = o.getArmingObject().getGunId();
                d dVar = this.f1738b;
                if (gunId != -1) {
                    d.V(dVar, 0, true);
                    return;
                } else if (o.getLocationObject().getCurrentPlace() == 0) {
                    I l7 = ((C0518i) view.getContext()).l();
                    C0269a b7 = d.b(l7, l7);
                    b7.f(R.id.activity_main_body_frame_layout, new C0918a(0, 2, dVar.f1754d0), (String) null, 1);
                    b7.e(false);
                    R2.b.N0();
                    return;
                } else {
                    a.n(MyApplication.f7090a, R.string.dialog_can_not_access_city_market_outside_city_place, dVar.f1754d0, (String) null);
                    return;
                }
            case 2:
                super.onClick(view);
                int armorId = o.getArmingObject().getArmorId();
                d dVar2 = this.f1738b;
                if (armorId != -1) {
                    d.V(dVar2, 1, false);
                    return;
                } else if (o.getLocationObject().getCurrentPlace() == 0) {
                    I l8 = ((C0518i) view.getContext()).l();
                    C0269a b8 = d.b(l8, l8);
                    b8.f(R.id.activity_main_body_frame_layout, new C0918a(1, 2, dVar2.f1754d0), (String) null, 1);
                    b8.e(false);
                    R2.b.N0();
                    return;
                } else {
                    a.n(MyApplication.f7090a, R.string.dialog_can_not_access_city_market_outside_city_place, dVar2.f1754d0, (String) null);
                    return;
                }
            case 3:
                super.onClick(view);
                int specialEquipmentId = o.getArmingObject().getSpecialEquipmentId();
                d dVar3 = this.f1738b;
                if (specialEquipmentId == -1) {
                    a.n(MyApplication.f7090a, R.string.special_equipment_not_arming, dVar3.f1754d0, (String) null);
                    return;
                } else if (o.getLocationObject().getCurrentCity() == 0) {
                    d.V(dVar3, 15, false);
                    return;
                } else if (!D.s(o.getArmingObject().getSpecialEquipmentId(), 0, 1).f4315z.contains(0)) {
                    d.V(dVar3, 15, false);
                    return;
                } else if (o.getStockObject().getBagFreeSpace() - 1 < ((Integer) D.s(o.getArmingObject().getSpecialEquipmentId(), 0, 1).f4289A.get(D.s(o.getArmingObject().getSpecialEquipmentId(), 0, 1).f4315z.indexOf(0))).intValue()) {
                    a.n(MyApplication.f7090a, R.string.bag_will_effected_with_special_equipment_removing, dVar3.f1754d0, (String) null);
                    return;
                } else {
                    d.V(dVar3, 15, false);
                    return;
                }
            default:
                super.onClick(view);
                int bioChemicalId = o.getArmingObject().getBioChemicalId();
                d dVar4 = this.f1738b;
                if (bioChemicalId == -1) {
                    a.n(MyApplication.f7090a, R.string.bio_chemical_not_arming, dVar4.f1754d0, (String) null);
                    return;
                }
                d.V(dVar4, 16, false);
                return;
        }
    }
}
