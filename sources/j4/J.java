package j4;

import A4.h;
import A4.i;
import R2.b;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.fragment.app.C0269a;
import androidx.fragment.app.I;
import b5.f;
import com.bumptech.glide.c;
import com.google.android.gms.internal.measurement.a;
import com.mtma.criminal.city.R;
import com.mtma.criminal.city.app.MyApplication;
import com.mtma.criminal.city.fragments.gangBase.v;
import d5.o;
import e5.C0505b;
import e5.C0509f;
import f.C0518i;
import java.util.Map;
import o3.d;

public final class J extends C0509f {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f8896a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ f f8897b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ C0626h f8898c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ J(C0626h hVar, View view, f fVar, int i2) {
        super(view);
        this.f8896a = i2;
        this.f8898c = hVar;
        this.f8897b = fVar;
    }

    public final void onClick(View view) {
        switch (this.f8896a) {
            case 0:
                super.onClick(view);
                I l6 = ((C0518i) view.getContext()).l();
                C0269a b6 = d.b(l6, l6);
                b6.f(R.id.activity_main_body_frame_layout, new v(this.f8898c.f9018b, this.f8897b.getId()), (String) null, 1);
                a.j(b6, false);
                return;
            default:
                super.onClick(view);
                int level = o.getMainStatesObject().getLevel();
                C0626h hVar = this.f8898c;
                if (level < 25) {
                    a.n(MyApplication.f7090a, R.string.level_lower_requirements, hVar.f9018b, (String) null);
                    return;
                } else if (!o.getGangObject().getId().equals("not_in_gang")) {
                    a.n(MyApplication.f7090a, R.string.already_in_gang, hVar.f9018b, (String) null);
                    return;
                } else if (o.getGangObject().getLeaveGangTimeInSeconds() + 7200 < c.f5744o) {
                    Map<String, Integer> requestsMap = o.getContactsObject().getRequestsMap();
                    f fVar = this.f8897b;
                    if (requestsMap.containsKey(b.V(2, fVar.getId()))) {
                        a.n(MyApplication.f7090a, R.string.dialog_already_current_player_has_gang_request_from_same_gang, hVar.f9018b, (String) null);
                        return;
                    }
                    String id = fVar.getId();
                    if (!hVar.f9019c) {
                        hVar.f9019c = true;
                        C0505b bVar = new C0505b(hVar.f9018b, R.layout.dialog_ok_cancle);
                        RelativeLayout relativeLayout = (RelativeLayout) bVar.findViewById(R.id.dialog_ok_cancel_confirm_button);
                        RelativeLayout relativeLayout2 = (RelativeLayout) bVar.findViewById(R.id.dialog_ok_cancel_cancel_button);
                        ((TextView) bVar.findViewById(R.id.dialog_ok_cancel_text)).setText(MyApplication.f7090a.getApplicationContext().getString(R.string.dialog_confirm_sending_gang_request));
                        ((LinearLayout) bVar.findViewById(R.id.dialog_ok_cancel_buttons_confirm_cancel_layout)).setVisibility(0);
                        ((TextView) bVar.findViewById(R.id.dialog_ok_cancel_confirm_button_text)).setText(R.string.button_ok);
                        relativeLayout.setOnClickListener(new i(hVar, relativeLayout, id, bVar, 7));
                        relativeLayout2.setOnClickListener(new h(hVar, relativeLayout2, bVar, 19));
                        bVar.show();
                        return;
                    }
                    return;
                } else {
                    a.n(MyApplication.f7090a, R.string.dialog_wait_two_hours_before_creating_new_gang, hVar.f9018b, (String) null);
                    return;
                }
        }
    }
}
