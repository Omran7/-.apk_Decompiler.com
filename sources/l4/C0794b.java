package l4;

import R2.b;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.C0269a;
import androidx.fragment.app.C0286s;
import com.bumptech.glide.c;
import com.mtma.criminal.city.R;
import com.mtma.criminal.city.activities.MainActivity;
import d5.o;
import i3.C0590f;
import i3.C0592h;
import j4.p0;

/* renamed from: l4.b  reason: case insensitive filesystem */
public final class C0794b extends C0286s {

    /* renamed from: d0  reason: collision with root package name */
    public final MainActivity f9746d0;

    /* renamed from: e0  reason: collision with root package name */
    public View f9747e0;

    /* renamed from: f0  reason: collision with root package name */
    public TextView f9748f0;

    /* renamed from: g0  reason: collision with root package name */
    public ConstraintLayout f9749g0;

    /* renamed from: h0  reason: collision with root package name */
    public ConstraintLayout f9750h0;

    /* renamed from: i0  reason: collision with root package name */
    public RelativeLayout f9751i0;

    /* renamed from: j0  reason: collision with root package name */
    public RelativeLayout f9752j0;

    /* renamed from: k0  reason: collision with root package name */
    public RelativeLayout f9753k0;

    /* renamed from: l0  reason: collision with root package name */
    public RelativeLayout f9754l0;

    /* renamed from: m0  reason: collision with root package name */
    public RelativeLayout f9755m0;

    /* renamed from: n0  reason: collision with root package name */
    public RelativeLayout f9756n0;

    /* renamed from: o0  reason: collision with root package name */
    public ImageView f9757o0;

    /* renamed from: p0  reason: collision with root package name */
    public ImageView f9758p0;

    /* renamed from: q0  reason: collision with root package name */
    public C0590f f9759q0;

    /* renamed from: r0  reason: collision with root package name */
    public p0 f9760r0;
    public String s0 = "";

    /* renamed from: t0  reason: collision with root package name */
    public boolean f9761t0 = true;

    /* renamed from: u0  reason: collision with root package name */
    public boolean f9762u0 = false;

    /* renamed from: v0  reason: collision with root package name */
    public boolean f9763v0 = false;

    public C0794b(MainActivity mainActivity) {
        this.f9746d0 = mainActivity;
    }

    public static void V(C0794b bVar, C0286s sVar) {
        bVar.getClass();
        if (o.getLocationObject().getCurrentPlace() == 0) {
            C0269a aVar = new C0269a(bVar.p());
            aVar.i(R.id.activity_main_body_frame_layout, sVar);
            aVar.e(false);
            b.N0();
            return;
        }
        c.E0(bVar.f9746d0);
    }

    public final View C(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View inflate = layoutInflater.inflate(R.layout.fragment_bottom_bar, viewGroup, false);
        this.f9747e0 = inflate;
        this.f9749g0 = (ConstraintLayout) inflate.findViewById(R.id.fragment_bottom_bar_main_layout);
        this.f9750h0 = (ConstraintLayout) this.f9747e0.findViewById(R.id.fragment_bottom_bar_city_name_layout);
        this.f9748f0 = (TextView) this.f9747e0.findViewById(R.id.fragment_bottom_bar_city_name);
        this.f9751i0 = (RelativeLayout) this.f9747e0.findViewById(R.id.fragment_bottom_bar_profile_button);
        this.f9752j0 = (RelativeLayout) this.f9747e0.findViewById(R.id.fragment_bottom_bar_store_button);
        this.f9753k0 = (RelativeLayout) this.f9747e0.findViewById(R.id.fragment_bottom_bar_crime_button);
        this.f9754l0 = (RelativeLayout) this.f9747e0.findViewById(R.id.fragment_bottom_bar_news_button);
        this.f9755m0 = (RelativeLayout) this.f9747e0.findViewById(R.id.fragment_bottom_bar_chat_button);
        this.f9756n0 = (RelativeLayout) this.f9747e0.findViewById(R.id.fragment_bottom_bar_shop_button);
        this.f9757o0 = (ImageView) this.f9747e0.findViewById(R.id.fragment_bottom_bar_profile_alert);
        this.f9758p0 = (ImageView) this.f9747e0.findViewById(R.id.fragment_bottom_bar_chat_alert);
        this.f9749g0.startAnimation(AnimationUtils.loadAnimation(this.f9746d0, R.anim.from_bottom_to_position));
        X();
        Y();
        RelativeLayout relativeLayout = this.f9751i0;
        relativeLayout.setOnClickListener(new C0793a(this, relativeLayout, 0));
        RelativeLayout relativeLayout2 = this.f9752j0;
        relativeLayout2.setOnClickListener(new C0793a(this, relativeLayout2, 1));
        RelativeLayout relativeLayout3 = this.f9753k0;
        relativeLayout3.setOnClickListener(new C0793a(this, relativeLayout3, 2));
        RelativeLayout relativeLayout4 = this.f9754l0;
        relativeLayout4.setOnClickListener(new C0793a(this, relativeLayout4, 3));
        RelativeLayout relativeLayout5 = this.f9755m0;
        relativeLayout5.setOnClickListener(new C0793a(this, relativeLayout5, 4));
        RelativeLayout relativeLayout6 = this.f9756n0;
        relativeLayout6.setOnClickListener(new C0793a(this, relativeLayout6, 5));
        return this.f9747e0;
    }

    public final void H() {
        p0 p0Var;
        this.f5157L = true;
        C0590f fVar = this.f9759q0;
        if (fVar != null && (p0Var = this.f9760r0) != null) {
            fVar.u(p0Var);
            this.f9759q0 = null;
            this.f9760r0 = null;
        }
    }

    public final void I() {
        this.f5157L = true;
        if (!this.f9762u0) {
            this.f9761t0 = true;
            this.f9763v0 = false;
            W();
        }
    }

    public final void W() {
        if (!this.f9762u0) {
            this.f9763v0 = false;
            if (this.f9759q0 == null) {
                this.f9759q0 = C0592h.d().e().E(b.a0()).E("chats").E("worldwide");
            }
            if (this.f9760r0 == null) {
                this.f9760r0 = new p0(this, 7);
            }
            this.f9759q0.p(1).b(this.f9760r0);
        }
    }

    public final void X() {
        if (o.getLocationObject().getCurrentCity() != 0) {
            this.f9753k0.setVisibility(4);
            this.f9748f0.setText(I1.b.D(o.getLocationObject().getCurrentCity()));
            this.f9750h0.setVisibility(0);
        } else {
            this.f9753k0.setVisibility(0);
            this.f9750h0.setVisibility(4);
        }
        this.f9749g0.startAnimation(AnimationUtils.loadAnimation(this.f9746d0, R.anim.from_bottom_to_position));
    }

    public final void Y() {
        if (o.getNotificationObject().isHasUnSeenMedal() || o.getNotificationObject().isHasUnSeenContactRequest()) {
            this.f9757o0.setVisibility(0);
        } else {
            this.f9757o0.setVisibility(8);
        }
    }
}
