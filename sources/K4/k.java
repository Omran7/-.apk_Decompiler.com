package K4;

import R2.b;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.C0269a;
import androidx.fragment.app.C0286s;
import com.google.android.gms.internal.measurement.a;
import com.mtma.criminal.city.R;
import com.mtma.criminal.city.app.MyApplication;
import com.mtma.criminal.city.utils.v0;
import com.mtma.criminal.city.views.GameGridView;
import com.mtma.criminal.city.views.SquareView;
import d5.o;
import d5.u;
import e5.C0505b;
import i3.C0590f;
import i3.C0592h;
import it.sephiroth.android.library.widget.HListView;
import x1.i;

public final class k extends C0286s {

    /* renamed from: a1  reason: collision with root package name */
    public static final /* synthetic */ int f1529a1 = 0;

    /* renamed from: A0  reason: collision with root package name */
    public RelativeLayout f1530A0;

    /* renamed from: B0  reason: collision with root package name */
    public RelativeLayout f1531B0;

    /* renamed from: C0  reason: collision with root package name */
    public RelativeLayout f1532C0;

    /* renamed from: D0  reason: collision with root package name */
    public RelativeLayout f1533D0;

    /* renamed from: E0  reason: collision with root package name */
    public RelativeLayout f1534E0;

    /* renamed from: F0  reason: collision with root package name */
    public TextView f1535F0;

    /* renamed from: G0  reason: collision with root package name */
    public ImageView f1536G0;

    /* renamed from: H0  reason: collision with root package name */
    public RelativeLayout f1537H0;

    /* renamed from: I0  reason: collision with root package name */
    public RelativeLayout f1538I0;

    /* renamed from: J0  reason: collision with root package name */
    public RelativeLayout f1539J0;

    /* renamed from: K0  reason: collision with root package name */
    public RelativeLayout f1540K0;
    public ConstraintLayout L0;

    /* renamed from: M0  reason: collision with root package name */
    public ConstraintLayout f1541M0;

    /* renamed from: N0  reason: collision with root package name */
    public ConstraintLayout f1542N0;
    public ConstraintLayout O0;

    /* renamed from: P0  reason: collision with root package name */
    public ConstraintLayout f1543P0;

    /* renamed from: Q0  reason: collision with root package name */
    public C0590f f1544Q0;

    /* renamed from: R0  reason: collision with root package name */
    public Animation f1545R0;

    /* renamed from: S0  reason: collision with root package name */
    public Animation f1546S0;

    /* renamed from: T0  reason: collision with root package name */
    public Animation f1547T0;

    /* renamed from: U0  reason: collision with root package name */
    public int f1548U0;

    /* renamed from: V0  reason: collision with root package name */
    public boolean f1549V0 = false;

    /* renamed from: W0  reason: collision with root package name */
    public boolean f1550W0 = false;
    public boolean X0 = false;

    /* renamed from: Y0  reason: collision with root package name */
    public boolean f1551Y0 = false;

    /* renamed from: Z0  reason: collision with root package name */
    public u f1552Z0;

    /* renamed from: d0  reason: collision with root package name */
    public final Context f1553d0;

    /* renamed from: e0  reason: collision with root package name */
    public final String f1554e0;

    /* renamed from: f0  reason: collision with root package name */
    public String f1555f0;

    /* renamed from: g0  reason: collision with root package name */
    public View f1556g0;

    /* renamed from: h0  reason: collision with root package name */
    public TextView f1557h0;

    /* renamed from: i0  reason: collision with root package name */
    public TextView f1558i0;

    /* renamed from: j0  reason: collision with root package name */
    public ImageView f1559j0;

    /* renamed from: k0  reason: collision with root package name */
    public SquareView f1560k0;

    /* renamed from: l0  reason: collision with root package name */
    public ImageView f1561l0;

    /* renamed from: m0  reason: collision with root package name */
    public ImageView f1562m0;

    /* renamed from: n0  reason: collision with root package name */
    public ImageView f1563n0;

    /* renamed from: o0  reason: collision with root package name */
    public ImageView f1564o0;

    /* renamed from: p0  reason: collision with root package name */
    public LinearLayout f1565p0;

    /* renamed from: q0  reason: collision with root package name */
    public HListView f1566q0;

    /* renamed from: r0  reason: collision with root package name */
    public HListView f1567r0;
    public TextView s0;

    /* renamed from: t0  reason: collision with root package name */
    public GameGridView f1568t0;

    /* renamed from: u0  reason: collision with root package name */
    public TextView f1569u0;

    /* renamed from: v0  reason: collision with root package name */
    public ImageView f1570v0;

