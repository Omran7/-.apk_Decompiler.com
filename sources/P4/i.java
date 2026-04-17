package P4;

import A4.a;
import R2.b;
import Y4.h;
import android.content.Context;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.fragment.app.C0286s;
import com.bumptech.glide.c;
import com.mtma.criminal.city.R;
import com.mtma.criminal.city.activities.MainActivity;
import com.mtma.criminal.city.utils.U;
import d5.o;
import j4.C0612a;
import j4.C0646w;
import j4.H;
import j4.p0;
import java.util.ArrayList;
import q4.f;

public final class i extends C0286s {

    /* renamed from: l0  reason: collision with root package name */
    public static final /* synthetic */ int f2221l0 = 0;

    /* renamed from: m0  reason: collision with root package name */
    public static Handler f2222m0;

    /* renamed from: n0  reason: collision with root package name */
    public static a f2223n0;

    /* renamed from: d0  reason: collision with root package name */
    public final /* synthetic */ int f2224d0;

    /* renamed from: e0  reason: collision with root package name */
    public View f2225e0;

    /* renamed from: f0  reason: collision with root package name */
    public TextView f2226f0;

    /* renamed from: g0  reason: collision with root package name */
    public RelativeLayout f2227g0;

    /* renamed from: h0  reason: collision with root package name */
    public final Context f2228h0;

    /* renamed from: i0  reason: collision with root package name */
    public Object f2229i0;

    /* renamed from: j0  reason: collision with root package name */
    public View f2230j0;

    /* renamed from: k0  reason: collision with root package name */
    public Object f2231k0;

    public /* synthetic */ i(Context context, int i2) {
        this.f2224d0 = i2;
        this.f2228h0 = context;
    }

