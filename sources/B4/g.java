package B4;

import R2.b;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.fragment.app.C0286s;
import com.mtma.criminal.city.R;
import i3.C0592h;
import j4.C0614b;
import java.util.ArrayList;

public final class g extends C0286s {

    /* renamed from: d0  reason: collision with root package name */
    public final Context f357d0;

    /* renamed from: e0  reason: collision with root package name */
    public View f358e0;

    /* renamed from: f0  reason: collision with root package name */
    public TextView f359f0;

    /* renamed from: g0  reason: collision with root package name */
    public ListView f360g0;

    /* renamed from: h0  reason: collision with root package name */
    public TextView f361h0;

    /* renamed from: i0  reason: collision with root package name */
    public RelativeLayout f362i0;

    /* renamed from: j0  reason: collision with root package name */
    public final ArrayList f363j0 = new ArrayList();

    /* renamed from: k0  reason: collision with root package name */
    public C0614b f364k0;

    /* renamed from: l0  reason: collision with root package name */
    public String f365l0;

    /* renamed from: m0  reason: collision with root package name */
    public boolean f366m0 = false;

    /* renamed from: n0  reason: collision with root package name */
    public int f367n0;

    /* renamed from: o0  reason: collision with root package name */
    public boolean f368o0;

    /* renamed from: p0  reason: collision with root package name */
    public float f369p0;

    public g(Context context) {
        this.f357d0 = context;
    }

    public final View C(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View inflate = layoutInflater.inflate(R.layout.fragment_basic, viewGroup, false);
        this.f358e0 = inflate;
        this.f359f0 = (TextView) inflate.findViewById(R.id.fragment_basic_title);
        this.f360g0 = (ListView) this.f358e0.findViewById(R.id.fragment_basic_list_view);
        this.f361h0 = (TextView) this.f358e0.findViewById(R.id.fragment_basic_empty_view);
        this.f362i0 = (RelativeLayout) this.f358e0.findViewById(R.id.fragment_basic_back_button);
        this.f359f0.setText(R.string.ads_title);
        this.f361h0.setText(R.string.empty_ads);
        this.f360g0.setOnScrollListener(new a(this, 0));
        this.f360g0.setOnTouchListener(new b(this, 0));
        b.w(true);
        C0592h.d().e().E(b.a0()).E("news").E("playerAds").p(15).d(new e(this, 0));
        RelativeLayout relativeLayout = this.f362i0;
        relativeLayout.setOnClickListener(new f(this, relativeLayout, 0));
        return this.f358e0;
    }
}
