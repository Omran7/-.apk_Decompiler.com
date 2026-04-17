package l4;

import I1.b;
import K1.e;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.bumptech.glide.c;
import com.bumptech.glide.d;
import com.google.android.gms.internal.measurement.a;
import com.mtma.criminal.city.R;
import com.mtma.criminal.city.activities.m;
import com.mtma.criminal.city.utils.J;
import com.mtma.criminal.city.utils.b0;
import d5.k;
import d5.o;
import e5.C0505b;
import i3.C0585a;
import i3.C0587c;

public final class h implements J, C0585a {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f9775a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ i f9776b;

    public /* synthetic */ h(i iVar, int i2) {
        this.f9775a = i2;
        this.f9776b = iVar;
    }

    public void h(boolean z3, k kVar) {
        switch (this.f9775a) {
            case 0:
                this.f9776b.a0();
                return;
            default:
                i.W(this.f9776b);
                return;
        }
    }

    public void k(C0587c cVar) {
        try {
            if (cVar.f8279b.F().equals("vipEndTime")) {
                o.getMainStatesObject().setVipEndTime(((Long) cVar.f(Long.class)).longValue());
                d.e();
            }
        } catch (Exception e6) {
            a.r("Exception from try-catch inside ", "i", " class in addListenerToMainStatesValues method.", "i", e6);
        }
    }

    public void q(C0587c cVar) {
        String F = cVar.f8279b.F();
        try {
            boolean equals = F.equals("nickName");
            Class<String> cls = String.class;
            i iVar = this.f9776b;
            if (equals) {
                String str = (String) cVar.f(cls);
                o.getMainStatesObject().setNickName(str);
                iVar.f9809g0.setText(str);
            } else if (F.equals("profilePicUrl")) {
                String str2 = (String) cVar.f(cls);
                o.getMainStatesObject().setProfilePicUrl(str2);
                b.v(iVar.f9810h0, str2);
            } else {
                Class<Long> cls2 = Long.class;
                if (F.equals("vipEndTime")) {
                    long longValue = ((Long) cVar.f(cls2)).longValue();
                    o.getMainStatesObject().setVipEndTime(longValue);
                    if (R2.b.k0(longValue)) {
                        iVar.f9810h0.setBackgroundResource(R.drawable.profile_pic_frame_vip);
                        iVar.f9811i0.setVisibility(0);
                    } else {
                        iVar.f9810h0.setBackgroundResource(R.drawable.profile_pic_frame_default);
                        iVar.f9811i0.setVisibility(8);
                        C0505b bVar = new C0505b(iVar.f9806d0, R.layout.dialog_ok_cancle);
                        RelativeLayout relativeLayout = (RelativeLayout) bVar.findViewById(R.id.dialog_ok_cancel_ok_button);
                        ((TextView) bVar.findViewById(R.id.dialog_ok_cancel_text)).setText(R.string.vip_time_end);
                        relativeLayout.setVisibility(0);
                        relativeLayout.setOnClickListener(new m(relativeLayout, bVar, 1));
                        bVar.show();
                    }
                    iVar.a0();
                    return;
                }
                Class<Integer> cls3 = Integer.class;
                if (F.equals("level")) {
                    int intValue = ((Integer) cVar.f(cls3)).intValue();
                    o.getMainStatesObject().setLevel(intValue);
                    iVar.f9787H0.setText(String.valueOf(intValue));
                    iVar.f9804b1 = false;
                    C0505b bVar2 = iVar.f9803a1;
                    if (bVar2 == null || !bVar2.isShowing()) {
                        iVar.f9803a1 = c.q(iVar.f9806d0, intValue);
                    } else {
                        ((TextView) iVar.f9803a1.findViewById(R.id.dialog_new_level_number)).setText(String.valueOf(intValue));
                        R2.b.M0(R.raw.level_up);
                    }
                    b0.b();
                    iVar.Z();
                    iVar.a0();
                    iVar.X();
                    i.W(iVar);
                    iVar.Y();
                } else if (F.equals("levelCurrentExperience")) {
                    o.getMainStatesObject().setLevelCurrentExperience(((Long) cVar.f(cls2)).longValue());
                    iVar.Z();
                    if (iVar.f9804b1) {
                        C0505b bVar3 = iVar.f9803a1;
                        if (bVar3 != null && bVar3.isShowing()) {
                            iVar.f9803a1.dismiss();
                            iVar.f9804b1 = false;
                            return;
                        }
                        return;
                    }
                    iVar.f9804b1 = true;
                } else if (F.equals("powerCurrent")) {
                    o.getMainStatesObject().setPowerCurrent(((Integer) cVar.f(cls3)).intValue());
                    iVar.a0();
                } else if (F.equals("powerChangeTimeInMilli")) {
                    Long l6 = (Long) cVar.f(cls2);
                    l6.getClass();
                    o.getMainStatesObject().setPowerChangeTimeInMilli(l6);
                    if (iVar.f9817o0.isShown()) {
                        iVar.f9796S0 = 120;
                        iVar.f9817o0.setText(e.L("mm:ss", 120));
                    }
                } else if (F.equals("courageCurrent")) {
                    o.getMainStatesObject().setCourageCurrent(((Integer) cVar.f(cls3)).intValue());
                    iVar.X();
                } else if (F.equals("courageChangeTimeInMilli")) {
                    Long l7 = (Long) cVar.f(cls2);
                    l7.getClass();
                    o.getMainStatesObject().setCourageChangeTimeInMilli(l7);
                    if (iVar.f9821t0.isShown()) {
                        iVar.f9797T0 = 120;
                        iVar.f9821t0.setText(e.L("mm:ss", 120));
                    }
                } else if (F.equals("nobilityCurrent")) {
                    o.getMainStatesObject().setNobilityCurrent(((Integer) cVar.f(cls3)).intValue());
                    i.W(iVar);
                } else if (F.equals("nobilityChangeTimeInMilli")) {
                    Long l8 = (Long) cVar.f(cls2);
                    l8.getClass();
                    o.getMainStatesObject().setNobilityChangeTimeInMilli(l8);
                    if (iVar.f9826y0.isShown()) {
                        iVar.f9798U0 = 300;
                        iVar.f9826y0.setText(e.L("mm:ss", 300));
                    }
                } else if (F.equals("healthCurrent")) {
                    o.getMainStatesObject().setHealthCurrent((long) ((Integer) cVar.f(cls3)).intValue());
                    iVar.Y();
                } else if (F.equals("healthChangeTimeInMilli")) {
                    Long l9 = (Long) cVar.f(cls2);
                    l9.getClass();
                    o.getMainStatesObject().setHealthChangeTimeInMilli(l9);
                    if (iVar.f9784E0.isShown()) {
                        iVar.f9799V0 = 120.0d;
                        iVar.f9784E0.setText(e.K(120.0d));
                    }
                } else if (F.equals("lastSeen")) {
                    long longValue2 = ((Long) cVar.f(cls2)).longValue() / 1000;
                    o.getMainStatesObject().setLastSeen(longValue2);
                    c.f5744o = longValue2;
                }
            }
        } catch (Exception e6) {
            a.r("Exception from try-catch inside ", "i", " class in addListenerToMainStatesValues method.", "i", e6);
        }
    }

    public void i(C0587c cVar) {
    }
}
