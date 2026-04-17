package V4;

import K1.e;
import R2.b;
import Y4.D;
import android.content.Context;
import android.content.res.Resources;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.C0269a;
import androidx.fragment.app.C0286s;
import com.google.android.gms.internal.measurement.a;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.mtma.criminal.city.R;
import com.mtma.criminal.city.activities.MainActivity;
import com.mtma.criminal.city.utils.U;
import d5.o;
import i3.C0592h;
import java.util.ArrayList;
import java.util.Collection;

public final class h extends C0286s {

    /* renamed from: d1  reason: collision with root package name */
    public static final /* synthetic */ int f3804d1 = 0;

    /* renamed from: A0  reason: collision with root package name */
    public TextView f3805A0;

    /* renamed from: B0  reason: collision with root package name */
    public ConstraintLayout f3806B0;

    /* renamed from: C0  reason: collision with root package name */
    public ConstraintLayout f3807C0;

    /* renamed from: D0  reason: collision with root package name */
    public ImageView f3808D0;

    /* renamed from: E0  reason: collision with root package name */
    public ImageView f3809E0;

    /* renamed from: F0  reason: collision with root package name */
    public RelativeLayout f3810F0;

    /* renamed from: G0  reason: collision with root package name */
    public ImageView f3811G0;

    /* renamed from: H0  reason: collision with root package name */
    public RelativeLayout f3812H0;

    /* renamed from: I0  reason: collision with root package name */
    public RelativeLayout f3813I0;

    /* renamed from: J0  reason: collision with root package name */
    public ConstraintLayout f3814J0;

    /* renamed from: K0  reason: collision with root package name */
    public ConstraintLayout f3815K0;
    public ConstraintLayout L0;

    /* renamed from: M0  reason: collision with root package name */
    public ConstraintLayout f3816M0;

    /* renamed from: N0  reason: collision with root package name */
    public ConstraintLayout f3817N0;
    public ImageView O0;

    /* renamed from: P0  reason: collision with root package name */
    public ImageView f3818P0;

    /* renamed from: Q0  reason: collision with root package name */
    public ImageView f3819Q0;

    /* renamed from: R0  reason: collision with root package name */
    public D f3820R0;

    /* renamed from: S0  reason: collision with root package name */
    public final int f3821S0 = -1;

    /* renamed from: T0  reason: collision with root package name */
    public int f3822T0 = -1;

    /* renamed from: U0  reason: collision with root package name */
    public int f3823U0;

    /* renamed from: V0  reason: collision with root package name */
    public int f3824V0 = 0;

    /* renamed from: W0  reason: collision with root package name */
    public int f3825W0 = 0;
    public int X0;

    /* renamed from: Y0  reason: collision with root package name */
    public int f3826Y0;

    /* renamed from: Z0  reason: collision with root package name */
    public long f3827Z0;

    /* renamed from: a1  reason: collision with root package name */
    public int f3828a1;

    /* renamed from: b1  reason: collision with root package name */
    public boolean f3829b1 = false;

    /* renamed from: c1  reason: collision with root package name */
    public final ArrayList f3830c1 = new ArrayList();

    /* renamed from: d0  reason: collision with root package name */
    public final Context f3831d0;

    /* renamed from: e0  reason: collision with root package name */
    public View f3832e0;

    /* renamed from: f0  reason: collision with root package name */
    public TextView f3833f0;

    /* renamed from: g0  reason: collision with root package name */
    public TextView f3834g0;

    /* renamed from: h0  reason: collision with root package name */
    public TextView f3835h0;

    /* renamed from: i0  reason: collision with root package name */
    public TextView f3836i0;

    /* renamed from: j0  reason: collision with root package name */
    public TextView f3837j0;

    /* renamed from: k0  reason: collision with root package name */
    public TextView f3838k0;

    /* renamed from: l0  reason: collision with root package name */
    public TextView f3839l0;

    /* renamed from: m0  reason: collision with root package name */
    public TextView f3840m0;

    /* renamed from: n0  reason: collision with root package name */
    public TextView f3841n0;

    /* renamed from: o0  reason: collision with root package name */
    public TextView f3842o0;

    /* renamed from: p0  reason: collision with root package name */
    public TextView f3843p0;

    /* renamed from: q0  reason: collision with root package name */
    public TextView f3844q0;

    /* renamed from: r0  reason: collision with root package name */
    public TextView f3845r0;
    public TextView s0;

