package l4;

import F3.e;
import I1.b;
import W0.u;
import android.graphics.Bitmap;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.C0269a;
import androidx.fragment.app.C0281m;
import androidx.fragment.app.C0286s;
import com.bumptech.glide.d;
import com.google.android.gms.internal.measurement.a;
import com.mtma.criminal.city.R;
import com.mtma.criminal.city.activities.MainActivity;
import com.mtma.criminal.city.app.MyApplication;
import com.mtma.criminal.city.utils.U;
import com.mtma.criminal.city.views.SquareView;
import d5.o;
import e5.C0505b;
import i3.C0590f;
import i3.C0592h;
import java.util.Iterator;
import k.C0737s0;

public final class i extends C0286s {

    /* renamed from: d1  reason: collision with root package name */
    public static Handler f9777d1 = null;

    /* renamed from: e1  reason: collision with root package name */
    public static C0737s0 f9778e1 = null;

    /* renamed from: f1  reason: collision with root package name */
    public static boolean f9779f1 = false;

    /* renamed from: A0  reason: collision with root package name */
    public RelativeLayout f9780A0;

    /* renamed from: B0  reason: collision with root package name */
    public TextView f9781B0;

    /* renamed from: C0  reason: collision with root package name */
    public ImageView f9782C0;

    /* renamed from: D0  reason: collision with root package name */
    public TextView f9783D0;

    /* renamed from: E0  reason: collision with root package name */
    public TextView f9784E0;

    /* renamed from: F0  reason: collision with root package name */
    public TextView f9785F0;

    /* renamed from: G0  reason: collision with root package name */
    public LinearLayout f9786G0;

    /* renamed from: H0  reason: collision with root package name */
    public TextView f9787H0;

    /* renamed from: I0  reason: collision with root package name */
    public TextView f9788I0;

    /* renamed from: J0  reason: collision with root package name */
    public ImageView f9789J0;

    /* renamed from: K0  reason: collision with root package name */
    public ImageView f9790K0;
    public ImageView L0;

    /* renamed from: M0  reason: collision with root package name */
    public C0590f f9791M0;

    /* renamed from: N0  reason: collision with root package name */
    public C0590f f9792N0;
    public g O0;

    /* renamed from: P0  reason: collision with root package name */
    public h f9793P0;

    /* renamed from: Q0  reason: collision with root package name */
    public int f9794Q0;

    /* renamed from: R0  reason: collision with root package name */
    public int f9795R0;

    /* renamed from: S0  reason: collision with root package name */
    public long f9796S0 = -100;

    /* renamed from: T0  reason: collision with root package name */
    public long f9797T0 = -100;

    /* renamed from: U0  reason: collision with root package name */
    public long f9798U0 = -100;

    /* renamed from: V0  reason: collision with root package name */
    public double f9799V0 = -100.0d;

    /* renamed from: W0  reason: collision with root package name */
    public Bitmap f9800W0 = null;
    public C0505b X0;

    /* renamed from: Y0  reason: collision with root package name */
    public boolean f9801Y0 = false;

    /* renamed from: Z0  reason: collision with root package name */
    public boolean f9802Z0 = false;

    /* renamed from: a1  reason: collision with root package name */
    public C0505b f9803a1;

    /* renamed from: b1  reason: collision with root package name */
    public boolean f9804b1 = false;

    /* renamed from: c1  reason: collision with root package name */
    public final C0281m f9805c1 = ((C0281m) O(new u(0), new e((Object) this, 20)));

    /* renamed from: d0  reason: collision with root package name */
    public final MainActivity f9806d0;

    /* renamed from: e0  reason: collision with root package name */
    public View f9807e0;

    /* renamed from: f0  reason: collision with root package name */
    public ConstraintLayout f9808f0;

    /* renamed from: g0  reason: collision with root package name */
    public TextView f9809g0;

    /* renamed from: h0  reason: collision with root package name */
    public SquareView f9810h0;

    /* renamed from: i0  reason: collision with root package name */
    public ImageView f9811i0;

    /* renamed from: j0  reason: collision with root package name */
    public TextView f9812j0;

