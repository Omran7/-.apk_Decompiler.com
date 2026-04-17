package m4;

import R2.b;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.fragment.app.C0286s;
import com.google.android.gms.internal.measurement.a;
import com.mtma.criminal.city.R;
import com.mtma.criminal.city.activities.MainActivity;
import com.mtma.criminal.city.app.MyApplication;
import i3.C0592h;
import j4.C0646w;
import j4.n0;
import java.util.ArrayList;
import k.C0724m;

/* renamed from: m4.c  reason: case insensitive filesystem */
public final class C0841c extends C0286s {

    /* renamed from: d0  reason: collision with root package name */
    public final MainActivity f10184d0;

    /* renamed from: e0  reason: collision with root package name */
    public final int f10185e0;

    /* renamed from: f0  reason: collision with root package name */
    public View f10186f0;

    /* renamed from: g0  reason: collision with root package name */
    public TextView f10187g0;

    /* renamed from: h0  reason: collision with root package name */
    public ListView f10188h0;

    /* renamed from: i0  reason: collision with root package name */
    public TextView f10189i0;

    /* renamed from: j0  reason: collision with root package name */
    public RelativeLayout f10190j0;

    /* renamed from: k0  reason: collision with root package name */
    public final ArrayList f10191k0 = new ArrayList();

    /* renamed from: l0  reason: collision with root package name */
    public n0 f10192l0;

    public C0841c(MainActivity mainActivity, int i2) {
        this.f10184d0 = mainActivity;
        this.f10185e0 = i2;
    }

    public final View C(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View inflate = layoutInflater.inflate(R.layout.fragment_basic, viewGroup, false);
        this.f10186f0 = inflate;
        this.f10187g0 = (TextView) inflate.findViewById(R.id.fragment_basic_title);
        this.f10188h0 = (ListView) this.f10186f0.findViewById(R.id.fragment_basic_list_view);
        this.f10189i0 = (TextView) this.f10186f0.findViewById(R.id.fragment_basic_empty_view);
        this.f10190j0 = (RelativeLayout) this.f10186f0.findViewById(R.id.fragment_basic_back_button);
        int i2 = this.f10185e0;
        if (i2 == 1) {
            b.w(true);
            this.f10187g0.setText(MyApplication.f7090a.getApplicationContext().getString(R.string.activity_rank));
            a.x(C0592h.d().e(), "activitiesTempData").E(I1.b.y(i2)).q("goldBullion").p(10).d(new C0724m(this, 6));
        }
        RelativeLayout relativeLayout = this.f10190j0;
        relativeLayout.setOnClickListener(new C0646w(this, relativeLayout, 4));
        return this.f10186f0;
    }
}