    /* renamed from: t0  reason: collision with root package name */
    public CheckBox f3846t0;

    /* renamed from: u0  reason: collision with root package name */
    public TextView f3847u0;

    /* renamed from: v0  reason: collision with root package name */
    public TextView f3848v0;

    /* renamed from: w0  reason: collision with root package name */
    public ImageView f3849w0;

    /* renamed from: x0  reason: collision with root package name */
    public ImageView f3850x0;

    /* renamed from: y0  reason: collision with root package name */
    public ImageView f3851y0;

    /* renamed from: z0  reason: collision with root package name */
    public TextView f3852z0;

    public h(MainActivity mainActivity) {
        this.f3831d0 = mainActivity;
    }

    public static void V(h hVar) {
        int i2 = hVar.f3828a1;
        int luckyLine = i2 - ((o.getUpgradeObject().getLuckyLine() * i2) / 50);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.setMargins(0, 0, luckyLine, 0);
        layoutParams.addRule(15, -1);
        layoutParams.addRule(20, -1);
        if (hVar.f3819Q0.getVisibility() == 0) {
            hVar.f3819Q0.setLayoutParams(layoutParams);
            hVar.f3819Q0.setPaddingRelative(e.m(1.0d), 2, -luckyLine, e.m(1.0d));
            hVar.f3819Q0.startAnimation(AnimationUtils.loadAnimation(hVar.f3831d0, R.anim.progressbar_flash));
            new Handler().postDelayed(new g(hVar, layoutParams, luckyLine, 0), 1500);
            return;
        }
        hVar.f3808D0.setLayoutParams(layoutParams);
        hVar.f3808D0.setPaddingRelative(e.m(1.0d), 2, -luckyLine, e.m(1.0d));
    }

    public static void W(h hVar) {
        hVar.O0.clearAnimation();
        hVar.f3818P0.clearAnimation();
        hVar.O0.setVisibility(8);
        hVar.f3818P0.setVisibility(8);
    }

    public static void X(h hVar) {
        hVar.getClass();
        a aVar = new a(hVar.f3831d0);
        C0269a aVar2 = new C0269a(hVar.p());
        aVar2.f(R.id.activity_main_body_frame_layout, aVar, (String) null, 1);
        aVar2.c();
        aVar2.e(false);
        b.N0();
    }

