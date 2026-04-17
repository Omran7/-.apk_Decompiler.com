package B;

import K1.e;
import Y4.D;
import Y4.j;
import android.view.View;
import com.google.android.material.sidesheet.SideSheetBehavior;
import com.mtma.criminal.city.R;
import com.mtma.criminal.city.app.MyApplication;
import java.util.ArrayList;
import u4.g;

public final /* synthetic */ class n implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f161a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ int f162b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Object f163c;

    public /* synthetic */ n(Object obj, int i2, int i5) {
        this.f161a = i5;
        this.f163c = obj;
        this.f162b = i2;
    }

    public final void run() {
        String string;
        String str;
        long j6;
        String string2;
        String str2;
        long j7;
        switch (this.f161a) {
            case 0:
                ((b) this.f163c).g(this.f162b);
                return;
            case 1:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.f163c;
                View view = (View) sideSheetBehavior.f6496p.get();
                if (view != null) {
                    sideSheetBehavior.t(view, this.f162b, false);
                    return;
                }
                return;
            default:
                g gVar = (g) this.f163c;
                boolean z3 = gVar.f11934t1;
                int i2 = this.f162b;
                if (z3) {
                    gVar.f11938v1 = i2;
                    return;
                }
                ArrayList arrayList = gVar.f11898Y0;
                if (arrayList.size() % 3 == 0) {
                    int i5 = gVar.f11932s1 + 1;
                    gVar.f11932s1 = i5;
                    if (i5 != 21 || ((double) gVar.g1) <= ((double) gVar.f11906e1.getMainStatesObject().getHealthCurrent()) * 0.2d || ((double) gVar.f11913i1) <= ((double) gVar.f11908f1.getMainStatesObject().getHealthCurrent()) * 0.2d) {
                        arrayList.add(new j(MyApplication.f7090a.getApplicationContext().getString(R.string.fight_round_number, new Object[]{Integer.valueOf(gVar.f11932s1)}), true, true));
                        gVar.f11899Z0.notifyDataSetChanged();
                        gVar.f11891Q0.setSelection(arrayList.size() - 1);
                    } else {
                        gVar.f11917k1 = 2;
                        gVar.b0();
                        return;
                    }
                }
                if (i2 == 0) {
                    if (gVar.f11906e1.getArmingObject().getGunId() == -1 || D.s(gVar.f11906e1.getArmingObject().getGunId(), 0, 1).f4308s == 0) {
                        gVar.Y(gVar.f11895U0, true);
                    } else {
                        gVar.Y(gVar.f11895U0, false);
                    }
                    if (gVar.f11906e1.getArmingObject().getGunId() == -1) {
                        string2 = MyApplication.f7090a.getApplicationContext().getString(R.string.fight_with_no_weapon);
                    } else {
                        string2 = MyApplication.f7090a.getApplicationContext().getString(D.s(gVar.f11906e1.getArmingObject().getGunId(), 0, 1).f4295c);
                    }
                    String str3 = string2;
                    if (e.f0(gVar.f11906e1, gVar.f11908f1)) {
                        long A6 = e.A(gVar.f11906e1, gVar.f11908f1);
                        boolean b02 = e.b0(gVar.f11906e1);
                        if (b02) {
                            gVar.f11940w1++;
                            A6 *= 3;
                        }
                        long j8 = gVar.f11913i1;
                        if (A6 > j8) {
                            j7 = j8;
                        } else {
                            j7 = A6;
                        }
                        long j9 = j8 - j7;
                        gVar.f11913i1 = j9;
                        long j10 = j7;
                        gVar.e0(j9, gVar.f11915j1, gVar.f11884H0);
                        if (b02) {
                            str2 = MyApplication.f7090a.getApplicationContext().getString(R.string.fight_details_for_current_player_with_critical_hit, new Object[]{str3, Long.valueOf(j10)});
                        } else {
                            str2 = MyApplication.f7090a.getApplicationContext().getString(R.string.fight_details_for_current_player, new Object[]{str3, Long.valueOf(j10)});
                        }
                        gVar.c0(gVar.f11884H0, (double) j10);
                    } else {
                        str2 = MyApplication.f7090a.getApplicationContext().getString(R.string.fight_details_for_current_player_dodge, new Object[]{str3});
                    }
                    arrayList.add(new j(str2, true, false));
                    gVar.f11899Z0.notifyDataSetChanged();
                    gVar.f11891Q0.setSelection(arrayList.size() - 1);
                    if (gVar.f11913i1 > 0) {
                        gVar.d0(1);
                        return;
                    }
                    gVar.f11917k1 = 0;
                    gVar.b0();
                    return;
                }
                if (gVar.f11908f1.getArmingObject().getGunId() == -1 || D.s(gVar.f11908f1.getArmingObject().getGunId(), 0, 1).f4308s == 0) {
                    gVar.Y(gVar.f11894T0, true);
                } else {
                    gVar.Y(gVar.f11894T0, false);
                }
                if (gVar.f11908f1.getArmingObject().getGunId() == -1) {
                    string = MyApplication.f7090a.getApplicationContext().getString(R.string.fight_with_no_weapon);
                } else {
                    string = MyApplication.f7090a.getApplicationContext().getString(D.s(gVar.f11908f1.getArmingObject().getGunId(), 0, 1).f4295c);
                }
                String str4 = string;
                if (e.f0(gVar.f11908f1, gVar.f11906e1)) {
                    long A7 = e.A(gVar.f11908f1, gVar.f11906e1);
                    boolean b03 = e.b0(gVar.f11908f1);
                    if (b03) {
                        A7 *= 3;
                    }
                    long j11 = gVar.g1;
                    if (A7 > j11) {
                        j6 = j11;
                    } else {
                        j6 = A7;
                    }
                    long j12 = j11 - j6;
                    gVar.g1 = j12;
                    gVar.e0(j12, gVar.f11911h1, gVar.f11883G0);
                    if (b03) {
                        str = MyApplication.f7090a.getApplicationContext().getString(R.string.fight_details_for_other_player_with_critical_hit, new Object[]{str4, Long.valueOf(j6)});
                    } else {
                        str = MyApplication.f7090a.getApplicationContext().getString(R.string.fight_details_for_other_player, new Object[]{str4, Long.valueOf(j6)});
                    }
                    gVar.c0(gVar.f11883G0, (double) j6);
                } else {
                    str = MyApplication.f7090a.getApplicationContext().getString(R.string.fight_details_for_other_player_dodge, new Object[]{str4});
                }
                arrayList.add(new j(str, false, false));
                gVar.f11899Z0.notifyDataSetChanged();
                gVar.f11891Q0.setSelection(arrayList.size() - 1);
                if (gVar.g1 > 0) {
                    gVar.d0(0);
                    return;
                }
                gVar.f11917k1 = 1;
                gVar.b0();
                return;
        }
    }
}
