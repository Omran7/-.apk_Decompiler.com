package Q4;

import B0.C0004c;
import B4.f;
import I1.b;
import Y4.D;
import android.content.Context;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.fragment.app.C0286s;
import com.google.android.gms.dynamite.descriptors.com.google.firebase.auth.ModuleDescriptor;
import com.google.android.gms.internal.p002firebaseauthapi.zzaky;
import com.mtma.criminal.city.R;
import com.mtma.criminal.city.utils.U;
import d5.o;
import j4.Z;
import java.util.ArrayList;

public final class a extends C0286s {

    /* renamed from: d0  reason: collision with root package name */
    public final Context f2434d0;

    /* renamed from: e0  reason: collision with root package name */
    public final int f2435e0;

    /* renamed from: f0  reason: collision with root package name */
    public final int f2436f0;

    /* renamed from: g0  reason: collision with root package name */
    public View f2437g0;

    /* renamed from: h0  reason: collision with root package name */
    public TextView f2438h0;

    /* renamed from: i0  reason: collision with root package name */
    public ListView f2439i0;

    /* renamed from: j0  reason: collision with root package name */
    public TextView f2440j0;

    /* renamed from: k0  reason: collision with root package name */
    public ImageView f2441k0;

    /* renamed from: l0  reason: collision with root package name */
    public LinearLayout f2442l0;

    /* renamed from: m0  reason: collision with root package name */
    public RelativeLayout f2443m0;

    /* renamed from: n0  reason: collision with root package name */
    public Z f2444n0;

    public a(Context context, int i2) {
        this.f2436f0 = 0;
        this.f2434d0 = context;
        this.f2435e0 = i2;
    }