    public static void Y(h hVar) {
        String str;
        hVar.f3849w0.setVisibility(4);
        hVar.f3846t0.setVisibility(0);
        hVar.f3814J0.setVisibility(0);
        int i2 = hVar.f3822T0 + 1;
        hVar.f3833f0.setText(hVar.r(hVar.f3820R0.f4295c));
        if (hVar.f3822T0 == 0) {
            hVar.f3806B0.setVisibility(4);
            hVar.f3852z0.setVisibility(4);
        } else {
            hVar.f3806B0.setVisibility(0);
            hVar.f3852z0.setVisibility(0);
            hVar.f3852z0.setText(String.valueOf(hVar.f3822T0));
        }
        hVar.f3850x0.setImageResource(hVar.f3820R0.d);
        hVar.f3851y0.setImageResource(hVar.f3820R0.d);
        hVar.f3805A0.setText(String.valueOf(i2));
        hVar.f3834g0.setText(String.valueOf(hVar.f3822T0));
        hVar.f3835h0.setText(String.valueOf(i2));
        if (hVar.f3820R0.f4307r) {
            hVar.f3836i0.setText(hVar.r(R.string.damage));
            hVar.f3837j0.setText(String.valueOf(I1.b.j0(hVar.f3820R0.f4309t, hVar.f3822T0)));
            hVar.f3838k0.setText(String.valueOf(I1.b.j0(hVar.f3820R0.f4309t, i2)));
            hVar.f3839l0.setText(R.string.accuracy);
            hVar.f3840m0.setText(String.valueOf(I1.b.j0(hVar.f3820R0.f4310u, hVar.f3822T0)));
            hVar.f3841n0.setText(String.valueOf(I1.b.j0(hVar.f3820R0.f4310u, i2)));
        } else {
            hVar.f3836i0.setText(hVar.r(R.string.defence));
            hVar.f3837j0.setText(String.valueOf(I1.b.j0(hVar.f3820R0.f4311v, hVar.f3822T0)));
            hVar.f3838k0.setText(String.valueOf(I1.b.j0(hVar.f3820R0.f4311v, i2)));
            hVar.f3839l0.setText(R.string.evasion);
            hVar.f3840m0.setText(String.valueOf(I1.b.j0(hVar.f3820R0.f4312w, hVar.f3822T0)));
            hVar.f3841n0.setText(String.valueOf(I1.b.j0(hVar.f3820R0.f4312w, i2)));
        }
        hVar.f3842o0.setText(String.valueOf(hVar.X0));
        hVar.f3843p0.setText(String.valueOf(hVar.f3824V0));
        hVar.f3844q0.setText(String.valueOf(hVar.f3826Y0));
        hVar.f3845r0.setText(String.valueOf(o.getUpgradeObject().getEmblem()));
        TextView textView = hVar.f3847u0;
        double g02 = (double) I1.b.g0(hVar.f3822T0);
        if (g02 < 0.0d) {
            str = "0%";
        } else {
            str = g02 + "%";
        }
        textView.setText(str);
        hVar.f3848v0.setText(U.a(hVar.f3827Z0));
        hVar.f3811G0.setImageResource(R.drawable.button_blue_large);
        hVar.f3846t0.setChecked(false);
        int i5 = hVar.f3825W0;
        if (i5 < 1) {
            hVar.s0.setText(R.string.not_have);
            hVar.f3846t0.setOnCheckedChangeListener(new f(hVar, 0));
        } else {
            hVar.s0.setText(String.valueOf(i5));
            hVar.f3846t0.setOnCheckedChangeListener(new f(hVar, 1));
        }
        int i6 = hVar.f3824V0;
        int i7 = hVar.X0;
        Context context = hVar.f3831d0;
        if (i6 < i7) {
            a.i(context, hVar.q(), R.color.upgrade_not_enough_requirement, hVar.f3843p0);
        } else {
            a.i(context, hVar.q(), R.color.white, hVar.f3843p0);
        }
        if (o.getUpgradeObject().getEmblem() < hVar.f3826Y0) {
            a.i(context, hVar.q(), R.color.upgrade_not_enough_requirement, hVar.f3845r0);
        } else {
            a.i(context, hVar.q(), R.color.white, hVar.f3845r0);
        }
        if (o.getMoneyObject().getCash() < hVar.f3827Z0) {
            a.i(context, hVar.q(), R.color.upgrade_not_enough_requirement, hVar.f3848v0);
            return;
        }
        a.i(context, hVar.q(), R.color.white, hVar.f3848v0);
    }

