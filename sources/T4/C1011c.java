package t4;

import R2.b;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.fragment.app.C0286s;
import com.mtma.criminal.city.R;
import com.mtma.criminal.city.app.MyApplication;
import i3.C0592h;
import j4.p0;
import k.C0724m;

/* renamed from: t4.c  reason: case insensitive filesystem */
public final class C1011c extends C0286s {

    /* renamed from: d0  reason: collision with root package name */
    public final /* synthetic */ int f11761d0;

    /* renamed from: e0  reason: collision with root package name */
    public final Context f11762e0;

    /* renamed from: f0  reason: collision with root package name */
    public View f11763f0;

    /* renamed from: g0  reason: collision with root package name */
    public TextView f11764g0;

    /* renamed from: h0  reason: collision with root package name */
    public TextView f11765h0;

    /* renamed from: i0  reason: collision with root package name */
    public ImageView f11766i0;

    /* renamed from: j0  reason: collision with root package name */
    public ListView f11767j0;

    /* renamed from: k0  reason: collision with root package name */
    public RelativeLayout f11768k0;

    /* renamed from: l0  reason: collision with root package name */
    public RelativeLayout f11769l0;

    public /* synthetic */ C1011c(Context context, int i2) {
        this.f11761d0 = i2;
        this.f11762e0 = context;
    }

    public final View C(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        switch (this.f11761d0) {
            case 0:
                View inflate = layoutInflater.inflate(R.layout.fragment_estate_sell, viewGroup, false);
                this.f11763f0 = inflate;
                this.f11764g0 = (TextView) inflate.findViewById(R.id.fragment_estate_title);
                this.f11767j0 = (ListView) this.f11763f0.findViewById(R.id.fragment_estate_list_view);
                this.f11765h0 = (TextView) this.f11763f0.findViewById(R.id.fragment_estate_sell_or_rent_button_text);
                this.f11766i0 = (ImageView) this.f11763f0.findViewById(R.id.fragment_estate_sell_or_rent_button_image);
                this.f11768k0 = (RelativeLayout) this.f11763f0.findViewById(R.id.fragment_estate_sell_or_rent_button);
                this.f11769l0 = (RelativeLayout) this.f11763f0.findViewById(R.id.fragment_estate_back_button);
                this.f11764g0.setText(R.string.estate_rent_name);
                this.f11766i0.setImageResource(R.drawable.button_estate_rent);
                this.f11765h0.setText(MyApplication.f7090a.getApplicationContext().getResources().getString(R.string.button_rent));
                b.w(true);
                C0592h.b().e().E(b.Z()).E("estates").E("allEstatesForRent").q("id").d(new C0724m(this, 13));
                RelativeLayout relativeLayout = this.f11768k0;
                relativeLayout.setOnClickListener(new C1010b(this, relativeLayout, 0));
                RelativeLayout relativeLayout2 = this.f11769l0;
                relativeLayout2.setOnClickListener(new C1010b(this, relativeLayout2, 1));
                return this.f11763f0;
            default:
                View inflate2 = layoutInflater.inflate(R.layout.fragment_estate_sell, viewGroup, false);
                this.f11763f0 = inflate2;
                this.f11764g0 = (TextView) inflate2.findViewById(R.id.fragment_estate_title);
                this.f11767j0 = (ListView) this.f11763f0.findViewById(R.id.fragment_estate_list_view);
                this.f11765h0 = (TextView) this.f11763f0.findViewById(R.id.fragment_estate_sell_or_rent_button_text);
                this.f11766i0 = (ImageView) this.f11763f0.findViewById(R.id.fragment_estate_sell_or_rent_button_image);
                this.f11768k0 = (RelativeLayout) this.f11763f0.findViewById(R.id.fragment_estate_sell_or_rent_button);
                this.f11769l0 = (RelativeLayout) this.f11763f0.findViewById(R.id.fragment_estate_back_button);
                this.f11764g0.setText(R.string.estate_second_hand_name);
                this.f11766i0.setImageResource(R.drawable.button_estate_sell);
                this.f11765h0.setText(MyApplication.f7090a.getApplicationContext().getResources().getString(R.string.button_sell));
                b.w(true);
                C0592h.b().e().E(b.Z()).E("estates").E("allEstatesForSell").q("id").d(new p0(this, 19));
                RelativeLayout relativeLayout3 = this.f11768k0;
                relativeLayout3.setOnClickListener(new C1012d(this, relativeLayout3, 0));
                RelativeLayout relativeLayout4 = this.f11769l0;
                relativeLayout4.setOnClickListener(new C1012d(this, relativeLayout4, 1));
                return this.f11763f0;
        }
    }
}
