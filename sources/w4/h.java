package W4;

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
import j4.C0640p;
import java.util.ArrayList;

public final class h extends C0286s {

    /* renamed from: d0  reason: collision with root package name */
    public final Context f4118d0;

    /* renamed from: e0  reason: collision with root package name */
    public View f4119e0;

    /* renamed from: f0  reason: collision with root package name */
    public TextView f4120f0;

    /* renamed from: g0  reason: collision with root package name */
    public ListView f4121g0;

    /* renamed from: h0  reason: collision with root package name */
    public RelativeLayout f4122h0;

    public h(Context context) {
        this.f4118d0 = context;
    }

    public final View C(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View inflate = layoutInflater.inflate(R.layout.fragment_basic, viewGroup, false);
        this.f4119e0 = inflate;
        this.f4120f0 = (TextView) inflate.findViewById(R.id.fragment_basic_title);
        this.f4121g0 = (ListView) this.f4119e0.findViewById(R.id.fragment_basic_list_view);
        this.f4122h0 = (RelativeLayout) this.f4119e0.findViewById(R.id.fragment_basic_back_button);
        this.f4120f0.setText(R.string.work_office);
        ArrayList arrayList = new ArrayList();
        arrayList.add(new C0246c(R.string.work_restaurant, R.drawable.work_restaurant));
        arrayList.add(new C0246c(R.string.work_bank, R.drawable.work_bank));
        arrayList.add(new C0246c(R.string.work_cinema, R.drawable.work_cinema));
        arrayList.add(new C0246c(R.string.work_science_lap, R.drawable.work_science_lab_two));
        arrayList.add(new C0246c(R.string.work_camp_army, R.drawable.work_army));
        arrayList.add(new C0246c(R.string.work_hospital, R.drawable.work_hospital));
        arrayList.add(new C0246c(R.string.work_coal_mining, R.drawable.work_coal_mining));
        arrayList.add(new C0246c(R.string.work_freelancer, R.drawable.work_freelancer));
        arrayList.add(new C0246c(R.string.work_school, R.drawable.work_school));
        this.f4121g0.setAdapter(new C0640p(this.f4118d0, arrayList, 9, 0, (byte) 0));
        RelativeLayout relativeLayout = this.f4122h0;
        relativeLayout.setOnClickListener(new f(this, relativeLayout, 20));
        return this.f4119e0;
    }
}
