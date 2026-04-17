package P4;

import R2.b;
import Y4.C0246c;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.fragment.app.C0269a;
import androidx.fragment.app.C0286s;
import com.google.android.gms.internal.measurement.a;
import com.mtma.criminal.city.R;
import com.mtma.criminal.city.app.MyApplication;
import d5.o;
import e5.C0505b;
import j4.C0640p;
import java.util.ArrayList;

public final class s extends C0286s {

    /* renamed from: d0  reason: collision with root package name */
    public final Context f2272d0;

    /* renamed from: e0  reason: collision with root package name */
    public View f2273e0;

    /* renamed from: f0  reason: collision with root package name */
    public TextView f2274f0;

    /* renamed from: g0  reason: collision with root package name */
    public ListView f2275g0;

    /* renamed from: h0  reason: collision with root package name */
    public RelativeLayout f2276h0;

    /* renamed from: i0  reason: collision with root package name */
    public RelativeLayout f2277i0;

    /* renamed from: j0  reason: collision with root package name */
    public ImageView f2278j0;

    /* renamed from: k0  reason: collision with root package name */
    public ImageView f2279k0;

    /* renamed from: l0  reason: collision with root package name */
    public TextView f2280l0;

    /* renamed from: m0  reason: collision with root package name */
    public boolean f2281m0 = false;

    /* renamed from: n0  reason: collision with root package name */
    public boolean f2282n0 = false;

    public s(Context context) {
        this.f2272d0 = context;
    }

    public static void V(s sVar, C0286s sVar2) {
        C0269a aVar = new C0269a(sVar.p());
        aVar.f(R.id.activity_main_body_frame_layout, sVar2, (String) null, 1);
        aVar.c();
        aVar.e(false);
        b.N0();
    }

    public static void W(s sVar, int i2) {
        if (!sVar.f2281m0) {
            sVar.f2281m0 = true;
            C0505b bVar = new C0505b(sVar.f2272d0, R.layout.dialog_search);
            RadioGroup radioGroup = (RadioGroup) bVar.findViewById(R.id.dialog_search_radio_group);
            RadioButton radioButton = (RadioButton) bVar.findViewById(R.id.dialog_search_id_radio_button);
            EditText editText = (EditText) bVar.findViewById(R.id.dialog_search_edit_text);
            RelativeLayout relativeLayout = (RelativeLayout) bVar.findViewById(R.id.dialog_search_search_button);
            RelativeLayout relativeLayout2 = (RelativeLayout) bVar.findViewById(R.id.dialog_search_cancel_button);
            a.o(MyApplication.f7090a, R.string.search_about_gangs_title, (TextView) bVar.findViewById(R.id.dialog_search_title));
            if (i2 == 2) {
                radioButton.setText(MyApplication.f7090a.getApplicationContext().getString(R.string.player_id));
            } else if (i2 == 3) {
                radioButton.setText(MyApplication.f7090a.getApplicationContext().getString(R.string.gang_id));
            }
            radioGroup.setOnCheckedChangeListener(new n(radioGroup, editText, 0));
            relativeLayout.setOnClickListener(new o(sVar, relativeLayout, editText, radioGroup, i2, bVar));
            relativeLayout2.setOnClickListener(new p(sVar, relativeLayout2, bVar, 0));
            bVar.show();
        }
    }

    public final View C(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View inflate = layoutInflater.inflate(R.layout.fragment_basic_with_button, viewGroup, false);
        this.f2273e0 = inflate;
        this.f2274f0 = (TextView) inflate.findViewById(R.id.fragment_basic_title);
        this.f2275g0 = (ListView) this.f2273e0.findViewById(R.id.fragment_basic_list_view);
        this.f2276h0 = (RelativeLayout) this.f2273e0.findViewById(R.id.fragment_basic_back_button);
        this.f2274f0.setText(R.string.settings_title);
        if (o.getAccountObject().getUserName().equals("player_still_guest")) {
            this.f2277i0 = (RelativeLayout) this.f2273e0.findViewById(R.id.fragment_basic_second_button);
            this.f2278j0 = (ImageView) this.f2273e0.findViewById(R.id.fragment_basic_second_button_image);
            this.f2279k0 = (ImageView) this.f2273e0.findViewById(R.id.fragment_basic_second_alert);
            this.f2280l0 = (TextView) this.f2273e0.findViewById(R.id.fragment_basic_second_button_text);
            this.f2278j0.setImageResource(R.drawable.button_settings);
            this.f2280l0.setText(R.string.button_save_account);
            this.f2280l0.setTextSize(12.0f);
            this.f2277i0.setVisibility(0);
            this.f2279k0.setVisibility(0);
            RelativeLayout relativeLayout = this.f2277i0;
            relativeLayout.setOnClickListener(new r(this, relativeLayout, 0));
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(new C0246c(R.string.settings_options_name, R.string.settings_options_description, R.drawable.item_settings_icon));
        arrayList.add(new C0246c(R.string.settings_invite_name, R.string.settings_invite_description, R.drawable.item_settings_icon));
        arrayList.add(new C0246c(R.string.settings_search_players_name, R.string.settings_search_players_description, R.drawable.item_settings_icon));
        arrayList.add(new C0246c(R.string.settings_search_gangs_name, R.string.settings_search_gangs_description, R.drawable.item_settings_icon));
        if (!o.getAccountObject().getUserName().equals("player_still_guest")) {
            arrayList.add(new C0246c((int) R.string.settings_verify_email_name, (int) R.string.settings_verify_email_description, (int) R.drawable.item_settings_icon, !o.getAccountObject().isEmailVerified()));
            arrayList.add(new C0246c(R.string.settings_change_password_name, R.string.settings_change_password_description, R.drawable.item_settings_icon));
            arrayList.add(new C0246c(R.string.settings_admins_name, R.string.settings_admins_description, R.drawable.item_settings_icon));
            arrayList.add(new C0246c(R.string.settings_sign_out_name, R.string.settings_sign_out_description, R.drawable.item_settings_icon));
        }
        this.f2275g0.setAdapter(new C0640p(this.f2272d0, arrayList, 4, 0, (byte) 0));
        this.f2275g0.setOnItemClickListener(new m(this, 0));
        RelativeLayout relativeLayout2 = this.f2276h0;
        relativeLayout2.setOnClickListener(new r(this, relativeLayout2, 1));
        return this.f2273e0;
    }
}
