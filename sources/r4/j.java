package r4;

import A.h;
import A4.c;
import K1.e;
import R2.b;
import android.content.Context;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.C0269a;
import androidx.fragment.app.C0286s;
import androidx.fragment.app.I;
import com.bumptech.glide.d;
import com.google.android.gms.internal.measurement.a;
import com.mtma.criminal.city.R;
import com.mtma.criminal.city.app.MyApplication;
import d5.o;
import e5.C0505b;
import e5.C0507d;
import e5.C0508e;
import i3.C0592h;
import i3.n;
import java.util.ArrayList;
import java.util.HashMap;

public final class j extends C0286s implements C0507d {

    /* renamed from: y0  reason: collision with root package name */
    public static Handler f11243y0;

    /* renamed from: z0  reason: collision with root package name */
    public static C0957g f11244z0;

    /* renamed from: d0  reason: collision with root package name */
    public final Context f11245d0;

    /* renamed from: e0  reason: collision with root package name */
    public View f11246e0;

    /* renamed from: f0  reason: collision with root package name */
    public TextView f11247f0;

    /* renamed from: g0  reason: collision with root package name */
    public TextView f11248g0;

    /* renamed from: h0  reason: collision with root package name */
    public TextView f11249h0;

    /* renamed from: i0  reason: collision with root package name */
    public ImageView f11250i0;

    /* renamed from: j0  reason: collision with root package name */
    public EditText f11251j0;

    /* renamed from: k0  reason: collision with root package name */
    public TextView f11252k0;

    /* renamed from: l0  reason: collision with root package name */
    public TextView f11253l0;

    /* renamed from: m0  reason: collision with root package name */
    public LinearLayout f11254m0;

    /* renamed from: n0  reason: collision with root package name */
    public RelativeLayout f11255n0;

    /* renamed from: o0  reason: collision with root package name */
    public RelativeLayout f11256o0;

    /* renamed from: p0  reason: collision with root package name */
    public ConstraintLayout f11257p0;

    /* renamed from: q0  reason: collision with root package name */
    public int f11258q0;

    /* renamed from: r0  reason: collision with root package name */
    public final ArrayList f11259r0 = new ArrayList();
    public LinearLayout.LayoutParams s0;

    /* renamed from: t0  reason: collision with root package name */
    public LinearLayout.LayoutParams f11260t0;

    /* renamed from: u0  reason: collision with root package name */
    public String f11261u0;

    /* renamed from: v0  reason: collision with root package name */
    public boolean f11262v0 = false;

    /* renamed from: w0  reason: collision with root package name */
    public boolean f11263w0 = false;

    /* renamed from: x0  reason: collision with root package name */
    public C0508e f11264x0;

    public j(Context context) {
        this.f11245d0 = context;
    }

    public static void V(j jVar, String str, boolean z3) {
        jVar.getClass();
        b.w(true);
        HashMap hashMap = new HashMap();
        hashMap.put("playerId", o.getAccountObject().getId());
        hashMap.put("content", str);
        hashMap.put("unixTimeInMilli", n.f8294a);
        if (d.I0()) {
            hashMap.put("fromAdmin", Boolean.TRUE);
        }
        if (z3) {
            b.w(true);
            d.n1(-1, new c((Object) jVar, (Object) hashMap, 11));
            return;
        }
        String F = a.x(C0592h.d().e(), "chats").E(jVar.f11261u0).G().F();
        a.x(C0592h.d().e(), "chats").E(jVar.f11261u0).E(com.bumptech.glide.c.f5744o + F).I(hashMap).addOnSuccessListener(new R.b(jVar, 7));
    }

