package K4;

import A2.f;
import B0.C0004c;
import B0.l;
import F3.h;
import H4.d;
import H4.e;
import R2.b;
import W4.g;
import Y4.A;
import Y4.C;
import Y4.C0246c;
import Y4.E;
import Y4.m;
import Y4.q;
import Y4.w;
import android.content.Context;
import android.os.Handler;
import android.preference.PreferenceManager;
import android.text.InputFilter;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.SeekBar;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.C0269a;
import androidx.fragment.app.I;
import com.bumptech.glide.c;
import com.google.android.gms.dynamite.descriptors.com.google.firebase.auth.ModuleDescriptor;
import com.google.android.gms.internal.measurement.a;
import com.google.android.gms.internal.p002firebaseauthapi.zzaky;
import com.mtma.criminal.city.R;
import com.mtma.criminal.city.app.MyApplication;
import com.mtma.criminal.city.utils.K;
import com.mtma.criminal.city.utils.U;
import com.mtma.criminal.city.utils.v0;
import d5.o;
import e5.C0505b;
import e5.C0509f;
import f.C0518i;
import i3.C0590f;
import i3.C0592h;
import j4.A0;
import j4.C0;
import j4.C0612a;
import j4.C0614b;
import j4.C0615b0;
import j4.C0617c0;
import j4.C0623f0;
import j4.C0626h;
import j4.C0630j;
import j4.C0636m;
import j4.D;
import j4.F0;
import j4.G;
import j4.G0;
import j4.H;
import j4.H0;
import j4.I0;
import j4.J0;
import j4.K0;
import j4.L0;
import j4.M0;
import j4.N;
import j4.O;
import j4.P;
import j4.T;
import j4.Y;
import j4.r;
import j4.u0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.TreeMap;
import p4.C0920c;
import p4.C0923f;

public final class j extends C0509f {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f1526a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ int f1527b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Object f1528c;
    public final /* synthetic */ Object d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j(ArrayAdapter arrayAdapter, RelativeLayout relativeLayout, Object obj, int i2, int i5) {
        super(relativeLayout);
        this.f1526a = i5;
        this.d = arrayAdapter;
        this.f1528c = obj;
        this.f1527b = i2;
    }

