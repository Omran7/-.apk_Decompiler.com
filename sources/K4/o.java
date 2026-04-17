package K4;

import A4.h;
import K1.e;
import R2.b;
import W4.g;
import Y4.C;
import Y4.E;
import Y4.x;
import Y4.y;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.fragment.app.C0269a;
import androidx.fragment.app.C0286s;
import com.bumptech.glide.c;
import com.bumptech.glide.j;
import com.bumptech.glide.l;
import com.google.android.gms.internal.measurement.a;
import com.mtma.criminal.city.R;
import com.mtma.criminal.city.app.MyApplication;
import com.mtma.criminal.city.utils.U;
import d5.C0473f;
import d5.C0475h;
import h0.C0552a;
import java.util.ArrayList;
import o3.d;
import t4.C1009a;
import x1.i;

public final class o extends C0286s {
    public static final /* synthetic */ int s0 = 0;

    /* renamed from: d0  reason: collision with root package name */
    public final Context f1583d0;

    /* renamed from: e0  reason: collision with root package name */
    public View f1584e0;

    /* renamed from: f0  reason: collision with root package name */
    public TextView f1585f0;

    /* renamed from: g0  reason: collision with root package name */
    public LinearLayout f1586g0;

    /* renamed from: h0  reason: collision with root package name */
    public RelativeLayout f1587h0;

    /* renamed from: i0  reason: collision with root package name */
    public RelativeLayout f1588i0;

    /* renamed from: j0  reason: collision with root package name */
    public RelativeLayout f1589j0;

    /* renamed from: k0  reason: collision with root package name */
    public RelativeLayout f1590k0;

    /* renamed from: l0  reason: collision with root package name */
    public RelativeLayout f1591l0;

    /* renamed from: m0  reason: collision with root package name */
    public RelativeLayout f1592m0;

    /* renamed from: n0  reason: collision with root package name */
    public ImageView f1593n0;

    /* renamed from: o0  reason: collision with root package name */
    public ImageView f1594o0;

    /* renamed from: p0  reason: collision with root package name */
    public Animation f1595p0;

    /* renamed from: q0  reason: collision with root package name */
    public Animation f1596q0;

    /* renamed from: r0  reason: collision with root package name */
    public boolean f1597r0 = false;

    public o(Context context) {
        this.f1583d0 = context;
    }

    public static void V(o oVar, C0286s sVar) {
        C0269a aVar = new C0269a(oVar.p());
        aVar.f(R.id.activity_main_body_frame_layout, sVar, (String) null, 1);
        aVar.e(false);
        b.N0();
    }

    public final View C(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View inflate = layoutInflater.inflate(R.layout.fragment_profile, viewGroup, false);
        this.f1584e0 = inflate;
        this.f1585f0 = (TextView) inflate.findViewById(R.id.fragment_profile_bio_text_view);
        this.f1586g0 = (LinearLayout) this.f1584e0.findViewById(R.id.fragment_profile_container);
        this.f1587h0 = (RelativeLayout) this.f1584e0.findViewById(R.id.fragment_profile_arming_button);
        this.f1588i0 = (RelativeLayout) this.f1584e0.findViewById(R.id.fragment_profile_skills_button);
        this.f1589j0 = (RelativeLayout) this.f1584e0.findViewById(R.id.fragment_profile_medals_button);
        this.f1590k0 = (RelativeLayout) this.f1584e0.findViewById(R.id.fragment_profile_contacts_button);
        this.f1591l0 = (RelativeLayout) this.f1584e0.findViewById(R.id.fragment_profile_back_button);
        this.f1593n0 = (ImageView) this.f1584e0.findViewById(R.id.fragment_profile_medals_alert);
        this.f1594o0 = (ImageView) this.f1584e0.findViewById(R.id.fragment_profile_contacts_alert);
        this.f1592m0 = (RelativeLayout) this.f1584e0.findViewById(R.id.fragment_profile_eye_button);
        Context context = this.f1583d0;
        this.f1595p0 = AnimationUtils.loadAnimation(context, R.anim.from_start_to_position);
        this.f1596q0 = AnimationUtils.loadAnimation(context, R.anim.from_end_to_position);
        a.c(a.e(true), "players").E(d5.o.getAccountObject().getId()).d(new i((Object) this, 21));
        this.f1585f0.setOnClickListener(new m(this, 0));
        RelativeLayout relativeLayout = this.f1592m0;
        relativeLayout.setOnClickListener(new n(this, relativeLayout, 4));
        RelativeLayout relativeLayout2 = this.f1587h0;
        relativeLayout2.setOnClickListener(new n(this, relativeLayout2, 0));
        RelativeLayout relativeLayout3 = this.f1588i0;
        relativeLayout3.setOnClickListener(new n(this, relativeLayout3, 1));
        RelativeLayout relativeLayout4 = this.f1589j0;
        relativeLayout4.setOnClickListener(new n(this, relativeLayout4, 2));
        RelativeLayout relativeLayout5 = this.f1590k0;
        relativeLayout5.setOnClickListener(new n(this, relativeLayout5, 3));
        RelativeLayout relativeLayout6 = this.f1591l0;
        relativeLayout6.setOnClickListener(new n(this, relativeLayout6, 5));
        return this.f1584e0;
    }