    /* renamed from: w0  reason: collision with root package name */
    public RelativeLayout f1571w0;

    /* renamed from: x0  reason: collision with root package name */
    public RelativeLayout f1572x0;

    /* renamed from: y0  reason: collision with root package name */
    public RelativeLayout f1573y0;

    /* renamed from: z0  reason: collision with root package name */
    public RelativeLayout f1574z0;

    public k(Context context, String str) {
        this.f1553d0 = context;
        this.f1554e0 = str;
    }

    public static void V(k kVar, String str) {
        String str2;
        String str3;
        Context context = kVar.f1553d0;
        ClipboardManager clipboardManager = (ClipboardManager) context.getSystemService("clipboard");
        if (str.equals(kVar.f1554e0)) {
            str2 = MyApplication.f7090a.getApplicationContext().getString(R.string.player_id);
            str3 = MyApplication.f7090a.getApplicationContext().getString(R.string.id_copied_successfully);
        } else {
            str2 = MyApplication.f7090a.getApplicationContext().getString(R.string.name);
            str3 = MyApplication.f7090a.getApplicationContext().getString(R.string.name_copied_successfully);
        }
        clipboardManager.setPrimaryClip(ClipData.newPlainText(str2, str));
        v0.e(context, str3);
    }

    public static void W(k kVar, C0286s sVar) {
        C0269a aVar = new C0269a(kVar.p());
        aVar.f(R.id.activity_main_body_frame_layout, sVar, (String) null, 1);
        aVar.e(false);
        b.N0();
    }

    public static void X(k kVar, int i2) {
        if (!kVar.f1550W0) {
            kVar.f1550W0 = true;
            C0505b bVar = new C0505b(kVar.f1553d0, R.layout.dialog_ok_cancle);
            TextView textView = (TextView) bVar.findViewById(R.id.dialog_ok_cancel_text);
            LinearLayout linearLayout = (LinearLayout) bVar.findViewById(R.id.dialog_ok_cancel_buttons_confirm_cancel_layout);
            RelativeLayout relativeLayout = (RelativeLayout) bVar.findViewById(R.id.dialog_ok_cancel_confirm_button);
            RelativeLayout relativeLayout2 = (RelativeLayout) bVar.findViewById(R.id.dialog_ok_cancel_cancel_button);
            TextView textView2 = (TextView) bVar.findViewById(R.id.dialog_ok_cancel_confirm_button_text);
            if (i2 == 0) {
                textView.setText(kVar.s(R.string.confirm_add_friend_request, kVar.f1558i0.getText().toString().trim()));
            } else if (i2 == 1) {
                textView.setText(kVar.s(R.string.confirm_block_player, kVar.f1558i0.getText().toString().trim()));
            } else if (i2 == 2) {
                textView.setText(kVar.s(R.string.confirm_send_marriage_request, kVar.f1558i0.getText().toString().trim()));
            } else if (i2 == 3) {
                textView.setText(kVar.s(R.string.confirm_send_gang_join_request, kVar.f1558i0.getText().toString().trim()));
            }
            linearLayout.setVisibility(0);
            textView2.setText(R.string.button_ok);
            relativeLayout.setOnClickListener(new j((Object) kVar, relativeLayout, i2, (Object) bVar, 0));
            relativeLayout2.setOnClickListener(new d(kVar, relativeLayout2, bVar, 2));
            bVar.show();
        }
    }

