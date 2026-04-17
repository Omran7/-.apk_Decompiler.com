package s4;

import R2.b;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.fragment.app.C0286s;
import com.google.android.gms.internal.measurement.a;
import com.mtma.criminal.city.R;
import com.mtma.criminal.city.activities.MainActivity;
import com.mtma.criminal.city.app.MyApplication;
import com.mtma.criminal.city.utils.U;
import d5.o;
import i3.C0592h;
import j4.C0641q;
import j4.C0646w;
import j4.p0;

/* renamed from: s4.c  reason: case insensitive filesystem */
public final class C0974c extends C0286s {

    /* renamed from: d0  reason: collision with root package name */
    public final MainActivity f11558d0;

    /* renamed from: e0  reason: collision with root package name */
    public View f11559e0;

    /* renamed from: f0  reason: collision with root package name */
    public TextView f11560f0;

    /* renamed from: g0  reason: collision with root package name */
    public ListView f11561g0;

    /* renamed from: h0  reason: collision with root package name */
    public TextView f11562h0;

    /* renamed from: i0  reason: collision with root package name */
    public ImageView f11563i0;

    /* renamed from: j0  reason: collision with root package name */
    public LinearLayout f11564j0;

    /* renamed from: k0  reason: collision with root package name */
    public RelativeLayout f11565k0;

    public C0974c(MainActivity mainActivity) {
        this.f11558d0 = mainActivity;
    }

    public final View C(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View inflate = layoutInflater.inflate(R.layout.fragment_basic, viewGroup, false);
        this.f11559e0 = inflate;
        this.f11560f0 = (TextView) inflate.findViewById(R.id.fragment_basic_title);
        this.f11561g0 = (ListView) this.f11559e0.findViewById(R.id.fragment_basic_list_view);
        this.f11562h0 = (TextView) this.f11559e0.findViewById(R.id.fragment_basic_bottom_text_view);
        this.f11563i0 = (ImageView) this.f11559e0.findViewById(R.id.fragment_basic_bottom_image);
        this.f11564j0 = (LinearLayout) this.f11559e0.findViewById(R.id.fragment_basic_bottom_text_layout);
        this.f11565k0 = (RelativeLayout) this.f11559e0.findViewById(R.id.fragment_basic_back_button);
        if (o.getCrimeObject() == null) {
            b.w(true);
            a.v(a.x(C0592h.d().e(), "players"), "crimeObject").d(new p0(this, 16));
        } else {
            V();
        }
        RelativeLayout relativeLayout = this.f11565k0;
        relativeLayout.setOnClickListener(new C0646w(this, relativeLayout, 9));
        return this.f11559e0;
    }

    public final void V() {
        this.f11560f0.setText(R.string.crime);
        long Y3 = android.support.v4.media.session.a.Y(o.getCrimeObject().getLastOpenedCrimeType() + 1);
        if (Y3 > 0) {
            this.f11564j0.setVisibility(0);
            this.f11563i0.setImageResource(R.drawable.check_icon);
            this.f11562h0.setText(MyApplication.f7090a.getApplicationContext().getString(R.string.open_next_crime_and_get_reward, new Object[]{U.a(Y3)}));
            this.f11562h0.setTextSize(2, 12.0f);
        } else {
            this.f11564j0.setVisibility(8);
        }
        this.f11561g0.setAdapter(new C0641q(this.f11558d0, android.support.v4.media.session.a.w(), o.getCrimeObject().getLastOpenedCrimeType()));
    }
}
