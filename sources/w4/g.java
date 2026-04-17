package W4;

import A4.h;
import B0.C0004c;
import K1.e;
import K4.j;
import R2.b;
import Y4.D;
import Y4.E;
import android.content.Context;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.C0286s;
import com.bumptech.glide.c;
import com.google.android.gms.internal.measurement.a;
import com.mtma.criminal.city.R;
import com.mtma.criminal.city.utils.U;
import d5.o;
import d5.v;
import e5.C0505b;
import i3.C0592h;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

public final class g extends C0286s {

    /* renamed from: r0  reason: collision with root package name */
    public static Handler f4103r0;

    /* renamed from: d0  reason: collision with root package name */
    public final Context f4104d0;

    /* renamed from: e0  reason: collision with root package name */
    public final int f4105e0;

    /* renamed from: f0  reason: collision with root package name */
    public View f4106f0;

    /* renamed from: g0  reason: collision with root package name */
    public TextView f4107g0;

    /* renamed from: h0  reason: collision with root package name */
    public LinearLayout f4108h0;

    /* renamed from: i0  reason: collision with root package name */
    public RelativeLayout f4109i0;

    /* renamed from: j0  reason: collision with root package name */
    public RelativeLayout f4110j0;

    /* renamed from: k0  reason: collision with root package name */
    public int f4111k0;

    /* renamed from: l0  reason: collision with root package name */
    public boolean f4112l0;

    /* renamed from: m0  reason: collision with root package name */
    public boolean f4113m0;

    /* renamed from: n0  reason: collision with root package name */
    public ArrayList f4114n0;

    /* renamed from: o0  reason: collision with root package name */
    public double f4115o0 = 0.0d;

    /* renamed from: p0  reason: collision with root package name */
    public final boolean f4116p0;

    /* renamed from: q0  reason: collision with root package name */
    public boolean f4117q0 = false;

    public g(Context context) {
        this.f4104d0 = context;
        this.f4105e0 = o.getWorkObject().getWorkType();
        this.f4116p0 = true;
    }

    public static void V(g gVar) {
        gVar.getClass();
        b.w(true);
        v vVar = new v(gVar.f4105e0, 0);
        a.c(C0592h.b().e(), "players").E(o.getAccountObject().getId()).E("workObject").I(vVar).addOnSuccessListener(new e(gVar, vVar, 1));
    }

