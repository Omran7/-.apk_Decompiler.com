package u4;

import B.n;
import K1.e;
import R2.b;
import Y4.D;
import Y4.i;
import Y4.j;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.AnimationDrawable;
import android.media.MediaPlayer;
import android.os.Handler;
import android.preference.PreferenceManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.C0269a;
import androidx.fragment.app.C0286s;
import com.bumptech.glide.c;
import com.bumptech.glide.d;
import com.google.android.gms.internal.measurement.a;
import com.google.android.gms.internal.p002firebaseauthapi.zzaky;
import com.mtma.criminal.city.R;
import com.mtma.criminal.city.app.MyApplication;
import com.mtma.criminal.city.utils.J;
import com.mtma.criminal.city.utils.Q;
import com.mtma.criminal.city.utils.t0;
import com.mtma.criminal.city.utils.v0;
import com.mtma.criminal.city.views.SquareView;
import d5.o;
import d5.u;
import e5.C0505b;
import f.C0518i;
import i3.C0592h;
import j4.C0614b;
import j4.p0;
import java.util.ArrayList;
import k.C0724m;
import x4.C1105h;

public final class g extends C0286s {

    /* renamed from: A0  reason: collision with root package name */
    public ConstraintLayout f11877A0;

    /* renamed from: B0  reason: collision with root package name */
    public ImageView f11878B0;

    /* renamed from: C0  reason: collision with root package name */
    public ImageView f11879C0;

    /* renamed from: D0  reason: collision with root package name */
    public ImageView f11880D0;

    /* renamed from: E0  reason: collision with root package name */
    public ImageView f11881E0;

    /* renamed from: F0  reason: collision with root package name */
    public ImageView f11882F0;

    /* renamed from: G0  reason: collision with root package name */
    public ImageView f11883G0;

    /* renamed from: H0  reason: collision with root package name */
    public ImageView f11884H0;

    /* renamed from: I0  reason: collision with root package name */
    public ImageView f11885I0;

    /* renamed from: J0  reason: collision with root package name */
    public ImageView f11886J0;

    /* renamed from: K0  reason: collision with root package name */
    public ImageView f11887K0;
    public RelativeLayout L0;

    /* renamed from: M0  reason: collision with root package name */
    public RelativeLayout f11888M0;

    /* renamed from: N0  reason: collision with root package name */
    public RelativeLayout f11889N0;
    public ConstraintLayout O0;

    /* renamed from: P0  reason: collision with root package name */
    public ConstraintLayout f11890P0;

    /* renamed from: Q0  reason: collision with root package name */
    public ListView f11891Q0;

    /* renamed from: R0  reason: collision with root package name */
    public ImageView f11892R0;

    /* renamed from: S0  reason: collision with root package name */
    public ImageView f11893S0;

    /* renamed from: T0  reason: collision with root package name */
    public ImageView f11894T0;

    /* renamed from: U0  reason: collision with root package name */
    public ImageView f11895U0;

    /* renamed from: V0  reason: collision with root package name */
    public ImageView f11896V0;

    /* renamed from: W0  reason: collision with root package name */
    public ImageView f11897W0;
    public ImageView X0;

    /* renamed from: Y0  reason: collision with root package name */
    public final ArrayList f11898Y0 = new ArrayList();

    /* renamed from: Z0  reason: collision with root package name */
    public C0614b f11899Z0;

    /* renamed from: a1  reason: collision with root package name */
    public int f11900a1 = 0;

    /* renamed from: b1  reason: collision with root package name */
    public boolean f11901b1 = false;

    /* renamed from: c1  reason: collision with root package name */
    public boolean f11902c1 = false;

    /* renamed from: d0  reason: collision with root package name */
    public final Context f11903d0;

    /* renamed from: d1  reason: collision with root package name */
    public long f11904d1;

    /* renamed from: e0  reason: collision with root package name */
    public final String f11905e0;

    /* renamed from: e1  reason: collision with root package name */
    public u f11906e1;

    /* renamed from: f0  reason: collision with root package name */
    public View f11907f0;