    public final View C(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View inflate = layoutInflater.inflate(R.layout.fragment_profile_others, viewGroup, false);
        this.f1556g0 = inflate;
        this.L0 = (ConstraintLayout) inflate.findViewById(R.id.fragment_profile_others_main_layout);
        this.f1541M0 = (ConstraintLayout) this.f1556g0.findViewById(R.id.fragment_profile_others_top_section);
        this.f1558i0 = (TextView) this.f1556g0.findViewById(R.id.fragment_profile_others_name);
        this.f1559j0 = (ImageView) this.f1556g0.findViewById(R.id.fragment_profile_others_gender);
        this.f1560k0 = (SquareView) this.f1556g0.findViewById(R.id.fragment_profile_others_pic);
        this.f1561l0 = (ImageView) this.f1556g0.findViewById(R.id.fragment_profile_others_online_icon);
        this.f1562m0 = (ImageView) this.f1556g0.findViewById(R.id.fragment_profile_others_vip_icon);
        this.f1563n0 = (ImageView) this.f1556g0.findViewById(R.id.fragment_profile_others_estate_image);
        ImageView imageView = (ImageView) this.f1556g0.findViewById(R.id.fragment_profile_others_private_domain_image);
        this.f1557h0 = (TextView) this.f1556g0.findViewById(R.id.fragment_profile_others_bio_text_view);
        this.f1565p0 = (LinearLayout) this.f1556g0.findViewById(R.id.fragment_profile_others_container);
        this.f1542N0 = (ConstraintLayout) this.f1556g0.findViewById(R.id.fragment_profile_others_museum_layout);
        this.O0 = (ConstraintLayout) this.f1556g0.findViewById(R.id.fragment_profile_others_museum_content_layout);
        this.f1571w0 = (RelativeLayout) this.f1556g0.findViewById(R.id.fragment_profile_others_museum_title_layout);
        this.f1564o0 = (ImageView) this.f1556g0.findViewById(R.id.fragment_profile_others_museum_background);
        this.f1566q0 = (HListView) this.f1556g0.findViewById(R.id.fragment_profile_others_museum_list_view);
        this.f1543P0 = (ConstraintLayout) this.f1556g0.findViewById(R.id.fragment_profile_others_stall_content_layout);
        this.f1572x0 = (RelativeLayout) this.f1556g0.findViewById(R.id.fragment_profile_others_stall_title_layout);
        this.f1567r0 = (HListView) this.f1556g0.findViewById(R.id.fragment_profile_others_stall_list_view);
        this.s0 = (TextView) this.f1556g0.findViewById(R.id.fragment_profile_others_stall_empty_view);
        this.f1573y0 = (RelativeLayout) this.f1556g0.findViewById(R.id.fragment_profile_others_medals_title_layout);
        this.f1568t0 = (GameGridView) this.f1556g0.findViewById(R.id.fragment_profile_others_medals_grid_view);
        this.f1569u0 = (TextView) this.f1556g0.findViewById(R.id.fragment_profile_others_medals_empty_view);
        this.f1570v0 = (ImageView) this.f1556g0.findViewById(R.id.fragment_profile_others_copy_button);
        this.f1574z0 = (RelativeLayout) this.f1556g0.findViewById(R.id.fragment_profile_others_marry_button);
        this.f1530A0 = (RelativeLayout) this.f1556g0.findViewById(R.id.fragment_profile_others_block_button);
        this.f1531B0 = (RelativeLayout) this.f1556g0.findViewById(R.id.fragment_profile_others_fight_button);
        this.f1532C0 = (RelativeLayout) this.f1556g0.findViewById(R.id.fragment_profile_others_gift_button);
        this.f1533D0 = (RelativeLayout) this.f1556g0.findViewById(R.id.fragment_profile_others_add_bounty_button);
        this.f1534E0 = (RelativeLayout) this.f1556g0.findViewById(R.id.fragment_profile_others_gang_button);
        this.f1535F0 = (TextView) this.f1556g0.findViewById(R.id.fragment_profile_others_gang_button_text);
        this.f1536G0 = (ImageView) this.f1556g0.findViewById(R.id.fragment_profile_others_gang_button_image);
        this.f1537H0 = (RelativeLayout) this.f1556g0.findViewById(R.id.fragment_profile_others_message_button);
        this.f1538I0 = (RelativeLayout) this.f1556g0.findViewById(R.id.fragment_profile_others_add_friend_button);
        this.f1540K0 = (RelativeLayout) this.f1556g0.findViewById(R.id.fragment_profile_others_ban_button);
        this.f1539J0 = (RelativeLayout) this.f1556g0.findViewById(R.id.fragment_profile_others_back_button);
        Context context = this.f1553d0;
        this.f1545R0 = AnimationUtils.loadAnimation(context, R.anim.from_start_to_position);
        this.f1546S0 = AnimationUtils.loadAnimation(context, R.anim.from_end_to_position);
        this.f1547T0 = AnimationUtils.loadAnimation(context, R.anim.from_top_to_position);
        this.f1566q0.getViewTreeObserver().addOnGlobalLayoutListener(new e(this, 0));
        this.f1544Q0 = a.c(C0592h.b().e(), "players").E(this.f1554e0);
        b.w(true);
        this.f1544Q0.d(new i((Object) this, 19));
        ImageView imageView2 = this.f1570v0;
        imageView2.setOnClickListener(new a(this, imageView2, 10));
        RelativeLayout relativeLayout = this.f1539J0;
        relativeLayout.setOnClickListener(new a(this, relativeLayout, 9));
        if (o.getAccountObject().isAdmin()) {
            this.f1540K0.setVisibility(0);
            RelativeLayout relativeLayout2 = this.f1540K0;
            relativeLayout2.setOnClickListener(new a(this, relativeLayout2, 7));
        }
        return this.f1556g0;
    }
}
