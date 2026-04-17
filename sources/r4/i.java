package R4;

import A.h;
import K1.e;
import R2.b;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.C0269a;
import androidx.fragment.app.C0286s;
import androidx.fragment.app.I;
import com.mtma.criminal.city.R;
import com.mtma.criminal.city.activities.MainActivity;

public final class i extends C0286s {

    /* renamed from: d0  reason: collision with root package name */
    public final MainActivity f2589d0;

    /* renamed from: e0  reason: collision with root package name */
    public View f2590e0;

    /* renamed from: f0  reason: collision with root package name */
    public TextView f2591f0;

    /* renamed from: g0  reason: collision with root package name */
    public TextView f2592g0;

    /* renamed from: h0  reason: collision with root package name */
    public TextView f2593h0;

    /* renamed from: i0  reason: collision with root package name */
    public TextView f2594i0;

    /* renamed from: j0  reason: collision with root package name */
    public View[] f2595j0;

    /* renamed from: k0  reason: collision with root package name */
    public LinearLayout.LayoutParams f2596k0;

    /* renamed from: l0  reason: collision with root package name */
    public LinearLayout.LayoutParams f2597l0;

    /* renamed from: m0  reason: collision with root package name */
    public int f2598m0 = 2;

    public i(MainActivity mainActivity) {
        this.f2589d0 = mainActivity;
    }

    public final View C(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View inflate = layoutInflater.inflate(R.layout.fragment_store, viewGroup, false);
        this.f2590e0 = inflate;
        this.f2591f0 = (TextView) inflate.findViewById(R.id.fragment_store_museum_button);
        this.f2592g0 = (TextView) this.f2590e0.findViewById(R.id.fragment_store_stall_button);
        this.f2593h0 = (TextView) this.f2590e0.findViewById(R.id.fragment_store_stock_button);
        TextView textView = (TextView) this.f2590e0.findViewById(R.id.fragment_store_bag_button);
        this.f2594i0 = textView;
        this.f2595j0 = new View[]{this.f2591f0, this.f2592g0, this.f2593h0, textView};
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(0, e.m(32.0d));
        this.f2596k0 = layoutParams;
        layoutParams.weight = 1.0f;
        layoutParams.gravity = 80;
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(0, e.m(36.0d));
        this.f2597l0 = layoutParams2;
        layoutParams2.weight = 1.0f;
        this.f2598m0 = 2;
        W();
        V(new g(this.f2589d0), false);
        this.f2591f0.setOnClickListener(new h(this, 0));
        this.f2592g0.setOnClickListener(new h(this, 1));
        this.f2593h0.setOnClickListener(new h(this, 2));
        this.f2594i0.setOnClickListener(new h(this, 3));
        return this.f2590e0;
    }

    public final void V(C0286s sVar, boolean z3) {
        I m6 = m();
        m6.getClass();
        C0269a aVar = new C0269a(m6);
        aVar.i(R.id.fragment_store_frame_layout, sVar);
        aVar.e(false);
        if (z3) {
            b.N0();
        }
    }

    public final void W() {
        int i2 = 0;
        while (true) {
            View[] viewArr = this.f2595j0;
            if (i2 < viewArr.length) {
                int i5 = this.f2598m0;
                MainActivity mainActivity = this.f2589d0;
                if (i2 == i5) {
                    viewArr[i2].setBackground(h.getDrawable(mainActivity, R.drawable.store_button_enabled));
                    this.f2595j0[i2].setLayoutParams(this.f2597l0);
                } else {
                    viewArr[i2].setBackground(h.getDrawable(mainActivity, R.drawable.store_button_disabled));
                    this.f2595j0[i2].setLayoutParams(this.f2596k0);
                }
                i2++;
            } else {
                return;
            }
        }
    }
}