    /* renamed from: f1  reason: collision with root package name */
    public u f11908f1;

    /* renamed from: g0  reason: collision with root package name */
    public ConstraintLayout f11909g0;
    public long g1;

    /* renamed from: h0  reason: collision with root package name */
    public TextView f11910h0;

    /* renamed from: h1  reason: collision with root package name */
    public long f11911h1;

    /* renamed from: i0  reason: collision with root package name */
    public TextView f11912i0;

    /* renamed from: i1  reason: collision with root package name */
    public long f11913i1;

    /* renamed from: j0  reason: collision with root package name */
    public SquareView f11914j0;

    /* renamed from: j1  reason: collision with root package name */
    public long f11915j1;

    /* renamed from: k0  reason: collision with root package name */
    public SquareView f11916k0;

    /* renamed from: k1  reason: collision with root package name */
    public int f11917k1;

    /* renamed from: l0  reason: collision with root package name */
    public ImageView f11918l0;

    /* renamed from: l1  reason: collision with root package name */
    public final boolean f11919l1;

    /* renamed from: m0  reason: collision with root package name */
    public ConstraintLayout f11920m0;

    /* renamed from: m1  reason: collision with root package name */
    public final boolean f11921m1;

    /* renamed from: n0  reason: collision with root package name */
    public TextView f11922n0;

    /* renamed from: n1  reason: collision with root package name */
    public final boolean f11923n1;

    /* renamed from: o0  reason: collision with root package name */
    public ConstraintLayout f11924o0;

    /* renamed from: o1  reason: collision with root package name */
    public boolean f11925o1 = false;

    /* renamed from: p0  reason: collision with root package name */
    public ImageView f11926p0;

    /* renamed from: p1  reason: collision with root package name */
    public C0505b f11927p1;

    /* renamed from: q0  reason: collision with root package name */
    public ConstraintLayout f11928q0;

    /* renamed from: q1  reason: collision with root package name */
    public boolean f11929q1 = false;

    /* renamed from: r0  reason: collision with root package name */
    public TextView f11930r0;

    /* renamed from: r1  reason: collision with root package name */
    public long f11931r1;
    public ConstraintLayout s0;

    /* renamed from: s1  reason: collision with root package name */
    public int f11932s1 = 0;

    /* renamed from: t0  reason: collision with root package name */
    public ImageView f11933t0;

    /* renamed from: t1  reason: collision with root package name */
    public boolean f11934t1 = false;

    /* renamed from: u0  reason: collision with root package name */
    public ConstraintLayout f11935u0;

    /* renamed from: u1  reason: collision with root package name */
    public boolean f11936u1 = true;

    /* renamed from: v0  reason: collision with root package name */
    public TextView f11937v0;

    /* renamed from: v1  reason: collision with root package name */
    public int f11938v1;

    /* renamed from: w0  reason: collision with root package name */
    public ConstraintLayout f11939w0;

    /* renamed from: w1  reason: collision with root package name */
    public int f11940w1 = 0;

    /* renamed from: x0  reason: collision with root package name */
    public ImageView f11941x0;

    /* renamed from: y0  reason: collision with root package name */
    public ConstraintLayout f11942y0;

    /* renamed from: z0  reason: collision with root package name */
    public TextView f11943z0;

    public g(Context context, String str) {
        this.f11903d0 = context;
        this.f11905e0 = str;
        this.f11919l1 = true;
        this.f11921m1 = true;
        this.f11923n1 = true;
    }

    public static void V(g gVar, View view, D d) {
        gVar.getClass();
        int[] iArr = new int[2];
        view.getLocationInWindow(iArr);
        v0.a(d, gVar.f11903d0, iArr[1]);
    }