    public final View C(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        switch (this.f2224d0) {
            case 0:
                View inflate = layoutInflater.inflate(R.layout.fragment_invite, viewGroup, false);
                this.f2225e0 = inflate;
                this.f2226f0 = (TextView) inflate.findViewById(R.id.fragment_invite_code_value);
                this.f2229i0 = (ImageView) this.f2225e0.findViewById(R.id.fragment_invite_copy_button);
                this.f2227g0 = (RelativeLayout) this.f2225e0.findViewById(R.id.fragment_invite_share_button);
                this.f2230j0 = (RelativeLayout) this.f2225e0.findViewById(R.id.fragment_invite_invited_players_button);
                this.f2231k0 = (RelativeLayout) this.f2225e0.findViewById(R.id.fragment_invite_back_button);
                this.f2226f0.setText(o.getAccountObject().getId());
                ImageView imageView = (ImageView) this.f2229i0;
                imageView.setOnClickListener(new h(this, imageView, 0));
                RelativeLayout relativeLayout = this.f2227g0;
                relativeLayout.setOnClickListener(new h(this, relativeLayout, 1));
                RelativeLayout relativeLayout2 = (RelativeLayout) this.f2230j0;
                relativeLayout2.setOnClickListener(new h(this, relativeLayout2, 2));
                RelativeLayout relativeLayout3 = (RelativeLayout) this.f2231k0;
                relativeLayout3.setOnClickListener(new h(this, relativeLayout3, 3));
                return this.f2225e0;
            case 1:
                View inflate2 = layoutInflater.inflate(R.layout.fragment_activities, viewGroup, false);
                this.f2225e0 = inflate2;
                this.f2229i0 = (ListView) inflate2.findViewById(R.id.fragment_activities_list_view);
                this.f2226f0 = (TextView) this.f2225e0.findViewById(R.id.fragment_activities_empty_view);
                this.f2227g0 = (RelativeLayout) this.f2225e0.findViewById(R.id.fragment_activities_back_button);
                this.f2230j0 = (TextView) this.f2225e0.findViewById(R.id.fragment_activities_time_and_date);
                f2222m0 = new Handler();
                f2223n0 = new a(this, 16);
                com.google.android.gms.internal.measurement.a.e(true).E(b.Z()).E("activities").q("startTimeInMilli").d(new p0(this, 10));
                RelativeLayout relativeLayout4 = this.f2227g0;
                relativeLayout4.setOnClickListener(new C0646w(this, relativeLayout4, 3));
                return this.f2225e0;
            case 2:
                View inflate3 = layoutInflater.inflate(R.layout.fragment_gift_buy_gold, viewGroup, false);
                this.f2225e0 = inflate3;
                this.f2226f0 = (TextView) inflate3.findViewById(R.id.fragment_first_buy_gold_title);
                this.f2229i0 = (TextView) this.f2225e0.findViewById(R.id.fragment_first_buy_gold_description);
                this.f2231k0 = (ListView) this.f2225e0.findViewById(R.id.fragment_first_buy_gold_list_view);
                this.f2227g0 = (RelativeLayout) this.f2225e0.findViewById(R.id.fragment_first_buy_gold_buy_button);
                this.f2230j0 = (RelativeLayout) this.f2225e0.findViewById(R.id.fragment_first_buy_gold_back_button);
                this.f2226f0.setText(R.string.gift_first_buy_gold_title);
                ((TextView) this.f2229i0).setText(R.string.gift_first_buy_gold_description);
                ((ListView) this.f2231k0).setAdapter(new C0612a((MainActivity) this.f2228h0, U.e(), 1));
                RelativeLayout relativeLayout5 = this.f2227g0;
                relativeLayout5.setOnClickListener(new f(this, relativeLayout5, 0));
                RelativeLayout relativeLayout6 = (RelativeLayout) this.f2230j0;
                relativeLayout6.setOnClickListener(new f(this, relativeLayout6, 1));
                return this.f2225e0;
            default:
                View inflate4 = layoutInflater.inflate(R.layout.fragment_basic, viewGroup, false);
                this.f2225e0 = inflate4;
                this.f2226f0 = (TextView) inflate4.findViewById(R.id.fragment_basic_title);
                this.f2231k0 = (ListView) this.f2225e0.findViewById(R.id.fragment_basic_list_view);
                this.f2230j0 = (TextView) this.f2225e0.findViewById(R.id.fragment_basic_empty_view);
                this.f2227g0 = (RelativeLayout) this.f2225e0.findViewById(R.id.fragment_basic_back_button);
                this.f2226f0.setText(R.string.estate_new_name);
                h hVar = (h) this.f2229i0;
                ((ListView) this.f2231k0).setAdapter(new H(this.f2228h0, hVar.f4364n, hVar.f4356c, hVar.f4354a));
                ((TextView) this.f2230j0).setText(R.string.no_modification_for_estate);
                ((ListView) this.f2231k0).setEmptyView((TextView) this.f2230j0);
                RelativeLayout relativeLayout7 = this.f2227g0;
                relativeLayout7.setOnClickListener(new C0646w(this, relativeLayout7, 12));
                return this.f2225e0;
        }
    }

    public void H() {
        switch (this.f2224d0) {
            case 1:
                this.f5157L = true;
                f2222m0.removeCallbacks(f2223n0);
                return;
            default:
                super.H();
                return;
        }
    }

    public void I() {
        switch (this.f2224d0) {
            case 1:
                this.f5157L = true;
                if (c.f5744o != -111) {
                    ((TextView) this.f2230j0).setText(c.v());
                }
                f2222m0.postDelayed(f2223n0, 1000);
                return;
            default:
                super.I();
                return;
        }
    }

    public i(Context context, h hVar) {
        this.f2224d0 = 3;
        this.f2228h0 = context;
        this.f2229i0 = hVar;
    }

    public i(MainActivity mainActivity) {
        this.f2224d0 = 1;
        this.f2231k0 = new ArrayList();
        this.f2228h0 = mainActivity;
    }
}
