package A4;

import R2.b;
import android.content.Context;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
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
import com.mtma.criminal.city.R;
import com.mtma.criminal.city.utils.U;
import i3.C0590f;
import i3.C0592h;
import j4.C0614b;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

public final class j extends C0286s {
    public static Handler X0;

    /* renamed from: Y0  reason: collision with root package name */
    public static a f85Y0;

    /* renamed from: A0  reason: collision with root package name */
    public TextView f86A0;

    /* renamed from: B0  reason: collision with root package name */
    public TextView f87B0;

    /* renamed from: C0  reason: collision with root package name */
    public ImageView f88C0;

    /* renamed from: D0  reason: collision with root package name */
    public ImageView f89D0;

    /* renamed from: E0  reason: collision with root package name */
    public ImageView f90E0;

    /* renamed from: F0  reason: collision with root package name */
    public ImageView f91F0;

    /* renamed from: G0  reason: collision with root package name */
    public ListView f92G0;

    /* renamed from: H0  reason: collision with root package name */
    public final ArrayList f93H0;

    /* renamed from: I0  reason: collision with root package name */
    public C0590f f94I0;

    /* renamed from: J0  reason: collision with root package name */
    public String f95J0;

    /* renamed from: K0  reason: collision with root package name */
    public String f96K0;
    public String L0;

    /* renamed from: M0  reason: collision with root package name */
    public String f97M0;

    /* renamed from: N0  reason: collision with root package name */
    public long f98N0;
    public String O0;

    /* renamed from: P0  reason: collision with root package name */
    public int f99P0;

    /* renamed from: Q0  reason: collision with root package name */
    public int f100Q0;

    /* renamed from: R0  reason: collision with root package name */
    public boolean f101R0;

    /* renamed from: S0  reason: collision with root package name */
    public boolean f102S0;

    /* renamed from: T0  reason: collision with root package name */
    public int f103T0;

    /* renamed from: U0  reason: collision with root package name */
    public int f104U0;

    /* renamed from: V0  reason: collision with root package name */
    public final ArrayList f105V0 = new ArrayList();

    /* renamed from: W0  reason: collision with root package name */
    public boolean f106W0 = false;

    /* renamed from: d0  reason: collision with root package name */
    public final Context f107d0;

    /* renamed from: e0  reason: collision with root package name */
    public View f108e0;

    /* renamed from: f0  reason: collision with root package name */
    public ConstraintLayout f109f0;

    /* renamed from: g0  reason: collision with root package name */
    public ConstraintLayout f110g0;

    /* renamed from: h0  reason: collision with root package name */
    public ConstraintLayout f111h0;

    /* renamed from: i0  reason: collision with root package name */
    public ConstraintLayout f112i0;

    /* renamed from: j0  reason: collision with root package name */
    public ConstraintLayout f113j0;

    /* renamed from: k0  reason: collision with root package name */
    public ConstraintLayout f114k0;

    /* renamed from: l0  reason: collision with root package name */
    public RelativeLayout f115l0;

    /* renamed from: m0  reason: collision with root package name */
    public RelativeLayout f116m0;

    /* renamed from: n0  reason: collision with root package name */
    public TextView f117n0;

    /* renamed from: o0  reason: collision with root package name */
    public TextView f118o0;

    /* renamed from: p0  reason: collision with root package name */
    public TextView f119p0;

    /* renamed from: q0  reason: collision with root package name */
    public TextView f120q0;

    /* renamed from: r0  reason: collision with root package name */
    public TextView f121r0;
    public TextView s0;

    /* renamed from: t0  reason: collision with root package name */
    public TextView f122t0;

    /* renamed from: u0  reason: collision with root package name */
    public TextView f123u0;

    /* renamed from: v0  reason: collision with root package name */
    public TextView f124v0;

    /* renamed from: w0  reason: collision with root package name */
    public TextView f125w0;

    /* renamed from: x0  reason: collision with root package name */
    public TextView f126x0;

    /* renamed from: y0  reason: collision with root package name */
    public TextView f127y0;

    /* renamed from: z0  reason: collision with root package name */
    public TextView f128z0;

    public j(Context context) {
        Boolean bool = Boolean.FALSE;
        this.f93H0 = new ArrayList(Arrays.asList(new Boolean[]{bool, bool, bool}));
        this.f107d0 = context;
    }