    public static void W(g gVar) {
        int i2;
        if (gVar.f11901b1 && gVar.f11902c1) {
            b.w(false);
            int A6 = c.A(Long.valueOf(gVar.f11908f1.getAccountObject().getJoinTimeInMilli()));
            Context context = gVar.f11903d0;
            if (A6 < 3) {
                if (b.i0(608)) {
                    i2 = 10;
                } else {
                    i2 = 20;
                }
                d.m1(0, i2, false, (J) null);
                C0269a aVar = new C0269a(gVar.p());
                aVar.h(gVar);
                aVar.c();
                aVar.e(false);
                c.s0(context, MyApplication.f7090a.getApplicationContext().getString(R.string.dialog_can_not_fight_with_new_player, new Object[]{3}), (String) null);
                return;
            }
            gVar.f11909g0.setVisibility(0);
            gVar.O0.setAnimation(AnimationUtils.loadAnimation(context, R.anim.from_start_to_position));
            gVar.f11890P0.setAnimation(AnimationUtils.loadAnimation(context, R.anim.from_end_to_position));
            gVar.O0.setVisibility(0);
            gVar.f11890P0.setVisibility(0);
            C0614b bVar = new C0614b(context, gVar.f11898Y0, 2);
            gVar.f11899Z0 = bVar;
            gVar.f11891Q0.setAdapter(bVar);
            long j6 = (long) PreferenceManager.getDefaultSharedPreferences(MyApplication.f7090a.getApplicationContext()).getInt("fight_speed", 800);
            gVar.f11931r1 = j6;
            if (j6 == 800) {
                gVar.X0.setImageResource(R.drawable.fight_speed_one);
            } else {
                gVar.X0.setImageResource(R.drawable.fight_speed_two);
            }
            if (e.I(gVar.f11906e1) >= e.I(gVar.f11908f1)) {
                gVar.d0(0);
            } else {
                gVar.d0(1);
            }
        }
    }

    public static void X(g gVar, String str) {
        if (!gVar.f11929q1) {
            gVar.f11929q1 = true;
            gVar.f11925o1 = false;
            C0505b bVar = new C0505b(gVar.f11903d0, R.layout.dialog_ok_cancle);
            gVar.f11927p1 = bVar;
            RelativeLayout relativeLayout = (RelativeLayout) bVar.findViewById(R.id.dialog_ok_cancel_ok_button);
            relativeLayout.setVisibility(0);
            ((TextView) gVar.f11927p1.findViewById(R.id.dialog_ok_cancel_text)).setText(str);
            relativeLayout.setOnClickListener(new f(gVar, relativeLayout, 0));
            gVar.f11927p1.show();
        }
    }