    /* renamed from: k0  reason: collision with root package name */
    public TextView f9813k0;

    /* renamed from: l0  reason: collision with root package name */
    public TextView f9814l0;

    /* renamed from: m0  reason: collision with root package name */
    public ImageView f9815m0;

    /* renamed from: n0  reason: collision with root package name */
    public TextView f9816n0;

    /* renamed from: o0  reason: collision with root package name */
    public TextView f9817o0;

    /* renamed from: p0  reason: collision with root package name */
    public LinearLayout f9818p0;

    /* renamed from: q0  reason: collision with root package name */
    public TextView f9819q0;

    /* renamed from: r0  reason: collision with root package name */
    public ImageView f9820r0;
    public TextView s0;

    /* renamed from: t0  reason: collision with root package name */
    public TextView f9821t0;

    /* renamed from: u0  reason: collision with root package name */
    public LinearLayout f9822u0;

    /* renamed from: v0  reason: collision with root package name */
    public TextView f9823v0;

    /* renamed from: w0  reason: collision with root package name */
    public ImageView f9824w0;

    /* renamed from: x0  reason: collision with root package name */
    public TextView f9825x0;

    /* renamed from: y0  reason: collision with root package name */
    public TextView f9826y0;

    /* renamed from: z0  reason: collision with root package name */
    public LinearLayout f9827z0;

    public i(MainActivity mainActivity) {
        this.f9806d0 = mainActivity;
    }