    public static void V(j jVar) {
        int i2 = 0;
        while (true) {
            ArrayList arrayList = jVar.f93H0;
            if (i2 >= arrayList.size()) {
                b.w(false);
                try {
                    jVar.f113j0.setVisibility(0);
                    jVar.f117n0.setVisibility(0);
                    if (jVar.f95J0 != null) {
                        jVar.f124v0.setVisibility(8);
                        jVar.f122t0.setText(jVar.s(R.string.text_before_two_dots, jVar.f95J0));
                        jVar.f123u0.setText(jVar.f96K0);
                    } else {
                        jVar.f124v0.setVisibility(0);
                    }
                    jVar.f114k0.setVisibility(0);
                    jVar.f118o0.setVisibility(0);
                    if (jVar.L0 != null) {
                        for (int i5 = 1; i5 < jVar.f114k0.getChildCount(); i5++) {
                            jVar.f114k0.getChildAt(i5).setVisibility(0);
                        }
                        jVar.f87B0.setVisibility(8);
                        jVar.f125w0.setText(jVar.L0);
                        jVar.f126x0.setText(String.valueOf(jVar.f99P0));
                        jVar.f88C0.setImageResource(b.M(jVar.f100Q0));
                        jVar.f127y0.setText(U.a(jVar.f98N0));
                        jVar.f86A0.setText(jVar.f97M0);
                        if (jVar.f101R0) {
                            jVar.f90E0.setVisibility(0);
                            jVar.f89D0.setBackgroundResource(R.drawable.profile_pic_frame_vip);
                        } else {
                            jVar.f90E0.setVisibility(8);
                            jVar.f89D0.setBackgroundResource(R.drawable.profile_pic_frame_default);
                        }
                        if (jVar.f102S0) {
                            jVar.f91F0.setImageResource(R.drawable.online_dote_icon);
                        } else {
                            jVar.f91F0.setImageResource(R.drawable.offline_dote_icon);
                        }
                        I1.b.v(jVar.f89D0, jVar.O0);
                        int i6 = jVar.f104U0;
                        if (i6 == 0) {
                            jVar.f128z0.setText(I1.b.D(jVar.f103T0));
                        } else {
                            jVar.f128z0.setText(c.K(i6));
                        }
                    } else {
                        for (int i7 = 1; i7 < jVar.f114k0.getChildCount(); i7++) {
                            jVar.f114k0.getChildAt(i7).setVisibility(8);
                        }
                        jVar.f87B0.setVisibility(0);
                    }
                    jVar.f92G0.setAdapter(new C0614b(jVar.f107d0, jVar.f105V0, 1));
                    return;
                } catch (Exception e6) {
                    a.q("Exception from try-catch block inside ", "j", " in displayDataOnScreen method.", e6, "j");
                    return;
                }
            } else if (((Boolean) arrayList.get(i2)).booleanValue()) {
                i2++;
            } else {
                return;
            }
        }
    }

