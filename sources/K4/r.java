package K4;

import K1.e;
import R2.b;
import R4.g;
import S4.f;
import T4.d;
import U4.a;
import U4.c;
import Y4.D;
import android.content.Context;
import android.database.DataSetObserver;
import com.google.android.gms.internal.p002firebaseauthapi.zzaky;
import com.mtma.criminal.city.R;
import com.mtma.criminal.city.activities.MainActivity;
import com.mtma.criminal.city.app.MyApplication;
import d5.o;
import j4.A0;
import j4.M0;
import java.util.ArrayList;
import java.util.List;
import k.C0657D0;
import w4.C1088d;

public final class r extends DataSetObserver {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f1602a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f1603b;

    public /* synthetic */ r(Object obj, int i2) {
        this.f1602a = i2;
        this.f1603b = obj;
    }

    public final void onChanged() {
        switch (this.f1602a) {
            case 0:
                super.onChanged();
                v vVar = (v) this.f1603b;
                int i2 = vVar.f1639q0.f9078c;
                boolean equals = ((Integer) vVar.f1637o0.get(i2)).equals(Integer.valueOf(R.string.type_guns));
                String str = vVar.f1628f0;
                String str2 = vVar.f1627e0;
                Context context = vVar.f1626d0;
                if (equals) {
                    vVar.f1638p0 = new M0(context, (List) vVar.f1643v0, str2, str);
                } else if (((Integer) vVar.f1637o0.get(i2)).equals(Integer.valueOf(R.string.type_armors))) {
                    vVar.f1638p0 = new M0(context, (List) vVar.f1644w0, str2, str);
                } else if (((Integer) vVar.f1637o0.get(i2)).equals(Integer.valueOf(R.string.type_herbs))) {
                    vVar.f1638p0 = new M0(context, (List) vVar.f1645x0, str2, str);
                } else if (((Integer) vVar.f1637o0.get(i2)).equals(Integer.valueOf(R.string.type_cards))) {
                    vVar.f1638p0 = new M0(context, (List) vVar.f1646y0, str2, str);
                } else if (((Integer) vVar.f1637o0.get(i2)).equals(Integer.valueOf(R.string.type_pharmacy))) {
                    vVar.f1638p0 = new M0(context, (List) vVar.f1647z0, str2, str);
                } else if (((Integer) vVar.f1637o0.get(i2)).equals(Integer.valueOf(R.string.type_specialties))) {
                    vVar.f1638p0 = new M0(context, (List) vVar.f1613A0, str2, str);
                } else if (((Integer) vVar.f1637o0.get(i2)).equals(Integer.valueOf(R.string.type_grocery))) {
                    vVar.f1638p0 = new M0(context, (List) vVar.f1614B0, str2, str);
                } else if (((Integer) vVar.f1637o0.get(i2)).equals(Integer.valueOf(R.string.type_work))) {
                    vVar.f1638p0 = new M0(context, (List) vVar.f1615C0, str2, str);
                } else if (((Integer) vVar.f1637o0.get(i2)).equals(Integer.valueOf(R.string.type_flower))) {
                    vVar.f1638p0 = new M0(context, (List) vVar.f1616D0, str2, str);
                } else if (((Integer) vVar.f1637o0.get(i2)).equals(Integer.valueOf(R.string.type_food))) {
                    vVar.f1638p0 = new M0(context, (List) vVar.f1617E0, str2, str);
                } else if (((Integer) vVar.f1637o0.get(i2)).equals(Integer.valueOf(R.string.type_plate))) {
                    vVar.f1638p0 = new M0(context, (List) vVar.f1618F0, str2, str);
                } else if (((Integer) vVar.f1637o0.get(i2)).equals(Integer.valueOf(R.string.type_tunnel))) {
                    vVar.f1638p0 = new M0(context, (List) vVar.f1619G0, str2, str);
                } else if (((Integer) vVar.f1637o0.get(i2)).equals(Integer.valueOf(R.string.type_shop))) {
                    vVar.f1638p0 = new M0(context, (List) vVar.f1621I0, str2, str);
                } else if (((Integer) vVar.f1637o0.get(i2)).equals(Integer.valueOf(R.string.type_upgrade))) {
                    vVar.f1638p0 = new M0(context, (List) vVar.f1620H0, str2, str);
                } else if (((Integer) vVar.f1637o0.get(i2)).equals(Integer.valueOf(R.string.type_upgraded_weapons))) {
                    vVar.f1638p0 = new M0(context, (List) vVar.f1642u0, str2, str);
                } else if (((Integer) vVar.f1637o0.get(i2)).equals(Integer.valueOf(R.string.type_special_equipments))) {
                    vVar.f1638p0 = new M0(context, (List) vVar.f1622J0, str2, str);
                } else if (((Integer) vVar.f1637o0.get(i2)).equals(Integer.valueOf(R.string.type_biochemical))) {
                    vVar.f1638p0 = new M0(context, (List) vVar.f1623K0, str2, str);
                } else if (((Integer) vVar.f1637o0.get(i2)).equals(Integer.valueOf(R.string.type_pieces))) {
                    vVar.f1638p0 = new M0(context, (List) vVar.L0, str2, str);
                } else if (((Integer) vVar.f1637o0.get(i2)).equals(Integer.valueOf(R.string.type_crime_rewards))) {
                    vVar.f1638p0 = new M0(context, (List) vVar.f1624M0, str2, str);
                } else {
                    vVar.f1638p0 = new M0(context, (List) vVar.f1641t0, str2, str);
                }
                vVar.f1631i0.setAdapter(vVar.f1638p0);
                vVar.f1633k0.setVisibility(8);
                return;
            case 1:
                super.onChanged();
                g gVar = (g) this.f1603b;
                int i5 = gVar.f2577p0.f9078c;
                boolean equals2 = ((Integer) gVar.f2575n0.get(i5)).equals(Integer.valueOf(R.string.type_guns));
                MainActivity mainActivity = gVar.f2565d0;
                if (equals2) {
                    gVar.f2576o0 = new A0(mainActivity, gVar.f2581u0);
                } else if (((Integer) gVar.f2575n0.get(i5)).equals(Integer.valueOf(R.string.type_armors))) {
                    gVar.f2576o0 = new A0(mainActivity, gVar.f2582v0);
                } else if (((Integer) gVar.f2575n0.get(i5)).equals(Integer.valueOf(R.string.type_herbs))) {
                    gVar.f2576o0 = new A0(mainActivity, gVar.f2583w0);
                } else if (((Integer) gVar.f2575n0.get(i5)).equals(Integer.valueOf(R.string.type_cards))) {
                    gVar.f2576o0 = new A0(mainActivity, gVar.f2584x0);
                } else if (((Integer) gVar.f2575n0.get(i5)).equals(Integer.valueOf(R.string.type_pharmacy))) {
                    gVar.f2576o0 = new A0(mainActivity, gVar.f2585y0);
                } else if (((Integer) gVar.f2575n0.get(i5)).equals(Integer.valueOf(R.string.type_specialties))) {
                    gVar.f2576o0 = new A0(mainActivity, gVar.f2586z0);
                } else if (((Integer) gVar.f2575n0.get(i5)).equals(Integer.valueOf(R.string.type_grocery))) {
                    gVar.f2576o0 = new A0(mainActivity, gVar.f2554A0);
                } else if (((Integer) gVar.f2575n0.get(i5)).equals(Integer.valueOf(R.string.type_work))) {
                    gVar.f2576o0 = new A0(mainActivity, gVar.f2555B0);
                } else if (((Integer) gVar.f2575n0.get(i5)).equals(Integer.valueOf(R.string.type_flower))) {
                    gVar.f2576o0 = new A0(mainActivity, gVar.f2556C0);
                } else if (((Integer) gVar.f2575n0.get(i5)).equals(Integer.valueOf(R.string.type_food))) {
                    gVar.f2576o0 = new A0(mainActivity, gVar.f2557D0);
                } else if (((Integer) gVar.f2575n0.get(i5)).equals(Integer.valueOf(R.string.type_plate))) {
                    gVar.f2576o0 = new A0(mainActivity, gVar.f2558E0);
                } else if (((Integer) gVar.f2575n0.get(i5)).equals(Integer.valueOf(R.string.type_tunnel))) {
                    gVar.f2576o0 = new A0(mainActivity, gVar.f2559F0);
                } else if (((Integer) gVar.f2575n0.get(i5)).equals(Integer.valueOf(R.string.type_shop))) {
                    gVar.f2576o0 = new A0(mainActivity, gVar.f2561H0);
                } else if (((Integer) gVar.f2575n0.get(i5)).equals(Integer.valueOf(R.string.type_upgrade))) {
                    gVar.f2576o0 = new A0(mainActivity, gVar.f2560G0);
                } else if (((Integer) gVar.f2575n0.get(i5)).equals(Integer.valueOf(R.string.type_upgraded_weapons))) {
                    gVar.f2576o0 = new A0(mainActivity, gVar.f2580t0);
                } else if (((Integer) gVar.f2575n0.get(i5)).equals(Integer.valueOf(R.string.type_special_equipments))) {
                    gVar.f2576o0 = new A0(mainActivity, gVar.f2562I0);
                } else if (((Integer) gVar.f2575n0.get(i5)).equals(Integer.valueOf(R.string.type_biochemical))) {
                    gVar.f2576o0 = new A0(mainActivity, gVar.f2563J0);
                } else if (((Integer) gVar.f2575n0.get(i5)).equals(Integer.valueOf(R.string.type_pieces))) {
                    gVar.f2576o0 = new A0(mainActivity, gVar.f2564K0);
                } else if (((Integer) gVar.f2575n0.get(i5)).equals(Integer.valueOf(R.string.type_crime_rewards))) {
                    gVar.f2576o0 = new A0(mainActivity, gVar.L0);
                } else {
                    gVar.f2576o0 = new A0(mainActivity, gVar.s0);
                }
                gVar.f2569h0.setAdapter(gVar.f2576o0);
                gVar.f2571j0.setVisibility(8);
                return;
            case 2:
                super.onChanged();
                f fVar = (f) this.f1603b;
                int i6 = fVar.f2780p0.f9078c;
                boolean equals3 = ((Integer) fVar.f2778n0.get(i6)).equals(Integer.valueOf(R.string.type_guns));
                Context context2 = fVar.f2768d0;
                if (equals3) {
                    fVar.f2779o0 = new M0(context2, fVar.f2783t0, fVar.f2781q0);
                } else if (((Integer) fVar.f2778n0.get(i6)).equals(Integer.valueOf(R.string.type_armors))) {
                    fVar.f2779o0 = new M0(context2, fVar.f2784u0, fVar.f2781q0);
                } else if (((Integer) fVar.f2778n0.get(i6)).equals(Integer.valueOf(R.string.type_herbs))) {
                    fVar.f2779o0 = new M0(context2, fVar.f2785v0, fVar.f2781q0);
                } else if (((Integer) fVar.f2778n0.get(i6)).equals(Integer.valueOf(R.string.type_cards))) {
                    fVar.f2779o0 = new M0(context2, fVar.f2786w0, fVar.f2781q0);
                } else if (((Integer) fVar.f2778n0.get(i6)).equals(Integer.valueOf(R.string.type_pharmacy))) {
                    fVar.f2779o0 = new M0(context2, fVar.f2787x0, fVar.f2781q0);
                } else if (((Integer) fVar.f2778n0.get(i6)).equals(Integer.valueOf(R.string.type_specialties))) {
                    fVar.f2779o0 = new M0(context2, fVar.f2788y0, fVar.f2781q0);
                } else if (((Integer) fVar.f2778n0.get(i6)).equals(Integer.valueOf(R.string.type_grocery))) {
                    fVar.f2779o0 = new M0(context2, fVar.f2789z0, fVar.f2781q0);
                } else if (((Integer) fVar.f2778n0.get(i6)).equals(Integer.valueOf(R.string.type_work))) {
                    fVar.f2779o0 = new M0(context2, fVar.f2757A0, fVar.f2781q0);
                } else if (((Integer) fVar.f2778n0.get(i6)).equals(Integer.valueOf(R.string.type_flower))) {
                    fVar.f2779o0 = new M0(context2, fVar.f2758B0, fVar.f2781q0);
                } else if (((Integer) fVar.f2778n0.get(i6)).equals(Integer.valueOf(R.string.type_food))) {
                    fVar.f2779o0 = new M0(context2, fVar.f2759C0, fVar.f2781q0);
                } else if (((Integer) fVar.f2778n0.get(i6)).equals(Integer.valueOf(R.string.type_plate))) {
                    fVar.f2779o0 = new M0(context2, fVar.f2760D0, fVar.f2781q0);
                } else if (((Integer) fVar.f2778n0.get(i6)).equals(Integer.valueOf(R.string.type_tunnel))) {
                    fVar.f2779o0 = new M0(context2, fVar.f2761E0, fVar.f2781q0);
                } else if (((Integer) fVar.f2778n0.get(i6)).equals(Integer.valueOf(R.string.type_shop))) {
                    fVar.f2779o0 = new M0(context2, fVar.f2763G0, fVar.f2781q0);
                } else if (((Integer) fVar.f2778n0.get(i6)).equals(Integer.valueOf(R.string.type_upgrade))) {
                    fVar.f2779o0 = new M0(context2, fVar.f2762F0, fVar.f2781q0);
                } else if (((Integer) fVar.f2778n0.get(i6)).equals(Integer.valueOf(R.string.type_upgraded_weapons))) {
                    fVar.f2779o0 = new M0(context2, fVar.s0, fVar.f2781q0);
                } else if (((Integer) fVar.f2778n0.get(i6)).equals(Integer.valueOf(R.string.type_special_equipments))) {
                    fVar.f2779o0 = new M0(context2, fVar.f2764H0, fVar.f2781q0);
                } else if (((Integer) fVar.f2778n0.get(i6)).equals(Integer.valueOf(R.string.type_biochemical))) {
                    fVar.f2779o0 = new M0(context2, fVar.f2765I0, fVar.f2781q0);
                } else if (((Integer) fVar.f2778n0.get(i6)).equals(Integer.valueOf(R.string.type_pieces))) {
                    fVar.f2779o0 = new M0(context2, fVar.f2766J0, fVar.f2781q0);
                } else if (((Integer) fVar.f2778n0.get(i6)).equals(Integer.valueOf(R.string.type_crime_rewards))) {
                    fVar.f2779o0 = new M0(context2, fVar.f2767K0, fVar.f2781q0);
                } else {
                    fVar.f2779o0 = new M0(context2, fVar.f2782r0, fVar.f2781q0);
                }
                fVar.f2772h0.setAdapter(fVar.f2779o0);
                fVar.f2774j0.setVisibility(8);
                return;
            case 3:
                super.onChanged();
                d dVar = (d) this.f1603b;
                dVar.f3596m0.clear();
                ArrayList arrayList = dVar.f3596m0;
                ArrayList arrayList2 = dVar.f3595l0;
                arrayList.addAll(arrayList2);
                arrayList.remove(arrayList.size() - 1);
                dVar.f3598o0.notifyDataSetChanged();
                b.c(dVar.f3592i0, 1);
                int i7 = 0;
                for (int i8 = 0; i8 < arrayList2.size(); i8++) {
                    if (((D) arrayList2.get(i8)).f4305p) {
                        i7++;
                    }
                }
                dVar.f3592i0.setText(dVar.s(R.string.slash_between_two_number, Integer.valueOf(i7), Integer.valueOf(o.getStockObject().getMuseumSpace())));
                return;
            case 4:
                super.onChanged();
                T4.f fVar2 = (T4.f) this.f1603b;
                int i9 = fVar2.f3629q0.f9078c;
                boolean equals4 = ((Integer) fVar2.f3627o0.get(i9)).equals(Integer.valueOf(R.string.type_guns));
                int i10 = fVar2.f3617e0;
                Context context3 = fVar2.f3616d0;
                if (equals4) {
                    fVar2.f3628p0 = new M0(context3, (List) fVar2.f3632u0, fVar2.f3630r0, i10);
                } else if (((Integer) fVar2.f3627o0.get(i9)).equals(Integer.valueOf(R.string.type_armors))) {
                    fVar2.f3628p0 = new M0(context3, (List) fVar2.f3633v0, fVar2.f3630r0, i10);
                } else if (((Integer) fVar2.f3627o0.get(i9)).equals(Integer.valueOf(R.string.type_herbs))) {
                    fVar2.f3628p0 = new M0(context3, (List) fVar2.f3634w0, fVar2.f3630r0, i10);
                } else if (((Integer) fVar2.f3627o0.get(i9)).equals(Integer.valueOf(R.string.type_cards))) {
                    fVar2.f3628p0 = new M0(context3, (List) fVar2.f3635x0, fVar2.f3630r0, i10);
                } else if (((Integer) fVar2.f3627o0.get(i9)).equals(Integer.valueOf(R.string.type_pharmacy))) {
                    fVar2.f3628p0 = new M0(context3, (List) fVar2.f3636y0, fVar2.f3630r0, i10);
                } else if (((Integer) fVar2.f3627o0.get(i9)).equals(Integer.valueOf(R.string.type_specialties))) {
                    fVar2.f3628p0 = new M0(context3, (List) fVar2.f3637z0, fVar2.f3630r0, i10);
                } else if (((Integer) fVar2.f3627o0.get(i9)).equals(Integer.valueOf(R.string.type_grocery))) {
                    fVar2.f3628p0 = new M0(context3, (List) fVar2.f3605A0, fVar2.f3630r0, i10);
                } else if (((Integer) fVar2.f3627o0.get(i9)).equals(Integer.valueOf(R.string.type_work))) {
                    fVar2.f3628p0 = new M0(context3, (List) fVar2.f3606B0, fVar2.f3630r0, i10);
                } else if (((Integer) fVar2.f3627o0.get(i9)).equals(Integer.valueOf(R.string.type_flower))) {
                    fVar2.f3628p0 = new M0(context3, (List) fVar2.f3607C0, fVar2.f3630r0, i10);
                } else if (((Integer) fVar2.f3627o0.get(i9)).equals(Integer.valueOf(R.string.type_food))) {
                    fVar2.f3628p0 = new M0(context3, (List) fVar2.f3608D0, fVar2.f3630r0, i10);
                } else if (((Integer) fVar2.f3627o0.get(i9)).equals(Integer.valueOf(R.string.type_plate))) {
                    fVar2.f3628p0 = new M0(context3, (List) fVar2.f3609E0, fVar2.f3630r0, i10);
                } else if (((Integer) fVar2.f3627o0.get(i9)).equals(Integer.valueOf(R.string.type_tunnel))) {
                    fVar2.f3628p0 = new M0(context3, (List) fVar2.f3610F0, fVar2.f3630r0, i10);
                } else if (((Integer) fVar2.f3627o0.get(i9)).equals(Integer.valueOf(R.string.type_shop))) {
                    fVar2.f3628p0 = new M0(context3, (List) fVar2.f3612H0, fVar2.f3630r0, i10);
                } else if (((Integer) fVar2.f3627o0.get(i9)).equals(Integer.valueOf(R.string.type_upgrade))) {
                    fVar2.f3628p0 = new M0(context3, (List) fVar2.f3611G0, fVar2.f3630r0, i10);
                } else if (((Integer) fVar2.f3627o0.get(i9)).equals(Integer.valueOf(R.string.type_upgraded_weapons))) {
                    fVar2.f3628p0 = new M0(context3, (List) fVar2.f3631t0, fVar2.f3630r0, i10);
                } else if (((Integer) fVar2.f3627o0.get(i9)).equals(Integer.valueOf(R.string.type_special_equipments))) {
                    fVar2.f3628p0 = new M0(context3, (List) fVar2.f3613I0, fVar2.f3630r0, i10);
                } else if (((Integer) fVar2.f3627o0.get(i9)).equals(Integer.valueOf(R.string.type_biochemical))) {
                    fVar2.f3628p0 = new M0(context3, (List) fVar2.f3614J0, fVar2.f3630r0, i10);
                } else if (((Integer) fVar2.f3627o0.get(i9)).equals(Integer.valueOf(R.string.type_pieces))) {
                    fVar2.f3628p0 = new M0(context3, (List) fVar2.f3615K0, fVar2.f3630r0, i10);
                } else if (((Integer) fVar2.f3627o0.get(i9)).equals(Integer.valueOf(R.string.type_crime_rewards))) {
                    fVar2.f3628p0 = new M0(context3, (List) fVar2.L0, fVar2.f3630r0, i10);
                } else {
                    fVar2.f3628p0 = new M0(context3, (List) fVar2.s0, fVar2.f3630r0, i10);
                }
                fVar2.f3621i0.setAdapter(fVar2.f3628p0);
                fVar2.f3623k0.setVisibility(8);
                return;
            case 5:
                super.onChanged();
                a aVar = (a) this.f1603b;
                b.c(aVar.f3719h0, 1);
                int i11 = 0;
                int i12 = 0;
                while (true) {
                    ArrayList arrayList3 = aVar.f3720i0;
                    if (i11 < arrayList3.size()) {
                        if (((D) arrayList3.get(i11)).h > 0) {
                            i12++;
                        }
                        i11++;
                    } else {
                        aVar.f3719h0.setText(aVar.s(R.string.slash_between_two_number, Integer.valueOf(i12), Integer.valueOf(o.getStockObject().getStallSpace())));
                        return;
                    }
                }
            case zzaky.zzf.zzf /*6*/:
                super.onChanged();
                c cVar = (c) this.f1603b;
                int i13 = cVar.f3748q0.f9078c;
                if (((Integer) cVar.f3746o0.get(i13)).equals(Integer.valueOf(R.string.type_guns))) {
                    cVar.f3747p0 = new M0(cVar.f3735d0, (List) cVar.f3750t0, 3, cVar.f3736e0);
                } else if (((Integer) cVar.f3746o0.get(i13)).equals(Integer.valueOf(R.string.type_armors))) {
                    cVar.f3747p0 = new M0(cVar.f3735d0, (List) cVar.f3751u0, 3, cVar.f3736e0);
                } else if (((Integer) cVar.f3746o0.get(i13)).equals(Integer.valueOf(R.string.type_herbs))) {
                    cVar.f3747p0 = new M0(cVar.f3735d0, (List) cVar.f3752v0, 3, cVar.f3736e0);
                } else if (((Integer) cVar.f3746o0.get(i13)).equals(Integer.valueOf(R.string.type_cards))) {
                    cVar.f3747p0 = new M0(cVar.f3735d0, (List) cVar.f3753w0, 3, cVar.f3736e0);
                } else if (((Integer) cVar.f3746o0.get(i13)).equals(Integer.valueOf(R.string.type_pharmacy))) {
                    cVar.f3747p0 = new M0(cVar.f3735d0, (List) cVar.f3754x0, 3, cVar.f3736e0);
                } else if (((Integer) cVar.f3746o0.get(i13)).equals(Integer.valueOf(R.string.type_specialties))) {
                    cVar.f3747p0 = new M0(cVar.f3735d0, (List) cVar.f3755y0, 3, cVar.f3736e0);
                } else if (((Integer) cVar.f3746o0.get(i13)).equals(Integer.valueOf(R.string.type_grocery))) {
                    cVar.f3747p0 = new M0(cVar.f3735d0, (List) cVar.f3756z0, 3, cVar.f3736e0);
                } else if (((Integer) cVar.f3746o0.get(i13)).equals(Integer.valueOf(R.string.type_work))) {
                    cVar.f3747p0 = new M0(cVar.f3735d0, (List) cVar.f3724A0, 3, cVar.f3736e0);
                } else if (((Integer) cVar.f3746o0.get(i13)).equals(Integer.valueOf(R.string.type_flower))) {
                    cVar.f3747p0 = new M0(cVar.f3735d0, (List) cVar.f3725B0, 3, cVar.f3736e0);
                } else if (((Integer) cVar.f3746o0.get(i13)).equals(Integer.valueOf(R.string.type_food))) {
                    cVar.f3747p0 = new M0(cVar.f3735d0, (List) cVar.f3726C0, 3, cVar.f3736e0);
                } else if (((Integer) cVar.f3746o0.get(i13)).equals(Integer.valueOf(R.string.type_plate))) {
                    cVar.f3747p0 = new M0(cVar.f3735d0, (List) cVar.f3727D0, 3, cVar.f3736e0);
                } else if (((Integer) cVar.f3746o0.get(i13)).equals(Integer.valueOf(R.string.type_tunnel))) {
                    cVar.f3747p0 = new M0(cVar.f3735d0, (List) cVar.f3728E0, 3, cVar.f3736e0);
                } else if (((Integer) cVar.f3746o0.get(i13)).equals(Integer.valueOf(R.string.type_shop))) {
                    cVar.f3747p0 = new M0(cVar.f3735d0, (List) cVar.f3730G0, 3, cVar.f3736e0);
                } else if (((Integer) cVar.f3746o0.get(i13)).equals(Integer.valueOf(R.string.type_upgrade))) {
                    cVar.f3747p0 = new M0(cVar.f3735d0, (List) cVar.f3729F0, 3, cVar.f3736e0);
                } else if (((Integer) cVar.f3746o0.get(i13)).equals(Integer.valueOf(R.string.type_upgraded_weapons))) {
                    cVar.f3747p0 = new M0(cVar.f3735d0, (List) cVar.s0, 3, cVar.f3736e0);
                } else if (((Integer) cVar.f3746o0.get(i13)).equals(Integer.valueOf(R.string.type_special_equipments))) {
                    cVar.f3747p0 = new M0(cVar.f3735d0, (List) cVar.f3731H0, 3, cVar.f3736e0);
                } else if (((Integer) cVar.f3746o0.get(i13)).equals(Integer.valueOf(R.string.type_biochemical))) {
                    cVar.f3747p0 = new M0(cVar.f3735d0, (List) cVar.f3732I0, 3, cVar.f3736e0);
                } else if (((Integer) cVar.f3746o0.get(i13)).equals(Integer.valueOf(R.string.type_pieces))) {
                    cVar.f3747p0 = new M0(cVar.f3735d0, (List) cVar.f3733J0, 3, cVar.f3736e0);
                } else if (((Integer) cVar.f3746o0.get(i13)).equals(Integer.valueOf(R.string.type_crime_rewards))) {
                    cVar.f3747p0 = new M0(cVar.f3735d0, (List) cVar.f3734K0, 3, cVar.f3736e0);
                } else {
                    cVar.f3747p0 = new M0(cVar.f3735d0, (List) cVar.f3749r0, 3, cVar.f3736e0);
                }
                cVar.f3740i0.setAdapter(cVar.f3747p0);
                cVar.f3742k0.setVisibility(8);
                return;
            case zzaky.zzf.zzg /*7*/:
                super.onChanged();
                com.mtma.criminal.city.fragments.profile.skills.a aVar2 = (com.mtma.criminal.city.fragments.profile.skills.a) this.f1603b;
                b.c(aVar2.f7338a.f1334g0, 1);
                aVar2.f7338a.f1334g0.setText(MyApplication.f7090a.getApplicationContext().getString(R.string.slash_between_two_number, new Object[]{Integer.valueOf(e.q()), Integer.valueOf(o.getSkillsObject().getMeritsFromMedals() + o.getSkillsObject().getMeritsFromChecksOrItems())}));
                return;
            case 8:
                C0657D0 d02 = (C0657D0) this.f1603b;
                if (d02.f9161I.isShowing()) {
                    d02.c();
                    return;
                }
                return;
            default:
                super.onChanged();
                boolean n02 = I1.b.n0(o.getGymObject().getSelectedGymLesson() + 1);
                C1088d dVar2 = (C1088d) this.f1603b;
                if (n02) {
                    dVar2.f12455E0.setVisibility(4);
                    return;
                }
                dVar2.f12455E0.setVisibility(0);
                dVar2.W();
                return;
        }
    }

    public void onInvalidated() {
        switch (this.f1602a) {
            case 8:
                ((C0657D0) this.f1603b).dismiss();
                return;
            default:
                super.onInvalidated();
                return;
        }
    }
}
