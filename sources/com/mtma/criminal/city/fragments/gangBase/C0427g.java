package com.mtma.criminal.city.fragments.gangBase;

import I1.b;
import W0.A;
import W0.v;
import W0.w;
import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.fragment.app.C0269a;
import com.bumptech.glide.c;
import com.google.android.gms.dynamite.descriptors.com.google.firebase.auth.ModuleDescriptor;
import com.google.android.gms.internal.measurement.a;
import com.google.android.gms.internal.p002firebaseauthapi.zzaky;
import com.mtma.criminal.city.R;
import com.mtma.criminal.city.app.MyApplication;
import com.mtma.criminal.city.utils.U;
import com.mtma.criminal.city.utils.v0;
import d5.o;
import e5.C0505b;
import e5.C0509f;

/* renamed from: com.mtma.criminal.city.fragments.gangBase.g  reason: case insensitive filesystem */
public final class C0427g extends C0509f {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f7179a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ C0429i f7180b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0427g(C0429i iVar, View view, int i2) {
        super(view);
        this.f7179a = i2;
        this.f7180b = iVar;
    }

    public final void onClick(View view) {
        View view2 = view;
        switch (this.f7179a) {
            case 0:
                super.onClick(view);
                C0429i iVar = this.f7180b;
                C0429i.V(iVar, new r(iVar.f7194d0, iVar.f7186C0.getLevel()));
                return;
            case 1:
                super.onClick(view);
                int position = o.getGangObject().getPosition();
                C0429i iVar2 = this.f7180b;
                if (position == 0) {
                    a.n(MyApplication.f7090a, R.string.gang_boss_can_not_leave_the_gang, iVar2.f7194d0, (String) null);
                    return;
                } else if (!iVar2.f7192I0) {
                    iVar2.f7192I0 = true;
                    C0505b bVar = new C0505b(iVar2.f7194d0, R.layout.dialog_ok_cancle);
                    RelativeLayout relativeLayout = (RelativeLayout) bVar.findViewById(R.id.dialog_ok_cancel_confirm_button);
                    RelativeLayout relativeLayout2 = (RelativeLayout) bVar.findViewById(R.id.dialog_ok_cancel_cancel_button);
                    ((TextView) bVar.findViewById(R.id.dialog_ok_cancel_text)).setText(MyApplication.f7090a.getApplicationContext().getString(R.string.dialog_confirm_leaving_current_gang));
                    ((LinearLayout) bVar.findViewById(R.id.dialog_ok_cancel_buttons_confirm_cancel_layout)).setVisibility(0);
                    ((TextView) bVar.findViewById(R.id.dialog_ok_cancel_confirm_button_text)).setText(R.string.button_ok);
                    relativeLayout.setOnClickListener(new C0426f(iVar2, relativeLayout, bVar, 2));
                    relativeLayout2.setOnClickListener(new C0426f(iVar2, relativeLayout2, bVar, 3));
                    bVar.show();
                    return;
                } else {
                    return;
                }
            case 2:
                super.onClick(view);
                a.n(MyApplication.f7090a, R.string.gang_feature_next_versions, this.f7180b.f7194d0, (String) null);
                return;
            case 3:
                super.onClick(view);
                int position2 = o.getGangObject().getPosition();
                boolean z3 = true;
                if (!(position2 == 0 || position2 == 1 || position2 == 2 || position2 == 3)) {
                    z3 = false;
                }
                C0429i iVar3 = this.f7180b;
                if (!z3) {
                    a.n(MyApplication.f7090a, R.string.dialog_can_not_open_gang_management, iVar3.f7194d0, (String) null);
                    return;
                } else if (o.getGangObject().getPosition() == 0) {
                    C0429i.V(iVar3, new D(iVar3.f7194d0, iVar3.f7186C0.getLevel(), iVar3.f7186C0.getMembersWithPositions().size(), iVar3.f7186C0.getAvailableRespect(), iVar3.f7186C0.getCash()));
                    return;
                } else {
                    C0429i.V(iVar3, new D(iVar3.f7194d0));
                    return;
                }
            case 4:
                super.onClick(view);
                C0429i iVar4 = this.f7180b;
                C0429i.V(iVar4, new w(iVar4.f7194d0, iVar4.f7186C0.getId(), iVar4.f7186C0.getSkillsLevel(), iVar4.f7186C0.getLevel(), iVar4.f7186C0.getAvailableRespect(), iVar4.f7186C0.getCash(), iVar4.f7186C0.getGold()));
                return;
            case 5:
                super.onClick(view);
                C0429i iVar5 = this.f7180b;
                C0429i.V(iVar5, new o(iVar5.f7194d0, iVar5.f7186C0.getCash(), iVar5.f7186C0.getGold()));
                return;
            case zzaky.zzf.zzf:
                super.onClick(view);
                C0429i iVar6 = this.f7180b;
                C0429i.V(iVar6, new G(iVar6.f7194d0, iVar6.f7186C0.getMembersWithPositions()));
                return;
            case zzaky.zzf.zzg:
                super.onClick(view);
                a.n(MyApplication.f7090a, R.string.gang_feature_next_versions_related_to_mercenary_base_building, this.f7180b.f7194d0, (String) null);
                return;
            case 8:
                super.onClick(view);
                C0429i iVar7 = this.f7180b;
                C0429i.V(iVar7, new s(iVar7.f7194d0));
                return;
            case 9:
                super.onClick(view);
                C0429i iVar8 = this.f7180b;
                C0269a aVar = new C0269a(iVar8.p());
                aVar.h(iVar8);
                aVar.e(false);
                return;
            case 10:
                super.onClick(view);
                int position3 = o.getGangObject().getPosition();
                C0429i iVar9 = this.f7180b;
                if (position3 != 0) {
                    a.n(MyApplication.f7090a, R.string.dialog_gang_only_boss_can_change_gang_picture, iVar9.f7194d0, (String) null);
                    return;
                } else if (!iVar9.f7190G0) {
                    iVar9.f7190G0 = true;
                    iVar9.f7189F0 = null;
                    iVar9.f7188E0 = null;
                    C0505b bVar2 = new C0505b(iVar9.f7194d0, R.layout.dialog_change_profile_pic);
                    iVar9.f7189F0 = bVar2;
                    LinearLayout linearLayout = (LinearLayout) bVar2.findViewById(R.id.dialog_change_profile_pic_cost_layout);
                    TextView textView = (TextView) iVar9.f7189F0.findViewById(R.id.dialog_change_profile_pic_cost);
                    ImageView imageView = (ImageView) iVar9.f7189F0.findViewById(R.id.dialog_profile_pic_image_view);
                    ImageView imageView2 = (ImageView) iVar9.f7189F0.findViewById(R.id.dialog_profile_pic_close_button);
                    RelativeLayout relativeLayout3 = (RelativeLayout) iVar9.f7189F0.findViewById(R.id.dialog_profile_pic_change_button);
                    RelativeLayout relativeLayout4 = (RelativeLayout) iVar9.f7189F0.findViewById(R.id.dialog_profile_pic_ok_button);
                    RelativeLayout relativeLayout5 = (RelativeLayout) iVar9.f7189F0.findViewById(R.id.dialog_profile_pic_remove_button);
                    ((TextView) iVar9.f7189F0.findViewById(R.id.dialog_profile_pic_title)).setText(MyApplication.f7090a.getApplicationContext().getString(R.string.dialog_change_gang_picture_title));
                    b.v(imageView, o.getMainStatesObject().getProfilePicUrl());
                    linearLayout.setVisibility(0);
                    if (iVar9.f7187D0.equals("no_gang_pic")) {
                        a.o(MyApplication.f7090a, R.string.first_gang_picture_free, textView);
                    } else {
                        textView.setText(U.a(1000));
                    }
                    R2.b.c(linearLayout, 3);
                    b.u(imageView, o.getGangObject().getId(), iVar9.f7187D0);
                    imageView.setBackgroundResource(R.drawable.gang_profile_pic_frame);
                    relativeLayout5.setOnClickListener(new C0427g(iVar9, relativeLayout5, 11));
                    relativeLayout4.setOnClickListener(new C0427g(iVar9, relativeLayout4, 12));
                    relativeLayout3.setOnClickListener(new C0427g(iVar9, relativeLayout3, 13));
                    imageView2.setOnClickListener(new C0427g(iVar9, imageView2, 14));
                    iVar9.f7189F0.show();
                    return;
                } else {
                    return;
                }
            case ModuleDescriptor.MODULE_VERSION:
                super.onClick(view);
                C0429i iVar10 = this.f7180b;
                boolean equals = iVar10.f7187D0.equals("no_gang_pic");
                Context context = iVar10.f7194d0;
                if (equals || iVar10.f7187D0.equals("removed_gang_pic")) {
                    a.m(MyApplication.f7090a, R.string.toast_no_gang_image_already, context, view2);
                    return;
                }
                if (!iVar10.f7191H0) {
                    iVar10.f7191H0 = true;
                    C0505b bVar3 = new C0505b(context, R.layout.dialog_ok_cancle);
                    RelativeLayout relativeLayout6 = (RelativeLayout) bVar3.findViewById(R.id.dialog_ok_cancel_confirm_button);
                    RelativeLayout relativeLayout7 = (RelativeLayout) bVar3.findViewById(R.id.dialog_ok_cancel_cancel_button);
                    ((TextView) bVar3.findViewById(R.id.dialog_ok_cancel_text)).setText(R.string.dialog_confirm_want_remove_gang_image);
                    ((LinearLayout) bVar3.findViewById(R.id.dialog_ok_cancel_buttons_confirm_cancel_layout)).setVisibility(0);
                    ((TextView) bVar3.findViewById(R.id.dialog_ok_cancel_confirm_button_text)).setText(R.string.button_ok);
                    relativeLayout6.setOnClickListener(new C0426f(iVar10, relativeLayout6, bVar3, 0));
                    relativeLayout7.setOnClickListener(new C0426f(iVar10, relativeLayout7, bVar3, 1));
                    bVar3.show();
                }
                iVar10.f7189F0.dismiss();
                iVar10.f7190G0 = false;
                return;
            case 12:
                super.onClick(view);
                C0429i iVar11 = this.f7180b;
                if (iVar11.f7188E0 == null) {
                    v0.d(iVar11.f7194d0, view2, MyApplication.f7090a.getApplicationContext().getString(R.string.toast_choose_new_gang_picture_first));
                    return;
                }
                R2.b.w(true);
                if (iVar11.f7187D0.equals("no_gang_pic")) {
                    iVar11.Y();
                } else {
                    U.g(o.getAccountObject().getId(), "gold", -1000, new C0424d(iVar11));
                }
                iVar11.f7189F0.dismiss();
                iVar11.f7190G0 = false;
                return;
            case 13:
                super.onClick(view);
                C0429i iVar12 = this.f7180b;
                if (iVar12.f7187D0.equals("no_gang_pic") || ((long) o.getMoneyObject().getGold()) >= 1000) {
                    w wVar = new w();
                    wVar.f3985C = true;
                    wVar.f4030q = A.f3874b;
                    wVar.f4008a = true;
                    wVar.f4010b = true;
                    wVar.f4041w = true;
                    iVar12.f7193J0.a(new v(wVar));
                    return;
                }
                c.y0(iVar12.f7194d0);
                return;
            default:
                super.onClick(view);
                C0429i iVar13 = this.f7180b;
                iVar13.f7189F0.dismiss();
                iVar13.f7190G0 = false;
                return;
        }
    }
}
