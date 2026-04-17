package R4;

import R2.b;
import android.content.Context;
import android.database.DataSetObserver;
import com.mtma.criminal.city.R;
import d5.o;
import j4.C0641q;

public final class a extends DataSetObserver {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f2509a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ d f2510b;

    public /* synthetic */ a(d dVar, int i2) {
        this.f2509a = i2;
        this.f2510b = dVar;
    }

    public final void onChanged() {
        switch (this.f2509a) {
            case 0:
                super.onChanged();
                d dVar = this.f2510b;
                b.c(dVar.f2530f0, 1);
                int i2 = dVar.f2539o0.f9078c;
                dVar.f2542r0 = i2;
                dVar.f2530f0.setText(dVar.s(R.string.slash_between_two_number, Integer.valueOf(i2), Integer.valueOf(o.getStockObject().getLockerSpace())));
                return;
            default:
                super.onChanged();
                d dVar2 = this.f2510b;
                int i5 = dVar2.f2540p0.f9078c;
                dVar2.f2542r0 = dVar2.f2539o0.f9078c;
                boolean equals = ((Integer) dVar2.f2538n0.get(i5)).equals(Integer.valueOf(R.string.type_guns));
                Context context = dVar2.f2528d0;
                if (equals) {
                    dVar2.f2539o0 = new C0641q(context, dVar2.f2545v0, dVar2.f2542r0, 2);
                } else if (((Integer) dVar2.f2538n0.get(i5)).equals(Integer.valueOf(R.string.type_armors))) {
                    dVar2.f2539o0 = new C0641q(context, dVar2.f2546w0, dVar2.f2542r0, 2);
                } else if (((Integer) dVar2.f2538n0.get(i5)).equals(Integer.valueOf(R.string.type_herbs))) {
                    dVar2.f2539o0 = new C0641q(context, dVar2.f2547x0, dVar2.f2542r0, 2);
                } else if (((Integer) dVar2.f2538n0.get(i5)).equals(Integer.valueOf(R.string.type_cards))) {
                    dVar2.f2539o0 = new C0641q(context, dVar2.f2548y0, dVar2.f2542r0, 2);
                } else if (((Integer) dVar2.f2538n0.get(i5)).equals(Integer.valueOf(R.string.type_pharmacy))) {
                    dVar2.f2539o0 = new C0641q(context, dVar2.f2549z0, dVar2.f2542r0, 2);
                } else if (((Integer) dVar2.f2538n0.get(i5)).equals(Integer.valueOf(R.string.type_specialties))) {
                    dVar2.f2539o0 = new C0641q(context, dVar2.f2516A0, dVar2.f2542r0, 2);
                } else if (((Integer) dVar2.f2538n0.get(i5)).equals(Integer.valueOf(R.string.type_grocery))) {
                    dVar2.f2539o0 = new C0641q(context, dVar2.f2517B0, dVar2.f2542r0, 2);
                } else if (((Integer) dVar2.f2538n0.get(i5)).equals(Integer.valueOf(R.string.type_work))) {
                    dVar2.f2539o0 = new C0641q(context, dVar2.f2518C0, dVar2.f2542r0, 2);
                } else if (((Integer) dVar2.f2538n0.get(i5)).equals(Integer.valueOf(R.string.type_flower))) {
                    dVar2.f2539o0 = new C0641q(context, dVar2.f2519D0, dVar2.f2542r0, 2);
                } else if (((Integer) dVar2.f2538n0.get(i5)).equals(Integer.valueOf(R.string.type_food))) {
                    dVar2.f2539o0 = new C0641q(context, dVar2.f2520E0, dVar2.f2542r0, 2);
                } else if (((Integer) dVar2.f2538n0.get(i5)).equals(Integer.valueOf(R.string.type_plate))) {
                    dVar2.f2539o0 = new C0641q(context, dVar2.f2521F0, dVar2.f2542r0, 2);
                } else if (((Integer) dVar2.f2538n0.get(i5)).equals(Integer.valueOf(R.string.type_tunnel))) {
                    dVar2.f2539o0 = new C0641q(context, dVar2.f2522G0, dVar2.f2542r0, 2);
                } else if (((Integer) dVar2.f2538n0.get(i5)).equals(Integer.valueOf(R.string.type_shop))) {
                    dVar2.f2539o0 = new C0641q(context, dVar2.f2524I0, dVar2.f2542r0, 2);
                } else if (((Integer) dVar2.f2538n0.get(i5)).equals(Integer.valueOf(R.string.type_upgrade))) {
                    dVar2.f2539o0 = new C0641q(context, dVar2.f2523H0, dVar2.f2542r0, 2);
                } else if (((Integer) dVar2.f2538n0.get(i5)).equals(Integer.valueOf(R.string.type_upgraded_weapons))) {
                    dVar2.f2539o0 = new C0641q(context, dVar2.f2544u0, dVar2.f2542r0, 2);
                } else if (((Integer) dVar2.f2538n0.get(i5)).equals(Integer.valueOf(R.string.type_special_equipments))) {
                    dVar2.f2539o0 = new C0641q(context, dVar2.f2525J0, dVar2.f2542r0, 2);
                } else if (((Integer) dVar2.f2538n0.get(i5)).equals(Integer.valueOf(R.string.type_biochemical))) {
                    dVar2.f2539o0 = new C0641q(context, dVar2.f2526K0, dVar2.f2542r0, 2);
                } else if (((Integer) dVar2.f2538n0.get(i5)).equals(Integer.valueOf(R.string.type_pieces))) {
                    dVar2.f2539o0 = new C0641q(context, dVar2.L0, dVar2.f2542r0, 2);
                } else if (((Integer) dVar2.f2538n0.get(i5)).equals(Integer.valueOf(R.string.type_crime_rewards))) {
                    dVar2.f2539o0 = new C0641q(context, dVar2.f2527M0, dVar2.f2542r0, 2);
                } else {
                    dVar2.f2539o0 = new C0641q(context, dVar2.f2543t0, dVar2.f2542r0, 2);
                }
                dVar2.f2532h0.setAdapter(dVar2.f2539o0);
                dVar2.f2539o0.registerDataSetObserver(new a(dVar2, 0));
                dVar2.f2534j0.setVisibility(8);
                return;
        }
    }
}