    public final View C(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View inflate = layoutInflater.inflate(R.layout.fragment_upgrade_lab, viewGroup, false);
        this.f3832e0 = inflate;
        this.f3833f0 = (TextView) inflate.findViewById(R.id.fragment_upgrade_lab_name);
        this.f3809E0 = (ImageView) this.f3832e0.findViewById(R.id.fragment_upgrade_lab_instruction_button);
        this.f3849w0 = (ImageView) this.f3832e0.findViewById(R.id.fragment_upgrade_lab_empty_box);
        this.f3850x0 = (ImageView) this.f3832e0.findViewById(R.id.fragment_upgrade_lab_original_image);
        this.f3851y0 = (ImageView) this.f3832e0.findViewById(R.id.fragment_upgrade_lab_upgraded_image);
        this.f3852z0 = (TextView) this.f3832e0.findViewById(R.id.fragment_upgrade_lab_original_image_level_number);
        this.f3805A0 = (TextView) this.f3832e0.findViewById(R.id.fragment_upgrade_lab_upgraded_image_level_number);
        this.f3806B0 = (ConstraintLayout) this.f3832e0.findViewById(R.id.fragment_upgrade_lab_original_image_level_number_layout);
        this.f3807C0 = (ConstraintLayout) this.f3832e0.findViewById(R.id.fragment_upgrade_lab_upgraded_image_level_number_layout);
        this.f3834g0 = (TextView) this.f3832e0.findViewById(R.id.fragment_upgrade_lab_level_original);
        this.f3835h0 = (TextView) this.f3832e0.findViewById(R.id.fragment_upgrade_lab_level_upgraded);
        this.f3836i0 = (TextView) this.f3832e0.findViewById(R.id.fragment_upgrade_lab_damage_name);
        this.f3837j0 = (TextView) this.f3832e0.findViewById(R.id.fragment_upgrade_lab_damage_original);
        this.f3838k0 = (TextView) this.f3832e0.findViewById(R.id.fragment_upgrade_lab_damage_upgraded);
        this.f3839l0 = (TextView) this.f3832e0.findViewById(R.id.fragment_upgrade_lab_accuracy_name);
        this.f3840m0 = (TextView) this.f3832e0.findViewById(R.id.fragment_upgrade_lab_accuracy_original);
        this.f3841n0 = (TextView) this.f3832e0.findViewById(R.id.fragment_upgrade_lab_accuracy_upgraded);
        this.f3842o0 = (TextView) this.f3832e0.findViewById(R.id.fragment_upgrade_lab_palladium_needed);
        this.f3843p0 = (TextView) this.f3832e0.findViewById(R.id.fragment_upgrade_lab_palladium_player_have);
        this.f3844q0 = (TextView) this.f3832e0.findViewById(R.id.fragment_upgrade_lab_emblem_needed);
        this.f3845r0 = (TextView) this.f3832e0.findViewById(R.id.fragment_upgrade_lab_emblem_player_have);
        this.s0 = (TextView) this.f3832e0.findViewById(R.id.fragment_upgrade_lab_president_stone_used);
        this.f3846t0 = (CheckBox) this.f3832e0.findViewById(R.id.fragment_upgrade_lab_president_stone_check_box);
        this.f3847u0 = (TextView) this.f3832e0.findViewById(R.id.fragment_upgrade_lab_success_percent);
        this.f3848v0 = (TextView) this.f3832e0.findViewById(R.id.fragment_upgrade_lab_cash_needed);
        this.f3810F0 = (RelativeLayout) this.f3832e0.findViewById(R.id.fragment_upgrade_lab_upgrade_button);
        this.f3811G0 = (ImageView) this.f3832e0.findViewById(R.id.fragment_upgrade_lab_upgrade_button_image_view);
        this.f3812H0 = (RelativeLayout) this.f3832e0.findViewById(R.id.fragment_upgrade_lab_stock_button);
        this.f3813I0 = (RelativeLayout) this.f3832e0.findViewById(R.id.fragment_upgrade_lab_back_button);
        this.f3814J0 = (ConstraintLayout) this.f3832e0.findViewById(R.id.fragment_upgrade_lab_upgrade_image_layout);
        this.f3808D0 = (ImageView) this.f3832e0.findViewById(R.id.fragment_upgrade_lab_full_progress_bar);
        this.f3815K0 = (ConstraintLayout) this.f3832e0.findViewById(R.id.fragment_upgrade_lab_instruction_1);
        this.L0 = (ConstraintLayout) this.f3832e0.findViewById(R.id.fragment_upgrade_lab_instruction_2);
        this.f3816M0 = (ConstraintLayout) this.f3832e0.findViewById(R.id.fragment_upgrade_lab_instruction_3);
        this.f3817N0 = (ConstraintLayout) this.f3832e0.findViewById(R.id.fragment_upgrade_lab_instruction_4);
        this.O0 = (ImageView) this.f3832e0.findViewById(R.id.fragment_upgrade_lab_upgraded_image_left_white_frame);
        this.f3818P0 = (ImageView) this.f3832e0.findViewById(R.id.fragment_upgrade_lab_upgraded_image_right_white_frame);
        this.f3819Q0 = (ImageView) this.f3832e0.findViewById(R.id.fragment_upgrade_lab_full_progress_bar_white);
        int i2 = this.f3822T0;
        int i5 = this.f3821S0;
        this.f3820R0 = D.s(i5, i2, 1);
        int i6 = (this.f3822T0 * 4) + D.s(i5, 0, 1).f4292D;
        this.X0 = i6;
        this.f3826Y0 = i6 * 5;
        this.f3827Z0 = ((long) i6) * 50000;
        if (i5 == -1) {
            this.f3850x0.setVisibility(4);
            this.f3851y0.setVisibility(4);
            this.f3807C0.setVisibility(4);
            this.f3806B0.setVisibility(4);
            this.f3846t0.setVisibility(4);
            this.f3814J0.setVisibility(4);
            this.f3833f0.setText(R.string.upgrade_weapon_hint);
            this.f3834g0.setText(R.string.unknown);
            this.f3835h0.setText(R.string.unknown);
            this.f3836i0.setText(R.string.unknown);
            this.f3837j0.setText(R.string.unknown);
            this.f3838k0.setText(R.string.unknown);
            this.f3839l0.setText(R.string.unknown);
            this.f3840m0.setText(R.string.unknown);
            this.f3841n0.setText(R.string.unknown);
            this.f3842o0.setText(R.string.unknown);
            this.f3843p0.setText(R.string.unknown);
            this.f3844q0.setText(R.string.unknown);
            this.f3845r0.setText(R.string.unknown);
            this.s0.setText(R.string.unknown);
            this.f3847u0.setText(R.string.unknown);
            this.f3848v0.setText(R.string.unknown);
            this.f3811G0.setImageResource(R.drawable.button_gray_large);
        } else if (this.f3822T0 == 12) {
            Z();
        } else {
            b.w(true);
            ArrayList arrayList = new ArrayList();
            TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
            a.d(a.c(C0592h.b().e(), "players"), "stockObject", "itemsInStock").E(e.y(13)).d(new c(this, taskCompletionSource, 2));
            TaskCompletionSource taskCompletionSource2 = new TaskCompletionSource();
            a.v(a.c(C0592h.b().e(), "players"), "upgradeObject").d(new E4.a(taskCompletionSource2, 4));
            arrayList.add(taskCompletionSource.getTask());
            arrayList.add(taskCompletionSource2.getTask());
            Tasks.whenAllComplete((Collection<? extends Task<?>>) arrayList).addOnCompleteListener(new e(this, 0));
        }
        this.f3808D0.getViewTreeObserver().addOnGlobalLayoutListener(new K4.e(this, 2));
        ImageView imageView = this.f3809E0;
        imageView.setOnClickListener(new d(this, imageView, 0));
        ImageView imageView2 = this.f3849w0;
        imageView2.setOnClickListener(new d(this, imageView2, 1));
        RelativeLayout relativeLayout = this.f3810F0;
        relativeLayout.setOnClickListener(new d(this, relativeLayout, 2));
        RelativeLayout relativeLayout2 = this.f3812H0;
        relativeLayout2.setOnClickListener(new d(this, relativeLayout2, 3));
        RelativeLayout relativeLayout3 = this.f3813I0;
        relativeLayout3.setOnClickListener(new d(this, relativeLayout3, 4));
        return this.f3832e0;
    }

