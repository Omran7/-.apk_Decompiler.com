package j4;

import F3.h;
import K1.e;
import R2.b;
import Y4.C0245b;
import Y4.D;
import Y4.i;
import Y4.k;
import android.content.Context;
import android.support.v4.media.session.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import b5.f;
import b5.l;
import com.bumptech.glide.d;
import com.mtma.criminal.city.R;
import com.mtma.criminal.city.activities.MainActivity;
import com.mtma.criminal.city.app.MyApplication;
import com.mtma.criminal.city.utils.C0451v;
import com.mtma.criminal.city.utils.U;
import d5.o;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.TimeZone;

/* renamed from: j4.h  reason: case insensitive filesystem */
public final class C0626h extends ArrayAdapter {
    public static final /* synthetic */ int d = 0;

    /* renamed from: e  reason: collision with root package name */
    public static final /* synthetic */ int f9016e = 0;

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f9017a;

    /* renamed from: b  reason: collision with root package name */
    public final Context f9018b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f9019c = false;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0626h(Context context, ArrayList arrayList, int i2) {
        super(context, 0, arrayList);
        this.f9017a = i2;
        this.f9018b = context;
    }

    public static void a(C0626h hVar, D d6, int i2) {
        hVar.getClass();
        int i5 = d6.f4293a;
        int i6 = d6.f4294b;
        String z3 = a.z();
        C0631j0 j0Var = new C0631j0(hVar, d6, i2);
        HashMap hashMap = new HashMap();
        hashMap.put("serverNumber", Integer.valueOf(o.getAccountObject().getCurrentOpenedServer()));
        hashMap.put("playerId", o.getAccountObject().getId());
        hashMap.put("cityNumber", Integer.valueOf(o.getLocationObject().getCurrentCity()));
        hashMap.put("materialId", Integer.valueOf(i5));
        hashMap.put("materialType", Integer.valueOf(i6));
        hashMap.put("changeValue", Integer.valueOf(i2));
        hashMap.put("countNode", z3);
        h.b().a("buyFromMarket").q(hashMap).addOnCompleteListener(new C0451v(j0Var, 4));
    }

