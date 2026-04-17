package j4;

import K1.e;
import K4.j;
import R2.b;
import S4.f;
import Y4.D;
import android.content.Context;
import android.support.v4.media.session.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.C0269a;
import androidx.fragment.app.I;
import com.mtma.criminal.city.R;
import com.mtma.criminal.city.utils.U;
import d5.o;
import e5.C0505b;
import f.C0518i;
import java.util.List;
import o3.d;

public final class A0 extends ArrayAdapter {

    /* renamed from: f  reason: collision with root package name */
    public static final /* synthetic */ int f8838f = 0;

    /* renamed from: a  reason: collision with root package name */
    public final Context f8839a;

    /* renamed from: b  reason: collision with root package name */
    public final int f8840b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f8841c;
    public boolean d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f8842e;

    public A0(Context context, List list) {
        super(context, 0, list);
        this.f8840b = 0;
        this.f8841c = false;
        this.d = false;
        this.f8842e = false;
        this.f8839a = context;
    }

    public static void a(A0 a02) {
        Context context = a02.f8839a;
        I l6 = ((C0518i) context).l();
        C0269a b6 = d.b(l6, l6);
        b6.f(R.id.activity_main_body_frame_layout, new f(context), (String) null, 1);
        b6.c();
        b6.e(false);
        b.N0();
    }

    public static void b(A0 a02, int i2, D d6) {
        a02.getClass();
        b.w(true);
        a.B0(d6.f4293a, d6.f4294b, d6.f4298i, -i2, new x0(a02, d6, i2), o.getAccountObject().getId(), a.z(), false);
    }

    public static void c(A0 a02, D d6, int i2, int i5, C0505b bVar) {
        A0 a03 = a02;
        int i6 = i2;
        if (!a03.f8841c) {
            a03.f8841c = true;
            C0505b bVar2 = new C0505b(a03.f8839a, R.layout.dialog_ok_cancle);
            TextView textView = (TextView) bVar2.findViewById(R.id.dialog_ok_cancel_text);
            LinearLayout linearLayout = (LinearLayout) bVar2.findViewById(R.id.dialog_ok_cancel_buttons_confirm_cancel_layout);
            RelativeLayout relativeLayout = (RelativeLayout) bVar2.findViewById(R.id.dialog_ok_cancel_confirm_button);
            RelativeLayout relativeLayout2 = (RelativeLayout) bVar2.findViewById(R.id.dialog_ok_cancel_cancel_button);
            TextView textView2 = (TextView) bVar2.findViewById(R.id.dialog_ok_cancel_confirm_button_text);
            if (i6 == 0) {
                textView.setText(R.string.confirm_use_item);
            } else if (i6 == 1) {
                textView.setText(R.string.confirm_sell_item);
            }
            linearLayout.setVisibility(0);
            textView2.setText(R.string.button_ok);
            relativeLayout.setOnClickListener(new w0(a02, relativeLayout, i2, d6, i5, bVar2, bVar));
            relativeLayout2.setOnClickListener(new v0(a02, relativeLayout2, bVar2, 1));
            bVar2.show();
        }
    }