    public final void I() {
        this.f5157L = true;
        if (d5.o.getNotificationObject().isHasUnSeenMedal()) {
            this.f1593n0.setVisibility(0);
        } else {
            this.f1593n0.setVisibility(8);
        }
        if (d5.o.getNotificationObject().isHasUnSeenContactRequest()) {
            this.f1594o0.setVisibility(0);
        } else {
            this.f1594o0.setVisibility(8);
        }
    }

    public final void W(int i2, int i5, ArrayList arrayList, ArrayList arrayList2) {
        Context context = this.f1583d0;
        View inflate = LayoutInflater.from(context).inflate(R.layout.item_profile_main_section, (ViewGroup) null, false);
        LinearLayout linearLayout = (LinearLayout) inflate.findViewById(R.id.item_profile_section_left_list_View);
        LinearLayout linearLayout2 = (LinearLayout) inflate.findViewById(R.id.item_profile_section_right_list_View);
        ((RelativeLayout) inflate.findViewById(R.id.item_profile_section_title_layout)).setAnimation(this.f1595p0);
        ((RelativeLayout) inflate.findViewById(R.id.item_profile_left_layout)).setAnimation(this.f1595p0);
        linearLayout2.setAnimation(this.f1596q0);
        ((TextView) inflate.findViewById(R.id.item_profile_section_title)).setText(i2);
        ((ImageView) inflate.findViewById(R.id.item_profile_section_left_image)).setVisibility(8);
        for (int i6 = 0; i6 < arrayList.size(); i6++) {
            View inflate2 = LayoutInflater.from(context).inflate(R.layout.item_profile_value_info, (ViewGroup) null, false);
            TextView textView = (TextView) inflate2.findViewById(R.id.item_profile_value_info_value);
            ((TextView) inflate2.findViewById(R.id.item_profile_value_info_title)).setText(((x) arrayList.get(i6)).f4446a);
            textView.setText(((x) arrayList.get(i6)).f4447b);
            if (((x) arrayList.get(i6)).f4446a == R.string.account_status) {
                if (((x) arrayList.get(i6)).f4447b.equals(MyApplication.f7090a.getApplicationContext().getString(R.string.account_state_banned)) || ((x) arrayList.get(i6)).f4447b.equals(MyApplication.f7090a.getApplicationContext().getString(R.string.account_state_need_review)) || ((x) arrayList.get(i6)).f4447b.equals(MyApplication.f7090a.getApplicationContext().getString(R.string.account_state_banned_chat))) {
                    a.i(context, MyApplication.f7090a.getApplicationContext().getResources(), R.color.maximum_word_color, textView);
                } else if (((x) arrayList.get(i6)).f4447b.equals(MyApplication.f7090a.getApplicationContext().getString(R.string.account_state_admin)) || ((x) arrayList.get(i6)).f4447b.equals(MyApplication.f7090a.getApplicationContext().getString(R.string.account_state_temporary_admin))) {
                    a.i(context, MyApplication.f7090a.getApplicationContext().getResources(), R.color.admin_test, textView);
                } else {
                    a.i(context, MyApplication.f7090a.getApplicationContext().getResources(), R.color.fight_green_text, textView);
                }
            }
            linearLayout.addView(inflate2);
        }
        for (int i7 = 0; i7 < arrayList2.size(); i7++) {
            View inflate3 = LayoutInflater.from(context).inflate(R.layout.item_profile_value_info, (ViewGroup) null, false);
            ((TextView) inflate3.findViewById(R.id.item_profile_value_info_title)).setText(((x) arrayList2.get(i7)).f4446a);
            ((TextView) inflate3.findViewById(R.id.item_profile_value_info_value)).setText(((x) arrayList2.get(i7)).f4447b);
            linearLayout2.addView(inflate3);
        }
        this.f1586g0.addView(inflate, i5);
    }