    public final View getView(int i2, View view, ViewGroup viewGroup) {
        View view2;
        View view3;
        View view4;
        View view5;
        View view6;
        View view7;
        ViewGroup viewGroup2 = viewGroup;
        switch (this.f9017a) {
            case 0:
                int i5 = i2;
                if (view == null) {
                    view2 = LayoutInflater.from(this.f9018b).inflate(R.layout.item_admin, viewGroup2, false);
                } else {
                    view2 = view;
                }
                ConstraintLayout constraintLayout = (ConstraintLayout) view2.findViewById(R.id.item_admin_profile_pic_layout);
                ImageView imageView = (ImageView) view2.findViewById(R.id.item_admin_profile_pic);
                ImageView imageView2 = (ImageView) view2.findViewById(R.id.item_admin_online_icon);
                TextView textView = (TextView) view2.findViewById(R.id.item_admin_state);
                RelativeLayout relativeLayout = (RelativeLayout) view2.findViewById(R.id.item_admin_message_button);
                RelativeLayout relativeLayout2 = (RelativeLayout) view2.findViewById(R.id.item_admin_report_button);
                C0245b bVar = (C0245b) getItem(i2);
                ((TextView) view2.findViewById(R.id.item_admin_name)).setText(bVar.f4329b);
                ((ImageView) view2.findViewById(R.id.item_admin_gender)).setImageResource(b.M(bVar.f4331e));
                long j6 = bVar.g;
                ((TextView) view2.findViewById(R.id.item_admin_last_seen)).setText(b.y(j6));
                int i6 = bVar.f4332f;
                if (i6 == 0) {
                    com.google.android.gms.internal.measurement.a.o(MyApplication.f7090a, R.string.account_state_admin, textView);
                } else if (i6 == 1) {
                    com.google.android.gms.internal.measurement.a.o(MyApplication.f7090a, R.string.account_state_temporary_admin, textView);
                }
                I1.b.v(imageView, bVar.f4330c);
                if (bVar.d) {
                    imageView.setBackgroundResource(R.drawable.profile_pic_frame_vip);
                } else {
                    imageView.setBackgroundResource(R.drawable.profile_pic_frame_default);
                }
                if (b.l0(j6)) {
                    imageView2.setImageResource(R.drawable.online_dote_icon);
                } else {
                    imageView2.setImageResource(R.drawable.offline_dote_icon);
                }
                constraintLayout.setOnClickListener(new A4.h(this, constraintLayout, bVar, 12));
                C0245b bVar2 = bVar;
                int i7 = i2;
                relativeLayout.setOnClickListener(new C0618d(this, relativeLayout, bVar2, i7, 0));
                relativeLayout2.setOnClickListener(new C0618d(this, relativeLayout2, bVar2, i7, 1));
                return view2;
            case 1:
                int i8 = i2;
                Context context = this.f9018b;
                int i9 = 0;
                if (view == null) {
                    view3 = LayoutInflater.from(context).inflate(R.layout.item_gang, viewGroup2, false);
                } else {
                    view3 = view;
                }
                ImageView imageView3 = (ImageView) view3.findViewById(R.id.item_gang_image);
                LinearLayout linearLayout = (LinearLayout) view3.findViewById(R.id.item_gang_level_layout);
                RelativeLayout relativeLayout3 = (RelativeLayout) view3.findViewById(R.id.item_gang_join_button);
                f fVar = (f) getItem(i2);
                ((TextView) view3.findViewById(R.id.item_gang_name)).setText(fVar.getName());
                ((TextView) view3.findViewById(R.id.item_gang_tag)).setText(MyApplication.f7090a.getApplicationContext().getString(R.string.text_between_square_brackets, new Object[]{fVar.getTag()}));
                ((TextView) view3.findViewById(R.id.item_gang_respect_value)).setText(U.a(fVar.getRespect()));
                ((TextView) view3.findViewById(R.id.item_gang_members_number_value)).setText(MyApplication.f7090a.getApplicationContext().getString(R.string.slash_between_two_number, new Object[]{Integer.valueOf(fVar.getMembersWithPositions().size()), Integer.valueOf(d.y0(fVar.getLevel()))}));
                Date date = new Date(fVar.getCreatedTimeInMilliAsLongValue());
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd-MM-yyyy");
                simpleDateFormat.setTimeZone(TimeZone.getTimeZone("GMT"));
                ((TextView) view3.findViewById(R.id.item_gang_created_date_value)).setText(simpleDateFormat.format(date));
                ((TextView) view3.findViewById(R.id.item_gang_top_chain_value)).setText(U.a((long) fVar.getTopChain()));
                I1.b.u(imageView3, fVar.getId(), fVar.getImageUrl());
                if (fVar.getLevel() > linearLayout.getChildCount()) {
                    int level = fVar.getLevel() - linearLayout.getChildCount();
                    while (i9 < level) {
                        ImageView imageView4 = new ImageView(context);
                        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
                        layoutParams.setMarginStart(e.m(2.0d));
                        layoutParams.setMarginEnd(e.m(2.0d));
                        imageView4.setLayoutParams(layoutParams);
                        imageView4.setImageResource(R.drawable.gang_level_star_icon);
                        linearLayout.addView(imageView4);
                        i9++;
                    }
                } else if (fVar.getLevel() < linearLayout.getChildCount()) {
                    int childCount = linearLayout.getChildCount() - fVar.getLevel();
                    while (i9 < childCount) {
                        linearLayout.removeViewAt(linearLayout.getChildCount() - 1);
                        i9++;
                    }
                }
                imageView3.setOnClickListener(new J(this, imageView3, fVar, 0));
                relativeLayout3.setOnClickListener(new J(this, relativeLayout3, fVar, 1));
                return view3;
            case 2:
                int i10 = i2;
                if (view == null) {
                    view4 = LayoutInflater.from(this.f9018b).inflate(R.layout.item_gang_market_details, viewGroup2, false);
                } else {
                    view4 = view;
                }
                ConstraintLayout constraintLayout2 = (ConstraintLayout) view4.findViewById(R.id.item_gang_market_details_profile_pic_layout);
                ImageView imageView5 = (ImageView) view4.findViewById(R.id.item_gang_market_details_profile_pic);
                ImageView imageView6 = (ImageView) view4.findViewById(R.id.item_gang_market_details_online_icon);
                ImageView imageView7 = (ImageView) view4.findViewById(R.id.item_gang_market_details_button_image);
                RelativeLayout relativeLayout4 = (RelativeLayout) view4.findViewById(R.id.item_gang_market_details_buy_button);
                k kVar = (k) getItem(i2);
                ((ImageView) view4.findViewById(R.id.item_gang_market_details_gender)).setImageResource(b.M(kVar.f4378e));
                ((TextView) view4.findViewById(R.id.item_gang_market_details_name)).setText(kVar.f4377c);
                ((TextView) view4.findViewById(R.id.item_gang_market_details_count)).setText(MyApplication.f7090a.getApplicationContext().getString(R.string.number_with_multiply_sign, new Object[]{Integer.valueOf(kVar.f4383l)}));
                ((TextView) view4.findViewById(R.id.item_gang_market_details_cost_text)).setText(U.b(kVar.f4384m));
                I1.b.v(imageView5, kVar.d);
                if (kVar.f4379f) {
                    imageView5.setBackgroundResource(R.drawable.profile_pic_frame_vip);
                } else {
                    imageView5.setBackgroundResource(R.drawable.profile_pic_frame_default);
                }
                if (kVar.g) {
                    imageView6.setImageResource(R.drawable.online_dote_icon);
                } else {
                    imageView6.setImageResource(R.drawable.offline_dote_icon);
                }
                if (kVar.f4376b.equals(o.getAccountObject().getId())) {
                    imageView7.setImageResource(R.drawable.button_gray);
                } else {
                    imageView7.setImageResource(R.drawable.button_blue);
                }
                relativeLayout4.setOnClickListener(new L(this, relativeLayout4, kVar, 0));
                constraintLayout2.setOnClickListener(new L(this, constraintLayout2, kVar, 1));
                return view4;
            case 3:
                int i11 = i2;
                if (view == null) {
                    view5 = LayoutInflater.from(this.f9018b).inflate(R.layout.item_market, viewGroup2, false);
                } else {
                    view5 = view;
                }
                TextView textView2 = (TextView) view5.findViewById(R.id.item_market_description);
                RelativeLayout relativeLayout5 = (RelativeLayout) view5.findViewById(R.id.item_market_button);
                D d6 = (D) getItem(i2);
                ((TextView) view5.findViewById(R.id.item_market_name)).setText(d6.f4295c);
                ((TextView) view5.findViewById(R.id.item_market_cost)).setText(U.a(d6.f4297f));
                ((ImageView) view5.findViewById(R.id.item_market_image)).setImageResource(d6.d);
                ((TextView) view5.findViewById(R.id.item_market_count)).setText(e.l0(d6.h));
                if (d6.f4306q) {
                    textView2.setTextSize(14.0f);
                    if (d6.f4308s != -1) {
                        textView2.setText(MyApplication.f7090a.getApplicationContext().getString(R.string.gun_description, new Object[]{Integer.valueOf(d6.y()), Integer.valueOf(d6.x())}));
                    } else {
                        textView2.setText(MyApplication.f7090a.getApplicationContext().getString(R.string.armor_description, new Object[]{Integer.valueOf(d6.z()), Integer.valueOf(d6.A())}));
                    }
                } else {
                    textView2.setText(d6.f4296e);
                }
                relativeLayout5.setOnClickListener(new C0623f0(this, relativeLayout5, d6, 2));
                return view5;
            case 4:
                Context context2 = this.f9018b;
                if (view == null) {
                    view6 = LayoutInflater.from(context2).inflate(R.layout.item_private_message, viewGroup2, false);
                } else {
                    view6 = view;
                }
                TextView textView3 = (TextView) view6.findViewById(R.id.item_private_message_name);
                ImageView imageView8 = (ImageView) view6.findViewById(R.id.item_private_message_image);
                RelativeLayout relativeLayout6 = (RelativeLayout) view6.findViewById(R.id.item_private_message_display_button);
                RelativeLayout relativeLayout7 = (RelativeLayout) view6.findViewById(R.id.item_private_message_delete_button);
                l lVar = (l) getItem(i2);
                if (lVar.getPlayerId().equals("@System") || lVar.getPlayerId().equals("@System_Administration")) {
                    textView3.setText(lVar.getPlayerName());
                } else {
                    textView3.setText(b.z(lVar.getPlayerId(), lVar.getPlayerName()));
                }
                if (lVar.isRead()) {
                    imageView8.setImageResource(R.drawable.message_read_icon);
                } else {
                    imageView8.setImageResource(R.drawable.message_unread_icon);
                }
                if (lVar.getPlayerId().equals("@System") || lVar.getPlayerId().equals("@System_Administration")) {
                    com.google.android.gms.internal.measurement.a.i(context2, context2.getResources(), R.color.system_text, textView3);
                } else if (lVar.getPlayerId().equals("@gang")) {
                    com.google.android.gms.internal.measurement.a.i(context2, context2.getResources(), R.color.gang_text, textView3);
                } else {
                    com.google.android.gms.internal.measurement.a.i(context2, context2.getResources(), R.color.text_gray_white, textView3);
                }
                relativeLayout6.setOnClickListener(new C0623f0(this, relativeLayout6, lVar, 8));
                relativeLayout7.setOnClickListener(new C0628i(this, relativeLayout7, i2, 9));
                return view6;
            default:
                if (view == null) {
                    view7 = LayoutInflater.from((MainActivity) this.f9018b).inflate(R.layout.item_fight_club, viewGroup2, false);
                } else {
                    view7 = view;
                }
                ConstraintLayout constraintLayout3 = (ConstraintLayout) view7.findViewById(R.id.item_fight_club_profile_pic_layout);
                ImageView imageView9 = (ImageView) view7.findViewById(R.id.item_fight_club_profile_pic);
                ImageView imageView10 = (ImageView) view7.findViewById(R.id.item_fight_club_online_icon);
                RelativeLayout relativeLayout8 = (RelativeLayout) view7.findViewById(R.id.item_fight_club_fight_button);
                i iVar = (i) getItem(i2);
                ((ImageView) view7.findViewById(R.id.item_fight_club_gender)).setImageResource(b.M(iVar.f4370f));
                ((TextView) view7.findViewById(R.id.item_fight_club_name)).setText(iVar.f4368c);
                ((TextView) view7.findViewById(R.id.item_fight_club_level_text)).setText(String.valueOf(iVar.g));
                ((TextView) view7.findViewById(R.id.item_fight_club_health_text)).setText(MyApplication.f7090a.getApplicationContext().getString(R.string.slash_between_two_text, new Object[]{U.c(iVar.f4371i), U.c(iVar.h)}));
                I1.b.v(imageView9, iVar.f4367b);
                if (iVar.d) {
                    imageView9.setBackgroundResource(R.drawable.profile_pic_frame_vip);
                } else {
                    imageView9.setBackgroundResource(R.drawable.profile_pic_frame_default);
                }
                if (b.l0(iVar.f4369e)) {
                    imageView10.setImageResource(R.drawable.online_dote_icon);
                } else {
                    imageView10.setImageResource(R.drawable.offline_dote_icon);
                }
                relativeLayout8.setOnClickListener(new I(this, relativeLayout8, iVar, 0));
                constraintLayout3.setOnClickListener(new I(this, constraintLayout3, iVar, 1));
                return view7;
        }
    }
}