    public final View C(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View inflate = layoutInflater.inflate(R.layout.fragment_news, viewGroup, false);
        this.f108e0 = inflate;
        this.f119p0 = (TextView) inflate.findViewById(R.id.fragment_news_server_number);
        this.f120q0 = (TextView) this.f108e0.findViewById(R.id.fragment_news_server_time);
        this.f121r0 = (TextView) this.f108e0.findViewById(R.id.fragment_news_server_date);
        this.s0 = (TextView) this.f108e0.findViewById(R.id.fragment_news_server_day);
        this.f109f0 = (ConstraintLayout) this.f108e0.findViewById(R.id.fragment_news_rank_button);
        this.f110g0 = (ConstraintLayout) this.f108e0.findViewById(R.id.fragment_news_jobs_button);
        this.f111h0 = (ConstraintLayout) this.f108e0.findViewById(R.id.fragment_news_ads_button);
        this.f112i0 = (ConstraintLayout) this.f108e0.findViewById(R.id.fragment_news_guard_button);
        this.f113j0 = (ConstraintLayout) this.f108e0.findViewById(R.id.fragment_news_last_ad_layout);
        this.f114k0 = (ConstraintLayout) this.f108e0.findViewById(R.id.fragment_news_bounty_layout);
        this.f122t0 = (TextView) this.f108e0.findViewById(R.id.fragment_news_last_ad_name);
        this.f123u0 = (TextView) this.f108e0.findViewById(R.id.fragment_news_last_ad_content);
        this.f117n0 = (TextView) this.f108e0.findViewById(R.id.fragment_news_last_ad_word);
        this.f118o0 = (TextView) this.f108e0.findViewById(R.id.fragment_news_bounty_word);
        this.f125w0 = (TextView) this.f108e0.findViewById(R.id.fragment_news_top_bounty_name);
        this.f126x0 = (TextView) this.f108e0.findViewById(R.id.fragment_news_top_bounty_level);
        this.f89D0 = (ImageView) this.f108e0.findViewById(R.id.fragment_news_top_bounty_profile_pic);
        this.f90E0 = (ImageView) this.f108e0.findViewById(R.id.fragment_news_top_bounty_vip_icon);
        this.f91F0 = (ImageView) this.f108e0.findViewById(R.id.fragment_news_top_bounty_online_icon);
        this.f88C0 = (ImageView) this.f108e0.findViewById(R.id.fragment_news_top_bounty_gender);
        this.f127y0 = (TextView) this.f108e0.findViewById(R.id.fragment_news_top_bounty_cost);
        this.f128z0 = (TextView) this.f108e0.findViewById(R.id.fragment_news_top_bounty_place_value);
        this.f86A0 = (TextView) this.f108e0.findViewById(R.id.fragment_news_top_bounty_description_value);
        this.f92G0 = (ListView) this.f108e0.findViewById(R.id.fragment_news_list_view);
        this.f115l0 = (RelativeLayout) this.f108e0.findViewById(R.id.fragment_news_back_button);
        this.f116m0 = (RelativeLayout) this.f108e0.findViewById(R.id.fragment_news_add_ad_button);
        this.f124v0 = (TextView) this.f108e0.findViewById(R.id.fragment_news_ads_empty_view);
        this.f87B0 = (TextView) this.f108e0.findViewById(R.id.fragment_news_bounty_empty_view);
        X0 = new Handler();
        f85Y0 = new a(this, 0);
        this.f94I0 = a.x(C0592h.d().e(), "news");
        b.w(true);
        this.f119p0.setText(s(R.string.server_number, Integer.valueOf(d.v0(1, "server_number"))));
        this.f94I0.E("playerAds").p(1).d(new f(this, 0));
        this.f94I0.E("bounties").p(1).d(new f(this, 1));
        this.f94I0.E("systemAds").q("unixTimeInMilli").p(5).d(new U3.c((Object) this, 3));
        ConstraintLayout constraintLayout = this.f109f0;
        constraintLayout.setOnClickListener(new e(this, constraintLayout, 6));
        ConstraintLayout constraintLayout2 = this.f110g0;
        constraintLayout2.setOnClickListener(new e(this, constraintLayout2, 0));
        ConstraintLayout constraintLayout3 = this.f111h0;
        constraintLayout3.setOnClickListener(new e(this, constraintLayout3, 1));
        this.f113j0.setOnClickListener(new b(this, 0));
        ConstraintLayout constraintLayout4 = this.f112i0;
        constraintLayout4.setOnClickListener(new e(this, constraintLayout4, 2));
        this.f114k0.setOnClickListener(new e(this));
        RelativeLayout relativeLayout = this.f116m0;
        relativeLayout.setOnClickListener(new e(this, relativeLayout, 4));
        RelativeLayout relativeLayout2 = this.f115l0;
        relativeLayout2.setOnClickListener(new e(this, relativeLayout2, 3));
        return this.f108e0;
    }

    public final void H() {
        this.f5157L = true;
        X0.removeCallbacks(f85Y0);
    }

    public final void I() {
        this.f5157L = true;
        X();
    }

    public final void W(C0286s sVar) {
        C0269a aVar = new C0269a(p());
        aVar.f(R.id.activity_main_body_frame_layout, sVar, (String) null, 1);
        aVar.e(false);
        b.N0();
    }

    public final void X() {
        if (c.f5744o != -111) {
            TextView textView = this.f120q0;
            Date date = new Date(c.f5744o * 1000);
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("HH:mm:ss");
            simpleDateFormat.setTimeZone(TimeZone.getTimeZone("GMT"));
            textView.setText(simpleDateFormat.format(date));
            TextView textView2 = this.f121r0;
            Date date2 = new Date(c.f5744o * 1000);
            SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("dd-MM-yyyy");
            simpleDateFormat2.setTimeZone(TimeZone.getTimeZone("GMT"));
            textView2.setText(simpleDateFormat2.format(date2));
            TextView textView3 = this.s0;
            Date date3 = new Date(c.f5744o * 1000);
            SimpleDateFormat simpleDateFormat3 = new SimpleDateFormat("EEEE", new Locale("ar"));
            simpleDateFormat3.setTimeZone(TimeZone.getTimeZone("GMT"));
            textView3.setText(simpleDateFormat3.format(date3));
        }
        X0.postDelayed(f85Y0, 1000);
    }
}
