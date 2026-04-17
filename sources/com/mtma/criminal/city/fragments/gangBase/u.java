package com.mtma.criminal.city.fragments.gangBase;

import K1.e;
import R2.b;
import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.fragment.app.C0269a;
import com.bumptech.glide.c;
import com.google.android.gms.internal.measurement.a;
import com.mtma.criminal.city.R;
import com.mtma.criminal.city.app.MyApplication;
import d5.o;
import e5.C0505b;
import e5.C0509f;

public final class u extends C0509f {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f7275a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ v f7276b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u(v vVar, View view, int i2) {
        super(view);
        this.f7275a = i2;
        this.f7276b = vVar;
    }

    public final void onClick(View view) {
        switch (this.f7275a) {
            case 0:
                super.onClick(view);
                v vVar = this.f7276b;
                C0269a aVar = new C0269a(vVar.p());
                aVar.h(vVar);
                aVar.e(false);
                return;
            case 1:
                super.onClick(view);
                v vVar2 = this.f7276b;
                e.c(vVar2.f7285d0, vVar2.f7286e0, MyApplication.f7090a.getApplicationContext().getString(R.string.gang_id), MyApplication.f7090a.getApplicationContext().getString(R.string.gang_id_copied_successfully));
                return;
            case 2:
                super.onClick(view);
                v vVar3 = this.f7276b;
                w wVar = new w(vVar3.f7285d0, vVar3.f7286e0, vVar3.f7283G0.getSkillsLevel());
                C0269a aVar2 = new C0269a(vVar3.p());
                aVar2.f(R.id.activity_main_body_frame_layout, wVar, (String) null, 1);
                aVar2.c();
                aVar2.e(false);
                b.N0();
                return;
            case 3:
                super.onClick(view);
                a.n(MyApplication.f7090a, R.string.gang_feature_next_versions, this.f7276b.f7285d0, (String) null);
                return;
            case 4:
                super.onClick(view);
                v vVar4 = this.f7276b;
                G g = new G(vVar4.f7285d0, vVar4.f7283G0.getMembersWithPositions());
                C0269a aVar3 = new C0269a(vVar4.p());
                aVar3.f(R.id.activity_main_body_frame_layout, g, (String) null, 1);
                aVar3.c();
                aVar3.e(false);
                b.N0();
                return;
            case 5:
                super.onClick(view);
                a.n(MyApplication.f7090a, R.string.gang_feature_next_versions, this.f7276b.f7285d0, (String) null);
                return;
            default:
                super.onClick(view);
                int level = o.getMainStatesObject().getLevel();
                v vVar5 = this.f7276b;
                if (level < 25) {
                    a.n(MyApplication.f7090a, R.string.level_lower_requirements, vVar5.f7285d0, (String) null);
                    return;
                } else if (!o.getGangObject().getId().equals("not_in_gang")) {
                    a.n(MyApplication.f7090a, R.string.already_in_gang, vVar5.f7285d0, (String) null);
                    return;
                } else if (o.getGangObject().getLeaveGangTimeInSeconds() + 7200 < c.f5744o) {
                    boolean containsKey = o.getContactsObject().getRequestsMap().containsKey(b.V(2, vVar5.f7286e0));
                    Context context = vVar5.f7285d0;
                    if (containsKey) {
                        a.n(MyApplication.f7090a, R.string.dialog_already_current_player_has_gang_request_from_same_gang, context, (String) null);
                        return;
                    } else if (!vVar5.f7284H0) {
                        vVar5.f7284H0 = true;
                        C0505b bVar = new C0505b(context, R.layout.dialog_ok_cancle);
                        RelativeLayout relativeLayout = (RelativeLayout) bVar.findViewById(R.id.dialog_ok_cancel_confirm_button);
                        RelativeLayout relativeLayout2 = (RelativeLayout) bVar.findViewById(R.id.dialog_ok_cancel_cancel_button);
                        ((TextView) bVar.findViewById(R.id.dialog_ok_cancel_text)).setText(MyApplication.f7090a.getApplicationContext().getString(R.string.dialog_confirm_sending_gang_request));
                        ((LinearLayout) bVar.findViewById(R.id.dialog_ok_cancel_buttons_confirm_cancel_layout)).setVisibility(0);
                        ((TextView) bVar.findViewById(R.id.dialog_ok_cancel_confirm_button_text)).setText(R.string.button_ok);
                        relativeLayout.setOnClickListener(new t(vVar5, relativeLayout, bVar, 1));
                        relativeLayout2.setOnClickListener(new t(vVar5, relativeLayout2, bVar, 0));
                        bVar.show();
                        return;
                    } else {
                        return;
                    }
                } else {
                    a.n(MyApplication.f7090a, R.string.dialog_wait_two_hours_before_creating_new_gang, vVar5.f7285d0, (String) null);
                    return;
                }
        }
    }
}
