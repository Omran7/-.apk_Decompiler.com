package j4;

import H4.g;
import R2.b;
import Y4.C0248e;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.gms.internal.measurement.a;
import com.mtma.criminal.city.R;
import com.mtma.criminal.city.app.MyApplication;
import d5.o;
import i3.C0592h;
import java.util.ArrayList;
import java.util.HashMap;

/* renamed from: j4.v  reason: case insensitive filesystem */
public final class C0645v extends ArrayAdapter {

    /* renamed from: a  reason: collision with root package name */
    public final Context f9109a;

    /* renamed from: b  reason: collision with root package name */
    public final int f9110b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f9111c = false;
    public boolean d = false;

    /* renamed from: e  reason: collision with root package name */
    public boolean f9112e = false;

    /* renamed from: f  reason: collision with root package name */
    public boolean f9113f = false;
    public boolean g = false;

    public C0645v(Context context, ArrayList arrayList, int i2) {
        super(context, 0, arrayList);
        this.f9109a = context;
        this.f9110b = i2;
    }

    public static void a(C0645v vVar, C0248e eVar) {
        vVar.getClass();
        boolean containsKey = o.getContactsObject().getBlockedMap().containsKey(eVar.f4340a);
        Context context = vVar.f9109a;
        if (containsKey) {
            b.w(false);
            a.n(MyApplication.f7090a, R.string.can_not_accept_friend_request_to_player_you_blocked_him, context, (String) null);
        } else if (o.getContactsObject().getOthersBlockedMap().containsKey(eVar.f4340a)) {
            b.w(false);
            a.n(MyApplication.f7090a, R.string.can_not_accept_friend_request_to_player_he_blocked_you, context, (String) null);
        } else {
            HashMap hashMap = new HashMap();
            hashMap.put(o.getAccountObject().getId() + "/contactsObject/friendsMap/" + eVar.f4340a, "no_friend_name_value");
            hashMap.put(eVar.f4340a + "/contactsObject/friendsMap/" + o.getAccountObject().getId(), "no_friend_name_value");
            hashMap.put(o.getAccountObject().getId() + "/contactsObject/requestsMap/" + eVar.h, (Object) null);
            hashMap.put(eVar.f4340a + "/contactsObject/requestsMap/" + b.V(0, o.getAccountObject().getId()), (Object) null);
            C0592h.d().e().E(b.a0()).E("players").J(hashMap).addOnSuccessListener(new g(vVar, eVar, 8));
        }
    }

    public final View getView(int i2, View view, ViewGroup viewGroup) {
        View view2;
        int i5;
        if (view == null) {
            view2 = LayoutInflater.from(this.f9109a).inflate(R.layout.item_contact, viewGroup, false);
        } else {
            view2 = view;
        }
        ImageView imageView = (ImageView) view2.findViewById(R.id.item_contact_profile_pic);
        ImageView imageView2 = (ImageView) view2.findViewById(R.id.item_contact_online_icon);
        ImageView imageView3 = (ImageView) view2.findViewById(R.id.item_contact_level_image);
        ImageView imageView4 = (ImageView) view2.findViewById(R.id.item_contact_gender);
        TextView textView = (TextView) view2.findViewById(R.id.item_contact_name);
        TextView textView2 = (TextView) view2.findViewById(R.id.item_contact_level_text);
        TextView textView3 = (TextView) view2.findViewById(R.id.item_contact_description);
        TextView textView4 = (TextView) view2.findViewById(R.id.item_contact_ok_button_text);
        TextView textView5 = (TextView) view2.findViewById(R.id.item_contact_cancel_button_text);
        RelativeLayout relativeLayout = (RelativeLayout) view2.findViewById(R.id.item_contact_ok_button);
        RelativeLayout relativeLayout2 = (RelativeLayout) view2.findViewById(R.id.item_contact_cancel_button);
        C0248e eVar = (C0248e) getItem(i2);
        int i6 = this.f9110b;
        View view3 = view2;
        ConstraintLayout constraintLayout = (ConstraintLayout) view2.findViewById(R.id.item_contact_profile_pic_layout);
        if (i6 == 0 && eVar.f4345i == 2) {
            textView.setText(eVar.f4341b);
            textView2.setText(String.valueOf(eVar.g));
            imageView3.setImageResource(R.drawable.gang_level_star_icon);
            imageView.setBackgroundResource(R.drawable.gang_profile_pic_frame);
            I1.b.u(imageView, eVar.f4340a, eVar.f4342c);
        } else {
            imageView4.setImageResource(b.M(eVar.f4344f));
            textView2.setText(String.valueOf(eVar.g));
            imageView3.setImageResource(R.drawable.level_icon);
            String str = eVar.f4341b;
            if (i6 == 1 || (i6 == 0 && eVar.f4345i != 2)) {
                str = b.z(eVar.f4340a, str);
            }
            textView.setText(str);
            I1.b.v(imageView, eVar.f4342c);
            if (eVar.d) {
                imageView.setBackgroundResource(R.drawable.profile_pic_frame_vip);
            } else {
                imageView.setBackgroundResource(R.drawable.profile_pic_frame_default);
            }
            if (eVar.f4343e) {
                imageView2.setImageResource(R.drawable.online_dote_icon);
            } else {
                imageView2.setImageResource(R.drawable.offline_dote_icon);
            }
        }
        if (i6 == 1) {
            textView4.setText(R.string.button_friend_name);
            textView5.setText(R.string.button_delete);
        } else if (i6 == 2) {
            relativeLayout.setVisibility(4);
            textView5.setText(R.string.button_unblock);
            textView5.setTextSize(12.0f);
        } else if (i6 == 0) {
            textView4.setText(R.string.button_ok);
            textView5.setText(R.string.button_delete);
            int i7 = eVar.f4345i;
            if (i7 == 0) {
                i5 = R.string.contact_request_friends;
            } else if (i7 == 1) {
                i5 = R.string.contact_request_marriage;
            } else if (i7 == 2) {
                i5 = R.string.contact_request_gang_invitation;
            } else {
                i5 = -1;
            }
            textView3.setText(i5);
        }
        relativeLayout.setOnClickListener(new C0644u(this, relativeLayout, eVar, 0));
        relativeLayout2.setOnClickListener(new C0644u(this, relativeLayout2, eVar, 1));
        ConstraintLayout constraintLayout2 = constraintLayout;
        constraintLayout2.setOnClickListener(new C0644u(this, constraintLayout2, eVar, 2));
        return view3;
    }
}
