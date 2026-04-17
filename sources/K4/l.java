package K4;

import A2.f;
import F3.h;
import H4.d;
import M4.e;
import R2.b;
import Y4.C0248e;
import Y4.D;
import android.content.Context;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RadioGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.fragment.app.C0269a;
import com.bumptech.glide.c;
import com.google.android.gms.internal.measurement.a;
import com.google.android.gms.internal.p002firebaseauthapi.zzaky;
import com.mtma.criminal.city.R;
import com.mtma.criminal.city.app.MyApplication;
import com.mtma.criminal.city.fragments.gangBase.I;
import com.mtma.criminal.city.fragments.gangBase.y;
import com.mtma.criminal.city.utils.C0451v;
import com.mtma.criminal.city.utils.v0;
import d5.o;
import e5.C0505b;
import e5.C0509f;
import i3.C0592h;
import j4.C0621e0;
import j4.C0626h;
import j4.C0632k;
import j4.C0639o;
import j4.C0645v;
import j4.K;
import j4.Z;
import java.util.HashMap;

public final class l extends C0509f {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f1575a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ View f1576b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ C0505b f1577c;
    public final /* synthetic */ Object d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ Object f1578e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l(Object obj, RelativeLayout relativeLayout, View view, Object obj2, C0505b bVar, int i2) {
        super(relativeLayout);
        this.f1575a = i2;
        this.f1578e = obj;
        this.f1576b = view;
        this.d = obj2;
        this.f1577c = bVar;
    }