    public final View C(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View inflate = layoutInflater.inflate(R.layout.fragment_fight, viewGroup, false);
        this.f11907f0 = inflate;
        this.f11909g0 = (ConstraintLayout) inflate.findViewById(R.id.fragment_fight_main_layout);
        this.f11910h0 = (TextView) this.f11907f0.findViewById(R.id.fragment_fight_current_player_name);
        this.f11912i0 = (TextView) this.f11907f0.findViewById(R.id.fragment_fight_other_player_name);
        this.f11914j0 = (SquareView) this.f11907f0.findViewById(R.id.fragment_fight_current_player_image);
        this.f11916k0 = (SquareView) this.f11907f0.findViewById(R.id.fragment_fight_other_player_image);
        this.f11918l0 = (ImageView) this.f11907f0.findViewById(R.id.fragment_fight_current_player_gun);
        this.f11922n0 = (TextView) this.f11907f0.findViewById(R.id.fragment_fight_current_player_gun_level);
        this.f11920m0 = (ConstraintLayout) this.f11907f0.findViewById(R.id.fragment_fight_current_player_gun_level_layout);
        this.f11924o0 = (ConstraintLayout) this.f11907f0.findViewById(R.id.fragment_fight_current_player_gun_image_layout);
        this.f11926p0 = (ImageView) this.f11907f0.findViewById(R.id.fragment_fight_other_player_gun);
        this.f11930r0 = (TextView) this.f11907f0.findViewById(R.id.fragment_fight_other_player_gun_level);
        this.f11928q0 = (ConstraintLayout) this.f11907f0.findViewById(R.id.fragment_fight_other_player_gun_level_layout);
        this.s0 = (ConstraintLayout) this.f11907f0.findViewById(R.id.fragment_fight_other_player_gun_image_layout);
        this.f11933t0 = (ImageView) this.f11907f0.findViewById(R.id.fragment_fight_current_player_armor);
        this.f11937v0 = (TextView) this.f11907f0.findViewById(R.id.fragment_fight_current_player_armor_level);
        this.f11935u0 = (ConstraintLayout) this.f11907f0.findViewById(R.id.fragment_fight_current_player_armor_level_layout);
        this.f11939w0 = (ConstraintLayout) this.f11907f0.findViewById(R.id.fragment_fight_current_player_armor_image_layout);
        this.f11941x0 = (ImageView) this.f11907f0.findViewById(R.id.fragment_fight_other_player_armor);
        this.f11943z0 = (TextView) this.f11907f0.findViewById(R.id.fragment_fight_other_player_armor_level);
        this.f11942y0 = (ConstraintLayout) this.f11907f0.findViewById(R.id.fragment_fight_other_player_armor_level_layout);
        this.f11877A0 = (ConstraintLayout) this.f11907f0.findViewById(R.id.fragment_fight_other_player_armor_image_layout);
        this.f11878B0 = (ImageView) this.f11907f0.findViewById(R.id.fragment_fight_current_player_special_equipment);
        this.f11879C0 = (ImageView) this.f11907f0.findViewById(R.id.fragment_fight_other_player_special_equipment);
        this.f11880D0 = (ImageView) this.f11907f0.findViewById(R.id.fragment_fight_current_player_biochemical);
        this.f11881E0 = (ImageView) this.f11907f0.findViewById(R.id.fragment_fight_other_player_biochemical);
        this.f11882F0 = (ImageView) this.f11907f0.findViewById(R.id.fragment_fight_current_player_health_full_bar_fake);
        this.f11883G0 = (ImageView) this.f11907f0.findViewById(R.id.fragment_fight_current_player_health_full_bar);
        this.f11884H0 = (ImageView) this.f11907f0.findViewById(R.id.fragment_fight_other_player_health_full_bar);
        this.f11887K0 = (ImageView) this.f11907f0.findViewById(R.id.fragment_fight_cripple_button_image);
        this.f11886J0 = (ImageView) this.f11907f0.findViewById(R.id.fragment_fight_steal_button_image);
        this.f11885I0 = (ImageView) this.f11907f0.findViewById(R.id.fragment_fight_leave_button_image);
        this.f11889N0 = (RelativeLayout) this.f11907f0.findViewById(R.id.fragment_fight_cripple_button);
        this.f11888M0 = (RelativeLayout) this.f11907f0.findViewById(R.id.fragment_fight_steal_button);
        this.L0 = (RelativeLayout) this.f11907f0.findViewById(R.id.fragment_fight_leave_button);
        this.O0 = (ConstraintLayout) this.f11907f0.findViewById(R.id.fragment_fight_left_layout);
        this.f11890P0 = (ConstraintLayout) this.f11907f0.findViewById(R.id.fragment_fight_right_layout);
        this.f11892R0 = (ImageView) this.f11907f0.findViewById(R.id.fragment_fight_current_player_fight_result_image);
        this.f11893S0 = (ImageView) this.f11907f0.findViewById(R.id.fragment_fight_other_player_fight_result_image);
        this.f11894T0 = (ImageView) this.f11907f0.findViewById(R.id.fragment_fight_current_player_weapon_animation);
        this.f11895U0 = (ImageView) this.f11907f0.findViewById(R.id.fragment_fight_other_player_weapon_animation);
        this.f11896V0 = (ImageView) this.f11907f0.findViewById(R.id.fragment_fight_current_player_lose_glass);
        this.f11897W0 = (ImageView) this.f11907f0.findViewById(R.id.fragment_fight_other_player_lose_glass);
        this.X0 = (ImageView) this.f11907f0.findViewById(R.id.fragment_fight_speed_button);
        this.f11891Q0 = (ListView) this.f11907f0.findViewById(R.id.fragment_fight_details_list_view);
        this.f11887K0.setImageResource(R.drawable.button_cripple_gray);
        this.f11886J0.setImageResource(R.drawable.button_steal_gray);
        this.f11885I0.setImageResource(R.drawable.button_leave_gray);
        this.f11882F0.getViewTreeObserver().addOnGlobalLayoutListener(new K4.e(this, 10));
        a.c(a.e(true), "players").E(o.getAccountObject().getId()).d(new p0(this, 21));
        a.c(C0592h.b().e(), "players").E(this.f11905e0).d(new C0724m(this, 15));
        RelativeLayout relativeLayout = this.f11889N0;
        relativeLayout.setOnClickListener(new f(this, relativeLayout, 2));
        RelativeLayout relativeLayout2 = this.f11888M0;
        relativeLayout2.setOnClickListener(new f(this, relativeLayout2, 3));
        RelativeLayout relativeLayout3 = this.L0;
        relativeLayout3.setOnClickListener(new f(this, relativeLayout3, 4));
        ImageView imageView = this.X0;
        imageView.setOnClickListener(new f(this, imageView, 1));
        return this.f11907f0;
    }