    public final void X(int i2, int i5, ArrayList arrayList, C0286s sVar, int i6) {
        int i7 = i5;
        ArrayList arrayList2 = arrayList;
        C0286s sVar2 = sVar;
        Context context = this.f1583d0;
        View inflate = LayoutInflater.from(context).inflate(R.layout.item_profile_main_section, (ViewGroup) null, false);
        LinearLayout linearLayout = (LinearLayout) inflate.findViewById(R.id.item_profile_section_right_list_View);
        ImageView imageView = (ImageView) inflate.findViewById(R.id.item_profile_section_left_image);
        ImageView imageView2 = (ImageView) inflate.findViewById(R.id.item_profile_section_left_image_2);
        ((RelativeLayout) inflate.findViewById(R.id.item_profile_section_title_layout)).setAnimation(this.f1595p0);
        ((RelativeLayout) inflate.findViewById(R.id.item_profile_left_layout)).setAnimation(this.f1595p0);
        linearLayout.setAnimation(this.f1596q0);
        ((TextView) inflate.findViewById(R.id.item_profile_section_title)).setText(i2);
        ((LinearLayout) inflate.findViewById(R.id.item_profile_section_left_list_View)).setVisibility(8);
        if (i7 == R.drawable.gang_profile_pic_default) {
            imageView.setBackgroundResource(R.drawable.gang_profile_pic_frame);
            imageView.setPadding(e.m(3.0d), e.m(3.0d), e.m(3.0d), e.m(3.0d));
            if (((x) arrayList2.get(0)).f4447b.equals(MyApplication.f7090a.getApplicationContext().getString(R.string.not_in_gang))) {
                imageView.setImageResource(i7);
            } else {
                I1.b.u(imageView, d5.o.getGangObject().getId(), (String) null);
            }
        } else {
            imageView.setImageResource(i7);
        }
        if ((sVar2 instanceof C1009a) && d5.o.getEstateObject().getId() == 16) {
            imageView2.setVisibility(0);
            if (d5.o.getEstateObject().getPrivateDomainPicUrl().equals("no_private_domain_image")) {
                imageView2.setImageResource(R.drawable.estate_private_domain_default_image);
            } else {
                l c3 = com.bumptech.glide.b.c(context);
                String privateDomainPicUrl = d5.o.getEstateObject().getPrivateDomainPicUrl();
                c3.getClass();
                new j(c3.f5794a, c3, Drawable.class, c3.f5795b).C(privateDomainPicUrl).A(imageView2);
                I1.b.A0(d5.o.getEstateObject().getEstateOwnerId(), d5.o.getEstateObject().getFirebaseKeyNode(), d5.o.getEstateObject().getPrivateDomainPicUrl());
            }
        }
        for (int i8 = 0; i8 < arrayList.size(); i8++) {
            View inflate2 = LayoutInflater.from(context).inflate(R.layout.item_profile_value_info, (ViewGroup) null, false);
            ((TextView) inflate2.findViewById(R.id.item_profile_value_info_title)).setText(((x) arrayList2.get(i8)).f4446a);
            ((TextView) inflate2.findViewById(R.id.item_profile_value_info_value)).setText(((x) arrayList2.get(i8)).f4447b);
            linearLayout.addView(inflate2);
        }
        imageView.setOnClickListener(new h(this, imageView, sVar2, 1));
        this.f1586g0.addView(inflate, i6);
    }

