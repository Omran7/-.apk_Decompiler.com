package j4;

import A4.h;
import K1.e;
import K4.j;
import R2.b;
import Y4.D;
import Y4.o;
import Y4.p;
import Y4.u;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import b5.C0325a;
import com.bumptech.glide.c;
import com.google.android.gms.internal.measurement.a;
import com.mtma.criminal.city.R;
import com.mtma.criminal.city.activities.MainActivity;
import com.mtma.criminal.city.app.MyApplication;
import com.mtma.criminal.city.utils.L;
import com.mtma.criminal.city.utils.U;
import i3.C0592h;
import java.util.ArrayList;

/* renamed from: j4.a  reason: case insensitive filesystem */
public final class C0612a extends ArrayAdapter {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f8969a;

    /* renamed from: b  reason: collision with root package name */
    public final MainActivity f8970b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0612a(MainActivity mainActivity, ArrayList arrayList, int i2) {
        super(mainActivity, 0, arrayList);
        this.f8969a = i2;
        this.f8970b = mainActivity;
    }

    public static void a(C0612a aVar, int i2) {
        aVar.getClass();
        b.w(true);
        a.d(a.c(C0592h.b().e(), "players"), "gymObject", "selectedGymLesson").I(Integer.valueOf(i2)).addOnSuccessListener(new L(aVar, i2, 3));
    }