    public final void H() {
        this.f5157L = true;
        this.f11934t1 = true;
    }

    public final void I() {
        this.f5157L = true;
        if (!this.f11934t1) {
            b.K0();
        } else if (this.f11936u1) {
            b.K0();
            d0(this.f11938v1);
        } else {
            new Handler().postDelayed(new A4.a(this, 18), ((long) e.J(20, 30)) * 1000);
        }
        this.f11934t1 = false;
    }

    public final void Y(ImageView imageView, boolean z3) {
        if (this.f11907f0.isShown()) {
            if (z3) {
                b.M0(R.raw.fight_knife);
                imageView.setImageResource(R.drawable.fight_weapon_white_animation);
            } else {
                b.M0(R.raw.fight_gun);
                imageView.setImageResource(R.drawable.fight_weapon_gun_animation);
            }
            AnimationDrawable animationDrawable = (AnimationDrawable) imageView.getDrawable();
            imageView.setVisibility(0);
            animationDrawable.start();
            int i2 = 0;
            for (int i5 = 0; i5 < animationDrawable.getNumberOfFrames(); i5++) {
                i2 += animationDrawable.getDuration(i5);
            }
            new Handler().postDelayed(new A4.a(imageView, 19), (long) i2);
        }
    }

    public final void Z() {
        android.support.v4.media.session.a.C0(0, 2, 1, o.getAccountObject().getId());
        long j6 = (long) 1;
        Q.b(113, o.getAccountObject().getId(), j6);
        int i2 = -1;
        if (this.f11906e1.getArmingObject().getGunId() != -1) {
            String id = o.getAccountObject().getId();
            switch (D.s(this.f11906e1.getArmingObject().getGunId(), 0, 1).f4308s) {
                case 0:
                    i2 = 119;
                    break;
                case 1:
                    i2 = 120;
                    break;
                case 2:
                    i2 = 121;
                    break;
                case 3:
                    i2 = 122;
                    break;
                case 4:
                    i2 = 123;
                    break;
                case 5:
                    i2 = 124;
                    break;
                case zzaky.zzf.zzf:
                    i2 = 125;
                    break;
                case zzaky.zzf.zzg:
                    i2 = 126;
                    break;
            }
            Q.b(i2, id, j6);
        }
        if (this.f11940w1 > 0) {
            Q.b(116, o.getAccountObject().getId(), (long) this.f11940w1);
        }
        int i5 = this.f11917k1;
        String str = this.f11905e0;
        if (i5 == 0) {
            Q.b(114, o.getAccountObject().getId(), j6);
            Q.b(115, o.getAccountObject().getId(), j6);
            Q.g(118, str);
            if (((double) this.f11904d1) <= ((double) d.p0(this.f11906e1.getMainStatesObject())) * 0.01d) {
                Q.b(127, o.getAccountObject().getId(), j6);
            }
            if (((double) this.f11904d1) < ((double) d.p0(this.f11906e1.getMainStatesObject())) * 0.5d) {
                Q.b(128, o.getAccountObject().getId(), j6);
            } else {
                Q.g(128, o.getAccountObject().getId());
            }
            android.support.v4.media.session.a.C0(2, 4, 1, o.getAccountObject().getId());
            return;
        }
        Q.b(117, str, j6);
        Q.b(118, str, j6);
        Q.g(115, o.getAccountObject().getId());
        Q.g(118, o.getAccountObject().getId());
        Q.g(128, o.getAccountObject().getId());
    }