    public final View C(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        int i2;
        View inflate = layoutInflater.inflate(R.layout.fragment_chat, viewGroup, false);
        this.f11246e0 = inflate;
        this.f11247f0 = (TextView) inflate.findViewById(R.id.fragment_chat_worldwide_button);
        this.f11248g0 = (TextView) this.f11246e0.findViewById(R.id.fragment_chat_gang_button);
        this.f11249h0 = (TextView) this.f11246e0.findViewById(R.id.fragment_chat_current_place_button);
        this.f11251j0 = (EditText) this.f11246e0.findViewById(R.id.fragment_chat_edit_text);
        this.f11257p0 = (ConstraintLayout) this.f11246e0.findViewById(R.id.fragment_chat_edit_text_layout);
        this.f11250i0 = (ImageView) this.f11246e0.findViewById(R.id.fragment_chat_send_button);
        this.f11255n0 = (RelativeLayout) this.f11246e0.findViewById(R.id.fragment_chat_help_button);
        this.f11256o0 = (RelativeLayout) this.f11246e0.findViewById(R.id.fragment_chat_back_button);
        this.f11254m0 = (LinearLayout) this.f11246e0.findViewById(R.id.fragment_chat_speakers_layout);
        this.f11252k0 = (TextView) this.f11246e0.findViewById(R.id.fragment_chat_speakers_number);
        this.f11253l0 = (TextView) this.f11246e0.findViewById(R.id.fragment_chat_time_and_date);
        f11243y0 = new Handler();
        f11244z0 = new C0957g(this, 1);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(0, e.m(32.0d));
        this.s0 = layoutParams;
        layoutParams.weight = 1.0f;
        layoutParams.gravity = 80;
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(0, e.m(36.0d));
        this.f11260t0 = layoutParams2;
        layoutParams2.weight = 1.0f;
        this.f11251j0.setMaxLines(20);
        this.f11251j0.addTextChangedListener(new H4.a(1, this));
        if (o.getAccountObject().isAdmin() || o.getAccountObject().isTemporaryAdmin()) {
            a.o(MyApplication.f7090a, R.string.infinite_symbol, this.f11252k0);
            this.f11252k0.setTextSize(2, 16.0f);
        } else {
            this.f11252k0.setText(String.valueOf(o.getChatObject().getSpeakersNumber()));
        }
        ArrayList arrayList = this.f11259r0;
        arrayList.add(this.f11247f0);
        if (!o.getGangObject().getId().equals("not_in_gang")) {
            this.f11248g0.setVisibility(0);
            arrayList.add(this.f11248g0);
            this.f11248g0.setOnClickListener(new C0959i(this, 3));
        }
        if (o.getLocationObject().getCurrentPlace() != 0) {
            TextView textView = this.f11249h0;
            int currentPlace = o.getLocationObject().getCurrentPlace();
            if (currentPlace == 1) {
                i2 = R.string.hospital;
            } else if (currentPlace == 2) {
                i2 = R.string.prison;
            } else if (currentPlace != 3) {
                i2 = -1;
            } else {
                i2 = R.string.plane;
            }
            textView.setText(i2);
            this.f11249h0.setVisibility(0);
            arrayList.add(this.f11249h0);
            this.f11249h0.setOnClickListener(new C0959i(this, 4));
        }
        this.f11261u0 = "worldwide";
        int indexOf = arrayList.indexOf(this.f11247f0);
        this.f11258q0 = indexOf;
        Y(indexOf);
        W(new C0956f(this.f11245d0, this.f11261u0), false);
        this.f11247f0.setOnClickListener(new C0959i(this, 2));
        ImageView imageView = this.f11250i0;
        imageView.setOnClickListener(new C0959i(this, imageView, 5));
        RelativeLayout relativeLayout = this.f11255n0;
        relativeLayout.setOnClickListener(new C0959i(this, relativeLayout, 0));
        RelativeLayout relativeLayout2 = this.f11256o0;
        relativeLayout2.setOnClickListener(new C0959i(this, relativeLayout2, 1));
        this.f11264x0 = new C0508e(l());
        this.f11246e0.post(new C0957g(this, 0));
        return this.f11246e0;
    }

    public final void D() {
        this.f5157L = true;
        C0508e eVar = this.f11264x0;
        eVar.f7696a = null;
        eVar.dismiss();
    }

    public final void H() {
        this.f5157L = true;
        f11243y0.removeCallbacks(f11244z0);
        this.f11264x0.f7696a = null;
    }

    public final void I() {
        this.f5157L = true;
        if (com.bumptech.glide.c.f5744o != -111) {
            this.f11253l0.setText(com.bumptech.glide.c.v());
        }
        f11243y0.postDelayed(f11244z0, 1000);
        this.f11264x0.f7696a = this;
    }

    public final void W(C0956f fVar, boolean z3) {
        I m6 = m();
        m6.getClass();
        C0269a aVar = new C0269a(m6);
        aVar.i(R.id.fragment_chat_frame_layout, fVar);
        aVar.e(false);
        if (z3) {
            b.N0();
        }
    }

    public final void X() {
        if (!this.f11262v0) {
            this.f11262v0 = true;
            C0505b bVar = new C0505b(this.f11245d0, R.layout.dialog_ok_cancle);
            RelativeLayout relativeLayout = (RelativeLayout) bVar.findViewById(R.id.dialog_ok_cancel_confirm_button);
            RelativeLayout relativeLayout2 = (RelativeLayout) bVar.findViewById(R.id.dialog_ok_cancel_cancel_button);
            ((TextView) bVar.findViewById(R.id.dialog_ok_cancel_text)).setText(R.string.no_speakers);
            ((LinearLayout) bVar.findViewById(R.id.dialog_ok_cancel_buttons_confirm_cancel_layout)).setVisibility(0);
            ((TextView) bVar.findViewById(R.id.dialog_ok_cancel_confirm_button_text)).setText(R.string.button_ok);
            relativeLayout.setOnClickListener(new C0958h(this, relativeLayout, bVar, 1));
            relativeLayout2.setOnClickListener(new C0958h(this, relativeLayout2, bVar, 2));
            bVar.show();
        }
    }

    public final void Y(int i2) {
        int i5 = 0;
        while (true) {
            ArrayList arrayList = this.f11259r0;
            if (i5 < arrayList.size()) {
                Context context = this.f11245d0;
                if (i5 == i2) {
                    ((View) arrayList.get(i5)).setBackground(h.getDrawable(context, R.drawable.store_button_enabled));
                    ((View) arrayList.get(i5)).setLayoutParams(this.f11260t0);
                } else {
                    ((View) arrayList.get(i5)).setBackground(h.getDrawable(context, R.drawable.store_button_disabled));
                    ((View) arrayList.get(i5)).setLayoutParams(this.s0);
                }
                i5++;
            } else {
                return;
            }
        }
    }

    public final void f(int i2) {
        this.f11257p0.setPadding(0, 0, 0, i2);
        this.f11246e0.requestLayout();
    }
}
