package C4;

import B4.f;
import K1.e;
import Y4.w;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.fragment.app.C0286s;
import com.google.android.gms.internal.p002firebaseauthapi.zzaky;
import com.mtma.criminal.city.R;
import com.mtma.criminal.city.activities.MainActivity;
import d5.o;
import j4.C0630j;
import java.util.ArrayList;
import n4.C0868a;

public final class a extends C0286s {

    /* renamed from: d0  reason: collision with root package name */
    public final /* synthetic */ int f468d0;

    /* renamed from: e0  reason: collision with root package name */
    public View f469e0;

    /* renamed from: f0  reason: collision with root package name */
    public KeyEvent.Callback f470f0;

    /* renamed from: g0  reason: collision with root package name */
    public View f471g0;

    /* renamed from: h0  reason: collision with root package name */
    public ListView f472h0;

    /* renamed from: i0  reason: collision with root package name */
    public RelativeLayout f473i0;

    public /* synthetic */ a(int i2) {
        this.f468d0 = i2;
    }

    public final View C(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        ArrayList arrayList;
        LayoutInflater layoutInflater2 = layoutInflater;
        ViewGroup viewGroup2 = viewGroup;
        switch (this.f468d0) {
            case 0:
                View inflate = layoutInflater2.inflate(R.layout.fragment_basic, viewGroup2, false);
                this.f469e0 = inflate;
                this.f470f0 = (TextView) inflate.findViewById(R.id.fragment_basic_title);
                this.f472h0 = (ListView) this.f469e0.findViewById(R.id.fragment_basic_list_view);
                this.f471g0 = (TextView) this.f469e0.findViewById(R.id.fragment_basic_empty_view);
                this.f473i0 = (RelativeLayout) this.f469e0.findViewById(R.id.fragment_basic_back_button);
                ((TextView) this.f470f0).setText(R.string.bounty_title);
                ((TextView) this.f471g0).setText(R.string.empty_bounties);
                this.f472h0.setEmptyView((TextView) this.f471g0);
                RelativeLayout relativeLayout = this.f473i0;
                relativeLayout.setOnClickListener(new f(this, relativeLayout, 1));
                return this.f469e0;
            case 1:
                View inflate2 = layoutInflater2.inflate(R.layout.fragment_basic, viewGroup2, false);
                this.f469e0 = inflate2;
                this.f470f0 = (TextView) inflate2.findViewById(R.id.fragment_basic_title);
                this.f472h0 = (ListView) this.f469e0.findViewById(R.id.fragment_basic_list_view);
                this.f471g0 = (TextView) this.f469e0.findViewById(R.id.fragment_basic_empty_view);
                this.f473i0 = (RelativeLayout) this.f469e0.findViewById(R.id.fragment_basic_back_button);
                ((TextView) this.f470f0).setText(R.string.button_gard);
                ((TextView) this.f471g0).setText(R.string.empty_gard);
                this.f472h0.setEmptyView((TextView) this.f471g0);
                RelativeLayout relativeLayout2 = this.f473i0;
                relativeLayout2.setOnClickListener(new f(this, relativeLayout2, 2));
                return this.f469e0;
            default:
                View inflate3 = layoutInflater2.inflate(R.layout.fragment_airport, viewGroup2, false);
                this.f469e0 = inflate3;
                this.f472h0 = (ListView) inflate3.findViewById(R.id.fragment_airport_list_view);
                this.f473i0 = (RelativeLayout) this.f469e0.findViewById(R.id.fragment_airport_map_button);
                this.f471g0 = (RelativeLayout) this.f469e0.findViewById(R.id.fragment_airport_back_button);
                switch (o.getLocationObject().getCurrentCity()) {
                    case 0:
                        arrayList = new ArrayList();
                        arrayList.add(new w(2, e.z(675), 300));
                        arrayList.add(new w(1, e.z(225), 100));
                        arrayList.add(new w(3, e.z(900), 400));
                        arrayList.add(new w(4, e.z(1125), 500));
                        arrayList.add(new w(5, e.z(2250), 1000));
                        break;
                    case 1:
                        arrayList = new ArrayList();
                        arrayList.add(new w(0, e.z(225), 100));
                        arrayList.add(new w(4, e.z(1350), 600));
                        arrayList.add(new w(2, e.z(900), 400));
                        arrayList.add(new w(3, e.z(900), 400));
                        break;
                    case 2:
                        arrayList = new ArrayList();
                        arrayList.add(new w(6, e.z(900), 400));
                        arrayList.add(new w(1, e.z(900), 400));
                        arrayList.add(new w(0, e.z(675), 300));
                        arrayList.add(new w(7, e.z(1800), 800));
                        arrayList.add(new w(8, e.z(2250), 1000));
                        break;
                    case 3:
                        arrayList = new ArrayList();
                        arrayList.add(new w(0, e.z(900), 400));
                        arrayList.add(new w(4, e.z(1800), 800));
                        arrayList.add(new w(1, e.z(900), 400));
                        arrayList.add(new w(7, e.z(1800), 800));
                        break;
                    case 4:
                        arrayList = new ArrayList();
                        arrayList.add(new w(1, e.z(1350), 600));
                        arrayList.add(new w(3, e.z(1800), 800));
                        arrayList.add(new w(0, e.z(1125), 500));
                        break;
                    case 5:
                        arrayList = new ArrayList();
                        arrayList.add(new w(9, e.z(450), 200));
                        arrayList.add(new w(10, e.z(1350), 600));
                        arrayList.add(new w(8, e.z(225), 100));
                        arrayList.add(new w(0, e.z(2250), 1000));
                        break;
                    case zzaky.zzf.zzf /*6*/:
                        arrayList = new ArrayList();
                        arrayList.add(new w(7, e.z(1575), 700));
                        arrayList.add(new w(10, e.z(1575), 700));
                        arrayList.add(new w(2, e.z(900), 400));
                        break;
                    case zzaky.zzf.zzg /*7*/:
                        arrayList = new ArrayList();
                        arrayList.add(new w(6, e.z(1575), 700));
                        arrayList.add(new w(9, e.z(675), 300));
                        arrayList.add(new w(2, e.z(1800), 800));
                        arrayList.add(new w(3, e.z(1800), 800));
                        break;
                    case 8:
                        arrayList = new ArrayList();
                        arrayList.add(new w(2, e.z(2250), 1000));
                        arrayList.add(new w(5, e.z(225), 100));
                        arrayList.add(new w(9, e.z(450), 200));
                        arrayList.add(new w(10, e.z(675), 300));
                        break;
                    case 9:
                        arrayList = new ArrayList();
                        arrayList.add(new w(7, e.z(675), 300));
                        arrayList.add(new w(8, e.z(450), 200));
                        arrayList.add(new w(5, e.z(450), 200));
                        arrayList.add(new w(10, e.z(450), 200));
                        break;
                    case 10:
                        arrayList = new ArrayList();
                        arrayList.add(new w(8, e.z(675), 300));
                        arrayList.add(new w(5, e.z(1350), 600));
                        arrayList.add(new w(9, e.z(450), 200));
                        arrayList.add(new w(6, e.z(1575), 700));
                        break;
                    default:
                        arrayList = null;
                        break;
                }
                this.f472h0.setAdapter(new C0630j((MainActivity) this.f470f0, arrayList));
                RelativeLayout relativeLayout3 = this.f473i0;
                relativeLayout3.setOnClickListener(new C0868a(this, relativeLayout3, 0));
                RelativeLayout relativeLayout4 = (RelativeLayout) this.f471g0;
                relativeLayout4.setOnClickListener(new C0868a(this, relativeLayout4, 1));
                return this.f469e0;
        }
    }

    public a(MainActivity mainActivity) {
        this.f468d0 = 2;
        this.f470f0 = mainActivity;
    }
}
