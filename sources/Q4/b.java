package Q4;

import B4.f;
import Y4.C0247d;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.fragment.app.C0286s;
import com.mtma.criminal.city.R;
import j4.C0640p;
import java.util.ArrayList;

public final class b extends C0286s {

    /* renamed from: d0  reason: collision with root package name */
    public final Context f2445d0;

    /* renamed from: e0  reason: collision with root package name */
    public View f2446e0;

    /* renamed from: f0  reason: collision with root package name */
    public TextView f2447f0;

    /* renamed from: g0  reason: collision with root package name */
    public ListView f2448g0;

    /* renamed from: h0  reason: collision with root package name */
    public RelativeLayout f2449h0;

    public b(Context context) {
        this.f2445d0 = context;
    }

    public final View C(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View inflate = layoutInflater.inflate(R.layout.fragment_basic, viewGroup, false);
        this.f2446e0 = inflate;
        this.f2447f0 = (TextView) inflate.findViewById(R.id.fragment_basic_title);
        this.f2448g0 = (ListView) this.f2446e0.findViewById(R.id.fragment_basic_list_view);
        this.f2449h0 = (RelativeLayout) this.f2446e0.findViewById(R.id.fragment_basic_back_button);
        this.f2447f0.setText(R.string.shop_market_title);
        ArrayList arrayList = new ArrayList();
        arrayList.add(new C0247d(R.string.shop_market_buy_gold_title, R.drawable.black_market_gold));
        arrayList.add(new C0247d(R.string.shop_market_buy_cash_title, R.drawable.market_buy_cash));
        arrayList.add(new C0247d(R.string.shop_market_convert_cash_title, R.drawable.market_convert_cash));
        arrayList.add(new C0247d(R.string.shop_market_package_platinum_title, R.drawable.market_package, 0));
        arrayList.add(new C0247d(R.string.shop_market_package_weapon_title, R.drawable.market_package, 0));
        arrayList.add(new C0247d(R.string.shop_market_package_default_title, R.drawable.market_package, 0));
        arrayList.add(new C0247d(R.string.shop_market_gold_tools_title, R.drawable.market_dollar));
        arrayList.add(new C0247d(R.string.shop_market_check_tools_title, R.drawable.black_market_check));
        arrayList.add(new C0247d(R.string.shop_market_war_tools_title, R.drawable.market_war));
        arrayList.add(new C0247d(R.string.market_upgrade, R.drawable.market_upgrade));
        arrayList.add(new C0247d(R.string.market_tunnel, R.drawable.market_tunnel));
        arrayList.add(new C0247d(R.string.market_time_tools, R.drawable.market_time));
        arrayList.add(new C0247d(R.string.market_gym_tools, R.drawable.market_gym));
        arrayList.add(new C0247d(R.string.market_special_equipment, R.drawable.market_special_equipments));
        arrayList.add(new C0247d(R.string.market_vip, R.drawable.market_vip));
        this.f2448g0.setAdapter(new C0640p(this.f2445d0, arrayList, 3, 1, (byte) 0));
        RelativeLayout relativeLayout = this.f2449h0;
        relativeLayout.setOnClickListener(new f(this, relativeLayout, 17));
        return this.f2446e0;
    }
}
