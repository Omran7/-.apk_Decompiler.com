package x4;

import B4.a;
import G4.b;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.fragment.app.C0286s;
import com.bumptech.glide.d;
import com.mtma.criminal.city.R;
import com.mtma.criminal.city.activities.MainActivity;
import i3.C0592h;
import j4.C0612a;
import j4.p0;
import java.util.ArrayList;

/* renamed from: x4.d  reason: case insensitive filesystem */
public final class C1101d extends C0286s {

    /* renamed from: d0  reason: collision with root package name */
    public final MainActivity f12563d0;

    /* renamed from: e0  reason: collision with root package name */
    public View f12564e0;

    /* renamed from: f0  reason: collision with root package name */
    public ListView f12565f0;

    /* renamed from: g0  reason: collision with root package name */
    public TextView f12566g0;

    /* renamed from: h0  reason: collision with root package name */
    public RelativeLayout f12567h0;

    /* renamed from: i0  reason: collision with root package name */
    public RelativeLayout f12568i0;

    /* renamed from: j0  reason: collision with root package name */
    public final ArrayList f12569j0 = new ArrayList();

    /* renamed from: k0  reason: collision with root package name */
    public C0612a f12570k0;

    /* renamed from: l0  reason: collision with root package name */
    public String f12571l0;

    /* renamed from: m0  reason: collision with root package name */
    public boolean f12572m0 = false;

    /* renamed from: n0  reason: collision with root package name */
    public int f12573n0;

    /* renamed from: o0  reason: collision with root package name */
    public boolean f12574o0;

    /* renamed from: p0  reason: collision with root package name */
    public float f12575p0;

    /* renamed from: q0  reason: collision with root package name */
    public boolean f12576q0 = false;

    public C1101d(MainActivity mainActivity) {
        this.f12563d0 = mainActivity;
    }

    public final View C(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View inflate = layoutInflater.inflate(R.layout.fragment_basic_with_button, viewGroup, false);
        this.f12564e0 = inflate;
        this.f12565f0 = (ListView) inflate.findViewById(R.id.fragment_basic_list_view);
        this.f12566g0 = (TextView) this.f12564e0.findViewById(R.id.fragment_basic_empty_view);
        this.f12567h0 = (RelativeLayout) this.f12564e0.findViewById(R.id.fragment_basic_back_button);
        this.f12568i0 = (RelativeLayout) this.f12564e0.findViewById(R.id.fragment_basic_second_button);
        ((TextView) this.f12564e0.findViewById(R.id.fragment_basic_title)).setText(R.string.title_hospital);
        this.f12566g0.setText(R.string.empty_hospital);
        this.f12568i0.setVisibility(0);
        ((ImageView) this.f12564e0.findViewById(R.id.fragment_basic_second_button_image)).setImageResource(R.drawable.button_restore_health);
        ((TextView) this.f12564e0.findViewById(R.id.fragment_basic_second_button_text)).setText(R.string.button_treat);
        C0612a aVar = new C0612a(this.f12563d0, this.f12569j0, 4);
        this.f12570k0 = aVar;
        this.f12565f0.setAdapter(aVar);
        this.f12565f0.setOnScrollListener(new a(this, 13));
        this.f12565f0.setOnTouchListener(new b(this, 7));
        R2.b.w(true);
        C0592h.b().e().E(R2.b.Z()).E("players").q("locationObject/sortByCityPlaceLastSeen").x(d.r0(), (String) null).o(15).d(new p0(this, 27));
        RelativeLayout relativeLayout = this.f12568i0;
        relativeLayout.setOnClickListener(new C1099b(this, relativeLayout, 0));
        RelativeLayout relativeLayout2 = this.f12567h0;
        relativeLayout2.setOnClickListener(new C1099b(this, relativeLayout2, 1));
        return this.f12564e0;
    }
}
