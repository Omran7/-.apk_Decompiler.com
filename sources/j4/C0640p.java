package j4;

import A4.h;
import Y4.C0246c;
import Y4.C0247d;
import Y4.D;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.google.android.gms.internal.measurement.a;
import com.mtma.criminal.city.R;
import com.mtma.criminal.city.app.MyApplication;
import java.util.ArrayList;

/* renamed from: j4.p  reason: case insensitive filesystem */
public final class C0640p extends ArrayAdapter {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f9071a;

    /* renamed from: b  reason: collision with root package name */
    public final Context f9072b;

    /* renamed from: c  reason: collision with root package name */
    public final int f9073c;
    public int d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0640p(Context context, ArrayList arrayList, int i2, int i5, int i6) {
        super(context, 0, arrayList);
        this.f9071a = i6;
        this.f9072b = context;
        this.f9073c = i2;
        this.d = i5;
    }

    public final View getView(int i2, View view, ViewGroup viewGroup) {
        View view2;
        View view3;
        View view4;
        int i5 = i2;
        ViewGroup viewGroup2 = viewGroup;
        switch (this.f9071a) {
            case 0:
                Context context = this.f9072b;
                if (view == null) {
                    view2 = LayoutInflater.from(context).inflate(R.layout.item_basic_2, viewGroup2, false);
                } else {
                    view2 = view;
                }
                TextView textView = (TextView) view2.findViewById(R.id.item_basic_title);
                TextView textView2 = (TextView) view2.findViewById(R.id.item_basic_description);
                TextView textView3 = (TextView) view2.findViewById(R.id.item_basic_count);
                RelativeLayout relativeLayout = (RelativeLayout) view2.findViewById(R.id.item_basic_button);
                ImageView imageView = (ImageView) view2.findViewById(R.id.item_basic_alert_icon);
                C0246c cVar = (C0246c) getItem(i2);
                ((ImageView) view2.findViewById(R.id.item_basic_image)).setImageResource(cVar.f4335c);
                int i6 = cVar.f4333a;
                textView.setText(i6);
                int i7 = cVar.f4334b;
                if (i7 != -1) {
                    textView2.setText(i7);
                }
                int i8 = this.f9073c;
                if (i8 == 4) {
                    relativeLayout.setVisibility(8);
                    if (i5 == 7) {
                        a.i(context, context.getResources(), R.color.red_rust, textView);
                    } else {
                        a.i(context, context.getResources(), R.color.text_gray_white, textView);
                    }
                } else if (i8 == 10) {
                    relativeLayout.setVisibility(8);
                    if (i6 == R.string.gang_management_dissolution_gang_name) {
                        a.i(context, context.getResources(), R.color.red_rust, textView);
                    } else {
                        a.i(context, context.getResources(), R.color.text_gray_white, textView);
                    }
                } else {
                    relativeLayout.setOnClickListener(new C0628i(this, relativeLayout, i5, 2));
                }
                if (i8 == 1 || i8 == 2) {
                    textView2.setVisibility(8);
                    textView3.setVisibility(0);
                    textView3.setText(MyApplication.f7090a.getApplicationContext().getString(R.string.number_with_multiply_sign, new Object[]{Integer.valueOf(cVar.d)}));
                }
                if (i8 == 3 || i8 == 4 || i8 == 10) {
                    if (cVar.f4336e) {
                        imageView.setVisibility(0);
                    } else {
                        imageView.setVisibility(8);
                    }
                }
                return view2;
            case 1:
                Context context2 = this.f9072b;
                if (view == null) {
                    view3 = LayoutInflater.from(context2).inflate(R.layout.item_basic, viewGroup2, false);
                } else {
                    view3 = view;
                }
                TextView textView4 = (TextView) view3.findViewById(R.id.item_basic_title);
                RelativeLayout relativeLayout2 = (RelativeLayout) view3.findViewById(R.id.item_basic_button);
                ImageView imageView2 = (ImageView) view3.findViewById(R.id.item_basic_saving_icon);
                C0247d dVar = (C0247d) getItem(i2);
                ((ImageView) view3.findViewById(R.id.item_basic_image)).setImageResource(dVar.f4338b);
                int i9 = dVar.f4337a;
                textView4.setText(i9);
                ((TextView) view3.findViewById(R.id.item_basic_button_text)).setText(R.string.button_enter);
                if (this.d == 3) {
                    if (dVar.f4339c == -1) {
                        imageView2.setVisibility(8);
                        if (MyApplication.f7090a.getApplicationContext().getString(i9).equals(MyApplication.f7090a.getApplicationContext().getString(R.string.shop_market_buy_gold_title)) || MyApplication.f7090a.getApplicationContext().getString(i9).equals(MyApplication.f7090a.getApplicationContext().getString(R.string.shop_market_buy_cash_title)) || MyApplication.f7090a.getApplicationContext().getString(i9).equals(MyApplication.f7090a.getApplicationContext().getString(R.string.shop_market_convert_cash_title))) {
                            a.i(context2, context2.getResources(), R.color.system_text, textView4);
                        } else {
                            a.i(context2, context2.getResources(), R.color.text_gray_white, textView4);
                        }
                    } else {
                        imageView2.setVisibility(0);
                        a.i(context2, context2.getResources(), R.color.text_purple, textView4);
                    }
                }
                relativeLayout2.setOnClickListener(new C0628i(this, relativeLayout2, i5, 3));
                return view3;
            default:
                Context context3 = this.f9072b;
                if (view == null) {
                    view4 = LayoutInflater.from(context3).inflate(R.layout.item_black_market_convert, viewGroup2, false);
                } else {
                    view4 = view;
                }
                ImageView imageView3 = (ImageView) view4.findViewById(R.id.item_black_market_image);
                TextView textView5 = (TextView) view4.findViewById(R.id.item_black_market_value_required);
                TextView textView6 = (TextView) view4.findViewById(R.id.item_black_market_value);
                D d6 = (D) getItem(i2);
                imageView3.setImageResource(d6.d);
                ((TextView) view4.findViewById(R.id.item_black_market_title)).setText(d6.f4295c);
                textView6.setText(String.valueOf(d6.h));
                int i10 = this.d;
                int i11 = this.f9073c;
                if (i10 == 0 || i10 < i11) {
                    textView5.setText(String.valueOf(i11));
                } else {
                    textView5.setText(String.valueOf((i10 / i11) * i11));
                }
                if (d6.h < i11) {
                    a.i(context3, context3.getResources(), R.color.red_rust, textView6);
                } else {
                    a.i(context3, context3.getResources(), R.color.white, textView6);
                }
                imageView3.setOnClickListener(new h(this, imageView3, d6, 15));
                return view4;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C0640p(Context context, ArrayList arrayList, int i2, int i5) {
        super(context, 0, arrayList);
        this.f9071a = 1;
        this.f9072b = context;
        this.f9073c = i2;
        this.d = 1;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C0640p(Context context, ArrayList arrayList, int i2, int i5, byte b6) {
        super(context, 0, arrayList);
        this.f9071a = i5;
        switch (i5) {
            case 1:
                super(context, 0, arrayList);
                this.f9072b = context;
                this.d = i2;
                return;
            default:
                this.f9072b = context;
                this.f9073c = i2;
                return;
        }
    }
}
