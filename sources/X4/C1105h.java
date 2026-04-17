package x4;

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
import k.C0724m;

/* renamed from: x4.h  reason: case insensitive filesystem */
public final class C1105h extends C0286s {

    /* renamed from: d0  reason: collision with root package name */
    public final Context f12593d0;

    /* renamed from: e0  reason: collision with root package name */
    public View f12594e0;

    /* renamed from: f0  reason: collision with root package name */
    public TextView f12595f0;

    /* renamed from: g0  reason: collision with root package name */
    public TextView f12596g0;

    /* renamed from: h0  reason: collision with root package name */
    public ImageView f12597h0;

    /* renamed from: i0  reason: collision with root package name */
    public RelativeLayout f12598i0;

    /* renamed from: j0  reason: collision with root package name */
    public RelativeLayout f12599j0;

    /* renamed from: k0  reason: collision with root package name */
    public RelativeLayout f12600k0;

    /* renamed from: l0  reason: collision with root package name */
    public RelativeLayout f12601l0;

    /* renamed from: m0  reason: collision with root package name */
    public RelativeLayout f12602m0;

    /* renamed from: n0  reason: collision with root package name */
    public RelativeLayout f12603n0;

    /* renamed from: o0  reason: collision with root package name */
    public long f12604o0;

    /* renamed from: p0  reason: collision with root package name */
    public int f12605p0 = 0;

    /* renamed from: q0  reason: collision with root package name */
    public CountDownTimer f12606q0;

    /* renamed from: r0  reason: collision with root package name */
    public boolean f12607r0 = false;

    public C1105h(Context context) {
        this.f12593d0 = context;
    }

    public static void V(C1105h hVar, C0286s sVar) {
        C0269a aVar = new C0269a(hVar.p());
        aVar.f(R.id.activity_main_body_frame_layout, sVar, (String) null, 1);
        aVar.c();
        aVar.e(false);
        b.N0();
    }

    public final View C(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View inflate = layoutInflater.inflate(R.layout.fragment_patient, viewGroup, false);
        this.f12594e0 = inflate;
        this.f12595f0 = (TextView) inflate.findViewById(R.id.fragment_patient_description);
        this.f12597h0 = (ImageView) this.f12594e0.findViewById(R.id.fragment_patient_phone_alert);
        this.f12598i0 = (RelativeLayout) this.f12594e0.findViewById(R.id.fragment_patient_phone_button);
        this.f12599j0 = (RelativeLayout) this.f12594e0.findViewById(R.id.fragment_patient_skirmishes_button);
        this.f12596g0 = (TextView) this.f12594e0.findViewById(R.id.fragment_patient_time);
        this.f12600k0 = (RelativeLayout) this.f12594e0.findViewById(R.id.fragment_patient_chat_button);
        this.f12601l0 = (RelativeLayout) this.f12594e0.findViewById(R.id.fragment_patient_news_button);
        this.f12602m0 = (RelativeLayout) this.f12594e0.findViewById(R.id.fragment_patient_pharmacy_button);
        this.f12603n0 = (RelativeLayout) this.f12594e0.findViewById(R.id.fragment_patient_shop_button);
        X();
        Y();
        RelativeLayout relativeLayout = this.f12598i0;
        relativeLayout.setOnClickListener(new C1104g(this, relativeLayout, 0));
        RelativeLayout relativeLayout2 = this.f12599j0;
        relativeLayout2.setOnClickListener(new C0509f(relativeLayout2));
        RelativeLayout relativeLayout3 = this.f12600k0;
        relativeLayout3.setOnClickListener(new C1104g(this, relativeLayout3, 1));
        RelativeLayout relativeLayout4 = this.f12601l0;
        relativeLayout4.setOnClickListener(new C1104g(this, relativeLayout4, 2));
        RelativeLayout relativeLayout5 = this.f12602m0;
        relativeLayout5.setOnClickListener(new C1104g(this, relativeLayout5, 3));
        RelativeLayout relativeLayout6 = this.f12603n0;
        relativeLayout6.setOnClickListener(new C1104g(this, relativeLayout6, 4));
        return this.f12594e0;
    }

    public final void H() {
        this.f5157L = true;
        CountDownTimer countDownTimer = this.f12606q0;
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
    }

    public final void W() {
        this.f12595f0.setText(MyApplication.f7090a.getApplicationContext().getString(R.string.patient_description, new Object[]{o.getLocationObject().getReason()}));
        long placeEndTimeInMilli = o.getLocationObject().getPlaceEndTimeInMilli() - (c.f5744o * 1000);
        this.f12604o0 = placeEndTimeInMilli;
        if (placeEndTimeInMilli > 0) {
            b.w(false);
            Z();
            this.f12605p0 = 0;
            b.M0(R.raw.hospital_dripping);
        } else {
            this.f12596g0.setText(e.L("HH:mm:ss", 0));
        }
        this.f12607r0 = true;
    }

    public final void X() {
        b.w(true);
        if (o.getLocationObject().getCurrentPlace() != 1 && c.f5744o == -111) {
            c.s(true, new C1103f(this, 0));
        } else if (o.getLocationObject().getCurrentPlace() != 3) {
            a.v(a.c(C0592h.b().e(), "players"), "locationObject").d(new C0724m(this, 23));
        } else if (c.f5744o == -111) {
            c.s(true, new C1103f(this, 1));
        } else {
            W();
        }
    }

    public final void Y() {
        if (o.getNotificationObject().isHasUnReadNotification() || o.getNotificationObject().isHasUnReadPrivateMessage() || o.getNotificationObject().isHasUnReadSupportMessage()) {
            this.f12597h0.setVisibility(0);
        } else {
            this.f12597h0.setVisibility(8);
        }
    }

    public final void Z() {
        CountDownTimer countDownTimer = this.f12606q0;
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
        if (this.f12604o0 > 0) {
            this.f12606q0 = new I4.c(this, this.f12604o0, 2).start();
        } else {
            this.f12596g0.setText(e.L("HH:mm:ss", 0));
        }
    }
}