    public final View C(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        int i2;
        ArrayList arrayList;
        D s6;
        int i5;
        int i6 = 0;
        View inflate = layoutInflater.inflate(R.layout.fragment_basic, viewGroup, false);
        this.f2437g0 = inflate;
        this.f2438h0 = (TextView) inflate.findViewById(R.id.fragment_basic_title);
        this.f2439i0 = (ListView) this.f2437g0.findViewById(R.id.fragment_basic_list_view);
        this.f2440j0 = (TextView) this.f2437g0.findViewById(R.id.fragment_basic_bottom_text_view);
        this.f2441k0 = (ImageView) this.f2437g0.findViewById(R.id.fragment_basic_bottom_image);
        this.f2442l0 = (LinearLayout) this.f2437g0.findViewById(R.id.fragment_basic_bottom_text_layout);
        this.f2443m0 = (RelativeLayout) this.f2437g0.findViewById(R.id.fragment_basic_back_button);
        TextView textView = this.f2438h0;
        int i7 = this.f2435e0;
        if (i7 == 0) {
            i2 = R.string.shop_market_buy_gold_title;
        } else if (i7 == 1) {
            i2 = R.string.shop_market_buy_cash_title;
        } else if (i7 == 3) {
            i2 = R.string.shop_market_package_platinum_title;
        } else if (i7 == 4) {
            i2 = R.string.shop_market_package_weapon_title;
        } else if (i7 == 5) {
            i2 = R.string.shop_market_package_default_title;
        } else if (i7 == 2) {
            i2 = R.string.shop_market_convert_cash_title;
        } else if (i7 == 6) {
            i2 = R.string.shop_market_gold_tools_title;
        } else if (i7 == 7) {
            i2 = R.string.shop_market_check_tools_title;
        } else if (i7 == 8) {
            i2 = R.string.market_war;
        } else if (i7 == 9) {
            i2 = R.string.market_upgrade;
        } else if (i7 == 10) {
            i2 = R.string.market_tunnel;
        } else if (i7 == 11) {
            i2 = R.string.market_time_tools;
        } else if (i7 == 12) {
            i2 = R.string.market_gym_tools;
        } else if (i7 == 13) {
            i2 = R.string.market_special_equipment;
        } else if (i7 == 14) {
            i2 = R.string.market_vip;
        } else {
            i2 = -1;
        }
        textView.setText(i2);
        switch (i7) {
            case 3:
                arrayList = new ArrayList();
                com.google.android.gms.internal.measurement.a.s(arrayList, D.s(2058, 0, 1), 2059, 0, 1);
                com.google.android.gms.internal.measurement.a.s(arrayList, D.s(2060, 0, 1), 2061, 0, 1);
                com.google.android.gms.internal.measurement.a.s(arrayList, D.s(2062, 0, 1), 2063, 0, 1);
                com.google.android.gms.internal.measurement.a.s(arrayList, D.s(2064, 0, 1), 2065, 0, 1);
                s6 = D.s(2066, 0, 1);
                i5 = 2067;
                break;
            case 4:
                arrayList = new ArrayList();
                s6 = D.s(2084, 0, 1);
                i5 = 2085;
                break;
            case 5:
                arrayList = new ArrayList();
                com.google.android.gms.internal.measurement.a.s(arrayList, D.s(2070, 0, 1), 2071, 0, 1);
                com.google.android.gms.internal.measurement.a.s(arrayList, D.s(2072, 0, 1), 2073, 0, 1);
                com.google.android.gms.internal.measurement.a.s(arrayList, D.s(2074, 0, 1), 2075, 0, 1);
                com.google.android.gms.internal.measurement.a.s(arrayList, D.s(2076, 0, 1), 2077, 0, 1);
                com.google.android.gms.internal.measurement.a.s(arrayList, D.s(2078, 0, 1), 2079, 0, 1);
                s6 = D.s(2080, 0, 1);
                i5 = 2081;
                break;
            case zzaky.zzf.zzf /*6*/:
                arrayList = new ArrayList();
                com.google.android.gms.internal.measurement.a.s(arrayList, D.s(2001, 0, 1), 2002, 0, 1);
                arrayList.add(D.s(2003, 0, 1));
                arrayList.add(D.s(2004, 0, 1));
                if (o.getLocationObject().getCurrentCity() != 0) {
                    ((D) arrayList.get(arrayList.size() - 1)).f4290B *= 4;
                }
                com.google.android.gms.internal.measurement.a.s(arrayList, D.s(2005, 0, 1), 2006, 0, 1);
                com.google.android.gms.internal.measurement.a.s(arrayList, D.s(2007, 0, 1), 2008, 0, 1);
                arrayList.add(D.s(2009, 0, 1));
                arrayList.add(D.s(2010, 0, 1));
                ((D) arrayList.get(arrayList.size() - 1)).f4290B = b.f0(o.getStockObject().getStockSpace(), 200);
                com.google.android.gms.internal.measurement.a.s(arrayList, D.s(2011, 0, 1), 2012, 0, 1);
                arrayList.add(D.s(2013, 0, 1));
                ((D) arrayList.get(arrayList.size() - 1)).f4290B = (((long) o.getStockObject().getMuseumSpace()) * 100) + 100;
                com.google.android.gms.internal.measurement.a.s(arrayList, D.s(2014, 0, 1), 2015, 0, 1);
                com.google.android.gms.internal.measurement.a.s(arrayList, D.s(2016, 0, 1), 2017, 0, 1);
                com.google.android.gms.internal.measurement.a.s(arrayList, D.s(2020, 0, 1), 2018, 0, 1);
                arrayList.add(D.s(2019, 0, 1));
                break;
            case zzaky.zzf.zzg /*7*/:
                arrayList = new ArrayList();
                com.google.android.gms.internal.measurement.a.s(arrayList, D.s(2001, 0, 1), 2002, 0, 1);
                arrayList.add(D.s(2004, 0, 1));
                if (o.getLocationObject().getCurrentCity() != 0) {
                    ((D) arrayList.get(arrayList.size() - 1)).f4291C *= 4;
                }
                com.google.android.gms.internal.measurement.a.s(arrayList, D.s(2005, 0, 1), 2006, 0, 1);
                com.google.android.gms.internal.measurement.a.s(arrayList, D.s(2007, 0, 1), 2008, 0, 1);
                arrayList.add(D.s(2009, 0, 1));
                arrayList.add(D.s(2010, 0, 1));
                ((D) arrayList.get(arrayList.size() - 1)).f4291C = b.f0(o.getStockObject().getStockSpace(), 2000);
                com.google.android.gms.internal.measurement.a.s(arrayList, D.s(2017, 0, 1), 2020, 0, 1);
                arrayList.add(D.s(2018, 0, 1));
                break;
            case 8:
                arrayList = new ArrayList();
                arrayList.add(D.s(2030, 0, 1));
                break;
            case 9:
                arrayList = new ArrayList();
                s6 = D.s(3002, 0, 1);
                i5 = 3001;
                break;
            case 10:
                arrayList = new ArrayList();
                com.google.android.gms.internal.measurement.a.s(arrayList, D.s(2024, 0, 1), 2025, 0, 1);
                s6 = D.s(2022, 0, 1);
                i5 = 2023;
                break;
            case ModuleDescriptor.MODULE_VERSION /*11*/:
                arrayList = new ArrayList();
                s6 = D.s(2032, 0, 1);
                i5 = 2033;
                break;
            case 12:
                arrayList = new ArrayList();
                com.google.android.gms.internal.measurement.a.s(arrayList, D.s(2034, 0, 1), 2035, 0, 1);
                com.google.android.gms.internal.measurement.a.s(arrayList, D.s(2036, 0, 1), 2037, 0, 1);
                com.google.android.gms.internal.measurement.a.s(arrayList, D.s(2038, 0, 1), 2039, 0, 1);
                com.google.android.gms.internal.measurement.a.s(arrayList, D.s(2040, 0, 1), 2041, 0, 1);
                com.google.android.gms.internal.measurement.a.s(arrayList, D.s(2042, 0, 1), 2043, 0, 1);
                com.google.android.gms.internal.measurement.a.s(arrayList, D.s(2044, 0, 1), 2045, 0, 1);
                com.google.android.gms.internal.measurement.a.s(arrayList, D.s(2046, 0, 1), 2047, 0, 1);
                com.google.android.gms.internal.measurement.a.s(arrayList, D.s(2048, 0, 1), 2049, 0, 1);
                com.google.android.gms.internal.measurement.a.s(arrayList, D.s(2050, 0, 1), 2051, 0, 1);
                com.google.android.gms.internal.measurement.a.s(arrayList, D.s(2052, 0, 1), 2053, 0, 1);
                com.google.android.gms.internal.measurement.a.s(arrayList, D.s(2054, 0, 1), 2055, 0, 1);
                s6 = D.s(2056, 0, 1);
                i5 = 2057;
                break;
            case 13:
                arrayList = new ArrayList();
                com.google.android.gms.internal.measurement.a.s(arrayList, D.s(30005, 0, 1), 30017, 0, 1);
                s6 = D.s(30018, 0, 1);
                i5 = 30019;
                break;
            case 14:
                arrayList = new ArrayList();
                com.google.android.gms.internal.measurement.a.s(arrayList, D.s(2026, 0, 1), 2027, 0, 1);
                s6 = D.s(2028, 0, 1);
                i5 = 2029;
                break;
            default:
                arrayList = null;
                break;
        }
        com.google.android.gms.internal.measurement.a.s(arrayList, s6, i5, 0, 1);
        if (i7 == 7) {
            i6 = 1;
        }
        Z z3 = new Z(this.f2434d0, arrayList, i7, i6);
        this.f2444n0 = z3;
        this.f2439i0.setAdapter(z3);
        if (this.f2436f0 != 0) {
            new Handler().postDelayed(new C0004c((Object) this, 4), 200);
        }
        if (i7 == 7) {
            this.f2441k0.setImageResource(R.drawable.check_icon);
            this.f2440j0.setText(U.a((long) o.getMoneyObject().getCheck()));
            R2.b.c(this.f2442l0, 3);
        }
        RelativeLayout relativeLayout = this.f2443m0;
        relativeLayout.setOnClickListener(new f(this, relativeLayout, 16));
        return this.f2437g0;
    }

    public final void V(int i2) {
        int i5 = 0;
        if (i2 == 2013) {
            while (i5 < this.f2444n0.getCount()) {
                if (((D) this.f2444n0.getItem(i5)).f4293a == 2013) {
                    ((D) this.f2444n0.getItem(i5)).f4290B = (((long) o.getStockObject().getMuseumSpace()) * 100) + 100;
                    this.f2444n0.notifyDataSetChanged();
                    return;
                }
                i5++;
            }
        } else if (i2 == 2010) {
            while (i5 < this.f2444n0.getCount()) {
                if (((D) this.f2444n0.getItem(i5)).f4293a == 2010) {
                    ((D) this.f2444n0.getItem(i5)).f4290B = b.f0(o.getStockObject().getStockSpace(), 200);
                    ((D) this.f2444n0.getItem(i5)).f4291C = b.f0(o.getStockObject().getStockSpace(), 2000);
                    this.f2444n0.notifyDataSetChanged();
                    return;
                }
                i5++;
            }
        }
    }

    public a(int i2, int i5, Context context) {
        this.f2434d0 = context;
        this.f2435e0 = 6;
        this.f2436f0 = i2;
    }
}
