package K4;

import A4.i;
import B0.l;
import R2.b;
import android.content.Context;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.fragment.app.C0269a;
import com.bumptech.glide.c;
import com.bumptech.glide.d;
import com.google.android.gms.internal.p002firebaseauthapi.zzaky;
import com.mtma.criminal.city.R;
import com.mtma.criminal.city.app.MyApplication;
import com.mtma.criminal.city.fragments.gangBase.v;
import d5.o;
import e5.C0505b;
import e5.C0509f;
import java.util.Map;

public final class a extends C0509f {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f1501a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ k f1502b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(k kVar, View view, int i2) {
        super(view);
        this.f1501a = i2;
        this.f1502b = kVar;
    }

    public final void onClick(View view) {
        int i2;
        switch (this.f1501a) {
            case 0:
                super.onClick(view);
                boolean I02 = d.I0();
                k kVar = this.f1502b;
                if (I02) {
                    com.google.android.gms.internal.measurement.a.n(MyApplication.f7090a, R.string.dialog_admin_can_not_blocked_players, kVar.f1553d0, (String) null);
                    return;
                }
                boolean t6 = com.google.android.gms.internal.measurement.a.t(kVar.f1554e0);
                Context context = kVar.f1553d0;
                if (t6) {
                    com.google.android.gms.internal.measurement.a.k(MyApplication.f7090a, R.string.can_not_block_yourself, context);
                    return;
                } else if (o.getContactsObject().getBlockedMap().containsKey(kVar.f1554e0)) {
                    com.google.android.gms.internal.measurement.a.n(MyApplication.f7090a, R.string.already_blocked, context, (String) null);
                    return;
                } else {
                    k.X(kVar, 1);
                    return;
                }
            case 1:
                super.onClick(view);
                k kVar2 = this.f1502b;
                boolean t7 = com.google.android.gms.internal.measurement.a.t(kVar2.f1554e0);
                Context context2 = kVar2.f1553d0;
                if (t7) {
                    com.google.android.gms.internal.measurement.a.k(MyApplication.f7090a, R.string.can_not_fight_yourself, context2);
                    return;
                } else if (c.A(Long.valueOf(kVar2.f1552Z0.getAccountObject().getJoinTimeInMilli())) < 3) {
                    c.s0(context2, MyApplication.f7090a.getApplicationContext().getString(R.string.dialog_can_not_fight_with_new_player, new Object[]{3}), (String) null);
                    return;
                } else {
                    if (b.i0(608)) {
                        i2 = 10;
                    } else {
                        i2 = 20;
                    }
                    if (o.getMainStatesObject().getPowerCurrent() < i2) {
                        c.p(context2, 2001);
                        return;
                    } else if (!kVar2.X0) {
                        kVar2.X0 = true;
                        com.google.android.gms.internal.measurement.a.v(com.google.android.gms.internal.measurement.a.c(com.google.android.gms.internal.measurement.a.e(true), "players"), "locationObject").d(new l((Object) kVar2, i2, 3));
                        return;
                    } else {
                        return;
                    }
                }
            case 2:
                super.onClick(view);
                k kVar3 = this.f1502b;
                boolean t8 = com.google.android.gms.internal.measurement.a.t(kVar3.f1554e0);
                Context context3 = kVar3.f1553d0;
                if (t8) {
                    com.google.android.gms.internal.measurement.a.k(MyApplication.f7090a, R.string.can_not_send_gift_to_yourself, context3);
                    return;
                } else if (o.getLocationObject().getCurrentPlace() == 3) {
                    com.google.android.gms.internal.measurement.a.n(MyApplication.f7090a, R.string.can_not_send_material_during_flight, context3, (String) null);
                    return;
                } else {
                    k.W(kVar3, new v(context3, kVar3.f1554e0, kVar3.f1555f0));
                    return;
                }
            case 3:
                super.onClick(view);
                k kVar4 = this.f1502b;
                boolean t9 = com.google.android.gms.internal.measurement.a.t(kVar4.f1554e0);
                Context context4 = kVar4.f1553d0;
                if (t9) {
                    com.google.android.gms.internal.measurement.a.k(MyApplication.f7090a, R.string.can_not_put_bounty_to_yourself, context4);
                    return;
                } else {
                    com.google.android.gms.internal.measurement.a.n(MyApplication.f7090a, R.string.next_version_not_allowed_put_bounty, context4, (String) null);
                    return;
                }
            case 4:
                super.onClick(view);
                k kVar5 = this.f1502b;
                boolean t10 = com.google.android.gms.internal.measurement.a.t(kVar5.f1554e0);
                Context context5 = kVar5.f1553d0;
                if (t10) {
                    if (o.getGangObject().getId().equals("not_in_gang")) {
                        com.google.android.gms.internal.measurement.a.n(MyApplication.f7090a, R.string.current_player_not_belong_to_any_gangs, context5, (String) null);
                        return;
                    } else {
                        k.W(kVar5, new v(context5, o.getGangObject().getId()));
                        return;
                    }
                } else if (!kVar5.f1552Z0.getGangObject().getId().equals("not_in_gang")) {
                    k.W(kVar5, new v(context5, kVar5.f1552Z0.getGangObject().getId()));
                    return;
                } else if (o.getGangObject().getId().equals("not_in_gang")) {
                    com.google.android.gms.internal.measurement.a.n(MyApplication.f7090a, R.string.player_not_belong_to_any_gangs, context5, (String) null);
                    return;
                } else {
                    int position = o.getGangObject().getPosition();
                    if (position != 0 && position != 1 && position != 2 && position != 3) {
                        com.google.android.gms.internal.measurement.a.n(MyApplication.f7090a, R.string.dialog_can_not_send_gang_join_request, context5, (String) null);
                        return;
                    } else if (kVar5.f1552Z0.getMainStatesObject().getLevel() < 25) {
                        com.google.android.gms.internal.measurement.a.n(MyApplication.f7090a, R.string.dialog_player_level_lower_requirements, context5, (String) null);
                        return;
                    } else if (kVar5.f1552Z0.getGangObject().getLeaveGangTimeInSeconds() + 7200 < c.f5744o) {
                        k.X(kVar5, 3);
                        return;
                    } else {
                        com.google.android.gms.internal.measurement.a.n(MyApplication.f7090a, R.string.dialog_player_must_spent_two_hours_from_last_gang_he_leave, context5, (String) null);
                        return;
                    }
                }
            case 5:
                super.onClick(view);
                k kVar6 = this.f1502b;
                boolean t11 = com.google.android.gms.internal.measurement.a.t(kVar6.f1554e0);
                Context context6 = kVar6.f1553d0;
                if (t11) {
                    com.google.android.gms.internal.measurement.a.k(MyApplication.f7090a, R.string.can_not_send_private_message_to_yourself, context6);
                    return;
                }
                Map<String, String> blockedMap = o.getContactsObject().getBlockedMap();
                String str = kVar6.f1554e0;
                if (blockedMap.containsKey(str)) {
                    com.google.android.gms.internal.measurement.a.n(MyApplication.f7090a, R.string.can_not_send_private_message_to_player_you_blocked_him, context6, (String) null);
                    return;
                } else if (o.getContactsObject().getOthersBlockedMap().containsKey(str)) {
                    com.google.android.gms.internal.measurement.a.n(MyApplication.f7090a, R.string.can_not_send_private_message_to_player_he_blocked_you, context6, (String) null);
                    return;
                } else if (o.getAccountObject().isBannedFromPrivateMessages() || o.getAccountObject().isBannedFromPrivateMessagesFromSystem()) {
                    com.google.android.gms.internal.measurement.a.n(MyApplication.f7090a, R.string.can_not_send_message_cause_banned_from_using_it, context6, (String) null);
                    return;
                } else if (!kVar6.f1549V0) {
                    kVar6.f1549V0 = true;
                    C0505b bVar = new C0505b(context6, R.layout.dialog_type_text);
                    EditText editText = (EditText) bVar.findViewById(R.id.dialog_type_text_edit_text);
                    ImageView imageView = (ImageView) bVar.findViewById(R.id.dialog_type_text_close_button);
                    RelativeLayout relativeLayout = (RelativeLayout) bVar.findViewById(R.id.dialog_type_text_ok_button);
                    ((TextView) bVar.findViewById(R.id.dialog_type_text_title)).setText(R.string.send_private_message_title);
                    ((TextView) bVar.findViewById(R.id.dialog_type_text_button_text)).setText(R.string.button_send);
                    editText.setHint(R.string.hint_type_here);
                    editText.addTextChangedListener(new c(kVar6, editText, 0));
                    imageView.setOnClickListener(new d(kVar6, imageView, bVar, 0));
                    relativeLayout.setOnClickListener(new i(kVar6, relativeLayout, editText, bVar, 1));
                    bVar.show();
                    return;
                } else {
                    return;
                }
            case zzaky.zzf.zzf /*6*/:
                super.onClick(view);
                k kVar7 = this.f1502b;
                boolean t12 = com.google.android.gms.internal.measurement.a.t(kVar7.f1554e0);
                Context context7 = kVar7.f1553d0;
                if (t12) {
                    com.google.android.gms.internal.measurement.a.k(MyApplication.f7090a, R.string.can_not_send_friend_request_to_yourself, context7);
                    return;
                }
                Map<String, String> friendsMap = o.getContactsObject().getFriendsMap();
                String str2 = kVar7.f1554e0;
                if (friendsMap.containsKey(str2)) {
                    com.google.android.gms.internal.measurement.a.n(MyApplication.f7090a, R.string.already_friends, context7, (String) null);
                    return;
                } else if (o.getContactsObject().getBlockedMap().containsKey(str2)) {
                    com.google.android.gms.internal.measurement.a.n(MyApplication.f7090a, R.string.can_not_send_friend_request_to_player_you_blocked_him, context7, (String) null);
                    return;
                } else if (o.getContactsObject().getOthersBlockedMap().containsKey(str2)) {
                    com.google.android.gms.internal.measurement.a.n(MyApplication.f7090a, R.string.can_not_send_friend_request_to_player_he_blocked_you, context7, (String) null);
                    return;
                } else if (o.getContactsObject().getRequestsMap().containsKey(b.V(0, str2))) {
                    com.google.android.gms.internal.measurement.a.n(MyApplication.f7090a, R.string.already_has_friend_request_from_other_player, context7, (String) null);
                    return;
                } else {
                    k.X(kVar7, 0);
                    return;
                }
            case zzaky.zzf.zzg /*7*/:
                super.onClick(view);
                String id = o.getAccountObject().getId();
                k kVar8 = this.f1502b;
                boolean equals = id.equals(kVar8.f1554e0);
                Context context8 = kVar8.f1553d0;
                if (equals) {
                    com.google.android.gms.internal.measurement.a.n(MyApplication.f7090a, R.string.can_not_ban_yourself, context8, (String) null);
                    return;
                } else if (kVar8.f1552Z0.getAccountObject().isAdmin() || kVar8.f1552Z0.getAccountObject().isTemporaryAdmin()) {
                    com.google.android.gms.internal.measurement.a.n(MyApplication.f7090a, R.string.can_not_ban_admins, context8, (String) null);
                    return;
                } else if (!kVar8.f1551Y0) {
                    kVar8.f1551Y0 = true;
                    C0505b bVar2 = new C0505b(context8, R.layout.dialog_ban);
                    ImageView imageView2 = (ImageView) bVar2.findViewById(R.id.dialog_ban_close_button);
                    CheckBox checkBox = (CheckBox) bVar2.findViewById(R.id.dialog_ban_chat_check_box);
                    CheckBox checkBox2 = (CheckBox) bVar2.findViewById(R.id.dialog_ban_private_messages_check_box);
                    CheckBox checkBox3 = (CheckBox) bVar2.findViewById(R.id.dialog_ban_news_check_box);
                    RelativeLayout relativeLayout2 = (RelativeLayout) bVar2.findViewById(R.id.dialog_ban_save_button);
                    checkBox.setChecked(kVar8.f1552Z0.getAccountObject().isBannedFromChat());
                    checkBox2.setChecked(kVar8.f1552Z0.getAccountObject().isBannedFromPrivateMessages());
                    checkBox3.setChecked(kVar8.f1552Z0.getAccountObject().isBannedFromNews());
                    relativeLayout2.setOnClickListener(new f(kVar8, relativeLayout2, checkBox, checkBox2, checkBox3, (CheckBox) bVar2.findViewById(R.id.dialog_ban_profile_pic_check_box), bVar2));
                    imageView2.setOnClickListener(new d(kVar8, imageView2, bVar2, 1));
                    bVar2.show();
                    return;
                } else {
                    return;
                }
            case 8:
                super.onClick(view);
                k kVar9 = this.f1502b;
                k.V(kVar9, kVar9.f1554e0);
                return;
            case 9:
                super.onClick(view);
                k kVar10 = this.f1502b;
                C0269a aVar = new C0269a(kVar10.p());
                aVar.h(kVar10);
                aVar.c();
                aVar.e(false);
                return;
            case 10:
                super.onClick(view);
                k kVar11 = this.f1502b;
                k.V(kVar11, kVar11.f1558i0.getText().toString().trim());
                return;
            default:
                super.onClick(view);
                com.google.android.gms.internal.measurement.a.n(MyApplication.f7090a, R.string.next_version_not_allowed_send_marriage_request, this.f1502b.f1553d0, (String) null);
                return;
        }
    }
}