    public final View getView(int i2, View view, ViewGroup viewGroup) {
        View view2;
        Context context = this.f8839a;
        if (view == null) {
            view2 = LayoutInflater.from(context).inflate(R.layout.item_stock, viewGroup, false);
        } else {
            view2 = view;
        }
        RelativeLayout relativeLayout = (RelativeLayout) view2.findViewById(R.id.item_stock_sell_button);
        TextView textView = (TextView) view2.findViewById(R.id.item_stock_use_button_text);
        ImageView imageView = (ImageView) view2.findViewById(R.id.item_stock_use_button_image);
        ImageView imageView2 = (ImageView) view2.findViewById(R.id.item_stock_sell_button_image);
        TextView textView2 = (TextView) view2.findViewById(R.id.item_stock_name);
        ImageView imageView3 = (ImageView) view2.findViewById(R.id.item_stock_image);
        TextView textView3 = (TextView) view2.findViewById(R.id.item_stock_count);
        ConstraintLayout constraintLayout = (ConstraintLayout) view2.findViewById(R.id.item_stock_image_layout);
        RelativeLayout relativeLayout2 = (RelativeLayout) view2.findViewById(R.id.item_stock_use_button);
        ConstraintLayout constraintLayout2 = (ConstraintLayout) view2.findViewById(R.id.item_stock_level_layout);
        TextView textView4 = (TextView) view2.findViewById(R.id.item_stock_sell_button_text);
        TextView textView5 = (TextView) view2.findViewById(R.id.item_stock_level);
        View view3 = view2;
        D d6 = (D) getItem(i2);
        ImageView imageView4 = (ImageView) view2.findViewById(R.id.item_stock_specialties_arrow);
        int i5 = this.f8840b;
        TextView textView6 = (TextView) view2.findViewById(R.id.item_stock_cost);
        ImageView imageView5 = (ImageView) view2.findViewById(R.id.item_stock_cost_image);
        if (i5 == 1) {
            textView.setText(R.string.button_upgrade);
            relativeLayout.setVisibility(4);
        } else if (i5 == 2) {
            if (d6.equals(D.a())) {
                textView.setText(R.string.button_add);
                com.google.android.gms.internal.measurement.a.i(context, context.getResources(), R.color.system_text, textView2);
            } else {
                textView.setText(R.string.button_remove);
                com.google.android.gms.internal.measurement.a.i(context, context.getResources(), R.color.white, textView2);
            }
            relativeLayout.setVisibility(4);
        } else {
            textView.setText(R.string.button_use);
            relativeLayout.setVisibility(0);
        }
        textView2.setText(d6.f4295c);
        imageView3.setImageResource(d6.d);
        if (i5 != 2) {
            textView3.setText(e.l0(d6.h));
        } else if (d6.equals(D.a())) {
            textView3.setVisibility(8);
        } else {
            textView3.setVisibility(0);
            textView3.setText(e.l0(d6.h));
        }
        if (d6.f4298i == 0) {
            constraintLayout2.setVisibility(8);
        } else {
            constraintLayout2.setVisibility(0);
            textView5.setText(String.valueOf(d6.f4298i));
        }
        constraintLayout.setOnClickListener(new y0(this, constraintLayout, d6, 0));
        if (i5 == 2) {
            if (d6.equals(D.a())) {
                imageView.setImageResource(R.drawable.button_blue);
            } else {
                imageView.setImageResource(R.drawable.button_red);
            }
        } else if (d6.f4300k) {
            imageView.setImageResource(R.drawable.button_blue);
        } else {
            imageView.setImageResource(R.drawable.button_gray);
        }
        if (d6.f4301l) {
            imageView2.setImageResource(R.drawable.button_red);
            imageView5.setVisibility(0);
            TextView textView7 = textView6;
            textView7.setVisibility(0);
            if (d6.f4294b == 9) {
                ImageView imageView6 = imageView4;
                imageView6.setVisibility(0);
                long j6 = d6.g;
                if (j6 != 0) {
                    textView7.setText(U.a(j6));
                } else {
                    textView7.setText(U.a(d6.f4297f));
                }
                if (d6.g > d6.f4297f) {
                    imageView6.setImageResource(R.drawable.stock_green_arrow);
                } else {
                    imageView6.setImageResource(R.drawable.stock_red_arrow);
                }
            } else {
                textView7.setText(U.a(d6.f4297f / 2));
                imageView4.setVisibility(8);
            }
        } else {
            imageView2.setImageResource(R.drawable.button_gray);
            imageView5.setVisibility(8);
            textView6.setVisibility(8);
        }
        if (d6.f4302m) {
            textView4.setText(R.string.button_unlock);
        } else {
            textView4.setText(R.string.button_sell);
        }
        RelativeLayout relativeLayout3 = relativeLayout2;
        relativeLayout3.setOnClickListener(new j((Object) this, relativeLayout3, i2, (Object) d6, 16));
        relativeLayout.setOnClickListener(new y0(this, relativeLayout, d6, 1));
        return view3;
    }

    public A0(Context context, List list, int i2) {
        super(context, 0, list);
        this.f8841c = false;
        this.d = false;
        this.f8842e = false;
        this.f8839a = context;
        this.f8840b = i2;
    }
}
