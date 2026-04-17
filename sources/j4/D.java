package j4;

import A2.f;
import A4.h;
import K1.e;
import K4.j;
import R2.b;
import android.app.Dialog;
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
import com.bumptech.glide.c;
import com.mtma.criminal.city.R;
import com.mtma.criminal.city.app.MyApplication;
import com.mtma.criminal.city.utils.U;
import d5.o;
import i3.C0592h;
import java.util.ArrayList;

public final class D extends ArrayAdapter {

    /* renamed from: f  reason: collision with root package name */
    public static final /* synthetic */ int f8855f = 0;

    /* renamed from: a  reason: collision with root package name */
    public final Context f8856a;

    /* renamed from: b  reason: collision with root package name */
    public final int f8857b;

    /* renamed from: c  reason: collision with root package name */
    public final Y4.D f8858c;
    public int d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f8859e = false;

    public D(Context context, ArrayList arrayList, int i2, int i5) {
        super(context, 0, arrayList);
        this.f8856a = context;
        this.f8857b = i2;
        this.d = i5;
        this.f8858c = Y4.D.s(a.F(i2), 0, 1);
    }

    public static void a(D d6, int i2) {
        String str;
        d6.getClass();
        int lastOpenedCrimeType = o.getCrimeObject().getLastOpenedCrimeType();
        Context context = d6.f8856a;
        int i5 = d6.f8857b;
        if (i5 == lastOpenedCrimeType && i2 > o.getCrimeObject().getLastOpenedCrimeItem()) {
            com.google.android.gms.internal.measurement.a.n(MyApplication.f7090a, R.string.crimes_locked, context, (String) null);
        } else if (d6.d < 1) {
            c.s0(context, MyApplication.f7090a.getApplicationContext().getString(R.string.click_on_crime_tool_for_more_info, new Object[]{MyApplication.f7090a.getApplicationContext().getString(d6.f8858c.f4295c)}), (String) null);
        } else if (o.getMainStatesObject().getCourageCurrent() < i5 + 1) {
            c.p(context, 2002);
        } else if (o.getLocationObject().getCurrentPlace() != 0) {
            c.s0(context, MyApplication.f7090a.getApplicationContext().getString(R.string.can_not_execute_crime_in_your_situation), (String) null);
            c.E0(context);
        } else {
            b.w(true);
            if (o.getLocationObject().getCurrentCity() == 0) {
                str = "count";
            } else {
                str = "countInBag";
            }
            com.google.android.gms.internal.measurement.a.c(C0592h.b().e(), "players").E(o.getAccountObject().getId()).E("stockObject").E("itemsInStock").E("grocery").E(e.x(a.F(i5), 0)).E(str).d(new f((Object) d6, i2, (Object) str, 11));
        }
    }

    /* JADX WARNING: type inference failed for: r7v0, types: [android.app.Dialog, e5.b, java.lang.Object] */
    public static void b(D d6, int i2, String str) {
        if (!d6.f8859e) {
            d6.f8859e = true;
            ? dialog = new Dialog(d6.f8856a);
            dialog.f7671a = true;
            dialog.a(R.layout.dialog_ok_cancle, false);
            dialog.f7671a = false;
            RelativeLayout relativeLayout = (RelativeLayout) dialog.findViewById(R.id.dialog_ok_cancel_confirm_button);
            RelativeLayout relativeLayout2 = (RelativeLayout) dialog.findViewById(R.id.dialog_ok_cancel_cancel_button);
            ((TextView) dialog.findViewById(R.id.dialog_ok_cancel_text)).setText(str);
            ((LinearLayout) dialog.findViewById(R.id.dialog_ok_cancel_buttons_confirm_cancel_layout)).setVisibility(0);
            ((TextView) dialog.findViewById(R.id.dialog_ok_cancel_confirm_button_text)).setText(R.string.button_again);
            relativeLayout.setOnClickListener(new j((ArrayAdapter) d6, relativeLayout, (Object) dialog, i2, 3));
            relativeLayout2.setOnClickListener(new h(d6, relativeLayout2, dialog, 16));
            dialog.show();
        }
    }

