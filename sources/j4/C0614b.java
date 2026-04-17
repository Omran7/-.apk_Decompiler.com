package j4;

import A4.h;
import K1.e;
import R2.b;
import Y4.B;
import Y4.C;
import Y4.C0244a;
import Y4.C0246c;
import Y4.C0247d;
import Y4.D;
import Y4.j;
import Y4.l;
import Y4.r;
import Y4.v;
import android.content.Context;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bumptech.glide.c;
import com.bumptech.glide.d;
import com.google.android.gms.dynamite.descriptors.com.google.firebase.auth.ModuleDescriptor;
import com.google.android.gms.internal.measurement.a;
import com.google.android.gms.internal.p002firebaseauthapi.zzaky;
import com.mtma.criminal.city.R;
import com.mtma.criminal.city.app.MyApplication;
import com.mtma.criminal.city.utils.Q;
import com.mtma.criminal.city.utils.U;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.TimeZone;

/* renamed from: j4.b  reason: case insensitive filesystem */
public final class C0614b extends ArrayAdapter {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f8974a;

    /* renamed from: b  reason: collision with root package name */
    public final Context f8975b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0614b(Context context, ArrayList arrayList, int i2) {
        super(context, 0, arrayList);
        this.f8974a = i2;
        this.f8975b = context;
    }

    public static String a(C0614b bVar, int i2) {
        bVar.getClass();
        if (i2 == 0) {
            return "game_music";
        }
        if (i2 == 1) {
            return "buttons_and_ui_transitions_sounds";
        }
        if (i2 == 2) {
            return "notifications_alert";
        }
        if (i2 != 3) {
            return null;
        }
        return "animations";
    }

