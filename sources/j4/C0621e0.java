package j4;

import A4.h;
import K1.e;
import Y4.D;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.gms.internal.measurement.a;
import com.mtma.criminal.city.R;
import com.mtma.criminal.city.activities.MainActivity;
import com.mtma.criminal.city.app.MyApplication;
import com.mtma.criminal.city.utils.U;
import java.util.ArrayList;

/* renamed from: j4.e0  reason: case insensitive filesystem */
public final class C0621e0 extends ArrayAdapter {

    /* renamed from: i  reason: collision with root package name */
    public static final /* synthetic */ int f8998i = 0;

    /* renamed from: a  reason: collision with root package name */
    public final Context f8999a;

    /* renamed from: b  reason: collision with root package name */
    public final int f9000b;

    /* renamed from: c  reason: collision with root package name */
    public final String f9001c;
    public final String d;

    /* renamed from: e  reason: collision with root package name */
    public final int f9002e;

    /* renamed from: f  reason: collision with root package name */
    public final ArrayList f9003f;
    public final int g;
    public boolean h;

    public C0621e0(Context context, ArrayList arrayList, int i2, int i5) {
        super(context, 0, arrayList);
        this.f9002e = 0;
        this.h = false;
        this.f8999a = context;
        this.g = i2;
        this.f9000b = i5;
    }

    public final View getView(int i2, View view, ViewGroup viewGroup) {
        View view2;
        View view3;
        int i5;
        int i6;
        Context context = this.f8999a;
        if (view == null) {
            view2 = LayoutInflater.from(context).inflate(R.layout.item_museum, viewGroup, false);
            int i7 = this.f9000b;
            ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
            layoutParams.width = (i7 - (e.m(8.0d) * 3)) / 4;
            view2.setLayoutParams(layoutParams);
        } else {
            view2 = view;
        }
        TextView textView = (TextView) view2.findViewById(R.id.item_museum_title);
        TextView textView2 = (TextView) view2.findViewById(R.id.item_museum_count);
        TextView textView3 = (TextView) view2.findViewById(R.id.item_museum_name);
        TextView textView4 = (TextView) view2.findViewById(R.id.item_museum_cost);
        ImageView imageView = (ImageView) view2.findViewById(R.id.item_museum_cost_image);
        ImageView imageView2 = (ImageView) view2.findViewById(R.id.item_museum_image);
        TextView textView5 = (TextView) view2.findViewById(R.id.item_museum_level);
        ConstraintLayout constraintLayout = (ConstraintLayout) view2.findViewById(R.id.item_museum_level_layout);
        ConstraintLayout constraintLayout2 = (ConstraintLayout) view2.findViewById(R.id.item_museum_image_layout);
        D d6 = (D) getItem(i2);
        imageView2.setImageResource(d6.d);
        int i8 = this.g;
        if (i8 == 1) {
            textView.setVisibility(0);
            textView2.setVisibility(0);
            imageView.setVisibility(0);
            textView.setText(d6.f4295c);
            view3 = view2;
            textView4.setText(U.b(d6.f4297f));
            textView2.setText(e.l0(d6.h));
        } else {
            view3 = view2;
            if (i8 == 2) {
                textView.setVisibility(8);
                textView3.setVisibility(8);
                textView4.setVisibility(8);
                int i9 = this.f9002e;
                if (i9 != 0) {
                    textView2.setVisibility(0);
                    textView2.setText(MyApplication.f7090a.getApplicationContext().getString(R.string.activity_prize_percent, new Object[]{Integer.valueOf(i9)}));
                    textView2.setTextColor(MyApplication.f7090a.getApplicationContext().getResources().getColor(R.color.white, context.getTheme()));
                    textView2.setBackgroundResource(R.color.red_rust);
                }
            } else if (i8 == 3) {
                textView3.setVisibility(0);
                textView2.setVisibility(0);
                textView3.setText(d6.f4295c);
                a.i(context, MyApplication.f7090a.getApplicationContext().getResources(), R.color.white, textView2);
                textView2.setText(e.l0(d6.h));
            }
        }
        if ((i8 == 0 && d6.f4305p) || i8 == 1 || i8 == 2 || i8 == 3) {
            i6 = 4;
            i5 = 0;
            imageView2.setVisibility(0);
        } else {
            i6 = 4;
            imageView2.setVisibility(4);
            i5 = 0;
        }
        if (d6.f4298i == 0) {
            constraintLayout.setVisibility(i6);
        } else {
            constraintLayout.setVisibility(i5);
            textView5.setText(String.valueOf(d6.f4298i));
        }
        constraintLayout2.setOnClickListener(new h(this, constraintLayout2, d6, 28));
        return view3;
    }

    public C0621e0(Context context, ArrayList arrayList, ArrayList arrayList2, String str, String str2, int i2) {
        super(context, 0, arrayList);
        this.f9002e = 0;
        this.h = false;
        this.f8999a = context;
        this.f9003f = arrayList2;
        this.f9001c = str;
        this.d = str2;
        this.g = 1;
        this.f9000b = i2;
    }

    public C0621e0(MainActivity mainActivity, ArrayList arrayList, int i2, int i5) {
        super(mainActivity, 0, arrayList);
        this.h = false;
        this.f8999a = mainActivity;
        this.g = 2;
        this.f9002e = i2;
        this.f9000b = i5;
    }
}
