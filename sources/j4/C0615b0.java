package j4;

import A4.h;
import H4.g;
import K1.e;
import K4.j;
import R2.b;
import Y4.A;
import Y4.n;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bumptech.glide.c;
import com.google.android.gms.internal.measurement.a;
import com.mtma.criminal.city.R;
import com.mtma.criminal.city.app.MyApplication;
import com.mtma.criminal.city.utils.C0452w;
import com.mtma.criminal.city.utils.U;
import d5.o;
import e5.C0505b;
import i3.C0592h;
import java.util.ArrayList;
import java.util.HashMap;

/* renamed from: j4.b0  reason: case insensitive filesystem */
public final class C0615b0 extends ArrayAdapter {

    /* renamed from: e  reason: collision with root package name */
    public static final /* synthetic */ int f8976e = 0;

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f8977a = 0;

    /* renamed from: b  reason: collision with root package name */
    public final Context f8978b;

    /* renamed from: c  reason: collision with root package name */
    public int f8979c;
    public boolean d;

    public C0615b0(Context context, ArrayList arrayList, int i2) {
        super(context, 0, arrayList);
        this.d = false;
        this.f8978b = context;
        this.f8979c = i2;
    }

    public static void a(C0615b0 b0Var, n nVar, int i2) {
        if (!b0Var.d) {
            b0Var.d = true;
            C0505b bVar = new C0505b(b0Var.f8978b, R.layout.dialog_ok_cancle);
            TextView textView = (TextView) bVar.findViewById(R.id.dialog_ok_cancel_text);
            LinearLayout linearLayout = (LinearLayout) bVar.findViewById(R.id.dialog_ok_cancel_buttons_confirm_cancel_layout);
            RelativeLayout relativeLayout = (RelativeLayout) bVar.findViewById(R.id.dialog_ok_cancel_confirm_button);
            RelativeLayout relativeLayout2 = (RelativeLayout) bVar.findViewById(R.id.dialog_ok_cancel_cancel_button);
            TextView textView2 = (TextView) bVar.findViewById(R.id.dialog_ok_cancel_confirm_button_text);
            if (i2 == 0) {
                a.o(MyApplication.f7090a, R.string.dialog_gang_join_request_accept_description, textView);
            } else if (i2 == 1) {
                a.o(MyApplication.f7090a, R.string.dialog_gang_join_request_reject_description, textView);
            }
            linearLayout.setVisibility(0);
            textView2.setText(R.string.button_ok);
            relativeLayout.setOnClickListener(new Y((ArrayAdapter) b0Var, relativeLayout, (Object) nVar, i2, bVar, 1));
            relativeLayout2.setOnClickListener(new h(b0Var, relativeLayout2, bVar, 24));
            bVar.show();
        }
    }

    public void b(n nVar) {
        HashMap hashMap = new HashMap();
        hashMap.put("gangRequests/" + o.getGangObject().getId() + "/" + nVar.f4401a, (Object) null);
        hashMap.put("playerRequests/" + nVar.f4401a + "/" + o.getGangObject().getId(), (Object) null);
        C0592h.b().e().E(b.Z()).E("gangs").J(hashMap).addOnSuccessListener(new g(this, nVar, 9)).addOnFailureListener(new C0452w(this, 3));
    }