    public final void onClick(View view) {
        boolean z3;
        int i2;
        int i5;
        char c3;
        int i6;
        int i7 = this.f1527b;
        Object obj = this.f1528c;
        Object obj2 = this.d;
        switch (this.f1526a) {
            case 0:
                super.onClick(view);
                b.w(true);
                k kVar = (k) obj2;
                if (i7 == 0) {
                    kVar.getClass();
                    a.x(C0592h.d().e(), "players").E(kVar.f1554e0).E("contactsObject").E("requestsMap").E(b.V(0, o.getAccountObject().getId())).I(0);
                    kVar.f1544Q0.E("notificationObject").E("hasUnSeenContactRequest").I(Boolean.TRUE).addOnCompleteListener(new d((Object) kVar, 2));
                } else if (i7 == 1) {
                    kVar.getClass();
                    HashMap hashMap = new HashMap();
                    StringBuilder sb = new StringBuilder();
                    sb.append(o.getAccountObject().getId());
                    sb.append("/contactsObject/friendsMap/");
                    String str = kVar.f1554e0;
                    sb.append(str);
                    hashMap.put(sb.toString(), (Object) null);
                    hashMap.put(str + "/contactsObject/friendsMap/" + o.getAccountObject().getId(), (Object) null);
                    hashMap.put(o.getAccountObject().getId() + "/contactsObject/requestsMap/" + b.V(0, str), (Object) null);
                    hashMap.put(str + "/contactsObject/requestsMap/" + b.V(0, o.getAccountObject().getId()), (Object) null);
                    hashMap.put(o.getAccountObject().getId() + "/contactsObject/requestsMap/" + b.V(1, str), (Object) null);
                    hashMap.put(str + "/contactsObject/requestsMap/" + b.V(1, o.getAccountObject().getId()), (Object) null);
                    hashMap.put(o.getAccountObject().getId() + "/contactsObject/blockedMap/" + str, "-");
                    hashMap.put(str + "/contactsObject/othersBlockedMap/" + o.getAccountObject().getId(), "-");
                    C0592h.d().e().E(b.a0()).E("players").J(hashMap).addOnSuccessListener(new e(kVar, 1));
                } else if (i7 == 2) {
                    kVar.getClass();
                    a.x(C0592h.d().e(), "players").E(kVar.f1554e0).E("contactsObject").E("requestsMap").E(b.V(1, o.getAccountObject().getId())).d(new b(kVar, 1));
                } else if (i7 == 3) {
                    kVar.getClass();
                    z3 = false;
                    a.x(C0592h.d().e(), "players").E(kVar.f1554e0).E("contactsObject").E("requestsMap").E(b.V(2, o.getGangObject().getId())).d(new b(kVar, 0));
                    ((C0505b) obj).dismiss();
                    kVar.f1550W0 = z3;
                    return;
                }
                z3 = false;
                ((C0505b) obj).dismiss();
                kVar.f1550W0 = z3;
                return;
            case 1:
                super.onClick(view);
                g gVar = (g) obj2;
                if (i7 == 0) {
                    g.V(gVar);
                } else if (i7 == 1) {
                    gVar.getClass();
                    b.w(true);
                    int i8 = ((E) gVar.f4114n0.get(o.getWorkObject().getJobType() + 1)).d;
                    if (i8 == -1) {
                        gVar.b0();
                    } else {
                        b.w(true);
                        android.support.v4.media.session.a.B0(i8, 8, 0, -1, new l((Object) gVar, i8, 6), o.getAccountObject().getId(), "count", false);
                    }
                }
                ((C0505b) obj).dismiss();
                gVar.f4117q0 = false;
                return;
            case 2:
                super.onClick(view);
                C0630j jVar = (C0630j) obj2;
                if (o.getMoneyObject().getCash() < ((long) ((w) jVar.f9032b.get(i7)).f4445c)) {
                    c.x0(jVar.f9031a);
                } else {
                    b.w(true);
                    int i9 = ((w) jVar.f9032b.get(i7)).f4443a;
                    F3.e eVar = new F3.e((Object) jVar, 18);
                    HashMap hashMap2 = new HashMap();
                    hashMap2.put("serverNumber", Integer.valueOf(o.getAccountObject().getCurrentOpenedServer()));
                    hashMap2.put("playerId", o.getAccountObject().getId());
                    hashMap2.put("newCity", Integer.valueOf(i9));
                    h.b().a("addPlayerToPlane").q(hashMap2).addOnCompleteListener(new d((Object) eVar, 15));
                }
                ((C0505b) obj).dismiss();
                jVar.f9033c = false;
                return;
            case 3:
                super.onClick(view);
                ((C0505b) obj).dismiss();
                D d6 = (D) obj2;
                d6.f8859e = false;
                D.a(d6, i7);
                return;
            case 4:
                super.onClick(view);
                Y4.g gVar2 = (Y4.g) obj;
                boolean z4 = gVar2.g;
                H h = (H) obj2;
                if (z4 && gVar2.f4353f) {
                    a.k(MyApplication.f7090a, R.string.already_have_contract, h.f8883b);
                    return;
                } else if (!z4 && gVar2.f4353f) {
                    a.k(MyApplication.f7090a, R.string.already_modification_added, h.f8883b);
                    return;
                } else if (o.getMoneyObject().getCash() < gVar2.f4352e) {
                    c.x0(h.f8883b);
                    return;
                } else if (!h.d) {
                    h.d = true;
                    C0505b bVar = new C0505b(h.f8883b, R.layout.dialog_money_icon);
                    RelativeLayout relativeLayout = (RelativeLayout) bVar.findViewById(R.id.dialog_money_icon_ok_button);
                    RelativeLayout relativeLayout2 = (RelativeLayout) bVar.findViewById(R.id.dialog_money_icon_cancel_button);
                    b.c((LinearLayout) bVar.findViewById(R.id.dialog_money_icon_money_layout), 3);
                    ((ImageView) bVar.findViewById(R.id.dialog_money_icon_cost_image)).setImageResource(R.drawable.cash_icon);
                    int i10 = this.f1527b;
                    ((TextView) bVar.findViewById(R.id.dialog_money_icon_cost)).setText(U.a(((Y4.g) h.getItem(i10)).f4352e));
                    ((TextView) bVar.findViewById(R.id.dialog_money_icon_description)).setText(R.string.confirm_pay_cash);
                    relativeLayout.setOnClickListener(new j((Object) h, relativeLayout, i10, (Object) bVar, 5));
                    relativeLayout2.setOnClickListener(new A4.h(h, relativeLayout2, bVar, 18));
                    bVar.show();
                    return;
                } else {
                    return;
                }
            case 5:
                super.onClick(view);
                H h6 = (H) obj2;
                h6.getClass();
                b.w(true);
                U.g(o.getAccountObject().getId(), "cash", -((Y4.g) h6.getItem(i7)).f4352e, new l((Object) h6, i7, 22));
                ((C0505b) obj).dismiss();
                h6.d = false;
                return;
            case zzaky.zzf.zzf /*6*/:
                super.onClick(view);
                m mVar = (m) obj;
                H h7 = (H) obj2;
                if (mVar.f4400f.contains(o.getAccountObject().getId())) {
                    a.n(MyApplication.f7090a, R.string.dialog_gang_already_joined_to_militia, h7.f8883b, (String) null);
                    return;
                } else if (o.getMainStatesObject().getCourageCurrent() < mVar.d) {
                    c.p(h7.f8883b, 2002);
                    return;
                } else {
                    int i11 = mVar.f4396a;
                    if (!h7.d) {
                        h7.d = true;
                        C0505b bVar2 = new C0505b(h7.f8883b, R.layout.dialog_ok_cancle);
                        RelativeLayout relativeLayout3 = (RelativeLayout) bVar2.findViewById(R.id.dialog_ok_cancel_confirm_button);
                        RelativeLayout relativeLayout4 = (RelativeLayout) bVar2.findViewById(R.id.dialog_ok_cancel_cancel_button);
                        ((TextView) bVar2.findViewById(R.id.dialog_ok_cancel_text)).setText(MyApplication.f7090a.getApplicationContext().getString(R.string.dialog_gang_confirm_joint_to_militia));
                        ((LinearLayout) bVar2.findViewById(R.id.dialog_ok_cancel_buttons_confirm_cancel_layout)).setVisibility(0);
                        ((TextView) bVar2.findViewById(R.id.dialog_ok_cancel_confirm_button_text)).setText(R.string.button_ok);
                        relativeLayout3.setOnClickListener(new T(h7, relativeLayout3, this.f1527b, i11, bVar2));
                        relativeLayout4.setOnClickListener(new A4.h(h7, relativeLayout4, bVar2, 23));
                        bVar2.show();
                        return;
                    }
                    return;
                }
            case zzaky.zzf.zzg /*7*/:
                super.onClick(view);
                C c6 = (C) obj;
                C0617c0 c0Var = (C0617c0) obj2;
                if (o.getGangObject().getPosition() != 0) {
                    a.n(MyApplication.f7090a, R.string.dialog_gang_only_boss_can_take_that_action, c0Var.f8984a, (String) null);
                    return;
                }
                int i12 = c6.f4288e;
                switch (c0Var.f8985b) {
                    case 2:
                        i2 = 4;
                        break;
                    case 3:
                        i2 = 6;
                        break;
                    case 4:
                        i2 = 8;
                        break;
                    case 5:
                        i2 = 10;
                        break;
                    case zzaky.zzf.zzf /*6*/:
                        i2 = 15;
                        break;
                    case zzaky.zzf.zzg /*7*/:
                        i2 = 16;
                        break;
                    default:
                        i2 = 2;
                        break;
                }
                Context context = c0Var.f8984a;
                if (i12 >= i2) {
                    a.n(MyApplication.f7090a, R.string.toast_gang_skill_reach_maximum_for_current_gang_level, context, (String) null);
                    return;
                } else if (c0Var.f8987e < c.M(i12)) {
                    a.n(MyApplication.f7090a, R.string.toast_gang_not_has_enough_respect, context, (String) null);
                    return;
                } else if (c0Var.d < c.L(c6.f4288e)) {
                    a.n(MyApplication.f7090a, R.string.toast_gang_not_has_enough_cash, context, (String) null);
                    return;
                } else if (!c0Var.g) {
                    c0Var.g = true;
                    C0505b bVar3 = new C0505b(context, R.layout.dialog_ok_cancle);
                    RelativeLayout relativeLayout5 = (RelativeLayout) bVar3.findViewById(R.id.dialog_ok_cancel_confirm_button);
                    RelativeLayout relativeLayout6 = (RelativeLayout) bVar3.findViewById(R.id.dialog_ok_cancel_cancel_button);
                    ((TextView) bVar3.findViewById(R.id.dialog_ok_cancel_text)).setText(MyApplication.f7090a.getApplicationContext().getString(R.string.dialog_gang_confirm_improve_normal_skill, new Object[]{MyApplication.f7090a.getString(c6.f4286b)}));
                    ((LinearLayout) bVar3.findViewById(R.id.dialog_ok_cancel_buttons_confirm_cancel_layout)).setVisibility(0);
                    ((TextView) bVar3.findViewById(R.id.dialog_ok_cancel_confirm_button_text)).setText(R.string.button_ok);
                    relativeLayout5.setOnClickListener(new Y((ArrayAdapter) c0Var, relativeLayout5, (Object) c6, this.f1527b, bVar3, 2));
                    relativeLayout6.setOnClickListener(new A4.h(c0Var, relativeLayout6, bVar3, 25));
                    bVar3.show();
                    return;
                } else {
                    return;
                }
            case 8:
                super.onClick(view);
                Y4.o oVar = (Y4.o) obj;
                C0612a aVar = (C0612a) obj2;
                if (oVar.g) {
                    C0612a.a(aVar, i7);
                    return;
                } else if (!I1.b.n0(i7)) {
                    v0.e(aVar.f8970b, MyApplication.f7090a.getApplicationContext().getString(R.string.gym_progress_not_finished));
                    return;
                } else if (o.getMoneyObject().getCash() < oVar.f4409e) {
                    c.x0(aVar.f8970b);
                    return;
                } else {
                    aVar.getClass();
                    b.w(true);
                    U.g(o.getAccountObject().getId(), "cash", -((Y4.o) aVar.getItem(i7)).f4409e, new l((Object) aVar, i7, 24));
                    return;
                }
            case 9:
                super.onClick(view);
                q qVar = (q) obj;
                r rVar = (r) obj2;
                if (qVar.f4415b) {
                    a.k(MyApplication.f7090a, R.string.level_rewards_collected_before, rVar.f9083b);
                    return;
                } else if (o.getMainStatesObject().getLevel() < qVar.f4414a) {
                    a.n(MyApplication.f7090a, R.string.not_reach_the_level_needed, rVar.f9083b, (String) null);
                    return;
                } else {
                    rVar.getClass();
                    b.w(true);
                    a.d(a.c(C0592h.b().e(), "players"), "mainStatesObject", "level").d(new l((Object) rVar, i7, 25));
                    return;
                }
            case 10:
                super.onClick(view);
                ((C0505b) obj).dismiss();
                G g = (G) obj2;
                g.d = false;
                b.w(true);
                l lVar = new l((Object) g, i7, 26);
                TreeMap treeMap = U.f7378a;
                a.v(a.c(C0592h.b().e(), "players"), "moneyObject").H(new l(i7, (Object) lVar, 12));
                return;
            case ModuleDescriptor.MODULE_VERSION /*11*/:
                super.onClick(view);
                C0614b bVar4 = (C0614b) obj2;
                C0246c cVar = (C0246c) obj;
                PreferenceManager.getDefaultSharedPreferences(bVar4.f8975b).edit().putBoolean(C0614b.a(bVar4, i7), !cVar.f4336e).apply();
                cVar.f4336e = !cVar.f4336e;
                bVar4.notifyDataSetChanged();
                b.w(true);
                new Handler().postDelayed(new C0004c((Object) this, 29), 250);
                return;
            case 12:
                super.onClick(view);
                C0626h hVar = (C0626h) obj2;
                hVar.getClass();
                b.w(true);
                C0590f E6 = a.x(C0592h.d().e(), "messages").E(o.getAccountObject().getId());
                E6.E("chatMessages").E(((b5.l) hVar.getItem(i7)).getPlayerId()).d(new f((Object) hVar, (Object) E6, i7, 15));
                ((C0505b) obj).dismiss();
                hVar.f9019c = false;
                return;
            case 13:
                super.onClick(view);
                A a6 = (A) obj;
                C0615b0 b0Var = (C0615b0) obj2;
                if (a6.h) {
                    if (o.getMoneyObject().getCash() < a6.f4278f) {
                        c.x0(b0Var.f8978b);
                    } else if (!b0Var.d) {
                        b0Var.d = true;
                        C0505b bVar5 = new C0505b(b0Var.f8978b, R.layout.dialog_ok_cancle);
                        TextView textView = (TextView) bVar5.findViewById(R.id.dialog_ok_cancel_text);
                        LinearLayout linearLayout = (LinearLayout) bVar5.findViewById(R.id.dialog_ok_cancel_buttons_confirm_cancel_layout);
                        RelativeLayout relativeLayout7 = (RelativeLayout) bVar5.findViewById(R.id.dialog_ok_cancel_confirm_button);
                        RelativeLayout relativeLayout8 = (RelativeLayout) bVar5.findViewById(R.id.dialog_ok_cancel_cancel_button);
                        TextView textView2 = (TextView) bVar5.findViewById(R.id.dialog_ok_cancel_confirm_button_text);
                        boolean isStudying = o.getSchoolObject().isStudying();
                        int i13 = this.f1527b;
                        if (isStudying) {
                            Context applicationContext = MyApplication.f7090a.getApplicationContext();
                            Context applicationContext2 = MyApplication.f7090a.getApplicationContext();
                            ArrayList Q5 = c.Q(c.w(), false);
                            int i14 = 0;
                            while (true) {
                                if (i14 >= Q5.size()) {
                                    i5 = -1;
                                } else if (((A) Q5.get(i14)).g == 1) {
                                    i5 = ((A) Q5.get(i14)).f4275b;
                                } else {
                                    i14++;
                                }
                            }
                            textView.setText(applicationContext.getString(R.string.study_new_lesson_while_studying_old_lesson, new Object[]{applicationContext2.getString(i5), MyApplication.f7090a.getApplicationContext().getString(((A) b0Var.getItem(i13)).f4275b), U.a(((A) b0Var.getItem(i13)).f4278f)}));
                        } else {
                            textView.setText(MyApplication.f7090a.getApplicationContext().getString(R.string.study_new_lesson, new Object[]{MyApplication.f7090a.getApplicationContext().getString(((A) b0Var.getItem(i13)).f4275b), U.a(((A) b0Var.getItem(i13)).f4278f)}));
                        }
                        linearLayout.setVisibility(0);
                        textView2.setText(R.string.button_ok);
                        relativeLayout7.setOnClickListener(new j((Object) b0Var, relativeLayout7, i13, (Object) bVar5, 14));
                        relativeLayout8.setOnClickListener(new C0623f0(b0Var, relativeLayout8, bVar5, 11));
                        bVar5.show();
                        return;
                    }
                    return;
                }
                int i15 = a6.g;
                if (i15 == 2) {
                    a.k(MyApplication.f7090a, R.string.lesson_studied_already, b0Var.f8978b);
                    return;
                } else if (i15 == 1) {
                    a.k(MyApplication.f7090a, R.string.lesson_current_studying, b0Var.f8978b);
                    return;
                } else {
                    a.k(MyApplication.f7090a, R.string.can_not_study_now, b0Var.f8978b);
                    return;
                }
            case 14:
                super.onClick(view);
                C0615b0 b0Var2 = (C0615b0) obj2;
                b0Var2.getClass();
                b.w(true);
                U.g(o.getAccountObject().getId(), "cash", -((A) b0Var2.getItem(i7)).f4278f, new l((Object) b0Var2, i7, 27));
                ((C0505b) obj).dismiss();
                b0Var2.d = false;
                return;
            case 15:
                super.onClick(view);
                C c7 = (C) obj;
                C0614b bVar6 = (C0614b) obj2;
                if (c7.f4288e >= 10) {
                    a.k(MyApplication.f7090a, R.string.toast_reach_to_maximum_level, bVar6.f8975b);
                    return;
                }
                int i16 = c7.f4285a;
                bVar6.getClass();
                b.w(true);
                a.v(a.c(C0592h.b().e(), "players"), "skillsObject").H(new l(i16, (Object) new U0.b((Object) bVar6, i16, i7, 3), 16));
                return;
            case 16:
                super.onClick(view);
                A0 a02 = (A0) obj2;
                int i17 = a02.f8840b;
                Context context2 = a02.f8839a;
                if (i17 == 1) {
                    V4.h hVar2 = new V4.h(((Y4.D) a02.getItem(i7)).f4293a, ((Y4.D) a02.getItem(i7)).f4298i, context2);
                    I l6 = ((C0518i) context2).l();
                    l6.getClass();
                    C0269a aVar2 = new C0269a(l6);
                    aVar2.i(R.id.activity_main_body_frame_layout, hVar2);
                    aVar2.c();
                    aVar2.e(false);
                    b.N0();
                    return;
                }
                Y4.D d7 = (Y4.D) obj;
                if (i17 == 2) {
                    if (d7.equals(Y4.D.a())) {
                        A0.a(a02);
                        return;
                    } else if (!a02.f8842e) {
                        a02.f8842e = true;
                        C0505b bVar7 = new C0505b(context2, R.layout.dialog_sell_item);
                        ImageView imageView = (ImageView) bVar7.findViewById(R.id.dialog_sell_item_image);
                        ConstraintLayout constraintLayout = (ConstraintLayout) bVar7.findViewById(R.id.dialog_sell_item_level_layout);
                        TextView textView3 = (TextView) bVar7.findViewById(R.id.dialog_sell_item_level);
                        EditText editText = (EditText) bVar7.findViewById(R.id.dialog_sell_item_edit_text);
                        SeekBar seekBar = (SeekBar) bVar7.findViewById(R.id.dialog_sell_item_seekbar_view);
                        ImageView imageView2 = (ImageView) bVar7.findViewById(R.id.dialog_sell_item_close_button);
                        RelativeLayout relativeLayout9 = (RelativeLayout) bVar7.findViewById(R.id.dialog_sell_item_ok_button);
                        ((LinearLayout) bVar7.findViewById(R.id.dialog_sell_item_cost_layout)).setVisibility(8);
                        ((TextView) bVar7.findViewById(R.id.dialog_sell_item_title)).setText(R.string.remove_from_bag_title);
                        a.o(MyApplication.f7090a, R.string.button_remove, (TextView) bVar7.findViewById(R.id.dialog_sell_item_ok_button_text));
                        if (d7.f4298i > 0) {
                            constraintLayout.setVisibility(0);
                            textView3.setText(String.valueOf(d7.f4298i));
                        }
                        imageView.setImageResource(d7.d);
                        editText.setText("1");
                        seekBar.setProgress((int) ((1.0d / ((double) d7.h)) * 100.0d));
                        seekBar.setOnSeekBarChangeListener(new C0636m(editText, d7, 1));
                        editText.setFilters(new InputFilter[]{new InputFilter.LengthFilter(4)});
                        A0 a03 = a02;
                        editText.addTextChangedListener(new s(a03, d7, editText, seekBar, 1));
                        relativeLayout9.setOnClickListener(new u0(a03, relativeLayout9, bVar7, editText, d7));
                        imageView2.setOnClickListener(new j4.v0(a02, imageView2, bVar7, 2));
                        bVar7.show();
                        return;
                    } else {
                        return;
                    }
                } else if (d7.f4304o) {
                    a.k(MyApplication.f7090a, R.string.already_used_in_arming, context2);
                    return;
                } else if (!d7.f4300k) {
                    return;
                } else {
                    if (d7.f4306q || d7.f4294b == 15) {
                        K1.e.v0(context2, d7);
                        return;
                    } else {
                        A0.c(a02, d7, 0, -1, (C0505b) null);
                        return;
                    }
                }
            case 17:
                super.onClick(view);
                M0 m02 = (M0) obj2;
                int i18 = m02.g;
                Y4.D d8 = (Y4.D) obj;
                Context context3 = m02.f8919a;
                if (i18 == 0) {
                    if (i7 == m02.getCount() - 1) {
                        M0.a(m02, new Q4.a(12, 0, context3));
                        return;
                    } else if (d8.f4305p) {
                        b.w(true);
                        m02.f8923f.E("itemsInStock").E(K1.e.y(((Y4.D) m02.getItem(i7)).f4294b)).E(K1.e.x(((Y4.D) m02.getItem(i7)).f4293a, ((Y4.D) m02.getItem(i7)).f4298i)).d(new F0(m02, i7));
                        return;
                    } else {
                        M0.a(m02, new T4.f(context3, i7));
                        return;
                    }
                } else if (i18 == 2) {
                    if (i7 == m02.getCount() - 1) {
                        M0.a(m02, new Q4.a(10, 0, context3));
                        return;
                    } else if (d8.d == R.drawable.stock_empty_frame) {
                        M0.a(m02, new U4.c(context3, i7));
                        return;
                    } else {
                        int i19 = d8.f4293a;
                        int i20 = d8.h;
                        b.w(true);
                        android.support.v4.media.session.a.i0(new C0(m02, i20, i7, i19));
                        return;
                    }
                } else if (i18 == 1) {
                    b.w(true);
                    m02.f8923f.E("itemsInStock").E(K1.e.y(d8.f4294b)).E(K1.e.x(d8.f4293a, d8.f4298i)).d(new K(m02, 29));
                    return;
                } else if (i18 == 3) {
                    if (!m02.f8924i) {
                        m02.f8924i = true;
                        C0505b bVar8 = new C0505b(context3, R.layout.dialog_add_stall);
                        ImageView imageView3 = (ImageView) bVar8.findViewById(R.id.dialog_add_stall_close_button);
                        TextView textView4 = (TextView) bVar8.findViewById(R.id.dialog_add_stall_level);
                        ConstraintLayout constraintLayout2 = (ConstraintLayout) bVar8.findViewById(R.id.dialog_add_stall_level_layout);
                        TextView textView5 = (TextView) bVar8.findViewById(R.id.dialog_add_stall_count_text_view);
                        EditText editText2 = (EditText) bVar8.findViewById(R.id.dialog_add_stall_count_edit_text);
                        SeekBar seekBar2 = (SeekBar) bVar8.findViewById(R.id.dialog_add_stall_count_seekbar);
                        TextView textView6 = (TextView) bVar8.findViewById(R.id.dialog_add_stall_cost_text_view);
                        EditText editText3 = (EditText) bVar8.findViewById(R.id.dialog_add_stall_cost_edit_text);
                        RelativeLayout relativeLayout10 = (RelativeLayout) bVar8.findViewById(R.id.dialog_add_stall_add_button);
                        SeekBar seekBar3 = (SeekBar) bVar8.findViewById(R.id.dialog_add_stall_cost_seekbar);
                        ((ImageView) bVar8.findViewById(R.id.dialog_add_stall_image)).setImageResource(d8.d);
                        if (d8.f4298i > 0) {
                            constraintLayout2.setVisibility(0);
                            textView4.setText(String.valueOf(d8.f4298i));
                        }
                        textView5.setText("1");
                        textView6.setText(U.a(d8.f4297f));
                        int i21 = d8.h;
                        if (i21 < 10) {
                            i6 = i21;
                        } else {
                            i6 = 10;
                        }
                        seekBar2.setOnSeekBarChangeListener(new J0(editText2, i6, textView5));
                        editText2.setFilters(new InputFilter[]{new InputFilter.LengthFilter(2)});
                        SeekBar seekBar4 = seekBar3;
                        SeekBar seekBar5 = seekBar2;
                        ImageView imageView4 = imageView3;
                        EditText editText4 = editText2;
                        editText4.addTextChangedListener(new O(m02, i6, textView5, editText2, seekBar5, editText3));
                        seekBar4.setOnSeekBarChangeListener(new K0(editText3, d8, textView6));
                        editText3.setFilters(new InputFilter[]{new InputFilter.LengthFilter(13)});
                        editText3.addTextChangedListener(new L0(m02, editText3, textView6));
                        relativeLayout10.setOnClickListener(new P(m02, relativeLayout10, textView5, textView6, bVar8, d8));
                        ImageView imageView5 = imageView4;
                        imageView5.setOnClickListener(new I0(m02, imageView5, bVar8, 2));
                        bVar8.show();
                        return;
                    }
                    return;
                } else if (i18 == 4) {
                    if (!m02.h) {
                        m02.h = true;
                        C0505b bVar9 = new C0505b(context3, R.layout.dialog_sell_item);
                        ImageView imageView6 = (ImageView) bVar9.findViewById(R.id.dialog_sell_item_image);
                        ConstraintLayout constraintLayout3 = (ConstraintLayout) bVar9.findViewById(R.id.dialog_sell_item_level_layout);
                        TextView textView7 = (TextView) bVar9.findViewById(R.id.dialog_sell_item_level);
                        EditText editText5 = (EditText) bVar9.findViewById(R.id.dialog_sell_item_edit_text);
                        SeekBar seekBar6 = (SeekBar) bVar9.findViewById(R.id.dialog_sell_item_seekbar_view);
                        ImageView imageView7 = (ImageView) bVar9.findViewById(R.id.dialog_sell_item_close_button);
                        RelativeLayout relativeLayout11 = (RelativeLayout) bVar9.findViewById(R.id.dialog_sell_item_ok_button);
                        ((LinearLayout) bVar9.findViewById(R.id.dialog_sell_item_cost_layout)).setVisibility(8);
                        ((TextView) bVar9.findViewById(R.id.dialog_sell_item_title)).setText(R.string.add_to_bag_title);
                        a.o(MyApplication.f7090a, R.string.button_add, (TextView) bVar9.findViewById(R.id.dialog_sell_item_ok_button_text));
                        if (d8.f4298i > 0) {
                            constraintLayout3.setVisibility(0);
                            textView7.setText(String.valueOf(d8.f4298i));
                        }
                        imageView6.setImageResource(d8.d);
                        editText5.setText("1");
                        seekBar6.setProgress((int) ((1.0d / ((double) Math.min(o.getStockObject().getBagFreeSpace(), d8.h))) * 100.0d));
                        int min = Math.min(o.getStockObject().getBagFreeSpace(), d8.h);
                        if (min < 0) {
                            min = 0;
                        }
                        seekBar6.setOnSeekBarChangeListener(new N(min, editText5));
                        editText5.setFilters(new InputFilter[]{new InputFilter.LengthFilter(4)});
                        editText5.addTextChangedListener(new G0(m02, min, editText5, seekBar6));
                        C0505b bVar10 = bVar9;
                        relativeLayout11.setOnClickListener(new H0(m02, relativeLayout11, bVar10, editText5, d8));
                        imageView7.setOnClickListener(new I0(m02, imageView7, bVar10, 0));
                        bVar10.show();
                        return;
                    }
                    return;
                } else if (i18 != 5) {
                    return;
                } else {
                    if (d8.f4302m) {
                        a.n(MyApplication.f7090a, R.string.can_not_send_block_material, context3, (String) null);
                        return;
                    } else if (!m02.f8925j) {
                        m02.f8925j = true;
                        C0505b bVar11 = new C0505b(context3, R.layout.dialog_sell_item);
                        EditText editText6 = (EditText) bVar11.findViewById(R.id.dialog_sell_item_edit_text);
                        SeekBar seekBar7 = (SeekBar) bVar11.findViewById(R.id.dialog_sell_item_seekbar_view);
                        ImageView imageView8 = (ImageView) bVar11.findViewById(R.id.dialog_sell_item_close_button);
                        RelativeLayout relativeLayout12 = (RelativeLayout) bVar11.findViewById(R.id.dialog_sell_item_ok_button);
                        TextView textView8 = (TextView) bVar11.findViewById(R.id.dialog_sell_item_level);
                        ConstraintLayout constraintLayout4 = (ConstraintLayout) bVar11.findViewById(R.id.dialog_sell_item_level_layout);
                        ((LinearLayout) bVar11.findViewById(R.id.dialog_sell_item_cost_layout)).setVisibility(8);
                        ((TextView) bVar11.findViewById(R.id.dialog_sell_item_title)).setText(R.string.send_material_title);
                        ((TextView) bVar11.findViewById(R.id.dialog_sell_item_number_sells)).setText(R.string.transfer_count);
                        ((TextView) bVar11.findViewById(R.id.dialog_sell_item_ok_button_text)).setText(R.string.button_send);
                        ((ImageView) bVar11.findViewById(R.id.dialog_sell_item_image)).setImageResource(d8.d);
                        if (d8.f4298i > 0) {
                            c3 = 0;
                            constraintLayout4.setVisibility(0);
                            textView8.setText(String.valueOf(d8.f4298i));
                        } else {
                            c3 = 0;
                        }
                        InputFilter[] inputFilterArr = new InputFilter[1];
                        inputFilterArr[c3] = new InputFilter.LengthFilter(5);
                        editText6.setFilters(inputFilterArr);
                        editText6.setText("1");
                        seekBar7.setProgress((int) ((1.0d / ((double) d8.h)) * 100.0d));
                        seekBar7.setOnSeekBarChangeListener(new C0636m(editText6, d8, 4));
                        editText6.setFilters(new InputFilter[]{new InputFilter.LengthFilter(4)});
                        C0505b bVar12 = bVar11;
                        M0 m03 = m02;
                        EditText editText7 = editText6;
                        RelativeLayout relativeLayout13 = relativeLayout12;
                        editText6.addTextChangedListener(new s(m03, d8, editText7, seekBar7, 2));
                        relativeLayout13.setOnClickListener(new H0(m03, relativeLayout13, editText7, bVar12, d8));
                        imageView8.setOnClickListener(new I0(m02, imageView8, bVar12, 1));
                        bVar12.show();
                        return;
                    } else {
                        return;
                    }
                }
            default:
                super.onClick(view);
                C0923f fVar = (C0923f) obj2;
                if (!fVar.f11031w0) {
                    fVar.f11031w0 = true;
                    b.w(true);
                    android.support.v4.media.session.a.i0(new C0920c(fVar, i7));
                }
                ((C0505b) obj).dismiss();
                fVar.f11032x0 = false;
                return;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j(Object obj, RelativeLayout relativeLayout, int i2, Object obj2, int i5) {
        super(relativeLayout);
        this.f1526a = i5;
        this.d = obj;
        this.f1527b = i2;
        this.f1528c = obj2;
    }
}