    public static void Z(TextView textView) {
        Calendar instance = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
        instance.setTimeInMillis(c.f5744o * 1000);
        Calendar instance2 = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
        instance2.set(instance.get(1), instance.get(2), instance.get(5), 0, 0, 0);
        instance2.add(11, 24);
        Date date = new Date(instance2.getTimeInMillis() - instance.getTimeInMillis());
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("HH:mm:ss");
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("GMT"));
        textView.setText(simpleDateFormat.format(date));
        f4103r0.postDelayed(new C0004c((Object) textView, 14), 1000);
    }

    public final View C(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        ArrayList arrayList;
        boolean z3;
        int i2 = 0;
        View inflate = layoutInflater.inflate(R.layout.fragment_work_office_details, viewGroup, false);
        this.f4106f0 = inflate;
        this.f4108h0 = (LinearLayout) inflate.findViewById(R.id.fragment_work_office_details_container_view);
        this.f4109i0 = (RelativeLayout) this.f4106f0.findViewById(R.id.fragment_work_office_details_back_button);
        this.f4110j0 = (RelativeLayout) this.f4106f0.findViewById(R.id.fragment_work_office_details_office_button);
        this.f4107g0 = (TextView) this.f4106f0.findViewById(R.id.fragment_work_office_details_title);
        if (this.f4116p0) {
            this.f4110j0.setVisibility(0);
        }
        boolean z4 = true;
        int i5 = this.f4105e0;
        if (i5 == 0) {
            arrayList = b.W();
        } else if (i5 == 1) {
            arrayList = b.E();
        } else if (i5 == 2) {
            arrayList = b.G();
        } else if (i5 == 3) {
            arrayList = b.Y();
        } else if (i5 == 4) {
            arrayList = b.D();
        } else if (i5 == 5) {
            arrayList = b.Q();
        } else if (i5 == 6) {
            arrayList = b.H();
        } else if (i5 == 7) {
            arrayList = b.L();
        } else if (i5 == 8) {
            arrayList = b.X();
        } else {
            arrayList = null;
        }
        this.f4114n0 = arrayList;
        if (i5 == o.getWorkObject().getWorkType()) {
            z3 = true;
        } else {
            z3 = false;
        }
        this.f4112l0 = z3;
        this.f4111k0 = o.getWorkObject().getJobType();
        this.f4115o0 = ((double) (c.f5744o - c.W(o.getWorkObject().getJobStartTimeInMilli()))) / 86400.0d;
        if (c.Y(c.f5744o) <= c.W(o.getWorkObject().getJobGotSalaryTimeInMilli())) {
            z4 = false;
        }
        this.f4113m0 = z4;
        f4103r0 = new Handler();
        this.f4107g0.setText(b.f0(i5));
        if (this.f4112l0) {
            while (true) {
                if (i2 >= this.f4114n0.size()) {
                    break;
                }
                int i6 = this.f4111k0;
                if (i2 >= i6) {
                    if (i2 != i6) {
                        X(i2);
                        break;
                    }
                    W((E) this.f4114n0.get(i2));
                } else {
                    Y(i2);
                }
                i2++;
            }
        } else {
            View inflate2 = LayoutInflater.from(this.f4104d0).inflate(R.layout.item_work_office_details, (ViewGroup) null);
            RelativeLayout relativeLayout = (RelativeLayout) inflate2.findViewById(R.id.item_work_office_details_button_layout);
            LinearLayout linearLayout = (LinearLayout) inflate2.findViewById(R.id.item_work_office_details_gym_layout);
            E e6 = (E) this.f4114n0.get(0);
            ((ImageView) inflate2.findViewById(R.id.item_work_office_details_image_view)).setImageResource(e6.f4318c);
            ((ImageView) inflate2.findViewById(R.id.item_work_office_details_button_image)).setImageResource(R.drawable.button_blue);
            ((TextView) inflate2.findViewById(R.id.item_work_office_details_button_text)).setText(R.string.start_work);
            ((TextView) inflate2.findViewById(R.id.item_work_office_details_job_name)).setText(e6.f4316a);
            ((TextView) inflate2.findViewById(R.id.item_work_office_details_salary)).setText(U.a((long) ((e.S(20) + 1.0d) * ((double) e6.f4319e))));
            ((TextView) inflate2.findViewById(R.id.item_work_office_details_description)).setText(e6.f4317b);
            ((TextView) inflate2.findViewById(R.id.item_work_office_details_strength)).setText(String.valueOf(e6.g));
            ((TextView) inflate2.findViewById(R.id.item_work_office_details_defense)).setText(String.valueOf(e6.f4320f));
            ((TextView) inflate2.findViewById(R.id.item_work_office_details_speed)).setText(String.valueOf(e6.h));
            ((TextView) inflate2.findViewById(R.id.item_work_office_details_dexterity)).setText(String.valueOf(e6.f4321i));
            ArrayList arrayList2 = new ArrayList(Arrays.asList(new Integer[]{Integer.valueOf(R.string.dexterity), Integer.valueOf(R.string.speed), Integer.valueOf(R.string.defense), Integer.valueOf(R.string.strength)}));
            for (int i7 = 0; i7 < linearLayout.getChildCount(); i7++) {
                ((ImageView) ((LinearLayout) linearLayout.getChildAt(i7)).getChildAt(0)).setOnClickListener(new a(this, arrayList2, i7, 2));
            }
            relativeLayout.setOnClickListener(new b(this, relativeLayout, 3));
            this.f4108h0.addView(inflate2);
        }
        RelativeLayout relativeLayout2 = this.f4109i0;
        relativeLayout2.setOnClickListener(new b(this, relativeLayout2, 1));
        RelativeLayout relativeLayout3 = this.f4110j0;
        relativeLayout3.setOnClickListener(new b(this, relativeLayout3, 2));
        return this.f4106f0;
    }

    public final void W(E e6) {
        E e7 = e6;
        View inflate = LayoutInflater.from(this.f4104d0).inflate(R.layout.item_work_office_details, (ViewGroup) null);
        ImageView imageView = (ImageView) inflate.findViewById(R.id.item_work_office_details_button_image);
        TextView textView = (TextView) inflate.findViewById(R.id.item_work_office_details_description);
        TextView textView2 = (TextView) inflate.findViewById(R.id.item_work_office_details_timer);
        RelativeLayout relativeLayout = (RelativeLayout) inflate.findViewById(R.id.item_work_office_details_button_layout);
        ((ImageView) inflate.findViewById(R.id.item_work_office_details_image_view)).setImageResource(e7.f4318c);
        ((TextView) inflate.findViewById(R.id.item_work_office_details_button_text)).setText(R.string.get_salary);
        ((TextView) inflate.findViewById(R.id.item_work_office_details_job_name)).setText(e7.f4316a);
        ((TextView) inflate.findViewById(R.id.item_work_office_details_salary)).setText(U.a((long) (((double) e7.f4319e) * (e.S(20) + 1.0d))));
        textView.setText(e7.f4317b);
        ((TextView) inflate.findViewById(R.id.item_work_office_details_days)).setText(s(R.string.number_of_days_with_text, e.p(this.f4115o0)));
        Z(textView2);
        ((TextView) inflate.findViewById(R.id.item_work_office_details_require_statement)).setVisibility(8);
        ((LinearLayout) inflate.findViewById(R.id.item_work_office_details_gym_layout)).setVisibility(8);
        textView2.setVisibility(0);
        textView.setVisibility(0);
        ((LinearLayout) inflate.findViewById(R.id.item_work_office_details_days_layout)).setVisibility(0);
        if (this.f4113m0) {
            imageView.setImageResource(R.drawable.button_blue);
        } else {
            imageView.setImageResource(R.drawable.button_gray);
        }
        relativeLayout.setOnClickListener(new h(this, relativeLayout, inflate, 5));
        this.f4108h0.addView(inflate);
    }

    public final void X(int i2) {
        boolean z3;
        Context context = this.f4104d0;
        View inflate = LayoutInflater.from(context).inflate(R.layout.item_work_office_details, (ViewGroup) null);
        ImageView imageView = (ImageView) inflate.findViewById(R.id.item_work_office_details_button_image);
        TextView textView = (TextView) inflate.findViewById(R.id.item_work_office_details_certificate_name);
        TextView textView2 = (TextView) inflate.findViewById(R.id.item_work_office_details_strength);
        TextView textView3 = (TextView) inflate.findViewById(R.id.item_work_office_details_defense);
        TextView textView4 = (TextView) inflate.findViewById(R.id.item_work_office_details_speed);
        TextView textView5 = (TextView) inflate.findViewById(R.id.item_work_office_details_dexterity);
        TextView textView6 = (TextView) inflate.findViewById(R.id.item_work_office_details_days_number);
        RelativeLayout relativeLayout = (RelativeLayout) inflate.findViewById(R.id.item_work_office_details_button_layout);
        ImageView imageView2 = (ImageView) inflate.findViewById(R.id.item_work_office_details_certificate_image);
        ConstraintLayout constraintLayout = (ConstraintLayout) inflate.findViewById(R.id.item_work_office_details_certificate_layout);
        View view = inflate;
        LinearLayout linearLayout = (LinearLayout) inflate.findViewById(R.id.item_work_office_details_gym_layout);
        E e6 = (E) this.f4114n0.get(i2);
        ((ImageView) inflate.findViewById(R.id.item_work_office_details_image_view)).setImageResource(e6.f4318c);
        ((TextView) inflate.findViewById(R.id.item_work_office_details_button_text)).setText(R.string.promotion);
        ((TextView) inflate.findViewById(R.id.item_work_office_details_job_name)).setText(e6.f4316a);
        ((TextView) inflate.findViewById(R.id.item_work_office_details_salary)).setText(U.a((long) (((double) e6.f4319e) * (e.S(20) + 1.0d))));
        double S5 = (1.0d - e.S(20)) * ((double) e6.g);
        textView2.setText(e.p(S5));
        double S6 = (1.0d - e.S(20)) * ((double) e6.f4320f);
        textView3.setText(e.p(S6));
        double S7 = (1.0d - e.S(20)) * ((double) e6.h);
        textView4.setText(e.p(S7));
        double S8 = (1.0d - e.S(20)) * ((double) e6.f4321i);
        textView5.setText(e.p(S8));
        double S9 = (1.0d - e.S(20)) * ((double) e6.f4322j);
        textView6.setText(s(R.string.number_of_days_with_text, e.p(S9)));
        ((LinearLayout) inflate.findViewById(R.id.item_work_office_details_require_days_layout)).setVisibility(0);
        if (this.f4115o0 < S9) {
            a.i(context, q(), R.color.work_red_text, textView6);
            z3 = false;
        } else {
            z3 = true;
        }
        if (o.getGymObject().getStrength() < S5) {
            a.i(context, q(), R.color.work_red_text, textView2);
            z3 = false;
        }
        if (o.getGymObject().getDefense() < S6) {
            a.i(context, q(), R.color.work_red_text, textView3);
            z3 = false;
        }
        if (o.getGymObject().getSpeed() < S7) {
            a.i(context, q(), R.color.work_red_text, textView4);
            z3 = false;
        }
        if (o.getGymObject().getDexterity() < S8) {
            a.i(context, q(), R.color.work_red_text, textView5);
            z3 = false;
        }
        if (z3) {
            imageView.setImageResource(R.drawable.button_blue);
        } else {
            imageView.setImageResource(R.drawable.button_gray);
        }
        int i5 = e6.d;
        if (i5 != -1) {
            D s6 = D.s(i5, 0, 1);
            textView.setText(s6.f4295c);
            imageView2.setImageResource(s6.d);
            ConstraintLayout constraintLayout2 = constraintLayout;
            constraintLayout2.setOnClickListener(new c(this, constraintLayout2, e6, 0));
        }
        ArrayList arrayList = new ArrayList(Arrays.asList(new Integer[]{Integer.valueOf(R.string.dexterity), Integer.valueOf(R.string.speed), Integer.valueOf(R.string.defense), Integer.valueOf(R.string.strength)}));
        for (int i6 = 0; i6 < linearLayout.getChildCount(); i6++) {
            ((ImageView) ((LinearLayout) linearLayout.getChildAt(i6)).getChildAt(0)).setOnClickListener(new a(this, arrayList, i6, 1));
        }
        RelativeLayout relativeLayout2 = relativeLayout;
        relativeLayout2.setOnClickListener(new d(this, relativeLayout2, z3));
        this.f4108h0.addView(view);
    }

    public final void Y(int i2) {
        View inflate = LayoutInflater.from(this.f4104d0).inflate(R.layout.item_work_office_details, (ViewGroup) null);
        ImageView imageView = (ImageView) inflate.findViewById(R.id.item_work_office_details_certificate_image);
        TextView textView = (TextView) inflate.findViewById(R.id.item_work_office_details_certificate_name);
        ConstraintLayout constraintLayout = (ConstraintLayout) inflate.findViewById(R.id.item_work_office_details_certificate_layout);
        LinearLayout linearLayout = (LinearLayout) inflate.findViewById(R.id.item_work_office_details_gym_layout);
        View view = inflate;
        RelativeLayout relativeLayout = (RelativeLayout) inflate.findViewById(R.id.item_work_office_details_button_layout);
        E e6 = (E) this.f4114n0.get(i2);
        ((ImageView) inflate.findViewById(R.id.item_work_office_details_image_view)).setImageResource(e6.f4318c);
        ((ImageView) inflate.findViewById(R.id.item_work_office_details_button_image)).setImageResource(R.drawable.button_gray);
        ((TextView) inflate.findViewById(R.id.item_work_office_details_button_text)).setText(R.string.start_work);
        ((TextView) inflate.findViewById(R.id.item_work_office_details_job_name)).setText(e6.f4316a);
        ((TextView) inflate.findViewById(R.id.item_work_office_details_salary)).setText(U.a((long) ((e.S(20) + 1.0d) * ((double) e6.f4319e))));
        ((TextView) inflate.findViewById(R.id.item_work_office_details_strength)).setText(String.valueOf(e6.g));
        ((TextView) inflate.findViewById(R.id.item_work_office_details_defense)).setText(String.valueOf(e6.f4320f));
        ((TextView) inflate.findViewById(R.id.item_work_office_details_speed)).setText(String.valueOf(e6.h));
        ((TextView) inflate.findViewById(R.id.item_work_office_details_dexterity)).setText(String.valueOf(e6.f4321i));
        int i5 = e6.d;
        if (i5 != -1) {
            D s6 = D.s(i5, 0, 1);
            textView.setText(s6.f4295c);
            imageView.setImageResource(s6.d);
            constraintLayout.setOnClickListener(new c(this, constraintLayout, e6, 1));
        }
        ArrayList arrayList = new ArrayList(Arrays.asList(new Integer[]{Integer.valueOf(R.string.dexterity), Integer.valueOf(R.string.speed), Integer.valueOf(R.string.defense), Integer.valueOf(R.string.strength)}));
        for (int i6 = 0; i6 < linearLayout.getChildCount(); i6++) {
            ((ImageView) ((LinearLayout) linearLayout.getChildAt(i6)).getChildAt(0)).setOnClickListener(new a(this, arrayList, i6, 0));
        }
        RelativeLayout relativeLayout2 = relativeLayout;
        relativeLayout2.setOnClickListener(new b(this, relativeLayout2, 0));
        this.f4108h0.addView(view);
    }

    public final void a0(String str, int i2, boolean z3) {
        if (!this.f4117q0) {
            this.f4117q0 = true;
            C0505b bVar = new C0505b(this.f4104d0, R.layout.dialog_ok_cancle);
            RelativeLayout relativeLayout = (RelativeLayout) bVar.findViewById(R.id.dialog_ok_cancel_ok_button);
            LinearLayout linearLayout = (LinearLayout) bVar.findViewById(R.id.dialog_ok_cancel_buttons_confirm_cancel_layout);
            RelativeLayout relativeLayout2 = (RelativeLayout) bVar.findViewById(R.id.dialog_ok_cancel_confirm_button);
            RelativeLayout relativeLayout3 = (RelativeLayout) bVar.findViewById(R.id.dialog_ok_cancel_cancel_button);
            TextView textView = (TextView) bVar.findViewById(R.id.dialog_ok_cancel_confirm_button_text);
            ((TextView) bVar.findViewById(R.id.dialog_ok_cancel_text)).setText(str);
            if (z3) {
                linearLayout.setVisibility(0);
                textView.setText(R.string.start_work);
                relativeLayout3.setOnClickListener(new f(this, relativeLayout3, bVar, 0));
                relativeLayout2.setOnClickListener(new j((Object) this, relativeLayout2, i2, (Object) bVar, 1));
            } else {
                relativeLayout.setVisibility(0);
                relativeLayout.setOnClickListener(new f(this, relativeLayout, bVar, 1));
            }
            bVar.show();
        }
    }

    public final void b0() {
        v vVar = new v(this.f4105e0, this.f4111k0 + 1);
        a.c(C0592h.b().e(), "players").E(o.getAccountObject().getId()).E("workObject").I(vVar).addOnSuccessListener(new e(this, vVar, 0));
    }

    public g(Context context, int i2) {
        this.f4104d0 = context;
        this.f4105e0 = i2;
        this.f4116p0 = false;
    }
}
