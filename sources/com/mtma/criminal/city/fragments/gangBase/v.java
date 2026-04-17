package com.mtma.criminal.city.fragments.gangBase;

import A4.h;
import I1.b;
import K1.e;
import S3.t;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.C0286s;
import b5.f;
import com.bumptech.glide.c;
import com.bumptech.glide.d;
import com.mtma.criminal.city.R;
import com.mtma.criminal.city.app.MyApplication;
import com.mtma.criminal.city.utils.U;
import com.mtma.criminal.city.views.SquareView;
import d5.o;
import i3.C0592h;

public final class v extends C0286s {

    /* renamed from: A0  reason: collision with root package name */
    public RelativeLayout f7277A0;

    /* renamed from: B0  reason: collision with root package name */
    public RelativeLayout f7278B0;

    /* renamed from: C0  reason: collision with root package name */
    public RelativeLayout f7279C0;

    /* renamed from: D0  reason: collision with root package name */
    public RelativeLayout f7280D0;

    /* renamed from: E0  reason: collision with root package name */
    public RelativeLayout f7281E0;

    /* renamed from: F0  reason: collision with root package name */
    public RelativeLayout f7282F0;

    /* renamed from: G0  reason: collision with root package name */
    public f f7283G0;

    /* renamed from: H0  reason: collision with root package name */
    public boolean f7284H0 = false;

    /* renamed from: d0  reason: collision with root package name */
    public final Context f7285d0;

    /* renamed from: e0  reason: collision with root package name */
    public final String f7286e0;

    /* renamed from: f0  reason: collision with root package name */
    public View f7287f0;

    /* renamed from: g0  reason: collision with root package name */
    public ImageView f7288g0;

    /* renamed from: h0  reason: collision with root package name */
    public ImageView f7289h0;

    /* renamed from: i0  reason: collision with root package name */
    public TextView f7290i0;

    /* renamed from: j0  reason: collision with root package name */
    public TextView f7291j0;

    /* renamed from: k0  reason: collision with root package name */
    public TextView f7292k0;

    /* renamed from: l0  reason: collision with root package name */
    public TextView f7293l0;

    /* renamed from: m0  reason: collision with root package name */
    public TextView f7294m0;

    /* renamed from: n0  reason: collision with root package name */
    public TextView f7295n0;

    /* renamed from: o0  reason: collision with root package name */
    public TextView f7296o0;

    /* renamed from: p0  reason: collision with root package name */
    public TextView f7297p0;

    /* renamed from: q0  reason: collision with root package name */
    public TextView f7298q0;

    /* renamed from: r0  reason: collision with root package name */
    public TextView f7299r0;
    public ImageView s0;

    /* renamed from: t0  reason: collision with root package name */
    public ImageView f7300t0;

    /* renamed from: u0  reason: collision with root package name */
    public SquareView f7301u0;

    /* renamed from: v0  reason: collision with root package name */
    public LinearLayout f7302v0;

    /* renamed from: w0  reason: collision with root package name */
    public ConstraintLayout f7303w0;

    /* renamed from: x0  reason: collision with root package name */
    public ConstraintLayout f7304x0;

    /* renamed from: y0  reason: collision with root package name */
    public ConstraintLayout f7305y0;

    /* renamed from: z0  reason: collision with root package name */
    public ConstraintLayout f7306z0;

    public v(Context context, String str) {
        this.f7285d0 = context;
        this.f7286e0 = str;
    }

    public static void V(v vVar, String str, f fVar) {
        Context context;
        b.u(vVar.f7301u0, fVar.getId(), fVar.getImageUrl());
        vVar.f7290i0.setText(fVar.getName());
        vVar.f7291j0.setText(MyApplication.f7090a.getApplicationContext().getString(R.string.text_between_square_brackets_with_spaces, new Object[]{fVar.getTag()}));
        int i2 = 0;
        while (true) {
            int level = fVar.getLevel();
            context = vVar.f7285d0;
            if (i2 >= level) {
                break;
            }
            ImageView imageView = new ImageView(context);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
            layoutParams.setMarginStart(e.m(2.0d));
            layoutParams.setMarginEnd(e.m(2.0d));
            imageView.setLayoutParams(layoutParams);
            imageView.setImageResource(R.drawable.gang_level_star_icon);
            vVar.f7302v0.addView(imageView);
            i2++;
        }
        vVar.f7292k0.setText(vVar.f7286e0);
        vVar.f7293l0.setText(str);
        vVar.f7294m0.setText(MyApplication.f7090a.getApplicationContext().getString(R.string.slash_between_two_number, new Object[]{Integer.valueOf(fVar.getMembersWithPositions().size()), Integer.valueOf(d.y0(fVar.getLevel()))}));
        vVar.f7295n0.setText(U.a(fVar.getCash()));
        vVar.f7296o0.setText(U.a(fVar.getGold()));
        vVar.f7297p0.setText(String.valueOf(fVar.getTopChain()));
        vVar.f7298q0.setText(U.a(fVar.getRespect()));
        vVar.f7299r0.setText(c.y(fVar.getCreatedTimeInMilli()));
        if (fVar.getId().equals(o.getGangObject().getId()) || o.getGangObject().getId().equals("not_in_gang") || o.getGangObject().getPosition() != 0) {
            vVar.s0.setImageResource(R.drawable.button_gray_large);
        } else {
            vVar.s0.setImageResource(R.drawable.button_red_large);
        }
        if (o.getGangObject().getId().equals("not_in_gang")) {
            vVar.f7300t0.setImageResource(R.drawable.button_blue_large);
        } else {
            vVar.f7300t0.setImageResource(R.drawable.button_gray_large);
        }
        ImageView imageView2 = vVar.f7289h0;
        imageView2.setOnClickListener(new u(vVar, imageView2, 1));
        String name = fVar.getName();
        ImageView imageView3 = vVar.f7288g0;
        imageView3.setOnClickListener(new h(vVar, imageView3, name, 9));
        Animation loadAnimation = AnimationUtils.loadAnimation(context, R.anim.from_top_to_position);
        Animation loadAnimation2 = AnimationUtils.loadAnimation(context, R.anim.from_bottom_to_position);
        Animation loadAnimation3 = AnimationUtils.loadAnimation(context, R.anim.from_start_to_position);
        vVar.f7304x0.setAnimation(loadAnimation);
        vVar.f7306z0.setAnimation(loadAnimation2);
        vVar.f7305y0.setAnimation(loadAnimation3);
        vVar.f7303w0.setVisibility(0);
        R2.b.w(false);
    }