    public final View getView(int i2, View view, ViewGroup viewGroup) {
        View view2;
        View view3;
        View view4;
        int i5;
        View view5;
        View view6;
        View view7;
        String str;
        View view8;
        View view9;
        View view10;
        View view11;
        View view12;
        View view13;
        View view14;
        int i6 = i2;
        ViewGroup viewGroup2 = viewGroup;
        Context context = this.f8975b;
        switch (this.f8974a) {
            case 0:
                if (view == null) {
                    view2 = LayoutInflater.from(context).inflate(R.layout.item_ad, viewGroup2, false);
                } else {
                    view2 = view;
                }
                ImageView imageView = (ImageView) view2.findViewById(R.id.item_ad_profile_pic);
                ImageView imageView2 = (ImageView) view2.findViewById(R.id.item_ad_vip_icon);
                ImageView imageView3 = (ImageView) view2.findViewById(R.id.item_ad_online_icon);
                C0244a aVar = (C0244a) getItem(i2);
                ((TextView) view2.findViewById(R.id.item_ad_content)).setText(aVar.d);
                ((TextView) view2.findViewById(R.id.item_ad_name)).setText(aVar.f4324b);
                ((ImageView) view2.findViewById(R.id.item_ad_gender)).setImageResource(b.M(aVar.g));
                ((TextView) view2.findViewById(R.id.item_ad_date)).setText(c.y(aVar.h));
                Date date = new Date(((Long) aVar.h).longValue());
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("HH:mm:ss");
                simpleDateFormat.setTimeZone(TimeZone.getTimeZone("GMT"));
                ((TextView) view2.findViewById(R.id.item_ad_time)).setText(simpleDateFormat.format(date));
                if (aVar.f4326e) {
                    imageView.setBackgroundResource(R.drawable.profile_pic_frame_vip);
                    imageView2.setVisibility(0);
                } else {
                    imageView.setBackgroundResource(R.drawable.profile_pic_frame_default);
                    imageView2.setVisibility(8);
                }
                if (aVar.f4327f) {
                    imageView3.setImageResource(R.drawable.online_dote_icon);
                } else {
                    imageView3.setImageResource(R.drawable.offline_dote_icon);
                }
                I1.b.v(imageView, aVar.f4325c);
                imageView.setOnClickListener(new h(this, imageView, aVar, 11));
                return view2;
            case 1:
                if (view == null) {
                    view3 = LayoutInflater.from(context).inflate(R.layout.item_ad_system, viewGroup2, false);
                } else {
                    view3 = view;
                }
                b5.c cVar = (b5.c) getItem(i2);
                ((TextView) view3.findViewById(R.id.item_ad_system_title)).setText(cVar.getTitle());
                ((TextView) view3.findViewById(R.id.item_ad_system_content)).setText(cVar.getContent());
                ((TextView) view3.findViewById(R.id.item_ad_system_data_and_time)).setText(c.z(cVar.getUnixTimeInMilli()));
                return view3;
            case 2:
                if (view == null) {
                    view4 = LayoutInflater.from(context).inflate(R.layout.item_fight, viewGroup2, false);
                } else {
                    view4 = view;
                }
                LinearLayout linearLayout = (LinearLayout) view4.findViewById(R.id.item_fight_main_layout);
                TextView textView = (TextView) view4.findViewById(R.id.item_fight_description);
                j jVar = (j) getItem(i2);
                boolean z3 = jVar.f4374c;
                String str2 = jVar.f4372a;
                if (z3) {
                    linearLayout.setGravity(5);
                    linearLayout.setPadding(0, 0, 0, 0);
                    textView.setBackgroundResource(0);
                    textView.setText(str2);
                    a.i(context, MyApplication.f7090a.getApplicationContext().getResources(), R.color.system_text_2, textView);
                } else {
                    textView.setTextColor(MyApplication.f7090a.getApplicationContext().getResources().getColor(R.color.text_gray_white, context.getTheme()));
                    textView.setBackgroundResource(R.drawable.edit_text_background);
                    if (jVar.f4373b) {
                        linearLayout.setGravity(5);
                        linearLayout.setPadding(e.m(32.0d), 0, 0, 0);
                        i5 = R.color.fight_green_text;
                    } else {
                        linearLayout.setGravity(3);
                        linearLayout.setPadding(0, 0, e.m(32.0d), 0);
                        i5 = R.color.fight_red_text;
                    }
                    SpannableString spannableString = new SpannableString(str2);
                    spannableString.setSpan(new ForegroundColorSpan(context.getResources().getColor(i5, context.getTheme())), str2.indexOf(":") + 1, str2.length(), 34);
                    textView.setText(spannableString);
                }
                return view4;
            case 3:
                if (view == null) {
                    view5 = LayoutInflater.from(context).inflate(R.layout.item_gang_market, viewGroup2, false);
                } else {
                    view5 = view;
                }
                RelativeLayout relativeLayout = (RelativeLayout) view5.findViewById(R.id.item_gang_market_enter_button);
                TextView textView2 = (TextView) view5.findViewById(R.id.item_gang_market_description);
                TextView textView3 = (TextView) view5.findViewById(R.id.item_gang_market_damage_name);
                TextView textView4 = (TextView) view5.findViewById(R.id.item_gang_market_damage_value);
                TextView textView5 = (TextView) view5.findViewById(R.id.item_gang_market_accuracy_name);
                TextView textView6 = (TextView) view5.findViewById(R.id.item_gang_market_accuracy_value);
                TextView textView7 = (TextView) view5.findViewById(R.id.item_gang_market_happiness);
                ImageView imageView4 = (ImageView) view5.findViewById(R.id.item_gang_market_happiness_image);
                GridView gridView = (GridView) view5.findViewById(R.id.item_gang_market_grid_view);
                D d = (D) getItem(i2);
                ((TextView) view5.findViewById(R.id.item_gang_market_name)).setText(d.f4295c);
                ((ImageView) view5.findViewById(R.id.item_gang_market_image)).setImageResource(d.d);
                boolean z4 = d.f4306q;
                if (z4 && d.f4307r) {
                    textView3.setVisibility(0);
                    textView4.setVisibility(0);
                    textView5.setVisibility(0);
                    textView6.setVisibility(0);
                    textView2.setVisibility(8);
                    imageView4.setVisibility(8);
                    textView7.setVisibility(8);
                    gridView.setVisibility(8);
                    textView3.setText(R.string.damage);
                    textView4.setText(String.valueOf(d.y()));
                    textView5.setText(R.string.accuracy);
                    textView6.setText(String.valueOf(d.x()));
                } else if (!z4 || d.f4307r) {
                    int i7 = d.f4294b;
                    if (i7 == 15) {
                        textView3.setVisibility(8);
                        textView4.setVisibility(8);
                        textView5.setVisibility(8);
                        textView6.setVisibility(8);
                        textView2.setVisibility(8);
                        imageView4.setVisibility(0);
                        textView7.setVisibility(0);
                        gridView.setVisibility(0);
                        textView7.setText(MyApplication.f7090a.getApplicationContext().getString(R.string.number_with_plus_sign, new Object[]{Integer.valueOf(d.f4314y)}));
                        ArrayList arrayList = new ArrayList();
                        for (int i8 = 0; i8 < d.f4315z.size(); i8++) {
                            arrayList.add(new C0246c(e.R(((Integer) d.f4315z.get(i8)).intValue()), ((Integer) d.f4289A.get(i8)).intValue(), e.M(((Integer) d.f4315z.get(i8)).intValue())));
                        }
                        gridView.setAdapter(new C0641q(context, arrayList, 3));
                    } else if (i7 == 16) {
                        textView3.setVisibility(0);
                        textView4.setVisibility(0);
                        textView5.setVisibility(0);
                        textView6.setVisibility(0);
                        textView2.setVisibility(8);
                        imageView4.setVisibility(8);
                        textView7.setVisibility(8);
                        gridView.setVisibility(8);
                        textView3.setText(R.string.limit);
                        textView4.setText(String.valueOf(0));
                        textView5.setText(R.string.effect);
                        textView6.setText(String.valueOf(0));
                    } else {
                        textView3.setVisibility(8);
                        textView4.setVisibility(8);
                        textView5.setVisibility(8);
                        textView6.setVisibility(8);
                        imageView4.setVisibility(8);
                        textView7.setVisibility(8);
                        gridView.setVisibility(8);
                        textView2.setVisibility(0);
                        textView2.setText(d.f4296e);
                    }
                } else {
                    textView3.setVisibility(0);
                    textView4.setVisibility(0);
                    textView5.setVisibility(0);
                    textView6.setVisibility(0);
                    textView2.setVisibility(8);
                    imageView4.setVisibility(8);
                    textView7.setVisibility(8);
                    gridView.setVisibility(8);
                    textView3.setText(R.string.defence);
                    textView4.setText(String.valueOf(d.z()));
                    textView5.setText(R.string.evasion);
                    textView6.setText(String.valueOf(d.A()));
                }
                relativeLayout.setOnClickListener(new h(this, relativeLayout, d, 20));
                imageView4.setOnClickListener(new C0646w(this, imageView4, 1));
                return view5;
            case 4:
                if (view == null) {
                    view6 = LayoutInflater.from(context).inflate(R.layout.item_gang_member, viewGroup2, false);
                } else {
                    view6 = view;
                }
                ConstraintLayout constraintLayout = (ConstraintLayout) view6.findViewById(R.id.item_gang_member_profile_pic_layout);
                ImageView imageView5 = (ImageView) view6.findViewById(R.id.item_gang_member_profile_pic);
                ImageView imageView6 = (ImageView) view6.findViewById(R.id.item_gang_member_online_icon);
                ImageView imageView7 = (ImageView) view6.findViewById(R.id.item_gang_member_vip_icon);
                l lVar = (l) getItem(i2);
                ((TextView) view6.findViewById(R.id.item_gang_member_name)).setText(lVar.f4386b);
                ((ImageView) view6.findViewById(R.id.item_gang_member_gender)).setImageResource(b.M(lVar.d));
                ((TextView) view6.findViewById(R.id.item_gang_member_level)).setText(String.valueOf(lVar.f4388e));
                ((TextView) view6.findViewById(R.id.item_gang_member_position)).setText(d.n0(lVar.h));
                ((TextView) view6.findViewById(R.id.item_gang_member_place)).setText(b.I(lVar.f4389f, lVar.g));
                ((TextView) view6.findViewById(R.id.item_gang_member_respect_value)).setText(U.a(lVar.f4390i));
                ((TextView) view6.findViewById(R.id.item_gang_member_loyalty_value)).setText(U.a(lVar.f4391j));
                ((TextView) view6.findViewById(R.id.item_gang_member_contribution_value)).setText(U.a(lVar.f4392k));
                I1.b.v(imageView5, lVar.f4387c);
                if (lVar.f4394m) {
                    imageView5.setBackgroundResource(R.drawable.profile_pic_frame_vip);
                    imageView7.setVisibility(0);
                } else {
                    imageView5.setBackgroundResource(R.drawable.profile_pic_frame_default);
                    imageView7.setVisibility(8);
                }
                if (lVar.f4395n) {
                    imageView6.setImageResource(R.drawable.online_dote_icon);
                } else {
                    imageView6.setImageResource(R.drawable.offline_dote_icon);
                }
                constraintLayout.setOnClickListener(new h(this, constraintLayout, lVar, 22));
                return view6;
            case 5:
                if (view == null) {
                    view7 = LayoutInflater.from(context).inflate(R.layout.item_inflated_material, viewGroup2, false);
                    view7.startAnimation(AnimationUtils.loadAnimation(context, R.anim.inflate_item));
                } else {
                    view7 = view;
                }
                TextView textView8 = (TextView) view7.findViewById(R.id.item_material_count);
                D d6 = (D) getItem(i2);
                ((ImageView) view7.findViewById(R.id.item_material_image)).setImageResource(d6.d);
                int i9 = d6.f4293a;
                if (i9 == -10) {
                    str = MyApplication.f7090a.getApplicationContext().getString(R.string.number_with_multiply_sign, new Object[]{Long.valueOf(Math.abs(((long) d6.f4293a) * 1000000))});
                } else if (i9 == -50) {
                    str = MyApplication.f7090a.getApplicationContext().getString(R.string.number_with_multiply_sign, new Object[]{Long.valueOf(Math.abs(((long) d6.f4293a) * 1000000))});
                } else if (i9 == -600) {
                    str = MyApplication.f7090a.getApplicationContext().getString(R.string.number_with_multiply_sign, new Object[]{Integer.valueOf(Math.abs(d6.f4293a))});
                } else {
                    str = MyApplication.f7090a.getApplicationContext().getString(R.string.number_with_multiply_sign, new Object[]{Integer.valueOf(d6.h)});
                }
                textView8.setText(str);
                return view7;
            case zzaky.zzf.zzf:
                if (view == null) {
                    view8 = LayoutInflater.from(context).inflate(R.layout.item_inflated_material, viewGroup2, false);
                } else {
                    view8 = view;
                }
                ImageView imageView8 = (ImageView) view8.findViewById(R.id.item_material_image);
                C0247d dVar = (C0247d) getItem(i2);
                imageView8.setImageResource(dVar.f4338b);
                ((TextView) view8.findViewById(R.id.item_material_count)).setText(e.l0(dVar.f4339c));
                imageView8.setOnClickListener(new C0628i(this, imageView8, i6, 7));
                return view8;
            case zzaky.zzf.zzg:
                if (view == null) {
                    view9 = LayoutInflater.from(context).inflate(R.layout.item_medal, viewGroup2, false);
                } else {
                    view9 = view;
                }
                TextView textView9 = (TextView) view9.findViewById(R.id.item_medal_description);
                r rVar = (r) getItem(i2);
                ((TextView) view9.findViewById(R.id.item_medal_name)).setText(rVar.d);
                ((ImageView) view9.findViewById(R.id.item_medal_image)).setImageResource(rVar.f4421f);
                ((TextView) view9.findViewById(R.id.item_medal_level)).setText(String.valueOf(rVar.f4418b));
                int i10 = rVar.f4419c;
                ArrayList arrayList2 = Q.f7375a;
                if (i10 == 1) {
                    textView9.setText(rVar.f4420e);
                } else {
                    textView9.setText(MyApplication.f7090a.getApplicationContext().getString(rVar.f4420e, new Object[]{Integer.valueOf(rVar.f4419c)}));
                }
                return view9;
            case 8:
                if (view == null) {
                    view10 = LayoutInflater.from(context).inflate(R.layout.item_medal_image, viewGroup2, false);
                } else {
                    view10 = view;
                }
                ImageView imageView9 = (ImageView) view10.findViewById(R.id.item_medal_image);
                r rVar2 = (r) getItem(i2);
                imageView9.setImageResource(rVar2.f4421f);
                imageView9.setOnClickListener(new C0623f0(this, imageView9, rVar2, 4));
                return view10;
            case 9:
                if (view == null) {
                    view11 = LayoutInflater.from(context).inflate(R.layout.item_basic_2, viewGroup2, false);
                } else {
                    view11 = view;
                }
                RelativeLayout relativeLayout2 = (RelativeLayout) view11.findViewById(R.id.item_basic_button);
                ImageView imageView10 = (ImageView) view11.findViewById(R.id.item_basic_button_image);
                TextView textView10 = (TextView) view11.findViewById(R.id.item_basic_button_text);
                C0246c cVar2 = (C0246c) getItem(i2);
                ((ImageView) view11.findViewById(R.id.item_basic_image)).setImageResource(cVar2.f4335c);
                ((TextView) view11.findViewById(R.id.item_basic_title)).setText(cVar2.f4333a);
                ((TextView) view11.findViewById(R.id.item_basic_description)).setText(cVar2.f4334b);
                if (cVar2.f4336e) {
                    imageView10.setImageResource(R.drawable.button_red);
                    textView10.setText(R.string.disable);
                } else {
                    imageView10.setImageResource(R.drawable.button_blue);
                    textView10.setText(R.string.enable);
                }
                relativeLayout2.setOnClickListener(new K4.j((Object) this, relativeLayout2, i2, (Object) cVar2, 11));
                return view11;
            case 10:
                if (view == null) {
                    view12 = LayoutInflater.from(context).inflate(R.layout.item_phone, viewGroup2, false);
                } else {
                    view12 = view;
                }
                ConstraintLayout constraintLayout2 = (ConstraintLayout) view12.findViewById(R.id.item_phone_main_layout);
                ImageView imageView11 = (ImageView) view12.findViewById(R.id.item_phone_alert_icon);
                v vVar = (v) getItem(i2);
                ((TextView) view12.findViewById(R.id.item_phone_textview)).setText(vVar.f4440a);
                ((ImageView) view12.findViewById(R.id.item_phone_imageview)).setImageResource(vVar.f4441b);
                if (vVar.f4442c) {
                    imageView11.setVisibility(0);
                } else {
                    imageView11.setVisibility(4);
                }
                constraintLayout2.setOnClickListener(new C0628i(this, constraintLayout2, i6, 8));
                return view12;
            case ModuleDescriptor.MODULE_VERSION:
                if (view == null) {
                    view13 = LayoutInflater.from(context).inflate(R.layout.item_search_result, viewGroup2, false);
                } else {
                    view13 = view;
                }
                ConstraintLayout constraintLayout3 = (ConstraintLayout) view13.findViewById(R.id.item_search_result_profile_pic_layout);
                ImageView imageView12 = (ImageView) view13.findViewById(R.id.item_search_result_profile_pic);
                ImageView imageView13 = (ImageView) view13.findViewById(R.id.item_search_result_online_icon);
                B b6 = (B) getItem(i2);
                ((TextView) view13.findViewById(R.id.item_search_result_player_name)).setText(b6.f4280b);
                ((ImageView) view13.findViewById(R.id.item_search_result_gender)).setImageResource(b.M(b6.f4283f));
                ((TextView) view13.findViewById(R.id.item_search_result_level)).setText(String.valueOf(b6.g));
                ((TextView) view13.findViewById(R.id.item_search_result_city)).setText(I1.b.D(b6.h));
                ((TextView) view13.findViewById(R.id.item_search_result_place)).setText(MyApplication.f7090a.getApplicationContext().getString(R.string.player_place, new Object[]{MyApplication.f7090a.getApplicationContext().getString(c.K(b6.f4284i))}));
                I1.b.v(imageView12, b6.f4281c);
                if (b6.d) {
                    imageView12.setBackgroundResource(R.drawable.profile_pic_frame_vip);
                } else {
                    imageView12.setBackgroundResource(R.drawable.profile_pic_frame_default);
                }
                if (b6.f4282e) {
                    imageView13.setImageResource(R.drawable.online_dote_icon);
                } else {
                    imageView13.setImageResource(R.drawable.offline_dote_icon);
                }
                constraintLayout3.setOnClickListener(new C0623f0(this, constraintLayout3, b6, 12));
                return view13;
            default:
                if (view == null) {
                    view14 = LayoutInflater.from(context).inflate(R.layout.item_skill, viewGroup2, false);
                } else {
                    view14 = view;
                }
                ImageView imageView14 = (ImageView) view14.findViewById(R.id.item_skill_improve_button_image);
                RelativeLayout relativeLayout3 = (RelativeLayout) view14.findViewById(R.id.item_skill_improve_button);
                LinearLayout linearLayout2 = (LinearLayout) view14.findViewById(R.id.item_skill_merit_needed_layout);
                C c3 = (C) getItem(i2);
                ((TextView) view14.findViewById(R.id.item_skill_name)).setText(c3.f4286b);
                ((TextView) view14.findViewById(R.id.item_skill_description)).setText(MyApplication.f7090a.getApplicationContext().getString(c3.f4287c, new Object[]{Integer.valueOf(e.U(i2))}));
                ((TextView) view14.findViewById(R.id.item_skill_level_number)).setText(String.valueOf(c3.f4288e));
                ((TextView) view14.findViewById(R.id.item_skill_needed_merit_number)).setText(String.valueOf(c3.f4288e + 1));
                ((ImageView) view14.findViewById(R.id.item_skill_image)).setImageResource(c3.d);
                if (c3.f4288e >= 10) {
                    imageView14.setImageResource(R.drawable.button_gray);
                    linearLayout2.setVisibility(4);
                } else {
                    imageView14.setImageResource(R.drawable.button_blue);
                    linearLayout2.setVisibility(0);
                }
                relativeLayout3.setOnClickListener(new K4.j((ArrayAdapter) this, relativeLayout3, (Object) c3, i2, 15));
                return view14;
        }
    }
}
