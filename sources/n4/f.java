package n4;

import K1.e;
import R2.b;
import android.content.Context;
import android.os.CountDownTimer;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.fragment.app.C0269a;
import androidx.fragment.app.C0286s;
import com.bumptech.glide.c;
import com.google.android.gms.internal.measurement.a;
import com.mtma.criminal.city.R;
import d5.o;
import e5.C0509f;
import i3.C0592h;
import j4.p0;

public final class f extends C0286s {

    /* renamed from: d0  reason: collision with root package name */
    public final Context f10375d0;

    /* renamed from: e0  reason: collision with root package name */
    public View f10376e0;

    /* renamed from: f0  reason: collision with root package name */
    public TextView f10377f0;

    /* renamed from: g0  reason: collision with root package name */
    public TextView f10378g0;

    /* renamed from: h0  reason: collision with root package name */
    public TextView f10379h0;

    /* renamed from: i0  reason: collision with root package name */
    public TextView f10380i0;

    /* renamed from: j0  reason: collision with root package name */
    public ImageView f10381j0;

    /* renamed from: k0  reason: collision with root package name */
    public RelativeLayout f10382k0;

    /* renamed from: l0  reason: collision with root package name */
    public RelativeLayout f10383l0;

    /* renamed from: m0  reason: collision with root package name */
    public RelativeLayout f10384m0;

    /* renamed from: n0  reason: collision with root package name */
    public RelativeLayout f10385n0;

    /* renamed from: o0  reason: collision with root package name */
    public RelativeLayout f10386o0;

    /* renamed from: p0  reason: collision with root package name */
    public long f10387p0;

    /* renamed from: q0  reason: collision with root package name */
    public int f10388q0 = 0;

    /* renamed from: r0  reason: collision with root package name */
    public CountDownTimer f10389r0;
    public boolean s0 = false;

    public f(Context context) {
        this.f10375d0 = context;
    }

    public static void V(f fVar, C0286s sVar) {
        C0269a aVar = new C0269a(fVar.p());
        aVar.f(R.id.activity_main_body_frame_layout, sVar, (String) null, 1);
        aVar.e(false);
        b.N0();
    }

    public final View C(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View inflate = layoutInflater.inflate(R.layout.fragment_plane, viewGroup, false);
        this.f10376e0 = inflate;
        this.f10381j0 = (ImageView) inflate.findViewById(R.id.fragment_plane_phone_alert);
        this.f10382k0 = (RelativeLayout) this.f10376e0.findViewById(R.id.fragment_plane_phone_button);
        this.f10383l0 = (RelativeLayout) this.f10376e0.findViewById(R.id.fragment_plane_skirmishes_button);
        this.f10377f0 = (TextView) this.f10376e0.findViewById(R.id.fragment_plane_destination);
        this.f10378g0 = (TextView) this.f10376e0.findViewById(R.id.fragment_plane_time);
        this.f10379h0 = (TextView) this.f10376e0.findViewById(R.id.fragment_plane_temperature);
        this.f10380i0 = (TextView) this.f10376e0.findViewById(R.id.fragment_plane_height);
        this.f10384m0 = (RelativeLayout) this.f10376e0.findViewById(R.id.fragment_plane_chat_button);
        this.f10385n0 = (RelativeLayout) this.f10376e0.findViewById(R.id.fragment_plane_news_button);
        this.f10386o0 = (RelativeLayout) this.f10376e0.findViewById(R.id.fragment_plane_shop_button);
        Y();
        Z();
        RelativeLayout relativeLayout = this.f10382k0;
        relativeLayout.setOnClickListener(new e(this, relativeLayout, 0));
        RelativeLayout relativeLayout2 = this.f10383l0;
        relativeLayout2.setOnClickListener(new C0509f(relativeLayout2));
        RelativeLayout relativeLayout3 = this.f10384m0;
        relativeLayout3.setOnClickListener(new e(this, relativeLayout3, 1));
        RelativeLayout relativeLayout4 = this.f10385n0;
        relativeLayout4.setOnClickListener(new e(this, relativeLayout4, 2));
        RelativeLayout relativeLayout5 = this.f10386o0;
        relativeLayout5.setOnClickListener(new e(this, relativeLayout5, 3));
        return this.f10376e0;
    }

    public final void H() {
        this.f5157L = true;
        CountDownTimer countDownTimer = this.f10389r0;
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
    }

    public final void W() {
        this.f10377f0.setText(I1.b.D(o.getLocationObject().getCurrentCity()));
        long placeEndTimeInMilli = o.getLocationObject().getPlaceEndTimeInMilli() - (c.f5744o * 1000);
        this.f10387p0 = placeEndTimeInMilli;
        if (placeEndTimeInMilli > 0) {
            b.w(false);
            CountDownTimer countDownTimer = this.f10389r0;
            if (countDownTimer != null) {
                countDownTimer.cancel();
            }
            if (this.f10387p0 > 0) {
                this.f10389r0 = new I4.c(this, this.f10387p0, 1).start();
            } else {
                X(0);
            }
            this.f10380i0.setText(R.string.default_plane_height);
            this.f10379h0.setText(R.string.default_plane_temperature);
            this.f10388q0 = 0;
            b.M0(R.raw.plane_take_off);
        } else {
            this.f10378g0.setText(e.L("HH:mm:ss", 0));
        }
        this.s0 = true;
    }

    public final void X(long j6) {
        long j7 = j6 / 1000;
        this.f10378g0.setText(e.L("HH:mm:ss", j7));
        if (j7 % 10 == 0) {
            this.f10380i0.setText(s(R.string.number_with_meter, Integer.valueOf(e.J(8000, 10000))));
        }
        if (j7 % 15 == 0) {
            this.f10379h0.setText(s(R.string.number_with_degree, Integer.valueOf(e.J(-60, -40))));
        }
    }

    public final void Y() {
        b.w(true);
        if (o.getLocationObject().getCurrentPlace() != 3 && c.f5744o == -111) {
            c.s(true, new d(this, 0));
        } else if (o.getLocationObject().getCurrentPlace() != 3) {
            a.v(a.c(C0592h.b().e(), "players"), "locationObject").d(new p0(this, 13));
        } else if (c.f5744o == -111) {
            c.s(true, new d(this, 1));
        } else {
            W();
        }
    }

    public final void Z() {
        if (o.getNotificationObject().isHasUnReadNotification() || o.getNotificationObject().isHasUnReadPrivateMessage() || o.getNotificationObject().isHasUnReadSupportMessage()) {
            this.f10381j0.setVisibility(0);
        } else {
            this.f10381j0.setVisibility(8);
        }
    }
}