    public final View getView(int i2, View view, ViewGroup viewGroup) {
        switch (this.f8969a) {
            case 0:
                if (view == null) {
                    view = LayoutInflater.from(this.f8970b).inflate(R.layout.item_activity, viewGroup, false);
                }
                ImageView imageView = (ImageView) view.findViewById(R.id.item_activity_image);
                C0325a aVar = (C0325a) getItem(i2);
                ((TextView) view.findViewById(R.id.item_activity_name)).setText(aVar.getNameResourceId());
                ((TextView) view.findViewById(R.id.item_activity_time_start)).setText(c.z(Long.valueOf(aVar.getStartTimeInMilli())));
                ((TextView) view.findViewById(R.id.item_activity_time_end)).setText(c.z(Long.valueOf(aVar.getEndTimeInMilli())));
                if (aVar.getState() == 0) {
                    imageView.setImageResource(R.drawable.activity_open_icon);
                } else if (aVar.getState() == 1) {
                    imageView.setImageResource(R.drawable.activity_soon_icon);
                } else {
                    imageView.setImageResource(R.drawable.activity_end_icon);
                }
                return view;
            case 1:
                if (view == null) {
                    view = LayoutInflater.from(this.f8970b).inflate(R.layout.item_gift_buy_gold, viewGroup, false);
                }
                ImageView imageView2 = (ImageView) view.findViewById(R.id.item_gift_buy_gold_image);
                D d = (D) getItem(i2);
                imageView2.setImageResource(d.d);
                ((TextView) view.findViewById(R.id.item_gift_buy_gold_name)).setText(d.f4295c);
                ((TextView) view.findViewById(R.id.item_gift_buy_gold_value)).setText(MyApplication.f7090a.getApplicationContext().getString(R.string.text_with_multiply_sign, new Object[]{U.a((long) d.h)}));
                imageView2.setOnClickListener(new h(this, imageView2, d, 26));
                return view;
            case 2:
                if (view == null) {
                    view = LayoutInflater.from(this.f8970b).inflate(R.layout.item_gym, viewGroup, false);
                }
                RelativeLayout relativeLayout = (RelativeLayout) view.findViewById(R.id.item_gym_use_button);
                ImageView imageView3 = (ImageView) view.findViewById(R.id.item_gym_use_button_image_view);
                ImageView imageView4 = (ImageView) view.findViewById(R.id.item_gym_used_image);
                ImageView imageView5 = (ImageView) view.findViewById(R.id.item_gym_static_icon);
                TextView textView = (TextView) view.findViewById(R.id.item_gym_description);
                TextView textView2 = (TextView) view.findViewById(R.id.item_gym_cost);
                ImageView imageView6 = (ImageView) view.findViewById(R.id.item_gym_cost_image);
                o oVar = (o) getItem(i2);
                ((TextView) view.findViewById(R.id.item_gym_title)).setText(oVar.f4406a);
                ((ImageView) view.findViewById(R.id.item_gym_image)).setImageResource(oVar.f4408c);
                int i5 = oVar.f4407b;
                if (i5 == -1) {
                    imageView5.setImageResource(oVar.d);
                    imageView5.setVisibility(0);
                    textView.setVisibility(4);
                } else {
                    textView.setText(i5);
                    textView.setVisibility(0);
                    imageView5.setVisibility(4);
                }
                if (oVar.f4410f) {
                    relativeLayout.setVisibility(4);
                    imageView4.setVisibility(0);
                    b.J0(imageView4, 30.0f);
                } else {
                    imageView4.clearAnimation();
                    relativeLayout.setVisibility(0);
                    imageView4.setVisibility(4);
                }
                if (oVar.g) {
                    imageView3.setImageResource(R.drawable.button_blue_small);
                    imageView6.setVisibility(8);
                    textView2.setText(R.string.gym_category_opened);
                } else {
                    if (I1.b.n0(i2)) {
                        imageView3.setImageResource(R.drawable.button_blue_small);
                    } else {
                        imageView3.setImageResource(R.drawable.button_gray_small);
                    }
                    imageView6.setVisibility(0);
                    textView2.setText(U.a(oVar.f4409e));
                }
                relativeLayout.setOnClickListener(new j((ArrayAdapter) this, relativeLayout, (Object) oVar, i2, 8));
                imageView5.setOnClickListener(new C0628i(this, imageView5, i2, 6));
                return view;
            case 3:
                if (view == null) {
                    view = LayoutInflater.from(this.f8970b).inflate(R.layout.item_herb, viewGroup, false);
                }
                ImageView imageView7 = (ImageView) view.findViewById(R.id.item_herb_image);
                p pVar = (p) getItem(i2);
                imageView7.setImageResource(pVar.f4412b);
                ((TextView) view.findViewById(R.id.item_herb_timer)).setText(e.L("HH:mm:ss", c.T(pVar.f4413c)));
                imageView7.setOnClickListener(new h(this, imageView7, pVar, 27));
                return view;
            case 4:
                if (view == null) {
                    view = LayoutInflater.from(this.f8970b).inflate(R.layout.item_patient, viewGroup, false);
                }
                ConstraintLayout constraintLayout = (ConstraintLayout) view.findViewById(R.id.item_patient_profile_pic_layout);
                ImageView imageView8 = (ImageView) view.findViewById(R.id.item_patient_profile_pic);
                ImageView imageView9 = (ImageView) view.findViewById(R.id.item_patient_online_icon);
                u uVar = (u) getItem(i2);
                ((TextView) view.findViewById(R.id.item_patient_name)).setText(uVar.f4435b);
                ((TextView) view.findViewById(R.id.item_patient_description)).setText(MyApplication.f7090a.getApplicationContext().getString(R.string.item_patient_description, new Object[]{uVar.h}));
                ((TextView) view.findViewById(R.id.item_patient_level)).setText(String.valueOf(uVar.f4438f));
                ((ImageView) view.findViewById(R.id.item_patient_gender)).setImageResource(b.M(uVar.f4437e));
                I1.b.v(imageView8, uVar.f4436c);
                if (uVar.d) {
                    imageView8.setBackgroundResource(R.drawable.profile_pic_frame_vip);
                } else {
                    imageView8.setBackgroundResource(R.drawable.profile_pic_frame_default);
                }
                if (b.l0(uVar.g)) {
                    imageView9.setImageResource(R.drawable.online_dote_icon);
                } else {
                    imageView9.setImageResource(R.drawable.offline_dote_icon);
                }
                constraintLayout.setOnClickListener(new C0623f0(this, constraintLayout, uVar, 0));
                return view;
            default:
                if (view == null) {
                    view = LayoutInflater.from(this.f8970b).inflate(R.layout.item_lucky_wheel, viewGroup, false);
                }
                b5.h hVar = (b5.h) getItem(i2);
                ((TextView) view.findViewById(R.id.item_lucky_wheel_description)).setText(MyApplication.f7090a.getApplicationContext().getString(R.string.player_win_item, new Object[]{hVar.getPlayerName(), hVar.getItemName()}));
                ((TextView) view.findViewById(R.id.item_lucky_wheel_time)).setText(c.X(hVar.getUnixTimeInMilli()));
                return view;
        }
    }
}