    public final void a0() {
        Context context = this.f11903d0;
        if (PreferenceManager.getDefaultSharedPreferences(context).getBoolean("game_music", true)) {
            MediaPlayer mediaPlayer = b.f2473b;
            if (mediaPlayer != null) {
                mediaPlayer.stop();
                b.f2473b.release();
                b.f2473b = null;
            }
            MediaPlayer mediaPlayer2 = b.f2472a;
            if (!(mediaPlayer2 == null || this.f11917k1 == 1)) {
                mediaPlayer2.start();
            }
        }
        C0269a aVar = new C0269a(p());
        aVar.h(this);
        aVar.c();
        int i2 = 0;
        aVar.e(false);
        int i5 = this.f11917k1;
        if (i5 == 1) {
            C0269a aVar2 = new C0269a(p());
            aVar2.i(R.id.activity_main_body_frame_layout, new C1105h(context));
            aVar2.c();
            aVar2.e(false);
            return;
        }
        String str = this.f11905e0;
        if (i5 == 0) {
            for (C0286s sVar : p().f5000c.v()) {
                if (sVar instanceof C1033b) {
                    C1033b bVar = (C1033b) sVar;
                    while (true) {
                        ArrayList arrayList = bVar.f11861m0;
                        if (i2 >= arrayList.size()) {
                            return;
                        }
                        if (((i) arrayList.get(i2)).f4366a.equals(str)) {
                            arrayList.remove(i2);
                            bVar.f11862n0.notifyDataSetChanged();
                            return;
                        }
                        i2++;
                    }
                }
            }
        } else if (i5 == 2 && this.f11913i1 < this.f11908f1.getMainStatesObject().getHealthCurrent()) {
            for (C0286s sVar2 : p().f5000c.v()) {
                if (sVar2 instanceof C1033b) {
                    C1033b bVar2 = (C1033b) sVar2;
                    long j6 = this.f11913i1;
                    while (true) {
                        ArrayList arrayList2 = bVar2.f11861m0;
                        if (i2 >= arrayList2.size()) {
                            return;
                        }
                        if (((i) arrayList2.get(i2)).f4366a.equals(str)) {
                            ((i) arrayList2.get(i2)).f4371i = j6;
                            bVar2.f11862n0.notifyDataSetChanged();
                            return;
                        }
                        i2++;
                    }
                }
            }
        }
    }

