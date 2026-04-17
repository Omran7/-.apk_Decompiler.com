package O4;

import B0.C0004c;
import android.content.Context;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.fragment.app.C0286s;
import com.bumptech.glide.c;
import com.mtma.criminal.city.R;
import com.mtma.criminal.city.activities.MainActivity;
import j4.C0615b0;

public final class b extends C0286s {

    /* renamed from: d0  reason: collision with root package name */
    public final Context f2112d0;

    /* renamed from: e0  reason: collision with root package name */
    public final int f2113e0;

    /* renamed from: f0  reason: collision with root package name */
    public final boolean f2114f0;

    /* renamed from: g0  reason: collision with root package name */
    public View f2115g0;

    /* renamed from: h0  reason: collision with root package name */
    public TextView f2116h0;

    /* renamed from: i0  reason: collision with root package name */
    public ListView f2117i0;

    /* renamed from: j0  reason: collision with root package name */
    public RelativeLayout f2118j0;

    /* renamed from: k0  reason: collision with root package name */
    public RelativeLayout f2119k0;

    /* renamed from: l0  reason: collision with root package name */
    public ImageView f2120l0;

    /* renamed from: m0  reason: collision with root package name */
    public TextView f2121m0;

    public b(Context context, int i2) {
        this.f2112d0 = context;
        this.f2113e0 = i2;
        this.f2114f0 = false;
    }

    public final View C(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        int i2;
        View inflate = layoutInflater.inflate(R.layout.fragment_basic_with_button, viewGroup, false);
        this.f2115g0 = inflate;
        this.f2116h0 = (TextView) inflate.findViewById(R.id.fragment_basic_title);
        this.f2117i0 = (ListView) this.f2115g0.findViewById(R.id.fragment_basic_list_view);
        this.f2118j0 = (RelativeLayout) this.f2115g0.findViewById(R.id.fragment_basic_back_button);
        this.f2119k0 = (RelativeLayout) this.f2115g0.findViewById(R.id.fragment_basic_second_button);
        this.f2120l0 = (ImageView) this.f2115g0.findViewById(R.id.fragment_basic_second_button_image);
        this.f2121m0 = (TextView) this.f2115g0.findViewById(R.id.fragment_basic_second_button_text);
        TextView textView = this.f2116h0;
        int i5 = this.f2113e0;
        if (i5 == 0) {
            i2 = R.string.school_category_law;
        } else if (i5 == 1) {
            i2 = R.string.school_category_military;
        } else if (i5 == 2) {
            i2 = R.string.school_category_history;
        } else if (i5 == 3) {
            i2 = R.string.school_category_science;
        } else if (i5 != 4) {
            i2 = -1;
        } else {
            i2 = R.string.school_category_gym;
        }
        textView.setText(i2);
        this.f2120l0.setImageResource(R.drawable.button_school_classes);
        this.f2121m0.setText(R.string.classes);
        this.f2117i0.setAdapter(new C0615b0(this.f2112d0, c.Q(i5, true), i5));
        if (i5 == c.w()) {
            new Handler().postDelayed(new C0004c((Object) this, 2), 200);
        }
        if (this.f2114f0) {
            this.f2119k0.setVisibility(0);
        }
        RelativeLayout relativeLayout = this.f2119k0;
        relativeLayout.setOnClickListener(new a(this, relativeLayout, 0));
        RelativeLayout relativeLayout2 = this.f2118j0;
        relativeLayout2.setOnClickListener(new a(this, relativeLayout2, 1));
        return this.f2115g0;
    }

    public b(MainActivity mainActivity) {
        this.f2112d0 = mainActivity;
        this.f2113e0 = c.w();
        this.f2114f0 = true;
    }
}
