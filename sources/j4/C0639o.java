package j4;

import B4.f;
import K1.e;
import L4.d;
import Y4.C0246c;
import Y4.D;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.mtma.criminal.city.R;
import com.mtma.criminal.city.app.MyApplication;
import com.mtma.criminal.city.utils.U;
import java.util.ArrayList;

/* renamed from: j4.o  reason: case insensitive filesystem */
public final class C0639o extends ArrayAdapter {

    /* renamed from: e  reason: collision with root package name */
    public static final /* synthetic */ int f9064e = 0;

    /* renamed from: a  reason: collision with root package name */
    public final Context f9065a;

    /* renamed from: b  reason: collision with root package name */
    public final d f9066b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f9067c = false;
    public boolean d = false;

    public C0639o(Context context, ArrayList arrayList, d dVar) {
        super(context, 0, arrayList);
        this.f9065a = context;
        this.f9066b = dVar;
    }

    public final View getView(int i2, View view, ViewGroup viewGroup) {
        View view2;
        Context context = this.f9065a;
        if (view == null) {
            view2 = LayoutInflater.from(context).inflate(R.layout.item_arming, viewGroup, false);
        } else {
            view2 = view;
        }
        ConstraintLayout constraintLayout = (ConstraintLayout) view2.findViewById(R.id.item_arming_level_layout);
        TextView textView = (TextView) view2.findViewById(R.id.item_arming_level);
        TextView textView2 = (TextView) view2.findViewById(R.id.item_arming_type_value);
        TextView textView3 = (TextView) view2.findViewById(R.id.item_arming_damage_name);
        RelativeLayout relativeLayout = (RelativeLayout) view2.findViewById(R.id.item_arming_sell_button);
        TextView textView4 = (TextView) view2.findViewById(R.id.item_arming_damage_value);
        TextView textView5 = (TextView) view2.findViewById(R.id.item_arming_accuracy_name);
        RelativeLayout relativeLayout2 = (RelativeLayout) view2.findViewById(R.id.item_arming_use_button);
        TextView textView6 = (TextView) view2.findViewById(R.id.item_arming_accuracy_value);
        ImageView imageView = (ImageView) view2.findViewById(R.id.item_arming_sell_button_image);
        TextView textView7 = (TextView) view2.findViewById(R.id.item_arming_happiness);
        TextView textView8 = (TextView) view2.findViewById(R.id.item_arming_sell_button_text);
        ImageView imageView2 = (ImageView) view2.findViewById(R.id.item_arming_happiness_image);
        ImageView imageView3 = (ImageView) view2.findViewById(R.id.item_arming_use_button_image);
        GridView gridView = (GridView) view2.findViewById(R.id.item_arming_grid_view);
        View view3 = view2;
        D d6 = (D) getItem(i2);
        Context context2 = context;
        ((TextView) view2.findViewById(R.id.item_arming_name)).setText(d6.f4295c);
        ((ImageView) view2.findViewById(R.id.item_arming_image)).setImageResource(d6.d);
        ((TextView) view2.findViewById(R.id.item_arming_count)).setText(e.l0(d6.h));
        ((TextView) view2.findViewById(R.id.item_arming_cost)).setText(U.a(d6.f4297f / 2));
        if (d6.f4298i == 0) {
            constraintLayout.setVisibility(8);
        } else {
            constraintLayout.setVisibility(0);
            textView.setText(String.valueOf(d6.f4298i));
        }
        boolean z3 = d6.f4306q;
        if (z3 && d6.f4307r) {
            textView3.setVisibility(0);
            textView4.setVisibility(0);
            textView5.setVisibility(0);
            textView6.setVisibility(0);
            imageView2.setVisibility(8);
            textView7.setVisibility(8);
            gridView.setVisibility(8);
            textView2.setText(R.string.gun);
            textView3.setText(R.string.damage);
            textView4.setText(String.valueOf(d6.y()));
            textView5.setText(R.string.accuracy);
            textView6.setText(String.valueOf(d6.x()));
        } else if (z3 && !d6.f4307r) {
            textView3.setVisibility(0);
            textView4.setVisibility(0);
            textView5.setVisibility(0);
            textView6.setVisibility(0);
            imageView2.setVisibility(8);
            textView7.setVisibility(8);
            gridView.setVisibility(8);
            textView2.setText(R.string.armor);
            textView3.setText(R.string.defence);
            textView4.setText(String.valueOf(d6.z()));
            textView5.setText(R.string.evasion);
            textView6.setText(String.valueOf(d6.A()));
        } else if (d6.f4294b == 15) {
            textView3.setVisibility(8);
            textView4.setVisibility(8);
            textView5.setVisibility(8);
            textView6.setVisibility(8);
            imageView2.setVisibility(0);
            textView7.setVisibility(0);
            gridView.setVisibility(0);
            textView2.setText(R.string.special_equipment);
            textView7.setText(MyApplication.f7090a.getApplicationContext().getString(R.string.number_with_plus_sign, new Object[]{Integer.valueOf(d6.f4314y)}));
            ArrayList arrayList = new ArrayList();
            for (int i5 = 0; i5 < d6.f4315z.size(); i5++) {
                arrayList.add(new C0246c(e.R(((Integer) d6.f4315z.get(i5)).intValue()), ((Integer) d6.f4289A.get(i5)).intValue(), e.M(((Integer) d6.f4315z.get(i5)).intValue())));
            }
            gridView.setAdapter(new C0641q(context2, arrayList, 3));
        } else {
            textView3.setVisibility(0);
            textView4.setVisibility(0);
            textView5.setVisibility(0);
            textView6.setVisibility(0);
            imageView2.setVisibility(8);
            textView7.setVisibility(8);
            gridView.setVisibility(8);
            textView2.setText(R.string.bio_chemical);
            textView3.setText(R.string.limit);
            textView4.setText(String.valueOf(0));
            textView5.setText(R.string.effect);
            textView6.setText(String.valueOf(0));
        }
        if (d6.f4300k) {
            imageView3.setImageResource(R.drawable.button_blue);
        } else {
            imageView3.setImageResource(R.drawable.button_gray);
        }
        if (d6.f4302m) {
            textView8.setText(R.string.button_unlock);
        } else {
            textView8.setText(R.string.button_sell);
        }
        if (d6.f4301l) {
            imageView.setImageResource(R.drawable.button_red);
        } else {
            imageView.setImageResource(R.drawable.button_gray);
        }
        RelativeLayout relativeLayout3 = relativeLayout2;
        relativeLayout3.setOnClickListener(new C0634l(this, relativeLayout3, d6, 0));
        RelativeLayout relativeLayout4 = relativeLayout;
        relativeLayout4.setOnClickListener(new C0634l(this, relativeLayout4, d6, 1));
        imageView2.setOnClickListener(new f(this, imageView2, 29));
        return view3;
    }
}