    public final void onClick(View view) {
        String str;
        int i2;
        int i5;
        View view2 = view;
        int i6 = 5;
        C0505b bVar = this.f1577c;
        Object obj = this.d;
        Object obj2 = this.f1578e;
        View view3 = this.f1576b;
        switch (this.f1575a) {
            case 0:
                super.onClick(view);
                String g = a.g((EditText) view3);
                m mVar = (m) obj2;
                if (((String) obj).equals(g)) {
                    bVar.dismiss();
                    o oVar = (o) mVar.f1580b;
                    oVar.f1597r0 = false;
                    v0.e(oVar.f1583d0, MyApplication.f7090a.getApplicationContext().getString(R.string.toast_no_change_happened));
                    return;
                }
                if (g.isEmpty()) {
                    g = "@empty_bio";
                }
                bVar.dismiss();
                ((o) mVar.f1580b).f1597r0 = false;
                a.c(a.e(true), "players").E(o.getAccountObject().getId()).E("mainStatesObject").E("bio").I(g).addOnCompleteListener(new h(this, g, 1));
                return;
            case 1:
                super.onClick(view);
                String g5 = a.g((EditText) view3);
                y yVar = (y) obj2;
                if (g5.isEmpty()) {
                    a.m(MyApplication.f7090a, R.string.empty_search_value, yVar.f7324d0, view2);
                    return;
                }
                RadioGroup radioGroup = (RadioGroup) obj;
                View findViewById = radioGroup.findViewById(radioGroup.getCheckedRadioButtonId());
                if (findViewById.getTag().equals("name")) {
                    str = "name";
                } else if (findViewById.getTag().equals("id")) {
                    str = "id";
                } else {
                    str = "";
                }
                e eVar = new e(yVar.f7324d0, "gangs/gangsData", str, g5, 6);
                C0269a aVar = new C0269a(yVar.p());
                aVar.f(R.id.activity_main_body_frame_layout, eVar, (String) null, 1);
                aVar.e(false);
                b.N0();
                bVar.dismiss();
                yVar.f7335o0 = false;
                return;
            case 2:
                super.onClick(view);
                String replace = ((EditText) view3).getText().toString().trim().replace("\n", "").replace("\t", "");
                String replace2 = ((EditText) obj).getText().toString().trim().replace("\n", "").replace("\t", "");
                Context context = (Context) obj2;
                if (replace.isEmpty()) {
                    a.m(MyApplication.f7090a, R.string.enter_gang_name_first, context, view2);
                    return;
                } else if (replace.length() < 4) {
                    v0.d(context, view2, MyApplication.f7090a.getApplicationContext().getString(R.string.gang_name_can_not_be_less_than_number_of_letters, new Object[]{4}));
                    return;
                } else if (replace.length() > 15) {
                    v0.d(context, view2, MyApplication.f7090a.getApplicationContext().getString(R.string.gang_name_can_not_be_more_than_number_of_letters, new Object[]{15}));
                    return;
                } else if (replace2.isEmpty()) {
                    a.m(MyApplication.f7090a, R.string.enter_gang_tag_first, context, view2);
                    return;
                } else if (replace2.length() != 3) {
                    a.m(MyApplication.f7090a, R.string.gang_tag_must_be_three_letters, context, view2);
                    return;
                } else if (replace.equals(o.getGangObject().getName()) || replace2.equals(o.getGangObject().getTag())) {
                    a.m(MyApplication.f7090a, R.string.error_same_gang_data, context, view2);
                    return;
                } else {
                    bVar.dismiss();
                    I1.b.d = false;
                    b.w(true);
                    I i7 = new I(this, 10);
                    HashMap hashMap = new HashMap();
                    hashMap.put("serverNumber", Integer.valueOf(o.getAccountObject().getCurrentOpenedServer()));
                    hashMap.put("gangBossId", o.getAccountObject().getId());
                    hashMap.put("gangId", o.getGangObject().getId());
                    hashMap.put("gangName", replace);
                    hashMap.put("gangTag", replace2);
                    h.b().a("changeGangData").q(hashMap).addOnCompleteListener(new d((Object) i7, 29));
                    return;
                }
            case 3:
                super.onClick(view);
                EditText editText = (EditText) view3;
                String g6 = a.g(editText);
                C0639o oVar2 = (C0639o) obj2;
                if (g6.isEmpty() || g6.equals("0")) {
                    a.m(MyApplication.f7090a, R.string.select_amount_first, oVar2.f9065a, view2);
                    return;
                }
                int parseInt = Integer.parseInt(editText.getText().toString().trim());
                if (!oVar2.f9067c) {
                    oVar2.f9067c = true;
                    C0505b bVar2 = new C0505b(oVar2.f9065a, R.layout.dialog_ok_cancle);
                    RelativeLayout relativeLayout = (RelativeLayout) bVar2.findViewById(R.id.dialog_ok_cancel_confirm_button);
                    RelativeLayout relativeLayout2 = (RelativeLayout) bVar2.findViewById(R.id.dialog_ok_cancel_cancel_button);
                    ((TextView) bVar2.findViewById(R.id.dialog_ok_cancel_text)).setText(R.string.confirm_sell_item);
                    ((LinearLayout) bVar2.findViewById(R.id.dialog_ok_cancel_buttons_confirm_cancel_layout)).setVisibility(0);
                    ((TextView) bVar2.findViewById(R.id.dialog_ok_cancel_confirm_button_text)).setText(R.string.button_ok);
                    relativeLayout.setOnClickListener(new P4.o(oVar2, relativeLayout, (D) obj, parseInt, bVar2, this.f1577c));
                    relativeLayout2.setOnClickListener(new C0632k(oVar2, relativeLayout2, bVar2, 0));
                    bVar2.show();
                    return;
                }
                return;
            case 4:
                super.onClick(view);
                String g7 = a.g((EditText) view3);
                C0645v vVar = (C0645v) obj2;
                if (g7.isEmpty()) {
                    a.k(MyApplication.f7090a, R.string.empty_value, vVar.f9109a);
                } else {
                    C0248e eVar2 = (C0248e) obj;
                    if (!o.getContactsObject().getFriendsMap().containsKey(eVar2.f4340a)) {
                        a.n(MyApplication.f7090a, R.string.not_friends_any_more, vVar.f9109a, (String) null);
                    } else {
                        b.w(true);
                        a.d(a.x(C0592h.d().e(), "players"), "contactsObject", "friendsMap").E(eVar2.f4340a).I(g7).addOnCompleteListener(new C0451v(this, 15));
                    }
                }
                bVar.dismiss();
                vVar.f9111c = false;
                return;
            case 5:
                super.onClick(view);
                RadioGroup radioGroup2 = (RadioGroup) view3;
                View findViewById2 = radioGroup2.findViewById(radioGroup2.getCheckedRadioButtonId());
                if (findViewById2.getTag().equals("vise")) {
                    i6 = 1;
                } else if (findViewById2.getTag().equals("advisor")) {
                    i6 = 2;
                } else if (findViewById2.getTag().equals("operation_chief")) {
                    i6 = 3;
                } else if (findViewById2.getTag().equals("fighter")) {
                    i6 = 4;
                }
                Y4.l lVar = (Y4.l) obj;
                Z z3 = (Z) obj2;
                if (i6 == lVar.h) {
                    a.m(MyApplication.f7090a, R.string.toast_no_change_happened, z3.f8965b, view2);
                    return;
                }
                z3.getClass();
                b.w(true);
                String str2 = lVar.f4385a;
                String str3 = lVar.f4386b;
                int i8 = z3.d;
                f fVar = new f((Object) z3, (Object) lVar, i6, 13);
                HashMap hashMap2 = new HashMap();
                hashMap2.put("serverNumber", Integer.valueOf(o.getAccountObject().getCurrentOpenedServer()));
                hashMap2.put("playerId", o.getAccountObject().getId());
                hashMap2.put("playerName", o.getMainStatesObject().getNickName());
                hashMap2.put("memberId", str2);
                hashMap2.put("memberName", str3);
                hashMap2.put("newPosition", Integer.valueOf(i6));
                hashMap2.put("gangId", o.getGangObject().getId());
                hashMap2.put("gangLevel", Integer.valueOf(i8));
                h.b().a("changeMemberPosition").q(hashMap2).addOnCompleteListener(new d((Object) fVar, 21));
                bVar.dismiss();
                z3.f8968f = false;
                return;
            case zzaky.zzf.zzf /*6*/:
                super.onClick(view);
                try {
                    i2 = Integer.parseInt(((EditText) view3).getText().toString().trim());
                } catch (Exception e6) {
                    int i9 = C0621e0.f8998i;
                    a.q("Exception from try-catch block inside ", "e0", " in displayBuyDialog method.", e6, "e0");
                    i2 = 0;
                }
                C0621e0 e0Var = (C0621e0) obj2;
                if (i2 < 1) {
                    a.m(MyApplication.f7090a, R.string.select_amount_first, e0Var.f8999a, view2);
                    return;
                }
                D d6 = (D) obj;
                if (o.getMoneyObject().getCash() < d6.f4297f * ((long) i2)) {
                    c.x0(e0Var.f8999a);
                    return;
                }
                e0Var.getClass();
                b.w(true);
                android.support.v4.media.session.a.i0(new K(e0Var, i2, d6, 1));
                bVar.dismiss();
                e0Var.h = false;
                return;
            case zzaky.zzf.zzg /*7*/:
                super.onClick(view);
                try {
                    i5 = Integer.parseInt(((EditText) view3).getText().toString().trim());
                } catch (Exception e7) {
                    int i10 = C0626h.d;
                    a.q("Exception from try-catch block inside ", "h", " in displayBuyDialog method.", e7, "h");
                    i5 = 0;
                }
                C0626h hVar = (C0626h) obj2;
                if (i5 < 1) {
                    a.m(MyApplication.f7090a, R.string.select_amount_first, hVar.f9018b, view2);
                    return;
                }
                D d7 = (D) obj;
                if (o.getMoneyObject().getCash() < d7.f4297f * ((long) i5)) {
                    c.x0(hVar.f9018b);
                    return;
                }
                hVar.getClass();
                b.w(true);
                android.support.v4.media.session.a.i0(new K(hVar, i5, d7, 2));
                bVar.dismiss();
                hVar.f9019c = false;
                return;
            default:
                super.onClick(view);
                int parseInt2 = Integer.parseInt(((EditText) view3).getText().toString().trim());
                Z z4 = (Z) obj2;
                int i11 = z4.f8966c;
                D d8 = (D) obj;
                if (i11 == 3 || i11 == 4 || i11 == 5 || i11 == 8 || ((i11 == 9 && d8.f4293a == 3001) || i11 == 10 || i11 == 12 || i11 == 13 || i11 == 14)) {
                    Z.g(z4, d8.f4293a, parseInt2);
                } else if (i11 == 6 || i11 == 7) {
                    Z.h(z4, d8.f4293a, parseInt2);
                } else if (i11 == 9 && d8.f4293a == 3002) {
                    Z.i(z4, parseInt2);
                }
                bVar.dismiss();
                z4.f8967e = false;
                return;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public l(RelativeLayout relativeLayout, EditText editText, EditText editText2, Context context, C0505b bVar) {
        super(relativeLayout);
        this.f1575a = 2;
        this.f1576b = editText;
        this.d = editText2;
        this.f1578e = context;
        this.f1577c = bVar;
    }
}