    public final View C(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View inflate = layoutInflater.inflate(R.layout.fragment_gang_profile, viewGroup, false);
        this.f7287f0 = inflate;
        this.f7303w0 = (ConstraintLayout) inflate.findViewById(R.id.fragment_gang_profile_main_layout);
        this.f7304x0 = (ConstraintLayout) this.f7287f0.findViewById(R.id.fragment_gang_profile_top_part_layout);
        this.f7305y0 = (ConstraintLayout) this.f7287f0.findViewById(R.id.fragment_gang_profile_basic_data_layout);
        this.f7306z0 = (ConstraintLayout) this.f7287f0.findViewById(R.id.fragment_gang_profile_buttons_layout);
        this.f7301u0 = (SquareView) this.f7287f0.findViewById(R.id.fragment_gang_profile_image);
        this.f7288g0 = (ImageView) this.f7287f0.findViewById(R.id.fragment_gang_profile_name_copy_button);
        this.f7289h0 = (ImageView) this.f7287f0.findViewById(R.id.fragment_gang_profile_gang_id_copy_button);
        this.f7290i0 = (TextView) this.f7287f0.findViewById(R.id.fragment_gang_profile_name);
        this.f7291j0 = (TextView) this.f7287f0.findViewById(R.id.fragment_gang_profile_tag);
        this.f7302v0 = (LinearLayout) this.f7287f0.findViewById(R.id.fragment_gang_profile_level_layout);
        this.f7292k0 = (TextView) this.f7287f0.findViewById(R.id.fragment_gang_profile_gang_id);
        this.f7293l0 = (TextView) this.f7287f0.findViewById(R.id.fragment_gang_profile_boss_name);
        this.f7294m0 = (TextView) this.f7287f0.findViewById(R.id.fragment_gang_profile_members_number);
        this.f7295n0 = (TextView) this.f7287f0.findViewById(R.id.fragment_gang_profile_cash);
        this.f7296o0 = (TextView) this.f7287f0.findViewById(R.id.fragment_gang_profile_gold);
        this.f7297p0 = (TextView) this.f7287f0.findViewById(R.id.fragment_gang_profile_top_chain);
        this.f7298q0 = (TextView) this.f7287f0.findViewById(R.id.fragment_gang_profile_respect);
        this.f7299r0 = (TextView) this.f7287f0.findViewById(R.id.fragment_gang_profile_created_date);
        this.f7278B0 = (RelativeLayout) this.f7287f0.findViewById(R.id.fragment_gang_profile_skills_button);
        this.f7277A0 = (RelativeLayout) this.f7287f0.findViewById(R.id.fragment_gang_profile_wars_button);
        this.f7279C0 = (RelativeLayout) this.f7287f0.findViewById(R.id.fragment_gang_profile_members_button);
        this.f7280D0 = (RelativeLayout) this.f7287f0.findViewById(R.id.fragment_gang_profile_declaration_war_button);
        this.s0 = (ImageView) this.f7287f0.findViewById(R.id.fragment_gang_profile_declaration_war_button_image);
        this.f7281E0 = (RelativeLayout) this.f7287f0.findViewById(R.id.fragment_gang_profile_join_button);
        this.f7300t0 = (ImageView) this.f7287f0.findViewById(R.id.fragment_gang_profile_join_button_image);
        this.f7282F0 = (RelativeLayout) this.f7287f0.findViewById(R.id.fragment_gang_profile_back_button);
        R2.b.w(true);
        C0592h.b().e().E(R2.b.Z()).E("gangs").E("gangsData").E(this.f7286e0).d(new t(this, 23));
        RelativeLayout relativeLayout = this.f7278B0;
        relativeLayout.setOnClickListener(new u(this, relativeLayout, 2));
        RelativeLayout relativeLayout2 = this.f7277A0;
        relativeLayout2.setOnClickListener(new u(this, relativeLayout2, 3));
        RelativeLayout relativeLayout3 = this.f7279C0;
        relativeLayout3.setOnClickListener(new u(this, relativeLayout3, 4));
        RelativeLayout relativeLayout4 = this.f7280D0;
        relativeLayout4.setOnClickListener(new u(this, relativeLayout4, 5));
        RelativeLayout relativeLayout5 = this.f7281E0;
        relativeLayout5.setOnClickListener(new u(this, relativeLayout5, 6));
        RelativeLayout relativeLayout6 = this.f7282F0;
        relativeLayout6.setOnClickListener(new u(this, relativeLayout6, 0));
        return this.f7287f0;
    }
}