    public final View getView(int i2, View view, ViewGroup viewGroup) {
        View view2;
        boolean z3;
        int i5;
        int i6 = i2;
        if (view == null) {
            view2 = LayoutInflater.from(this.f8856a).inflate(R.layout.item_crime, viewGroup, false);
        } else {
            view2 = view;
        }
        ImageView imageView = (ImageView) view2.findViewById(R.id.item_crime_tool_lock_frame);
        RelativeLayout relativeLayout = (RelativeLayout) view2.findViewById(R.id.item_crime_reward_cash_layout);
        TextView textView = (TextView) view2.findViewById(R.id.item_crime_reward_cash);
        RelativeLayout relativeLayout2 = (RelativeLayout) view2.findViewById(R.id.item_crime_tool_layout);
        TextView textView2 = (TextView) view2.findViewById(R.id.item_crime_reward_some_items);
        RelativeLayout relativeLayout3 = (RelativeLayout) view2.findViewById(R.id.item_crime_lock_layout);
        RelativeLayout relativeLayout4 = (RelativeLayout) view2.findViewById(R.id.item_crime_execute_button);
        View view3 = view2;
        Y4.f fVar = (Y4.f) getItem(i2);
        ImageView imageView2 = (ImageView) view2.findViewById(R.id.item_crime_execute_button_image);
        ((TextView) view2.findViewById(R.id.item_crime_title)).setText(fVar.f4346a);
        ((ImageView) view2.findViewById(R.id.item_crime_image)).setImageResource(fVar.f4347b);
        int i7 = this.f8857b;
        ((ImageView) view2.findViewById(R.id.item_crime_lamp)).setImageResource(a.H(a.C(i7, i6)));
        Y4.D d6 = this.f8858c;
        ((TextView) view2.findViewById(R.id.item_crime_tool_name)).setText(d6.f4295c);
        ((ImageView) view2.findViewById(R.id.item_crime_tool_image)).setImageResource(d6.d);
        ((TextView) view2.findViewById(R.id.item_crime_tool_count)).setText(e.l0(this.d));
        ((TextView) view2.findViewById(R.id.item_crime_courage_points)).setText(String.valueOf(i7 + 1));
        ((TextView) view2.findViewById(R.id.item_crime_experience_points)).setText(String.valueOf(fVar.f4348c));
        if (i7 == 0 ? i6 == 2 || i6 == 5 : i7 == 10 || i7 == 2 || i7 == 3) {
            z3 = false;
        } else {
            z3 = true;
        }
        if (!z3) {
            i5 = 0;
            textView2.setVisibility(0);
            relativeLayout.setVisibility(8);
        } else {
            i5 = 0;
            textView2.setVisibility(8);
            relativeLayout.setVisibility(0);
            if (a.A(i7, i6, 1) == 0) {
                textView.setText(U.c(a.A(i7, i6, 0)));
            } else {
                textView.setText(MyApplication.f7090a.getApplicationContext().getString(R.string.two_dots_between_text, new Object[]{U.c(a.A(i7, i6, 0)), U.c(a.A(i7, i6, 1))}));
            }
        }
        if (this.d < 1) {
            imageView.setVisibility(i5);
        } else {
            imageView.setVisibility(8);
        }
        if (i7 != o.getCrimeObject().getLastOpenedCrimeType() || i6 <= o.getCrimeObject().getLastOpenedCrimeItem()) {
            relativeLayout3.setVisibility(8);
            imageView2.setImageResource(R.drawable.button_blue);
        } else {
            relativeLayout3.setVisibility(i5);
            imageView2.setImageResource(R.drawable.button_gray);
        }
        RelativeLayout relativeLayout5 = relativeLayout2;
        relativeLayout5.setOnClickListener(new C0646w(this, relativeLayout5, 0));
        RelativeLayout relativeLayout6 = relativeLayout4;
        relativeLayout6.setOnClickListener(new C0628i(this, relativeLayout6, i6, 5));
        return view3;
    }
}