    public final View getView(int i2, View view, ViewGroup viewGroup) {
        View view2;
        View view3;
        ViewGroup viewGroup2 = viewGroup;
        switch (this.f8977a) {
            case 0:
                if (view == null) {
                    view2 = LayoutInflater.from(this.f8978b).inflate(R.layout.item_gang_request, viewGroup2, false);
                } else {
                    view2 = view;
                }
                ConstraintLayout constraintLayout = (ConstraintLayout) view2.findViewById(R.id.item_gang_request_profile_pic_layout);
                ImageView imageView = (ImageView) view2.findViewById(R.id.item_gang_request_profile_pic);
                ImageView imageView2 = (ImageView) view2.findViewById(R.id.item_gang_request_online_icon);
                ImageView imageView3 = (ImageView) view2.findViewById(R.id.item_gang_request_vip_icon);
                RelativeLayout relativeLayout = (RelativeLayout) view2.findViewById(R.id.item_gang_request_accept_button);
                RelativeLayout relativeLayout2 = (RelativeLayout) view2.findViewById(R.id.item_gang_request_reject_button);
                n nVar = (n) getItem(i2);
                ((TextView) view2.findViewById(R.id.item_gang_request_name)).setText(nVar.f4402b);
                ((ImageView) view2.findViewById(R.id.item_gang_request_gender)).setImageResource(b.M(nVar.f4405f));
                ((TextView) view2.findViewById(R.id.item_gang_request_level)).setText(String.valueOf(nVar.g));
                ((TextView) view2.findViewById(R.id.item_gang_request_time)).setText(MyApplication.f7090a.getApplicationContext().getString(R.string.gang_join_request_since, new Object[]{c.X(Long.valueOf(nVar.h))}));
                if (nVar.d) {
                    imageView.setBackgroundResource(R.drawable.profile_pic_frame_vip);
                    imageView3.setVisibility(0);
                } else {
                    imageView.setBackgroundResource(R.drawable.profile_pic_frame_default);
                    imageView3.setVisibility(8);
                }
                if (nVar.f4404e) {
                    imageView2.setImageResource(R.drawable.online_dote_icon);
                } else {
                    imageView2.setImageResource(R.drawable.offline_dote_icon);
                }
                I1.b.v(imageView, nVar.f4403c);
                constraintLayout.setOnClickListener(new C0613a0(this, constraintLayout, nVar, 0));
                relativeLayout.setOnClickListener(new C0613a0(this, relativeLayout, nVar, 1));
                relativeLayout2.setOnClickListener(new C0613a0(this, relativeLayout2, nVar, 2));
                return view2;
            default:
                Context context = this.f8978b;
                if (view == null) {
                    view3 = LayoutInflater.from(context).inflate(R.layout.item_school, viewGroup2, false);
                } else {
                    view3 = view;
                }
                TextView textView = (TextView) view3.findViewById(R.id.item_school_cost);
                TextView textView2 = (TextView) view3.findViewById(R.id.item_school_button_text);
                ImageView imageView4 = (ImageView) view3.findViewById(R.id.item_school_button_image_view);
                RelativeLayout relativeLayout3 = (RelativeLayout) view3.findViewById(R.id.item_school_study_button);
                RelativeLayout relativeLayout4 = (RelativeLayout) view3.findViewById(R.id.item_school_time_studied_time_layout);
                TextView textView3 = (TextView) view3.findViewById(R.id.item_school_studied_time);
                A a6 = (A) getItem(i2);
                ((TextView) view3.findViewById(R.id.item_school_name)).setText(a6.f4275b);
                ((TextView) view3.findViewById(R.id.item_school_description)).setText(a6.f4276c);
                ((ImageView) view3.findViewById(R.id.item_school_image)).setImageResource(a6.d);
                Context context2 = context;
                long j6 = a6.f4278f;
                textView.setText(U.a(j6));
                TextView textView4 = textView;
                ((TextView) view3.findViewById(R.id.item_school_time)).setText(c.i((long) ((int) (((double) (a6.f4277e * 24)) * (1.0d - e.S(21)) * 60.0d * 60.0d))));
                int i5 = a6.g;
                if (i5 == 2) {
                    textView2.setText(R.string.button_done);
                } else if (i5 == 1) {
                    textView2.setText(R.string.current_studying_button);
                } else {
                    textView2.setText(R.string.button_study);
                    if (i5 == 1 || o.getMoneyObject().getCash() >= j6) {
                        a.i(context2, context2.getResources(), R.color.white, textView4);
                    } else {
                        a.i(context2, context2.getResources(), R.color.red_rust, textView4);
                    }
                }
                if (i5 == 1) {
                    relativeLayout4.setVisibility(0);
                    textView3.setText(c.i(c.f5744o - (((Long) o.getSchoolObject().getStartStudyingTimeInMilli()).longValue() / 1000)));
                } else {
                    relativeLayout4.setVisibility(8);
                }
                if (a6.h) {
                    imageView4.setImageResource(R.drawable.button_blue);
                } else {
                    imageView4.setImageResource(R.drawable.button_gray);
                }
                relativeLayout3.setOnClickListener(new j((ArrayAdapter) this, relativeLayout3, (Object) a6, i2, 13));
                return view3;
        }
    }

    public C0615b0(Context context, ArrayList arrayList) {
        super(context, 0, arrayList);
        this.d = false;
        this.f8979c = -1;
        this.f8978b = context;
    }
}
