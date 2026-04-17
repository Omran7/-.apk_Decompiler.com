package u4;

import B4.a;
import G4.b;
import K1.e;
import S3.r;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.fragment.app.C0286s;
import com.mtma.criminal.city.R;
import com.mtma.criminal.city.activities.MainActivity;
import d5.o;
import i3.C0590f;
import i3.C0592h;
import j4.C0626h;
import j4.p0;
import java.util.ArrayList;
import o3.d;

/* renamed from: u4.b  reason: case insensitive filesystem */
public final class C1033b extends C0286s {

    /* renamed from: d0  reason: collision with root package name */
    public final MainActivity f11852d0;

    /* renamed from: e0  reason: collision with root package name */
    public View f11853e0;

    /* renamed from: f0  reason: collision with root package name */
    public TextView f11854f0;

    /* renamed from: g0  reason: collision with root package name */
    public ListView f11855g0;

    /* renamed from: h0  reason: collision with root package name */
    public TextView f11856h0;

    /* renamed from: i0  reason: collision with root package name */
    public TextView f11857i0;

    /* renamed from: j0  reason: collision with root package name */
    public ImageView f11858j0;

    /* renamed from: k0  reason: collision with root package name */
    public RelativeLayout f11859k0;

    /* renamed from: l0  reason: collision with root package name */
    public RelativeLayout f11860l0;

    /* renamed from: m0  reason: collision with root package name */
    public final ArrayList f11861m0 = new ArrayList();

    /* renamed from: n0  reason: collision with root package name */
    public C0626h f11862n0;

    /* renamed from: o0  reason: collision with root package name */
    public String f11863o0;

    /* renamed from: p0  reason: collision with root package name */
    public boolean f11864p0 = false;

    /* renamed from: q0  reason: collision with root package name */
    public boolean f11865q0 = false;

    /* renamed from: r0  reason: collision with root package name */
    public int f11866r0;
    public boolean s0;

    /* renamed from: t0  reason: collision with root package name */
    public float f11867t0;

    public C1033b(MainActivity mainActivity) {
        this.f11852d0 = mainActivity;
    }

    public final View C(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        String str;
        String str2;
        View inflate = layoutInflater.inflate(R.layout.fragment_basic_with_button, viewGroup, false);
        this.f11853e0 = inflate;
        this.f11854f0 = (TextView) inflate.findViewById(R.id.fragment_basic_title);
        this.f11855g0 = (ListView) this.f11853e0.findViewById(R.id.fragment_basic_list_view);
        this.f11856h0 = (TextView) this.f11853e0.findViewById(R.id.fragment_basic_empty_view);
        this.f11860l0 = (RelativeLayout) this.f11853e0.findViewById(R.id.fragment_basic_back_button);
        this.f11859k0 = (RelativeLayout) this.f11853e0.findViewById(R.id.fragment_basic_second_button);
        this.f11858j0 = (ImageView) this.f11853e0.findViewById(R.id.fragment_basic_second_button_image);
        this.f11857i0 = (TextView) this.f11853e0.findViewById(R.id.fragment_basic_second_button_text);
        this.f11854f0.setText(R.string.fight_club_title);
        this.f11856h0.setText(R.string.empty_fight_club);
        this.f11859k0.setVisibility(0);
        this.f11858j0.setImageResource(R.drawable.button_help);
        this.f11857i0.setText(R.string.button_help);
        C0626h hVar = new C0626h(this.f11852d0, this.f11861m0, 5);
        this.f11862n0 = hVar;
        this.f11855g0.setAdapter(hVar);
        this.f11855g0.setOnScrollListener(new a(this, 11));
        this.f11855g0.setOnTouchListener(new b(this, 5));
        R2.b.w(true);
        C0590f c3 = com.google.android.gms.internal.measurement.a.c(C0592h.b().e(), "players");
        if (o.getLocationObject().getCurrentCity() == 0) {
            str = "locationObject/sortByCityPlaceLevelLastSeen";
        } else {
            str = "locationObject/sortByCityPlaceLastSeen";
        }
        r q6 = c3.q(str);
        String d = e.d(2, (long) o.getLocationObject().getCurrentCity());
        if (o.getLocationObject().getCurrentCity() == 0) {
            str2 = d + "." + e.d(2, 0) + "." + e.d(5, (long) (o.getMainStatesObject().getLevel() + 6));
        } else {
            str2 = d.g(d, ".", e.d(2, 1));
        }
        q6.h(str2).p(15).d(new p0(this, 20));
        RelativeLayout relativeLayout = this.f11859k0;
        relativeLayout.setOnClickListener(new C1032a(this, relativeLayout, 0));
        RelativeLayout relativeLayout2 = this.f11860l0;
        relativeLayout2.setOnClickListener(new C1032a(this, relativeLayout2, 1));
        return this.f11853e0;
    }
}
