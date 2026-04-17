package u4;

import K1.e;
import R2.b;
import Z2.d;
import android.preference.PreferenceManager;
import android.support.v4.media.session.a;
import android.view.View;
import com.mtma.criminal.city.R;
import com.mtma.criminal.city.app.MyApplication;
import com.mtma.criminal.city.utils.C0444n;
import com.mtma.criminal.city.utils.C0448s;
import com.mtma.criminal.city.utils.C0449t;
import d5.u;
import e5.C0509f;

public final class f extends C0509f {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f11875a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ g f11876b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(g gVar, View view, int i2) {
        super(view);
        this.f11875a = i2;
        this.f11876b = gVar;
    }

    public final void onClick(View view) {
        String str;
        String str2;
        String str3;
        switch (this.f11875a) {
            case 0:
                super.onClick(view);
                g gVar = this.f11876b;
                gVar.f11927p1.dismiss();
                gVar.f11929q1 = false;
                gVar.a0();
                return;
            case 1:
                super.onClick(view);
                g gVar2 = this.f11876b;
                if (gVar2.f11931r1 == 800) {
                    PreferenceManager.getDefaultSharedPreferences(gVar2.f11903d0).edit().putInt("fight_speed", 400).apply();
                    gVar2.X0.setImageResource(R.drawable.fight_speed_two);
                    gVar2.f11931r1 = 400;
                    return;
                }
                PreferenceManager.getDefaultSharedPreferences(gVar2.f11903d0).edit().putInt("fight_speed", 800).apply();
                gVar2.X0.setImageResource(R.drawable.fight_speed_one);
                gVar2.f11931r1 = 800;
                return;
            case 2:
                super.onClick(view);
                g gVar3 = this.f11876b;
                if (gVar3.f11925o1 && gVar3.f11923n1 && gVar3.f11917k1 == 0) {
                    b.w(true);
                    int healthCurrent = (int) (gVar3.f11906e1.getMainStatesObject().getHealthCurrent() - gVar3.g1);
                    boolean g02 = e.g0(gVar3.f11906e1.getSkillsObject(), gVar3.f11906e1.getArmingObject(), gVar3.f11906e1.getSchoolObject());
                    u uVar = gVar3.f11906e1;
                    u uVar2 = gVar3.f11908f1;
                    d dVar = new d(this, g02, 1);
                    long W5 = e.W(1800, uVar, uVar2);
                    if (g02) {
                        str = MyApplication.f7090a.getApplicationContext().getString(R.string.fight_reason_for_hospital_when_win, new Object[]{uVar.getMainStatesObject().getNickName()});
                    } else {
                        str = MyApplication.f7090a.getApplicationContext().getString(R.string.fight_reason_for_hospital_when_win, new Object[]{MyApplication.f7090a.getApplicationContext().getString(R.string.unknown)});
                    }
                    a.b(uVar2.getAccountObject().getId(), W5, str, new C0449t(healthCurrent, dVar));
                    return;
                }
                return;
            case 3:
                super.onClick(view);
                g gVar4 = this.f11876b;
                if (gVar4.f11925o1 && gVar4.f11921m1 && gVar4.f11917k1 == 0) {
                    b.w(true);
                    int healthCurrent2 = (int) (gVar4.f11906e1.getMainStatesObject().getHealthCurrent() - gVar4.g1);
                    boolean g03 = e.g0(gVar4.f11906e1.getSkillsObject(), gVar4.f11906e1.getArmingObject(), gVar4.f11906e1.getSchoolObject());
                    u uVar3 = gVar4.f11906e1;
                    u uVar4 = gVar4.f11908f1;
                    d dVar2 = new d(this, g03, 2);
                    long W6 = e.W(900, uVar3, uVar4);
                    if (g03) {
                        str2 = MyApplication.f7090a.getApplicationContext().getString(R.string.fight_reason_for_hospital_when_win, new Object[]{uVar3.getMainStatesObject().getNickName()});
                    } else {
                        str2 = MyApplication.f7090a.getApplicationContext().getString(R.string.fight_reason_for_hospital_when_win, new Object[]{MyApplication.f7090a.getApplicationContext().getString(R.string.unknown)});
                    }
                    a.b(uVar4.getAccountObject().getId(), W6, str2, new C0444n(healthCurrent2, uVar4, uVar3, dVar2, 0));
                    return;
                }
                return;
            default:
                super.onClick(view);
                g gVar5 = this.f11876b;
                if (gVar5.f11925o1) {
                    int i2 = gVar5.f11917k1;
                    if (i2 == 1) {
                        gVar5.a0();
                        return;
                    } else if (!gVar5.f11919l1) {
                        return;
                    } else {
                        if (i2 == 2) {
                            b.w(true);
                            int healthCurrent3 = (int) (gVar5.f11906e1.getMainStatesObject().getHealthCurrent() - gVar5.g1);
                            u uVar5 = gVar5.f11906e1;
                            u uVar6 = gVar5.f11908f1;
                            long j6 = gVar5.f11913i1;
                            F3.e eVar = new F3.e((Object) this, 22);
                            if (j6 < uVar6.getMainStatesObject().getHealthCurrent()) {
                                com.bumptech.glide.d.j1(j6, uVar6.getAccountObject().getId(), (C1034c) null);
                            }
                            if (healthCurrent3 > 0) {
                                com.bumptech.glide.d.m1(3, -healthCurrent3, false, new F3.b(uVar5, uVar6, eVar, 3));
                                return;
                            }
                            long level = ((long) uVar5.getMainStatesObject().getLevel()) + 10 + ((long) (uVar6.getMainStatesObject().getLevel() - uVar5.getMainStatesObject().getLevel()));
                            com.bumptech.glide.d.l1(level, new C0448s(eVar, level, 0));
                            return;
                        }
                        b.w(true);
                        int healthCurrent4 = (int) (gVar5.f11906e1.getMainStatesObject().getHealthCurrent() - gVar5.g1);
                        boolean g04 = e.g0(gVar5.f11906e1.getSkillsObject(), gVar5.f11906e1.getArmingObject(), gVar5.f11906e1.getSchoolObject());
                        u uVar7 = gVar5.f11906e1;
                        u uVar8 = gVar5.f11908f1;
                        d dVar3 = new d(this, g04, 3);
                        long W7 = e.W(600, uVar7, uVar8);
                        if (g04) {
                            str3 = MyApplication.f7090a.getApplicationContext().getString(R.string.fight_reason_for_hospital_when_win, new Object[]{uVar7.getMainStatesObject().getNickName()});
                        } else {
                            str3 = MyApplication.f7090a.getApplicationContext().getString(R.string.fight_reason_for_hospital_when_win, new Object[]{MyApplication.f7090a.getApplicationContext().getString(R.string.unknown)});
                        }
                        a.b(uVar8.getAccountObject().getId(), W7, str3, new C0444n(healthCurrent4, uVar7, uVar8, dVar3, 1));
                        return;
                    }
                } else {
                    return;
                }
        }
    }
}
