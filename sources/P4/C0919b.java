package p4;

import I1.b;
import Y4.C0246c;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.fragment.app.C0286s;
import com.mtma.criminal.city.R;
import com.mtma.criminal.city.activities.MainActivity;
import d5.o;
import j4.C0640p;
import j4.C0646w;
import java.util.ArrayList;

/* renamed from: p4.b  reason: case insensitive filesystem */
public final class C0919b extends C0286s {

    /* renamed from: d0  reason: collision with root package name */
    public final /* synthetic */ int f11001d0;

    /* renamed from: e0  reason: collision with root package name */
    public final MainActivity f11002e0;

    /* renamed from: f0  reason: collision with root package name */
    public View f11003f0;

    /* renamed from: g0  reason: collision with root package name */
    public TextView f11004g0;

    /* renamed from: h0  reason: collision with root package name */
    public ListView f11005h0;

    /* renamed from: i0  reason: collision with root package name */
    public RelativeLayout f11006i0;

    public /* synthetic */ C0919b(MainActivity mainActivity, int i2) {
        this.f11001d0 = i2;
        this.f11002e0 = mainActivity;
    }

    public final View C(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        switch (this.f11001d0) {
            case 0:
                View inflate = layoutInflater.inflate(R.layout.fragment_basic, viewGroup, false);
                this.f11003f0 = inflate;
                this.f11004g0 = (TextView) inflate.findViewById(R.id.fragment_basic_title);
                this.f11005h0 = (ListView) this.f11003f0.findViewById(R.id.fragment_basic_list_view);
                this.f11006i0 = (RelativeLayout) this.f11003f0.findViewById(R.id.fragment_basic_back_button);
                this.f11004g0.setText(R.string.black_market_title);
                ArrayList arrayList = new ArrayList();
                arrayList.add(new C0246c(R.string.black_market_gold_name, R.drawable.black_market_gold));
                arrayList.add(new C0246c(R.string.black_market_check_name, R.drawable.black_market_check));
                arrayList.add(new C0246c(R.string.black_market_equipments_name, R.drawable.market_special_equipments));
                arrayList.add(new C0246c(R.string.black_market_plates_name, R.drawable.black_market_food));
                this.f11005h0.setAdapter(new C0640p((Context) this.f11002e0, arrayList, 6, 0, (byte) 0));
                RelativeLayout relativeLayout = this.f11006i0;
                relativeLayout.setOnClickListener(new C0646w(this, relativeLayout, 7));
                return this.f11003f0;
            case 1:
                View inflate2 = layoutInflater.inflate(R.layout.fragment_basic, viewGroup, false);
                this.f11003f0 = inflate2;
                this.f11004g0 = (TextView) inflate2.findViewById(R.id.fragment_basic_title);
                this.f11005h0 = (ListView) this.f11003f0.findViewById(R.id.fragment_basic_list_view);
                this.f11006i0 = (RelativeLayout) this.f11003f0.findViewById(R.id.fragment_basic_back_button);
                this.f11004g0.setText(R.string.estate_title);
                ArrayList arrayList2 = new ArrayList();
                arrayList2.add(new C0246c(R.string.estate_new_name, R.string.estate_new_description, R.drawable.estate_icon));
                arrayList2.add(new C0246c(R.string.estate_second_hand_name, R.string.estate_second_hand_description, R.drawable.estate_icon));
                arrayList2.add(new C0246c(R.string.estate_rent_name, R.string.estate_rent_description, R.drawable.estate_icon));
                arrayList2.add(new C0246c(R.string.estate_own_name, R.string.estate_own_description, R.drawable.estate_icon));
                this.f11005h0.setAdapter(new C0640p((Context) this.f11002e0, arrayList2, 0, 0, (byte) 0));
                RelativeLayout relativeLayout2 = this.f11006i0;
                relativeLayout2.setOnClickListener(new C0646w(this, relativeLayout2, 11));
                return this.f11003f0;
            default:
                View inflate3 = layoutInflater.inflate(R.layout.fragment_basic, viewGroup, false);
                this.f11003f0 = inflate3;
                this.f11004g0 = (TextView) inflate3.findViewById(R.id.fragment_basic_title);
                this.f11005h0 = (ListView) this.f11003f0.findViewById(R.id.fragment_basic_list_view);
                this.f11006i0 = (RelativeLayout) this.f11003f0.findViewById(R.id.fragment_basic_back_button);
                this.f11004g0.setText(R.string.market);
                this.f11005h0.setAdapter(new C0640p((Context) this.f11002e0, b.A(o.getLocationObject().getCurrentCity()), 5, 0, (byte) 0));
                RelativeLayout relativeLayout3 = this.f11006i0;
                relativeLayout3.setOnClickListener(new C0646w(this, relativeLayout3, 19));
                return this.f11003f0;
        }
    }
}
