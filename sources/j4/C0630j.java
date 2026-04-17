package j4;

import I1.b;
import K1.e;
import Y4.w;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.mtma.criminal.city.R;
import com.mtma.criminal.city.activities.MainActivity;
import com.mtma.criminal.city.utils.U;
import java.util.ArrayList;
import java.util.TreeMap;

/* renamed from: j4.j  reason: case insensitive filesystem */
public final class C0630j extends ArrayAdapter {

    /* renamed from: a  reason: collision with root package name */
    public final MainActivity f9031a;

    /* renamed from: b  reason: collision with root package name */
    public final ArrayList f9032b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f9033c = false;

    public C0630j(MainActivity mainActivity, ArrayList arrayList) {
        super(mainActivity, 0, arrayList);
        this.f9031a = mainActivity;
        this.f9032b = arrayList;
    }

    public final View getView(int i2, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = LayoutInflater.from(this.f9031a).inflate(R.layout.item_travel, viewGroup, false);
        }
        ImageView imageView = (ImageView) view.findViewById(R.id.item_travel_background_image);
        TextView textView = (TextView) view.findViewById(R.id.item_travel_destination);
        TextView textView2 = (TextView) view.findViewById(R.id.item_travel_time);
        TextView textView3 = (TextView) view.findViewById(R.id.item_travel_cost);
        RelativeLayout relativeLayout = (RelativeLayout) view.findViewById(R.id.item_travel_travel_button);
        w wVar = (w) getItem(i2);
        if ((i2 & 1) == 0) {
            imageView.setImageResource(R.drawable.plane_middle_light);
        } else {
            imageView.setImageResource(R.drawable.plane_middle_dark);
        }
        textView.setText(b.D(wVar.f4443a));
        textView2.setText(e.L("HH:mm:ss", (long) wVar.f4444b));
        TreeMap treeMap = U.f7378a;
        textView3.setText(wVar.f4445c + " $");
        relativeLayout.setOnClickListener(new C0628i(this, relativeLayout, i2, 0));
        return view;
    }
}