    public final void Y() {
        View view;
        ArrayList arrayList;
        int i2;
        String str;
        Context context = this.f1583d0;
        int i5 = 0;
        View inflate = LayoutInflater.from(context).inflate(R.layout.item_profile_main_section, (ViewGroup) null, false);
        LinearLayout linearLayout = (LinearLayout) inflate.findViewById(R.id.item_profile_section_right_list_View);
        ((RelativeLayout) inflate.findViewById(R.id.item_profile_section_title_layout)).setAnimation(this.f1595p0);
        linearLayout.setAnimation(this.f1596q0);
        ((TextView) inflate.findViewById(R.id.item_profile_section_title)).setText(R.string.skills_perks);
        ((RelativeLayout) inflate.findViewById(R.id.item_profile_left_layout)).setVisibility(8);
        ArrayList arrayList2 = new ArrayList();
        ArrayList V5 = e.V();
        int i6 = 0;
        int i7 = 0;
        while (i6 < V5.size()) {
            int X3 = e.X(i6);
            if (X3 != 0) {
                String string = MyApplication.f7090a.getApplicationContext().getString(((C) V5.get(i6)).f4286b);
                String string2 = MyApplication.f7090a.getApplicationContext().getString(((Integer) e.H().get(i6)).intValue(), new Object[]{Integer.valueOf(e.U(i6) * X3)});
                if (i6 != 0) {
                    i2 = i5;
                } else {
                    i2 = 5;
                }
                int U5 = e.U(i6) * i2;
                int U6 = e.U(i6) * d5.o.getSkillsObject().getMeritSkillLevel(i6);
                int Q5 = e.Q(i6, d5.o.getArmingObject()) * e.U(i6);
                int O3 = e.O(i6, d5.o.getSkillsObject()) * e.U(i6);
                int U7 = e.U(i6) * e.P(i6, d5.o.getSchoolObject(), d5.o.getArmingObject());
                int N6 = e.N(i6, d5.o.getSkillsObject()) * e.U(i6);
                arrayList = V5;
                view = inflate;
                if (U5 != 0) {
                    str = C0552a.k(U5, "( افتراضي:", "  +  ");
                } else {
                    str = "( ";
                }
                if (U6 != 0) {
                    str = str + "مهارات:" + U6 + "  +  ";
                }
                if (Q5 != 0) {
                    str = str + "معدات خاصة:" + Q5 + "  +  ";
                }
                if (O3 != 0) {
                    str = str + "عصابة:" + O3 + "  +  ";
                }
                if (U7 != 0) {
                    str = str + "مدرسة:" + U7 + "  +  ";
                }
                if (N6 != 0) {
                    str = str + "كروت:" + N6 + "  +  ";
                }
                String f6 = d.f(str.substring(0, str.length() - 5), " )");
                if (i6 == 1 || i6 == 2 || i6 == 3 || i6 == 4) {
                    arrayList2.add(i7, new y(string, string2, f6));
                    i7++;
                } else {
                    arrayList2.add(new y(string, string2, f6));
                }
            } else {
                view = inflate;
                arrayList = V5;
            }
            i6++;
            V5 = arrayList;
            inflate = view;
            i5 = 0;
        }
        View view2 = inflate;
        for (int i8 = 0; i8 < arrayList2.size(); i8++) {
            View inflate2 = LayoutInflater.from(context).inflate(R.layout.item_profile_value_info3, (ViewGroup) null, false);
            ((TextView) inflate2.findViewById(R.id.item_profile_skill_name)).setText(((y) arrayList2.get(i8)).f4448a);
            ((TextView) inflate2.findViewById(R.id.item_profile_skill_description)).setText(((y) arrayList2.get(i8)).f4449b);
            ((TextView) inflate2.findViewById(R.id.item_profile_skill_explanation)).setText(((y) arrayList2.get(i8)).f4450c);
            linearLayout.addView(inflate2);
        }
        this.f1586g0.addView(view2);
    }

