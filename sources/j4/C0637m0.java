package j4;

import K1.e;
import R2.b;
import Y4.u;
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
import com.mtma.criminal.city.R;
import com.mtma.criminal.city.activities.MainActivity;
import com.mtma.criminal.city.app.MyApplication;
import com.mtma.criminal.city.utils.U;
import e5.C0505b;
import java.util.ArrayList;

/* renamed from: j4.m0  reason: case insensitive filesystem */
public final class C0637m0 extends ArrayAdapter {

    /* renamed from: a  reason: collision with root package name */
    public final MainActivity f9052a;

    /* renamed from: b  reason: collision with root package name */
    public long f9053b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f9054c = false;

    public C0637m0(MainActivity mainActivity, ArrayList arrayList) {
        super(mainActivity, 0, arrayList);
        this.f9052a = mainActivity;
        this.f9053b = c.f5744o;
    }

    public static void a(C0637m0 m0Var, u uVar, int i2) {
        if (!m0Var.f9054c) {
            m0Var.f9054c = true;
            C0505b bVar = new C0505b(m0Var.f9052a, R.layout.dialog_ok_cancle);
            TextView textView = (TextView) bVar.findViewById(R.id.dialog_ok_cancel_text);
            LinearLayout linearLayout = (LinearLayout) bVar.findViewById(R.id.dialog_ok_cancel_buttons_confirm_cancel_layout);
            RelativeLayout relativeLayout = (RelativeLayout) bVar.findViewById(R.id.dialog_ok_cancel_confirm_button);
            RelativeLayout relativeLayout2 = (RelativeLayout) bVar.findViewById(R.id.dialog_ok_cancel_cancel_button);
            TextView textView2 = (TextView) bVar.findViewById(R.id.dialog_ok_cancel_confirm_button_text);
            if (i2 == 0) {
                textView.setText(R.string.jailbreak_description);
            } else {
                textView.setText(MyApplication.f7090a.getApplicationContext().getString(R.string.bailout_description, new Object[]{uVar.f4435b, U.a(e.r(uVar.f4439i, m0Var.f9053b))}));
            }
            linearLayout.setVisibility(0);
            textView2.setText(R.string.button_ok);
            relativeLayout.setOnClickListener(new Y((ArrayAdapter) m0Var, relativeLayout, i2, (Object) uVar, bVar, 3));
            relativeLayout2.setOnClickListener(new C0623f0(m0Var, relativeLayout2, bVar, 7));
            bVar.show();
        }
    }

    public final View getView(int i2, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = LayoutInflater.from(this.f9052a).inflate(R.layout.item_jailed, viewGroup, false);
        }
        ConstraintLayout constraintLayout = (ConstraintLayout) view.findViewById(R.id.item_jailed_profile_pic_layout);
        ImageView imageView = (ImageView) view.findViewById(R.id.item_jailed_profile_pic);
        ImageView imageView2 = (ImageView) view.findViewById(R.id.item_jailed_online_icon);
        RelativeLayout relativeLayout = (RelativeLayout) view.findViewById(R.id.item_jailed_jailbreak_button);
        RelativeLayout relativeLayout2 = (RelativeLayout) view.findViewById(R.id.item_jailed_bailout_button);
        u uVar = (u) getItem(i2);
        ((TextView) view.findViewById(R.id.item_jailed_name)).setText(uVar.f4435b);
        ((TextView) view.findViewById(R.id.item_jailed_description)).setText(MyApplication.f7090a.getApplicationContext().getString(R.string.item_jailed_description, new Object[]{uVar.h}));
        ((ImageView) view.findViewById(R.id.item_jailed_gender)).setImageResource(b.M(uVar.f4437e));
        ((TextView) view.findViewById(R.id.item_jailed_bail)).setText(U.a(e.r(uVar.f4439i, this.f9053b)));
        I1.b.v(imageView, uVar.f4436c);
        if (uVar.d) {
            imageView.setBackgroundResource(R.drawable.profile_pic_frame_vip);
        } else {
            imageView.setBackgroundResource(R.drawable.profile_pic_frame_default);
        }
        if (b.l0(uVar.g)) {
            imageView2.setImageResource(R.drawable.online_dote_icon);
        } else {
            imageView2.setImageResource(R.drawable.offline_dote_icon);
        }
        relativeLayout.setOnClickListener(new C0635l0(this, relativeLayout, uVar, 0));
        relativeLayout2.setOnClickListener(new C0635l0(this, relativeLayout2, uVar, 1));
        constraintLayout.setOnClickListener(new C0635l0(this, constraintLayout, uVar, 2));
        return view;
    }

    public final void notifyDataSetChanged() {
        this.f9053b = c.f5744o;
        super.notifyDataSetChanged();
    }
}