    public final void Z() {
        this.f3849w0.setVisibility(4);
        this.f3846t0.setVisibility(4);
        this.f3814J0.setVisibility(0);
        this.f3833f0.setText(this.f3820R0.f4295c);
        this.f3850x0.setImageResource(this.f3820R0.d);
        this.f3851y0.setImageResource(this.f3820R0.d);
        this.f3852z0.setText(String.valueOf(this.f3822T0));
        this.f3805A0.setText(String.valueOf(this.f3822T0));
        this.f3834g0.setText(String.valueOf(this.f3820R0.f4298i));
        this.f3835h0.setText(R.string.reached_to_maximum_level);
        TextView textView = this.f3835h0;
        Resources q6 = q();
        Context context = this.f3831d0;
        a.i(context, q6, R.color.red_rust, textView);
        if (this.f3820R0.f4307r) {
            this.f3836i0.setText(r(R.string.damage));
            this.f3837j0.setText(String.valueOf(I1.b.j0(this.f3820R0.f4309t, this.f3822T0)));
            this.f3839l0.setText(R.string.accuracy);
            this.f3840m0.setText(String.valueOf(I1.b.j0(this.f3820R0.f4310u, this.f3822T0)));
        } else {
            this.f3836i0.setText(r(R.string.defence));
            this.f3837j0.setText(String.valueOf(I1.b.j0(this.f3820R0.f4311v, this.f3822T0)));
            this.f3839l0.setText(R.string.evasion);
            this.f3840m0.setText(String.valueOf(I1.b.j0(this.f3820R0.f4312w, this.f3822T0)));
        }
        this.f3838k0.setText(R.string.reached_to_maximum_level);
        a.i(context, q(), R.color.red_rust, this.f3838k0);
        this.f3841n0.setText(R.string.reached_to_maximum_level);
        a.i(context, q(), R.color.red_rust, this.f3841n0);
        this.f3842o0.setText(R.string.unknown);
        this.f3843p0.setText(R.string.unknown);
        this.f3844q0.setText(R.string.unknown);
        this.f3845r0.setText(R.string.unknown);
        this.s0.setText(R.string.unknown);
        this.f3847u0.setText(R.string.unknown);
        this.f3848v0.setText(R.string.unknown);
        this.f3811G0.setImageResource(R.drawable.button_gray_large);
    }

    public h(int i2, int i5, Context context) {
        this.f3831d0 = context;
        this.f3821S0 = i2;
        this.f3822T0 = i5;
    }
}
