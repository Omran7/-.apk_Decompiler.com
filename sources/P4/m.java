package P4;

import J4.a;
import K4.o;
import R2.b;
import android.content.Context;
import android.view.View;
import android.widget.AdapterView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.fragment.app.C0269a;
import androidx.fragment.app.C0286s;
import b5.h;
import b5.k;
import com.google.android.gms.internal.p002firebaseauthapi.zzaky;
import com.mtma.criminal.city.R;
import com.mtma.criminal.city.activities.MainActivity;
import com.mtma.criminal.city.fragments.gangBase.s;
import e5.C0505b;
import k.C0657D0;
import k.C0676N;
import k.C0682Q;
import v2.r;
import y4.C1118e;

public final class m implements AdapterView.OnItemClickListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f2256a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f2257b;

    public /* synthetic */ m(Object obj, int i2) {
        this.f2256a = i2;
        this.f2257b = obj;
    }

    public final void onItemClick(AdapterView adapterView, View view, int i2, long j6) {
        C0286s sVar;
        Object obj;
        int selectedItemPosition;
        C0286s sVar2;
        switch (this.f2256a) {
            case 0:
                s sVar3 = (s) this.f2257b;
                if (i2 == 0) {
                    s.V(sVar3, new a(sVar3.f2272d0, 2));
                    return;
                } else if (i2 == 1) {
                    s.V(sVar3, new i(sVar3.f2272d0, 0));
                    return;
                } else if (i2 == 2) {
                    s.W(sVar3, 2);
                    return;
                } else if (i2 == 3) {
                    s.W(sVar3, 3);
                    return;
                } else if (i2 == 4) {
                    s.V(sVar3, new w(sVar3.f2272d0));
                    return;
                } else if (i2 == 5) {
                    s.V(sVar3, new g(sVar3.f2272d0));
                    return;
                } else if (i2 == 6) {
                    s.V(sVar3, new d(sVar3.f2272d0));
                    return;
                } else if (i2 == 7 && !sVar3.f2282n0) {
                    sVar3.f2282n0 = true;
                    C0505b bVar = new C0505b(sVar3.f2272d0, R.layout.dialog_ok_cancle);
                    RelativeLayout relativeLayout = (RelativeLayout) bVar.findViewById(R.id.dialog_ok_cancel_confirm_button);
                    RelativeLayout relativeLayout2 = (RelativeLayout) bVar.findViewById(R.id.dialog_ok_cancel_cancel_button);
                    ((LinearLayout) bVar.findViewById(R.id.dialog_ok_cancel_buttons_confirm_cancel_layout)).setVisibility(0);
                    ((TextView) bVar.findViewById(R.id.dialog_ok_cancel_confirm_button_text)).setText(R.string.button_ok);
                    ((TextView) bVar.findViewById(R.id.dialog_ok_cancel_text)).setText(R.string.confirm_sign_out);
                    relativeLayout.setOnClickListener(new p(sVar3, relativeLayout, bVar, 1));
                    relativeLayout2.setOnClickListener(new p(sVar3, relativeLayout2, bVar, 2));
                    bVar.show();
                    return;
                } else {
                    return;
                }
            case 1:
                s sVar4 = (s) this.f2257b;
                int type = ((k) sVar4.f7269j0.get(i2)).getType();
                String idString = ((k) sVar4.f7269j0.get(i2)).getIdString();
                switch (type) {
                    case 0:
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case zzaky.zzf.zzf /*6*/:
                    case zzaky.zzf.zzg /*7*/:
                    case 8:
                    case 9:
                    case 10:
                        boolean t6 = com.google.android.gms.internal.measurement.a.t(idString);
                        Context context = sVar4.f7263d0;
                        if (!t6) {
                            sVar = new K4.k(context, idString);
                            break;
                        } else {
                            sVar = new o(context);
                            break;
                        }
                    default:
                        sVar = null;
                        break;
                }
                if (sVar != null) {
                    C0269a aVar = new C0269a(sVar4.p());
                    aVar.f(R.id.activity_main_body_frame_layout, sVar, (String) null, 1);
                    aVar.c();
                    aVar.e(false);
                    b.N0();
                    return;
                }
                return;
            case 2:
                C0676N n2 = (C0676N) this.f2257b;
                n2.f9213P.setSelection(i2);
                C0682Q q6 = n2.f9213P;
                if (q6.getOnItemClickListener() != null) {
                    q6.performItemClick(view, i2, n2.f9210M.getItemId(i2));
                }
                n2.dismiss();
                return;
            case 3:
                View view2 = null;
                r rVar = (r) this.f2257b;
                if (i2 < 0) {
                    C0657D0 d02 = rVar.f12253e;
                    if (!d02.f9161I.isShowing()) {
                        obj = null;
                    } else {
                        obj = d02.f9164c.getSelectedItem();
                    }
                } else {
                    obj = rVar.getAdapter().getItem(i2);
                }
                r.a(rVar, obj);
                AdapterView.OnItemClickListener onItemClickListener = rVar.getOnItemClickListener();
                C0657D0 d03 = rVar.f12253e;
                if (onItemClickListener != null) {
                    if (view == null || i2 < 0) {
                        if (d03.f9161I.isShowing()) {
                            view2 = d03.f9164c.getSelectedView();
                        }
                        view = view2;
                        if (!d03.f9161I.isShowing()) {
                            selectedItemPosition = -1;
                        } else {
                            selectedItemPosition = d03.f9164c.getSelectedItemPosition();
                        }
                        i2 = selectedItemPosition;
                        if (!d03.f9161I.isShowing()) {
                            j6 = Long.MIN_VALUE;
                        } else {
                            j6 = d03.f9164c.getSelectedItemId();
                        }
                    }
                    onItemClickListener.onItemClick(d03.f9164c, view, i2, j6);
                }
                d03.dismiss();
                return;
            default:
                C1118e eVar = (C1118e) this.f2257b;
                String playerId = ((h) eVar.f12741w0.get(i2)).getPlayerId();
                boolean t7 = com.google.android.gms.internal.measurement.a.t(playerId);
                MainActivity mainActivity = eVar.f12723d0;
                if (t7) {
                    sVar2 = new o(mainActivity);
                } else {
                    sVar2 = new K4.k(mainActivity, playerId);
                }
                C0269a aVar2 = new C0269a(eVar.p());
                aVar2.h(eVar);
                aVar2.e(false);
                C0269a aVar3 = new C0269a(eVar.p());
                aVar3.f(R.id.activity_main_body_frame_layout, sVar2, (String) null, 1);
                aVar3.c();
                aVar3.e(false);
                b.N0();
                return;
        }
    }
}
