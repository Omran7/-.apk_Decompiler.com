package q4;

import I5.u;
import R2.b;
import Y4.t;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.emoji2.text.f;
import androidx.emoji2.text.v;
import androidx.fragment.app.C0286s;
import com.android.billingclient.api.Purchase;
import com.mtma.criminal.city.R;
import com.mtma.criminal.city.utils.U;
import j4.G;
import java.util.ArrayList;
import java.util.TreeMap;
import m0.a0;
import org.json.JSONObject;
import w0.C1054a;
import w0.C1068o;

public final class e extends C0286s {

    /* renamed from: d0  reason: collision with root package name */
    public final Context f11109d0;

    /* renamed from: e0  reason: collision with root package name */
    public final int f11110e0;

    /* renamed from: f0  reason: collision with root package name */
    public View f11111f0;

    /* renamed from: g0  reason: collision with root package name */
    public TextView f11112g0;

    /* renamed from: h0  reason: collision with root package name */
    public ListView f11113h0;

    /* renamed from: i0  reason: collision with root package name */
    public TextView f11114i0;

    /* renamed from: j0  reason: collision with root package name */
    public ImageView f11115j0;

    /* renamed from: k0  reason: collision with root package name */
    public RelativeLayout f11116k0;

    /* renamed from: l0  reason: collision with root package name */
    public RelativeLayout f11117l0;

    /* renamed from: m0  reason: collision with root package name */
    public ArrayList f11118m0;

    /* renamed from: n0  reason: collision with root package name */
    public C1054a f11119n0;

    public e(Context context, int i2) {
        this.f11109d0 = context;
        this.f11110e0 = i2;
    }

    public static void V(e eVar, Purchase purchase) {
        eVar.getClass();
        b.w(true);
        int optInt = purchase.f5723c.optInt("purchaseState", 1);
        JSONObject jSONObject = purchase.f5723c;
        if (optInt != 4) {
            C1054a aVar = eVar.f11119n0;
            String optString = jSONObject.optString("token", jSONObject.optString("purchaseToken"));
            if (optString != null) {
                u uVar = new u();
                uVar.f1280b = optString;
                aVar.a(uVar, new a0(eVar, purchase, 11, false));
                return;
            }
            throw new IllegalArgumentException("Purchase token must be set");
        } else if (jSONObject.optInt("purchaseState", 1) != 4) {
            new Handler(Looper.getMainLooper()).post(new c(eVar, 1));
        } else {
            new Handler(Looper.getMainLooper()).post(new c(eVar, 0));
        }
    }

    public final View C(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C1054a aVar;
        View inflate = layoutInflater.inflate(R.layout.fragment_basic_with_button, viewGroup, false);
        this.f11111f0 = inflate;
        this.f11112g0 = (TextView) inflate.findViewById(R.id.fragment_basic_title);
        this.f11113h0 = (ListView) this.f11111f0.findViewById(R.id.fragment_basic_list_view);
        this.f11116k0 = (RelativeLayout) this.f11111f0.findViewById(R.id.fragment_basic_second_button);
        this.f11117l0 = (RelativeLayout) this.f11111f0.findViewById(R.id.fragment_basic_back_button);
        this.f11115j0 = (ImageView) this.f11111f0.findViewById(R.id.fragment_basic_second_button_image);
        this.f11114i0 = (TextView) this.f11111f0.findViewById(R.id.fragment_basic_second_button_text);
        int i2 = this.f11110e0;
        if (i2 == 1) {
            this.f11112g0.setText(R.string.buy_cash_title);
        } else if (i2 == 0) {
            this.f11112g0.setText(R.string.buy_gold_title);
        } else if (i2 == 2) {
            this.f11112g0.setText(R.string.convert_gold_to_cash_title);
        }
        int i5 = this.f11110e0;
        if (i5 == 0 || i5 == 1) {
            Context context = this.f11109d0;
            f fVar = new f(context);
            fVar.f4928c = new C0937a(this);
            fVar.f4926a = new v(28);
            if (context == null) {
                throw new IllegalArgumentException("Please provide a valid Context.");
            } else if (((C0937a) fVar.f4928c) == null) {
                throw new IllegalArgumentException("Please provide a valid listener for purchases updates.");
            } else if (((v) fVar.f4926a) != null) {
                ((v) fVar.f4926a).getClass();
                if (((C0937a) fVar.f4928c) != null) {
                    v vVar = (v) fVar.f4926a;
                    C0937a aVar2 = (C0937a) fVar.f4928c;
                    if (fVar.a()) {
                        aVar = new C1068o(vVar, context, aVar2);
                    } else {
                        aVar = new C1054a(vVar, context, aVar2);
                    }
                } else {
                    v vVar2 = (v) fVar.f4926a;
                    if (fVar.a()) {
                        aVar = new C1068o(vVar2, context);
                    } else {
                        aVar = new C1054a(vVar2, context);
                    }
                }
                this.f11119n0 = aVar;
                aVar.e(new C0938b(this));
            } else {
                throw new IllegalArgumentException("Pending purchases for one-time products must be supported.");
            }
        } else if (i5 == 2) {
            TreeMap treeMap = U.f7378a;
            ArrayList arrayList = new ArrayList();
            arrayList.add(new t(1, (int) R.drawable.money_buy_cash_1, 20000, "20K"));
            arrayList.add(new t(9, (int) R.drawable.money_buy_cash_2, 200000, "200K"));
            arrayList.add(new t(99, (int) R.drawable.money_buy_cash_3, 2250000, "2.25M"));
            arrayList.add(new t(499, (int) R.drawable.money_buy_cash_4, 12500000, "12.5M"));
            arrayList.add(new t(999, (int) R.drawable.money_buy_cash_5, 30000000, "30M"));
            arrayList.add(new t(4999, (int) R.drawable.money_buy_cash_6, 160000000, "160M"));
            arrayList.add(new t(9999, (int) R.drawable.money_buy_cash_7, 350000000, "350M"));
            arrayList.add(new t(49999, (int) R.drawable.money_buy_cash_8, 2000000000, "2.0B"));
            this.f11118m0 = arrayList;
            this.f11113h0.setAdapter(new G(this.f11109d0, this.f11118m0));
        }
        int i6 = this.f11110e0;
        if (i6 == 0 || i6 == 1) {
            this.f11116k0.setVisibility(0);
            this.f11115j0.setImageResource(R.drawable.button_help);
            this.f11114i0.setText(R.string.button_help);
            RelativeLayout relativeLayout = this.f11116k0;
            relativeLayout.setOnClickListener(new d(this, relativeLayout, 0));
        }
        RelativeLayout relativeLayout2 = this.f11117l0;
        relativeLayout2.setOnClickListener(new d(this, relativeLayout2, 1));
        return this.f11111f0;
    }
}
