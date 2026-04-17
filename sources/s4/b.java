package S4;

import android.content.Context;
import android.database.DataSetObserver;
import com.mtma.criminal.city.R;
import j4.A0;
import java.util.ArrayList;

public final class b extends DataSetObserver {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f2715a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ d f2716b;

    public /* synthetic */ b(d dVar, int i2) {
        this.f2715a = i2;
        this.f2716b = dVar;
    }

    public final void onChanged() {
        switch (this.f2715a) {
            case 0:
                super.onChanged();
                d dVar = this.f2716b;
                if (dVar.O0 != 0) {
                    dVar.a0();
                } else {
                    int i2 = 0;
                    while (true) {
                        ArrayList arrayList = dVar.L0;
                        if (i2 < arrayList.size()) {
                            int i5 = 0;
                            while (i5 < ((ArrayList) arrayList.get(i2)).size()) {
                                if (!dVar.f2747r0.contains(((ArrayList) arrayList.get(i2)).get(i5))) {
                                    ((ArrayList) arrayList.get(i2)).remove(i5);
                                    i5--;
                                }
                                i5++;
                            }
                            i2++;
                        } else {
                            dVar.a0();
                        }
                    }
                }
                dVar.Y();
                return;
            default:
                super.onChanged();
                d dVar2 = this.f2716b;
                int i6 = dVar2.f2744o0.f9078c;
                dVar2.O0 = i6;
                boolean equals = ((Integer) dVar2.f2742m0.get(i6)).equals(Integer.valueOf(R.string.type_guns));
                Context context = dVar2.f2733d0;
                if (equals) {
                    dVar2.f2743n0 = new A0(context, dVar2.f2748t0, dVar2.f2731M0);
                } else if (((Integer) dVar2.f2742m0.get(dVar2.O0)).equals(Integer.valueOf(R.string.type_armors))) {
                    dVar2.f2743n0 = new A0(context, dVar2.f2749u0, dVar2.f2731M0);
                } else if (((Integer) dVar2.f2742m0.get(dVar2.O0)).equals(Integer.valueOf(R.string.type_herbs))) {
                    dVar2.f2743n0 = new A0(context, dVar2.f2750v0, dVar2.f2731M0);
                } else if (((Integer) dVar2.f2742m0.get(dVar2.O0)).equals(Integer.valueOf(R.string.type_cards))) {
                    dVar2.f2743n0 = new A0(context, dVar2.f2751w0, dVar2.f2731M0);
                } else if (((Integer) dVar2.f2742m0.get(dVar2.O0)).equals(Integer.valueOf(R.string.type_pharmacy))) {
                    dVar2.f2743n0 = new A0(context, dVar2.f2752x0, dVar2.f2731M0);
                } else if (((Integer) dVar2.f2742m0.get(dVar2.O0)).equals(Integer.valueOf(R.string.type_specialties))) {
                    dVar2.f2743n0 = new A0(context, dVar2.f2753y0, dVar2.f2731M0);
                } else if (((Integer) dVar2.f2742m0.get(dVar2.O0)).equals(Integer.valueOf(R.string.type_grocery))) {
                    dVar2.f2743n0 = new A0(context, dVar2.f2754z0, dVar2.f2731M0);
                } else if (((Integer) dVar2.f2742m0.get(dVar2.O0)).equals(Integer.valueOf(R.string.type_work))) {
                    dVar2.f2743n0 = new A0(context, dVar2.f2720A0, dVar2.f2731M0);
                } else if (((Integer) dVar2.f2742m0.get(dVar2.O0)).equals(Integer.valueOf(R.string.type_flower))) {
                    dVar2.f2743n0 = new A0(context, dVar2.f2721B0, dVar2.f2731M0);
                } else if (((Integer) dVar2.f2742m0.get(dVar2.O0)).equals(Integer.valueOf(R.string.type_food))) {
                    dVar2.f2743n0 = new A0(context, dVar2.f2722C0, dVar2.f2731M0);
                } else if (((Integer) dVar2.f2742m0.get(dVar2.O0)).equals(Integer.valueOf(R.string.type_plate))) {
                    dVar2.f2743n0 = new A0(context, dVar2.f2723D0, dVar2.f2731M0);
                } else if (((Integer) dVar2.f2742m0.get(dVar2.O0)).equals(Integer.valueOf(R.string.type_tunnel))) {
                    dVar2.f2743n0 = new A0(context, dVar2.f2724E0, dVar2.f2731M0);
                } else if (((Integer) dVar2.f2742m0.get(dVar2.O0)).equals(Integer.valueOf(R.string.type_shop))) {
                    dVar2.f2743n0 = new A0(context, dVar2.f2726G0, dVar2.f2731M0);
                } else if (((Integer) dVar2.f2742m0.get(dVar2.O0)).equals(Integer.valueOf(R.string.type_upgrade))) {
                    dVar2.f2743n0 = new A0(context, dVar2.f2725F0, dVar2.f2731M0);
                } else if (((Integer) dVar2.f2742m0.get(dVar2.O0)).equals(Integer.valueOf(R.string.type_upgraded_weapons))) {
                    dVar2.f2743n0 = new A0(context, dVar2.s0, dVar2.f2731M0);
                } else if (((Integer) dVar2.f2742m0.get(dVar2.O0)).equals(Integer.valueOf(R.string.type_special_equipments))) {
                    dVar2.f2743n0 = new A0(context, dVar2.f2727H0, dVar2.f2731M0);
                } else if (((Integer) dVar2.f2742m0.get(dVar2.O0)).equals(Integer.valueOf(R.string.type_biochemical))) {
                    dVar2.f2743n0 = new A0(context, dVar2.f2728I0, dVar2.f2731M0);
                } else if (((Integer) dVar2.f2742m0.get(dVar2.O0)).equals(Integer.valueOf(R.string.type_pieces))) {
                    dVar2.f2743n0 = new A0(context, dVar2.f2729J0, dVar2.f2731M0);
                } else if (((Integer) dVar2.f2742m0.get(dVar2.O0)).equals(Integer.valueOf(R.string.type_crime_rewards))) {
                    dVar2.f2743n0 = new A0(context, dVar2.f2730K0, dVar2.f2731M0);
                } else {
                    dVar2.a0();
                    dVar2.f2743n0 = new A0(context, dVar2.f2747r0, dVar2.f2731M0);
                }
                dVar2.f2737h0.setAdapter(dVar2.f2743n0);
                dVar2.f2743n0.registerDataSetObserver(new b(dVar2, 0));
                dVar2.f2739j0.setVisibility(8);
                return;
        }
    }
}
