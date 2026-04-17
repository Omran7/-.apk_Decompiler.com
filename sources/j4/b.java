package J4;

import B4.f;
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
import com.mtma.criminal.city.utils.b0;
import j4.C0640p;
import java.util.ArrayList;

public final class b extends C0286s {

    /* renamed from: d0  reason: collision with root package name */
    public final Context f1337d0;

    /* renamed from: e0  reason: collision with root package name */
    public View f1338e0;

    /* renamed from: f0  reason: collision with root package name */
    public TextView f1339f0;

    /* renamed from: g0  reason: collision with root package name */
    public ListView f1340g0;

    /* renamed from: h0  reason: collision with root package name */
    public RelativeLayout f1341h0;

    public b(Context context) {
        this.f1337d0 = context;
    }

    public final View C(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View inflate = layoutInflater.inflate(R.layout.fragment_basic, viewGroup, false);
        this.f1338e0 = inflate;
        this.f1339f0 = (TextView) inflate.findViewById(R.id.fragment_basic_title);
        this.f1340g0 = (ListView) this.f1338e0.findViewById(R.id.fragment_basic_list_view);
        this.f1341h0 = (RelativeLayout) this.f1338e0.findViewById(R.id.fragment_basic_back_button);
        this.f1339f0.setText(R.string.prize_rewards_title);
        ArrayList arrayList = b0.f7394a;
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(new C0246c((int) R.string.prize_level_rewards_name, (int) R.string.prize_level_rewards_description, (int) R.drawable.prize_icon, b0.a()));
        this.f1340g0.setAdapter(new C0640p(this.f1337d0, arrayList2, 3, 0, (byte) 0));
        RelativeLayout relativeLayout = this.f1341h0;
        relativeLayout.setOnClickListener(new f(this, relativeLayout, 10));
        return this.f1338e0;
    }
}