    public final void b0() {
        String str;
        this.f11936u1 = false;
        MediaPlayer mediaPlayer = b.f2473b;
        if (mediaPlayer != null) {
            mediaPlayer.stop();
            b.f2473b.release();
            b.f2473b = null;
        }
        int i2 = this.f11917k1;
        if (i2 == 0) {
            str = MyApplication.f7090a.getApplicationContext().getString(R.string.fight_details_by_winning);
            this.f11892R0.setImageResource(R.drawable.fight_result_win);
            this.f11893S0.setImageResource(R.drawable.fight_result_lose);
            b.M0(R.raw.fight_win);
            this.f11897W0.setVisibility(0);
        } else if (i2 == 2) {
            str = MyApplication.f7090a.getApplicationContext().getString(R.string.fight_details_by_drawing);
            this.f11892R0.setImageResource(R.drawable.fight_result_draw);
            this.f11893S0.setImageResource(R.drawable.fight_result_draw);
            b.M0(R.raw.fight_win);
        } else {
            str = MyApplication.f7090a.getApplicationContext().getString(R.string.fight_details_by_losing);
            this.f11892R0.setImageResource(R.drawable.fight_result_lose);
            this.f11893S0.setImageResource(R.drawable.fight_result_win);
            b.M0(R.raw.fight_lose);
            this.f11896V0.setVisibility(0);
        }
        this.f11892R0.setAnimation(AnimationUtils.loadAnimation(MyApplication.f7090a.getApplicationContext(), R.anim.fight_result));
        this.f11893S0.setAnimation(AnimationUtils.loadAnimation(MyApplication.f7090a.getApplicationContext(), R.anim.fight_result));
        j jVar = new j(str, true, true);
        ArrayList arrayList = this.f11898Y0;
        arrayList.add(jVar);
        this.f11899Z0.notifyDataSetChanged();
        this.f11891Q0.setSelection(arrayList.size() - 1);
        if (this.f11917k1 == 0) {
            if (this.f11919l1) {
                this.f11885I0.setImageResource(R.drawable.button_leave);
            }
            if (this.f11921m1) {
                this.f11886J0.setImageResource(R.drawable.button_steal);
            }
            if (this.f11923n1) {
                this.f11887K0.setImageResource(R.drawable.button_cripple);
            }
        } else {
            this.f11885I0.setImageResource(R.drawable.button_leave);
        }
        this.f11925o1 = true;
        if (this.f11917k1 == 1) {
            u uVar = this.f11906e1;
            u uVar2 = this.f11908f1;
            C1034c cVar = new C1034c(this);
            android.support.v4.media.session.a.b(uVar.getAccountObject().getId(), e.W(1800, uVar2, uVar), MyApplication.f7090a.getApplicationContext().getString(R.string.fight_reason_for_hospital_when_lose, new Object[]{uVar2.getMainStatesObject().getNickName()}), new F3.e((Object) cVar, 10));
        }
        new Handler().postDelayed(new A4.a(this, 18), ((long) e.J(20, 30)) * 1000);
    }

    public final void c0(View view, double d) {
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        int i2 = iArr[0];
        int i5 = iArr[1];
        String string = MyApplication.f7090a.getApplicationContext().getString(R.string.text_with_minus_sign, new Object[]{e.p(d)});
        boolean z3 = v0.f7482a;
        Context context = this.f11903d0;
        View inflate = LayoutInflater.from(context).inflate(R.layout.toast_number_with_icon, (ViewGroup) null, false);
        TextView textView = (TextView) inflate.findViewById(R.id.toast_number_with_icon_content);
        ((ImageView) inflate.findViewById(R.id.toast_number_with_icon_icon)).setVisibility(8);
        textView.setText(string);
        textView.setTextColor(context.getResources().getColor(R.color.gym_increasing, context.getTheme()));
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2, 80);
        layoutParams.bottomMargin = Resources.getSystem().getDisplayMetrics().heightPixels - i5;
        layoutParams.leftMargin = i2;
        inflate.setLayoutParams(layoutParams);
        ViewGroup viewGroup = (ViewGroup) ((C0518i) context).getWindow().getDecorView().getRootView();
        viewGroup.addView(inflate);
        ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(inflate, new PropertyValuesHolder[]{PropertyValuesHolder.ofFloat(View.SCALE_X, new float[]{1.1f}), PropertyValuesHolder.ofFloat(View.SCALE_Y, new float[]{1.1f})});
        ofPropertyValuesHolder.setRepeatCount(1);
        ofPropertyValuesHolder.setRepeatMode(2);
        ofPropertyValuesHolder.start();
        ofPropertyValuesHolder.addListener(new t0(inflate, viewGroup, 4));
    }

    public final void d0(int i2) {
        new Handler().postDelayed(new n(this, i2, 2), this.f11931r1);
    }

    public final void e0(long j6, long j7, View view) {
        int i2 = this.f11900a1;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        layoutParams.height = (i2 * ((int) ((((double) j6) / ((double) j7)) * 100.0d))) / 100;
        view.setLayoutParams(layoutParams);
    }
}
