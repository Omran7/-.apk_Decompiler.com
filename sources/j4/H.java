package j4;

import K4.j;
import Y4.g;
import Y4.m;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.bumptech.glide.c;
import com.google.android.gms.internal.measurement.a;
import com.google.android.gms.internal.p002firebaseauthapi.zzaky;
import com.mtma.criminal.city.R;
import com.mtma.criminal.city.app.MyApplication;
import com.mtma.criminal.city.utils.U;
import com.mtma.criminal.city.views.CustomProgressBar;
import d5.o;
import it.sephiroth.android.library.widget.HListView;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;

public final class H extends ArrayAdapter {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f8882a = 1;

    /* renamed from: b  reason: collision with root package name */
    public final Context f8883b;

    /* renamed from: c  reason: collision with root package name */
    public int f8884c;
    public boolean d;

    /* renamed from: e  reason: collision with root package name */
    public final Serializable f8885e;

    public H(Context context, ArrayList arrayList) {
        super(context, 0, arrayList);
        this.f8884c = 0;
        this.f8885e = new HashMap();
        this.d = false;
        this.f8883b = context;
    }

    public final View getView(int i2, View view, ViewGroup viewGroup) {
        View view2;
        int i5;
        View view3;
        int i6;
        int i7;
        int i8;
        ViewGroup viewGroup2 = viewGroup;
        switch (this.f8882a) {
            case 0:
                Context context = this.f8883b;
                if (view == null) {
                    view2 = LayoutInflater.from(context).inflate(R.layout.item_modificaton, viewGroup2, false);
                } else {
                    view2 = view;
                }
                TextView textView = (TextView) view2.findViewById(R.id.item_modification_cost_name);
                RelativeLayout relativeLayout = (RelativeLayout) view2.findViewById(R.id.item_modification_button);
                TextView textView2 = (TextView) view2.findViewById(R.id.item_modification_button_text);
                ImageView imageView = (ImageView) view2.findViewById(R.id.item_modification_button_image);
                TextView textView3 = (TextView) view2.findViewById(R.id.item_modification_statue);
                g gVar = (g) getItem(i2);
                ((ImageView) view2.findViewById(R.id.item_modification_image)).setImageResource(gVar.f4351c);
                ((TextView) view2.findViewById(R.id.item_modification_name)).setText(gVar.f4349a);
                ((TextView) view2.findViewById(R.id.item_modification_description)).setText(gVar.f4350b);
                ((TextView) view2.findViewById(R.id.item_modification_happiness_value)).setText(String.valueOf(gVar.d));
                ((TextView) view2.findViewById(R.id.item_modification_cost_value)).setText(U.b(gVar.f4352e));
                boolean z3 = gVar.g;
                if (z3) {
                    textView.setText(R.string.contract_price);
                } else {
                    textView.setText(R.string.estate_cost);
                }
                if (z3 && gVar.f4353f) {
                    imageView.setImageResource(R.drawable.button_gray);
                    a.i(context, context.getResources(), R.color.text_gray_white, textView3);
                    long j6 = (gVar.h / 1000) + 604800;
                    long j7 = c.f5744o;
                    if (j6 > j7) {
                        i5 = (int) ((j6 - j7) / 86400);
                    } else {
                        i5 = 0;
                    }
                    int i9 = i5 + 1;
                    if (i9 > 7) {
                        i9 = 7;
                    }
                    textView3.setText(MyApplication.f7090a.getApplicationContext().getString(R.string.contract_end, new Object[]{Integer.valueOf(i9)}));
                } else if (z3 && !gVar.f4353f) {
                    imageView.setImageResource(R.drawable.button_blue);
                    textView3.setTextColor(context.getResources().getColor(R.color.red_rust, context.getTheme()));
                    textView3.setText(R.string.do_not_have_contract);
                } else if (z3 || !gVar.f4353f) {
                    textView3.setText(R.string.do_not_added);
                    imageView.setImageResource(R.drawable.button_blue);
                    a.i(context, context.getResources(), R.color.red_rust, textView3);
                } else {
                    imageView.setImageResource(R.drawable.button_gray);
                    textView3.setTextColor(context.getResources().getColor(R.color.text_gray_white, context.getTheme()));
                    textView3.setText(R.string.permanently_added);
                }
                relativeLayout.setVisibility(0);
                if (gVar.f4353f) {
                    textView2.setText(R.string.button_added);
                } else if (z3) {
                    textView2.setText(R.string.button_add_contract);
                } else {
                    textView2.setText(R.string.button_add);
                }
                relativeLayout.setOnClickListener(new j((ArrayAdapter) this, relativeLayout, (Object) gVar, i2, 4));
                return view2;
            default:
                Context context2 = this.f8883b;
                if (view == null) {
                    view3 = LayoutInflater.from(context2).inflate(R.layout.item_gang_militia, viewGroup2, false);
                } else {
                    view3 = view;
                }
                TextView textView4 = (TextView) view3.findViewById(R.id.item_gang_militia_progress_bar_value);
                CustomProgressBar customProgressBar = (CustomProgressBar) view3.findViewById(R.id.item_gang_militia_progress_bar_test);
                HListView hListView = (HListView) view3.findViewById(R.id.item_gang_militia_prizes_list_view);
                RelativeLayout relativeLayout2 = (RelativeLayout) view3.findViewById(R.id.item_gang_militia_join_button);
                ImageView imageView2 = (ImageView) view3.findViewById(R.id.item_gang_militia_join_button_image);
                m mVar = (m) getItem(i2);
                ((TextView) view3.findViewById(R.id.item_gang_militia_name)).setText(mVar.f4397b);
                ((ImageView) view3.findViewById(R.id.item_gang_militia_image)).setImageResource(mVar.f4398c);
                ((TextView) view3.findViewById(R.id.item_gang_militia_courage_value)).setText(String.valueOf(mVar.d));
                ((TextView) view3.findViewById(R.id.item_gang_militia_respect_value)).setText(String.valueOf(mVar.f4399e));
                Context applicationContext = MyApplication.f7090a.getApplicationContext();
                String str = mVar.f4400f;
                if (str == null || str.isEmpty()) {
                    i6 = 0;
                } else {
                    i6 = str.split("\\.").length;
                }
                Integer valueOf = Integer.valueOf(i6);
                int i10 = mVar.f4396a;
                int i11 = 20;
                switch (i10) {
                    case 2:
                        i7 = 20;
                        break;
                    case 3:
                        i7 = 30;
                        break;
                    case 4:
                        i7 = 40;
                        break;
                    case 5:
                        i7 = 50;
                        break;
                    case zzaky.zzf.zzf:
                        i7 = 60;
                        break;
                    case zzaky.zzf.zzg:
                        i7 = 70;
                        break;
                    default:
                        i7 = 10;
                        break;
                }
                textView4.setText(applicationContext.getString(R.string.slash_between_two_number, new Object[]{valueOf, Integer.valueOf(i7)}));
                String str2 = mVar.f4400f;
                if (str2 == null || str2.isEmpty()) {
                    i8 = 0;
                } else {
                    i8 = str2.split("\\.").length;
                }
                float f6 = (float) i8;
                switch (i10) {
                    case 2:
                        break;
                    case 3:
                        i11 = 30;
                        break;
                    case 4:
                        i11 = 40;
                        break;
                    case 5:
                        i11 = 50;
                        break;
                    case zzaky.zzf.zzf:
                        i11 = 60;
                        break;
                    case zzaky.zzf.zzg:
                        i11 = 70;
                        break;
                    default:
                        i11 = 10;
                        break;
                }
                customProgressBar.setProgress(f6 / ((float) i11));
                if (mVar.f4400f.contains(o.getAccountObject().getId())) {
                    imageView2.setImageResource(R.drawable.button_gray);
                } else {
                    imageView2.setImageResource(R.drawable.button_blue);
                }
                if (this.f8884c == 0) {
                    this.f8884c = customProgressBar.getWidth();
                } else {
                    HashMap hashMap = (HashMap) this.f8885e;
                    if (!hashMap.containsKey(Integer.valueOf(i10))) {
                        C0621e0 e0Var = new C0621e0(context2, mVar.g, 3, this.f8884c);
                        hListView.setAdapter((ListAdapter) e0Var);
                        hashMap.put(Integer.valueOf(i10), e0Var);
                    } else {
                        hListView.setAdapter((ListAdapter) hashMap.get(Integer.valueOf(i10)));
                    }
                }
                relativeLayout2.setOnClickListener(new j((ArrayAdapter) this, relativeLayout2, (Object) mVar, i2, 6));
                return view3;
        }
    }

    public H(Context context, ArrayList arrayList, int i2, String str) {
        super(context, 0, arrayList);
        this.d = false;
        this.f8883b = context;
        this.f8884c = i2;
        this.f8885e = str;
    }
}
