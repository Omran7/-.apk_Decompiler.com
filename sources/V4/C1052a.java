package v4;

import K1.e;
import R2.b;
import Y4.D;
import android.content.Context;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.fragment.app.C0286s;
import com.google.android.gms.internal.measurement.a;
import com.mtma.criminal.city.R;
import i3.C0590f;
import i3.C0592h;
import j4.C0626h;
import j4.C0646w;
import j4.p0;
import java.util.ArrayList;
import k.C0737s0;

/* renamed from: v4.a  reason: case insensitive filesystem */
public final class C1052a extends C0286s {

    /* renamed from: v0  reason: collision with root package name */
    public static final /* synthetic */ int f12314v0 = 0;

    /* renamed from: d0  reason: collision with root package name */
    public final Context f12315d0;

    /* renamed from: e0  reason: collision with root package name */
    public final int f12316e0;

    /* renamed from: f0  reason: collision with root package name */
    public final int f12317f0;

    /* renamed from: g0  reason: collision with root package name */
    public View f12318g0;

    /* renamed from: h0  reason: collision with root package name */
    public TextView f12319h0;

    /* renamed from: i0  reason: collision with root package name */
    public ListView f12320i0;

    /* renamed from: j0  reason: collision with root package name */
    public TextView f12321j0;

    /* renamed from: k0  reason: collision with root package name */
    public RelativeLayout f12322k0;

    /* renamed from: l0  reason: collision with root package name */
    public final ArrayList f12323l0 = new ArrayList();

    /* renamed from: m0  reason: collision with root package name */
    public final ArrayList f12324m0 = new ArrayList();

    /* renamed from: n0  reason: collision with root package name */
    public final ArrayList f12325n0 = new ArrayList();

    /* renamed from: o0  reason: collision with root package name */
    public C0626h f12326o0;

    /* renamed from: p0  reason: collision with root package name */
    public String f12327p0;

    /* renamed from: q0  reason: collision with root package name */
    public boolean f12328q0 = false;

    /* renamed from: r0  reason: collision with root package name */
    public int f12329r0;
    public boolean s0;

    /* renamed from: t0  reason: collision with root package name */
    public float f12330t0;

    /* renamed from: u0  reason: collision with root package name */
    public C0590f f12331u0;

    public C1052a(int i2, int i5, Context context) {
        this.f12315d0 = context;
        this.f12316e0 = i2;
        this.f12317f0 = i5;
    }

    public static void V(C1052a aVar) {
        int i2 = 0;
        while (true) {
            ArrayList arrayList = aVar.f12324m0;
            if (i2 >= arrayList.size()) {
                int i5 = 0;
                while (i5 < arrayList.size()) {
                    if (arrayList.get(i5) == null) {
                        arrayList.remove(i5);
                        i5--;
                    }
                    i5++;
                }
                ArrayList arrayList2 = aVar.f12323l0;
                arrayList2.size();
                arrayList2.addAll(arrayList);
                aVar.f12326o0.notifyDataSetChanged();
                aVar.f12320i0.setEmptyView(aVar.f12321j0);
                b.w(false);
                return;
            } else if (arrayList.get(i2) != null || aVar.f12325n0.contains(Integer.valueOf(i2))) {
                i2++;
            } else {
                new Handler().postDelayed(new C0737s0(aVar, 14), 250);
                return;
            }
        }
    }

    public final View C(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View inflate = layoutInflater.inflate(R.layout.fragment_basic, viewGroup, false);
        this.f12318g0 = inflate;
        this.f12319h0 = (TextView) inflate.findViewById(R.id.fragment_basic_title);
        this.f12320i0 = (ListView) this.f12318g0.findViewById(R.id.fragment_basic_list_view);
        this.f12321j0 = (TextView) this.f12318g0.findViewById(R.id.fragment_basic_empty_view);
        this.f12322k0 = (RelativeLayout) this.f12318g0.findViewById(R.id.fragment_basic_back_button);
        C0590f E6 = a.c(C0592h.b().e(), "gangMarket").E(e.y(this.f12316e0));
        int i2 = this.f12317f0;
        this.f12331u0 = E6.E(e.x(i2, 0));
        this.f12319h0.setText(D.s(i2, 0, 1).f4295c);
        this.f12321j0.setText(R.string.empty_gang_market);
        C0626h hVar = new C0626h(this.f12315d0, this.f12323l0, 2);
        this.f12326o0 = hVar;
        this.f12320i0.setAdapter(hVar);
        this.f12320i0.setOnScrollListener(new B4.a(this, 12));
        this.f12320i0.setOnTouchListener(new B4.b(this, 7));
        b.w(true);
        this.f12331u0.E("level-0").r().o(15).d(new p0(this, 22));
        RelativeLayout relativeLayout = this.f12322k0;
        relativeLayout.setOnClickListener(new C0646w(this, relativeLayout, 16));
        return this.f12318g0;
    }
}