    public final void Z() {
        this.f1586g0.removeViewAt(3);
        Y4.h j6 = com.bumptech.glide.d.j(d5.o.getEstateObject());
        ArrayList arrayList = new ArrayList();
        arrayList.add(new x(R.string.estate, MyApplication.f7090a.getApplicationContext().getString(j6.d)));
        arrayList.add(new x(R.string.estate_owner, (String) null));
        int N6 = b.N((C0473f) null);
        if (b.i0(605)) {
            N6 *= 2;
        }
        arrayList.add(new x(R.string.estate_happiness, String.valueOf(N6)));
        ArrayList<Boolean> fixedModificationList = d5.o.getEstateObject().getFixedModificationList();
        int i2 = 0;
        for (int i5 = 0; i5 < fixedModificationList.size(); i5++) {
            if (fixedModificationList.get(i5).booleanValue()) {
                i2++;
            }
        }
        arrayList.add(new x(R.string.estate_modifications, String.valueOf(i2)));
        arrayList.add(new x(R.string.estate_servants, String.valueOf(com.bumptech.glide.d.D0(d5.o.getEstateObject().getServantContractsStartTimeInMilliList()))));
        X(R.string.estate_place, j6.f4358f, arrayList, new C1009a(this.f1583d0), 3);
        this.f1586g0.invalidate();
        this.f1586g0.requestLayout();
    }

    public final void a0() {
        this.f1586g0.removeViewAt(2);
        C0475h L6 = I1.b.L(d5.o.getGymObject(), d5.o.getSkillsObject(), d5.o.getArmingObject(), d5.o.getSchoolObject());
        ArrayList arrayList = new ArrayList();
        arrayList.add(new x(R.string.dexterity, e.p(L6.getDexterity())));
        arrayList.add(new x(R.string.speed, e.p(L6.getSpeed())));
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(new x(R.string.strength, e.p(L6.getStrength())));
        arrayList2.add(new x(R.string.defense, e.p(L6.getDefense())));
        arrayList2.add(new x(R.string.health, U.a(d5.o.getMainStatesObject().getHealthCurrent())));
        W(R.string.gym_statics, 2, arrayList, arrayList2);
        this.f1586g0.invalidate();
        this.f1586g0.requestLayout();
    }

    public final void b0() {
        LinearLayout linearLayout = this.f1586g0;
        linearLayout.removeViewAt(linearLayout.getChildCount() - 1);
        Y();
        this.f1586g0.invalidate();
        this.f1586g0.requestLayout();
    }

    public final void c0() {
        this.f1586g0.removeViewAt(5);
        E R5 = b.R(d5.o.getWorkObject().getWorkType(), d5.o.getWorkObject().getJobType());
        ArrayList arrayList = new ArrayList();
        int workType = d5.o.getWorkObject().getWorkType();
        Context context = this.f1583d0;
        if (workType == -1) {
            arrayList.add(new x(R.string.work_type, MyApplication.f7090a.getApplicationContext().getString(R.string.no_work_yet)));
            arrayList.add(new x(R.string.job, MyApplication.f7090a.getApplicationContext().getString(R.string.none)));
            arrayList.add(new x(R.string.salary, MyApplication.f7090a.getApplicationContext().getString(R.string.none)));
            arrayList.add(new x(R.string.work_days, MyApplication.f7090a.getApplicationContext().getString(R.string.none)));
            X(R.string.current_job, R.drawable.work_no_job, arrayList, new W4.h(context), 5);
        } else {
            arrayList.add(new x(R.string.work_type, MyApplication.f7090a.getApplicationContext().getString(b.f0(d5.o.getWorkObject().getWorkType()))));
            arrayList.add(new x(R.string.job, MyApplication.f7090a.getApplicationContext().getString(R5.f4316a)));
            arrayList.add(new x(R.string.salary, String.valueOf(R5.f4319e)));
            arrayList.add(new x(R.string.work_days, MyApplication.f7090a.getApplicationContext().getString(R.string.number_of_days_with_number, new Object[]{Integer.valueOf(c.A(d5.o.getWorkObject().getJobStartTimeInMilli()))})));
            X(R.string.current_job, R5.f4318c, arrayList, new g(context), 5);
        }
        this.f1586g0.invalidate();
        this.f1586g0.requestLayout();
    }
}
