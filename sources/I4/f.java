package I4;

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
import com.mtma.criminal.city.app.MyApplication;
import d5.o;
import e5.C0509f;
import i3.C0592h;
import x1.i;

public final class f extends C0286s {

    /* renamed from: d0  reason: collision with root package name */
    public final Context f1200d0;

    /* renamed from: e0  reason: collision with root package name */
    public View f1201e0;

    /* renamed from: f0  reason: collision with root package name */
    public TextView f1202f0;

    /* renamed from: g0  reason: collision with root package name */
    public TextView f1203g0;

    /* renamed from: h0  reason: collision with root package name */
    public ImageView f1204h0;

    /* renamed from: i0  reason: collision with root package name */
    public RelativeLayout f1205i0;

    /* renamed from: j0  reason: collision with root package name */
    public RelativeLayout f1206j0;

    /* renamed from: k0  reason: collision with root package name */
    public RelativeLayout f1207k0;

    /* renamed from: l0  reason: collision with root package name */
    public RelativeLayout f1208l0;

    /* renamed from: m0  reason: collision with root package name */
    public RelativeLayout f1209m0;

    /* renamed from: n0  reason: collision with root package name */
    public RelativeLayout f1210n0;

    /* renamed from: o0  reason: collision with root package name */
    public RelativeLayout f1211o0;

    /* renamed from: p0  reason: collision with root package name */
    public long f1212p0;

    /* renamed from: q0  reason: collision with root package name */
    public int f1213q0 = 0;

    /* renamed from: r0  reason: collision with root package name */
    public CountDownTimer f1214r0;
    public boolean s0 = false;

    /* renamed from: t0  reason: collision with root package name */
    public boolean f1215t0 = false;

    public f(Context context) {
        this.f1200d0 = context;
    }

    public static void V(f fVar, C0286s sVar) {
        C0269a aVar = new C0269a(fVar.p());
        aVar.f(R.id.activity_main_body_frame_layout, sVar, (String) null, 1);
        aVar.e(false);
        b.N0();
    }

    public final View C(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View inflate = layoutInflater.inflate(R.layout.fragment_jailed, viewGroup, false);
        this.f1201e0 = inflate;
        this.f1202f0 = (TextView) inflate.findViewById(R.id.fragment_jailed_description);
        this.f1204h0 = (ImageView) this.f1201e0.findViewById(R.id.fragment_jailed_phone_alert);
        this.f1205i0 = (RelativeLayout) this.f1201e0.findViewById(R.id.fragment_jailed_phone_button);
        this.f1206j0 = (RelativeLayout) this.f1201e0.findViewById(R.id.fragment_jailed_skirmishes_button);
        this.f1203g0 = (TextView) this.f1201e0.findViewById(R.id.fragment_jailed_time);
        this.f1207k0 = (RelativeLayout) this.f1201e0.findViewById(R.id.fragment_jailed_chat_button);
        this.f1208l0 = (RelativeLayout) this.f1201e0.findViewById(R.id.fragment_jailed_news_button);
        this.f1209m0 = (RelativeLayout) this.f1201e0.findViewById(R.id.fragment_jailed_stock_button);
        this.f1210n0 = (RelativeLayout) this.f1201e0.findViewById(R.id.fragment_jailed_escape_button);
        this.f1211o0 = (RelativeLayout) this.f1201e0.findViewById(R.id.fragment_jailed_shop_button);
        X();
        Y();
        RelativeLayout relativeLayout = this.f1205i0;
        relativeLayout.setOnClickListener(new b(this, relativeLayout, 3));
        RelativeLayout relativeLayout2 = this.f1206j0;
        relativeLayout2.setOnClickListener(new C0509f(relativeLayout2));
        RelativeLayout relativeLayout3 = this.f1207k0;
        relativeLayout3.setOnClickListener(new b(this, relativeLayout3, 4));
        RelativeLayout relativeLayout4 = this.f1208l0;
        relativeLayout4.setOnClickListener(new b(this, relativeLayout4, 5));
        RelativeLayout relativeLayout5 = this.f1209m0;
        relativeLayout5.setOnClickListener(new b(this, relativeLayout5, 0));
        RelativeLayout relativeLayout6 = this.f1211o0;
        relativeLayout6.setOnClickListener(new b(this, relativeLayout6, 2));
        RelativeLayout relativeLayout7 = this.f1210n0;
        relativeLayout7.setOnClickListener(new b(this, relativeLayout7, 1));
        return this.f1201e0;
    }

    public final void H() {
        this.f5157L = true;
        CountDownTimer countDownTimer = this.f1214r0;
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
    }

    public final void W() {
        this.f1202f0.setText(MyApplication.f7090a.getApplicationContext().getString(R.string.prison_description, new Object[]{o.getLocationObject().getReason()}));
        long placeEndTimeInMilli = o.getLocationObject().getPlaceEndTimeInMilli() - (c.f5744o * 1000);
        this.f1212p0 = placeEndTimeInMilli;
        if (placeEndTimeInMilli > 0) {
            b.w(false);
            Z();
            this.f1213q0 = 0;
            b.M0(R.raw.prison_close_door);
        } else {
            this.f1203g0.setText(e.L("HH:mm:ss", 0));
        }
        this.f1215t0 = true;
    }

    public final void X() {
        b.w(true);
        if (o.getLocationObject().getCurrentPlace() != 2 && c.f5744o == -111) {
            c.s(true, new a(this, 0));
        } else if (o.getLocationObject().getCurrentPlace() != 3) {
            a.v(a.c(C0592h.b().e(), "players"), "locationObject").d(new i((Object) this, 15));
        } else if (c.f5744o == -111) {
            c.s(true, new a(this, 1));
        } else {
            W();
        }
    }

    public final void Y() {
        if (o.getNotificationObject().isHasUnReadNotification() || o.getNotificationObject().isHasUnReadPrivateMessage() || o.getNotificationObject().isHasUnReadSupportMessage()) {
            this.f1204h0.setVisibility(0);
        } else {
            this.f1204h0.setVisibility(8);
        }
    }

    public final void Z() {
        CountDownTimer countDownTimer = this.f1214r0;
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
        if (this.f1212p0 > 0) {
            this.f1214r0 = new c(this, this.f1212p0, 0).start();
        } else {
            this.f1203g0.setText(e.L("HH:mm:ss", 0));
        }
    }
}