    public static void V(i iVar, int i2) {
        Iterator it2 = iVar.p().f5000c.v().iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            C0286s sVar = (C0286s) it2.next();
            if (sVar instanceof q4.e) {
                C0269a aVar = new C0269a(iVar.p());
                aVar.h(sVar);
                aVar.e(false);
                break;
            }
        }
        C0269a aVar2 = new C0269a(iVar.p());
        aVar2.f(R.id.activity_main_body_frame_layout, new q4.e(iVar.f9806d0, i2), (String) null, 1);
        a.j(aVar2, false);
    }

    public static void W(i iVar) {
        int i2 = iVar.f9794Q0;
        int nobilityCurrent = i2 - ((o.getMainStatesObject().getNobilityCurrent() * i2) / 100);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.setMargins(0, 0, nobilityCurrent, 0);
        layoutParams.addRule(15, -1);
        layoutParams.addRule(20, -1);
        iVar.f9824w0.setLayoutParams(layoutParams);
        iVar.f9824w0.setPaddingRelative(K1.e.m(1.0d), 0, -nobilityCurrent, K1.e.m(0.5d));
        iVar.f9823v0.setText(MyApplication.f7090a.getApplicationContext().getString(R.string.slash_between_two_number_without_space, new Object[]{Integer.valueOf(o.getMainStatesObject().getNobilityCurrent()), 100}));
        if (o.getMainStatesObject().getNobilityCurrent() < 100) {
            if (iVar.f9798U0 == -100) {
                iVar.f9825x0.setVisibility(8);
                iVar.f9827z0.setVisibility(0);
                iVar.f9798U0 = 300;
                iVar.f9826y0.setText(K1.e.L("mm:ss", 300));
            }
            if (!f9779f1) {
                f9779f1 = true;
                iVar.b0();
                return;
            }
            return;
        }
        iVar.f9825x0.setVisibility(0);
        iVar.f9827z0.setVisibility(8);
        iVar.f9798U0 = -100;
    }

    public final View C(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View inflate = layoutInflater.inflate(R.layout.fragment_top_bar, viewGroup, false);
        this.f9807e0 = inflate;
        this.f9808f0 = (ConstraintLayout) inflate.findViewById(R.id.fragment_top_bar_layout);
        this.f9809g0 = (TextView) this.f9807e0.findViewById(R.id.fragment_top_bar_name);
        this.f9810h0 = (SquareView) this.f9807e0.findViewById(R.id.fragment_top_bar_image_view);
        this.f9811i0 = (ImageView) this.f9807e0.findViewById(R.id.fragment_top_bar_vip_icon);
        this.f9812j0 = (TextView) this.f9807e0.findViewById(R.id.fragment_top_bar_gold_text);
        this.f9813k0 = (TextView) this.f9807e0.findViewById(R.id.fragment_top_bar_cash_text);
        this.f9789J0 = (ImageView) this.f9807e0.findViewById(R.id.fragment_top_bar_gold_add_button);
        this.f9790K0 = (ImageView) this.f9807e0.findViewById(R.id.fragment_top_bar_cash_add_button);
        this.L0 = (ImageView) this.f9807e0.findViewById(R.id.fragment_top_bar_level_bar);
        this.f9787H0 = (TextView) this.f9807e0.findViewById(R.id.fragment_top_bar_level_text);
        this.f9788I0 = (TextView) this.f9807e0.findViewById(R.id.fragment_top_bar_level_experience);
        this.f9814l0 = (TextView) this.f9807e0.findViewById(R.id.fragment_tob_bar_power_value_text);
        this.f9815m0 = (ImageView) this.f9807e0.findViewById(R.id.fragment_tob_bar_power_bar_value);
        this.f9816n0 = (TextView) this.f9807e0.findViewById(R.id.fragment_tob_bar_power_name);
        this.f9817o0 = (TextView) this.f9807e0.findViewById(R.id.fragment_tob_bar_power_timer_text);
        this.f9818p0 = (LinearLayout) this.f9807e0.findViewById(R.id.fragment_tob_bar_power_timer_layout);
        this.f9819q0 = (TextView) this.f9807e0.findViewById(R.id.fragment_tob_bar_courage_value_text);
        this.f9820r0 = (ImageView) this.f9807e0.findViewById(R.id.fragment_tob_bar_courage_bar_value);
        this.s0 = (TextView) this.f9807e0.findViewById(R.id.fragment_tob_bar_courage_name);
        this.f9821t0 = (TextView) this.f9807e0.findViewById(R.id.fragment_tob_bar_courage_timer_text);
        this.f9822u0 = (LinearLayout) this.f9807e0.findViewById(R.id.fragment_tob_bar_courage_timer_layout);
        this.f9823v0 = (TextView) this.f9807e0.findViewById(R.id.fragment_tob_bar_nobility_value_text);
        this.f9824w0 = (ImageView) this.f9807e0.findViewById(R.id.fragment_tob_bar_nobility_bar_value);
        this.f9825x0 = (TextView) this.f9807e0.findViewById(R.id.fragment_tob_bar_nobility_name);
        this.f9826y0 = (TextView) this.f9807e0.findViewById(R.id.fragment_tob_bar_nobility_timer_text);
        this.f9827z0 = (LinearLayout) this.f9807e0.findViewById(R.id.fragment_tob_bar_nobility_timer_layout);
        this.f9780A0 = (RelativeLayout) this.f9807e0.findViewById(R.id.fragment_tob_bar_health_layout);
        this.f9781B0 = (TextView) this.f9807e0.findViewById(R.id.fragment_tob_bar_health_value_text);
        this.f9782C0 = (ImageView) this.f9807e0.findViewById(R.id.fragment_tob_bar_health_bar_value);
        this.f9783D0 = (TextView) this.f9807e0.findViewById(R.id.fragment_tob_bar_health_name);
        this.f9784E0 = (TextView) this.f9807e0.findViewById(R.id.fragment_tob_bar_health_timer_text);
        this.f9786G0 = (LinearLayout) this.f9807e0.findViewById(R.id.fragment_tob_bar_health_timer_layout);
        this.f9785F0 = (TextView) this.f9807e0.findViewById(R.id.fragment_top_bar_health_toast);
        this.f9808f0.startAnimation(AnimationUtils.loadAnimation(this.f9806d0, R.anim.from_top_to_position));
        this.f9809g0.setText(o.getMainStatesObject().getNickName());
        b.v(this.f9810h0, o.getMainStatesObject().getProfilePicUrl());
        if (R2.b.k0(o.getMainStatesObject().getVipEndTime())) {
            this.f9810h0.setBackgroundResource(R.drawable.profile_pic_frame_vip);
            this.f9811i0.setVisibility(0);
        } else {
            this.f9810h0.setBackgroundResource(R.drawable.profile_pic_frame_default);
            this.f9811i0.setVisibility(8);
        }
        this.f9812j0.setText(String.valueOf(o.getMoneyObject().getGold()));
        this.f9813k0.setText(U.a(o.getMoneyObject().getCash()));
        this.f9787H0.setText(String.valueOf(o.getMainStatesObject().getLevel()));
        this.f9815m0.getViewTreeObserver().addOnGlobalLayoutListener(new f(this, 1));
        this.L0.getViewTreeObserver().addOnGlobalLayoutListener(new f(this, 0));
        ImageView imageView = this.f9789J0;
        imageView.setOnClickListener(new C0796d(this, imageView, 0));
        ImageView imageView2 = this.f9790K0;
        imageView2.setOnClickListener(new C0796d(this, imageView2, 1));
        SquareView squareView = this.f9810h0;
        squareView.setOnClickListener(new C0796d(this, squareView, 3));
        RelativeLayout relativeLayout = this.f9780A0;
        relativeLayout.setOnClickListener(new C0796d(this, relativeLayout, 2));
        return this.f9807e0;
    }

    public final void H() {
        g gVar;
        h hVar;
        this.f5157L = true;
        c0();
        C0590f fVar = this.f9792N0;
        if (!(fVar == null || (hVar = this.f9793P0) == null)) {
            fVar.u(hVar);
        }
        C0590f fVar2 = this.f9791M0;
        if (!(fVar2 == null || (gVar = this.O0) == null)) {
            fVar2.u(gVar);
        }
        this.f9793P0 = null;
        this.O0 = null;
    }

    public final void I() {
        this.f5157L = true;
        this.f9791M0 = a.v(a.c(C0592h.b().e(), "players"), "moneyObject");
        this.f9792N0 = a.v(a.c(C0592h.b().e(), "players"), "mainStatesObject");
        if (this.O0 == null) {
            g gVar = new g(this, 3);
            this.O0 = gVar;
            this.f9791M0.b(gVar);
        }
        if (this.f9793P0 == null) {
            h hVar = new h(this, 2);
            this.f9793P0 = hVar;
            this.f9792N0.b(hVar);
        }
    }

    public final void X() {
        int i2 = this.f9794Q0;
        int courageCurrent = i2 - ((o.getMainStatesObject().getCourageCurrent() * i2) / d.d0());
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.setMargins(0, 0, courageCurrent, 0);
        layoutParams.addRule(15, -1);
        layoutParams.addRule(20, -1);
        this.f9820r0.setLayoutParams(layoutParams);
        this.f9820r0.setPaddingRelative(K1.e.m(1.0d), 0, -courageCurrent, K1.e.m(0.5d));
        this.f9819q0.setText(MyApplication.f7090a.getApplicationContext().getString(R.string.slash_between_two_number_without_space, new Object[]{Integer.valueOf(o.getMainStatesObject().getCourageCurrent()), Integer.valueOf(d.d0())}));
        if (o.getMainStatesObject().getCourageCurrent() < d.d0()) {
            if (this.f9797T0 == -100) {
                this.s0.setVisibility(8);
                this.f9822u0.setVisibility(0);
                this.f9797T0 = 120;
                this.f9821t0.setText(K1.e.L("mm:ss", 120));
            }
            if (!f9779f1) {
                f9779f1 = true;
                b0();
                return;
            }
            return;
        }
        this.s0.setVisibility(0);
        this.f9822u0.setVisibility(8);
        this.f9797T0 = -100;
    }

    public final void Y() {
        long j6 = (long) this.f9794Q0;
        int healthCurrent = (int) (j6 - ((o.getMainStatesObject().getHealthCurrent() * j6) / d.o0()));
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.setMargins(0, 0, healthCurrent, 0);
        layoutParams.addRule(15, -1);
        layoutParams.addRule(20, -1);
        this.f9782C0.setLayoutParams(layoutParams);
        this.f9782C0.setPaddingRelative(K1.e.m(1.0d), 0, -healthCurrent, K1.e.m(0.5d));
        this.f9781B0.setText(MyApplication.f7090a.getApplicationContext().getString(R.string.slash_between_two_text, new Object[]{U.c(o.getMainStatesObject().getHealthCurrent()), U.c(d.o0())}));
        if (o.getMainStatesObject().getHealthCurrent() < d.o0()) {
            if (this.f9799V0 == -100.0d) {
                this.f9783D0.setVisibility(8);
                this.f9786G0.setVisibility(0);
                this.f9799V0 = 120.0d;
                this.f9784E0.setText(K1.e.K(120.0d));
            }
            if (!f9779f1) {
                f9779f1 = true;
                b0();
                return;
            }
            return;
        }
        this.f9783D0.setVisibility(0);
        this.f9786G0.setVisibility(8);
        this.f9799V0 = -100.0d;
    }

    public final void Z() {
        long j6;
        long j7;
        if (o.getMainStatesObject().getLevel() == d.v0(80, "server_maximum_level")) {
            j7 = d.w0(o.getMainStatesObject().getLevel() - 1);
            j6 = j7;
        } else {
            long w02 = d.w0(o.getMainStatesObject().getLevel());
            j7 = o.getMainStatesObject().getLevelCurrentExperience();
            j6 = w02;
        }
        this.f9788I0.setText(MyApplication.f7090a.getApplicationContext().getString(R.string.slash_between_two_number, new Object[]{Long.valueOf(j7), Long.valueOf(j6)}));
        long j8 = (long) this.f9795R0;
        int i2 = (int) (j8 - ((j7 * j8) / j6));
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        layoutParams.setMargins(0, 0, i2, 0);
        this.L0.setLayoutParams(layoutParams);
        this.L0.setPaddingRelative(0, 0, -i2, 0);
    }

    public final void a0() {
        int i2 = this.f9794Q0;
        int powerCurrent = i2 - ((o.getMainStatesObject().getPowerCurrent() * i2) / d.A0());
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.setMargins(0, 0, powerCurrent, 0);
        layoutParams.addRule(15, -1);
        layoutParams.addRule(20, -1);
        this.f9815m0.setLayoutParams(layoutParams);
        this.f9815m0.setPaddingRelative(K1.e.m(1.0d), 0, -powerCurrent, K1.e.m(0.5d));
        this.f9814l0.setText(MyApplication.f7090a.getApplicationContext().getString(R.string.slash_between_two_number_without_space, new Object[]{Integer.valueOf(o.getMainStatesObject().getPowerCurrent()), Integer.valueOf(d.A0())}));
        if (o.getMainStatesObject().getPowerCurrent() < d.A0()) {
            if (this.f9796S0 == -100) {
                this.f9816n0.setVisibility(8);
                this.f9818p0.setVisibility(0);
                this.f9796S0 = 120;
                this.f9817o0.setText(K1.e.L("mm:ss", 120));
            }
            if (!f9779f1) {
                f9779f1 = true;
                b0();
                return;
            }
            return;
        }
        this.f9816n0.setVisibility(0);
        this.f9818p0.setVisibility(8);
        this.f9796S0 = -100;
    }

    public final void b0() {
        Handler handler = new Handler();
        f9777d1 = handler;
        C0737s0 s0Var = new C0737s0(this, 5);
        f9778e1 = s0Var;
        handler.postDelayed(s0Var, 1000);
    }

    public final void c0() {
        if (f9779f1) {
            f9779f1 = false;
            f9777d1.removeCallbacks(f9778e1);
            f9777d1 = null;
            f9778e1 = null;
            if (this.f9796S0 != -100) {
                this.f9796S0 = -100;
                this.f9817o0.setText(K1.e.L("mm:ss", 120));
            }
            if (this.f9797T0 != -100) {
                this.f9797T0 = -100;
                this.f9821t0.setText(K1.e.L("mm:ss", 120));
            }
            if (this.f9798U0 != -100) {
                this.f9798U0 = -100;
                this.f9826y0.setText(K1.e.L("mm:ss", 300));
            }
            if (this.f9799V0 != -100.0d) {
                this.f9799V0 = -100.0d;
                this.f9784E0.setText(K1.e.K(120.0d));
            }
        }
    }

    public final void d0() {
        a0();
        X();
        Y();
    }
}
